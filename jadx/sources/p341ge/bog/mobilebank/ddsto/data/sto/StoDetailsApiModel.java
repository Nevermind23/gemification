package p341ge.bog.mobilebank.ddsto.data.sto;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.ddsto.data.sto.StoDetailsApiModel */
public final class StoDetailsApiModel {
    @C8664c("acctDesc")
    private String acctDesc;
    @C8664c("acctNo")
    private String acctNo;
    @C8664c("additionalInfo")
    private String additionalInfo;
    @C8664c("agreeNo")
    private String agreeNo;
    @C8664c("amount")
    private Double amount;
    @C8664c("benefAcctDesc")
    private String benefAcctDesc;
    @C8664c("benefAcctNo")
    private String benefAcctNo;
    @C8664c("benefBankCode")
    private String benefBankCode;
    @C8664c("benefBankName")
    private String benefBankName;
    @C8664c("benefName")
    private String benefName;
    @C8664c("cdsAgreeKey")
    private String cdsAgreeKey;
    @C8664c("charges")
    private String charges;
    @C8664c("clientKey")
    private Long clientKey;
    @C8664c("currency")
    private String currency;
    @C8664c("description")
    private String description;
    @C8664c("dictionaryKey")
    private String dictionaryKey;
    @C8664c("documentId")
    private Long documentId;
    @C8664c("documentName")
    private String documentName;
    @C8664c("dstAcctKey")
    private Long dstAcctKey;
    @C8664c("endDate")
    private String endDate;
    @C8664c("intBankCode")
    private String intBankCode;
    @C8664c("intBankName")
    private String intBankName;
    @C8664c("nextSentDate")
    private Long nextSentDate;
    @C8664c("orderStatus")
    private String orderStatus;
    @C8664c("payerName")
    private String payerName;
    @C8664c("paymentdetail")
    private String paymentdetail;
    @C8664c("periodType")
    private String periodType;
    @C8664c("senderInn")
    private String senderInn;
    @C8664c("sentModule")
    private String sentModule;
    @C8664c("srcAcctKey")
    private Long srcAcctKey;
    @C8664c("startDate")
    private Long startDate;
    @C8664c("status")
    private String status;
    @C8664c("subProductCode")
    private String subProductCode;

