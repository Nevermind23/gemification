package p341ge.bog.sso_client.signin;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import ba1.C10214s;
import ba1.C10216u;
import ba1.C10217v;
import dc1.C31559e;
import ha1.C15454a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qc1.C42216e0;

/* renamed from: ge.bog.sso_client.signin.SignInActivity */
public final class SignInActivity extends C15454a implements C31559e {

    /* renamed from: s */
    public static final C41082a f96990s = new C41082a((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.sso_client.signin.SignInActivity$a */
    public static final class C41082a {
        private C41082a() {
        }

        public /* synthetic */ C41082a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SignInActivity() {
        super(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: T0 */
    private final C42216e0 m119067T0() {
        Fragment k0 = getSupportFragmentManager().mo4418k0("SIGN_IN_FRAGMENT_TAG");
        if (k0 == null || !(k0 instanceof C42216e0)) {
            return null;
        }
        return (C42216e0) k0;
    }

    /* renamed from: b0 */
    public void mo42323b0(String str) {
        C41536l.m120489i(str, "clientKey");
        C42216e0 T0 = m119067T0();
        if (T0 != null) {
            T0.mo42323b0(str);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 101) {
            C42216e0 T0 = m119067T0();
            if (T0 != null) {
                T0.mo97695c2();
            }
        } else if (i2 == 102) {
            C42216e0 T02 = m119067T0();
            if (T02 != null) {
                T02.mo97694Z1(true);
            }
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C10217v.activity_sign_in);
        getWindow().setBackgroundDrawableResource(C10214s.img_bg_splash_screen);
        getSupportFragmentManager().mo4428p().mo4640s(C10216u.login_fragment_cont, C42216e0.f99324q.mo97698a(), "SIGN_IN_FRAGMENT_TAG").mo4517k();
    }
}
