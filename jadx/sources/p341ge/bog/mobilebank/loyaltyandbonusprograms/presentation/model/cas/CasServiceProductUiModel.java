package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasServiceProductUiModel */
public final class CasServiceProductUiModel implements Parcelable {
    public static final Parcelable.Creator<CasServiceProductUiModel> CREATOR = new C33106a();

    /* renamed from: A */
    private final String f81040A;

    /* renamed from: B */
    private final List f81041B;

    /* renamed from: C */
    private final List f81042C;

    /* renamed from: D */
    private final String f81043D;

    /* renamed from: E */
    private final String f81044E;

    /* renamed from: d */
    private final long f81045d;

    /* renamed from: e */
    private final long f81046e;

    /* renamed from: f */
    private final String f81047f;

    /* renamed from: g */
    private final long f81048g;

    /* renamed from: h */
    private final double f81049h;

    /* renamed from: i */
    private final String f81050i;

    /* renamed from: j */
    private final long f81051j;

    /* renamed from: k */
    private final String f81052k;

    /* renamed from: l */
    private final String f81053l;

    /* renamed from: m */
    private final String f81054m;

    /* renamed from: n */
    private final String f81055n;

    /* renamed from: o */
    private final String f81056o;

    /* renamed from: p */
    private final String f81057p;

    /* renamed from: q */
    private final double f81058q;

    /* renamed from: r */
    private final Double f81059r;

    /* renamed from: s */
    private final double f81060s;

    /* renamed from: t */
    private final String f81061t;

    /* renamed from: u */
    private final double f81062u;

    /* renamed from: v */
    private final boolean f81063v;

    /* renamed from: w */
    private final Date f81064w;

    /* renamed from: x */
    private final Date f81065x;

    /* renamed from: y */
    private final boolean f81066y;

