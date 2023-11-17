package p341ge.bog.mobilebank.model.account;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.account.AccountLovContainer$$Parcelable */
public class AccountLovContainer$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<AccountLovContainer$$Parcelable> CREATOR = new Parcelable.Creator<AccountLovContainer$$Parcelable>() {
        public AccountLovContainer$$Parcelable createFromParcel(Parcel parcel) {
            return new AccountLovContainer$$Parcelable(AccountLovContainer$$Parcelable.read(parcel, new C42027a()));
        }

        public AccountLovContainer$$Parcelable[] newArray(int i) {
            return new AccountLovContainer$$Parcelable[i];
        }
    };
    private AccountLovContainer accountLovContainer$$0;

    public AccountLovContainer$$Parcelable(AccountLovContainer accountLovContainer) {
        this.accountLovContainer$$0 = accountLovContainer;
    }

    public static AccountLovContainer read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            AccountLovContainer accountLovContainer = new AccountLovContainer();
            aVar.mo97501f(g, accountLovContainer);
            Class<AccountLovContainer$$Parcelable> cls = AccountLovContainer$$Parcelable.class;
            accountLovContainer.domestic = (AccountLovHolder) parcel.readParcelable(cls.getClassLoader());
            accountLovContainer.bank = (AccountLovHolder) parcel.readParcelable(cls.getClassLoader());
            accountLovContainer.georgia = (AccountLovHolder) parcel.readParcelable(cls.getClassLoader());
            accountLovContainer.conversion = (AccountLovHolder) parcel.readParcelable(cls.getClassLoader());
            accountLovContainer.foreign = (AccountLovHolder) parcel.readParcelable(cls.getClassLoader());
            aVar.mo97501f(readInt, accountLovContainer);
            return accountLovContainer;
        } else if (!aVar.mo97499d(readInt)) {
            return (AccountLovContainer) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(AccountLovContainer accountLovContainer, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(accountLovContainer);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(accountLovContainer));
        parcel.writeParcelable(accountLovContainer.domestic, i);
        parcel.writeParcelable(accountLovContainer.bank, i);
        parcel.writeParcelable(accountLovContainer.georgia, i);
        parcel.writeParcelable(accountLovContainer.conversion, i);
        parcel.writeParcelable(accountLovContainer.foreign, i);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.accountLovContainer$$0, parcel, i, new C42027a());
    }

    public AccountLovContainer getParcel() {
        return this.accountLovContainer$$0;
    }
}
