package xs0;

import at0.C31064a;
import bt0.C31186b;
import ed1.C40762x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ky0.C37020g;
import ue1.C43075l;

/* renamed from: xs0.g0 */
public final class C39858g0 {

    /* renamed from: a */
    private final C31186b f94603a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C37020g f94604b;

    /* renamed from: xs0.g0$a */
    static final class C39859a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39858g0 f94605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39859a(C39858g0 g0Var) {
            super(1);
            this.f94605d = g0Var;
        }

        /* renamed from: a */
        public final void mo93565a(C31064a aVar) {
            this.f94605d.f94604b.mo89943a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93565a((C31064a) obj);
            return C41238w.f97225a;
        }
    }

    public C39858g0(C31186b bVar, C37020g gVar) {
        C41536l.m120489i(bVar, "repository");
        C41536l.m120489i(gVar, "refreshDepositsAndBonds");
        this.f94603a = bVar;
        this.f94604b = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m115629d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40762x mo93564c(Long l, String str, String str2, String str3, String str4) {
        C40762x m = this.f94603a.mo71401L(l, str, str2, str3, str4).mo95084m(new C39856f0(new C39859a(this)));
        C41536l.m120488h(m, "operator fun invoke(\n   …ositsAndBonds()\n        }");
        return m;
    }
}
