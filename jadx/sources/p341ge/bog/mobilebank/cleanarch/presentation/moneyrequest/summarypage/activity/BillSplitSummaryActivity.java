package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity;

import a30.C19151a;
import a30.C19159d;
import a81.C30772sa;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import b30.C19329a;
import c30.C19456a;
import g91.C32290b1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m41.C37223a;
import n20.C26360b;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.MoneyRequestResultActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.MoneyRequestSuccessItem;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.wizardplugin.MoneyRequestSummaryWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p90.C27397q;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity */
public final class BillSplitSummaryActivity extends C30772sa {

    /* renamed from: F */
    private final C41217g f58274F = C41219i.m119470b(new C21861a(this));
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C19456a f58275G = new C19456a();

    /* renamed from: H */
    private final C41217g f58276H = new C1617p0(C41520a0.m120436b(BillSplitSummaryViewModel.class), new C21883w(this), new C21882v(this), new C21884x((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$a */
    static final class C21861a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58277d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21861a(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(0);
            this.f58277d = billSplitSummaryActivity;
        }

        /* renamed from: b */
        public final C27397q invoke() {
            C27397q a = C27397q.m84891a(this.f58277d.findViewById(C10322k.summary_activity));
            C41536l.m120488h(a, "bind(findViewById(R.id.summary_activity))");
            return a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$b */
    static final class C21862b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58278d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21862b(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58278d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54457a(C37223a aVar) {
            C41536l.m120489i(aVar, "it");
            Boolean bool = (Boolean) aVar.mo90296a();
            if (bool != null) {
                BillSplitSummaryActivity billSplitSummaryActivity = this.f58278d;
                if (bool.booleanValue()) {
                    BillSplitSummaryActivity.m70816O2(billSplitSummaryActivity, 0, (View) null, 2, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54457a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$c */
    static final class C21863c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58279d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21863c(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58279d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54458a(boolean z) {
            FrameLayout frameLayout = this.f58279d.m70811J2().f69562g;
            C41536l.m120488h(frameLayout, "binding.progressBarFrame");
            C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54458a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$d */
    static final class C21864d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58280d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21864d(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58280d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54459a(List list) {
            this.f58280d.f58275G.mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54459a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$e */
    static final class C21865e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58281d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21865e(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58281d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54460a(MoneyRequestSuccessItem moneyRequestSuccessItem) {
            C41536l.m120489i(moneyRequestSuccessItem, "it");
            this.f58281d.setResult(-1);
            this.f58281d.finish();
            MoneyRequestResultActivity.f58136H.mo54343a(this.f58281d, moneyRequestSuccessItem, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54460a((MoneyRequestSuccessItem) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$f */
    static final class C21866f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21866f(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58282d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54461a(boolean z) {
            if (z) {
                this.f58282d.m70811J2().f69562g.setVisibility(0);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54461a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$g */
    static final class C21867g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21867g(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58283d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54462a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f58283d.m70811J2().f69562g.setVisibility(8);
            this.f58283d.mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54462a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$h */
    static final class C21868h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21868h(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58284d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54463a(BillSplitSummaryViewModel.C21913g gVar) {
            String str;
            this.f58284d.m70811J2().f69561f.setEnabled(gVar.mo54516b());
            Double a = gVar.mo54515a();
            if (a == null || (str = C32343x.m95410Q(a.doubleValue(), "GEL", false, 2, (Object) null)) == null) {
                str = "";
            }
            this.f58284d.m70811J2().f69561f.setText(this.f58284d.getString(C10328q.bill_split_button_split_amount, new Object[]{str}));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54463a((BillSplitSummaryViewModel.C21913g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$i */
    static final class C21869i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21869i f58285d = new C21869i();

        C21869i() {
            super(1);
        }

        /* renamed from: a */
        public final void mo54464a(C41224m mVar) {
            String str = (String) mVar.mo95676b();
            C36546y.m108282F().mo27152s("money_request", str, (String) mVar.mo95675a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54464a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$j */
    static final class C21870j implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f58286a;

        C21870j(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f58286a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f58286a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f58286a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$k */
    static final class C21871k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58287d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21871k(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58287d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54467a(double d) {
            this.f58287d.m70812K2().mo54506bx(d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54467a(((Number) obj).doubleValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$l */
    static final class C21872l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58288d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21872l(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58288d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54468a(boolean z) {
            this.f58288d.m70812K2().mo54501Sw(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54468a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$m */
    static final class C21873m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58289d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21873m(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58289d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54469a(View view) {
            C41536l.m120489i(view, "it");
            BillSplitSummaryActivity billSplitSummaryActivity = this.f58289d;
            billSplitSummaryActivity.m70815N2(billSplitSummaryActivity.m70812K2().mo54499Qw("COMMENT_WIZARD_ID"), view);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54469a((View) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$n */
    static final class C21874n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21874n(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58290d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54470a(View view) {
            C41536l.m120489i(view, "it");
            BillSplitSummaryActivity billSplitSummaryActivity = this.f58290d;
            billSplitSummaryActivity.m70815N2(billSplitSummaryActivity.m70812K2().mo54499Qw("ACCOUNT_WIZARD_ID"), view);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54470a((View) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$o */
    static final class C21875o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58291d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21875o(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(0);
            this.f58291d = billSplitSummaryActivity;
        }

        public final void invoke() {
            C36546y.m108282F().mo27152s("money_request", "BILL_SPLIT", "mrs_details_add_new_participant");
            C26360b.f66777a.mo65550a(this.f58291d);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$p */
    static final class C21876p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58292d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21876p(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58292d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54471a(C19151a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f58292d.m70812K2().mo54504Xw(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54471a((C19151a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$q */
    static final class C21877q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58293d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21877q(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(0);
            this.f58293d = billSplitSummaryActivity;
        }

        public final void invoke() {
            C36546y.m108282F().mo27152s("money_request", "BILL_SPLIT", "mrs_details_reset_participant_amounts");
            this.f58293d.m70812K2().mo54505Zw();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$r */
    static final class C21878r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58294d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21878r(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(1);
            this.f58294d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54472a(C19159d dVar) {
            C41536l.m120489i(dVar, "it");
            this.f58294d.m70812K2().mo54503Vw(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54472a((C19159d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$s */
    static final class C21879s extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58295d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21879s(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(2);
            this.f58295d = billSplitSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54473a(C19159d dVar, double d) {
            C41536l.m120489i(dVar, "receiver");
            this.f58295d.m70812K2().mo54508dx(dVar, d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo54473a((C19159d) obj, ((Number) obj2).doubleValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$t */
    static final class C21880t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58296d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21880t(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(0);
            this.f58296d = billSplitSummaryActivity;
        }

        public final void invoke() {
            C36546y.m108282F().mo27152s("money_request", "BILL_SPLIT", "mrs_details_add_new_operation");
            C26360b.f66777a.mo65551b(this.f58296d);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$u */
    static final class C21881u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryActivity f58297d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21881u(BillSplitSummaryActivity billSplitSummaryActivity) {
            super(0);
            this.f58297d = billSplitSummaryActivity;
        }

        public final void invoke() {
            C32290b1.m95111a(this.f58297d);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$v */
    public static final class C21882v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58298d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21882v(ComponentActivity componentActivity) {
            super(0);
            this.f58298d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f58298d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$w */
    public static final class C21883w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58299d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21883w(ComponentActivity componentActivity) {
            super(0);
            this.f58299d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f58299d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.BillSplitSummaryActivity$x */
    public static final class C21884x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58300d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f58301e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21884x(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f58300d = aVar;
            this.f58301e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58300d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f58301e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final C27397q m70811J2() {
        return (C27397q) this.f58274F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public final BillSplitSummaryViewModel m70812K2() {
        return (BillSplitSummaryViewModel) this.f58276H.getValue();
    }

    /* renamed from: L2 */
    private final void m70813L2() {
        C21484c.m69412d(m70812K2().mo54495Kw(), this, new C21862b(this), new C21863c(this), (C43075l) null, 8, (Object) null);
        m70812K2().mo54497Mw().mo4819k(this, new C21870j(new C21864d(this)));
        C21484c.m69411c(m70812K2().mo54498Nw(), this, new C21865e(this), new C21866f(this), new C21867g(this));
        m70812K2().mo54502Tw().mo4819k(this, new C21870j(new C21868h(this)));
        m70812K2().mo54496Lw().mo4819k(this, new C21870j(C21869i.f58285d));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m70814M2(BillSplitSummaryActivity billSplitSummaryActivity, View view) {
        C41536l.m120489i(billSplitSummaryActivity, "this$0");
        billSplitSummaryActivity.m70812K2().mo54493Fw();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final void m70815N2(int i, View view) {
        C35893a.m106783a(this).mo88140g(m70812K2().mo54500Rw()).mo88136c(view).mo88141h(i).mo88137d(AdvancedWizardActivity.class).mo88139f(new MoneyRequestSummaryWizardPlugin(new ArrayList(m70812K2().mo54494Jw()))).mo88142i();
    }

    /* renamed from: O2 */
    static /* synthetic */ void m70816O2(BillSplitSummaryActivity billSplitSummaryActivity, int i, View view, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            view = null;
        }
        billSplitSummaryActivity.m70815N2(i, view);
    }

    /* renamed from: P2 */
    private final void m70817P2() {
        this.f58275G.mo47679H(new C21873m(this));
        this.f58275G.mo47678G(new C21874n(this));
        this.f58275G.mo47674C(new C21875o(this));
        this.f58275G.mo47675D(new C21876p(this));
        this.f58275G.mo47676E(new C21877q(this));
        this.f58275G.mo47685y(new C21878r(this));
        this.f58275G.mo47686z(new C21879s(this));
        this.f58275G.mo47673B(new C21880t(this));
        this.f58275G.mo47684x(new C21881u(this));
        this.f58275G.mo47677F(new C21871k(this));
        this.f58275G.mo47672A(new C21872l(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_bill_split_summary;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m70813L2();
        m70811J2().f69563h.setLayoutManager(new LinearLayoutManager(this));
        m70811J2().f69563h.setAdapter(this.f58275G);
        m70817P2();
        m70811J2().f69561f.setOnClickListener(new C19329a(this));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001) {
            m70812K2().mo54507cx(intent);
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.bill_split);
        C41536l.m120488h(string, "getString(R.string.bill_split)");
        return string;
    }
}
