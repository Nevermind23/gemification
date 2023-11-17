package ex0;

import cx0.C31456c;
import dx0.C31614b;
import dx0.C31615c;
import ed1.C40749p;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: ex0.d */
public final class C31874d implements C31876e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C31614b f78590a;

    /* renamed from: b */
    private final C40749p f78591b;

    /* renamed from: ex0.d$a */
    static final class C31875a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31874d f78592d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31875a(C31874d dVar) {
            super(1);
            this.f78592d = dVar;
        }

        /* renamed from: a */
        public final C31456c invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f78592d.f78590a.mo72027d(list);
        }
    }

    public C31874d(C31614b bVar, C31615c cVar) {
        C41536l.m120489i(bVar, "buildPaymentsTree");
        C41536l.m120489i(cVar, "getPaymentConfiguration");
        this.f78590a = bVar;
        C40749p f1 = cVar.mo72028a().mo95026k0(new C31873c(new C31875a(this))).mo95042x0(1).mo102091f1();
        C41536l.m120488h(f1, "getPaymentConfiguration(…1)\n        .autoConnect()");
        this.f78591b = f1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C31456c m94204c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31456c) lVar.invoke(obj);
    }

    public C40749p invoke() {
        return this.f78591b;
    }
}
