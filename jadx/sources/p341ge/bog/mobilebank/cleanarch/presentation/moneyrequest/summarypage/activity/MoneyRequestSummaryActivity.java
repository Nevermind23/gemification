package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity;

import a30.C19159d;
import a81.C30772sa;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import b30.C19330b;
import c30.C19468b;
import com.google.android.material.button.MaterialButton;
import d30.C19891b;
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
import n20.C26360b;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.MoneyRequestResultActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.MoneyRequestSuccessItem;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.wizardplugin.MoneyRequestSummaryWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p90.C27425t0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity */
public final class MoneyRequestSummaryActivity extends C30772sa {

    /* renamed from: F */
    private final C41217g f58302F = C41219i.m119470b(new C21885a(this));
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C19468b f58303G = new C19468b();

    /* renamed from: H */
    private final C41217g f58304H = new C1617p0(C41520a0.m120436b(MoneyRequestSummaryViewModel.class), new C21904t(this), new C21903s(this), new C21905u((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f58305I = C41219i.m119470b(new C21886b(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$a */
    static final class C21885a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58306d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21885a(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(0);
            this.f58306d = moneyRequestSummaryActivity;
        }

        /* renamed from: b */
        public final C27425t0 invoke() {
            C27425t0 a = C27425t0.m85009a(this.f58306d.findViewById(C10322k.summary_activity));
            C41536l.m120488h(a, "bind(findViewById(R.id.summary_activity))");
            return a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$b */
    static final class C21886b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58307d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21886b(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(0);
            this.f58307d = moneyRequestSummaryActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f58307d.getIntent().getBooleanExtra("EXTRA_IS_MONEY_REQUEST_ENTRY_POINT", false));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$c */
    static final class C21887c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21887c f58308d = new C21887c();

        C21887c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo54476a(C41224m mVar) {
            String str = (String) mVar.mo95676b();
            C36546y.m108282F().mo27152s("money_request", str, (String) mVar.mo95675a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54476a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$d */
    static final class C21888d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58309d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21888d(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58309d = moneyRequestSummaryActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m70857c(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            C41536l.m120489i(moneyRequestSummaryActivity, "this$0");
            moneyRequestSummaryActivity.m70848P2(new View(moneyRequestSummaryActivity), 0);
        }

        /* renamed from: b */
        public final void mo54477b(List list) {
            C41536l.m120489i(list, "it");
            new Handler().postDelayed(new C21906a(this.f58309d), 100);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54477b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$e */
    static final class C21889e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58310d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21889e(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58310d = moneyRequestSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54478a(boolean z) {
            this.f58310d.m70843K2().f69821g.setVisibility(this.f58310d.m70849Q2(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54478a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$f */
    static final class C21890f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58311d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21890f(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58311d = moneyRequestSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54479a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f58311d.mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54479a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$g */
    static final class C21891g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58312d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21891g(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58312d = moneyRequestSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54480a(MoneyRequestSuccessItem moneyRequestSuccessItem) {
            C41536l.m120489i(moneyRequestSuccessItem, "it");
            this.f58312d.setResult(-1);
            this.f58312d.finish();
            MoneyRequestResultActivity.C21779a.m70572b(MoneyRequestResultActivity.f58136H, this.f58312d, moneyRequestSuccessItem, false, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54480a((MoneyRequestSuccessItem) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$h */
    static final class C21892h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58313d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21892h(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58313d = moneyRequestSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54481a(boolean z) {
            this.f58313d.m70843K2().f69821g.setVisibility(this.f58313d.m70849Q2(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54481a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$i */
    static final class C21893i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21893i(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58314d = moneyRequestSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54482a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f58314d.mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54482a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$j */
    static final class C21894j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58315d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21894j(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58315d = moneyRequestSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54483a(List list) {
            C19468b G2 = this.f58315d.f58303G;
            C41536l.m120488h(list, "it");
            G2.mo47701k(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54483a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$k */
    static final class C21895k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58316d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21895k(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58316d = moneyRequestSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54484a(C19891b bVar) {
            MaterialButton materialButton = this.f58316d.m70843K2().f69820f;
            String string = this.f58316d.getString(C10328q.money_request_search_header);
            String P = C32343x.m95408P(bVar.mo48239g(), "GEL");
            materialButton.setText(string + " (" + P + ")");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54484a((C19891b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$l */
    static final class C21896l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58317d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21896l(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58317d = moneyRequestSummaryActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            MaterialButton materialButton = this.f58317d.m70843K2().f69820f;
            C41536l.m120488h(bool, "it");
            materialButton.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$m */
    static final class C21897m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21897m(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58318d = moneyRequestSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54486a(View view) {
            C41536l.m120489i(view, "it");
            MoneyRequestSummaryActivity moneyRequestSummaryActivity = this.f58318d;
            moneyRequestSummaryActivity.m70848P2(view, moneyRequestSummaryActivity.m70844L2().mo54529Mw("REQUESTED_AMOUNT_WIZARD_ID"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54486a((View) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$n */
    static final class C21898n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21898n(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58319d = moneyRequestSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54487a(View view) {
            C41536l.m120489i(view, "it");
            MoneyRequestSummaryActivity moneyRequestSummaryActivity = this.f58319d;
            moneyRequestSummaryActivity.m70848P2(view, moneyRequestSummaryActivity.m70844L2().mo54529Mw("ACCOUNT_WIZARD_ID"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54487a((View) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$o */
    static final class C21899o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21899o(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58320d = moneyRequestSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54488a(View view) {
            C41536l.m120489i(view, "it");
            MoneyRequestSummaryActivity moneyRequestSummaryActivity = this.f58320d;
            moneyRequestSummaryActivity.m70848P2(view, moneyRequestSummaryActivity.m70844L2().mo54529Mw("COMMENT_WIZARD_ID"));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54488a((View) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$p */
    static final class C21900p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58321d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21900p(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(1);
            this.f58321d = moneyRequestSummaryActivity;
        }

        /* renamed from: a */
        public final void mo54489a(C19159d dVar) {
            C41536l.m120489i(dVar, "it");
            this.f58321d.m70844L2().mo54532Pw(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54489a((C19159d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$q */
    static final class C21901q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryActivity f58322d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21901q(MoneyRequestSummaryActivity moneyRequestSummaryActivity) {
            super(0);
            this.f58322d = moneyRequestSummaryActivity;
        }

        public final void invoke() {
            C36546y.m108282F().mo27152s("money_request", "MONEY_REQUEST", "mrs_details_add_new_participant");
            C26360b.f66777a.mo65551b(this.f58322d);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$r */
    static final class C21902r implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f58323a;

        C21902r(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f58323a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f58323a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f58323a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$s */
    public static final class C21903s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58324d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21903s(ComponentActivity componentActivity) {
            super(0);
            this.f58324d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f58324d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$t */
    public static final class C21904t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58325d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21904t(ComponentActivity componentActivity) {
            super(0);
            this.f58325d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f58325d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.activity.MoneyRequestSummaryActivity$u */
    public static final class C21905u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58326d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f58327e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21905u(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f58326d = aVar;
            this.f58327e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58326d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f58327e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public final C27425t0 m70843K2() {
        return (C27425t0) this.f58302F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final MoneyRequestSummaryViewModel m70844L2() {
        return (MoneyRequestSummaryViewModel) this.f58304H.getValue();
    }

    /* renamed from: M2 */
    private final boolean m70845M2() {
        return ((Boolean) this.f58305I.getValue()).booleanValue();
    }

    /* renamed from: N2 */
    private final void m70846N2() {
        C21484c.m69411c(m70844L2().mo54528Lw(), this, new C21888d(this), new C21889e(this), new C21890f(this));
        C21484c.m69411c(m70844L2().mo54525Gw(), this, new C21891g(this), new C21892h(this), new C21893i(this));
        m70844L2().mo54527Kw().mo4819k(this, new C21902r(new C21894j(this)));
        m70844L2().mo54526Iw().mo4819k(this, new C21902r(new C21895k(this)));
        m70844L2().mo54531Ow().mo4819k(this, new C21902r(new C21896l(this)));
        m70844L2().mo54524Fw().mo4819k(this, new C21902r(C21887c.f58308d));
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m70847O2(MoneyRequestSummaryActivity moneyRequestSummaryActivity, View view) {
        C41536l.m120489i(moneyRequestSummaryActivity, "this$0");
        moneyRequestSummaryActivity.m70844L2().mo54522Aw();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final void m70848P2(View view, int i) {
        C35893a.m106783a(this).mo88140g(m70844L2().mo54530Nw()).mo88136c(view).mo88141h(i).mo88137d(AdvancedWizardActivity.class).mo88139f(new MoneyRequestSummaryWizardPlugin(new ArrayList(m70844L2().mo54523Ew()))).mo88142i();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final int m70849Q2(boolean z) {
        return z ? 0 : 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_money_request_summary;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m70844L2().mo54533Rw(m70845M2());
        m70846N2();
        m70843K2().f69822h.setLayoutManager(new LinearLayoutManager(this));
        m70843K2().f69822h.setAdapter(this.f58303G);
        this.f58303G.mo47700j(new C21897m(this));
        this.f58303G.mo47698h(new C21898n(this));
        this.f58303G.mo47696f(new C21899o(this));
        this.f58303G.mo47699i(new C21900p(this));
        this.f58303G.mo47697g(new C21901q(this));
        m70843K2().f69820f.setOnClickListener(new C19330b(this));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001) {
            m70844L2().mo54534Sw(intent);
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.money_request_search_header);
        C41536l.m120488h(string, "getString(R.string.money_request_search_header)");
        return string;
    }
}
