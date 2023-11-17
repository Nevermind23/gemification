package p033c2;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40681e;
import java.io.EOFException;
import p033c2.C2224c;

/* renamed from: c2.e */
final class C2228e extends C2224c {

    /* renamed from: q */
    private static final C40681e f6907q = C40681e.m117696e("'\\");

    /* renamed from: r */
    private static final C40681e f6908r = C40681e.m117696e("\"\\");

    /* renamed from: s */
    private static final C40681e f6909s = C40681e.m117696e("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: t */
    private static final C40681e f6910t = C40681e.m117696e("\n\r");

    /* renamed from: u */
    private static final C40681e f6911u = C40681e.m117696e("*/");

    /* renamed from: k */
    private final C40679d f6912k;

    /* renamed from: l */
    private final C40672b f6913l;

    /* renamed from: m */
    private int f6914m = 0;

    /* renamed from: n */
    private long f6915n;

    /* renamed from: o */
    private int f6916o;

    /* renamed from: p */
    private String f6917p;

    C2228e(C40679d dVar) {
        if (dVar != null) {
            this.f6912k = dVar;
            this.f6913l = dVar.mo94704J();
            mo7159w(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: F0 */
    private void m8485F0() {
        long j;
        long E = this.f6912k.mo94697E(f6910t);
        C40672b bVar = this.f6913l;
        if (E != -1) {
            j = E + 1;
        } else {
            j = bVar.mo94709M0();
        }
        bVar.skip(j);
    }

    /* renamed from: G0 */
    private void m8486G0() {
        long E = this.f6912k.mo94697E(f6909s);
        C40672b bVar = this.f6913l;
        if (E == -1) {
            E = bVar.mo94709M0();
        }
        bVar.skip(E);
    }

    /* renamed from: U */
    private void m8487U() {
        if (!this.f6892h) {
            throw mo7149R("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: a0 */
    private int m8488a0() {
        int[] iArr = this.f6889e;
        int i = this.f6888d;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int h0 = m8491h0(true);
            this.f6913l.readByte();
            if (h0 != 44) {
                if (h0 == 59) {
                    m8487U();
                } else if (h0 == 93) {
                    this.f6914m = 4;
                    return 4;
                } else {
                    throw mo7149R("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5) {
                int h02 = m8491h0(true);
                this.f6913l.readByte();
                if (h02 != 44) {
                    if (h02 == 59) {
                        m8487U();
                    } else if (h02 == 125) {
                        this.f6914m = 2;
                        return 2;
                    } else {
                        throw mo7149R("Unterminated object");
                    }
                }
            }
            int h03 = m8491h0(true);
            if (h03 == 34) {
                this.f6913l.readByte();
                this.f6914m = 13;
                return 13;
            } else if (h03 == 39) {
                this.f6913l.readByte();
                m8487U();
                this.f6914m = 12;
                return 12;
            } else if (h03 != 125) {
                m8487U();
                if (m8490f0((char) h03)) {
                    this.f6914m = 14;
                    return 14;
                }
                throw mo7149R("Expected name");
            } else if (i2 != 5) {
                this.f6913l.readByte();
                this.f6914m = 2;
                return 2;
            } else {
                throw mo7149R("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int h04 = m8491h0(true);
            this.f6913l.readByte();
            if (h04 != 58) {
                if (h04 == 61) {
                    m8487U();
                    if (this.f6912k.mo94739l(1) && this.f6913l.mo94764t(0) == 62) {
                        this.f6913l.readByte();
                    }
                } else {
                    throw mo7149R("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (m8491h0(false) == -1) {
                this.f6914m = 18;
                return 18;
            }
            m8487U();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int h05 = m8491h0(true);
        if (h05 == 34) {
            this.f6913l.readByte();
            this.f6914m = 9;
            return 9;
        } else if (h05 != 39) {
            if (!(h05 == 44 || h05 == 59)) {
                if (h05 == 91) {
                    this.f6913l.readByte();
                    this.f6914m = 3;
                    return 3;
                } else if (h05 != 93) {
                    if (h05 != 123) {
                        int o0 = m8494o0();
                        if (o0 != 0) {
                            return o0;
                        }
                        int p0 = m8495p0();
                        if (p0 != 0) {
                            return p0;
                        }
                        if (m8490f0(this.f6913l.mo94764t(0))) {
                            m8487U();
                            this.f6914m = 10;
                            return 10;
                        }
                        throw mo7149R("Expected value");
                    }
                    this.f6913l.readByte();
                    this.f6914m = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f6913l.readByte();
                    this.f6914m = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m8487U();
                this.f6914m = 7;
                return 7;
            }
            throw mo7149R("Unexpected value");
        } else {
            m8487U();
            this.f6913l.readByte();
            this.f6914m = 8;
            return 8;
        }
    }

    /* renamed from: e0 */
    private int m8489e0(String str, C2224c.C2225a aVar) {
        int length = aVar.f6894a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f6894a[i])) {
                this.f6914m = 0;
                this.f6890f[this.f6888d - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f0 */
    private boolean m8490f0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m8487U();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f6913l.skip((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f6912k.mo94739l(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        m8487U();
        r3 = r6.f6913l.mo94764t(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f6913l.readByte();
        r6.f6913l.readByte();
        m8485F0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f6913l.readByte();
        r6.f6913l.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (m8498x0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw mo7149R("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        m8487U();
        m8485F0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m8491h0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            dg1.d r2 = r6.f6912k
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo94739l(r4)
            if (r2 == 0) goto L_0x0082
            dg1.b r2 = r6.f6913l
            long r4 = (long) r1
            byte r1 = r2.mo94764t(r4)
            r2 = 10
            if (r1 == r2) goto L_0x0080
            r2 = 32
            if (r1 == r2) goto L_0x0080
            r2 = 13
            if (r1 == r2) goto L_0x0080
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x0080
        L_0x0025:
            dg1.b r2 = r6.f6913l
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            dg1.d r3 = r6.f6912k
            r4 = 2
            boolean r3 = r3.mo94739l(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.m8487U()
            dg1.b r3 = r6.f6913l
            r4 = 1
            byte r3 = r3.mo94764t(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            dg1.b r1 = r6.f6913l
            r1.readByte()
            dg1.b r1 = r6.f6913l
            r1.readByte()
            r6.m8485F0()
            goto L_0x0001
        L_0x005c:
            dg1.b r1 = r6.f6913l
            r1.readByte()
            dg1.b r1 = r6.f6913l
            r1.readByte()
            boolean r1 = r6.m8498x0()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            c2.b r7 = r6.mo7149R(r7)
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.m8487U()
            r6.m8485F0()
            goto L_0x0001
        L_0x007f:
            return r1
        L_0x0080:
            r1 = r3
            goto L_0x0002
        L_0x0082:
            if (r7 != 0) goto L_0x0086
            r7 = -1
            return r7
        L_0x0086:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p033c2.C2228e.m8491h0(boolean):int");
    }

    /* renamed from: m0 */
    private String m8492m0(C40681e eVar) {
        StringBuilder sb = null;
        while (true) {
            long E = this.f6912k.mo94697E(eVar);
            if (E == -1) {
                throw mo7149R("Unterminated string");
            } else if (this.f6913l.mo94764t(E) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f6913l.mo94701G0(E));
                this.f6913l.readByte();
                sb.append(m8496q0());
            } else if (sb == null) {
                String G0 = this.f6913l.mo94701G0(E);
                this.f6913l.readByte();
                return G0;
            } else {
                sb.append(this.f6913l.mo94701G0(E));
                this.f6913l.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: n0 */
    private String m8493n0() {
        long E = this.f6912k.mo94697E(f6909s);
        if (E != -1) {
            return this.f6913l.mo94701G0(E);
        }
        return this.f6913l.mo94746o1();
    }

    /* renamed from: o0 */
    private int m8494o0() {
        int i;
        String str;
        String str2;
        byte t = this.f6913l.mo94764t(0);
        if (t == 116 || t == 84) {
            str2 = "true";
            str = "TRUE";
            i = 5;
        } else if (t == 102 || t == 70) {
            str2 = "false";
            str = "FALSE";
            i = 6;
        } else if (t != 110 && t != 78) {
            return 0;
        } else {
            str2 = "null";
            str = "NULL";
            i = 7;
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f6912k.mo94739l((long) i3)) {
                return 0;
            }
            byte t2 = this.f6913l.mo94764t((long) i2);
            if (t2 != str2.charAt(i2) && t2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f6912k.mo94739l((long) (length + 1)) && m8490f0(this.f6913l.mo94764t((long) length))) {
            return 0;
        }
        this.f6913l.skip((long) length);
        this.f6914m = i;
        return i;
    }

    /* renamed from: p0 */
    private int m8495p0() {
        byte t;
        char c;
        boolean z;
        boolean z2 = true;
        long j = 0;
        int i = 0;
        char c2 = 0;
        boolean z3 = false;
        boolean z4 = true;
        while (true) {
            int i2 = i + 1;
            if (!this.f6912k.mo94739l((long) i2)) {
                break;
            }
            t = this.f6913l.mo94764t((long) i);
            if (t == 43) {
                c = 6;
                if (c2 != 5) {
                    return 0;
                }
            } else if (t != 69 && t != 101) {
                if (t == 45) {
                    c = 6;
                    if (c2 == 0) {
                        c2 = 1;
                        z3 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (t != 46) {
                    if (t >= 48 && t <= 57) {
                        if (c2 == z2 || c2 == 0) {
                            j = (long) (-(t - 48));
                            c2 = 2;
                        } else if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (t - 48));
                            int i3 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                            if (i3 > 0 || (i3 == 0 && j2 < j)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z4 &= z;
                            j = j2;
                        } else if (c2 == 3) {
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            c2 = 7;
                        }
                    }
                } else if (c2 != 2) {
                    return 0;
                } else {
                    c2 = 3;
                }
                i = i2;
                z2 = true;
            } else if (c2 != 2 && c2 != 4) {
                return 0;
            } else {
                c2 = 5;
                i = i2;
                z2 = true;
            }
            c2 = c;
            i = i2;
            z2 = true;
        }
        if (m8490f0(t)) {
            return 0;
        }
        if (c2 == 2 && z4 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f6915n = j;
            this.f6913l.skip((long) i);
            this.f6914m = 16;
            return 16;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f6916o = i;
            this.f6914m = 17;
            return 17;
        }
    }

    /* renamed from: q0 */
    private char m8496q0() {
        int i;
        int i2;
        if (this.f6912k.mo94739l(1)) {
            byte readByte = this.f6913l.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f6892h) {
                    return (char) readByte;
                }
                throw mo7149R("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f6912k.mo94739l(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte t = this.f6913l.mo94764t((long) i3);
                    char c2 = (char) (c << 4);
                    if (t < 48 || t > 57) {
                        if (t >= 97 && t <= 102) {
                            i = t - 97;
                        } else if (t < 65 || t > 70) {
                            throw mo7149R("\\u" + this.f6913l.mo94701G0(4));
                        } else {
                            i = t - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = t - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f6913l.skip(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + mo7162z());
            }
        } else {
            throw mo7149R("Unterminated escape sequence");
        }
    }

    /* renamed from: s0 */
    private void m8497s0(C40681e eVar) {
        while (true) {
            long E = this.f6912k.mo94697E(eVar);
            if (E == -1) {
                throw mo7149R("Unterminated string");
            } else if (this.f6913l.mo94764t(E) == 92) {
                this.f6913l.skip(E + 1);
                m8496q0();
            } else {
                this.f6913l.skip(E + 1);
                return;
            }
        }
    }

    /* renamed from: x0 */
    private boolean m8498x0() {
        boolean z;
        long j;
        C40679d dVar = this.f6912k;
        C40681e eVar = f6911u;
        long v1 = dVar.mo94769v1(eVar);
        if (v1 != -1) {
            z = true;
        } else {
            z = false;
        }
        C40672b bVar = this.f6913l;
        if (z) {
            j = v1 + ((long) eVar.mo94793B());
        } else {
            j = bVar.mo94709M0();
        }
        bVar.skip(j);
        return z;
    }

    /* renamed from: E0 */
    public boolean mo7146E0() {
        int i = this.f6914m;
        if (i == 0) {
            i = m8488a0();
        }
        if (i == 5) {
            this.f6914m = 0;
            int[] iArr = this.f6891g;
            int i2 = this.f6888d - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f6914m = 0;
            int[] iArr2 = this.f6891g;
            int i3 = this.f6888d - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new C2222a("Expected a boolean but was " + mo7158v() + " at path " + mo7162z());
        }
    }

    /* renamed from: I0 */
    public String mo7147I0() {
        String str;
        int i = this.f6914m;
        if (i == 0) {
            i = m8488a0();
        }
        if (i == 10) {
            str = m8493n0();
        } else if (i == 9) {
            str = m8492m0(f6908r);
        } else if (i == 8) {
            str = m8492m0(f6907q);
        } else if (i == 11) {
            str = this.f6917p;
            this.f6917p = null;
        } else if (i == 16) {
            str = Long.toString(this.f6915n);
        } else if (i == 17) {
            str = this.f6913l.mo94701G0((long) this.f6916o);
        } else {
            throw new C2222a("Expected a string but was " + mo7158v() + " at path " + mo7162z());
        }
        this.f6914m = 0;
        int[] iArr = this.f6891g;
        int i2 = this.f6888d - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: N */
    public void mo7148N() {
        if (!this.f6893i) {
            int i = 0;
            do {
                int i2 = this.f6914m;
                if (i2 == 0) {
                    i2 = m8488a0();
                }
                if (i2 == 3) {
                    mo7159w(1);
                } else if (i2 == 1) {
                    mo7159w(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f6888d--;
                        } else {
                            throw new C2222a("Expected a value but was " + mo7158v() + " at path " + mo7162z());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f6888d--;
                        } else {
                            throw new C2222a("Expected a value but was " + mo7158v() + " at path " + mo7162z());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        m8486G0();
                    } else if (i2 == 9 || i2 == 13) {
                        m8497s0(f6908r);
                    } else if (i2 == 8 || i2 == 12) {
                        m8497s0(f6907q);
                    } else if (i2 == 17) {
                        this.f6913l.skip((long) this.f6916o);
                    } else if (i2 == 18) {
                        throw new C2222a("Expected a value but was " + mo7158v() + " at path " + mo7162z());
                    }
                    this.f6914m = 0;
                }
                i++;
                this.f6914m = 0;
            } while (i != 0);
            int[] iArr = this.f6891g;
            int i3 = this.f6888d;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f6890f[i3 - 1] = "null";
            return;
        }
        throw new C2222a("Cannot skip unexpected " + mo7158v() + " at " + mo7162z());
    }

    /* renamed from: b0 */
    public String mo7150b0() {
        String str;
        int i = this.f6914m;
        if (i == 0) {
            i = m8488a0();
        }
        if (i == 14) {
            str = m8493n0();
        } else if (i == 13) {
            str = m8492m0(f6908r);
        } else if (i == 12) {
            str = m8492m0(f6907q);
        } else if (i == 15) {
            str = this.f6917p;
        } else {
            throw new C2222a("Expected a name but was " + mo7158v() + " at path " + mo7162z());
        }
        this.f6914m = 0;
        this.f6890f[this.f6888d - 1] = str;
        return str;
    }

    public void close() {
        this.f6914m = 0;
        this.f6889e[0] = 8;
        this.f6888d = 1;
        this.f6913l.mo94724a();
        this.f6912k.close();
    }

    public boolean hasNext() {
        int i = this.f6914m;
        if (i == 0) {
            i = m8488a0();
        }
        if (i == 2 || i == 4 || i == 18) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void mo7152k() {
        int i = this.f6914m;
        if (i == 0) {
            i = m8488a0();
        }
        if (i == 3) {
            mo7159w(1);
            this.f6891g[this.f6888d - 1] = 0;
            this.f6914m = 0;
            return;
        }
        throw new C2222a("Expected BEGIN_ARRAY but was " + mo7158v() + " at path " + mo7162z());
    }

    /* renamed from: n */
    public void mo7153n() {
        int i = this.f6914m;
        if (i == 0) {
            i = m8488a0();
        }
        if (i == 1) {
            mo7159w(3);
            this.f6914m = 0;
            return;
        }
        throw new C2222a("Expected BEGIN_OBJECT but was " + mo7158v() + " at path " + mo7162z());
    }

    /* renamed from: o */
    public void mo7154o() {
        int i = this.f6914m;
        if (i == 0) {
            i = m8488a0();
        }
        if (i == 4) {
            int i2 = this.f6888d - 1;
            this.f6888d = i2;
            int[] iArr = this.f6891g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f6914m = 0;
            return;
        }
        throw new C2222a("Expected END_ARRAY but was " + mo7158v() + " at path " + mo7162z());
    }

    /* renamed from: q */
    public void mo7155q() {
        int i = this.f6914m;
        if (i == 0) {
            i = m8488a0();
        }
        if (i == 2) {
            int i2 = this.f6888d - 1;
            this.f6888d = i2;
            this.f6890f[i2] = null;
            int[] iArr = this.f6891g;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f6914m = 0;
            return;
        }
        throw new C2222a("Expected END_OBJECT but was " + mo7158v() + " at path " + mo7162z());
    }

    /* renamed from: s */
    public double mo7156s() {
        int i = this.f6914m;
        if (i == 0) {
            i = m8488a0();
        }
        if (i == 16) {
            this.f6914m = 0;
            int[] iArr = this.f6891g;
            int i2 = this.f6888d - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f6915n;
        }
        if (i == 17) {
            this.f6917p = this.f6913l.mo94701G0((long) this.f6916o);
        } else if (i == 9) {
            this.f6917p = m8492m0(f6908r);
        } else if (i == 8) {
            this.f6917p = m8492m0(f6907q);
        } else if (i == 10) {
            this.f6917p = m8493n0();
        } else if (i != 11) {
            throw new C2222a("Expected a double but was " + mo7158v() + " at path " + mo7162z());
        }
        this.f6914m = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6917p);
            if (this.f6892h || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f6917p = null;
                this.f6914m = 0;
                int[] iArr2 = this.f6891g;
                int i3 = this.f6888d - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new C2223b("JSON forbids NaN and infinities: " + parseDouble + " at path " + mo7162z());
        } catch (NumberFormatException unused) {
            throw new C2222a("Expected a double but was " + this.f6917p + " at path " + mo7162z());
        }
    }

    /* renamed from: t */
    public int mo7157t() {
        String str;
        int i = this.f6914m;
        if (i == 0) {
            i = m8488a0();
        }
        if (i == 16) {
            long j = this.f6915n;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f6914m = 0;
                int[] iArr = this.f6891g;
                int i3 = this.f6888d - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C2222a("Expected an int but was " + this.f6915n + " at path " + mo7162z());
        }
        if (i == 17) {
            this.f6917p = this.f6913l.mo94701G0((long) this.f6916o);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m8492m0(f6908r);
            } else {
                str = m8492m0(f6907q);
            }
            this.f6917p = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f6914m = 0;
                int[] iArr2 = this.f6891g;
                int i4 = this.f6888d - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C2222a("Expected an int but was " + mo7158v() + " at path " + mo7162z());
        }
        this.f6914m = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6917p);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f6917p = null;
                this.f6914m = 0;
                int[] iArr3 = this.f6891g;
                int i6 = this.f6888d - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C2222a("Expected an int but was " + this.f6917p + " at path " + mo7162z());
        } catch (NumberFormatException unused2) {
            throw new C2222a("Expected an int but was " + this.f6917p + " at path " + mo7162z());
        }
    }

    public String toString() {
        return "JsonReader(" + this.f6912k + ")";
    }

    /* renamed from: v */
    public C2224c.C2226b mo7158v() {
        int i = this.f6914m;
        if (i == 0) {
            i = m8488a0();
        }
        switch (i) {
            case 1:
                return C2224c.C2226b.BEGIN_OBJECT;
            case 2:
                return C2224c.C2226b.END_OBJECT;
            case 3:
                return C2224c.C2226b.BEGIN_ARRAY;
            case 4:
                return C2224c.C2226b.END_ARRAY;
            case 5:
            case 6:
                return C2224c.C2226b.BOOLEAN;
            case 7:
                return C2224c.C2226b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C2224c.C2226b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return C2224c.C2226b.NAME;
            case 16:
            case 17:
                return C2224c.C2226b.NUMBER;
            case 18:
                return C2224c.C2226b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: x */
    public int mo7160x(C2224c.C2225a aVar) {
        int i = this.f6914m;
        if (i == 0) {
            i = m8488a0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m8489e0(this.f6917p, aVar);
        }
        int S0 = this.f6912k.mo94716S0(aVar.f6895b);
        if (S0 != -1) {
            this.f6914m = 0;
            this.f6890f[this.f6888d - 1] = aVar.f6894a[S0];
            return S0;
        }
        String str = this.f6890f[this.f6888d - 1];
        String b0 = mo7150b0();
        int e0 = m8489e0(b0, aVar);
        if (e0 == -1) {
            this.f6914m = 15;
            this.f6917p = b0;
            this.f6890f[this.f6888d - 1] = str;
        }
        return e0;
    }

    /* renamed from: y */
    public void mo7161y() {
        if (!this.f6893i) {
            int i = this.f6914m;
            if (i == 0) {
                i = m8488a0();
            }
            if (i == 14) {
                m8486G0();
            } else if (i == 13) {
                m8497s0(f6908r);
            } else if (i == 12) {
                m8497s0(f6907q);
            } else if (i != 15) {
                throw new C2222a("Expected a name but was " + mo7158v() + " at path " + mo7162z());
            }
            this.f6914m = 0;
            this.f6890f[this.f6888d - 1] = "null";
            return;
        }
        throw new C2222a("Cannot skip unexpected " + mo7158v() + " at " + mo7162z());
    }
}
