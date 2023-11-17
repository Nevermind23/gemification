package ni0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import mi0.C26234b;
import mj0.C26238b;
import mj0.C26241e;
import oh0.C27011f;
import oi0.C27015a;
import pi0.C27534a;
import qi0.C27814b;
import th0.C28391b0;

/* renamed from: ni0.a */
public final class C26500a implements C26241e {

    /* renamed from: a */
    private final List f67091a;

    /* renamed from: b */
    private final C27015a f67092b;

    public C26500a(List list, C27015a aVar) {
        C41536l.m120489i(list, "items");
        C41536l.m120489i(aVar, "listener");
        this.f67091a = list;
        this.f67092b = aVar;
    }

    /* renamed from: a */
    public int mo47487a() {
        return C27011f.item_gift_card_details_animation_pager;
    }

    /* renamed from: b */
    public C26238b mo47488b(LayoutInflater layoutInflater, ViewGroup viewGroup, C26234b bVar) {
        C41536l.m120489i(layoutInflater, "layoutInflater");
        C41536l.m120489i(viewGroup, "parent");
        C41536l.m120489i(bVar, "eventHandler");
        C28391b0 d = C28391b0.m87085d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C27814b(d, this.f67091a, bVar, this.f67092b);
    }

    /* renamed from: c */
    public C1796h.C1802f mo47489c() {
        return C26241e.C26242a.m82059a(this);
    }

    /* renamed from: d */
    public boolean mo47490d(C27534a aVar) {
        C41536l.m120489i(aVar, "item");
        return aVar instanceof C27534a.C27539e;
    }
}
