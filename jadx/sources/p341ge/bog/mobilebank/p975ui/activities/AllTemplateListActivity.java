package p341ge.bog.mobilebank.p975ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g81.C32276w;
import g91.C32343x;
import iu0.C36546y;
import j81.C36769k;
import j81.C36770l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import jg1.C41438c;
import jg1.C41452l;
import l81.C37104a;
import p341ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity;
import p341ge.bog.mobilebank.eventbus.events.TemplatesAndConfigEvent;
import p341ge.bog.mobilebank.eventbus.events.TransferTemplatesEvent;
import p341ge.bog.mobilebank.model.CircularItemInterface;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.activities.AllTemplateListActivity */
public class AllTemplateListActivity extends C35439m implements C36769k {

    /* renamed from: G */
    protected Client f84745G;

    /* renamed from: H */
    protected C41438c f84746H;

    /* renamed from: I */
    private RecyclerView f84747I;

    /* renamed from: J */
    private C32276w f84748J;

    /* renamed from: K */
    private TemplatesAndConfigEvent f84749K;

    /* renamed from: L */
    private TransferTemplatesEvent f84750L;

    /* renamed from: M */
    private Runnable f84751M = new C35159a();

    /* renamed from: N */
    private Runnable f84752N = new C35160b();

    /* renamed from: O */
    C37104a f84753O = new C35162d();

    /* renamed from: P */
    C37104a f84754P = new C35163e();

    /* renamed from: ge.bog.mobilebank.ui.activities.AllTemplateListActivity$a */
    class C35159a implements Runnable {
        C35159a() {
        }

