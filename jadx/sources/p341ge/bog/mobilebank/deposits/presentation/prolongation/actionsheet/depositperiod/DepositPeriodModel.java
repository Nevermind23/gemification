package p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodModel */
public abstract class DepositPeriodModel implements Parcelable {

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodModel$Deposit */
    public static final class Deposit extends DepositPeriodModel {
        public static final Parcelable.Creator<Deposit> CREATOR = new C23248a();

        /* renamed from: d */
        private final int f60843d;

        /* renamed from: e */
        private final long f60844e;

        /* renamed from: f */
        private final long f60845f;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodModel$Deposit$a */
        public static final class C23248a implements Parcelable.Creator {
            /* renamed from: a */
            public final Deposit createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Deposit(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            /* renamed from: b */
            public final Deposit[] newArray(int i) {
                return new Deposit[i];
            }
        }

        public Deposit(int i, long j, long j2) {
            super((DefaultConstructorMarker) null);
            this.f60843d = i;
            this.f60844e = j;
            this.f60845f = j2;
        }

        /* renamed from: a */
        public final long mo58145a() {
            return this.f60845f;
        }

        /* renamed from: b */
        public final long mo58146b() {
            return this.f60844e;
        }

        /* renamed from: d */
        public final int mo58147d() {
            return this.f60843d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Deposit)) {
                return false;
            }
            Deposit deposit = (Deposit) obj;
            return this.f60843d == deposit.f60843d && this.f60844e == deposit.f60844e && this.f60845f == deposit.f60845f;
        }

        public int hashCode() {
            return (((this.f60843d * 31) + C7397t.m28148a(this.f60844e)) * 31) + C7397t.m28148a(this.f60845f);
        }

        public String toString() {
            int i = this.f60843d;
            long j = this.f60844e;
            long j2 = this.f60845f;
            return "Deposit(value=" + i + ", minDate=" + j + ", maxDate=" + j2 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f60843d);
            parcel.writeLong(this.f60844e);
            parcel.writeLong(this.f60845f);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodModel$Withdrawal */
    public static final class Withdrawal extends DepositPeriodModel {
        public static final Parcelable.Creator<Withdrawal> CREATOR = new C23249a();

        /* renamed from: d */
        private final String f60846d;

        /* renamed from: e */
        private final String f60847e;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodModel$Withdrawal$a */
        public static final class C23249a implements Parcelable.Creator {
            /* renamed from: a */
            public final Withdrawal createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Withdrawal(parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final Withdrawal[] newArray(int i) {
                return new Withdrawal[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Withdrawal(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            C41536l.m120489i(str2, "dictKey");
            this.f60846d = str;
            this.f60847e = str2;
        }

        /* renamed from: a */
        public final String mo58157a() {
            return this.f60847e;
        }

        /* renamed from: b */
        public final String mo58158b() {
            return this.f60846d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Withdrawal)) {
                return false;
            }
            Withdrawal withdrawal = (Withdrawal) obj;
            return C41536l.m120484d(this.f60846d, withdrawal.f60846d) && C41536l.m120484d(this.f60847e, withdrawal.f60847e);
        }

        public int hashCode() {
            return (this.f60846d.hashCode() * 31) + this.f60847e.hashCode();
        }

        public String toString() {
            String str = this.f60846d;
            String str2 = this.f60847e;
            return "Withdrawal(value=" + str + ", dictKey=" + str2 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f60846d);
            parcel.writeString(this.f60847e);
        }
    }

    private DepositPeriodModel() {
    }

    public /* synthetic */ DepositPeriodModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
