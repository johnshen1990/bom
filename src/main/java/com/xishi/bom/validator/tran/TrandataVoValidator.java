package com.xishi.bom.validator.tran;

import com.xishi.bom.constants.PageConstant;
import com.xishi.bom.util.BOMDateUtil;
import com.xishi.bom.vo.tran.TrandataVo;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by john on 15/6/8.
 */
@Component
public class TrandataVoValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return TrandataVo.class.isAssignableFrom(aClass);
    }

    public void validate(Object o, Errors errors) {
        TrandataVo trandataVo = (TrandataVo)o;

        //取用户名为商编
        Subject currentUser = SecurityUtils.getSubject();
        String innerMercId = currentUser.getPrincipal().toString();
        trandataVo.setInnerMercId(innerMercId);

        //校验页码参数是否合法，不合法取默认“1”
        try {
            Integer.parseInt(trandataVo.getPageNum());
        } catch (NumberFormatException e) {
            trandataVo.setPageNum("1");
        }

        //校验页面大小参数是否合法，不合法取默认大小
        try{
            Integer.parseInt(trandataVo.getPageSize());
        } catch (NumberFormatException e) {
            trandataVo.setPageSize(Integer.toString(PageConstant.DEFAULT_PAGE_SIZE));
        }

        //初始化rapidDateType合法的值
        Set<String> options = new HashSet<String>();
        options.add("all");
        options.add("today");
        options.add("yesterday");
        options.add("sevendays");
        options.add("thirtydays");
        options.add("custom");
        //如果参数rapidDateType为空或其它字符串，设为默认的“today”，否则
        if(StringUtils.isBlank(trandataVo.getRapidDateType())||!options.contains(trandataVo.getRapidDateType())){
            trandataVo.setRapidDateType("today");
        }
        //转换rapidDateType为对应的startDate和endDate
        Map<String, String> datePair = BOMDateUtil.convertRapidDateType(trandataVo.getRapidDateType(),
                trandataVo.getStartDate(), trandataVo.getEndDate());
        trandataVo.setStartDate(datePair.get("startDate"));
        trandataVo.setEndDate(datePair.get("endDate"));

        //校验参数crdNo是否小于4位
        if(trandataVo.getCrdNo().length()>4){
            String crdNo = StringUtils.substring(trandataVo.getCrdNo(),trandataVo.getCrdNo().length()-4);
            trandataVo.setCrdNo(crdNo);
        }

    }
}
