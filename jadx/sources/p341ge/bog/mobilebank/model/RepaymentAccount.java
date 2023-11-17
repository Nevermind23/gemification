package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.model.RepaymentAccount */
public final class RepaymentAccount implements Parcelable {
    public static final Parcelable.Creator<RepaymentAccount> CREATOR = new Creator();
    private final long acctKey;
    private final String acctName;
    private final String acctNo;
    private final BigDecimal availableAmount;
    private final String ccy;
    private final long mainAcctKey;
    private final BigDecimal realAmount;

    /* renamed from: ge.bog.mobilebank.model.RepaymentAccount$Creator */
    public static final class Creator implements Parcelable.Creator<RepaymentAccount> {
        public final RepaymentAccount createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new RepaymentAccount(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readLong(), (BigDecimal) parcel.readSerializable());
        }

        public final RepaymentAccount[] newArray(int i) {
            return new RepaymentAccount[i];
        }
    }

    public RepaymentAccount(long j, String str, String str2, String str3, BigDecimal bigDecimal, long j2, BigDecimal bigDecimal2) {
        C41536l.m120489i(str, "acctNo");
        C41536l.m120489i(str2, "acctName");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(bigDecimal, "availableAmount");
        C41536l.m120489i(bigDecimal2, "realAmount");
        this.acctKey = j;
        this.acctNo = str;
        this.acctName = str2;
        this.ccy = str3;
        this.availableAmount = bigDecimal;
        this.mainAcctKey = j2;
        this.realAmount = bigDecimal2;
    }

    public static /* synthetic */ RepaymentAccount copy$default(RepaymentAccount repaymentAccount, long j, String str, String str2, String str3, BigDecimal bigDecimal, long j2, BigDecimal bigDecimal2, int i, Object obj) {
        RepaymentAccount repaymentAccount2 = repaymentAccount;
        return repaymentAccount.copy((i & 1) != 0 ? repaymentAccount2.acctKey : j, (i & 2) != 0 ? repaymentAccount2.acctNo : str, (i & 4) != 0 ? repaymentAccount2.acctName : str2, (i & 8) != 0 ? repaymentAccount2.ccy : str3, (i & 16) != 0 ? repaymentAccount2.availableAmount : bigDecimal, (i & 32) != 0 ? repaymentAccount2.mainAcctKey : j2, (i & 64) != 0 ? repaymentAccount2.realAmount : bigDecimal2);
    }

    public final long component1() {
        return this.acctKey;
    }

    public final String component2() {
        return this.acctNo;
    }

    public final String component3() {
        return this.acctName;
    }

    public final String component4() {
        return this.ccy;
    }

    public final BigDecimal component5() {
        return this.availableAmount;
    }

    public final long component6() {
        return this.mainAcctKey;
    }

    public final BigDecimal component7() {
        return this.realAmount;
    }

    public final RepaymentAccount copy(long j, String str, String str2, String str3, BigDecimal bigDecimal, long j2, BigDecimal bigDecimal2) {
        C41536l.m120489i(str, "acctNo");
        C41536l.m120489i(str2, "acctName");
        String str4 = str3;
        C41536l.m120489i(str4, "ccy");
        BigDecimal bigDecimal3 = bigDecimal;
        C41536l.m120489i(bigDecimal3, "availableAmount");
        BigDecimal bigDecimal4 = bigDecimal2;
        C41536l.m120489i(bigDecimal4, "realAmount");
        return new RepaymentAccount(j, str, str2, str4, bigDecimal3, j2, bigDecimal4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepaymentAccount)) {
            return false;
        }
        RepaymentAccount repaymentAccount = (RepaymentAccount) obj;
        return this.acctKey == repaymentAccount.acctKey && C41536l.m120484d(this.acctNo, repaymentAccount.acctNo) && C41536l.m120484d(this.acctName, repaymentAccount.acctName) && C41536l.m120484d(this.ccy, repaymentAccount.ccy) && C41536l.m120484d(this.availableAmount, repaymentAccount.availableAmount) && this.mainAcctKey == repaymentAccount.mainAcctKey && C41536l.m120484d(this.realAmount, repaymentAccount.realAmount);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctName() {
        return this.acctName;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getMainAcctKey() {
        return this.mainAcctKey;
    }

    public final BigDecimal getRealAmount() {
        return this.realAmount;
    }

    public int hashCode() {
        return (((((((((((C7397t.m28148a(this.acctKey) * 31) + this.acctNo.hashCode()) * 31) + this.acctName.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.availableAmount.hashCode()) * 31) + C7397t.m28148a(this.mainAcctKey)) * 31) + this.realAmount.hashCode();
    }

    public String toString() {
        long j = this.acctKey;
        String str = this.acctNo;
        String str2 = this.acctName;
        String str3 = this.ccy;
        BigDecimal bigDecimal = this.availableAmount;
        long j2 = this.mainAcctKey;
        BigDecimal bigDecimal2 = this.realAmount;
        return "RepaymentAccount(acctKey=" + j + ", acctNo=" + str + ", acctName=" + str2 + ", ccy=" + str3 + ", availableAmount=" + bigDecimal + ", mainAcctKey=" + j2 + ", realAmount=" + bigDecimal2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.acctKey);
        parcel.writeString(this.acctNo);
        parcel.writeString(this.acctName);
        parcel.writeString(this.ccy);
        parcel.writeSerializable(this.availableAmount);
        parcel.writeLong(this.mainAcctKey);
        parcel.writeSerializable(this.realAmount);
    }
}
