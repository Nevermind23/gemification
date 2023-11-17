package p341ge.bog.mobilebank.model.search.result;

import g91.C32303f;
import g91.C32314k;
import java.math.BigDecimal;
import p341ge.bog.mobilebank.model.search.SearchResultObject;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.model.search.result.CustomerProdSearchResult */
public class CustomerProdSearchResult extends SearchResultObject {
    private String cardSubProductGroups;
    private String ccy;
    private long clientKey;
    private String dictionaryKey;
    private long nextSentDate;
    private String periodType;
    private BigDecimal productAmount;
    private String productCode;
    private String productGroup;
    private long productKey;
    private String productName;
    private String productNo;
    private long providerId;
    private long serviceId;
    private String subProductCode;

    public String getCcy() {
        return this.ccy;
    }

    public long getClientKey() {
        return this.clientKey;
    }

    public String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public String getFooterText() {
        return null;
    }

    public String getHeaderText() {
        return null;
    }

    public String getLogo() {
        return null;
    }

    public String getMiddleText() {
        String str = this.productName;
        if (str == null) {
            return C27950a.m86286c(this.dictionaryKey, false);
        }
        return str;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getProductGroup() {
        return this.productGroup;
    }

    public long getProductKey() {
        return this.productKey;
    }

    public String getRightText() {
        String str;
        BigDecimal bigDecimal = this.productAmount;
        if (bigDecimal == null || bigDecimal.equals("") || (str = this.ccy) == null || str.equals("")) {
            return "";
        }
        return String.format("%s %s", new Object[]{C32303f.m95204o(this.productAmount.doubleValue()), C32314k.m95245a(this.ccy)});
    }

    public String getSearchResultId() {
        return String.valueOf(this.productKey);
    }

    public long getServiceId() {
        return this.serviceId;
    }

    public String getSubProductCode() {
        return this.subProductCode;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setClientKey(long j) {
        this.clientKey = j;
    }

    public void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public void setProductCode(String str) {
        this.productCode = str;
    }

    public void setProductGroup(String str) {
        this.productGroup = str;
    }

    public void setProductKey(long j) {
        this.productKey = j;
    }

    public void setServiceId(long j) {
        this.serviceId = j;
    }

    public void setSubProductCode(String str) {
        this.subProductCode = str;
    }
}
