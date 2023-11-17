package p341ge.bog.mobilebank.p975ui.activities.offers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import p366bk.C10322k;
import p366bk.C10324m;
import p842nv.C26617h;

/* renamed from: ge.bog.mobilebank.ui.activities.offers.OfferNotAvailableActivity */
public class OfferNotAvailableActivity extends C35466b {

    /* renamed from: G */
    C26617h f85759G;

    /* renamed from: E2 */
    public static void m105310E2(Context context, String str) {
        Intent intent = new Intent(context, OfferNotAvailableActivity.class);
        intent.putExtra("errorInfoText", str);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_offer_not_available;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        ((TextView) findViewById(C10322k.tv_error_info)).setText(getIntent().getStringExtra("errorInfoText"));
        this.f85759G.mo65871a();
    }
}
