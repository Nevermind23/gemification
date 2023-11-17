package p328ya;

import com.google.gson.internal.C5577e;
import com.google.gson.internal.bind.C5552a;
import com.google.gson.stream.MalformedJsonException;
import com.salesforce.marketingcloud.C11398b;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: ya.a */
public class C9143a implements Closeable {

    /* renamed from: d */
    private final Reader f25337d;

    /* renamed from: e */
    private boolean f25338e = false;

    /* renamed from: f */
    private final char[] f25339f = new char[C11398b.f33141t];

    /* renamed from: g */
    private int f25340g = 0;

    /* renamed from: h */
    private int f25341h = 0;

    /* renamed from: i */
    private int f25342i = 0;

    /* renamed from: j */
    private int f25343j = 0;

    /* renamed from: k */
    int f25344k = 0;

    /* renamed from: l */
    private long f25345l;

    /* renamed from: m */
    private int f25346m;

    /* renamed from: n */
    private String f25347n;

    /* renamed from: o */
    private int[] f25348o;

    /* renamed from: p */
    private int f25349p;

    /* renamed from: q */
    private String[] f25350q;

    /* renamed from: r */
    private int[] f25351r;

    /* renamed from: ya.a$a */
    class C9144a extends C5577e {
        C9144a() {
        }

