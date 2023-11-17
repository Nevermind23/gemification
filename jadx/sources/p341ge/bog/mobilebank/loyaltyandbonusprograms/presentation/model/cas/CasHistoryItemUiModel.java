package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasHistoryItemUiModel */
public final class CasHistoryItemUiModel implements Parcelable {
    public static final Parcelable.Creator<CasHistoryItemUiModel> CREATOR = new C33103a();

    /* renamed from: d */
    private final int f81028d;

    /* renamed from: e */
    private final String f81029e;

    /* renamed from: f */
    private final int f81030f;

    /* renamed from: g */
    private final double f81031g;

    /* renamed from: h */
    private final String f81032h;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasHistoryItemUiModel$a */
    public static final class C33103a implements Parcelable.Creator {
        /* renamed from: a */
        public final CasHistoryItemUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CasHistoryItemUiModel(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readString());
        }

        /* renamed from: b */
        public final CasHistoryItemUiModel[] newArray(int i) {
            return new CasHistoryItemUiModel[i];
        }
    }

    public CasHistoryItemUiModel(int i, String str, int i2, double d, String str2) {
        C41536l.m120489i(str, "monthDictionaryKey");
        C41536l.m120489i(str2, "ccy");
        this.f81028d = i;
        this.f81029e = str;
        this.f81030f = i2;
        this.f81031g = d;
        this.f81032h = str2;
    }

    /* renamed from: a */
    public final double mo75017a() {
        return this.f81031g;
    }

    /* renamed from: b */
    public final String mo75018b() {
        return this.f81032h;
    }

    /* renamed from: d */
    public final String mo75019d() {
        return this.f81029e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasHistoryItemUiModel)) {
            return false;
        }
        CasHistoryItemUiModel casHistoryItemUiModel = (CasHistoryItemUiModel) obj;
        return this.f81028d == casHistoryItemUiModel.f81028d && C41536l.m120484d(this.f81029e, casHistoryItemUiModel.f81029e) && this.f81030f == casHistoryItemUiModel.f81030f && Double.compare(this.f81031g, casHistoryItemUiModel.f81031g) == 0 && C41536l.m120484d(this.f81032h, casHistoryItemUiModel.f81032h);
    }

    public int hashCode() {
        return (((((((this.f81028d * 31) + this.f81029e.hashCode()) * 31) + this.f81030f) * 31) + Double.doubleToLongBits(this.f81031g)) * 31) + this.f81032h.hashCode();
    }

    public String toString() {
        int i = this.f81028d;
        String str = this.f81029e;
        int i2 = this.f81030f;
        double d = this.f81031g;
        String str2 = this.f81032h;
        return "CasHistoryItemUiModel(orderNo=" + i + ", monthDictionaryKey=" + str + ", operationCount=" + i2 + ", amount=" + d + ", ccy=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f81028d);
        parcel.writeString(this.f81029e);
        parcel.writeInt(this.f81030f);
        parcel.writeDouble(this.f81031g);
        parcel.writeString(this.f81032h);
    }
}
