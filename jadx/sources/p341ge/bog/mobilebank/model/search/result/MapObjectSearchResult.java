package p341ge.bog.mobilebank.model.search.result;

import p341ge.bog.mobilebank.model.search.SearchResultObject;

/* renamed from: ge.bog.mobilebank.model.search.result.MapObjectSearchResult */
public class MapObjectSearchResult extends SearchResultObject {
    private String address;
    private String name;
    private String nearBy;
    private String objectKey;
    private String objectName;
    private String objectSubType;
    private String objectType;

    public String getAddress() {
        return this.address;
    }

    public String getFooterText() {
        return null;
    }

    public String getHeaderText() {
        return this.name;
    }

    public String getLogo() {
        return null;
    }

    public String getMiddleText() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public String getObjectSubType() {
        return this.objectSubType;
    }

    public String getObjectType() {
        return this.objectType;
    }

    public String getRightText() {
        return null;
    }

    public String getSearchResultId() {
        return this.objectKey;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