        /* renamed from: a */
        public void mo18377a(C9143a aVar) {
            if (aVar instanceof C5552a) {
                ((C5552a) aVar).mo18345f1();
                return;
            }
            int i = aVar.f25344k;
            if (i == 0) {
                i = aVar.mo24713q();
            }
            if (i == 13) {
                aVar.f25344k = 9;
            } else if (i == 12) {
                aVar.f25344k = 8;
            } else if (i == 14) {
                aVar.f25344k = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.mo18348n0() + aVar.mo24712Q());
            }
        }
    }

    static {
        C5577e.f17749a = new C9144a();
    }

    public C9143a(Reader reader) {
        int[] iArr = new int[32];
        this.f25348o = iArr;
        this.f25349p = 0 + 1;
        iArr[0] = 6;
        this.f25350q = new String[32];
        this.f25351r = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f25337d = reader;
    }

    /* renamed from: F0 */
    private void m33705F0(char c) {
        char[] cArr = this.f25339f;
        do {
            int i = this.f25340g;
            int i2 = this.f25341h;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f25340g = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f25340g = i3;
                    m33718s0();
                    i = this.f25340g;
                    i2 = this.f25341h;
                } else {
                    if (c2 == 10) {
                        this.f25342i++;
                        this.f25343j = i3;
                    }
                    i = i3;
                }
            }
            this.f25340g = i;
        } while (m33719u(1));
        throw m33709M0("Unterminated string");
    }

    /* renamed from: G0 */
    private boolean m33706G0(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f25340g + length > this.f25341h && !m33719u(length)) {
                return false;
            }
            char[] cArr = this.f25339f;
            int i2 = this.f25340g;
            if (cArr[i2] == 10) {
                this.f25342i++;
                this.f25343j = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f25339f[this.f25340g + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f25340g++;
        }
    }

    /* renamed from: H0 */
    private void m33707H0() {
        char c;
        do {
            if (this.f25340g < this.f25341h || m33719u(1)) {
                char[] cArr = this.f25339f;
                int i = this.f25340g;
                int i2 = i + 1;
                this.f25340g = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f25342i++;
                    this.f25343j = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        m33713n();
     */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m33708K0() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f25340g
            int r2 = r1 + r0
            int r3 = r4.f25341h
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f25339f
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.m33713n()
        L_0x004b:
            int r1 = r4.f25340g
            int r1 = r1 + r0
            r4.f25340g = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f25340g = r1
            r0 = 1
            boolean r0 = r4.m33719u(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p328ya.C9143a.m33708K0():void");
    }

    /* renamed from: M0 */
    private IOException m33709M0(String str) {
        throw new MalformedJsonException(str + mo24712Q());
    }

    /* renamed from: e0 */
    private int m33710e0(boolean z) {
        char[] cArr = this.f25339f;
        int i = this.f25340g;
        int i2 = this.f25341h;
        while (true) {
            if (i == i2) {
                this.f25340g = i;
                if (m33719u(1)) {
                    i = this.f25340g;
                    i2 = this.f25341h;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + mo24712Q());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f25342i++;
                this.f25343j = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f25340g = i3;
                    if (i3 == i2) {
                        this.f25340g = i3 - 1;
                        boolean u = m33719u(2);
                        this.f25340g++;
                        if (!u) {
                            return c;
                        }
                    }
                    m33713n();
                    int i4 = this.f25340g;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f25340g = i4 + 1;
                        if (m33706G0("*/")) {
                            i = this.f25340g + 2;
                            i2 = this.f25341h;
                        } else {
                            throw m33709M0("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f25340g = i4 + 1;
                        m33707H0();
                        i = this.f25340g;
                        i2 = this.f25341h;
                    }
                } else if (c == '#') {
                    this.f25340g = i3;
                    m33713n();
                    m33707H0();
                    i = this.f25340g;
                    i2 = this.f25341h;
                } else {
                    this.f25340g = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f25340g = r2;
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m33711h0(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f25339f
            r1 = 0
        L_0x0003:
            int r2 = r9.f25340g
            int r3 = r9.f25341h
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x005c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L_0x0028
            r9.f25340g = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0020
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L_0x0020:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0028:
            r8 = 92
            if (r2 != r8) goto L_0x004f
            r9.f25340g = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0040
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L_0x0040:
            r1.append(r0, r3, r7)
            char r2 = r9.m33718s0()
            r1.append(r2)
            int r2 = r9.f25340g
            int r3 = r9.f25341h
            goto L_0x0007
        L_0x004f:
            r5 = 10
            if (r2 != r5) goto L_0x005a
            int r2 = r9.f25342i
            int r2 = r2 + r6
            r9.f25342i = r2
            r9.f25343j = r7
        L_0x005a:
            r2 = r7
            goto L_0x0009
        L_0x005c:
            if (r1 != 0) goto L_0x006c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x006c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f25340g = r2
            boolean r2 = r9.m33719u(r6)
            if (r2 == 0) goto L_0x007a
            goto L_0x0003
        L_0x007a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m33709M0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p328ya.C9143a.m33711h0(char):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        m33713n();
     */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m33712m0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r6.f25340g
            int r4 = r3 + r2
            int r5 = r6.f25341h
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f25339f
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
            r6.m33713n()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f25339f
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.m33719u(r3)
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
            char[] r3 = r6.f25339f
            int r4 = r6.f25340g
            r0.append(r3, r4, r2)
            int r3 = r6.f25340g
            int r3 = r3 + r2
            r6.f25340g = r3
            r2 = 1
            boolean r2 = r6.m33719u(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f25339f
            int r3 = r6.f25340g
            r0.<init>(r2, r3, r1)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f25339f
            int r3 = r6.f25340g
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L_0x0095:
            int r2 = r6.f25340g
            int r2 = r2 + r1
            r6.f25340g = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p328ya.C9143a.m33712m0():java.lang.String");
    }

    /* renamed from: n */
    private void m33713n() {
        if (!this.f25338e) {
            throw m33709M0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: o */
    private void m33714o() {
        m33710e0(true);
        int i = this.f25340g - 1;
        this.f25340g = i;
        if (i + 5 <= this.f25341h || m33719u(5)) {
            int i2 = this.f25340g;
            char[] cArr = this.f25339f;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == 10) {
                this.f25340g = i2 + 5;
            }
        }
    }

    /* renamed from: o0 */
    private int m33715o0() {
        int i;
        String str;
        String str2;
        char c = this.f25339f[this.f25340g];
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
            if (this.f25340g + i2 >= this.f25341h && !m33719u(i2 + 1)) {
                return 0;
            }
            char c2 = this.f25339f[this.f25340g + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f25340g + length < this.f25341h || m33719u(length + 1)) && m33721y(this.f25339f[this.f25340g + length])) {
            return 0;
        }
        this.f25340g += length;
        this.f25344k = i;
        return i;
    }

    /* renamed from: p0 */
    private int m33716p0() {
        char c;
        char c2;
        boolean z;
        char[] cArr = this.f25339f;
        int i = this.f25340g;
        int i2 = this.f25341h;
        int i3 = 0;
        int i4 = 0;
        char c3 = 0;
        boolean z2 = false;
        boolean z3 = true;
        long j = 0;
        while (true) {
            if (i + i4 == i2) {
                if (i4 == cArr.length) {
                    return i3;
                }
                if (!m33719u(i4 + 1)) {
                    break;
                }
                i = this.f25340g;
                i2 = this.f25341h;
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
        if (m33721y(c)) {
            return 0;
        }
        if (c3 == 2 && z3 && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f25345l = j;
            this.f25340g += i4;
            this.f25344k = 15;
            return 15;
        } else if (c3 != 2 && c3 != 4 && c3 != 7) {
            return 0;
        } else {
            this.f25346m = i4;
            this.f25344k = 16;
            return 16;
        }
    }

    /* renamed from: q0 */
    private void m33717q0(int i) {
        int i2 = this.f25349p;
        int[] iArr = this.f25348o;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f25348o = Arrays.copyOf(iArr, i3);
            this.f25351r = Arrays.copyOf(this.f25351r, i3);
            this.f25350q = (String[]) Arrays.copyOf(this.f25350q, i3);
        }
        int[] iArr2 = this.f25348o;
        int i4 = this.f25349p;
        this.f25349p = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: s0 */
    private char m33718s0() {
        int i;
        int i2;
        if (this.f25340g != this.f25341h || m33719u(1)) {
            char[] cArr = this.f25339f;
            int i3 = this.f25340g;
            int i4 = i3 + 1;
            this.f25340g = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f25342i++;
                this.f25343j = i4;
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
                    throw m33709M0("Invalid escape sequence");
                } else if (i4 + 4 <= this.f25341h || m33719u(4)) {
                    int i5 = this.f25340g;
                    int i6 = i5 + 4;
                    char c2 = 0;
                    while (i5 < i6) {
                        char c3 = this.f25339f[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f25339f, this.f25340g, 4));
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
                    this.f25340g += 4;
                    return c2;
                } else {
                    throw m33709M0("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw m33709M0("Unterminated escape sequence");
    }

    /* renamed from: u */
    private boolean m33719u(int i) {
        int i2;
        int i3;
        char[] cArr = this.f25339f;
        int i4 = this.f25343j;
        int i5 = this.f25340g;
        this.f25343j = i4 - i5;
        int i6 = this.f25341h;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f25341h = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f25341h = 0;
        }
        this.f25340g = 0;
        do {
            Reader reader = this.f25337d;
            int i8 = this.f25341h;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f25341h + read;
            this.f25341h = i2;
            if (this.f25342i == 0 && (i3 = this.f25343j) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f25340g++;
                this.f25343j = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: v */
    private String m33720v(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.f25349p;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f25348o[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.f25351r[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.f25350q[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    /* renamed from: y */
    private boolean m33721y(char c) {
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
        m33713n();
        return false;
    }

    /* renamed from: E0 */
    public boolean mo18334E0() {
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        if (i == 5) {
            this.f25344k = 0;
            int[] iArr = this.f25351r;
            int i2 = this.f25349p - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f25344k = 0;
            int[] iArr2 = this.f25351r;
            int i3 = this.f25349p - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo18348n0() + mo24712Q());
        }
    }

    /* renamed from: I0 */
    public String mo18335I0() {
        String str;
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        if (i == 10) {
            str = m33712m0();
        } else if (i == 8) {
            str = m33711h0('\'');
        } else if (i == 9) {
            str = m33711h0('\"');
        } else if (i == 11) {
            str = this.f25347n;
            this.f25347n = null;
        } else if (i == 15) {
            str = Long.toString(this.f25345l);
        } else if (i == 16) {
            str = new String(this.f25339f, this.f25340g, this.f25346m);
            this.f25340g += this.f25346m;
        } else {
            throw new IllegalStateException("Expected a string but was " + mo18348n0() + mo24712Q());
        }
        this.f25344k = 0;
        int[] iArr = this.f25351r;
        int i2 = this.f25349p - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        r7.f25344k = 0;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18336N() {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r7.f25344k
            if (r2 != 0) goto L_0x000a
            int r2 = r7.mo24713q()
        L_0x000a:
            r3 = 34
            r4 = 39
            java.lang.String r5 = "<skipped>"
            r6 = 1
            switch(r2) {
                case 1: goto L_0x006d;
                case 2: goto L_0x005d;
                case 3: goto L_0x0059;
                case 4: goto L_0x0051;
                case 5: goto L_0x0014;
                case 6: goto L_0x0014;
                case 7: goto L_0x0014;
                case 8: goto L_0x004d;
                case 9: goto L_0x0049;
                case 10: goto L_0x0045;
                case 11: goto L_0x0014;
                case 12: goto L_0x0038;
                case 13: goto L_0x002b;
                case 14: goto L_0x001e;
                case 15: goto L_0x0014;
                case 16: goto L_0x0016;
                case 17: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0073
        L_0x0015:
            return
        L_0x0016:
            int r2 = r7.f25340g
            int r3 = r7.f25346m
            int r2 = r2 + r3
            r7.f25340g = r2
            goto L_0x0073
        L_0x001e:
            r7.m33708K0()
            if (r1 != 0) goto L_0x0073
            java.lang.String[] r2 = r7.f25350q
            int r3 = r7.f25349p
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0073
        L_0x002b:
            r7.m33705F0(r3)
            if (r1 != 0) goto L_0x0073
            java.lang.String[] r2 = r7.f25350q
            int r3 = r7.f25349p
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0073
        L_0x0038:
            r7.m33705F0(r4)
            if (r1 != 0) goto L_0x0073
            java.lang.String[] r2 = r7.f25350q
            int r3 = r7.f25349p
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0073
        L_0x0045:
            r7.m33708K0()
            goto L_0x0073
        L_0x0049:
            r7.m33705F0(r3)
            goto L_0x0073
        L_0x004d:
            r7.m33705F0(r4)
            goto L_0x0073
        L_0x0051:
            int r2 = r7.f25349p
            int r2 = r2 - r6
            r7.f25349p = r2
        L_0x0056:
            int r1 = r1 + -1
            goto L_0x0073
        L_0x0059:
            r7.m33717q0(r6)
            goto L_0x0071
        L_0x005d:
            if (r1 != 0) goto L_0x0067
            java.lang.String[] r2 = r7.f25350q
            int r3 = r7.f25349p
            int r3 = r3 - r6
            r4 = 0
            r2[r3] = r4
        L_0x0067:
            int r2 = r7.f25349p
            int r2 = r2 - r6
            r7.f25349p = r2
            goto L_0x0056
        L_0x006d:
            r2 = 3
            r7.m33717q0(r2)
        L_0x0071:
            int r1 = r1 + 1
        L_0x0073:
            r7.f25344k = r0
            if (r1 > 0) goto L_0x0002
            int[] r0 = r7.f25351r
            int r1 = r7.f25349p
            int r1 = r1 - r6
            r2 = r0[r1]
            int r2 = r2 + r6
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p328ya.C9143a.mo18336N():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public String mo24712Q() {
        return " at line " + (this.f25342i + 1) + " column " + ((this.f25340g - this.f25343j) + 1) + " path " + mo18353z();
    }

    /* renamed from: R */
    public double mo18337R() {
        char c;
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        if (i == 15) {
            this.f25344k = 0;
            int[] iArr = this.f25351r;
            int i2 = this.f25349p - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f25345l;
        }
        if (i == 16) {
            this.f25347n = new String(this.f25339f, this.f25340g, this.f25346m);
            this.f25340g += this.f25346m;
        } else if (i == 8 || i == 9) {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.f25347n = m33711h0(c);
        } else if (i == 10) {
            this.f25347n = m33712m0();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + mo18348n0() + mo24712Q());
        }
        this.f25344k = 11;
        double parseDouble = Double.parseDouble(this.f25347n);
        if (this.f25338e || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f25347n = null;
            this.f25344k = 0;
            int[] iArr2 = this.f25351r;
            int i3 = this.f25349p - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + mo24712Q());
    }

    /* renamed from: U */
    public int mo18338U() {
        char c;
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        if (i == 15) {
            long j = this.f25345l;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f25344k = 0;
                int[] iArr = this.f25351r;
                int i3 = this.f25349p - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f25345l + mo24712Q());
        }
        if (i == 16) {
            this.f25347n = new String(this.f25339f, this.f25340g, this.f25346m);
            this.f25340g += this.f25346m;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f25347n = m33712m0();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f25347n = m33711h0(c);
            }
            try {
                int parseInt = Integer.parseInt(this.f25347n);
                this.f25344k = 0;
                int[] iArr2 = this.f25351r;
                int i4 = this.f25349p - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + mo18348n0() + mo24712Q());
        }
        this.f25344k = 11;
        double parseDouble = Double.parseDouble(this.f25347n);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f25347n = null;
            this.f25344k = 0;
            int[] iArr3 = this.f25351r;
            int i6 = this.f25349p - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f25347n + mo24712Q());
    }

    /* renamed from: a */
    public void mo18340a() {
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        if (i == 3) {
            m33717q0(1);
            this.f25351r[this.f25349p - 1] = 0;
            this.f25344k = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo18348n0() + mo24712Q());
    }

    /* renamed from: a0 */
    public long mo18341a0() {
        char c;
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        if (i == 15) {
            this.f25344k = 0;
            int[] iArr = this.f25351r;
            int i2 = this.f25349p - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f25345l;
        }
        if (i == 16) {
            this.f25347n = new String(this.f25339f, this.f25340g, this.f25346m);
            this.f25340g += this.f25346m;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f25347n = m33712m0();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f25347n = m33711h0(c);
            }
            try {
                long parseLong = Long.parseLong(this.f25347n);
                this.f25344k = 0;
                int[] iArr2 = this.f25351r;
                int i3 = this.f25349p - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + mo18348n0() + mo24712Q());
        }
        this.f25344k = 11;
        double parseDouble = Double.parseDouble(this.f25347n);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f25347n = null;
            this.f25344k = 0;
            int[] iArr3 = this.f25351r;
            int i4 = this.f25349p - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f25347n + mo24712Q());
    }

    /* renamed from: b0 */
    public String mo18342b0() {
        String str;
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        if (i == 14) {
            str = m33712m0();
        } else if (i == 12) {
            str = m33711h0('\'');
        } else if (i == 13) {
            str = m33711h0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + mo18348n0() + mo24712Q());
        }
        this.f25344k = 0;
        this.f25350q[this.f25349p - 1] = str;
        return str;
    }

    public void close() {
        this.f25344k = 0;
        this.f25348o[0] = 8;
        this.f25349p = 1;
        this.f25337d.close();
    }

    /* renamed from: f0 */
    public void mo18344f0() {
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        if (i == 7) {
            this.f25344k = 0;
            int[] iArr = this.f25351r;
            int i2 = this.f25349p - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo18348n0() + mo24712Q());
    }

    public boolean hasNext() {
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        if (i == 2 || i == 4 || i == 17) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void mo18347k() {
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        if (i == 1) {
            m33717q0(3);
            this.f25344k = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo18348n0() + mo24712Q());
    }

    /* renamed from: n0 */
    public C9145b mo18348n0() {
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        switch (i) {
            case 1:
                return C9145b.BEGIN_OBJECT;
            case 2:
                return C9145b.END_OBJECT;
            case 3:
                return C9145b.BEGIN_ARRAY;
            case 4:
                return C9145b.END_ARRAY;
            case 5:
            case 6:
                return C9145b.BOOLEAN;
            case 7:
                return C9145b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C9145b.STRING;
            case 12:
            case 13:
            case 14:
                return C9145b.NAME;
            case 15:
            case 16:
                return C9145b.NUMBER;
            case 17:
                return C9145b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo24713q() {
        int e0;
        int[] iArr = this.f25348o;
        int i = this.f25349p;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int e02 = m33710e0(true);
            if (e02 != 44) {
                if (e02 == 59) {
                    m33713n();
                } else if (e02 == 93) {
                    this.f25344k = 4;
                    return 4;
                } else {
                    throw m33709M0("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5 && (e0 = m33710e0(true)) != 44) {
                if (e0 == 59) {
                    m33713n();
                } else if (e0 == 125) {
                    this.f25344k = 2;
                    return 2;
                } else {
                    throw m33709M0("Unterminated object");
                }
            }
            int e03 = m33710e0(true);
            if (e03 == 34) {
                this.f25344k = 13;
                return 13;
            } else if (e03 == 39) {
                m33713n();
                this.f25344k = 12;
                return 12;
            } else if (e03 != 125) {
                m33713n();
                this.f25340g--;
                if (m33721y((char) e03)) {
                    this.f25344k = 14;
                    return 14;
                }
                throw m33709M0("Expected name");
            } else if (i2 != 5) {
                this.f25344k = 2;
                return 2;
            } else {
                throw m33709M0("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int e04 = m33710e0(true);
            if (e04 != 58) {
                if (e04 == 61) {
                    m33713n();
                    if (this.f25340g < this.f25341h || m33719u(1)) {
                        char[] cArr = this.f25339f;
                        int i3 = this.f25340g;
                        if (cArr[i3] == '>') {
                            this.f25340g = i3 + 1;
                        }
                    }
                } else {
                    throw m33709M0("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            if (this.f25338e) {
                m33714o();
            }
            this.f25348o[this.f25349p - 1] = 7;
        } else if (i2 == 7) {
            if (m33710e0(false) == -1) {
                this.f25344k = 17;
                return 17;
            }
            m33713n();
            this.f25340g--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int e05 = m33710e0(true);
        if (e05 == 34) {
            this.f25344k = 9;
            return 9;
        } else if (e05 != 39) {
            if (!(e05 == 44 || e05 == 59)) {
                if (e05 == 91) {
                    this.f25344k = 3;
                    return 3;
                } else if (e05 != 93) {
                    if (e05 != 123) {
                        this.f25340g--;
                        int o0 = m33715o0();
                        if (o0 != 0) {
                            return o0;
                        }
                        int p0 = m33716p0();
                        if (p0 != 0) {
                            return p0;
                        }
                        if (m33721y(this.f25339f[this.f25340g])) {
                            m33713n();
                            this.f25344k = 10;
                            return 10;
                        }
                        throw m33709M0("Expected value");
                    }
                    this.f25344k = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f25344k = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m33713n();
                this.f25340g--;
                this.f25344k = 7;
                return 7;
            }
            throw m33709M0("Unexpected value");
        } else {
            m33713n();
            this.f25344k = 8;
            return 8;
        }
    }

    /* renamed from: s */
    public void mo18349s() {
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        if (i == 4) {
            int i2 = this.f25349p - 1;
            this.f25349p = i2;
            int[] iArr = this.f25351r;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f25344k = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo18348n0() + mo24712Q());
    }

    /* renamed from: t */
    public void mo18350t() {
        int i = this.f25344k;
        if (i == 0) {
            i = mo24713q();
        }
        if (i == 2) {
            int i2 = this.f25349p - 1;
            this.f25349p = i2;
            this.f25350q[i2] = null;
            int[] iArr = this.f25351r;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f25344k = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo18348n0() + mo24712Q());
    }

    public String toString() {
        return getClass().getSimpleName() + mo24712Q();
    }

    /* renamed from: w */
    public String mo18352w() {
        return m33720v(true);
    }

    /* renamed from: x */
    public final boolean mo24714x() {
        return this.f25338e;
    }

    /* renamed from: x0 */
    public final void mo24715x0(boolean z) {
        this.f25338e = z;
    }

    /* renamed from: z */
    public String mo18353z() {
        return m33720v(false);
    }
}
