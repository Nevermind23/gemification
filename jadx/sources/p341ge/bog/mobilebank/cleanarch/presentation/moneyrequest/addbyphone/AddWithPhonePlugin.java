package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone;

import android.os.Parcel;
import android.os.Parcelable;
import c91.C31315m;
import c91.C31355y;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.GettingPhoneOwnerPurpose;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddWithPhonePlugin */
public final class AddWithPhonePlugin extends BaseWizardPlugin implements Parcelable {
    public static final Parcelable.Creator<AddWithPhonePlugin> CREATOR = new C21824a();

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.addbyphone.AddWithPhonePlugin$a */
    public static final class C21824a implements Parcelable.Creator {
        /* renamed from: a */
        public final AddWithPhonePlugin createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            parcel.readInt();
            return new AddWithPhonePlugin();
        }

        /* renamed from: b */
        public final AddWithPhonePlugin[] newArray(int i) {
            return new AddWithPhonePlugin[i];
        }
    }

    public C31355y createFragment(WizardObject wizardObject, int i) {
        C31355y createFragment = super.createFragment(wizardObject, i);
        if (i == 0 && (createFragment instanceof C31315m)) {
            C31315m mVar = (C31315m) createFragment;
            mVar.mo71575I2(false);
            mVar.mo71574H2(true, GettingPhoneOwnerPurpose.MONEY_REQUEST);
            mVar.mo71573F2(C10328q.money_request_msg_info_contacts_permission);
        }
        C41536l.m120488h(createFragment, "fragment");
        return createFragment;
    }

    public int describeContents() {
        return 0;
    }

    public void onNextClick(int i) {
        super.onNextClick(i);
        if (i == 0) {
            C31355y yVar = getWizardFragments().get(0);
            C41536l.m120487g(yVar, "null cannot be cast to non-null type ge.bog.mobilebank.ui.wizard.fragments.MobileWizardFragment<*>");
            getWizardFragments().get(1).mo71717U1(((C31315m) yVar).mo71578y2());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(1);
    }
}
