package p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ClaDetailsUiModel */
public final class ClaDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<ClaDetailsUiModel> CREATOR = new C22678a();

    /* renamed from: d */
    private final long f59869d;

    /* renamed from: e */
    private final String f59870e;

    /* renamed from: f */
    private final String f59871f;

    /* renamed from: g */
    private final String f59872g;

    /* renamed from: h */
    private final int f59873h;

    /* renamed from: i */
    private final int f59874i;

    /* renamed from: j */
    private final BigDecimal f59875j;

    /* renamed from: k */
    private final BigDecimal f59876k;

    /* renamed from: l */
    private final BigDecimal f59877l;

    /* renamed from: m */
    private final String f59878m;

    /* renamed from: n */
    private final String f59879n;

    /* renamed from: o */
    private final String f59880o;

    /* renamed from: p */
    private final List f59881p;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ClaDetailsUiModel$a */
    public static final class C22678a implements Parcelable.Creator {
        /* renamed from: a */
        public final ClaDetailsUiModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            String str = readString6;
            int i = 0;
            while (i != readInt3) {
                arrayList.add(parcel2.readParcelable(ClaDetailsUiModel.class.getClassLoader()));
                i++;
                readInt3 = readInt3;
            }
            return new ClaDetailsUiModel(readLong, readString, readString2, readString3, readInt, readInt2, bigDecimal, bigDecimal2, bigDecimal3, readString4, readString5, str, arrayList);
        }

        /* renamed from: b */
        public final ClaDetailsUiModel[] newArray(int i) {
            return new ClaDetailsUiModel[i];
        }
    }

    public ClaDetailsUiModel(long j, String str, String str2, String str3, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, String str5, String str6, List list) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(str2, "subProductType");
        C41536l.m120489i(str3, "periodType");
        C41536l.m120489i(bigDecimal, "maxAmount");
        C41536l.m120489i(bigDecimal2, "minAmount");
        C41536l.m120489i(bigDecimal3, "incomeMinAmount");
        C41536l.m120489i(str4, "status");
        C41536l.m120489i(str5, "productCurrency");
        C41536l.m120489i(str6, "prodTermsDictionaryKey");
        C41536l.m120489i(list, "terms");
        this.f59869d = j;
        this.f59870e = str;
        this.f59871f = str2;
        this.f59872g = str3;
        this.f59873h = i;
        this.f59874i = i2;
        this.f59875j = bigDecimal;
        this.f59876k = bigDecimal2;
        this.f59877l = bigDecimal3;
        this.f59878m = str4;
        this.f59879n = str5;
        this.f59880o = str6;
        this.f59881p = list;
    }

    /* renamed from: b */
    public static /* synthetic */ ClaDetailsUiModel m73498b(ClaDetailsUiModel claDetailsUiModel, long j, String str, String str2, String str3, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, String str5, String str6, List list, int i3, Object obj) {
        ClaDetailsUiModel claDetailsUiModel2 = claDetailsUiModel;
        int i4 = i3;
        return claDetailsUiModel.mo56186a((i4 & 1) != 0 ? claDetailsUiModel2.f59869d : j, (i4 & 2) != 0 ? claDetailsUiModel2.f59870e : str, (i4 & 4) != 0 ? claDetailsUiModel2.f59871f : str2, (i4 & 8) != 0 ? claDetailsUiModel2.f59872g : str3, (i4 & 16) != 0 ? claDetailsUiModel2.f59873h : i, (i4 & 32) != 0 ? claDetailsUiModel2.f59874i : i2, (i4 & 64) != 0 ? claDetailsUiModel2.f59875j : bigDecimal, (i4 & 128) != 0 ? claDetailsUiModel2.f59876k : bigDecimal2, (i4 & C11398b.f33139r) != 0 ? claDetailsUiModel2.f59877l : bigDecimal3, (i4 & C11398b.f33140s) != 0 ? claDetailsUiModel2.f59878m : str4, (i4 & C11398b.f33141t) != 0 ? claDetailsUiModel2.f59879n : str5, (i4 & C11398b.f33142u) != 0 ? claDetailsUiModel2.f59880o : str6, (i4 & C11398b.f33143v) != 0 ? claDetailsUiModel2.f59881p : list);
    }

    /* renamed from: a */
    public final ClaDetailsUiModel mo56186a(long j, String str, String str2, String str3, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, String str5, String str6, List list) {
        String str7 = str;
        C41536l.m120489i(str7, "productType");
        String str8 = str2;
        C41536l.m120489i(str8, "subProductType");
        String str9 = str3;
        C41536l.m120489i(str9, "periodType");
        BigDecimal bigDecimal4 = bigDecimal;
        C41536l.m120489i(bigDecimal4, "maxAmount");
        BigDecimal bigDecimal5 = bigDecimal2;
        C41536l.m120489i(bigDecimal5, "minAmount");
        BigDecimal bigDecimal6 = bigDecimal3;
        C41536l.m120489i(bigDecimal6, "incomeMinAmount");
        String str10 = str4;
        C41536l.m120489i(str10, "status");
        String str11 = str5;
        C41536l.m120489i(str11, "productCurrency");
        String str12 = str6;
        C41536l.m120489i(str12, "prodTermsDictionaryKey");
        List list2 = list;
        C41536l.m120489i(list2, "terms");
        return new ClaDetailsUiModel(j, str7, str8, str9, i, i2, bigDecimal4, bigDecimal5, bigDecimal6, str10, str11, str12, list2);
    }

    /* renamed from: d */
    public final BigDecimal mo56187d() {
        return this.f59877l;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final BigDecimal mo56189e() {
        return this.f59875j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaDetailsUiModel)) {
            return false;
        }
        ClaDetailsUiModel claDetailsUiModel = (ClaDetailsUiModel) obj;
        return this.f59869d == claDetailsUiModel.f59869d && C41536l.m120484d(this.f59870e, claDetailsUiModel.f59870e) && C41536l.m120484d(this.f59871f, claDetailsUiModel.f59871f) && C41536l.m120484d(this.f59872g, claDetailsUiModel.f59872g) && this.f59873h == claDetailsUiModel.f59873h && this.f59874i == claDetailsUiModel.f59874i && C41536l.m120484d(this.f59875j, claDetailsUiModel.f59875j) && C41536l.m120484d(this.f59876k, claDetailsUiModel.f59876k) && C41536l.m120484d(this.f59877l, claDetailsUiModel.f59877l) && C41536l.m120484d(this.f59878m, claDetailsUiModel.f59878m) && C41536l.m120484d(this.f59879n, claDetailsUiModel.f59879n) && C41536l.m120484d(this.f59880o, claDetailsUiModel.f59880o) && C41536l.m120484d(this.f59881p, claDetailsUiModel.f59881p);
    }

    /* renamed from: f */
    public final BigDecimal mo56191f() {
        return this.f59876k;
    }

    /* renamed from: g */
    public final String mo56192g() {
        return this.f59879n;
    }

    /* renamed from: h */
    public final String mo56193h() {
        return this.f59870e;
    }

    public int hashCode() {
        return (((((((((((((((((((((((C7397t.m28148a(this.f59869d) * 31) + this.f59870e.hashCode()) * 31) + this.f59871f.hashCode()) * 31) + this.f59872g.hashCode()) * 31) + this.f59873h) * 31) + this.f59874i) * 31) + this.f59875j.hashCode()) * 31) + this.f59876k.hashCode()) * 31) + this.f59877l.hashCode()) * 31) + this.f59878m.hashCode()) * 31) + this.f59879n.hashCode()) * 31) + this.f59880o.hashCode()) * 31) + this.f59881p.hashCode();
    }

    /* renamed from: i */
    public final String mo56195i() {
        return this.f59871f;
    }

    /* renamed from: j */
    public final List mo56196j() {
        return this.f59881p;
    }

    public String toString() {
        long j = this.f59869d;
        String str = this.f59870e;
        String str2 = this.f59871f;
        String str3 = this.f59872g;
        int i = this.f59873h;
        int i2 = this.f59874i;
        BigDecimal bigDecimal = this.f59875j;
        BigDecimal bigDecimal2 = this.f59876k;
        BigDecimal bigDecimal3 = this.f59877l;
        String str4 = this.f59878m;
        String str5 = this.f59879n;
        String str6 = this.f59880o;
        List list = this.f59881p;
        return "ClaDetailsUiModel(Id=" + j + ", productType=" + str + ", subProductType=" + str2 + ", periodType=" + str3 + ", maxPeriod=" + i + ", minPeriod=" + i2 + ", maxAmount=" + bigDecimal + ", minAmount=" + bigDecimal2 + ", incomeMinAmount=" + bigDecimal3 + ", status=" + str4 + ", productCurrency=" + str5 + ", prodTermsDictionaryKey=" + str6 + ", terms=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f59869d);
        parcel.writeString(this.f59870e);
        parcel.writeString(this.f59871f);
        parcel.writeString(this.f59872g);
        parcel.writeInt(this.f59873h);
        parcel.writeInt(this.f59874i);
        parcel.writeSerializable(this.f59875j);
        parcel.writeSerializable(this.f59876k);
        parcel.writeSerializable(this.f59877l);
        parcel.writeString(this.f59878m);
        parcel.writeString(this.f59879n);
        parcel.writeString(this.f59880o);
        List<Parcelable> list = this.f59881p;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClaDetailsUiModel(long j, String str, String str2, String str3, int i, int i2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, String str5, String str6, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, i, i2, bigDecimal, bigDecimal2, bigDecimal3, str4, str5, str6, (i3 & C11398b.f33143v) != 0 ? C41341q.m119907j() : list);
    }
}
