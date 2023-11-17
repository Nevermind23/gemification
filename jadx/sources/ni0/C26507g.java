package ni0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import kotlin.jvm.internal.C41536l;
import mi0.C26234b;
import mj0.C26238b;
import mj0.C26241e;
import oh0.C27011f;
import oi0.C27016b;
import pi0.C27534a;
import qi0.C27826l;
import th0.C28389a0;

/* renamed from: ni0.g */
public final class C26507g implements C26241e {

    /* renamed from: a */
    private final C27016b f67098a;

    public C26507g(C27016b bVar) {
        C41536l.m120489i(bVar, "giftCardCodeBannerListener");
        this.f67098a = bVar;
    }

    /* renamed from: a */
    public int mo47487a() {
        return C27011f.item_gift_card_code_banner;
    }

    /* renamed from: b */
    public C26238b mo47488b(LayoutInflater layoutInflater, ViewGroup viewGroup, C26234b bVar) {
        C41536l.m120489i(layoutInflater, "layoutInflater");
        C41536l.m120489i(viewGroup, "parent");
        C41536l.m120489i(bVar, "eventHandler");
        C28389a0 d = C28389a0.m87077d(layoutInflater, viewGroup, false);
        C41536l.m120488h(d, "inflate(layoutInflater, parent, false)");
        return new C27826l(d, this.f67098a);
    }

    /* renamed from: c */
    public C1796h.C1802f mo47489c() {
        return C26241e.C26242a.m82059a(this);
    }

    /* renamed from: d */
    public boolean mo47490d(C27534a aVar) {
        C41536l.m120489i(aVar, "item");
        return aVar instanceof C27534a.C27541f;
    }
}
