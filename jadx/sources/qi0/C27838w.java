package qi0;

import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import mj0.C26238b;
import pi0.C27534a;
import th0.C28411l0;

/* renamed from: qi0.w */
public final class C27838w extends C26238b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27838w(C28411l0 l0Var) {
        super(l0Var);
        C41536l.m120489i(l0Var, "binding");
        l0Var.f72132e.setTitle(C32343x.m95388F("giftcard.owner.payment.history.title", new Object[0]));
        l0Var.f72135h.setTitle(C32343x.m95388F("giftcard.owner.payment.history.remaining", new Object[0]));
        l0Var.f72136i.setTitle(C32343x.m95388F("giftcard.owner.payment.history.spent", new Object[0]));
    }

    /* renamed from: m */
    public void mo48397j(C27534a.C27547l lVar) {
        C41536l.m120489i(lVar, "item");
        C28411l0 l0Var = (C28411l0) mo65241h();
        super.mo48397j(lVar);
        l0Var.f72136i.setBottomTitle(lVar.mo66913b());
        l0Var.f72135h.setBottomTitle(lVar.mo66912a());
    }
}
