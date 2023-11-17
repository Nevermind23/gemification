package p341ge.bog.mobilebank.payment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import g91.C32297d;
import g91.C32343x;
import iu0.C36546y;
import java.util.ArrayList;
import jg1.C41438c;
import jg1.C41452l;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.eventbus.events.DDProvidersListEvent;
import p341ge.bog.mobilebank.eventbus.events.DDSTOListEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.ddsto.DDProviderItem;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10324m;
import p366bk.C10328q;
import p366bk.C10329r;
import rw0.C38374a;
import rw0.C38378e;

/* renamed from: ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity */
public class DDTransparentLoaderActivity extends C33610d {

    /* renamed from: G */
    private String f81909G;

    /* renamed from: H */
    private C33624a.C33625a f81910H;

    /* renamed from: I */
    private DDProvidersListEvent f81911I;

    /* renamed from: J */
    private boolean f81912J;

    /* renamed from: K */
    private long f81913K;

    /* renamed from: L */
    protected Client f81914L;

    /* renamed from: M */
    protected C41438c f81915M;

    /* renamed from: ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity$a */
    class C33600a implements Runnable {
        C33600a() {
        }

        public void run() {
            DDTransparentLoaderActivity.this.finish();
        }
    }

    /* renamed from: E2 */
    private void m98617E2() {
        C32297d.m95154b(this, getString(C10328q.f28955d2));
        new Handler().postDelayed(new C33600a(), 2000);
    }

    /* renamed from: F2 */
    public void mo79608F2(DDProvidersListEvent dDProvidersListEvent) {
        DDProviderItem o = C38374a.m112693o(this.f81909G, dDProvidersListEvent.providerItems);
        if (o == null) {
            m98617E2();
        } else if (o.isTopupAllowed()) {
            C38378e.m112729e(this, this.f81910H);
        } else {
            C33624a.C33625a aVar = this.f81910H;
            if (aVar != null) {
                aVar.mo79825y();
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.dd_transparant_activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C32343x.m95423W0(this.f81915M, this);
        mo86441o2();
        C36546y.m108282F().mo27138I("dd_details");
        mo86441o2();
        this.f81909G = getIntent().getExtras().getString("PAYMENT_SERVICE_ID");
        boolean z = getIntent().getExtras().getBoolean("PAYMENT_IS_COMPANY", false);
        ArrayList arrayList = (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("PAYMENT_RESULT_INFO"));
        String string = getIntent().getExtras().getString("PAYMENT_ESS_ID");
        long j = getIntent().getExtras().getLong("DD_ID", -1);
        this.f81913K = j;
        if (j != -1) {
            this.f81914L.requestDDSTO(false);
            this.f81912J = true;
            return;
        }
        this.f81910H = C33624a.m98713a(this).mo79806f(DDFormActivity.class).mo79819s(this.f81909G).mo79813m(arrayList).mo79812l(string).mo79807g(z);
        this.f81914L.requestDDProviders(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U1 */
    public int mo53709U1() {
        if (PreferencesApiManager.getInstance().getThemeType() == 1) {
            return C10329r.TransparentActivityStyleSolo;
        }
        if (PreferencesApiManager.getInstance().getThemeType() == 2) {
            return C10329r.TransparentActivityStyleWealth;
        }
        return C10329r.TransparentActivityStyle;
    }

    public void finish() {
        setResult(-1, new Intent());
        super.finish();
    }

    @C41452l
    public void onDDProviders(DDProvidersListEvent dDProvidersListEvent) {
        if (this.f81911I != dDProvidersListEvent && !this.f81912J) {
            this.f81911I = dDProvidersListEvent;
            int state = dDProvidersListEvent.getState();
            if (state == 10) {
                mo86441o2();
            } else if (state == 20) {
                mo86425J1();
                mo79608F2(dDProvidersListEvent);
                this.f81912J = true;
            } else if (state == 30 || state == 40) {
                m98617E2();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.f81915M, this);
    }

    @C41452l
    public void onStoListEvent(DDSTOListEvent dDSTOListEvent) {
        int state = dDSTOListEvent.getState();
        if (state == 10) {
            mo86441o2();
        } else if (state == 20) {
            mo86425J1();
            DDSTO stoByPaymentId = dDSTOListEvent.getStoByPaymentId(this.f81913K);
            if (stoByPaymentId != null) {
                C33624a.m98713a(this).mo79806f(DDFormActivity.class).mo79811k(stoByPaymentId).mo79825y();
                finish();
                return;
            }
            m98617E2();
        } else if (state == 30 || state == 40) {
            m98617E2();
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_automatics);
    }
}
