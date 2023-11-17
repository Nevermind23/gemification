package com.facetec.sdk;

import com.salesforce.marketingcloud.C11398b;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facetec.sdk.fx */
public class C3143fx implements Closeable {

    /* renamed from: c */
    private static final char[] f10379c = ")]}'\n".toCharArray();

    /* renamed from: a */
    private final char[] f10380a = new char[C11398b.f33141t];

    /* renamed from: b */
    int f10381b = 0;

    /* renamed from: d */
    private final Reader f10382d;

    /* renamed from: e */
    private boolean f10383e = false;

    /* renamed from: f */
    private int f10384f = 0;

    /* renamed from: g */
    private int f10385g = 0;

    /* renamed from: h */
    private int f10386h = 0;

    /* renamed from: i */
    private int f10387i = 0;

    /* renamed from: j */
    private long f10388j;

    /* renamed from: k */
    private String f10389k;

    /* renamed from: l */
    private int f10390l;

    /* renamed from: m */
    private int f10391m;

    /* renamed from: n */
    private int[] f10392n;

    /* renamed from: o */
    private String[] f10393o;

    /* renamed from: s */
    private int[] f10394s;

    static {
        C3048ey.f10208e = new C3048ey() {
            /* renamed from: c */
            public final void mo9263c(C3143fx fxVar) {
                if (fxVar instanceof C3078fh) {
                    C3078fh fhVar = (C3078fh) fxVar;
                    fhVar.mo9290d(C3141fv.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) fhVar.mo9294h()).next();
                    fhVar.mo9285a(entry.getValue());
                    fhVar.mo9285a(new C3008ej((String) entry.getKey()));
                    return;
                }
                int i = fxVar.f10381b;
                if (i == 0) {
                    i = fxVar.mo9339t();
                }
                if (i == 13) {
                    fxVar.f10381b = 9;
                } else if (i == 12) {
                    fxVar.f10381b = 8;
                } else if (i == 14) {
                    fxVar.f10381b = 10;
                } else {
                    StringBuilder sb = new StringBuilder("Expected a name but was ");
                    sb.append(fxVar.mo9292f());
                    sb.append(fxVar.mo9337p());
                    throw new IllegalStateException(sb.toString());
                }
            }
        };
    }

    public C3143fx(Reader reader) {
        int[] iArr = new int[32];
        this.f10392n = iArr;
        this.f10391m = 0 + 1;
        iArr[0] = 6;
        this.f10393o = new String[32];
        this.f10394s = new int[32];
        if (reader != null) {
            this.f10382d = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: h */
    private int mo9294h() {
        int i;
        String str;
        String str2;
        char c = this.f10380a[this.f10385g];
        if (c == 't' || c == 'T') {
            str2 = "true";
            str = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str2 = "false";
            str = "FALSE";
            i = 6;
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i = 7;
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f10385g + i2 >= this.f10387i && !m12903e(i2 + 1)) {
                return 0;
            }
            char c2 = this.f10380a[this.f10385g + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f10385g + length < this.f10387i || m12903e(length + 1)) && m12897a(this.f10380a[this.f10385g + length])) {
            return 0;
        }
        this.f10385g += length;
        this.f10381b = i;
        return i;
    }

    /* renamed from: r */
    private int m12905r() {
        char c;
        char c2;
        boolean z;
        char[] cArr = this.f10380a;
        int i = this.f10385g;
        int i2 = this.f10387i;
        int i3 = 0;
        int i4 = 0;
        char c3 = 0;
        boolean z2 = false;
        boolean z3 = true;
        long j = 0;
        while (true) {
            if (i + i4 == i2) {
                if (i4 != cArr.length) {
                    if (!m12903e(i4 + 1)) {
                        break;
                    }
                    i = this.f10385g;
                    i2 = this.f10387i;
                } else {
                    return i3;
                }
            }
            c = cArr[i + i4];
            if (c == '+') {
                c2 = 6;
                i3 = 0;
                if (c3 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i3 = 0;
                if (c3 != 2 && c3 != 4) {
                    return 0;
                }
                c3 = 5;
                i4++;
            } else if (c != '-') {
                c2 = 3;
                if (c == '.') {
                    i3 = 0;
                    if (c3 != 2) {
                        return 0;
                    }
                } else if (c >= '0' && c <= '9') {
                    if (c3 == 1 || c3 == 0) {
                        j = (long) (-(c - '0'));
                        c3 = 2;
                    } else if (c3 != 2) {
                        if (c3 == 3) {
                            i3 = 0;
                            c3 = 4;
                        } else if (c3 == 5 || c3 == 6) {
                            i3 = 0;
                            c3 = 7;
                        }
                        i4++;
                    } else if (j == 0) {
                        return 0;
                    } else {
                        long j2 = (10 * j) - ((long) (c - '0'));
                        int i5 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                        if (i5 > 0 || (i5 == 0 && j2 < j)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z3 &= z;
                        j = j2;
                    }
                    i3 = 0;
                    i4++;
                }
            } else {
                c2 = 6;
                i3 = 0;
                if (c3 == 0) {
                    c3 = 1;
                    z2 = true;
                    i4++;
                } else if (c3 != 5) {
                    return 0;
                }
            }
            c3 = c2;
            i4++;
        }
        if (m12897a(c)) {
            return 0;
        }
        if (c3 == 2 && z3 && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f10388j = j;
            this.f10385g += i4;
            this.f10381b = 15;
            return 15;
        } else if (c3 != 2 && c3 != 4 && c3 != 7) {
            return 0;
        } else {
            this.f10390l = i4;
            this.f10381b = 16;
            return 16;
        }
    }

    /* renamed from: u */
    private void m12906u() {
        m12898b(true);
        int i = this.f10385g - 1;
        this.f10385g = i;
        char[] cArr = f10379c;
        if (i + cArr.length <= this.f10387i || m12903e(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f10379c;
                if (i2 >= cArr2.length) {
                    this.f10385g += cArr2.length;
                    return;
                } else if (this.f10380a[this.f10385g + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: v */
    private void m12907v() {
        if (!this.f10383e) {
            throw m12900c("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: w */
    private char m12908w() {
        int i;
        int i2;
        if (this.f10385g != this.f10387i || m12903e(1)) {
            char[] cArr = this.f10380a;
            int i3 = this.f10385g;
            int i4 = i3 + 1;
            this.f10385g = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f10384f++;
                this.f10386h = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    throw m12900c("Invalid escape sequence");
                } else if (i4 + 4 <= this.f10387i || m12903e(4)) {
                    int i5 = this.f10385g;
                    int i6 = i5 + 4;
                    char c2 = 0;
                    while (i5 < i6) {
                        char c3 = this.f10380a[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                StringBuilder sb = new StringBuilder("\\u");
                                sb.append(new String(this.f10380a, this.f10385g, 4));
                                throw new NumberFormatException(sb.toString());
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i5++;
                    }
                    this.f10385g += 4;
                    return c2;
                } else {
                    throw m12900c("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw m12900c("Unterminated escape sequence");
    }

    /* renamed from: x */
    private void m12909x() {
        char c;
        do {
            if (this.f10385g < this.f10387i || m12903e(1)) {
                char[] cArr = this.f10380a;
                int i = this.f10385g;
                int i2 = i + 1;
                this.f10385g = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f10384f++;
                    this.f10386h = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        m12907v();
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m12910y() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r6.f10385g
            int r4 = r3 + r2
            int r5 = r6.f10387i
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f10380a
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.m12907v()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f10380a
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.m12903e(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r1 = r2
            goto L_0x007e
        L_0x005e:
            if (r0 != 0) goto L_0x006b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f10380a
            int r4 = r6.f10385g
            r0.append(r3, r4, r2)
            int r3 = r6.f10385g
            int r3 = r3 + r2
            r6.f10385g = r3
            r2 = 1
            boolean r2 = r6.m12903e(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f10380a
            int r3 = r6.f10385g
            r0.<init>(r2, r3, r1)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f10380a
            int r3 = r6.f10385g
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L_0x0095:
            int r2 = r6.f10385g
            int r2 = r2 + r1
            r6.f10385g = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3143fx.m12910y():java.lang.String");
    }

    /* renamed from: a */
    public final void mo9336a(boolean z) {
        this.f10383e = z;
    }

    /* renamed from: b */
    public void mo9286b() {
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        if (i == 3) {
            m12896a(1);
            this.f10394s[this.f10391m - 1] = 0;
            this.f10381b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(mo9292f());
        sb.append(mo9337p());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public void mo9287c() {
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        if (i == 2) {
            int i2 = this.f10391m - 1;
            this.f10391m = i2;
            this.f10393o[i2] = null;
            int[] iArr = this.f10394s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f10381b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(mo9292f());
        sb.append(mo9337p());
        throw new IllegalStateException(sb.toString());
    }

    public void close() {
        this.f10381b = 0;
        this.f10392n[0] = 8;
        this.f10391m = 1;
        this.f10382d.close();
    }

    /* renamed from: d */
    public void mo9289d() {
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        if (i == 1) {
            m12896a(3);
            this.f10381b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(mo9292f());
        sb.append(mo9337p());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public boolean mo9291e() {
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: f */
    public C3141fv mo9292f() {
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        switch (i) {
            case 1:
                return C3141fv.BEGIN_OBJECT;
            case 2:
                return C3141fv.END_OBJECT;
            case 3:
                return C3141fv.BEGIN_ARRAY;
            case 4:
                return C3141fv.END_ARRAY;
            case 5:
            case 6:
                return C3141fv.BOOLEAN;
            case 7:
                return C3141fv.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C3141fv.STRING;
            case 12:
            case 13:
            case 14:
                return C3141fv.NAME;
            case 15:
            case 16:
                return C3141fv.NUMBER;
            case 17:
                return C3141fv.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: g */
    public String mo9293g() {
        String str;
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        if (i == 14) {
            str = m12910y();
        } else if (i == 12) {
            str = m12901d('\'');
        } else if (i == 13) {
            str = m12901d('\"');
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(mo9292f());
            sb.append(mo9337p());
            throw new IllegalStateException(sb.toString());
        }
        this.f10381b = 0;
        this.f10393o[this.f10391m - 1] = str;
        return str;
    }

    /* renamed from: i */
    public String mo9295i() {
        String str;
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        if (i == 10) {
            str = m12910y();
        } else if (i == 8) {
            str = m12901d('\'');
        } else if (i == 9) {
            str = m12901d('\"');
        } else if (i == 11) {
            str = this.f10389k;
            this.f10389k = null;
        } else if (i == 15) {
            str = Long.toString(this.f10388j);
        } else if (i == 16) {
            str = new String(this.f10380a, this.f10385g, this.f10390l);
            this.f10385g += this.f10390l;
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(mo9292f());
            sb.append(mo9337p());
            throw new IllegalStateException(sb.toString());
        }
        this.f10381b = 0;
        int[] iArr = this.f10394s;
        int i2 = this.f10391m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: j */
    public boolean mo9296j() {
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        if (i == 5) {
            this.f10381b = 0;
            int[] iArr = this.f10394s;
            int i2 = this.f10391m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f10381b = 0;
            int[] iArr2 = this.f10394s;
            int i3 = this.f10391m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(mo9292f());
            sb.append(mo9337p());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: k */
    public long mo9297k() {
        char c;
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        if (i == 15) {
            this.f10381b = 0;
            int[] iArr = this.f10394s;
            int i2 = this.f10391m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f10388j;
        }
        if (i == 16) {
            this.f10389k = new String(this.f10380a, this.f10385g, this.f10390l);
            this.f10385g += this.f10390l;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f10389k = m12910y();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f10389k = m12901d(c);
            }
            try {
                long parseLong = Long.parseLong(this.f10389k);
                this.f10381b = 0;
                int[] iArr2 = this.f10394s;
                int i3 = this.f10391m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb = new StringBuilder("Expected a long but was ");
            sb.append(mo9292f());
            sb.append(mo9337p());
            throw new IllegalStateException(sb.toString());
        }
        this.f10381b = 11;
        double parseDouble = Double.parseDouble(this.f10389k);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f10389k = null;
            this.f10381b = 0;
            int[] iArr3 = this.f10394s;
            int i4 = this.f10391m - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder sb2 = new StringBuilder("Expected a long but was ");
        sb2.append(this.f10389k);
        sb2.append(mo9337p());
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: l */
    public void mo9298l() {
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        if (i == 7) {
            this.f10381b = 0;
            int[] iArr = this.f10394s;
            int i2 = this.f10391m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected null but was ");
        sb.append(mo9292f());
        sb.append(mo9337p());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: m */
    public int mo9299m() {
        char c;
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        if (i == 15) {
            long j = this.f10388j;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f10381b = 0;
                int[] iArr = this.f10394s;
                int i3 = this.f10391m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(this.f10388j);
            sb.append(mo9337p());
            throw new NumberFormatException(sb.toString());
        }
        if (i == 16) {
            this.f10389k = new String(this.f10380a, this.f10385g, this.f10390l);
            this.f10385g += this.f10390l;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f10389k = m12910y();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f10389k = m12901d(c);
            }
            try {
                int parseInt = Integer.parseInt(this.f10389k);
                this.f10381b = 0;
                int[] iArr2 = this.f10394s;
                int i4 = this.f10391m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(mo9292f());
            sb2.append(mo9337p());
            throw new IllegalStateException(sb2.toString());
        }
        this.f10381b = 11;
        double parseDouble = Double.parseDouble(this.f10389k);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f10389k = null;
            this.f10381b = 0;
            int[] iArr3 = this.f10394s;
            int i6 = this.f10391m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder sb3 = new StringBuilder("Expected an int but was ");
        sb3.append(this.f10389k);
        sb3.append(mo9337p());
        throw new NumberFormatException(sb3.toString());
    }

    /* renamed from: n */
    public double mo9300n() {
        char c;
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        if (i == 15) {
            this.f10381b = 0;
            int[] iArr = this.f10394s;
            int i2 = this.f10391m - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f10388j;
        }
        if (i == 16) {
            this.f10389k = new String(this.f10380a, this.f10385g, this.f10390l);
            this.f10385g += this.f10390l;
        } else if (i == 8 || i == 9) {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.f10389k = m12901d(c);
        } else if (i == 10) {
            this.f10389k = m12910y();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(mo9292f());
            sb.append(mo9337p());
            throw new IllegalStateException(sb.toString());
        }
        this.f10381b = 11;
        double parseDouble = Double.parseDouble(this.f10389k);
        if (this.f10383e || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f10389k = null;
            this.f10381b = 0;
            int[] iArr2 = this.f10394s;
            int i3 = this.f10391m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
        sb2.append(parseDouble);
        sb2.append(mo9337p());
        throw new C3145fy(sb2.toString());
    }

    /* renamed from: o */
    public void mo9301o() {
        int i;
        int i2 = 0;
        do {
            int i3 = this.f10381b;
            if (i3 == 0) {
                i3 = mo9339t();
            }
            if (i3 == 3) {
                m12896a(1);
            } else if (i3 == 1) {
                m12896a(3);
            } else {
                if (i3 == 4) {
                    this.f10391m--;
                } else if (i3 == 2) {
                    this.f10391m--;
                } else if (i3 == 14 || i3 == 10) {
                    while (true) {
                        i = 0;
                        while (true) {
                            int i4 = this.f10385g;
                            if (i4 + i < this.f10387i) {
                                char c = this.f10380a[i4 + i];
                                if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
                                    if (c != '#') {
                                        if (c != ',') {
                                            if (!(c == '/' || c == '=')) {
                                                if (!(c == '{' || c == '}' || c == ':')) {
                                                    if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f10385g = i4 + i;
                                if (!m12903e(1)) {
                                }
                            }
                        }
                    }
                    m12907v();
                    this.f10385g += i;
                    this.f10381b = 0;
                } else if (i3 == 8 || i3 == 12) {
                    m12899b('\'');
                    this.f10381b = 0;
                } else if (i3 == 9 || i3 == 13) {
                    m12899b('\"');
                    this.f10381b = 0;
                } else {
                    if (i3 == 16) {
                        this.f10385g += this.f10390l;
                    }
                    this.f10381b = 0;
                }
                i2--;
                this.f10381b = 0;
            }
            i2++;
            this.f10381b = 0;
        } while (i2 != 0);
        int[] iArr = this.f10394s;
        int i5 = this.f10391m;
        int i6 = i5 - 1;
        iArr[i6] = iArr[i6] + 1;
        this.f10393o[i5 - 1] = "null";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final String mo9337p() {
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(this.f10384f + 1);
        sb.append(" column ");
        sb.append((this.f10385g - this.f10386h) + 1);
        sb.append(" path ");
        sb.append(mo9302s());
        return sb.toString();
    }

    /* renamed from: q */
    public final boolean mo9338q() {
        return this.f10383e;
    }

    /* renamed from: s */
    public String mo9302s() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f10391m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f10392n[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f10394s[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.f10393o[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final int mo9339t() {
        int b;
        int[] iArr = this.f10392n;
        int i = this.f10391m;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int b2 = m12898b(true);
            if (b2 != 44) {
                if (b2 == 59) {
                    m12907v();
                } else if (b2 == 93) {
                    this.f10381b = 4;
                    return 4;
                } else {
                    throw m12900c("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5 && (b = m12898b(true)) != 44) {
                if (b == 59) {
                    m12907v();
                } else if (b == 125) {
                    this.f10381b = 2;
                    return 2;
                } else {
                    throw m12900c("Unterminated object");
                }
            }
            int b3 = m12898b(true);
            if (b3 == 34) {
                this.f10381b = 13;
                return 13;
            } else if (b3 == 39) {
                m12907v();
                this.f10381b = 12;
                return 12;
            } else if (b3 != 125) {
                m12907v();
                this.f10385g--;
                if (m12897a((char) b3)) {
                    this.f10381b = 14;
                    return 14;
                }
                throw m12900c("Expected name");
            } else if (i2 != 5) {
                this.f10381b = 2;
                return 2;
            } else {
                throw m12900c("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int b4 = m12898b(true);
            if (b4 != 58) {
                if (b4 == 61) {
                    m12907v();
                    if (this.f10385g < this.f10387i || m12903e(1)) {
                        char[] cArr = this.f10380a;
                        int i3 = this.f10385g;
                        if (cArr[i3] == '>') {
                            this.f10385g = i3 + 1;
                        }
                    }
                } else {
                    throw m12900c("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            if (this.f10383e) {
                m12906u();
            }
            this.f10392n[this.f10391m - 1] = 7;
        } else if (i2 == 7) {
            if (m12898b(false) == -1) {
                this.f10381b = 17;
                return 17;
            }
            m12907v();
            this.f10385g--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int b5 = m12898b(true);
        if (b5 == 34) {
            this.f10381b = 9;
            return 9;
        } else if (b5 != 39) {
            if (!(b5 == 44 || b5 == 59)) {
                if (b5 == 91) {
                    this.f10381b = 3;
                    return 3;
                } else if (b5 != 93) {
                    if (b5 != 123) {
                        this.f10385g--;
                        int h = mo9294h();
                        if (h != 0) {
                            return h;
                        }
                        int r = m12905r();
                        if (r != 0) {
                            return r;
                        }
                        if (m12897a(this.f10380a[this.f10385g])) {
                            m12907v();
                            this.f10381b = 10;
                            return 10;
                        }
                        throw m12900c("Expected value");
                    }
                    this.f10381b = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f10381b = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m12907v();
                this.f10385g--;
                this.f10381b = 7;
                return 7;
            }
            throw m12900c("Unexpected value");
        } else {
            m12907v();
            this.f10381b = 8;
            return 8;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(mo9337p());
        return sb.toString();
    }

    /* renamed from: a */
    public void mo9284a() {
        int i = this.f10381b;
        if (i == 0) {
            i = mo9339t();
        }
        if (i == 4) {
            int i2 = this.f10391m - 1;
            this.f10391m = i2;
            int[] iArr = this.f10394s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f10381b = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(mo9292f());
        sb.append(mo9337p());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    private boolean m12903e(int i) {
        int i2;
        int i3;
        char[] cArr = this.f10380a;
        int i4 = this.f10386h;
        int i5 = this.f10385g;
        this.f10386h = i4 - i5;
        int i6 = this.f10387i;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f10387i = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f10387i = 0;
        }
        this.f10385g = 0;
        do {
            Reader reader = this.f10382d;
            int i8 = this.f10387i;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f10387i + read;
            this.f10387i = i2;
            if (this.f10384f == 0 && (i3 = this.f10386h) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f10385g++;
                this.f10386h = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: d */
    private String m12901d(char c) {
        char[] cArr = this.f10380a;
        StringBuilder sb = null;
        while (true) {
            int i = this.f10385g;
            int i2 = this.f10387i;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.f10385g = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i5);
                        }
                        sb.append(cArr, i, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f10385g = i4;
                        int i6 = (i4 - i) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) << 1, 16));
                        }
                        sb.append(cArr, i, i6);
                        sb.append(m12908w());
                    } else {
                        if (c2 == 10) {
                            this.f10384f++;
                            this.f10386h = i4;
                        }
                        i3 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i3 - i) << 1, 16));
                    }
                    sb.append(cArr, i, i3 - i);
                    this.f10385g = i3;
                    if (!m12903e(1)) {
                        throw m12900c("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m12899b(char c) {
        char[] cArr = this.f10380a;
        while (true) {
            int i = this.f10385g;
            int i2 = this.f10387i;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f10385g = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f10385g = i3;
                        m12908w();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f10384f++;
                            this.f10386h = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f10385g = i;
                    if (!m12903e(1)) {
                        throw m12900c("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m12897a(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m12907v();
        return false;
    }

    /* renamed from: c */
    private IOException m12900c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(mo9337p());
        throw new C3145fy(sb.toString());
    }

    /* renamed from: a */
    private void m12896a(int i) {
        int i2 = this.f10391m;
        int[] iArr = this.f10392n;
        if (i2 == iArr.length) {
            int i3 = i2 << 1;
            this.f10392n = Arrays.copyOf(iArr, i3);
            this.f10394s = Arrays.copyOf(this.f10394s, i3);
            this.f10393o = (String[]) Arrays.copyOf(this.f10393o, i3);
        }
        int[] iArr2 = this.f10392n;
        int i4 = this.f10391m;
        this.f10391m = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: b */
    private int m12898b(boolean z) {
        char[] cArr = this.f10380a;
        int i = this.f10385g;
        int i2 = this.f10387i;
        while (true) {
            if (i == i2) {
                this.f10385g = i;
                if (m12903e(1)) {
                    i = this.f10385g;
                    i2 = this.f10387i;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder sb = new StringBuilder("End of input");
                    sb.append(mo9337p());
                    throw new EOFException(sb.toString());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f10384f++;
                this.f10386h = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f10385g = i3;
                    if (i3 == i2) {
                        this.f10385g = i3 - 1;
                        boolean e = m12903e(2);
                        this.f10385g++;
                        if (!e) {
                            return c;
                        }
                    }
                    m12907v();
                    int i4 = this.f10385g;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f10385g = i4 + 1;
                        if (m12902d("*/")) {
                            i = this.f10385g + 2;
                            i2 = this.f10387i;
                        } else {
                            throw m12900c("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f10385g = i4 + 1;
                        m12909x();
                        i = this.f10385g;
                        i2 = this.f10387i;
                    }
                } else if (c == '#') {
                    this.f10385g = i3;
                    m12907v();
                    m12909x();
                    i = this.f10385g;
                    i2 = this.f10387i;
                } else {
                    this.f10385g = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: d */
    private boolean m12902d(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f10385g + length > this.f10387i && !m12903e(length)) {
                return false;
            }
            char[] cArr = this.f10380a;
            int i2 = this.f10385g;
            if (cArr[i2] == 10) {
                this.f10384f++;
                this.f10386h = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f10380a[this.f10385g + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f10385g++;
        }
    }
}
