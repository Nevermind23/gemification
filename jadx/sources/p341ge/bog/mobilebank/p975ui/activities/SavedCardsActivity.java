package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import android.os.Bundle;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import p341ge.bog.mobilebank.p975ui.fragments.C35660q1;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.activities.SavedCardsActivity */
public class SavedCardsActivity extends C30772sa {
    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_save_cards;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        getSupportFragmentManager().mo4428p().mo4632c(C10322k.f28769Me, new C35660q1(), (String) null).mo4515i();
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
}
