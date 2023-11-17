package vj0;

import bk0.C19393b;
import bk0.C19394c;
import ck0.C19765b;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import dk0.C20031a;
import dk0.C20032b;
import dk0.C20033c;
import dk0.C20034d;
import dk0.C20036f;
import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40763y;
import ek0.C20261a;
import g91.C32343x;
import gk0.C24761a;
import he1.C41238w;
import java.util.ArrayList;
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

/* renamed from: vj0.g */
public final class C29096g implements C19393b {

    /* renamed from: a */
    private final C8973b f74109a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C26050a f74110b;

    /* renamed from: c */
    private final C19394c f74111c;

    /* renamed from: vj0.g$a */
    static final class C29097a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f74112d;

        /* renamed from: e */
        final /* synthetic */ C40763y f74113e;

        /* renamed from: f */
        final /* synthetic */ C29096g f74114f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29097a(List list, C40763y yVar, C29096g gVar) {
            super(1);
            this.f74112d = list;
            this.f74113e = yVar;
            this.f74114f = gVar;
        }

        /* renamed from: a */
        public final void mo68969a(List list) {
            C20034d dVar;
            List<C20032b> list2 = this.f74112d;
            C29096g gVar = this.f74114f;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
            for (C20032b bVar : list2) {
                String a = bVar.mo48402a();
                C20031a b = bVar.mo48403b();
                C20036f c = bVar.mo48404c();
                C41536l.m120488h(list, "tokens");
                TokenInfo h = gVar.m88990m(list, b, c, a);
                if (h != null) {
                    dVar = new C20034d(gVar.f74110b.mo64946i(h.mo15179f0()), h.mo15181w());
                } else {
                    dVar = new C20034d(C20261a.NOT_ADDED, (String) null);
                }
                arrayList.add(new C20033c(bVar, dVar));
            }
            this.f74113e.mo95093a(arrayList);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68969a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vj0.g$b */
    static final class C29098b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29098b f74115d = new C29098b();

        C29098b() {
            super(1);
        }

        /* renamed from: a */
        public final C24761a invoke(C19765b bVar) {
            C41536l.m120489i(bVar, "it");
            return C24761a.ACTIVE;
        }
    }

    /* renamed from: vj0.g$c */
    static final class C29099c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29096g f74116d;

        /* renamed from: e */
        final /* synthetic */ List f74117e;

        /* renamed from: vj0.g$c$a */
        public /* synthetic */ class C29100a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f74118a;

            static {
                int[] iArr = new int[C24761a.values().length];
                try {
                    iArr[C24761a.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f74118a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29099c(C29096g gVar, List list) {
            super(1);
            this.f74116d = gVar;
            this.f74117e = list;
        }

        /* renamed from: a */
        public final C40735b0 invoke(C24761a aVar) {
            C20261a aVar2;
            C41536l.m120489i(aVar, "it");
            if (C29100a.f74118a[aVar.ordinal()] == 1) {
                return this.f74116d.m88987j(this.f74117e);
            }
            List<C20032b> list = this.f74117e;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            for (C20032b bVar : list) {
                if (aVar == C24761a.NEEDS_CREATION) {
                    aVar2 = C20261a.WALLET_NEEDS_CREATION;
                } else {
                    aVar2 = C20261a.WALLET_NOT_AVAILABE;
                }
                arrayList.add(new C20033c(bVar, new C20034d(aVar2, (String) null, 2, (DefaultConstructorMarker) null)));
            }
            C40762x z = C40762x.m118162z(arrayList);
            C41536l.m120488h(z, "just(requests.map { req …     )\n                })");
            return z;
        }
    }

    public C29096g(C8973b bVar, C26050a aVar, C19394c cVar) {
        C41536l.m120489i(bVar, "tapAndPayClient");
        C41536l.m120489i(aVar, "tokenMapper");
        C41536l.m120489i(cVar, "getWalletId");
        this.f74109a = bVar;
        this.f74110b = aVar;
        this.f74111c = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final C40762x m88987j(List list) {
        C40762x L = C40762x.m118157e(new C29093d(this, list)).mo95073L(800, TimeUnit.MILLISECONDS);
        C41536l.m120488h(L, "create { emitter ->\n    …S, TimeUnit.MILLISECONDS)");
        return C32343x.m95456i1(L);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m88988k(C29096g gVar, List list, C40763y yVar) {
        C41536l.m120489i(gVar, "this$0");
        C41536l.m120489i(list, "$requests");
        C41536l.m120489i(yVar, "emitter");
        Task a = gVar.f74109a.mo21124a();
        a.mo24864i(new C29094e(new C29097a(list, yVar, gVar)));
        a.mo24861f(new C29095f(yVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m88989l(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final TokenInfo m88990m(List list, C20031a aVar, C20036f fVar, String str) {
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
            if (tokenInfo.mo15183x() == this.f74110b.mo64942e(aVar).mo65246b() && tokenInfo.mo15178R() == this.f74110b.mo64944g(fVar).mo65255b() && C41536l.m120484d(tokenInfo.mo15180v(), str)) {
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
        return (TokenInfo) obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final C24761a m88991n(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C24761a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final C24761a m88992o(Throwable th) {
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
    /* renamed from: p */
    public static final C40735b0 m88993p(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo47614a(List list) {
        C41536l.m120489i(list, "requests");
        C40762x r = this.f74111c.invoke().mo95062A(new C29090a(C29098b.f74115d)).mo95065D(new C29091b()).mo95087r(new C29092c(new C29099c(this, list)));
        C41536l.m120488h(r, "override operator fun in…)\n            }\n        }");
        return r;
    }
}
