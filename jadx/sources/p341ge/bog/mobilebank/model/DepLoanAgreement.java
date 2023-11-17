package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.DepLoanAgreement */
public final class DepLoanAgreement implements Parcelable {
    public static final Parcelable.Creator<DepLoanAgreement> CREATOR = new Creator();
    private final BigDecimal agreeBalance;
    @C8664c("agree_key")
    private final long agreeKey;
    private final String agreeNo;
    private final double agreeRate;
    private final BigDecimal availableAmount;
    private final String ccy;
    private final long clientKeyMain;
    private final String dictionaryKey;
    private final double intAccrued;
    private final String name;
    private final String prodType;
    private final BigDecimal provAmount;
    private final BigDecimal realAmount;

    /* renamed from: ge.bog.mobilebank.model.DepLoanAgreement$Creator */
    public static final class Creator implements Parcelable.Creator<DepLoanAgreement> {
        public final DepLoanAgreement createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DepLoanAgreement(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readDouble(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readDouble(), parcel.readString());
        }

        public final DepLoanAgreement[] newArray(int i) {
            return new DepLoanAgreement[i];
        }
    }

    public DepLoanAgreement(long j, String str, long j2, String str2, String str3, double d, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str4, double d2, String str5) {
        String str6 = str2;
        String str7 = str3;
        BigDecimal bigDecimal5 = bigDecimal;
        BigDecimal bigDecimal6 = bigDecimal2;
        BigDecimal bigDecimal7 = bigDecimal3;
        BigDecimal bigDecimal8 = bigDecimal4;
        String str8 = str5;
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str6, "agreeNo");
        C41536l.m120489i(str7, "ccy");
        C41536l.m120489i(bigDecimal5, "agreeBalance");
        C41536l.m120489i(bigDecimal6, "realAmount");
        C41536l.m120489i(bigDecimal7, "availableAmount");
        C41536l.m120489i(bigDecimal8, "provAmount");
        C41536l.m120489i(str8, "dictionaryKey");
        this.agreeKey = j;
        this.prodType = str;
        this.clientKeyMain = j2;
        this.agreeNo = str6;
        this.ccy = str7;
        this.agreeRate = d;
        this.agreeBalance = bigDecimal5;
        this.realAmount = bigDecimal6;
        this.availableAmount = bigDecimal7;
        this.provAmount = bigDecimal8;
        this.name = str4;
        this.intAccrued = d2;
        this.dictionaryKey = str8;
    }

    public static /* synthetic */ DepLoanAgreement copy$default(DepLoanAgreement depLoanAgreement, long j, String str, long j2, String str2, String str3, double d, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str4, double d2, String str5, int i, Object obj) {
        DepLoanAgreement depLoanAgreement2 = depLoanAgreement;
        int i2 = i;
        return depLoanAgreement.copy((i2 & 1) != 0 ? depLoanAgreement2.agreeKey : j, (i2 & 2) != 0 ? depLoanAgreement2.prodType : str, (i2 & 4) != 0 ? depLoanAgreement2.clientKeyMain : j2, (i2 & 8) != 0 ? depLoanAgreement2.agreeNo : str2, (i2 & 16) != 0 ? depLoanAgreement2.ccy : str3, (i2 & 32) != 0 ? depLoanAgreement2.agreeRate : d, (i2 & 64) != 0 ? depLoanAgreement2.agreeBalance : bigDecimal, (i2 & 128) != 0 ? depLoanAgreement2.realAmount : bigDecimal2, (i2 & C11398b.f33139r) != 0 ? depLoanAgreement2.availableAmount : bigDecimal3, (i2 & C11398b.f33140s) != 0 ? depLoanAgreement2.provAmount : bigDecimal4, (i2 & C11398b.f33141t) != 0 ? depLoanAgreement2.name : str4, (i2 & C11398b.f33142u) != 0 ? depLoanAgreement2.intAccrued : d2, (i2 & C11398b.f33143v) != 0 ? depLoanAgreement2.dictionaryKey : str5);
    }

    public final long component1() {
        return this.agreeKey;
    }

    public final BigDecimal component10() {
        return this.provAmount;
    }

    public final String component11() {
        return this.name;
    }

    public final double component12() {
        return this.intAccrued;
    }

    public final String component13() {
        return this.dictionaryKey;
    }

    public final String component2() {
        return this.prodType;
    }

    public final long component3() {
        return this.clientKeyMain;
    }

    public final String component4() {
        return this.agreeNo;
    }

    public final String component5() {
        return this.ccy;
    }

    public final double component6() {
        return this.agreeRate;
    }

    public final BigDecimal component7() {
        return this.agreeBalance;
    }

    public final BigDecimal component8() {
        return this.realAmount;
    }

    public final BigDecimal component9() {
        return this.availableAmount;
    }

    public final DepLoanAgreement copy(long j, String str, long j2, String str2, String str3, double d, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str4, double d2, String str5) {
        long j3 = j;
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "agreeNo");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(bigDecimal, "agreeBalance");
        C41536l.m120489i(bigDecimal2, "realAmount");
        C41536l.m120489i(bigDecimal3, "availableAmount");
        C41536l.m120489i(bigDecimal4, "provAmount");
        C41536l.m120489i(str5, "dictionaryKey");
        return new DepLoanAgreement(j, str, j2, str2, str3, d, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, str4, d2, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepLoanAgreement)) {
            return false;
        }
        DepLoanAgreement depLoanAgreement = (DepLoanAgreement) obj;
        return this.agreeKey == depLoanAgreement.agreeKey && C41536l.m120484d(this.prodType, depLoanAgreement.prodType) && this.clientKeyMain == depLoanAgreement.clientKeyMain && C41536l.m120484d(this.agreeNo, depLoanAgreement.agreeNo) && C41536l.m120484d(this.ccy, depLoanAgreement.ccy) && Double.compare(this.agreeRate, depLoanAgreement.agreeRate) == 0 && C41536l.m120484d(this.agreeBalance, depLoanAgreement.agreeBalance) && C41536l.m120484d(this.realAmount, depLoanAgreement.realAmount) && C41536l.m120484d(this.availableAmount, depLoanAgreement.availableAmount) && C41536l.m120484d(this.provAmount, depLoanAgreement.provAmount) && C41536l.m120484d(this.name, depLoanAgreement.name) && Double.compare(this.intAccrued, depLoanAgreement.intAccrued) == 0 && C41536l.m120484d(this.dictionaryKey, depLoanAgreement.dictionaryKey);
    }

    public final BigDecimal getAgreeBalance() {
        return this.agreeBalance;
    }

    public final long getAgreeKey() {
        return this.agreeKey;
    }

    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final double getAgreeRate() {
        return this.agreeRate;
    }

    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getClientKeyMain() {
        return this.clientKeyMain;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final double getIntAccrued() {
        return this.intAccrued;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final BigDecimal getProvAmount() {
        return this.provAmount;
    }

    public final BigDecimal getRealAmount() {
        return this.realAmount;
    }

    public int hashCode() {
        int a = ((((((((((((((((((C7397t.m28148a(this.agreeKey) * 31) + this.prodType.hashCode()) * 31) + C7397t.m28148a(this.clientKeyMain)) * 31) + this.agreeNo.hashCode()) * 31) + this.ccy.hashCode()) * 31) + Double.doubleToLongBits(this.agreeRate)) * 31) + this.agreeBalance.hashCode()) * 31) + this.realAmount.hashCode()) * 31) + this.availableAmount.hashCode()) * 31) + this.provAmount.hashCode()) * 31;
        String str = this.name;
        return ((((a + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.intAccrued)) * 31) + this.dictionaryKey.hashCode();
    }

    public String toString() {
        long j = this.agreeKey;
        String str = this.prodType;
        long j2 = this.clientKeyMain;
        String str2 = this.agreeNo;
        String str3 = this.ccy;
        double d = this.agreeRate;
        BigDecimal bigDecimal = this.agreeBalance;
        BigDecimal bigDecimal2 = this.realAmount;
        BigDecimal bigDecimal3 = this.availableAmount;
        BigDecimal bigDecimal4 = this.provAmount;
        String str4 = this.name;
        double d2 = this.intAccrued;
        String str5 = this.dictionaryKey;
        return "DepLoanAgreement(agreeKey=" + j + ", prodType=" + str + ", clientKeyMain=" + j2 + ", agreeNo=" + str2 + ", ccy=" + str3 + ", agreeRate=" + d + ", agreeBalance=" + bigDecimal + ", realAmount=" + bigDecimal2 + ", availableAmount=" + bigDecimal3 + ", provAmount=" + bigDecimal4 + ", name=" + str4 + ", intAccrued=" + d2 + ", dictionaryKey=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.agreeKey);
        parcel.writeString(this.prodType);
        parcel.writeLong(this.clientKeyMain);
        parcel.writeString(this.agreeNo);
        parcel.writeString(this.ccy);
        parcel.writeDouble(this.agreeRate);
        parcel.writeSerializable(this.agreeBalance);
        parcel.writeSerializable(this.realAmount);
        parcel.writeSerializable(this.availableAmount);
        parcel.writeSerializable(this.provAmount);
        parcel.writeString(this.name);
        parcel.writeDouble(this.intAccrued);
        parcel.writeString(this.dictionaryKey);
    }
}
