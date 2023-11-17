package vi0;

import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import mj0.C26237a;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24246a;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24254d;
import th0.C28421q0;
import ue1.C43075l;

/* renamed from: vi0.g */
public final class C29087g extends C26237a {

    /* renamed from: d */
    private final C28421q0 f74099d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C24246a.C24249c f74100e;

    /* renamed from: vi0.g$a */
    static final class C29088a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29088a f74101d = new C29088a();

        C29088a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo68967a(String str) {
            C41536l.m120489i(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68967a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vi0.g$b */
    static final class C29089b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29087g f74102d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29089b(C29087g gVar) {
            super(1);
            this.f74102d = gVar;
        }

        /* renamed from: a */
        public final void mo68968a(String str) {
            C41536l.m120489i(str, "it");
            this.f74102d.f74100e.mo61885f(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68968a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29087g(th0.C28421q0 r3, p341ge.bog.mobilebank.giftcards.presentation.filtered.C24246a.C24249c r4) {
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
            r2.f74099d = r3
            r2.f74100e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vi0.C29087g.<init>(th0.q0, ge.bog.mobilebank.giftcards.presentation.filtered.a$c):void");
    }

    /* renamed from: k */
    public void mo65239h(C24254d dVar) {
        C41536l.m120489i(dVar, "item");
        C28421q0 q0Var = this.f74099d;
        q0Var.f72192e.setOnTextChangeListener(C29088a.f74101d);
        q0Var.f72192e.setInputText(((C24254d.C24261g) dVar).mo61926e());
        q0Var.f72192e.setOnTextChangeListener(new C29089b(this));
    }
}
