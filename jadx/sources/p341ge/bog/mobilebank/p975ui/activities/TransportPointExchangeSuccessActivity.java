package p341ge.bog.mobilebank.p975ui.activities;

import android.os.Bundle;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32307h;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;
import p366bk.C10328q;
import p90.C27284e0;

/* renamed from: ge.bog.mobilebank.ui.activities.TransportPointExchangeSuccessActivity */
public class TransportPointExchangeSuccessActivity extends C35511t0 {

    /* renamed from: G */
    protected Client f85616G;

    /* renamed from: H */
    private C27284e0 f85617H;

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27284e0 d = C27284e0.m84436d(getLayoutInflater());
        this.f85617H = d;
        super.mo70996D2(bundle, d);
        this.f85617H.f68575e.setTitleText(getString(C10328q.bonus_exchange_card));
        this.f85617H.f68576f.setTitleText(getString(C10328q.common_text_amount));
        PaymentsCard paymentsCard = (PaymentsCard) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_CARD"));
        if (paymentsCard != null) {
            this.f85617H.f68575e.setValueText(C32307h.m95226c(paymentsCard));
        }
        this.f85617H.f68576f.setValueText(getIntent().getStringExtra("CONVERTED_AMOUNT"));
        this.f85617H.f68580j.setTitleText(getString(C10328q.bonus_exchange_paid_points));
        this.f85617H.f68580j.setValueText(getIntent().getStringExtra("PAID_POINTS"));
        this.f85616G.forceUpdateData();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.enableIntercept();
    }
}
