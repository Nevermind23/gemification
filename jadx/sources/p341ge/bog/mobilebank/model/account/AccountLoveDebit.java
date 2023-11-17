package p341ge.bog.mobilebank.model.account;

import android.os.Parcelable;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.account.AccountLoveDebit */
public class AccountLoveDebit implements Parcelable {
    public static final Parcelable.Creator<AccountLoveDebit> CREATOR = new Parcelable.Creator<AccountLoveDebit>() {
        public AccountLoveDebit createFromParcel(android.os.Parcel parcel) {
            return new AccountLoveDebit(parcel);
        }

        public AccountLoveDebit[] newArray(int i) {
            return new AccountLoveDebit[i];
        }
    };
    public String acctDesc;
    public long acctKey;
    public String acctNo;
    public String ccy;
    public long clientKey;
    public int orderNo;

    public AccountLoveDebit() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.acctKey);
        parcel.writeLong(this.clientKey);
        parcel.writeString(this.acctNo);
        parcel.writeString(this.ccy);
        parcel.writeString(this.acctDesc);
        parcel.writeInt(this.orderNo);
    }

    protected AccountLoveDebit(android.os.Parcel parcel) {
        this.acctKey = parcel.readLong();
        this.clientKey = parcel.readLong();
        this.acctNo = parcel.readString();
        this.ccy = parcel.readString();
        this.acctDesc = parcel.readString();
        this.orderNo = parcel.readInt();
    }
}
