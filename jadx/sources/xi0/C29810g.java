package xi0;

import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import mj0.C26237a;
import th0.C28421q0;
import ue1.C43075l;
import wi0.C29435f;
import wi0.C29440h;

/* renamed from: xi0.g */
public final class C29810g extends C26237a {

    /* renamed from: d */
    private final C28421q0 f75482d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29435f.C29438c f75483e;

    /* renamed from: xi0.g$a */
    static final class C29811a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29811a f75484d = new C29811a();

        C29811a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo70067a(String str) {
            C41536l.m120489i(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70067a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xi0.g$b */
    static final class C29812b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29810g f75485d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29812b(C29810g gVar) {
            super(1);
            this.f75485d = gVar;
        }

        /* renamed from: a */
        public final void mo70068a(String str) {
            C41536l.m120489i(str, "it");
            this.f75485d.f75483e.mo69263f(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70068a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29810g(th0.C28421q0 r3, wi0.C29435f.C29438c r4) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            ge.bog.designsystem.components.search.SearchView r0 = r3.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f75482d = r3
            r2.f75483e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xi0.C29810g.<init>(th0.q0, wi0.f$c):void");
    }

    /* renamed from: k */
    public void mo65239h(C29440h hVar) {
        C41536l.m120489i(hVar, "item");
        C28421q0 q0Var = this.f75482d;
        q0Var.f72192e.setOnTextChangeListener(C29811a.f75484d);
        q0Var.f72192e.setInputText(((C29440h.C29445e) hVar).mo69292b());
        q0Var.f72192e.setOnTextChangeListener(new C29812b(this));
    }

    /* renamed from: l */
    public void mo65240i(C29440h hVar) {
        C41536l.m120489i(hVar, "item");
    }
}
