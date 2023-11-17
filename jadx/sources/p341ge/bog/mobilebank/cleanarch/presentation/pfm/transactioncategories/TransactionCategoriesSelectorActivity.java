package p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories;

import a81.C30772sa;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c50.C19474a;
import c50.C19475b;
import c50.C19476c;
import c50.C19477d;
import c50.C19478e;
import c50.C19479f;
import c50.C19480g;
import c50.C19490q;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32297d;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.viewmodel.TransactionCategoriesViewModel;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity */
public final class TransactionCategoriesSelectorActivity extends C30772sa {

    /* renamed from: O */
    public static final C22219a f59014O = new C22219a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f59015F = C41219i.m119470b(new C22237s(this));

    /* renamed from: G */
    private final C41217g f59016G = C41219i.m119470b(new C22236r(this));

    /* renamed from: H */
    private final C41217g f59017H = C41219i.m119470b(new C22220b(this));

    /* renamed from: I */
    private final C41217g f59018I = C41219i.m119470b(new C22238t(this));

    /* renamed from: J */
    private final C41217g f59019J = new C1617p0(C41520a0.m120436b(TransactionCategoriesViewModel.class), new C22240v(this), new C22239u(this), new C22241w((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C19490q f59020K;

    /* renamed from: L */
    private long f59021L = -1;

    /* renamed from: M */
    private Long f59022M;

    /* renamed from: N */
    private boolean f59023N;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$a */
    public static final class C22219a {
        private C22219a() {
        }

        public /* synthetic */ C22219a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo55055a(Activity activity, long j, long j2, Long l, boolean z, int i) {
            C41536l.m120489i(activity, "context");
            Intent intent = new Intent(activity, TransactionCategoriesSelectorActivity.class);
            intent.putExtra("PFM_ID", j);
            intent.putExtra("CAT_ID", j2);
            intent.putExtra("OPERATION_DATE", l);
            intent.putExtra("CATEGORY_IS_INCOME", z);
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$b */
    static final class C22220b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesSelectorActivity f59024d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22220b(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity) {
            super(0);
            this.f59024d = transactionCategoriesSelectorActivity;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f59024d.findViewById(C10322k.f28776Oc);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$c */
    /* synthetic */ class C22221c extends C41535k implements C43075l {
        C22221c(Object obj) {
            super(1, obj, TransactionCategoriesSelectorActivity.class, "showLoading", "showLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55057b(boolean z) {
            ((TransactionCategoriesSelectorActivity) this.receiver).m72015e3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55057b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$d */
    /* synthetic */ class C22222d extends C41535k implements C43075l {
        C22222d(Object obj) {
            super(1, obj, TransactionCategoriesSelectorActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo55058b(C21503d.C21504a aVar) {
            ((TransactionCategoriesSelectorActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55058b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$e */
    static final class C22223e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesSelectorActivity f59025d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22223e(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity) {
            super(1);
            this.f59025d = transactionCategoriesSelectorActivity;
        }

        /* renamed from: a */
        public final void mo55059a(TransactionCategoryModel transactionCategoryModel) {
            C41536l.m120489i(transactionCategoryModel, "it");
            C19490q M2 = this.f59025d.f59020K;
            if (M2 == null) {
                C41536l.m120506z("recyclerAdapter");
                M2 = null;
            }
            M2.mo47724E(transactionCategoryModel);
            TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity = this.f59025d;
            C32297d.m95160h(transactionCategoriesSelectorActivity, transactionCategoriesSelectorActivity.getString(C10328q.transaction_categories_updated_successfully));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55059a((TransactionCategoryModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$f */
    /* synthetic */ class C22224f extends C41535k implements C43075l {
        C22224f(Object obj) {
            super(1, obj, TransactionCategoriesSelectorActivity.class, "showLoading", "showLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55060b(boolean z) {
            ((TransactionCategoriesSelectorActivity) this.receiver).m72015e3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55060b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$g */
    /* synthetic */ class C22225g extends C41535k implements C43075l {
        C22225g(Object obj) {
            super(1, obj, TransactionCategoriesSelectorActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo55061b(C21503d.C21504a aVar) {
            ((TransactionCategoriesSelectorActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55061b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$h */
    static final class C22226h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesSelectorActivity f59026d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22226h(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity) {
            super(1);
            this.f59026d = transactionCategoriesSelectorActivity;
        }

        /* renamed from: a */
        public final void mo55062a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C19490q M2 = this.f59026d.f59020K;
            TransactionCategoryModel transactionCategoryModel = null;
            if (M2 == null) {
                C41536l.m120506z("recyclerAdapter");
                M2 = null;
            }
            C37223a aVar = (C37223a) this.f59026d.m72006V2().mo55102Pw().mo4814f();
            if (aVar != null) {
                transactionCategoryModel = (TransactionCategoryModel) aVar.mo90299d();
            }
            M2.mo47721B(transactionCategoryModel);
            TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity = this.f59026d;
            C32297d.m95160h(transactionCategoriesSelectorActivity, transactionCategoriesSelectorActivity.getString(C10328q.transaction_categories_deleted_successfully));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55062a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$i */
    /* synthetic */ class C22227i extends C41535k implements C43075l {
        C22227i(Object obj) {
            super(1, obj, TransactionCategoriesSelectorActivity.class, "showLoading", "showLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55063b(boolean z) {
            ((TransactionCategoriesSelectorActivity) this.receiver).m72015e3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55063b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$j */
    /* synthetic */ class C22228j extends C41535k implements C43075l {
        C22228j(Object obj) {
            super(1, obj, TransactionCategoriesSelectorActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo55064b(C21503d.C21504a aVar) {
            ((TransactionCategoriesSelectorActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55064b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$k */
    static final class C22229k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesSelectorActivity f59027d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22229k(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity) {
            super(1);
            this.f59027d = transactionCategoriesSelectorActivity;
        }

        /* renamed from: a */
        public final void mo55065a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            Intent intent = new Intent();
            intent.putExtra("CAT_ID", this.f59027d.m72006V2().mo55097Kw());
            this.f59027d.setResult(-1, intent);
            this.f59027d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55065a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$l */
    /* synthetic */ class C22230l extends C41535k implements C43075l {
        C22230l(Object obj) {
            super(1, obj, TransactionCategoriesSelectorActivity.class, "showLoading", "showLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55066b(boolean z) {
            ((TransactionCategoriesSelectorActivity) this.receiver).m72015e3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55066b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$m */
    /* synthetic */ class C22231m extends C41535k implements C43075l {
        C22231m(Object obj) {
            super(1, obj, TransactionCategoriesSelectorActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo55067b(C21503d.C21504a aVar) {
            ((TransactionCategoriesSelectorActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55067b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$n */
    /* synthetic */ class C22232n extends C41535k implements C43075l {
        C22232n(Object obj) {
            super(1, obj, TransactionCategoriesSelectorActivity.class, "onTransactionCategoryListResponse", "onTransactionCategoryListResponse(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo55068b(List list) {
            ((TransactionCategoriesSelectorActivity) this.receiver).m72014d3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55068b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$o */
    /* synthetic */ class C22233o extends C41535k implements C43075l {
        C22233o(Object obj) {
            super(1, obj, TransactionCategoriesSelectorActivity.class, "showLoading", "showLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55069b(boolean z) {
            ((TransactionCategoriesSelectorActivity) this.receiver).m72015e3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55069b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$p */
    static final class C22234p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesSelectorActivity f59028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22234p(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity) {
            super(1);
            this.f59028d = transactionCategoriesSelectorActivity;
        }

        /* renamed from: a */
        public final void mo55070a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f59028d.mo52674G1(aVar);
            this.f59028d.m72002R2().setVisibility(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55070a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$q */
    static final class C22235q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesSelectorActivity f59029d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22235q(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity) {
            super(1);
            this.f59029d = transactionCategoriesSelectorActivity;
        }

        /* renamed from: a */
        public final void mo55071a(TransactionCategoryModel transactionCategoryModel) {
            C41536l.m120489i(transactionCategoryModel, "it");
            C19490q M2 = this.f59029d.f59020K;
            if (M2 == null) {
                C41536l.m120506z("recyclerAdapter");
                M2 = null;
            }
            M2.mo47725s(transactionCategoryModel);
            TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity = this.f59029d;
            C32297d.m95160h(transactionCategoriesSelectorActivity, transactionCategoriesSelectorActivity.getString(C10328q.transaction_categories_added_successfully));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55071a((TransactionCategoryModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$r */
    static final class C22236r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesSelectorActivity f59030d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22236r(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity) {
            super(0);
            this.f59030d = transactionCategoriesSelectorActivity;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f59030d.findViewById(C10322k.f28784Qe);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$s */
    static final class C22237s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesSelectorActivity f59031d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22237s(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity) {
            super(0);
            this.f59031d = transactionCategoriesSelectorActivity;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f59031d.findViewById(C10322k.f28712Br);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$t */
    static final class C22238t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TransactionCategoriesSelectorActivity f59032d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22238t(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity) {
            super(0);
            this.f59032d = transactionCategoriesSelectorActivity;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f59032d.findViewById(C10322k.f28914yt);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$u */
    public static final class C22239u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59033d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22239u(ComponentActivity componentActivity) {
            super(0);
            this.f59033d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f59033d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$v */
    public static final class C22240v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59034d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22240v(ComponentActivity componentActivity) {
            super(0);
            this.f59034d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59034d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.TransactionCategoriesSelectorActivity$w */
    public static final class C22241w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59035d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59036e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22241w(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59035d = aVar;
            this.f59036e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59035d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59036e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: Q2 */
    private final String m72001Q2(Intent intent) {
        boolean z;
        if (intent == null || !intent.getBooleanExtra("WIZARD_NEXT_BTN_CLICKED", false)) {
            return null;
        }
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("WIZARD_COLLECTED_VALUES");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return stringArrayListExtra.get(0);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final View m72002R2() {
        Object value = this.f59017H.getValue();
        C41536l.m120488h(value, "<get-errorView>(...)");
        return (View) value;
    }

    /* renamed from: S2 */
    private final View m72003S2() {
        Object value = this.f59016G.getValue();
        C41536l.m120488h(value, "<get-progressView>(...)");
        return (View) value;
    }

    /* renamed from: T2 */
    private final RecyclerView m72004T2() {
        Object value = this.f59015F.getValue();
        C41536l.m120488h(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: U2 */
    private final Button m72005U2() {
        Object value = this.f59018I.getValue();
        C41536l.m120488h(value, "<get-saveButton>(...)");
        return (Button) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final TransactionCategoriesViewModel m72006V2() {
        return (TransactionCategoriesViewModel) this.f59019J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m72007W2(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity, View view) {
        C41536l.m120489i(transactionCategoriesSelectorActivity, "this$0");
        transactionCategoriesSelectorActivity.m72006V2().mo55105Sw();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m72008X2(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity, Boolean bool) {
        boolean z;
        C41536l.m120489i(transactionCategoriesSelectorActivity, "this$0");
        if (bool == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        transactionCategoriesSelectorActivity.m72005U2().setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m72009Y2(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity, C37223a aVar) {
        TransactionCategoryModel transactionCategoryModel;
        C41536l.m120489i(transactionCategoriesSelectorActivity, "this$0");
        if (aVar != null && (transactionCategoryModel = (TransactionCategoryModel) aVar.mo90296a()) != null) {
            transactionCategoriesSelectorActivity.m72018h3(transactionCategoryModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m72010Z2(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity, C37223a aVar) {
        C41536l.m120489i(transactionCategoriesSelectorActivity, "this$0");
        if (aVar != null) {
            TransactionCategoryModel transactionCategoryModel = (TransactionCategoryModel) aVar.mo90296a();
        }
        transactionCategoriesSelectorActivity.m72016f3();
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m72011a3(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity, C37223a aVar) {
        C41536l.m120489i(transactionCategoriesSelectorActivity, "this$0");
        if (aVar != null && ((TransactionCategoryModel) aVar.mo90296a()) != null) {
            C35388f2.m105072l2(transactionCategoriesSelectorActivity, transactionCategoriesSelectorActivity.getString(C10328q.transaction_categories_dialog_title), transactionCategoriesSelectorActivity.getString(C10328q.transaction_categories_dialog_text), transactionCategoriesSelectorActivity.getString(C10328q.f28966r2), transactionCategoriesSelectorActivity.getString(C10328q.f28928H0), new C19479f(transactionCategoriesSelectorActivity, aVar), new C19480g(), true, false, (String) null, (View.OnClickListener) null, 896, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m72012b3(TransactionCategoriesSelectorActivity transactionCategoriesSelectorActivity, C37223a aVar, View view) {
        C41536l.m120489i(transactionCategoriesSelectorActivity, "this$0");
        TransactionCategoriesViewModel V2 = transactionCategoriesSelectorActivity.m72006V2();
        Object d = aVar.mo90299d();
        C41536l.m120486f(d);
        V2.mo55106Xw(((TransactionCategoryModel) d).mo55075a());
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m72013c3(View view) {
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final void m72014d3(List list) {
        int i;
        TransactionCategoryModel transactionCategoryModel;
        Object obj;
        boolean z;
        m72003S2().setVisibility(8);
        m72002R2().setVisibility(8);
        m72004T2().setLayoutManager(new LinearLayoutManager(this));
        C19490q qVar = new C19490q(this.f59023N, Boolean.TRUE, m72006V2());
        this.f59020K = qVar;
        qVar.mo47722C(list);
        RecyclerView T2 = m72004T2();
        C19490q qVar2 = this.f59020K;
        if (qVar2 == null) {
            C41536l.m120506z("recyclerAdapter");
            qVar2 = null;
        }
        T2.setAdapter(qVar2);
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                List e = ((TransactionCategoryModel) it.next()).mo55079e();
                if (e != null) {
                    Iterator it2 = e.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((TransactionCategoryModel) obj).mo55075a() == getIntent().getLongExtra("CAT_ID", -1)) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    transactionCategoryModel = (TransactionCategoryModel) obj;
                } else {
                    transactionCategoryModel = null;
                }
                if (transactionCategoryModel != null) {
                    i = i2;
                }
                i2 = i3;
            }
        } else {
            i = 0;
        }
        RecyclerView.C1747p layoutManager = m72004T2().getLayoutManager();
        C41536l.m120487g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).mo5201P2(i, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m72015e3(boolean z) {
        int i;
        View S2 = m72003S2();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        S2.setVisibility(i);
        m72002R2().setVisibility(8);
    }

    /* renamed from: f3 */
    private final void m72016f3() {
        C35893a.C35894a a = C35893a.m106783a(this).mo88134a(new WizardObject().setInputStyle(1).setInputTitle(getString(C10328q.transaction_categories_add_category_wizard_title)));
        C19490q qVar = this.f59020K;
        if (qVar == null) {
            C41536l.m120506z("recyclerAdapter");
            qVar = null;
        }
        a.mo88136c(qVar.mo47728w()).mo88142i();
    }

    /* renamed from: g3 */
    public static final void m72017g3(Activity activity, long j, long j2, Long l, boolean z, int i) {
        f59014O.mo55055a(activity, j, j2, l, z, i);
    }

    /* renamed from: h3 */
    private final void m72018h3(TransactionCategoryModel transactionCategoryModel) {
        C35893a.C35894a a = C35893a.m106783a(this).mo88134a(new WizardObject().setInputStyle(1).setValue(transactionCategoryModel.mo55082g()).setInputTitle(getString(C10328q.transaction_categories_add_category_wizard_title)));
        C19490q qVar = this.f59020K;
        if (qVar == null) {
            C41536l.m120506z("recyclerAdapter");
            qVar = null;
        }
        a.mo88136c(qVar.mo47728w()).mo88138e(1212).mo88142i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_transaction_categories;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        findViewById(C10322k.horizontal_error_retry_button).setOnClickListener(new C19474a(this));
        m72006V2().mo55094Hw().mo4819k(this, new C19475b(this));
        m72006V2().mo55099Mw().mo4819k(this, new C19476c(this));
        m72006V2().mo55096Jw().mo4819k(this, new C19477d(this));
        m72006V2().mo55102Pw().mo4819k(this, new C19478e(this));
        C21484c.m69411c(m72006V2().mo55103Qw(), this, new C22232n(this), new C22233o(this), new C22234p(this));
        C21484c.m69411c(m72006V2().mo55095Iw(), this, new C22235q(this), new C22221c(this), new C22222d(this));
        C21484c.m69411c(m72006V2().mo55098Lw(), this, new C22223e(this), new C22224f(this), new C22225g(this));
        C21484c.m69411c(m72006V2().mo55101Ow(), this, new C22226h(this), new C22227i(this), new C22228j(this));
        C21484c.m69411c(m72006V2().mo55104Rw(), this, new C22229k(this), new C22230l(this), new C22231m(this));
        this.f59021L = getIntent().getLongExtra("PFM_ID", -1);
        this.f59023N = getIntent().getBooleanExtra("CATEGORY_IS_INCOME", false);
        Long valueOf = Long.valueOf(getIntent().getLongExtra("OPERATION_DATE", -1));
        this.f59022M = valueOf;
        if (valueOf != null && valueOf.longValue() == -1) {
            this.f59022M = null;
        }
        m72006V2().mo55110hx(getIntent().getLongExtra("CAT_ID", -1));
        m72006V2().mo55109gx(getIntent().getLongExtra("CAT_ID", -1));
        m72006V2().mo55105Sw();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            String Q2 = m72001Q2(intent);
            if (Q2 == null || Q2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            if (i == 1212) {
                m72006V2().mo55093Cw(Q2);
            } else if (i == 10001) {
                m72006V2().mo55112ww(Q2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        MedalliaDigital.enableIntercept();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.disableIntercept();
    }

    public final void onSaveClick(View view) {
        C41536l.m120489i(view, "v");
        if (m72005U2().isEnabled()) {
            m72006V2().mo55108cx(this.f59021L, m72006V2().mo55097Kw(), this.f59022M);
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.header_text_payments_categories);
        C41536l.m120488h(string, "getString(R.string.heade…text_payments_categories)");
        return string;
    }
}
