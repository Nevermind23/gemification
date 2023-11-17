package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
import androidx.lifecycle.LiveData;
import cf1.C40419j;
import cf1.C40426l;
import cm0.C19781a;
import cm0.C19782b;
import cm0.C19783c;
import cm0.C19784d;
import com.google.android.material.datepicker.C5023l;
import g91.C32319m;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41232r;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import o31.C37623y;
import ol0.C27032a;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.C24577a;
import p380ck.C10463g;
import p603si.C17799b;
import p603si.C17809c;
import ue1.C43064a;
import ue1.C43075l;
import y71.C40030d;
import y71.C40034h;
import z71.C40178e;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo */
public final class FillOtherPersonInsuranceInfo extends C24581c {

    /* renamed from: o */
    public static final C24559a f63345o = new C24559a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C40178e f63346g;

    /* renamed from: h */
    public C24577a.C24578a f63347h;

    /* renamed from: i */
    private final C41217g f63348i;

    /* renamed from: j */
    private final C24560b f63349j = m78948s1(new C24562d(this));

    /* renamed from: k */
    private final C24560b f63350k = m78948s1(new C24574p(this));

    /* renamed from: l */
    private final C24560b f63351l = m78948s1(new C24561c(this));

    /* renamed from: m */
    private final C24560b f63352m = m78948s1(new C24573o(this));

    /* renamed from: n */
    private final C24560b f63353n = m78948s1(new C24566h(this));

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$a */
    public static final class C24559a {
        private C24559a() {
        }

        public /* synthetic */ C24559a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$b */
    public static final class C24560b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C43064a f63354d;

