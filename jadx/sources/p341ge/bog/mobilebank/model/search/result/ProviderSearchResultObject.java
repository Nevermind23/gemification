package p341ge.bog.mobilebank.model.search.result;

import g91.C32289b0;
import p341ge.bog.mobilebank.model.search.SearchResultObject;
import r90.C27954d;

/* renamed from: ge.bog.mobilebank.model.search.result.ProviderSearchResultObject */
public class ProviderSearchResultObject extends SearchResultObject {

    /* renamed from: id */
    private long f81364id;
    private String providerName;
    private String serviceId;
    private String serviceType;

    public String getFooterText() {
        return null;
    }

    public String getHeaderText() {
        return null;
    }

    public long getId() {
        return this.f81364id;
    }

    public String getLogo() {
        String str = this.serviceId;
        if (str != null) {
            return C32289b0.m95091c(C27954d.m86304j(str));
        }
        return null;
    }

    public String getMiddleText() {
        return this.providerName;
    }

    public String getRightText() {
        return null;
    }

    public String getSearchResultId() {
        return String.valueOf(this.f81364id);
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public void setId(long j) {
        this.f81364id = j;
    }

    public void setServiceId(String str) {
        this.serviceId = str;
    }
}
