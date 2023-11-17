package p802jv;

import ed1.C40735b0;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p812kv.C25779b;
import p822lv.C26093a;
import ue1.C43075l;

/* renamed from: jv.d */
public final class C25496d {

    /* renamed from: a */
    private final C26093a f65163a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C25508l f65164b;

    /* renamed from: jv.d$a */
    static final class C25497a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25496d f65165d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25497a(C25496d dVar) {
            super(1);
            this.f65165d = dVar;
        }

        /* renamed from: a */
        public final C40735b0 invoke(C25779b bVar) {
            C41536l.m120489i(bVar, "it");
            return this.f65165d.f65164b.mo64058a().mo94898g(C40762x.m118162z(bVar));
        }
    }

    public C25496d(C26093a aVar, C25508l lVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(lVar, "refreshMoneyRequests");
        this.f65163a = aVar;
        this.f65164b = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40735b0 m80673d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40762x mo64048c(long j, String str) {
        C41536l.m120489i(str, "participantId");
        C40762x r = this.f65163a.mo65007C1(j, str).mo95087r(new C25495c(new C25497a(this)));
        C41536l.m120488h(r, "operator fun invoke(requ…(it))\n            }\n    }");
        return r;
    }
}
