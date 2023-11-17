package ex0;

import cx0.C31456c;
import dx0.C31613a;
import dx0.C31615c;
import ed1.C40749p;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: ex0.b */
public final class C31871b implements C31876e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C31613a f78586a;

    /* renamed from: b */
    private final C40749p f78587b;

    /* renamed from: ex0.b$a */
    static final class C31872a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31871b f78588d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31872a(C31871b bVar) {
            super(1);
            this.f78588d = bVar;
        }

        /* renamed from: a */
        public final C31456c invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f78588d.f78586a.mo72026d(list);
        }
    }

    public C31871b(C31613a aVar, C31615c cVar) {
        C41536l.m120489i(aVar, "buildPaymentsTree");
        C41536l.m120489i(cVar, "getPaymentConfiguration");
        this.f78586a = aVar;
        C40749p f1 = cVar.mo72028a().mo95026k0(new C31870a(new C31872a(this))).mo95042x0(1).mo102091f1();
        C41536l.m120488h(f1, "getPaymentConfiguration(…1)\n        .autoConnect()");
        this.f78587b = f1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C31456c m94200c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31456c) lVar.invoke(obj);
    }

    public C40749p invoke() {
        return this.f78587b;
    }
}
