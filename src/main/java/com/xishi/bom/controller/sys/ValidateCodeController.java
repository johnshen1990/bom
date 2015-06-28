package com.xishi.bom.controller.sys;

import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xishi.bom.util.ValidateCodeUtil;

/**
 * @Description: 验证码生成器
 * @author: 赵天祥
 * @date: 2015年6月1日
 * @version: V1.0
 */
@Controller
@RequestMapping("/validateCode")
public class ValidateCodeController {
	private Logger logger = Logger.getLogger(ValidateCodeController.class);

	/**
	 * @Description:  生成验证码并存在session中
	 * 				     通过request.getSession().getAttribute(ValidateCodeUtil.VALIDATE_CODE)方法获得
	 * @author:       赵天祥
	 * @Date:         2015年6月2日 下午3:51:12
	 */
	@RequestMapping("/getValidateCode")
	public void getValidateCode(HttpServletRequest request, HttpServletResponse response) {
		try {
			byte [] code = ValidateCodeUtil.getCode(request.getSession());
			response.setContentType("image/png");
	        OutputStream outputStream = response.getOutputStream();
	        outputStream.write(code);
	        outputStream.flush();
	        outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("生成验证码失败："+e.getMessage());
		}
		
	}

}
