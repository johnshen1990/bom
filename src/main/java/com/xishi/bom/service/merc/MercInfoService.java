package com.xishi.bom.service.merc;

import com.xishi.bom.dao.core.merc.MercInfoDao;
import com.xishi.bom.dao.core.sys.UserDao;
import com.xishi.bom.entity.merc.MercInfo;
import com.xishi.bom.entity.sys.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class MercInfoService {

    @Autowired
	private MercInfoDao mercInfoDao;

    public MercInfo findByFlowMercId(String flowMercId){
        return mercInfoDao.getByFlowMercId(flowMercId);
    }
}
