package p341ge.bog.mobilebank.model.deposits;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.model.deposits.SavingGoal */
public final class SavingGoal implements Parcelable {
    public static final Parcelable.Creator<SavingGoal> CREATOR = new Creator();
    private final BigDecimal amount;
    private final String ccy;
    private final BigDecimal currentAmount;
    private final String endDate;

    /* renamed from: id */
    private final long f81314id;
    private final int sgcId;

    /* renamed from: ge.bog.mobilebank.model.deposits.SavingGoal$Creator */
    public static final class Creator implements Parcelable.Creator<SavingGoal> {
        public final SavingGoal createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new SavingGoal((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        public final SavingGoal[] newArray(int i) {
            return new SavingGoal[i];
        }
    }

    public SavingGoal(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, long j, int i, String str2) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(bigDecimal2, "currentAmount");
        C41536l.m120489i(str, "endDate");
        this.amount = bigDecimal;
        this.currentAmount = bigDecimal2;
        this.endDate = str;
        this.f81314id = j;
        this.sgcId = i;
        this.ccy = str2;
    }

    public static /* synthetic */ SavingGoal copy$default(SavingGoal savingGoal, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, long j, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bigDecimal = savingGoal.amount;
        }
        if ((i2 & 2) != 0) {
            bigDecimal2 = savingGoal.currentAmount;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        if ((i2 & 4) != 0) {
            str = savingGoal.endDate;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            j = savingGoal.f81314id;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            i = savingGoal.sgcId;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str2 = savingGoal.ccy;
        }
        return savingGoal.copy(bigDecimal, bigDecimal3, str3, j2, i3, str2);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final BigDecimal component2() {
        return this.currentAmount;
    }

    public final String component3() {
        return this.endDate;
    }

    public final long component4() {
        return this.f81314id;
    }

    public final int component5() {
        return this.sgcId;
    }

    public final String component6() {
        return this.ccy;
    }

    public final SavingGoal copy(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, long j, int i, String str2) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(bigDecimal2, "currentAmount");
        C41536l.m120489i(str, "endDate");
        return new SavingGoal(bigDecimal, bigDecimal2, str, j, i, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingGoal)) {
            return false;
        }
        SavingGoal savingGoal = (SavingGoal) obj;
        return C41536l.m120484d(this.amount, savingGoal.amount) && C41536l.m120484d(this.currentAmount, savingGoal.currentAmount) && C41536l.m120484d(this.endDate, savingGoal.endDate) && this.f81314id == savingGoal.f81314id && this.sgcId == savingGoal.sgcId && C41536l.m120484d(this.ccy, savingGoal.ccy);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final BigDecimal getCurrentAmount() {
        return this.currentAmount;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final long getId() {
        return this.f81314id;
    }

    public final int getSgcId() {
        return this.sgcId;
    }

    public int hashCode() {
        int hashCode = ((((((((this.amount.hashCode() * 31) + this.currentAmount.hashCode()) * 31) + this.endDate.hashCode()) * 31) + C7397t.m28148a(this.f81314id)) * 31) + this.sgcId) * 31;
        String str = this.ccy;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        BigDecimal bigDecimal2 = this.currentAmount;
        String str = this.endDate;
        long j = this.f81314id;
        int i = this.sgcId;
        String str2 = this.ccy;
        return "SavingGoal(amount=" + bigDecimal + ", currentAmount=" + bigDecimal2 + ", endDate=" + str + ", id=" + j + ", sgcId=" + i + ", ccy=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeSerializable(this.amount);
        parcel.writeSerializable(this.currentAmount);
        parcel.writeString(this.endDate);
        parcel.writeLong(this.f81314id);
        parcel.writeInt(this.sgcId);
        parcel.writeString(this.ccy);
    }
}
