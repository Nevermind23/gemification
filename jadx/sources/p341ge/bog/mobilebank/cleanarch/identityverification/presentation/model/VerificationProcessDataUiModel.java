package p341ge.bog.mobilebank.cleanarch.identityverification.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.model.VerificationProcessDataUiModel */
public final class VerificationProcessDataUiModel implements Parcelable {
    public static final Parcelable.Creator<VerificationProcessDataUiModel> CREATOR = new C21081a();

    /* renamed from: d */
    private final String f56593d;

    /* renamed from: e */
    private final String f56594e;

    /* renamed from: f */
    private final String f56595f;

    /* renamed from: g */
    private final String f56596g;

    /* renamed from: h */
    private final String f56597h;

    /* renamed from: i */
    private final String f56598i;

    /* renamed from: j */
    private final String f56599j;

    /* renamed from: k */
    private final String f56600k;

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.model.VerificationProcessDataUiModel$a */
    public static final class C21081a implements Parcelable.Creator {
        /* renamed from: a */
        public final VerificationProcessDataUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new VerificationProcessDataUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final VerificationProcessDataUiModel[] newArray(int i) {
            return new VerificationProcessDataUiModel[i];
        }
    }

    public VerificationProcessDataUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f56593d = str;
        this.f56594e = str2;
        this.f56595f = str3;
        this.f56596g = str4;
        this.f56597h = str5;
        this.f56598i = str6;
        this.f56599j = str7;
        this.f56600k = str8;
    }

    /* renamed from: a */
    public final String mo52284a() {
        return this.f56598i;
    }

    /* renamed from: b */
    public final String mo52285b() {
        return this.f56595f;
    }

    /* renamed from: d */
    public final String mo52286d() {
        return this.f56594e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo52288e() {
        return this.f56597h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationProcessDataUiModel)) {
            return false;
        }
        VerificationProcessDataUiModel verificationProcessDataUiModel = (VerificationProcessDataUiModel) obj;
        return C41536l.m120484d(this.f56593d, verificationProcessDataUiModel.f56593d) && C41536l.m120484d(this.f56594e, verificationProcessDataUiModel.f56594e) && C41536l.m120484d(this.f56595f, verificationProcessDataUiModel.f56595f) && C41536l.m120484d(this.f56596g, verificationProcessDataUiModel.f56596g) && C41536l.m120484d(this.f56597h, verificationProcessDataUiModel.f56597h) && C41536l.m120484d(this.f56598i, verificationProcessDataUiModel.f56598i) && C41536l.m120484d(this.f56599j, verificationProcessDataUiModel.f56599j) && C41536l.m120484d(this.f56600k, verificationProcessDataUiModel.f56600k);
    }

    /* renamed from: f */
    public final String mo52290f() {
        return this.f56599j;
    }

    /* renamed from: g */
    public final String mo52291g() {
        return this.f56600k;
    }

    /* renamed from: h */
    public final String mo52292h() {
        return this.f56596g;
    }

    public int hashCode() {
        String str = this.f56593d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f56594e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56595f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f56596g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f56597h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f56598i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f56599j;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f56600k;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.f56593d;
        String str2 = this.f56594e;
        String str3 = this.f56595f;
        String str4 = this.f56596g;
        String str5 = this.f56597h;
        String str6 = this.f56598i;
        String str7 = this.f56599j;
        String str8 = this.f56600k;
        return "VerificationProcessDataUiModel(merchantLogoId=" + str + ", merchantName=" + str2 + ", ip=" + str3 + ", userAgent=" + str4 + ", os=" + str5 + ", country=" + str6 + ", serviceName=" + str7 + ", terminalId=" + str8 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f56593d);
        parcel.writeString(this.f56594e);
        parcel.writeString(this.f56595f);
        parcel.writeString(this.f56596g);
        parcel.writeString(this.f56597h);
        parcel.writeString(this.f56598i);
        parcel.writeString(this.f56599j);
        parcel.writeString(this.f56600k);
    }
}
