package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity;

import a30.C19151a;
import a30.C19160e;
import a81.C30772sa;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.C0209a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n20.C26360b;
import o20.C26689b;
import o20.C26690c;
import o20.C26691d;
import o20.C26692e;
import o20.C26693f;
import o20.C26694g;
import o20.C26695h;
import o20.C26696i;
import o20.C26697j;
import p163m0.C7047a;
import p20.C27138b;
import p20.C27143e;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.InfoMessageView;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.viewmodel.BillSplitSelectOperationsViewModel;
import p366bk.C10313b;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10464h;
import p793iw.C25263b;
import p90.C27388p;
import s20.C28125c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.BillSplitSelectOperationsActivity */
public final class BillSplitSelectOperationsActivity extends C30772sa {
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C27388p f58146F;

    /* renamed from: G */
    private final C41217g f58147G = new C1617p0(C41520a0.m120436b(BillSplitSelectOperationsViewModel.class), new C21790h(this), new C21789g(this), new C21791i((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final C27138b f58148H = new C27138b(new C26689b(this));
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C27143e f58149I = new C27143e(false, 1, (DefaultConstructorMarker) null);

    /* renamed from: J */
    private final C41217g f58150J = C41219i.m119470b(new C21783a(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.BillSplitSelectOperationsActivity$a */
    static final class C21783a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BillSplitSelectOperationsActivity f58151d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21783a(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity) {
            super(0);
            this.f58151d = billSplitSelectOperationsActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f58151d.getIntent().getBooleanExtra("EXTRA_IS_EDIT_MODE", false));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.BillSplitSelectOperationsActivity$b */
    static final class C21784b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSelectOperationsActivity f58152d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21784b(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity) {
            super(1);
            this.f58152d = billSplitSelectOperationsActivity;
        }

        /* renamed from: a */
        public final void mo54363a(C19160e eVar) {
            C27388p N2 = this.f58152d.f58146F;
            C27388p pVar = null;
            if (N2 == null) {
                C41536l.m120506z("binding");
                N2 = null;
            }
            StateView stateView = N2.f69497i.f69982j;
            C41536l.m120488h(stateView, "binding.operationList.operationsStateView");
            if (eVar instanceof C19160e.C19165e) {
                stateView.mo53595c();
                this.f58152d.f58148H.mo66438q(((C19160e.C19165e) eVar).mo47388a());
            } else if (C41536l.m120484d(eVar, C19160e.C19162b.f53360a)) {
                stateView.mo53597e();
            } else if (C41536l.m120484d(eVar, C19160e.C19161a.f53359a)) {
                stateView.mo53596d();
            } else if (C41536l.m120484d(eVar, C19160e.C19164d.f53362a)) {
                stateView.mo53598f();
                C27388p N22 = this.f58152d.f58146F;
                if (N22 == null) {
                    C41536l.m120506z("binding");
                    N22 = null;
                }
                InfoMessageView infoMessageView = N22.f69497i.f69978f;
                String string = this.f58152d.getString(C10328q.bill_split_select_operations_msg_operations_not_found);
                C41536l.m120488h(string, "getString(R.string.bill_…msg_operations_not_found)");
                infoMessageView.setMessage(string);
                C27388p N23 = this.f58152d.f58146F;
                if (N23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    pVar = N23;
                }
                pVar.f69497i.f69978f.setIcon(C10320i.ic_no_operations);
            } else if (C41536l.m120484d(eVar, C19160e.C19163c.f53361a)) {
                stateView.mo53598f();
                C27388p N24 = this.f58152d.f58146F;
                if (N24 == null) {
                    C41536l.m120506z("binding");
                    N24 = null;
                }
                InfoMessageView infoMessageView2 = N24.f69497i.f69978f;
                String string2 = this.f58152d.getString(C10328q.bill_split_select_operations_msg_no_operations);
                C41536l.m120488h(string2, "getString(R.string.bill_…ations_msg_no_operations)");
                infoMessageView2.setMessage(string2);
                C27388p N25 = this.f58152d.f58146F;
                if (N25 == null) {
                    C41536l.m120506z("binding");
                } else {
                    pVar = N25;
                }
                pVar.f69497i.f69978f.setIcon(C10320i.ic_search_56dp_gray);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54363a((C19160e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.BillSplitSelectOperationsActivity$c */
    static final class C21785c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSelectOperationsActivity f58153d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21785c(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity) {
            super(1);
            this.f58153d = billSplitSelectOperationsActivity;
        }

        /* renamed from: a */
        public final void mo54364a(List list) {
            C27388p N2 = this.f58153d.f58146F;
            if (N2 == null) {
                C41536l.m120506z("binding");
                N2 = null;
            }
            Button button = N2.f69496h;
            C41536l.m120488h(button, "binding.nextButton");
            C41536l.m120488h(list, "it");
            C32343x.m95483r1(button, !list.isEmpty(), false, 2, (Object) null);
            C27388p N22 = this.f58153d.f58146F;
            if (N22 == null) {
                C41536l.m120506z("binding");
                N22 = null;
            }
            ConstraintLayout constraintLayout = N22.f69499k.f68828f;
            C41536l.m120488h(constraintLayout, "binding.selectedOperatio…ectedOperationsListLayout");
            C32343x.m95483r1(constraintLayout, !list.isEmpty(), false, 2, (Object) null);
            C27388p N23 = this.f58153d.f58146F;
            if (N23 == null) {
                C41536l.m120506z("binding");
                N23 = null;
            }
            TextView textView = N23.f69499k.f68827e;
            C41536l.m120488h(textView, "binding.selectedOperationsLayout.addCashOperation");
            C32343x.m95483r1(textView, list.isEmpty(), false, 2, (Object) null);
            this.f58153d.f58149I.mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54364a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.BillSplitSelectOperationsActivity$d */
    static final class C21786d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSelectOperationsActivity f58154d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21786d(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity) {
            super(1);
            this.f58154d = billSplitSelectOperationsActivity;
        }

        /* renamed from: a */
        public final void mo54365a(C41224m mVar) {
            double doubleValue = ((Number) mVar.mo95675a()).doubleValue();
            String str = (String) mVar.mo95676b();
            C27388p N2 = this.f58154d.f58146F;
            C27388p pVar = null;
            if (N2 == null) {
                C41536l.m120506z("binding");
                N2 = null;
            }
            N2.f69499k.f68831i.setVisibility(0);
            C27388p N22 = this.f58154d.f58146F;
            if (N22 == null) {
                C41536l.m120506z("binding");
            } else {
                pVar = N22;
            }
            pVar.f69499k.f68833k.setText(C32343x.m95410Q(doubleValue, str, false, 2, (Object) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54365a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.BillSplitSelectOperationsActivity$e */
    public static final class C21787e implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ BillSplitSelectOperationsActivity f58155d;

        C21787e(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity) {
            this.f58155d = billSplitSelectOperationsActivity;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            BillSplitSelectOperationsViewModel Q2 = this.f58155d.m70596R2();
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            Q2.mo54556Y2(str);
            C27388p N2 = this.f58155d.f58146F;
            if (N2 == null) {
                C41536l.m120506z("binding");
                N2 = null;
            }
            ImageButton imageButton = N2.f69498j.f69851e;
            C41536l.m120488h(imageButton, "binding.searchLayout.clearSearchButton");
            if (editable == null || editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(imageButton, !z, false, 2, (Object) null);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.BillSplitSelectOperationsActivity$f */
    static final class C21788f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f58156a;

        C21788f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f58156a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f58156a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f58156a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.BillSplitSelectOperationsActivity$g */
    public static final class C21789g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58157d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21789g(ComponentActivity componentActivity) {
            super(0);
            this.f58157d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f58157d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.BillSplitSelectOperationsActivity$h */
    public static final class C21790h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58158d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21790h(ComponentActivity componentActivity) {
            super(0);
            this.f58158d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f58158d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.BillSplitSelectOperationsActivity$i */
    public static final class C21791i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58159d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f58160e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21791i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f58159d = aVar;
            this.f58160e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58159d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f58160e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final BillSplitSelectOperationsViewModel m70596R2() {
        return (BillSplitSelectOperationsViewModel) this.f58147G.getValue();
    }

    /* renamed from: T2 */
    private final void m70597T2() {
        m70596R2().mo54558xw().mo4819k(this, new C21788f(new C21784b(this)));
        m70596R2().mo54559yw().mo4819k(this, new C21788f(new C21785c(this)));
        m70596R2().mo54560zw().mo4819k(this, new C21788f(new C21786d(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m70598U2(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity, View view, boolean z) {
        C41536l.m120489i(billSplitSelectOperationsActivity, "this$0");
        C27388p pVar = billSplitSelectOperationsActivity.f58146F;
        if (pVar == null) {
            C41536l.m120506z("binding");
            pVar = null;
        }
        pVar.f69493e.post(new C26697j(billSplitSelectOperationsActivity, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m70599V2(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity, boolean z) {
        C41536l.m120489i(billSplitSelectOperationsActivity, "this$0");
        C27388p pVar = billSplitSelectOperationsActivity.f58146F;
        if (pVar == null) {
            C41536l.m120506z("binding");
            pVar = null;
        }
        pVar.f69493e.setExpanded(!z);
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m70600W2(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity, View view) {
        C41536l.m120489i(billSplitSelectOperationsActivity, "this$0");
        C27388p pVar = billSplitSelectOperationsActivity.f58146F;
        if (pVar == null) {
            C41536l.m120506z("binding");
            pVar = null;
        }
        pVar.f69498j.f69852f.setText("");
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m70601X2(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity, View view) {
        C41536l.m120489i(billSplitSelectOperationsActivity, "this$0");
        billSplitSelectOperationsActivity.m70596R2().mo54554Dw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m70602Y2(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity, View view) {
        C41536l.m120489i(billSplitSelectOperationsActivity, "this$0");
        new C28125c().mo4576A1(billSplitSelectOperationsActivity.getSupportFragmentManager(), "CASH_OPERATION_BOTTOM_SHEET");
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m70603Z2(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity) {
        C41536l.m120489i(billSplitSelectOperationsActivity, "this$0");
        new C28125c().mo4576A1(billSplitSelectOperationsActivity.getSupportFragmentManager(), "CASH_OPERATION_BOTTOM_SHEET");
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m70604a3(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity, C19151a aVar) {
        C41536l.m120489i(billSplitSelectOperationsActivity, "this$0");
        C41536l.m120489i(aVar, "it");
        billSplitSelectOperationsActivity.m70596R2().mo54553Aw(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m70605b3(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity, View view) {
        C41536l.m120489i(billSplitSelectOperationsActivity, "this$0");
        billSplitSelectOperationsActivity.m70607d3("money_request_type_split_operation_next_click", false);
        C26360b.f66777a.mo65552c(billSplitSelectOperationsActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m70606c3(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity, C25263b bVar) {
        C41536l.m120489i(billSplitSelectOperationsActivity, "this$0");
        C41536l.m120489i(bVar, "it");
        billSplitSelectOperationsActivity.m70596R2().mo54557vw(bVar);
    }

    /* renamed from: d3 */
    private final void m70607d3(String str, boolean z) {
        C36546y.m108282F().mo27152s("money_request", "", str);
        if (z) {
            C36546y.m108282F().mo27137H("money_request", str, "", (Bundle) null, C10464h.C10465a.FACEBOOK);
        }
    }

    /* renamed from: e3 */
    static /* synthetic */ void m70608e3(BillSplitSelectOperationsActivity billSplitSelectOperationsActivity, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        billSplitSelectOperationsActivity.m70607d3(str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_bill_split_select_operations;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m70596R2().mo54555Ew(!mo54360S2());
        if (mo54360S2()) {
            overridePendingTransition(C10313b.slide_up, C10313b.no_change);
            C0209a supportActionBar = getSupportActionBar();
            C41536l.m120486f(supportActionBar);
            supportActionBar.mo569w(C10320i.ic_wizard_close);
        }
        C27388p a = C27388p.m84855a(findViewById(C10322k.f28887r9));
        C41536l.m120488h(a, "bind(findViewById(R.id.content_layout))");
        this.f58146F = a;
        C27388p pVar = null;
        if (a == null) {
            C41536l.m120506z("binding");
            a = null;
        }
        a.f69498j.f69852f.setOnFocusChangeListener(new C26690c(this));
        C27388p pVar2 = this.f58146F;
        if (pVar2 == null) {
            C41536l.m120506z("binding");
            pVar2 = null;
        }
        pVar2.f69498j.f69852f.addTextChangedListener(new C21787e(this));
        C27388p pVar3 = this.f58146F;
        if (pVar3 == null) {
            C41536l.m120506z("binding");
            pVar3 = null;
        }
        pVar3.f69498j.f69851e.setOnClickListener(new C26691d(this));
        C27388p pVar4 = this.f58146F;
        if (pVar4 == null) {
            C41536l.m120506z("binding");
            pVar4 = null;
        }
        pVar4.f69497i.f69980h.setOnClickListener(new C26692e(this));
        C27388p pVar5 = this.f58146F;
        if (pVar5 == null) {
            C41536l.m120506z("binding");
            pVar5 = null;
        }
        pVar5.f69497i.f69981i.setAdapter(this.f58148H);
        C27388p pVar6 = this.f58146F;
        if (pVar6 == null) {
            C41536l.m120506z("binding");
            pVar6 = null;
        }
        pVar6.f69499k.f68829g.setAdapter(this.f58149I);
        C27388p pVar7 = this.f58146F;
        if (pVar7 == null) {
            C41536l.m120506z("binding");
            pVar7 = null;
        }
        pVar7.f69499k.f68827e.setOnClickListener(new C26693f(this));
        this.f58149I.mo66441m(new C26694g(this));
        this.f58149I.mo66442p(new C26695h(this));
        C27388p pVar8 = this.f58146F;
        if (pVar8 == null) {
            C41536l.m120506z("binding");
        } else {
            pVar = pVar8;
        }
        pVar.f69496h.setOnClickListener(new C26696i(this));
        m70597T2();
    }

    /* renamed from: S2 */
    public final boolean mo54360S2() {
        return ((Boolean) this.f58150J.getValue()).booleanValue();
    }

    public void finish() {
        super.finish();
        if (mo54360S2()) {
            overridePendingTransition(C10313b.no_change, C10313b.slide_down);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 50005) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m70608e3(this, "money_request_type_split_page_view", false, 2, (Object) null);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.title_bill_split);
        C41536l.m120488h(string, "getString(R.string.title_bill_split)");
        return string;
    }
}
