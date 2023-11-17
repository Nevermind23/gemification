package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.DepositAccountUiModel */
public final class DepositAccountUiModel implements Parcelable {
    public static final Parcelable.Creator<DepositAccountUiModel> CREATOR = new C33108a();

    /* renamed from: d */
    private final long f81075d;

    /* renamed from: e */
    private final String f81076e;

    /* renamed from: f */
    private final double f81077f;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.DepositAccountUiModel$a */
    public static final class C33108a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositAccountUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DepositAccountUiModel(parcel.readLong(), parcel.readString(), parcel.readDouble());
        }

        /* renamed from: b */
        public final DepositAccountUiModel[] newArray(int i) {
            return new DepositAccountUiModel[i];
        }
    }

    public DepositAccountUiModel(long j, String str, double d) {
        C41536l.m120489i(str, "acctNo");
        this.f81075d = j;
        this.f81076e = str;
        this.f81077f = d;
    }

    /* renamed from: a */
    public final long mo75083a() {
        return this.f81075d;
    }

    /* renamed from: b */
    public final String mo75084b() {
        return this.f81076e;
    }

    /* renamed from: d */
    public final double mo75085d() {
        return this.f81077f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositAccountUiModel)) {
            return false;
        }
        DepositAccountUiModel depositAccountUiModel = (DepositAccountUiModel) obj;
        return this.f81075d == depositAccountUiModel.f81075d && C41536l.m120484d(this.f81076e, depositAccountUiModel.f81076e) && Double.compare(this.f81077f, depositAccountUiModel.f81077f) == 0;
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.f81075d) * 31) + this.f81076e.hashCode()) * 31) + Double.doubleToLongBits(this.f81077f);
    }

    public String toString() {
        long j = this.f81075d;
        String str = this.f81076e;
        double d = this.f81077f;
        return "DepositAccountUiModel(acctKey=" + j + ", acctNo=" + str + ", availableAmount=" + d + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f81075d);
        parcel.writeString(this.f81076e);
        parcel.writeDouble(this.f81077f);
    }
}