    public StoDetailsApiModel() {
        this((Long) null, (Long) null, (String) null, (Long) null, (Long) null, (String) null, (Double) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StoDetailsApiModel copy$default(StoDetailsApiModel stoDetailsApiModel, Long l, Long l2, String str, Long l3, Long l4, String str2, Double d, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l5, String str15, String str16, Long l6, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i, int i2, Object obj) {
        StoDetailsApiModel stoDetailsApiModel2 = stoDetailsApiModel;
        int i3 = i;
        return stoDetailsApiModel.copy((i3 & 1) != 0 ? stoDetailsApiModel2.documentId : l, (i3 & 2) != 0 ? stoDetailsApiModel2.clientKey : l2, (i3 & 4) != 0 ? stoDetailsApiModel2.sentModule : str, (i3 & 8) != 0 ? stoDetailsApiModel2.srcAcctKey : l3, (i3 & 16) != 0 ? stoDetailsApiModel2.dstAcctKey : l4, (i3 & 32) != 0 ? stoDetailsApiModel2.documentName : str2, (i3 & 64) != 0 ? stoDetailsApiModel2.amount : d, (i3 & 128) != 0 ? stoDetailsApiModel2.currency : str3, (i3 & C11398b.f33139r) != 0 ? stoDetailsApiModel2.description : str4, (i3 & C11398b.f33140s) != 0 ? stoDetailsApiModel2.benefAcctNo : str5, (i3 & C11398b.f33141t) != 0 ? stoDetailsApiModel2.benefBankCode : str6, (i3 & C11398b.f33142u) != 0 ? stoDetailsApiModel2.benefName : str7, (i3 & C11398b.f33143v) != 0 ? stoDetailsApiModel2.benefBankName : str8, (i3 & 8192) != 0 ? stoDetailsApiModel2.cdsAgreeKey : str9, (i3 & 16384) != 0 ? stoDetailsApiModel2.intBankName : str10, (i3 & 32768) != 0 ? stoDetailsApiModel2.intBankCode : str11, (i3 & 65536) != 0 ? stoDetailsApiModel2.paymentdetail : str12, (i3 & 131072) != 0 ? stoDetailsApiModel2.charges : str13, (i3 & 262144) != 0 ? stoDetailsApiModel2.additionalInfo : str14, (i3 & 524288) != 0 ? stoDetailsApiModel2.startDate : l5, (i3 & 1048576) != 0 ? stoDetailsApiModel2.endDate : str15, (i3 & 2097152) != 0 ? stoDetailsApiModel2.periodType : str16, (i3 & 4194304) != 0 ? stoDetailsApiModel2.nextSentDate : l6, (i3 & 8388608) != 0 ? stoDetailsApiModel2.agreeNo : str17, (i3 & 16777216) != 0 ? stoDetailsApiModel2.status : str18, (i3 & 33554432) != 0 ? stoDetailsApiModel2.orderStatus : str19, (i3 & 67108864) != 0 ? stoDetailsApiModel2.senderInn : str20, (i3 & 134217728) != 0 ? stoDetailsApiModel2.acctNo : str21, (i3 & 268435456) != 0 ? stoDetailsApiModel2.acctDesc : str22, (i3 & 536870912) != 0 ? stoDetailsApiModel2.benefAcctDesc : str23, (i3 & 1073741824) != 0 ? stoDetailsApiModel2.payerName : str24, (i3 & Integer.MIN_VALUE) != 0 ? stoDetailsApiModel2.dictionaryKey : str25, (i2 & 1) != 0 ? stoDetailsApiModel2.subProductCode : str26);
    }

    public final Long component1() {
        return this.documentId;
    }

    public final String component10() {
        return this.benefAcctNo;
    }

    public final String component11() {
        return this.benefBankCode;
    }

    public final String component12() {
        return this.benefName;
    }

    public final String component13() {
        return this.benefBankName;
    }

    public final String component14() {
        return this.cdsAgreeKey;
    }

    public final String component15() {
        return this.intBankName;
    }

    public final String component16() {
        return this.intBankCode;
    }

    public final String component17() {
        return this.paymentdetail;
    }

    public final String component18() {
        return this.charges;
    }

    public final String component19() {
        return this.additionalInfo;
    }

    public final Long component2() {
        return this.clientKey;
    }

    public final Long component20() {
        return this.startDate;
    }

    public final String component21() {
        return this.endDate;
    }

    public final String component22() {
        return this.periodType;
    }

    public final Long component23() {
        return this.nextSentDate;
    }

    public final String component24() {
        return this.agreeNo;
    }

    public final String component25() {
        return this.status;
    }

    public final String component26() {
        return this.orderStatus;
    }

    public final String component27() {
        return this.senderInn;
    }

    public final String component28() {
        return this.acctNo;
    }

    public final String component29() {
        return this.acctDesc;
    }

    public final String component3() {
        return this.sentModule;
    }

    public final String component30() {
        return this.benefAcctDesc;
    }

    public final String component31() {
        return this.payerName;
    }

    public final String component32() {
        return this.dictionaryKey;
    }

    public final String component33() {
        return this.subProductCode;
    }

    public final Long component4() {
        return this.srcAcctKey;
    }

    public final Long component5() {
        return this.dstAcctKey;
    }

    public final String component6() {
        return this.documentName;
    }

    public final Double component7() {
        return this.amount;
    }

    public final String component8() {
        return this.currency;
    }

    public final String component9() {
        return this.description;
    }

    public final StoDetailsApiModel copy(Long l, Long l2, String str, Long l3, Long l4, String str2, Double d, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l5, String str15, String str16, Long l6, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
        return new StoDetailsApiModel(l, l2, str, l3, l4, str2, d, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, l5, str15, str16, l6, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoDetailsApiModel)) {
            return false;
        }
        StoDetailsApiModel stoDetailsApiModel = (StoDetailsApiModel) obj;
        return C41536l.m120484d(this.documentId, stoDetailsApiModel.documentId) && C41536l.m120484d(this.clientKey, stoDetailsApiModel.clientKey) && C41536l.m120484d(this.sentModule, stoDetailsApiModel.sentModule) && C41536l.m120484d(this.srcAcctKey, stoDetailsApiModel.srcAcctKey) && C41536l.m120484d(this.dstAcctKey, stoDetailsApiModel.dstAcctKey) && C41536l.m120484d(this.documentName, stoDetailsApiModel.documentName) && C41536l.m120484d(this.amount, stoDetailsApiModel.amount) && C41536l.m120484d(this.currency, stoDetailsApiModel.currency) && C41536l.m120484d(this.description, stoDetailsApiModel.description) && C41536l.m120484d(this.benefAcctNo, stoDetailsApiModel.benefAcctNo) && C41536l.m120484d(this.benefBankCode, stoDetailsApiModel.benefBankCode) && C41536l.m120484d(this.benefName, stoDetailsApiModel.benefName) && C41536l.m120484d(this.benefBankName, stoDetailsApiModel.benefBankName) && C41536l.m120484d(this.cdsAgreeKey, stoDetailsApiModel.cdsAgreeKey) && C41536l.m120484d(this.intBankName, stoDetailsApiModel.intBankName) && C41536l.m120484d(this.intBankCode, stoDetailsApiModel.intBankCode) && C41536l.m120484d(this.paymentdetail, stoDetailsApiModel.paymentdetail) && C41536l.m120484d(this.charges, stoDetailsApiModel.charges) && C41536l.m120484d(this.additionalInfo, stoDetailsApiModel.additionalInfo) && C41536l.m120484d(this.startDate, stoDetailsApiModel.startDate) && C41536l.m120484d(this.endDate, stoDetailsApiModel.endDate) && C41536l.m120484d(this.periodType, stoDetailsApiModel.periodType) && C41536l.m120484d(this.nextSentDate, stoDetailsApiModel.nextSentDate) && C41536l.m120484d(this.agreeNo, stoDetailsApiModel.agreeNo) && C41536l.m120484d(this.status, stoDetailsApiModel.status) && C41536l.m120484d(this.orderStatus, stoDetailsApiModel.orderStatus) && C41536l.m120484d(this.senderInn, stoDetailsApiModel.senderInn) && C41536l.m120484d(this.acctNo, stoDetailsApiModel.acctNo) && C41536l.m120484d(this.acctDesc, stoDetailsApiModel.acctDesc) && C41536l.m120484d(this.benefAcctDesc, stoDetailsApiModel.benefAcctDesc) && C41536l.m120484d(this.payerName, stoDetailsApiModel.payerName) && C41536l.m120484d(this.dictionaryKey, stoDetailsApiModel.dictionaryKey) && C41536l.m120484d(this.subProductCode, stoDetailsApiModel.subProductCode);
    }

    public final String getAcctDesc() {
        return this.acctDesc;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getBenefAcctDesc() {
        return this.benefAcctDesc;
    }

    public final String getBenefAcctNo() {
        return this.benefAcctNo;
    }

    public final String getBenefBankCode() {
        return this.benefBankCode;
    }

    public final String getBenefBankName() {
        return this.benefBankName;
    }

    public final String getBenefName() {
        return this.benefName;
    }

    public final String getCdsAgreeKey() {
        return this.cdsAgreeKey;
    }

    public final String getCharges() {
        return this.charges;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final Long getDocumentId() {
        return this.documentId;
    }

    public final String getDocumentName() {
        return this.documentName;
    }

    public final Long getDstAcctKey() {
        return this.dstAcctKey;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getIntBankCode() {
        return this.intBankCode;
    }

    public final String getIntBankName() {
        return this.intBankName;
    }

    public final Long getNextSentDate() {
        return this.nextSentDate;
    }

    public final String getOrderStatus() {
        return this.orderStatus;
    }

    public final String getPayerName() {
        return this.payerName;
    }

    public final String getPaymentdetail() {
        return this.paymentdetail;
    }

    public final String getPeriodType() {
        return this.periodType;
    }

    public final String getSenderInn() {
        return this.senderInn;
    }

    public final String getSentModule() {
        return this.sentModule;
    }

    public final Long getSrcAcctKey() {
        return this.srcAcctKey;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        Long l = this.documentId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.clientKey;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.sentModule;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.srcAcctKey;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.dstAcctKey;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.documentName;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.amount;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.benefAcctNo;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.benefBankCode;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.benefName;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.benefBankName;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cdsAgreeKey;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.intBankName;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.intBankCode;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.paymentdetail;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.charges;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.additionalInfo;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Long l5 = this.startDate;
        int hashCode20 = (hashCode19 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str15 = this.endDate;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.periodType;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Long l6 = this.nextSentDate;
        int hashCode23 = (hashCode22 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str17 = this.agreeNo;
        int hashCode24 = (hashCode23 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.status;
        int hashCode25 = (hashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.orderStatus;
        int hashCode26 = (hashCode25 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.senderInn;
        int hashCode27 = (hashCode26 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.acctNo;
        int hashCode28 = (hashCode27 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.acctDesc;
        int hashCode29 = (hashCode28 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.benefAcctDesc;
        int hashCode30 = (hashCode29 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.payerName;
        int hashCode31 = (hashCode30 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.dictionaryKey;
        int hashCode32 = (hashCode31 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.subProductCode;
        if (str26 != null) {
            i = str26.hashCode();
        }
        return hashCode32 + i;
    }

    public final void setAcctDesc(String str) {
        this.acctDesc = str;
    }

    public final void setAcctNo(String str) {
        this.acctNo = str;
    }

    public final void setAdditionalInfo(String str) {
        this.additionalInfo = str;
    }

    public final void setAgreeNo(String str) {
        this.agreeNo = str;
    }

    public final void setAmount(Double d) {
        this.amount = d;
    }

    public final void setBenefAcctDesc(String str) {
        this.benefAcctDesc = str;
    }

    public final void setBenefAcctNo(String str) {
        this.benefAcctNo = str;
    }

    public final void setBenefBankCode(String str) {
        this.benefBankCode = str;
    }

    public final void setBenefBankName(String str) {
        this.benefBankName = str;
    }

    public final void setBenefName(String str) {
        this.benefName = str;
    }

    public final void setCdsAgreeKey(String str) {
        this.cdsAgreeKey = str;
    }

    public final void setCharges(String str) {
        this.charges = str;
    }

    public final void setClientKey(Long l) {
        this.clientKey = l;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public final void setDocumentId(Long l) {
        this.documentId = l;
    }

    public final void setDocumentName(String str) {
        this.documentName = str;
    }

    public final void setDstAcctKey(Long l) {
        this.dstAcctKey = l;
    }

    public final void setEndDate(String str) {
        this.endDate = str;
    }

    public final void setIntBankCode(String str) {
        this.intBankCode = str;
    }

    public final void setIntBankName(String str) {
        this.intBankName = str;
    }

    public final void setNextSentDate(Long l) {
        this.nextSentDate = l;
    }

    public final void setOrderStatus(String str) {
        this.orderStatus = str;
    }

    public final void setPayerName(String str) {
        this.payerName = str;
    }

    public final void setPaymentdetail(String str) {
        this.paymentdetail = str;
    }

    public final void setPeriodType(String str) {
        this.periodType = str;
    }

    public final void setSenderInn(String str) {
        this.senderInn = str;
    }

    public final void setSentModule(String str) {
        this.sentModule = str;
    }

    public final void setSrcAcctKey(Long l) {
        this.srcAcctKey = l;
    }

    public final void setStartDate(Long l) {
        this.startDate = l;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setSubProductCode(String str) {
        this.subProductCode = str;
    }

    public String toString() {
        Long l = this.documentId;
        Long l2 = this.clientKey;
        String str = this.sentModule;
        Long l3 = this.srcAcctKey;
        Long l4 = this.dstAcctKey;
        String str2 = this.documentName;
        Double d = this.amount;
        String str3 = this.currency;
        String str4 = this.description;
        String str5 = this.benefAcctNo;
        String str6 = this.benefBankCode;
        String str7 = this.benefName;
        String str8 = this.benefBankName;
        String str9 = this.cdsAgreeKey;
        String str10 = this.intBankName;
        String str11 = this.intBankCode;
        String str12 = this.paymentdetail;
        String str13 = this.charges;
        String str14 = this.additionalInfo;
        Long l5 = this.startDate;
        String str15 = this.endDate;
        String str16 = this.periodType;
        Long l6 = this.nextSentDate;
        String str17 = this.agreeNo;
        String str18 = this.status;
        String str19 = this.orderStatus;
        String str20 = this.senderInn;
        String str21 = this.acctNo;
        String str22 = this.acctDesc;
        String str23 = this.benefAcctDesc;
        String str24 = this.payerName;
        String str25 = this.dictionaryKey;
        String str26 = this.subProductCode;
        return "StoDetailsApiModel(documentId=" + l + ", clientKey=" + l2 + ", sentModule=" + str + ", srcAcctKey=" + l3 + ", dstAcctKey=" + l4 + ", documentName=" + str2 + ", amount=" + d + ", currency=" + str3 + ", description=" + str4 + ", benefAcctNo=" + str5 + ", benefBankCode=" + str6 + ", benefName=" + str7 + ", benefBankName=" + str8 + ", cdsAgreeKey=" + str9 + ", intBankName=" + str10 + ", intBankCode=" + str11 + ", paymentdetail=" + str12 + ", charges=" + str13 + ", additionalInfo=" + str14 + ", startDate=" + l5 + ", endDate=" + str15 + ", periodType=" + str16 + ", nextSentDate=" + l6 + ", agreeNo=" + str17 + ", status=" + str18 + ", orderStatus=" + str19 + ", senderInn=" + str20 + ", acctNo=" + str21 + ", acctDesc=" + str22 + ", benefAcctDesc=" + str23 + ", payerName=" + str24 + ", dictionaryKey=" + str25 + ", subProductCode=" + str26 + ")";
    }

    public StoDetailsApiModel(Long l, Long l2, String str, Long l3, Long l4, String str2, Double d, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l5, String str15, String str16, Long l6, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
        this.documentId = l;
        this.clientKey = l2;
        this.sentModule = str;
        this.srcAcctKey = l3;
        this.dstAcctKey = l4;
        this.documentName = str2;
        this.amount = d;
        this.currency = str3;
        this.description = str4;
        this.benefAcctNo = str5;
        this.benefBankCode = str6;
        this.benefName = str7;
        this.benefBankName = str8;
        this.cdsAgreeKey = str9;
        this.intBankName = str10;
        this.intBankCode = str11;
        this.paymentdetail = str12;
        this.charges = str13;
        this.additionalInfo = str14;
        this.startDate = l5;
        this.endDate = str15;
        this.periodType = str16;
        this.nextSentDate = l6;
        this.agreeNo = str17;
        this.status = str18;
        this.orderStatus = str19;
        this.senderInn = str20;
        this.acctNo = str21;
        this.acctDesc = str22;
        this.benefAcctDesc = str23;
        this.payerName = str24;
        this.dictionaryKey = str25;
        this.subProductCode = str26;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoDetailsApiModel(java.lang.Long r34, java.lang.Long r35, java.lang.String r36, java.lang.Long r37, java.lang.Long r38, java.lang.String r39, java.lang.Double r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.Long r53, java.lang.String r54, java.lang.String r55, java.lang.Long r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, int r67, int r68, kotlin.jvm.internal.DefaultConstructorMarker r69) {
        /*
            r33 = this;
            r0 = r67
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r34
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r35
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r36
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r37
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r38
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r39
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r40
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r41
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r42
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r43
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r44
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r45
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r46
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r47
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r48
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r49
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r50
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r51
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r52
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r53
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r54
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r55
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r56
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r57
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = 0
            goto L_0x00e9
        L_0x00e7:
            r25 = r58
        L_0x00e9:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00f2
            r26 = 0
            goto L_0x00f4
        L_0x00f2:
            r26 = r59
        L_0x00f4:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00fd
            r27 = 0
            goto L_0x00ff
        L_0x00fd:
            r27 = r60
        L_0x00ff:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0108
            r28 = 0
            goto L_0x010a
        L_0x0108:
            r28 = r61
        L_0x010a:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x0113
            r29 = 0
            goto L_0x0115
        L_0x0113:
            r29 = r62
        L_0x0115:
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x011e
            r30 = 0
            goto L_0x0120
        L_0x011e:
            r30 = r63
        L_0x0120:
            r31 = 1073741824(0x40000000, float:2.0)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x0129
            r31 = 0
            goto L_0x012b
        L_0x0129:
            r31 = r64
        L_0x012b:
            r32 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r32
            if (r0 == 0) goto L_0x0133
            r0 = 0
            goto L_0x0135
        L_0x0133:
            r0 = r65
        L_0x0135:
            r32 = r68 & 1
            if (r32 == 0) goto L_0x013c
            r32 = 0
            goto L_0x013e
        L_0x013c:
            r32 = r66
        L_0x013e:
            r34 = r33
            r35 = r1
            r36 = r3
            r37 = r4
            r38 = r5
            r39 = r6
            r40 = r7
            r41 = r8
            r42 = r9
            r43 = r10
            r44 = r11
            r45 = r12
            r46 = r13
            r47 = r14
            r48 = r15
            r49 = r2
            r50 = r16
            r51 = r17
            r52 = r18
            r53 = r19
            r54 = r20
            r55 = r21
            r56 = r22
            r57 = r23
            r58 = r24
            r59 = r25
            r60 = r26
            r61 = r27
            r62 = r28
            r63 = r29
            r64 = r30
            r65 = r31
            r66 = r0
            r67 = r32
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.ddsto.data.sto.StoDetailsApiModel.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
