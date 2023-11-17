package p256t2;

import com.apollographql.apollo.api.internal.json.JsonDataException;
import com.apollographql.apollo.api.internal.json.JsonEncodingException;
import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import java.io.EOFException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p256t2.C8336c;

/* renamed from: t2.a */
public final class C8332a implements C8336c {

    /* renamed from: p */
    private static final C40681e f23703p;

    /* renamed from: q */
    private static final C40681e f23704q;

    /* renamed from: r */
    private static final C40681e f23705r;

    /* renamed from: s */
    private static final C40681e f23706s;

    /* renamed from: t */
    public static final C8333a f23707t = new C8333a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C40672b f23708d;

    /* renamed from: e */
    private int f23709e;

    /* renamed from: f */
    private long f23710f;

    /* renamed from: g */
    private int f23711g;

    /* renamed from: h */
    private String f23712h;

    /* renamed from: i */
    private final int[] f23713i;

    /* renamed from: j */
    private int f23714j = 1;

    /* renamed from: k */
    private final String[] f23715k = new String[32];

    /* renamed from: l */
    private final int[] f23716l = new int[32];

    /* renamed from: m */
    private boolean f23717m;

    /* renamed from: n */
    private boolean f23718n;

    /* renamed from: o */
    private final C40679d f23719o;

    /* renamed from: t2.a$a */
    public static final class C8333a {
        private C8333a() {
        }

        public /* synthetic */ C8333a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C40681e.C40682a aVar = C40681e.f96327g;
        f23703p = aVar.mo94822c("'\\");
        f23704q = aVar.mo94822c("\"\\");
        f23705r = aVar.mo94822c("{}[]:, \n\t\r/\\;#=");
        f23706s = aVar.mo94822c("\n\r");
    }

    public C8332a(C40679d dVar) {
        C41536l.m120490j(dVar, "source");
        this.f23719o = dVar;
        this.f23708d = dVar.mo94690B();
        int[] iArr = new int[32];
        iArr[0] = 6;
        this.f23713i = iArr;
    }

    /* renamed from: Q */
    private final boolean m31288Q(String str) {
        while (true) {
            int i = 0;
            if (!this.f23719o.mo94739l((long) str.length())) {
                return false;
            }
            int length = str.length();
            while (i < length) {
                if (this.f23708d.mo94764t((long) i) != ((byte) str.charAt(i))) {
                    this.f23708d.readByte();
                } else {
                    i++;
                }
            }
            return true;
        }
    }

    /* renamed from: R */
    private final void m31289R() {
        long j;
        long E = this.f23719o.mo94697E(f23706s);
        C40672b bVar = this.f23708d;
        if (E != -1) {
            j = E + 1;
        } else {
            j = bVar.mo94709M0();
        }
        bVar.skip(j);
    }

    /* renamed from: U */
    private final void m31290U() {
        long E = this.f23719o.mo94697E(f23705r);
        C40672b bVar = this.f23708d;
        if (E == -1) {
            E = bVar.mo94709M0();
        }
        bVar.skip(E);
    }

