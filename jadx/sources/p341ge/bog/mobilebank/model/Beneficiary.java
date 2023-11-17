package p341ge.bog.mobilebank.model;

import n41.C37353c;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;

@Parcel
/* renamed from: ge.bog.mobilebank.model.Beneficiary */
public class Beneficiary {
    public String benefAcctNo;
    public String benefBic;
    public String benefName;
    public String benefNameInt;
    public String beneficiaryName;

    private C37353c getCurrentLang() {
        return PreferencesApiManager.getInstance().getLanguage();
    }

    public String getName() {
        String str;
        if ((getCurrentLang() != C37353c.KA || this.benefName == null) && (str = this.benefNameInt) != null) {
            return str;
        }
        return this.benefName;
    }
}
