package p523mm;

import ed1.C40762x;
import he1.C41238w;
import j70.C25351j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.model.Client;
import p509lm.C16586a;
import p565pm.C17387b;
import ue1.C43075l;

/* renamed from: mm.b1 */
public final class C16728b1 {

    /* renamed from: a */
    private final C16586a f46969a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C25351j f46970b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Client f46971c;

    /* renamed from: mm.b1$a */
    static final class C16729a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16728b1 f46972d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16729a(C16728b1 b1Var) {
            super(1);
            this.f46972d = b1Var;
        }

        /* renamed from: a */
        public final void mo43858a(C17387b bVar) {
            this.f46972d.f46970b.invoke();
            this.f46972d.f46971c.updateClientProducts();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo43858a((C17387b) obj);
            return C41238w.f97225a;
        }
    }

    public C16728b1(C16586a aVar, C25351j jVar, Client client) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(jVar, "reloadProducts");
        C41536l.m120489i(client, "client");
        this.f46969a = aVar;
        this.f46970b = jVar;
        this.f46971c = client;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m59150e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: d */
    public final C40762x mo43857d(String str, String str2, String str3, String str4, Long l, String str5, String str6) {
        C41536l.m120489i(str, "customerId");
        C41536l.m120489i(str2, "pan2");
        C41536l.m120489i(str3, "cvv");
        C41536l.m120489i(str4, "expDate");
        C40762x m = this.f46969a.mo42411b0(str, str2, str3, str4, l, str5, str6).mo95084m(new C16725a1(new C16729a(this)));
        C41536l.m120488h(m, "operator fun invoke(\n   …ateClientProducts()\n    }");
        return m;
    }
}
