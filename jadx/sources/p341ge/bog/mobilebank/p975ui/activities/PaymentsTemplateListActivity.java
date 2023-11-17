package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30822w8;
import a81.C30835x8;
import a81.C30848y8;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import g81.C32205k0;
import g91.C32297d;
import g91.C32303f;
import g91.C32315k0;
import g91.C32343x;
import g91.C32359z0;
import iu0.C36546y;
import j81.C36772n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import jg1.C41438c;
import jg1.C41452l;
import n41.C37353c;
import org.parceler.C42035e;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.eventbus.events.DeleteTemplateGroupEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyTemplateGroupEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyTemplateGroupLinkEvent;
import p341ge.bog.mobilebank.eventbus.events.TemplatesAndConfigEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.wizard.activities.PaymentOptionWizardActivity;
import p341ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p341ge.bog.mobilebank.payment.activities.TemplateFormActivity;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10328q;
import p748eu.C20292b;
import p90.C27276d2;
import r90.C27950a;
import r90.C27954d;

/* renamed from: ge.bog.mobilebank.ui.activities.PaymentsTemplateListActivity */
public class PaymentsTemplateListActivity extends C35380e0 implements C36772n {

    /* renamed from: G */
    protected Client f85292G;

    /* renamed from: H */
    protected C41438c f85293H;

    /* renamed from: I */
    protected PreferencesApiManager f85294I;

    /* renamed from: J */
    protected C20292b f85295J;

    /* renamed from: K */
    private C27276d2 f85296K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C32205k0 f85297L;

    /* renamed from: M */
    private TemplatesAndConfigEvent f85298M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public int f85299N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public TemplateGroup f85300O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public ArrayList f85301P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public int f85302Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public int f85303R;

    /* renamed from: S */
    private boolean f85304S;

    /* renamed from: T */
    private ModifyTemplateGroupEvent f85305T;

    /* renamed from: U */
    private boolean f85306U;

    /* renamed from: V */
    private DeleteTemplateGroupEvent f85307V;

    /* renamed from: W */
    private ModifyTemplateGroupLinkEvent f85308W;

    /* renamed from: X */
    private C33624a.C33625a f85309X;

    /* renamed from: ge.bog.mobilebank.ui.activities.PaymentsTemplateListActivity$a */
    class C35294a implements SwipeRefreshLayout.C1862j {
        C35294a() {
        }

