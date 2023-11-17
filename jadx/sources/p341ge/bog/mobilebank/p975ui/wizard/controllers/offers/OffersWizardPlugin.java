package p341ge.bog.mobilebank.p975ui.wizard.controllers.offers;

import android.content.Intent;
import c91.C31355y;
import d91.C31550a;
import java.util.Iterator;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;

@Parcel
/* renamed from: ge.bog.mobilebank.ui.wizard.controllers.offers.OffersWizardPlugin */
public class OffersWizardPlugin extends BaseWizardPlugin {
    public C31355y createFragment(WizardObject wizardObject, int i) {
        if (wizardObject.getInputStyle() != 4) {
            return super.createFragment(wizardObject, i);
        }
        C31550a aVar = new C31550a();
        aVar.mo71709L1(wizardObject);
        return aVar;
    }

    public Intent getData() {
        Intent intent = new Intent();
        Iterator<C31355y> it = getWizardFragments().iterator();
        while (it.hasNext()) {
            C31355y next = it.next();
            intent.putExtra(next.mo71707D1().getId(), next.mo71611z1());
        }
        return intent;
    }
}
