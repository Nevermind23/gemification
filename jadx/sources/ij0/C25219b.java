package ij0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import kotlin.jvm.internal.C41536l;
import mi0.C26234b;
import mj0.C26240d;
import mj0.C26241e;
import oh0.C27011f;
import pi0.C27534a;
import qj0.C27842a;
import th0.C28403h0;

/* renamed from: ij0.b */
public final class C25219b implements C26241e {

    /* renamed from: a */
    private final C27842a f64785a;

    public C25219b(C27842a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f64785a = aVar;
    }

    /* renamed from: a */
    public int mo47487a() {
        return C27011f.item_gift_card_error;
    }

    /* renamed from: c */
    public C1796h.C1802f mo47489c() {
        return C26241e.C26242a.m82059a(this);
    }

    /* renamed from: d */
    public boolean mo47490d(C27534a aVar) {
        C41536l.m120489i(aVar, "item");
        return aVar instanceof C25218a;
    }

    /* renamed from: e */
    public C26240d mo47488b(LayoutInflater layoutInflater, ViewGroup viewGroup, C26234b bVar) {
        C41536l.m120489i(layoutInflater, "layoutInflater");
        C41536l.m120489i(viewGroup, "parent");
        C41536l.m120489i(bVar, "eventHandler");
        C28403h0 d = C28403h0.m87134d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C26240d(d, this.f64785a);
    }
}
