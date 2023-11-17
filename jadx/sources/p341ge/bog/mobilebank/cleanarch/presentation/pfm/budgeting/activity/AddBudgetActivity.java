package p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g40.C20670c;
import g91.C32335t0;
import he1.C41217g;
import he1.C41238w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.EditBudgetActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.viewmodel.AddBudgetViewModel;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p366bk.C10329r;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity */
public final class AddBudgetActivity extends C30772sa {

    /* renamed from: O */
    public static final C22058a f58698O = new C22058a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f58699F = C41219i.m119470b(new C22065h(this));

    /* renamed from: G */
    private final C41217g f58700G = C41219i.m119470b(new C22060c(this));

    /* renamed from: H */
    private final C41217g f58701H = C41219i.m119470b(new C22061d(this));

    /* renamed from: I */
    private ArrayList f58702I;

    /* renamed from: J */
    private C20670c f58703J;

    /* renamed from: K */
    private final C41217g f58704K = new C1617p0(C41520a0.m120436b(AddBudgetViewModel.class), new C22067j(this), new C22066i(this), new C22068k((C43064a) null, this));

    /* renamed from: L */
    private ArrayList f58705L;

    /* renamed from: M */
    private ArrayList f58706M;

    /* renamed from: N */
    private boolean f58707N;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity$a */
    public static final class C22058a {
        private C22058a() {
        }

        public /* synthetic */ C22058a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54839a(EditBudgetActivity editBudgetActivity, ArrayList arrayList, ArrayList arrayList2) {
            C41536l.m120489i(editBudgetActivity, "previous");
            C41536l.m120489i(arrayList, "currentlySelectedCategories");
            C41536l.m120489i(arrayList2, "editedBudgets");
            Intent intent = new Intent(editBudgetActivity, AddBudgetActivity.class);
            intent.putExtra("EXTRA_CURRENTLY_SELECTED_IDS", arrayList);
            intent.putExtra("EXTRA_EDITED_BUDGETS", arrayList2);
            editBudgetActivity.startActivity(intent);
        }

