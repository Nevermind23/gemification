package p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import ka0.C25695d;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData */
public final class DepositSubmissionNavData implements Parcelable {
    public static final Parcelable.Creator<DepositSubmissionNavData> CREATOR = new C22980a();

    /* renamed from: d */
    private final String f60438d;

    /* renamed from: e */
    private final C25695d f60439e;

    /* renamed from: f */
    private final BigDecimal f60440f;

    /* renamed from: g */
    private final String f60441g;

    /* renamed from: h */
    private final WithdrawalTypeUiModel f60442h;

    /* renamed from: i */
    private final long f60443i;

    /* renamed from: j */
    private final Long f60444j;

    /* renamed from: k */
    private final InterestRateUiModel f60445k;

    /* renamed from: l */
    private final BigDecimal f60446l;

    /* renamed from: m */
    private final BigDecimal f60447m;

    /* renamed from: n */
    private final String f60448n;

    /* renamed from: o */
    private final Long f60449o;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData$a */
    public static final class C22980a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositSubmissionNavData createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            return new DepositSubmissionNavData(parcel.readString(), C25695d.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), parcel.readString(), WithdrawalTypeUiModel.CREATOR.createFromParcel(parcel2), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), InterestRateUiModel.CREATOR.createFromParcel(parcel2), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* renamed from: b */
        public final DepositSubmissionNavData[] newArray(int i) {
            return new DepositSubmissionNavData[i];
        }
    }

    public DepositSubmissionNavData(String str, C25695d dVar, BigDecimal bigDecimal, String str2, WithdrawalTypeUiModel withdrawalTypeUiModel, long j, Long l, InterestRateUiModel interestRateUiModel, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str3, Long l2) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(dVar, "depositType");
        C41536l.m120489i(bigDecimal, "depositInitialAmount");
        C41536l.m120489i(str2, "depositCurrency");
        C41536l.m120489i(withdrawalTypeUiModel, "withdrawalType");
        C41536l.m120489i(interestRateUiModel, "interestRateData");
        C41536l.m120489i(bigDecimal2, "preContractIrrMinAmount");
        C41536l.m120489i(bigDecimal3, "preContractIrrMaxAmount");
        this.f60438d = str;
        this.f60439e = dVar;
        this.f60440f = bigDecimal;
        this.f60441g = str2;
        this.f60442h = withdrawalTypeUiModel;
        this.f60443i = j;
        this.f60444j = l;
        this.f60445k = interestRateUiModel;
        this.f60446l = bigDecimal2;
        this.f60447m = bigDecimal3;
        this.f60448n = str3;
        this.f60449o = l2;
    }

    /* renamed from: a */
    public final String mo57165a() {
        return this.f60441g;
    }

    /* renamed from: b */
    public final Long mo57166b() {
        return this.f60444j;
    }

    /* renamed from: d */
    public final BigDecimal mo57167d() {
        return this.f60440f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo57169e() {
        return this.f60448n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositSubmissionNavData)) {
            return false;
        }
        DepositSubmissionNavData depositSubmissionNavData = (DepositSubmissionNavData) obj;
        return C41536l.m120484d(this.f60438d, depositSubmissionNavData.f60438d) && this.f60439e == depositSubmissionNavData.f60439e && C41536l.m120484d(this.f60440f, depositSubmissionNavData.f60440f) && C41536l.m120484d(this.f60441g, depositSubmissionNavData.f60441g) && C41536l.m120484d(this.f60442h, depositSubmissionNavData.f60442h) && this.f60443i == depositSubmissionNavData.f60443i && C41536l.m120484d(this.f60444j, depositSubmissionNavData.f60444j) && C41536l.m120484d(this.f60445k, depositSubmissionNavData.f60445k) && C41536l.m120484d(this.f60446l, depositSubmissionNavData.f60446l) && C41536l.m120484d(this.f60447m, depositSubmissionNavData.f60447m) && C41536l.m120484d(this.f60448n, depositSubmissionNavData.f60448n) && C41536l.m120484d(this.f60449o, depositSubmissionNavData.f60449o);
    }

    /* renamed from: f */
    public final long mo57171f() {
        return this.f60443i;
    }

    /* renamed from: g */
    public final C25695d mo57172g() {
        return this.f60439e;
    }

    /* renamed from: h */
    public final InterestRateUiModel mo57173h() {
        return this.f60445k;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f60438d.hashCode() * 31) + this.f60439e.hashCode()) * 31) + this.f60440f.hashCode()) * 31) + this.f60441g.hashCode()) * 31) + this.f60442h.hashCode()) * 31) + C7397t.m28148a(this.f60443i)) * 31;
        Long l = this.f60444j;
        int i = 0;
        int hashCode2 = (((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.f60445k.hashCode()) * 31) + this.f60446l.hashCode()) * 31) + this.f60447m.hashCode()) * 31;
        String str = this.f60448n;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f60449o;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode3 + i;
    }

    /* renamed from: i */
    public final BigDecimal mo57175i() {
        return this.f60447m;
    }

    /* renamed from: j */
    public final BigDecimal mo57176j() {
        return this.f60446l;
    }

    /* renamed from: k */
    public final String mo57177k() {
        return this.f60438d;
    }

    /* renamed from: l */
    public final Long mo57178l() {
        return this.f60449o;
    }

    /* renamed from: m */
    public final WithdrawalTypeUiModel mo57179m() {
        return this.f60442h;
    }

    public String toString() {
        String str = this.f60438d;
        C25695d dVar = this.f60439e;
        BigDecimal bigDecimal = this.f60440f;
        String str2 = this.f60441g;
        WithdrawalTypeUiModel withdrawalTypeUiModel = this.f60442h;
        long j = this.f60443i;
        Long l = this.f60444j;
        InterestRateUiModel interestRateUiModel = this.f60445k;
        BigDecimal bigDecimal2 = this.f60446l;
        BigDecimal bigDecimal3 = this.f60447m;
        String str3 = this.f60448n;
        Long l2 = this.f60449o;
        return "DepositSubmissionNavData(prodType=" + str + ", depositType=" + dVar + ", depositInitialAmount=" + bigDecimal + ", depositCurrency=" + str2 + ", withdrawalType=" + withdrawalTypeUiModel + ", depositStartDate=" + j + ", depositEndDate=" + l + ", interestRateData=" + interestRateUiModel + ", preContractIrrMinAmount=" + bigDecimal2 + ", preContractIrrMaxAmount=" + bigDecimal3 + ", depositMinAmountKey=" + str3 + ", selectedPurposeId=" + l2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f60438d);
        parcel.writeString(this.f60439e.name());
        parcel.writeSerializable(this.f60440f);
        parcel.writeString(this.f60441g);
        this.f60442h.writeToParcel(parcel, i);
        parcel.writeLong(this.f60443i);
        Long l = this.f60444j;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        this.f60445k.writeToParcel(parcel, i);
        parcel.writeSerializable(this.f60446l);
        parcel.writeSerializable(this.f60447m);
        parcel.writeString(this.f60448n);
        Long l2 = this.f60449o;
        if (l2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l2.longValue());
    }
}
