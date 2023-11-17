package p341ge.bog.mobilebank.shared.data.deeplink;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.shared.data.deeplink.UrlParamEntity */
public final class UrlParamEntity {
    private final String key;
    private final String value;

    public UrlParamEntity(String str, String str2) {
        C41536l.m120489i(str, "key");
        this.key = str;
        this.value = str2;
    }

    public static /* synthetic */ UrlParamEntity copy$default(UrlParamEntity urlParamEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlParamEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = urlParamEntity.value;
        }
        return urlParamEntity.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final UrlParamEntity copy(String str, String str2) {
        C41536l.m120489i(str, "key");
        return new UrlParamEntity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlParamEntity)) {
            return false;
        }
        UrlParamEntity urlParamEntity = (UrlParamEntity) obj;
        return C41536l.m120484d(this.key, urlParamEntity.key) && C41536l.m120484d(this.value, urlParamEntity.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        String str = this.value;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.key;
        String str2 = this.value;
        return "UrlParamEntity(key=" + str + ", value=" + str2 + ")";
    }
}
