package p341ge.bog.mobilebank.kyc.presentation.identity;

import an0.C10106b;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import en0.C12717c;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import jn0.C16254a;
import kn0.C16484a;
import kn0.C16486b;
import kn0.C16488c;
import kn0.C16490d;
import kn0.C16492e;
import kn0.C16493f;
import kn0.C16494g;
import kn0.C16495h;
import kn0.C16496i;
import kn0.C16497j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.kyc.presentation.identity.C14831b;
import p341ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet;
import p341ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityDataInputFragment */
public final class IdentityDataInputFragment extends C14830a {

    /* renamed from: i */
    private final C41217g f42871i;

    /* renamed from: j */
    private C12717c f42872j;

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityDataInputFragment$a */
    public static final class C14806a implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ IdentityDataInputFragment f42873d;

        public C14806a(IdentityDataInputFragment identityDataInputFragment) {
            this.f42873d = identityDataInputFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f42873d.m54471u1().mo41428gm(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityDataInputFragment$b */
    public static final class C14807b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ IdentityDataInputFragment f42874d;

        public C14807b(IdentityDataInputFragment identityDataInputFragment) {
            this.f42874d = identityDataInputFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f42874d.m54471u1().mo41426d9(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityDataInputFragment$c */
    static final class C14808c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityDataInputFragment f42875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14808c(IdentityDataInputFragment identityDataInputFragment) {
            super(1);
            this.f42875d = identityDataInputFragment;
        }

        /* renamed from: a */
        public final void mo41412a(C14831b bVar) {
            if (bVar instanceof C14831b.C14834c) {
                C12717c r1 = this.f42875d.m54470t1();
                r1.mo3946b().mo53595c();
                C14831b.C14834c cVar = (C14831b.C14834c) bVar;
                r1.f37613g.setInputText(cVar.mo41460h());
                r1.f37612f.setInputText(cVar.mo41456e());
                r1.f37612f.setEnabled(cVar.mo41463j());
                if (!C41536l.m120484d(r1.f37611e.getInputText(), cVar.mo41452a())) {
                    r1.f37611e.setInputText(cVar.mo41452a());
                }
                if (r1.f37621o.isChecked() != cVar.mo41459g()) {
                    r1.f37621o.setChecked(cVar.mo41459g());
                }
                r1.f37617k.setInputText(cVar.mo41462i());
                r1.f37615i.setInputText(cVar.mo41458f());
                r1.f37615i.setEnabled(cVar.mo41464k());
                if (!C41536l.m120484d(r1.f37623q.getInputText(), cVar.mo41453b())) {
                    r1.f37623q.setInputText(cVar.mo41453b());
                }
                r1.f37614h.setInputText(cVar.mo41455d());
                if (r1.f37618l.isChecked() != cVar.mo41465l()) {
                    r1.f37618l.setChecked(cVar.mo41465l());
                }
                Input input = r1.f37626t;
                C41536l.m120488h(input, "secondCitizenshipInput");
                C32343x.m95483r1(input, cVar.mo41465l(), false, 2, (Object) null);
                r1.f37626t.setInputText(cVar.mo41466m());
                LinearLayout linearLayout = r1.f37622p;
                C41536l.m120488h(linearLayout, "legalAddressContainer");
                C32343x.m95483r1(linearLayout, cVar.mo41467n(), false, 2, (Object) null);
                r1.f37620n.getButton().setEnabled(cVar.mo41454c());
            } else if (C41536l.m120484d(bVar, C14831b.C14833b.f42911a)) {
                this.f42875d.m54470t1().mo3946b().mo53597e();
            } else if (C41536l.m120484d(bVar, C14831b.C14832a.f42910a)) {
                this.f42875d.m54470t1().mo3946b().mo53596d();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41412a((C14831b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityDataInputFragment$d */
    static final class C14809d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f42876a;

        C14809d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f42876a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f42876a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f42876a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityDataInputFragment$e */
    public static final class C14810e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14810e(Fragment fragment) {
            super(0);
            this.f42877d = fragment;
        }

        public final Fragment invoke() {
            return this.f42877d;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityDataInputFragment$f */
    public static final class C14811f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42878d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14811f(C43064a aVar) {
            super(0);
            this.f42878d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42878d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityDataInputFragment$g */
    public static final class C14812g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42879d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14812g(C41217g gVar) {
            super(0);
            this.f42879d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42879d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityDataInputFragment$h */
    public static final class C14813h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42880d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42881e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14813h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42880d = aVar;
            this.f42881e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42880d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42881e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.IdentityDataInputFragment$i */
    public static final class C14814i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42882d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42883e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14814i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f42882d = fragment;
            this.f42883e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f42883e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f42882d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public IdentityDataInputFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14811f(new C14810e(this)));
        this.f42871i = C1514j0.m5374c(this, C41520a0.m120436b(IdentityInputViewModel$ViewModel.class), new C14812g(a), new C14813h((C43064a) null, a), new C14814i(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m54452A1(IdentityDataInputFragment identityDataInputFragment, View view) {
        C41536l.m120489i(identityDataInputFragment, "this$0");
        C8034d.m30522a(identityDataInputFragment).mo22118M(C10106b.action_identityDataInputFragment_to_countrySelectorActionSheet, CountrySelectorActionSheet.f43065J.mo41576a(C16254a.ACTUAL));
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m54453B1(IdentityDataInputFragment identityDataInputFragment, View view) {
        C41536l.m120489i(identityDataInputFragment, "this$0");
        C8034d.m30522a(identityDataInputFragment).mo22118M(C10106b.action_identityDataInputFragment_to_citySelectorActionSheet, CitySelectorActionSheet.f43044J.mo41564a(C16254a.ACTUAL));
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m54454C1(IdentityDataInputFragment identityDataInputFragment, View view) {
        C41536l.m120489i(identityDataInputFragment, "this$0");
        C8034d.m30522a(identityDataInputFragment).mo22118M(C10106b.action_identityDataInputFragment_to_countrySelectorActionSheet, CountrySelectorActionSheet.f43065J.mo41576a(C16254a.LEGAL));
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m54455D1(IdentityDataInputFragment identityDataInputFragment, View view) {
        C41536l.m120489i(identityDataInputFragment, "this$0");
        C8034d.m30522a(identityDataInputFragment).mo22118M(C10106b.action_identityDataInputFragment_to_citySelectorActionSheet, CitySelectorActionSheet.f43044J.mo41564a(C16254a.LEGAL));
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m54456E1(IdentityDataInputFragment identityDataInputFragment, View view) {
        C41536l.m120489i(identityDataInputFragment, "this$0");
        C8034d.m30522a(identityDataInputFragment).mo22118M(C10106b.action_identityDataInputFragment_to_countrySelectorActionSheet, CountrySelectorActionSheet.f43065J.mo41576a(C16254a.CITIZENSHIP2));
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m54457F1(IdentityDataInputFragment identityDataInputFragment, View view) {
        C41536l.m120489i(identityDataInputFragment, "this$0");
        C8034d.m30522a(identityDataInputFragment).mo22118M(C10106b.action_identityDataInputFragment_to_countrySelectorActionSheet, CountrySelectorActionSheet.f43065J.mo41576a(C16254a.CITIZENSHIP));
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final C12717c m54470t1() {
        C12717c cVar = this.f42872j;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final IdentityInputViewModel$ViewModel m54471u1() {
        return (IdentityInputViewModel$ViewModel) this.f42871i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m54472v1(IdentityDataInputFragment identityDataInputFragment, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(identityDataInputFragment, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        identityDataInputFragment.m54471u1().mo41419Iw().mo41415Cq(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m54473x1(IdentityDataInputFragment identityDataInputFragment, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(identityDataInputFragment, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        identityDataInputFragment.m54471u1().mo41430w4(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m54474y1(IdentityDataInputFragment identityDataInputFragment, View view) {
        C41536l.m120489i(identityDataInputFragment, "this$0");
        C8034d.m30522a(identityDataInputFragment).mo22117L(C10106b.action_identityDataInputFragment_to_occupationInputFragment);
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m54475z1(IdentityDataInputFragment identityDataInputFragment, View view) {
        C41536l.m120489i(identityDataInputFragment, "this$0");
        identityDataInputFragment.m54471u1().onRefresh(6);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f42872j = C12717c.m48262d(layoutInflater, viewGroup, false);
        StateView c = m54470t1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f42872j = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m54470t1().f37621o.setOnCheckedStateChangeListener(new C16484a(this));
        m54470t1().f37618l.setOnCheckedStateChangeListener(new C16486b(this));
        m54470t1().f37611e.getTextInput().addTextChangedListener(new C14806a(this));
        m54470t1().f37613g.setOnClickListener(new C16488c(this));
        m54470t1().f37612f.setOnClickListener(new C16490d(this));
        m54470t1().f37617k.setOnClickListener(new C16492e(this));
        m54470t1().f37615i.setOnClickListener(new C16493f(this));
        m54470t1().f37623q.getTextInput().addTextChangedListener(new C14807b(this));
        m54470t1().f37626t.setOnClickListener(new C16494g(this));
        m54470t1().f37614h.setOnClickListener(new C16495h(this));
        m54470t1().f37620n.getButton().setOnClickListener(new C16496i(this));
        m54470t1().f37625s.setOnClickListener(new C16497j(this));
        m54471u1().mo41420Jw().mo41418Hk().mo4819k(getViewLifecycleOwner(), new C14809d(new C14808c(this)));
    }
}
