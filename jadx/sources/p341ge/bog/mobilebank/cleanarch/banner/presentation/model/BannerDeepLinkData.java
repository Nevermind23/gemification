package p341ge.bog.mobilebank.cleanarch.banner.presentation.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerDeepLinkData */
public final class BannerDeepLinkData {
    private final List<BannerParameterData> parameters;
    private final String type;

    public BannerDeepLinkData(String str, List<BannerParameterData> list) {
        this.type = str;
        this.parameters = list;
    }

    public static /* synthetic */ BannerDeepLinkData copy$default(BannerDeepLinkData bannerDeepLinkData, String str, List<BannerParameterData> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerDeepLinkData.type;
        }
        if ((i & 2) != 0) {
            list = bannerDeepLinkData.parameters;
        }
        return bannerDeepLinkData.copy(str, list);
    }

    public final String component1() {
        return this.type;
    }

    public final List<BannerParameterData> component2() {
        return this.parameters;
    }

    public final BannerDeepLinkData copy(String str, List<BannerParameterData> list) {
        return new BannerDeepLinkData(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerDeepLinkData)) {
            return false;
        }
        BannerDeepLinkData bannerDeepLinkData = (BannerDeepLinkData) obj;
        return C41536l.m120484d(this.type, bannerDeepLinkData.type) && C41536l.m120484d(this.parameters, bannerDeepLinkData.parameters);
    }

    public final List<BannerParameterData> getParameters() {
        return this.parameters;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BannerParameterData> list = this.parameters;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.type;
        List<BannerParameterData> list = this.parameters;
        return "BannerDeepLinkData(type=" + str + ", parameters=" + list + ")";
    }
}
