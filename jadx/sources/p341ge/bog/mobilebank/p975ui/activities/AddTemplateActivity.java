package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30518a;
import a81.C30532b;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import g81.C32144e;
import g91.C32343x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg1.C41438c;
import jg1.C41452l;
import l81.C37104a;
import p341ge.bog.mobilebank.eventbus.events.ModifyTemplateGroupLinkEvent;
import p341ge.bog.mobilebank.eventbus.events.TemplatesAndConfigEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p366bk.C10313b;
import p366bk.C10328q;
import p90.C27333j;

/* renamed from: ge.bog.mobilebank.ui.activities.AddTemplateActivity */
public class AddTemplateActivity extends C35433l implements C37104a {

    /* renamed from: G */
    protected Client f84734G;

    /* renamed from: H */
    protected C41438c f84735H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C27333j f84736I;

    /* renamed from: J */
    private ModifyTemplateGroupLinkEvent f84737J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C32144e f84738K;

    /* renamed from: L */
    private TemplatesAndConfigEvent f84739L;

    /* renamed from: M */
    private long f84740M;

    /* renamed from: N */
    private String f84741N;

    /* renamed from: O */
    private boolean f84742O;

    /* renamed from: P */
    private List f84743P;

    /* renamed from: ge.bog.mobilebank.ui.activities.AddTemplateActivity$a */
    class C35158a implements View.OnClickListener {
        C35158a() {
        }

