package com.xishi.bom.entity.tran;

import java.math.BigDecimal;

/**
 * 交易查询实体类
 */
public class Trandata {

    // UUID
    protected String uuid;
    // AGT_NO
    protected String agtNo;
    // 关联交易号（原始）
    protected String ouuid;
    // 清算会计日
    protected String clrDt;
    // 商户ID
    protected String mercId;
    // 终端编号
    protected String trmNo;
    // EQU_NO
    protected String equNo;
    // INNER_MERC_ID
    protected String innerMercId;
    // 合作机构编号
    protected String corgNo;
    // 交易日期
    protected String tranDt;
    // 交易时间
    protected String tranTm;
    // 商户MCC
    protected String mccCd;
    // 批次编号
    protected String batNo;
    // POS流水号
    protected String posSeqNo;
    // 受卡方所在地日期
    protected String ctxnDt;
    // POS操作员编号
    protected String posOprId;
    // 交易标示（名称待定）
    protected String tranFlg;
    // 交易编码
    protected String tranCd;
    // 合作机构返回码
    protected String corgRcd;
    // 合作机构交易状态
    protected String corgTranSts;
    // 交易状态（S成功   X未知  F失败  C充正  U预登记）
    protected String tranSts;
    // 服务点输入方式码
    protected String inMod;
    // 卡号
    protected String crdNo;
    // 币种
    protected String ccy;
    // 交易金额
    protected BigDecimal tranAmt;
    // 已退货金额
    protected BigDecimal refAmt;
    // 已退货手续费金额
    protected BigDecimal refFeeAmt;
    // 合作机构费率
    protected BigDecimal corgFeeRat;
    // 合作机构手续费
    protected BigDecimal corgFeeAmt;
    // 收款方手续费金额
    protected BigDecimal recFeeAmt;
    // 付款方手续费金额
    protected BigDecimal payFeeAmt;
    // 0:本代本 1:本代它
    protected String bdFlg;
    // 发卡行编码
    protected String bnkTyp;
    // 卡组织编号
    protected String issOrgNo;
    // 00:借记卡 01:贷记卡
    protected String crdTyp;
    // 0:内卡 1:外卡
    protected String crdFlg;
    // 0:非IC卡 1:IC卡
    protected String icCrdFlg;
    // 检索参考号
    protected String retReNo;
    // 授权码
    protected String autCd;
    // 交易应答码
    protected String rpCd;
    // 时间戳
    protected String tmSmp;
    // 电子签名标志位 1是
    protected char signFlg;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAgtNo() {
        return agtNo;
    }

    public void setAgtNo(String agtNo) {
        this.agtNo = agtNo;
    }

    public String getOuuid() {
        return ouuid;
    }

    public void setOuuid(String ouuid) {
        this.ouuid = ouuid;
    }

    public String getClrDt() {
        return clrDt;
    }

    public void setClrDt(String clrDt) {
        this.clrDt = clrDt;
    }

    public String getMercId() {
        return mercId;
    }

    public void setMercId(String mercId) {
        this.mercId = mercId;
    }

    public String getTrmNo() {
        return trmNo;
    }

    public void setTrmNo(String trmNo) {
        this.trmNo = trmNo;
    }

    public String getEquNo() {
        return equNo;
    }

    public void setEquNo(String equNo) {
        this.equNo = equNo;
    }

    public String getInnerMercId() {
        return innerMercId;
    }

    public void setInnerMercId(String innerMercId) {
        this.innerMercId = innerMercId;
    }

    public String getCorgNo() {
        return corgNo;
    }

    public void setCorgNo(String corgNo) {
        this.corgNo = corgNo;
    }

    public String getTranDt() {
        return tranDt;
    }

    public void setTranDt(String tranDt) {
        this.tranDt = tranDt;
    }

    public String getTranTm() {
        return tranTm;
    }

    public void setTranTm(String tranTm) {
        this.tranTm = tranTm;
    }

