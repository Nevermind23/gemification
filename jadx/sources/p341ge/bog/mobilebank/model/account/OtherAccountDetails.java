package p341ge.bog.mobilebank.model.account;

import android.text.TextUtils;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.account.OtherAccountDetails */
public class OtherAccountDetails {
    public String acctNo;

    /* renamed from: id */
    public String f81299id;
    public String name;

    public String getTitle() {
        String str = this.name;
        if (str == null || TextUtils.isEmpty(str.replace(" ", ""))) {
            return this.acctNo;
        }
        return this.name;
    }
}
