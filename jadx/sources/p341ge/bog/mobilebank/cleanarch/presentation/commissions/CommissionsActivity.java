package p341ge.bog.mobilebank.cleanarch.presentation.commissions;

import a81.C30772sa;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import g81.C32184h0;
import g91.C32297d;
import g91.C32314k;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.presentation.commissions.model.UpcomingCommissionUIModel;
import p341ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.DepositViolationWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p90.C27433u;
import s00.C28118d;
import s00.C28119e;
import s00.C28120f;
import s00.C28121g;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43080q;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity */
public final class CommissionsActivity extends C30772sa {

    /* renamed from: N */
    public static final C21442a f57309N = new C21442a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private boolean f57310F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final ArrayList f57311G = new ArrayList();

    /* renamed from: H */
    private final C41217g f57312H = C41219i.m119470b(new C21456o(this));
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C32184h0 f57313I;

    /* renamed from: J */
    private final C41217g f57314J = new C1617p0(C41520a0.m120436b(CommissionsViewModel.class), new C21461t(this), new C21460s(this), new C21462u((C43064a) null, this));

    /* renamed from: K */
    private C35893a.C35894a f57315K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public String f57316L;

    /* renamed from: M */
    private int f57317M;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$a */
    public static final class C21442a {
        private C21442a() {
        }

        public /* synthetic */ C21442a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final Intent m69321a(Context context, String str) {
            Intent intent = new Intent(context, CommissionsActivity.class);
            intent.putExtra("CommissionsActivity.EXTRA_COMMISSION_CCY", str);
            return intent;
        }

