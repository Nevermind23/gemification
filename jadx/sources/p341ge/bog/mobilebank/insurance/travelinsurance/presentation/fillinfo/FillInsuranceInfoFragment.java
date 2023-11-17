package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Patterns;
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
import b41.C31128a;
import cf1.C40419j;
import com.google.android.material.datepicker.C5023l;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import g91.C32314k;
import g91.C32319m;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import ol0.C27032a;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p380ck.C10463g;
import p603si.C17799b;
import p603si.C17809c;
import p759fv.C20559a;
import ue1.C43064a;
import ue1.C43075l;
import ul0.C28875b;
import ul0.C28876c;
import y71.C40030d;
import y71.C40034h;
import yl0.C30084a;
import yl0.C30085b;
import yl0.C30086c;
import yl0.C30087d;
import yl0.C30088e;
import yl0.C30089f;
import yl0.C30090g;
import yl0.C30091h;
import z71.C40177d;
import zl0.C30340f;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment */
public final class FillInsuranceInfoFragment extends C35651n1 {

    /* renamed from: h */
    public static final C24535a f63277h = new C24535a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C40177d f63278d;

    /* renamed from: e */
    private final C41217g f63279e;

    /* renamed from: f */
    private final C24537c f63280f = new C24537c(this);

    /* renamed from: g */
    private final C24541g f63281g = new C24541g(this);

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$a */
    public static final class C24535a {
        private C24535a() {
        }

        public /* synthetic */ C24535a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$b */
    public /* synthetic */ class C24536b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63282a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType[] r0 = p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType r1 = p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType.ME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType r1 = p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType.OTHER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f63282a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment.C24536b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$c */
    public static final class C24537c implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ FillInsuranceInfoFragment f63283d;

