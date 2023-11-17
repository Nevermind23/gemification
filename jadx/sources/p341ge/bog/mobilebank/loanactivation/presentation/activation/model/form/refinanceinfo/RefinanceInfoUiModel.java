package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo.RefinanceInfoUiModel */
public final class RefinanceInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<RefinanceInfoUiModel> CREATOR = new C32491a();

    /* renamed from: d */
    private final String f80076d;

    /* renamed from: e */
    private final String f80077e;

    /* renamed from: f */
    private final String f80078f;

    /* renamed from: g */
    private final String f80079g;

    /* renamed from: h */
    private final String f80080h;

    /* renamed from: i */
    private final String f80081i;

    /* renamed from: j */
    private final String f80082j;

    /* renamed from: k */
    private final String f80083k;

    /* renamed from: l */
    private final boolean f80084l;

    /* renamed from: m */
    private final String f80085m;

    /* renamed from: n */
    private final double f80086n;

    /* renamed from: o */
    private final boolean f80087o;

    /* renamed from: p */
    private final String f80088p;

    /* renamed from: q */
    private final String f80089q;

    /* renamed from: r */
    private final String f80090r;

    /* renamed from: s */
    private final String f80091s;

    /* renamed from: t */
    private final String f80092t;

    /* renamed from: u */
    private final String f80093u;

    /* renamed from: v */
    private final String f80094v;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo.RefinanceInfoUiModel$a */
    public static final class C32491a implements Parcelable.Creator {
        /* renamed from: a */
        public final RefinanceInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new RefinanceInfoUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readDouble(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final RefinanceInfoUiModel[] newArray(int i) {
            return new RefinanceInfoUiModel[i];
        }
    }

    public RefinanceInfoUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, double d, boolean z2, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        String str17 = str13;
        C41536l.m120489i(str, "productSource");
        C41536l.m120489i(str17, "productCcy");
        this.f80076d = str;
        this.f80077e = str2;
        this.f80078f = str3;
        this.f80079g = str4;
        this.f80080h = str5;
        this.f80081i = str6;
        this.f80082j = str7;
        this.f80083k = str8;
        this.f80084l = z;
        this.f80085m = str9;
        this.f80086n = d;
        this.f80087o = z2;
        this.f80088p = str10;
        this.f80089q = str11;
        this.f80090r = str12;
        this.f80091s = str17;
        this.f80092t = str14;
        this.f80093u = str15;
        this.f80094v = str16;
    }

    /* renamed from: a */
    public final String mo73501a() {
        return this.f80077e;
    }

    /* renamed from: b */
    public final boolean mo73502b() {
        return this.f80087o;
    }

    /* renamed from: d */
    public final double mo73503d() {
        return this.f80086n;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo73505e() {
        return this.f80091s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefinanceInfoUiModel)) {
            return false;
        }
        RefinanceInfoUiModel refinanceInfoUiModel = (RefinanceInfoUiModel) obj;
        return C41536l.m120484d(this.f80076d, refinanceInfoUiModel.f80076d) && C41536l.m120484d(this.f80077e, refinanceInfoUiModel.f80077e) && C41536l.m120484d(this.f80078f, refinanceInfoUiModel.f80078f) && C41536l.m120484d(this.f80079g, refinanceInfoUiModel.f80079g) && C41536l.m120484d(this.f80080h, refinanceInfoUiModel.f80080h) && C41536l.m120484d(this.f80081i, refinanceInfoUiModel.f80081i) && C41536l.m120484d(this.f80082j, refinanceInfoUiModel.f80082j) && C41536l.m120484d(this.f80083k, refinanceInfoUiModel.f80083k) && this.f80084l == refinanceInfoUiModel.f80084l && C41536l.m120484d(this.f80085m, refinanceInfoUiModel.f80085m) && Double.compare(this.f80086n, refinanceInfoUiModel.f80086n) == 0 && this.f80087o == refinanceInfoUiModel.f80087o && C41536l.m120484d(this.f80088p, refinanceInfoUiModel.f80088p) && C41536l.m120484d(this.f80089q, refinanceInfoUiModel.f80089q) && C41536l.m120484d(this.f80090r, refinanceInfoUiModel.f80090r) && C41536l.m120484d(this.f80091s, refinanceInfoUiModel.f80091s) && C41536l.m120484d(this.f80092t, refinanceInfoUiModel.f80092t) && C41536l.m120484d(this.f80093u, refinanceInfoUiModel.f80093u) && C41536l.m120484d(this.f80094v, refinanceInfoUiModel.f80094v);
    }

    /* renamed from: f */
    public final String mo73507f() {
        return this.f80078f;
    }

    /* renamed from: g */
    public final String mo73508g() {
        return this.f80088p;
    }

    /* renamed from: h */
    public final String mo73509h() {
        return this.f80082j;
    }

    public int hashCode() {
        int hashCode = this.f80076d.hashCode() * 31;
        String str = this.f80077e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f80078f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f80079g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f80080h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f80081i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f80082j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f80083k;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        boolean z = this.f80084l;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode8 + (z ? 1 : 0)) * 31;
        String str8 = this.f80085m;
        int hashCode9 = (((i2 + (str8 == null ? 0 : str8.hashCode())) * 31) + Double.doubleToLongBits(this.f80086n)) * 31;
        boolean z3 = this.f80087o;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode9 + (z2 ? 1 : 0)) * 31;
        String str9 = this.f80088p;
        int hashCode10 = (i3 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f80089q;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f80090r;
        int hashCode12 = (((hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.f80091s.hashCode()) * 31;
        String str12 = this.f80092t;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f80093u;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f80094v;
        if (str14 != null) {
            i = str14.hashCode();
        }
        return hashCode14 + i;
    }

    /* renamed from: i */
    public final String mo73511i() {
        return this.f80079g;
    }

    /* renamed from: j */
    public final String mo73512j() {
        return this.f80081i;
    }

    /* renamed from: k */
    public final String mo73513k() {
        return this.f80085m;
    }

    /* renamed from: l */
    public final String mo73514l() {
        return this.f80080h;
    }

    /* renamed from: m */
    public final String mo73515m() {
        return this.f80083k;
    }

    /* renamed from: p */
    public final String mo73516p() {
        return this.f80094v;
    }

    /* renamed from: q */
    public final String mo73517q() {
        return this.f80089q;
    }

    /* renamed from: r */
    public final String mo73518r() {
        return this.f80090r;
    }

    /* renamed from: s */
    public final String mo73519s() {
        return this.f80076d;
    }

    /* renamed from: t */
    public final String mo73520t() {
        return this.f80092t;
    }

    public String toString() {
        String str = this.f80076d;
        String str2 = this.f80077e;
        String str3 = this.f80078f;
        String str4 = this.f80079g;
        String str5 = this.f80080h;
        String str6 = this.f80081i;
        String str7 = this.f80082j;
        String str8 = this.f80083k;
        boolean z = this.f80084l;
        String str9 = this.f80085m;
        double d = this.f80086n;
        boolean z2 = this.f80087o;
        String str10 = this.f80088p;
        String str11 = this.f80089q;
        String str12 = this.f80090r;
        String str13 = this.f80091s;
        String str14 = this.f80092t;
        String str15 = this.f80093u;
        String str16 = this.f80094v;
        return "RefinanceInfoUiModel(productSource=" + str + ", desireProductCreditor=" + str2 + ", productClass=" + str3 + ", productCreditorName=" + str4 + ", productKey=" + str5 + ", productDictionaryKey=" + str6 + ", productCreditor=" + str7 + ", productName=" + str8 + ", isCreditorIdentified=" + z + ", productInitAmt=" + str9 + ", productAmount=" + d + ", desireRefFlag=" + z2 + ", productCode=" + str10 + ", productPmt=" + str11 + ", productRefFlag=" + str12 + ", productCcy=" + str13 + ", productSuggestedCreditor=" + str14 + ", productType=" + str15 + ", productNo=" + str16 + ")";
    }

    /* renamed from: u */
    public final String mo73522u() {
        return this.f80093u;
    }

    /* renamed from: v */
    public final boolean mo73523v() {
        return this.f80084l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f80076d);
        parcel.writeString(this.f80077e);
        parcel.writeString(this.f80078f);
        parcel.writeString(this.f80079g);
        parcel.writeString(this.f80080h);
        parcel.writeString(this.f80081i);
        parcel.writeString(this.f80082j);
        parcel.writeString(this.f80083k);
        parcel.writeInt(this.f80084l ? 1 : 0);
        parcel.writeString(this.f80085m);
        parcel.writeDouble(this.f80086n);
        parcel.writeInt(this.f80087o ? 1 : 0);
        parcel.writeString(this.f80088p);
        parcel.writeString(this.f80089q);
        parcel.writeString(this.f80090r);
        parcel.writeString(this.f80091s);
        parcel.writeString(this.f80092t);
        parcel.writeString(this.f80093u);
        parcel.writeString(this.f80094v);
    }
}
