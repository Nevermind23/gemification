package p341ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import bv0.C31203c;
import ev0.C31826g;
import g91.C32299e;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import iu0.C36546y;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lv0.C37162e;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.openbanking.presentation.BankUiModel;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.b */
public final class C33362b extends C33373d {

    /* renamed from: j */
    public static final C33363a f81512j = new C33363a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C31826g f81513g;

    /* renamed from: h */
    private final C41217g f81514h;

    /* renamed from: i */
    private final C41217g f81515i = C41219i.m119470b(new C33364b(this));

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.b$a */
    public static final class C33363a {
        private C33363a() {
        }

        public /* synthetic */ C33363a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C33362b mo79192a(boolean z) {
            C33362b bVar = new C33362b();
            Bundle bundle = new Bundle();
            bundle.putBoolean("bank_is_added", z);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.b$b */
    static final class C33364b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C33362b f81516d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33364b(C33362b bVar) {
            super(0);
            this.f81516d = bVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f81516d.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("bank_is_added", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.b$c */
    static final class C33365c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33362b f81517d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33365c(C33362b bVar) {
            super(1);
            this.f81517d = bVar;
        }

        /* renamed from: a */
        public final void mo79194a(BankUiModel bankUiModel) {
            boolean z;
            this.f81517d.m98078l1().f78502f.setTitle(bankUiModel.mo79093d());
            PageDescriptionView pageDescriptionView = this.f81517d.m98078l1().f78502f;
            Integer valueOf = Integer.valueOf(C32299e.m95163a(bankUiModel.mo79091a()));
            if (valueOf.intValue() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf == null) {
                valueOf = Integer.valueOf(C31203c.f77509h);
            }
            pageDescriptionView.setDrawableSrc(valueOf);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79194a((BankUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.b$d */
    static final class C33366d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81518a;

        C33366d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81518a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81518a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81518a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.b$e */
    public static final class C33367e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33367e(C43064a aVar) {
            super(0);
            this.f81519d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f81519d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.b$f */
    public static final class C33368f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f81520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33368f(C41217g gVar) {
            super(0);
            this.f81520d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f81520d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.b$g */
    public static final class C33369g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81521d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81522e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33369g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f81521d = aVar;
            this.f81522e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81521d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f81522e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.b$h */
    public static final class C33370h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81523d;

        /* renamed from: e */
        final /* synthetic */ C41217g f81524e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33370h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f81523d = fragment;
            this.f81524e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f81524e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f81523d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.b$i */
    static final class C33371i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C33362b f81525d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33371i(C33362b bVar) {
            super(0);
            this.f81525d = bVar;
        }

        public final C1638u0 invoke() {
            Fragment requireParentFragment = this.f81525d.requireParentFragment();
            C41536l.m120488h(requireParentFragment, "requireParentFragment()");
            return requireParentFragment;
        }
    }

    public C33362b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C33367e(new C33371i(this)));
        this.f81514h = C1514j0.m5374c(this, C41520a0.m120436b(SelectBankViewModel$ViewModel.class), new C33368f(a), new C33369g((C43064a) null, a), new C33370h(this, a));
    }

    /* renamed from: k1 */
    private final boolean m98077k1() {
        return ((Boolean) this.f81515i.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public final C31826g m98078l1() {
        C31826g gVar = this.f81513g;
        C41536l.m120486f(gVar);
        return gVar;
    }

    /* renamed from: m1 */
    private final SelectBankViewModel$ViewModel m98079m1() {
        return (SelectBankViewModel$ViewModel) this.f81514h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m98080n1(C33362b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m98079m1().mo79178hw().mo79176g4();
        C36546y.m108282F().mo27152s("open_banking", (String) null, "accept_periods_buttons");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f81513g = C31826g.m94094d(layoutInflater, viewGroup, false);
        LinearLayout c = m98078l1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        PageDescriptionView pageDescriptionView = m98078l1().f78502f;
        if (m98077k1()) {
            str = C32343x.m95388F("open.bank.consider.existing.desc", new Object[0]);
        } else {
            str = C32343x.m95388F("open.bank.consider.empty.desc", new Object[0]);
        }
        pageDescriptionView.setText(str);
        m98078l1().f78501e.setOnClickListener(new C37162e(this));
        m98079m1().mo79182lw().mo79177h9().mo4819k(getViewLifecycleOwner(), new C33366d(new C33365c(this)));
    }
}
