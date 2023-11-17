package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardInfoUiModel */
public final class ScoolCardInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<ScoolCardInfoUiModel> CREATOR = new C14232a();

    /* renamed from: d */
    private final String f41783d;

    /* renamed from: e */
    private final String f41784e;

    /* renamed from: f */
    private final String f41785f;

    /* renamed from: g */
    private final String f41786g;

    /* renamed from: h */
    private final long f41787h;

    /* renamed from: i */
    private final String f41788i;

    /* renamed from: j */
    private final String f41789j;

    /* renamed from: k */
    private final boolean f41790k;

    /* renamed from: l */
    private final String f41791l;

    /* renamed from: m */
    private final boolean f41792m;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardInfoUiModel$a */
    public static final class C14232a implements Parcelable.Creator {
        /* renamed from: a */
        public final ScoolCardInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ScoolCardInfoUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final ScoolCardInfoUiModel[] newArray(int i) {
            return new ScoolCardInfoUiModel[i];
        }
    }

    public ScoolCardInfoUiModel(String str, String str2, String str3, String str4, long j, String str5, String str6, boolean z, String str7, boolean z2) {
        C41536l.m120489i(str, "plcClass");
        C41536l.m120489i(str2, "plcType");
        C41536l.m120489i(str3, "typeName");
        C41536l.m120489i(str4, "product");
        C41536l.m120489i(str5, "subProductCode");
        this.f41783d = str;
        this.f41784e = str2;
        this.f41785f = str3;
        this.f41786g = str4;
        this.f41787h = j;
        this.f41788i = str5;
        this.f41789j = str6;
        this.f41790k = z;
        this.f41791l = str7;
        this.f41792m = z2;
    }

    /* renamed from: a */
    public final boolean mo39846a() {
        return this.f41792m;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScoolCardInfoUiModel)) {
            return false;
        }
        ScoolCardInfoUiModel scoolCardInfoUiModel = (ScoolCardInfoUiModel) obj;
        return C41536l.m120484d(this.f41783d, scoolCardInfoUiModel.f41783d) && C41536l.m120484d(this.f41784e, scoolCardInfoUiModel.f41784e) && C41536l.m120484d(this.f41785f, scoolCardInfoUiModel.f41785f) && C41536l.m120484d(this.f41786g, scoolCardInfoUiModel.f41786g) && this.f41787h == scoolCardInfoUiModel.f41787h && C41536l.m120484d(this.f41788i, scoolCardInfoUiModel.f41788i) && C41536l.m120484d(this.f41789j, scoolCardInfoUiModel.f41789j) && this.f41790k == scoolCardInfoUiModel.f41790k && C41536l.m120484d(this.f41791l, scoolCardInfoUiModel.f41791l) && this.f41792m == scoolCardInfoUiModel.f41792m;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f41783d.hashCode() * 31) + this.f41784e.hashCode()) * 31) + this.f41785f.hashCode()) * 31) + this.f41786g.hashCode()) * 31) + C7397t.m28148a(this.f41787h)) * 31) + this.f41788i.hashCode()) * 31;
        String str = this.f41789j;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f41790k;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str2 = this.f41791l;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z3 = this.f41792m;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f41783d;
        String str2 = this.f41784e;
        String str3 = this.f41785f;
        String str4 = this.f41786g;
        long j = this.f41787h;
        String str5 = this.f41788i;
        String str6 = this.f41789j;
        boolean z = this.f41790k;
        String str7 = this.f41791l;
        boolean z2 = this.f41792m;
        return "ScoolCardInfoUiModel(plcClass=" + str + ", plcType=" + str2 + ", typeName=" + str3 + ", product=" + str4 + ", linkId=" + j + ", subProductCode=" + str5 + ", cardNameKey=" + str6 + ", csFlag=" + z + ", cardNameValue=" + str7 + ", regionFlag=" + z2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41783d);
        parcel.writeString(this.f41784e);
        parcel.writeString(this.f41785f);
        parcel.writeString(this.f41786g);
        parcel.writeLong(this.f41787h);
        parcel.writeString(this.f41788i);
        parcel.writeString(this.f41789j);
        parcel.writeInt(this.f41790k ? 1 : 0);
        parcel.writeString(this.f41791l);
        parcel.writeInt(this.f41792m ? 1 : 0);
    }
}
