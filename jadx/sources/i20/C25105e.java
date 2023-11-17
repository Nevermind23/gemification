package i20;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: i20.e */
public final class C25105e {

    /* renamed from: a */
    private final List f64502a;

    public C25105e(List list) {
        this.f64502a = list;
    }

    /* renamed from: a */
    public final List mo63589a() {
        return this.f64502a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25105e) && C41536l.m120484d(this.f64502a, ((C25105e) obj).f64502a);
    }

    public int hashCode() {
        List list = this.f64502a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List list = this.f64502a;
        return "NboBannersUiModel(bannerList=" + list + ")";
    }
}