        C24560b(C43064a aVar) {
            this.f63354d = aVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f63354d.invoke();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$c */
    static final class C24561c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FillOtherPersonInsuranceInfo f63355d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24561c(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
            super(0);
            this.f63355d = fillOtherPersonInsuranceInfo;
        }

        public final void invoke() {
            this.f63355d.m78949t1().mo62772mw(this.f63355d.m78947q1().f95484j.getInputText());
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$d */
    static final class C24562d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FillOtherPersonInsuranceInfo f63356d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24562d(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
            super(0);
            this.f63356d = fillOtherPersonInsuranceInfo;
        }

        public final void invoke() {
            this.f63356d.m78949t1().mo62773nw(this.f63356d.m78947q1().f95485k.getInputText());
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$e */
    static final class C24563e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FillOtherPersonInsuranceInfo f63357d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24563e(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
            super(1);
            this.f63357d = fillOtherPersonInsuranceInfo;
        }

        /* renamed from: a */
        public final void mo62760a(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
            C41536l.m120489i(travelInsuranceFilledInfo, "it");
            C8034d.m30522a(this.f63357d).mo22118M(C40030d.action_fillOtherPersonInsuranceInfoFragment_to_InsuranceProvidersFragment, C0908e.m3336b(C41233s.m119492a(this.f63357d.getString(C40034h.arg_filled_info), travelInsuranceFilledInfo)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62760a((TravelInsuranceFilledInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$f */
    static final class C24564f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FillOtherPersonInsuranceInfo f63358d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24564f(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
            super(1);
            this.f63358d = fillOtherPersonInsuranceInfo;
        }

        /* renamed from: a */
        public final void mo62761a(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
            FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo = this.f63358d;
            C41536l.m120488h(travelInsuranceFilledInfo, "info");
            fillOtherPersonInsuranceInfo.m78946p1(travelInsuranceFilledInfo);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62761a((TravelInsuranceFilledInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$g */
    static final class C24565g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FillOtherPersonInsuranceInfo f63359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24565g(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
            super(1);
            this.f63359d = fillOtherPersonInsuranceInfo;
        }

        /* renamed from: a */
        public final void mo62762a(C19781a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f63359d.m78935E1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62762a((C19781a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$h */
    static final class C24566h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FillOtherPersonInsuranceInfo f63360d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24566h(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
            super(0);
            this.f63360d = fillOtherPersonInsuranceInfo;
        }

        public final void invoke() {
            this.f63360d.m78949t1().mo62774ow(this.f63360d.m78947q1().f95487m.getInputText());
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$i */
    static final class C24567i implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f63361a;

        C24567i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f63361a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f63361a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f63361a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$j */
    static final class C24568j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FillOtherPersonInsuranceInfo f63362d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24568j(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
            super(1);
            this.f63362d = fillOtherPersonInsuranceInfo;
        }

        /* renamed from: a */
        public final void mo62765a(Long l) {
            C24577a n1 = this.f63362d.m78949t1();
            C41536l.m120488h(l, "date");
            n1.mo62777z4(l.longValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62765a((Long) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$k */
    public static final class C24569k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f63363d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24569k(Fragment fragment) {
            super(0);
            this.f63363d = fragment;
        }

        public final Fragment invoke() {
            return this.f63363d;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$l */
    public static final class C24570l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24570l(C43064a aVar) {
            super(0);
            this.f63364d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f63364d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$m */
    public static final class C24571m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f63365d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24571m(C41217g gVar) {
            super(0);
            this.f63365d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f63365d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$n */
    public static final class C24572n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63366d;

        /* renamed from: e */
        final /* synthetic */ C41217g f63367e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24572n(C43064a aVar, C41217g gVar) {
            super(0);
            this.f63366d = aVar;
            this.f63367e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f63366d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f63367e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$o */
    static final class C24573o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FillOtherPersonInsuranceInfo f63368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24573o(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
            super(0);
            this.f63368d = fillOtherPersonInsuranceInfo;
        }

        public final void invoke() {
            this.f63368d.m78949t1().mo62775pw(this.f63368d.m78947q1().f95492r.getInputText());
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$p */
    static final class C24574p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FillOtherPersonInsuranceInfo f63369d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24574p(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
            super(0);
            this.f63369d = fillOtherPersonInsuranceInfo;
        }

        public final void invoke() {
            this.f63369d.m78949t1().mo62776qw(this.f63369d.m78947q1().f95493s.getInputText());
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$q */
    static final class C24575q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FillOtherPersonInsuranceInfo f63370d;

        /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo$q$a */
        static final class C24576a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ FillOtherPersonInsuranceInfo f63371d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24576a(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
                super(0);
                this.f63371d = fillOtherPersonInsuranceInfo;
            }

            /* renamed from: b */
            public final C24577a invoke() {
                TravelInsuranceFilledInfo travelInsuranceFilledInfo;
                C24577a.C24578a r1 = this.f63371d.mo62756r1();
                Bundle arguments = this.f63371d.getArguments();
                if (arguments != null) {
                    travelInsuranceFilledInfo = (TravelInsuranceFilledInfo) arguments.getParcelable(this.f63371d.getString(C40034h.arg_filled_info));
                } else {
                    travelInsuranceFilledInfo = null;
                }
                C41536l.m120486f(travelInsuranceFilledInfo);
                return r1.mo32776a(travelInsuranceFilledInfo);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24575q(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo) {
            super(0);
            this.f63370d = fillOtherPersonInsuranceInfo;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24576a(this.f63370d));
        }
    }

    public FillOtherPersonInsuranceInfo() {
        C24575q qVar = new C24575q(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24570l(new C24569k(this)));
        this.f63348i = C1514j0.m5374c(this, C41520a0.m120436b(C24577a.class), new C24571m(a), new C24572n((C43064a) null, a), qVar);
    }

    /* renamed from: A1 */
    private final void m78931A1() {
        C40178e q1 = m78947q1();
        q1.f95480f.setOnClickListener(new C19782b(this));
        q1.f95481g.setOnClickListener(new C19783c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m78932B1(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo, View view) {
        C41536l.m120489i(fillOtherPersonInsuranceInfo, "this$0");
        if (fillOtherPersonInsuranceInfo.m78951v1()) {
            C27032a.C27034b bVar = C27032a.C27034b.f67903f;
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            bVar.mo66262a(F);
            fillOtherPersonInsuranceInfo.m78949t1().mo62771lw();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m78933C1(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo, View view) {
        C41536l.m120489i(fillOtherPersonInsuranceInfo, "this$0");
        fillOtherPersonInsuranceInfo.m78949t1().mo62770kw();
    }

    /* renamed from: D1 */
    private final void m78934D1() {
        C40178e q1 = m78947q1();
        Input input = q1.f95485k;
        C41536l.m120488h(input, "nameGeorgian");
        String F = C32343x.m95388F("text.travel.insurance.insured.person.screen.name.geo", new Object[0]);
        C40426l lVar = C40426l.IGNORE_CASE;
        m78953y1(input, F, new C40419j("^[ა-ჰ](?:-?[ა-ჰ])*(?<!-)$", lVar), C32343x.m95388F("text.travel.insurance.invalid.insured.first.name", new Object[0]), this.f63349j);
        Input input2 = q1.f95493s;
        C41536l.m120488h(input2, "surnameGeorgian");
        m78953y1(input2, C32343x.m95388F("text.travel.insurance.insured.person.screen.surname.geo", new Object[0]), new C40419j("^[ა-ჰ](?:-?[ა-ჰ])*(?<!-)$", lVar), C32343x.m95388F("text.travel.insurance.invalid.insured.last.name", new Object[0]), this.f63350k);
        Input input3 = q1.f95484j;
        C41536l.m120488h(input3, "nameEng");
        m78953y1(input3, C32343x.m95388F("text.travel.insurance.insured.person.screen.name.en", new Object[0]), new C40419j("^[a-z](?:-?[a-z])*(?<!-)$", lVar), C32343x.m95388F("text.travel.insurance.invalid.insured.first.name.int", new Object[0]), this.f63351l);
        Input input4 = q1.f95492r;
        C41536l.m120488h(input4, "surnameEng");
        m78953y1(input4, C32343x.m95388F("text.travel.insurance.insured.person.screen.surname.en", new Object[0]), new C40419j("^[a-z](?:-?[a-z])*(?<!-)$", lVar), C32343x.m95388F("text.travel.insurance.invalid.insured.last.name.int", new Object[0]), this.f63352m);
        Input input5 = q1.f95487m;
        C41536l.m120488h(input5, "personalId");
        m78954z1(this, input5, C32343x.m95388F("text.travel.insurance.insured.person.screen.id", new Object[0]), (C40419j) null, C32343x.m95388F("text.travel.insurance.invalid.insured.pin", new Object[0]), this.f63353n, 4, (Object) null);
        Input input6 = q1.f95481g;
        C41536l.m120488h(input6, "dateOfBirth");
        m78954z1(this, input6, C32343x.m95388F("text.travel.insurance.insured.person.screen.dob", new Object[0]), (C40419j) null, C32343x.m95388F("text.travel.insurance.invalid.insured.birth.date", new Object[0]), (TextWatcher) null, 20, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final void m78935E1(C19781a aVar) {
        C5023l a = C5023l.C5029f.m19565c().mo16276e(aVar.mo48065a()).mo16278g(Long.valueOf(aVar.mo48066b())).mo16275a();
        a.mo16267J1(new C19784d(new C24568j(this)));
        a.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m78936F1(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: G1 */
    private final void m78937G1(Input input, String str, TextWatcher textWatcher) {
        int selectionStart = input.getTextInput().getSelectionStart();
        input.getTextInput().removeTextChangedListener(textWatcher);
        input.setInputText(str);
        input.getTextInput().setSelection(selectionStart);
        input.getTextInput().addTextChangedListener(textWatcher);
    }

    /* renamed from: H1 */
    private final void m78938H1(List list) {
        boolean z;
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C41232r rVar = (C41232r) it.next();
            Input input = (Input) rVar.mo95688a();
            TextWatcher textWatcher = (TextWatcher) rVar.mo95689b();
            String str2 = (String) rVar.mo95690c();
            boolean z2 = !m78952x1(input.getInputText());
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = z2 & (!z);
            String inputText = input.getInputText();
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
            if (z3 && (true ^ C41536l.m120484d(inputText, str))) {
                if (str2 == null) {
                    str2 = "";
                }
                m78937G1(input, str2, textWatcher);
            }
        }
    }

    private final void observeData() {
        C24577a t1 = m78949t1();
        LiveData iw = t1.mo62768iw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(iw, viewLifecycleOwner, new C24563e(this));
        t1.mo62767gw().mo4819k(getViewLifecycleOwner(), new C24567i(new C24564f(this)));
        LiveData jw = t1.mo62769jw();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(jw, viewLifecycleOwner2, new C24565g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final void m78946p1(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
        C40178e q1 = m78947q1();
        Long i = travelInsuranceFilledInfo.mo62725i();
        if (i != null) {
            long longValue = i.longValue();
            Input input = q1.f95481g;
            String d = C32319m.m95297d(longValue, "dd.MM.yyyy");
            C41536l.m120488h(d, "formatDate(it, PATTERN_MM_DD_YYYY)");
            input.setInputText(d);
        }
        m78938H1(C41341q.m119910m(new C41232r(q1.f95485k, this.f63349j, travelInsuranceFilledInfo.mo62726j()), new C41232r(q1.f95493s, this.f63350k, travelInsuranceFilledInfo.mo62728l()), new C41232r(q1.f95484j, this.f63351l, travelInsuranceFilledInfo.mo62727k()), new C41232r(q1.f95492r, this.f63352m, travelInsuranceFilledInfo.mo62729m()), new C41232r(q1.f95487m, this.f63353n, travelInsuranceFilledInfo.mo62730p())));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final C40178e m78947q1() {
        C40178e eVar = this.f63346g;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* renamed from: s1 */
    private final C24560b m78948s1(C43064a aVar) {
        return new C24560b(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final C24577a m78949t1() {
        return (C24577a) this.f63348i.getValue();
    }

    /* renamed from: u1 */
    private final void m78950u1() {
        C40178e q1 = m78947q1();
        q1.f95486l.setText(C32343x.m95388F("text.travel.insurance.insured.person.screen.header", new Object[0]));
        q1.f95480f.getButton().setButtonText(C32343x.m95388F("text.travel.insurance.insured.person.screen.personal.button.next", new Object[0]));
        m78934D1();
        m78931A1();
    }

    /* renamed from: v1 */
    private final boolean m78951v1() {
        C40178e q1 = m78947q1();
        return q1.f95481g.mo35918a() & q1.f95485k.mo35918a() & q1.f95493s.mo35918a() & q1.f95484j.mo35918a() & q1.f95492r.mo35918a() & q1.f95487m.mo35918a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = cf1.C40445z.m117192W0(r3);
     */
    /* renamed from: x1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m78952x1(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0015
            java.lang.Character r3 = cf1.C40445z.m117192W0(r3)
            if (r3 == 0) goto L_0x0015
            char r3 = r3.charValue()
            boolean r3 = java.lang.Character.isUpperCase(r3)
            r1 = 1
            if (r3 != r1) goto L_0x0015
            r0 = r1
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.FillOtherPersonInsuranceInfo.m78952x1(java.lang.String):boolean");
    }

    /* renamed from: y1 */
    private final void m78953y1(Input input, String str, C40419j jVar, String str2, TextWatcher textWatcher) {
        C37623y yVar;
        if (jVar == null || (yVar = C37623y.C37624a.m110637b(C37623y.f90388f, C17809c.m61562a(new C17799b.C17807h(jVar), str2), (C37623y.C37625b) null, 1, (Object) null)) == null) {
            yVar = C37623y.C37624a.m110637b(C37623y.f90388f, C17809c.m61562a(C17799b.C17805f.f50686d, str2), (C37623y.C37625b) null, 1, (Object) null);
        }
        input.setHintText(str);
        Input.m50261f(input, yVar, false, false, false, 14, (Object) null);
        if (textWatcher != null) {
            input.getTextInput().addTextChangedListener(textWatcher);
        }
    }

    /* renamed from: z1 */
    static /* synthetic */ void m78954z1(FillOtherPersonInsuranceInfo fillOtherPersonInsuranceInfo, Input input, String str, C40419j jVar, String str2, TextWatcher textWatcher, int i, Object obj) {
        fillOtherPersonInsuranceInfo.m78953y1(input, str, (i & 4) != 0 ? null : jVar, str2, (i & 16) != 0 ? null : textWatcher);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f63346g = C40178e.m116420d(layoutInflater, viewGroup, false);
        StateView c = m78947q1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f63346g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("text.insurance.product.type.TRI", new Object[0]));
        m78950u1();
        observeData();
    }

    /* renamed from: r1 */
    public final C24577a.C24578a mo62756r1() {
        C24577a.C24578a aVar = this.f63347h;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
