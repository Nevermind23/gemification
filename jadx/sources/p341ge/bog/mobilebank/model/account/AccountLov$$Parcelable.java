package p341ge.bog.mobilebank.model.account;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.account.AccountLov$$Parcelable */
public class AccountLov$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<AccountLov$$Parcelable> CREATOR = new Parcelable.Creator<AccountLov$$Parcelable>() {
        public AccountLov$$Parcelable createFromParcel(Parcel parcel) {
            return new AccountLov$$Parcelable(AccountLov$$Parcelable.read(parcel, new C42027a()));
        }

        public AccountLov$$Parcelable[] newArray(int i) {
            return new AccountLov$$Parcelable[i];
        }
    };
    private AccountLov accountLov$$0;

    public AccountLov$$Parcelable(AccountLov accountLov) {
        this.accountLov$$0 = accountLov;
    }

    public static AccountLov read(Parcel parcel, C42027a aVar) {
        boolean z;
        ArrayList<AccountLov> arrayList;
        boolean z2;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            AccountLov accountLov = new AccountLov();
            aVar.mo97501f(g, accountLov);
            accountLov.attachmentUrl = parcel.readString();
            accountLov.mainAcctKey = parcel.readLong();
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            accountLov.hasDeposit = z;
            accountLov.realAmount = (BigDecimal) parcel.readSerializable();
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                ArrayList<AccountLov> arrayList2 = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList2.add((AccountLov) parcel.readParcelable(AccountLov$$Parcelable.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            accountLov.subAccounts = arrayList;
            accountLov.isDefault = parcel.readString();
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            accountLov.isCreditCard = z2;
            accountLov.acctNo = parcel.readString();
            accountLov.productCode = parcel.readString();
            accountLov.availableAmount = (BigDecimal) parcel.readSerializable();
            accountLov.productGroup = parcel.readString();
            accountLov.name = parcel.readString();
            accountLov.ccy = parcel.readString();
            accountLov.f81298id = parcel.readLong();
            accountLov.attachmentId = parcel.readString();
            if (parcel.readInt() == 1) {
                z3 = true;
            }
            accountLov.isForCreditSTO = z3;
            aVar.mo97501f(readInt, accountLov);
            return accountLov;
        } else if (!aVar.mo97499d(readInt)) {
            return (AccountLov) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(AccountLov accountLov, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(accountLov);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(accountLov));
        parcel.writeString(accountLov.attachmentUrl);
        parcel.writeLong(accountLov.mainAcctKey);
        parcel.writeInt(accountLov.hasDeposit ? 1 : 0);
        parcel.writeSerializable(accountLov.realAmount);
        ArrayList<AccountLov> arrayList = accountLov.subAccounts;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<AccountLov> it = accountLov.subAccounts.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        parcel.writeString(accountLov.isDefault);
        parcel.writeInt(accountLov.isCreditCard ? 1 : 0);
        parcel.writeString(accountLov.acctNo);
        parcel.writeString(accountLov.productCode);
        parcel.writeSerializable(accountLov.availableAmount);
        parcel.writeString(accountLov.productGroup);
        parcel.writeString(accountLov.name);
        parcel.writeString(accountLov.ccy);
        parcel.writeLong(accountLov.f81298id);
        parcel.writeString(accountLov.attachmentId);
        parcel.writeInt(accountLov.isForCreditSTO ? 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.accountLov$$0, parcel, i, new C42027a());
    }

    public AccountLov getParcel() {
        return this.accountLov$$0;
    }
}
