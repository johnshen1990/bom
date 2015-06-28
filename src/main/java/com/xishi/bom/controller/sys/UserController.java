package com.xishi.bom.controller.sys;

import com.xishi.bom.util.ValidateCodeUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;

import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping("/index.do")
    public String index(){
        return "index";
    }

    @RequestMapping("/login.do")
    public String login(@RequestParam("username") String username,
                              @RequestParam("password") String password,
                              @RequestParam("validcode") String validcode,
                              @RequestParam(value="rememberMe", required=false) boolean rememberMe,
                              RedirectAttributes redirectAttributes) {
        //获取当前的Subject
        Subject currentUser = SecurityUtils.getSubject();



        String validCodeInSession = (String)currentUser.getSession().getAttribute(ValidateCodeUtil.VALIDATE_CODE);
        if(!validcode.equalsIgnoreCase(validCodeInSession)){
            redirectAttributes.addFlashAttribute("info", "验证码不正确！");
            return "redirect:/index.do";
        }

        UsernamePasswordToken token = new UsernamePasswordToken(username, DigestUtils.md5Hex(password));
        token.setRememberMe(rememberMe);
        try {
            currentUser.login(token);
            return "redirect:/tran/list.do";
        } catch (UnknownAccountException uae) {
            uae.printStackTrace();
            redirectAttributes.addFlashAttribute("info", "用户不存在！");
        } catch (IncorrectCredentialsException ice) {
            ice.printStackTrace();
            redirectAttributes.addFlashAttribute("info", "密码错误！");
        } catch (LockedAccountException lae) {
            lae.printStackTrace();
            redirectAttributes.addFlashAttribute("info", "用户被锁定！");
        } catch (ExcessiveAttemptsException eae) {
            eae.printStackTrace();
            redirectAttributes.addFlashAttribute("info", "提交过于频繁，请稍后再试！");
        } catch (AuthenticationException ae) {
            ae.printStackTrace();
            redirectAttributes.addFlashAttribute("info", "登录失败，请联系管理员！");
        }
        return "redirect:/index.do";
    }
    @RequestMapping("/logout.do")
    public String logout() {
        //获取当前的Subject
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return "redirect:/index.do";
    }
}
