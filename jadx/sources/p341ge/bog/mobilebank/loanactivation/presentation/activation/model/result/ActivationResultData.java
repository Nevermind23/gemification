package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.result;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.result.ActivationResultData */
public final class ActivationResultData implements Parcelable {
    public static final Parcelable.Creator<ActivationResultData> CREATOR = new C32493a();

    /* renamed from: d */
    private final double f80102d;

    /* renamed from: e */
    private final String f80103e;

    /* renamed from: f */
    private final int f80104f;

    /* renamed from: g */
    private final int f80105g;

    /* renamed from: h */
    private final Long f80106h;

    /* renamed from: i */
    private final String f80107i;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.result.ActivationResultData$a */
    public static final class C32493a implements Parcelable.Creator {
        /* renamed from: a */
        public final ActivationResultData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ActivationResultData(parcel.readDouble(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* renamed from: b */
        public final ActivationResultData[] newArray(int i) {
            return new ActivationResultData[i];
        }
    }

    public ActivationResultData(double d, String str, int i, int i2, Long l, String str2) {
        C41536l.m120489i(str, "ccy");
        this.f80102d = d;
        this.f80103e = str;
        this.f80104f = i;
        this.f80105g = i2;
        this.f80106h = l;
        this.f80107i = str2;
    }

    /* renamed from: a */
    public final String mo73544a() {
        return this.f80107i;
    }

    /* renamed from: b */
    public final double mo73545b() {
        return this.f80102d;
    }

    /* renamed from: d */
    public final String mo73546d() {
        return this.f80103e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Long mo73548e() {
        return this.f80106h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationResultData)) {
            return false;
        }
        ActivationResultData activationResultData = (ActivationResultData) obj;
        return Double.compare(this.f80102d, activationResultData.f80102d) == 0 && C41536l.m120484d(this.f80103e, activationResultData.f80103e) && this.f80104f == activationResultData.f80104f && this.f80105g == activationResultData.f80105g && C41536l.m120484d(this.f80106h, activationResultData.f80106h) && C41536l.m120484d(this.f80107i, activationResultData.f80107i);
    }

    /* renamed from: f */
    public final int mo73550f() {
        return this.f80105g;
    }

    /* renamed from: g */
    public final int mo73551g() {
        return this.f80104f;
    }

    public int hashCode() {
        int a = ((((((Double.doubleToLongBits(this.f80102d) * 31) + this.f80103e.hashCode()) * 31) + this.f80104f) * 31) + this.f80105g) * 31;
        Long l = this.f80106h;
        int i = 0;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f80107i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        double d = this.f80102d;
        String str = this.f80103e;
        int i = this.f80104f;
        int i2 = this.f80105g;
        Long l = this.f80106h;
        String str2 = this.f80107i;
        return "ActivationResultData(amount=" + d + ", ccy=" + str + ", term=" + i + ", payDay=" + i2 + ", firstPaymentDay=" + l + ", accountNo=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeDouble(this.f80102d);
        parcel.writeString(this.f80103e);
        parcel.writeInt(this.f80104f);
        parcel.writeInt(this.f80105g);
        Long l = this.f80106h;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f80107i);
    }
}
