package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30587ec;
import a81.C30601fc;
import a81.C30615gc;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import de1.C40640a;
import g91.C32297d;
import g91.C32303f;
import g91.C32307h;
import g91.C32343x;
import g91.C32359z0;
import gd1.C40992a;
import hd1.C41205b;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import jg1.C41438c;
import jg1.C41452l;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.eventbus.events.PointValueExchangeEvent;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.TransportPlusExchangeWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.C35893a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10328q;
import p380ck.C10464h;
import p729cv.C19797a;
import p739dv.C20102a;
import p90.C27277d3;
import r90.C27950a;
import rw0.C38375b;
import rw0.C38380g;

/* renamed from: ge.bog.mobilebank.ui.activities.TransportPointExchangeActivity */
public class TransportPointExchangeActivity extends C35506s0 implements View.OnClickListener {

    /* renamed from: G */
    private C27277d3 f85603G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public ArrayList f85604H = new ArrayList();

    /* renamed from: I */
    C19797a f85605I;

    /* renamed from: J */
    protected BankApi f85606J;

    /* renamed from: K */
    protected RootBankApiManager f85607K;

    /* renamed from: L */
    protected C41438c f85608L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public int f85609M = -1;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public String f85610N;

    /* renamed from: O */
    private String f85611O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public String f85612P;

    /* renamed from: ge.bog.mobilebank.ui.activities.TransportPointExchangeActivity$a */
    class C35340a extends RestCallback {

        /* renamed from: a */
        final /* synthetic */ AtomicInteger f85613a;

        C35340a(AtomicInteger atomicInteger) {
            this.f85613a = atomicInteger;
        }

