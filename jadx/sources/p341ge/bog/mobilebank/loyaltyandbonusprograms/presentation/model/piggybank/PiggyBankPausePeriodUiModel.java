package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankPausePeriodUiModel */
public final class PiggyBankPausePeriodUiModel implements Parcelable {
    public static final Parcelable.Creator<PiggyBankPausePeriodUiModel> CREATOR = new C33114a();

    /* renamed from: d */
    private final String f81107d;

    /* renamed from: e */
    private final String f81108e;

    /* renamed from: f */
    private final String f81109f;

    /* renamed from: g */
    private final String f81110g;

    /* renamed from: h */
    private final String f81111h;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankPausePeriodUiModel$a */
    public static final class C33114a implements Parcelable.Creator {
        /* renamed from: a */
        public final PiggyBankPausePeriodUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new PiggyBankPausePeriodUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final PiggyBankPausePeriodUiModel[] newArray(int i) {
            return new PiggyBankPausePeriodUiModel[i];
        }
    }

    public PiggyBankPausePeriodUiModel(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "periodType");
        C41536l.m120489i(str2, "startDate");
        C41536l.m120489i(str3, "endDate");
        this.f81107d = str;
        this.f81108e = str2;
        this.f81109f = str3;
        this.f81110g = str4;
        this.f81111h = str5;
    }

    /* renamed from: a */
    public final String mo75169a() {
        return this.f81110g;
    }

    /* renamed from: b */
    public final String mo75170b() {
        return this.f81111h;
    }

    /* renamed from: d */
    public final String mo75171d() {
        return this.f81109f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo75173e() {
        return this.f81108e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiggyBankPausePeriodUiModel)) {
            return false;
        }
        PiggyBankPausePeriodUiModel piggyBankPausePeriodUiModel = (PiggyBankPausePeriodUiModel) obj;
        return C41536l.m120484d(this.f81107d, piggyBankPausePeriodUiModel.f81107d) && C41536l.m120484d(this.f81108e, piggyBankPausePeriodUiModel.f81108e) && C41536l.m120484d(this.f81109f, piggyBankPausePeriodUiModel.f81109f) && C41536l.m120484d(this.f81110g, piggyBankPausePeriodUiModel.f81110g) && C41536l.m120484d(this.f81111h, piggyBankPausePeriodUiModel.f81111h);
    }

    public int hashCode() {
        int hashCode = ((((this.f81107d.hashCode() * 31) + this.f81108e.hashCode()) * 31) + this.f81109f.hashCode()) * 31;
        String str = this.f81110g;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81111h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f81107d;
        String str2 = this.f81108e;
        String str3 = this.f81109f;
        String str4 = this.f81110g;
        String str5 = this.f81111h;
        return "PiggyBankPausePeriodUiModel(periodType=" + str + ", startDate=" + str2 + ", endDate=" + str3 + ", dictionaryKey=" + str4 + ", dictionaryValue=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f81107d);
        parcel.writeString(this.f81108e);
        parcel.writeString(this.f81109f);
        parcel.writeString(this.f81110g);
        parcel.writeString(this.f81111h);
    }
}
