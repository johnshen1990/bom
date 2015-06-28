package com.xishi.bom.dao.core.merc;

import com.xishi.bom.entity.merc.MercInfo;
import org.springframework.stereotype.Repository;


@Repository
public interface MercInfoDao {
    MercInfo getByFlowMercId(String flowMercId);
}