        public void onEnqueue(C41205b bVar) {
            TransportPointExchangeActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            if (this.f85613a.decrementAndGet() == 0) {
                TransportPointExchangeActivity.this.mo86425J1();
            }
            TransportPointExchangeActivity.this.m104941U2(true);
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            if (this.f85613a.decrementAndGet() == 0) {
                TransportPointExchangeActivity.this.mo86425J1();
            }
            if (bankApiResponse.isSuccess()) {
                TransportPointExchangeActivity.this.f85604H = (ArrayList) bankApiResponse.getResult();
                TransportPointExchangeActivity.this.m104941U2(false);
                return;
            }
            C32297d.m95154b(TransportPointExchangeActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
            TransportPointExchangeActivity.this.m104941U2(true);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.TransportPointExchangeActivity$b */
    class C35341b extends RestCallback {
        C35341b() {
        }

        public void onEnqueue(C41205b bVar) {
            TransportPointExchangeActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            C32297d.m95153a(TransportPointExchangeActivity.this);
            TransportPointExchangeActivity.this.mo86425J1();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            TransportPointExchangeActivity.this.mo86425J1();
            if (bankApiResponse.isSuccess()) {
                Intent intent = new Intent(TransportPointExchangeActivity.this, TransportPointExchangeSuccessActivity.class);
                intent.putExtra("CONVERTED_AMOUNT", C32359z0.m95540K(TransportPointExchangeActivity.this.f85610N, true));
                intent.putExtra("PAYMENT_CARD", C42035e.m122121c((PaymentsCard) TransportPointExchangeActivity.this.f85604H.get(TransportPointExchangeActivity.this.f85609M)));
                intent.putExtra("PAID_POINTS", TransportPointExchangeActivity.this.f85612P + " " + TransportPointExchangeActivity.this.getString(C10328q.payments_plus_points));
                MedalliaDigital.setCustomParameter("event", "bonus_point_payment_complete");
                MedalliaDigital.setCustomParameter("context1", "TCC");
                TransportPointExchangeActivity.this.startActivity(intent);
                TransportPointExchangeActivity.this.finish();
                C36546y.m108282F().mo27137H("payment_completed", "", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
                return;
            }
            C32297d.m95154b(TransportPointExchangeActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m104924C2(View view) {
        m104936P2();
    }

    /* renamed from: N2 */
    private void m104934N2() {
        if (this.f85603G.f68528j.f70288l.isOrange() && m104935O2(this.f85610N) != null) {
            mo86441o2();
            this.f85606J.buyTCCWithPoints(((PaymentsCard) this.f85604H.get(this.f85609M)).getPan2(), m104935O2(this.f85610N).toString(), "PLUS", "PLUS_TO_TCT", new C35341b());
        }
    }

    /* renamed from: O2 */
    private BigDecimal m104935O2(String str) {
        return C38380g.m112735b(str);
    }

    /* renamed from: P2 */
    private void m104936P2() {
        AtomicInteger atomicInteger = new AtomicInteger(2);
        m104941U2(false);
        mo86441o2();
        this.f85606J.getExpressCards(new C35340a(atomicInteger));
        mo86438k1(this.f85605I.mo48085a().mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a()).mo94983G0(new C30601fc(this, atomicInteger), new C30615gc(this, atomicInteger)));
    }

    /* renamed from: Q2 */
    private void m104937Q2(String str) {
        int i;
        ActivityManager.isUserAMonkey();
        if (TextUtils.isEmpty(this.f85610N) || (i = this.f85609M) < 0 || i > this.f85604H.size() || TextUtils.isEmpty(str) || !C38375b.m112705a(str, this.f85611O, this)) {
            this.f85603G.f68528j.f70288l.setEnabled(false);
            this.f85603G.f68528j.f70288l.setOrange(false);
            return;
        }
        this.f85612P = str;
        this.f85603G.f68528j.f70288l.setEnabled(true);
        this.f85603G.f68528j.f70288l.setOrange(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void m104938R2(AtomicInteger atomicInteger, C20102a aVar) {
        this.f85611O = C32359z0.m95534E("PLUS", aVar);
        if (atomicInteger.decrementAndGet() == 0) {
            mo86425J1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public /* synthetic */ void m104939S2(AtomicInteger atomicInteger, Throwable th) {
        this.f85611O = C32359z0.m95534E("PLUS", (C20102a) null);
        if (atomicInteger.decrementAndGet() == 0) {
            mo86425J1();
        }
    }

    /* renamed from: T2 */
    private void m104940T2(String str) {
        BogTextView bogTextView = this.f85603G.f68529k;
        bogTextView.setText(getText(C10328q.payments_plus_points) + " : " + C32303f.m95207r(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public void m104941U2(boolean z) {
        this.f85603G.f68523e.setVisibility(z ? 0 : 8);
    }

    /* renamed from: V2 */
    private void m104942V2(View view) {
        String str;
        TextTypeView textTypeView = (TextTypeView) view.getTag();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f85604H.iterator();
        while (it.hasNext()) {
            PaymentsCard paymentsCard = (PaymentsCard) it.next();
            if (!TextUtils.isEmpty(paymentsCard.getCardName())) {
                str = paymentsCard.getCardName();
            } else {
                str = C32307h.m95232i(paymentsCard.getLastFour());
            }
            arrayList.add(str);
        }
        ArrayList arrayList2 = new ArrayList();
        WizardObject selectorOptionPreviews = new WizardObject().setValue(String.valueOf(this.f85609M)).setInputTitle(getString(C10328q.bonus_exchange_choose_card)).setInputStyle(0).setSelectorOptionPreviews(arrayList);
        WizardObject value = new WizardObject().setInputStyle(1).setInputType(BogInputLayout.INPUT_TYPE_NUM_REAL).setInputTitle(getString(C10328q.common_text_amount)).setValue(this.f85610N);
        arrayList2.add(selectorOptionPreviews);
        arrayList2.add(value);
        C35893a.m106783a(this).mo88140g(arrayList2).mo88137d(AdvancedWizardActivity.class).mo88139f(new TransportPlusExchangeWizardPlugin(this.f85611O)).mo88141h(textTypeView.getPosition()).mo88136c((View) view.getTag()).mo88142i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27277d3 d = C27277d3.m84409d(getLayoutInflater());
        this.f85603G = d;
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        this.f85603G.f68527i.f68328f.mo3946b().setOnClickListener(new C30587ec(this));
        this.f85603G.f68524f.setTitleText(getString(C10328q.bonus_exchange_card));
        this.f85603G.f68525g.setTitleText(getString(C10328q.common_text_amount));
        this.f85603G.f68524f.setDefaultUnderLineColor();
        this.f85603G.f68525g.setDefaultUnderLineColor();
        this.f85603G.f68524f.setOnClickListener(this);
        this.f85603G.f68525g.setOnClickListener(this);
        this.f85603G.f68528j.f70288l.setText(getString(C10328q.button_text_exchange_points));
        this.f85603G.f68528j.f70288l.setOnClickListener(this);
        this.f85603G.f68524f.setPosition(0);
        this.f85603G.f68525g.setPosition(1);
        this.f85603G.f68530l.setVisibility(0);
        m104940T2("");
        m104936P2();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f85603G.f68528j.f70288l.setOrange(false);
        m104940T2("");
        this.f85609M = -1;
        this.f85610N = "";
        this.f85603G.f68524f.setValueTextIgnoringEmpty("");
        this.f85603G.f68525g.setValueTextIgnoringEmpty("");
        if (i2 == -1) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(BaseWizardPlugin.WIZARD_DATA);
            try {
                this.f85609M = Integer.parseInt(stringArrayListExtra.get(0));
                String str = stringArrayListExtra.get(1);
                this.f85610N = str;
                if (m104935O2(str) == null) {
                    this.f85610N = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
                }
                int i3 = this.f85609M;
                if (i3 < 0 || i3 >= this.f85604H.size()) {
                    this.f85603G.f68524f.setValueTextIgnoringEmpty("");
                } else {
                    this.f85603G.f68524f.setValueText(C32307h.m95226c((PaymentsCard) this.f85604H.get(this.f85609M)));
                }
                this.f85603G.f68525g.setValueTextIgnoringEmpty(C32359z0.m95540K(this.f85610N, true));
            } catch (Exception unused) {
            }
        }
    }

    public void onClick(View view) {
        if (this.f85603G.f68528j.f70288l != view) {
            m104942V2(view);
        } else {
            m104934N2();
        }
    }

    @C41452l
    public void onPointExchangeEvent(PointValueExchangeEvent pointValueExchangeEvent) {
        if (TextUtils.isEmpty(pointValueExchangeEvent.serviceProviderId) && !TextUtils.isEmpty(this.f85610N) && m104935O2(this.f85610N) != null && m104935O2(this.f85610N).toString().equals(pointValueExchangeEvent.amount)) {
            this.f85612P = "";
            int state = pointValueExchangeEvent.getState();
            if (state == 10) {
                mo86441o2();
            } else if (state == 20) {
                mo86425J1();
                m104940T2(pointValueExchangeEvent.getPointValue());
                m104937Q2(pointValueExchangeEvent.getPointValue());
            } else if (state == 30) {
                mo86425J1();
                this.f85603G.f68528j.f70288l.setOrange(false);
            } else if (state == 40) {
                mo86425J1();
                C32297d.m95154b(this, C27950a.m86284a(pointValueExchangeEvent.getErrorKey()));
                this.f85603G.f68528j.f70288l.setOrange(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (m104935O2(this.f85610N) != null) {
            this.f85607K.getPointValueExchange(m104935O2(this.f85610N).toString(), C38375b.m112712h(this.f85610N, ""), "");
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f85608L, this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f85608L, this);
    }
}
