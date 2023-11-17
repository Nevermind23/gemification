package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30559cc;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import g81.C32245l0;
import g91.C32343x;
import g91.C32359z0;
import iu0.C36546y;
import j81.C36772n;
import java.util.ArrayList;
import jg1.C41438c;
import jg1.C41452l;
import l81.C37104a;
import p341ge.bog.mobilebank.eventbus.events.TransferDeleteTemplateEvent;
import p341ge.bog.mobilebank.eventbus.events.TransferTemplatesEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.activities.TransferTemplatesListActivity */
public class TransferTemplatesListActivity extends C35501r0 implements C36772n {

    /* renamed from: G */
    protected Client f85592G;

    /* renamed from: H */
    protected C41438c f85593H;

    /* renamed from: I */
    protected PreferencesApiManager f85594I;

    /* renamed from: J */
    private SwipeRefreshLayout f85595J;

    /* renamed from: K */
    private RecyclerView f85596K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C32245l0 f85597L;

    /* renamed from: M */
    private TransferTemplatesEvent f85598M;

    /* renamed from: N */
    C37104a f85599N = new C35338b();

    /* renamed from: ge.bog.mobilebank.ui.activities.TransferTemplatesListActivity$a */
    class C35337a implements SwipeRefreshLayout.C1862j {
        C35337a() {
        }

        /* renamed from: v */
        public void mo6203v() {
            TransferTemplatesListActivity.this.f85597L.mo72763j();
            TransferTemplatesListActivity.this.f85592G.requestTransferTemplates(true);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.TransferTemplatesListActivity$b */
    class C35338b implements C37104a {
        C35338b() {
        }

        /* renamed from: Z0 */
        public void mo48298Z0(int i) {
            if (i == 0) {
                C36546y.m108282F().mo27152s("transfers_templates", "own_account", "select_template_type");
                TransferForm.startWith((Activity) TransferTemplatesListActivity.this, TransferForm.MODULE_TEMPLATE, "CREATE").setTransferForm(TransferForm.TRANSFER_FORM_OWN).start();
            } else if (i == 2) {
                C36546y.m108282F().mo27152s("transfers_templates", "treasury", "select_template_type");
                TransferForm.startWith((Activity) TransferTemplatesListActivity.this, TransferForm.MODULE_TEMPLATE, "CREATE").setTransferForm(TransferForm.TRANSFER_FORM_BUDGET).start();
            } else {
                C36546y.m108282F().mo27152s("transfers_templates", "other", "select_template_type");
                TransferForm.startWith((Activity) TransferTemplatesListActivity.this, TransferForm.MODULE_TEMPLATE, "CREATE").setTransferForm(TransferForm.TRANSFER_FORM_OTHER).setWithinBank(true).start();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.TransferTemplatesListActivity$c */
    class C35339c implements View.OnClickListener {
        C35339c() {
        }

        public void onClick(View view) {
            C36546y.m108282F().mo27152s("transfers_templates", "create_template_dialog", "cancel");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void m104915G2(TemplateBasketItem templateBasketItem) {
        this.f85592G.deleteTransferTemplate(true, templateBasketItem.getId());
    }

    /* renamed from: G */
    public void mo86321G(TemplateBasketItem templateBasketItem) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_transfer_templates;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        this.f85595J = (SwipeRefreshLayout) findViewById(C10322k.f28739Gw);
        this.f85596K = (RecyclerView) findViewById(C10322k.f28712Br);
        C36546y.m108282F().mo27138I("transfer_templates");
        this.f85597L = new C32245l0(this, this);
        this.f85596K.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f85596K.setAdapter(this.f85597L);
        C32359z0.m95582n(this.f85596K, "SCREEN_TYPE_TRANSFER_TEMPLATES_TIPPER", this.f85594I);
        this.f85595J.setEnabled(true);
        this.f85595J.setDistanceToTriggerSync(((int) (getResources().getDisplayMetrics().density * 64.0f)) * 3);
        this.f85595J.setOnRefreshListener(new C35337a());
    }

    /* renamed from: T */
    public void mo86323T(TemplateBasketItem templateBasketItem) {
        String str;
        if (templateBasketItem != null) {
            String templateType = templateBasketItem.getTemplateType();
            templateType.hashCode();
            char c = 65535;
            switch (templateType.hashCode()) {
                case 66:
                    if (templateType.equals("B")) {
                        c = 0;
                        break;
                    }
                    break;
                case 71:
                    if (templateType.equals("G")) {
                        c = 1;
                        break;
                    }
                    break;
                case 77:
                    if (templateType.equals("M")) {
                        c = 2;
                        break;
                    }
                    break;
                case 82:
                    if (templateType.equals("R")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    str = "other";
                    break;
                case 2:
                    str = "own";
                    break;
                case 3:
                    str = "budget";
                    break;
                default:
                    str = "";
                    break;
            }
            C36546y.m108282F().mo27152s("transfers_templates", str, "click");
            TransferForm.startWith((Activity) this, TransferForm.MODULE_TEMPLATE, TransferForm.OPERATION_VIEW).setTemplate(templateBasketItem).start();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(C10328q.transfer_template_type_text_between_accs));
        arrayList.add(getString(C10328q.transfer_template_type_text_within_georgia));
        arrayList.add(getString(C10328q.transfer_template_type_text_budget));
        mo86445u2(arrayList, this.f85599N, new C35339c());
        C36546y.m108282F().mo27152s("transfers_templates", "create_template", "click");
    }

    /* renamed from: a */
    public void mo86324a(TemplateBasketItem templateBasketItem, int i) {
        if (i == 2) {
            C36546y.m108282F().mo27152s("transfers_templates", "edit", "swipe_menu_click");
            TransferForm.startWith((Activity) this, TransferForm.MODULE_TEMPLATE, TransferForm.OPERATION_EDIT).setTemplate(templateBasketItem).start();
        } else if (i == 3) {
            C36546y.m108282F().mo27152s("transfers_templates", "delete", "swipe_menu_click");
            mo86440m2(new C30559cc(this, templateBasketItem));
        } else if (i == 4) {
            C36546y.m108282F().mo27152s("transfers_templates", "automatic_services", "swipe_menu_click");
            TransferForm.startWith((Activity) this, "STO", "CREATE").setTemplate(templateBasketItem).start();
        }
    }

    /* renamed from: n */
    public void mo86325n() {
    }

    @C41452l
    public void onDeleteTemplateEvent(TransferDeleteTemplateEvent transferDeleteTemplateEvent) {
        if (transferDeleteTemplateEvent.getState() == 10) {
            this.f85595J.setRefreshing(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f85593H, this);
        this.f85592G.requestTransferTemplates(false);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f85593H, this);
    }

    @C41452l
    public void onTransferTemplates(TransferTemplatesEvent transferTemplatesEvent) {
        if (this.f85598M != transferTemplatesEvent) {
            this.f85598M = transferTemplatesEvent;
            int state = transferTemplatesEvent.getState();
            if (state == 10) {
                this.f85595J.setRefreshing(true);
                this.f85597L.mo72763j();
            } else if (state == 20) {
                this.f85595J.setRefreshing(false);
                this.f85597L.mo72764m(transferTemplatesEvent.getTemplates());
            } else if (state == 30) {
                this.f85595J.setRefreshing(false);
                this.f85597L.mo72763j();
            } else if (state == 40) {
                this.f85595J.setRefreshing(false);
                this.f85597L.mo72763j();
            }
        }
    }
}
