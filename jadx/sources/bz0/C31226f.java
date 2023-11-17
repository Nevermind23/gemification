package bz0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import dz0.C31630c;
import ez0.C31896b;
import g91.C32303f;
import g91.C32343x;
import gz0.C36113m;
import gz0.C36114n;
import gz0.C36116o;
import gz0.C36124w;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import iy0.C36649x1;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;
import p341ge.bog.mobilebank.products.data.model.cardinsurance.RegisterCardInsuranceParams;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;
import yd0.C30003b;
import z31.C40144b;
import z31.C40146d;

/* renamed from: bz0.f */
public final class C31226f extends C31221a implements C41185v.C41186a {

    /* renamed from: O */
    public static final C31227a f77593O = new C31227a((DefaultConstructorMarker) null);

    /* renamed from: K */
    public C36113m f77594K;

    /* renamed from: L */
    private C36649x1 f77595L;

    /* renamed from: M */
    private final C41217g f77596M = C41219i.m119470b(new C31228b(this));

    /* renamed from: N */
    private final C41217g f77597N;

    /* renamed from: bz0.f$a */
    public static final class C31227a {
        private C31227a() {
        }

        public /* synthetic */ C31227a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C31226f m92832b(C31227a aVar, Long l, List list, DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel, int i, Object obj) {
            if ((i & 2) != 0) {
                list = C41341q.m119907j();
            }
            if ((i & 4) != 0) {
                debitCardInsuranceTypeUiModel = null;
            }
            return aVar.mo71480a(l, list, debitCardInsuranceTypeUiModel);
        }

        /* renamed from: a */
        public final C31226f mo71480a(Long l, List list, DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel) {
            C41536l.m120489i(list, "insuranceList");
            C31226f fVar = new C31226f();
            fVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_CARD_ID", l), C41233s.m119492a("ARG_INSURANCE_LIST", list), C41233s.m119492a("ARG_SELECTED_INSURANCE_TYPE", debitCardInsuranceTypeUiModel)));
            return fVar;
        }
    }

    /* renamed from: bz0.f$b */
    static final class C31228b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31226f f77598d;

