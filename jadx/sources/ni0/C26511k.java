package ni0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import kotlin.jvm.internal.C41536l;
import mi0.C26234b;
import mj0.C26238b;
import mj0.C26241e;
import oh0.C27011f;
import oi0.C27019e;
import pi0.C27534a;
import qi0.C27834t;
import th0.C28423r0;

/* renamed from: ni0.k */
public final class C26511k implements C26241e {

    /* renamed from: a */
    private final C27019e f67100a;

    public C26511k(C27019e eVar) {
        C41536l.m120489i(eVar, "googlePayBannerListener");
        this.f67100a = eVar;
    }

    /* renamed from: a */
    public int mo47487a() {
        return C27011f.item_googlepay_banner;
    }

    /* renamed from: b */
    public C26238b mo47488b(LayoutInflater layoutInflater, ViewGroup viewGroup, C26234b bVar) {
        C41536l.m120489i(layoutInflater, "layoutInflater");
        C41536l.m120489i(viewGroup, "parent");
        C41536l.m120489i(bVar, "eventHandler");
        C28423r0 d = C28423r0.m87214d(layoutInflater, viewGroup, false);
        C41536l.m120488h(d, "inflate(layoutInflater, parent, false)");
        return new C27834t(d, this.f67100a);
    }

    /* renamed from: c */
    public C1796h.C1802f mo47489c() {
        return C26241e.C26242a.m82059a(this);
    }

    /* renamed from: d */
    public boolean mo47490d(C27534a aVar) {
        C41536l.m120489i(aVar, "item");
        return aVar instanceof C27534a.C27544i;
    }
}