        /* renamed from: b */
        public final void mo53524b(Activity activity, String str) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(str, "ccy");
            activity.startActivityForResult(m69321a(activity, str), 10033);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$b */
    /* synthetic */ class C21443b extends C41535k implements C43075l {
        C21443b(Object obj) {
            super(1, obj, CommissionsActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo53525b(boolean z) {
            ((CommissionsActivity) this.receiver).m69310c3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53525b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$c */
    /* synthetic */ class C21444c extends C41535k implements C43075l {
        C21444c(Object obj) {
            super(1, obj, CommissionsActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo53526b(C21503d.C21504a aVar) {
            ((CommissionsActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53526b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$d */
    static final class C21445d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CommissionsActivity f57318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21445d(CommissionsActivity commissionsActivity) {
            super(1);
            this.f57318d = commissionsActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
            r3 = (java.lang.Integer) r3.mo90296a();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo53527a(m41.C37223a r3) {
            /*
                r2 = this;
                ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity r0 = r2.f57318d
                java.util.ArrayList r0 = r0.f57311G
                r1 = 1
                java.lang.Object r0 = ie1.C41358y.m120010Z(r0, r1)
                ge.bog.mobilebank.ui.wizard.model.WizardObject r0 = (p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject) r0
                if (r0 != 0) goto L_0x0010
                goto L_0x0023
            L_0x0010:
                if (r3 == 0) goto L_0x001f
                java.lang.Object r3 = r3.mo90296a()
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L_0x001f
                java.lang.String r3 = r3.toString()
                goto L_0x0020
            L_0x001f:
                r3 = 0
            L_0x0020:
                r0.setValue(r3)
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity.C21445d.mo53527a(m41.a):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53527a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$e */
    static final class C21446e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CommissionsActivity f57319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21446e(CommissionsActivity commissionsActivity) {
            super(1);
            this.f57319d = commissionsActivity;
        }

        /* renamed from: a */
        public final void mo53528a(C37223a aVar) {
            CommissionsViewModel.C21467a aVar2;
            CommissionsActivity commissionsActivity = this.f57319d;
            if (aVar != null && (aVar2 = (CommissionsViewModel.C21467a) aVar.mo90296a()) != null) {
                commissionsActivity.m69309b3(aVar2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53528a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$f */
    static final class C21447f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CommissionsActivity f57320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21447f(CommissionsActivity commissionsActivity) {
            super(1);
            this.f57320d = commissionsActivity;
        }

        /* renamed from: a */
        public final void mo53529a(List list) {
            C41536l.m120489i(list, "it");
            C32184h0 I2 = this.f57320d.f57313I;
            if (I2 == null) {
                C41536l.m120506z("adapter");
                I2 = null;
            }
            I2.mo72712n(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53529a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$g */
    /* synthetic */ class C21448g extends C41535k implements C43075l {
        C21448g(Object obj) {
            super(1, obj, CommissionsActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo53530b(boolean z) {
            ((CommissionsActivity) this.receiver).m69310c3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53530b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$h */
    /* synthetic */ class C21449h extends C41535k implements C43075l {
        C21449h(Object obj) {
            super(1, obj, CommissionsActivity.class, "retryError", "retryError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo53531b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CommissionsActivity) this.receiver).m69314f3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53531b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$i */
    /* synthetic */ class C21450i extends C41535k implements C43075l {
        C21450i(Object obj) {
            super(1, obj, CommissionsActivity.class, "onAccountsLoaded", "onAccountsLoaded(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo53532b(List list) {
            C41536l.m120489i(list, "p0");
            ((CommissionsActivity) this.receiver).m69313f(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53532b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$j */
    /* synthetic */ class C21451j extends C41535k implements C43075l {
        C21451j(Object obj) {
            super(1, obj, CommissionsActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo53533b(boolean z) {
            ((CommissionsActivity) this.receiver).m69310c3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53533b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$k */
    /* synthetic */ class C21452k extends C41535k implements C43075l {
        C21452k(Object obj) {
            super(1, obj, CommissionsActivity.class, "retryError", "retryError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo53534b(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CommissionsActivity) this.receiver).m69314f3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53534b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$l */
    static final class C21453l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CommissionsActivity f57321d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21453l(CommissionsActivity commissionsActivity) {
            super(1);
            this.f57321d = commissionsActivity;
        }

        /* renamed from: a */
        public final void mo53535a(BigDecimal bigDecimal) {
            C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
            C41524c0 c0Var = C41524c0.f97701a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = bigDecimal;
            String K2 = this.f57321d.f57316L;
            if (K2 == null) {
                C41536l.m120506z("ccy");
                K2 = null;
            }
            objArr[1] = C32314k.m95245a(K2);
            String format = String.format(locale, "%.2f%s", Arrays.copyOf(objArr, 2));
            C41536l.m120488h(format, "format(locale, format, *args)");
            this.f57321d.m69304W2().f69870f.setText(format);
            this.f57321d.m69304W2().f69884t.setButtonText(this.f57321d.getString(C10328q.button_text_pay_amount, new Object[]{format}));
            WizardObject wizardObject = (WizardObject) C41358y.m120009Y(this.f57321d.f57311G);
            if (wizardObject != null) {
                String format2 = String.format(locale, "%.2f", Arrays.copyOf(new Object[]{bigDecimal}, 1));
                C41536l.m120488h(format2, "format(locale, format, *args)");
                wizardObject.setValue(format2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53535a((BigDecimal) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$m */
    static final class C21454m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CommissionsActivity f57322d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21454m(CommissionsActivity commissionsActivity) {
            super(1);
            this.f57322d = commissionsActivity;
        }

        /* renamed from: a */
        public final void mo53536a(C37223a aVar) {
            String str;
            TextView textView = this.f57322d.m69304W2().f69888x;
            if (aVar != null && (str = (String) aVar.mo90296a()) != null) {
                textView.setText(str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53536a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$n */
    static final class C21455n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CommissionsActivity f57323d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21455n(CommissionsActivity commissionsActivity) {
            super(1);
            this.f57323d = commissionsActivity;
        }

        /* renamed from: a */
        public final void mo53537a(Object obj) {
            C41536l.m120489i(obj, "it");
            this.f57323d.m69311d3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53537a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$o */
    static final class C21456o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CommissionsActivity f57324d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21456o(CommissionsActivity commissionsActivity) {
            super(0);
            this.f57324d = commissionsActivity;
        }

        /* renamed from: b */
        public final C27433u invoke() {
            C27433u a = C27433u.m85039a(this.f57324d.findViewById(C10322k.commissions_root));
            C41536l.m120488h(a, "bind(findViewById(R.id.commissions_root))");
            return a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$p */
    static final class C21457p extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ CommissionsActivity f57325d;

        /* renamed from: e */
        final /* synthetic */ RecyclerView f57326e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21457p(CommissionsActivity commissionsActivity, RecyclerView recyclerView) {
            super(2);
            this.f57325d = commissionsActivity;
            this.f57326e = recyclerView;
        }

        /* renamed from: a */
        public final View mo53539a(int i, ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "<anonymous parameter 1>");
            View inflate = this.f57325d.getLayoutInflater().inflate(C10324m.item_commission_fee, this.f57326e, false);
            C41536l.m120488h(inflate, "layoutInflater.inflate(R…ommission_fee, rv, false)");
            return inflate;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo53539a(((Number) obj).intValue(), (ViewGroup) obj2);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$q */
    static final class C21458q extends C41537m implements C43080q {

        /* renamed from: d */
        public static final C21458q f57327d = new C21458q();

        C21458q() {
            super(3);
        }

        /* renamed from: a */
        public final void mo53540a(UpcomingCommissionUIModel upcomingCommissionUIModel, int i, View view) {
            String str;
            C41536l.m120489i(view, "view");
            if (upcomingCommissionUIModel != null) {
                View findViewById = view.findViewById(C10322k.tv_commission_due_date);
                C41536l.m120488h(findViewById, "view.findViewById(R.id.tv_commission_due_date)");
                View findViewById2 = view.findViewById(C10322k.tv_commission_name);
                C41536l.m120488h(findViewById2, "view.findViewById(R.id.tv_commission_name)");
                TextView textView = (TextView) findViewById2;
                View findViewById3 = view.findViewById(C10322k.tv_commission_amount);
                C41536l.m120488h(findViewById3, "view.findViewById(R.id.tv_commission_amount)");
                TextView textView2 = (TextView) findViewById3;
                ((TextView) findViewById).setText(new SimpleDateFormat("dd.MM.yyyy", new Locale("ge")).format(new Date(upcomingCommissionUIModel.mo53545d())));
                String e = upcomingCommissionUIModel.mo53547e();
                if (e != null) {
                    str = C32343x.m95388F(e, new Object[0]);
                } else {
                    str = null;
                }
                if (str == null) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(str);
                    textView.setVisibility(0);
                }
                C41524c0 c0Var = C41524c0.f97701a;
                String format = String.format(Locale.US, "%.2f%s", Arrays.copyOf(new Object[]{upcomingCommissionUIModel.mo53543a(), C32314k.m95245a(upcomingCommissionUIModel.mo53544b())}, 2));
                C41536l.m120488h(format, "format(locale, format, *args)");
                textView2.setText(format);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo53540a((UpcomingCommissionUIModel) obj, ((Number) obj2).intValue(), (View) obj3);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$r */
    static final class C21459r implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f57328a;

        C21459r(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f57328a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f57328a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f57328a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$s */
    public static final class C21460s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21460s(ComponentActivity componentActivity) {
            super(0);
            this.f57329d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f57329d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$t */
    public static final class C21461t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57330d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21461t(ComponentActivity componentActivity) {
            super(0);
            this.f57330d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f57330d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionsActivity$u */
    public static final class C21462u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f57331d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f57332e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21462u(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f57331d = aVar;
            this.f57332e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f57331d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f57332e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: R2 */
    private final void m69299R2() {
        m69304W2().f69870f.setOnClickListener(new C28118d(this));
        m69304W2().f69888x.setOnClickListener(new C28119e(this));
        m69304W2().f69884t.setOnClickListener(new C28120f(this));
        m69304W2().f69886v.mo3946b().setOnClickListener(new C28121g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m69300S2(CommissionsActivity commissionsActivity, View view) {
        C41536l.m120489i(commissionsActivity, "this$0");
        commissionsActivity.m69316h3(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m69301T2(CommissionsActivity commissionsActivity, View view) {
        C41536l.m120489i(commissionsActivity, "this$0");
        commissionsActivity.m69316h3(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m69302U2(CommissionsActivity commissionsActivity, View view) {
        C41536l.m120489i(commissionsActivity, "this$0");
        commissionsActivity.m69306Y2().mo53572xw();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m69303V2(CommissionsActivity commissionsActivity, View view) {
        C41536l.m120489i(commissionsActivity, "this$0");
        commissionsActivity.m69312e3();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final C27433u m69304W2() {
        return (C27433u) this.f57312H.getValue();
    }

    /* renamed from: X2 */
    private final C32184h0 m69305X2(RecyclerView recyclerView, List list) {
        return new C32184h0(list, new C21457p(this, recyclerView), (C43079p) null, (Integer) null, C21458q.f57327d, (C43080q) null, 44, (DefaultConstructorMarker) null);
    }

    /* renamed from: Y2 */
    private final CommissionsViewModel m69306Y2() {
        return (CommissionsViewModel) this.f57314J.getValue();
    }

    /* renamed from: Z2 */
    private final C35893a.C35894a m69307Z2(ArrayList arrayList, List list) {
        C35893a.C35894a a = C35893a.m106783a(this);
        a.mo88137d(AdvancedWizardActivity.class);
        a.mo88140g(arrayList);
        a.mo88136c(m69304W2().mo3946b());
        a.mo88141h(0);
        a.mo88139f(new DepositViolationWizardPlugin(new ArrayList(list)));
        if (this.f57310F) {
            a.mo88142i();
        }
        C41536l.m120488h(a, "startWith(this).apply {\n…        start()\n        }");
        return a;
    }

    /* renamed from: a3 */
    private final void m69308a3() {
        RecyclerView recyclerView = m69304W2().f69873i;
        C41536l.m120488h(recyclerView, "binding.commissionsListRecycler");
        this.f57313I = m69305X2(recyclerView, C41341q.m119907j());
        RecyclerView recyclerView2 = m69304W2().f69873i;
        recyclerView2.setLayoutManager(new CommissionsActivity$initializeList$1$1(recyclerView2.getContext()));
        C32184h0 h0Var = this.f57313I;
        if (h0Var == null) {
            C41536l.m120506z("adapter");
            h0Var = null;
        }
        recyclerView2.setAdapter(h0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final void m69309b3(CommissionsViewModel.C21467a aVar) {
        boolean z;
        Button button = m69304W2().f69884t;
        CommissionsViewModel.C21467a aVar2 = CommissionsViewModel.C21467a.EXCESS;
        if (aVar != aVar2) {
            z = true;
        } else {
            z = false;
        }
        button.setEnabled(z);
        if (aVar == CommissionsViewModel.C21467a.INCOMPLETE) {
            ConstraintLayout constraintLayout = m69304W2().f69869e;
            C41536l.m120488h(constraintLayout, "binding.commissionWarningContainer");
            C32343x.m95447f1(constraintLayout);
        } else {
            ConstraintLayout constraintLayout2 = m69304W2().f69869e;
            C41536l.m120488h(constraintLayout2, "binding.commissionWarningContainer");
            C32343x.m95455i0(constraintLayout2);
        }
        if (aVar == aVar2) {
            C32297d.m95154b(this, C32343x.m95452h0(C10328q.excess_amount, new Object[0]));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m69310c3(boolean z) {
        boolean z2 = true;
        if (z) {
            this.f57317M++;
        } else {
            int i = this.f57317M;
            if (i > 0) {
                this.f57317M = i - 1;
            }
        }
        if (this.f57317M <= 0) {
            z2 = false;
        }
        m69315g3(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final void m69311d3() {
        setResult(-1);
        finish();
    }

    /* renamed from: e3 */
    private final void m69312e3() {
        m69304W2().f69887w.setVisibility(8);
        CommissionsViewModel Y2 = m69306Y2();
        String str = this.f57316L;
        String str2 = null;
        if (str == null) {
            C41536l.m120506z("ccy");
            str = null;
        }
        Y2.mo53573yw(str);
        CommissionsViewModel Y22 = m69306Y2();
        String str3 = this.f57316L;
        if (str3 == null) {
            C41536l.m120506z("ccy");
        } else {
            str2 = str3;
        }
        Y22.mo53564nw(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m69313f(List list) {
        ArrayList arrayList = this.f57311G;
        CommissionsViewModel Y2 = m69306Y2();
        String str = this.f57316L;
        if (str == null) {
            C41536l.m120506z("ccy");
            str = null;
        }
        String a = C32314k.m95245a(str);
        arrayList.addAll(Y2.mo53570tw(" " + a));
        this.f57315K = m69307Z2(this.f57311G, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m69314f3(C21503d.C21504a aVar) {
        mo52674G1(aVar);
        m69304W2().f69887w.setVisibility(0);
    }

    /* renamed from: g3 */
    private final void m69315g3(boolean z) {
        int i;
        FrameLayout frameLayout = m69304W2().f69883s;
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        frameLayout.setVisibility(i);
        m69304W2().f69884t.setLoading(z);
    }

    /* renamed from: h3 */
    private final void m69316h3(int i) {
        C35893a.C35894a aVar = this.f57315K;
        if (aVar != null) {
            C35893a.C35894a aVar2 = null;
            if (aVar == null) {
                C41536l.m120506z("wizard");
                aVar = null;
            }
            aVar.mo88141h(i);
            C35893a.C35894a aVar3 = this.f57315K;
            if (aVar3 == null) {
                C41536l.m120506z("wizard");
            } else {
                aVar2 = aVar3;
            }
            aVar2.mo88142i();
            return;
        }
        this.f57310F = true;
    }

    /* renamed from: l1 */
    private final void m69317l1() {
        CommissionsViewModel Y2 = m69306Y2();
        C21484c.m69411c(Y2.mo53565ow(), this, new C21447f(this), new C21448g(this), new C21449h(this));
        C21484c.m69411c(Y2.mo53562lw(), this, new C21450i(this), new C21451j(this), new C21452k(this));
        C37224b.m109963b(Y2.mo53563mw(), this, new C21453l(this));
        Y2.mo53567qi().mo4819k(this, new C21459r(new C21454m(this)));
        C21484c.m69411c(Y2.mo53566pw(), this, new C21455n(this), new C21443b(this), new C21444c(this));
        Y2.mo53569rw().mo4819k(this, new C21459r(new C21445d(this)));
        Y2.mo53568qw().mo4819k(this, new C21459r(new C21446e(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_commissions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        String stringExtra = getIntent().getStringExtra("CommissionsActivity.EXTRA_COMMISSION_CCY");
        if (stringExtra == null) {
            stringExtra = "GEL";
        }
        this.f57316L = stringExtra;
        m69317l1();
        m69308a3();
        CommissionsViewModel Y2 = m69306Y2();
        String str = this.f57316L;
        String str2 = null;
        if (str == null) {
            C41536l.m120506z("ccy");
            str = null;
        }
        Y2.mo53573yw(str);
        CommissionsViewModel Y22 = m69306Y2();
        String str3 = this.f57316L;
        if (str3 == null) {
            C41536l.m120506z("ccy");
        } else {
            str2 = str3;
        }
        Y22.mo53564nw(str2);
        m69299R2();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m69306Y2().mo53571ww(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f57310F = false;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.common_text_commissions);
        C41536l.m120488h(string, "getString(R.string.common_text_commissions)");
        return string;
    }
}
