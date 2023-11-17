package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30797u9;
import a81.C30810v9;
import a81.C30823w9;
import a81.C30836x9;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g81.C32133c0;
import g91.C32297d;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41205b;
import iu0.C36546y;
import j81.C36769k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jg1.C41438c;
import jg1.C41452l;
import n41.C37353c;
import p341ge.bog.mobilebank.eventbus.events.BonusProvidersEvent;
import p341ge.bog.mobilebank.eventbus.events.DDProvidersListEvent;
import p341ge.bog.mobilebank.eventbus.events.SelectedPaymentsEvent;
import p341ge.bog.mobilebank.model.CircularItemInterface;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.ProviderListUIConfiguration;
import p341ge.bog.mobilebank.model.ddsto.DDProviderItem;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.SelectedPayment;
import p341ge.bog.mobilebank.model.usrinfo.UserRestrictions;
import p341ge.bog.mobilebank.payment.activities.DDFormActivity;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p341ge.bog.mobilebank.payment.activities.TemplateFormActivity;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p342j$.util.Collection$EL;
import p342j$.util.stream.Collectors;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10469j;
import p729cv.C19799c;
import q31.C38124g;
import r90.C27950a;
import r90.C27954d;

/* renamed from: ge.bog.mobilebank.ui.activities.ProviderListActivity */
public class ProviderListActivity extends C35409g0 implements C36769k {

    /* renamed from: G */
    C19799c f85386G;

    /* renamed from: H */
    protected Client f85387H;

    /* renamed from: I */
    protected C41438c f85388I;

    /* renamed from: J */
    private RecyclerView f85389J;

    /* renamed from: K */
    private SwipeRefreshLayout f85390K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C32133c0 f85391L;

    /* renamed from: M */
    private SelectedPaymentsEvent f85392M;

    /* renamed from: N */
    private BonusProvidersEvent f85393N;

    /* renamed from: O */
    private DDProvidersListEvent f85394O;

    /* renamed from: P */
    PaymentProviderConfiguration f85395P;

    /* renamed from: Q */
    private boolean f85396Q;

    /* renamed from: R */
    private boolean f85397R;

    /* renamed from: S */
    private boolean f85398S;

    /* renamed from: T */
    private boolean f85399T;

    /* renamed from: U */
    private boolean f85400U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public String f85401V;

    /* renamed from: W */
    private boolean f85402W;

    /* renamed from: X */
    private long f85403X;

    /* renamed from: Y */
    private int f85404Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public boolean f85405Z = false;

    /* renamed from: a0 */
    private PaymentProviderConfiguration f85406a0;

    /* renamed from: b0 */
    private ProviderListUIConfiguration f85407b0;

    /* renamed from: ge.bog.mobilebank.ui.activities.ProviderListActivity$a */
    class C35305a implements SwipeRefreshLayout.C1862j {
        C35305a() {
        }

