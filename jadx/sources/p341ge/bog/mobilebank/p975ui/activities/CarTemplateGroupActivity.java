package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30602g;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.C0767a;
import g91.C32289b0;
import g91.C32290b1;
import g91.C32297d;
import g91.C32343x;
import java.io.File;
import java.util.ArrayList;
import jg1.C41438c;
import jg1.C41452l;
import p341ge.bog.mobilebank.eventbus.events.CTPark6MonthsEvent;
import p341ge.bog.mobilebank.eventbus.events.CTParkPenaltiesEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyTemplateGroupEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.model.template.TemplateGroupComment;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.BasicWizardActivity;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.rest.BankApi;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10328q;
import p90.C27406r;
import q81.C38163b;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.CarTemplateGroupActivity */
public class CarTemplateGroupActivity extends C35445n implements View.OnClickListener {

    /* renamed from: G */
    protected Client f84762G;

    /* renamed from: H */
    protected C41438c f84763H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C27406r f84764I;

    /* renamed from: J */
    private TemplateGroupComment f84765J;

    /* renamed from: K */
    private TemplateGroupComment f84766K;

    /* renamed from: L */
    private ModifyTemplateGroupEvent f84767L;

    /* renamed from: M */
    private boolean f84768M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public TemplateGroup f84769N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C38163b f84770O = null;

    /* renamed from: P */
    private View.OnClickListener f84771P = new C35166a();

    /* renamed from: Q */
    private ArrayList f84772Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public File f84773R;

    /* renamed from: S */
    private long f84774S;

