package p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
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
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.pagestate.PageStateType;
import p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeResultViewModel$ViewModel;
import ue0.C28750s;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity */
public final class GTMoneyExchangeResultActivity extends C30772sa {

    /* renamed from: K */
    public static final C23433a f61276K = new C23433a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f61277F = new C1617p0(C41520a0.m120436b(GTMoneyExchangeResultViewModel$ViewModel.class), new C23439g(this), new C23438f(this), new C23440h((C43064a) null, this));

    /* renamed from: G */
    private C28750s f61278G;

    /* renamed from: H */
    private final C41217g f61279H = C41219i.m119470b(new C23437e(this));

    /* renamed from: I */
    private final C41217g f61280I = C41219i.m119470b(new C23435c(this));

    /* renamed from: J */
    private final C41217g f61281J = C41219i.m119470b(new C23436d(this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity$a */
    public static final class C23433a {
        private C23433a() {
        }

        public /* synthetic */ C23433a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60253a(String str, String str2, C25192a aVar, Context context) {
            C41536l.m120489i(str, "amount");
            C41536l.m120489i(str2, "acctNo");
            C41536l.m120489i(aVar, "actionType");
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, GTMoneyExchangeResultActivity.class);
            intent.putExtra("KEY_AMOUNT", str);
            intent.putExtra("KEY_ACCT", str2);
            intent.putExtra("KEY_ACTION_TYPE", aVar);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity$b */
    public /* synthetic */ class C23434b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61282a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                if0.a[] r0 = if0.C25192a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                if0.a r1 = if0.C25192a.GET_MONEY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                if0.a r1 = if0.C25192a.DEPOSIT_MONEY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f61282a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity.C23434b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity$c */
    static final class C23435c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeResultActivity f61283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23435c(GTMoneyExchangeResultActivity gTMoneyExchangeResultActivity) {
            super(0);
            this.f61283d = gTMoneyExchangeResultActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getStringExtra("KEY_ACCT");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity r0 = r2.f61283d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "KEY_ACCT"
                java.lang.String r0 = r0.getStringExtra(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity.C23435c.invoke():java.lang.String");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity$d */
    static final class C23436d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeResultActivity f61284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23436d(GTMoneyExchangeResultActivity gTMoneyExchangeResultActivity) {
            super(0);
            this.f61284d = gTMoneyExchangeResultActivity;
        }

        /* renamed from: b */
        public final C25192a invoke() {
            Intent intent = this.f61284d.getIntent();
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_ACTION_TYPE") : null;
            C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.domain.shared.GTActionType");
            return (C25192a) serializableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity$e */
    static final class C23437e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeResultActivity f61285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23437e(GTMoneyExchangeResultActivity gTMoneyExchangeResultActivity) {
            super(0);
            this.f61285d = gTMoneyExchangeResultActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getStringExtra("KEY_AMOUNT");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity r0 = r2.f61285d
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "KEY_AMOUNT"
                java.lang.String r0 = r0.getStringExtra(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity.C23437e.invoke():java.lang.String");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity$f */
    public static final class C23438f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61286d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23438f(ComponentActivity componentActivity) {
            super(0);
            this.f61286d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61286d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity$g */
    public static final class C23439g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61287d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23439g(ComponentActivity componentActivity) {
            super(0);
            this.f61287d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61287d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeResultActivity$h */
    public static final class C23440h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61288d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61289e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23440h(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61288d = aVar;
            this.f61289e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61288d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61289e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: E2 */
    private final String m75860E2() {
        return (String) this.f61280I.getValue();
    }

    /* renamed from: F2 */
    private final C25192a m75861F2() {
        return (C25192a) this.f61281J.getValue();
    }

    /* renamed from: G2 */
    private final String m75862G2() {
        return (String) this.f61279H.getValue();
    }

    /* renamed from: H2 */
    private final GTMoneyExchangeResultViewModel$ViewModel m75863H2() {
        return (GTMoneyExchangeResultViewModel$ViewModel) this.f61277F.getValue();
    }

    /* renamed from: I2 */
    private final void m75864I2() {
        String str;
        C28750s sVar = this.f61278G;
        if (sVar == null) {
            C41536l.m120506z("binding");
            sVar = null;
        }
        PageState pageState = sVar.f73454i;
        int i = C23434b.f61282a[m75861F2().ordinal()];
        boolean z = true;
        if (i == 1) {
            str = getString(C25190j.gt_result_get_success_title);
        } else if (i != 2) {
            str = "";
        } else {
            str = getString(C25190j.gt_result_deposit_success_title);
        }
        pageState.setTitleText(str);
        sVar.f73452g.setTitleText(C32343x.m95388F("gt.success.page.transfer.amount", new Object[0]));
        InlineFeedback inlineFeedback = sVar.f73452g;
        C41536l.m120488h(inlineFeedback, "delayDescription");
        if (m75861F2() != C25192a.GET_MONEY) {
            z = false;
        }
        C32343x.m95483r1(inlineFeedback, z, false, 2, (Object) null);
        sVar.f73454i.setPageStateType(new PageStateType.Success((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null));
        sVar.f73450e.setTitle(getString(C25190j.gt_exchange_result_account_title));
        sVar.f73450e.setText(m75860E2());
        sVar.f73451f.setTitle(getString(C25190j.gt_exchange_result_amount_title));
        sVar.f73451f.setText(m75862G2());
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28750s d = C28750s.m88128d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f61278G = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        m75864I2();
        m75863H2().mo60185dw().mo60186w0(m75861F2());
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        int i = C23434b.f61282a[m75861F2().ordinal()];
        if (i == 1) {
            String string = getString(C25190j.gt_page_title_get_result);
            C41536l.m120488h(string, "getString(R.string.gt_page_title_get_result)");
            return string;
        } else if (i != 2) {
            return "";
        } else {
            String string2 = getString(C25190j.gt_page_title_deposit_result);
            C41536l.m120488h(string2, "getString(R.string.gt_page_title_deposit_result)");
            return string2;
        }
    }
}
