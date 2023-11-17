package p341ge.bog.mobilebank.model.search.result;

import g91.C32289b0;
import p341ge.bog.mobilebank.model.search.SearchResultObject;

/* renamed from: ge.bog.mobilebank.model.search.result.ContactSearchResult */
public class ContactSearchResult extends SearchResultObject {
    private String bank;
    private long clientConnectionId;
    private String connectionType;
    private String fullName;
    private String nickName;
    private String profilePicture;

    public String getBank() {
        return this.bank;
    }

    public String getConnectionType() {
        return this.connectionType;
    }

    public String getFooterText() {
        return this.nickName;
    }

    public String getHeaderText() {
        return null;
    }

    public String getLogo() {
        return C32289b0.m95090b(this.profilePicture, true);
    }

    public String getMiddleText() {
        return this.fullName;
    }

    public String getRightText() {
        return null;
    }

    public String getSearchResultId() {
        return String.valueOf(this.clientConnectionId);
    }
}