    public String getMccCd() {
        return mccCd;
    }

    public void setMccCd(String mccCd) {
        this.mccCd = mccCd;
    }

    public String getBatNo() {
        return batNo;
    }

    public void setBatNo(String batNo) {
        this.batNo = batNo;
    }

    public String getPosSeqNo() {
        return posSeqNo;
    }

    public void setPosSeqNo(String posSeqNo) {
        this.posSeqNo = posSeqNo;
    }

    public String getCtxnDt() {
        return ctxnDt;
    }

    public void setCtxnDt(String ctxnDt) {
        this.ctxnDt = ctxnDt;
    }

    public String getPosOprId() {
        return posOprId;
    }

    public void setPosOprId(String posOprId) {
        this.posOprId = posOprId;
    }

    public String getTranFlg() {
        return tranFlg;
    }

    public void setTranFlg(String tranFlg) {
        this.tranFlg = tranFlg;
    }

    public String getTranCd() {
        return tranCd;
    }

    public void setTranCd(String tranCd) {
        this.tranCd = tranCd;
    }

    public String getCorgRcd() {
        return corgRcd;
    }

    public void setCorgRcd(String corgRcd) {
        this.corgRcd = corgRcd;
    }

    public String getCorgTranSts() {
        return corgTranSts;
    }

    public void setCorgTranSts(String corgTranSts) {
        this.corgTranSts = corgTranSts;
    }

    public String getTranSts() {
        return tranSts;
    }

    public void setTranSts(String tranSts) {
        this.tranSts = tranSts;
    }

    public String getInMod() {
        return inMod;
    }

    public void setInMod(String inMod) {
        this.inMod = inMod;
    }

    public String getCrdNo() {
        return crdNo;
    }

