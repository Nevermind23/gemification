package p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import hd0.C24978b;
import kotlin.jvm.internal.C41536l;
import p913uu.C28944i;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferRefinanceUiModel */
public final class CreditOfferRefinanceUiModel implements Parcelable {
    public static final Parcelable.Creator<CreditOfferRefinanceUiModel> CREATOR = new C21687a();

    /* renamed from: d */
    private final C28944i f57870d;

    /* renamed from: e */
    private final String f57871e;

    /* renamed from: f */
    private final String f57872f;

    /* renamed from: g */
    private final String f57873g;

    /* renamed from: h */
    private final String f57874h;

    /* renamed from: i */
    private final String f57875i;

    /* renamed from: j */
    private final String f57876j;

    /* renamed from: k */
    private final String f57877k;

    /* renamed from: l */
    private final String f57878l;

    /* renamed from: m */
    private final String f57879m;

    /* renamed from: n */
    private final String f57880n;

    /* renamed from: o */
    private final C24978b f57881o;

    /* renamed from: p */
    private final String f57882p;

    /* renamed from: q */
    private final String f57883q;

    /* renamed from: r */
    private final String f57884r;

    /* renamed from: s */
    private final String f57885s;

    /* renamed from: t */
    private final boolean f57886t;

    /* renamed from: u */
    private boolean f57887u;

    /* renamed from: v */
    private boolean f57888v;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferRefinanceUiModel$a */
    public static final class C21687a implements Parcelable.Creator {
        /* renamed from: a */
        public final CreditOfferRefinanceUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            C28944i valueOf = parcel.readInt() == 0 ? null : C28944i.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            C24978b valueOf2 = C24978b.valueOf(parcel.readString());
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new CreditOfferRefinanceUiModel(valueOf, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, valueOf2, readString11, readString12, readString13, readString14, z2, z3, z);
        }

