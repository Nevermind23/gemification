package p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main;

import android.os.Parcel;
import android.os.Parcelable;
import ic0.C25168f;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragmentArgs */
public final class DepositProlongationMainFragmentArgs implements Parcelable {
    public static final Parcelable.Creator<DepositProlongationMainFragmentArgs> CREATOR = new C23287a();

    /* renamed from: d */
    private final C25168f f60883d;

    /* renamed from: e */
    private final long f60884e;

    /* renamed from: f */
    private final String f60885f;

    /* renamed from: g */
    private final long f60886g;

    /* renamed from: h */
    private final long f60887h;

    /* renamed from: i */
    private final double f60888i;

    /* renamed from: j */
    private final double f60889j;

    /* renamed from: k */
    private final double f60890k;

    /* renamed from: l */
    private final double f60891l;

    /* renamed from: m */
    private final double f60892m;

    /* renamed from: n */
    private final double f60893n;

    /* renamed from: o */
    private final long f60894o;

    /* renamed from: p */
    private final double f60895p;

    /* renamed from: q */
    private final String f60896q;

    /* renamed from: r */
    private final String f60897r;

    /* renamed from: s */
    private final String f60898s;

    /* renamed from: t */
    private final long f60899t;

    /* renamed from: u */
    private final String f60900u;

    /* renamed from: v */
    private final String f60901v;

    /* renamed from: w */
    private final String f60902w;

    /* renamed from: x */
    private final boolean f60903x;

