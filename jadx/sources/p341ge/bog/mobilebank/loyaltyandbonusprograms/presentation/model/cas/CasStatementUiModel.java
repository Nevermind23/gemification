package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasStatementUiModel */
public final class CasStatementUiModel implements Parcelable {
    public static final Parcelable.Creator<CasStatementUiModel> CREATOR = new C33107a();

    /* renamed from: d */
    private final long f81068d;

    /* renamed from: e */
    private final long f81069e;

    /* renamed from: f */
    private final long f81070f;

    /* renamed from: g */
    private final double f81071g;

    /* renamed from: h */
    private final String f81072h;

    /* renamed from: i */
    private final int f81073i;

    /* renamed from: j */
    private final int f81074j;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasStatementUiModel$a */
    public static final class C33107a implements Parcelable.Creator {
        /* renamed from: a */
        public final CasStatementUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CasStatementUiModel(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readDouble(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public final CasStatementUiModel[] newArray(int i) {
            return new CasStatementUiModel[i];
        }
    }

    public CasStatementUiModel(long j, long j2, long j3, double d, String str, int i, int i2) {
        C41536l.m120489i(str, "ccy");
        this.f81068d = j;
        this.f81069e = j2;
        this.f81070f = j3;
        this.f81071g = d;
        this.f81072h = str;
        this.f81073i = i;
        this.f81074j = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasStatementUiModel)) {
            return false;
        }
        CasStatementUiModel casStatementUiModel = (CasStatementUiModel) obj;
        return this.f81068d == casStatementUiModel.f81068d && this.f81069e == casStatementUiModel.f81069e && this.f81070f == casStatementUiModel.f81070f && Double.compare(this.f81071g, casStatementUiModel.f81071g) == 0 && C41536l.m120484d(this.f81072h, casStatementUiModel.f81072h) && this.f81073i == casStatementUiModel.f81073i && this.f81074j == casStatementUiModel.f81074j;
    }

    public int hashCode() {
        return (((((((((((C7397t.m28148a(this.f81068d) * 31) + C7397t.m28148a(this.f81069e)) * 31) + C7397t.m28148a(this.f81070f)) * 31) + Double.doubleToLongBits(this.f81071g)) * 31) + this.f81072h.hashCode()) * 31) + this.f81073i) * 31) + this.f81074j;
    }

    public String toString() {
        long j = this.f81068d;
        long j2 = this.f81069e;
        long j3 = this.f81070f;
        double d = this.f81071g;
        String str = this.f81072h;
        int i = this.f81073i;
        int i2 = this.f81074j;
        return "CasStatementUiModel(clientId=" + j + ", clientKey=" + j2 + ", runDate=" + j3 + ", amount=" + d + ", ccy=" + str + ", transactions=" + i + ", totalCount=" + i2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f81068d);
        parcel.writeLong(this.f81069e);
        parcel.writeLong(this.f81070f);
        parcel.writeDouble(this.f81071g);
        parcel.writeString(this.f81072h);
        parcel.writeInt(this.f81073i);
        parcel.writeInt(this.f81074j);
    }
}
