package p341ge.bog.mobilebank.products.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.products.domain.model.CreditCardAccount */
public final class CreditCardAccount implements Parcelable {
    public static final Parcelable.Creator<CreditCardAccount> CREATOR = new C33803a();

    /* renamed from: A */
    private final String f82339A;

    /* renamed from: B */
    private final List f82340B;

    /* renamed from: C */
    private final long f82341C;

    /* renamed from: D */
    private final List f82342D;

    /* renamed from: E */
    private final BigDecimal f82343E;

    /* renamed from: F */
    private final String f82344F;

    /* renamed from: d */
    private final long f82345d;

    /* renamed from: e */
    private final String f82346e;

    /* renamed from: f */
    private final String f82347f;

    /* renamed from: g */
    private final double f82348g;

    /* renamed from: h */
    private final BigDecimal f82349h;

    /* renamed from: i */
    private final String f82350i;

    /* renamed from: j */
    private final int f82351j;

    /* renamed from: k */
    private final String f82352k;

    /* renamed from: l */
    private final String f82353l;

    /* renamed from: m */
    private final String f82354m;

    /* renamed from: n */
    private final String f82355n;

    /* renamed from: o */
    private final String f82356o;

    /* renamed from: p */
    private final List f82357p;

    /* renamed from: q */
    private final long f82358q;

    /* renamed from: r */
    private final String f82359r;

    /* renamed from: s */
    private final List f82360s;

    /* renamed from: t */
    private final List f82361t;

    /* renamed from: u */
    private final boolean f82362u;

    /* renamed from: v */
    private final boolean f82363v;

    /* renamed from: w */
    private final boolean f82364w;

    /* renamed from: x */
    private final BillInfo f82365x;

    /* renamed from: y */
    private final BigDecimal f82366y;

    /* renamed from: z */
    private final BigDecimal f82367z;

