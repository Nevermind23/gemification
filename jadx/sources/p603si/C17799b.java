package p603si;

import android.text.TextUtils;
import android.util.Patterns;
import cf1.C40419j;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: si.b */
public interface C17799b {

    /* renamed from: si.b$a */
    public static final class C17800a implements C17799b {

        /* renamed from: d */
        private final int f50681d;

        public C17800a(int i) {
            this.f50681d = i;
        }

        /* renamed from: b */
        public String mo45383b() {
            return C17802c.m61542a(this);
        }

        /* renamed from: c */
        public Object[] mo45384c() {
            return new Object[]{Integer.valueOf(this.f50681d)};
        }

        /* renamed from: g */
        public boolean mo45386g(String... strArr) {
            C41536l.m120489i(strArr, "inputs");
            int length = strArr.length;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= length) {
                    return true;
                }
                if (strArr[i].length() != this.f50681d) {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                i++;
            }
        }
    }

    /* renamed from: si.b$c */
    public static final class C17802c {
        /* renamed from: a */
        public static String m61542a(C17799b bVar) {
            return null;
        }

        /* renamed from: b */
        public static Object[] m61543b(C17799b bVar) {
            return null;
        }
    }

    /* renamed from: si.b$d */
    public static final class C17803d implements C17799b {

        /* renamed from: d */
        public static final C17803d f50684d = new C17803d();

        private C17803d() {
        }

        /* renamed from: b */
        public String mo45383b() {
            return C17802c.m61542a(this);
        }

        /* renamed from: c */
        public Object[] mo45384c() {
            return C17802c.m61543b(this);
        }

        /* renamed from: g */
        public boolean mo45386g(String... strArr) {
            C41536l.m120489i(strArr, "inputs");
            for (String isDigitsOnly : strArr) {
                if (!TextUtils.isDigitsOnly(isDigitsOnly)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: si.b$e */
    public static final class C17804e implements C17799b {

        /* renamed from: d */
        public static final C17804e f50685d = new C17804e();

        private C17804e() {
        }

        /* renamed from: b */
        public String mo45383b() {
            return C17802c.m61542a(this);
        }

        /* renamed from: c */
        public Object[] mo45384c() {
            return C17802c.m61543b(this);
        }

        /* renamed from: g */
        public boolean mo45386g(String... strArr) {
            C41536l.m120489i(strArr, "inputs");
            for (String matcher : strArr) {
                if (!Patterns.EMAIL_ADDRESS.matcher(matcher).matches()) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: si.b$f */
    public static final class C17805f implements C17799b {

        /* renamed from: d */
        public static final C17805f f50686d = new C17805f();

        private C17805f() {
        }

        /* renamed from: b */
        public String mo45383b() {
            return C17802c.m61542a(this);
        }

        /* renamed from: c */
        public Object[] mo45384c() {
            return C17802c.m61543b(this);
        }

        /* renamed from: g */
        public boolean mo45386g(String... strArr) {
            C41536l.m120489i(strArr, "inputs");
            for (String v : strArr) {
                if (!(true ^ C40439w.m117118v(v))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: si.b$h */
    public static final class C17807h implements C17799b {

        /* renamed from: d */
        private final C40419j f50689d;

        public C17807h(C40419j jVar) {
            C41536l.m120489i(jVar, "regex");
            this.f50689d = jVar;
        }

        /* renamed from: b */
        public String mo45383b() {
            return C17802c.m61542a(this);
        }

        /* renamed from: c */
        public Object[] mo45384c() {
            return new Object[]{this.f50689d.mo94488e()};
        }

        /* renamed from: g */
        public boolean mo45386g(String... strArr) {
            C41536l.m120489i(strArr, "inputs");
            for (String f : strArr) {
                if (!this.f50689d.mo94489f(f)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: si.b$i */
    public static final class C17808i implements C17799b {

        /* renamed from: d */
        public static final C17808i f50690d = new C17808i();

        private C17808i() {
        }

        /* renamed from: b */
        public String mo45383b() {
            return C17802c.m61542a(this);
        }

        /* renamed from: c */
        public Object[] mo45384c() {
            return C17802c.m61543b(this);
        }

        /* renamed from: g */
        public boolean mo45386g(String... strArr) {
            C41536l.m120489i(strArr, "inputs");
            for (String L : strArr) {
                if (!(true ^ C40440x.m117137L(L, ' ', false, 2, (Object) null))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    String mo45383b();

    /* renamed from: c */
    Object[] mo45384c();

    /* renamed from: g */
    boolean mo45386g(String... strArr);

    /* renamed from: si.b$b */
    public static final class C17801b implements C17799b {

        /* renamed from: d */
        private final int f50682d;

        /* renamed from: e */
        private final int f50683e;

        public C17801b(int i, int i2) {
            this.f50682d = i;
            this.f50683e = i2;
        }

        /* renamed from: b */
        public String mo45383b() {
            return C17802c.m61542a(this);
        }

        /* renamed from: c */
        public Object[] mo45384c() {
            return new Object[]{Integer.valueOf(this.f50682d), Integer.valueOf(this.f50683e)};
        }

        /* renamed from: g */
        public boolean mo45386g(String... strArr) {
            C41536l.m120489i(strArr, "inputs");
            int length = strArr.length;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= length) {
                    return true;
                }
                String str = strArr[i];
                int i2 = this.f50682d;
                int i3 = this.f50683e;
                int length2 = str.length();
                if (i2 > length2 || length2 > i3) {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                i++;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C17801b(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2);
        }
    }

    /* renamed from: si.b$g */
    public static final class C17806g implements C17799b {

        /* renamed from: d */
        private final BigDecimal f50687d;

        /* renamed from: e */
        private final BigDecimal f50688e;

        public C17806g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            C41536l.m120489i(bigDecimal, "min");
            C41536l.m120489i(bigDecimal2, "max");
            this.f50687d = bigDecimal;
            this.f50688e = bigDecimal2;
        }

        /* renamed from: b */
        public String mo45383b() {
            return C17802c.m61542a(this);
        }

        /* renamed from: c */
        public Object[] mo45384c() {
            return new Object[]{this.f50687d, this.f50688e};
        }

        /* renamed from: g */
        public boolean mo45386g(String... strArr) {
            C41536l.m120489i(strArr, "inputs");
            try {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    boolean z = true;
                    if (i >= length) {
                        return true;
                    }
                    String str = strArr[i];
                    BigDecimal bigDecimal = this.f50687d;
                    BigDecimal bigDecimal2 = this.f50688e;
                    BigDecimal bigDecimal3 = new BigDecimal(str);
                    if (bigDecimal3.compareTo(bigDecimal) < 0 || bigDecimal3.compareTo(bigDecimal2) > 0) {
                        z = false;
                    }
                    if (!z) {
                        return false;
                    }
                    i++;
                }
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C17806g(java.math.BigDecimal r3, java.math.BigDecimal r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
            /*
                r2 = this;
                r6 = r5 & 1
                if (r6 == 0) goto L_0x000f
                r0 = -9223372036854775808
                java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r0)
                java.lang.String r6 = "valueOf(Long.MIN_VALUE)"
                kotlin.jvm.internal.C41536l.m120488h(r3, r6)
            L_0x000f:
                r5 = r5 & 2
                if (r5 == 0) goto L_0x0021
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.math.BigDecimal r4 = java.math.BigDecimal.valueOf(r4)
                java.lang.String r5 = "valueOf(Long.MAX_VALUE)"
                kotlin.jvm.internal.C41536l.m120488h(r4, r5)
            L_0x0021:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p603si.C17799b.C17806g.<init>(java.math.BigDecimal, java.math.BigDecimal, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
