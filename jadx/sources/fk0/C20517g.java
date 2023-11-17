package fk0;

import bk0.C19392a;
import bk0.C19394c;
import ck0.C19765b;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import dk0.C20031a;
import dk0.C20032b;
import dk0.C20034d;
import dk0.C20036f;
import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40763y;
import ek0.C20261a;
import g91.C32343x;
import gk0.C24761a;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lk0.C26050a;
import p313x7.C8973b;
import p337z7.Task;
import ue1.C43075l;
import vj0.C29095f;

/* renamed from: fk0.g */
public final class C20517g implements C19392a {

    /* renamed from: a */
    private final C8973b f55530a;

    /* renamed from: b */
    private final C19394c f55531b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C26050a f55532c;

    /* renamed from: fk0.g$a */
    private static final class C20518a {

        /* renamed from: a */
        private final TokenInfo f55533a;

        public C20518a(TokenInfo tokenInfo) {
            this.f55533a = tokenInfo;
        }

        /* renamed from: a */
        public final TokenInfo mo49046a() {
            return this.f55533a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C20518a) && C41536l.m120484d(this.f55533a, ((C20518a) obj).f55533a);
        }

        public int hashCode() {
            TokenInfo tokenInfo = this.f55533a;
            if (tokenInfo == null) {
                return 0;
            }
            return tokenInfo.hashCode();
        }

