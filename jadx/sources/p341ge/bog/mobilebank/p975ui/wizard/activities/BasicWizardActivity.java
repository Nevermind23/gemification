package p341ge.bog.mobilebank.p975ui.wizard.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import c91.C31302e;
import c91.C31303f;
import c91.C31334t;
import c91.C31355y;
import g91.C32297d;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.BasicWizardActivity */
public class BasicWizardActivity extends C35862c {
    /* access modifiers changed from: protected */

    /* renamed from: k0 */
    public ArrayList f86630k0 = new ArrayList();

    /* renamed from: B3 */
    public static void m106443B3(Intent intent, ArrayList arrayList, int i, int i2, String str) {
        intent.putExtra("WIZARD_OBJECTS", C42035e.m122121c(arrayList));
        intent.putExtra("WIZARD_PAGE_INDEX", i);
        intent.putExtra("WIZARD_INPUT_Y_POSITION", i2);
        if (str != null) {
            intent.putExtra("ALERT_INTRO_TEXT", str);
        }
    }

    /* renamed from: G3 */
    public static void m106444G3(Activity activity, ArrayList arrayList, int i, int i2) {
        m106445H3(activity, arrayList, i, i2, (String) null);
    }

    /* renamed from: H3 */
    public static void m106445H3(Activity activity, ArrayList arrayList, int i, int i2, String str) {
        Intent intent = new Intent(activity, BasicWizardActivity.class);
        m106443B3(intent, arrayList, i, i2, str);
        activity.startActivityForResult(intent, 10001);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C3 */
    public void mo74769C3(Intent intent) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f86630k0.iterator();
        while (it.hasNext()) {
            arrayList.add(((C31355y) it.next()).mo71611z1());
        }
        intent.putStringArrayListExtra("WIZARD_COLLECTED_VALUES", arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D3 */
    public C31355y mo74770D3(WizardObject wizardObject, int i) {
        C31355y yVar;
        if (wizardObject.getInputStyle() == 1) {
            yVar = new C31303f();
        } else if (wizardObject.getInputStyle() == 0) {
            yVar = new C31302e();
        } else if (wizardObject.getInputStyle() == 7) {
            yVar = new C31334t();
        } else {
            yVar = null;
        }
        yVar.mo71717U1(wizardObject.getValue());
        yVar.mo71709L1(wizardObject);
        return yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E3 */
    public void mo87832E3(boolean z) {
        Intent intent = new Intent();
        mo74769C3(intent);
        intent.putExtra("WIZARD_NEXT_BTN_CLICKED", z);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F3 */
    public void mo87890F3(int i, ArrayList arrayList, boolean z) {
        if (z) {
            ArrayList arrayList2 = this.f86630k0;
            arrayList2.subList(i, arrayList2.size()).clear();
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f86630k0.add(i, mo74770D3((WizardObject) it.next(), i));
                i++;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        String string = getIntent().getExtras().getString("ALERT_INTRO_TEXT", (String) null);
        if (string != null) {
            C32297d.m95157e(this, string);
        }
        mo87890F3(0, (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("WIZARD_OBJECTS")), false);
        ((C31355y) this.f86630k0.get(this.f86775c0)).mo71733r1().putBoolean("WIZARD_FIELD_SHOULD_ANIMATE", true);
        mo87967s3(this.f86630k0, true);
        mo87963n3(this.f86775c0, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e3 */
    public void mo87867e3() {
        super.mo87867e3();
        if (((C31355y) this.f86630k0.get(mo87922N2())).mo71607t1().getLastInputType() == 304) {
            if (this.f86630k0.get(mo87922N2()) != null) {
                ((C31355y) this.f86630k0.get(mo87922N2())).mo71607t1().setInputType(BogInputLayout.INPUT_TYPE_NUM_PHONE);
            }
        } else if (this.f86630k0.get(mo87922N2()) != null) {
            ((C31355y) this.f86630k0.get(mo87922N2())).mo71607t1().setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public void mo53121f3() {
        super.mo53121f3();
        mo87832E3(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g3 */
    public void mo87868g3() {
        mo87832E3(true);
    }

    public void onBackPressed() {
        mo87832E3(false);
    }
}
