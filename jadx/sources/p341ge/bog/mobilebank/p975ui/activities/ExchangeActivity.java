package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30520a1;
import a81.C30853z0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.C1547z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import g81.C32165g;
import g91.C32290b1;
import g91.C32297d;
import g91.C32343x;
import g91.C32359z0;
import iu0.C36546y;
import java.text.DateFormat;
import jg1.C41438c;
import jg1.C41452l;
import p341ge.bog.mobilebank.eventbus.event.CcyHistoryWrapperSuccessEvent;
import p341ge.bog.mobilebank.eventbus.event.CcyRatesSyncSuccessEvent;
import p341ge.bog.mobilebank.model.CcyHistoryWrapper;
import p341ge.bog.mobilebank.model.CcyRate;
import p341ge.bog.mobilebank.model.CcyRatesWrapper;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.fragments.C35629k;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.fragments.C35676w;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RatesErrorEvent;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p366bk.C10323l;
import p366bk.C10328q;
import p90.C27274d0;

/* renamed from: ge.bog.mobilebank.ui.activities.ExchangeActivity */
public class ExchangeActivity extends C35499r implements ViewPager.C1902j, SwipeRefreshLayout.C1862j, C32165g.C32168c {

    /* renamed from: G */
    protected RootBankApiManager f84847G;

    /* renamed from: H */
    protected Client f84848H;

    /* renamed from: I */
    protected C41438c f84849I;

    /* renamed from: J */
    protected PreferencesApiManager f84850J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C27274d0 f84851K;

    /* renamed from: L */
    protected C35651n1[] f84852L = new C35651n1[2];

    /* renamed from: M */
    private CcyRate[] f84853M;

    /* renamed from: N */
    private CcyHistoryWrapper f84854N;

    /* renamed from: O */
    boolean f84855O = true;

    /* renamed from: P */
    private String f84856P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public CountDownTimer f84857Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public int f84858R = -1;

    /* renamed from: ge.bog.mobilebank.ui.activities.ExchangeActivity$a */
    class C35186a extends CountDownTimer {
        C35186a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
        }

