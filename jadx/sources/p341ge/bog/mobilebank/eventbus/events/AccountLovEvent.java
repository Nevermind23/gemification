package p341ge.bog.mobilebank.eventbus.events;

import android.os.Parcelable;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.account.AccountDebitLoveWrapper;
import p341ge.bog.mobilebank.model.account.AccountLovContainer;

@Parcel
/* renamed from: ge.bog.mobilebank.eventbus.events.AccountLovEvent */
public class AccountLovEvent extends RootEvent implements Parcelable {
    public static final Parcelable.Creator<AccountLovEvent> CREATOR = new Parcelable.Creator<AccountLovEvent>() {
        public AccountLovEvent createFromParcel(android.os.Parcel parcel) {
            return new AccountLovEvent(parcel);
        }

        public AccountLovEvent[] newArray(int i) {
            return new AccountLovEvent[i];
        }
    };
    AccountDebitLoveWrapper accountDebitLoveWrapper;
    AccountLovContainer accountLovContainer;

    public AccountLovEvent() {
    }

    public AccountLovEvent copy() {
        AccountLovEvent accountLovEvent = new AccountLovEvent();
        accountLovEvent.accountLovContainer = this.accountLovContainer.copy();
        accountLovEvent.accountDebitLoveWrapper = this.accountDebitLoveWrapper;
        accountLovEvent.setState(getState());
        accountLovEvent.setErrorKey(getErrorKey());
        accountLovEvent.errorCode = this.errorCode;
        return accountLovEvent;
    }

    public int describeContents() {
        return 0;
    }

    public AccountDebitLoveWrapper getAccountDebitLoveWrapper() {
        return this.accountDebitLoveWrapper;
    }

    public AccountLovContainer getAccountLovContainer() {
        return this.accountLovContainer;
    }

    public void setAccountDebitLoveWrapper(AccountDebitLoveWrapper accountDebitLoveWrapper2) {
        this.accountDebitLoveWrapper = accountDebitLoveWrapper2;
    }

    public void setAccountLovContainer(AccountLovContainer accountLovContainer2) {
        this.accountLovContainer = accountLovContainer2;
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.accountLovContainer, i);
        parcel.writeParcelable(this.accountDebitLoveWrapper, i);
    }

    protected AccountLovEvent(android.os.Parcel parcel) {
        this.accountLovContainer = (AccountLovContainer) parcel.readParcelable(AccountLovContainer.class.getClassLoader());
        this.accountDebitLoveWrapper = (AccountDebitLoveWrapper) parcel.readParcelable(AccountDebitLoveWrapper.class.getClassLoader());
    }
}
