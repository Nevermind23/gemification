package p328ya;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: ya.c */
public class C9146c implements Closeable, Flushable {

    /* renamed from: m */
    private static final Pattern f25363m = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: n */
    private static final String[] f25364n = new String[128];

    /* renamed from: o */
    private static final String[] f25365o;

    /* renamed from: d */
    private final Writer f25366d;

    /* renamed from: e */
    private int[] f25367e = new int[32];

    /* renamed from: f */
    private int f25368f = 0;

    /* renamed from: g */
    private String f25369g;

    /* renamed from: h */
    private String f25370h;

    /* renamed from: i */
    private boolean f25371i;

    /* renamed from: j */
    private boolean f25372j;

    /* renamed from: k */
    private String f25373k;

    /* renamed from: l */
    private boolean f25374l;

    static {
        for (int i = 0; i <= 31; i++) {
            f25364n[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f25364n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f25365o = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C9146c(Writer writer) {
        m33747a0(6);
        this.f25370h = ":";
        this.f25374l = true;
        Objects.requireNonNull(writer, "out == null");
        this.f25366d = writer;
    }

    /* renamed from: H0 */
    private void m33743H0() {
        if (this.f25373k != null) {
            m33746a();
            m33750o0(this.f25373k);
            this.f25373k = null;
        }
    }

    /* renamed from: R */
    private C9146c m33744R(int i, char c) {
        m33749k();
        m33747a0(i);
        this.f25366d.write(c);
        return this;
    }

    /* renamed from: U */
    private int m33745U() {
        int i = this.f25368f;
        if (i != 0) {
            return this.f25367e[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: a */
    private void m33746a() {
        int U = m33745U();
        if (U == 5) {
            this.f25366d.write(44);
        } else if (U != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m33753y();
        m33748e0(4);
    }

    /* renamed from: a0 */
    private void m33747a0(int i) {
        int i2 = this.f25368f;
        int[] iArr = this.f25367e;
        if (i2 == iArr.length) {
            this.f25367e = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f25367e;
        int i3 = this.f25368f;
        this.f25368f = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: e0 */
    private void m33748e0(int i) {
        this.f25367e[this.f25368f - 1] = i;
    }

    /* renamed from: k */
    private void m33749k() {
        int U = m33745U();
        if (U == 1) {
            m33748e0(2);
            m33753y();
        } else if (U == 2) {
            this.f25366d.append(',');
            m33753y();
        } else if (U != 4) {
            if (U != 6) {
                if (U != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f25371i) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m33748e0(7);
        } else {
            this.f25366d.append(this.f25370h);
            m33748e0(5);
        }
    }

    /* renamed from: o0 */
    private void m33750o0(String str) {
        String[] strArr;
        String str2;
        if (this.f25372j) {
            strArr = f25365o;
        } else {
            strArr = f25364n;
        }
        this.f25366d.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f25366d.write(str, i, i2 - i);
            }
            this.f25366d.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f25366d.write(str, i, length - i);
        }
        this.f25366d.write(34);
    }

    /* renamed from: p */
    private C9146c m33751p(int i, int i2, char c) {
        int U = m33745U();
        if (U != i2 && U != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f25373k == null) {
            this.f25368f--;
            if (U == i2) {
                m33753y();
            }
            this.f25366d.write(c);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f25373k);
        }
    }

    /* renamed from: w */
    private static boolean m33752w(Class cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    /* renamed from: y */
    private void m33753y() {
        if (this.f25369g != null) {
            this.f25366d.write(10);
            int i = this.f25368f;
            for (int i2 = 1; i2 < i; i2++) {
                this.f25366d.write(this.f25369g);
            }
        }
    }

    /* renamed from: F0 */
    public C9146c mo18356F0(String str) {
        if (str == null) {
            return mo18359Q();
        }
        m33743H0();
        m33749k();
        m33750o0(str);
        return this;
    }

    /* renamed from: G0 */
    public C9146c mo18357G0(boolean z) {
        String str;
        m33743H0();
        m33749k();
        Writer writer = this.f25366d;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    /* renamed from: Q */
    public C9146c mo18359Q() {
        if (this.f25373k != null) {
            if (this.f25374l) {
                m33743H0();
            } else {
                this.f25373k = null;
                return this;
            }
        }
        m33749k();
        this.f25366d.write("null");
        return this;
    }

    public void close() {
        this.f25366d.close();
        int i = this.f25368f;
        if (i > 1 || (i == 1 && this.f25367e[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f25368f = 0;
    }

    /* renamed from: f0 */
    public final void mo24716f0(boolean z) {
        this.f25372j = z;
    }

    public void flush() {
        if (this.f25368f != 0) {
            this.f25366d.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: h0 */
    public final void mo24717h0(String str) {
        if (str.length() == 0) {
            this.f25369g = null;
            this.f25370h = ":";
            return;
        }
        this.f25369g = str;
        this.f25370h = ": ";
    }

    /* renamed from: m0 */
    public final void mo24718m0(boolean z) {
        this.f25371i = z;
    }

    /* renamed from: n */
    public C9146c mo18362n() {
        m33743H0();
        return m33744R(1, '[');
    }

    /* renamed from: n0 */
    public final void mo24719n0(boolean z) {
        this.f25374l = z;
    }

    /* renamed from: o */
    public C9146c mo18363o() {
        m33743H0();
        return m33744R(3, '{');
    }

    /* renamed from: p0 */
    public C9146c mo18364p0(double d) {
        m33743H0();
        if (this.f25371i || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m33749k();
            this.f25366d.append(Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    /* renamed from: q */
    public C9146c mo18365q() {
        return m33751p(1, 2, ']');
    }

    /* renamed from: q0 */
    public C9146c mo18366q0(long j) {
        m33743H0();
        m33749k();
        this.f25366d.write(Long.toString(j));
        return this;
    }

    /* renamed from: s */
    public C9146c mo18367s() {
        return m33751p(3, 5, '}');
    }

    /* renamed from: s0 */
    public C9146c mo18368s0(Boolean bool) {
        String str;
        if (bool == null) {
            return mo18359Q();
        }
        m33743H0();
        m33749k();
        Writer writer = this.f25366d;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    /* renamed from: t */
    public final boolean mo24720t() {
        return this.f25374l;
    }

    /* renamed from: u */
    public final boolean mo24721u() {
        return this.f25372j;
    }

    /* renamed from: v */
    public boolean mo24722v() {
        return this.f25371i;
    }

    /* renamed from: x */
    public C9146c mo18369x(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f25373k != null) {
            throw new IllegalStateException();
        } else if (this.f25368f != 0) {
            this.f25373k = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: x0 */
    public C9146c mo18370x0(Number number) {
        if (number == null) {
            return mo18359Q();
        }
        m33743H0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!m33752w(cls) && !f25363m.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f25371i) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        m33749k();
        this.f25366d.append(obj);
        return this;
    }
}
