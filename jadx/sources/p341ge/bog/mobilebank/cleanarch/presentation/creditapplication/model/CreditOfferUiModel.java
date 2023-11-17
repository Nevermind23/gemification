package p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferUiModel */
public final class CreditOfferUiModel implements Parcelable {
    public static final Parcelable.Creator<CreditOfferUiModel> CREATOR = new C21688a();

    /* renamed from: d */
    private final String f57889d;

    /* renamed from: e */
    private final String f57890e;

    /* renamed from: f */
    private final String f57891f;

    /* renamed from: g */
    private final String f57892g;

    /* renamed from: h */
    private final String f57893h;

    /* renamed from: i */
    private final String f57894i;

    /* renamed from: j */
    private final String f57895j;

    /* renamed from: k */
    private final String f57896k;

    /* renamed from: l */
    private final String f57897l;

    /* renamed from: m */
    private final String f57898m;

    /* renamed from: n */
    private final String f57899n;

    /* renamed from: o */
    private final BigDecimal f57900o;

    /* renamed from: p */
    private final BigDecimal f57901p;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferUiModel$a */
    public static final class C21688a implements Parcelable.Creator {
        /* renamed from: a */
        public final CreditOfferUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CreditOfferUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* renamed from: b */
        public final CreditOfferUiModel[] newArray(int i) {
            return new CreditOfferUiModel[i];
        }
    }

    public CreditOfferUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C41536l.m120489i(str, "cardName");
        C41536l.m120489i(str2, "cardType");
        C41536l.m120489i(str3, "cardCcy");
        C41536l.m120489i(str6, "periodUnit");
        C41536l.m120489i(str7, "comisAmount");
        C41536l.m120489i(str8, "templCode");
        C41536l.m120489i(str9, "periodLength");
        C41536l.m120489i(str10, "cardClass");
        C41536l.m120489i(bigDecimal, "minLimit");
        C41536l.m120489i(bigDecimal2, "maxLimit");
        this.f57889d = str;
        this.f57890e = str2;
        this.f57891f = str3;
        this.f57892g = str4;
        this.f57893h = str5;
        this.f57894i = str6;
        this.f57895j = str7;
        this.f57896k = str8;
        this.f57897l = str9;
        this.f57898m = str10;
        this.f57899n = str11;
        this.f57900o = bigDecimal;
        this.f57901p = bigDecimal2;
    }

    /* renamed from: a */
    public final String mo54105a() {
        return this.f57891f;
    }

    /* renamed from: b */
    public final BigDecimal mo54106b() {
        return this.f57901p;
    }

    /* renamed from: d */
    public final BigDecimal mo54107d() {
        return this.f57900o;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo54109e() {
        return this.f57896k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditOfferUiModel)) {
            return false;
        }
        CreditOfferUiModel creditOfferUiModel = (CreditOfferUiModel) obj;
        return C41536l.m120484d(this.f57889d, creditOfferUiModel.f57889d) && C41536l.m120484d(this.f57890e, creditOfferUiModel.f57890e) && C41536l.m120484d(this.f57891f, creditOfferUiModel.f57891f) && C41536l.m120484d(this.f57892g, creditOfferUiModel.f57892g) && C41536l.m120484d(this.f57893h, creditOfferUiModel.f57893h) && C41536l.m120484d(this.f57894i, creditOfferUiModel.f57894i) && C41536l.m120484d(this.f57895j, creditOfferUiModel.f57895j) && C41536l.m120484d(this.f57896k, creditOfferUiModel.f57896k) && C41536l.m120484d(this.f57897l, creditOfferUiModel.f57897l) && C41536l.m120484d(this.f57898m, creditOfferUiModel.f57898m) && C41536l.m120484d(this.f57899n, creditOfferUiModel.f57899n) && C41536l.m120484d(this.f57900o, creditOfferUiModel.f57900o) && C41536l.m120484d(this.f57901p, creditOfferUiModel.f57901p);
    }

    public int hashCode() {
        int hashCode = ((((this.f57889d.hashCode() * 31) + this.f57890e.hashCode()) * 31) + this.f57891f.hashCode()) * 31;
        String str = this.f57892g;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57893h;
        int hashCode3 = (((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f57894i.hashCode()) * 31) + this.f57895j.hashCode()) * 31) + this.f57896k.hashCode()) * 31) + this.f57897l.hashCode()) * 31) + this.f57898m.hashCode()) * 31;
        String str3 = this.f57899n;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((hashCode3 + i) * 31) + this.f57900o.hashCode()) * 31) + this.f57901p.hashCode();
    }

    public String toString() {
        String str = this.f57889d;
        String str2 = this.f57890e;
        String str3 = this.f57891f;
        String str4 = this.f57892g;
        String str5 = this.f57893h;
        String str6 = this.f57894i;
        String str7 = this.f57895j;
        String str8 = this.f57896k;
        String str9 = this.f57897l;
        String str10 = this.f57898m;
        String str11 = this.f57899n;
        BigDecimal bigDecimal = this.f57900o;
        BigDecimal bigDecimal2 = this.f57901p;
        return "CreditOfferUiModel(cardName=" + str + ", cardType=" + str2 + ", cardCcy=" + str3 + ", comisCcy=" + str4 + ", productKey=" + str5 + ", periodUnit=" + str6 + ", comisAmount=" + str7 + ", templCode=" + str8 + ", periodLength=" + str9 + ", cardClass=" + str10 + ", cardGroup=" + str11 + ", minLimit=" + bigDecimal + ", maxLimit=" + bigDecimal2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f57889d);
        parcel.writeString(this.f57890e);
        parcel.writeString(this.f57891f);
        parcel.writeString(this.f57892g);
        parcel.writeString(this.f57893h);
        parcel.writeString(this.f57894i);
        parcel.writeString(this.f57895j);
        parcel.writeString(this.f57896k);
        parcel.writeString(this.f57897l);
        parcel.writeString(this.f57898m);
        parcel.writeString(this.f57899n);
        parcel.writeSerializable(this.f57900o);
        parcel.writeSerializable(this.f57901p);
    }
}
