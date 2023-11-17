package p341ge.bog.mobilebank.model.account;

import android.os.Parcelable;
import java.util.ArrayList;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.account.AccountDebitLoveWrapper */
public class AccountDebitLoveWrapper implements Parcelable {
    public static final Parcelable.Creator<AccountDebitLoveWrapper> CREATOR = new Parcelable.Creator<AccountDebitLoveWrapper>() {
        public AccountDebitLoveWrapper createFromParcel(android.os.Parcel parcel) {
            return new AccountDebitLoveWrapper(parcel);
        }

        public AccountDebitLoveWrapper[] newArray(int i) {
            return new AccountDebitLoveWrapper[i];
        }
    };
    public ArrayList<AccountLoveDebit> accounts = new ArrayList<>();
    public ArrayList<AccountLoveDebit> cardDebits = new ArrayList<>();

    public AccountDebitLoveWrapper() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(this.accounts);
        parcel.writeList(this.cardDebits);
    }

    protected AccountDebitLoveWrapper(android.os.Parcel parcel) {
        ArrayList<AccountLoveDebit> arrayList = new ArrayList<>();
        this.accounts = arrayList;
        Class<AccountLoveDebit> cls = AccountLoveDebit.class;
        parcel.readList(arrayList, cls.getClassLoader());
        ArrayList<AccountLoveDebit> arrayList2 = new ArrayList<>();
        this.cardDebits = arrayList2;
        parcel.readList(arrayList2, cls.getClassLoader());
    }
}
