package p341ge.bog.mobilebank.model.account;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.account.AccountLovHolder$$Parcelable */
public class AccountLovHolder$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<AccountLovHolder$$Parcelable> CREATOR = new Parcelable.Creator<AccountLovHolder$$Parcelable>() {
        public AccountLovHolder$$Parcelable createFromParcel(Parcel parcel) {
            return new AccountLovHolder$$Parcelable(AccountLovHolder$$Parcelable.read(parcel, new C42027a()));
        }

        public AccountLovHolder$$Parcelable[] newArray(int i) {
            return new AccountLovHolder$$Parcelable[i];
        }
    };
    private AccountLovHolder accountLovHolder$$0;

    public AccountLovHolder$$Parcelable(AccountLovHolder accountLovHolder) {
        this.accountLovHolder$$0 = accountLovHolder;
    }

    public static AccountLovHolder read(Parcel parcel, C42027a aVar) {
        ArrayList<AccountLov> arrayList;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            AccountLovHolder accountLovHolder = new AccountLovHolder();
            aVar.mo97501f(g, accountLovHolder);
            accountLovHolder.amountLimit = (BigDecimal) parcel.readSerializable();
            int readInt2 = parcel.readInt();
            Class<AccountLovHolder$$Parcelable> cls = AccountLovHolder$$Parcelable.class;
            ArrayList<AccountLov> arrayList2 = null;
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList.add((AccountLov) parcel.readParcelable(cls.getClassLoader()));
                }
            }
            accountLovHolder.dst = arrayList;
            int readInt3 = parcel.readInt();
            if (readInt3 >= 0) {
                arrayList2 = new ArrayList<>(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    arrayList2.add((AccountLov) parcel.readParcelable(cls.getClassLoader()));
                }
            }
            accountLovHolder.src = arrayList2;
            aVar.mo97501f(readInt, accountLovHolder);
            return accountLovHolder;
        } else if (!aVar.mo97499d(readInt)) {
            return (AccountLovHolder) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(AccountLovHolder accountLovHolder, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(accountLovHolder);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(accountLovHolder));
        parcel.writeSerializable(accountLovHolder.amountLimit);
        ArrayList<AccountLov> arrayList = accountLovHolder.dst;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<AccountLov> it = accountLovHolder.dst.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        ArrayList<AccountLov> arrayList2 = accountLovHolder.src;
        if (arrayList2 == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(arrayList2.size());
        Iterator<AccountLov> it2 = accountLovHolder.src.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.accountLovHolder$$0, parcel, i, new C42027a());
    }

    public AccountLovHolder getParcel() {
        return this.accountLovHolder$$0;
    }
}
