package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput;

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
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
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
import java.util.Calendar;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.ActivationDateInputViewModel;
import p380ck.C10464h;
import p451hk.C15526d;
import p493kk.C16453g;
import p603si.C17796a;
import p603si.C17799b;
import p603si.C17809c;
import p619tk.C17979a;
import p619tk.C17982d;
import p619tk.C17983e;
import p619tk.C17984f;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment */
public final class InsuranceActivationDateInputFragment extends C13644a {

    /* renamed from: l */
    public static final C13632a f40755l = new C13632a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C16453g f40756i;

    /* renamed from: j */
    private final C41217g f40757j;

    /* renamed from: k */
    private final C41217g f40758k = C41219i.m119470b(new C13637f(this));

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment$a */
    public static final class C13632a {
        private C13632a() {
        }

        public /* synthetic */ C13632a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment$b */
    public static final class C13633b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ InsuranceActivationDateInputFragment f40759d;

        public C13633b(InsuranceActivationDateInputFragment insuranceActivationDateInputFragment) {
            this.f40759d = insuranceActivationDateInputFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f40759d.m51095p1().mo37516dw().mo37520tt(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment$c */
    static final class C13634c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceActivationDateInputFragment f40760d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13634c(InsuranceActivationDateInputFragment insuranceActivationDateInputFragment) {
            super(1);
            this.f40760d = insuranceActivationDateInputFragment;
        }

        /* renamed from: a */
        public final void mo37527a(Long l) {
            ActivationDateInputViewModel.ViewModel l1 = this.f40760d.m51095p1();
            C41536l.m120488h(l, "date");
            l1.mo37518fw(l.longValue());
            Input input = this.f40760d.m51092m1().f46479h;
            String b = C32319m.m95295b(l.longValue());
            C41536l.m120488h(b, "formatDate(date)");
            input.setInputText(b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37527a((Long) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment$d */
    static final class C13635d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ InsuranceActivationDateInputFragment f40761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13635d(InsuranceActivationDateInputFragment insuranceActivationDateInputFragment) {
            super(1);
            this.f40761d = insuranceActivationDateInputFragment;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f40761d.m51092m1().f46477f.getButton();
            C41536l.m120488h(bool, "it");
            button.setEnabled(bool.booleanValue() && this.f40761d.m51092m1().f46478g.mo35918a());
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment$e */
    public static final class C13636e implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ InsuranceActivationDateInputFragment f40762d;

        public C13636e(InsuranceActivationDateInputFragment insuranceActivationDateInputFragment) {
            this.f40762d = insuranceActivationDateInputFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f40762d.m51095p1().mo37516dw().mo37513U7(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment$f */
    static final class C13637f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ InsuranceActivationDateInputFragment f40763d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13637f(InsuranceActivationDateInputFragment insuranceActivationDateInputFragment) {
            super(0);
            this.f40763d = insuranceActivationDateInputFragment;
        }

        public final String invoke() {
            Bundle arguments = this.f40763d.getArguments();
            String string = arguments != null ? arguments.getString("selected_path") : null;
            C41536l.m120486f(string);
            return string;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment$g */
    static final class C13638g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f40764a;

        C13638g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f40764a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f40764a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f40764a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment$h */
    public static final class C13639h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13639h(Fragment fragment) {
            super(0);
            this.f40765d = fragment;
        }

        public final Fragment invoke() {
            return this.f40765d;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment$i */
    public static final class C13640i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40766d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13640i(C43064a aVar) {
            super(0);
            this.f40766d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f40766d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment$j */
    public static final class C13641j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f40767d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13641j(C41217g gVar) {
            super(0);
            this.f40767d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f40767d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment$k */
    public static final class C13642k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40768d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40769e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13642k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f40768d = aVar;
            this.f40769e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f40768d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f40769e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.dateinput.InsuranceActivationDateInputFragment$l */
    public static final class C13643l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40770d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40771e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13643l(Fragment fragment, C41217g gVar) {
            super(0);
            this.f40770d = fragment;
            this.f40771e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f40771e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f40770d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public InsuranceActivationDateInputFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C13640i(new C13639h(this)));
        this.f40757j = C1514j0.m5374c(this, C41520a0.m120436b(ActivationDateInputViewModel.ViewModel.class), new C13641j(a), new C13642k((C43064a) null, a), new C13643l(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public final C16453g m51092m1() {
        C16453g gVar = this.f40756i;
        C41536l.m120486f(gVar);
        return gVar;
    }

    /* renamed from: n1 */
    private final CalendarConstraints m51093n1() {
        long W1 = C5023l.m19556W1();
        Calendar.getInstance().setTimeInMillis(W1);
        long a = ActivationDateInputViewModel.f40744a.mo37522a();
        DateValidatorPointForward a2 = DateValidatorPointForward.m19410a(W1);
        C41536l.m120488h(a2, "from(today)");
        DateValidatorPointBackward a3 = DateValidatorPointBackward.m19406a(a);
        C41536l.m120488h(a3, "before(endDate)");
        CalendarConstraints.DateValidator d = CompositeDateValidator.m19386d(C41341q.m119910m(a2, a3));
        C41536l.m120488h(d, "allOf(validators)");
        CalendarConstraints a4 = new CalendarConstraints.C4986b().mo16158e(d).mo16157d(W1).mo16155b(a).mo16156c(W1).mo16154a();
        C41536l.m120488h(a4, "Builder()\n            .s…day)\n            .build()");
        return a4;
    }

    /* renamed from: o1 */
    private final String m51094o1() {
        return (String) this.f40758k.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final ActivationDateInputViewModel.ViewModel m51095p1() {
        return (ActivationDateInputViewModel.ViewModel) this.f40757j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m51096q1(InsuranceActivationDateInputFragment insuranceActivationDateInputFragment, View view) {
        C41536l.m120489i(insuranceActivationDateInputFragment, "this$0");
        C5023l.C5029f e = C5023l.C5029f.m19565c().mo16276e(insuranceActivationDateInputFragment.m51093n1());
        Long valueOf = Long.valueOf(insuranceActivationDateInputFragment.m51095p1().mo37515b().mo45663c());
        C41536l.m120488h(e, "it");
        e.mo16278g(valueOf);
        C5023l a = e.mo16275a();
        a.mo16267J1(new C17984f(new C13634c(insuranceActivationDateInputFragment)));
        a.mo4576A1(insuranceActivationDateInputFragment.getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m51097r1(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m51098s1(InsuranceActivationDateInputFragment insuranceActivationDateInputFragment, View view) {
        C41536l.m120489i(insuranceActivationDateInputFragment, "this$0");
        insuranceActivationDateInputFragment.m51095p1().mo37519gw();
        InsuranceActivationDateInputFragment insuranceActivationDateInputFragment2 = insuranceActivationDateInputFragment;
        C32343x.m95395I0(insuranceActivationDateInputFragment2, "mtpl_insurance", (String) null, "", C10464h.C10465a.FIREBASE, C0908e.m3336b(C41233s.m119492a("event_name", "mtpl_insurance"), C41233s.m119492a(UrlHandler.ACTION, "contact_data_next_button_click"), C41233s.m119492a("selected_path", insuranceActivationDateInputFragment.m51094o1())), 2, (Object) null);
        C8034d.m30522a(insuranceActivationDateInputFragment).mo22118M(C15526d.action_contactInfoInputFragment_to_policyDetailsFragment, C0908e.m3336b(C41233s.m119492a("selected_path", insuranceActivationDateInputFragment.m51094o1())));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f40756i = C16453g.m58617d(layoutInflater, viewGroup, false);
        LinearLayout c = m51092m1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f40756i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m51092m1().f46482k.setText(C32343x.m95388F("rbc.insurance.policy.start.date", new Object[0]));
        m51092m1().f46481j.setTitleText(C32343x.m95388F("rbc.insurance.policy.additional.info", new Object[0]));
        m51092m1().f46476e.setText(C32343x.m95388F("rbc.insurance.contact.info", new Object[0]));
        C17979a b = m51095p1().mo37517ew().mo37515b();
        Input input = m51092m1().f46479h;
        String b2 = C32319m.m95295b(b.mo45663c());
        C41536l.m120488h(b2, "formatDate(activationDate)");
        input.setInputText(b2);
        m51092m1().f46480i.setInputText(b.mo45665e());
        m51092m1().f46478g.setInputText(b.mo45664d());
        Button button = m51092m1().f46477f.getButton();
        if (!b.mo45667f() || !m51092m1().f46478g.mo35918a()) {
            z = false;
        } else {
            z = true;
        }
        button.setEnabled(z);
        m51092m1().f46479h.setOnClickListener(new C17982d(this));
        Input input2 = m51092m1().f46478g;
        C17796a aVar = new C17796a(C41339p.m119900e(C17809c.m61562a(C17799b.C17804e.f50685d, C32343x.m95388F("text.insurance.incorrect.email.format.error", new Object[0]))), (C17796a.C17797a) null, 2, (DefaultConstructorMarker) null);
        C41536l.m120488h(input2, "onViewCreated$lambda$6");
        Input.m50261f(input2, new C17796a(aVar, (C17796a.C17797a) null, 2, (DefaultConstructorMarker) null), false, true, false, 10, (Object) null);
        input2.getTextInput().addTextChangedListener(new C13636e(this));
        m51092m1().f46480i.getTextInput().addTextChangedListener(new C13633b(this));
        m51092m1().f46477f.getButton().setOnClickListener(new C17983e(this));
        m51095p1().mo37517ew().mo37514Xn().mo4819k(getViewLifecycleOwner(), new C13638g(new C13635d(this)));
    }
}