        /* renamed from: b */
        public final void mo54840b(boolean z, Context context) {
            C41536l.m120489i(context, "previous");
            Intent intent = new Intent(context, AddBudgetActivity.class);
            intent.putExtra("EXTRA_OPEN_BUDGETING_ON_CLOSE", z);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity$b */
    public final class C22059b implements C20670c.C20677d {
        public C22059b() {
        }

        /* renamed from: a */
        public void mo49194a(boolean z) {
            AddBudgetActivity.this.m71493H2().setEnabled(z);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity$c */
    static final class C22060c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AddBudgetActivity f58709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22060c(AddBudgetActivity addBudgetActivity) {
            super(0);
            this.f58709d = addBudgetActivity;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f58709d.findViewById(C10322k.btnNext);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity$d */
    static final class C22061d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AddBudgetActivity f58710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22061d(AddBudgetActivity addBudgetActivity) {
            super(0);
            this.f58710d = addBudgetActivity;
        }

        /* renamed from: b */
        public final FrameLayout invoke() {
            return (FrameLayout) this.f58710d.findViewById(C10322k.f28752Iq);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity$e */
    /* synthetic */ class C22062e extends C41535k implements C43075l {
        C22062e(Object obj) {
            super(1, obj, AddBudgetActivity.class, "onBudgetingResponse", "onBudgetingResponse(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo54843b(List list) {
            C41536l.m120489i(list, "p0");
            ((AddBudgetActivity) this.receiver).m71497L2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54843b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity$f */
    /* synthetic */ class C22063f extends C41535k implements C43075l {
        C22063f(Object obj) {
            super(1, obj, AddBudgetActivity.class, "showLoading", "showLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo54844b(boolean z) {
            ((AddBudgetActivity) this.receiver).m71498M2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54844b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity$g */
    /* synthetic */ class C22064g extends C41535k implements C43075l {
        C22064g(Object obj) {
            super(1, obj, AddBudgetActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo54845b(C21503d.C21504a aVar) {
            ((AddBudgetActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54845b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity$h */
    static final class C22065h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AddBudgetActivity f58711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22065h(AddBudgetActivity addBudgetActivity) {
            super(0);
            this.f58711d = addBudgetActivity;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f58711d.findViewById(C10322k.rvBudgetCategories);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity$i */
    public static final class C22066i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58712d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22066i(ComponentActivity componentActivity) {
            super(0);
            this.f58712d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f58712d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity$j */
    public static final class C22067j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f58713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22067j(ComponentActivity componentActivity) {
            super(0);
            this.f58713d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f58713d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.AddBudgetActivity$k */
    public static final class C22068k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f58714d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f58715e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22068k(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f58714d = aVar;
            this.f58715e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f58714d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f58715e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public final Button m71493H2() {
        Object value = this.f58700G.getValue();
        C41536l.m120488h(value, "<get-btnNext>(...)");
        return (Button) value;
    }

    /* renamed from: I2 */
    private final AddBudgetViewModel m71494I2() {
        return (AddBudgetViewModel) this.f58704K.getValue();
    }

    /* renamed from: J2 */
    private final FrameLayout m71495J2() {
        Object value = this.f58701H.getValue();
        C41536l.m120488h(value, "<get-loader>(...)");
        return (FrameLayout) value;
    }

    /* renamed from: K2 */
    private final RecyclerView m71496K2() {
        Object value = this.f58699F.getValue();
        C41536l.m120488h(value, "<get-rvBudgetCategories>(...)");
        return (RecyclerView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final void m71497L2(List list) {
        C41536l.m120487g(list, "null cannot be cast to non-null type java.util.ArrayList<ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel>{ kotlin.collections.TypeAliasesKt.ArrayList<ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel> }");
        this.f58702I = (ArrayList) list;
        AddBudgetViewModel I2 = m71494I2();
        ArrayList arrayList = this.f58705L;
        ArrayList arrayList2 = this.f58702I;
        ArrayList arrayList3 = null;
        if (arrayList2 == null) {
            C41536l.m120506z("allBudgetableCategories");
            arrayList2 = null;
        }
        I2.mo54908iw(arrayList, arrayList2, this.f58706M);
        C20670c cVar = this.f58703J;
        if (cVar == null) {
            C41536l.m120506z("adapter");
            cVar = null;
        }
        ArrayList arrayList4 = this.f58702I;
        if (arrayList4 == null) {
            C41536l.m120506z("allBudgetableCategories");
        } else {
            arrayList3 = arrayList4;
        }
        cVar.mo49188I(arrayList3);
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final void m71498M2(boolean z) {
        m71495J2().setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_add_budget;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        ArrayList arrayList;
        ArrayList arrayList2;
        super.mo37451O1(bundle);
        mo86429X1(getString(C10328q.add_budget));
        m71493H2().setEnabled(false);
        Serializable serializableExtra = getIntent().getSerializableExtra("EXTRA_CURRENTLY_SELECTED_IDS");
        C20670c cVar = null;
        if (serializableExtra instanceof ArrayList) {
            arrayList = (ArrayList) serializableExtra;
        } else {
            arrayList = null;
        }
        this.f58705L = arrayList;
        Serializable serializableExtra2 = getIntent().getSerializableExtra("EXTRA_EDITED_BUDGETS");
        if (serializableExtra2 instanceof ArrayList) {
            arrayList2 = (ArrayList) serializableExtra2;
        } else {
            arrayList2 = null;
        }
        this.f58706M = arrayList2;
        this.f58707N = getIntent().getBooleanExtra("EXTRA_OPEN_BUDGETING_ON_CLOSE", false);
        this.f58703J = new C20670c(new C22059b());
        RecyclerView K2 = m71496K2();
        C20670c cVar2 = this.f58703J;
        if (cVar2 == null) {
            C41536l.m120506z("adapter");
        } else {
            cVar = cVar2;
        }
        K2.setAdapter(cVar);
        m71496K2().setLayoutManager(new LinearLayoutManager(this));
        C21484c.m69411c(m71494I2().mo54909jw(), this, new C22062e(this), new C22063f(this), new C22064g(this));
        m71494I2().mo54910kw();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U1 */
    public int mo53709U1() {
        if (C32335t0.m95361f() == 0) {
            return C10329r.TransparentStatusBarStyle;
        }
        if (C32335t0.m95361f() == 2) {
            return C10329r.TransparentStatusBarWealthStyle;
        }
        return C10329r.TransparentStatusBarSoloStyle;
    }

    public void onBackPressed() {
        finish();
    }

    public final void onDismissClick(View view) {
        C41536l.m120489i(view, "v");
        if (this.f58707N) {
            BudgetActivity.f58716F.mo54847a(this);
        }
        finish();
    }

    public final void onNextClick(View view) {
        C41536l.m120489i(view, "v");
        EditBudgetActivity.C22081a aVar = EditBudgetActivity.f58730R;
        AddBudgetViewModel I2 = m71494I2();
        C20670c cVar = this.f58703J;
        ArrayList arrayList = null;
        if (cVar == null) {
            C41536l.m120506z("adapter");
            cVar = null;
        }
        HashSet J = cVar.mo49189J();
        ArrayList arrayList2 = this.f58702I;
        if (arrayList2 == null) {
            C41536l.m120506z("allBudgetableCategories");
        } else {
            arrayList = arrayList2;
        }
        aVar.mo54860a(this, I2.mo54911ow(J, arrayList), this.f58707N);
        finish();
    }
}
