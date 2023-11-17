package p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import he1.C41217g;
import ie0.C25190j;
import if0.C25192a;
import java.io.Serializable;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.trading.GTShareTradeResultViewModel$ViewModel;
import ue0.C28727g0;
import ue1.C43064a;
import ug0.C28786c;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeResultActivity */
public final class GTShareTradeResultActivity extends C30772sa {

    /* renamed from: J */
    public static final C23900a f62119J = new C23900a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f62120F = new C1617p0(C41520a0.m120436b(GTShareTradeResultViewModel$ViewModel.class), new C23904e(this), new C23903d(this), new C23905f((C43064a) null, this));

    /* renamed from: G */
    private C28727g0 f62121G;

    /* renamed from: H */
    private final C41217g f62122H = C41219i.m119470b(new C23902c(this));

    /* renamed from: I */
    private final C41217g f62123I = C41219i.m119470b(new C23906g(this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeResultActivity$a */
    public static final class C23900a {
        private C23900a() {
        }

        public /* synthetic */ C23900a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60884a(String str, C25192a aVar, String str2, Double d, Double d2, Double d3, Double d4, Context context) {
            C41536l.m120489i(aVar, "actionType");
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, GTShareTradeResultActivity.class);
            intent.putExtra("KEY_ACTION_TYPE", aVar);
            intent.putExtra("KEY_SYMBOL", str);
            intent.putExtra("KEY_NAME", str2);
            intent.putExtra("KEY_AMOUNT", d);
            intent.putExtra("KEY_QUANTITY", d2);
            intent.putExtra("KEY_TOTAL_AMOUNT", d3);
            intent.putExtra("KEY_FEE", d4);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeResultActivity$b */
    public /* synthetic */ class C23901b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62124a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                if0.a[] r0 = if0.C25192a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                if0.a r1 = if0.C25192a.SELL_SHARE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                if0.a r1 = if0.C25192a.BUY_SHARE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f62124a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeResultActivity.C23901b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeResultActivity$c */
    static final class C23902c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeResultActivity f62125d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23902c(GTShareTradeResultActivity gTShareTradeResultActivity) {
            super(0);
            this.f62125d = gTShareTradeResultActivity;
        }

        /* renamed from: b */
        public final C25192a invoke() {
            Intent intent = this.f62125d.getIntent();
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_ACTION_TYPE") : null;
            C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.domain.shared.GTActionType");
            return (C25192a) serializableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeResultActivity$d */
    public static final class C23903d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f62126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23903d(ComponentActivity componentActivity) {
            super(0);
            this.f62126d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f62126d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeResultActivity$e */
    public static final class C23904e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f62127d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23904e(ComponentActivity componentActivity) {
            super(0);
            this.f62127d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f62127d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeResultActivity$f */
    public static final class C23905f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62128d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f62129e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23905f(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f62128d = aVar;
            this.f62129e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62128d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f62129e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeResultActivity$g */
    static final class C23906g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTShareTradeResultActivity f62130d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23906g(GTShareTradeResultActivity gTShareTradeResultActivity) {
            super(0);
            this.f62130d = gTShareTradeResultActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getStringExtra("KEY_SYMBOL");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeResultActivity r0 = r2.f62130d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "KEY_SYMBOL"
                java.lang.String r0 = r0.getStringExtra(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.GTShareTradeResultActivity.C23906g.invoke():java.lang.String");
        }
    }

    /* renamed from: E2 */
    private final C25192a m77172E2() {
        return (C25192a) this.f62122H.getValue();
    }

    /* renamed from: F2 */
    private final String m77173F2() {
        return (String) this.f62123I.getValue();
    }

    /* renamed from: G2 */
    private final GTShareTradeResultViewModel$ViewModel m77174G2() {
        return (GTShareTradeResultViewModel$ViewModel) this.f62120F.getValue();
    }

    /* renamed from: H2 */
    private final void m77175H2() {
        String str;
        boolean z;
        C28727g0 g0Var = this.f62121G;
        if (g0Var == null) {
            C41536l.m120506z("binding");
            g0Var = null;
        }
        PageState pageState = g0Var.f73261i;
        C25192a E2 = m77172E2();
        int[] iArr = C23901b.f62124a;
        int i = iArr[E2.ordinal()];
        String str2 = "";
        if (i == 1) {
            str = getString(C25190j.gt_result_sell_success_title);
        } else if (i != 2) {
            str = str2;
        } else {
            str = getString(C25190j.gt_result_buy_success_title);
        }
        pageState.setTitleText(str);
        InlineFeedback inlineFeedback = g0Var.f73259g;
        C41536l.m120488h(inlineFeedback, "delayDescription");
        if (m77172E2() == C25192a.SELL_SHARE) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(inlineFeedback, z, false, 2, (Object) null);
        g0Var.f73259g.setTitleText(C32343x.m95388F("gt.success.page.sell.stock", new Object[0]));
        g0Var.f73263k.setText(getIntent().getStringExtra("KEY_NAME"));
        g0Var.f73262j.setText(C28786c.m88249e(String.valueOf(getIntent().getDoubleExtra("KEY_QUANTITY", Utils.DOUBLE_EPSILON))));
        g0Var.f73257e.setText(C32343x.m95410Q(getIntent().getDoubleExtra("KEY_AMOUNT", Utils.DOUBLE_EPSILON), "USD", false, 2, (Object) null));
        g0Var.f73258f.setText(C32343x.m95410Q(getIntent().getDoubleExtra("KEY_FEE", Utils.DOUBLE_EPSILON), "USD", false, 2, (Object) null));
        g0Var.f73265m.setText(C32343x.m95410Q(getIntent().getDoubleExtra("KEY_TOTAL_AMOUNT", Utils.DOUBLE_EPSILON), "USD", false, 2, (Object) null));
        TwoLineTextItem twoLineTextItem = g0Var.f73265m;
        int i2 = iArr[m77172E2().ordinal()];
        if (i2 == 1) {
            str2 = getString(C25190j.gt_review_title_total_after_comission);
        } else if (i2 == 2) {
            str2 = getString(C25190j.gt_review_title_total);
        }
        twoLineTextItem.setTitle(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28727g0 d = C28727g0.m88029d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f62121G = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        m77175H2();
        m77174G2().mo60833dw().mo60834e2(m77172E2(), m77173F2());
    }

    public void onBackPressed() {
        GTActivity.f61292M.mo60257a(this);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        int i = C23901b.f62124a[m77172E2().ordinal()];
        if (i == 1) {
            String string = getString(C25190j.gt_sell);
            String F2 = m77173F2();
            return string + " " + F2;
        } else if (i != 2) {
            return "";
        } else {
            String string2 = getString(C25190j.gt_buy);
            String F22 = m77173F2();
            return string2 + " " + F22;
        }
    }
}