    /* renamed from: z */
    private final String f81067z;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasServiceProductUiModel$a */
    public static final class C33106a implements Parcelable.Creator {
        /* renamed from: a */
        public final CasServiceProductUiModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString = parcel.readString();
            long readLong3 = parcel.readLong();
            double readDouble = parcel.readDouble();
            String readString2 = parcel.readString();
            long readLong4 = parcel.readLong();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            double readDouble2 = parcel.readDouble();
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            double readDouble3 = parcel.readDouble();
            String readString9 = parcel.readString();
            double readDouble4 = parcel.readDouble();
            boolean z = parcel.readInt() != 0;
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            boolean z2 = parcel.readInt() != 0;
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            int readInt = parcel.readInt();
            boolean z3 = z;
            ArrayList arrayList = new ArrayList(readInt);
            String str = readString3;
            int i = 0;
            while (i != readInt) {
                arrayList.add(CasAccountUiModel.CREATOR.createFromParcel(parcel2));
                i++;
                readInt = readInt;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            ArrayList arrayList3 = arrayList;
            int i2 = 0;
            while (i2 != readInt2) {
                arrayList2.add(DepositAccountUiModel.CREATOR.createFromParcel(parcel2));
                i2++;
                readInt2 = readInt2;
            }
            return new CasServiceProductUiModel(readLong, readLong2, readString, readLong3, readDouble, readString2, readLong4, str, readString4, readString5, readString6, readString7, readString8, readDouble2, valueOf, readDouble3, readString9, readDouble4, z3, date, date2, z2, readString10, readString11, arrayList3, arrayList2, parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CasServiceProductUiModel[] newArray(int i) {
            return new CasServiceProductUiModel[i];
        }
    }

    public CasServiceProductUiModel(long j, long j2, String str, long j3, double d, String str2, long j4, String str3, String str4, String str5, String str6, String str7, String str8, double d2, Double d3, double d4, String str9, double d5, boolean z, Date date, Date date2, boolean z2, String str10, String str11, List list, List list2, String str12, String str13) {
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        List list3 = list;
        List list4 = list2;
        C41536l.m120489i(str14, "scheme");
        C41536l.m120489i(str15, "schemeTariffCcy");
        C41536l.m120489i(str16, "agreeType");
        C41536l.m120489i(str17, "status");
        C41536l.m120489i(str18, "agreeNo");
        C41536l.m120489i(str19, "prodType");
        C41536l.m120489i(str20, "agreeCcy");
        C41536l.m120489i(str21, "depositAgreeType");
        C41536l.m120489i(list3, "accounts");
        C41536l.m120489i(list4, "depositAccounts");
        this.f81045d = j;
        this.f81046e = j2;
        this.f81047f = str14;
        this.f81048g = j3;
        this.f81049h = d;
        this.f81050i = str15;
        this.f81051j = j4;
        this.f81052k = str16;
        this.f81053l = str17;
        this.f81054m = str5;
        this.f81055n = str18;
        this.f81056o = str19;
        this.f81057p = str20;
        this.f81058q = d2;
        this.f81059r = d3;
        this.f81060s = d4;
        this.f81061t = str21;
        this.f81062u = d5;
        this.f81063v = z;
        this.f81064w = date;
        this.f81065x = date2;
        this.f81066y = z2;
        this.f81067z = str10;
        this.f81040A = str11;
        this.f81041B = list3;
        this.f81042C = list4;
        this.f81043D = str12;
        this.f81044E = str13;
    }

    /* renamed from: a */
    public final List mo75050a() {
        return this.f81041B;
    }

    /* renamed from: b */
    public final double mo75051b() {
        return this.f81062u;
    }

    /* renamed from: d */
    public final long mo75052d() {
        return this.f81045d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final double mo75054e() {
        return this.f81060s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasServiceProductUiModel)) {
            return false;
        }
        CasServiceProductUiModel casServiceProductUiModel = (CasServiceProductUiModel) obj;
        return this.f81045d == casServiceProductUiModel.f81045d && this.f81046e == casServiceProductUiModel.f81046e && C41536l.m120484d(this.f81047f, casServiceProductUiModel.f81047f) && this.f81048g == casServiceProductUiModel.f81048g && Double.compare(this.f81049h, casServiceProductUiModel.f81049h) == 0 && C41536l.m120484d(this.f81050i, casServiceProductUiModel.f81050i) && this.f81051j == casServiceProductUiModel.f81051j && C41536l.m120484d(this.f81052k, casServiceProductUiModel.f81052k) && C41536l.m120484d(this.f81053l, casServiceProductUiModel.f81053l) && C41536l.m120484d(this.f81054m, casServiceProductUiModel.f81054m) && C41536l.m120484d(this.f81055n, casServiceProductUiModel.f81055n) && C41536l.m120484d(this.f81056o, casServiceProductUiModel.f81056o) && C41536l.m120484d(this.f81057p, casServiceProductUiModel.f81057p) && Double.compare(this.f81058q, casServiceProductUiModel.f81058q) == 0 && C41536l.m120484d(this.f81059r, casServiceProductUiModel.f81059r) && Double.compare(this.f81060s, casServiceProductUiModel.f81060s) == 0 && C41536l.m120484d(this.f81061t, casServiceProductUiModel.f81061t) && Double.compare(this.f81062u, casServiceProductUiModel.f81062u) == 0 && this.f81063v == casServiceProductUiModel.f81063v && C41536l.m120484d(this.f81064w, casServiceProductUiModel.f81064w) && C41536l.m120484d(this.f81065x, casServiceProductUiModel.f81065x) && this.f81066y == casServiceProductUiModel.f81066y && C41536l.m120484d(this.f81067z, casServiceProductUiModel.f81067z) && C41536l.m120484d(this.f81040A, casServiceProductUiModel.f81040A) && C41536l.m120484d(this.f81041B, casServiceProductUiModel.f81041B) && C41536l.m120484d(this.f81042C, casServiceProductUiModel.f81042C) && C41536l.m120484d(this.f81043D, casServiceProductUiModel.f81043D) && C41536l.m120484d(this.f81044E, casServiceProductUiModel.f81044E);
    }

    /* renamed from: f */
    public final List mo75056f() {
        return this.f81042C;
    }

    /* renamed from: g */
    public final String mo75057g() {
        return this.f81043D;
    }

    /* renamed from: h */
    public final String mo75058h() {
        return this.f81054m;
    }