        public void run() {
            AllTemplateListActivity.this.f84745G.requestTemplatesWithConfig(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.AllTemplateListActivity$b */
    class C35160b implements Runnable {
        C35160b() {
        }

        public void run() {
            AllTemplateListActivity.this.f84745G.requestTransferTemplates(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.AllTemplateListActivity$c */
    class C35161c implements Comparator {
        C35161c() {
        }

        /* renamed from: a */
        public int compare(CircularItemInterface circularItemInterface, CircularItemInterface circularItemInterface2) {
            return circularItemInterface.getTemplateGroup().getGroupType().compareTo(circularItemInterface2.getTemplateGroup().getGroupType());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.AllTemplateListActivity$d */
    class C35162d implements C37104a {
        C35162d() {
        }

        /* renamed from: Z0 */
        public void mo48298Z0(int i) {
            if (i == 0) {
                C36546y.m108282F().mo27152s("all_templates", "payment", "select_template_type");
                Intent intent = new Intent(AllTemplateListActivity.this, ProviderListActivity.class);
                intent.putExtra("CREATE_NEW_TEMPLATE", true);
                AllTemplateListActivity.this.startActivity(intent);
            } else if (i == 1) {
                C36546y.m108282F().mo27152s("all_templates", "group_car", "select_template_type");
                Intent intent2 = new Intent(AllTemplateListActivity.this, CarTemplateGroupActivity.class);
                intent2.putExtra("NEW_TEMPLATE", true);
                AllTemplateListActivity.this.startActivity(intent2);
            } else {
                C36546y.m108282F().mo27152s("all_templates", "group_house", "select_template_type");
                Intent intent3 = new Intent(AllTemplateListActivity.this, HouseTemplateGroupActivity.class);
                intent3.putExtra("NEW_TEMPLATE", true);
                AllTemplateListActivity.this.startActivity(intent3);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.AllTemplateListActivity$e */
    class C35163e implements C37104a {
        C35163e() {
        }

        /* renamed from: Z0 */
        public void mo48298Z0(int i) {
            if (i == 0) {
                C36546y.m108282F().mo27152s("transfers", "own", "select_template_type");
                TransferForm.startWith((Activity) AllTemplateListActivity.this, TransferForm.MODULE_TEMPLATE, "CREATE").setTransferForm(TransferForm.TRANSFER_FORM_OWN).start();
            } else if (i == 2) {
                C36546y.m108282F().mo27152s("transfers", "treasury", "select_template_type");
                TransferForm.startWith((Activity) AllTemplateListActivity.this, TransferForm.MODULE_TEMPLATE, "CREATE").setTransferForm(TransferForm.TRANSFER_FORM_BUDGET).start();
            } else {
                C36546y.m108282F().mo27152s("transfers", "other", "select_template_type");
                TransferForm.startWith((Activity) AllTemplateListActivity.this, TransferForm.MODULE_TEMPLATE, "CREATE").setTransferForm(TransferForm.TRANSFER_FORM_OTHER).setWithinBank(true).start();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.AllTemplateListActivity$f */
    class C35164f implements View.OnClickListener {
        C35164f() {
        }

        public void onClick(View view) {
            C36546y.m108282F().mo27152s("all_templates", "create_template_dialog", "cancel");
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.AllTemplateListActivity$g */
    class C35165g implements View.OnClickListener {
        C35165g() {
        }

        public void onClick(View view) {
            C36546y.m108282F().mo27152s("all_templates", "create_template_dialog", "cancel");
        }
    }

    /* renamed from: E2 */
    private void m103286E2() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (this.f84749K.getTemplatesWithPaymentConfig().getTemplateGroups() != null) {
            Iterator<TemplateGroup> it = this.f84749K.getTemplatesWithPaymentConfig().getTemplateGroups().iterator();
            while (it.hasNext()) {
                TemplateGroup next = it.next();
                CircularItemInterface circularItemInterface = new CircularItemInterface();
                circularItemInterface.setTemplateGroup(next);
                arrayList.add(circularItemInterface);
                if (next.getTemplates() != null) {
                    for (TemplateBasketItem id : next.getTemplates()) {
                        hashSet.add(Long.valueOf(id.getId()));
                    }
                }
            }
        }
        Collections.sort(arrayList, new C35161c());
        if (this.f84749K.getTemplatesWithPaymentConfig().getTemplates() != null) {
            Iterator<TemplateBasketItem> it2 = this.f84749K.getTemplatesWithPaymentConfig().getTemplates().iterator();
            while (it2.hasNext()) {
                TemplateBasketItem next2 = it2.next();
                if (!hashSet.contains(Long.valueOf(next2.getId()))) {
                    CircularItemInterface circularItemInterface2 = new CircularItemInterface();
                    circularItemInterface2.setTemplateBasketItem(next2);
                    arrayList.add(circularItemInterface2);
                }
            }
        }
        this.f84748J.mo72800h0(3, arrayList, this.f84749K.getTemplatesWithPaymentConfig(), 20, this.f84751M);
    }

    /* renamed from: F2 */
    private void m103287F2() {
        ArrayList arrayList = new ArrayList();
        if (this.f84750L.getTemplates() != null) {
            Iterator<TemplateBasketItem> it = this.f84750L.getTemplates().iterator();
            while (it.hasNext()) {
                CircularItemInterface circularItemInterface = new CircularItemInterface();
                circularItemInterface.setTemplateBasketItem(it.next());
                arrayList.add(circularItemInterface);
            }
        }
        this.f84748J.mo72800h0(8, arrayList, (TemplateBasketItemsWithPaymentConfig) null, 20, this.f84752N);
    }

    /* renamed from: G2 */
    private void m103288G2(int i, long j) {
        Intent intent = new Intent(this, PaymentsTemplateListActivity.class);
        intent.putExtra("PAYMENT_TEMPLATE_LIST_TYPE_KEY", i);
        intent.putExtra("PAYMENT_TEMPLATE_LIST_GROUP_KEY", j);
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_all_templates_list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        this.f84747I = (RecyclerView) findViewById(C10322k.content_recycler_view);
        C32276w Z = C32276w.m95040Z(this, 0, this.f84745G, false, false, false, this, (C36770l) null, "all_templates");
        this.f84748J = Z;
        Z.mo90881m();
        this.f84747I.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f84747I.setAdapter(this.f84748J);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        if (r8.equals("B") == false) goto L_0x0066;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86061c(int r8, p341ge.bog.mobilebank.model.CircularItemInterface r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x01b1
            r0 = 0
            java.lang.String r1 = ""
            r2 = 3
            java.lang.String r3 = "click"
            java.lang.String r4 = "all_templates"
            if (r8 == r2) goto L_0x00ba
            r5 = 8
            if (r8 == r5) goto L_0x0012
            goto L_0x01b1
        L_0x0012:
            boolean r8 = r9.isAddItem()
            if (r8 == 0) goto L_0x004d
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = p366bk.C10328q.transfer_template_type_text_between_accs
            java.lang.String r9 = r7.getString(r9)
            r8.add(r9)
            int r9 = p366bk.C10328q.transfer_template_type_text_within_georgia
            java.lang.String r9 = r7.getString(r9)
            r8.add(r9)
            int r9 = p366bk.C10328q.transfer_template_type_text_budget
            java.lang.String r9 = r7.getString(r9)
            r8.add(r9)
            l81.a r9 = r7.f84754P
            ge.bog.mobilebank.ui.activities.AllTemplateListActivity$g r0 = new ge.bog.mobilebank.ui.activities.AllTemplateListActivity$g
            r0.<init>()
            r7.mo86445u2(r8, r9, r0)
            ck.g r8 = iu0.C36546y.m108282F()
            java.lang.String r9 = "transfer_template"
            r8.mo27152s(r4, r9, r3)
            goto L_0x01b1
        L_0x004d:
            ge.bog.mobilebank.model.template.TemplateBasketItem r8 = r9.getTemplateBasketItem()
            if (r8 == 0) goto L_0x01b1
            ge.bog.mobilebank.model.template.TemplateBasketItem r8 = r9.getTemplateBasketItem()
            java.lang.String r8 = r8.getTemplateType()
            r8.hashCode()
            int r5 = r8.hashCode()
            r6 = -1
            switch(r5) {
                case 66: goto L_0x0089;
                case 71: goto L_0x007e;
                case 77: goto L_0x0073;
                case 82: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            r0 = r6
            goto L_0x0092
        L_0x0068:
            java.lang.String r0 = "R"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0071
            goto L_0x0066
        L_0x0071:
            r0 = r2
            goto L_0x0092
        L_0x0073:
            java.lang.String r0 = "M"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x007c
            goto L_0x0066
        L_0x007c:
            r0 = 2
            goto L_0x0092
        L_0x007e:
            java.lang.String r0 = "G"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0087
            goto L_0x0066
        L_0x0087:
            r0 = 1
            goto L_0x0092
        L_0x0089:
            java.lang.String r2 = "B"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L_0x0092
            goto L_0x0066
        L_0x0092:
            switch(r0) {
                case 0: goto L_0x009c;
                case 1: goto L_0x009c;
                case 2: goto L_0x0099;
                case 3: goto L_0x0096;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x009e
        L_0x0096:
            java.lang.String r1 = "budget"
            goto L_0x009e
        L_0x0099:
            java.lang.String r1 = "own"
            goto L_0x009e
        L_0x009c:
            java.lang.String r1 = "other"
        L_0x009e:
            ck.g r8 = iu0.C36546y.m108282F()
            r8.mo27152s(r4, r1, r3)
            java.lang.String r8 = "TEMPLATE"
            java.lang.String r0 = "VIEW"
            ge.bog.mobilebank.transfers.model.TransferForm$I r8 = p341ge.bog.mobilebank.transfers.model.TransferForm.startWith((android.app.Activity) r7, (java.lang.String) r8, (java.lang.String) r0)
            ge.bog.mobilebank.model.template.TemplateBasketItem r9 = r9.getTemplateBasketItem()
            ge.bog.mobilebank.transfers.model.TransferForm$I r8 = r8.setTemplate(r9)
            r8.start()
            goto L_0x01b1
        L_0x00ba:
            boolean r8 = r9.isSumItem()
            if (r8 == 0) goto L_0x00d2
            ck.g r8 = iu0.C36546y.m108282F()
            java.lang.String r9 = "all_bills_due"
            r8.mo27152s(r4, r9, r3)
            r8 = 40
            r0 = -1
            r7.m103288G2(r8, r0)
            goto L_0x01b1
        L_0x00d2:
            boolean r8 = r9.isAddItem()
            if (r8 == 0) goto L_0x010d
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = p366bk.C10328q.templates_list_create_template_payment
            java.lang.String r9 = r7.getString(r9)
            r8.add(r9)
            int r9 = p366bk.C10328q.templates_list_create_template_car
            java.lang.String r9 = r7.getString(r9)
            r8.add(r9)
            int r9 = p366bk.C10328q.templates_list_create_template_house
            java.lang.String r9 = r7.getString(r9)
            r8.add(r9)
            l81.a r9 = r7.f84753O
            ge.bog.mobilebank.ui.activities.AllTemplateListActivity$f r0 = new ge.bog.mobilebank.ui.activities.AllTemplateListActivity$f
            r0.<init>()
            r7.mo86445u2(r8, r9, r0)
            ck.g r8 = iu0.C36546y.m108282F()
            java.lang.String r9 = "payment_template"
            r8.mo27152s(r4, r9, r3)
            goto L_0x01b1
        L_0x010d:
            ge.bog.mobilebank.model.template.TemplateBasketItem r8 = r9.getTemplateBasketItem()
            if (r8 == 0) goto L_0x015c
            ge.bog.mobilebank.model.template.TemplateBasketItem r8 = r9.getTemplateBasketItem()
            java.lang.String r8 = r8.getServiceId()
            ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r8 = r90.C27954d.m86301g(r8)
            if (r8 == 0) goto L_0x0131
            ge.bog.mobilebank.model.template.TemplateBasketItem r8 = r9.getTemplateBasketItem()
            java.lang.String r8 = r8.getServiceId()
            ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r8 = r90.C27954d.m86301g(r8)
            java.lang.String r1 = r8.getProviderName()
        L_0x0131:
            ck.g r8 = iu0.C36546y.m108282F()
            n41.c r2 = n41.C37353c.EN
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r0 = r90.C27950a.m86289f(r1, r2, r0)
            java.lang.String r1 = "open_template"
            r8.mo27152s(r4, r0, r1)
            ge.bog.mobilebank.payment.model.a$a r8 = p341ge.bog.mobilebank.payment.model.C33624a.m98713a(r7)
            java.lang.Class<ge.bog.mobilebank.payment.activities.TemplateFormActivity> r0 = p341ge.bog.mobilebank.payment.activities.TemplateFormActivity.class
            ge.bog.mobilebank.payment.model.a$a r8 = r8.mo79806f(r0)
            ge.bog.mobilebank.model.template.TemplateBasketItem r9 = r9.getTemplateBasketItem()
            long r0 = r9.getId()
            ge.bog.mobilebank.payment.model.a$a r8 = r8.mo79821u(r0)
            r8.mo79825y()
            goto L_0x01b1
        L_0x015c:
            ge.bog.mobilebank.model.template.TemplateGroup r8 = r9.getTemplateGroup()
            if (r8 == 0) goto L_0x01b1
            ge.bog.mobilebank.model.template.TemplateGroup r8 = r9.getTemplateGroup()
            java.lang.String r8 = r8.getGroupType()
            if (r8 == 0) goto L_0x018a
            ge.bog.mobilebank.model.template.TemplateGroup r8 = r9.getTemplateGroup()
            java.lang.String r8 = r8.getGroupType()
            java.lang.String r0 = "C"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x018a
            ge.bog.mobilebank.model.template.TemplateGroup r8 = r9.getTemplateGroup()
            long r8 = r8.getId()
            r0 = 30
            r7.m103288G2(r0, r8)
            goto L_0x01b1
        L_0x018a:
            ge.bog.mobilebank.model.template.TemplateGroup r8 = r9.getTemplateGroup()
            java.lang.String r8 = r8.getGroupType()
            if (r8 == 0) goto L_0x01b1
            ge.bog.mobilebank.model.template.TemplateGroup r8 = r9.getTemplateGroup()
            java.lang.String r8 = r8.getGroupType()
            java.lang.String r0 = "I"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x01b1
            ge.bog.mobilebank.model.template.TemplateGroup r8 = r9.getTemplateGroup()
            long r8 = r8.getId()
            r0 = 20
            r7.m103288G2(r0, r8)
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.AllTemplateListActivity.mo86061c(int, ge.bog.mobilebank.model.CircularItemInterface):void");
    }

    /* renamed from: e */
    public void mo86062e(int i) {
        if (i == 3) {
            startActivity(new Intent(this, TemplatesAndProvidersActivity.class));
        } else if (i == 8) {
            startActivity(new Intent(this, TransferTemplatesListActivity.class));
        }
    }

    @C41452l
    public void onCarDebtEvent(TemplateGroup templateGroup) {
        this.f84748J.mo72798c0(3, templateGroup);
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

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f84746H, this);
        this.f84751M.run();
        if (this.f84745G.isAuthorized()) {
            this.f84752N.run();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f84746H, this);
    }

    @C41452l
    public void onTemplateBasketItemChanged(TemplateBasketItem templateBasketItem) {
        this.f84748J.mo72798c0(3, templateBasketItem);
    }

    @C41452l
    public void onTemplatesWithConfigEvent(TemplatesAndConfigEvent templatesAndConfigEvent) {
        if (this.f84749K != templatesAndConfigEvent) {
            this.f84749K = templatesAndConfigEvent;
            int state = templatesAndConfigEvent.getState();
            if (state == 10) {
                this.f84748J.mo72800h0(3, (ArrayList) null, (TemplateBasketItemsWithPaymentConfig) null, 10, this.f84751M);
            } else if (state == 20) {
                m103286E2();
            } else if (state == 30) {
                this.f84748J.mo72800h0(3, (ArrayList) null, (TemplateBasketItemsWithPaymentConfig) null, 30, this.f84751M);
            } else if (state == 40) {
                this.f84748J.mo72800h0(3, (ArrayList) null, (TemplateBasketItemsWithPaymentConfig) null, 40, this.f84751M);
            }
        }
    }

    @C41452l
    public void onTransferTemplates(TransferTemplatesEvent transferTemplatesEvent) {
        if (this.f84750L != transferTemplatesEvent) {
            this.f84750L = transferTemplatesEvent;
            int state = transferTemplatesEvent.getState();
            if (state == 10) {
                this.f84748J.mo72800h0(8, (ArrayList) null, (TemplateBasketItemsWithPaymentConfig) null, 10, this.f84752N);
            } else if (state == 20) {
                m103287F2();
            } else if (state == 30) {
                this.f84748J.mo72800h0(8, (ArrayList) null, (TemplateBasketItemsWithPaymentConfig) null, 30, this.f84752N);
            } else if (state == 40) {
                this.f84748J.mo72800h0(8, (ArrayList) null, (TemplateBasketItemsWithPaymentConfig) null, 40, this.f84752N);
            }
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_templates);
    }
}
