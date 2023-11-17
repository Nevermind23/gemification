package p341ge.bog.mobilebank.model.account;

import android.os.Parcelable;
import org.parceler.Parcel;
import p277ua.C8664c;

@Parcel
/* renamed from: ge.bog.mobilebank.model.account.AccountLovContainer */
public class AccountLovContainer implements Parcelable {
    public static final Parcelable.Creator<AccountLovContainer> CREATOR = new Parcelable.Creator<AccountLovContainer>() {
        public AccountLovContainer createFromParcel(android.os.Parcel parcel) {
            return new AccountLovContainer(parcel);
        }

        public AccountLovContainer[] newArray(int i) {
            return new AccountLovContainer[i];
        }
    };
    @C8664c("PAYMENT_WITHIN_BANK")
    AccountLovHolder bank;
    @C8664c("PAYMENT_CONVERSION")
    AccountLovHolder conversion;
    @C8664c("PAYMENT_OWN_ACCOUNTS")
    AccountLovHolder domestic;
    @C8664c("PAYMENT_FOREIGN")
    AccountLovHolder foreign;
    @C8664c("PAYMENT_WITHIN_GEORGIA")
    AccountLovHolder georgia;

    public AccountLovContainer() {
    }

    public AccountLovContainer copy() {
        AccountLovContainer accountLovContainer = new AccountLovContainer();
        AccountLovHolder accountLovHolder = this.bank;
        if (accountLovHolder != null) {
            accountLovContainer.bank = accountLovHolder.copy();
        }
        AccountLovHolder accountLovHolder2 = this.domestic;
        if (accountLovHolder2 != null) {
            accountLovContainer.domestic = accountLovHolder2.copy();
        }
        AccountLovHolder accountLovHolder3 = this.conversion;
        if (accountLovHolder3 != null) {
            accountLovContainer.conversion = accountLovHolder3.copy();
        }
        AccountLovHolder accountLovHolder4 = this.foreign;
        if (accountLovHolder4 != null) {
            accountLovContainer.foreign = accountLovHolder4.copy();
        }
        AccountLovHolder accountLovHolder5 = this.georgia;
        if (accountLovHolder5 != null) {
            accountLovContainer.georgia = accountLovHolder5.copy();
        }
        return accountLovContainer;
    }

    public int describeContents() {
        return 0;
    }

    public AccountLovHolder getBank() {
        return this.bank;
    }

    public AccountLovHolder getConversion() {
        return this.conversion;
    }

    public AccountLovHolder getDomestic() {
        return this.domestic;
    }

    public AccountLovHolder getGeorgia() {
        return this.georgia;
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.bank, i);
        parcel.writeParcelable(this.domestic, i);
        parcel.writeParcelable(this.conversion, i);
        parcel.writeParcelable(this.foreign, i);
        parcel.writeParcelable(this.georgia, i);
    }

    protected AccountLovContainer(android.os.Parcel parcel) {
        Class<AccountLovHolder> cls = AccountLovHolder.class;
        this.bank = (AccountLovHolder) parcel.readParcelable(cls.getClassLoader());
        this.domestic = (AccountLovHolder) parcel.readParcelable(cls.getClassLoader());
        this.conversion = (AccountLovHolder) parcel.readParcelable(cls.getClassLoader());
        this.foreign = (AccountLovHolder) parcel.readParcelable(cls.getClassLoader());
        this.georgia = (AccountLovHolder) parcel.readParcelable(cls.getClassLoader());
    }
}
