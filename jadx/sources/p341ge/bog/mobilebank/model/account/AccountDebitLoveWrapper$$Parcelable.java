package p341ge.bog.mobilebank.model.account;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.account.AccountDebitLoveWrapper$$Parcelable */
public class AccountDebitLoveWrapper$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<AccountDebitLoveWrapper$$Parcelable> CREATOR = new Parcelable.Creator<AccountDebitLoveWrapper$$Parcelable>() {
        public AccountDebitLoveWrapper$$Parcelable createFromParcel(Parcel parcel) {
            return new AccountDebitLoveWrapper$$Parcelable(AccountDebitLoveWrapper$$Parcelable.read(parcel, new C42027a()));
        }

        public AccountDebitLoveWrapper$$Parcelable[] newArray(int i) {
            return new AccountDebitLoveWrapper$$Parcelable[i];
        }
    };
    private AccountDebitLoveWrapper accountDebitLoveWrapper$$0;

    public AccountDebitLoveWrapper$$Parcelable(AccountDebitLoveWrapper accountDebitLoveWrapper) {
        this.accountDebitLoveWrapper$$0 = accountDebitLoveWrapper;
    }

    public static AccountDebitLoveWrapper read(Parcel parcel, C42027a aVar) {
        ArrayList<AccountLoveDebit> arrayList;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            AccountDebitLoveWrapper accountDebitLoveWrapper = new AccountDebitLoveWrapper();
            aVar.mo97501f(g, accountDebitLoveWrapper);
            int readInt2 = parcel.readInt();
            Class<AccountDebitLoveWrapper$$Parcelable> cls = AccountDebitLoveWrapper$$Parcelable.class;
            ArrayList<AccountLoveDebit> arrayList2 = null;
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList.add((AccountLoveDebit) parcel.readParcelable(cls.getClassLoader()));
                }
            }
            accountDebitLoveWrapper.cardDebits = arrayList;
            int readInt3 = parcel.readInt();
            if (readInt3 >= 0) {
                arrayList2 = new ArrayList<>(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    arrayList2.add((AccountLoveDebit) parcel.readParcelable(cls.getClassLoader()));
                }
            }
            accountDebitLoveWrapper.accounts = arrayList2;
            aVar.mo97501f(readInt, accountDebitLoveWrapper);
            return accountDebitLoveWrapper;
        } else if (!aVar.mo97499d(readInt)) {
            return (AccountDebitLoveWrapper) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(AccountDebitLoveWrapper accountDebitLoveWrapper, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(accountDebitLoveWrapper);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(accountDebitLoveWrapper));
        ArrayList<AccountLoveDebit> arrayList = accountDebitLoveWrapper.cardDebits;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<AccountLoveDebit> it = accountDebitLoveWrapper.cardDebits.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        ArrayList<AccountLoveDebit> arrayList2 = accountDebitLoveWrapper.accounts;
        if (arrayList2 == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(arrayList2.size());
        Iterator<AccountLoveDebit> it2 = accountDebitLoveWrapper.accounts.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.accountDebitLoveWrapper$$0, parcel, i, new C42027a());
    }

    public AccountDebitLoveWrapper getParcel() {
        return this.accountDebitLoveWrapper$$0;
    }
}
