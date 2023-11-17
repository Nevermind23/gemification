package qi0;

import android.view.View;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import mj0.C26238b;
import oi0.C27016b;
import pi0.C27534a;
import th0.C28389a0;

/* renamed from: qi0.l */
public final class C27826l extends C26238b {

    /* renamed from: f */
    private final C27016b f70957f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27826l(C28389a0 a0Var, C27016b bVar) {
        super(a0Var);
        C41536l.m120489i(a0Var, "binding");
        C41536l.m120489i(bVar, "giftCardCodeBannerListener");
        this.f70957f = bVar;
        a0Var.f71978g.setTitle(C32343x.m95388F("giftcard.owner.card.code", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m86012o(C27826l lVar, C27534a.C27541f fVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        C41536l.m120489i(fVar, "$item");
        lVar.f70957f.mo61790W0(fVar.mo66894a());
    }

    /* renamed from: n */
    public void mo48397j(C27534a.C27541f fVar) {
        C41536l.m120489i(fVar, "item");
        super.mo48397j(fVar);
        ((C28389a0) mo65241h()).f71978g.setText(fVar.mo66894a());
        ((C28389a0) mo65241h()).mo3946b().setOnClickListener(new C27825k(this, fVar));
    }
}
