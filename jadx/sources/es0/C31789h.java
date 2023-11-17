package es0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import ed0.C20217b;
import ed1.C40749p;
import ed1.C40754t;
import es0.C31794i;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import k70.C25680d;
import k70.C25683g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalCancelData;
import sr0.C38525i;
import ue1.C43075l;

/* renamed from: es0.h */
public final class C31789h extends C21481a {

    /* renamed from: l */
    public static final C31791b f78407l = new C31791b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C20217b f78408d;

    /* renamed from: e */
    private final C38525i f78409e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C25683g f78410f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C25680d f78411g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final InstallmentReversalCancelData f78412h;

    /* renamed from: i */
    private final C1644x f78413i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1644x f78414j = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f78415k = new C1644x();

    /* renamed from: es0.h$a */
    static final class C31790a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31789h f78416d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31790a(C31789h hVar) {
            super(1);
            this.f78416d = hVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            return C31270e.m92880i(this.f78416d.f78408d.mo48650b("INSTALLMENT_REVERSAL_REASONS"), num.intValue());
        }
    }

    /* renamed from: es0.h$b */
    public static final class C31791b {
        private C31791b() {
        }

        public /* synthetic */ C31791b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: es0.h$c */
    public interface C31792c {
        /* renamed from: a */
        C31789h mo32823a(InstallmentReversalCancelData installmentReversalCancelData);
    }

    /* renamed from: es0.h$d */
    static final class C31793d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31789h f78417d;

        /* renamed from: e */
        final /* synthetic */ String f78418e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31793d(C31789h hVar, String str) {
            super(1);
            this.f78417d = hVar;
            this.f78418e = str;
        }

        /* renamed from: a */
        public final void mo72230a(C31128a aVar) {
            if (aVar instanceof C31128a.C31129a) {
                this.f78417d.f78415k.mo4823o(Boolean.FALSE);
                C37224b.m109965d(this.f78417d.f78414j, new C31794i.C31795a(((C31128a.C31129a) aVar).mo71342c()));
            } else if (aVar instanceof C31128a.C31130b) {
                this.f78417d.f78415k.mo4823o(Boolean.TRUE);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f78417d.f78415k.mo4823o(Boolean.FALSE);
                this.f78417d.f78410f.invoke();
                this.f78417d.f78411g.invoke();
                C37224b.m109965d(this.f78417d.f78414j, new C31794i.C31796b(this.f78418e, this.f78417d.f78412h.mo74310b()));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72230a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31789h(C20217b bVar, C38525i iVar, C25683g gVar, C25680d dVar, InstallmentReversalCancelData installmentReversalCancelData) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getLookUpDataUseCase");
        C41536l.m120489i(iVar, "reverseInstallmentUseCase");
        C41536l.m120489i(gVar, "refreshLoansWithDetails");
        C41536l.m120489i(dVar, "refreshBnplList");
        C41536l.m120489i(installmentReversalCancelData, "data");
        this.f78408d = bVar;
        this.f78409e = iVar;
        this.f78410f = gVar;
        this.f78411g = dVar;
        this.f78412h = installmentReversalCancelData;
        C1644x xVar = new C1644x();
        this.f78413i = xVar;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C31787f(new C31790a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…equestCode)\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m94008fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m94015qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: c */
    public void mo72224c() {
        onRefresh(2);
    }

    /* renamed from: mw */
    public LiveData mo72225mw() {
        return this.f78415k;
    }

    /* renamed from: nw */
    public LiveData mo72226nw() {
        return this.f78413i;
    }

    /* renamed from: ow */
    public LiveData mo72227ow() {
        return this.f78414j;
    }

    /* renamed from: pw */
    public void mo72228pw(int i, String str, String str2) {
        C41536l.m120489i(str, "reason");
        C41536l.m120489i(str2, "reasonText");
        if (i == -1) {
            C37224b.m109965d(this.f78414j, C31794i.C31797c.f78422a);
            return;
        }
        C41205b F0 = C31270e.m92878g(C32343x.m95459j1(this.f78409e.mo92092a(this.f78412h.mo74311d(), this.f78412h.mo74309a(), str)), -1).mo94981F0(new C31788g(new C31793d(this, str2)));
        C41536l.m120488h(F0, "override fun reverseLoan…)\n            }\n        }");
        bindToLifecycle(F0);
    }
}
