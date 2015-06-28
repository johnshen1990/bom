package com.xishi.bom.entity.merc;

import java.util.Date;

/**
 * Created by john on 15/6/3.
 * 此类取t_agtm_flow_merc_info表中的子集，可根据需要增加属性
 */

public class MercInfo {
    // id主键
    private Long  id;
    // 内部商编
    private String  flowMercId;
    // 商户名称
    private String  flowMercNm;
    // 商户简称
    private String  flowMercCcrAbbr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlowMercId() {
        return flowMercId;
    }

    public void setFlowMercId(String flowMercId) {
        this.flowMercId = flowMercId;
    }

    public String getFlowMercNm() {
        return flowMercNm;
    }

    public void setFlowMercNm(String flowMercNm) {
        this.flowMercNm = flowMercNm;
    }

    public String getFlowMercCcrAbbr() {
        return flowMercCcrAbbr;
    }

    public void setFlowMercCcrAbbr(String flowMercCcrAbbr) {
        this.flowMercCcrAbbr = flowMercCcrAbbr;
    }
}
