package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.CasTotalUiModel */
public final class CasTotalUiModel implements Parcelable {
    public static final Parcelable.Creator<CasTotalUiModel> CREATOR = new C21144a();

    /* renamed from: d */
    private final long f56800d;

    /* renamed from: e */
    private final String f56801e;

    /* renamed from: f */
    private final Double f56802f;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.CasTotalUiModel$a */
    public static final class C21144a implements Parcelable.Creator {
        /* renamed from: a */
        public final CasTotalUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CasTotalUiModel(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* renamed from: b */
        public final CasTotalUiModel[] newArray(int i) {
            return new CasTotalUiModel[i];
        }
    }

    public CasTotalUiModel(long j, String str, Double d) {
        this.f56800d = j;
        this.f56801e = str;
        this.f56802f = d;
    }

    /* renamed from: a */
    public final String mo52815a() {
        return this.f56801e;
    }

    /* renamed from: b */
    public final Double mo52816b() {
        return this.f56802f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasTotalUiModel)) {
            return false;
        }
        CasTotalUiModel casTotalUiModel = (CasTotalUiModel) obj;
        return this.f56800d == casTotalUiModel.f56800d && C41536l.m120484d(this.f56801e, casTotalUiModel.f56801e) && C41536l.m120484d(this.f56802f, casTotalUiModel.f56802f);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f56800d) * 31;
        String str = this.f56801e;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f56802f;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f56800d;
        String str = this.f56801e;
        Double d = this.f56802f;
        return "CasTotalUiModel(clientKey=" + j + ", ccy=" + str + ", totalAmount=" + d + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f56800d);
        parcel.writeString(this.f56801e);
        Double d = this.f56802f;
        if (d == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d.doubleValue());
    }
}
