package com.facetec.sdk;

import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facetec.sdk.fh */
public final class C3078fh extends C3143fx {

    /* renamed from: e */
    private static final Object f10240e = new Object();

    /* renamed from: a */
    private Object[] f10241a;

    /* renamed from: c */
    private int f10242c;

    /* renamed from: d */
    private String[] f10243d;

    /* renamed from: g */
    private int[] f10244g;

    static {
        new Reader() {
            public final void close() {
                throw new AssertionError();
            }

            public final int read(char[] cArr, int i, int i2) {
                throw new AssertionError();
            }
        };
    }

    /* renamed from: r */
    private Object m12732r() {
        Object[] objArr = this.f10241a;
        int i = this.f10242c - 1;
        this.f10242c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: w */
    private String m12733w() {
        StringBuilder sb = new StringBuilder(" at path ");
        sb.append(mo9302s());
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo9284a() {
        mo9290d(C3141fv.END_ARRAY);
        m12732r();
        m12732r();
        int i = this.f10242c;
        if (i > 0) {
            int[] iArr = this.f10244g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: b */
    public final void mo9286b() {
        mo9290d(C3141fv.BEGIN_ARRAY);
        mo9285a(((C2982dz) mo9294h()).iterator());
        this.f10244g[this.f10242c - 1] = 0;
    }

    /* renamed from: c */
    public final void mo9287c() {
        mo9290d(C3141fv.END_OBJECT);
        m12732r();
        m12732r();
        int i = this.f10242c;
        if (i > 0) {
            int[] iArr = this.f10244g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final void close() {
        this.f10241a = new Object[]{f10240e};
        this.f10242c = 1;
    }

    /* renamed from: d */
    public final void mo9289d() {
        mo9290d(C3141fv.BEGIN_OBJECT);
        mo9285a(((C2999ed) mo9294h()).mo9178l().iterator());
    }

    /* renamed from: e */
    public final boolean mo9291e() {
        C3141fv f = mo9292f();
        if (f == C3141fv.END_OBJECT || f == C3141fv.END_ARRAY) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C3141fv mo9292f() {
        while (this.f10242c != 0) {
            Object h = mo9294h();
            if (h instanceof Iterator) {
                boolean z = this.f10241a[this.f10242c - 2] instanceof C2999ed;
                Iterator it = (Iterator) h;
                if (it.hasNext()) {
                    if (z) {
                        return C3141fv.NAME;
                    }
                    mo9285a(it.next());
                } else if (z) {
                    return C3141fv.END_OBJECT;
                } else {
                    return C3141fv.END_ARRAY;
                }
            } else if (h instanceof C2999ed) {
                return C3141fv.BEGIN_OBJECT;
            } else {
                if (h instanceof C2982dz) {
                    return C3141fv.BEGIN_ARRAY;
                }
                if (h instanceof C3008ej) {
                    C3008ej ejVar = (C3008ej) h;
                    if (ejVar.mo9190k()) {
                        return C3141fv.STRING;
                    }
                    if (ejVar.mo9191l()) {
                        return C3141fv.BOOLEAN;
                    }
                    if (ejVar.mo9192n()) {
                        return C3141fv.NUMBER;
                    }
                    throw new AssertionError();
                } else if (h instanceof C2996ea) {
                    return C3141fv.NULL;
                } else {
                    if (h == f10240e) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
        return C3141fv.END_DOCUMENT;
    }

    /* renamed from: g */
    public final String mo9293g() {
        mo9290d(C3141fv.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) mo9294h()).next();
        String str = (String) entry.getKey();
        this.f10243d[this.f10242c - 1] = str;
        mo9285a(entry.getValue());
        return str;
    }

    /* renamed from: h */
    public final Object mo9294h() {
        return this.f10241a[this.f10242c - 1];
    }

    /* renamed from: i */
    public final String mo9295i() {
        C3141fv f = mo9292f();
        C3141fv fvVar = C3141fv.STRING;
        if (f == fvVar || f == C3141fv.NUMBER) {
            String b = ((C3008ej) m12732r()).mo9144b();
            int i = this.f10242c;
            if (i > 0) {
                int[] iArr = this.f10244g;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return b;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(fvVar);
        sb.append(" but was ");
        sb.append(f);
        sb.append(m12733w());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: j */
    public final boolean mo9296j() {
        mo9290d(C3141fv.BOOLEAN);
        boolean i = ((C3008ej) m12732r()).mo9152i();
        int i2 = this.f10242c;
        if (i2 > 0) {
            int[] iArr = this.f10244g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return i;
    }

    /* renamed from: k */
    public final long mo9297k() {
        C3141fv f = mo9292f();
        C3141fv fvVar = C3141fv.NUMBER;
        if (f == fvVar || f == C3141fv.STRING) {
            long e = ((C3008ej) mo9294h()).mo9148e();
            m12732r();
            int i = this.f10242c;
            if (i > 0) {
                int[] iArr = this.f10244g;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return e;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(fvVar);
        sb.append(" but was ");
        sb.append(f);
        sb.append(m12733w());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: l */
    public final void mo9298l() {
        mo9290d(C3141fv.NULL);
        m12732r();
        int i = this.f10242c;
        if (i > 0) {
            int[] iArr = this.f10244g;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: m */
    public final int mo9299m() {
        C3141fv f = mo9292f();
        C3141fv fvVar = C3141fv.NUMBER;
        if (f == fvVar || f == C3141fv.STRING) {
            int c = ((C3008ej) mo9294h()).mo9146c();
            m12732r();
            int i = this.f10242c;
            if (i > 0) {
                int[] iArr = this.f10244g;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return c;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(fvVar);
        sb.append(" but was ");
        sb.append(f);
        sb.append(m12733w());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: n */
    public final double mo9300n() {
        C3141fv f = mo9292f();
        C3141fv fvVar = C3141fv.NUMBER;
        if (f == fvVar || f == C3141fv.STRING) {
            double a = ((C3008ej) mo9294h()).mo9143a();
            if (mo9338q() || (!Double.isNaN(a) && !Double.isInfinite(a))) {
                m12732r();
                int i = this.f10242c;
                if (i > 0) {
                    int[] iArr = this.f10244g;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return a;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(a)));
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(fvVar);
        sb.append(" but was ");
        sb.append(f);
        sb.append(m12733w());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: o */
    public final void mo9301o() {
        if (mo9292f() == C3141fv.NAME) {
            mo9293g();
            this.f10243d[this.f10242c - 2] = "null";
        } else {
            m12732r();
            int i = this.f10242c;
            if (i > 0) {
                this.f10243d[i - 1] = "null";
            }
        }
        int i2 = this.f10242c;
        if (i2 > 0) {
            int[] iArr = this.f10244g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: s */
    public final String mo9302s() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.f10242c) {
            Object[] objArr = this.f10241a;
            Object obj = objArr[i];
            if (obj instanceof C2982dz) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f10244g[i]);
                    sb.append(']');
                }
            } else if (obj instanceof C2999ed) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.f10243d[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    public final String toString() {
        return C3078fh.class.getSimpleName();
    }

    /* renamed from: d */
    public final void mo9290d(C3141fv fvVar) {
        if (mo9292f() != fvVar) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(fvVar);
            sb.append(" but was ");
            sb.append(mo9292f());
            sb.append(m12733w());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo9285a(Object obj) {
        int i = this.f10242c;
        Object[] objArr = this.f10241a;
        if (i == objArr.length) {
            int i2 = i << 1;
            this.f10241a = Arrays.copyOf(objArr, i2);
            this.f10244g = Arrays.copyOf(this.f10244g, i2);
            this.f10243d = (String[]) Arrays.copyOf(this.f10243d, i2);
        }
        Object[] objArr2 = this.f10241a;
        int i3 = this.f10242c;
        this.f10242c = i3 + 1;
        objArr2[i3] = obj;
    }
}
