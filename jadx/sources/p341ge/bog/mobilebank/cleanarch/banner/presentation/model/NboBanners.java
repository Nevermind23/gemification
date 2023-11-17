package p341ge.bog.mobilebank.cleanarch.banner.presentation.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanners */
public final class NboBanners {
    @C8664c(alternate = {"BannerList"}, value = "bannerList")
    private final List<NboBanner> bannerList;

    public NboBanners(List<NboBanner> list) {
        this.bannerList = list;
    }

    public static /* synthetic */ NboBanners copy$default(NboBanners nboBanners, List<NboBanner> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = nboBanners.bannerList;
        }
        return nboBanners.copy(list);
    }

    public final List<NboBanner> component1() {
        return this.bannerList;
    }

    public final NboBanners copy(List<NboBanner> list) {
        return new NboBanners(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NboBanners) && C41536l.m120484d(this.bannerList, ((NboBanners) obj).bannerList);
    }

    public final List<NboBanner> getBannerList() {
        return this.bannerList;
    }

    public int hashCode() {
        List<NboBanner> list = this.bannerList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<NboBanner> list = this.bannerList;
        return "NboBanners(bannerList=" + list + ")";
    }
}
