package ni0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import kotlin.jvm.internal.C41536l;
import mi0.C26234b;
import mj0.C26238b;
import mj0.C26241e;
import oh0.C27011f;
import oi0.C27018d;
import pi0.C27534a;
import qi0.C27837v;
import th0.C28407j0;

/* renamed from: ni0.l */
public final class C26512l implements C26241e {

    /* renamed from: a */
    private final C27018d f67101a;

    public C26512l(C27018d dVar) {
        C41536l.m120489i(dVar, "giftCardInlineFeedbackListener");
        this.f67101a = dVar;
    }

    /* renamed from: a */
    public int mo47487a() {
        return C27011f.item_gift_card_inline_feedback;
    }

    /* renamed from: b */
    public C26238b mo47488b(LayoutInflater layoutInflater, ViewGroup viewGroup, C26234b bVar) {
        C41536l.m120489i(layoutInflater, "layoutInflater");
        C41536l.m120489i(viewGroup, "parent");
        C41536l.m120489i(bVar, "eventHandler");
        C28407j0 d = C28407j0.m87150d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C27837v(d, this.f67101a);
    }

    /* renamed from: c */
    public C1796h.C1802f mo47489c() {
        return C26241e.C26242a.m82059a(this);
    }

    /* renamed from: d */
    public boolean mo47490d(C27534a aVar) {
        C41536l.m120489i(aVar, "item");
        return aVar instanceof C27534a.C27546k;
    }
}