        /* renamed from: v */
        public void mo6203v() {
            ProviderListActivity providerListActivity = ProviderListActivity.this;
            providerListActivity.f85395P = null;
            providerListActivity.f85391L.mo72622l(new ArrayList());
            if (ProviderListActivity.this.f85405Z || !ProviderListActivity.this.f85387H.isAuthorized()) {
                ProviderListActivity.this.f85387H.requestSelected(true);
            } else {
                ProviderListActivity.this.mo86353L2();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ProviderListActivity$b */
    class C35306b implements SwipeRefreshLayout.C1862j {
        C35306b() {
        }

        /* renamed from: v */
        public void mo6203v() {
            ProviderListActivity.this.f85391L.mo72622l(new ArrayList());
            ProviderListActivity providerListActivity = ProviderListActivity.this;
            providerListActivity.f85387H.requestBonusProviders(true, "PLUS", providerListActivity.f85401V);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.ProviderListActivity$c */
    class C35307c implements SwipeRefreshLayout.C1862j {
        C35307c() {
        }

        /* renamed from: v */
        public void mo6203v() {
            ProviderListActivity.this.f85391L.mo72622l(new ArrayList());
            ProviderListActivity.this.f85387H.requestDDProviders(true);
        }
    }

    /* renamed from: M2 */
    private ArrayList m104687M2() {
        ArrayList arrayList = new ArrayList();
        PaymentProviderConfiguration g = C27954d.m86301g("bog-comp-mobilepayments");
        if (g != null) {
            CircularItemInterface circularItemInterface = new CircularItemInterface();
            circularItemInterface.setPaymentItem(g);
            arrayList.add(circularItemInterface);
        }
        for (PaymentProviderConfiguration paymentProviderConfiguration : m104689O2()) {
            if (paymentProviderConfiguration.getServiceCategory() == null) {
                for (PaymentProviderConfiguration next : paymentProviderConfiguration.getChildren()) {
                    if (m104691Q2(next, this.f85393N.getBonusProviderServiceIds())) {
                        CircularItemInterface circularItemInterface2 = new CircularItemInterface();
                        circularItemInterface2.setPaymentItem(next);
                        arrayList.add(circularItemInterface2);
                    }
                }
            }
        }
        CircularItemInterface circularItemInterface3 = new CircularItemInterface();
        circularItemInterface3.setTransport(true);
        circularItemInterface3.setImageId(C10320i.ic_transport_exchange);
        circularItemInterface3.setTitle(getString(C10328q.dialog_points_transport_balance));
        arrayList.add(circularItemInterface3);
        return arrayList;
    }

    /* renamed from: N2 */
    private ArrayList m104688N2() {
        ArrayList arrayList = new ArrayList();
        for (PaymentProviderConfiguration paymentProviderConfiguration : m104689O2()) {
            if (paymentProviderConfiguration.getServiceCategory() == null) {
                for (PaymentProviderConfiguration next : paymentProviderConfiguration.getChildren()) {
                    if (m104691Q2(next, this.f85394O.ddProviders)) {
                        CircularItemInterface circularItemInterface = new CircularItemInterface();
                        circularItemInterface.setPaymentItem(next);
                        arrayList.add(circularItemInterface);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: O2 */
    private List m104689O2() {
        return (List) Collection$EL.stream(C27954d.m86303i()).filter(new C30836x9(this)).collect(Collectors.toList());
    }

    /* renamed from: P2 */
    private ArrayList m104690P2() {
        ArrayList arrayList = new ArrayList();
        for (PaymentProviderConfiguration paymentProviderConfiguration : m104689O2()) {
            if (paymentProviderConfiguration.getServiceCategory() == null) {
                for (PaymentProviderConfiguration next : paymentProviderConfiguration.getChildren()) {
                    if (m104692R2(next)) {
                        CircularItemInterface circularItemInterface = new CircularItemInterface();
                        circularItemInterface.setPaymentItem(next);
                        arrayList.add(circularItemInterface);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: Q2 */
    private boolean m104691Q2(PaymentProviderConfiguration paymentProviderConfiguration, HashSet hashSet) {
        if (hashSet.contains(paymentProviderConfiguration.getServiceId())) {
            return true;
        }
        if (paymentProviderConfiguration.getChildren() == null || paymentProviderConfiguration.getChildren().size() <= 0) {
            return false;
        }
        for (PaymentProviderConfiguration Q2 : paymentProviderConfiguration.getChildren()) {
            if (m104691Q2(Q2, hashSet)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R2 */
    private boolean m104692R2(PaymentProviderConfiguration paymentProviderConfiguration) {
        if (paymentProviderConfiguration.isTemplateAccessAllowed) {
            return true;
        }
        if (paymentProviderConfiguration.getChildren() == null || paymentProviderConfiguration.getChildren().size() <= 0) {
            return false;
        }
        for (PaymentProviderConfiguration R2 : paymentProviderConfiguration.getChildren()) {
            if (m104692R2(R2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: S2 */
    private boolean m104693S2(CircularItemInterface circularItemInterface) {
        if (circularItemInterface == null || circularItemInterface.getPaymentItem() == null || circularItemInterface.getPaymentItem().getServiceType() == null || circularItemInterface.getPaymentItem().getServiceName() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: T2 */
    private boolean m104694T2(String str) {
        if (!str.equals("category.gambling.key") || !this.f85387H.getUserRestrictions().contains(UserRestrictions.PAYMENTS_CREATE_GAMBLING_PAYMENT)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public /* synthetic */ void m104695U2(C41205b bVar) {
        this.f85390K.setRefreshing(true);
        this.f85405Z = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void m104696V2(List list) {
        this.f85387H.requestSelected(false);
        this.f85405Z = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public /* synthetic */ void m104697W2(Throwable th) {
        this.f85405Z = false;
        this.f85390K.setRefreshing(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ boolean m104698X2(PaymentProviderConfiguration paymentProviderConfiguration) {
        return !m104694T2(paymentProviderConfiguration.serviceId);
    }

    /* renamed from: Y2 */
    private void m104699Y2(CircularItemInterface circularItemInterface) {
        C10469j jVar;
        if (m104693S2(circularItemInterface)) {
            PaymentProviderConfiguration paymentItem = circularItemInterface.getPaymentItem();
            String serviceType = paymentItem.getServiceType();
            String c = C27950a.m86286c(paymentItem.getServiceName(), true);
            if (paymentItem.serviceCategory == null) {
                jVar = new C10469j.C10470a(c);
            } else if (serviceType.equals("C")) {
                jVar = new C10469j.C10475f(c);
            } else if (!serviceType.equals("F") || circularItemInterface.isDD()) {
                jVar = null;
            } else {
                jVar = new C10469j.C10473d(c);
            }
            if (jVar != null) {
                jVar.mo27161b(C36546y.m108282F());
            }
        }
    }

    /* renamed from: Z2 */
    private void m104700Z2(PaymentProviderConfiguration paymentProviderConfiguration) {
        this.f85391L = new C32133c0(new ArrayList(), (ArrayList) null, this, this, this.f85407b0);
        this.f85389J.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f85389J.setAdapter(this.f85391L);
        this.f85390K.setRefreshing(true);
        ArrayList arrayList = new ArrayList();
        if (paymentProviderConfiguration != null) {
            for (PaymentProviderConfiguration paymentItem : paymentProviderConfiguration.getChildren()) {
                CircularItemInterface circularItemInterface = new CircularItemInterface();
                circularItemInterface.setPaymentItem(paymentItem);
                arrayList.add(circularItemInterface);
            }
            this.f85391L.mo72622l(arrayList);
            this.f85390K.setRefreshing(false);
            this.f85390K.setEnabled(false);
            this.f85395P = paymentProviderConfiguration;
        } else if (this.f85397R) {
            this.f85390K.setOnRefreshListener(new C35305a());
        } else if (this.f85398S) {
            this.f85390K.setOnRefreshListener(new C35306b());
        } else if (this.f85399T) {
            this.f85390K.setOnRefreshListener(new C35307c());
        } else if (this.f85400U) {
            this.f85391L.mo72622l(m104690P2());
            this.f85390K.setRefreshing(false);
            this.f85390K.setEnabled(false);
        } else {
            List O2 = m104689O2();
            for (int i = 0; i < O2.size(); i++) {
                PaymentProviderConfiguration paymentProviderConfiguration2 = (PaymentProviderConfiguration) O2.get(i);
                if (paymentProviderConfiguration2.getServiceCategory() == null) {
                    CircularItemInterface circularItemInterface2 = new CircularItemInterface();
                    circularItemInterface2.setPaymentItem(paymentProviderConfiguration2);
                    arrayList.add(circularItemInterface2);
                }
            }
            this.f85391L.mo72622l(arrayList);
            this.f85390K.setRefreshing(false);
            this.f85390K.setEnabled(false);
        }
    }

    /* renamed from: a3 */
    private void m104701a3(PaymentProviderConfiguration paymentProviderConfiguration, boolean z) {
        String str;
        Class<PaymentFormActivity> cls = PaymentFormActivity.class;
        if (this.f85398S) {
            if ("bog-comp-mobilepayments".equals(paymentProviderConfiguration.getServiceId())) {
                str = "PLS2";
            } else {
                str = null;
            }
            C33624a.m98713a(this).mo79806f(cls).mo79819s(paymentProviderConfiguration.getServiceId()).mo79804d("PLUS").mo79824x(str).mo79818r(0).mo79825y();
        } else if (this.f85399T) {
            C33624a.m98713a(this).mo79806f(DDFormActivity.class).mo79808h(C27950a.m86289f(paymentProviderConfiguration.getProviderName(), C37353c.EN, new Object[0])).mo79819s(paymentProviderConfiguration.getServiceId()).mo79818r(10020).mo79825y();
        } else if (!this.f85400U) {
            C33624a.C33625a r = C33624a.m98713a(this).mo79806f(cls).mo79819s(paymentProviderConfiguration.getServiceId()).mo79807g(z).mo79818r(0);
            ProviderListUIConfiguration providerListUIConfiguration = this.f85407b0;
            if (!(providerListUIConfiguration == null || providerListUIConfiguration.getExtraData() == null)) {
                r.mo79805e(this.f85407b0.getExtraData().get("carNumber"));
                r.mo79817q(this.f85407b0.getExtraData().get("personalNumber"));
            }
            r.mo79825y();
        } else if (paymentProviderConfiguration.isTemplateAccessAllowed || z) {
            C33624a.m98713a(this).mo79806f(TemplateFormActivity.class).mo79807g(z).mo79819s(paymentProviderConfiguration.getServiceId()).mo79803c(true).mo79820t(getIntent().getLongExtra("TEMPLATE_GROUP_ID", -1)).mo79814n(this.f85402W).mo79818r(0).mo79825y();
        } else {
            C32297d.m95154b(this, getString(C10328q.template_not_allowed));
        }
    }

    /* renamed from: L2 */
    public void mo86353L2() {
        mo86438k1(this.f85386G.mo48087c().mo95027o0(C40992a.m118827a()).mo94980F(new C30797u9(this)).mo94983G0(new C30810v9(this), new C30823w9(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_provider_list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        PaymentProviderConfiguration paymentProviderConfiguration;
        super.mo37451O1(bundle);
        this.f85389J = (RecyclerView) findViewById(C10322k.f28712Br);
        this.f85390K = (SwipeRefreshLayout) findViewById(C10322k.f28739Gw);
        this.f85402W = getIntent().getBooleanExtra("FINISH_AFTER_CREATE_TEMPLATE", false);
        this.f85400U = getIntent().getBooleanExtra("CREATE_NEW_TEMPLATE", false);
        if (getIntent().getExtras() != null) {
            this.f85396Q = getIntent().getExtras().getBoolean("PROVIDER_LIST_IS_SHOW_ALL_LIST", false);
            this.f85397R = getIntent().getExtras().getBoolean("PROVIDER_LIST_SHOW_SELECTED", false);
            this.f85398S = getIntent().getExtras().getBoolean("PROVIDER_LIST_SHOW_BONUSES", false);
            this.f85399T = getIntent().getExtras().getBoolean("PROVIDER_LIST_SHOW_DD", false);
            this.f85401V = getIntent().getExtras().getString("BONUS_PRODUCT_TYPE", "PLS1");
            this.f85403X = getIntent().getExtras().getLong("PRODUCT_ACCT_KEY", -1);
            this.f85404Y = getIntent().getExtras().getInt("PRODUCT_TYPE_KEY", -1);
        }
        if ("ACTION_OPEN_FROM_WIDGET".equals(getIntent().getAction())) {
            C36546y.m108282F().mo27152s("quick_links_widget", "utilities", "open_page");
        }
        long longExtra = getIntent().getLongExtra("PAYMENT_CONFIGURATION_KEY", -1);
        String stringExtra = getIntent().getStringExtra("CATEGORY_PROVIDER_SERVICE_ID");
        this.f85407b0 = (ProviderListUIConfiguration) getIntent().getSerializableExtra("PROVIDER_UI_CONFIGURATION");
        if (longExtra != -1) {
            paymentProviderConfiguration = C27954d.m86300f(longExtra);
        } else if (stringExtra != null) {
            paymentProviderConfiguration = C27954d.m86302h(stringExtra);
        } else {
            paymentProviderConfiguration = null;
        }
        if (paymentProviderConfiguration != null) {
            this.f85406a0 = paymentProviderConfiguration;
        }
        m104700Z2(paymentProviderConfiguration);
    }

    /* renamed from: c */
    public void mo86061c(int i, CircularItemInterface circularItemInterface) {
        DDProvidersListEvent dDProvidersListEvent;
        ArrayList<DDProviderItem> arrayList;
        DDProvidersListEvent dDProvidersListEvent2;
        BonusProvidersEvent bonusProvidersEvent;
        if (circularItemInterface != null) {
            PaymentProviderConfiguration paymentItem = circularItemInterface.getPaymentItem();
            if (i == 1 || i == 4) {
                m104699Y2(circularItemInterface);
                if (circularItemInterface.isDD()) {
                    C33624a.m98713a(this).mo79806f(DDFormActivity.class).mo79808h(C27950a.m86289f(paymentItem.getProviderName(), C37353c.EN, new Object[0])).mo79819s(paymentItem.getServiceId()).mo79823w(!circularItemInterface.isPeriodic()).mo79818r(10020).mo79825y();
                } else if (paymentItem != null) {
                    if (i == 4 && paymentItem.getServiceId().equals("category.transport_pass.key")) {
                        C36546y.m108282F().mo27152s("payments", "provider_" + C27950a.m86289f(paymentItem.getProviderName(), C37353c.KA, new Object[0]), "provider_navigation");
                    }
                    if (!paymentItem.getServiceType().equals("C") || paymentItem.getChildren() == null) {
                        if (paymentItem.getServiceType().equals("F")) {
                            if (!this.f85399T || (dDProvidersListEvent = this.f85394O) == null || (arrayList = dDProvidersListEvent.providerItems) == null) {
                                m104701a3(paymentItem, false);
                                return;
                            }
                            Iterator<DDProviderItem> it = arrayList.iterator();
                            while (it.hasNext()) {
                                DDProviderItem next = it.next();
                                if (paymentItem.getServiceId().equals(next.providerServiceId)) {
                                    if (next.isTopupAllowed()) {
                                        ArrayList arrayList2 = new ArrayList();
                                        CircularItemInterface circularItemInterface2 = new CircularItemInterface();
                                        circularItemInterface2.setDD(true);
                                        circularItemInterface2.setPeriodic(true);
                                        circularItemInterface2.setPaymentItem(paymentItem);
                                        circularItemInterface2.setTitle(getString(C10328q.dd_periodic));
                                        arrayList2.add(circularItemInterface2);
                                        CircularItemInterface circularItemInterface3 = new CircularItemInterface();
                                        circularItemInterface3.setPeriodic(false);
                                        circularItemInterface3.setDD(true);
                                        circularItemInterface3.setPaymentItem(paymentItem);
                                        circularItemInterface3.setTitle(getString(C10328q.dd_top_up));
                                        arrayList2.add(circularItemInterface3);
                                        this.f85391L.mo72622l(arrayList2);
                                        this.f85395P = paymentItem;
                                    } else {
                                        m104701a3(paymentItem, false);
                                        return;
                                    }
                                }
                            }
                        } else if (paymentItem.getServiceId().equals("category.transport_pass.key")) {
                            ((C38124g) getApplicationContext()).mo37169a().mo91602f(this, "");
                        }
                    } else if (paymentItem.getAdditionalData() == null || !paymentItem.getAdditionalData().equals("C") || this.f85398S || this.f85399T) {
                        ArrayList arrayList3 = new ArrayList();
                        if (this.f85398S && (bonusProvidersEvent = this.f85393N) != null && bonusProvidersEvent.getBonusProviders() != null) {
                            for (PaymentProviderConfiguration next2 : paymentItem.getChildren()) {
                                if (m104691Q2(next2, this.f85393N.getBonusProviderServiceIds())) {
                                    CircularItemInterface circularItemInterface4 = new CircularItemInterface();
                                    circularItemInterface4.setPaymentItem(next2);
                                    arrayList3.add(circularItemInterface4);
                                }
                            }
                        } else if (this.f85399T && (dDProvidersListEvent2 = this.f85394O) != null && dDProvidersListEvent2.ddProviders != null) {
                            for (PaymentProviderConfiguration next3 : paymentItem.getChildren()) {
                                if (m104691Q2(next3, this.f85394O.ddProviders)) {
                                    CircularItemInterface circularItemInterface5 = new CircularItemInterface();
                                    circularItemInterface5.setPaymentItem(next3);
                                    arrayList3.add(circularItemInterface5);
                                }
                            }
                        } else if (this.f85400U) {
                            for (PaymentProviderConfiguration next4 : paymentItem.getChildren()) {
                                if (m104692R2(next4)) {
                                    CircularItemInterface circularItemInterface6 = new CircularItemInterface();
                                    circularItemInterface6.setPaymentItem(next4);
                                    arrayList3.add(circularItemInterface6);
                                }
                            }
                        } else {
                            for (PaymentProviderConfiguration paymentItem2 : paymentItem.getChildren()) {
                                CircularItemInterface circularItemInterface7 = new CircularItemInterface();
                                circularItemInterface7.setPaymentItem(paymentItem2);
                                arrayList3.add(circularItemInterface7);
                            }
                        }
                        this.f85391L.mo72622l(arrayList3);
                        this.f85395P = paymentItem;
                    } else {
                        m104701a3(paymentItem, true);
                    }
                } else if (circularItemInterface.isPlus()) {
                    this.f85398S = true;
                    this.f85397R = false;
                    m104700Z2((PaymentProviderConfiguration) null);
                    this.f85401V = "PLS1";
                    this.f85387H.requestBonusProviders(false, "PLUS", "PLS1");
                } else if (circularItemInterface.isTransport()) {
                    Intent intent = new Intent(this, TransportPointExchangeActivity.class);
                    intent.putExtra("BONUS_TYPE", "PLUS");
                    startActivity(intent);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo86062e(int i) {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i != 10020) {
            setResult(-1, intent);
            finish();
            return;
        }
        setResult(-1, new Intent());
        finish();
    }

    public void onBackPressed() {
        PaymentProviderConfiguration paymentProviderConfiguration = this.f85395P;
        if (paymentProviderConfiguration != null && this.f85406a0 != null && paymentProviderConfiguration.getId() == this.f85406a0.getId()) {
            super.onBackPressed();
        } else if (this.f85395P != null) {
            ArrayList arrayList = new ArrayList();
            if (this.f85398S) {
                BonusProvidersEvent bonusProvidersEvent = this.f85393N;
                if (!(bonusProvidersEvent == null || bonusProvidersEvent.getBonusProviders() == null)) {
                    if (this.f85395P.getParent() == null || this.f85395P.getParent().serviceCategory == null) {
                        arrayList.addAll(m104687M2());
                    } else {
                        for (PaymentProviderConfiguration next : this.f85395P.getParent().getChildren()) {
                            if (m104691Q2(next, this.f85393N.getBonusProviderServiceIds())) {
                                CircularItemInterface circularItemInterface = new CircularItemInterface();
                                circularItemInterface.setPaymentItem(next);
                                arrayList.add(circularItemInterface);
                            }
                        }
                    }
                }
            } else if (this.f85399T) {
                DDProvidersListEvent dDProvidersListEvent = this.f85394O;
                if (!(dDProvidersListEvent == null || dDProvidersListEvent.ddProviders == null)) {
                    if (this.f85395P.getParent() == null || this.f85395P.getParent().serviceCategory == null) {
                        arrayList.addAll(m104688N2());
                    } else {
                        for (PaymentProviderConfiguration next2 : this.f85395P.getParent().getChildren()) {
                            if (m104691Q2(next2, this.f85394O.ddProviders)) {
                                CircularItemInterface circularItemInterface2 = new CircularItemInterface();
                                circularItemInterface2.setPaymentItem(next2);
                                arrayList.add(circularItemInterface2);
                            }
                        }
                    }
                }
            } else if (this.f85400U) {
                if (this.f85395P.getParent() == null || this.f85395P.getParent().serviceCategory == null) {
                    arrayList.addAll(m104690P2());
                } else {
                    for (PaymentProviderConfiguration next3 : this.f85395P.getParent().getChildren()) {
                        if (m104692R2(next3)) {
                            CircularItemInterface circularItemInterface3 = new CircularItemInterface();
                            circularItemInterface3.setPaymentItem(next3);
                            arrayList.add(circularItemInterface3);
                        }
                    }
                }
            } else if (this.f85395P.getParent() == null || this.f85395P.getParent().serviceCategory == null) {
                List O2 = m104689O2();
                for (int i = 0; i < O2.size(); i++) {
                    PaymentProviderConfiguration paymentProviderConfiguration2 = (PaymentProviderConfiguration) O2.get(i);
                    if (paymentProviderConfiguration2.getServiceCategory() == null) {
                        CircularItemInterface circularItemInterface4 = new CircularItemInterface();
                        circularItemInterface4.setPaymentItem(paymentProviderConfiguration2);
                        arrayList.add(circularItemInterface4);
                    }
                }
            } else {
                for (PaymentProviderConfiguration paymentItem : this.f85395P.getParent().getChildren()) {
                    CircularItemInterface circularItemInterface5 = new CircularItemInterface();
                    circularItemInterface5.setPaymentItem(paymentItem);
                    arrayList.add(circularItemInterface5);
                }
            }
            this.f85391L.mo72622l(arrayList);
            this.f85395P = this.f85395P.getParent();
        } else {
            super.onBackPressed();
        }
    }

    @C41452l
    public void onBonusProviders(BonusProvidersEvent bonusProvidersEvent) {
        if (this.f85398S && this.f85393N != bonusProvidersEvent) {
            this.f85393N = bonusProvidersEvent;
            int state = bonusProvidersEvent.getState();
            if (state == 10) {
                this.f85390K.setRefreshing(true);
            } else if (state == 20) {
                this.f85391L.mo72622l(m104687M2());
                this.f85390K.setRefreshing(false);
            } else if (state == 30) {
                this.f85390K.setRefreshing(false);
            } else if (state == 40) {
                this.f85390K.setRefreshing(false);
            }
        }
    }

    @C41452l
    public void onDDProviders(DDProvidersListEvent dDProvidersListEvent) {
        if (this.f85387H.isAuthorized() && this.f85399T && this.f85394O != dDProvidersListEvent) {
            this.f85394O = dDProvidersListEvent;
            int state = dDProvidersListEvent.getState();
            if (state == 10) {
                this.f85390K.setRefreshing(true);
            } else if (state == 20) {
                this.f85391L.mo72622l(m104688N2());
                this.f85390K.setRefreshing(false);
            } else if (state == 30) {
                this.f85390K.setRefreshing(false);
            } else if (state == 40) {
                this.f85390K.setRefreshing(false);
                C32297d.m95154b(this, dDProvidersListEvent.getErrorKey());
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
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

    @C41452l
    public void onSelected(SelectedPaymentsEvent selectedPaymentsEvent) {
        if (this.f85397R && this.f85392M != selectedPaymentsEvent) {
            this.f85392M = selectedPaymentsEvent;
            int state = selectedPaymentsEvent.getState();
            if (state == 10) {
                this.f85390K.setRefreshing(true);
            } else if (state == 20) {
                ArrayList arrayList = new ArrayList();
                if (this.f85387H.isAuthorized() && this.f85387H.hasProduct("PLUS")) {
                    CircularItemInterface circularItemInterface = new CircularItemInterface();
                    circularItemInterface.setPlus(true);
                    circularItemInterface.setTitle(getString(C10328q.payments_pay_with_plus));
                    circularItemInterface.setImageId(C10320i.ic_plus_classic);
                    arrayList.add(circularItemInterface);
                }
                Iterator<SelectedPayment> it = selectedPaymentsEvent.getSelectedPayments().iterator();
                while (it.hasNext()) {
                    PaymentProviderConfiguration h = C27954d.m86302h(it.next().getProviderId());
                    if (h != null) {
                        CircularItemInterface circularItemInterface2 = new CircularItemInterface();
                        circularItemInterface2.setPaymentItem(h);
                        arrayList.add(circularItemInterface2);
                    }
                }
                this.f85391L.mo72622l(arrayList);
                this.f85390K.setRefreshing(false);
                this.f85390K.setEnabled(false);
            } else if (state == 30) {
                this.f85390K.setRefreshing(false);
            } else if (state == 40) {
                this.f85390K.setRefreshing(false);
            }
        }
    }

    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f85388I, this);
        if (this.f85397R) {
            if (this.f85387H.isAuthorized()) {
                mo86353L2();
            } else {
                this.f85387H.requestSelected(false);
            }
        } else if (this.f85398S) {
            this.f85387H.requestBonusProviders(false, "PLUS", this.f85401V);
        } else if (this.f85399T) {
            this.f85387H.requestDDProviders(false);
        }
    }

    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f85388I, this);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(getIntent().getBooleanExtra("PROVIDER_LIST_SHOW_SELECTED", false) ? C10328q.header_text_payments_selected : C10328q.header_text_payments_categories);
    }
}
