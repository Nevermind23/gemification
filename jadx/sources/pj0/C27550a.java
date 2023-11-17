package pj0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import kotlin.jvm.internal.C41536l;
import mi0.C26234b;
import mj0.C26241e;
import oh0.C27011f;
import pi0.C27534a;
import rj0.C28046a;
import sj0.C28236a;
import th0.C28433w0;

/* renamed from: pj0.a */
public final class C27550a implements C26241e {
    /* renamed from: a */
    public int mo47487a() {
        return C27011f.item_terms_of_usage_image;
    }

    /* renamed from: c */
    public C1796h.C1802f mo47489c() {
        return C26241e.C26242a.m82059a(this);
    }

    /* renamed from: d */
    public boolean mo47490d(C27534a aVar) {
        C41536l.m120489i(aVar, "item");
        return aVar instanceof C28046a;
    }

    /* renamed from: e */
    public C28236a mo47488b(LayoutInflater layoutInflater, ViewGroup viewGroup, C26234b bVar) {
        C41536l.m120489i(layoutInflater, "layoutInflater");
        C41536l.m120489i(viewGroup, "parent");
        C41536l.m120489i(bVar, "eventHandler");
        C28433w0 d = C28433w0.m87256d(layoutInflater, viewGroup, false);
        C41536l.m120488h(d, "inflate(layoutInflater, parent, false)");
        return new C28236a(d);
    }
}
