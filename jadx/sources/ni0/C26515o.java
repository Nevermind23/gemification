package ni0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import kotlin.jvm.internal.C41536l;
import mi0.C26234b;
import mj0.C26241e;
import oh0.C27011f;
import pi0.C27534a;
import qi0.C27841y;
import th0.C28399f0;

/* renamed from: ni0.o */
public final class C26515o implements C26241e {

    /* renamed from: a */
    public static final C26515o f67104a = new C26515o();

    private C26515o() {
    }

    /* renamed from: a */
    public int mo47487a() {
        return C27011f.item_gift_card_details_transactions_loading;
    }

    /* renamed from: c */
    public C1796h.C1802f mo47489c() {
        return C26241e.C26242a.m82059a(this);
    }

    /* renamed from: d */
    public boolean mo47490d(C27534a aVar) {
        C41536l.m120489i(aVar, "item");
        return aVar instanceof C27534a.C27549n;
    }

    /* renamed from: e */
    public C27841y mo47488b(LayoutInflater layoutInflater, ViewGroup viewGroup, C26234b bVar) {
        C41536l.m120489i(layoutInflater, "layoutInflater");
        C41536l.m120489i(viewGroup, "parent");
        C41536l.m120489i(bVar, "eventHandler");
        C28399f0 d = C28399f0.m87118d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C27841y(d);
    }
}
