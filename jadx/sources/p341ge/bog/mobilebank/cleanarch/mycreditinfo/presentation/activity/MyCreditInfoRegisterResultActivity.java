package p341ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import g91.C32343x;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p90.C27452w0;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoRegisterResultActivity */
public final class MyCreditInfoRegisterResultActivity extends C30772sa {

    /* renamed from: G */
    public static final C21347a f57170G = new C21347a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f57171F = C41219i.m119470b(new C21348b(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoRegisterResultActivity$a */
    public static final class C21347a {
        private C21347a() {
        }

        public /* synthetic */ C21347a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo53359a(Context context, String str) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "phoneNumber");
            Intent intent = new Intent(context, MyCreditInfoRegisterResultActivity.class);
            intent.putExtra("PHONE_NUMBER", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.mycreditinfo.presentation.activity.MyCreditInfoRegisterResultActivity$b */
    static final class C21348b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MyCreditInfoRegisterResultActivity f57172d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21348b(MyCreditInfoRegisterResultActivity myCreditInfoRegisterResultActivity) {
            super(0);
            this.f57172d = myCreditInfoRegisterResultActivity;
        }

        public final String invoke() {
            return this.f57172d.getIntent().getStringExtra("PHONE_NUMBER");
        }
    }

    /* renamed from: E2 */
    private final String m69016E2() {
        return (String) this.f57171F.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_my_credit_info_registration_result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C27452w0 a = C27452w0.m85115a(findViewById(C10322k.result_screen_content));
        C41536l.m120488h(a, "bind(findViewById(R.id.result_screen_content))");
        String E2 = m69016E2();
        if (E2 != null) {
            SuccessScreenView successScreenView = a.f70150f;
            C41536l.m120488h(successScreenView, "onCreateSafe$lambda$1$lambda$0");
            SuccessScreenView.setTitle$default(successScreenView, C32343x.m95388F("offers.my.credit.info.registracion.success", E2), 0, 2, (Object) null);
            successScreenView.setIcon(C10320i.ic_result_success);
        }
    }
}
