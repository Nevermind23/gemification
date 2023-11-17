package p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.invitation;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.View;
import g91.C32297d;
import g91.C32343x;
import hd0.C24978b;
import java.util.ArrayList;
import java.util.Iterator;
import jg1.C41438c;
import jg1.C41452l;
import p341ge.bog.mobilebank.eventbus.events.PlusReferralRegistrationEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.model.C35693b;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p366bk.C10328q;
import p90.C27345k1;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.invitation.PlusProgramInvitationActivity */
public class PlusProgramInvitationActivity extends C35359b {

    /* renamed from: G */
    protected RootBankApiManager f85637G;

    /* renamed from: H */
    protected Client f85638H;

    /* renamed from: I */
    protected C41438c f85639I;

    /* renamed from: J */
    private C27345k1 f85640J;

    /* renamed from: K */
    private ArrayList f85641K = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m104994C2(View view) {
        m104999I2();
    }

    /* renamed from: G2 */
    private WizardObject m104997G2(int i, String str, int i2, int i3) {
        WizardObject wizardObject = new WizardObject();
        wizardObject.setInputTitle(getString(i));
        wizardObject.setValue(str);
        wizardObject.setInputType(i2);
        wizardObject.setInputStyle(i3);
        return wizardObject;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c3  */
    /* renamed from: H2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m104998H2(android.view.View r10) {
        /*
            r9 = this;
            p90.k1 r0 = r9.f85640J
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r0 = r0.f69116h
            android.view.View r0 = r0.getViewSelector()
            r1 = 3
            r2 = 1
            r3 = 0
            if (r10 != r0) goto L_0x000f
        L_0x000d:
            r0 = r3
            goto L_0x003e
        L_0x000f:
            p90.k1 r0 = r9.f85640J
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r0 = r0.f69117i
            android.view.View r0 = r0.getViewSelector()
            if (r10 != r0) goto L_0x001b
            r0 = r2
            goto L_0x003e
        L_0x001b:
            p90.k1 r0 = r9.f85640J
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r0 = r0.f69114f
            android.view.View r0 = r0.getViewSelector()
            if (r10 != r0) goto L_0x0027
            r0 = 2
            goto L_0x003e
        L_0x0027:
            p90.k1 r0 = r9.f85640J
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r0 = r0.f69118j
            android.view.View r0 = r0.getViewSelector()
            if (r10 != r0) goto L_0x0033
            r0 = r1
            goto L_0x003e
        L_0x0033:
            p90.k1 r0 = r9.f85640J
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r0 = r0.f69119k
            android.view.View r0 = r0.getViewSelector()
            if (r10 != r0) goto L_0x000d
            r0 = 4
        L_0x003e:
            ge.bog.mobilebank.ui.activities.bonuses.plus.invitation.PlusInviteWizardPlugin r4 = new ge.bog.mobilebank.ui.activities.bonuses.plus.invitation.PlusInviteWizardPlugin
            java.util.ArrayList r5 = r9.f85641K
            ge.bog.mobilebank.model.Client r6 = r9.f85638H
            ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper r6 = r6.getUserInfo()
            boolean r6 = r6.isSolo()
            r4.<init>(r5, r6)
            ge.bog.mobilebank.ui.wizard.model.a$a r5 = p341ge.bog.mobilebank.p975ui.wizard.model.C35893a.m106783a(r9)
            int r6 = p366bk.C10328q.common_text_first_name
            p90.k1 r7 = r9.f85640J
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r7 = r7.f69116h
            java.lang.String r7 = r7.getValueText()
            ge.bog.mobilebank.ui.wizard.model.WizardObject r6 = r9.m104997G2(r6, r7, r3, r2)
            ge.bog.mobilebank.ui.wizard.model.a$a r5 = r5.mo88134a(r6)
            int r6 = p366bk.C10328q.common_text_last_name
            p90.k1 r7 = r9.f85640J
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r7 = r7.f69117i
            java.lang.String r7 = r7.getValueText()
            ge.bog.mobilebank.ui.wizard.model.WizardObject r6 = r9.m104997G2(r6, r7, r3, r2)
            ge.bog.mobilebank.ui.wizard.model.a$a r5 = r5.mo88134a(r6)
            int r6 = p366bk.C10328q.f28965q0
            p90.k1 r7 = r9.f85640J
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r7 = r7.f69114f
            java.lang.String r7 = r7.getValueText()
            r8 = 303(0x12f, float:4.25E-43)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r2 = r9.m104997G2(r6, r7, r8, r2)
            ge.bog.mobilebank.ui.wizard.model.a$a r2 = r5.mo88134a(r2)
            int r5 = p366bk.C10328q.payments_details_title_phone_number
            p90.k1 r6 = r9.f85640J
            ge.bog.mobilebank.ui.views.widgets.TextTypeView r6 = r6.f69118j
            java.lang.String r6 = r6.getValueText()
            r7 = 305(0x131, float:4.27E-43)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r1 = r9.m104997G2(r5, r6, r7, r1)
            ge.bog.mobilebank.ui.wizard.model.a$a r1 = r2.mo88134a(r1)
            java.lang.Class<ge.bog.mobilebank.ui.wizard.activities.AdvancedWizardActivity> r2 = p341ge.bog.mobilebank.p975ui.wizard.activities.AdvancedWizardActivity.class
            ge.bog.mobilebank.ui.wizard.model.a$a r1 = r1.mo88137d(r2)
            ge.bog.mobilebank.ui.wizard.model.a$a r0 = r1.mo88141h(r0)
            ge.bog.mobilebank.ui.wizard.model.a$a r0 = r0.mo88139f(r4)
            java.lang.Object r10 = r10.getTag()
            android.view.View r10 = (android.view.View) r10
            ge.bog.mobilebank.ui.wizard.model.a$a r10 = r0.mo88136c(r10)
            ge.bog.mobilebank.model.Client r0 = r9.f85638H
            ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper r0 = r0.getUserInfo()
            boolean r0 = r0.isSolo()
            if (r0 != 0) goto L_0x00ce
            int r0 = p366bk.C10328q.bonus_invite_select_plus_products
            java.lang.String r1 = ""
            ge.bog.mobilebank.ui.wizard.model.WizardObject r0 = r9.m104997G2(r0, r1, r3, r3)
            r10.mo88134a(r0)
        L_0x00ce:
            r10.mo88142i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.invitation.PlusProgramInvitationActivity.m104998H2(android.view.View):void");
    }

    /* renamed from: I2 */
    private void m104999I2() {
        C24978b bVar;
        C24978b bVar2;
        C24978b bVar3;
        C24978b bVar4;
        C24978b bVar5;
        C24978b bVar6;
        if (this.f85640J.f69115g.getButton().isEnabled()) {
            this.f85640J.f69120l.setVisibility(0);
            RootBankApiManager rootBankApiManager = this.f85637G;
            String valueText = this.f85640J.f69114f.getValueText();
            String valueText2 = this.f85640J.f69118j.getValueText();
            String valueText3 = this.f85640J.f69116h.getValueText();
            String valueText4 = this.f85640J.f69117i.getValueText();
            if (this.f85641K.contains(Integer.valueOf(C35693b.DEPOSIT.ordinal()))) {
                bVar = C24978b.YES;
            } else {
                bVar = C24978b.NO;
            }
            C24978b bVar7 = bVar;
            if (this.f85641K.contains(Integer.valueOf(C35693b.LOAN.ordinal()))) {
                bVar2 = C24978b.YES;
            } else {
                bVar2 = C24978b.NO;
            }
            C24978b bVar8 = bVar2;
            if (this.f85641K.contains(Integer.valueOf(C35693b.CREDIT_CARD.ordinal()))) {
                bVar3 = C24978b.YES;
            } else {
                bVar3 = C24978b.NO;
            }
            C24978b bVar9 = bVar3;
            if (this.f85641K.contains(Integer.valueOf(C35693b.MORTGAGE_LOAN.ordinal()))) {
                bVar4 = C24978b.YES;
            } else {
                bVar4 = C24978b.NO;
            }
            C24978b bVar10 = bVar4;
            if (this.f85641K.contains(Integer.valueOf(C35693b.SOLO.ordinal()))) {
                bVar5 = C24978b.YES;
            } else {
                bVar5 = C24978b.NO;
            }
            C24978b bVar11 = bVar5;
            if (this.f85641K.contains(Integer.valueOf(C35693b.SOLO_CLUB.ordinal()))) {
                bVar6 = C24978b.YES;
            } else {
                bVar6 = C24978b.NO;
            }
            rootBankApiManager.registerReferral(valueText, valueText2, valueText3, valueText4, bVar7, bVar8, bVar9, bVar10, bVar11, bVar6);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27345k1 d = C27345k1.m84689d(getLayoutInflater());
        this.f85640J = d;
        super.mo70996D2(bundle, d);
        C32343x.m95423W0(this.f85639I, this);
        if (this.f85638H.getUserInfo() == null || this.f85638H.getUserInfo().getClient() == null || this.f85638H.getUserInfo().getClient().isSoloClient()) {
            this.f85640J.f69119k.setVisibility(8);
        } else {
            this.f85640J.f69119k.getBogInputLayout().getEditText().setEllipsize(TextUtils.TruncateAt.END);
            this.f85640J.f69119k.getBogInputLayout().getEditText().setHorizontallyScrolling(true);
            this.f85640J.f69119k.getBogInputLayout().getEditText().setSingleLine();
            this.f85640J.f69119k.getBogInputLayout().getEditText().setKeyListener((KeyListener) null);
        }
        this.f85640J.f69116h.setOnClickListener(new C35363e(this));
        this.f85640J.f69117i.setOnClickListener(new C35363e(this));
        this.f85640J.f69114f.setOnClickListener(new C35363e(this));
        this.f85640J.f69118j.setOnClickListener(new C35363e(this));
        this.f85640J.f69119k.setOnClickListener(new C35363e(this));
        this.f85640J.f69115g.setOnClickListener(new C35364f(this));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10001) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("WIZARD_COLLECTED_VALUES");
            this.f85640J.f69116h.setValueText(stringArrayListExtra.get(0));
            this.f85640J.f69117i.setValueText(stringArrayListExtra.get(1));
            this.f85640J.f69114f.setValueText(stringArrayListExtra.get(2));
            this.f85640J.f69118j.setValueText(stringArrayListExtra.get(3));
            this.f85641K = intent.getIntegerArrayListExtra(PlusInviteWizardPlugin.SELECTED_PRODUCTS);
            C35693b[] values = C35693b.values();
            if (this.f85641K.size() > 0) {
                StringBuilder sb = new StringBuilder();
                Iterator it = this.f85641K.iterator();
                while (it.hasNext()) {
                    sb.append(getString(values[((Integer) it.next()).intValue()].mo86825c()));
                    sb.append(", ");
                }
                sb.deleteCharAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                this.f85640J.f69119k.setValueText(sb.toString());
                this.f85640J.f69119k.getBogInputLayout().getEditText().setSelection(0);
            }
            if (TextUtils.isEmpty(this.f85640J.f69116h.getValueText()) || TextUtils.isEmpty(this.f85640J.f69117i.getValueText()) || TextUtils.isEmpty(this.f85640J.f69114f.getValueText()) || TextUtils.isEmpty(this.f85640J.f69118j.getValueText()) || this.f85641K.size() <= 0) {
                this.f85640J.f69115g.getButton().setEnabled(false);
            } else {
                this.f85640J.f69115g.getButton().setEnabled(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.f85639I, this);
    }

    @C41452l
    public void onPlusReferralRegistrationEvent(PlusReferralRegistrationEvent plusReferralRegistrationEvent) {
        int state = plusReferralRegistrationEvent.getState();
        if (state == 20) {
            PlusInvitationResultActivity.m104990F2(this, plusReferralRegistrationEvent);
            finish();
        } else if (state == 30) {
            C32297d.m95153a(this);
        } else if (state == 40) {
            C32297d.m95154b(this, C27950a.m86284a(plusReferralRegistrationEvent.getErrorKey()));
        }
        this.f85640J.f69120l.setVisibility(8);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_invite);
    }
}
