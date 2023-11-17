package p341ge.bog.mobilebank.cleanarch.banner.presentation.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerTypedParameterData */
public final class BannerTypedParameterData {
    private final String key;
    private final String type;
    private final Object value;

    public BannerTypedParameterData(String str, Object obj, String str2) {
        this.key = str;
        this.value = obj;
        this.type = str2;
    }

    public static /* synthetic */ BannerTypedParameterData copy$default(BannerTypedParameterData bannerTypedParameterData, String str, Object obj, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = bannerTypedParameterData.key;
        }
        if ((i & 2) != 0) {
            obj = bannerTypedParameterData.value;
        }
        if ((i & 4) != 0) {
            str2 = bannerTypedParameterData.type;
        }
        return bannerTypedParameterData.copy(str, obj, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final Object component2() {
        return this.value;
    }

    public final String component3() {
        return this.type;
    }

    public final BannerTypedParameterData copy(String str, Object obj, String str2) {
        return new BannerTypedParameterData(str, obj, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerTypedParameterData)) {
            return false;
        }
        BannerTypedParameterData bannerTypedParameterData = (BannerTypedParameterData) obj;
        return C41536l.m120484d(this.key, bannerTypedParameterData.key) && C41536l.m120484d(this.value, bannerTypedParameterData.value) && C41536l.m120484d(this.type, bannerTypedParameterData.type);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getType() {
        return this.type;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.value;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.type;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.key;
        Object obj = this.value;
        String str2 = this.type;
        return "BannerTypedParameterData(key=" + str + ", value=" + obj + ", type=" + str2 + ")";
    }
}
