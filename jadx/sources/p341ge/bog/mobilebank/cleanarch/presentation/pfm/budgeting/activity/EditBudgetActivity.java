package p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f40.C20416a;
import f40.C20417b;
import f40.C20418c;
import f40.C20419d;
import f40.C20420e;
import f40.C20421f;
import f40.C20422g;
import f40.C20423h;
import f40.C20424i;
import f40.C20425j;
import f40.C20426k;
import g40.C20708o;
import g91.C32290b1;
import g91.C32297d;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.EditBudgetViewModel;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10464h;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity */
public final class EditBudgetActivity extends C30772sa {

    /* renamed from: R */
    public static final C22081a f58730R = new C22081a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private ArrayList f58731F;

    /* renamed from: G */
    private final C41217g f58732G = new C1617p0(C41520a0.m120436b(EditBudgetViewModel.class), new C22090j(this), new C22089i(this), new C22091k((C43064a) null, this));

    /* renamed from: H */
    private C20708o f58733H;

    /* renamed from: I */
    private boolean f58734I;

    /* renamed from: J */
    private boolean f58735J;

    /* renamed from: K */
    private final Handler f58736K = new Handler();

    /* renamed from: L */
    private final C41217g f58737L = C41219i.m119470b(new C22087g(this));

    /* renamed from: M */
    private final C41217g f58738M = C41219i.m119470b(new C22088h(this));

    /* renamed from: N */
    private final C41217g f58739N = C41219i.m119470b(new C22084d(this));

    /* renamed from: O */
    private final C41217g f58740O = C41219i.m119470b(new C22086f(this));

    /* renamed from: P */
    private final C41217g f58741P = C41219i.m119470b(new C22085e(this));

