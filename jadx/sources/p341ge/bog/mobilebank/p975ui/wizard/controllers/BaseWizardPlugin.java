package p341ge.bog.mobilebank.p975ui.wizard.controllers;

import android.content.Intent;
import c91.C31303f;
import c91.C31307h;
import c91.C31310i;
import c91.C31315m;
import c91.C31319o;
import c91.C31329q;
import c91.C31331s;
import c91.C31334t;
import c91.C31355y;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.p975ui.fragments.C35664r1;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35862c;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;

@Parcel
/* renamed from: ge.bog.mobilebank.ui.wizard.controllers.BaseWizardPlugin */
public class BaseWizardPlugin {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String WIZARD_DATA = "WIZARD_DATA";
    /* access modifiers changed from: protected */
    public C35886a wizardCallback;

    public BaseWizardPlugin() {
    }

    public C31355y createFragment(WizardObject wizardObject, int i) {
        C31334t tVar;
        int inputStyle = wizardObject.getInputStyle();
        if (inputStyle != 0) {
            if (inputStyle != 1) {
                if (inputStyle == 2) {
                    tVar = new C31307h();
                } else if (inputStyle == 3) {
                    C31315m mVar = new C31315m();
                    wizardObject.setInputType(BogInputLayout.INPUT_TYPE_NUM_PHONE);
                    tVar = mVar;
                } else if (inputStyle == 5) {
                    tVar = new C35664r1();
                } else if (inputStyle != 7) {
                    tVar = null;
                } else {
                    tVar = new C31334t();
                }
            } else if (wizardObject.getSubTemplateObjects() != null) {
                tVar = new C31331s();
            } else {
                C31329q qVar = new C31329q();
                tVar = qVar;
                if (wizardObject.getInfoListKeyValues() != null) {
                    qVar.mo71618t2(wizardObject.getInfoListKeyValues());
                    tVar = qVar;
                }
            }
        } else if (wizardObject.getSelectorType() == 10) {
            tVar = new C31310i();
        } else {
            tVar = new C31319o();
        }
        tVar.mo71717U1(wizardObject.getValue());
        tVar.mo71713P1(i);
        tVar.mo71709L1(wizardObject);
        return tVar;
    }

    public void finishOK(C35862c cVar, boolean z) {
        Intent data = getData();
        data.putExtra("WIZARD_NEXT_BTN_CLICKED", z);
        cVar.setResult(-1, data);
        cVar.finish();
    }

    public Intent getData() {
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        Iterator<C31355y> it = getWizardFragments().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo71611z1());
        }
        intent.putStringArrayListExtra(WIZARD_DATA, arrayList);
        return intent;
    }

    /* access modifiers changed from: protected */
    public String getValueForId(String str, WizardObject wizardObject) {
        return str;
    }

    public C35886a getWizardCallback() {
        return this.wizardCallback;
    }

    public ArrayList<C31355y> getWizardFragments() {
        C35886a aVar = this.wizardCallback;
        if (aVar != null) {
            return aVar.mo87842f0();
        }
        return new ArrayList<>();
    }

    public void onFragmentsSet() {
    }

    public void onInputChanged(int i) {
    }

    public void onInputVerificationRequired(int i) {
    }

    public void onNextClick(int i) {
        this.wizardCallback.mo87846o0();
    }

    public void onPreviousClick(int i) {
        this.wizardCallback.mo87841e0();
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void onUpdateWizardValues(ArrayList<KeyValue> arrayList, String str) {
        String str2;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<C31355y> it = getWizardFragments().iterator();
            while (it.hasNext()) {
                C31355y next = it.next();
                Iterator<KeyValue> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    KeyValue next2 = it2.next();
                    if ((str.isEmpty() || !str.equals(next2.getKey())) && next.mo71707D1().getId().equals(next2.getKey()) && !arrayList2.contains(next2)) {
                        if (next2.getValue() != null) {
                            if (next.mo71707D1().getInputStyle() != 0) {
                                WizardObject D1 = next.mo71707D1();
                                if (next.mo71707D1().isAmountObject()) {
                                    str2 = String.valueOf(Double.parseDouble(next2.getValue()) / 100.0d);
                                } else {
                                    str2 = next2.getValue();
                                }
                                D1.setValue(str2);
                            } else {
                                int i = 0;
                                while (true) {
                                    if (i >= next.mo71707D1().getSelectorOptionValues().size()) {
                                        break;
                                    } else if (next.mo71707D1().getSelectorOptionValues().get(i).equals(next2.getValue())) {
                                        next.mo71707D1().setValue(String.valueOf(i));
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                            arrayList2.add(next2);
                            if (next == this.wizardCallback.mo87838a0() && (next instanceof C31303f)) {
                                ((C31303f) next).mo71556l2(next2.getValue());
                                next.mo71607t1().setValue(next2.getValue());
                            }
                        }
                    }
                }
            }
        }
    }

    public void setWizardCallback(C35886a aVar) {
        this.wizardCallback = aVar;
    }

    public BaseWizardPlugin(C35886a aVar) {
        this.wizardCallback = aVar;
    }
}