        C24537c(FillInsuranceInfoFragment fillInsuranceInfoFragment) {
            this.f63283d = fillInsuranceInfoFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f63283d.m78853y1().f95463i.setInfoText(this.f63283d.getString(C40034h.email_input_info_text));
            this.f63283d.m78824A1().mo62707ww(this.f63283d.m78853y1().f95463i.getInputText());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$d */
    static final class C24538d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FillInsuranceInfoFragment f63284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24538d(FillInsuranceInfoFragment fillInsuranceInfoFragment) {
            super(1);
            this.f63284d = fillInsuranceInfoFragment;
        }

        /* renamed from: a */
        public final void mo62688a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f63284d.m78828E1((C28876c) ((C31128a.C31131c) aVar).mo71340a());
                this.f63284d.m78853y1().f95476v.mo53595c();
            } else if (aVar instanceof C31128a.C31130b) {
                this.f63284d.m78853y1().f95476v.mo53597e();
            } else if (aVar instanceof C31128a.C31129a) {
                this.f63284d.m78853y1().f95476v.mo53596d();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62688a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$e */
    static final class C24539e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FillInsuranceInfoFragment f63285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24539e(FillInsuranceInfoFragment fillInsuranceInfoFragment) {
            super(1);
            this.f63285d = fillInsuranceInfoFragment;
        }

        /* renamed from: a */
        public final void mo62689a(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
            C41536l.m120489i(travelInsuranceFilledInfo, "it");
            this.f63285d.m78825B1(travelInsuranceFilledInfo);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62689a((TravelInsuranceFilledInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$f */
    static final class C24540f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FillInsuranceInfoFragment f63286d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24540f(FillInsuranceInfoFragment fillInsuranceInfoFragment) {
            super(1);
            this.f63286d = fillInsuranceInfoFragment;
        }

        /* renamed from: a */
        public final void mo62690a(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
            FillInsuranceInfoFragment fillInsuranceInfoFragment = this.f63286d;
            C41536l.m120488h(travelInsuranceFilledInfo, "info");
            fillInsuranceInfoFragment.m78852x1(travelInsuranceFilledInfo);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62690a((TravelInsuranceFilledInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$g */
    public static final class C24541g implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ FillInsuranceInfoFragment f63287d;

        C24541g(FillInsuranceInfoFragment fillInsuranceInfoFragment) {
            this.f63287d = fillInsuranceInfoFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f63287d.m78853y1().f95470p.setInfoText((CharSequence) null);
            this.f63287d.m78824A1().mo62698Aw(this.f63287d.m78853y1().f95470p.getInputText());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$h */
    static final class C24542h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f63288a;

        C24542h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f63288a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f63288a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f63288a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$i */
    static final class C24543i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FillInsuranceInfoFragment f63289d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24543i(FillInsuranceInfoFragment fillInsuranceInfoFragment) {
            super(1);
            this.f63289d = fillInsuranceInfoFragment;
        }

        /* renamed from: a */
        public final void mo62696a(Long l) {
            FillInsuranceInfoViewModel$ViewModel s1 = this.f63289d.m78824A1();
            C41536l.m120488h(l, "date");
            s1.mo62699Bw(l.longValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62696a((Long) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$j */
    static final class C24544j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FillInsuranceInfoFragment f63290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24544j(FillInsuranceInfoFragment fillInsuranceInfoFragment) {
            super(1);
            this.f63290d = fillInsuranceInfoFragment;
        }

        /* renamed from: a */
        public final void mo62697a(Long l) {
            FillInsuranceInfoViewModel$ViewModel s1 = this.f63290d.m78824A1();
            C41536l.m120488h(l, "date");
            s1.mo62708xw(l.longValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62697a((Long) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$k */
    public static final class C24545k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f63291d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24545k(Fragment fragment) {
            super(0);
            this.f63291d = fragment;
        }

        public final Fragment invoke() {
            return this.f63291d;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$l */
    public static final class C24546l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63292d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24546l(C43064a aVar) {
            super(0);
            this.f63292d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f63292d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$m */
    public static final class C24547m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f63293d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24547m(C41217g gVar) {
            super(0);
            this.f63293d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f63293d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$n */
    public static final class C24548n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63294d;

        /* renamed from: e */
        final /* synthetic */ C41217g f63295e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24548n(C43064a aVar, C41217g gVar) {
            super(0);
            this.f63294d = aVar;
            this.f63295e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f63294d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f63295e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoFragment$o */
    public static final class C24549o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f63296d;

        /* renamed from: e */
        final /* synthetic */ C41217g f63297e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24549o(Fragment fragment, C41217g gVar) {
            super(0);
            this.f63296d = fragment;
            this.f63297e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f63297e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f63296d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public FillInsuranceInfoFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24546l(new C24545k(this)));
        this.f63279e = C1514j0.m5374c(this, C41520a0.m120436b(FillInsuranceInfoViewModel$ViewModel.class), new C24547m(a), new C24548n((C43064a) null, a), new C24549o(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final FillInsuranceInfoViewModel$ViewModel m78824A1() {
        return (FillInsuranceInfoViewModel$ViewModel) this.f63279e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m78825B1(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
        int i = C24536b.f63282a[travelInsuranceFilledInfo.mo62732r().ordinal()];
        if (i == 1) {
            C8034d.m30522a(this).mo22118M(C40030d.action_fillInsuranceInfoFragment_to_InsuranceProvidersFragment, C0908e.m3336b(C41233s.m119492a(getString(C40034h.arg_filled_info), travelInsuranceFilledInfo)));
        } else if (i == 2) {
            C8034d.m30522a(this).mo22118M(C40030d.action_fillInsuranceInfoFragment_to_fillOtherPersonInsuranceInfoFragment, C0908e.m3336b(C41233s.m119492a(getString(C40034h.arg_filled_info), travelInsuranceFilledInfo)));
        }
    }

    /* renamed from: C1 */
    private final void m78826C1() {
        C40177d y1 = m78853y1();
        y1.f95466l.setProgress(50.0f);
        y1.f95468n.setText(C32343x.m95388F("text.travel.insurance.max.limit", new Object[0]));
        y1.f95459e.setTitle(C32343x.m95388F("text.travel.insurance.contact.info", new Object[0]));
        Input input = y1.f95475u;
        C41536l.m120488h(input, "startDate");
        C17799b.C17805f fVar = C17799b.C17805f.f50686d;
        Input.m50261f(input, fVar, false, false, false, 14, (Object) null);
        Input input2 = y1.f95464j;
        C41536l.m120488h(input2, "endDate");
        Input.m50261f(input2, fVar, false, false, false, 14, (Object) null);
        Input input3 = y1.f95470p;
        C41536l.m120488h(input3, "mobileNumber");
        C17799b.C17807h hVar = new C17799b.C17807h(new C40419j("^([0-9]{9}|[0-9]{12}|\\+[0-9]{12})$"));
        String string = getString(C40034h.number_input_error_text);
        C41536l.m120488h(string, "getString(R.string.number_input_error_text)");
        Input.m50261f(input3, C17809c.m61562a(hVar, string), false, false, false, 14, (Object) null);
    }

    /* renamed from: D1 */
    private final boolean m78827D1(String str) {
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final void m78828E1(C28876c cVar) {
        C40177d y1 = m78853y1();
        ChipGroup chipGroup = y1.f95462h;
        chipGroup.mo35190t();
        List<C28875b> a = cVar.mo68611a();
        ArrayList<View> arrayList = new ArrayList<>(C41343r.m119925u(a, 10));
        for (C28875b bVar : a) {
            Context context = chipGroup.getContext();
            C41536l.m120488h(context, "context");
            Chip chip = new Chip(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(bVar.mo68607b());
            chip.setActivated(C41536l.m120484d(bVar.mo68606a(), m78824A1().mo62704tw()));
            arrayList.add(chip);
        }
        C41536l.m120488h(chipGroup, "this");
        for (View o : arrayList) {
            chipGroup.mo35183o(o);
        }
        chipGroup.setOnChipActivatedChangedListener(new C30089f(this));
        y1.f95467m.setText(cVar.mo68612b());
        y1.f95469o.setText(C32314k.m95245a(m78824A1().mo62704tw()));
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m78829F1(FillInsuranceInfoFragment fillInsuranceInfoFragment, Chip chip, int i) {
        C41536l.m120489i(fillInsuranceInfoFragment, "this$0");
        C41536l.m120489i(chip, "chip");
        if (chip.isActivated()) {
            fillInsuranceInfoFragment.m78824A1().mo62705uh(i);
        }
    }

    /* renamed from: G1 */
    private final void m78830G1() {
        C40177d y1 = m78853y1();
        y1.f95475u.setOnClickListener(new C30084a(this));
        y1.f95464j.setOnClickListener(new C30085b(this));
        y1.f95461g.getButton().setOnClickListener(new C30086c(this));
        y1.f95473s.setOnClickListener(new C30087d(this));
        y1.f95471q.setOnClickListener(new C30088e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m78831H1(FillInsuranceInfoFragment fillInsuranceInfoFragment, View view) {
        C41536l.m120489i(fillInsuranceInfoFragment, "this$0");
        fillInsuranceInfoFragment.m78851v1();
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m78832I1(FillInsuranceInfoFragment fillInsuranceInfoFragment, View view) {
        C41536l.m120489i(fillInsuranceInfoFragment, "this$0");
        C21481a.onRefresh$default(fillInsuranceInfoFragment.m78824A1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m78833J1(FillInsuranceInfoFragment fillInsuranceInfoFragment, View view) {
        C41536l.m120489i(fillInsuranceInfoFragment, "this$0");
        C27032a.C27035c cVar = C27032a.C27035c.f67904f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        cVar.mo66262a(F);
        C30340f.f76263E.mo70669a().mo4576A1(fillInsuranceInfoFragment.getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m78834K1(FillInsuranceInfoFragment fillInsuranceInfoFragment, View view) {
        Long A;
        C41536l.m120489i(fillInsuranceInfoFragment, "this$0");
        C5023l.C5029f e = C5023l.C5029f.m19565c().mo16276e(fillInsuranceInfoFragment.m78854z1());
        TravelInsuranceFilledInfo travelInsuranceFilledInfo = (TravelInsuranceFilledInfo) fillInsuranceInfoFragment.m78824A1().mo62701pw().mo4814f();
        if (!(travelInsuranceFilledInfo == null || (A = travelInsuranceFilledInfo.mo62715A()) == null)) {
            C41536l.m120488h(e, "it");
            e.mo16278g(A);
        }
        C5023l a = e.mo16275a();
        a.mo16267J1(new C30090g(new C24543i(fillInsuranceInfoFragment)));
        a.mo4576A1(fillInsuranceInfoFragment.getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m78835L1(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m78836M1(FillInsuranceInfoFragment fillInsuranceInfoFragment, View view) {
        Long g;
        C41536l.m120489i(fillInsuranceInfoFragment, "this$0");
        C5023l.C5029f e = C5023l.C5029f.m19565c().mo16276e(fillInsuranceInfoFragment.m78854z1());
        TravelInsuranceFilledInfo travelInsuranceFilledInfo = (TravelInsuranceFilledInfo) fillInsuranceInfoFragment.m78824A1().mo62701pw().mo4814f();
        if (!(travelInsuranceFilledInfo == null || (g = travelInsuranceFilledInfo.mo62722g()) == null)) {
            C41536l.m120488h(e, "it");
            e.mo16278g(g);
        }
        C5023l a = e.mo16275a();
        a.mo16267J1(new C30091h(new C24544j(fillInsuranceInfoFragment)));
        a.mo4576A1(fillInsuranceInfoFragment.getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m78837N1(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    private final void observeData() {
        FillInsuranceInfoViewModel$ViewModel A1 = m78824A1();
        A1.mo62706uw().mo4819k(getViewLifecycleOwner(), new C24542h(new C24538d(this)));
        LiveData rw = A1.mo62702rw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(rw, viewLifecycleOwner, new C24539e(this));
        A1.mo62701pw().mo4819k(getViewLifecycleOwner(), new C24542h(new C24540f(this)));
    }

    /* renamed from: v1 */
    private final void m78851v1() {
        boolean z;
        boolean z2;
        C40177d y1 = m78853y1();
        boolean z3 = true;
        if (y1.f95463i.getInputText().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !m78827D1(y1.f95463i.getInputText())) {
            y1.f95463i.mo35920c();
            y1.f95463i.setInfoText(C32343x.m95388F("text.insurance.incorrect.email.format.error", new Object[0]));
        }
        if (y1.f95463i.getInputText().length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            y1.f95463i.mo35920c();
            y1.f95463i.setInfoText((CharSequence) null);
        }
        if (!m78824A1().mo62700ow()) {
            m78853y1().f95464j.getTextInput().setText((CharSequence) null);
        }
        boolean a = y1.f95475u.mo35918a();
        boolean a2 = y1.f95464j.mo35918a();
        boolean a3 = y1.f95470p.mo35918a();
        boolean a4 = y1.f95463i.mo35918a();
        if (!a || !a2 || !a3 || !a4) {
            z3 = false;
        }
        if (z3) {
            m78824A1().mo62709yw();
            C20559a.C20563d dVar = C20559a.C20563d.f55599f;
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            dVar.mo49091a(F);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m78852x1(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
        C40177d y1 = m78853y1();
        Long A = travelInsuranceFilledInfo.mo62715A();
        if (A != null) {
            long longValue = A.longValue();
            Input input = y1.f95475u;
            String b = C32319m.m95295b(longValue);
            C41536l.m120488h(b, "formatDate(it)");
            input.setInputText(b);
        }
        Long g = travelInsuranceFilledInfo.mo62722g();
        if (g != null) {
            long longValue2 = g.longValue();
            Input input2 = y1.f95464j;
            String b2 = C32319m.m95295b(longValue2);
            C41536l.m120488h(b2, "formatDate(it)");
            input2.setInputText(b2);
        }
        y1.f95471q.setHintText(C32343x.m95388F("text.travel.insurance.dialog.insured.person.choice.header", new Object[0]));
        y1.f95471q.getTextInput().setText(travelInsuranceFilledInfo.mo62733s());
        y1.f95470p.getTextInput().removeTextChangedListener(this.f63281g);
        y1.f95463i.getTextInput().removeTextChangedListener(this.f63280f);
        y1.f95469o.setText(C32314k.m95245a(m78824A1().mo62704tw()));
        if (travelInsuranceFilledInfo.mo62734t() != null && !C41536l.m120484d(travelInsuranceFilledInfo.mo62734t(), y1.f95470p.getInputText())) {
            y1.f95470p.setInputText(travelInsuranceFilledInfo.mo62734t());
            y1.f95470p.getTextInput().setSelection(travelInsuranceFilledInfo.mo62734t().length());
        }
        if (travelInsuranceFilledInfo.mo62721f() != null && !C41536l.m120484d(travelInsuranceFilledInfo.mo62721f(), y1.f95463i.getInputText())) {
            y1.f95463i.setInputText(travelInsuranceFilledInfo.mo62721f());
            y1.f95463i.getTextInput().setSelection(travelInsuranceFilledInfo.mo62721f().length());
            m78853y1().f95463i.setInfoText(getString(C40034h.email_input_info_text));
        }
        y1.f95470p.getTextInput().addTextChangedListener(this.f63281g);
        y1.f95463i.getTextInput().addTextChangedListener(this.f63280f);
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final C40177d m78853y1() {
        C40177d dVar = this.f63278d;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* renamed from: z1 */
    private final CalendarConstraints m78854z1() {
        long W1 = C5023l.m19556W1();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(W1);
        long time = C32319m.m95292L(instance.getTime(), 2).getTime();
        DateValidatorPointForward a = DateValidatorPointForward.m19410a(W1);
        C41536l.m120488h(a, "from(today)");
        DateValidatorPointBackward a2 = DateValidatorPointBackward.m19406a(time);
        C41536l.m120488h(a2, "before(endDate)");
        CalendarConstraints.DateValidator d = CompositeDateValidator.m19386d(C41341q.m119910m(a, a2));
        C41536l.m120488h(d, "allOf(validators)");
        CalendarConstraints a3 = new CalendarConstraints.C4986b().mo16158e(d).mo16157d(W1).mo16155b(time).mo16156c(W1).mo16154a();
        C41536l.m120488h(a3, "Builder()\n            .s…day)\n            .build()");
        return a3;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f63278d = C40177d.m116416d(layoutInflater, viewGroup, false);
        StateView c = m78853y1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f63278d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("text.insurance.product.type.TRI", new Object[0]));
        m78826C1();
        m78830G1();
        observeData();
    }
}
