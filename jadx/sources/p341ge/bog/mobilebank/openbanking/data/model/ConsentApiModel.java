package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.ConsentApiModel */
public final class ConsentApiModel {
    private final String authorizationUrl;
    private final String consentId;

    public ConsentApiModel(String str, String str2) {
        C41536l.m120489i(str, "consentId");
        C41536l.m120489i(str2, "authorizationUrl");
        this.consentId = str;
        this.authorizationUrl = str2;
    }

    public static /* synthetic */ ConsentApiModel copy$default(ConsentApiModel consentApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consentApiModel.consentId;
        }
        if ((i & 2) != 0) {
            str2 = consentApiModel.authorizationUrl;
        }
        return consentApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.consentId;
    }

    public final String component2() {
        return this.authorizationUrl;
    }

    public final ConsentApiModel copy(String str, String str2) {
        C41536l.m120489i(str, "consentId");
        C41536l.m120489i(str2, "authorizationUrl");
        return new ConsentApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentApiModel)) {
            return false;
        }
        ConsentApiModel consentApiModel = (ConsentApiModel) obj;
        return C41536l.m120484d(this.consentId, consentApiModel.consentId) && C41536l.m120484d(this.authorizationUrl, consentApiModel.authorizationUrl);
    }

    public final String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    public final String getConsentId() {
        return this.consentId;
    }

    public int hashCode() {
        return (this.consentId.hashCode() * 31) + this.authorizationUrl.hashCode();
    }

    public String toString() {
        String str = this.consentId;
        String str2 = this.authorizationUrl;
        return "ConsentApiModel(consentId=" + str + ", authorizationUrl=" + str2 + ")";
    }
}
