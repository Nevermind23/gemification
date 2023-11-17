package aj0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import bj0.C19391a;
import cj0.C19762a;
import dj0.C20026b;
import kotlin.jvm.internal.C41536l;
import mi0.C26234b;
import mj0.C26238b;
import mj0.C26241e;
import oh0.C27011f;
import pi0.C27534a;
import th0.C28409k0;

/* renamed from: aj0.a */
public final class C19257a implements C26241e {

    /* renamed from: a */
    private final C19391a f53475a;

    public C19257a(C19391a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f53475a = aVar;
    }

    /* renamed from: a */
    public int mo47487a() {
        return C27011f.item_gift_card_offers_and_applications_details;
    }

    /* renamed from: b */
    public C26238b mo47488b(LayoutInflater layoutInflater, ViewGroup viewGroup, C26234b bVar) {
        C41536l.m120489i(layoutInflater, "layoutInflater");
        C41536l.m120489i(viewGroup, "parent");
        C41536l.m120489i(bVar, "eventHandler");
        C28409k0 d = C28409k0.m87158d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C20026b(d, this.f53475a);
    }

    /* renamed from: c */
    public C1796h.C1802f mo47489c() {
        return C26241e.C26242a.m82059a(this);
    }

    /* renamed from: d */
    public boolean mo47490d(C27534a aVar) {
        C41536l.m120489i(aVar, "item");
        return aVar instanceof C19762a;
    }
}
