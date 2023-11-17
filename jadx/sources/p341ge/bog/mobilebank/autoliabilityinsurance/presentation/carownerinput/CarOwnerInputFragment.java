package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import com.google.android.material.datepicker.C5023l;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.salesforce.marketingcloud.UrlHandler;
import g91.C32319m;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.input.Input;
import p380ck.C10464h;
import p451hk.C15526d;
import p451hk.C15529g;
import p493kk.C16455i;
import p563pk.C17374d;
import p603si.C17796a;
import p603si.C17799b;
import p603si.C17809c;
import p605sk.C17821a;
import p605sk.C17822b;
import p605sk.C17823c;
import p605sk.C17824d;
import p605sk.C17825e;
import p605sk.C17827g;
import p605sk.C17828h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment */
public final class CarOwnerInputFragment extends C13624a {

    /* renamed from: i */
    private C16455i f40710i;

    /* renamed from: j */
    private final C41217g f40711j;

    /* renamed from: k */
    private final C41217g f40712k = C41219i.m119470b(new C13612d(this));

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$a */
    public /* synthetic */ class C13609a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40713a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                pk.d[] r0 = p563pk.C17374d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                pk.d r1 = p563pk.C17374d.FEMALE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                pk.d r1 = p563pk.C17374d.MALE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f40713a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment.C13609a.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$b */
    static final class C13610b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CarOwnerInputFragment f40714d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13610b(CarOwnerInputFragment carOwnerInputFragment) {
            super(1);
            this.f40714d = carOwnerInputFragment;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            CarOwnerInputFragment carOwnerInputFragment = this.f40714d;
            C41536l.m120488h(bool, "it");
            carOwnerInputFragment.m51041t1(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$c */
    static final class C13611c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CarOwnerInputFragment f40715d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13611c(CarOwnerInputFragment carOwnerInputFragment) {
            super(1);
            this.f40715d = carOwnerInputFragment;
        }

        /* renamed from: a */
        public final void mo37482a(C17374d dVar) {
            C41536l.m120489i(dVar, "it");
            C13625b.f40741C.mo37512a(dVar).mo4576A1(this.f40715d.getChildFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37482a((C17374d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$d */
    static final class C13612d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CarOwnerInputFragment f40716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13612d(CarOwnerInputFragment carOwnerInputFragment) {
            super(0);
            this.f40716d = carOwnerInputFragment;
        }

        public final String invoke() {
            Bundle arguments = this.f40716d.getArguments();
            String string = arguments != null ? arguments.getString("selected_path") : null;
            C41536l.m120486f(string);
            return string;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$e */
    static final class C13613e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f40717a;

        C13613e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f40717a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f40717a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f40717a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$f */
    public static final class C13614f implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ CarOwnerInputFragment f40718d;

        public C13614f(CarOwnerInputFragment carOwnerInputFragment) {
            this.f40718d = carOwnerInputFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f40718d.m51040s1().mo37502dw().mo37495Ea(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$g */
    public static final class C13615g implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ CarOwnerInputFragment f40719d;

        public C13615g(CarOwnerInputFragment carOwnerInputFragment) {
            this.f40719d = carOwnerInputFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f40719d.m51040s1().mo37502dw().mo37498W9(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$h */
    public static final class C13616h implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ CarOwnerInputFragment f40720d;

        public C13616h(CarOwnerInputFragment carOwnerInputFragment) {
            this.f40720d = carOwnerInputFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f40720d.m51040s1().mo37502dw().mo37496F8(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$i */
    static final class C13617i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CarOwnerInputFragment f40721d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13617i(CarOwnerInputFragment carOwnerInputFragment) {
            super(1);
            this.f40721d = carOwnerInputFragment;
        }

        /* renamed from: a */
        public final void mo37494a(Long l) {
            C17828h dw = this.f40721d.m51040s1().mo37502dw();
            C41536l.m120488h(l, "date");
            dw.mo37507z4(l.longValue());
            Input input = this.f40721d.m51037p1().f46496g;
            String b = C32319m.m95295b(l.longValue());
            C41536l.m120488h(b, "formatDate(date)");
            input.setInputText(b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37494a((Long) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$j */
    public static final class C13618j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13618j(Fragment fragment) {
            super(0);
            this.f40722d = fragment;
        }

        public final Fragment invoke() {
            return this.f40722d;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$k */
    public static final class C13619k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40723d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13619k(C43064a aVar) {
            super(0);
            this.f40723d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f40723d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$l */
    public static final class C13620l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f40724d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13620l(C41217g gVar) {
            super(0);
            this.f40724d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f40724d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$m */
    public static final class C13621m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40725d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40726e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13621m(C43064a aVar, C41217g gVar) {
            super(0);
            this.f40725d = aVar;
            this.f40726e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f40725d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f40726e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.CarOwnerInputFragment$n */
    public static final class C13622n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40727d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40728e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13622n(Fragment fragment, C41217g gVar) {
            super(0);
            this.f40727d = fragment;
            this.f40728e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f40728e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f40727d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public CarOwnerInputFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C13619k(new C13618j(this)));
        this.f40711j = C1514j0.m5374c(this, C41520a0.m120436b(CarOwnerInputViewModel$ViewModel.class), new C13620l(a), new C13621m((C43064a) null, a), new C13622n(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m51026A1(CarOwnerInputFragment carOwnerInputFragment, View view) {
        C41536l.m120489i(carOwnerInputFragment, "this$0");
        carOwnerInputFragment.m51040s1().mo37502dw().mo37501cc();
    }

    /* renamed from: B1 */
    private final void m51027B1(C17374d dVar) {
        int i;
        String str;
        Input input = m51037p1().f46498i;
        if (dVar == null) {
            i = -1;
        } else {
            i = C13609a.f40713a[dVar.ordinal()];
        }
        if (i == 1) {
            str = getString(C15529g.car_owner_input_female);
            C41536l.m120488h(str, "getString(R.string.car_owner_input_female)");
        } else if (i != 2) {
            str = "";
        } else {
            str = getString(C15529g.car_owner_input_male);
            C41536l.m120488h(str, "getString(R.string.car_owner_input_male)");
        }
        input.setInputText(str);
    }

    /* renamed from: C1 */
    private final void m51028C1() {
        C17799b.C17800a aVar = new C17799b.C17800a(11);
        int i = C15529g.car_owner_input_msg_error_id_number_validation;
        String string = getString(i);
        C41536l.m120488h(string, "getString(R.string.car_o…ror_id_number_validation)");
        C17799b.C17803d dVar = C17799b.C17803d.f50684d;
        String string2 = getString(i);
        C41536l.m120488h(string2, "getString(R.string.car_o…ror_id_number_validation)");
        C17796a aVar2 = new C17796a(C41341q.m119910m(C17809c.m61562a(aVar, string), C17809c.m61562a(dVar, string2)), (C17796a.C17797a) null, 2, (DefaultConstructorMarker) null);
        Input input = m51037p1().f46499j;
        C41536l.m120488h(input, "binding.ownerIdNumberInput");
        Input.m50261f(input, new C17796a(aVar2, (C17796a.C17797a) null, 2, (DefaultConstructorMarker) null), false, true, false, 10, (Object) null);
    }

    private final void observeData() {
        m51040s1().mo37504fw().mo37506m9().mo4819k(getViewLifecycleOwner(), new C13613e(new C13610b(this)));
        LiveData Xf = m51040s1().mo37504fw().mo37499Xf();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Xf, viewLifecycleOwner, new C13611c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final C16455i m51037p1() {
        C16455i iVar = this.f40710i;
        C41536l.m120486f(iVar);
        return iVar;
    }

    /* renamed from: q1 */
    private final CalendarConstraints m51038q1() {
        Date date = new Date();
        long time = C32319m.m95292L(date, -80).getTime();
        long time2 = C32319m.m95292L(date, -21).getTime();
        DateValidatorPointForward a = DateValidatorPointForward.m19410a(time);
        C41536l.m120488h(a, "from(startDate)");
        DateValidatorPointBackward a2 = DateValidatorPointBackward.m19406a(time2);
        C41536l.m120488h(a2, "before(endDate)");
        CalendarConstraints.DateValidator d = CompositeDateValidator.m19386d(C41341q.m119910m(a, a2));
        C41536l.m120488h(d, "allOf(validators)");
        CalendarConstraints a3 = new CalendarConstraints.C4986b().mo16158e(d).mo16157d(time).mo16155b(time2).mo16156c(time2).mo16154a();
        C41536l.m120488h(a3, "Builder()\n            .s…ate)\n            .build()");
        return a3;
    }

    /* renamed from: r1 */
    private final String m51039r1() {
        return (String) this.f40712k.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final CarOwnerInputViewModel$ViewModel m51040s1() {
        return (CarOwnerInputViewModel$ViewModel) this.f40711j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m51041t1(boolean z) {
        m51037p1().f46495f.getButton().setEnabled(z);
    }

    /* renamed from: u1 */
    private final void m51042u1() {
        m51037p1().f46496g.setOnClickListener(new C17821a(this));
        m51037p1().f46497h.getTextInput().addTextChangedListener(new C13614f(this));
        m51037p1().f46500k.getTextInput().addTextChangedListener(new C13615g(this));
        m51037p1().f46499j.getTextInput().addTextChangedListener(new C13616h(this));
        m51037p1().f46498i.setOnClickListener(new C17822b(this));
        m51037p1().f46495f.getButton().setOnClickListener(new C17823c(this));
        getChildFragmentManager().mo4367F1("GENDER_SHEET_SELECTOR_KEY", this, new C17824d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m51043v1(CarOwnerInputFragment carOwnerInputFragment, View view) {
        C41536l.m120489i(carOwnerInputFragment, "this$0");
        if (carOwnerInputFragment.m51037p1().f46499j.mo35918a()) {
            carOwnerInputFragment.m51040s1().mo37505gw();
            CarOwnerInputFragment carOwnerInputFragment2 = carOwnerInputFragment;
            C32343x.m95395I0(carOwnerInputFragment2, "mtpl_insurance", (String) null, "", C10464h.C10465a.FIREBASE, C0908e.m3336b(C41233s.m119492a("event_name", "mtpl_insurance"), C41233s.m119492a(UrlHandler.ACTION, "car_owner_data_next_button_click"), C41233s.m119492a("selected_path", carOwnerInputFragment.m51039r1())), 2, (Object) null);
            C8034d.m30522a(carOwnerInputFragment).mo22118M(C15526d.action_carOwnerInputFragment_to_contactInfoInputFragment, C0908e.m3336b(C41233s.m119492a("selected_path", carOwnerInputFragment.m51039r1())));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m51044x1(CarOwnerInputFragment carOwnerInputFragment, String str, Bundle bundle) {
        C41536l.m120489i(carOwnerInputFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        Serializable serializable = bundle.getSerializable("GENDER_ARG");
        C41536l.m120487g(serializable, "null cannot be cast to non-null type ge.bog.mobilebank.autoliabilityinsurance.domain.model.Gender");
        C17374d dVar = (C17374d) serializable;
        carOwnerInputFragment.m51040s1().mo37502dw().mo37497Lo(dVar);
        carOwnerInputFragment.m51027B1(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m51045y1(CarOwnerInputFragment carOwnerInputFragment, View view) {
        C41536l.m120489i(carOwnerInputFragment, "this$0");
        C5023l.C5029f e = C5023l.C5029f.m19565c().mo16276e(carOwnerInputFragment.m51038q1());
        Long d = carOwnerInputFragment.m51040s1().mo37504fw().mo37500bp().mo45411d();
        if (d != null) {
            C41536l.m120488h(e, "it");
            e.mo16278g(d);
        }
        C5023l a = e.mo16275a();
        a.mo16267J1(new C17825e(new C13617i(carOwnerInputFragment)));
        a.mo4576A1(carOwnerInputFragment.getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m51046z1(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f40710i = C16455i.m58625d(layoutInflater, viewGroup, false);
        LinearLayout c = m51037p1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f40710i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C41536l.m120489i(view, "view");
        m51037p1().f46494e.setText(C32343x.m95388F("rbc.insurance.car.owner.info", new Object[0]));
        C17827g bp = m51040s1().mo37504fw().mo37500bp();
        m51037p1().f46497h.setInputText(bp.mo45412e());
        m51037p1().f46500k.setInputText(bp.mo45416h());
        m51037p1().f46499j.setInputText(bp.mo45415g());
        Input input = m51037p1().f46496g;
        Long d = bp.mo45411d();
        if (d != null) {
            str = C32319m.m95295b(d.longValue());
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        input.setInputText(str);
        m51027B1(bp.mo45414f());
        m51041t1(bp.mo45410c());
        m51028C1();
        m51042u1();
        observeData();
    }
}
