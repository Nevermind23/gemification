package p341ge.bog.mobilebank.model.account;

import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.account.AccountLovHolder */
public class AccountLovHolder implements Parcelable {
    public static final Parcelable.Creator<AccountLovHolder> CREATOR = new Parcelable.Creator<AccountLovHolder>() {
        public AccountLovHolder createFromParcel(android.os.Parcel parcel) {
            return new AccountLovHolder(parcel);
        }

        public AccountLovHolder[] newArray(int i) {
            return new AccountLovHolder[i];
        }
    };
    public BigDecimal amountLimit;
    public ArrayList<AccountLov> dst;
    public ArrayList<AccountLov> src;

    public AccountLovHolder() {
    }

    public AccountLovHolder copy() {
        AccountLovHolder accountLovHolder = new AccountLovHolder();
        ArrayList<AccountLov> arrayList = new ArrayList<>();
        ArrayList<AccountLov> arrayList2 = new ArrayList<>();
        ArrayList<AccountLov> arrayList3 = this.src;
        if (arrayList3 != null) {
            arrayList.addAll(arrayList3);
        }
        ArrayList<AccountLov> arrayList4 = this.dst;
        if (arrayList4 != null) {
            arrayList2.addAll(arrayList4);
        }
        accountLovHolder.dst = arrayList2;
        accountLovHolder.src = arrayList;
        return accountLovHolder;
    }

    public int describeContents() {
        return 0;
    }

    public ArrayList<AccountLov> getDst() {
        return this.dst;
    }

    public ArrayList<AccountLov> getSrc() {
        return this.src;
    }

    public void setSrc(ArrayList<AccountLov> arrayList) {
        this.src = arrayList;
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(this.src);
        parcel.writeList(this.dst);
    }

    protected AccountLovHolder(android.os.Parcel parcel) {
        ArrayList<AccountLov> arrayList = new ArrayList<>();
        this.src = arrayList;
        Class<AccountLov> cls = AccountLov.class;
        parcel.readList(arrayList, cls.getClassLoader());
        ArrayList<AccountLov> arrayList2 = new ArrayList<>();
        this.dst = arrayList2;
        parcel.readList(arrayList2, cls.getClassLoader());
    }
}
