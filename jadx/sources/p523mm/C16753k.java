package p523mm;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p509lm.C16586a;
import p537nm.C17102s;
import p537nm.C17103t;
import p579qm.C17537a;
import ue1.C43075l;

/* renamed from: mm.k */
public final class C16753k {

    /* renamed from: a */
    private final C16586a f46997a;

    /* renamed from: mm.k$a */
    static final class C16754a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C16754a f46998d = new C16754a();

        C16754a() {
            super(1);
        }

        /* renamed from: a */
        public final C17103t invoke(C17102s sVar) {
            C41536l.m120489i(sVar, "it");
            return new C17103t(sVar);
        }
    }

    public C16753k(C16586a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f46997a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C17103t m59184d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17103t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C17103t m59185e(Throwable th) {
        C41536l.m120489i(th, "it");
        return new C17103t((C17102s) null);
    }

    /* renamed from: c */
    public final C40762x mo43877c(C17537a aVar) {
        C41536l.m120489i(aVar, "params");
        C40762x D = this.f46997a.mo42423zl(aVar.mo45056d()).mo95062A(new C16746i(C16754a.f46998d)).mo95065D(new C16751j());
        C41536l.m120488h(D, "repository.getCardFees(p…bitCardFeeWrapper(null) }");
        return D;
    }
}
