package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardTextsUiModel */
public final class DebitCardTextsUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardTextsUiModel> CREATOR = new C14222a();

    /* renamed from: d */
    private final String f41717d;

    /* renamed from: e */
    private final String f41718e;

    /* renamed from: f */
    private final String f41719f;

    /* renamed from: g */
    private final String f41720g;

    /* renamed from: h */
    private final String f41721h;

    /* renamed from: i */
    private final String f41722i;

    /* renamed from: j */
    private final String f41723j;

    /* renamed from: k */
    private final String f41724k;

    /* renamed from: l */
    private final String f41725l;

    /* renamed from: m */
    private final String f41726m;

    /* renamed from: n */
    private final String f41727n;

    /* renamed from: o */
    private final String f41728o;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardTextsUiModel$a */
    public static final class C14222a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardTextsUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardTextsUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DebitCardTextsUiModel[] newArray(int i) {
            return new DebitCardTextsUiModel[i];
        }
    }

    public DebitCardTextsUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.f41717d = str;
        this.f41718e = str2;
        this.f41719f = str3;
        this.f41720g = str4;
        this.f41721h = str5;
        this.f41722i = str6;
        this.f41723j = str7;
        this.f41724k = str8;
        this.f41725l = str9;
        this.f41726m = str10;
        this.f41727n = str11;
        this.f41728o = str12;
    }

    /* renamed from: a */
    public final String mo39625a() {
        return this.f41718e;
    }

    /* renamed from: b */
    public final String mo39626b() {
        return this.f41720g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardTextsUiModel)) {
            return false;
        }
        DebitCardTextsUiModel debitCardTextsUiModel = (DebitCardTextsUiModel) obj;
        return C41536l.m120484d(this.f41717d, debitCardTextsUiModel.f41717d) && C41536l.m120484d(this.f41718e, debitCardTextsUiModel.f41718e) && C41536l.m120484d(this.f41719f, debitCardTextsUiModel.f41719f) && C41536l.m120484d(this.f41720g, debitCardTextsUiModel.f41720g) && C41536l.m120484d(this.f41721h, debitCardTextsUiModel.f41721h) && C41536l.m120484d(this.f41722i, debitCardTextsUiModel.f41722i) && C41536l.m120484d(this.f41723j, debitCardTextsUiModel.f41723j) && C41536l.m120484d(this.f41724k, debitCardTextsUiModel.f41724k) && C41536l.m120484d(this.f41725l, debitCardTextsUiModel.f41725l) && C41536l.m120484d(this.f41726m, debitCardTextsUiModel.f41726m) && C41536l.m120484d(this.f41727n, debitCardTextsUiModel.f41727n) && C41536l.m120484d(this.f41728o, debitCardTextsUiModel.f41728o);
    }

    public int hashCode() {
        String str = this.f41717d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f41718e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f41719f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f41720g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f41721h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f41722i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f41723j;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f41724k;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f41725l;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f41726m;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f41727n;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f41728o;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        String str = this.f41717d;
        String str2 = this.f41718e;
        String str3 = this.f41719f;
        String str4 = this.f41720g;
        String str5 = this.f41721h;
        String str6 = this.f41722i;
        String str7 = this.f41723j;
        String str8 = this.f41724k;
        String str9 = this.f41725l;
        String str10 = this.f41726m;
        String str11 = this.f41727n;
        String str12 = this.f41728o;
        return "DebitCardTextsUiModel(advantagesKey=" + str + ", advantagesValue=" + str2 + ", expDateKey=" + str3 + ", expDateValue=" + str4 + ", minAmountKey=" + str5 + ", minAmountValue=" + str6 + ", cardDetailsKey=" + str7 + ", cardDetailsValue=" + str8 + ", cardPriceKey=" + str9 + ", cardPriceValue=" + str10 + ", shortDescKey=" + str11 + ", shortDescValue=" + str12 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41717d);
        parcel.writeString(this.f41718e);
        parcel.writeString(this.f41719f);
        parcel.writeString(this.f41720g);
        parcel.writeString(this.f41721h);
        parcel.writeString(this.f41722i);
        parcel.writeString(this.f41723j);
        parcel.writeString(this.f41724k);
        parcel.writeString(this.f41725l);
        parcel.writeString(this.f41726m);
        parcel.writeString(this.f41727n);
        parcel.writeString(this.f41728o);
    }
}