    /* renamed from: a */
    private final void m31291a() {
        if (!mo23500o()) {
            throw m31292a0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: a0 */
    private final JsonEncodingException m31292a0(String str) {
        return new JsonEncodingException(str + " at path " + mo23503z());
    }

    /* renamed from: k */
    private final int m31293k() {
        int[] iArr = this.f23713i;
        int i = this.f23714j;
        int i2 = iArr[i - 1];
        boolean z = false;
        switch (i2) {
            case 1:
                iArr[i - 1] = 2;
                break;
            case 2:
                int q = m31295q(true);
                this.f23708d.readByte();
                char c = (char) q;
                if (c != ',') {
                    if (c == ';') {
                        m31291a();
                        break;
                    } else if (c == ']') {
                        this.f23709e = 4;
                        return 4;
                    } else {
                        throw m31292a0("Unterminated array");
                    }
                }
                break;
            case 3:
            case 5:
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int q2 = m31295q(true);
                    this.f23708d.readByte();
                    char c2 = (char) q2;
                    if (c2 != ',') {
                        if (c2 == ';') {
                            m31291a();
                        } else if (c2 == '}') {
                            this.f23709e = 2;
                            return 2;
                        } else {
                            throw m31292a0("Unterminated object");
                        }
                    }
                }
                char q3 = (char) m31295q(true);
                if (q3 == '\"') {
                    this.f23708d.readByte();
                    this.f23709e = 13;
                    return 13;
                } else if (q3 == '\'') {
                    this.f23708d.readByte();
                    m31291a();
                    this.f23709e = 12;
                    return 12;
                } else if (q3 != '}') {
                    m31291a();
                    if (m31294p(q3)) {
                        this.f23709e = 14;
                        return 14;
                    }
                    throw m31292a0("Expected name");
                } else if (i2 != 5) {
                    this.f23708d.readByte();
                    this.f23709e = 2;
                    return 2;
                } else {
                    throw m31292a0("Expected name");
                }
            case 4:
                iArr[i - 1] = 5;
                int q4 = m31295q(true);
                this.f23708d.readByte();
                char c3 = (char) q4;
                if (c3 != ':') {
                    if (c3 == '=') {
                        m31291a();
                        if (this.f23719o.mo94739l(1) && this.f23708d.mo94764t(0) == ((byte) 62)) {
                            this.f23708d.readByte();
                            break;
                        }
                    } else {
                        throw m31292a0("Expected ':'");
                    }
                }
                break;
            case 6:
                iArr[i - 1] = 7;
                break;
            case 7:
                if (m31295q(false) != -1) {
                    m31291a();
                    break;
                } else {
                    this.f23709e = 17;
                    return 17;
                }
            default:
                if (i2 != 8) {
                    z = true;
                }
                if (!z) {
                    throw new IllegalStateException("JsonReader is closed".toString());
                }
                break;
        }
        char q5 = (char) m31295q(true);
        if (q5 == '\"') {
            this.f23708d.readByte();
            this.f23709e = 9;
            return 9;
        } else if (q5 == '\'') {
            m31291a();
            this.f23708d.readByte();
            this.f23709e = 8;
            return 8;
        } else if (q5 == ',' || q5 == ';') {
            if (i2 == 1 || i2 == 2) {
                m31291a();
                this.f23709e = 7;
                return 7;
            }
            throw m31292a0("Unexpected value");
        } else if (q5 == '[') {
            this.f23708d.readByte();
            this.f23709e = 3;
            return 3;
        } else if (q5 != ']') {
            if (q5 != '{') {
                int u = m31298u();
                if (u != 0) {
                    return u;
                }
                int v = m31299v();
                if (v != 0) {
                    return v;
                }
                if (m31294p((char) this.f23708d.mo94764t(0))) {
                    m31291a();
                    this.f23709e = 10;
                    return 10;
                }
                throw m31292a0("Expected value");
            }
            this.f23708d.readByte();
            this.f23709e = 1;
            return 1;
        } else if (i2 == 1) {
            this.f23708d.readByte();
            this.f23709e = 4;
            return 4;
        } else if (i2 == 1 || i2 == 2) {
            m31291a();
            this.f23709e = 7;
            return 7;
        } else {
            throw m31292a0("Unexpected value");
        }
    }

    /* renamed from: p */
    private final boolean m31294p(char c) {
        if (c == 9 || c == 10 || c == 13 || c == ' ') {
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
        m31291a();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r9.f23708d.skip(((long) r1) - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r2 != 47) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r9.f23719o.mo94739l(2) != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        m31291a();
        r3 = (char) r9.f23708d.mo94764t(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r3 == '*') goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r3 == '/') goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r9.f23708d.readByte();
        r9.f23708d.readByte();
        m31289R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        r9.f23708d.readByte();
        r9.f23708d.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (m31288Q("*/") == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r9.f23708d.readByte();
        r9.f23708d.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        throw m31292a0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r2 != 35) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        m31291a();
        m31289R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        return r2;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m31295q(boolean r10) {
        /*
            r9 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            dg1.d r2 = r9.f23719o
            long r3 = (long) r1
            r5 = 1
            long r7 = r3 + r5
            boolean r2 = r2.mo94739l(r7)
            if (r2 == 0) goto L_0x008e
            dg1.b r2 = r9.f23708d
            int r1 = r1 + 1
            byte r2 = r2.mo94764t(r3)
            r3 = 10
            if (r2 == r3) goto L_0x0002
            r3 = 32
            if (r2 == r3) goto L_0x0002
            r3 = 13
            if (r2 == r3) goto L_0x0002
            r3 = 9
            if (r2 != r3) goto L_0x0028
            goto L_0x0002
        L_0x0028:
            dg1.b r3 = r9.f23708d
            long r7 = (long) r1
            long r7 = r7 - r5
            r3.skip(r7)
            r1 = 47
            if (r2 != r1) goto L_0x0081
            dg1.d r3 = r9.f23719o
            r7 = 2
            boolean r3 = r3.mo94739l(r7)
            if (r3 != 0) goto L_0x003e
            return r2
        L_0x003e:
            r9.m31291a()
            dg1.b r3 = r9.f23708d
            byte r3 = r3.mo94764t(r5)
            char r3 = (char) r3
            r4 = 42
            if (r3 == r4) goto L_0x005d
            if (r3 == r1) goto L_0x004f
            return r2
        L_0x004f:
            dg1.b r1 = r9.f23708d
            r1.readByte()
            dg1.b r1 = r9.f23708d
            r1.readByte()
            r9.m31289R()
            goto L_0x0001
        L_0x005d:
            dg1.b r1 = r9.f23708d
            r1.readByte()
            dg1.b r1 = r9.f23708d
            r1.readByte()
            java.lang.String r1 = "*/"
            boolean r1 = r9.m31288Q(r1)
            if (r1 == 0) goto L_0x007a
            dg1.b r1 = r9.f23708d
            r1.readByte()
            dg1.b r1 = r9.f23708d
            r1.readByte()
            goto L_0x0001
        L_0x007a:
            java.lang.String r10 = "Unterminated comment"
            com.apollographql.apollo.api.internal.json.JsonEncodingException r10 = r9.m31292a0(r10)
            throw r10
        L_0x0081:
            r1 = 35
            if (r2 != r1) goto L_0x008d
            r9.m31291a()
            r9.m31289R()
            goto L_0x0001
        L_0x008d:
            return r2
        L_0x008e:
            if (r10 != 0) goto L_0x0092
            r10 = -1
            return r10
        L_0x0092:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p256t2.C8332a.m31295q(boolean):int");
    }

    /* renamed from: s */
    private final String m31296s(C40681e eVar) {
        StringBuilder sb = null;
        while (true) {
            long E = this.f23719o.mo94697E(eVar);
            if (E == -1) {
                throw m31292a0("Unterminated string");
            } else if (this.f23708d.mo94764t(E) == ((byte) 92)) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f23708d.mo94701G0(E));
                this.f23708d.readByte();
                sb.append(m31301x());
            } else if (sb == null) {
                String G0 = this.f23708d.mo94701G0(E);
                this.f23708d.readByte();
                return G0;
            } else {
                sb.append(this.f23708d.mo94701G0(E));
                this.f23708d.readByte();
                String sb2 = sb.toString();
                C41536l.m120485e(sb2, "builder.toString()");
                return sb2;
            }
        }
    }

