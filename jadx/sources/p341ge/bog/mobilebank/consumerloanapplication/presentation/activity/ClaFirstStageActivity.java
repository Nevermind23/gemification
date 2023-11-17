package p341ge.bog.mobilebank.consumerloanapplication.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import g91.C32290b1;
import g91.C32303f;
import g91.C32314k;
import g91.C32343x;
import h80.C24902i;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import j90.C25360c;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.textgroup.TextGroupView;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ClaDetailsUiModel;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ResultData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.viewmodel.ClaFirstStageViewModel;
import p341ge.bog.mobilebank.model.Client;
import q31.C38122f;
import q31.C38125h;
import u70.C28606b;
import u70.C28607c;
import u70.C28609e;
import ue1.C43064a;
import ue1.C43075l;
import z80.C30251l;
import z80.C30252m;
import z80.C30253n;
import z80.C30254o;
import z80.C30255p;
import z80.C30256q;
import z80.C30257r;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity */
public final class ClaFirstStageActivity extends C22613c {

    /* renamed from: J */
    public static final C22569a f59670J = new C22569a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public Client f59671G;

    /* renamed from: H */
    private final C41217g f59672H = new C1617p0(C41520a0.m120436b(ClaFirstStageViewModel.class), new C22590v(this), new C22589u(this), new C22591w((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f59673I = C41219i.m119470b(new C22570b(this));

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$a */
    public static final class C22569a {
        private C22569a() {
        }

        public /* synthetic */ C22569a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo55979a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, ClaFirstStageActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$b */
    static final class C22570b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageActivity f59674d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22570b(ClaFirstStageActivity claFirstStageActivity) {
            super(0);
            this.f59674d = claFirstStageActivity;
        }

        /* renamed from: b */
        public final C24902i invoke() {
            C24902i a = C24902i.m79590a(this.f59674d.findViewById(C28606b.f72570C0));
            C41536l.m120488h(a, "bind(findViewById(R.id.root))");
            return a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$c */
    static final class C22571c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageActivity f59675d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22571c(ClaFirstStageActivity claFirstStageActivity) {
            super(1);
            this.f59675d = claFirstStageActivity;
        }

        /* renamed from: a */
        public final void mo55981a(ResultData resultData) {
            C41536l.m120489i(resultData, "resultData");
            this.f59675d.m73196b3(resultData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55981a((ResultData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$d */
    static final class C22572d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageActivity f59676d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22572d(ClaFirstStageActivity claFirstStageActivity) {
            super(1);
            this.f59676d = claFirstStageActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f59676d.m73190U2().f63966i;
            C41536l.m120488h(bool, "isButtonEnabled");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$e */
    static final class C22573e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageActivity f59677d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22573e(ClaFirstStageActivity claFirstStageActivity) {
            super(1);
            this.f59677d = claFirstStageActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m73214b(C24902i iVar) {
            C41536l.m120489i(iVar, "$this_apply");
            iVar.f63980w.smoothScrollTo(0, iVar.f63970m.getBottom());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C24902i L2 = this.f59677d.m73190U2();
            InlineFeedback inlineFeedback = L2.f63970m;
            C41536l.m120488h(inlineFeedback, "loanInvalidAmount");
            C41536l.m120488h(bool, "isInvalidAmount");
            C32343x.m95483r1(inlineFeedback, bool.booleanValue(), false, 2, (Object) null);
            if (bool.booleanValue()) {
                InlineFeedback inlineFeedback2 = L2.f63963f;
                C41536l.m120488h(inlineFeedback2, "calculationFeedback");
                C32343x.m95455i0(inlineFeedback2);
                L2.f63980w.post(new C22610a(L2));
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$f */
    /* synthetic */ class C22574f extends C41535k implements C43075l {
        C22574f(Object obj) {
            super(1, obj, ClaFirstStageActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55984b(boolean z) {
            ((ClaFirstStageActivity) this.receiver).m73195a3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55984b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$g */
    /* synthetic */ class C22575g extends C41535k implements C43075l {
        C22575g(Object obj) {
            super(1, obj, ClaFirstStageActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo55985b(C21503d.C21504a aVar) {
            ((ClaFirstStageActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55985b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$h */
    static final class C22576h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageActivity f59678d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22576h(ClaFirstStageActivity claFirstStageActivity) {
            super(1);
            this.f59678d = claFirstStageActivity;
        }

        /* renamed from: a */
        public final void mo55986a(boolean z) {
            CardView cardView = this.f59678d.m73190U2().f63975r;
            C41536l.m120488h(cardView, "binding.processingProgressBarContainer");
            C32343x.m95483r1(cardView, z, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55986a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$i */
    /* synthetic */ class C22577i extends C41535k implements C43075l {
        C22577i(Object obj) {
            super(1, obj, ClaFirstStageActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo55987b(C21503d.C21504a aVar) {
            ((ClaFirstStageActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55987b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$j */
    /* synthetic */ class C22578j extends C41535k implements C43075l {
        C22578j(Object obj) {
            super(1, obj, ClaFirstStageActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55988b(boolean z) {
            ((ClaFirstStageActivity) this.receiver).m73195a3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55988b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$k */
    static final class C22579k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageActivity f59679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22579k(ClaFirstStageActivity claFirstStageActivity) {
            super(1);
            this.f59679d = claFirstStageActivity;
        }

        /* renamed from: a */
        public final void mo55989a(ClaDetailsUiModel claDetailsUiModel) {
            C41536l.m120489i(claDetailsUiModel, "details");
            C24902i unused = this.f59679d.m73204j3(claDetailsUiModel);
            this.f59679d.m73197c3(claDetailsUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55989a((ClaDetailsUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$l */
    static final class C22580l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageActivity f59680d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22580l(ClaFirstStageActivity claFirstStageActivity) {
            super(1);
            this.f59680d = claFirstStageActivity;
        }

        /* renamed from: a */
        public final void mo55990a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f59680d.mo52674G1(aVar);
            CardView cardView = this.f59680d.m73190U2().f63978u;
            C41536l.m120488h(cardView, "binding.retryButtonContainer");
            C32343x.m95447f1(cardView);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55990a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$m */
    /* synthetic */ class C22581m extends C41535k implements C43075l {
        C22581m(Object obj) {
            super(1, obj, ClaFirstStageActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55991b(boolean z) {
            ((ClaFirstStageActivity) this.receiver).m73195a3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55991b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$n */
    static final class C22582n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageActivity f59681d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22582n(ClaFirstStageActivity claFirstStageActivity) {
            super(1);
            this.f59681d = claFirstStageActivity;
        }

        /* renamed from: a */
        public final void mo55992a(C25360c cVar) {
            C41536l.m120489i(cVar, "loanCalculation");
            boolean unused = this.f59681d.m73202h3(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55992a((C25360c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$o */
    static final class C22583o extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22583o f59682d = new C22583o();

        C22583o() {
            super(1);
        }

        /* renamed from: a */
        public final void mo55993a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55993a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$p */
    /* synthetic */ class C22584p extends C41535k implements C43075l {
        C22584p(Object obj) {
            super(1, obj, ClaFirstStageActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55994b(boolean z) {
            ((ClaFirstStageActivity) this.receiver).m73195a3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55994b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$q */
    static final class C22585q extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22585q f59683d = new C22585q();

        C22585q() {
            super(1);
        }

        /* renamed from: a */
        public final void mo55995a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55995a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$r */
    static final class C22586r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageActivity f59684d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22586r(ClaFirstStageActivity claFirstStageActivity) {
            super(1);
            this.f59684d = claFirstStageActivity;
        }

        /* renamed from: a */
        public final void mo55996a(ClaDetailsUiModel claDetailsUiModel) {
            C41536l.m120489i(claDetailsUiModel, "loanDetails");
            this.f59684d.m73205k3(claDetailsUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55996a((ClaDetailsUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$s */
    static final class C22587s implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f59685a;

        C22587s(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f59685a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f59685a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f59685a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$t */
    static final class C22588t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ClaFirstStageActivity f59686d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22588t(ClaFirstStageActivity claFirstStageActivity) {
            super(1);
            this.f59686d = claFirstStageActivity;
        }

        /* renamed from: a */
        public final void mo55999a(String str) {
            C41536l.m120489i(str, "rsContract");
            this.f59686d.m73191W2().mo56270ox(str);
            this.f59686d.m73191W2().mo56260P6();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55999a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$u */
    public static final class C22589u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59687d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22589u(ComponentActivity componentActivity) {
            super(0);
            this.f59687d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f59687d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$v */
    public static final class C22590v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22590v(ComponentActivity componentActivity) {
            super(0);
            this.f59688d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59688d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity$w */
    public static final class C22591w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59689d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59690e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22591w(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59689d = aVar;
            this.f59690e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59689d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59690e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: T2 */
    private final SpannableStringBuilder m73189T2(String str, String str2) {
        SpannableStringBuilder append = new SpannableStringBuilder().append(C32343x.m95388F("CLA.page.I.calc.monthly.payment", new Object[0]), new TextAppearanceSpan(this, C28609e.ClaAnnualPaymentTitleStyle), 33);
        String h = C32303f.m95197h(str2);
        SpannableStringBuilder append2 = append.append(" " + str + h, new TextAppearanceSpan(this, C28609e.ClaAnnualPaymentValueStyle), 33);
        C41536l.m120488h(append2, "SpannableStringBuilder()…E_EXCLUSIVE\n            )");
        return append2;
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final C24902i m73190U2() {
        return (C24902i) this.f59673I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final ClaFirstStageViewModel m73191W2() {
        return (ClaFirstStageViewModel) this.f59672H.getValue();
    }

    /* renamed from: X2 */
    private final void m73192X2() {
        C21484c.m69411c(m73191W2().mo56261Vw(), this, new C22579k(this), new C22578j(this), new C22580l(this));
        C21484c.m69411c(m73191W2().mo56259Ow(), this, new C22582n(this), new C22581m(this), C22583o.f59682d);
        C21484c.m69412d(m73191W2().mo56257L0(), this, (C43075l) null, new C22584p(this), C22585q.f59683d, 2, (Object) null);
        C37224b.m109963b(m73191W2().mo56263Xw(), this, new C22586r(this));
        C37224b.m109963b(m73191W2().mo56266fn(), this, new C22571c(this));
        m73191W2().mo56258Nw().mo4819k(this, new C22587s(new C22572d(this)));
        m73191W2().mo56267iq().mo4819k(this, new C22587s(new C22573e(this)));
        C21484c.m69412d(m73191W2().mo56262Ww(), this, (C43075l) null, new C22574f(this), new C22575g(this), 2, (Object) null);
        C21484c.m69412d(m73191W2().mo56271te(), this, (C43075l) null, new C22576h(this), new C22577i(this), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m73193Y2(ClaFirstStageActivity claFirstStageActivity, View view) {
        C41536l.m120489i(claFirstStageActivity, "this$0");
        C32290b1.m95111a(claFirstStageActivity);
        claFirstStageActivity.m73191W2().mo56268k0();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m73194Z2(ClaFirstStageActivity claFirstStageActivity, View view) {
        C41536l.m120489i(claFirstStageActivity, "this$0");
        claFirstStageActivity.m73191W2().mo56269mx();
        CardView cardView = claFirstStageActivity.m73190U2().f63978u;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final void m73195a3(boolean z) {
        CardView cardView = m73190U2().f63976s;
        C41536l.m120488h(cardView, "binding.progressBar");
        C32343x.m95483r1(cardView, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final void m73196b3(ResultData resultData) {
        LimitResultActivity.f59889L.mo56218a(this, resultData);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m73197c3(ClaDetailsUiModel claDetailsUiModel) {
        C24902i U2 = m73190U2();
        U2.f63964g.setText(C32343x.m95388F("CLA.page.I.loan.calculator.header", new Object[0]));
        BigInputView bigInputView = U2.f63969l;
        bigInputView.setInfoText(C32343x.m95388F("CLA.page.I.add.amount", new Object[0]));
        String a = C32314k.m95245a(claDetailsUiModel.mo56192g());
        bigInputView.setSuffix(" " + a);
        bigInputView.setTextChangeListener(new C30254o(this));
        U2.f63971n.setText(C32343x.m95388F("CLA.page.I.select.term", new Object[0]));
        ChipGroup chipGroup = U2.f63981x;
        chipGroup.mo35190t();
        for (LookupUiModel a2 : claDetailsUiModel.mo56196j()) {
            ChipGroup chipGroup2 = U2.f63981x;
            Chip chip = new Chip(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(C32343x.m95388F(a2.mo52391a(), new Object[0]));
            chipGroup2.mo35183o(chip);
        }
        chipGroup.setOnChipActivatedChangedListener(new C30255p(claDetailsUiModel, this));
        U2.f63979v.addOnLayoutChangeListener(new C30256q(U2));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m73198d3(ClaDetailsUiModel claDetailsUiModel, ClaFirstStageActivity claFirstStageActivity, Chip chip, int i) {
        C41536l.m120489i(claDetailsUiModel, "$details");
        C41536l.m120489i(claFirstStageActivity, "this$0");
        C41536l.m120489i(chip, "chip");
        chip.setActivated(true);
        LookupUiModel lookupUiModel = (LookupUiModel) C41358y.m120010Z(claDetailsUiModel.mo56196j(), i);
        if (lookupUiModel != null) {
            claFirstStageActivity.m73191W2().mo56265dx(lookupUiModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m73199e3(C24902i iVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C41536l.m120489i(iVar, "$this_with");
        if (i8 > i4) {
            NestedScrollView nestedScrollView = iVar.f63980w;
            nestedScrollView.post(new C30257r(nestedScrollView, iVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public static final void m73200f3(NestedScrollView nestedScrollView, C24902i iVar) {
        C41536l.m120489i(nestedScrollView, "$this_apply");
        C41536l.m120489i(iVar, "$this_with");
        nestedScrollView.scrollTo(0, iVar.f63980w.getBottom());
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m73201g3(ClaFirstStageActivity claFirstStageActivity, String str) {
        C41536l.m120489i(claFirstStageActivity, "this$0");
        claFirstStageActivity.m73191W2().mo56264d(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public final boolean m73202h3(C25360c cVar) {
        C24902i U2 = m73190U2();
        String a = cVar.mo63940a();
        String b = cVar.mo63941b();
        InlineFeedback inlineFeedback = U2.f63963f;
        C41536l.m120488h(inlineFeedback, "setLoanCalculationData$lambda$17$lambda$15");
        C32343x.m95447f1(inlineFeedback);
        inlineFeedback.setTitleText(m73189T2(a, b));
        inlineFeedback.setCaptionText(C32343x.m95388F("CLA.page.I.calc.explanatory.text", new Object[0]));
        return inlineFeedback.post(new C30253n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m73203i3(ClaFirstStageActivity claFirstStageActivity) {
        C41536l.m120489i(claFirstStageActivity, "this$0");
        claFirstStageActivity.m73190U2().f63980w.smoothScrollTo(0, claFirstStageActivity.m73190U2().f63963f.getBottom(), 500);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final C24902i m73204j3(ClaDetailsUiModel claDetailsUiModel) {
        String str;
        C24902i U2 = m73190U2();
        U2.f63974q.setTitle(C32343x.m95388F("CLA.page.I.explanatory.header", new Object[0]));
        U2.f63974q.setText(C32343x.m95388F("CLA.page.I.explanatory.text", new Object[0]));
        U2.f63972o.setTitle(C32343x.m95388F("CLA.page.I.max.amount", new Object[0]));
        U2.f63972o.setBottomTitle(C32343x.m95408P(claDetailsUiModel.mo56189e(), claDetailsUiModel.mo56192g()));
        U2.f63973p.setTitle(C32343x.m95388F("CLA.page.I.max.term", new Object[0]));
        TextGroupView textGroupView = U2.f63973p;
        LookupUiModel lookupUiModel = (LookupUiModel) C41358y.m120020j0(claDetailsUiModel.mo56196j());
        if (lookupUiModel != null) {
            str = lookupUiModel.mo52391a();
        } else {
            str = null;
        }
        textGroupView.setBottomTitle(C32343x.m95388F(str, new Object[0]));
        U2.f63966i.setButtonText(C32343x.m95388F("CLA.page.I.send.button", new Object[0]));
        U2.f63966i.setEnabled(false);
        InlineFeedback inlineFeedback = U2.f63970m;
        String h = C32303f.m95197h(claDetailsUiModel.mo56192g());
        C41536l.m120488h(h, "getCcyLogo(productCurrency)");
        inlineFeedback.setTitleText(C32343x.m95388F("credit.application.CL.product.details.wizard.field.amount.invalid", claDetailsUiModel.mo56191f(), claDetailsUiModel.mo56189e(), h));
        return U2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public final void m73205k3(ClaDetailsUiModel claDetailsUiModel) {
        C38122f c = C38125h.m112238c(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C38122f.C38123a.m112212h(c, (String) null, supportFragmentManager, this, new C22588t(this), 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C28607c.activity_cla_first_stage;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m73192X2();
        m73190U2().f63966i.setOnClickListener(new C30251l(this));
        m73190U2().f63977t.mo3946b().setOnClickListener(new C30252m(this));
        m73190U2().f63965h.mo84643a(mo55977V2().getUserInfo().isRBClient(), mo86422A1().mo48811h().mo90435e());
    }

    /* renamed from: V2 */
    public final Client mo55977V2() {
        Client client = this.f59671G;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    public void onBackPressed() {
        if (m73190U2().f63975r.getVisibility() != 0) {
            super.onBackPressed();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("CLA.main.header", new Object[0]);
    }
}
