package hh0;

import dd0.C19981a;
import ed1.C40762x;
import ih0.C25213f;
import jh0.C25455a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: hh0.p */
public final class C25024p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C19981a f64355a;

    /* renamed from: b */
    private final C25007b f64356b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C25455a f64357c;

    /* renamed from: hh0.p$a */
    static final class C25025a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25024p f64358d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25025a(C25024p pVar) {
            super(1);
            this.f64358d = pVar;
        }

        /* renamed from: a */
        public final C25213f invoke(C25213f fVar) {
            C41536l.m120489i(fVar, "token");
            if (this.f64358d.f64355a.invoke()) {
                this.f64358d.f64357c.mo48387h(fVar.mo63736a());
                this.f64358d.f64357c.mo48381c(fVar.mo63736a());
            }
            return fVar;
        }
    }

    public C25024p(C19981a aVar, C25007b bVar, C25455a aVar2) {
        C41536l.m120489i(aVar, "isUserSaved");
        C41536l.m120489i(bVar, "fetchGamificationTokenUseCase");
        C41536l.m120489i(aVar2, "gamificationPreferencesManager");
        this.f64355a = aVar;
        this.f64356b = bVar;
        this.f64357c = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C25213f m79941e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25213f) lVar.invoke(obj);
    }

    /* renamed from: d */
    public final C40762x mo63424d() {
        C40762x A = this.f64356b.mo63412a().mo95062A(new C25023o(new C25025a(this)));
        C41536l.m120488h(A, "operator fun invoke(): S…      token\n            }");
        return A;
    }
}
