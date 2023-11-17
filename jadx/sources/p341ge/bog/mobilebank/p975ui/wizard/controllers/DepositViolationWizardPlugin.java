package p341ge.bog.mobilebank.p975ui.wizard.controllers;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c91.C31300d;
import c91.C31355y;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;

/* renamed from: ge.bog.mobilebank.ui.wizard.controllers.DepositViolationWizardPlugin */
public final class DepositViolationWizardPlugin extends BaseWizardPlugin implements Parcelable {
    public static final Parcelable.Creator<DepositViolationWizardPlugin> CREATOR = new C35883a();

    /* renamed from: d */
    private final ArrayList f86811d;

    /* renamed from: ge.bog.mobilebank.ui.wizard.controllers.DepositViolationWizardPlugin$a */
    public static final class C35883a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositViolationWizardPlugin createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(DepositViolationWizardPlugin.class.getClassLoader()));
            }
            return new DepositViolationWizardPlugin(arrayList);
        }

        /* renamed from: b */
        public final DepositViolationWizardPlugin[] newArray(int i) {
            return new DepositViolationWizardPlugin[i];
        }
    }

    public DepositViolationWizardPlugin(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "accounts");
        this.f86811d = arrayList;
    }

    public C31355y createFragment(WizardObject wizardObject, int i) {
        C41536l.m120489i(wizardObject, "wo");
        if (wizardObject.getInputStyle() == 4) {
            C31300d dVar = new C31300d();
            dVar.mo71713P1(i);
            dVar.mo71547k2(this.f86811d);
            dVar.mo71717U1(wizardObject.getValue());
            dVar.mo71709L1(wizardObject);
            return dVar;
        }
        C31355y createFragment = super.createFragment(wizardObject, i);
        C41536l.m120488h(createFragment, "{\n            super.crea…ment(wo, index)\n        }");
        return createFragment;
    }

    public int describeContents() {
        return 0;
    }

    public Intent getData() {
        Intent intent = new Intent();
        Iterator<C31355y> it = getWizardFragments().iterator();
        while (it.hasNext()) {
            C31355y next = it.next();
            WizardObject D1 = next.mo71707D1();
            C41536l.m120486f(D1);
            intent.putExtra(D1.getId(), next.mo71611z1());
        }
        return intent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        ArrayList arrayList = this.f86811d;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }
}
