package p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodModel */
public abstract class DepositPeriodModel implements Parcelable {

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodModel$Deposit */
    public static final class Deposit extends DepositPeriodModel {
        public static final Parcelable.Creator<Deposit> CREATOR = new C22860a();

        /* renamed from: d */
        private final int f60238d;

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodModel$Deposit$a */
        public static final class C22860a implements Parcelable.Creator {
            /* renamed from: a */
            public final Deposit createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Deposit(parcel.readInt());
            }

            /* renamed from: b */
            public final Deposit[] newArray(int i) {
                return new Deposit[i];
            }
        }

        public Deposit(int i) {
            super((DefaultConstructorMarker) null);
            this.f60238d = i;
        }

        /* renamed from: a */
        public final int mo56968a() {
            return this.f60238d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Deposit) && this.f60238d == ((Deposit) obj).f60238d;
        }

        public int hashCode() {
            return this.f60238d;
        }

        public String toString() {
            int i = this.f60238d;
            return "Deposit(value=" + i + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeInt(this.f60238d);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodModel$Withdrawal */
    public static final class Withdrawal extends DepositPeriodModel {
        public static final Parcelable.Creator<Withdrawal> CREATOR = new C22861a();

        /* renamed from: d */
        private final String f60239d;

        /* renamed from: e */
        private final String f60240e;

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodModel$Withdrawal$a */
        public static final class C22861a implements Parcelable.Creator {
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
            this.f60239d = str;
            this.f60240e = str2;
        }

        /* renamed from: a */
        public final String mo56978a() {
            return this.f60240e;
        }

        /* renamed from: b */
        public final String mo56979b() {
            return this.f60239d;
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
            return C41536l.m120484d(this.f60239d, withdrawal.f60239d) && C41536l.m120484d(this.f60240e, withdrawal.f60240e);
        }

        public int hashCode() {
            return (this.f60239d.hashCode() * 31) + this.f60240e.hashCode();
        }

        public String toString() {
            String str = this.f60239d;
            String str2 = this.f60240e;
            return "Withdrawal(value=" + str + ", dictKey=" + str2 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f60239d);
            parcel.writeString(this.f60240e);
        }
    }

    private DepositPeriodModel() {
    }

    public /* synthetic */ DepositPeriodModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
