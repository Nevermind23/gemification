package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.wizardplugin;

import android.os.Parcel;
import android.os.Parcelable;
import c91.C31297b;
import c91.C31355y;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.wizardplugin.MoneyRequestSummaryWizardPlugin */
public final class MoneyRequestSummaryWizardPlugin extends BaseWizardPlugin implements Parcelable {
    public static final Parcelable.Creator<MoneyRequestSummaryWizardPlugin> CREATOR = new C21927a();

    /* renamed from: d */
    private final ArrayList f58387d;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.wizardplugin.MoneyRequestSummaryWizardPlugin$a */
    public static final class C21927a implements Parcelable.Creator {
        /* renamed from: a */
        public final MoneyRequestSummaryWizardPlugin createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(MoneyRequestSummaryWizardPlugin.class.getClassLoader()));
            }
            return new MoneyRequestSummaryWizardPlugin(arrayList);
        }

        /* renamed from: b */
        public final MoneyRequestSummaryWizardPlugin[] newArray(int i) {
            return new MoneyRequestSummaryWizardPlugin[i];
        }
    }

    public MoneyRequestSummaryWizardPlugin(ArrayList arrayList) {
        C41536l.m120489i(arrayList, "accountLovs");
        this.f58387d = arrayList;
    }

    public C31355y createFragment(WizardObject wizardObject, int i) {
        boolean z = false;
        if (wizardObject != null && wizardObject.getInputStyle() == 4) {
            z = true;
        }
        if (z) {
            C31297b bVar = new C31297b();
            bVar.mo71713P1(i);
            bVar.mo71544k2(this.f58387d);
            bVar.mo71717U1(wizardObject.getValue());
            bVar.mo71709L1(wizardObject);
            return bVar;
        }
        C31355y createFragment = super.createFragment(wizardObject, i);
        C41536l.m120488h(createFragment, "{\n            super.crea…ment(wo, index)\n        }");
        return createFragment;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        ArrayList arrayList = this.f58387d;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }
}
