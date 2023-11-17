package p341ge.bog.mobilebank.p975ui.wizard.activities;

import android.os.Bundle;
import c91.C31303f;
import c91.C31355y;
import g91.C32297d;
import java.util.ArrayList;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.C35886a;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.AdvancedWizardActivity */
public class AdvancedWizardActivity extends C35868e implements C35886a {

    /* renamed from: m0 */
    protected RootBankApiManager f86552m0;

    /* renamed from: n0 */
    protected BaseWizardPlugin f86553n0;

    /* renamed from: J3 */
    private void m106300J3() {
        BaseWizardPlugin baseWizardPlugin = (BaseWizardPlugin) getIntent().getParcelableExtra("KOTLIN_WIZARD_CONTROLLER");
        this.f86553n0 = baseWizardPlugin;
        if (baseWizardPlugin == null) {
            this.f86553n0 = (BaseWizardPlugin) C42035e.m122119a(getIntent().getParcelableExtra("WIZARD_CONTROLLER"));
        }
        this.f86553n0.setWizardCallback(this);
    }

    /* renamed from: B */
    public void mo87830B(boolean z) {
        mo87832E3(z);
    }

    /* renamed from: D */
    public void mo87831D() {
        mo87958V2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D3 */
    public C31355y mo74770D3(WizardObject wizardObject, int i) {
        return this.f86553n0.createFragment(wizardObject, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E3 */
    public void mo87832E3(boolean z) {
        this.f86553n0.finishOK(this, z);
    }

    /* renamed from: I3 */
    public RootBankApiManager mo87833I3() {
        return this.f86552m0;
    }

    /* renamed from: K3 */
    public void mo87834K3(int i) {
        this.f86553n0.onInputChanged(i);
    }

    /* renamed from: L3 */
    public void mo87835L3(int i) {
        this.f86553n0.onInputVerificationRequired(i);
    }

    /* renamed from: M3 */
    public void mo87836M3(ArrayList arrayList, String str) {
        this.f86553n0.onUpdateWizardValues(arrayList, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        m106300J3();
        super.mo37451O1(bundle);
    }

    /* renamed from: Z */
    public void mo87837Z(int i) {
        if (mo87842f0().get(i) instanceof C31303f) {
            ((C31303f) mo87842f0().get(i)).mo71553i2();
        }
    }

    /* renamed from: a0 */
    public C31355y mo87838a0() {
        return (C31355y) this.f86630k0.get(mo87922N2());
    }

    /* renamed from: c0 */
    public void mo87839c0(int i, ArrayList arrayList) {
        mo87890F3(i, arrayList, true);
        mo87967s3(mo87842f0(), false);
    }

    /* renamed from: d */
    public void mo87840d(int i, WizardObject wizardObject) {
        C31355y createFragment = this.f86553n0.createFragment(wizardObject, i);
        this.f86553n0.getWizardFragments().remove(i);
        this.f86553n0.getWizardFragments().add(i, createFragment);
        mo87967s3(mo87842f0(), false);
    }

    /* renamed from: e0 */
    public void mo87841e0() {
        super.mo87844j3();
    }

    /* renamed from: f0 */
    public ArrayList mo87842f0() {
        return this.f86630k0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h3 */
    public void mo87843h3() {
        super.mo87843h3();
        this.f86553n0.onFragmentsSet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i3 */
    public void mo53122i3() {
        if (this.f86752F.isOrange()) {
            this.f86553n0.onNextClick(this.f86776d0.mo87977d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j3 */
    public void mo87844j3() {
        this.f86553n0.onPreviousClick(this.f86776d0.mo87977d());
    }

    /* renamed from: n0 */
    public void mo87845n0(String str) {
        C32297d.m95154b(this, str);
    }

    /* renamed from: o0 */
    public void mo87846o0() {
        super.mo53122i3();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f86553n0.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f86553n0.onStop();
    }

    /* renamed from: q */
    public void mo87847q() {
        mo87971y3();
    }
}
