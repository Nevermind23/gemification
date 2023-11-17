package p341ge.bog.mobilebank.galtandtaggart.presentation.parameters;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g31.C32054a;
import g41.C32081a;
import g91.C32288b;
import g91.C32343x;
import gg0.C24714c;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import ie0.C25183c;
import ie0.C25185e;
import ie0.C25187g;
import ie0.C25188h;
import ie0.C25190j;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.GTClosable;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p380ck.C10463g;
import p420fh.C12902d;
import p420fh.C12910e;
import ue0.C28716c0;
import ue1.C43064a;
import ue1.C43075l;
import xe0.C29751i;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity */
public final class GTParametersInvestmentAccountActivity extends C30772sa {

    /* renamed from: H */
    public static final C23648a f61668H = new C23648a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f61669F = new C1617p0(C41520a0.m120436b(GTParametersViewModel$ViewModel.class), new C23662h(this), new C23661g(this), new C23663i((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C28716c0 f61670G;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$a */
    public static final class C23648a {
        private C23648a() {
        }

        public /* synthetic */ C23648a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60526a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, GTParametersInvestmentAccountActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$b */
    static final class C23649b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTParametersInvestmentAccountActivity f61671d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$b$a */
        static final class C23650a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTParametersInvestmentAccountActivity f61672d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23650a(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity) {
                super(1);
                this.f61672d = gTParametersInvestmentAccountActivity;
            }

            /* renamed from: a */
            public final void mo60528a(C29751i iVar) {
                C41536l.m120489i(iVar, "it");
                C28716c0 G2 = this.f61672d.f61670G;
                C28716c0 c0Var = null;
                if (G2 == null) {
                    C41536l.m120506z("binding");
                    G2 = null;
                }
                G2.f73150f.setText(iVar.mo69804d());
                C28716c0 G22 = this.f61672d.f61670G;
                if (G22 == null) {
                    C41536l.m120506z("binding");
                    G22 = null;
                }
                StateView stateView = G22.f73149e;
                C41536l.m120488h(stateView, "binding.accountNumberState");
                C32343x.m95447f1(stateView);
                C28716c0 G23 = this.f61672d.f61670G;
                if (G23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    c0Var = G23;
                }
                c0Var.f73149e.mo53595c();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60528a((C29751i) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$b$b */
        static final class C23651b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTParametersInvestmentAccountActivity f61673d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23651b(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity) {
                super(1);
                this.f61673d = gTParametersInvestmentAccountActivity;
            }

            /* renamed from: a */
            public final void mo60529a(C29751i iVar) {
                C28716c0 G2 = this.f61673d.f61670G;
                if (G2 == null) {
                    C41536l.m120506z("binding");
                    G2 = null;
                }
                G2.f73149e.mo53597e();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60529a((C29751i) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$b$c */
        static final class C23652c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTParametersInvestmentAccountActivity f61674d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23652c(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity) {
                super(1);
                this.f61674d = gTParametersInvestmentAccountActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f61674d.mo74709H1(th);
                C28716c0 G2 = this.f61674d.f61670G;
                if (G2 == null) {
                    C41536l.m120506z("binding");
                    G2 = null;
                }
                StateView stateView = G2.f73149e;
                C41536l.m120488h(stateView, "binding.accountNumberState");
                C32343x.m95455i0(stateView);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23649b(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity) {
            super(1);
            this.f61671d = gTParametersInvestmentAccountActivity;
        }

        /* renamed from: a */
        public final void mo60527a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C23650a(this.f61671d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23651b(this.f61671d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23652c(this.f61671d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60527a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$c */
    static final class C23653c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTParametersInvestmentAccountActivity f61675d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$c$a */
        static final class C23654a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTParametersInvestmentAccountActivity f61676d;

            /* renamed from: e */
            final /* synthetic */ C31128a f61677e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23654a(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity, C31128a aVar) {
                super(1);
                this.f61676d = gTParametersInvestmentAccountActivity;
                this.f61677e = aVar;
            }

            /* renamed from: a */
            public final void mo60532a(List list) {
                C41536l.m120489i(list, "it");
                C28716c0 G2 = this.f61676d.f61670G;
                C28716c0 c0Var = null;
                if (G2 == null) {
                    C41536l.m120506z("binding");
                    G2 = null;
                }
                G2.f73156l.removeAllViews();
                List<GTClosable> list2 = (List) this.f61677e.mo71340a();
                boolean z = true;
                if (list2 != null) {
                    GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity = this.f61676d;
                    for (GTClosable gTClosable : list2) {
                        if (!C41536l.m120484d(gTClosable.getFieldValue(), Boolean.TRUE)) {
                            z = false;
                        }
                        gTParametersInvestmentAccountActivity.m76455J2(gTClosable);
                    }
                }
                C28716c0 G22 = this.f61676d.f61670G;
                if (G22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    c0Var = G22;
                }
                c0Var.f73152h.setEnabled(z);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60532a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23653c(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity) {
            super(1);
            this.f61675d = gTParametersInvestmentAccountActivity;
        }

        /* renamed from: a */
        public final void mo60531a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C23654a(this.f61675d, aVar), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60531a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$d */
    static final class C23655d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTParametersInvestmentAccountActivity f61678d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$d$a */
        static final class C23656a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTParametersInvestmentAccountActivity f61679d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23656a(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity) {
                super(1);
                this.f61679d = gTParametersInvestmentAccountActivity;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static final void m76471c(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity) {
                C41536l.m120489i(gTParametersInvestmentAccountActivity, "this$0");
                gTParametersInvestmentAccountActivity.m76458M2();
            }

            /* renamed from: b */
            public final void mo60534b(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity = this.f61679d;
                String string = gTParametersInvestmentAccountActivity.getString(C25190j.gt_close_account_success_message);
                C41536l.m120488h(string, "getString(R.string.gt_cl…_account_success_message)");
                C12910e.m48787e(gTParametersInvestmentAccountActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
                new Handler(Looper.getMainLooper()).postDelayed(new C23678b(this.f61679d), 1500);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60534b((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$d$b */
        static final class C23657b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTParametersInvestmentAccountActivity f61680d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23657b(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity) {
                super(1);
                this.f61680d = gTParametersInvestmentAccountActivity;
            }

            /* renamed from: a */
            public final void mo60535a(C41238w wVar) {
                C28716c0 G2 = this.f61680d.f61670G;
                if (G2 == null) {
                    C41536l.m120506z("binding");
                    G2 = null;
                }
                G2.f73149e.mo53597e();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60535a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$d$c */
        static final class C23658c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ GTParametersInvestmentAccountActivity f61681d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23658c(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity) {
                super(1);
                this.f61681d = gTParametersInvestmentAccountActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f61681d.mo74709H1(th);
                C28716c0 G2 = this.f61681d.f61670G;
                C28716c0 c0Var = null;
                if (G2 == null) {
                    C41536l.m120506z("binding");
                    G2 = null;
                }
                StateView stateView = G2.f73149e;
                C41536l.m120488h(stateView, "binding.accountNumberState");
                C32343x.m95447f1(stateView);
                C28716c0 G22 = this.f61681d.f61670G;
                if (G22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    c0Var = G22;
                }
                c0Var.f73149e.mo53595c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23655d(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity) {
            super(1);
            this.f61678d = gTParametersInvestmentAccountActivity;
        }

        /* renamed from: a */
        public final void mo60533a(C31128a aVar) {
            C41536l.m120488h(aVar, "res");
            C31132b.m92648j(aVar, (int[]) null, new C23656a(this.f61678d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23657b(this.f61678d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C23658c(this.f61678d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60533a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$e */
    static final class C23659e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTParametersInvestmentAccountActivity f61682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23659e(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity) {
            super(1);
            this.f61682d = gTParametersInvestmentAccountActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "navigate");
            if (bool.booleanValue()) {
                this.f61682d.m76458M2();
            } else {
                GTParametersInvestmentAccountActivity.super.onBackPressed();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$f */
    static final class C23660f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61683a;

        C23660f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61683a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61683a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61683a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$g */
    public static final class C23661g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61684d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23661g(ComponentActivity componentActivity) {
            super(0);
            this.f61684d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61684d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$h */
    public static final class C23662h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61685d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23662h(ComponentActivity componentActivity) {
            super(0);
            this.f61685d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61685d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity$i */
    public static final class C23663i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61686d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61687e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23663i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61686d = aVar;
            this.f61687e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61686d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61687e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final void m76455J2(GTClosable gTClosable) {
        int i;
        int i2;
        C28716c0 c0Var = null;
        View inflate = getLayoutInflater().inflate(C25188h.layout_gt_close_parameters, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(C25187g.f64681Q1);
        Boolean fieldValue = gTClosable.getFieldValue();
        Boolean bool = Boolean.TRUE;
        if (C41536l.m120484d(fieldValue, bool)) {
            i = C25185e.f64655h;
        } else {
            i = C25185e.icons_16_system_close;
        }
        imageView.setImageResource(i);
        if (C41536l.m120484d(gTClosable.getFieldValue(), bool)) {
            i2 = C25183c.f64650l;
        } else {
            i2 = C25183c.f64645g;
        }
        imageView.setColorFilter(C0767a.m2893c(this, i2));
        ((TextView) inflate.findViewById(C25187g.f64704j4)).setText(C32343x.m95388F(gTClosable.getFieldDictionaryKey(), new Object[0]));
        C28716c0 c0Var2 = this.f61670G;
        if (c0Var2 == null) {
            C41536l.m120506z("binding");
            c0Var2 = null;
        }
        c0Var2.f73156l.addView(inflate);
        C28716c0 c0Var3 = this.f61670G;
        if (c0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            c0Var = c0Var3;
        }
        c0Var.f73152h.setOnClickListener(new C24714c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m76456K2(GTParametersInvestmentAccountActivity gTParametersInvestmentAccountActivity, View view) {
        C41536l.m120489i(gTParametersInvestmentAccountActivity, "this$0");
        C32054a.C32061g gVar = C32054a.C32061g.f78903f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(gVar, F, " ", " ");
        C23673a.f61710D.mo60563a().mo4576A1(gTParametersInvestmentAccountActivity.getSupportFragmentManager(), (String) null);
    }

    /* renamed from: L2 */
    private final GTParametersViewModel$ViewModel m76457L2() {
        return (GTParametersViewModel$ViewModel) this.f61669F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final void m76458M2() {
        mo86424F1(MainActivity.class, C32288b.OpenProductsOnMainActivity);
    }

    /* renamed from: N2 */
    private final void m76459N2() {
        m76457L2().mo60551qw().mo60542R8().mo4819k(this, new C23660f(new C23649b(this)));
        m76457L2().mo60551qw().mo60540Fi().mo4819k(this, new C23660f(new C23653c(this)));
        m76457L2().mo60551qw().mo60543ba().mo4819k(this, new C23660f(new C23655d(this)));
        m76457L2().mo60551qw().mo60541Po().mo4819k(this, new C23660f(new C23659e(this)));
    }

    /* renamed from: O2 */
    private final void m76460O2() {
        C28716c0 c0Var = this.f61670G;
        if (c0Var == null) {
            C41536l.m120506z("binding");
            c0Var = null;
        }
        c0Var.f73152h.setEnabled(false);
        c0Var.f73151g.setTitle(getString(C25190j.gt_parameters_inner_title));
        c0Var.f73150f.setTitle(getString(C25190j.gt_parameters_number_title));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28716c0 d = C28716c0.m87982d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f61670G = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        m76460O2();
        m76459N2();
    }

    public void onBackPressed() {
        m76457L2().mo60548ow().mo60544l();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C25190j.gt_parameters_header_title);
        C41536l.m120488h(string, "getString(R.string.gt_parameters_header_title)");
        return string;
    }
}
