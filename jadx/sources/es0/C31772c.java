package es0;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
import es0.C31789h;
import es0.C31794i;
import fd0.C20463a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
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
import lr0.C37128c;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import p341ge.bog.mobilebank.loans.presentation.loancancelation.LoanInstallmentReversalSuccessActivity;
import p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.C32683a;
import p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalCancelData;
import p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalSuccessData;
import p380ck.C10463g;
import p420fh.C12902d;
import p420fh.C12910e;
import pr0.C37942a;
import ue1.C43064a;
import ue1.C43075l;
import yr0.C40047a;

/* renamed from: es0.c */
public final class C31772c extends C32683a {

    /* renamed from: O */
    public static final C31773a f78388O = new C31773a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C37942a f78389K;

    /* renamed from: L */
    private final C41217g f78390L = C41219i.m119470b(new C31774b(this));

    /* renamed from: M */
    public C31789h.C31792c f78391M;

    /* renamed from: N */
    private final C41217g f78392N;

    /* renamed from: es0.c$a */
    public static final class C31773a {
        private C31773a() {
        }

        public /* synthetic */ C31773a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31772c mo72216a(InstallmentReversalCancelData installmentReversalCancelData) {
            C41536l.m120489i(installmentReversalCancelData, "data");
            C31772c cVar = new C31772c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("INSTALLMENT_REVERSAL_DATA_KEY", installmentReversalCancelData)));
            return cVar;
        }
    }

    /* renamed from: es0.c$b */
    static final class C31774b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31772c f78393d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31774b(C31772c cVar) {
            super(0);
            this.f78393d = cVar;
        }

        /* renamed from: b */
        public final InstallmentReversalCancelData invoke() {
            Bundle arguments = this.f78393d.getArguments();
            InstallmentReversalCancelData installmentReversalCancelData = arguments != null ? (InstallmentReversalCancelData) arguments.getParcelable("INSTALLMENT_REVERSAL_DATA_KEY") : null;
            C41536l.m120486f(installmentReversalCancelData);
            return installmentReversalCancelData;
        }
    }

    /* renamed from: es0.c$c */
    static final class C31775c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f78394a;

        C31775c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f78394a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f78394a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f78394a.invoke(obj);
        }
    }

    /* renamed from: es0.c$d */
    static final class C31776d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31772c f78395d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31776d(C31772c cVar) {
            super(1);
            this.f78395d = cVar;
        }

        /* renamed from: a */
        public final void mo72220a(C31128a aVar) {
            if (aVar instanceof C31128a.C31129a) {
                this.f78395d.m93984n2().f91085l.mo53596d();
            } else if (aVar instanceof C31128a.C31130b) {
                this.f78395d.m93984n2().f91085l.mo53597e();
            } else if (aVar instanceof C31128a.C31131c) {
                this.f78395d.m93984n2().f91085l.mo53595c();
                this.f78395d.m93983m2((List) ((C31128a.C31131c) aVar).mo71340a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72220a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: es0.c$e */
    static final class C31777e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31772c f78396d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31777e(C31772c cVar) {
            super(1);
            this.f78396d = cVar;
        }

        /* renamed from: a */
        public final void mo72221a(C31794i iVar) {
            C41536l.m120489i(iVar, "event");
            if (iVar instanceof C31794i.C31797c) {
                C12910e.m48792j(this.f78396d, C32343x.m95388F("online.inst.reversal.application.reason.not.selected", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
            } else if (iVar instanceof C31794i.C31796b) {
                this.f78396d.m93991v2((C31794i.C31796b) iVar);
            } else if (iVar instanceof C31794i.C31795a) {
                this.f78396d.handleError(((C31794i.C31795a) iVar).mo72231a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72221a((C31794i) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: es0.c$f */
    static final class C31778f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31772c f78397d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31778f(C31772c cVar) {
            super(1);
            this.f78397d = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f78397d.m93984n2().f91080g.getButton();
            C41536l.m120488h(bool, "isLoading");
            button.setLoading(bool.booleanValue());
            this.f78397d.m93982l2(!bool.booleanValue());
            this.f78397d.mo4586v1(!bool.booleanValue());
        }
    }

    /* renamed from: es0.c$g */
    public static final class C31779g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f78398d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31779g(Fragment fragment) {
            super(0);
            this.f78398d = fragment;
        }

        public final Fragment invoke() {
            return this.f78398d;
        }
    }

    /* renamed from: es0.c$h */
    public static final class C31780h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f78399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31780h(C43064a aVar) {
            super(0);
            this.f78399d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f78399d.invoke();
        }
    }

    /* renamed from: es0.c$i */
    public static final class C31781i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f78400d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31781i(C41217g gVar) {
            super(0);
            this.f78400d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f78400d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: es0.c$j */
    public static final class C31782j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f78401d;

        /* renamed from: e */
        final /* synthetic */ C41217g f78402e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31782j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f78401d = aVar;
            this.f78402e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f78401d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f78402e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: es0.c$k */
    static final class C31783k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31772c f78403d;

        /* renamed from: es0.c$k$a */
        static final class C31784a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C31772c f78404d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31784a(C31772c cVar) {
                super(0);
                this.f78404d = cVar;
            }

            /* renamed from: b */
            public final C31789h invoke() {
                C31789h.C31792c r2 = this.f78404d.mo72215r2();
                InstallmentReversalCancelData j2 = this.f78404d.m93987q2();
                C41536l.m120488h(j2, "data");
                return r2.mo32823a(j2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31783k(C31772c cVar) {
            super(0);
            this.f78403d = cVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C31784a(this.f78403d));
        }
    }

    public C31772c() {
        C31783k kVar = new C31783k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C31780h(new C31779g(this)));
        this.f78392N = C1514j0.m5374c(this, C41520a0.m120436b(C31789h.class), new C31781i(a), new C31782j((C43064a) null, a), kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m93982l2(boolean z) {
        RadioGroup radioGroup = m93984n2().f91083j;
        int childCount = radioGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = radioGroup.getChildAt(i);
            C41536l.m120487g(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
            RadioButton radioButton = (RadioButton) childAt;
            if (radioButton.getId() != radioGroup.getCheckedRadioButtonId()) {
                radioButton.setEnabled(z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final void m93983m2(List list) {
        RadioGroup radioGroup = m93984n2().f91083j;
        radioGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20463a aVar = (C20463a) it.next();
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            RadioButtonView radioButtonView = new RadioButtonView(requireContext, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
            radioButtonView.setId(View.generateViewId());
            radioButtonView.setTag(aVar.mo49003c());
            radioButtonView.setText(C32343x.m95388F(aVar.mo49001a(), new Object[0]));
            radioButtonView.setMinHeight((int) radioButtonView.getResources().getDimension(C37128c.radio_button_min_height));
            radioButtonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            radioGroup.addView(radioButtonView);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final C37942a m93984n2() {
        C37942a aVar = this.f78389K;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: o2 */
    private final String m93985o2() {
        Object obj;
        RadioGroup radioGroup = m93984n2().f91083j;
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        if (radioButton != null) {
            obj = radioButton.getTag();
        } else {
            obj = null;
        }
        return String.valueOf(obj);
    }

    /* renamed from: p2 */
    private final String m93986p2() {
        CharSequence charSequence;
        RadioGroup radioGroup = m93984n2().f91083j;
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        if (radioButton != null) {
            charSequence = radioButton.getText();
        } else {
            charSequence = null;
        }
        return String.valueOf(charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final InstallmentReversalCancelData m93987q2() {
        return (InstallmentReversalCancelData) this.f78390L.getValue();
    }

    /* renamed from: s2 */
    private final C31789h m93988s2() {
        return (C31789h) this.f78392N.getValue();
    }

    /* renamed from: t2 */
    private final void m93989t2() {
        m93984n2().f91084k.setOnClickListener(new C31771b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m93990u2(C31772c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m93988s2().mo72224c();
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m93991v2(C31794i.C31796b bVar) {
        C40047a.C40056i iVar = C40047a.C40056i.f95185d;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        iVar.mo93924c(F);
        LoanInstallmentReversalSuccessActivity.C32678a aVar = LoanInstallmentReversalSuccessActivity.f80437H;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo74306a(requireContext, new InstallmentReversalSuccessData(bVar.mo72236b(), bVar.mo72235a()));
    }

    /* renamed from: w2 */
    private final void m93992w2() {
        C31789h s2 = m93988s2();
        s2.mo72226nw().mo4819k(getViewLifecycleOwner(), new C31775c(new C31776d(this)));
        LiveData ow = s2.mo72227ow();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(ow, viewLifecycleOwner, new C31777e(this));
        s2.mo72225mw().mo4819k(getViewLifecycleOwner(), new C31775c(new C31778f(this)));
    }

    /* renamed from: x2 */
    private final void m93993x2() {
        FixedButtonView fixedButtonView = m93984n2().f91080g;
        m93995z2();
        fixedButtonView.getButton().setButtonText(C32343x.m95388F("online.inst.reversal.application.dialog.primary.button", new Object[0]));
        fixedButtonView.getButton().setOnClickListener(new C31770a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m93994y2(C31772c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m93988s2().mo72228pw(cVar.m93984n2().f91083j.getCheckedRadioButtonId(), cVar.m93985o2(), cVar.m93986p2());
    }

    /* renamed from: z2 */
    private final void m93995z2() {
        InlineFeedback2 inlineFeedback2 = m93984n2().f91081h;
        inlineFeedback2.setButtonVisible(false);
        inlineFeedback2.setStatus(InlineFeedback2.C13350a.INFO);
        inlineFeedback2.setTitle(C32343x.m95388F("online.inst.reversal.application.dialog.info.text", new Object[0]));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f78389K = C37942a.m111512d(getLayoutInflater(), viewGroup, true);
    }

    /* renamed from: b */
    public void mo26371b() {
        if (!C41536l.m120484d(m93988s2().mo72225mw().mo4814f(), Boolean.TRUE)) {
            super.mo26371b();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f78389K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        mo26370a2(C32343x.m95388F("online.inst.reversal.application.dialog.text", new Object[0]));
        super.onViewCreated(view, bundle);
        m93993x2();
        m93992w2();
        m93989t2();
    }

    /* renamed from: r2 */
    public final C31789h.C31792c mo72215r2() {
        C31789h.C31792c cVar = this.f78391M;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
