package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30548c1;
import android.app.Activity;
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
import p366bk.C10328q;
import p90.C27314h0;
import q81.C38163b;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.HouseTemplateGroupActivity */
public class HouseTemplateGroupActivity extends C35504s implements View.OnClickListener {

    /* renamed from: G */
    protected Client f84862G;

    /* renamed from: H */
    protected C41438c f84863H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C27314h0 f84864I;

    /* renamed from: J */
    private TemplateGroupComment f84865J;

    /* renamed from: K */
    private TemplateGroupComment f84866K;

    /* renamed from: L */
    private ModifyTemplateGroupEvent f84867L;

    /* renamed from: M */
    private boolean f84868M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public TemplateGroup f84869N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public Activity f84870O = this;

    /* renamed from: P */
    private ArrayList f84871P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C38163b f84872Q = null;

    /* renamed from: R */
    private View.OnClickListener f84873R = new C35189a();
    /* access modifiers changed from: private */

    /* renamed from: S */
    public File f84874S;

    /* renamed from: ge.bog.mobilebank.ui.activities.HouseTemplateGroupActivity$a */
    class C35189a implements View.OnClickListener {
        C35189a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m103591c() {
            HouseTemplateGroupActivity.this.f84874S = null;
            TextTypeView textTypeView = HouseTemplateGroupActivity.this.f84864I.f68852m;
            File I2 = HouseTemplateGroupActivity.this.f84874S;
            int i = C10320i.ic_upload_image;
            textTypeView.loadRightPhotoFromFile(I2, i, i);
            HouseTemplateGroupActivity.this.f84864I.f68852m.setTitleText(HouseTemplateGroupActivity.this.getString(C10328q.common_text_upload_image));
            HouseTemplateGroupActivity.this.f84869N.setOperationKey(BankApi.OPERATION_KEY_REMOVE_IMAGE);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m103592d(DialogInterface dialogInterface) {
            HouseTemplateGroupActivity.this.f84872Q = null;
        }

        public void onClick(View view) {
            if (HouseTemplateGroupActivity.this.f84869N == null) {
                return;
            }
            if (HouseTemplateGroupActivity.this.f84869N.getGroupImage() == null && HouseTemplateGroupActivity.this.f84874S == null) {
                HouseTemplateGroupActivity.this.f84872Q = new C38163b(HouseTemplateGroupActivity.this.f84870O);
                HouseTemplateGroupActivity.this.f84872Q.show();
                return;
            }
            HouseTemplateGroupActivity.this.f84872Q = new C38163b(HouseTemplateGroupActivity.this.f84870O, new int[]{1, 2, 3});
            HouseTemplateGroupActivity.this.f84872Q.mo91690j(new Runnable[]{null, new C35516u0(this)});
            HouseTemplateGroupActivity.this.f84872Q.setOnDismissListener(new C35520v0(this));
            HouseTemplateGroupActivity.this.f84872Q.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m103572C2(View view) {
        m103583O2();
    }

    /* renamed from: M2 */
    private void m103581M2(boolean z) {
        this.f84864I.f68849j.setVisibility(z ? 0 : 8);
    }

    /* renamed from: N2 */
    private ArrayList m103582N2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WizardObject().setInputStyle(1).setInputTitle(getString(C10328q.template_group_title_name)).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS).setValue(this.f84864I.f68847h.getValueText()));
        arrayList.add(new WizardObject().setInputStyle(1).setInputTitle(getString(C10328q.f28921B1)).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS).setValue(this.f84864I.f68844e.getValueText()));
        arrayList.add(new WizardObject().setInputStyle(1).setInputTitle(getString(C10328q.template_group_title_flat)).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS).setValue(this.f84864I.f68845f.getValueText()));
        return arrayList;
    }

    /* renamed from: O2 */
    private void m103583O2() {
        m103586R2();
        this.f84868M = true;
        setResult(-1);
        if (TextUtils.isEmpty(this.f84869N.getGroupName())) {
            this.f84869N.setGroupName(getString(C10328q.template_group_my_house));
        }
        if (this.f84869N.getId() == 0) {
            this.f84869N.setOperationKey("CREATE");
        }
        this.f84862G.modifyTemplateGroup(true, this.f84869N, this.f84874S);
    }

    /* renamed from: P2 */
    private void m103584P2() {
        int c = C0767a.m2893c(this, C10318g.f28632T0);
        this.f84864I.f68852m.setUnderLineColor(c);
        this.f84864I.f68847h.setUnderLineColor(c);
        this.f84864I.f68844e.setUnderLineColor(c);
        this.f84864I.f68845f.setUnderLineColor(c);
    }

    /* renamed from: Q2 */
    private void m103585Q2(TemplateGroup templateGroup) {
        int i;
        String groupName = templateGroup.getGroupName();
        this.f84865J = null;
        this.f84866K = null;
        if (this.f84869N.getComments() != null) {
            for (TemplateGroupComment next : this.f84869N.getComments()) {
                if (next.getCommentType().equals(PensionStatusResult.STATUS_ACTIVE)) {
                    this.f84865J = next;
                } else if (next.getCommentType().equals("B")) {
                    this.f84866K = next;
                }
            }
        }
        TextTypeView textTypeView = this.f84864I.f68852m;
        String e = C32289b0.m95093e(this.f84869N.getGroupImage());
        int i2 = C10320i.ic_upload_image;
        textTypeView.loadRightPhotoFromURL(e, i2, i2);
        TextTypeView textTypeView2 = this.f84864I.f68852m;
        if (this.f84869N.getGroupImage() == null) {
            i = C10328q.common_text_upload_image;
        } else {
            i = C10328q.common_text_change_photo;
        }
        textTypeView2.setTitleText(getString(i));
        this.f84864I.f68852m.setOnClickListener(this.f84873R);
        this.f84864I.f68852m.setIconClickListener(this.f84873R);
        if (!TextUtils.isEmpty(groupName)) {
            this.f84864I.f68847h.setValueText(groupName);
        }
        TemplateGroupComment templateGroupComment = this.f84865J;
        if (templateGroupComment != null && !TextUtils.isEmpty(templateGroupComment.getComment())) {
            this.f84864I.f68844e.setValueText(this.f84865J.getComment());
        }
        TemplateGroupComment templateGroupComment2 = this.f84866K;
        if (templateGroupComment2 != null && !TextUtils.isEmpty(templateGroupComment2.getComment())) {
            this.f84864I.f68845f.setValueText(this.f84866K.getComment());
        }
    }

    /* renamed from: R2 */
    private void m103586R2() {
        String valueText = this.f84864I.f68847h.getValueText();
        String valueText2 = this.f84864I.f68844e.getValueText();
        String valueText3 = this.f84864I.f68845f.getValueText();
        this.f84869N.setGroupName(valueText);
        TemplateGroupComment templateGroupComment = this.f84865J;
        if (templateGroupComment != null) {
            templateGroupComment.setComment(valueText2);
        } else {
            TemplateGroupComment templateGroupComment2 = new TemplateGroupComment();
            this.f84865J = templateGroupComment2;
            templateGroupComment2.setComment(valueText2);
            this.f84865J.setCommentType(PensionStatusResult.STATUS_ACTIVE);
        }
        TemplateGroupComment templateGroupComment3 = this.f84866K;
        if (templateGroupComment3 != null) {
            templateGroupComment3.setComment(valueText3);
        } else {
            TemplateGroupComment templateGroupComment4 = new TemplateGroupComment();
            this.f84866K = templateGroupComment4;
            templateGroupComment4.setComment(valueText3);
            this.f84866K.setCommentType("B");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f84865J);
        arrayList.add(this.f84866K);
        this.f84869N.setComments(arrayList);
    }

    /* renamed from: S2 */
    private void m103587S2() {
        this.f84864I.f68847h.setValueText((String) this.f84871P.get(0));
        this.f84864I.f68844e.setValueText((String) this.f84871P.get(1));
        this.f84864I.f68845f.setValueText((String) this.f84871P.get(2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27314h0 d = C27314h0.m84563d(getLayoutInflater());
        this.f84864I = d;
        super.mo70996D2(bundle, d);
        this.f84864I.f68851l.setOnClickListener(new C30548c1(this));
        long longExtra = getIntent().getLongExtra("TEMPLATE_GROUP_ITEM_ID", -1);
        TemplateGroup templateGroup = new TemplateGroup();
        this.f84869N = templateGroup;
        templateGroup.setGroupType(PensionStatusResult.STATUS_INACTIVE);
        if (longExtra != -1) {
            TemplateGroup templateGroupById = this.f84862G.getTemplateGroupById(longExtra);
            if (templateGroupById != null) {
                this.f84869N.setId(longExtra);
                this.f84869N.setChannel(templateGroupById.getChannel());
                this.f84869N.setComments(templateGroupById.getComments());
                this.f84869N.setCustomerId(templateGroupById.getCustomerId());
                this.f84869N.setGroupImage(templateGroupById.getGroupImage());
                this.f84869N.setGroupName(templateGroupById.getGroupName());
                this.f84869N.setGroupOrder(templateGroupById.getGroupOrder());
                this.f84869N.setStatus(templateGroupById.getStatus());
                this.f84869N.setTemplates(templateGroupById.getTemplates());
            }
        } else {
            this.f84864I.f68848i.setText(getString(C10328q.templates_button_text_add_group));
        }
        if (TextUtils.isEmpty(this.f84869N.getGroupName())) {
            this.f84869N.setGroupName(getString(C10328q.template_group_my_house));
        }
        m103585Q2(this.f84869N);
        this.f84864I.f68851l.setOrange(true);
        this.f84864I.f68847h.setOnClickListener(this);
        this.f84864I.f68844e.setOnClickListener(this);
        this.f84864I.f68845f.setOnClickListener(this);
        m103584P2();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 139 || i == 140) {
                C38163b bVar = this.f84872Q;
                if (bVar != null) {
                    bVar.mo91683c(i, intent);
                }
            } else if (i == 10001) {
                this.f84871P = intent.getStringArrayListExtra("WIZARD_COLLECTED_VALUES");
                m103587S2();
            } else if (i == 10002) {
                String stringExtra = intent.getStringExtra("CROPPED_PATH");
                m103586R2();
                setResult(-1);
                File file = new File(stringExtra);
                this.f84874S = file;
                TextTypeView textTypeView = this.f84864I.f68852m;
                int i3 = C10320i.ic_upload_image;
                textTypeView.loadRightPhotoFromFile(file, i3, i3);
                this.f84864I.f68852m.setTitleText(getString(C10328q.common_text_change_photo));
                this.f84869N.setOperationKey((String) null);
            }
        }
    }

    public void onClick(View view) {
        ArrayList N2 = m103582N2();
        Rect i = C32290b1.m95119i((TextTypeView) view.getTag());
        int i2 = 0;
        if (view != this.f84864I.f68847h.getViewSelector()) {
            if (view == this.f84864I.f68844e.getViewSelector()) {
                i2 = 1;
            } else if (view == this.f84864I.f68845f.getViewSelector()) {
                i2 = 2;
            }
        }
        BasicWizardActivity.m106444G3(this, N2, i2, i.top);
    }

    @C41452l
    public void onModifyTemplateGroupEvent(ModifyTemplateGroupEvent modifyTemplateGroupEvent) {
        if (this.f84869N.getId() == 0 || modifyTemplateGroupEvent.getTemplateGroup().getId() == this.f84869N.getId()) {
            this.f84867L = modifyTemplateGroupEvent;
            int state = modifyTemplateGroupEvent.getState();
            if (state == 10) {
                m103581M2(true);
            } else if (state == 20) {
                this.f84868M = false;
                this.f84869N = modifyTemplateGroupEvent.getTemplateGroup();
                m103585Q2(this.f84867L.getTemplateGroup());
                m103581M2(false);
                C32297d.m95160h(this, getString(C10328q.f28956f2));
                finish();
            } else if (state == 30) {
                this.f84868M = false;
                m103581M2(false);
            } else if (state == 40) {
                this.f84868M = false;
                m103581M2(false);
                C32297d.m95154b(this, C27950a.m86286c(modifyTemplateGroupEvent.getErrorKey(), false));
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C38163b bVar = this.f84872Q;
        if (bVar != null) {
            bVar.mo91684d(i);
        }
    }

    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f84863H, this);
        if (this.f84868M) {
            this.f84862G.modifyTemplateGroup(false, this.f84869N, (File) null);
        }
    }

    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f84863H, this);
    }
}