        public void onClick(View view) {
            if (!AddTemplateActivity.this.f84738K.mo72647m()) {
                AddTemplateActivity.this.f84738K.mo72651q();
                AddTemplateActivity.this.f84736I.f69006g.setText(AddTemplateActivity.this.getResources().getString(C10328q.template_add_unmark_all));
            } else {
                AddTemplateActivity.this.f84738K.mo72654t();
                AddTemplateActivity.this.f84736I.f69006g.setText(AddTemplateActivity.this.getResources().getString(C10328q.template_add_mark_all));
            }
            if (AddTemplateActivity.this.f84738K.mo72646l()) {
                AddTemplateActivity.this.f84736I.f69004e.setOrange(true, true);
            } else {
                AddTemplateActivity.this.f84736I.f69004e.setOrange(false, false);
            }
            AddTemplateActivity.this.f84738K.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m103273C2(View view) {
        m103278I2();
    }

    /* renamed from: I2 */
    private void m103278I2() {
        if (this.f84736I.f69004e.isOrange()) {
            this.f84742O = true;
            this.f84734G.requestModifyTemplateGroupLink(true, mo86057J2(), this.f84740M, "CREATE");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public /* synthetic */ void m103279K2(View view) {
        m103280L2();
    }

    /* renamed from: L2 */
    private void m103280L2() {
        if (this.f84736I.f69009j.mo3946b().getVisibility() != 0) {
            Intent intent = new Intent(this, ProviderListActivity.class);
            intent.putExtra("CREATE_NEW_TEMPLATE", true);
            intent.putExtra("TEMPLATE_GROUP_ID", this.f84740M);
            intent.putExtra("FINISH_AFTER_CREATE_TEMPLATE", true);
            startActivityForResult(intent, 0);
        }
    }

    /* renamed from: M2 */
    private void m103281M2() {
        this.f84736I.f69007h.setVisibility(4);
        this.f84736I.f69009j.mo3946b().setVisibility(0);
        this.f84736I.f69009j.mo3946b().startAnimation(AnimationUtils.loadAnimation(this, C10313b.infinite_alpha));
    }

    /* renamed from: N2 */
    private void m103282N2() {
        this.f84736I.f69007h.setVisibility(0);
        this.f84736I.f69009j.mo3946b().setVisibility(8);
        this.f84736I.f69009j.mo3946b().clearAnimation();
    }

    /* renamed from: J2 */
    public String mo86057J2() {
        Iterator it = this.f84738K.mo72648n().iterator();
        String str = "";
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (!str.isEmpty()) {
                str = str + ",";
            }
            str = str + ((TemplateBasketItem) this.f84743P.get(intValue)).getId();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27333j d = C27333j.m84641d(getLayoutInflater());
        this.f84736I = d;
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        this.f84736I.f69004e.setOnClickListener(new C30518a(this));
        this.f84736I.f69005f.setOnClickListener(new C30532b(this));
        this.f84736I.f69007h.setLayoutManager(new LinearLayoutManager(this));
        C32144e eVar = new C32144e(this.f84734G);
        this.f84738K = eVar;
        eVar.mo72652r(this);
        this.f84736I.f69007h.setAdapter(this.f84738K);
        this.f84740M = getIntent().getLongExtra("TEMPLATE_GROUP_ID", -1);
        this.f84736I.f69006g.setOnClickListener(new C35158a());
    }

    /* renamed from: Z0 */
    public void mo48298Z0(int i) {
        if (this.f84738K.mo72646l()) {
            this.f84736I.f69004e.setOrange(true, true);
        } else {
            this.f84736I.f69004e.setOrange(false, false);
        }
        if (this.f84738K.mo72647m()) {
            this.f84736I.f69006g.setText(getResources().getString(C10328q.template_add_unmark_all));
        } else {
            this.f84736I.f69006g.setText(getResources().getString(C10328q.template_add_mark_all));
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            setResult(-1);
            this.f84741N = intent.getStringExtra("TEMPLATE_ITEM_ID");
            m103281M2();
            this.f84734G.requestTemplatesWithConfig(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f84735H, this);
        this.f84734G.requestTemplatesWithConfig(false);
        if (this.f84742O) {
            this.f84734G.requestModifyTemplateGroupLink(false, mo86057J2(), this.f84740M, "CREATE");
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f84735H, this);
    }

    @C41452l
    public void onTemplateAddEvent(ModifyTemplateGroupLinkEvent modifyTemplateGroupLinkEvent) {
        if (this.f84737J != modifyTemplateGroupLinkEvent) {
            this.f84737J = modifyTemplateGroupLinkEvent;
            int state = modifyTemplateGroupLinkEvent.getState();
            if (state == 10) {
                m103281M2();
            } else if (state == 20) {
                this.f84734G.setModifyTemplateGroupLinkEvent((ModifyTemplateGroupLinkEvent) null);
                m103282N2();
                setResult(-1);
                finish();
            }
        }
    }

    @C41452l
    public void onTemplatesWithConfigEvent(TemplatesAndConfigEvent templatesAndConfigEvent) {
        if (this.f84739L != templatesAndConfigEvent) {
            this.f84739L = templatesAndConfigEvent;
            int state = templatesAndConfigEvent.getState();
            if (state == 10) {
                m103281M2();
            } else if (state == 20) {
                if (this.f84741N != null) {
                    finish();
                    return;
                }
                m103282N2();
                ArrayList arrayList = new ArrayList();
                this.f84743P = arrayList;
                arrayList.addAll(templatesAndConfigEvent.getTemplatesWithPaymentConfig().getTemplates());
                List<TemplateBasketItem> templates = this.f84734G.getTemplateGroupById(this.f84740M).getTemplates();
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                for (int i2 = 0; i2 < this.f84743P.size(); i2++) {
                    for (int i3 = 0; i3 < templates.size(); i3++) {
                        if (((TemplateBasketItem) this.f84743P.get(i2)).getId() == templates.get(i3).getId()) {
                            arrayList2.add((TemplateBasketItem) this.f84743P.get(i2));
                        }
                    }
                }
                this.f84743P.removeAll(arrayList2);
                while (true) {
                    if (i >= this.f84743P.size()) {
                        i = -1;
                        break;
                    } else if (String.valueOf(((TemplateBasketItem) this.f84743P.get(i)).getId()).equals(this.f84741N)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    this.f84736I.f69004e.setOrange(true, true);
                }
                this.f84738K.mo72648n().clear();
                this.f84738K.mo72653s(this.f84743P);
                if (i != -1) {
                    this.f84738K.mo72648n().add(Integer.valueOf(i));
                }
                this.f84738K.notifyDataSetChanged();
                if (i != -1) {
                    this.f84736I.f69007h.mo5263G1(i);
                }
                this.f84741N = null;
            }
        }
    }
}
