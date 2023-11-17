package p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.invitation;

import android.content.Intent;
import c91.C31303f;
import c91.C31315m;
import c91.C31317n;
import c91.C31355y;
import i81.C36365a;
import java.util.ArrayList;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.p975ui.model.C35693b;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;

@Parcel
/* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.invitation.PlusInviteWizardPlugin */
public class PlusInviteWizardPlugin extends BaseWizardPlugin {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String SELECTED_PRODUCTS = "SELECTED_PRODUCTS";
    boolean isSoloClient;
    ArrayList<Integer> selectedProducts;

    public PlusInviteWizardPlugin() {
    }

    public C31355y createFragment(WizardObject wizardObject, int i) {
        C31315m mVar;
        int inputStyle = wizardObject.getInputStyle();
        if (inputStyle == 0) {
            C31317n nVar = new C31317n();
            C36365a aVar = new C36365a();
            aVar.mo71092n(this.selectedProducts);
            nVar.mo71584h2(aVar);
            mVar = nVar;
        } else if (inputStyle == 1) {
            mVar = new C31303f();
        } else if (inputStyle != 3) {
            mVar = null;
        } else {
            mVar = new C31315m();
        }
        mVar.mo71717U1(wizardObject.getValue());
        mVar.mo71713P1(i);
        mVar.mo71709L1(wizardObject);
        return mVar;
    }

    public Intent getData() {
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            arrayList.add(getWizardFragments().get(i).mo71611z1());
        }
        intent.putStringArrayListExtra("WIZARD_COLLECTED_VALUES", arrayList);
        if (this.isSoloClient) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(C35693b.SOLO.ordinal()));
            arrayList2.add(Integer.valueOf(C35693b.SOLO_CLUB.ordinal()));
            intent.putIntegerArrayListExtra(SELECTED_PRODUCTS, arrayList2);
        } else {
            intent.putIntegerArrayListExtra(SELECTED_PRODUCTS, ((C31317n) getWizardFragments().get(4)).mo71583g2().mo71086h());
        }
        return intent;
    }

    public PlusInviteWizardPlugin(ArrayList<Integer> arrayList, boolean z) {
        this.selectedProducts = arrayList;
        this.isSoloClient = z;
    }
}