        public void onTick(long j) {
            try {
                if (ExchangeActivity.this.f84858R == -1) {
                    ExchangeActivity.this.f84851K.f68504i.setRefreshing(true);
                    ExchangeActivity.this.f84847G.getCcyRates(false);
                }
            } catch (Exception unused) {
                try {
                    ExchangeActivity.this.f84857Q.onFinish();
                    ExchangeActivity.this.f84857Q = null;
                } catch (Exception unused2) {
                    ExchangeActivity.this.f84857Q = null;
                }
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ExchangeActivity$b */
    class C35187b implements View.OnTouchListener {
        C35187b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!ExchangeActivity.this.f84851K.f68504i.mo6147i()) {
                ExchangeActivity.this.f84851K.f68504i.setEnabled(false);
            }
            if (motionEvent.getAction() == 1) {
                ExchangeActivity.this.f84851K.f68504i.setEnabled(true);
            }
            return false;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ExchangeActivity$c */
    class C35188c extends C1547z {
        C35188c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        /* renamed from: d */
        public int mo6557d() {
            return ExchangeActivity.this.f84852L.length;
        }

        /* renamed from: t */
        public Fragment mo4805t(int i) {
            return ExchangeActivity.this.f84852L[i];
        }
    }

    /* renamed from: P2 */
    private boolean m103545P2() {
        CcyRatesWrapper ccyRates = this.f84850J.getCcyRates();
        if (ccyRates == null) {
            return false;
        }
        this.f84847G.getRatesHistory();
        this.f84853M = ccyRates.getList();
        long currentDate = ccyRates.getCurrentDate();
        DateFormat longDateFormat = android.text.format.DateFormat.getLongDateFormat(getApplicationContext());
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(getApplicationContext());
        this.f84851K.f68503h.setText(C32359z0.m95547R(currentDate, longDateFormat).replace(",", "") + ", " + C32359z0.m95547R(currentDate, timeFormat));
        ((C35676w) this.f84852L[0]).mo86771s1();
        ((C35629k) this.f84852L[1]).mo86708K1();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void m103546R2(View view) {
        m103549U2();
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public /* synthetic */ void m103547S2(View view) {
        m103548T2();
    }

    /* renamed from: T2 */
    private void m103548T2() {
        this.f84851K.f68506k.setCurrentItem(1);
        C36546y.m108282F().mo27152s("currency_rates", "calculator", "select_tab");
    }

    /* renamed from: U2 */
    private void m103549U2() {
        this.f84851K.f68506k.setCurrentItem(0);
        C36546y.m108282F().mo27152s("currency_rates", "currencies", "select_tab");
    }

    /* renamed from: V2 */
    private void m103550V2() {
        Resources resources = getResources();
        int i = C10323l.transition_anim_duration;
        ((TransitionDrawable) this.f84851K.f68501f.getBackground()).startTransition(resources.getInteger(i));
        ((TransitionDrawable) this.f84851K.f68502g.getBackground()).reverseTransition(getResources().getInteger(i));
    }

    /* renamed from: W2 */
    private void m103551W2() {
        Resources resources = getResources();
        int i = C10323l.transition_anim_duration;
        ((TransitionDrawable) this.f84851K.f68501f.getBackground()).reverseTransition(resources.getInteger(i));
        ((TransitionDrawable) this.f84851K.f68502g.getBackground()).startTransition(getResources().getInteger(i));
    }

    /* renamed from: X2 */
    private void m103552X2() {
        this.f84851K.f68502g.setOnClickListener(new C30853z0(this));
        this.f84851K.f68501f.setOnClickListener(new C30520a1(this));
    }

    /* renamed from: Y2 */
    private void m103553Y2() {
        C35676w wVar = new C35676w();
        wVar.mo86773v1(this);
        C35651n1[] n1VarArr = this.f84852L;
        n1VarArr[0] = wVar;
        n1VarArr[1] = new C35629k();
    }

    /* renamed from: Z2 */
    private void m103554Z2() {
        this.f84851K.f68506k.setAdapter(new C35188c(getSupportFragmentManager()));
        this.f84851K.f68506k.addOnPageChangeListener(this);
        this.f84851K.f68506k.setOnTouchListener(new C35187b());
    }

    /* renamed from: a3 */
    public static void m103555a3(Context context) {
        m103556b3(context, (String) null);
    }

    /* renamed from: b3 */
    public static void m103556b3(Context context, String str) {
        Intent intent = new Intent(context, ExchangeActivity.class);
        intent.putExtra("RATES_CCY", str);
        context.startActivity(intent);
    }

    /* renamed from: K2 */
    public CcyHistoryWrapper mo86119K2() {
        return this.f84854N;
    }

    /* renamed from: L */
    public void mo6548L(int i, float f, int i2) {
    }

    /* renamed from: L2 */
    public CcyRate[] mo86120L2() {
        return this.f84853M;
    }

    /* renamed from: M2 */
    public String mo86121M2() {
        return this.f84856P;
    }

    /* renamed from: N2 */
    public int mo86122N2() {
        return C32290b1.m95119i(this.f84851K.f68506k).left;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27274d0 d = C27274d0.m84396d(getLayoutInflater());
        this.f84851K = d;
        super.mo70996D2(bundle, d);
        C36546y.m108282F().mo27138I("currency");
        C32343x.m95423W0(this.f84849I, this);
        this.f84851K.f68504i.setRefreshing(true);
        this.f84851K.f68504i.setOnRefreshListener(this);
        this.f84856P = getIntent().getStringExtra("RATES_CCY");
        m103553Y2();
        m103554Z2();
        m103552X2();
        ((TransitionDrawable) this.f84851K.f68502g.getBackground()).startTransition(0);
        if (!m103545P2()) {
            this.f84847G.getCcyRates(false);
        }
        if ("ge.bog.mobilebank.appshortcuts.CURRENCY_RATES".equals(getIntent().getAction())) {
            C36546y.m108282F().mo27152s("quick_actions_menu", "currency_rates", "force_touch");
        }
        this.f84857Q = new C35186a(1800000000, 30000);
    }

    /* renamed from: O2 */
    public int mo86123O2() {
        return C32290b1.m95119i(this.f84851K.f68506k).top;
    }

    /* renamed from: Q */
    public void mo6549Q(int i) {
        if (i == 0) {
            this.f84855O = true;
            m103551W2();
            C32290b1.m95112b(this.f84851K.f68502g);
            return;
        }
        this.f84855O = false;
        m103550V2();
        C32290b1.m95112b(this.f84851K.f68501f);
    }

    /* renamed from: Q2 */
    public boolean mo86124Q2() {
        return this.f84855O;
    }

    /* renamed from: h0 */
    public void mo72690h0(int i) {
        this.f84858R = i;
    }

    /* renamed from: l0 */
    public void mo6550l0(int i) {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C35651n1[] n1VarArr;
        C35651n1 n1Var;
        super.onActivityResult(i, i2, intent);
        if (i == 10003 && i2 == -1 && (n1VarArr = this.f84852L) != null && n1VarArr.length > 1 && (n1Var = n1VarArr[1]) != null && (n1Var instanceof C35629k)) {
            ((C35629k) n1Var).mo86707J1();
        }
    }

    @C41452l
    public void onCcyHistoryWrapperSuccessEvent(CcyHistoryWrapperSuccessEvent ccyHistoryWrapperSuccessEvent) {
        CcyHistoryWrapper ccyHistoryWrapper = ccyHistoryWrapperSuccessEvent.getCcyHistoryWrapper();
        this.f84854N = ccyHistoryWrapper;
        this.f84848H.setCcyHistoryWrapper(ccyHistoryWrapper);
        ((C35676w) this.f84852L[0]).mo86772t1();
        this.f84851K.f68504i.setRefreshing(false);
    }

    @C41452l
    public void onCcyRatesSyncSuccessEvent(CcyRatesSyncSuccessEvent ccyRatesSyncSuccessEvent) {
        m103545P2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.f84849I, this);
    }

    @C41452l
    public void onRatesErrorEvent(RatesErrorEvent ratesErrorEvent) {
        if (!TextUtils.isEmpty(ratesErrorEvent.getMessage())) {
            C32297d.m95154b(this, ratesErrorEvent.getMessage());
        }
        this.f84851K.f68504i.setRefreshing(false);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        CountDownTimer countDownTimer = this.f84857Q;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        CountDownTimer countDownTimer = this.f84857Q;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: v */
    public void mo6203v() {
        this.f84847G.getCcyRates(false);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_ccy_rates);
    }
}
