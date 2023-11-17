package p535nk;

import ed1.C40735b0;
import ed1.C40762x;
import he1.C41224m;
import he1.C41233s;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p563pk.C17378h;
import ue1.C43075l;

/* renamed from: nk.j */
public final class C17028j {

    /* renamed from: a */
    private final C17018a f47532a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C17019b f47533b;

    /* renamed from: nk.j$a */
    static final class C17029a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17028j f47534d;

        /* renamed from: nk.j$a$a */
        static final class C17030a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C17378h f47535d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C17030a(C17378h hVar) {
                super(1);
                this.f47535d = hVar;
            }

            /* renamed from: a */
            public final C41224m invoke(List list) {
                C41536l.m120489i(list, "it");
                return C41233s.m119492a(this.f47535d, list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17029a(C17028j jVar) {
            super(1);
            this.f47534d = jVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m59870c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40735b0 invoke(C17378h hVar) {
            C41536l.m120489i(hVar, "limitType");
            return this.f47534d.f47533b.mo44215a((String) C41358y.m120007W(hVar.mo44862a())).mo95062A(new C17027i(new C17030a(hVar)));
        }
    }

    public C17028j(C17018a aVar, C17019b bVar) {
        C41536l.m120489i(aVar, "getTypes");
        C41536l.m120489i(bVar, "getProviders");
        this.f47532a = aVar;
        this.f47533b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40735b0 m59867d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40762x mo44221c() {
        C40762x r = this.f47532a.mo44214a().mo95087r(new C17026h(new C17029a(this)));
        C41536l.m120488h(r, "operator fun invoke(): S…e to it }\n        }\n    }");
        return r;
    }
}
