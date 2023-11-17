package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel */
public final class BonusAmexUiModel implements Parcelable {
    public static final Parcelable.Creator<BonusAmexUiModel> CREATOR = new C21136a();

    /* renamed from: d */
    private final Long f56713d;

    /* renamed from: e */
    private final Double f56714e;

    /* renamed from: f */
    private final Double f56715f;

    /* renamed from: g */
    private final Double f56716g;

    /* renamed from: h */
    private final Integer f56717h;

    /* renamed from: i */
    private final Double f56718i;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel$a */
    public static final class C21136a implements Parcelable.Creator {
        /* renamed from: a */
        public final BonusAmexUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BonusAmexUiModel(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* renamed from: b */
        public final BonusAmexUiModel[] newArray(int i) {
            return new BonusAmexUiModel[i];
        }
    }

    public BonusAmexUiModel(Long l, Double d, Double d2, Double d3, Integer num, Double d4) {
        this.f56713d = l;
        this.f56714e = d;
        this.f56715f = d2;
        this.f56716g = d3;
        this.f56717h = num;
        this.f56718i = d4;
    }

    /* renamed from: a */
    public final Double mo52695a() {
        return this.f56718i;
    }

    /* renamed from: b */
    public final Double mo52696b() {
        return this.f56716g;
    }

    /* renamed from: d */
    public final Double mo52697d() {
        return this.f56714e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Integer mo52699e() {
        return this.f56717h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusAmexUiModel)) {
            return false;
        }
        BonusAmexUiModel bonusAmexUiModel = (BonusAmexUiModel) obj;
        return C41536l.m120484d(this.f56713d, bonusAmexUiModel.f56713d) && C41536l.m120484d(this.f56714e, bonusAmexUiModel.f56714e) && C41536l.m120484d(this.f56715f, bonusAmexUiModel.f56715f) && C41536l.m120484d(this.f56716g, bonusAmexUiModel.f56716g) && C41536l.m120484d(this.f56717h, bonusAmexUiModel.f56717h) && C41536l.m120484d(this.f56718i, bonusAmexUiModel.f56718i);
    }

    /* renamed from: f */
    public final Long mo52701f() {
        return this.f56713d;
    }

    /* renamed from: g */
    public final Double mo52702g() {
        return this.f56715f;
    }

    public int hashCode() {
        Long l = this.f56713d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.f56714e;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f56715f;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f56716g;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f56717h;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Double d4 = this.f56718i;
        if (d4 != null) {
            i = d4.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        Long l = this.f56713d;
        Double d = this.f56714e;
        Double d2 = this.f56715f;
        Double d3 = this.f56716g;
        Integer num = this.f56717h;
        Double d4 = this.f56718i;
        return "BonusAmexUiModel(regDate=" + l + ", collected=" + d + ", spent=" + d2 + ", available=" + d3 + ", prizeCount=" + num + ", amountInGel=" + d4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f56713d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Double d = this.f56714e;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f56715f;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.f56716g;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        Integer num = this.f56717h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Double d4 = this.f56718i;
        if (d4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d4.doubleValue());
    }
}
