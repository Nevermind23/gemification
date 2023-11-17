package p341ge.bog.mobilebank.eventbus.events;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.eventbus.RootEvent$$PackageHelper;
import p341ge.bog.mobilebank.model.account.AccountDebitLoveWrapper;
import p341ge.bog.mobilebank.model.account.AccountLovContainer;

/* renamed from: ge.bog.mobilebank.eventbus.events.AccountLovEvent$$Parcelable */
public class AccountLovEvent$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<AccountLovEvent$$Parcelable> CREATOR = new Parcelable.Creator<AccountLovEvent$$Parcelable>() {
        public AccountLovEvent$$Parcelable createFromParcel(Parcel parcel) {
            return new AccountLovEvent$$Parcelable(AccountLovEvent$$Parcelable.read(parcel, new C42027a()));
        }

        public AccountLovEvent$$Parcelable[] newArray(int i) {
            return new AccountLovEvent$$Parcelable[i];
        }
    };
    private AccountLovEvent accountLovEvent$$0;

    public AccountLovEvent$$Parcelable(AccountLovEvent accountLovEvent) {
        this.accountLovEvent$$0 = accountLovEvent;
    }

    public static AccountLovEvent read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            AccountLovEvent accountLovEvent = new AccountLovEvent();
            aVar.mo97501f(g, accountLovEvent);
            Class<AccountLovEvent$$Parcelable> cls = AccountLovEvent$$Parcelable.class;
            accountLovEvent.accountDebitLoveWrapper = (AccountDebitLoveWrapper) parcel.readParcelable(cls.getClassLoader());
            accountLovEvent.accountLovContainer = (AccountLovContainer) parcel.readParcelable(cls.getClassLoader());
            RootEvent$$PackageHelper.accessRootEvent$FS$errorKey(accountLovEvent, parcel.readString());
            accountLovEvent.errorCode = parcel.readString();
            RootEvent$$PackageHelper.accessRootEvent$FS$currentState(accountLovEvent, parcel.readInt());
            RootEvent$$PackageHelper.accessRootEvent$FS$error(accountLovEvent, parcel.readString());
            aVar.mo97501f(readInt, accountLovEvent);
            return accountLovEvent;
        } else if (!aVar.mo97499d(readInt)) {
            return (AccountLovEvent) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(AccountLovEvent accountLovEvent, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(accountLovEvent);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(accountLovEvent));
        parcel.writeParcelable(accountLovEvent.accountDebitLoveWrapper, i);
        parcel.writeParcelable(accountLovEvent.accountLovContainer, i);
        parcel.writeString(RootEvent$$PackageHelper.accessRootEvent$FG$errorKey(accountLovEvent));
        parcel.writeString(accountLovEvent.errorCode);
        parcel.writeInt(RootEvent$$PackageHelper.accessRootEvent$FG$currentState(accountLovEvent));
        parcel.writeString(RootEvent$$PackageHelper.accessRootEvent$FG$error(accountLovEvent));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.accountLovEvent$$0, parcel, i, new C42027a());
    }

    public AccountLovEvent getParcel() {
        return this.accountLovEvent$$0;
    }
}