    /* renamed from: t */
    private final String m31297t() {
        long E = this.f23719o.mo94697E(f23705r);
        if (E != -1) {
            return this.f23708d.mo94701G0(E);
        }
        return this.f23708d.mo94746o1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m31298u() {
        /*
            r11 = this;
            dg1.b r0 = r11.f23708d
            r1 = 0
            byte r0 = r0.mo94764t(r1)
            r1 = 70
            r2 = 0
            if (r0 == r1) goto L_0x002e
            r1 = 78
            if (r0 == r1) goto L_0x0028
            r1 = 84
            if (r0 == r1) goto L_0x0022
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L_0x002e
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L_0x0028
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L_0x0022
            return r2
        L_0x0022:
            java.lang.String r0 = "true"
            java.lang.String r1 = "TRUE"
            r3 = 5
            goto L_0x0033
        L_0x0028:
            java.lang.String r0 = "null"
            java.lang.String r1 = "NULL"
            r3 = 7
            goto L_0x0033
        L_0x002e:
            java.lang.String r0 = "false"
            java.lang.String r1 = "FALSE"
            r3 = 6
        L_0x0033:
            int r4 = r0.length()
            r5 = 1
        L_0x0038:
            r6 = 1
            if (r5 >= r4) goto L_0x005f
            dg1.d r8 = r11.f23719o
            long r9 = (long) r5
            long r6 = r6 + r9
            boolean r6 = r8.mo94739l(r6)
            if (r6 != 0) goto L_0x0047
            return r2
        L_0x0047:
            dg1.b r6 = r11.f23708d
            byte r6 = r6.mo94764t(r9)
            char r7 = r0.charAt(r5)
            byte r7 = (byte) r7
            if (r6 == r7) goto L_0x005c
            char r7 = r1.charAt(r5)
            byte r7 = (byte) r7
            if (r6 == r7) goto L_0x005c
            return r2
        L_0x005c:
            int r5 = r5 + 1
            goto L_0x0038
        L_0x005f:
            dg1.d r0 = r11.f23719o
            long r4 = (long) r4
            long r6 = r6 + r4
            boolean r0 = r0.mo94739l(r6)
            if (r0 == 0) goto L_0x0077
            dg1.b r0 = r11.f23708d
            byte r0 = r0.mo94764t(r4)
            char r0 = (char) r0
            boolean r0 = r11.m31294p(r0)
            if (r0 == 0) goto L_0x0077
            return r2
        L_0x0077:
            dg1.b r0 = r11.f23708d
            r0.skip(r4)
            r11.f23709e = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p256t2.C8332a.m31298u():int");
    }

    /* renamed from: v */
    private final int m31299v() {
        long j;
        char c;
        char c2;
        boolean z;
        boolean z2 = true;
        int i = 0;
        char c3 = 0;
        long j2 = 0;
        boolean z3 = false;
        while (true) {
            j = (long) i;
            if (!this.f23719o.mo94739l(1 + j)) {
                break;
            }
            byte t = this.f23708d.mo94764t(j);
            c = (char) t;
            if (c == '+') {
                c2 = 6;
                if (c3 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                if (c3 != 2 && c3 != 4) {
                    return 0;
                }
                c3 = 5;
                i++;
            } else if (c != '-') {
                c2 = 3;
                if (c != '.') {
                    byte b = (byte) 48;
                    if (t >= b && t <= ((byte) 57)) {
                        if (c3 == 0 || c3 == 1) {
                            j2 = -((long) (t - b));
                            c3 = 2;
                        } else if (c3 != 2) {
                            if (c3 == 3) {
                                c3 = 4;
                            } else if (c3 == 5 || c3 == 6) {
                                c3 = 7;
                            }
                            i++;
                        } else if (j2 == 0) {
                            return 0;
                        } else {
                            long j3 = (((long) 10) * j2) - ((long) (t - b));
                            int i2 = (j2 > -922337203685477580L ? 1 : (j2 == -922337203685477580L ? 0 : -1));
                            if (i2 > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if ((z2 && z) || (i2 == 0 && j3 < j2)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            j2 = j3;
                        }
                        i++;
                    }
                } else if (c3 != 2) {
                    return 0;
                }
            } else {
                c2 = 6;
                if (c3 == 0) {
                    c3 = 1;
                    z3 = true;
                    i++;
                } else if (c3 != 5) {
                    return 0;
                }
            }
            c3 = c2;
            i++;
        }
        if (m31294p(c)) {
            return 0;
        }
        if (c3 == 2 && z2 && (j2 != Long.MIN_VALUE || z3)) {
            if (!z3) {
                j2 = -j2;
            }
            this.f23710f = j2;
            this.f23708d.skip(j);
            this.f23709e = 15;
            return 15;
        } else if (c3 != 2 && c3 != 4 && c3 != 7) {
            return 0;
        } else {
            this.f23711g = i;
            this.f23709e = 16;
            return 16;
        }
    }

    /* renamed from: w */
    private final void m31300w(int i) {
        int i2 = this.f23714j;
        int[] iArr = this.f23713i;
        if (i2 != iArr.length) {
            this.f23714j = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new JsonDataException("Nesting too deep at " + mo23503z());
    }

    /* renamed from: x */
    private final char m31301x() {
        int i;
        if (this.f23719o.mo94739l(1)) {
            char readByte = (char) this.f23708d.readByte();
            if (readByte == 'u') {
                if (this.f23719o.mo94739l(4)) {
                    char c = (char) 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        byte t = this.f23708d.mo94764t((long) i2);
                        char c2 = (char) (c << 4);
                        byte b = (byte) 48;
                        if (t < b || t > ((byte) 57)) {
                            byte b2 = (byte) 97;
                            if ((t < b2 || t > ((byte) 102)) && (t < (b2 = (byte) 65) || t > ((byte) 70))) {
                                throw m31292a0("\\u" + this.f23708d.mo94701G0(4));
                            }
                            i = (t - b2) + 10;
                        } else {
                            i = t - b;
                        }
                        c = (char) (c2 + i);
                    }
                    this.f23708d.skip(4);
                    return c;
                }
                throw new EOFException("Unterminated escape sequence at path " + mo23503z());
            } else if (readByte == 't') {
                return 9;
            } else {
                if (readByte == 'b') {
                    return 8;
                }
                if (readByte == 'n') {
                    return 10;
                }
                if (readByte == 'r') {
                    return 13;
                }
                if (readByte == 10 || readByte == '\'' || readByte == '\"' || readByte == '\\' || readByte == '/' || mo23500o()) {
                    return readByte;
                }
                throw m31292a0("Invalid escape sequence: \\" + readByte);
            }
        } else {
            throw m31292a0("Unterminated escape sequence");
        }
    }

    /* renamed from: y */
    private final void m31302y(C40681e eVar) {
        while (true) {
            long E = this.f23719o.mo94697E(eVar);
            if (E == -1) {
                throw m31292a0("Unterminated string");
            } else if (this.f23708d.mo94764t(E) == ((byte) 92)) {
                this.f23708d.skip(E + 1);
                m31301x();
            } else {
                this.f23708d.skip(E + 1);
                return;
            }
        }
    }

    /* renamed from: D */
    public C8336c.C8337a mo23490D() {
        boolean z;
        int i;
        Integer valueOf = Integer.valueOf(this.f23709e);
        if (valueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = m31293k();
        }
        switch (i) {
            case 1:
                return C8336c.C8337a.BEGIN_OBJECT;
            case 2:
                return C8336c.C8337a.END_OBJECT;
            case 3:
                return C8336c.C8337a.BEGIN_ARRAY;
            case 4:
                return C8336c.C8337a.END_ARRAY;
            case 5:
            case 6:
                return C8336c.C8337a.BOOLEAN;
            case 7:
                return C8336c.C8337a.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C8336c.C8337a.STRING;
            case 12:
            case 13:
            case 14:
                return C8336c.C8337a.NAME;
            case 15:
            case 16:
                return C8336c.C8337a.NUMBER;
            case 17:
                return C8336c.C8337a.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: E0 */
    public boolean mo23491E0() {
        boolean z;
        int i;
        Integer valueOf = Integer.valueOf(this.f23709e);
        if (valueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = m31293k();
        }
        if (i == 5) {
            this.f23709e = 0;
            int[] iArr = this.f23716l;
            int i2 = this.f23714j - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f23709e = 0;
            int[] iArr2 = this.f23716l;
            int i3 = this.f23714j - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + mo23490D() + " at path " + mo23503z());
        }
    }

    /* renamed from: I0 */
    public String mo23492I0() {
        boolean z;
        int i;
        Integer valueOf = Integer.valueOf(this.f23709e);
        if (valueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = m31293k();
        }
        if (i == 15) {
            str = String.valueOf(this.f23710f);
        } else if (i != 16) {
            switch (i) {
                case 8:
                    str = m31296s(f23703p);
                    break;
                case 9:
                    str = m31296s(f23704q);
                    break;
                case 10:
                    str = m31297t();
                    break;
                case 11:
                    String str2 = this.f23712h;
                    if (str2 != null) {
                        this.f23712h = null;
                        str = str2;
                        break;
                    }
                    break;
                default:
                    throw new JsonDataException("Expected a string but was " + mo23490D() + " at path " + mo23503z());
            }
        } else {
            str = this.f23708d.mo94701G0((long) this.f23711g);
        }
        this.f23709e = 0;
        int[] iArr = this.f23716l;
        int i2 = this.f23714j - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r7.f23709e = 0;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23493N() {
        /*
            r7 = this;
            boolean r0 = r7.mo23499n()
            if (r0 != 0) goto L_0x0075
            r0 = 0
            r1 = r0
        L_0x0008:
            int r2 = r7.f23709e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r2.intValue()
            r4 = 1
            if (r3 != 0) goto L_0x0017
            r3 = r4
            goto L_0x0018
        L_0x0017:
            r3 = r0
        L_0x0018:
            if (r3 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x0023
            int r2 = r2.intValue()
            goto L_0x0027
        L_0x0023:
            int r2 = r7.m31293k()
        L_0x0027:
            switch(r2) {
                case 1: goto L_0x0058;
                case 2: goto L_0x004f;
                case 3: goto L_0x004b;
                case 4: goto L_0x0044;
                case 5: goto L_0x002a;
                case 6: goto L_0x002a;
                case 7: goto L_0x002a;
                case 8: goto L_0x003e;
                case 9: goto L_0x0038;
                case 10: goto L_0x0034;
                case 11: goto L_0x002a;
                case 12: goto L_0x003e;
                case 13: goto L_0x0038;
                case 14: goto L_0x0034;
                case 15: goto L_0x002a;
                case 16: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x005e
        L_0x002b:
            dg1.b r2 = r7.f23708d
            int r3 = r7.f23711g
            long r5 = (long) r3
            r2.skip(r5)
            goto L_0x005e
        L_0x0034:
            r7.m31290U()
            goto L_0x005e
        L_0x0038:
            dg1.e r2 = f23704q
            r7.m31302y(r2)
            goto L_0x005e
        L_0x003e:
            dg1.e r2 = f23703p
            r7.m31302y(r2)
            goto L_0x005e
        L_0x0044:
            int r2 = r7.f23714j
            int r2 = r2 + -1
            r7.f23714j = r2
            goto L_0x0055
        L_0x004b:
            r7.m31300w(r4)
            goto L_0x005c
        L_0x004f:
            int r2 = r7.f23714j
            int r2 = r2 + -1
            r7.f23714j = r2
        L_0x0055:
            int r1 = r1 + -1
            goto L_0x005e
        L_0x0058:
            r2 = 3
            r7.m31300w(r2)
        L_0x005c:
            int r1 = r1 + 1
        L_0x005e:
            r7.f23709e = r0
            if (r1 != 0) goto L_0x0008
            int[] r0 = r7.f23716l
            int r1 = r7.f23714j
            int r2 = r1 + -1
            r3 = r0[r2]
            int r3 = r3 + r4
            r0[r2] = r3
            java.lang.String[] r0 = r7.f23715k
            int r1 = r1 - r4
            java.lang.String r2 = "null"
            r0[r1] = r2
            return
        L_0x0075:
            com.apollographql.apollo.api.internal.json.JsonDataException r0 = new com.apollographql.apollo.api.internal.json.JsonDataException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot skip unexpected "
            r1.append(r2)
            t2.c$a r2 = r7.mo23490D()
            r1.append(r2)
            java.lang.String r2 = " at "
            r1.append(r2)
            java.lang.String r2 = r7.mo23503z()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p256t2.C8332a.mo23493N():void");
    }

    /* renamed from: b0 */
    public String mo23494b0() {
        boolean z;
        int i;
        String str;
        Integer valueOf = Integer.valueOf(this.f23709e);
        if (valueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = m31293k();
        }
        switch (i) {
            case 12:
                str = m31296s(f23703p);
                break;
            case 13:
                str = m31296s(f23704q);
                break;
            case 14:
                str = m31297t();
                break;
            default:
                throw new JsonDataException("Expected a name but was " + mo23490D() + " at path " + mo23503z());
        }
        this.f23709e = 0;
        this.f23715k[this.f23714j - 1] = str;
        return str;
    }

    /* renamed from: c1 */
    public C8336c mo23495c1() {
        boolean z;
        int i;
        Integer valueOf = Integer.valueOf(this.f23709e);
        if (valueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = m31293k();
        }
        if (i == 2) {
            int i2 = this.f23714j - 1;
            this.f23714j = i2;
            this.f23715k[i2] = null;
            int[] iArr = this.f23716l;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f23709e = 0;
            return this;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + mo23490D() + " at path " + mo23503z());
    }

    public void close() {
        this.f23709e = 0;
        this.f23713i[0] = 8;
        this.f23714j = 1;
        this.f23708d.mo94724a();
        this.f23719o.close();
    }

    /* renamed from: d1 */
    public Object mo23497d1() {
        boolean z;
        int i;
        Integer valueOf = Integer.valueOf(this.f23709e);
        if (valueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = m31293k();
        }
        if (i == 7) {
            this.f23709e = 0;
            int[] iArr = this.f23716l;
            int i2 = this.f23714j - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + mo23490D() + " at path " + mo23503z());
    }

    public boolean hasNext() {
        Integer valueOf = Integer.valueOf(this.f23709e);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : m31293k();
        return (intValue == 2 || intValue == 4) ? false : true;
    }

    /* renamed from: n */
    public boolean mo23499n() {
        return this.f23718n;
    }

    /* renamed from: o */
    public boolean mo23500o() {
        return this.f23717m;
    }

    /* renamed from: v0 */
    public C8336c mo23501v0() {
        boolean z;
        int i;
        Integer valueOf = Integer.valueOf(this.f23709e);
        if (valueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = m31293k();
        }
        if (i == 1) {
            m31300w(3);
            this.f23709e = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + mo23490D() + " at path " + mo23503z());
    }

    /* renamed from: y0 */
    public C8336c mo23502y0() {
        boolean z;
        int i;
        Integer valueOf = Integer.valueOf(this.f23709e);
        if (valueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = m31293k();
        }
        if (i == 4) {
            int i2 = this.f23714j - 1;
            this.f23714j = i2;
            int[] iArr = this.f23716l;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f23709e = 0;
            return this;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + mo23490D() + " at path " + mo23503z());
    }

    /* renamed from: z */
    public String mo23503z() {
        return C8338d.f23735a.mo23506a(this.f23714j, this.f23713i, this.f23715k, this.f23716l);
    }

    /* renamed from: z0 */
    public C8336c mo23504z0() {
        boolean z;
        int i;
        Integer valueOf = Integer.valueOf(this.f23709e);
        if (valueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = m31293k();
        }
        if (i == 3) {
            m31300w(1);
            this.f23716l[this.f23714j - 1] = 0;
            this.f23709e = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + mo23490D() + " at path " + mo23503z());
    }
}
