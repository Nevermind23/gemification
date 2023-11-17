package p341ge.bog.mobilebank.model.account;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.account.AccountLoveDebit$$Parcelable */
public class AccountLoveDebit$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<AccountLoveDebit$$Parcelable> CREATOR = new Parcelable.Creator<AccountLoveDebit$$Parcelable>() {
        public AccountLoveDebit$$Parcelable createFromParcel(Parcel parcel) {
            return new AccountLoveDebit$$Parcelable(AccountLoveDebit$$Parcelable.read(parcel, new C42027a()));
        }

        public AccountLoveDebit$$Parcelable[] newArray(int i) {
            return new AccountLoveDebit$$Parcelable[i];
        }
    };
    private AccountLoveDebit accountLoveDebit$$0;

    public AccountLoveDebit$$Parcelable(AccountLoveDebit accountLoveDebit) {
        this.accountLoveDebit$$0 = accountLoveDebit;
    }

    public static AccountLoveDebit read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            AccountLoveDebit accountLoveDebit = new AccountLoveDebit();
            aVar.mo97501f(g, accountLoveDebit);
            accountLoveDebit.acctNo = parcel.readString();
            accountLoveDebit.orderNo = parcel.readInt();
            accountLoveDebit.clientKey = parcel.readLong();
            accountLoveDebit.ccy = parcel.readString();
            accountLoveDebit.acctKey = parcel.readLong();
            accountLoveDebit.acctDesc = parcel.readString();
            aVar.mo97501f(readInt, accountLoveDebit);
            return accountLoveDebit;
        } else if (!aVar.mo97499d(readInt)) {
            return (AccountLoveDebit) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(AccountLoveDebit accountLoveDebit, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(accountLoveDebit);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(accountLoveDebit));
        parcel.writeString(accountLoveDebit.acctNo);
        parcel.writeInt(accountLoveDebit.orderNo);
        parcel.writeLong(accountLoveDebit.clientKey);
        parcel.writeString(accountLoveDebit.ccy);
        parcel.writeLong(accountLoveDebit.acctKey);
        parcel.writeString(accountLoveDebit.acctDesc);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.accountLoveDebit$$0, parcel, i, new C42027a());
    }

    public AccountLoveDebit getParcel() {
        return this.accountLoveDebit$$0;
    }
}
