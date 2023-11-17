package com.google.gson.internal.bind;

import com.google.gson.C5491e;
import com.google.gson.C5494h;
import com.google.gson.C5495i;
import com.google.gson.C5610j;
import com.google.gson.C5612l;
import com.google.gson.stream.MalformedJsonException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p328ya.C9143a;
import p328ya.C9145b;

/* renamed from: com.google.gson.internal.bind.a */
public final class C5552a extends C9143a {

    /* renamed from: w */
    private static final Reader f17720w = new C5553a();

    /* renamed from: x */
    private static final Object f17721x = new Object();

    /* renamed from: s */
    private Object[] f17722s = new Object[32];

    /* renamed from: t */
    private int f17723t = 0;

    /* renamed from: u */
    private String[] f17724u = new String[32];

    /* renamed from: v */
    private int[] f17725v = new int[32];

    /* renamed from: com.google.gson.internal.bind.a$a */
    class C5553a extends Reader {
        C5553a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    /* renamed from: com.google.gson.internal.bind.a$b */
    static /* synthetic */ class C5554b {

        /* renamed from: a */
        static final /* synthetic */ int[] f17726a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                ya.b[] r0 = p328ya.C9145b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17726a = r0
                ya.b r1 = p328ya.C9145b.NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17726a     // Catch:{ NoSuchFieldError -> 0x001d }
                ya.b r1 = p328ya.C9145b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17726a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ya.b r1 = p328ya.C9145b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17726a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ya.b r1 = p328ya.C9145b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.C5552a.C5554b.<clinit>():void");
        }
    }

    public C5552a(C5494h hVar) {
        super(f17720w);
        m22155i1(hVar);
    }