    /* renamed from: y */
    private final boolean f60904y;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragmentArgs$a */
    public static final class C23287a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositProlongationMainFragmentArgs createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            C25168f valueOf = C25168f.valueOf(parcel.readString());
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            double readDouble = parcel.readDouble();
            double readDouble2 = parcel.readDouble();
            double readDouble3 = parcel.readDouble();
            double readDouble4 = parcel.readDouble();
            double readDouble5 = parcel.readDouble();
            double readDouble6 = parcel.readDouble();
            long readLong4 = parcel.readLong();
            double readDouble7 = parcel.readDouble();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            long readLong5 = parcel.readLong();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new DepositProlongationMainFragmentArgs(valueOf, readLong, readString, readLong2, readLong3, readDouble, readDouble2, readDouble3, readDouble4, readDouble5, readDouble6, readLong4, readDouble7, readString2, readString3, readString4, readLong5, readString5, readString6, readString7, z2, z);
        }

        /* renamed from: b */
        public final DepositProlongationMainFragmentArgs[] newArray(int i) {
            return new DepositProlongationMainFragmentArgs[i];
        }
    }

    public DepositProlongationMainFragmentArgs(C25168f fVar, long j, String str, long j2, long j3, double d, double d2, double d3, double d4, double d5, double d6, long j4, double d7, String str2, String str3, String str4, long j5, String str5, String str6, String str7, boolean z, boolean z2) {
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        String str13 = str7;
        C41536l.m120489i(fVar, "type");
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(str8, "prodType");
        C41536l.m120489i(str9, "intWithPeriod");
        C41536l.m120489i(str10, "term");
        C41536l.m120489i(str11, "name");
        C41536l.m120489i(str12, "purpose");
        C41536l.m120489i(str13, "agreeType");
        this.f60883d = fVar;
        this.f60884e = j;
        this.f60885f = str;
        this.f60886g = j2;
        this.f60887h = j3;
        this.f60888i = d;
        this.f60889j = d2;
        this.f60890k = d3;
        this.f60891l = d4;
        this.f60892m = d5;
        this.f60893n = d6;
        this.f60894o = j4;
        this.f60895p = d7;
        this.f60896q = str8;
        this.f60897r = str9;
        this.f60898s = str10;
        this.f60899t = j5;
        this.f60900u = str11;
        this.f60901v = str12;
        this.f60902w = str13;
        this.f60903x = z;
        this.f60904y = z2;
    }

    /* renamed from: a */
    public final long mo58218a() {
        return this.f60887h;
    }

    /* renamed from: b */
    public final long mo58219b() {
        return this.f60884e;
    }

    /* renamed from: d */
    public final String mo58220d() {
        return this.f60902w;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final double mo58222e() {
        return this.f60888i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositProlongationMainFragmentArgs)) {
            return false;
        }
        DepositProlongationMainFragmentArgs depositProlongationMainFragmentArgs = (DepositProlongationMainFragmentArgs) obj;
        return this.f60883d == depositProlongationMainFragmentArgs.f60883d && this.f60884e == depositProlongationMainFragmentArgs.f60884e && C41536l.m120484d(this.f60885f, depositProlongationMainFragmentArgs.f60885f) && this.f60886g == depositProlongationMainFragmentArgs.f60886g && this.f60887h == depositProlongationMainFragmentArgs.f60887h && Double.compare(this.f60888i, depositProlongationMainFragmentArgs.f60888i) == 0 && Double.compare(this.f60889j, depositProlongationMainFragmentArgs.f60889j) == 0 && Double.compare(this.f60890k, depositProlongationMainFragmentArgs.f60890k) == 0 && Double.compare(this.f60891l, depositProlongationMainFragmentArgs.f60891l) == 0 && Double.compare(this.f60892m, depositProlongationMainFragmentArgs.f60892m) == 0 && Double.compare(this.f60893n, depositProlongationMainFragmentArgs.f60893n) == 0 && this.f60894o == depositProlongationMainFragmentArgs.f60894o && Double.compare(this.f60895p, depositProlongationMainFragmentArgs.f60895p) == 0 && C41536l.m120484d(this.f60896q, depositProlongationMainFragmentArgs.f60896q) && C41536l.m120484d(this.f60897r, depositProlongationMainFragmentArgs.f60897r) && C41536l.m120484d(this.f60898s, depositProlongationMainFragmentArgs.f60898s) && this.f60899t == depositProlongationMainFragmentArgs.f60899t && C41536l.m120484d(this.f60900u, depositProlongationMainFragmentArgs.f60900u) && C41536l.m120484d(this.f60901v, depositProlongationMainFragmentArgs.f60901v) && C41536l.m120484d(this.f60902w, depositProlongationMainFragmentArgs.f60902w) && this.f60903x == depositProlongationMainFragmentArgs.f60903x && this.f60904y == depositProlongationMainFragmentArgs.f60904y;
    }

    /* renamed from: f */
    public final String mo58224f() {
        return this.f60885f;
    }

    /* renamed from: g */
    public final boolean mo58225g() {
        return this.f60903x;
    }

    /* renamed from: h */
    public final boolean mo58226h() {
        return this.f60904y;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((this.f60883d.hashCode() * 31) + C7397t.m28148a(this.f60884e)) * 31) + this.f60885f.hashCode()) * 31) + C7397t.m28148a(this.f60886g)) * 31) + C7397t.m28148a(this.f60887h)) * 31) + Double.doubleToLongBits(this.f60888i)) * 31) + Double.doubleToLongBits(this.f60889j)) * 31) + Double.doubleToLongBits(this.f60890k)) * 31) + Double.doubleToLongBits(this.f60891l)) * 31) + Double.doubleToLongBits(this.f60892m)) * 31) + Double.doubleToLongBits(this.f60893n)) * 31) + C7397t.m28148a(this.f60894o)) * 31) + Double.doubleToLongBits(this.f60895p)) * 31) + this.f60896q.hashCode()) * 31) + this.f60897r.hashCode()) * 31) + this.f60898s.hashCode()) * 31) + C7397t.m28148a(this.f60899t)) * 31) + this.f60900u.hashCode()) * 31) + this.f60901v.hashCode()) * 31) + this.f60902w.hashCode()) * 31;
        boolean z = this.f60903x;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f60904y;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo58228i() {
        return this.f60897r;
    }

    /* renamed from: j */
    public final double mo58229j() {
        return this.f60891l;
    }

    /* renamed from: k */
    public final double mo58230k() {
        return this.f60892m;
    }

    /* renamed from: l */
    public final double mo58231l() {
        return this.f60893n;
    }

    /* renamed from: m */
    public final long mo58232m() {
        return this.f60899t;
    }

    /* renamed from: p */
    public final double mo58233p() {
        return this.f60890k;
    }

    /* renamed from: q */
    public final double mo58234q() {
        return this.f60889j;
    }

    /* renamed from: r */
    public final String mo58235r() {
        return this.f60900u;
    }

    /* renamed from: s */
    public final double mo58236s() {
        return this.f60895p;
    }

    /* renamed from: t */
    public final String mo58237t() {
        return this.f60896q;
    }

    public String toString() {
        C25168f fVar = this.f60883d;
        long j = this.f60884e;
        String str = this.f60885f;
        long j2 = this.f60886g;
        long j3 = this.f60887h;
        double d = this.f60888i;
        double d2 = this.f60889j;
        double d3 = this.f60890k;
        double d4 = this.f60891l;
        double d5 = this.f60892m;
        double d6 = this.f60893n;
        long j4 = this.f60894o;
        double d7 = this.f60895p;
        double d8 = d3;
        String str2 = this.f60896q;
        String str3 = this.f60897r;
        String str4 = this.f60898s;
        double d9 = d7;
        long j5 = this.f60899t;
        String str5 = this.f60900u;
        String str6 = this.f60901v;
        String str7 = this.f60902w;
        boolean z = this.f60903x;
        boolean z2 = this.f60904y;
        return "DepositProlongationMainFragmentArgs(type=" + fVar + ", agreeKey=" + j + ", ccy=" + str + ", result=" + j2 + ", acctKey=" + j3 + ", amount=" + d + ", minAmount=" + d2 + ", maxAmount=" + d8 + ", interestAmount=" + d4 + ", interestRate=" + d5 + ", irr=" + d6 + ", startDate=" + j4 + ", periodLength=" + d9 + ", prodType=" + str2 + ", intWithPeriod=" + str3 + ", term=" + str4 + ", maturityDate=" + j5 + ", name=" + str5 + ", purpose=" + str6 + ", agreeType=" + str7 + ", copyCas=" + z + ", copySto=" + z2 + ")";
    }

    /* renamed from: u */
    public final String mo58239u() {
        return this.f60901v;
    }

    /* renamed from: v */
    public final long mo58240v() {
        return this.f60894o;
    }

    /* renamed from: w */
    public final C25168f mo58241w() {
        return this.f60883d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f60883d.name());
        parcel.writeLong(this.f60884e);
        parcel.writeString(this.f60885f);
        parcel.writeLong(this.f60886g);
        parcel.writeLong(this.f60887h);
        parcel.writeDouble(this.f60888i);
        parcel.writeDouble(this.f60889j);
        parcel.writeDouble(this.f60890k);
        parcel.writeDouble(this.f60891l);
        parcel.writeDouble(this.f60892m);
        parcel.writeDouble(this.f60893n);
        parcel.writeLong(this.f60894o);
        parcel.writeDouble(this.f60895p);
        parcel.writeString(this.f60896q);
        parcel.writeString(this.f60897r);
        parcel.writeString(this.f60898s);
        parcel.writeLong(this.f60899t);
        parcel.writeString(this.f60900u);
        parcel.writeString(this.f60901v);
        parcel.writeString(this.f60902w);
        parcel.writeInt(this.f60903x ? 1 : 0);
        parcel.writeInt(this.f60904y ? 1 : 0);
    }
}
