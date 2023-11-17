package ni0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import kotlin.jvm.internal.C41536l;
import mi0.C26234b;
import mj0.C26238b;
import mj0.C26241e;
import oh0.C27011f;
import oi0.C27017c;
import pi0.C27534a;
import qi0.C27818e;
import th0.C28395d0;

/* renamed from: ni0.b */
public final class C26501b implements C26241e {

    /* renamed from: a */
    private final C27017c f67093a;

    /* renamed from: ni0.b$a */
    private static final class C26502a extends C1796h.C1802f {
        /* renamed from: d */
        public boolean mo5976a(C27534a.C27536b bVar, C27534a.C27536b bVar2) {
            C41536l.m120489i(bVar, "oldItem");
            C41536l.m120489i(bVar2, "newItem");
            return C41536l.m120484d(bVar, bVar2);
        }

        /* renamed from: e */
        public boolean mo5977b(C27534a.C27536b bVar, C27534a.C27536b bVar2) {
            C41536l.m120489i(bVar, "oldItem");
            C41536l.m120489i(bVar2, "newItem");
            if (bVar.mo66862c() == bVar2.mo66862c()) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public Object mo5978c(C27534a.C27536b bVar, C27534a.C27536b bVar2) {
            boolean z;
            C41536l.m120489i(bVar, "oldItem");
            C41536l.m120489i(bVar2, "newItem");
            Boolean valueOf = Boolean.valueOf(bVar2.mo66868h());
            if (valueOf.booleanValue() != bVar.mo66868h()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf == null) {
                return super.mo5978c(bVar, bVar2);
            }
            return valueOf;
        }
    }

    public C26501b(C27017c cVar) {
        C41536l.m120489i(cVar, "listener");
        this.f67093a = cVar;
    }

    /* renamed from: a */
    public int mo47487a() {
        return C27011f.item_gift_card_details;
    }

    /* renamed from: b */
    public C26238b mo47488b(LayoutInflater layoutInflater, ViewGroup viewGroup, C26234b bVar) {
        C41536l.m120489i(layoutInflater, "layoutInflater");
        C41536l.m120489i(viewGroup, "parent");
        C41536l.m120489i(bVar, "eventHandler");
        C28395d0 d = C28395d0.m87101d(layoutInflater, viewGroup, false);
        C41536l.m120488h(d, "inflate(layoutInflater, parent, false)");
        return new C27818e(d, this.f67093a);
    }

    /* renamed from: c */
    public C1796h.C1802f mo47489c() {
        return new C26502a();
    }

    /* renamed from: d */
    public boolean mo47490d(C27534a aVar) {
        C41536l.m120489i(aVar, "item");
        return aVar instanceof C27534a.C27536b;
    }
}
