package p341ge.bog.mobilebank.products.presentation.details.pension;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ty0.C38874k0;
import ty0.C38893t0;
import ue1.C43075l;
import uz0.C39186h;
import uz0.C39187i;
import uz0.C39188j;
import uz0.C39189k;

/* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsViewModel$ViewModel */
public final class PensionDetailsViewModel$ViewModel extends C21481a implements C39186h, C39187i {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C38874k0 f83133d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C38893t0 f83134e;

    /* renamed from: f */
    private final C39186h f83135f = this;

    /* renamed from: g */
    private final C39187i f83136g = this;

    /* renamed from: h */
    private final C1644x f83137h = new C1644x();

    /* renamed from: i */
    private final C1644x f83138i = new C1644x();

    /* renamed from: j */
    private final C40767b f83139j;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsViewModel$ViewModel$a */
    static final class C34258a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PensionDetailsViewModel$ViewModel f83140d;

        /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsViewModel$ViewModel$a$a */
        static final class C34259a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C34259a f83141d = new C34259a();

            C34259a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34258a(PensionDetailsViewModel$ViewModel pensionDetailsViewModel$ViewModel) {
            super(1);
            this.f83140d = pensionDetailsViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m100762c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t mo82638b(boolean z) {
            return this.f83140d.f83134e.mo92590a(z).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C34263b(C34259a.f83141d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo82638b(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsViewModel$ViewModel$b */
    static final class C34260b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PensionDetailsViewModel$ViewModel f83142d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34260b(PensionDetailsViewModel$ViewModel pensionDetailsViewModel$ViewModel) {
            super(1);
            this.f83142d = pensionDetailsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            return C31270e.m92880i(this.f83142d.f83133d.mo92573a(), num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PensionDetailsViewModel$ViewModel(C38874k0 k0Var, C38893t0 t0Var) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(k0Var, "getPensionAmount");
        C41536l.m120489i(t0Var, "sendPensionAccessUseCase");
        this.f83133d = k0Var;
        this.f83134e = t0Var;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Boolean>()");
        this.f83139j = h1;
        m100755lw();
        m100753jw();
    }

    /* renamed from: jw */
    private final void m100753jw() {
        C40749p Q = this.f83139j.mo94998Q(new C39189k(new C34258a(this)));
        C41536l.m120488h(Q, "private fun observePensi…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(Q), this.f83138i));
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final C40754t m100754kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: lw */
    private final void m100755lw() {
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C39188j(new C34260b(this)));
        C41536l.m120488h(L0, "private fun subscribePen…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), this.f83137h));
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C40754t m100756mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Fa */
    public void mo82633Fa() {
        this.f83139j.onNext(Boolean.FALSE);
    }

    /* renamed from: ff */
    public LiveData mo82634ff() {
        return this.f83138i;
    }

    public LiveData getPensionAmount() {
        return this.f83137h;
    }

    /* renamed from: hw */
    public final C39186h mo82636hw() {
        return this.f83135f;
    }

    /* renamed from: iw */
    public final C39187i mo82637iw() {
        return this.f83136g;
    }
}
