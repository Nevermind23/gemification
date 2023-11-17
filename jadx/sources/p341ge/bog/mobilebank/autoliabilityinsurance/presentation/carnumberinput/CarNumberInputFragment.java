package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import com.salesforce.marketingcloud.UrlHandler;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p380ck.C10464h;
import p451hk.C15529g;
import p493kk.C16454h;
import p591rk.C17621a;
import p591rk.C17622b;
import p591rk.C17623c;
import p591rk.C17624d;
import p591rk.C17625e;
import p591rk.C17626f;
import p591rk.C17627g;
import p591rk.C17628h;
import p591rk.C17630j;
import p591rk.C17631k;
import p591rk.C17632l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputFragment */
public final class CarNumberInputFragment extends C13608b {

    /* renamed from: l */
    public static final C13597a f40681l = new C13597a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C16454h f40682i;

    /* renamed from: j */
    private final C41217g f40683j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C13606a f40684k;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputFragment$a */
    public static final class C13597a {
        private C13597a() {
        }

        public /* synthetic */ C13597a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputFragment$b */
    static final class C13598b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CarNumberInputFragment f40685d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13598b(CarNumberInputFragment carNumberInputFragment) {
            super(1);
            this.f40685d = carNumberInputFragment;
        }

        /* renamed from: a */
        public final void mo37461a(C17631k kVar) {
            CarNumberInputFragment carNumberInputFragment = this.f40685d;
            C41536l.m120488h(kVar, "it");
            carNumberInputFragment.m50985A1(kVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37461a((C17631k) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputFragment$c */
    static final class C13599c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CarNumberInputFragment f40686d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13599c(CarNumberInputFragment carNumberInputFragment) {
            super(1);
            this.f40686d = carNumberInputFragment;
        }

        /* renamed from: a */
        public final void mo37462a(C17630j jVar) {
            boolean z;
            String str;
            C41536l.m120489i(jVar, "it");
            CarNumberInputFragment carNumberInputFragment = this.f40686d;
            C10464h.C10465a aVar = C10464h.C10465a.FIREBASE;
            C41224m[] mVarArr = new C41224m[3];
            mVarArr[0] = C41233s.m119492a("event_name", "mtpl_insurance");
            boolean z2 = true;
            mVarArr[1] = C41233s.m119492a(UrlHandler.ACTION, "car_data_next_button_click");
            C13606a p1 = this.f40686d.f40684k;
            if (p1 == null || p1.mo37476b() != 0) {
                z = false;
            } else {
                z = true;
            }
            String str2 = PensionStatusResult.STATUS_INACTIVE;
            if (z) {
                str = str2;
            } else {
                str = "O";
            }
            mVarArr[2] = C41233s.m119492a("selected_path", str);
            C32343x.m95395I0(carNumberInputFragment, "mtpl_insurance", (String) null, "car_data_next_button_click", aVar, C0908e.m3336b(mVarArr), 2, (Object) null);
            C41224m[] mVarArr2 = new C41224m[1];
            C13606a p12 = this.f40686d.f40684k;
            if (p12 == null || p12.mo37476b() != 0) {
                z2 = false;
            }
            if (!z2) {
                str2 = "O";
            }
            mVarArr2[0] = C41233s.m119492a("selected_path", str2);
            C8034d.m30522a(this.f40686d).mo22118M(jVar.mo45214b(), C0908e.m3336b(mVarArr2));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37462a((C17630j) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputFragment$d */
    static final class C13600d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f40687a;

        C13600d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f40687a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f40687a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f40687a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputFragment$e */
    public static final class C13601e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13601e(Fragment fragment) {
            super(0);
            this.f40688d = fragment;
        }

        public final Fragment invoke() {
            return this.f40688d;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputFragment$f */
    public static final class C13602f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40689d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13602f(C43064a aVar) {
            super(0);
            this.f40689d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f40689d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputFragment$g */
    public static final class C13603g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f40690d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13603g(C41217g gVar) {
            super(0);
            this.f40690d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f40690d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputFragment$h */
    public static final class C13604h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40691d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40692e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13604h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f40691d = aVar;
            this.f40692e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f40691d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f40692e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputFragment$i */
    public static final class C13605i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40693d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40694e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13605i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f40693d = fragment;
            this.f40694e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f40694e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f40693d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public CarNumberInputFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C13602f(new C13601e(this)));
        this.f40683j = C1514j0.m5374c(this, C41520a0.m120436b(CarNumberInputViewModel$ViewModel.class), new C13603g(a), new C13604h((C43064a) null, a), new C13605i(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final void m50985A1(C17631k kVar) {
        m51002r1();
        if (!C41536l.m120484d(m51007x1().f46484e.getText(), kVar.mo45216c())) {
            BigInputView bigInputView = m51007x1().f46484e;
            String c = kVar.mo45216c();
            if (c == null) {
                c = "";
            }
            bigInputView.setText(c);
        }
        Integer num = (Integer) C41358y.m120009Y(m51007x1().f46487h.getActivatedChipsIndex());
        int b = kVar.mo45217d().mo37476b();
        if (num == null || num.intValue() != b) {
            this.f40684k = kVar.mo45217d();
            ChipGroup chipGroup = m51007x1().f46487h;
            C41536l.m120488h(chipGroup, "binding.carOwnerChipGroup");
            ChipGroup.m49760n(chipGroup, kVar.mo45217d().mo37476b(), false, 2, (Object) null);
        }
        if (m51007x1().f46489j.isChecked() != kVar.mo45218e()) {
            m51007x1().f46489j.setChecked(kVar.mo45218e());
        }
        if (m51007x1().f46490k.isChecked() != kVar.mo45220f()) {
            m51007x1().f46490k.setChecked(kVar.mo45220f());
        }
        m51007x1().f46488i.getButton().setEnabled(kVar.mo45221g());
        m50986B1();
    }

    /* renamed from: B1 */
    private final void m50986B1() {
        m51007x1().f46484e.setTextChangeListener(new C17623c(this));
        m51007x1().f46487h.setOnChipActivatedChangedListener(new C17624d(this));
        m51007x1().f46489j.setOnCheckedStateChangeListener(new C17625e(this));
        m51007x1().f46490k.setOnCheckedStateChangeListener(new C17626f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m50987C1(CarNumberInputFragment carNumberInputFragment, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(carNumberInputFragment, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        carNumberInputFragment.m51008y1().mo37470ew().mo37467T3(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m50988D1(CarNumberInputFragment carNumberInputFragment, String str) {
        C41536l.m120489i(carNumberInputFragment, "this$0");
        C17632l ew = carNumberInputFragment.m51008y1().mo37470ew();
        if (str == null) {
            str = "";
        }
        ew.mo37468T4(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m50989E1(CarNumberInputFragment carNumberInputFragment, Chip chip, int i) {
        C41536l.m120489i(carNumberInputFragment, "this$0");
        C41536l.m120489i(chip, "<anonymous parameter 0>");
        carNumberInputFragment.m51008y1().mo37470ew().mo37465Ep(C13606a.f40700e.mo37477a(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m50990F1(CarNumberInputFragment carNumberInputFragment, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(carNumberInputFragment, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        carNumberInputFragment.m51008y1().mo37470ew().mo37474lv(z);
    }

    /* renamed from: G1 */
    private final void m50991G1() {
        m51007x1().f46485f.setText(C32343x.m95388F("rbc.insurance.enter.car.no", new Object[0]));
        m51007x1().f46486g.setTitleText(C32343x.m95388F("rbc.insurance.car.additional.info", new Object[0]));
        BigInputView bigInputView = m51007x1().f46484e;
        bigInputView.setFormatText(false);
        String string = getString(C15529g.car_number_input_hint);
        C41536l.m120488h(string, "getString(R.string.car_number_input_hint)");
        bigInputView.setHint(string);
        CheckboxView checkboxView = m51007x1().f46489j;
        String string2 = getString(C15529g.car_number_input_button_text_insurance_agree);
        C41536l.m120488h(string2, "getString(R.string.car_n…ton_text_insurance_agree)");
        checkboxView.mo35145g(string2, getString(C15529g.car_number_input_button_text_check_insurance_terms));
        CheckboxView checkboxView2 = m51007x1().f46490k;
        String string3 = getString(C15529g.car_number_input_button_text_mia_agree);
        C41536l.m120488h(string3, "getString(R.string.car_n…ut_button_text_mia_agree)");
        checkboxView2.mo35145g(string3, getString(C15529g.car_number_input_button_text_check_car_at_mia));
    }

    private final void observeData() {
        m51008y1().mo37472gw().mo37473hr().mo4819k(getViewLifecycleOwner(), new C13600d(new C13598b(this)));
        LiveData K3 = m51008y1().mo37472gw().mo37466K3();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(K3, viewLifecycleOwner, new C13599c(this));
    }

    /* renamed from: r1 */
    private final void m51002r1() {
        m51007x1().f46484e.setTextChangeListener((BigInputView.C13175b) null);
        m51007x1().f46487h.setOnChipActivatedChangedListener((ChipGroup.C13230a) null);
        m51007x1().f46489j.setOnCheckedStateChangeListener(new C17627g());
        m51007x1().f46490k.setOnCheckedStateChangeListener(new C17628h());
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m51003s1(CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m51004t1(CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
    }

    /* renamed from: u1 */
    private final CheckboxView.C13223c m51005u1(String str, String str2) {
        return new C17622b(str, this, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m51006v1(String str, CarNumberInputFragment carNumberInputFragment, String str2) {
        C41536l.m120489i(str, "$url");
        C41536l.m120489i(carNumberInputFragment, "this$0");
        C41536l.m120489i(str2, "$name");
        C1505h requireActivity = carNumberInputFragment.requireActivity();
        C32303f.m95195f(str, requireActivity, str2 + ".docx", "application/msword");
    }

    /* renamed from: x1 */
    private final C16454h m51007x1() {
        C16454h hVar = this.f40682i;
        C41536l.m120486f(hVar);
        return hVar;
    }

    /* renamed from: y1 */
    private final CarNumberInputViewModel$ViewModel m51008y1() {
        return (CarNumberInputViewModel$ViewModel) this.f40683j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m51009z1(CarNumberInputFragment carNumberInputFragment, View view) {
        C41536l.m120489i(carNumberInputFragment, "this$0");
        carNumberInputFragment.m51008y1().mo37475s2();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f40682i = C16454h.m58621d(layoutInflater, viewGroup, false);
        LinearLayout c = m51007x1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f40682i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        m50991G1();
        observeData();
        m51007x1().f46488i.getButton().setOnClickListener(new C17621a(this));
        m51007x1().f46490k.setTextClickListener(m51005u1(C32343x.m95388F("rbc.ins.links.mia", new Object[0]), "mia-conditions"));
        m51007x1().f46489j.setTextClickListener(m51005u1(C32343x.m95388F("rbc.ins.links.insurance.general.conditions", new Object[0]), "insurance-conditions"));
    }
}