    /* renamed from: ge.bog.mobilebank.ui.activities.CarTemplateGroupActivity$a */
    class C35166a implements View.OnClickListener {
        C35166a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m103315c() {
            CarTemplateGroupActivity.this.f84773R = null;
            TextTypeView textTypeView = CarTemplateGroupActivity.this.f84764I.f69635m;
            File H2 = CarTemplateGroupActivity.this.f84773R;
            int i = C10320i.ic_upload_image;
            textTypeView.loadRightPhotoFromFile(H2, i, i);
            CarTemplateGroupActivity.this.f84764I.f69635m.setTitleText(CarTemplateGroupActivity.this.getString(C10328q.common_text_upload_image));
            CarTemplateGroupActivity.this.f84769N.setOperationKey(BankApi.OPERATION_KEY_REMOVE_IMAGE);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m103316d(DialogInterface dialogInterface) {
            CarTemplateGroupActivity.this.f84770O = null;
        }

        public void onClick(View view) {
            if (CarTemplateGroupActivity.this.f84769N == null) {
                return;
            }
            if (CarTemplateGroupActivity.this.f84769N.getGroupImage() == null && CarTemplateGroupActivity.this.f84773R == null) {
                CarTemplateGroupActivity.this.f84770O = new C38163b(CarTemplateGroupActivity.this);
                CarTemplateGroupActivity.this.f84770O.show();
                return;
            }
            CarTemplateGroupActivity.this.f84770O = new C38163b(CarTemplateGroupActivity.this, new int[]{1, 2, 3});
            CarTemplateGroupActivity.this.f84770O.mo91690j(new Runnable[]{null, new C35374d(this)});
            CarTemplateGroupActivity.this.f84770O.setOnDismissListener(new C35379e(this));
            CarTemplateGroupActivity.this.f84770O.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m103297C2(View view) {
        m103307N2();
    }

    /* renamed from: L2 */
    private void m103305L2(boolean z) {
        findViewById(C10322k.payment_wizard_progressbar).setVisibility(z ? 0 : 8);
    }

    /* renamed from: M2 */
    private ArrayList m103306M2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WizardObject().setInputStyle(1).setInputTitle(getString(C10328q.template_group_title_name)).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS).setValue(this.f84764I.f69629g.getValueText()));
        arrayList.add(new WizardObject().setInputStyle(1).setInputTitle(getString(C10328q.template_group_title_car_num)).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS).setValue(this.f84764I.f69627e.getValueText()));
        arrayList.add(new WizardObject().setInputStyle(1).setInputTitle(getString(C10328q.template_group_title_personal_number)).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS).setValue(this.f84764I.f69632j.getValueText()));
        return arrayList;
    }

    /* renamed from: N2 */
    private void m103307N2() {
        m103310Q2();
        this.f84768M = true;
        setResult(-1);
        if (TextUtils.isEmpty(this.f84769N.getGroupName())) {
            this.f84769N.setGroupName(getString(C10328q.template_group_my_car));
        }
        if (this.f84769N.getId() == 0) {
            this.f84769N.setOperationKey("CREATE");
        }
        this.f84762G.modifyTemplateGroup(true, this.f84769N, this.f84773R);
    }

    /* renamed from: O2 */
    private void m103308O2() {
        int c = C0767a.m2893c(this, C10318g.f28632T0);
        this.f84764I.f69635m.setUnderLineColor(c);
        this.f84764I.f69629g.setUnderLineColor(c);
        this.f84764I.f69627e.setUnderLineColor(c);
        this.f84764I.f69632j.setUnderLineColor(c);
    }

    /* renamed from: P2 */
    private void m103309P2(TemplateGroup templateGroup, String str, String str2) {
        int i;
        if (templateGroup.getComments() != null) {
            for (TemplateGroupComment next : templateGroup.getComments()) {
                if (next.getCommentType().equals(PensionStatusResult.STATUS_ACTIVE)) {
                    this.f84765J = next;
                } else if (next.getCommentType().equals("C")) {
                    this.f84766K = next;
                }
            }
        } else if (!(this.f84774S != -1 || this.f84762G.getUserInfo() == null || this.f84762G.getUserInfo().getClient() == null)) {
            this.f84764I.f69632j.setValueText(this.f84762G.getUserInfo().getClient().pin);
        }
        TextTypeView textTypeView = this.f84764I.f69635m;
        String e = C32289b0.m95093e(this.f84769N.getGroupImage());
        int i2 = C10320i.ic_upload_image;
        textTypeView.loadRightPhotoFromURL(e, i2, i2);
        TextTypeView textTypeView2 = this.f84764I.f69635m;
        if (this.f84769N.getGroupImage() == null) {
            i = C10328q.common_text_upload_image;
        } else {
            i = C10328q.common_text_change_photo;
        }
        textTypeView2.setTitleText(getString(i));
        this.f84764I.f69635m.setOnClickListener(this.f84771P);
        this.f84764I.f69635m.setIconClickListener(this.f84771P);
        String groupName = templateGroup.getGroupName();
        if (!TextUtils.isEmpty(groupName)) {
            this.f84764I.f69629g.setValueText(groupName);
        }
        TemplateGroupComment templateGroupComment = this.f84765J;
        if (templateGroupComment != null && !TextUtils.isEmpty(templateGroupComment.getComment())) {
            this.f84764I.f69627e.setValueText(this.f84765J.getComment());
        } else if (!TextUtils.isEmpty(str)) {
            this.f84764I.f69627e.setValueText(str);
        }
        TemplateGroupComment templateGroupComment2 = this.f84766K;
        if (templateGroupComment2 != null && !TextUtils.isEmpty(templateGroupComment2.getComment())) {
            this.f84764I.f69632j.setValueText(this.f84766K.getComment());
        } else if (!TextUtils.isEmpty(str2)) {
            this.f84764I.f69632j.setValueText(str2);
        }
    }

    /* renamed from: Q2 */
    private void m103310Q2() {
        String valueText = this.f84764I.f69629g.getValueText();
        String valueText2 = this.f84764I.f69627e.getValueText();
        String valueText3 = this.f84764I.f69632j.getValueText();
        this.f84769N.setGroupName(valueText);
        TemplateGroupComment templateGroupComment = this.f84765J;
        if (templateGroupComment != null) {
            templateGroupComment.setComment(valueText2);
        } else {
            TemplateGroupComment templateGroupComment2 = new TemplateGroupComment();
            this.f84765J = templateGroupComment2;
            templateGroupComment2.setComment(valueText2);
            this.f84765J.setCommentType(PensionStatusResult.STATUS_ACTIVE);
        }
        TemplateGroupComment templateGroupComment3 = this.f84766K;
        if (templateGroupComment3 != null) {
            templateGroupComment3.setComment(valueText3);
        } else {
            TemplateGroupComment templateGroupComment4 = new TemplateGroupComment();
            this.f84766K = templateGroupComment4;
            templateGroupComment4.setComment(valueText3);
            this.f84766K.setCommentType("C");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f84765J);
        arrayList.add(this.f84766K);
        this.f84769N.setComments(arrayList);
    }

    /* renamed from: R2 */
    private void m103311R2() {
        this.f84764I.f69629g.setValueText((String) this.f84772Q.get(0));
        this.f84764I.f69627e.setValueText((String) this.f84772Q.get(1));
        this.f84764I.f69632j.setValueText((String) this.f84772Q.get(2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27406r d = C27406r.m84927d(getLayoutInflater());
        this.f84764I = d;
        super.mo70996D2(bundle, d);
        this.f84774S = getIntent().getLongExtra("TEMPLATE_GROUP_ITEM_ID", -1);
        TemplateGroup templateGroup = new TemplateGroup();
        this.f84769N = templateGroup;
        templateGroup.setGroupType("C");
        this.f84764I.f69634l.setOnClickListener(new C30602g(this));
        long j = this.f84774S;
        if (j != -1) {
            TemplateGroup templateGroupById = this.f84762G.getTemplateGroupById(j);
            if (templateGroupById != null) {
                this.f84769N.setCtPark6MonthsEvent(templateGroupById.getCtPark6MonthsEvent());
                this.f84769N.setCtParkPenaltiesEvent(templateGroupById.getCtParkPenaltiesEvent());
                this.f84769N.setId(this.f84774S);
                this.f84769N.setChannel(templateGroupById.getChannel());
                this.f84769N.setComments(templateGroupById.getComments());
                this.f84769N.setCustomerId(templateGroupById.getCustomerId());
                this.f84769N.setGroupImage(templateGroupById.getGroupImage());
                this.f84769N.setGroupName(templateGroupById.getGroupName());
                this.f84769N.setGroupOrder(templateGroupById.getGroupOrder());
                this.f84769N.setStatus(templateGroupById.getStatus());
                this.f84769N.setTemplates(templateGroupById.getTemplates());
            }
        } else {
            this.f84764I.f69630h.setText(getString(C10328q.templates_button_text_add_group));
            this.f84769N.setCtParkPenaltiesEvent(new CTParkPenaltiesEvent());
            this.f84769N.setCtPark6MonthsEvent(new CTPark6MonthsEvent());
        }
        if (TextUtils.isEmpty(this.f84769N.getGroupName())) {
            this.f84769N.setGroupName(getString(C10328q.template_group_my_car));
        }
        m103309P2(this.f84769N, getIntent().getStringExtra("CAR_NO"), getIntent().getStringExtra("PIN"));
        this.f84764I.f69634l.setOrange(true);
        this.f84764I.f69629g.setOnClickListener(this);
        this.f84764I.f69627e.setOnClickListener(this);
        this.f84764I.f69632j.setOnClickListener(this);
        m103308O2();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 139 || i == 140) {
                C38163b bVar = this.f84770O;
                if (bVar != null) {
                    bVar.mo91683c(i, intent);
                }
            } else if (i == 10001) {
                this.f84772Q = intent.getStringArrayListExtra("WIZARD_COLLECTED_VALUES");
                m103311R2();
            } else if (i == 10002) {
                String stringExtra = intent.getStringExtra("CROPPED_PATH");
                m103310Q2();
                setResult(-1);
                File file = new File(stringExtra);
                this.f84773R = file;
                TextTypeView textTypeView = this.f84764I.f69635m;
                int i3 = C10320i.ic_upload_image;
                textTypeView.loadRightPhotoFromFile(file, i3, i3);
                this.f84764I.f69635m.setTitleText(getString(C10328q.common_text_change_photo));
                this.f84769N.setOperationKey((String) null);
            }
        }
    }

    public void onClick(View view) {
        ArrayList M2 = m103306M2();
        Rect i = C32290b1.m95119i((TextTypeView) view.getTag());
        int i2 = 0;
        if (view != this.f84764I.f69629g.getViewSelector()) {
            if (view == this.f84764I.f69627e.getViewSelector()) {
                i2 = 1;
            } else if (view == this.f84764I.f69632j.getViewSelector()) {
                i2 = 2;
            }
        }
        BasicWizardActivity.m106444G3(this, M2, i2, i.top);
    }

    @C41452l
    public void onModifyTemplateGroupEvent(ModifyTemplateGroupEvent modifyTemplateGroupEvent) {
        if (this.f84769N.getId() == 0 || modifyTemplateGroupEvent.getTemplateGroup().getId() == this.f84769N.getId()) {
            this.f84767L = modifyTemplateGroupEvent;
            int state = modifyTemplateGroupEvent.getState();
            if (state == 10) {
                m103305L2(true);
            } else if (state == 20) {
                this.f84768M = false;
                this.f84769N = modifyTemplateGroupEvent.getTemplateGroup();
                m103309P2(this.f84767L.getTemplateGroup(), (String) null, (String) null);
                m103305L2(false);
                C32297d.m95160h(this, getString(C10328q.f28956f2));
                finish();
            } else if (state == 30) {
                this.f84768M = false;
                m103305L2(false);
            } else if (state == 40) {
                this.f84768M = false;
                m103305L2(false);
                C32297d.m95154b(this, C27950a.m86284a(modifyTemplateGroupEvent.getErrorKey()));
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C38163b bVar = this.f84770O;
        if (bVar != null) {
            bVar.mo91684d(i);
        }
    }

    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f84763H, this);
        if (this.f84768M) {
            this.f84762G.modifyTemplateGroup(false, this.f84769N, (File) null);
        }
    }

    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f84763H, this);
    }
}
