package we0;

import ed1.C40762x;
import he1.C41238w;
import hf0.C24982a;
import kf0.C25723a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: we0.p0 */
public final class C29356p0 {

    /* renamed from: a */
    private final C24982a f74439a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C25723a f74440b;

    /* renamed from: we0.p0$a */
    static final class C29357a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29356p0 f74441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29357a(C29356p0 p0Var) {
            super(1);
            this.f74441d = p0Var;
        }

        /* renamed from: a */
        public final void mo69206a(C41238w wVar) {
            this.f74441d.f74440b.mo64301M1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69206a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    public C29356p0(C24982a aVar, C25723a aVar2) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(aVar2, "transactionsRepository");
        this.f74439a = aVar;
        this.f74440b = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m89434d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40762x mo69205c(String str, String str2, Double d, String str3, Double d2, int i, String str4, String str5, String str6) {
        C41536l.m120489i(str, "symbol");
        C41536l.m120489i(str2, "side");
        String str7 = str3;
        C41536l.m120489i(str7, "ccy");
        C40762x m = this.f74439a.mo59112s1(str, str2, d, str7, d2, i, str4, str5, str6).mo95084m(new C29354o0(new C29357a(this)));
        C41536l.m120488h(m, "operator fun invoke(\n   …ons()\n            }\n    }");
        return m;
    }
}