    public int hashCode() {
        int a = ((((((((((((((((C7397t.m28148a(this.f81045d) * 31) + C7397t.m28148a(this.f81046e)) * 31) + this.f81047f.hashCode()) * 31) + C7397t.m28148a(this.f81048g)) * 31) + Double.doubleToLongBits(this.f81049h)) * 31) + this.f81050i.hashCode()) * 31) + C7397t.m28148a(this.f81051j)) * 31) + this.f81052k.hashCode()) * 31) + this.f81053l.hashCode()) * 31;
        String str = this.f81054m;
        int i = 0;
        int hashCode = (((((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f81055n.hashCode()) * 31) + this.f81056o.hashCode()) * 31) + this.f81057p.hashCode()) * 31) + Double.doubleToLongBits(this.f81058q)) * 31;
        Double d = this.f81059r;
        int hashCode2 = (((((((hashCode + (d == null ? 0 : d.hashCode())) * 31) + Double.doubleToLongBits(this.f81060s)) * 31) + this.f81061t.hashCode()) * 31) + Double.doubleToLongBits(this.f81062u)) * 31;
        boolean z = this.f81063v;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        Date date = this.f81064w;
        int hashCode3 = (i2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f81065x;
        int hashCode4 = (hashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        boolean z3 = this.f81066y;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode4 + (z2 ? 1 : 0)) * 31;
        String str2 = this.f81067z;
        int hashCode5 = (i3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81040A;
        int hashCode6 = (((((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f81041B.hashCode()) * 31) + this.f81042C.hashCode()) * 31;
        String str4 = this.f81043D;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f81044E;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: i */
    public final boolean mo75060i() {
        return this.f81066y;
    }

    /* renamed from: j */
    public final Date mo75061j() {
        return this.f81065x;
    }

    /* renamed from: k */
    public final boolean mo75062k() {
        return this.f81063v;
    }

    /* renamed from: l */
    public final String mo75063l() {
        return this.f81050i;
    }

    /* renamed from: m */
    public final long mo75064m() {
        return this.f81048g;
    }

    /* renamed from: p */
    public final double mo75065p() {
        return this.f81049h;
    }

    /* renamed from: q */
    public final double mo75066q() {
        return this.f81058q;
    }

    /* renamed from: r */
    public final Double mo75067r() {
        return this.f81059r;
    }

    public String toString() {
        long j = this.f81045d;
        long j2 = this.f81046e;
        String str = this.f81047f;
        long j3 = this.f81048g;
        double d = this.f81049h;
        String str2 = this.f81050i;
        long j4 = this.f81051j;
        String str3 = this.f81052k;
        String str4 = this.f81053l;
        String str5 = this.f81054m;
        String str6 = this.f81055n;
        String str7 = this.f81056o;
        String str8 = str4;
        String str9 = this.f81057p;
        double d2 = this.f81058q;
        Double d3 = this.f81059r;
        double d4 = this.f81060s;
        String str10 = this.f81061t;
        double d5 = this.f81062u;
        boolean z = this.f81063v;
        Date date = this.f81064w;
        Date date2 = this.f81065x;
        boolean z2 = this.f81066y;
        String str11 = this.f81067z;
        String str12 = this.f81040A;
        List list = this.f81041B;
        List list2 = this.f81042C;
        String str13 = this.f81043D;
        String str14 = this.f81044E;
        return "CasServiceProductUiModel(clientServiceId=" + j + ", clientKey=" + j2 + ", scheme=" + str + ", schemeTariffId=" + j3 + ", schemeTariffValue=" + d + ", schemeTariffCcy=" + str2 + ", agreeKey=" + j4 + ", agreeType=" + str3 + ", status=" + str8 + ", name=" + str5 + ", agreeNo=" + str6 + ", prodType=" + str7 + ", agreeCcy=" + str9 + ", totalAmount=" + d2 + ", totalAmountAcct=" + d3 + ", currentMonthTotalAmount=" + d4 + ", depositAgreeType=" + str10 + ", agreeBalance=" + d5 + ", restFlag=" + z + ", restStartDate=" + date + ", restEndDate=" + date2 + ", opensAgrFlag=" + z2 + ", agreeTypeDictionaryKey=" + str11 + ", agreeTypeDictionaryValue=" + str12 + ", accounts=" + list + ", depositAccounts=" + list2 + ", depositTypeDictionaryKey=" + str13 + ", depositTypeDictionaryValue=" + str14 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f81045d);
        parcel.writeLong(this.f81046e);
        parcel.writeString(this.f81047f);
        parcel.writeLong(this.f81048g);
        parcel.writeDouble(this.f81049h);
        parcel.writeString(this.f81050i);
        parcel.writeLong(this.f81051j);
        parcel.writeString(this.f81052k);
        parcel.writeString(this.f81053l);
        parcel.writeString(this.f81054m);
        parcel.writeString(this.f81055n);
        parcel.writeString(this.f81056o);
        parcel.writeString(this.f81057p);
        parcel.writeDouble(this.f81058q);
        Double d = this.f81059r;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeDouble(this.f81060s);
        parcel.writeString(this.f81061t);
        parcel.writeDouble(this.f81062u);
        parcel.writeInt(this.f81063v ? 1 : 0);
        parcel.writeSerializable(this.f81064w);
        parcel.writeSerializable(this.f81065x);
        parcel.writeInt(this.f81066y ? 1 : 0);
        parcel.writeString(this.f81067z);
        parcel.writeString(this.f81040A);
        List<CasAccountUiModel> list = this.f81041B;
        parcel.writeInt(list.size());
        for (CasAccountUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<DepositAccountUiModel> list2 = this.f81042C;
        parcel.writeInt(list2.size());
        for (DepositAccountUiModel writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f81043D);
        parcel.writeString(this.f81044E);
    }
}