        /* renamed from: b */
        public final CreditOfferRefinanceUiModel[] newArray(int i) {
            return new CreditOfferRefinanceUiModel[i];
        }
    }

    public CreditOfferRefinanceUiModel(C28944i iVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C24978b bVar, String str11, String str12, String str13, String str14, boolean z, boolean z2, boolean z3) {
        C24978b bVar2 = bVar;
        C41536l.m120489i(str4, "productName");
        C41536l.m120489i(str6, "productAmount");
        C41536l.m120489i(bVar2, "productRefFlag");
        this.f57870d = iVar;
        this.f57871e = str;
        this.f57872f = str2;
        this.f57873g = str3;
        this.f57874h = str4;
        this.f57875i = str5;
        this.f57876j = str6;
        this.f57877k = str7;
        this.f57878l = str8;
        this.f57879m = str9;
        this.f57880n = str10;
        this.f57881o = bVar2;
        this.f57882p = str11;
        this.f57883q = str12;
        this.f57884r = str13;
        this.f57885s = str14;
        this.f57886t = z;
        this.f57887u = z2;
        this.f57888v = z3;
    }

    /* renamed from: b */
    public static /* synthetic */ CreditOfferRefinanceUiModel m70148b(CreditOfferRefinanceUiModel creditOfferRefinanceUiModel, C28944i iVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C24978b bVar, String str11, String str12, String str13, String str14, boolean z, boolean z2, boolean z3, int i, Object obj) {
        CreditOfferRefinanceUiModel creditOfferRefinanceUiModel2 = creditOfferRefinanceUiModel;
        int i2 = i;
        return creditOfferRefinanceUiModel.mo54075a((i2 & 1) != 0 ? creditOfferRefinanceUiModel2.f57870d : iVar, (i2 & 2) != 0 ? creditOfferRefinanceUiModel2.f57871e : str, (i2 & 4) != 0 ? creditOfferRefinanceUiModel2.f57872f : str2, (i2 & 8) != 0 ? creditOfferRefinanceUiModel2.f57873g : str3, (i2 & 16) != 0 ? creditOfferRefinanceUiModel2.f57874h : str4, (i2 & 32) != 0 ? creditOfferRefinanceUiModel2.f57875i : str5, (i2 & 64) != 0 ? creditOfferRefinanceUiModel2.f57876j : str6, (i2 & 128) != 0 ? creditOfferRefinanceUiModel2.f57877k : str7, (i2 & C11398b.f33139r) != 0 ? creditOfferRefinanceUiModel2.f57878l : str8, (i2 & C11398b.f33140s) != 0 ? creditOfferRefinanceUiModel2.f57879m : str9, (i2 & C11398b.f33141t) != 0 ? creditOfferRefinanceUiModel2.f57880n : str10, (i2 & C11398b.f33142u) != 0 ? creditOfferRefinanceUiModel2.f57881o : bVar, (i2 & C11398b.f33143v) != 0 ? creditOfferRefinanceUiModel2.f57882p : str11, (i2 & 8192) != 0 ? creditOfferRefinanceUiModel2.f57883q : str12, (i2 & 16384) != 0 ? creditOfferRefinanceUiModel2.f57884r : str13, (i2 & 32768) != 0 ? creditOfferRefinanceUiModel2.f57885s : str14, (i2 & 65536) != 0 ? creditOfferRefinanceUiModel2.f57886t : z, (i2 & 131072) != 0 ? creditOfferRefinanceUiModel2.f57887u : z2, (i2 & 262144) != 0 ? creditOfferRefinanceUiModel2.f57888v : z3);
    }

    /* renamed from: a */
    public final CreditOfferRefinanceUiModel mo54075a(C28944i iVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C24978b bVar, String str11, String str12, String str13, String str14, boolean z, boolean z2, boolean z3) {
        C28944i iVar2 = iVar;
        C41536l.m120489i(str4, "productName");
        C41536l.m120489i(str6, "productAmount");
        C41536l.m120489i(bVar, "productRefFlag");
        return new CreditOfferRefinanceUiModel(iVar, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, bVar, str11, str12, str13, str14, z, z2, z3);
    }

    /* renamed from: d */
    public final String mo54076d() {
        return this.f57877k;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo54078e() {
        return this.f57878l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditOfferRefinanceUiModel)) {
            return false;
        }
        CreditOfferRefinanceUiModel creditOfferRefinanceUiModel = (CreditOfferRefinanceUiModel) obj;
        return this.f57870d == creditOfferRefinanceUiModel.f57870d && C41536l.m120484d(this.f57871e, creditOfferRefinanceUiModel.f57871e) && C41536l.m120484d(this.f57872f, creditOfferRefinanceUiModel.f57872f) && C41536l.m120484d(this.f57873g, creditOfferRefinanceUiModel.f57873g) && C41536l.m120484d(this.f57874h, creditOfferRefinanceUiModel.f57874h) && C41536l.m120484d(this.f57875i, creditOfferRefinanceUiModel.f57875i) && C41536l.m120484d(this.f57876j, creditOfferRefinanceUiModel.f57876j) && C41536l.m120484d(this.f57877k, creditOfferRefinanceUiModel.f57877k) && C41536l.m120484d(this.f57878l, creditOfferRefinanceUiModel.f57878l) && C41536l.m120484d(this.f57879m, creditOfferRefinanceUiModel.f57879m) && C41536l.m120484d(this.f57880n, creditOfferRefinanceUiModel.f57880n) && this.f57881o == creditOfferRefinanceUiModel.f57881o && C41536l.m120484d(this.f57882p, creditOfferRefinanceUiModel.f57882p) && C41536l.m120484d(this.f57883q, creditOfferRefinanceUiModel.f57883q) && C41536l.m120484d(this.f57884r, creditOfferRefinanceUiModel.f57884r) && C41536l.m120484d(this.f57885s, creditOfferRefinanceUiModel.f57885s) && this.f57886t == creditOfferRefinanceUiModel.f57886t && this.f57887u == creditOfferRefinanceUiModel.f57887u && this.f57888v == creditOfferRefinanceUiModel.f57888v;
    }

    /* renamed from: f */
    public final String mo54080f() {
        return this.f57876j;
    }

    /* renamed from: g */
    public final String mo54081g() {
        return this.f57882p;
    }

    /* renamed from: h */
    public final String mo54082h() {
        return this.f57871e;
    }

    public int hashCode() {
        C28944i iVar = this.f57870d;
        int i = 0;
        int hashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        String str = this.f57871e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57872f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57873g;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f57874h.hashCode()) * 31;
        String str4 = this.f57875i;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f57876j.hashCode()) * 31;
        String str5 = this.f57877k;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f57878l;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f57879m;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f57880n;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.f57881o.hashCode()) * 31;
        String str9 = this.f57882p;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f57883q;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f57884r;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f57885s;
        if (str12 != null) {
            i = str12.hashCode();
        }
        int i2 = (hashCode12 + i) * 31;
        boolean z = this.f57886t;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f57887u;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f57888v;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo54084i() {
        return this.f57879m;
    }

    /* renamed from: j */
    public final String mo54085j() {
        return this.f57885s;
    }

    /* renamed from: k */
    public final String mo54086k() {
        return this.f57873g;
    }

    /* renamed from: l */
    public final String mo54087l() {
        return this.f57875i;
    }

    /* renamed from: m */
    public final String mo54088m() {
        return this.f57872f;
    }

    /* renamed from: p */
    public final String mo54089p() {
        return this.f57874h;
    }

    /* renamed from: q */
    public final String mo54090q() {
        return this.f57884r;
    }

    /* renamed from: r */
    public final String mo54091r() {
        return this.f57880n;
    }

    /* renamed from: s */
    public final C24978b mo54092s() {
        return this.f57881o;
    }

    /* renamed from: t */
    public final C28944i mo54093t() {
        return this.f57870d;
    }

    public String toString() {
        C28944i iVar = this.f57870d;
        String str = this.f57871e;
        String str2 = this.f57872f;
        String str3 = this.f57873g;
        String str4 = this.f57874h;
        String str5 = this.f57875i;
        String str6 = this.f57876j;
        String str7 = this.f57877k;
        String str8 = this.f57878l;
        String str9 = this.f57879m;
        String str10 = this.f57880n;
        C24978b bVar = this.f57881o;
        String str11 = this.f57882p;
        String str12 = this.f57883q;
        String str13 = this.f57884r;
        String str14 = this.f57885s;
        boolean z = this.f57886t;
        boolean z2 = this.f57887u;
        boolean z3 = this.f57888v;
        return "CreditOfferRefinanceUiModel(productSource=" + iVar + ", productClass=" + str + ", productKey=" + str2 + ", productDictionaryKey=" + str3 + ", productName=" + str4 + ", productInitAmt=" + str5 + ", productAmount=" + str6 + ", desireRefFlag=" + str7 + ", oldCardIconBase64=" + str8 + ", productCode=" + str9 + ", productPmt=" + str10 + ", productRefFlag=" + bVar + ", productCcy=" + str11 + ", productType=" + str12 + ", productNo=" + str13 + ", productCreditorName=" + str14 + ", isCreditorIdentified=" + z + ", isRefinanceMandatory=" + z2 + ", isChecked=" + z3 + ")";
    }

    /* renamed from: u */
    public final String mo54095u() {
        return this.f57883q;
    }

    /* renamed from: v */
    public final boolean mo54096v() {
        return this.f57888v;
    }

    /* renamed from: w */
    public final boolean mo54097w() {
        return this.f57886t;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        C28944i iVar = this.f57870d;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iVar.name());
        }
        parcel.writeString(this.f57871e);
        parcel.writeString(this.f57872f);
        parcel.writeString(this.f57873g);
        parcel.writeString(this.f57874h);
        parcel.writeString(this.f57875i);
        parcel.writeString(this.f57876j);
        parcel.writeString(this.f57877k);
        parcel.writeString(this.f57878l);
        parcel.writeString(this.f57879m);
        parcel.writeString(this.f57880n);
        parcel.writeString(this.f57881o.name());
        parcel.writeString(this.f57882p);
        parcel.writeString(this.f57883q);
        parcel.writeString(this.f57884r);
        parcel.writeString(this.f57885s);
        parcel.writeInt(this.f57886t ? 1 : 0);
        parcel.writeInt(this.f57887u ? 1 : 0);
        parcel.writeInt(this.f57888v ? 1 : 0);
    }

    /* renamed from: x */
    public final boolean mo54099x() {
        return this.f57887u;
    }

    /* renamed from: y */
    public final void mo54100y(boolean z) {
        this.f57888v = z;
    }
}
