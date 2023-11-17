package p341ge.bog.sso_client.models;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.sso_client.models.GetFaceTecTokenResponse */
public final class GetFaceTecTokenResponse {
    private final String accessToken;
    private final String operationReference;

    public GetFaceTecTokenResponse() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GetFaceTecTokenResponse copy$default(GetFaceTecTokenResponse getFaceTecTokenResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFaceTecTokenResponse.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = getFaceTecTokenResponse.operationReference;
        }
        return getFaceTecTokenResponse.copy(str, str2);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.operationReference;
    }

    public final GetFaceTecTokenResponse copy(String str, String str2) {
        return new GetFaceTecTokenResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetFaceTecTokenResponse)) {
            return false;
        }
        GetFaceTecTokenResponse getFaceTecTokenResponse = (GetFaceTecTokenResponse) obj;
        return C41536l.m120484d(this.accessToken, getFaceTecTokenResponse.accessToken) && C41536l.m120484d(this.operationReference, getFaceTecTokenResponse.operationReference);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getOperationReference() {
        return this.operationReference;
    }

    public int hashCode() {
        String str = this.accessToken;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.operationReference;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "GetFaceTecTokenResponse(accessToken=" + this.accessToken + ", operationReference=" + this.operationReference + ')';
    }

    public GetFaceTecTokenResponse(String str, String str2) {
        this.accessToken = str;
        this.operationReference = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetFaceTecTokenResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
