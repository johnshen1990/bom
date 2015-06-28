package com.xishi.bom.controller.tran;

import com.github.pagehelper.PageInfo;
import com.xishi.bom.entity.tran.Trandata;
import com.xishi.bom.service.tran.TrandataService;
import com.xishi.bom.validator.tran.TrandataVoValidator;
import com.xishi.bom.vo.tran.TrandataVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/tran")
public class TrandataController {
    private Logger logger = Logger.getLogger(TrandataController.class);

    @Autowired
    TrandataVoValidator validator;
    @Autowired
    protected TrandataService trandataService;

    @RequestMapping("/list.do")
    public ModelAndView list(@ModelAttribute TrandataVo trandataVo, BindingResult result) {

        //校验vo对象
        validator.validate(trandataVo, result);

        //Check validation errors
//        if (result.hasErrors()) {
//            //do something if need
//        }

        List<Trandata> trandataList = trandataService.getAll(trandataVo, true,
                Integer.parseInt(trandataVo.getPageNum()), Integer.parseInt(trandataVo.getPageSize()));
        PageInfo pageInfo = new PageInfo(trandataList);
        ModelAndView mv = new ModelAndView("tran/trandataList");
        mv.addObject("trandataList", trandataList).addObject("trandataVo", trandataVo).addObject("pageInfo", pageInfo);
        return mv;
    }

}
