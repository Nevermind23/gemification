package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAccountUiModel */
public final class BonusAccountUiModel implements Parcelable {
    public static final Parcelable.Creator<BonusAccountUiModel> CREATOR = new C21135a();

    /* renamed from: d */
    private final Long f56708d;

    /* renamed from: e */
    private final String f56709e;

    /* renamed from: f */
    private final Double f56710f;

    /* renamed from: g */
    private final String f56711g;

    /* renamed from: h */
    private final String f56712h;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAccountUiModel$a */
    public static final class C21135a implements Parcelable.Creator {
        /* renamed from: a */
        public final BonusAccountUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BonusAccountUiModel(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BonusAccountUiModel[] newArray(int i) {
            return new BonusAccountUiModel[i];
        }
    }

    public BonusAccountUiModel(Long l, String str, Double d, String str2, String str3) {
        this.f56708d = l;
        this.f56709e = str;
        this.f56710f = d;
        this.f56711g = str2;
        this.f56712h = str3;
    }

    /* renamed from: a */
    public final Long mo52685a() {
        return this.f56708d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusAccountUiModel)) {
            return false;
        }
        BonusAccountUiModel bonusAccountUiModel = (BonusAccountUiModel) obj;
        return C41536l.m120484d(this.f56708d, bonusAccountUiModel.f56708d) && C41536l.m120484d(this.f56709e, bonusAccountUiModel.f56709e) && C41536l.m120484d(this.f56710f, bonusAccountUiModel.f56710f) && C41536l.m120484d(this.f56711g, bonusAccountUiModel.f56711g) && C41536l.m120484d(this.f56712h, bonusAccountUiModel.f56712h);
    }

    public int hashCode() {
        Long l = this.f56708d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f56709e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f56710f;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f56711g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56712h;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        Long l = this.f56708d;
        String str = this.f56709e;
        Double d = this.f56710f;
        String str2 = this.f56711g;
        String str3 = this.f56712h;
        return "BonusAccountUiModel(acctKey=" + l + ", acctName=" + str + ", availableAmount=" + d + ", ccy=" + str2 + ", acctNo=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f56708d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f56709e);
        Double d = this.f56710f;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f56711g);
        parcel.writeString(this.f56712h);
    }
}
