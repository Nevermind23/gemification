package oz0;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import hy0.C36274h;
import iy0.C36593f;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import oz0.C37862j;
import p163m0.C7047a;
import p341ge.bog.mobilebank.products.domain.model.BillInfo;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: oz0.d */
public final class C37846d extends C37867l {

    /* renamed from: N */
    public static final C37847a f90903N = new C37847a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C36593f f90904K;

    /* renamed from: L */
    public C37862j.C37863a f90905L;

    /* renamed from: M */
    private final C41217g f90906M;

    /* renamed from: oz0.d$a */
    public static final class C37847a {
        private C37847a() {
        }

        public /* synthetic */ C37847a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37846d mo91201a(BillInfo billInfo) {
            C41536l.m120489i(billInfo, "billInfo");
            C37846d dVar = new C37846d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_BILL_INFO", billInfo)));
            return dVar;
        }
    }

    /* renamed from: oz0.d$b */
    /* synthetic */ class C37848b extends C41535k implements C43075l {
        C37848b(Object obj) {
            super(1, obj, C37846d.class, "handleViewState", "handleViewState(Lge/bog/mobilebank/products/presentation/details/fill/CreditCardFillViewState;)V", 0);
        }

        /* renamed from: b */
        public final void mo91202b(C37866k kVar) {
            C41536l.m120489i(kVar, "p0");
            ((C37846d) this.receiver).m111314m2(kVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91202b((C37866k) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: oz0.d$c */
    /* synthetic */ class C37849c extends C41535k implements C43075l {
        C37849c(Object obj) {
            super(1, obj, C37846d.class, "startPayment", "startPayment(Lkotlin/Pair;)V", 0);
        }

        /* renamed from: b */
        public final void mo91203b(C41224m mVar) {
            C41536l.m120489i(mVar, "p0");
            ((C37846d) this.receiver).m111319r2(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91203b((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: oz0.d$d */
    static final class C37850d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f90907a;

        C37850d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f90907a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f90907a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f90907a.invoke(obj);
        }
    }

    /* renamed from: oz0.d$e */
    public static final class C37851e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f90908d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37851e(Fragment fragment) {
            super(0);
            this.f90908d = fragment;
        }

        public final Fragment invoke() {
            return this.f90908d;
        }
    }

    /* renamed from: oz0.d$f */
    public static final class C37852f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f90909d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37852f(C43064a aVar) {
            super(0);
            this.f90909d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f90909d.invoke();
        }
    }

    /* renamed from: oz0.d$g */
    public static final class C37853g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f90910d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37853g(C41217g gVar) {
            super(0);
            this.f90910d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f90910d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: oz0.d$h */
    public static final class C37854h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f90911d;

        /* renamed from: e */
        final /* synthetic */ C41217g f90912e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37854h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f90911d = aVar;
            this.f90912e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f90911d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f90912e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: oz0.d$i */
    static final class C37855i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C37846d f90913d;

        /* renamed from: oz0.d$i$a */
        static final class C37856a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C37846d f90914d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37856a(C37846d dVar) {
                super(0);
                this.f90914d = dVar;
            }

            /* renamed from: b */
            public final C37862j invoke() {
                C37862j.C37863a l2 = this.f90914d.mo91200l2();
                Parcelable parcelable = this.f90914d.requireArguments().getParcelable("ARG_BILL_INFO");
                C41536l.m120486f(parcelable);
                return l2.mo32794a((BillInfo) parcelable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37855i(C37846d dVar) {
            super(0);
            this.f90913d = dVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C37856a(this.f90913d));
        }
    }

    public C37846d() {
        C37855i iVar = new C37855i(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C37852f(new C37851e(this)));
        this.f90906M = C1514j0.m5374c(this, C41520a0.m120436b(C37862j.class), new C37853g(a), new C37854h((C43064a) null, a), iVar);
    }

    /* renamed from: j2 */
    private final C36593f m111312j2() {
        C36593f fVar = this.f90904K;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* renamed from: k2 */
    private final C37862j m111313k2() {
        return (C37862j) this.f90906M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final void m111314m2(C37866k kVar) {
        m111312j2().f88190l.setEnabled(kVar.mo91214b());
        m111312j2().f88187i.setEnabled(kVar.mo91213a());
    }

    /* renamed from: n2 */
    private final void m111315n2() {
        m111312j2().f88191m.setText(C32343x.m95388F("credit.card.top.up.pay.minimal.obligatory", new Object[0]));
        m111312j2().f88189k.setText(C32343x.m95388F("credit.card.top.up.pay.full.used.amount", new Object[0]));
        m111312j2().f88188j.setText(C32343x.m95388F("credit.card.top.up.pay.full.amount.by.bill", new Object[0]));
        m111312j2().f88190l.setOnClickListener(new C37843a(this));
        m111312j2().f88187i.setOnClickListener(new C37844b(this));
        m111312j2().f88186h.setOnClickListener(new C37845c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m111316o2(C37846d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m111313k2().mo91210ew().mo91207gc(C37859g.MINIMUM);
    }

    private final void observeData() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37861i fw = m111313k2().mo91211fw();
        fw.mo91208Ap().mo4819k(viewLifecycleOwner, new C37850d(new C37848b(this)));
        C37224b.m109963b(fw.mo91209Ho(), viewLifecycleOwner, new C37849c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m111317p2(C37846d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m111313k2().mo91210ew().mo91207gc(C37859g.FULL_PAYMENT_DUE);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m111318q2(C37846d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m111313k2().mo91210ew().mo91207gc(C37859g.FULL_PAYMENT);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m111319r2(C41224m mVar) {
        TransferForm.startWith((Fragment) this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN).setDestinationAcctKey(((Number) mVar.mo95675a()).longValue()).setAmount((String) mVar.mo95676b()).start();
        mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f90904K = C36593f.m108499d(layoutInflater, viewGroup, true);
        mo26370a2(getString(C36274h.product_details_label_operation_top_up));
        observeData();
        m111315n2();
    }

    /* renamed from: l2 */
    public final C37862j.C37863a mo91200l2() {
        C37862j.C37863a aVar = this.f90905L;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f90904K = null;
    }
}