        public String toString() {
            TokenInfo tokenInfo = this.f55533a;
            return "TokenWrapper(info=" + tokenInfo + ")";
        }
    }

    /* renamed from: fk0.g$b */
    static final class C20519b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40763y f55534d;

        /* renamed from: e */
        final /* synthetic */ C20517g f55535e;

        /* renamed from: f */
        final /* synthetic */ C20031a f55536f;

        /* renamed from: g */
        final /* synthetic */ C20036f f55537g;

        /* renamed from: h */
        final /* synthetic */ String f55538h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20519b(C40763y yVar, C20517g gVar, C20031a aVar, C20036f fVar, String str) {
            super(1);
            this.f55534d = yVar;
            this.f55535e = gVar;
            this.f55536f = aVar;
            this.f55537g = fVar;
            this.f55538h = str;
        }

        /* renamed from: a */
        public final void mo49050a(List list) {
            C40763y yVar = this.f55534d;
            C20517g gVar = this.f55535e;
            C41536l.m120488h(list, "it");
            yVar.mo95093a(gVar.m66748o(list, this.f55536f, this.f55537g, this.f55538h));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49050a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: fk0.g$c */
    static final class C20520c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20517g f55539d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20520c(C20517g gVar) {
            super(1);
            this.f55539d = gVar;
        }

        /* renamed from: a */
        public final C20034d invoke(C20518a aVar) {
            C20261a aVar2;
            String str;
            C41536l.m120489i(aVar, "token");
            if (aVar.mo49046a() == null) {
                aVar2 = C20261a.NOT_ADDED;
            } else {
                aVar2 = this.f55539d.f55532c.mo64946i(aVar.mo49046a().mo15179f0());
            }
            TokenInfo a = aVar.mo49046a();
            if (a != null) {
                str = a.mo15181w();
            } else {
                str = null;
            }
            return new C20034d(aVar2, str);
        }
    }

    /* renamed from: fk0.g$d */
    static final class C20521d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C20521d f55540d = new C20521d();

        C20521d() {
            super(1);
        }

        /* renamed from: a */
        public final C24761a invoke(C19765b bVar) {
            C41536l.m120489i(bVar, "it");
            return C24761a.ACTIVE;
        }
    }

    /* renamed from: fk0.g$e */
    static final class C20522e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20517g f55541d;

        /* renamed from: e */
        final /* synthetic */ C20032b f55542e;

        /* renamed from: fk0.g$e$a */
        public /* synthetic */ class C20523a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f55543a;

            static {
                int[] iArr = new int[C24761a.values().length];
                try {
                    iArr[C24761a.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f55543a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20522e(C20517g gVar, C20032b bVar) {
            super(1);
            this.f55541d = gVar;
            this.f55542e = bVar;
        }

        /* renamed from: a */
        public final C40735b0 invoke(C24761a aVar) {
            C20261a aVar2;
            C41536l.m120489i(aVar, "req");
            if (C20523a.f55543a[aVar.ordinal()] == 1) {
                return this.f55541d.m66744k(this.f55542e);
            }
            if (aVar == C24761a.NEEDS_CREATION) {
                aVar2 = C20261a.WALLET_NEEDS_CREATION;
            } else {
                aVar2 = C20261a.WALLET_NOT_AVAILABE;
            }
            C40762x z = C40762x.m118162z(new C20034d(aVar2, (String) null, 2, (DefaultConstructorMarker) null));
            C41536l.m120488h(z, "just(\n                  …      )\n                )");
            return z;
        }
    }

    public C20517g(C8973b bVar, C19394c cVar, C26050a aVar) {
        C41536l.m120489i(bVar, "tapAndPayClient");
        C41536l.m120489i(cVar, "getWalletId");
        C41536l.m120489i(aVar, "tokenMapper");
        this.f55530a = bVar;
        this.f55531b = cVar;
        this.f55532c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final C40762x m66744k(C20032b bVar) {
        C40762x L = C40762x.m118157e(new C20514d(bVar, this)).mo95073L(800, TimeUnit.MILLISECONDS);
        C41536l.m120488h(L, "create<TokenWrapper> { e…S, TimeUnit.MILLISECONDS)");
        C40762x A = C32343x.m95456i1(L).mo95062A(new C20515e(new C20520c(this)));
        C41536l.m120488h(A, "private fun checkCard(\n …         .subscribeOnIO()");
        return C32343x.m95456i1(A);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m66745l(C20032b bVar, C20517g gVar, C40763y yVar) {
        C41536l.m120489i(bVar, "$tokenRequest");
        C41536l.m120489i(gVar, "this$0");
        C41536l.m120489i(yVar, "emitter");
        String a = bVar.mo48402a();
        C20031a b = bVar.mo48403b();
        C20036f c = bVar.mo48404c();
        Task a2 = gVar.f55530a.mo21124a();
        a2.mo24864i(new C20516f(new C20519b(yVar, gVar, b, c, a)));
        a2.mo24861f(new C29095f(yVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m66746m(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final C20034d m66747n(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C20034d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final C20518a m66748o(List list, C20031a aVar, C20036f fVar, String str) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            TokenInfo tokenInfo = (TokenInfo) obj;
            if (tokenInfo.mo15183x() == this.f55532c.mo64942e(aVar).mo65246b() && tokenInfo.mo15178R() == this.f55532c.mo64944g(fVar).mo65255b() && C41536l.m120484d(tokenInfo.mo15180v(), str)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return new C20518a((TokenInfo) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final C24761a m66749p(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C24761a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final C24761a m66750q(Throwable th) {
        ApiException apiException;
        C41536l.m120489i(th, "it");
        Integer num = null;
        if (th instanceof ApiException) {
            apiException = (ApiException) th;
        } else {
            apiException = null;
        }
        if (apiException != null) {
            num = Integer.valueOf(apiException.mo11887b());
        }
        if (num != null && num.intValue() == 15002) {
            return C24761a.NEEDS_CREATION;
        }
        return C24761a.NOT_AVAILABLE;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final C40735b0 m66751r(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo47613a(C20032b bVar) {
        C41536l.m120489i(bVar, "tokenRequest");
        C40762x r = this.f55531b.invoke().mo95062A(new C20511a(C20521d.f55540d)).mo95065D(new C20512b()).mo95087r(new C20513c(new C20522e(this, bVar)));
        C41536l.m120488h(r, "override fun invoke(\n   …)\n            }\n        }");
        return r;
    }
}
