package com.facetec.sdk;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* renamed from: com.facetec.sdk.gb */
public class C3160gb implements Closeable, Flushable {

    /* renamed from: d */
    private static final String[] f10428d = new String[128];

    /* renamed from: e */
    private static final String[] f10429e;

    /* renamed from: a */
    private int f10430a = 0;

    /* renamed from: b */
    private int[] f10431b = new int[32];

    /* renamed from: c */
    private final Writer f10432c;

    /* renamed from: f */
    private String f10433f;

    /* renamed from: g */
    private boolean f10434g;

    /* renamed from: h */
    private String f10435h;

    /* renamed from: i */
    private boolean f10436i;

    /* renamed from: j */
    private String f10437j;

    /* renamed from: o */
    private boolean f10438o;

    static {
        for (int i = 0; i <= 31; i++) {
            f10428d[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f10428d;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f10429e = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C3160gb(Writer writer) {
        m12944e(6);
        this.f10433f = ":";
        this.f10438o = true;
        if (writer != null) {
            this.f10432c = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: g */
    private void m12946g() {
        if (this.f10435h != null) {
            m12949m();
            m12945e(this.f10435h);
            this.f10435h = null;
        }
    }

    /* renamed from: k */
    private void m12947k() {
        int b = mo9309b();
        if (b == 1) {
            m12940a(2);
            m12948l();
        } else if (b == 2) {
            this.f10432c.append(',');
            m12948l();
        } else if (b != 4) {
            if (b != 6) {
                if (b != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f10434g) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m12940a(7);
        } else {
            this.f10432c.append(this.f10433f);
            m12940a(5);
        }
    }

    /* renamed from: l */
    private void m12948l() {
        if (this.f10437j != null) {
            this.f10432c.write(10);
            int i = this.f10430a;
            for (int i2 = 1; i2 < i; i2++) {
                this.f10432c.write(this.f10437j);
            }
        }
    }

    /* renamed from: m */
    private void m12949m() {
        int b = mo9309b();
        if (b == 5) {
            this.f10432c.write(44);
        } else if (b != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m12948l();
        m12940a(4);
    }

    /* renamed from: a */
    public final void mo9355a(boolean z) {
        this.f10434g = z;
    }

    /* renamed from: b */
    public final void mo9356b(boolean z) {
        this.f10436i = z;
    }

    /* renamed from: c */
    public final void mo9357c(String str) {
        if (str.length() == 0) {
            this.f10437j = null;
            this.f10433f = ":";
            return;
        }
        this.f10437j = str;
        this.f10433f = ": ";
    }

    public void close() {
        this.f10432c.close();
        int i = this.f10430a;
        if (i > 1 || (i == 1 && this.f10431b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f10430a = 0;
    }

    /* renamed from: d */
    public final void mo9358d(boolean z) {
        this.f10438o = z;
    }

    /* renamed from: e */
    public C3160gb mo9316e() {
        m12946g();
        return m12943d(3, '{');
    }

    /* renamed from: f */
    public C3160gb mo9318f() {
        if (this.f10435h != null) {
            if (this.f10438o) {
                m12946g();
            } else {
                this.f10435h = null;
                return this;
            }
        }
        m12947k();
        this.f10432c.write("null");
        return this;
    }

    public void flush() {
        if (this.f10430a != 0) {
            this.f10432c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: h */
    public final boolean mo9359h() {
        return this.f10438o;
    }

    /* renamed from: i */
    public final boolean mo9360i() {
        return this.f10434g;
    }

    /* renamed from: j */
    public final boolean mo9361j() {
        return this.f10436i;
    }

    /* renamed from: b */
    private int mo9309b() {
        int i = this.f10430a;
        if (i != 0) {
            return this.f10431b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: a */
    public C3160gb mo9306a() {
        return m12942c(1, 2, ']');
    }

    /* renamed from: d */
    public C3160gb mo9312d() {
        m12946g();
        return m12943d(1, '[');
    }

    /* renamed from: a */
    private void m12940a(int i) {
        this.f10431b[this.f10430a - 1] = i;
    }

    /* renamed from: e */
    private void m12944e(int i) {
        int i2 = this.f10430a;
        int[] iArr = this.f10431b;
        if (i2 == iArr.length) {
            this.f10431b = Arrays.copyOf(iArr, i2 << 1);
        }
        int[] iArr2 = this.f10431b;
        int i3 = this.f10430a;
        this.f10430a = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: d */
    private C3160gb m12943d(int i, char c) {
        m12947k();
        m12944e(i);
        this.f10432c.write(c);
        return this;
    }

    /* renamed from: a */
    public C3160gb mo9308a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f10435h != null) {
            throw new IllegalStateException();
        } else if (this.f10430a != 0) {
            this.f10435h = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: c */
    public C3160gb mo9310c() {
        return m12942c(3, 5, '}');
    }

    /* renamed from: e */
    public C3160gb mo9317e(boolean z) {
        m12946g();
        m12947k();
        this.f10432c.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: c */
    private C3160gb m12942c(int i, int i2, char c) {
        int b = mo9309b();
        if (b != i2 && b != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f10435h == null) {
            this.f10430a--;
            if (b == i2) {
                m12948l();
            }
            this.f10432c.write(c);
            return this;
        } else {
            StringBuilder sb = new StringBuilder("Dangling name: ");
            sb.append(this.f10435h);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: d */
    public C3160gb mo9315d(String str) {
        if (str == null) {
            return mo9318f();
        }
        m12946g();
        m12947k();
        m12945e(str);
        return this;
    }

    /* renamed from: e */
    private void m12945e(String str) {
        String str2;
        String[] strArr = this.f10436i ? f10429e : f10428d;
        this.f10432c.write(34);
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
                this.f10432c.write(str, i, i2 - i);
            }
            this.f10432c.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f10432c.write(str, i, length - i);
        }
        this.f10432c.write(34);
    }

    /* renamed from: a */
    public C3160gb mo9307a(Number number) {
        if (number == null) {
            return mo9318f();
        }
        m12946g();
        String obj = number.toString();
        if (this.f10434g || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m12947k();
            this.f10432c.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
    }

    /* renamed from: d */
    public C3160gb mo9314d(Boolean bool) {
        if (bool == null) {
            return mo9318f();
        }
        m12946g();
        m12947k();
        this.f10432c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: d */
    public C3160gb mo9313d(long j) {
        m12946g();
        m12947k();
        this.f10432c.write(Long.toString(j));
        return this;
    }
}