    /* renamed from: ge.bog.mobilebank.products.domain.model.CreditCardAccount$a */
    public static final class C33803a implements Parcelable.Creator {
        /* renamed from: a */
        public final CreditCardAccount createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            double readDouble = parcel.readDouble();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            long readLong2 = parcel.readLong();
            String readString9 = parcel.readString();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            BillInfo createFromParcel = parcel.readInt() == 0 ? null : BillInfo.CREATOR.createFromParcel(parcel2);
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            String readString10 = parcel.readString();
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            long readLong3 = parcel.readLong();
            int readInt2 = parcel.readInt();
            boolean z4 = z;
            ArrayList arrayList = new ArrayList(readInt2);
            String str = readString7;
            int i = 0;
            while (i != readInt2) {
                arrayList.add(CreditMRInsurance.CREATOR.createFromParcel(parcel2));
                i++;
                readInt2 = readInt2;
            }
            return new CreditCardAccount(readLong, readString, readString2, readDouble, bigDecimal, readString3, readInt, readString4, readString5, readString6, str, readString8, createStringArrayList, readLong2, readString9, createStringArrayList2, createStringArrayList3, z4, z2, z3, createFromParcel, bigDecimal2, bigDecimal3, readString10, createStringArrayList4, readLong3, arrayList, (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        /* renamed from: b */
        public final CreditCardAccount[] newArray(int i) {
            return new CreditCardAccount[i];
        }
    }

    public CreditCardAccount(long j, String str, String str2, double d, BigDecimal bigDecimal, String str3, int i, String str4, String str5, String str6, String str7, String str8, List list, long j2, String str9, List list2, List list3, boolean z, boolean z2, boolean z3, BillInfo billInfo, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str10, List list4, long j3, List list5, BigDecimal bigDecimal4, String str11) {
        String str12 = str2;
        BigDecimal bigDecimal5 = bigDecimal;
        String str13 = str3;
        List list6 = list;
        String str14 = str9;
        List list7 = list3;
        List list8 = list4;
        List list9 = list5;
        C41536l.m120489i(str, "acctName");
        C41536l.m120489i(str12, "printAcctNo");
        C41536l.m120489i(bigDecimal5, "amount");
        C41536l.m120489i(str13, "ccy");
        C41536l.m120489i(list6, "widgetList");
        C41536l.m120489i(str14, "nameDictionaryKey");
        C41536l.m120489i(list7, "cardSubProductGroupList");
        C41536l.m120489i(list8, "productFunctions");
        C41536l.m120489i(list9, "mrInsurance");
        this.f82345d = j;
        this.f82346e = str;
        this.f82347f = str12;
        this.f82348g = d;
        this.f82349h = bigDecimal5;
        this.f82350i = str13;
        this.f82351j = i;
        this.f82352k = str4;
        this.f82353l = str5;
        this.f82354m = str6;
        this.f82355n = str7;
        this.f82356o = str8;
        this.f82357p = list6;
        this.f82358q = j2;
        this.f82359r = str14;
        this.f82360s = list2;
        this.f82361t = list7;
        this.f82362u = z;
        this.f82363v = z2;
        this.f82364w = z3;
        this.f82365x = billInfo;
        this.f82366y = bigDecimal2;
        this.f82367z = bigDecimal3;
        this.f82339A = str10;
        this.f82340B = list8;
        this.f82341C = j3;
        this.f82342D = list9;
        this.f82343E = bigDecimal4;
        this.f82344F = str11;
    }

    /* renamed from: a */
    public final long mo81941a() {
        return this.f82345d;
    }

    /* renamed from: b */
    public final String mo81942b() {
        return this.f82346e;
    }

    /* renamed from: d */
    public final double mo81943d() {
        return this.f82348g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final BillInfo mo81945e() {
        return this.f82365x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardAccount)) {
            return false;
        }
        CreditCardAccount creditCardAccount = (CreditCardAccount) obj;
        return this.f82345d == creditCardAccount.f82345d && C41536l.m120484d(this.f82346e, creditCardAccount.f82346e) && C41536l.m120484d(this.f82347f, creditCardAccount.f82347f) && Double.compare(this.f82348g, creditCardAccount.f82348g) == 0 && C41536l.m120484d(this.f82349h, creditCardAccount.f82349h) && C41536l.m120484d(this.f82350i, creditCardAccount.f82350i) && this.f82351j == creditCardAccount.f82351j && C41536l.m120484d(this.f82352k, creditCardAccount.f82352k) && C41536l.m120484d(this.f82353l, creditCardAccount.f82353l) && C41536l.m120484d(this.f82354m, creditCardAccount.f82354m) && C41536l.m120484d(this.f82355n, creditCardAccount.f82355n) && C41536l.m120484d(this.f82356o, creditCardAccount.f82356o) && C41536l.m120484d(this.f82357p, creditCardAccount.f82357p) && this.f82358q == creditCardAccount.f82358q && C41536l.m120484d(this.f82359r, creditCardAccount.f82359r) && C41536l.m120484d(this.f82360s, creditCardAccount.f82360s) && C41536l.m120484d(this.f82361t, creditCardAccount.f82361t) && this.f82362u == creditCardAccount.f82362u && this.f82363v == creditCardAccount.f82363v && this.f82364w == creditCardAccount.f82364w && C41536l.m120484d(this.f82365x, creditCardAccount.f82365x) && C41536l.m120484d(this.f82366y, creditCardAccount.f82366y) && C41536l.m120484d(this.f82367z, creditCardAccount.f82367z) && C41536l.m120484d(this.f82339A, creditCardAccount.f82339A) && C41536l.m120484d(this.f82340B, creditCardAccount.f82340B) && this.f82341C == creditCardAccount.f82341C && C41536l.m120484d(this.f82342D, creditCardAccount.f82342D) && C41536l.m120484d(this.f82343E, creditCardAccount.f82343E) && C41536l.m120484d(this.f82344F, creditCardAccount.f82344F);
    }

    /* renamed from: f */
    public final String mo81947f() {
        return this.f82350i;
    }

    /* renamed from: g */
    public final String mo81948g() {
        return this.f82359r;
    }

    /* renamed from: h */
    public final String mo81949h() {
        return this.f82347f;
    }

