package qi0;

import android.view.View;
import kotlin.jvm.internal.C41536l;
import mj0.C26238b;
import oi0.C27018d;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import pi0.C27534a;
import th0.C28407j0;

/* renamed from: qi0.v */
public final class C27837v extends C26238b {

    /* renamed from: f */
    private final C27018d f70966f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27837v(C28407j0 j0Var, C27018d dVar) {
        super(j0Var);
        C41536l.m120489i(j0Var, "binding");
        C41536l.m120489i(dVar, "listener");
        this.f70966f = dVar;
        j0Var.f72074e.setOnButtonClicked(new C27836u(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m86028n(C27837v vVar, View view) {
        C41536l.m120489i(vVar, "this$0");
        vVar.f70966f.mo61794h();
    }

    /* renamed from: o */
    public void mo48397j(C27534a.C27546k kVar) {
        C41536l.m120489i(kVar, "item");
        InlineFeedback2 inlineFeedback2 = ((C28407j0) mo65241h()).f72074e;
        super.mo48397j(kVar);
        inlineFeedback2.setButtonText(kVar.mo66907a());
        inlineFeedback2.setTitle(kVar.mo66908b());
        inlineFeedback2.setCloseVisible(false);
        inlineFeedback2.setButtonVisible(true);
    }
}
