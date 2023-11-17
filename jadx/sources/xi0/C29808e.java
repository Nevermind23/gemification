package xi0;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import mj0.C26237a;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import th0.C28422r;
import wi0.C29435f;
import wi0.C29440h;

/* renamed from: xi0.e */
public final class C29808e extends C26237a {

    /* renamed from: d */
    private final C28422r f75480d;

    /* renamed from: e */
    private final C29435f.C29438c f75481e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29808e(th0.C28422r r3, wi0.C29435f.C29438c r4) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "uiEventListener"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f75480d = r3
            r2.f75481e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xi0.C29808e.<init>(th0.r, wi0.f$c):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m90554l(C29808e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.f75481e.mo69262G();
    }

    /* renamed from: k */
    public void mo65239h(C29440h hVar) {
        C41536l.m120489i(hVar, "item");
        C28422r rVar = this.f75480d;
        C29440h.C29443c cVar = (C29440h.C29443c) hVar;
        rVar.f72195f.setTitle(C34646b.m101752f(cVar.mo69288c(), (Context) null, 1, (Object) null));
        rVar.f72196g.setButtonText(C34646b.m101752f(cVar.mo69287b(), (Context) null, 1, (Object) null));
        rVar.f72196g.setOnClickListener(new C29807d(this));
    }

    /* renamed from: m */
    public void mo65240i(C29440h hVar) {
        C41536l.m120489i(hVar, "item");
    }
}
