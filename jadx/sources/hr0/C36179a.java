package hr0;

import androidx.recyclerview.widget.C1796h;
import jr0.C36783a;
import kotlin.jvm.internal.C41536l;

/* renamed from: hr0.a */
final class C36179a extends C1796h.C1802f {

    /* renamed from: a */
    public static final C36179a f87371a = new C36179a();

    private C36179a() {
    }

    /* renamed from: d */
    public boolean mo5976a(C36783a aVar, C36783a aVar2) {
        C41536l.m120489i(aVar, "oldItem");
        C41536l.m120489i(aVar2, "newItem");
        if (aVar.mo89664d() != aVar2.mo89664d() || !C41536l.m120484d(aVar.mo89661a(), aVar2.mo89661a()) || !C41536l.m120484d(aVar.mo89663c(), aVar2.mo89663c()) || !C41536l.m120484d(aVar.mo89662b(), aVar2.mo89662b())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo5977b(C36783a aVar, C36783a aVar2) {
        C41536l.m120489i(aVar, "oldItem");
        C41536l.m120489i(aVar2, "newItem");
        return C41536l.m120484d(aVar.mo89662b(), aVar2.mo89662b());
    }
}
