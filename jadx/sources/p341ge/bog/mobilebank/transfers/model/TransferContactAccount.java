package p341ge.bog.mobilebank.transfers.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.transfers.model.TransferContactAccount */
public final class TransferContactAccount implements Parcelable {
    public static final Parcelable.Creator<TransferContactAccount> CREATOR = new Creator();
    private final String accountNumber;
    private final int bankDrawableRes;
    private final String budgetName;
    private final boolean isFavorite;

    /* renamed from: ge.bog.mobilebank.transfers.model.TransferContactAccount$Creator */
    public static final class Creator implements Parcelable.Creator<TransferContactAccount> {
        public final TransferContactAccount createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new TransferContactAccount(parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        public final TransferContactAccount[] newArray(int i) {
            return new TransferContactAccount[i];
        }
    }

    public TransferContactAccount(int i, String str, boolean z, String str2) {
        C41536l.m120489i(str, "accountNumber");
        this.bankDrawableRes = i;
        this.accountNumber = str;
        this.isFavorite = z;
        this.budgetName = str2;
    }

    public static /* synthetic */ TransferContactAccount copy$default(TransferContactAccount transferContactAccount, int i, String str, boolean z, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = transferContactAccount.bankDrawableRes;
        }
        if ((i2 & 2) != 0) {
            str = transferContactAccount.accountNumber;
        }
        if ((i2 & 4) != 0) {
            z = transferContactAccount.isFavorite;
        }
        if ((i2 & 8) != 0) {
            str2 = transferContactAccount.budgetName;
        }
        return transferContactAccount.copy(i, str, z, str2);
    }

    public final int component1() {
        return this.bankDrawableRes;
    }

    public final String component2() {
        return this.accountNumber;
    }

    public final boolean component3() {
        return this.isFavorite;
    }

    public final String component4() {
        return this.budgetName;
    }

    public final TransferContactAccount copy(int i, String str, boolean z, String str2) {
        C41536l.m120489i(str, "accountNumber");
        return new TransferContactAccount(i, str, z, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferContactAccount)) {
            return false;
        }
        TransferContactAccount transferContactAccount = (TransferContactAccount) obj;
        return this.bankDrawableRes == transferContactAccount.bankDrawableRes && C41536l.m120484d(this.accountNumber, transferContactAccount.accountNumber) && this.isFavorite == transferContactAccount.isFavorite && C41536l.m120484d(this.budgetName, transferContactAccount.budgetName);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final int getBankDrawableRes() {
        return this.bankDrawableRes;
    }

    public final String getBudgetName() {
        return this.budgetName;
    }

    public int hashCode() {
        int hashCode = ((this.bankDrawableRes * 31) + this.accountNumber.hashCode()) * 31;
        boolean z = this.isFavorite;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.budgetName;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public String toString() {
        int i = this.bankDrawableRes;
        String str = this.accountNumber;
        boolean z = this.isFavorite;
        String str2 = this.budgetName;
        return "TransferContactAccount(bankDrawableRes=" + i + ", accountNumber=" + str + ", isFavorite=" + z + ", budgetName=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.bankDrawableRes);
        parcel.writeString(this.accountNumber);
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeString(this.budgetName);
    }
}