    /* renamed from: Q */
    private final C41217g f58742Q = C41219i.m119470b(new C22083c(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity$a */
    public static final class C22081a {
        private C22081a() {
        }

        public /* synthetic */ C22081a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54860a(Context context, ArrayList arrayList, boolean z) {
            C41536l.m120489i(context, "previous");
            C41536l.m120489i(arrayList, "budgetsToEdit");
            Intent intent = new Intent(context, EditBudgetActivity.class);
            intent.putExtra("EXTRA_BUDGETS_TO_EDIT", arrayList);
            intent.putExtra("EXTRA_ADDITION_MODE", context instanceof AddBudgetActivity);
            intent.putExtra("EXTRA_OPEN_BUDGETING_ON_BACK", z);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity$b */
    public final class C22082b implements C20708o.C20716e {
        public C22082b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final void m71578f(EditBudgetActivity editBudgetActivity, int i, int i2, View view) {
            C41536l.m120489i(editBudgetActivity, "this$0");
            C36546y.m108282F().mo27137H("budgeting", "delete_one_budget", " ", (Bundle) null, C10464h.C10465a.FIREBASE);
            editBudgetActivity.m71556W2().mo54935ww(i, i2);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final void m71579g(View view) {
            C36546y.m108282F().mo27137H("budgeting", "cancel_delete_one_budget", "", (Bundle) null, C10464h.C10465a.FIREBASE);
        }

        /* renamed from: a */
        public void mo49246a() {
            C36546y.m108282F().mo27137H("budgeting", "attempt_delete_all_budgets", "", (Bundle) null, C10464h.C10465a.FIREBASE);
            EditBudgetActivity.this.m71551R2(true);
        }

        /* renamed from: b */
        public void mo49247b(ArrayList arrayList) {
            C41536l.m120489i(arrayList, "data");
            EditBudgetActivity.this.m71570k3(arrayList);
            EditBudgetActivity editBudgetActivity = EditBudgetActivity.this;
            editBudgetActivity.m71571l3(editBudgetActivity.m71556W2().mo54934vw(arrayList));
        }

        /* renamed from: c */
        public void mo49248c(int i, int i2) {
            C36546y.m108282F().mo27137H("budgeting", "attempt_delete_one_budget", "", (Bundle) null, C10464h.C10465a.FIREBASE);
            C20425j jVar = new C20425j(EditBudgetActivity.this, i, i2);
            C20426k kVar = new C20426k();
            EditBudgetActivity editBudgetActivity = EditBudgetActivity.this;
            C35388f2.m105072l2(editBudgetActivity, editBudgetActivity.getString(C10328q.delete_budget), EditBudgetActivity.this.getString(C10328q.delete_budget_prompt), EditBudgetActivity.this.getString(C10328q.f28966r2), EditBudgetActivity.this.getString(C10328q.f28951b2), jVar, kVar, true, true, (String) null, (View.OnClickListener) null, 768, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity$c */
    static final class C22083c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ EditBudgetActivity f58744d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22083c(EditBudgetActivity editBudgetActivity) {
            super(0);
            this.f58744d = editBudgetActivity;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f58744d.findViewById(C10322k.btnDelete);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity$d */
    static final class C22084d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ EditBudgetActivity f58745d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22084d(EditBudgetActivity editBudgetActivity) {
            super(0);
            this.f58745d = editBudgetActivity;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f58745d.findViewById(C10322k.btnSave);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity$e */
    static final class C22085e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ EditBudgetActivity f58746d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22085e(EditBudgetActivity editBudgetActivity) {
            super(0);
            this.f58746d = editBudgetActivity;
        }

        /* renamed from: b */
        public final ConstraintLayout invoke() {
            return (ConstraintLayout) this.f58746d.findViewById(C10322k.layoutAddBudget);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity$f */
    static final class C22086f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ EditBudgetActivity f58747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22086f(EditBudgetActivity editBudgetActivity) {
            super(0);
            this.f58747d = editBudgetActivity;
        }

        /* renamed from: b */
        public final ConstraintLayout invoke() {
            return (ConstraintLayout) this.f58747d.findViewById(C10322k.layoutCancelSelection);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity$g */
    static final class C22087g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ EditBudgetActivity f58748d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22087g(EditBudgetActivity editBudgetActivity) {
            super(0);
            this.f58748d = editBudgetActivity;
        }

        /* renamed from: b */
        public final FrameLayout invoke() {
            return (FrameLayout) this.f58748d.findViewById(C10322k.f28752Iq);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity$h */
    static final class C22088h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ EditBudgetActivity f58749d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22088h(EditBudgetActivity editBudgetActivity) {
            super(0);
            this.f58749d = editBudgetActivity;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f58749d.findViewById(C10322k.rvBudgetCategories);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity$i */
    public static final class C22089i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58750d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22089i(ComponentActivity componentActivity) {
            super(0);
            this.f58750d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f58750d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity$j */
    public static final class C22090j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58751d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22090j(ComponentActivity componentActivity) {
            super(0);
            this.f58751d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f58751d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity$k */
    public static final class C22091k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58752d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f58753e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22091k(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f58752d = aVar;
            this.f58753e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58752d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f58753e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final void m71551R2(boolean z) {
        if (z) {
            m71554U2().setVisibility(8);
            m71555V2().setVisibility(0);
            m71552S2().setVisibility(0);
            m71553T2().setVisibility(8);
            return;
        }
        m71553T2().setVisibility(0);
        m71552S2().setVisibility(8);
        m71555V2().setVisibility(4);
        m71554U2().setVisibility(0);
        C20708o oVar = this.f58733H;
        if (oVar == null) {
            C41536l.m120506z("adapter");
            oVar = null;
        }
        oVar.mo49234P();
    }

    /* renamed from: S2 */
    private final Button m71552S2() {
        Object value = this.f58742Q.getValue();
        C41536l.m120488h(value, "<get-btnDelete>(...)");
        return (Button) value;
    }

    /* renamed from: T2 */
    private final Button m71553T2() {
        Object value = this.f58739N.getValue();
        C41536l.m120488h(value, "<get-btnSave>(...)");
        return (Button) value;
    }

    /* renamed from: U2 */
    private final ConstraintLayout m71554U2() {
        Object value = this.f58741P.getValue();
        C41536l.m120488h(value, "<get-budgetAdditionLayout>(...)");
        return (ConstraintLayout) value;
    }

    /* renamed from: V2 */
    private final ConstraintLayout m71555V2() {
        Object value = this.f58740O.getValue();
        C41536l.m120488h(value, "<get-cancelSelectionContainer>(...)");
        return (ConstraintLayout) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final EditBudgetViewModel m71556W2() {
        return (EditBudgetViewModel) this.f58732G.getValue();
    }

    /* renamed from: X2 */
    private final FrameLayout m71557X2() {
        Object value = this.f58737L.getValue();
        C41536l.m120488h(value, "<get-progressLayout>(...)");
        return (FrameLayout) value;
    }

    /* renamed from: Y2 */
    private final RecyclerView m71558Y2() {
        Object value = this.f58738M.getValue();
        C41536l.m120488h(value, "<get-rvBudgetCategories>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: Z2 */
    private final void m71559Z2() {
        this.f58733H = new C20708o(new C22082b(), this.f58734I);
        RecyclerView Y2 = m71558Y2();
        C20708o oVar = this.f58733H;
        ArrayList arrayList = null;
        if (oVar == null) {
            C41536l.m120506z("adapter");
            oVar = null;
        }
        Y2.setAdapter(oVar);
        m71558Y2().setLayoutManager(new LinearLayoutManager(this));
        C20708o oVar2 = this.f58733H;
        if (oVar2 == null) {
            C41536l.m120506z("adapter");
            oVar2 = null;
        }
        ArrayList arrayList2 = this.f58731F;
        if (arrayList2 == null) {
            C41536l.m120506z("budgetsToEdit");
            arrayList2 = null;
        }
        String string = getString(C10328q.budgeting_edit_header);
        C41536l.m120488h(string, "getString(R.string.budgeting_edit_header)");
        oVar2.mo49232M(arrayList2, string);
        ArrayList arrayList3 = this.f58731F;
        if (arrayList3 == null) {
            C41536l.m120506z("budgetsToEdit");
        } else {
            arrayList = arrayList3;
        }
        m71570k3(arrayList);
    }

    /* renamed from: a3 */
    private final void m71560a3() {
        EditBudgetViewModel W2 = m71556W2();
        ArrayList arrayList = this.f58731F;
        if (arrayList == null) {
            C41536l.m120506z("budgetsToEdit");
            arrayList = null;
        }
        m71570k3(arrayList);
        W2.mo54925Ew().mo4819k(this, new C20418c(this));
        W2.mo54929Lw().mo4819k(this, new C20419d(this, this));
        W2.mo54936x0().mo4819k(this, new C20420e(this));
        W2.mo54930Mf().mo4819k(this, new C20421f(this));
        W2.mo54928Kw().mo4819k(this, new C20422g(this));
        W2.mo54931Mw().mo4819k(this, new C20423h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m71561b3(EditBudgetActivity editBudgetActivity, C37223a aVar) {
        Boolean bool;
        C41536l.m120489i(editBudgetActivity, "this$0");
        if (aVar != null && (bool = (Boolean) aVar.mo90296a()) != null) {
            boolean booleanValue = bool.booleanValue();
            editBudgetActivity.f58735J = false;
            editBudgetActivity.f58736K.postDelayed(new C20424i(booleanValue, editBudgetActivity), 1500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m71562c3(boolean z, EditBudgetActivity editBudgetActivity) {
        C41536l.m120489i(editBudgetActivity, "this$0");
        if (z) {
            BudgetActivity.f58716F.mo54847a(editBudgetActivity);
        }
        editBudgetActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m71563d3(EditBudgetActivity editBudgetActivity, Boolean bool) {
        int i;
        C41536l.m120489i(editBudgetActivity, "this$0");
        FrameLayout X2 = editBudgetActivity.m71557X2();
        C41536l.m120488h(bool, "isLoading");
        if (bool.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        X2.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m71564e3(EditBudgetActivity editBudgetActivity, ArrayList arrayList) {
        C41536l.m120489i(editBudgetActivity, "this$0");
        if (arrayList != null) {
            C20708o oVar = editBudgetActivity.f58733H;
            if (oVar == null) {
                C41536l.m120506z("adapter");
                oVar = null;
            }
            oVar.mo49231L(arrayList);
            editBudgetActivity.m71570k3(arrayList);
            if (arrayList.isEmpty()) {
                editBudgetActivity.m71556W2().mo54926Fw();
            }
            editBudgetActivity.m71571l3(editBudgetActivity.m71556W2().mo54934vw(arrayList));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public static final void m71565f3(EditBudgetActivity editBudgetActivity, EditBudgetActivity editBudgetActivity2, C37223a aVar) {
        Boolean bool;
        C41536l.m120489i(editBudgetActivity, "$owner");
        C41536l.m120489i(editBudgetActivity2, "this$0");
        if (aVar != null && (bool = (Boolean) aVar.mo90296a()) != null && bool.booleanValue()) {
            C32297d.m95160h(editBudgetActivity, editBudgetActivity2.getString(C10328q.budget_successfully_deleted));
            ArrayList arrayList = editBudgetActivity2.f58731F;
            if (arrayList == null) {
                C41536l.m120506z("budgetsToEdit");
                arrayList = null;
            }
            editBudgetActivity2.m71570k3(arrayList);
            editBudgetActivity2.m71551R2(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m71566g3(EditBudgetActivity editBudgetActivity, C21503d.C21504a aVar) {
        C41536l.m120489i(editBudgetActivity, "this$0");
        if (aVar != null) {
            editBudgetActivity.mo52674G1(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m71567h3(EditBudgetActivity editBudgetActivity, C37223a aVar) {
        C41536l.m120489i(editBudgetActivity, "this$0");
        if (aVar != null && ((C41238w) aVar.mo90296a()) != null) {
            BudgetActivity.f58716F.mo54847a(editBudgetActivity);
            editBudgetActivity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m71568i3(EditBudgetActivity editBudgetActivity, View view) {
        C41536l.m120489i(editBudgetActivity, "this$0");
        C36546y.m108282F().mo27137H("budgeting", "delete_all_budgets", "", (Bundle) null, C10464h.C10465a.FIREBASE);
        EditBudgetViewModel W2 = editBudgetActivity.m71556W2();
        C20708o oVar = editBudgetActivity.f58733H;
        if (oVar == null) {
            C41536l.m120506z("adapter");
            oVar = null;
        }
        W2.mo54937xw(oVar.mo49235R());
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m71569j3(View view) {
        C36546y.m108282F().mo27137H("budgeting", "cancel_delete_all_budgets", "", (Bundle) null, C10464h.C10465a.FIREBASE);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public final void m71570k3(ArrayList arrayList) {
        BigDecimal bigDecimal;
        if (!this.f58734I) {
            C20708o oVar = null;
            if (arrayList != null) {
                bigDecimal = BigDecimal.ZERO;
                for (Object next : arrayList) {
                    C41536l.m120488h(bigDecimal, "sum");
                    bigDecimal = bigDecimal.add(((AddBudgetModel) next).mo54895k());
                    C41536l.m120488h(bigDecimal, "this.add(other)");
                }
                C41536l.m120488h(bigDecimal, "sum");
            } else {
                bigDecimal = null;
            }
            C20708o oVar2 = this.f58733H;
            if (oVar2 == null) {
                C41536l.m120506z("adapter");
            } else {
                oVar = oVar2;
            }
            if (bigDecimal == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            C41536l.m120488h(bigDecimal, "sum ?: BigDecimal.ZERO");
            oVar.mo49233N(bigDecimal);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final void m71571l3(boolean z) {
        m71553T2().setEnabled(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_edit_budget;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("EXTRA_BUDGETS_TO_EDIT");
        C41536l.m120486f(parcelableArrayListExtra);
        this.f58731F = parcelableArrayListExtra;
        this.f58734I = getIntent().getBooleanExtra("EXTRA_ADDITION_MODE", false);
        this.f58735J = getIntent().getBooleanExtra("EXTRA_OPEN_BUDGETING_ON_BACK", false);
        if (this.f58734I) {
            mo86429X1(getString(C10328q.add_budget));
        }
        EditBudgetViewModel W2 = m71556W2();
        ArrayList arrayList = this.f58731F;
        if (arrayList == null) {
            C41536l.m120506z("budgetsToEdit");
            arrayList = null;
        }
        W2.mo54932Ow(arrayList);
        m71559Z2();
        m71560a3();
    }

    public final void onAddClicked(View view) {
        C41536l.m120489i(view, "v");
        C36546y.m108282F().mo27137H("budgeting", "open_add", "from_budget_edit_page", (Bundle) null, C10464h.C10465a.FIREBASE);
        AddBudgetActivity.C22058a aVar = AddBudgetActivity.f58698O;
        EditBudgetViewModel W2 = m71556W2();
        ArrayList arrayList = this.f58731F;
        C20708o oVar = null;
        if (arrayList == null) {
            C41536l.m120506z("budgetsToEdit");
            arrayList = null;
        }
        ArrayList Jw = W2.mo54927Jw(arrayList);
        C20708o oVar2 = this.f58733H;
        if (oVar2 == null) {
            C41536l.m120506z("adapter");
        } else {
            oVar = oVar2;
        }
        aVar.mo54839a(this, Jw, oVar.mo49235R());
        finish();
    }

    public void onBackPressed() {
        if (this.f58735J) {
            BudgetActivity.f58716F.mo54847a(this);
        }
        finish();
    }

    public final void onCancelSelectionClick(View view) {
        C41536l.m120489i(view, "v");
        m71551R2(false);
    }

    public final void onDeleteClick(View view) {
        C41536l.m120489i(view, "v");
        C35388f2.m105072l2(this, getString(C10328q.delete_budget), getString(C10328q.delete_selected_budgets_prompt), getString(C10328q.f28966r2), getString(C10328q.f28951b2), new C20416a(this), new C20417b(), true, true, (String) null, (View.OnClickListener) null, 768, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f58736K.removeCallbacksAndMessages((Object) null);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "item");
        onBackPressed();
        return false;
    }

    public final void onSaveClicked(View view) {
        C41536l.m120489i(view, "v");
        EditBudgetViewModel W2 = m71556W2();
        C20708o oVar = this.f58733H;
        if (oVar == null) {
            C41536l.m120506z("adapter");
            oVar = null;
        }
        W2.mo54933Qw(oVar.mo49235R());
        C32290b1.m95111a(this);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.edit_budget);
        C41536l.m120488h(string, "getString(R.string.edit_budget)");
        return string;
    }
}