        /* renamed from: bz0.f$b$a */
        /* synthetic */ class C31229a extends C41535k implements C43075l {
            C31229a(Object obj) {
                super(1, obj, C36114n.class, "selectInsurance", "selectInsurance(Lge/bog/mobilebank/shared/presentation/model/insurance/InsuranceDetailsUiModel;)V", 0);
            }

            /* renamed from: b */
            public final void mo71482b(C40144b bVar) {
                C41536l.m120489i(bVar, "p0");
                ((C36114n) this.receiver).mo88872Jq(bVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo71482b((C40144b) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31228b(C31226f fVar) {
            super(0);
            this.f77598d = fVar;
        }

        /* renamed from: b */
        public final C31630c invoke() {
            return new C31630c(new C31229a(this.f77598d.m92798C2().mo88881Iw()));
        }
    }

    /* renamed from: bz0.f$c */
    /* synthetic */ class C31230c extends C41535k implements C43075l {
        C31230c(Object obj) {
            super(1, obj, C31226f.class, "onResourcesResult", "onResourcesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo71483b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C31226f) this.receiver).m92800E2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71483b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bz0.f$d */
    static final class C31231d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31226f f77599d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31231d(C31226f fVar) {
            super(1);
            this.f77599d = fVar;
        }

        /* renamed from: a */
        public final void mo71484a(List list) {
            this.f77599d.m92826z2().mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71484a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bz0.f$e */
    static final class C31232e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31226f f77600d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31232e(C31226f fVar) {
            super(1);
            this.f77600d = fVar;
        }

        /* renamed from: a */
        public final void mo71485a(C31896b bVar) {
            Button button = this.f77600d.m92797B2().f88456e.getButton();
            button.setButtonText(bVar.mo72320b());
            button.setLoading(bVar.mo72321c());
            button.setEnabled(bVar.mo72319a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71485a((C31896b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bz0.f$f */
    static final class C31233f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31226f f77601d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31233f(C31226f fVar) {
            super(1);
            this.f77601d = fVar;
        }

        /* renamed from: a */
        public final void mo71486a(RegisterCardInsuranceParams registerCardInsuranceParams) {
            C41536l.m120489i(registerCardInsuranceParams, "it");
            C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, registerCardInsuranceParams.getOtpServiceId(), this.f77601d.m92798C2().mo88882Ow(registerCardInsuranceParams), (C41143c) null, 4, (Object) null);
            FragmentManager childFragmentManager = this.f77601d.getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            e.mo4576A1(childFragmentManager, (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71486a((RegisterCardInsuranceParams) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bz0.f$g */
    /* synthetic */ class C31234g extends C41535k implements C43075l {
        C31234g(Object obj) {
            super(1, obj, C31226f.class, "onRegistrationResult", "onRegistrationResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo71487b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C31226f) this.receiver).m92799D2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71487b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bz0.f$h */
    /* synthetic */ class C31235h extends C41535k implements C43075l {
        C31235h(Object obj) {
            super(1, obj, C31226f.class, "finishWithResult", "finishWithResult(Lge/bog/mobilebank/shared/presentation/model/insurance/InsuranceDetailsUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo71488b(C40144b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C31226f) this.receiver).m92825y2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71488b((C40144b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bz0.f$i */
    static final class C31236i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31226f f77602d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31236i(C31226f fVar) {
            super(1);
            this.f77602d = fVar;
        }

        /* renamed from: a */
        public final void mo71489a(C30003b bVar) {
            this.f77602d.m92797B2().f88456e.getButton().setLoading(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71489a((C30003b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bz0.f$j */
    static final class C31237j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31226f f77603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31237j(C31226f fVar) {
            super(1);
            this.f77603d = fVar;
        }

        /* renamed from: a */
        public final void mo71490a(C30003b bVar) {
            C41536l.m120489i(bVar, "it");
            this.f77603d.m92797B2().f88456e.getButton().setLoading(false);
            if (bVar.mo70300c()) {
                this.f77603d.m92804J2(bVar);
            } else {
                this.f77603d.m92824x2();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71490a((C30003b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bz0.f$k */
    static final class C31238k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31226f f77604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31238k(C31226f fVar) {
            super(1);
            this.f77604d = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f77604d.m92797B2().f88456e.getButton().setLoading(false);
            this.f77604d.handleError(th);
        }
    }

    /* renamed from: bz0.f$l */
    static final class C31239l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31226f f77605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31239l(C31226f fVar) {
            super(1);
            this.f77605d = fVar;
        }

        /* renamed from: a */
        public final void mo71492a(String str) {
            C31226f.m92801F2(this.f77605d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71492a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bz0.f$m */
    static final class C31240m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31226f f77606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31240m(C31226f fVar) {
            super(1);
            this.f77606d = fVar;
        }

        /* renamed from: a */
        public final void mo71493a(String str) {
            C41536l.m120489i(str, "it");
            C31226f.m92801F2(this.f77606d, false);
            InlineFeedback inlineFeedback = this.f77606d.m92797B2().f88457f;
            C41536l.m120488h(inlineFeedback, "binding.expirationFeedback");
            C32343x.m95483r1(inlineFeedback, !C40439w.m117118v(str), false, 2, (Object) null);
            this.f77606d.m92797B2().f88457f.setTitleText(C32343x.m95388F("card.insurance.actionsheet.info.message.title", str));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo71493a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bz0.f$n */
    static final class C31241n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31226f f77607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31241n(C31226f fVar) {
            super(1);
            this.f77607d = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C31226f.m92801F2(this.f77607d, false);
            this.f77607d.handleError(th);
        }
    }

    /* renamed from: bz0.f$o */
    static final class C31242o implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f77608a;

        C31242o(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f77608a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f77608a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f77608a.invoke(obj);
        }
    }

    /* renamed from: bz0.f$p */
    public static final class C31243p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77609d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31243p(Fragment fragment) {
            super(0);
            this.f77609d = fragment;
        }

        public final Fragment invoke() {
            return this.f77609d;
        }
    }

    /* renamed from: bz0.f$q */
    public static final class C31244q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f77610d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31244q(C43064a aVar) {
            super(0);
            this.f77610d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f77610d.invoke();
        }
    }

    /* renamed from: bz0.f$r */
    public static final class C31245r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f77611d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31245r(C41217g gVar) {
            super(0);
            this.f77611d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f77611d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: bz0.f$s */
    public static final class C31246s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f77612d;

        /* renamed from: e */
        final /* synthetic */ C41217g f77613e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31246s(C43064a aVar, C41217g gVar) {
            super(0);
            this.f77612d = aVar;
            this.f77613e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f77612d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f77613e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: bz0.f$t */
    static final class C31247t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31226f f77614d;

        /* renamed from: bz0.f$t$a */
        static final class C31248a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C31226f f77615d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31248a(C31226f fVar) {
                super(0);
                this.f77615d = fVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final gz0.C36124w invoke() {
                /*
                    r7 = this;
                    bz0.f r0 = r7.f77615d
                    android.os.Bundle r0 = r0.getArguments()
                    r1 = 0
                    if (r0 == 0) goto L_0x001b
                    java.lang.String r2 = "ARG_CARD_ID"
                    r3 = -1
                    long r5 = r0.getLong(r2, r3)
                    int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                    if (r0 != 0) goto L_0x0016
                    goto L_0x001b
                L_0x0016:
                    java.lang.Long r0 = java.lang.Long.valueOf(r5)
                    goto L_0x001c
                L_0x001b:
                    r0 = r1
                L_0x001c:
                    bz0.f r2 = r7.f77615d
                    android.os.Bundle r2 = r2.getArguments()
                    if (r2 == 0) goto L_0x002b
                    java.lang.String r3 = "ARG_INSURANCE_LIST"
                    java.util.ArrayList r2 = r2.getParcelableArrayList(r3)
                    goto L_0x002c
                L_0x002b:
                    r2 = r1
                L_0x002c:
                    if (r2 != 0) goto L_0x0032
                    java.util.List r2 = ie1.C41341q.m119907j()
                L_0x0032:
                    bz0.f r3 = r7.f77615d
                    android.os.Bundle r3 = r3.getArguments()
                    if (r3 == 0) goto L_0x0042
                    java.lang.String r1 = "ARG_SELECTED_INSURANCE_TYPE"
                    android.os.Parcelable r1 = r3.getParcelable(r1)
                    ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel r1 = (p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel) r1
                L_0x0042:
                    ez0.a r3 = new ez0.a
                    r3.<init>(r0, r2, r1)
                    bz0.f r0 = r7.f77615d
                    gz0.m r0 = r0.mo71479A2()
                    gz0.w r0 = r0.mo32777a(r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: bz0.C31226f.C31247t.C31248a.invoke():gz0.w");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31247t(C31226f fVar) {
            super(0);
            this.f77614d = fVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C31248a(this.f77614d));
        }
    }

    public C31226f() {
        C31247t tVar = new C31247t(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C31244q(new C31243p(this)));
        this.f77597N = C1514j0.m5374c(this, C41520a0.m120436b(C36124w.class), new C31245r(a), new C31246s((C43064a) null, a), tVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public final C36649x1 m92797B2() {
        C36649x1 x1Var = this.f77595L;
        C41536l.m120486f(x1Var);
        return x1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public final C36124w m92798C2() {
        return (C36124w) this.f77597N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public final void m92799D2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C31236i(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C31237j(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C31238k(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public final void m92800E2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C31239l(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C31240m(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C31241n(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m92801F2(C31226f fVar, boolean z) {
        InlineFeedback inlineFeedback = fVar.m92797B2().f88457f;
        C41536l.m120488h(inlineFeedback, "binding.expirationFeedback");
        C32343x.m95455i0(inlineFeedback);
        LoadingView loadingView = fVar.m92797B2().f88460i;
        C41536l.m120488h(loadingView, "binding.insuranceTypesLoader");
        C32343x.m95483r1(loadingView, z, false, 2, (Object) null);
        RecyclerView recyclerView = fVar.m92797B2().f88461j;
        C41536l.m120488h(recyclerView, "binding.insuranceTypesRecycler");
        C32343x.m95483r1(recyclerView, !z, false, 2, (Object) null);
    }

    /* renamed from: H2 */
    private final void m92802H2() {
        boolean z;
        m92797B2().f88461j.setAdapter(m92826z2());
        m92797B2().f88461j.setItemAnimator((RecyclerView.C1742m) null);
        m92797B2().f88456e.getCheckbox().mo35145g(C32343x.m95388F("card.applications.insurance.checkbox.agree.to", new Object[0]), C32343x.m95388F("card.applications.insurance.checkbox.terms.and.conditions", new Object[0]));
        m92797B2().f88456e.getCheckbox().setTextClickListener(new C31222b(this));
        CheckboxView checkbox = m92797B2().f88456e.getCheckbox();
        ViewGroup.LayoutParams layoutParams = checkbox.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) layoutParams;
            bVar.f2517a0 = true;
            checkbox.setLayoutParams(bVar);
            m92797B2().f88457f.setCaptionText(C32343x.m95388F("card.insurance.actionsheet.info.message", new Object[0]));
            CheckboxView checkbox2 = m92797B2().f88456e.getCheckbox();
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getLong("ARG_CARD_ID", -1) != -1) {
                z = false;
            } else {
                z = true;
            }
            C32343x.m95483r1(checkbox2, !z, false, 2, (Object) null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m92803I2(C31226f fVar) {
        C41536l.m120489i(fVar, "this$0");
        C32303f.m95184D(C32343x.m95388F("link.terms.cards.security.pdf", new Object[0]), fVar.requireContext());
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final void m92804J2(C30003b bVar) {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38125h.m112238c(requireContext).mo91620o(bVar).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: r2 */
    private final void m92818r2() {
        m92797B2().f88456e.getButton().setOnClickListener(new C31223c(this));
        m92797B2().f88456e.getCheckbox().setOnCheckedStateChangeListener(new C31224d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m92819s2(C31226f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        C36114n.C36115a.m107454a(fVar.m92798C2().mo88881Iw(), (String) null, (String) null, (String) null, 7, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m92820t2(C31226f fVar, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        fVar.m92798C2().mo88881Iw().mo88874t1(z);
    }

    /* renamed from: u2 */
    private final void m92821u2() {
        getChildFragmentManager().mo4367F1("REQUEST_KEY_END_YEAR_CAMPAIGN_POPUP", getViewLifecycleOwner(), new C31225e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m92822v2(C31226f fVar, String str, Bundle bundle) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_END_YEAR_CAMPAIGN_POPUP_CLOSED", true)) {
            fVar.m92824x2();
        }
    }

    /* renamed from: w2 */
    private final void m92823w2() {
        C36116o Pw = m92798C2().mo88883Pw();
        Pw.mo88880rt().mo4819k(getViewLifecycleOwner(), new C31242o(new C31230c(this)));
        Pw.mo88878Oo().mo4819k(getViewLifecycleOwner(), new C31242o(new C31231d(this)));
        Pw.mo88879T2().mo4819k(getViewLifecycleOwner(), new C31242o(new C31232e(this)));
        LiveData K8 = Pw.mo88877K8();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(K8, viewLifecycleOwner, new C31233f(this));
        Pw.mo88875Eb().mo4819k(getViewLifecycleOwner(), new C31242o(new C31234g(this)));
        LiveData Ee = Pw.mo88876Ee();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(Ee, viewLifecycleOwner2, new C31235h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public final void m92824x2() {
        C1533o.m5445b(this, "REQUEST_KEY_INSURANCE_CHANGED", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_INSURANCE_CHANGED", Boolean.TRUE)));
        mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public final void m92825y2(C40144b bVar) {
        C1533o.m5445b(this, "REQUEST_KEY_INSURANCE", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_INSURANCE_TYPE", bVar.mo94074a()), C41233s.m119492a("RESULT_KEY_SELECTED_NO_INSURANCE", Boolean.valueOf(bVar instanceof C40146d))));
        mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public final C31630c m92826z2() {
        return (C31630c) this.f77596M.getValue();
    }

    /* renamed from: A2 */
    public final C36113m mo71479A2() {
        C36113m mVar = this.f77594K;
        if (mVar != null) {
            return mVar;
        }
        C41536l.m120506z("assistedFactory");
        return null;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m92798C2().mo88881Iw().mo88873o6(str, str2, str3);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v g0 = C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo4577k1();
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v g0 = C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo4577k1();
        }
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f77595L = C36649x1.m108732d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77595L = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        mo26370a2(C32343x.m95388F("card.insurance.actionsheet.header", new Object[0]));
        super.onViewCreated(view, bundle);
        m92802H2();
        m92823w2();
        m92818r2();
        m92821u2();
    }
}
