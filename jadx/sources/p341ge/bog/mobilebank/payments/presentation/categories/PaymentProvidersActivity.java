package p341ge.bog.mobilebank.payments.presentation.categories;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.Fragment;
import fx0.C32024d;
import he1.C41217g;
import he1.C41233s;
import iu0.C36546y;
import jx0.C36815d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import px0.C38046p;
import qx0.C38259a;
import rx0.C38381a;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.payments.presentation.categories.PaymentProvidersActivity */
public final class PaymentProvidersActivity extends C30772sa {

    /* renamed from: I */
    public static final C33632a f82016I = new C33632a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C36815d f82017F;

    /* renamed from: G */
    private final C41217g f82018G = C41219i.m119470b(new C33634c(this));

    /* renamed from: H */
    private final C41217g f82019H = C41219i.m119470b(new C33633b(this));

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.PaymentProvidersActivity$a */
    public static final class C33632a {
        private C33632a() {
        }

        public /* synthetic */ C33632a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo80201a(Context context, String str, String str2, boolean z) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "analyticsLabel2");
            C36546y.m108282F().mo27156w("payment_tree", "enter_payment", "click", str);
            context.startActivity(new Intent(context, PaymentProvidersActivity.class).putExtra("ARG_DD", z).putExtra("CAT_ID", str2));
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.PaymentProvidersActivity$b */
    static final class C33633b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PaymentProvidersActivity f82020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33633b(PaymentProvidersActivity paymentProvidersActivity) {
            super(0);
            this.f82020d = paymentProvidersActivity;
        }

        public final String invoke() {
            return this.f82020d.getIntent().getStringExtra("CAT_ID");
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.PaymentProvidersActivity$c */
    static final class C33634c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PaymentProvidersActivity f82021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33634c(PaymentProvidersActivity paymentProvidersActivity) {
            super(0);
            this.f82021d = paymentProvidersActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f82021d.getIntent().getBooleanExtra("ARG_DD", false));
        }
    }

    /* renamed from: F2 */
    private final Fragment m98774F2() {
        if (m98776H2()) {
            return new C38259a();
        }
        C38381a aVar = new C38381a();
        aVar.setArguments(C0908e.m3336b(C41233s.m119492a("CAT_ID", m98775G2())));
        return aVar;
    }

    /* renamed from: G2 */
    private final String m98775G2() {
        return (String) this.f82019H.getValue();
    }

    /* renamed from: H2 */
    private final boolean m98776H2() {
        return ((Boolean) this.f82018G.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m98777I2(PaymentProvidersActivity paymentProvidersActivity, View view) {
        C41536l.m120489i(paymentProvidersActivity, "this$0");
        paymentProvidersActivity.onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C36815d d = C36815d.m109074d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f82017F = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        ToolbarView toolbarView = this.f85671t;
        if (toolbarView != null) {
            toolbarView.setNavigationOnClickListener(new C38046p(this));
        }
        C1493e0 p = getSupportFragmentManager().mo4428p();
        p.mo4639r(C32024d.f78837I, m98774F2());
        p.mo4515i();
    }
}
