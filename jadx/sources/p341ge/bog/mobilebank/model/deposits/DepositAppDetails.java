package p341ge.bog.mobilebank.model.deposits;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.model.deposits.DepositAppDetails */
public final class DepositAppDetails implements Parcelable {
    public static final Parcelable.Creator<DepositAppDetails> CREATOR = new Creator();
    public Long appId;
    public List<BreakRate> breakRates;
    public List<ContractDetail> contractDetails;
    public List<ContractRate> contractRates;
    public String depositName;
    public BigDecimal intRateBase;
    public BigDecimal irr2;
    public PreBreakRate preBreakRates;
    public PreContractRate preContractRates;

    @Keep
    /* renamed from: ge.bog.mobilebank.model.deposits.DepositAppDetails$BreakRate */
    public static final class BreakRate implements Parcelable {
        public static final Parcelable.Creator<BreakRate> CREATOR = new Creator();
        public Long agreeKey;
        public BigDecimal intRate;
        public Long maxLen;
        public String maxLenUnit;
        public Long minLen;
        public String minLenUnit;

        /* renamed from: ge.bog.mobilebank.model.deposits.DepositAppDetails$BreakRate$Creator */
        public static final class Creator implements Parcelable.Creator<BreakRate> {
            public final BreakRate createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new BreakRate(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (BigDecimal) parcel.readSerializable());
            }

            public final BreakRate[] newArray(int i) {
                return new BreakRate[i];
            }
        }

