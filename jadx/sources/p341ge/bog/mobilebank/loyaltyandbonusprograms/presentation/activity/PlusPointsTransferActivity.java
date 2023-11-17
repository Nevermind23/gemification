package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import dt0.C31600p;
import dt0.C31601q;
import dt0.C31602r;
import dt0.C31603s;
import g91.C32290b1;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import nt0.C37459a;
import nt0.C37460b;
import nt0.C37461c;
import ot0.C37761j0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.PlusPointTransferParams;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel;
import p341ge.bog.mobilebank.p975ui.activities.OperationResultActivity;
import p341ge.bog.mobilebank.p975ui.model.OperationResultData;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p420fh.C12902d;
import p420fh.C12910e;
import rs0.C38338e;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39447f;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity */
public final class PlusPointsTransferActivity extends C32903d implements C41185v.C41186a {

    /* renamed from: I */
    public static final C32868a f80719I = new C32868a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f80720G = C41219i.m119470b(new C32876h(this));

    /* renamed from: H */
    private final C41217g f80721H = new C1617p0(C41520a0.m120436b(PlusPointsTransferViewModel$ViewModel.class), new C32882n(this), new C32881m(this), new C32883o((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$a */
    public static final class C32868a {
        private C32868a() {
        }

        public /* synthetic */ C32868a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo74755a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, PlusPointsTransferActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$b */
    /* synthetic */ class C32869b extends C41519a implements C43075l {
        C32869b(Object obj) {
            super(1, obj, PlusPointsTransferActivity.class, "observeResult", "observeResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        /* renamed from: b */
        public final void mo74756b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            PlusPointsTransferActivity.m97040Z2((PlusPointsTransferActivity) this.f97690d, aVar, (C43075l) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74756b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$c */
    /* synthetic */ class C32870c extends C41519a implements C43075l {
        C32870c(Object obj) {
            super(1, obj, PlusPointsTransferActivity.class, "observeResult", "observeResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;Lkotlin/jvm/functions/Function1;)V", 0);
        }

        /* renamed from: b */
        public final void mo74757b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            PlusPointsTransferActivity.m97040Z2((PlusPointsTransferActivity) this.f97690d, aVar, (C43075l) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74757b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$d */
    static final class C32871d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferActivity f80722d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$d$a */
        static final class C32872a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ PlusPointsTransferActivity f80723d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32872a(PlusPointsTransferActivity plusPointsTransferActivity) {
                super(1);
                this.f80723d = plusPointsTransferActivity;
            }

            /* renamed from: a */
            public final void mo74759a(C37460b bVar) {
                C41536l.m120489i(bVar, "data");
                this.f80723d.m97035U2(bVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74759a((C37460b) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32871d(PlusPointsTransferActivity plusPointsTransferActivity) {
            super(1);
            this.f80722d = plusPointsTransferActivity;
        }

        /* renamed from: a */
        public final void mo74758a(C31128a aVar) {
            PlusPointsTransferActivity plusPointsTransferActivity = this.f80722d;
            C41536l.m120488h(aVar, "it");
            plusPointsTransferActivity.m97039Y2(aVar, new C32872a(this.f80722d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74758a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$e */
    /* synthetic */ class C32873e extends C41535k implements C43075l {
        C32873e(Object obj) {
            super(1, obj, PlusPointsTransferActivity.class, "openWizard", "openWizard(Lge/bog/mobilebank/shared2/livedata/Event;)V", 0);
        }

        /* renamed from: b */
        public final void mo74760b(C37223a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PlusPointsTransferActivity) this.receiver).m97041a3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74760b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$f */
    /* synthetic */ class C32874f extends C41535k implements C43075l {
        C32874f(Object obj) {
            super(1, obj, PlusPointsTransferActivity.class, "showSca", "showSca(Lge/bog/mobilebank/shared2/livedata/Event;)V", 0);
        }

        /* renamed from: b */
        public final void mo74761b(C37223a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PlusPointsTransferActivity) this.receiver).m97043c3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74761b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$g */
    /* synthetic */ class C32875g extends C41535k implements C43075l {
        C32875g(Object obj) {
            super(1, obj, PlusPointsTransferActivity.class, "fillFields", "fillFields(Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/plustransfer/PlusPointsTransferData;)V", 0);
        }

        /* renamed from: b */
        public final void mo74762b(C37460b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((PlusPointsTransferActivity) this.receiver).m97034T2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74762b((C37460b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$h */
    static final class C32876h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferActivity f80724d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32876h(PlusPointsTransferActivity plusPointsTransferActivity) {
            super(0);
            this.f80724d = plusPointsTransferActivity;
        }

        /* renamed from: b */
        public final C39447f invoke() {
            return C39447f.m114642d(this.f80724d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$i */
    static final class C32877i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferActivity f80725d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32877i(PlusPointsTransferActivity plusPointsTransferActivity) {
            super(1);
            this.f80725d = plusPointsTransferActivity;
        }

        /* renamed from: a */
        public final void mo74764a(Object obj) {
            this.f80725d.m97042b3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74764a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$j */
    /* synthetic */ class C32878j extends C41535k implements C43075l {
        C32878j(Object obj) {
            super(1, obj, PlusPointsTransferActivity.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        /* renamed from: b */
        public final void mo74765b(Throwable th) {
            ((PlusPointsTransferActivity) this.receiver).mo74709H1(th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74765b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$k */
    static final class C32879k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferActivity f80726d;

        /* renamed from: e */
        final /* synthetic */ C43075l f80727e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32879k(PlusPointsTransferActivity plusPointsTransferActivity, C43075l lVar) {
            super(1);
            this.f80726d = plusPointsTransferActivity;
            this.f80727e = lVar;
        }

        /* renamed from: a */
        public final void mo74766a(Object obj) {
            this.f80726d.m97042b3(false);
            C43075l lVar = this.f80727e;
            if (lVar != null) {
                lVar.invoke(obj);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74766a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$l */
    static final class C32880l implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80728a;

        C32880l(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80728a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80728a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80728a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$m */
    public static final class C32881m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80729d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32881m(ComponentActivity componentActivity) {
            super(0);
            this.f80729d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80729d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$n */
    public static final class C32882n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32882n(ComponentActivity componentActivity) {
            super(0);
            this.f80730d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80730d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity$o */
    public static final class C32883o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80731d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f80732e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32883o(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f80731d = aVar;
            this.f80732e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80731d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80732e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: O2 */
    private final void m97029O2() {
        C39447f V2 = m97036V2();
        V2.f93742j.setOnClickListener(new C31600p(this));
        V2.f93743k.setOnClickListener(new C31601q(this));
        V2.f93738f.setOnClickListener(new C31602r(this));
        V2.f93746n.setOnClickListener(new C31603s(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m97030P2(PlusPointsTransferActivity plusPointsTransferActivity, View view) {
        C41536l.m120489i(plusPointsTransferActivity, "this$0");
        plusPointsTransferActivity.m97038X2().mo75270ww().mo75265Zv(C37459a.ID_NUMBER);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public static final void m97031Q2(PlusPointsTransferActivity plusPointsTransferActivity, View view) {
        C41536l.m120489i(plusPointsTransferActivity, "this$0");
        plusPointsTransferActivity.m97038X2().mo75270ww().mo75265Zv(C37459a.POINTS);
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m97032R2(PlusPointsTransferActivity plusPointsTransferActivity, View view) {
        C41536l.m120489i(plusPointsTransferActivity, "this$0");
        plusPointsTransferActivity.m97038X2().mo75270ww().mo75265Zv(C37459a.COMMENT);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m97033S2(PlusPointsTransferActivity plusPointsTransferActivity, View view) {
        C41536l.m120489i(plusPointsTransferActivity, "this$0");
        plusPointsTransferActivity.m97038X2().mo75270ww().mo75262Ni();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final void m97034T2(C37460b bVar) {
        String str;
        int i;
        m97036V2().f93742j.setValueTextIgnoringEmpty(bVar.mo90595e());
        m97036V2().f93737e.setValueTextIgnoringEmpty(bVar.mo90593c());
        TextTypeView textTypeView = m97036V2().f93743k;
        Integer f = bVar.mo90597f();
        if (f != null) {
            str = f.toString();
        } else {
            str = null;
        }
        textTypeView.setValueTextIgnoringEmpty(str);
        m97036V2().f93738f.setValueTextIgnoringEmpty(bVar.mo90594d());
        m97036V2().f93746n.getButton().setEnabled(bVar.mo90598g());
        Button button = m97036V2().f93746n.getButton();
        StringBuilder sb = new StringBuilder();
        sb.append(C32343x.m95452h0(C38338e.f91909j, new Object[0]));
        Integer f2 = bVar.mo90597f();
        if (f2 != null) {
            i = f2.intValue();
        } else {
            i = 0;
        }
        if (i > 0) {
            sb.append(" (" + bVar.mo90597f() + " " + C32343x.m95452h0(C38338e.f91912m, new Object[0]) + ")");
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        button.setButtonText(sb2);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m97035U2(C37460b bVar) {
        OperationResultData operationResultData = new OperationResultData();
        operationResultData.setSuccess(true);
        operationResultData.setSuccessTitle(C32343x.m95452h0(C38338e.transfer_result_transfer_completed, new Object[0]));
        for (C41224m mVar : C41341q.m119910m(C41233s.m119492a(Integer.valueOf(C38338e.f91904a), bVar.mo90595e()), C41233s.m119492a(Integer.valueOf(C38338e.bonus_transfer_beneficiary_name), bVar.mo90593c()), C41233s.m119492a(Integer.valueOf(C38338e.f91905c), bVar.mo90594d()), C41233s.m119492a(Integer.valueOf(C38338e.bonus_transfer_transferred_points), bVar.mo90597f()))) {
            operationResultData.addDetails(C32343x.m95452h0(((Number) mVar.mo95678e()).intValue(), new Object[0]), String.valueOf(mVar.mo95680f()));
        }
        OperationResultActivity.m104475E2(this, operationResultData);
        finish();
    }

    /* renamed from: V2 */
    private final C39447f m97036V2() {
        return (C39447f) this.f80720G.getValue();
    }

    /* renamed from: W2 */
    private final C41185v m97037W2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: X2 */
    private final PlusPointsTransferViewModel$ViewModel m97038X2() {
        return (PlusPointsTransferViewModel$ViewModel) this.f80721H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m97039Y2(C31128a aVar, C43075l lVar) {
        C31132b.m92646h(aVar, (int[]) null, new C32877i(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32878j(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C32879k(this, lVar), 1, (Object) null);
    }

    /* renamed from: Z2 */
    static /* synthetic */ void m97040Z2(PlusPointsTransferActivity plusPointsTransferActivity, C31128a aVar, C43075l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        plusPointsTransferActivity.m97039Y2(aVar, lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final void m97041a3(C37223a aVar) {
        C37461c cVar = (C37461c) aVar.mo90296a();
        if (cVar != null) {
            PlusPointsTransferWizardActivity.f80733o0.mo74771a(this, cVar.mo90603c(), cVar.mo90601a(), C32290b1.m95119i(m97036V2().mo3946b()).top, cVar.mo90602b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final void m97042b3(boolean z) {
        m97036V2().f93746n.getButton().setLoading(z);
        for (TextTypeView enabled : C41341q.m119910m(m97036V2().f93742j, m97036V2().f93743k, m97036V2().f93738f)) {
            enabled.setEnabled(!z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m97043c3(C37223a aVar) {
        PlusPointTransferParams plusPointTransferParams = (PlusPointTransferParams) aVar.mo90296a();
        if (plusPointTransferParams != null) {
            C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, plusPointTransferParams.getOtpServiceId(), m97038X2().mo75271zw(plusPointTransferParams), (C41143c) null, 4, (Object) null);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            e.mo4576A1(supportFragmentManager, (String) null);
        }
    }

    /* renamed from: l1 */
    private final void m97044l1() {
        C37761j0 Aw = m97038X2().mo75259Aw();
        Aw.mo75264Wg().mo4819k(this, new C32880l(new C32869b(this)));
        Aw.mo75269se().mo4819k(this, new C32880l(new C32870c(this)));
        Aw.mo75267eo().mo4819k(this, new C32880l(new C32871d(this)));
        Aw.mo75266c5().mo4819k(this, new C32880l(new C32873e(this)));
        Aw.mo75263R2().mo4819k(this, new C32880l(new C32874f(this)));
        Aw.mo75268f().mo4819k(this, new C32880l(new C32875g(this)));
    }

    /* renamed from: H1 */
    public void mo74709H1(Throwable th) {
        super.mo74709H1(th);
        m97042b3(false);
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m97038X2().mo75270ww().mo75261H8(str, str2, str3);
        C41185v W2 = m97037W2();
        if (W2 != null) {
            W2.mo4577k1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m97036V2().mo3946b());
        super.mo37451O1(bundle);
        m97044l1();
        m97029O2();
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12910e.m48790h(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m97042b3(z);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1 && intent != null) {
            m97038X2().mo75270ww().mo75260Eo(intent);
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95452h0(C38338e.f91910k, new Object[0]);
    }
}
