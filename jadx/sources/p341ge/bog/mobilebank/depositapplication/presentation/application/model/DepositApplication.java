package p341ge.bog.mobilebank.depositapplication.presentation.application.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;
import p341ge.bog.mobilebank.model.account.AccountLov;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.model.DepositApplication */
public final class DepositApplication implements Parcelable {
    public static final Parcelable.Creator<DepositApplication> CREATOR = new C22812a();

    /* renamed from: d */
    private final DepositTypeDetailsUiModel f60124d;

    /* renamed from: e */
    private final String f60125e;

    /* renamed from: f */
    private final DepositPurposeUiModel f60126f;

    /* renamed from: g */
    private final String f60127g;

    /* renamed from: h */
    private final String f60128h;

    /* renamed from: i */
    private final AccountLov f60129i;

    /* renamed from: j */
    private final long f60130j;

    /* renamed from: k */
    private final Long f60131k;

    /* renamed from: l */
    private final WithdrawalTypeUiModel f60132l;

    /* renamed from: m */
    private final InterestRateUiModel f60133m;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.model.DepositApplication$a */
    public static final class C22812a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositApplication createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            DepositTypeDetailsUiModel createFromParcel = DepositTypeDetailsUiModel.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            InterestRateUiModel interestRateUiModel = null;
            DepositPurposeUiModel createFromParcel2 = parcel.readInt() == 0 ? null : DepositPurposeUiModel.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            AccountLov accountLov = (AccountLov) parcel.readParcelable(DepositApplication.class.getClassLoader());
            long readLong = parcel.readLong();
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            WithdrawalTypeUiModel createFromParcel3 = parcel.readInt() == 0 ? null : WithdrawalTypeUiModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                interestRateUiModel = InterestRateUiModel.CREATOR.createFromParcel(parcel);
            }
            return new DepositApplication(createFromParcel, readString, createFromParcel2, readString2, readString3, accountLov, readLong, valueOf, createFromParcel3, interestRateUiModel);
        }

        /* renamed from: b */
        public final DepositApplication[] newArray(int i) {
            return new DepositApplication[i];
        }
    }

    public DepositApplication(DepositTypeDetailsUiModel depositTypeDetailsUiModel, String str, DepositPurposeUiModel depositPurposeUiModel, String str2, String str3, AccountLov accountLov, long j, Long l, WithdrawalTypeUiModel withdrawalTypeUiModel, InterestRateUiModel interestRateUiModel) {
        C41536l.m120489i(depositTypeDetailsUiModel, "depositDetails");
        this.f60124d = depositTypeDetailsUiModel;
        this.f60125e = str;
        this.f60126f = depositPurposeUiModel;
        this.f60127g = str2;
        this.f60128h = str3;
        this.f60129i = accountLov;
        this.f60130j = j;
        this.f60131k = l;
        this.f60132l = withdrawalTypeUiModel;
        this.f60133m = interestRateUiModel;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositApplication)) {
            return false;
        }
        DepositApplication depositApplication = (DepositApplication) obj;
        return C41536l.m120484d(this.f60124d, depositApplication.f60124d) && C41536l.m120484d(this.f60125e, depositApplication.f60125e) && C41536l.m120484d(this.f60126f, depositApplication.f60126f) && C41536l.m120484d(this.f60127g, depositApplication.f60127g) && C41536l.m120484d(this.f60128h, depositApplication.f60128h) && C41536l.m120484d(this.f60129i, depositApplication.f60129i) && this.f60130j == depositApplication.f60130j && C41536l.m120484d(this.f60131k, depositApplication.f60131k) && C41536l.m120484d(this.f60132l, depositApplication.f60132l) && C41536l.m120484d(this.f60133m, depositApplication.f60133m);
    }

    public int hashCode() {
        int hashCode = this.f60124d.hashCode() * 31;
        String str = this.f60125e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DepositPurposeUiModel depositPurposeUiModel = this.f60126f;
        int hashCode3 = (hashCode2 + (depositPurposeUiModel == null ? 0 : depositPurposeUiModel.hashCode())) * 31;
        String str2 = this.f60127g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60128h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AccountLov accountLov = this.f60129i;
        int hashCode6 = (((hashCode5 + (accountLov == null ? 0 : accountLov.hashCode())) * 31) + C7397t.m28148a(this.f60130j)) * 31;
        Long l = this.f60131k;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        WithdrawalTypeUiModel withdrawalTypeUiModel = this.f60132l;
        int hashCode8 = (hashCode7 + (withdrawalTypeUiModel == null ? 0 : withdrawalTypeUiModel.hashCode())) * 31;
        InterestRateUiModel interestRateUiModel = this.f60133m;
        if (interestRateUiModel != null) {
            i = interestRateUiModel.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        DepositTypeDetailsUiModel depositTypeDetailsUiModel = this.f60124d;
        String str = this.f60125e;
        DepositPurposeUiModel depositPurposeUiModel = this.f60126f;
        String str2 = this.f60127g;
        String str3 = this.f60128h;
        AccountLov accountLov = this.f60129i;
        long j = this.f60130j;
        Long l = this.f60131k;
        WithdrawalTypeUiModel withdrawalTypeUiModel = this.f60132l;
        InterestRateUiModel interestRateUiModel = this.f60133m;
        return "DepositApplication(depositDetails=" + depositTypeDetailsUiModel + ", depositName=" + str + ", depositPurpose=" + depositPurposeUiModel + ", depositAmount=" + str2 + ", depositCurrency=" + str3 + ", account=" + accountLov + ", startDate=" + j + ", endDate=" + l + ", withdrawalType=" + withdrawalTypeUiModel + ", interestRate=" + interestRateUiModel + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        this.f60124d.writeToParcel(parcel, i);
        parcel.writeString(this.f60125e);
        DepositPurposeUiModel depositPurposeUiModel = this.f60126f;
        if (depositPurposeUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            depositPurposeUiModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f60127g);
        parcel.writeString(this.f60128h);
        parcel.writeParcelable(this.f60129i, i);
        parcel.writeLong(this.f60130j);
        Long l = this.f60131k;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        WithdrawalTypeUiModel withdrawalTypeUiModel = this.f60132l;
        if (withdrawalTypeUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            withdrawalTypeUiModel.writeToParcel(parcel, i);
        }
        InterestRateUiModel interestRateUiModel = this.f60133m;
        if (interestRateUiModel == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        interestRateUiModel.writeToParcel(parcel, i);
    }
}
