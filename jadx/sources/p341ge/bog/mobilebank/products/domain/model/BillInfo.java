package p341ge.bog.mobilebank.products.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.products.domain.model.BillInfo */
public final class BillInfo implements Parcelable {
    public static final Parcelable.Creator<BillInfo> CREATOR = new C33801a();

    /* renamed from: d */
    private final long f82315d;

    /* renamed from: e */
    private final long f82316e;

    /* renamed from: f */
    private final String f82317f;

    /* renamed from: g */
    private final String f82318g;

    /* renamed from: h */
    private final String f82319h;

    /* renamed from: i */
    private final String f82320i;

    /* renamed from: j */
    private final BigDecimal f82321j;

    /* renamed from: k */
    private final Long f82322k;

    /* renamed from: l */
    private final Double f82323l;

    /* renamed from: m */
    private final Double f82324m;

    /* renamed from: n */
    private final Double f82325n;

    /* renamed from: o */
    private final Double f82326o;

    /* renamed from: p */
    private final Double f82327p;

    /* renamed from: q */
    private final Long f82328q;

    /* renamed from: r */
    private final Long f82329r;

    /* renamed from: s */
    private final Double f82330s;

    /* renamed from: t */
    private final double f82331t;

    /* renamed from: u */
    private final Double f82332u;

    /* renamed from: v */
    private final double f82333v;

    /* renamed from: w */
    private final Double f82334w;

    /* renamed from: ge.bog.mobilebank.products.domain.model.BillInfo$a */
    public static final class C33801a implements Parcelable.Creator {
        /* renamed from: a */
        public final BillInfo createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BillInfo(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* renamed from: b */
        public final BillInfo[] newArray(int i) {
            return new BillInfo[i];
        }
    }

    public BillInfo(long j, long j2, String str, String str2, String str3, String str4, BigDecimal bigDecimal, Long l, Double d, Double d2, Double d3, Double d4, Double d5, Long l2, Long l3, Double d6, double d7, Double d8, double d9, Double d12) {
        C41536l.m120489i(str4, "ccy");
        this.f82315d = j;
        this.f82316e = j2;
        this.f82317f = str;
        this.f82318g = str2;
        this.f82319h = str3;
        this.f82320i = str4;
        this.f82321j = bigDecimal;
        this.f82322k = l;
        this.f82323l = d;
        this.f82324m = d2;
        this.f82325n = d3;
        this.f82326o = d4;
        this.f82327p = d5;
        this.f82328q = l2;
        this.f82329r = l3;
        this.f82330s = d6;
        this.f82331t = d7;
        this.f82332u = d8;
        this.f82333v = d9;
        this.f82334w = d12;
    }

    /* renamed from: a */
    public final long mo81906a() {
        return this.f82316e;
    }

    /* renamed from: b */
    public final Double mo81907b() {
        return this.f82325n;
    }

    /* renamed from: d */
    public final String mo81908d() {
        return this.f82320i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Double mo81910e() {
        return this.f82323l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillInfo)) {
            return false;
        }
        BillInfo billInfo = (BillInfo) obj;
        return this.f82315d == billInfo.f82315d && this.f82316e == billInfo.f82316e && C41536l.m120484d(this.f82317f, billInfo.f82317f) && C41536l.m120484d(this.f82318g, billInfo.f82318g) && C41536l.m120484d(this.f82319h, billInfo.f82319h) && C41536l.m120484d(this.f82320i, billInfo.f82320i) && C41536l.m120484d(this.f82321j, billInfo.f82321j) && C41536l.m120484d(this.f82322k, billInfo.f82322k) && C41536l.m120484d(this.f82323l, billInfo.f82323l) && C41536l.m120484d(this.f82324m, billInfo.f82324m) && C41536l.m120484d(this.f82325n, billInfo.f82325n) && C41536l.m120484d(this.f82326o, billInfo.f82326o) && C41536l.m120484d(this.f82327p, billInfo.f82327p) && C41536l.m120484d(this.f82328q, billInfo.f82328q) && C41536l.m120484d(this.f82329r, billInfo.f82329r) && C41536l.m120484d(this.f82330s, billInfo.f82330s) && Double.compare(this.f82331t, billInfo.f82331t) == 0 && C41536l.m120484d(this.f82332u, billInfo.f82332u) && Double.compare(this.f82333v, billInfo.f82333v) == 0 && C41536l.m120484d(this.f82334w, billInfo.f82334w);
    }

