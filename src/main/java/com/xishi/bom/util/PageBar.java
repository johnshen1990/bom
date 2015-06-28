package com.xishi.bom.util;

import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by john on 15/6/4.
 */
public class PageBar extends SimpleTagSupport {
    private org.apache.log4j.Logger logger = Logger.getLogger(PageBar.class);
    private PageInfo pageInfo;


    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        out.println("<nav style=\"text-align:center;\">");
        out.println("<ul class=\"pagination\">");
        out.println("<li"+(pageInfo.getPages()!=0?"":" class=\"disabled\"")+">");
        if(pageInfo.getPages()==0){
            out.println("<a>");
        }else{
            out.println("<a href=\"#\" class=\"clickable\" pagenum=\"1\">");
        }
        out.println("<span aria-hidden=\"true\">首页</span>");
        out.println("</a>");
        out.println("</li>");
        out.println("<li"+(pageInfo.isHasPreviousPage()?"":" class=\"disabled\"")+">");
        if(pageInfo.isHasPreviousPage()){
            out.println("<a href=\"#\" class=\"clickable\" pagenum=\""+pageInfo.getPrePage()+"\" aria-label=\"Previous\">");
        }else{
            out.println("<a aria-label=\"Previous\">");
        }
        out.println("<span aria-hidden=\"true\">上一页</span>");
        out.println("</a>");
        out.println("</li>");

        int[] navigatepageNums = pageInfo.getNavigatepageNums();
        for(int i : navigatepageNums){
            out.println("<li"+(i==pageInfo.getPageNum()?" class=\"active\"":"")+"><a href=\"#\" class=\"clickable\" pagenum=\""+i+"\">"+i+"</a></li>");
        }

        out.println("<li"+(pageInfo.isHasNextPage()?"":" class=\"disabled\"")+">");
        if(pageInfo.isHasNextPage()){
            out.println("<a href=\"#\" class=\"clickable\" pagenum=\""+pageInfo.getNextPage()+"\" aria-label=\"Next\">");
        }else{
            out.println("<a aria-label=\"Next\">");
        }
        out.println("<span aria-hidden=\"true\">下一页</span>");
        out.println("</a>");
        out.println("</li>");
        out.println("<li"+(pageInfo.getPages()!=0?"":" class=\"disabled\"")+">");
        if(pageInfo.getPages()==0){
            out.println("<a>");
        }else{
            out.println("<a href=\"#\" class=\"clickable\" pagenum=\""+pageInfo.getPages()+"\">");
        }
        out.println("<span aria-hidden=\"true\">尾页</span>");
        out.println("</a>");
        out.println("</li>");
        out.println("<li class=\"disabled\">");
        out.println("<a style=\"color:#000;\">");
        out.println("共<span class=\"label label-default\">"+pageInfo.getTotal()+"</span>条记录｜共<span class=\"label label-default\">"+pageInfo.getPages()+"</span>页");
        out.println("</a>");
        out.println("</li>");
        out.println("</ul>");
        out.println("</nav>");

        out.println("<script>");
        out.println("$(function(){");
        out.println("$('.pagination a.clickable').click(function(event){");
        out.println("event.preventDefault();");
        out.println("$('input[name=pageNum]').val($(this).attr('pagenum'));");
        out.println("$('#search-form').submit();");
        out.println("});");
        out.println("});");
        out.println("</script>");

//        logger.info("------pageInfo.getFirstPage()="+pageInfo.getFirstPage());
//        logger.info("------pageInfo.isHasPreviousPage()="+pageInfo.isHasPreviousPage());
//        logger.info("------pageInfo.getPrePage()="+pageInfo.getPrePage());
//        for(int i : pageInfo.getNavigatepageNums()){
//            logger.info("------pageInfo.getNavigatepageNums()="+i);
//        }
//        logger.info("------pageInfo.isHasNextPage()="+pageInfo.isHasNextPage());
//        logger.info("------pageInfo.getNextPage()="+pageInfo.getNextPage());
//        logger.info("------pageInfo.getLastPage()="+pageInfo.getLastPage());
//
//        logger.info("------pageInfo.getTotal()="+pageInfo.getTotal());
//        logger.info("------pageInfo.getPages()="+pageInfo.getPages());
//        logger.info("------pageInfo.getNavigatePages()="+pageInfo.getNavigatePages());
//        logger.info("------pageInfo.getStartRow()="+pageInfo.getStartRow());
//        logger.info("------pageInfo.getEndRow()="+pageInfo.getEndRow());
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
