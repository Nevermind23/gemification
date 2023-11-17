package p341ge.bog.mobilebank.kyc.presentation;

import a81.C30772sa;
import an0.C10106b;
import an0.C10107c;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import jn0.C16284j;
import kotlin.jvm.internal.C41536l;
import p202p0.C7556l;
import p202p0.C7589q;

/* renamed from: ge.bog.mobilebank.kyc.presentation.KycActivity */
public final class KycActivity extends C30772sa {
    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m54450F2(KycActivity kycActivity, C7556l lVar, C7589q qVar, Bundle bundle) {
        C41536l.m120489i(kycActivity, "this$0");
        C41536l.m120489i(lVar, "<anonymous parameter 0>");
        C41536l.m120489i(qVar, "dest");
        CharSequence x = qVar.mo22215x();
        if (x != null) {
            kycActivity.mo86429X1(x.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView(C10107c.activity_kyc);
        super.mo37451O1(bundle);
        Fragment j0 = getSupportFragmentManager().mo4415j0(C10106b.f27873E);
        C41536l.m120487g(j0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        ((NavHostFragment) j0).mo5009k1().mo22137p(new C16284j(this));
    }
}
