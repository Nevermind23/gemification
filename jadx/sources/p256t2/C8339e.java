package p256t2;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import dg1.C40677c;
import java.io.IOException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: t2.e */
public final class C8339e extends C8341f {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final String[] f23736n;

    /* renamed from: o */
    public static final C8340a f23737o = new C8340a((DefaultConstructorMarker) null);

    /* renamed from: l */
    private String f23738l;

    /* renamed from: m */
    private final C40677c f23739m;

    /* renamed from: t2.e$a */
    public static final class C8340a {
        private C8340a() {
        }

        public /* synthetic */ C8340a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String m31356b(byte b) {
            StringBuilder sb = new StringBuilder();
            sb.append("0123456789abcdef".charAt(b >>> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
            return sb.toString();
        }

        /* renamed from: c */
        public final void mo23521c(C40677c cVar, String str) {
            String str2;
            C41536l.m120490j(cVar, "sink");
            C41536l.m120490j(str, C11755a.C11756a.f34100b);
            String[] s0 = C8339e.f23736n;
            cVar.mo94715R0(34);
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    str2 = s0[charAt];
                    if (str2 == null) {
                    }
                } else if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    cVar.mo94740l0(str, i, i2);
                }
                cVar.mo94728d0(str2);
                i = i2 + 1;
            }
            if (i < length) {
                cVar.mo94740l0(str, i, length);
            }
            cVar.mo94715R0(34);
        }
    }

    static {
        String[] strArr = new String[128];
        for (int i = 0; i <= 31; i++) {
            strArr[i] = "\\u00" + f23737o.m31356b((byte) i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        f23736n = strArr;
    }

    public C8339e(C40677c cVar) {
        C41536l.m120490j(cVar, "sink");
        this.f23739m = cVar;
        mo23523e0(6);
    }

    /* renamed from: F0 */
    private final void m31336F0() {
        int a0 = mo23522a0();
        if (a0 == 1) {
            mo23524f0(2);
            m31338K0();
        } else if (a0 == 2) {
            this.f23739m.mo94715R0(44);
            m31338K0();
        } else if (a0 == 4) {
            this.f23739m.mo94728d0(mo23507H0());
            mo23524f0(5);
        } else if (a0 == 6) {
            mo23524f0(7);
        } else if (a0 != 7) {
            throw new IllegalStateException("Nesting problem.");
        } else if (mo23533x()) {
            mo23524f0(7);
        } else {
            throw new IllegalStateException("JSON must have only one top-level value.".toString());
        }
    }

    /* renamed from: G0 */
    private final C8341f m31337G0(int i, int i2, String str) {
        boolean z;
        int a0 = mo23522a0();
        boolean z2 = false;
        if (a0 == i2 || a0 == i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f23738l == null) {
                z2 = true;
            }
            if (z2) {
                mo23526m0(mo23532w() - 1);
                mo23529t()[mo23532w()] = null;
                int[] s = mo23528s();
                int w = mo23532w() - 1;
                s[w] = s[w] + 1;
                if (a0 == i2) {
                    m31338K0();
                }
                this.f23739m.mo94728d0(str);
                return this;
            }
            throw new IllegalStateException(("Dangling name: " + this.f23738l).toString());
        }
        throw new IllegalStateException("Nesting problem.".toString());
    }

    /* renamed from: K0 */
    private final void m31338K0() {
        if (mo23527q() != null) {
            this.f23739m.mo94715R0(10);
            int w = mo23532w();
            for (int i = 1; i < w; i++) {
                C40677c cVar = this.f23739m;
                String q = mo23527q();
                if (q == null) {
                    q = "";
                }
                cVar.mo94728d0(q);
            }
        }
    }

    /* renamed from: M0 */
    private final C8341f m31339M0(int i, String str) {
        m31336F0();
        mo23523e0(i);
        mo23528s()[mo23532w() - 1] = 0;
        this.f23739m.mo94728d0(str);
        return this;
    }

    /* renamed from: O0 */
    private final void m31340O0() {
        if (this.f23738l != null) {
            m31342x0();
            C8340a aVar = f23737o;
            C40677c cVar = this.f23739m;
            String str = this.f23738l;
            if (str == null) {
                C41536l.m120500t();
            }
            aVar.mo23521c(cVar, str);
            this.f23738l = null;
        }
    }

    /* renamed from: x0 */
    private final void m31342x0() {
        boolean z;
        int a0 = mo23522a0();
        if (a0 == 5) {
            this.f23739m.mo94715R0(44);
        } else {
            if (a0 == 3) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Nesting problem.".toString());
            }
        }
        m31338K0();
        mo23524f0(4);
    }

    /* renamed from: H0 */
    public final String mo23507H0() {
        String q = mo23527q();
        return q == null || q.length() == 0 ? ":" : ": ";
    }

    /* renamed from: Q */
    public C8341f mo23508Q(String str) {
        boolean z;
        C41536l.m120490j(str, "name");
        boolean z2 = false;
        if (mo23532w() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f23738l == null) {
                z2 = true;
            }
            if (z2) {
                this.f23738l = str;
                mo23529t()[mo23532w() - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.".toString());
        }
        throw new IllegalStateException("JsonWriter is closed.".toString());
    }

    /* renamed from: R */
    public C8341f mo23509R() {
        if (this.f23738l != null) {
            if (mo23531v()) {
                m31340O0();
            } else {
                this.f23738l = null;
                return this;
            }
        }
        m31336F0();
        this.f23739m.mo94728d0("null");
        int[] s = mo23528s();
        int w = mo23532w() - 1;
        s[w] = s[w] + 1;
        return this;
    }

    /* renamed from: a */
    public C8341f mo23510a() {
        m31340O0();
        return m31339M0(1, "[");
    }

    public void close() {
        this.f23739m.close();
        int w = mo23532w();
        if (w > 1 || (w == 1 && mo23530u()[w - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        mo23526m0(0);
    }

    public void flush() {
        boolean z;
        if (mo23532w() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f23739m.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.".toString());
    }

    /* renamed from: k */
    public C8341f mo23513k() {
        m31340O0();
        return m31339M0(3, "{");
    }

    /* renamed from: n */
    public C8341f mo23514n() {
        return m31337G0(1, 2, "]");
    }

    /* renamed from: n0 */
    public C8341f mo23515n0(long j) {
        m31340O0();
        m31336F0();
        this.f23739m.mo94728d0(String.valueOf(j));
        int[] s = mo23528s();
        int w = mo23532w() - 1;
        s[w] = s[w] + 1;
        return this;
    }

    /* renamed from: o */
    public C8341f mo23516o() {
        return m31337G0(3, 5, "}");
    }

    /* renamed from: o0 */
    public C8341f mo23517o0(Boolean bool) {
        String str;
        if (bool == null) {
            return mo23509R();
        }
        m31340O0();
        m31336F0();
        C40677c cVar = this.f23739m;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        cVar.mo94728d0(str);
        int[] s = mo23528s();
        int w = mo23532w() - 1;
        s[w] = s[w] + 1;
        return this;
    }

    /* renamed from: p0 */
    public C8341f mo23518p0(Number number) {
        boolean z;
        if (number == null) {
            return mo23509R();
        }
        String obj = number.toString();
        if (mo23533x() || (!C41536l.m120484d(obj, "-Infinity") && !C41536l.m120484d(obj, "Infinity") && !C41536l.m120484d(obj, "NaN"))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m31340O0();
            m31336F0();
            this.f23739m.mo94728d0(obj);
            int[] s = mo23528s();
            int w = mo23532w() - 1;
            s[w] = s[w] + 1;
            return this;
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + number).toString());
    }

    /* renamed from: q0 */
    public C8341f mo23519q0(String str) {
        if (str == null) {
            return mo23509R();
        }
        m31340O0();
        m31336F0();
        f23737o.mo23521c(this.f23739m, str);
        int[] s = mo23528s();
        int w = mo23532w() - 1;
        s[w] = s[w] + 1;
        return this;
    }

    /* renamed from: y */
    public C8341f mo23520y(String str) {
        if (str == null) {
            return mo23509R();
        }
        m31340O0();
        m31336F0();
        this.f23739m.mo94728d0(str);
        int[] s = mo23528s();
        int w = mo23532w() - 1;
        s[w] = s[w] + 1;
        return this;
    }
}