    /* renamed from: O0 */
    private void m22150O0(C9145b bVar) {
        if (mo18348n0() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + mo18348n0() + m22151Q());
        }
    }

    /* renamed from: Q */
    private String m22151Q() {
        return " at path " + mo18353z();
    }

    /* renamed from: W0 */
    private String m22152W0(boolean z) {
        String str;
        m22150O0(C9145b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m22153Y0()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.f17724u;
        int i = this.f17723t - 1;
        if (z) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i] = str;
        m22155i1(entry.getValue());
        return str2;
    }

    /* renamed from: Y0 */
    private Object m22153Y0() {
        return this.f17722s[this.f17723t - 1];
    }

    /* renamed from: a1 */
    private Object m22154a1() {
        Object[] objArr = this.f17722s;
        int i = this.f17723t - 1;
        this.f17723t = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: i1 */
    private void m22155i1(Object obj) {
        int i = this.f17723t;
        Object[] objArr = this.f17722s;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f17722s = Arrays.copyOf(objArr, i2);
            this.f17725v = Arrays.copyOf(this.f17725v, i2);
            this.f17724u = (String[]) Arrays.copyOf(this.f17724u, i2);
        }
        Object[] objArr2 = this.f17722s;
        int i3 = this.f17723t;
        this.f17723t = i3 + 1;
        objArr2[i3] = obj;
    }

    /* renamed from: v */
    private String m22156v(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.f17723t;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.f17722s;
            Object obj = objArr[i];
            if (obj instanceof C5491e) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.f17725v[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof C5610j) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.f17724u[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    /* renamed from: E0 */
    public boolean mo18334E0() {
        m22150O0(C9145b.BOOLEAN);
        boolean b = ((C5612l) m22154a1()).mo18206b();
        int i = this.f17723t;
        if (i > 0) {
            int[] iArr = this.f17725v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return b;
    }

    /* renamed from: I0 */
    public String mo18335I0() {
        C9145b n0 = mo18348n0();
        C9145b bVar = C9145b.STRING;
        if (n0 == bVar || n0 == C9145b.NUMBER) {
            String k = ((C5612l) m22154a1()).mo18211k();
            int i = this.f17723t;
            if (i > 0) {
                int[] iArr = this.f17725v;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return k;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + n0 + m22151Q());
    }

    /* renamed from: N */
    public void mo18336N() {
        int i = C5554b.f17726a[mo18348n0().ordinal()];
        if (i == 1) {
            m22152W0(true);
        } else if (i == 2) {
            mo18349s();
        } else if (i == 3) {
            mo18350t();
        } else if (i != 4) {
            m22154a1();
            int i2 = this.f17723t;
            if (i2 > 0) {
                int[] iArr = this.f17725v;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }

    /* renamed from: R */
    public double mo18337R() {
        C9145b n0 = mo18348n0();
        C9145b bVar = C9145b.NUMBER;
        if (n0 == bVar || n0 == C9145b.STRING) {
            double v = ((C5612l) m22153Y0()).mo18457v();
            if (mo24714x() || (!Double.isNaN(v) && !Double.isInfinite(v))) {
                m22154a1();
                int i = this.f17723t;
                if (i > 0) {
                    int[] iArr = this.f17725v;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return v;
            }
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + v);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + n0 + m22151Q());
    }

    /* renamed from: U */
    public int mo18338U() {
        C9145b n0 = mo18348n0();
        C9145b bVar = C9145b.NUMBER;
        if (n0 == bVar || n0 == C9145b.STRING) {
            int w = ((C5612l) m22153Y0()).mo18458w();
            m22154a1();
            int i = this.f17723t;
            if (i > 0) {
                int[] iArr = this.f17725v;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return w;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + n0 + m22151Q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public C5494h mo18339V0() {
        C9145b n0 = mo18348n0();
        if (n0 == C9145b.NAME || n0 == C9145b.END_ARRAY || n0 == C9145b.END_OBJECT || n0 == C9145b.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + n0 + " when reading a JsonElement.");
        }
        C5494h hVar = (C5494h) m22153Y0();
        mo18336N();
        return hVar;
    }

    /* renamed from: a */
    public void mo18340a() {
        m22150O0(C9145b.BEGIN_ARRAY);
        m22155i1(((C5491e) m22153Y0()).iterator());
        this.f17725v[this.f17723t - 1] = 0;
    }

    /* renamed from: a0 */
    public long mo18341a0() {
        C9145b n0 = mo18348n0();
        C9145b bVar = C9145b.NUMBER;
        if (n0 == bVar || n0 == C9145b.STRING) {
            long j = ((C5612l) m22153Y0()).mo18210j();
            m22154a1();
            int i = this.f17723t;
            if (i > 0) {
                int[] iArr = this.f17725v;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return j;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + n0 + m22151Q());
    }

    /* renamed from: b0 */
    public String mo18342b0() {
        return m22152W0(false);
    }

    public void close() {
        this.f17722s = new Object[]{f17721x};
        this.f17723t = 1;
    }

    /* renamed from: f0 */
    public void mo18344f0() {
        m22150O0(C9145b.NULL);
        m22154a1();
        int i = this.f17723t;
        if (i > 0) {
            int[] iArr = this.f17725v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: f1 */
    public void mo18345f1() {
        m22150O0(C9145b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m22153Y0()).next();
        m22155i1(entry.getValue());
        m22155i1(new C5612l((String) entry.getKey()));
    }

    public boolean hasNext() {
        C9145b n0 = mo18348n0();
        if (n0 == C9145b.END_OBJECT || n0 == C9145b.END_ARRAY || n0 == C9145b.END_DOCUMENT) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void mo18347k() {
        m22150O0(C9145b.BEGIN_OBJECT);
        m22155i1(((C5610j) m22153Y0()).mo18449w().iterator());
    }

    /* renamed from: n0 */
    public C9145b mo18348n0() {
        if (this.f17723t == 0) {
            return C9145b.END_DOCUMENT;
        }
        Object Y0 = m22153Y0();
        if (Y0 instanceof Iterator) {
            boolean z = this.f17722s[this.f17723t - 2] instanceof C5610j;
            Iterator it = (Iterator) Y0;
            if (it.hasNext()) {
                if (z) {
                    return C9145b.NAME;
                }
                m22155i1(it.next());
                return mo18348n0();
            } else if (z) {
                return C9145b.END_OBJECT;
            } else {
                return C9145b.END_ARRAY;
            }
        } else if (Y0 instanceof C5610j) {
            return C9145b.BEGIN_OBJECT;
        } else {
            if (Y0 instanceof C5491e) {
                return C9145b.BEGIN_ARRAY;
            }
            if (Y0 instanceof C5612l) {
                C5612l lVar = (C5612l) Y0;
                if (lVar.mo18454C()) {
                    return C9145b.STRING;
                }
                if (lVar.mo18460z()) {
                    return C9145b.BOOLEAN;
                }
                if (lVar.mo18453B()) {
                    return C9145b.NUMBER;
                }
                throw new AssertionError();
            } else if (Y0 instanceof C5495i) {
                return C9145b.NULL;
            } else {
                if (Y0 == f17721x) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new MalformedJsonException("Custom JsonElement subclass " + Y0.getClass().getName() + " is not supported");
            }
        }
    }

    /* renamed from: s */
    public void mo18349s() {
        m22150O0(C9145b.END_ARRAY);
        m22154a1();
        m22154a1();
        int i = this.f17723t;
        if (i > 0) {
            int[] iArr = this.f17725v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: t */
    public void mo18350t() {
        m22150O0(C9145b.END_OBJECT);
        this.f17724u[this.f17723t - 1] = null;
        m22154a1();
        m22154a1();
        int i = this.f17723t;
        if (i > 0) {
            int[] iArr = this.f17725v;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public String toString() {
        return C5552a.class.getSimpleName() + m22151Q();
    }

    /* renamed from: w */
    public String mo18352w() {
        return m22156v(true);
    }

    /* renamed from: z */
    public String mo18353z() {
        return m22156v(false);
    }
}
