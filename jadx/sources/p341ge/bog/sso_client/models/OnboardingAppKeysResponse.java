package p341ge.bog.sso_client.models;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.sso_client.models.OnboardingAppKeysResponse */
public final class OnboardingAppKeysResponse {
    private final String serverKey;

    public OnboardingAppKeysResponse(String str) {
        this.serverKey = str;
    }

    public static /* synthetic */ OnboardingAppKeysResponse copy$default(OnboardingAppKeysResponse onboardingAppKeysResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingAppKeysResponse.serverKey;
        }
        return onboardingAppKeysResponse.copy(str);
    }

    public final String component1() {
        return this.serverKey;
    }

    public final OnboardingAppKeysResponse copy(String str) {
        return new OnboardingAppKeysResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnboardingAppKeysResponse) && C41536l.m120484d(this.serverKey, ((OnboardingAppKeysResponse) obj).serverKey);
    }

    public final String getServerKey() {
        return this.serverKey;
    }

    public int hashCode() {
        String str = this.serverKey;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "OnboardingAppKeysResponse(serverKey=" + this.serverKey + ')';
    }
}