        public BreakRate() {
            this((Long) null, (Long) null, (String) null, (Long) null, (String) null, (BigDecimal) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ BreakRate copy$default(BreakRate breakRate, Long l, Long l2, String str, Long l3, String str2, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                l = breakRate.agreeKey;
            }
            if ((i & 2) != 0) {
                l2 = breakRate.minLen;
            }
            Long l4 = l2;
            if ((i & 4) != 0) {
                str = breakRate.minLenUnit;
            }
            String str3 = str;
            if ((i & 8) != 0) {
                l3 = breakRate.maxLen;
            }
            Long l5 = l3;
            if ((i & 16) != 0) {
                str2 = breakRate.maxLenUnit;
            }
            String str4 = str2;
            if ((i & 32) != 0) {
                bigDecimal = breakRate.intRate;
            }
            return breakRate.copy(l, l4, str3, l5, str4, bigDecimal);
        }

        public final Long component1() {
            return this.agreeKey;
        }

        public final Long component2() {
            return this.minLen;
        }

        public final String component3() {
            return this.minLenUnit;
        }

        public final Long component4() {
            return this.maxLen;
        }

        public final String component5() {
            return this.maxLenUnit;
        }

        public final BigDecimal component6() {
            return this.intRate;
        }

        public final BreakRate copy(Long l, Long l2, String str, Long l3, String str2, BigDecimal bigDecimal) {
            return new BreakRate(l, l2, str, l3, str2, bigDecimal);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BreakRate)) {
                return false;
            }
            BreakRate breakRate = (BreakRate) obj;
            return C41536l.m120484d(this.agreeKey, breakRate.agreeKey) && C41536l.m120484d(this.minLen, breakRate.minLen) && C41536l.m120484d(this.minLenUnit, breakRate.minLenUnit) && C41536l.m120484d(this.maxLen, breakRate.maxLen) && C41536l.m120484d(this.maxLenUnit, breakRate.maxLenUnit) && C41536l.m120484d(this.intRate, breakRate.intRate);
        }

        public int hashCode() {
            Long l = this.agreeKey;
            int i = 0;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.minLen;
            int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str = this.minLenUnit;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l3 = this.maxLen;
            int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
            String str2 = this.maxLenUnit;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BigDecimal bigDecimal = this.intRate;
            if (bigDecimal != null) {
                i = bigDecimal.hashCode();
            }
            return hashCode5 + i;
        }

        public String toString() {
            Long l = this.agreeKey;
            Long l2 = this.minLen;
            String str = this.minLenUnit;
            Long l3 = this.maxLen;
            String str2 = this.maxLenUnit;
            BigDecimal bigDecimal = this.intRate;
            return "BreakRate(agreeKey=" + l + ", minLen=" + l2 + ", minLenUnit=" + str + ", maxLen=" + l3 + ", maxLenUnit=" + str2 + ", intRate=" + bigDecimal + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            Long l = this.agreeKey;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            Long l2 = this.minLen;
            if (l2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l2.longValue());
            }
            parcel.writeString(this.minLenUnit);
            Long l3 = this.maxLen;
            if (l3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l3.longValue());
            }
            parcel.writeString(this.maxLenUnit);
            parcel.writeSerializable(this.intRate);
        }

        public BreakRate(Long l, Long l2, String str, Long l3, String str2, BigDecimal bigDecimal) {
            this.agreeKey = l;
            this.minLen = l2;
            this.minLenUnit = str;
            this.maxLen = l3;
            this.maxLenUnit = str2;
            this.intRate = bigDecimal;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ BreakRate(java.lang.Long r6, java.lang.Long r7, java.lang.String r8, java.lang.Long r9, java.lang.String r10, java.math.BigDecimal r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r5 = this;
                r13 = r12 & 1
                r0 = 0
                if (r13 == 0) goto L_0x0007
                r13 = r0
                goto L_0x0008
            L_0x0007:
                r13 = r6
            L_0x0008:
                r6 = r12 & 2
                if (r6 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r7
            L_0x000f:
                r6 = r12 & 4
                if (r6 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r8
            L_0x0016:
                r6 = r12 & 8
                if (r6 == 0) goto L_0x001c
                r3 = r0
                goto L_0x001d
            L_0x001c:
                r3 = r9
            L_0x001d:
                r6 = r12 & 16
                if (r6 == 0) goto L_0x0023
                r4 = r0
                goto L_0x0024
            L_0x0023:
                r4 = r10
            L_0x0024:
                r6 = r12 & 32
                if (r6 == 0) goto L_0x002a
                r12 = r0
                goto L_0x002b
            L_0x002a:
                r12 = r11
            L_0x002b:
                r6 = r5
                r7 = r13
                r8 = r1
                r9 = r2
                r10 = r3
                r11 = r4
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.deposits.DepositAppDetails.BreakRate.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.math.BigDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Keep
    /* renamed from: ge.bog.mobilebank.model.deposits.DepositAppDetails$ContractRate */
    public static final class ContractRate implements Parcelable {
        public static final Parcelable.Creator<ContractRate> CREATOR = new Creator();
        public long agreeKey;
        public String agreeNo;
        public BigDecimal balance;
        public BigDecimal intRate;
        public BigDecimal minBalance;

        /* renamed from: ge.bog.mobilebank.model.deposits.DepositAppDetails$ContractRate$Creator */
        public static final class Creator implements Parcelable.Creator<ContractRate> {
            public final ContractRate createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new ContractRate(parcel.readLong(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            public final ContractRate[] newArray(int i) {
                return new ContractRate[i];
            }
        }

        public ContractRate() {
            this(0, (String) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ ContractRate copy$default(ContractRate contractRate, long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = contractRate.agreeKey;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = contractRate.agreeNo;
            }
            String str2 = str;
            if ((i & 4) != 0) {
                bigDecimal = contractRate.minBalance;
            }
            BigDecimal bigDecimal4 = bigDecimal;
            if ((i & 8) != 0) {
                bigDecimal2 = contractRate.balance;
            }
            BigDecimal bigDecimal5 = bigDecimal2;
            if ((i & 16) != 0) {
                bigDecimal3 = contractRate.intRate;
            }
            return contractRate.copy(j2, str2, bigDecimal4, bigDecimal5, bigDecimal3);
        }

        public final long component1() {
            return this.agreeKey;
        }

        public final String component2() {
            return this.agreeNo;
        }

        public final BigDecimal component3() {
            return this.minBalance;
        }

        public final BigDecimal component4() {
            return this.balance;
        }

        public final BigDecimal component5() {
            return this.intRate;
        }

        public final ContractRate copy(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
            return new ContractRate(j, str, bigDecimal, bigDecimal2, bigDecimal3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContractRate)) {
                return false;
            }
            ContractRate contractRate = (ContractRate) obj;
            return this.agreeKey == contractRate.agreeKey && C41536l.m120484d(this.agreeNo, contractRate.agreeNo) && C41536l.m120484d(this.minBalance, contractRate.minBalance) && C41536l.m120484d(this.balance, contractRate.balance) && C41536l.m120484d(this.intRate, contractRate.intRate);
        }

        public int hashCode() {
            int a = C7397t.m28148a(this.agreeKey) * 31;
            String str = this.agreeNo;
            int i = 0;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            BigDecimal bigDecimal = this.minBalance;
            int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.balance;
            int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.intRate;
            if (bigDecimal3 != null) {
                i = bigDecimal3.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            long j = this.agreeKey;
            String str = this.agreeNo;
            BigDecimal bigDecimal = this.minBalance;
            BigDecimal bigDecimal2 = this.balance;
            BigDecimal bigDecimal3 = this.intRate;
            return "ContractRate(agreeKey=" + j + ", agreeNo=" + str + ", minBalance=" + bigDecimal + ", balance=" + bigDecimal2 + ", intRate=" + bigDecimal3 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeLong(this.agreeKey);
            parcel.writeString(this.agreeNo);
            parcel.writeSerializable(this.minBalance);
            parcel.writeSerializable(this.balance);
            parcel.writeSerializable(this.intRate);
        }

        public ContractRate(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
            this.agreeKey = j;
            this.agreeNo = str;
            this.minBalance = bigDecimal;
            this.balance = bigDecimal2;
            this.intRate = bigDecimal3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ContractRate(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bigDecimal, (i & 8) != 0 ? null : bigDecimal2, (i & 16) != 0 ? null : bigDecimal3);
        }
    }

    /* renamed from: ge.bog.mobilebank.model.deposits.DepositAppDetails$Creator */
    public static final class Creator implements Parcelable.Creator<DepositAppDetails> {
        public final DepositAppDetails createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            C41536l.m120489i(parcel, "parcel");
            ArrayList arrayList3 = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String readString = parcel.readString();
            PreBreakRate createFromParcel = parcel.readInt() == 0 ? null : PreBreakRate.CREATOR.createFromParcel(parcel);
            PreContractRate createFromParcel2 = parcel.readInt() == 0 ? null : PreContractRate.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(BreakRate.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(ContractRate.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList3.add(ContractDetail.CREATOR.createFromParcel(parcel));
                }
            }
            return new DepositAppDetails(valueOf, bigDecimal, bigDecimal2, readString, createFromParcel, createFromParcel2, arrayList, arrayList2, arrayList3);
        }

        public final DepositAppDetails[] newArray(int i) {
            return new DepositAppDetails[i];
        }
    }

    @Keep
    /* renamed from: ge.bog.mobilebank.model.deposits.DepositAppDetails$PreBreakRate */
    public static final class PreBreakRate implements Parcelable {
        public static final Parcelable.Creator<PreBreakRate> CREATOR = new Creator();
        public BigDecimal amountMax;
        public BigDecimal amountMin;
        public String ccy;
        public BigDecimal intRate;
        public Long maxLen;
        public String maxLenUnit;
        public Long minLen;
        public String minLenUnit;
        public Long prodId;

        /* renamed from: ge.bog.mobilebank.model.deposits.DepositAppDetails$PreBreakRate$Creator */
        public static final class Creator implements Parcelable.Creator<PreBreakRate> {
            public final PreBreakRate createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new PreBreakRate(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString());
            }

            public final PreBreakRate[] newArray(int i) {
                return new PreBreakRate[i];
            }
        }

        public PreBreakRate() {
            this((Long) null, (Long) null, (String) null, (Long) null, (String) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (String) null, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ PreBreakRate copy$default(PreBreakRate preBreakRate, Long l, Long l2, String str, Long l3, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str3, int i, Object obj) {
            PreBreakRate preBreakRate2 = preBreakRate;
            int i2 = i;
            return preBreakRate.copy((i2 & 1) != 0 ? preBreakRate2.prodId : l, (i2 & 2) != 0 ? preBreakRate2.minLen : l2, (i2 & 4) != 0 ? preBreakRate2.minLenUnit : str, (i2 & 8) != 0 ? preBreakRate2.maxLen : l3, (i2 & 16) != 0 ? preBreakRate2.maxLenUnit : str2, (i2 & 32) != 0 ? preBreakRate2.intRate : bigDecimal, (i2 & 64) != 0 ? preBreakRate2.amountMin : bigDecimal2, (i2 & 128) != 0 ? preBreakRate2.amountMax : bigDecimal3, (i2 & C11398b.f33139r) != 0 ? preBreakRate2.ccy : str3);
        }

        public final Long component1() {
            return this.prodId;
        }

        public final Long component2() {
            return this.minLen;
        }

        public final String component3() {
            return this.minLenUnit;
        }

        public final Long component4() {
            return this.maxLen;
        }

        public final String component5() {
            return this.maxLenUnit;
        }

        public final BigDecimal component6() {
            return this.intRate;
        }

        public final BigDecimal component7() {
            return this.amountMin;
        }

        public final BigDecimal component8() {
            return this.amountMax;
        }

        public final String component9() {
            return this.ccy;
        }

        public final PreBreakRate copy(Long l, Long l2, String str, Long l3, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str3) {
            return new PreBreakRate(l, l2, str, l3, str2, bigDecimal, bigDecimal2, bigDecimal3, str3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreBreakRate)) {
                return false;
            }
            PreBreakRate preBreakRate = (PreBreakRate) obj;
            return C41536l.m120484d(this.prodId, preBreakRate.prodId) && C41536l.m120484d(this.minLen, preBreakRate.minLen) && C41536l.m120484d(this.minLenUnit, preBreakRate.minLenUnit) && C41536l.m120484d(this.maxLen, preBreakRate.maxLen) && C41536l.m120484d(this.maxLenUnit, preBreakRate.maxLenUnit) && C41536l.m120484d(this.intRate, preBreakRate.intRate) && C41536l.m120484d(this.amountMin, preBreakRate.amountMin) && C41536l.m120484d(this.amountMax, preBreakRate.amountMax) && C41536l.m120484d(this.ccy, preBreakRate.ccy);
        }

        public int hashCode() {
            Long l = this.prodId;
            int i = 0;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.minLen;
            int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str = this.minLenUnit;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l3 = this.maxLen;
            int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
            String str2 = this.maxLenUnit;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BigDecimal bigDecimal = this.intRate;
            int hashCode6 = (hashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.amountMin;
            int hashCode7 = (hashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.amountMax;
            int hashCode8 = (hashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            String str3 = this.ccy;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode8 + i;
        }

        public String toString() {
            Long l = this.prodId;
            Long l2 = this.minLen;
            String str = this.minLenUnit;
            Long l3 = this.maxLen;
            String str2 = this.maxLenUnit;
            BigDecimal bigDecimal = this.intRate;
            BigDecimal bigDecimal2 = this.amountMin;
            BigDecimal bigDecimal3 = this.amountMax;
            String str3 = this.ccy;
            return "PreBreakRate(prodId=" + l + ", minLen=" + l2 + ", minLenUnit=" + str + ", maxLen=" + l3 + ", maxLenUnit=" + str2 + ", intRate=" + bigDecimal + ", amountMin=" + bigDecimal2 + ", amountMax=" + bigDecimal3 + ", ccy=" + str3 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            Long l = this.prodId;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            Long l2 = this.minLen;
            if (l2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l2.longValue());
            }
            parcel.writeString(this.minLenUnit);
            Long l3 = this.maxLen;
            if (l3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l3.longValue());
            }
            parcel.writeString(this.maxLenUnit);
            parcel.writeSerializable(this.intRate);
            parcel.writeSerializable(this.amountMin);
            parcel.writeSerializable(this.amountMax);
            parcel.writeString(this.ccy);
        }

        public PreBreakRate(Long l, Long l2, String str, Long l3, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str3) {
            this.prodId = l;
            this.minLen = l2;
            this.minLenUnit = str;
            this.maxLen = l3;
            this.maxLenUnit = str2;
            this.intRate = bigDecimal;
            this.amountMin = bigDecimal2;
            this.amountMax = bigDecimal3;
            this.ccy = str3;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ PreBreakRate(java.lang.Long r11, java.lang.Long r12, java.lang.String r13, java.lang.Long r14, java.lang.String r15, java.math.BigDecimal r16, java.math.BigDecimal r17, java.math.BigDecimal r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r10 = this;
                r0 = r20
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000a
            L_0x0009:
                r1 = r11
            L_0x000a:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0010
                r3 = r2
                goto L_0x0011
            L_0x0010:
                r3 = r12
            L_0x0011:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0017
                r4 = r2
                goto L_0x0018
            L_0x0017:
                r4 = r13
            L_0x0018:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x001e
                r5 = r2
                goto L_0x001f
            L_0x001e:
                r5 = r14
            L_0x001f:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0025
                r6 = r2
                goto L_0x0026
            L_0x0025:
                r6 = r15
            L_0x0026:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x002c
                r7 = r2
                goto L_0x002e
            L_0x002c:
                r7 = r16
            L_0x002e:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0034
                r8 = r2
                goto L_0x0036
            L_0x0034:
                r8 = r17
            L_0x0036:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x003c
                r9 = r2
                goto L_0x003e
            L_0x003c:
                r9 = r18
            L_0x003e:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0043
                goto L_0x0045
            L_0x0043:
                r2 = r19
            L_0x0045:
                r11 = r10
                r12 = r1
                r13 = r3
                r14 = r4
                r15 = r5
                r16 = r6
                r17 = r7
                r18 = r8
                r19 = r9
                r20 = r2
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.deposits.DepositAppDetails.PreBreakRate.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Keep
    /* renamed from: ge.bog.mobilebank.model.deposits.DepositAppDetails$PreContractRate */
    public static final class PreContractRate implements Parcelable {
        public static final Parcelable.Creator<PreContractRate> CREATOR = new Creator();
        public BigDecimal balance;
        public String ccy;
        public BigDecimal intRate;
        public BigDecimal minBalance;
        public Long prodId;

        /* renamed from: ge.bog.mobilebank.model.deposits.DepositAppDetails$PreContractRate$Creator */
        public static final class Creator implements Parcelable.Creator<PreContractRate> {
            public final PreContractRate createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new PreContractRate(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            public final PreContractRate[] newArray(int i) {
                return new PreContractRate[i];
            }
        }

        public PreContractRate() {
            this((Long) null, (String) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ PreContractRate copy$default(PreContractRate preContractRate, Long l, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Object obj) {
            if ((i & 1) != 0) {
                l = preContractRate.prodId;
            }
            if ((i & 2) != 0) {
                str = preContractRate.ccy;
            }
            String str2 = str;
            if ((i & 4) != 0) {
                bigDecimal = preContractRate.minBalance;
            }
            BigDecimal bigDecimal4 = bigDecimal;
            if ((i & 8) != 0) {
                bigDecimal2 = preContractRate.balance;
            }
            BigDecimal bigDecimal5 = bigDecimal2;
            if ((i & 16) != 0) {
                bigDecimal3 = preContractRate.intRate;
            }
            return preContractRate.copy(l, str2, bigDecimal4, bigDecimal5, bigDecimal3);
        }

        public final Long component1() {
            return this.prodId;
        }

        public final String component2() {
            return this.ccy;
        }

        public final BigDecimal component3() {
            return this.minBalance;
        }

        public final BigDecimal component4() {
            return this.balance;
        }

        public final BigDecimal component5() {
            return this.intRate;
        }

        public final PreContractRate copy(Long l, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
            return new PreContractRate(l, str, bigDecimal, bigDecimal2, bigDecimal3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreContractRate)) {
                return false;
            }
            PreContractRate preContractRate = (PreContractRate) obj;
            return C41536l.m120484d(this.prodId, preContractRate.prodId) && C41536l.m120484d(this.ccy, preContractRate.ccy) && C41536l.m120484d(this.minBalance, preContractRate.minBalance) && C41536l.m120484d(this.balance, preContractRate.balance) && C41536l.m120484d(this.intRate, preContractRate.intRate);
        }

        public int hashCode() {
            Long l = this.prodId;
            int i = 0;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            String str = this.ccy;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            BigDecimal bigDecimal = this.minBalance;
            int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.balance;
            int hashCode4 = (hashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.intRate;
            if (bigDecimal3 != null) {
                i = bigDecimal3.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            Long l = this.prodId;
            String str = this.ccy;
            BigDecimal bigDecimal = this.minBalance;
            BigDecimal bigDecimal2 = this.balance;
            BigDecimal bigDecimal3 = this.intRate;
            return "PreContractRate(prodId=" + l + ", ccy=" + str + ", minBalance=" + bigDecimal + ", balance=" + bigDecimal2 + ", intRate=" + bigDecimal3 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            Long l = this.prodId;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeString(this.ccy);
            parcel.writeSerializable(this.minBalance);
            parcel.writeSerializable(this.balance);
            parcel.writeSerializable(this.intRate);
        }

        public PreContractRate(Long l, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
            this.prodId = l;
            this.ccy = str;
            this.minBalance = bigDecimal;
            this.balance = bigDecimal2;
            this.intRate = bigDecimal3;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ PreContractRate(java.lang.Long r5, java.lang.String r6, java.math.BigDecimal r7, java.math.BigDecimal r8, java.math.BigDecimal r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r4 = this;
                r11 = r10 & 1
                r0 = 0
                if (r11 == 0) goto L_0x0007
                r11 = r0
                goto L_0x0008
            L_0x0007:
                r11 = r5
            L_0x0008:
                r5 = r10 & 2
                if (r5 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r6
            L_0x000f:
                r5 = r10 & 4
                if (r5 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r7
            L_0x0016:
                r5 = r10 & 8
                if (r5 == 0) goto L_0x001c
                r3 = r0
                goto L_0x001d
            L_0x001c:
                r3 = r8
            L_0x001d:
                r5 = r10 & 16
                if (r5 == 0) goto L_0x0023
                r10 = r0
                goto L_0x0024
            L_0x0023:
                r10 = r9
            L_0x0024:
                r5 = r4
                r6 = r11
                r7 = r1
                r8 = r2
                r9 = r3
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.deposits.DepositAppDetails.PreContractRate.<init>(java.lang.Long, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    public DepositAppDetails() {
        this((Long) null, (BigDecimal) null, (BigDecimal) null, (String) null, (PreBreakRate) null, (PreContractRate) null, (List) null, (List) null, (List) null, 511, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DepositAppDetails copy$default(DepositAppDetails depositAppDetails, Long l, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, PreBreakRate preBreakRate, PreContractRate preContractRate, List list, List list2, List list3, int i, Object obj) {
        DepositAppDetails depositAppDetails2 = depositAppDetails;
        int i2 = i;
        return depositAppDetails.copy((i2 & 1) != 0 ? depositAppDetails2.appId : l, (i2 & 2) != 0 ? depositAppDetails2.intRateBase : bigDecimal, (i2 & 4) != 0 ? depositAppDetails2.irr2 : bigDecimal2, (i2 & 8) != 0 ? depositAppDetails2.depositName : str, (i2 & 16) != 0 ? depositAppDetails2.preBreakRates : preBreakRate, (i2 & 32) != 0 ? depositAppDetails2.preContractRates : preContractRate, (i2 & 64) != 0 ? depositAppDetails2.breakRates : list, (i2 & 128) != 0 ? depositAppDetails2.contractRates : list2, (i2 & C11398b.f33139r) != 0 ? depositAppDetails2.contractDetails : list3);
    }

    public final Long component1() {
        return this.appId;
    }

    public final BigDecimal component2() {
        return this.intRateBase;
    }

    public final BigDecimal component3() {
        return this.irr2;
    }

    public final String component4() {
        return this.depositName;
    }

    public final PreBreakRate component5() {
        return this.preBreakRates;
    }

    public final PreContractRate component6() {
        return this.preContractRates;
    }

    public final List<BreakRate> component7() {
        return this.breakRates;
    }

    public final List<ContractRate> component8() {
        return this.contractRates;
    }

    public final List<ContractDetail> component9() {
        return this.contractDetails;
    }

    public final DepositAppDetails copy(Long l, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, PreBreakRate preBreakRate, PreContractRate preContractRate, List<BreakRate> list, List<ContractRate> list2, List<ContractDetail> list3) {
        return new DepositAppDetails(l, bigDecimal, bigDecimal2, str, preBreakRate, preContractRate, list, list2, list3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositAppDetails)) {
            return false;
        }
        DepositAppDetails depositAppDetails = (DepositAppDetails) obj;
        return C41536l.m120484d(this.appId, depositAppDetails.appId) && C41536l.m120484d(this.intRateBase, depositAppDetails.intRateBase) && C41536l.m120484d(this.irr2, depositAppDetails.irr2) && C41536l.m120484d(this.depositName, depositAppDetails.depositName) && C41536l.m120484d(this.preBreakRates, depositAppDetails.preBreakRates) && C41536l.m120484d(this.preContractRates, depositAppDetails.preContractRates) && C41536l.m120484d(this.breakRates, depositAppDetails.breakRates) && C41536l.m120484d(this.contractRates, depositAppDetails.contractRates) && C41536l.m120484d(this.contractDetails, depositAppDetails.contractDetails);
    }

    public final BigDecimal getAgreeAmount() {
        ContractDetail contractDetail;
        List<ContractDetail> list = this.contractDetails;
        if (list == null || (contractDetail = (ContractDetail) C41358y.m120009Y(list)) == null) {
            return null;
        }
        return contractDetail.agreeAmount;
    }

    public final String getCcy() {
        ContractDetail contractDetail;
        List<ContractDetail> list = this.contractDetails;
        if (list == null || (contractDetail = (ContractDetail) C41358y.m120009Y(list)) == null) {
            return null;
        }
        return contractDetail.ccy;
    }

    public final String getDetails() {
        ContractDetail contractDetail;
        BigDecimal bigDecimal;
        String str;
        String str2;
        BigDecimal bigDecimal2;
        List<ContractDetail> list = this.contractDetails;
        BigDecimal bigDecimal3 = null;
        if (list != null) {
            contractDetail = (ContractDetail) C41358y.m120009Y(list);
        } else {
            contractDetail = null;
        }
        String str3 = this.depositName;
        if (contractDetail != null) {
            bigDecimal = contractDetail.agreeAmount;
        } else {
            bigDecimal = null;
        }
        if (contractDetail != null) {
            str = contractDetail.ccy;
        } else {
            str = null;
        }
        if (contractDetail != null) {
            str2 = contractDetail.intWithPeriodType;
        } else {
            str2 = null;
        }
        if (contractDetail != null) {
            bigDecimal2 = contractDetail.intRate;
        } else {
            bigDecimal2 = null;
        }
        if (contractDetail != null) {
            bigDecimal3 = contractDetail.irr;
        }
        return "Deposit Name: " + str3 + "\nApplication Type: \nDeposit Amount: " + bigDecimal + " " + str + "\nInterest Type: " + str2 + "\nInterest Rate: " + bigDecimal2 + "\nEffective rate: " + bigDecimal3 + "\n";
    }

    public final Long getMaturityDate() {
        ContractDetail contractDetail;
        List<ContractDetail> list = this.contractDetails;
        if (list == null || (contractDetail = (ContractDetail) C41358y.m120009Y(list)) == null) {
            return null;
        }
        return contractDetail.maturityDate;
    }

    public int hashCode() {
        Long l = this.appId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        BigDecimal bigDecimal = this.intRateBase;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.irr2;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.depositName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        PreBreakRate preBreakRate = this.preBreakRates;
        int hashCode5 = (hashCode4 + (preBreakRate == null ? 0 : preBreakRate.hashCode())) * 31;
        PreContractRate preContractRate = this.preContractRates;
        int hashCode6 = (hashCode5 + (preContractRate == null ? 0 : preContractRate.hashCode())) * 31;
        List<BreakRate> list = this.breakRates;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<ContractRate> list2 = this.contractRates;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ContractDetail> list3 = this.contractDetails;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        Long l = this.appId;
        BigDecimal bigDecimal = this.intRateBase;
        BigDecimal bigDecimal2 = this.irr2;
        String str = this.depositName;
        PreBreakRate preBreakRate = this.preBreakRates;
        PreContractRate preContractRate = this.preContractRates;
        List<BreakRate> list = this.breakRates;
        List<ContractRate> list2 = this.contractRates;
        List<ContractDetail> list3 = this.contractDetails;
        return "DepositAppDetails(appId=" + l + ", intRateBase=" + bigDecimal + ", irr2=" + bigDecimal2 + ", depositName=" + str + ", preBreakRates=" + preBreakRate + ", preContractRates=" + preContractRate + ", breakRates=" + list + ", contractRates=" + list2 + ", contractDetails=" + list3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.appId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeSerializable(this.intRateBase);
        parcel.writeSerializable(this.irr2);
        parcel.writeString(this.depositName);
        PreBreakRate preBreakRate = this.preBreakRates;
        if (preBreakRate == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            preBreakRate.writeToParcel(parcel, i);
        }
        PreContractRate preContractRate = this.preContractRates;
        if (preContractRate == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            preContractRate.writeToParcel(parcel, i);
        }
        List<BreakRate> list = this.breakRates;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (BreakRate writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        List<ContractRate> list2 = this.contractRates;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (ContractRate writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, i);
            }
        }
        List<ContractDetail> list3 = this.contractDetails;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list3.size());
        for (ContractDetail writeToParcel3 : list3) {
            writeToParcel3.writeToParcel(parcel, i);
        }
    }

    public DepositAppDetails(Long l, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, PreBreakRate preBreakRate, PreContractRate preContractRate, List<BreakRate> list, List<ContractRate> list2, List<ContractDetail> list3) {
        this.appId = l;
        this.intRateBase = bigDecimal;
        this.irr2 = bigDecimal2;
        this.depositName = str;
        this.preBreakRates = preBreakRate;
        this.preContractRates = preContractRate;
        this.breakRates = list;
        this.contractRates = list2;
        this.contractDetails = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DepositAppDetails(java.lang.Long r10, java.math.BigDecimal r11, java.math.BigDecimal r12, java.lang.String r13, p341ge.bog.mobilebank.model.deposits.DepositAppDetails.PreBreakRate r14, p341ge.bog.mobilebank.model.deposits.DepositAppDetails.PreContractRate r15, java.util.List r16, java.util.List r17, java.util.List r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = r15
        L_0x002c:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0035
            java.util.List r7 = ie1.C41341q.m119907j()
            goto L_0x0037
        L_0x0035:
            r7 = r16
        L_0x0037:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0040
            java.util.List r8 = ie1.C41341q.m119907j()
            goto L_0x0042
        L_0x0040:
            r8 = r17
        L_0x0042:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004b
            java.util.List r0 = ie1.C41341q.m119907j()
            goto L_0x004d
        L_0x004b:
            r0 = r18
        L_0x004d:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r2
            r17 = r7
            r18 = r8
            r19 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.deposits.DepositAppDetails.<init>(java.lang.Long, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, ge.bog.mobilebank.model.deposits.DepositAppDetails$PreBreakRate, ge.bog.mobilebank.model.deposits.DepositAppDetails$PreContractRate, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Keep
    /* renamed from: ge.bog.mobilebank.model.deposits.DepositAppDetails$ContractDetail */
    public static final class ContractDetail implements Parcelable {
        public static final Parcelable.Creator<ContractDetail> CREATOR = new Creator();
        public String agrPurpose;
        public BigDecimal agreeAmount;
        public Long agreeKey;
        public String agreeNo;
        public String ccy;
        public String depAcctNo;
        public BigDecimal depositPeriod;
        public String dictionaryKey;
        public BigDecimal intRate;
        public BigDecimal intRateBase;
        public String intWithPeriodType;
        public BigDecimal irr;
        public BigDecimal irr2;
        public String location;
        public Long maturityDate;
        public String servAcctNo;
        public String spellEnAgreeAmount;
        public String spellGeAgreeAmount;
        public long startDate;
        public String status;
        public String statusKey;

        /* renamed from: ge.bog.mobilebank.model.deposits.DepositAppDetails$ContractDetail$Creator */
        public static final class Creator implements Parcelable.Creator<ContractDetail> {
            public final ContractDetail createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new ContractDetail(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final ContractDetail[] newArray(int i) {
                return new ContractDetail[i];
            }
        }

        public ContractDetail(Long l, String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str5, String str6, BigDecimal bigDecimal6, long j, Long l2, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.agreeKey = l;
            this.agreeNo = str;
            this.depAcctNo = str2;
            this.servAcctNo = str3;
            this.ccy = str4;
            this.intRate = bigDecimal;
            this.intRateBase = bigDecimal2;
            this.irr = bigDecimal3;
            this.irr2 = bigDecimal4;
            this.agreeAmount = bigDecimal5;
            this.spellGeAgreeAmount = str5;
            this.spellEnAgreeAmount = str6;
            this.depositPeriod = bigDecimal6;
            this.startDate = j;
            this.maturityDate = l2;
            this.intWithPeriodType = str7;
            this.location = str8;
            this.status = str9;
            this.statusKey = str10;
            this.agrPurpose = str11;
            this.dictionaryKey = str12;
        }

        public static /* synthetic */ ContractDetail copy$default(ContractDetail contractDetail, Long l, String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str5, String str6, BigDecimal bigDecimal6, long j, Long l2, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
            ContractDetail contractDetail2 = contractDetail;
            int i2 = i;
            return contractDetail.copy((i2 & 1) != 0 ? contractDetail2.agreeKey : l, (i2 & 2) != 0 ? contractDetail2.agreeNo : str, (i2 & 4) != 0 ? contractDetail2.depAcctNo : str2, (i2 & 8) != 0 ? contractDetail2.servAcctNo : str3, (i2 & 16) != 0 ? contractDetail2.ccy : str4, (i2 & 32) != 0 ? contractDetail2.intRate : bigDecimal, (i2 & 64) != 0 ? contractDetail2.intRateBase : bigDecimal2, (i2 & 128) != 0 ? contractDetail2.irr : bigDecimal3, (i2 & C11398b.f33139r) != 0 ? contractDetail2.irr2 : bigDecimal4, (i2 & C11398b.f33140s) != 0 ? contractDetail2.agreeAmount : bigDecimal5, (i2 & C11398b.f33141t) != 0 ? contractDetail2.spellGeAgreeAmount : str5, (i2 & C11398b.f33142u) != 0 ? contractDetail2.spellEnAgreeAmount : str6, (i2 & C11398b.f33143v) != 0 ? contractDetail2.depositPeriod : bigDecimal6, (i2 & 8192) != 0 ? contractDetail2.startDate : j, (i2 & 16384) != 0 ? contractDetail2.maturityDate : l2, (32768 & i2) != 0 ? contractDetail2.intWithPeriodType : str7, (i2 & 65536) != 0 ? contractDetail2.location : str8, (i2 & 131072) != 0 ? contractDetail2.status : str9, (i2 & 262144) != 0 ? contractDetail2.statusKey : str10, (i2 & 524288) != 0 ? contractDetail2.agrPurpose : str11, (i2 & 1048576) != 0 ? contractDetail2.dictionaryKey : str12);
        }

        public final Long component1() {
            return this.agreeKey;
        }

        public final BigDecimal component10() {
            return this.agreeAmount;
        }

        public final String component11() {
            return this.spellGeAgreeAmount;
        }

        public final String component12() {
            return this.spellEnAgreeAmount;
        }

        public final BigDecimal component13() {
            return this.depositPeriod;
        }

        public final long component14() {
            return this.startDate;
        }

        public final Long component15() {
            return this.maturityDate;
        }

        public final String component16() {
            return this.intWithPeriodType;
        }

        public final String component17() {
            return this.location;
        }

        public final String component18() {
            return this.status;
        }

        public final String component19() {
            return this.statusKey;
        }

        public final String component2() {
            return this.agreeNo;
        }

        public final String component20() {
            return this.agrPurpose;
        }

        public final String component21() {
            return this.dictionaryKey;
        }

        public final String component3() {
            return this.depAcctNo;
        }

        public final String component4() {
            return this.servAcctNo;
        }

        public final String component5() {
            return this.ccy;
        }

        public final BigDecimal component6() {
            return this.intRate;
        }

        public final BigDecimal component7() {
            return this.intRateBase;
        }

        public final BigDecimal component8() {
            return this.irr;
        }

        public final BigDecimal component9() {
            return this.irr2;
        }

        public final ContractDetail copy(Long l, String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str5, String str6, BigDecimal bigDecimal6, long j, Long l2, String str7, String str8, String str9, String str10, String str11, String str12) {
            return new ContractDetail(l, str, str2, str3, str4, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, str5, str6, bigDecimal6, j, l2, str7, str8, str9, str10, str11, str12);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContractDetail)) {
                return false;
            }
            ContractDetail contractDetail = (ContractDetail) obj;
            return C41536l.m120484d(this.agreeKey, contractDetail.agreeKey) && C41536l.m120484d(this.agreeNo, contractDetail.agreeNo) && C41536l.m120484d(this.depAcctNo, contractDetail.depAcctNo) && C41536l.m120484d(this.servAcctNo, contractDetail.servAcctNo) && C41536l.m120484d(this.ccy, contractDetail.ccy) && C41536l.m120484d(this.intRate, contractDetail.intRate) && C41536l.m120484d(this.intRateBase, contractDetail.intRateBase) && C41536l.m120484d(this.irr, contractDetail.irr) && C41536l.m120484d(this.irr2, contractDetail.irr2) && C41536l.m120484d(this.agreeAmount, contractDetail.agreeAmount) && C41536l.m120484d(this.spellGeAgreeAmount, contractDetail.spellGeAgreeAmount) && C41536l.m120484d(this.spellEnAgreeAmount, contractDetail.spellEnAgreeAmount) && C41536l.m120484d(this.depositPeriod, contractDetail.depositPeriod) && this.startDate == contractDetail.startDate && C41536l.m120484d(this.maturityDate, contractDetail.maturityDate) && C41536l.m120484d(this.intWithPeriodType, contractDetail.intWithPeriodType) && C41536l.m120484d(this.location, contractDetail.location) && C41536l.m120484d(this.status, contractDetail.status) && C41536l.m120484d(this.statusKey, contractDetail.statusKey) && C41536l.m120484d(this.agrPurpose, contractDetail.agrPurpose) && C41536l.m120484d(this.dictionaryKey, contractDetail.dictionaryKey);
        }

        public int hashCode() {
            Long l = this.agreeKey;
            int i = 0;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            String str = this.agreeNo;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.depAcctNo;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.servAcctNo;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.ccy;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            BigDecimal bigDecimal = this.intRate;
            int hashCode6 = (hashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.intRateBase;
            int hashCode7 = (hashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.irr;
            int hashCode8 = (hashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.irr2;
            int hashCode9 = (hashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            BigDecimal bigDecimal5 = this.agreeAmount;
            int hashCode10 = (hashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
            String str5 = this.spellGeAgreeAmount;
            int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.spellEnAgreeAmount;
            int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
            BigDecimal bigDecimal6 = this.depositPeriod;
            int hashCode13 = (((hashCode12 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31) + C7397t.m28148a(this.startDate)) * 31;
            Long l2 = this.maturityDate;
            int hashCode14 = (hashCode13 + (l2 == null ? 0 : l2.hashCode())) * 31;
            String str7 = this.intWithPeriodType;
            int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.location;
            int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.status;
            int hashCode17 = (hashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.statusKey;
            int hashCode18 = (hashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.agrPurpose;
            int hashCode19 = (hashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.dictionaryKey;
            if (str12 != null) {
                i = str12.hashCode();
            }
            return hashCode19 + i;
        }

        public String toString() {
            Long l = this.agreeKey;
            String str = this.agreeNo;
            String str2 = this.depAcctNo;
            String str3 = this.servAcctNo;
            String str4 = this.ccy;
            BigDecimal bigDecimal = this.intRate;
            BigDecimal bigDecimal2 = this.intRateBase;
            BigDecimal bigDecimal3 = this.irr;
            BigDecimal bigDecimal4 = this.irr2;
            BigDecimal bigDecimal5 = this.agreeAmount;
            String str5 = this.spellGeAgreeAmount;
            String str6 = this.spellEnAgreeAmount;
            BigDecimal bigDecimal6 = this.depositPeriod;
            long j = this.startDate;
            Long l2 = this.maturityDate;
            String str7 = this.intWithPeriodType;
            String str8 = this.location;
            String str9 = this.status;
            String str10 = this.statusKey;
            String str11 = this.agrPurpose;
            String str12 = this.dictionaryKey;
            return "ContractDetail(agreeKey=" + l + ", agreeNo=" + str + ", depAcctNo=" + str2 + ", servAcctNo=" + str3 + ", ccy=" + str4 + ", intRate=" + bigDecimal + ", intRateBase=" + bigDecimal2 + ", irr=" + bigDecimal3 + ", irr2=" + bigDecimal4 + ", agreeAmount=" + bigDecimal5 + ", spellGeAgreeAmount=" + str5 + ", spellEnAgreeAmount=" + str6 + ", depositPeriod=" + bigDecimal6 + ", startDate=" + j + ", maturityDate=" + l2 + ", intWithPeriodType=" + str7 + ", location=" + str8 + ", status=" + str9 + ", statusKey=" + str10 + ", agrPurpose=" + str11 + ", dictionaryKey=" + str12 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            Long l = this.agreeKey;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeString(this.agreeNo);
            parcel.writeString(this.depAcctNo);
            parcel.writeString(this.servAcctNo);
            parcel.writeString(this.ccy);
            parcel.writeSerializable(this.intRate);
            parcel.writeSerializable(this.intRateBase);
            parcel.writeSerializable(this.irr);
            parcel.writeSerializable(this.irr2);
            parcel.writeSerializable(this.agreeAmount);
            parcel.writeString(this.spellGeAgreeAmount);
            parcel.writeString(this.spellEnAgreeAmount);
            parcel.writeSerializable(this.depositPeriod);
            parcel.writeLong(this.startDate);
            Long l2 = this.maturityDate;
            if (l2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l2.longValue());
            }
            parcel.writeString(this.intWithPeriodType);
            parcel.writeString(this.location);
            parcel.writeString(this.status);
            parcel.writeString(this.statusKey);
            parcel.writeString(this.agrPurpose);
            parcel.writeString(this.dictionaryKey);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ ContractDetail(java.lang.Long r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.math.BigDecimal r32, java.math.BigDecimal r33, java.math.BigDecimal r34, java.math.BigDecimal r35, java.math.BigDecimal r36, java.lang.String r37, java.lang.String r38, java.math.BigDecimal r39, long r40, java.lang.Long r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
            /*
                r26 = this;
                r0 = r49
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r4 = r2
                goto L_0x000b
            L_0x0009:
                r4 = r27
            L_0x000b:
                r1 = r0 & 2
                if (r1 == 0) goto L_0x0011
                r5 = r2
                goto L_0x0013
            L_0x0011:
                r5 = r28
            L_0x0013:
                r1 = r0 & 4
                if (r1 == 0) goto L_0x0019
                r6 = r2
                goto L_0x001b
            L_0x0019:
                r6 = r29
            L_0x001b:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0021
                r7 = r2
                goto L_0x0023
            L_0x0021:
                r7 = r30
            L_0x0023:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0029
                r8 = r2
                goto L_0x002b
            L_0x0029:
                r8 = r31
            L_0x002b:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0031
                r9 = r2
                goto L_0x0033
            L_0x0031:
                r9 = r32
            L_0x0033:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0039
                r10 = r2
                goto L_0x003b
            L_0x0039:
                r10 = r33
            L_0x003b:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0041
                r11 = r2
                goto L_0x0043
            L_0x0041:
                r11 = r34
            L_0x0043:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0049
                r12 = r2
                goto L_0x004b
            L_0x0049:
                r12 = r35
            L_0x004b:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0051
                r13 = r2
                goto L_0x0053
            L_0x0051:
                r13 = r36
            L_0x0053:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L_0x0059
                r14 = r2
                goto L_0x005b
            L_0x0059:
                r14 = r37
            L_0x005b:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L_0x0061
                r15 = r2
                goto L_0x0063
            L_0x0061:
                r15 = r38
            L_0x0063:
                r1 = r0 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L_0x006a
                r16 = r2
                goto L_0x006c
            L_0x006a:
                r16 = r39
            L_0x006c:
                r1 = 32768(0x8000, float:4.5918E-41)
                r1 = r1 & r0
                if (r1 == 0) goto L_0x0075
                r20 = r2
                goto L_0x0077
            L_0x0075:
                r20 = r43
            L_0x0077:
                r1 = 65536(0x10000, float:9.18355E-41)
                r1 = r1 & r0
                if (r1 == 0) goto L_0x007f
                r21 = r2
                goto L_0x0081
            L_0x007f:
                r21 = r44
            L_0x0081:
                r1 = 131072(0x20000, float:1.83671E-40)
                r1 = r1 & r0
                if (r1 == 0) goto L_0x0089
                r22 = r2
                goto L_0x008b
            L_0x0089:
                r22 = r45
            L_0x008b:
                r1 = 262144(0x40000, float:3.67342E-40)
                r1 = r1 & r0
                if (r1 == 0) goto L_0x0093
                r23 = r2
                goto L_0x0095
            L_0x0093:
                r23 = r46
            L_0x0095:
                r1 = 524288(0x80000, float:7.34684E-40)
                r1 = r1 & r0
                if (r1 == 0) goto L_0x009d
                r24 = r2
                goto L_0x009f
            L_0x009d:
                r24 = r47
            L_0x009f:
                r1 = 1048576(0x100000, float:1.469368E-39)
                r0 = r0 & r1
                if (r0 == 0) goto L_0x00a7
                r25 = r2
                goto L_0x00a9
            L_0x00a7:
                r25 = r48
            L_0x00a9:
                r3 = r26
                r17 = r40
                r19 = r42
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.deposits.DepositAppDetails.ContractDetail.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.math.BigDecimal, long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
