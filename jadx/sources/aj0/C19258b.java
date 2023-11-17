package aj0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import bj0.C19391a;
import cj0.C19763b;
import dj0.C20027c;
import kotlin.jvm.internal.C41536l;
import mi0.C26234b;
import mj0.C26238b;
import mj0.C26241e;
import oh0.C27011f;
import pi0.C27534a;
import th0.C28413m0;

/* renamed from: aj0.b */
public final class C19258b implements C26241e {

    /* renamed from: a */
    private final C19391a f53476a;

    public C19258b(C19391a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f53476a = aVar;
    }

    /* renamed from: a */
    public int mo47487a() {
        return C27011f.item_gift_card_statement_header;
    }

    /* renamed from: b */
    public C26238b mo47488b(LayoutInflater layoutInflater, ViewGroup viewGroup, C26234b bVar) {
        C41536l.m120489i(layoutInflater, "layoutInflater");
        C41536l.m120489i(viewGroup, "parent");
        C41536l.m120489i(bVar, "eventHandler");
        C28413m0 d = C28413m0.m87174d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C20027c(d, this.f53476a);
    }

    /* renamed from: c */
    public C1796h.C1802f mo47489c() {
        return C26241e.C26242a.m82059a(this);
    }

    /* renamed from: d */
    public boolean mo47490d(C27534a aVar) {
        C41536l.m120489i(aVar, "item");
        return aVar instanceof C19763b;
    }
}
