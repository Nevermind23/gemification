package p341ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import ev0.C31815a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lv0.C37164g;
import lv0.C37165h;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.mobilebank.openbanking.presentation.BankUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.OpenBankAuthorizationActivity;
import p341ge.bog.mobilebank.openbanking.presentation.products.BankWithProductsUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.products.TermsAndConditionsActivity;
import p420fh.C12902d;
import p420fh.C12910e;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.e */
public final class C33374e extends C37164g {

    /* renamed from: J */
    public static final C33375a f81532J = new C33375a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C31815a f81533G;

    /* renamed from: H */
    private final C41217g f81534H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C0173b f81535I;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.e$a */
    public static final class C33375a {
        private C33375a() {
        }

        public /* synthetic */ C33375a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C33374e m98094b(C33375a aVar, BankUiModel bankUiModel, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                bankUiModel = null;
            }
            return aVar.mo79197a(bankUiModel, list);
        }

        /* renamed from: a */
        public final C33374e mo79197a(BankUiModel bankUiModel, List list) {
            C41536l.m120489i(list, "banksList");
            C33374e eVar = new C33374e();
            Bundle bundle = new Bundle();
            bundle.putParcelable("SELECTED_BANK", bankUiModel);
            bundle.putParcelableArray("BANKS_LIST", (Parcelable[]) list.toArray(new BankWithProductsUiModel[0]));
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.e$b */
    static final class C33376b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33374e f81536d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33376b(C33374e eVar) {
            super(1);
            this.f81536d = eVar;
        }

        /* renamed from: a */
        public final void mo79198a(BankUiModel bankUiModel) {
            if (!bankUiModel.mo79095e()) {
                C1505h activity = this.f81536d.getActivity();
                if (activity != null) {
                    C12910e.m48787e(activity, C32343x.m95388F("open.bank.bank.is.inactive", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
                }
                this.f81536d.mo4577k1();
                return;
            }
            this.f81536d.f81535I.mo404a(new Intent(this.f81536d.getContext(), TermsAndConditionsActivity.class));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79198a((BankUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.e$c */
    static final class C33377c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33374e f81537d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33377c(C33374e eVar) {
            super(1);
            this.f81537d = eVar;
        }

        /* renamed from: a */
        public final void mo79199a(BankUiModel bankUiModel) {
            OpenBankAuthorizationActivity.C33342a aVar = OpenBankAuthorizationActivity.f81475I;
            Context requireContext = this.f81537d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C41536l.m120488h(bankUiModel, "it");
            aVar.mo79165a(requireContext, bankUiModel);
            this.f81537d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79199a((BankUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.e$d */
    static final class C33378d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33374e f81538d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33378d(C33374e eVar) {
            super(1);
            this.f81538d = eVar;
        }

        /* renamed from: a */
        public final void mo79200a(BankUiModel bankUiModel) {
            C33374e eVar = this.f81538d;
            C41536l.m120488h(bankUiModel, "it");
            eVar.m98091k2(bankUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79200a((BankUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.e$e */
    static final class C33379e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81539a;

        C33379e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81539a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81539a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81539a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.e$f */
    public static final class C33380f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81540d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33380f(Fragment fragment) {
            super(0);
            this.f81540d = fragment;
        }

        public final Fragment invoke() {
            return this.f81540d;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.e$g */
    public static final class C33381g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81541d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33381g(C43064a aVar) {
            super(0);
            this.f81541d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f81541d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.e$h */
    public static final class C33382h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f81542d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33382h(C41217g gVar) {
            super(0);
            this.f81542d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f81542d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.e$i */
    public static final class C33383i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81543d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81544e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33383i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f81543d = aVar;
            this.f81544e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81543d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f81544e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.e$j */
    public static final class C33384j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81545d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81546e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33384j(Fragment fragment, C41217g gVar) {
            super(0);
            this.f81545d = fragment;
            this.f81546e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f81546e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f81545d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C33374e() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C33381g(new C33380f(this)));
        this.f81534H = C1514j0.m5374c(this, C41520a0.m120436b(SelectBankViewModel$ViewModel.class), new C33382h(a), new C33383i((C43064a) null, a), new C33384j(this, a));
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C37165h(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…}\n            }\n        }");
        this.f81535I = registerForActivityResult;
    }

    /* renamed from: g2 */
    private final C31815a m98087g2() {
        C31815a aVar = this.f81533G;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: h2 */
    private final SelectBankViewModel$ViewModel m98088h2() {
        return (SelectBankViewModel$ViewModel) this.f81534H.getValue();
    }

    /* renamed from: i2 */
    private final void m98089i2() {
        mo26370a2(C32343x.m95388F("open.bank.select.bank.title", new Object[0]));
        m98090j2(new C33353a());
    }

    /* renamed from: j2 */
    private final void m98090j2(Fragment fragment) {
        getChildFragmentManager().mo4428p().mo4639r(m98087g2().f78445e.getId(), fragment).mo4515i();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* renamed from: k2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m98091k2(p341ge.bog.mobilebank.openbanking.presentation.BankUiModel r7) {
        /*
            r6 = this;
            android.os.Bundle r0 = r6.getArguments()
            r1 = 0
            if (r0 == 0) goto L_0x002f
            java.lang.String r2 = "BANKS_LIST"
            android.os.Parcelable[] r0 = r0.getParcelableArray(r2)
            if (r0 == 0) goto L_0x002f
            int r2 = r0.length
            r3 = r1
        L_0x0011:
            if (r3 >= r2) goto L_0x002f
            r4 = r0[r3]
            java.lang.String r5 = "null cannot be cast to non-null type ge.bog.mobilebank.openbanking.presentation.products.BankWithProductsUiModel"
            kotlin.jvm.internal.C41536l.m120487g(r4, r5)
            ge.bog.mobilebank.openbanking.presentation.products.BankWithProductsUiModel r4 = (p341ge.bog.mobilebank.openbanking.presentation.products.BankWithProductsUiModel) r4
            java.lang.String r4 = r4.mo79287a()
            java.lang.String r5 = r7.mo79091a()
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x002c
            r7 = 1
            goto L_0x0030
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x0011
        L_0x002f:
            r7 = r1
        L_0x0030:
            if (r7 == 0) goto L_0x003b
            java.lang.String r0 = "open.bank.consider.existing.title"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = g91.C32343x.m95388F(r0, r1)
            goto L_0x0043
        L_0x003b:
            java.lang.String r0 = "open.bank.consider.empty.title"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = g91.C32343x.m95388F(r0, r1)
        L_0x0043:
            r6.mo26370a2(r0)
            ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.b$a r0 = p341ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.C33362b.f81512j
            ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.b r7 = r0.mo79192a(r7)
            r6.m98090j2(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.C33374e.m98091k2(ge.bog.mobilebank.openbanking.presentation.BankUiModel):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m98092l2(C33374e eVar, ActivityResult activityResult) {
        BankUiModel bankUiModel;
        C41536l.m120489i(eVar, "this$0");
        if (activityResult.mo371b() == -1 && (bankUiModel = (BankUiModel) eVar.m98088h2().mo79182lw().mo79177h9().mo4814f()) != null) {
            eVar.m98091k2(bankUiModel);
        }
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f81533G = C31815a.m94045d(layoutInflater, viewGroup, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        BankUiModel bankUiModel;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        Bundle arguments = getArguments();
        if (arguments != null) {
            bankUiModel = (BankUiModel) arguments.getParcelable("SELECTED_BANK");
        } else {
            bankUiModel = null;
        }
        if (bankUiModel == null) {
            m98089i2();
        } else {
            m98088h2().mo79178hw().mo79174Qs(bankUiModel);
        }
        m98088h2().mo79182lw().mo79177h9().mo4819k(getViewLifecycleOwner(), new C33379e(new C33376b(this)));
        m98088h2().mo79182lw().mo79175Z7().mo4819k(getViewLifecycleOwner(), new C33379e(new C33377c(this)));
        m98088h2().mo79182lw().mo79184t5().mo4819k(getViewLifecycleOwner(), new C33379e(new C33378d(this)));
    }
}