    public void setCrdNo(String crdNo) {
        this.crdNo = crdNo;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    public BigDecimal getRefAmt() {
        return refAmt;
    }

    public void setRefAmt(BigDecimal refAmt) {
        this.refAmt = refAmt;
    }

    public BigDecimal getRefFeeAmt() {
        return refFeeAmt;
    }

    public void setRefFeeAmt(BigDecimal refFeeAmt) {
        this.refFeeAmt = refFeeAmt;
    }

    public BigDecimal getCorgFeeRat() {
        return corgFeeRat;
    }

    public void setCorgFeeRat(BigDecimal corgFeeRat) {
        this.corgFeeRat = corgFeeRat;
    }

    public BigDecimal getCorgFeeAmt() {
        return corgFeeAmt;
    }

    public void setCorgFeeAmt(BigDecimal corgFeeAmt) {
        this.corgFeeAmt = corgFeeAmt;
    }

    public BigDecimal getRecFeeAmt() {
        return recFeeAmt;
    }

    public void setRecFeeAmt(BigDecimal recFeeAmt) {
        this.recFeeAmt = recFeeAmt;
    }

    public BigDecimal getPayFeeAmt() {
        return payFeeAmt;
    }

    public void setPayFeeAmt(BigDecimal payFeeAmt) {
        this.payFeeAmt = payFeeAmt;
    }

    public String getBdFlg() {
        return bdFlg;
    }

    public void setBdFlg(String bdFlg) {
        this.bdFlg = bdFlg;
    }

    public String getBnkTyp() {
        return bnkTyp;
    }

    public void setBnkTyp(String bnkTyp) {
        this.bnkTyp = bnkTyp;
    }

    public String getIssOrgNo() {
        return issOrgNo;
    }

    public void setIssOrgNo(String issOrgNo) {
        this.issOrgNo = issOrgNo;
    }

    public String getCrdTyp() {
        return crdTyp;
    }

    public void setCrdTyp(String crdTyp) {
        this.crdTyp = crdTyp;
    }

    public String getCrdFlg() {
        return crdFlg;
    }

    public void setCrdFlg(String crdFlg) {
        this.crdFlg = crdFlg;
    }

    public String getIcCrdFlg() {
        return icCrdFlg;
    }

    public void setIcCrdFlg(String icCrdFlg) {
        this.icCrdFlg = icCrdFlg;
    }

    public String getRetReNo() {
        return retReNo;
    }

    public void setRetReNo(String retReNo) {
        this.retReNo = retReNo;
    }

    public String getAutCd() {
        return autCd;
    }

    public void setAutCd(String autCd) {
        this.autCd = autCd;
    }

    public String getRpCd() {
        return rpCd;
    }

    public void setRpCd(String rpCd) {
        this.rpCd = rpCd;
    }

    public String getTmSmp() {
        return tmSmp;
    }

    public void setTmSmp(String tmSmp) {
        this.tmSmp = tmSmp;
    }

    public char getSignFlg() {
        return signFlg;
    }

    public void setSignFlg(char signFlg) {
        this.signFlg = signFlg;
    }

    @Override
    public String toString() {
        return "Trandata{" +
                "uuid='" + uuid + '\'' +
                ", agtNo='" + agtNo + '\'' +
                ", ouuid='" + ouuid + '\'' +
                ", clrDt='" + clrDt + '\'' +
                ", mercId='" + mercId + '\'' +
                ", trmNo='" + trmNo + '\'' +
                ", equNo='" + equNo + '\'' +
                ", innerMercId='" + innerMercId + '\'' +
                ", corgNo='" + corgNo + '\'' +
                ", tranDt='" + tranDt + '\'' +
                ", tranTm='" + tranTm + '\'' +
                ", mccCd='" + mccCd + '\'' +
                ", batNo='" + batNo + '\'' +
                ", posSeqNo='" + posSeqNo + '\'' +
                ", ctxnDt='" + ctxnDt + '\'' +
                ", posOprId='" + posOprId + '\'' +
                ", tranFlg='" + tranFlg + '\'' +
                ", tranCd='" + tranCd + '\'' +
                ", corgRcd='" + corgRcd + '\'' +
                ", corgTranSts='" + corgTranSts + '\'' +
                ", tranSts='" + tranSts + '\'' +
                ", inMod='" + inMod + '\'' +
                ", crdNo='" + crdNo + '\'' +
                ", ccy='" + ccy + '\'' +
                ", tranAmt=" + tranAmt +
                ", refAmt=" + refAmt +
                ", refFeeAmt=" + refFeeAmt +
                ", corgFeeRat=" + corgFeeRat +
                ", corgFeeAmt=" + corgFeeAmt +
                ", recFeeAmt=" + recFeeAmt +
                ", payFeeAmt=" + payFeeAmt +
                ", bdFlg='" + bdFlg + '\'' +
                ", bnkTyp='" + bnkTyp + '\'' +
                ", issOrgNo='" + issOrgNo + '\'' +
                ", crdTyp='" + crdTyp + '\'' +
                ", crdFlg='" + crdFlg + '\'' +
                ", icCrdFlg='" + icCrdFlg + '\'' +
                ", retReNo='" + retReNo + '\'' +
                ", autCd='" + autCd + '\'' +
                ", rpCd='" + rpCd + '\'' +
                ", tmSmp='" + tmSmp + '\'' +
                ", signFlg=" + signFlg +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trandata trandata = (Trandata) o;

        if (signFlg != trandata.signFlg) return false;
        if (uuid != null ? !uuid.equals(trandata.uuid) : trandata.uuid != null) return false;
        if (agtNo != null ? !agtNo.equals(trandata.agtNo) : trandata.agtNo != null) return false;
        if (ouuid != null ? !ouuid.equals(trandata.ouuid) : trandata.ouuid != null) return false;
        if (clrDt != null ? !clrDt.equals(trandata.clrDt) : trandata.clrDt != null) return false;
        if (mercId != null ? !mercId.equals(trandata.mercId) : trandata.mercId != null) return false;
        if (trmNo != null ? !trmNo.equals(trandata.trmNo) : trandata.trmNo != null) return false;
        if (equNo != null ? !equNo.equals(trandata.equNo) : trandata.equNo != null) return false;
        if (innerMercId != null ? !innerMercId.equals(trandata.innerMercId) : trandata.innerMercId != null)
            return false;
        if (corgNo != null ? !corgNo.equals(trandata.corgNo) : trandata.corgNo != null) return false;
        if (tranDt != null ? !tranDt.equals(trandata.tranDt) : trandata.tranDt != null) return false;
        if (tranTm != null ? !tranTm.equals(trandata.tranTm) : trandata.tranTm != null) return false;
        if (mccCd != null ? !mccCd.equals(trandata.mccCd) : trandata.mccCd != null) return false;
        if (batNo != null ? !batNo.equals(trandata.batNo) : trandata.batNo != null) return false;
        if (posSeqNo != null ? !posSeqNo.equals(trandata.posSeqNo) : trandata.posSeqNo != null) return false;
        if (ctxnDt != null ? !ctxnDt.equals(trandata.ctxnDt) : trandata.ctxnDt != null) return false;
        if (posOprId != null ? !posOprId.equals(trandata.posOprId) : trandata.posOprId != null) return false;
        if (tranFlg != null ? !tranFlg.equals(trandata.tranFlg) : trandata.tranFlg != null) return false;
        if (tranCd != null ? !tranCd.equals(trandata.tranCd) : trandata.tranCd != null) return false;
        if (corgRcd != null ? !corgRcd.equals(trandata.corgRcd) : trandata.corgRcd != null) return false;
        if (corgTranSts != null ? !corgTranSts.equals(trandata.corgTranSts) : trandata.corgTranSts != null)
            return false;
        if (tranSts != null ? !tranSts.equals(trandata.tranSts) : trandata.tranSts != null) return false;
        if (inMod != null ? !inMod.equals(trandata.inMod) : trandata.inMod != null) return false;
        if (crdNo != null ? !crdNo.equals(trandata.crdNo) : trandata.crdNo != null) return false;
        if (ccy != null ? !ccy.equals(trandata.ccy) : trandata.ccy != null) return false;
        if (tranAmt != null ? !tranAmt.equals(trandata.tranAmt) : trandata.tranAmt != null) return false;
        if (refAmt != null ? !refAmt.equals(trandata.refAmt) : trandata.refAmt != null) return false;
        if (refFeeAmt != null ? !refFeeAmt.equals(trandata.refFeeAmt) : trandata.refFeeAmt != null) return false;
        if (corgFeeRat != null ? !corgFeeRat.equals(trandata.corgFeeRat) : trandata.corgFeeRat != null) return false;
        if (corgFeeAmt != null ? !corgFeeAmt.equals(trandata.corgFeeAmt) : trandata.corgFeeAmt != null) return false;
        if (recFeeAmt != null ? !recFeeAmt.equals(trandata.recFeeAmt) : trandata.recFeeAmt != null) return false;
        if (payFeeAmt != null ? !payFeeAmt.equals(trandata.payFeeAmt) : trandata.payFeeAmt != null) return false;
        if (bdFlg != null ? !bdFlg.equals(trandata.bdFlg) : trandata.bdFlg != null) return false;
        if (bnkTyp != null ? !bnkTyp.equals(trandata.bnkTyp) : trandata.bnkTyp != null) return false;
        if (issOrgNo != null ? !issOrgNo.equals(trandata.issOrgNo) : trandata.issOrgNo != null) return false;
        if (crdTyp != null ? !crdTyp.equals(trandata.crdTyp) : trandata.crdTyp != null) return false;
        if (crdFlg != null ? !crdFlg.equals(trandata.crdFlg) : trandata.crdFlg != null) return false;
        if (icCrdFlg != null ? !icCrdFlg.equals(trandata.icCrdFlg) : trandata.icCrdFlg != null) return false;
        if (retReNo != null ? !retReNo.equals(trandata.retReNo) : trandata.retReNo != null) return false;
        if (autCd != null ? !autCd.equals(trandata.autCd) : trandata.autCd != null) return false;
        if (rpCd != null ? !rpCd.equals(trandata.rpCd) : trandata.rpCd != null) return false;
        return !(tmSmp != null ? !tmSmp.equals(trandata.tmSmp) : trandata.tmSmp != null);

    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (agtNo != null ? agtNo.hashCode() : 0);
        result = 31 * result + (ouuid != null ? ouuid.hashCode() : 0);
        result = 31 * result + (clrDt != null ? clrDt.hashCode() : 0);
        result = 31 * result + (mercId != null ? mercId.hashCode() : 0);
        result = 31 * result + (trmNo != null ? trmNo.hashCode() : 0);
        result = 31 * result + (equNo != null ? equNo.hashCode() : 0);
        result = 31 * result + (innerMercId != null ? innerMercId.hashCode() : 0);
        result = 31 * result + (corgNo != null ? corgNo.hashCode() : 0);
        result = 31 * result + (tranDt != null ? tranDt.hashCode() : 0);
        result = 31 * result + (tranTm != null ? tranTm.hashCode() : 0);
        result = 31 * result + (mccCd != null ? mccCd.hashCode() : 0);
        result = 31 * result + (batNo != null ? batNo.hashCode() : 0);
        result = 31 * result + (posSeqNo != null ? posSeqNo.hashCode() : 0);
        result = 31 * result + (ctxnDt != null ? ctxnDt.hashCode() : 0);
        result = 31 * result + (posOprId != null ? posOprId.hashCode() : 0);
        result = 31 * result + (tranFlg != null ? tranFlg.hashCode() : 0);
        result = 31 * result + (tranCd != null ? tranCd.hashCode() : 0);
        result = 31 * result + (corgRcd != null ? corgRcd.hashCode() : 0);
        result = 31 * result + (corgTranSts != null ? corgTranSts.hashCode() : 0);
        result = 31 * result + (tranSts != null ? tranSts.hashCode() : 0);
        result = 31 * result + (inMod != null ? inMod.hashCode() : 0);
        result = 31 * result + (crdNo != null ? crdNo.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (tranAmt != null ? tranAmt.hashCode() : 0);
        result = 31 * result + (refAmt != null ? refAmt.hashCode() : 0);
        result = 31 * result + (refFeeAmt != null ? refFeeAmt.hashCode() : 0);
        result = 31 * result + (corgFeeRat != null ? corgFeeRat.hashCode() : 0);
        result = 31 * result + (corgFeeAmt != null ? corgFeeAmt.hashCode() : 0);
        result = 31 * result + (recFeeAmt != null ? recFeeAmt.hashCode() : 0);
        result = 31 * result + (payFeeAmt != null ? payFeeAmt.hashCode() : 0);
        result = 31 * result + (bdFlg != null ? bdFlg.hashCode() : 0);
        result = 31 * result + (bnkTyp != null ? bnkTyp.hashCode() : 0);
        result = 31 * result + (issOrgNo != null ? issOrgNo.hashCode() : 0);
        result = 31 * result + (crdTyp != null ? crdTyp.hashCode() : 0);
        result = 31 * result + (crdFlg != null ? crdFlg.hashCode() : 0);
        result = 31 * result + (icCrdFlg != null ? icCrdFlg.hashCode() : 0);
        result = 31 * result + (retReNo != null ? retReNo.hashCode() : 0);
        result = 31 * result + (autCd != null ? autCd.hashCode() : 0);
        result = 31 * result + (rpCd != null ? rpCd.hashCode() : 0);
        result = 31 * result + (tmSmp != null ? tmSmp.hashCode() : 0);
        result = 31 * result + (int) signFlg;
        return result;
    }
}