        /* renamed from: v */
        public void mo6203v() {
            PaymentsTemplateListActivity.this.f85302Q = 0;
            PaymentsTemplateListActivity.this.f85303R = 0;
            int J2 = PaymentsTemplateListActivity.this.f85299N;
            if (J2 == 10) {
                PaymentsTemplateListActivity.this.f85297L.mo72747x();
                PaymentsTemplateListActivity.this.f85292G.requestTemplatesWithConfig(true);
            } else if (J2 == 20) {
                PaymentsTemplateListActivity.this.f85297L.mo72745U(false);
                Iterator it = PaymentsTemplateListActivity.this.f85301P.iterator();
                while (it.hasNext()) {
                    PaymentsTemplateListActivity.this.f85292G.refreshDebt(((Long) it.next()).longValue());
                }
            } else if (J2 == 30) {
                PaymentsTemplateListActivity.this.f85297L.mo72747x();
                PaymentsTemplateListActivity paymentsTemplateListActivity = PaymentsTemplateListActivity.this;
                paymentsTemplateListActivity.f85292G.refreshCarDebt(paymentsTemplateListActivity.f85300O);
            } else if (J2 == 40) {
                PaymentsTemplateListActivity.this.f85297L.mo72747x();
                PaymentsTemplateListActivity.this.f85292G.requestTemplateDebts(true);
            }
            PaymentsTemplateListActivity.this.m104580U2();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.PaymentsTemplateListActivity$b */
    class C35295b implements Runnable {
        C35295b() {
        }

        public void run() {
            PaymentsTemplateListActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m104564C2(View view) {
        m104577Q2();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public /* synthetic */ void m104575O2(boolean z, long j, C13310d dVar, Button button) {
        if (z) {
            Client client = this.f85292G;
            client.requestModifyTemplateGroupLink(true, j + "", this.f85300O.getId(), "DELETE");
        } else {
            this.f85292G.deleteTemplate(true, j);
        }
        dVar.mo4577k1();
    }

    /* renamed from: Q2 */
    private void m104577Q2() {
        ArrayList C = this.f85297L.mo72734C();
        if (C.size() > 0) {
            String valueOf = String.valueOf(this.f85302Q - this.f85303R);
            Intent intent = new Intent(this, PaymentOptionWizardActivity.class);
            intent.putExtra("PAYMENT_EXECUTE_DATA_OBJECT", C42035e.m122121c(C));
            intent.putExtra("WIZARD_AMOUNT", valueOf);
            PaymentOptionWizardActivity.m106602Y3(this, intent, 0);
        }
    }

    /* renamed from: S2 */
    private void m104578S2() {
        int i = this.f85299N;
        boolean z = true;
        if (i == 10) {
            this.f85297L.mo72742R(this.f85298M.getTemplatesWithPaymentConfig());
            this.f85296K.f68519j.setRefreshing(!this.f85297L.mo72737G());
        } else if (i == 20) {
            TemplateGroup templateGroup = this.f85300O;
            if (templateGroup == null || templateGroup.getGroupType() == null || !this.f85300O.getGroupType().equals(PensionStatusResult.STATUS_INACTIVE)) {
                this.f85296K.f68519j.setRefreshing(false);
            } else {
                this.f85297L.mo72746V(this.f85300O);
                this.f85297L.mo72742R(this.f85298M.getTemplatesWithPaymentConfig());
                this.f85296K.f68519j.setRefreshing(!this.f85297L.mo72737G());
            }
        } else if (i == 30) {
            TemplateGroup templateGroup2 = this.f85300O;
            if (templateGroup2 == null || templateGroup2.getGroupType() == null || !this.f85300O.getGroupType().equals("C") || this.f85300O.getCtParkPenaltiesEvent() == null || this.f85300O.getCtPark6MonthsEvent() == null) {
                this.f85296K.f68519j.setRefreshing(false);
            } else {
                this.f85297L.mo72746V(this.f85300O);
                this.f85297L.mo72742R(this.f85298M.getTemplatesWithPaymentConfig());
                SwipeRefreshLayout swipeRefreshLayout = this.f85296K.f68519j;
                if (!(this.f85300O.getCtParkPenaltiesEvent().getState() == 10 || this.f85300O.getCtPark6MonthsEvent().getState() == 10)) {
                    z = false;
                }
                swipeRefreshLayout.setRefreshing(z);
            }
        } else if (i == 40) {
            this.f85297L.mo72742R(this.f85298M.getTemplatesWithPaymentConfig());
            this.f85296K.f68519j.setRefreshing(!this.f85292G.isAllDebtsReceived());
        }
        m104580U2();
    }

    /* renamed from: T2 */
    private void m104579T2() {
        C20292b bVar;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f85299N = extras.getInt("PAYMENT_TEMPLATE_LIST_TYPE_KEY", -1);
            long j = extras.getLong("PAYMENT_TEMPLATE_LIST_GROUP_KEY", -1);
            this.f85301P = new ArrayList();
            TemplateGroup templateGroupById = this.f85292G.getTemplateGroupById(j);
            this.f85300O = templateGroupById;
            if (!(templateGroupById == null || templateGroupById.getTemplates() == null)) {
                for (TemplateBasketItem id : this.f85300O.getTemplates()) {
                    this.f85301P.add(Long.valueOf(id.getId()));
                }
            }
            if (this.f85292G.isAuthorized()) {
                bVar = this.f85295J;
            } else {
                bVar = null;
            }
            this.f85297L = new C32205k0(this.f85299N, this, this.f85292G, this, this.f85296K.f68515f, bVar);
            this.f85296K.f68517h.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.f85296K.f68517h.setAdapter(this.f85297L);
            C32359z0.m95582n(this.f85296K.f68517h, "SCREEN_TYPE_TEMPLATES_TIPPER", this.f85294I);
            int i = this.f85299N;
            if (i == 10) {
                this.f85297L.mo72743S(false);
            } else if (i == 20 || i == 30 || i == 40) {
                this.f85297L.mo72743S(true);
            }
            this.f85296K.f68519j.setDistanceToTriggerSync(((int) (getResources().getDisplayMetrics().density * 64.0f)) * 3);
            this.f85296K.f68519j.setEnabled(true);
            this.f85296K.f68519j.setOnRefreshListener(new C35294a());
            m104580U2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public void m104580U2() {
        BogButton bogButton = this.f85296K.f68521l.f70288l;
        int i = this.f85302Q;
        boolean z = true;
        boolean z2 = i > 0;
        if (i <= 0) {
            z = false;
        }
        bogButton.setOrange(z2, z);
    }

    /* renamed from: V2 */
    private void m104581V2(long j, boolean z) {
        C13310d dVar = new C13310d();
        dVar.mo35648c2(getResources().getString(C10328q.f28931K0));
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35639Q1(getResources().getString(C10328q.f28923E1));
        dVar.mo35646Z1(getResources().getString(C10328q.f28924F0));
        dVar.mo35645Y1(new C30835x8(this, z, j, dVar));
        dVar.mo35642U1(getResources().getString(C10328q.f28932M0));
        dVar.mo35641T1(new C30848y8(dVar));
        dVar.mo4576A1(getSupportFragmentManager(), "Alert");
    }

    /* renamed from: W2 */
    private void m104582W2() {
        PaymentProviderConfiguration h;
        C33624a.C33625a aVar = this.f85309X;
        if (aVar != null && (h = C27954d.m86302h(aVar.mo79802b())) != null && h.isDDAllowed()) {
            if (this.f85292G.isAuthorized()) {
                Handler handler = new Handler();
                this.f85309X.mo79825y();
                handler.postDelayed(new C35295b(), 1500);
                return;
            }
            C32303f.m95188H(this);
        }
    }

    /* renamed from: G */
    public void mo86321G(TemplateBasketItem templateBasketItem) {
        this.f85292G.refreshDebt(templateBasketItem.getId());
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27276d2 d = C27276d2.m84404d(getLayoutInflater());
        this.f85296K = d;
        setContentView((View) d.f68518i);
        super.mo37451O1(bundle);
        this.f85296K.f68521l.f70288l.setOnClickListener(new C30822w8(this));
        C36546y.m108282F().mo27138I("templates");
        this.f85296K.f68521l.f70287k.setVisibility(8);
        this.f85296K.f68521l.f70288l.setText(C10328q.f28937S0);
        m104579T2();
    }

    /* renamed from: R2 */
    public void mo86322R2(boolean z) {
        this.f85306U = z;
    }

    /* renamed from: T */
    public void mo86323T(TemplateBasketItem templateBasketItem) {
        int i = this.f85299N;
        String str = "";
        if (!(i == 10 || i == 20)) {
            if (i == 30) {
                if (C27954d.m86301g(templateBasketItem.getServiceId()) != null) {
                    str = C27954d.m86301g(templateBasketItem.getServiceId()).getProviderName();
                }
                C36546y.m108282F().mo27152s("payments_templates", C27950a.m86289f(str, C37353c.EN, new Object[0]), "open_template");
                C33624a.m98713a(this).mo79806f(PaymentFormActivity.class).mo79819s("bog-comp-tbprkpenalty").mo79805e(templateBasketItem.getParameterValue("carNo")).mo79822v(templateBasketItem.getParameterValue("ticketNo")).mo79817q(templateBasketItem.getParameterValue("ownerCode")).mo79825y();
                return;
            } else if (i != 40) {
                return;
            }
        }
        TemplateBasketItem templateItemById = this.f85292G.getTemplateItemById(templateBasketItem.getId());
        if (templateItemById != null) {
            if (C27954d.m86301g(templateItemById.getServiceId()) != null) {
                str = C27954d.m86301g(templateItemById.getServiceId()).getProviderName();
            }
            C36546y.m108282F().mo27152s("payments_templates", C27950a.m86289f(str, C37353c.EN, new Object[0]), "open_template");
            C33624a.m98713a(this).mo79806f(TemplateFormActivity.class).mo79821u(templateItemById.getId()).mo79825y();
        }
    }

    /* renamed from: a */
    public void mo86324a(TemplateBasketItem templateBasketItem, int i) {
        int i2 = this.f85299N;
        Class<DDTransparentLoaderActivity> cls = DDTransparentLoaderActivity.class;
        if (i2 != 4) {
            Class<TemplateFormActivity> cls2 = TemplateFormActivity.class;
            if (i2 != 10) {
                if (i2 != 20) {
                    if (i2 != 30) {
                        if (i2 != 40) {
                            return;
                        }
                    } else if (i == 4) {
                        C36546y.m108282F().mo27152s("payments_templates", "automatic_services", "swipe_menu_click");
                        this.f85309X = C33624a.m98713a(this).mo79813m(C32315k0.m95259h(templateBasketItem)).mo79810j(templateBasketItem.getTemplateNameOrServiceName(this.f85292G)).mo79819s(templateBasketItem.getServiceId()).mo79806f(cls);
                        m104582W2();
                        return;
                    } else {
                        return;
                    }
                } else if (i == 2) {
                    C36546y.m108282F().mo27152s("payments_templates", "edit", "swipe_menu_click");
                    C33624a.m98713a(this).mo79806f(cls2).mo79821u(templateBasketItem.getId()).mo79815o(true).mo79825y();
                    return;
                } else if (i == 3) {
                    C36546y.m108282F().mo27152s("payments_templates", "delete", "swipe_menu_click");
                    m104581V2(templateBasketItem.getId(), true);
                    return;
                } else if (i == 4) {
                    C36546y.m108282F().mo27152s("payments_templates", "automatic_services", "swipe_menu_click");
                    this.f85309X = C33624a.m98713a(this).mo79813m(C32315k0.m95259h(templateBasketItem)).mo79810j(templateBasketItem.getTemplateNameOrServiceName(this.f85292G)).mo79819s(templateBasketItem.getServiceId()).mo79806f(cls);
                    m104582W2();
                    return;
                } else {
                    return;
                }
            }
            if (i == 2) {
                C36546y.m108282F().mo27152s("payments_templates", "edit", "swipe_menu_click");
                C33624a.m98713a(this).mo79806f(cls2).mo79821u(templateBasketItem.getId()).mo79815o(true).mo79825y();
            } else if (i == 3) {
                C36546y.m108282F().mo27152s("payments_templates", "delete", "swipe_menu_click");
                m104581V2(templateBasketItem.getId(), false);
            } else if (i == 4) {
                C36546y.m108282F().mo27152s("payments_templates", "automatic_services", "swipe_menu_click");
                this.f85309X = C33624a.m98713a(this).mo79813m(C32315k0.m95259h(templateBasketItem)).mo79810j(templateBasketItem.getTemplateNameOrServiceName(this.f85292G)).mo79819s(templateBasketItem.getServiceId()).mo79806f(cls);
                m104582W2();
            }
        } else {
            C36546y.m108282F().mo27152s("payments_templates", "automatic_services", "swipe_menu_click");
            this.f85309X = C33624a.m98713a(this).mo79813m(C32315k0.m95259h(templateBasketItem)).mo79810j(templateBasketItem.getTemplateNameOrServiceName(this.f85292G)).mo79819s(templateBasketItem.getServiceId()).mo79806f(cls);
            m104582W2();
        }
    }

    /* renamed from: n */
    public void mo86325n() {
        this.f85303R = this.f85297L.mo72735D();
        this.f85302Q = this.f85297L.mo72736E() + this.f85303R;
        m104580U2();
    }

    @C41452l
    public void onCarDebtEvent(TemplateGroup templateGroup) {
        boolean z;
        TemplateGroup templateGroup2 = this.f85300O;
        if (templateGroup2 != null && templateGroup2.getId() == templateGroup.getId()) {
            this.f85300O = templateGroup;
            if (this.f85299N == 30) {
                this.f85297L.mo72746V(templateGroup);
                this.f85297L.mo72742R(this.f85298M.getTemplatesWithPaymentConfig());
                SwipeRefreshLayout swipeRefreshLayout = this.f85296K.f68519j;
                if (this.f85300O.getCtParkPenaltiesEvent().getState() == 10 || this.f85300O.getCtPark6MonthsEvent().getState() == 10) {
                    z = true;
                } else {
                    z = false;
                }
                swipeRefreshLayout.setRefreshing(z);
            }
        }
    }

    @C41452l
    public void onDeleteTemplateGroupEvent(DeleteTemplateGroupEvent deleteTemplateGroupEvent) {
        if (this.f85300O != null && this.f85307V != deleteTemplateGroupEvent && deleteTemplateGroupEvent.getTemplateId() == this.f85300O.getId()) {
            this.f85307V = deleteTemplateGroupEvent;
            int state = deleteTemplateGroupEvent.getState();
            if (state == 10) {
                this.f85296K.f68519j.setRefreshing(true);
            } else if (state == 20) {
                this.f85304S = false;
                this.f85296K.f68519j.setRefreshing(false);
                C32297d.m95160h(this, getString(C10328q.f28956f2));
                finish();
            } else if (state == 30) {
                this.f85296K.f68519j.setRefreshing(false);
                this.f85304S = false;
            } else if (state == 40) {
                this.f85296K.f68519j.setRefreshing(false);
                C32297d.m95154b(this, C27950a.m86284a(deleteTemplateGroupEvent.getErrorKey()));
            }
        }
    }

    @C41452l
    public void onModifyTemplateGroupEvent(ModifyTemplateGroupEvent modifyTemplateGroupEvent) {
        if (this.f85300O != null && modifyTemplateGroupEvent.getTemplateGroup().getId() == this.f85300O.getId()) {
            this.f85305T = modifyTemplateGroupEvent;
            if (modifyTemplateGroupEvent.getState() == 20) {
                this.f85304S = false;
                this.f85300O = modifyTemplateGroupEvent.getTemplateGroup();
                m104578S2();
                C32205k0 k0Var = this.f85297L;
                if (k0Var != null) {
                    k0Var.notifyItemChanged(0);
                }
            }
        }
    }

    @C41452l
    public void onModifyTemplateGroupLinkEvent(ModifyTemplateGroupLinkEvent modifyTemplateGroupLinkEvent) {
        if (this.f85299N == 20 && this.f85308W != modifyTemplateGroupLinkEvent && modifyTemplateGroupLinkEvent.getTemplateGroupId() == this.f85300O.getId()) {
            this.f85308W = modifyTemplateGroupLinkEvent;
            int state = modifyTemplateGroupLinkEvent.getState();
            if (state == 10) {
                this.f85296K.f68519j.setRefreshing(true);
            } else if (state == 20) {
                this.f85292G.setModifyTemplateGroupLinkEvent((ModifyTemplateGroupLinkEvent) null);
                this.f85297L.mo72747x();
                this.f85298M = null;
                this.f85292G.requestTemplatesWithConfig(false);
            } else if (state == 30) {
                this.f85292G.requestTemplatesWithConfig(false);
            } else if (state == 40) {
                this.f85292G.requestTemplatesWithConfig(false);
            }
        }
    }

    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f85293H, this);
        this.f85292G.requestTemplatesWithConfig(false);
        if (this.f85304S) {
            this.f85292G.modifyTemplateGroup(false, this.f85300O, (File) null);
        }
        if (this.f85299N == 20) {
            this.f85292G.checkModifyTemplateGroupLink();
        }
        if (this.f85306U) {
            this.f85292G.deleteTemplateGroup(false, this.f85300O.getId());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f85293H, this);
    }

    @C41452l
    public void onTemplateBasketItemChanged(TemplateBasketItem templateBasketItem) {
        int i = this.f85299N;
        if (i == 10) {
            this.f85296K.f68519j.setRefreshing(!this.f85297L.mo72737G());
        } else if (i == 20) {
            this.f85296K.f68519j.setRefreshing(!this.f85297L.mo72737G());
        } else if (i == 40) {
            m104578S2();
            this.f85296K.f68519j.setRefreshing(!this.f85292G.isAllDebtsReceived());
        }
        this.f85297L.mo72738J(templateBasketItem);
    }

    @C41452l
    public void onTemplatesWithConfigEvent(TemplatesAndConfigEvent templatesAndConfigEvent) {
        if (this.f85298M != templatesAndConfigEvent) {
            this.f85298M = templatesAndConfigEvent;
            int state = templatesAndConfigEvent.getState();
            if (state == 10) {
                this.f85296K.f68519j.setRefreshing(true);
                this.f85297L.mo72747x();
            } else if (state == 20) {
                m104579T2();
                m104578S2();
            } else if (state == 30) {
                this.f85296K.f68519j.setRefreshing(false);
                this.f85297L.mo72747x();
            } else if (state == 40) {
                this.f85296K.f68519j.setRefreshing(false);
                this.f85297L.mo72747x();
            }
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.tab_bar_payments);
    }
}
