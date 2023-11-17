package p341ge.bog.mobilebank.cleanarch.banner.presentation.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerParameterData */
public final class BannerParameterData {
    private final String key;
    private final String lang;
    private final String value;

    public BannerParameterData(String str, String str2, String str3) {
        this.key = str;
        this.value = str2;
        this.lang = str3;
    }

    public static /* synthetic */ BannerParameterData copy$default(BannerParameterData bannerParameterData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerParameterData.key;
        }
        if ((i & 2) != 0) {
            str2 = bannerParameterData.value;
        }
        if ((i & 4) != 0) {
            str3 = bannerParameterData.lang;
        }
        return bannerParameterData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.lang;
    }

    public final BannerParameterData copy(String str, String str2, String str3) {
        return new BannerParameterData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerParameterData)) {
            return false;
        }
        BannerParameterData bannerParameterData = (BannerParameterData) obj;
        return C41536l.m120484d(this.key, bannerParameterData.key) && C41536l.m120484d(this.value, bannerParameterData.value) && C41536l.m120484d(this.lang, bannerParameterData.lang);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lang;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.key;
        String str2 = this.value;
        String str3 = this.lang;
        return "BannerParameterData(key=" + str + ", value=" + str2 + ", lang=" + str3 + ")";
    }
}
