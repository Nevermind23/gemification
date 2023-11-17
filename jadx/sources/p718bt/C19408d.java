package p718bt;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bt.d */
public final class C19408d {

    /* renamed from: f */
    public static final C19409a f53631f = new C19409a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final BigDecimal f53632a;

    /* renamed from: b */
    private final BigDecimal f53633b;

    /* renamed from: c */
    private final String f53634c;

    /* renamed from: d */
    private final String f53635d;

    /* renamed from: e */
    private final String f53636e;

    /* renamed from: bt.d$a */
    public static final class C19409a {
        private C19409a() {
        }

        public /* synthetic */ C19409a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19408d m64905b(C19409a aVar, Double d, Double d2, String str, String str2, String str3, int i, Object obj) {
            if ((i & 16) != 0) {
                str3 = null;
            }
            return aVar.mo47639a(d, d2, str, str2, str3);
        }

        /* renamed from: a */
        public final C19408d mo47639a(Double d, Double d2, String str, String str2, String str3) {
            BigDecimal bigDecimal;
            BigDecimal bigDecimal2;
            C41536l.m120489i(str, "backgroundColor");
            C41536l.m120489i(str2, "textColor");
            if (d != null) {
                bigDecimal = new BigDecimal(String.valueOf(d.doubleValue()));
            } else {
                bigDecimal = null;
            }
            if (d2 != null) {
                bigDecimal2 = new BigDecimal(String.valueOf(d2.doubleValue()));
            } else {
                bigDecimal2 = null;
            }
            return new C19408d(bigDecimal, bigDecimal2, str, str2, str3);
        }
    }

    public C19408d(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, String str2, String str3) {
        C41536l.m120489i(str, "backgroundColor");
        C41536l.m120489i(str2, "textColor");
        this.f53632a = bigDecimal;
        this.f53633b = bigDecimal2;
        this.f53634c = str;
        this.f53635d = str2;
        this.f53636e = str3;
    }

    /* renamed from: a */
    public final boolean mo47632a(BigDecimal bigDecimal) {
        BigDecimal bigDecimal2;
        C41536l.m120489i(bigDecimal, "heatLevel");
        BigDecimal bigDecimal3 = this.f53632a;
        if (bigDecimal3 != null || (bigDecimal2 = this.f53633b) == null) {
            if (bigDecimal3 == null || this.f53633b != null) {
                if (bigDecimal3 != null && this.f53633b != null && bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(this.f53633b) < 0) {
                    return true;
                }
            } else if (bigDecimal.compareTo(bigDecimal3) >= 0) {
                return true;
            }
        } else if (bigDecimal.compareTo(bigDecimal2) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final String mo47633b() {
        return this.f53634c;
    }

    /* renamed from: c */
    public final String mo47634c() {
        return this.f53636e;
    }

    /* renamed from: d */
    public final String mo47635d() {
        return this.f53635d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19408d)) {
            return false;
        }
        C19408d dVar = (C19408d) obj;
        return C41536l.m120484d(this.f53632a, dVar.f53632a) && C41536l.m120484d(this.f53633b, dVar.f53633b) && C41536l.m120484d(this.f53634c, dVar.f53634c) && C41536l.m120484d(this.f53635d, dVar.f53635d) && C41536l.m120484d(this.f53636e, dVar.f53636e);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f53632a;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f53633b;
        int hashCode2 = (((((hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + this.f53634c.hashCode()) * 31) + this.f53635d.hashCode()) * 31;
        String str = this.f53636e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f53632a;
        BigDecimal bigDecimal2 = this.f53633b;
        String str = this.f53634c;
        String str2 = this.f53635d;
        String str3 = this.f53636e;
        return "HeatMapInterval(intervalStart=" + bigDecimal + ", intervalEnd=" + bigDecimal2 + ", backgroundColor=" + str + ", textColor=" + str2 + ", strokeColor=" + str3 + ")";
    }
}