    public int hashCode() {
        int a = ((((((((((((C7397t.m28148a(this.f82345d) * 31) + this.f82346e.hashCode()) * 31) + this.f82347f.hashCode()) * 31) + Double.doubleToLongBits(this.f82348g)) * 31) + this.f82349h.hashCode()) * 31) + this.f82350i.hashCode()) * 31) + this.f82351j) * 31;
        String str = this.f82352k;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82353l;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82354m;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82355n;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82356o;
        int hashCode5 = (((((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f82357p.hashCode()) * 31) + C7397t.m28148a(this.f82358q)) * 31) + this.f82359r.hashCode()) * 31;
        List list = this.f82360s;
        int hashCode6 = (((hashCode5 + (list == null ? 0 : list.hashCode())) * 31) + this.f82361t.hashCode()) * 31;
        boolean z = this.f82362u;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f82363v;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f82364w;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        BillInfo billInfo = this.f82365x;
        int hashCode7 = (i4 + (billInfo == null ? 0 : billInfo.hashCode())) * 31;
        BigDecimal bigDecimal = this.f82366y;
        int hashCode8 = (hashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f82367z;
        int hashCode9 = (hashCode8 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str6 = this.f82339A;
        int hashCode10 = (((((((hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f82340B.hashCode()) * 31) + C7397t.m28148a(this.f82341C)) * 31) + this.f82342D.hashCode()) * 31;
        BigDecimal bigDecimal3 = this.f82343E;
        int hashCode11 = (hashCode10 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str7 = this.f82344F;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode11 + i;
    }

    /* renamed from: i */
    public final String mo81951i() {
        return this.f82353l;
    }

    /* renamed from: j */
    public final List mo81952j() {
        return this.f82340B;
    }

    public String toString() {
        long j = this.f82345d;
        String str = this.f82346e;
        String str2 = this.f82347f;
        double d = this.f82348g;
        BigDecimal bigDecimal = this.f82349h;
        String str3 = this.f82350i;
        int i = this.f82351j;
        String str4 = this.f82352k;
        String str5 = this.f82353l;
        String str6 = this.f82354m;
        String str7 = this.f82355n;
        String str8 = this.f82356o;
        List list = this.f82357p;
        long j2 = this.f82358q;
        String str9 = this.f82359r;
        List list2 = this.f82360s;
        List list3 = this.f82361t;
        boolean z = this.f82362u;
        boolean z2 = this.f82363v;
        boolean z3 = this.f82364w;
        BillInfo billInfo = this.f82365x;
        BigDecimal bigDecimal2 = this.f82366y;
        BigDecimal bigDecimal3 = this.f82367z;
        String str10 = this.f82339A;
        String str11 = str9;
        List list4 = this.f82340B;
        long j3 = this.f82341C;
        List list5 = this.f82342D;
        BigDecimal bigDecimal4 = this.f82343E;
        String str12 = this.f82344F;
        return "CreditCardAccount(acctKey=" + j + ", acctName=" + str + ", printAcctNo=" + str2 + ", availableAmount=" + d + ", amount=" + bigDecimal + ", ccy=" + str3 + ", orderNo=" + i + ", productCode=" + str4 + ", productDictionaryKey=" + str5 + ", cardTypes=" + str6 + ", cardSubProduct=" + str7 + ", cardSubProductGroups=" + str8 + ", widgetList=" + list + ", cardId=" + j2 + ", nameDictionaryKey=" + str11 + ", cardTypeList=" + list2 + ", cardSubProductGroupList=" + list3 + ", isHasMR=" + z + ", hasCashback=" + z2 + ", hasInstallment=" + z3 + ", billInfo=" + billInfo + ", atmPercent=" + bigDecimal2 + ", posPercent=" + bigDecimal3 + ", attachmentUrl=" + str10 + ", productFunctions=" + list4 + ", productId=" + j3 + ", mrInsurance=" + list5 + ", overdraftLimit=" + bigDecimal4 + ", cardPdfUrl=" + str12 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f82345d);
        parcel.writeString(this.f82346e);
        parcel.writeString(this.f82347f);
        parcel.writeDouble(this.f82348g);
        parcel.writeSerializable(this.f82349h);
        parcel.writeString(this.f82350i);
        parcel.writeInt(this.f82351j);
        parcel.writeString(this.f82352k);
        parcel.writeString(this.f82353l);
        parcel.writeString(this.f82354m);
        parcel.writeString(this.f82355n);
        parcel.writeString(this.f82356o);
        parcel.writeStringList(this.f82357p);
        parcel.writeLong(this.f82358q);
        parcel.writeString(this.f82359r);
        parcel.writeStringList(this.f82360s);
        parcel.writeStringList(this.f82361t);
        parcel.writeInt(this.f82362u ? 1 : 0);
        parcel.writeInt(this.f82363v ? 1 : 0);
        parcel.writeInt(this.f82364w ? 1 : 0);
        BillInfo billInfo = this.f82365x;
        if (billInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billInfo.writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.f82366y);
        parcel.writeSerializable(this.f82367z);
        parcel.writeString(this.f82339A);
        parcel.writeStringList(this.f82340B);
        parcel.writeLong(this.f82341C);
        List<CreditMRInsurance> list = this.f82342D;
        parcel.writeInt(list.size());
        for (CreditMRInsurance writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.f82343E);
        parcel.writeString(this.f82344F);
    }
}
