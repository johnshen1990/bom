package com.xishi.bom.service.tran;

import com.github.pagehelper.PageHelper;
import com.xishi.bom.constants.PageConstant;
import com.xishi.bom.dao.query.tran.TrandataDao;
import com.xishi.bom.entity.tran.Trandata;
import com.xishi.bom.util.BOMDateUtil;
import com.xishi.bom.util.BOMStringUtil;
import com.xishi.bom.vo.tran.TrandataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class TrandataService {

    @Autowired
	private TrandataDao trandataDao;

	public List<Trandata> getAll(TrandataVo trandataVo, boolean needPage, int pageNum, int pageSize){
        if(needPage){
            PageHelper.startPage(pageNum, pageSize);
        }
        List<Trandata> list = trandataDao.getAll(trandataVo);
        List<Trandata> formatList = proccessFormat(list);
        return formatList;
    }



    //-------------------------write private methods below-------------------------
    private List<Trandata> proccessFormat(List<Trandata> list){
        for(Trandata bean : list) {
            //处理日期格式
            bean.setTranDt(BOMDateUtil.addDashInDateStr(bean.getTranDt()));
            //处理时间格式
            bean.setTranTm(BOMDateUtil.addColonInTimeStr(bean.getTranTm()));
            //处理银行卡号格式
            bean.setCrdNo(BOMStringUtil.replaceWithSymbol(bean.getCrdNo(), 4, 4, "*"));
            //处理交易状态
            switch(bean.getTranSts()){
                case "S": bean.setTranSts("成功");break;
                case "X": bean.setTranSts("未知");break;
                case "F": bean.setTranSts("失败");break;
                case "C": bean.setTranSts("充正");break;
                case "U": bean.setTranSts("预登记");break;
            }
        }
        return list;
    }
}