    /* renamed from: f */
    public final Double mo81912f() {
        return this.f82327p;
    }

    /* renamed from: g */
    public final Long mo81913g() {
        return this.f82328q;
    }

    /* renamed from: h */
    public final Double mo81914h() {
        return this.f82334w;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f82315d) * 31) + C7397t.m28148a(this.f82316e)) * 31;
        String str = this.f82317f;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82318g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82319h;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f82320i.hashCode()) * 31;
        BigDecimal bigDecimal = this.f82321j;
        int hashCode4 = (hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l = this.f82322k;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.f82323l;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f82324m;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f82325n;
        int hashCode8 = (hashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f82326o;
        int hashCode9 = (hashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f82327p;
        int hashCode10 = (hashCode9 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Long l2 = this.f82328q;
        int hashCode11 = (hashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f82329r;
        int hashCode12 = (hashCode11 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d6 = this.f82330s;
        int hashCode13 = (((hashCode12 + (d6 == null ? 0 : d6.hashCode())) * 31) + Double.doubleToLongBits(this.f82331t)) * 31;
        Double d7 = this.f82332u;
        int hashCode14 = (((hashCode13 + (d7 == null ? 0 : d7.hashCode())) * 31) + Double.doubleToLongBits(this.f82333v)) * 31;
        Double d8 = this.f82334w;
        if (d8 != null) {
            i = d8.hashCode();
        }
        return hashCode14 + i;
    }

    /* renamed from: i */
    public final Double mo81916i() {
        return this.f82332u;
    }

    /* renamed from: j */
    public final Long mo81917j() {
        return this.f82329r;
    }

    /* renamed from: k */
    public final Double mo81918k() {
        return this.f82326o;
    }

    /* renamed from: l */
    public final double mo81919l() {
        return this.f82331t;
    }

    /* renamed from: m */
    public final Double mo81920m() {
        return this.f82324m;
    }

    /* renamed from: p */
    public final double mo81921p() {
        return this.f82333v;
    }

    public String toString() {
        long j = this.f82315d;
        long j2 = this.f82316e;
        String str = this.f82317f;
        String str2 = this.f82318g;
        String str3 = this.f82319h;
        String str4 = this.f82320i;
        BigDecimal bigDecimal = this.f82321j;
        Long l = this.f82322k;
        Double d = this.f82323l;
        Double d2 = this.f82324m;
        Double d3 = this.f82325n;
        Double d4 = this.f82326o;
        Double d5 = this.f82327p;
        Long l2 = this.f82328q;
        Long l3 = this.f82329r;
        Double d6 = d4;
        Double d7 = this.f82330s;
        double d8 = this.f82331t;
        Double d9 = this.f82332u;
        double d12 = this.f82333v;
        Double d13 = this.f82334w;
        return "BillInfo(id=" + j + ", acctKey=" + j2 + ", firstName=" + str + ", lastName=" + str2 + ", cardAcctNo=" + str3 + ", ccy=" + str4 + ", creditLimit=" + bigDecimal + ", startDate=" + l + ", closingBalance=" + d + ", minimumPaymentDue=" + d2 + ", baseAmount=" + d3 + ", interests=" + d6 + ", commissions=" + d5 + ", dueDate=" + l2 + ", inpSysdate=" + l3 + ", overdraftLimit=" + d7 + ", minimumPayment=" + d8 + ", fullPaymentDue=" + d9 + ", overusedLimit=" + d12 + ", fullPaymentAmt=" + d13 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f82315d);
        parcel.writeLong(this.f82316e);
        parcel.writeString(this.f82317f);
        parcel.writeString(this.f82318g);
        parcel.writeString(this.f82319h);
        parcel.writeString(this.f82320i);
        parcel.writeSerializable(this.f82321j);
        Long l = this.f82322k;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Double d = this.f82323l;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f82324m;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.f82325n;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        Double d4 = this.f82326o;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        Double d5 = this.f82327p;
        if (d5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d5.doubleValue());
        }
        Long l2 = this.f82328q;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.f82329r;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Double d6 = this.f82330s;
        if (d6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d6.doubleValue());
        }
        parcel.writeDouble(this.f82331t);
        Double d7 = this.f82332u;
        if (d7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d7.doubleValue());
        }
        parcel.writeDouble(this.f82333v);
        Double d8 = this.f82334w;
        if (d8 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d8.doubleValue());
    }
}
