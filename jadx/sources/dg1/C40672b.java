package dg1;

import cf1.C40407d;
import eg1.C40890a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p975ui.views.widgets.deprecated.BogTextInputET;

/* renamed from: dg1.b */
public final class C40672b implements C40679d, C40677c, Cloneable, ByteChannel {

    /* renamed from: d */
    public C40701u f96314d;

    /* renamed from: e */
    private long f96315e;

    /* renamed from: dg1.b$a */
    public static final class C40673a implements Closeable {

        /* renamed from: d */
        public C40672b f96316d;

        /* renamed from: e */
        public boolean f96317e;

        /* renamed from: f */
        private C40701u f96318f;

        /* renamed from: g */
        public long f96319g = -1;

        /* renamed from: h */
        public byte[] f96320h;

        /* renamed from: i */
        public int f96321i = -1;

        /* renamed from: j */
        public int f96322j = -1;

        /* renamed from: a */
        public final C40701u mo94776a() {
            return this.f96318f;
        }

        public void close() {
            boolean z;
            if (this.f96316d != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f96316d = null;
                mo94781p((C40701u) null);
                this.f96319g = -1;
                this.f96320h = null;
                this.f96321i = -1;
                this.f96322j = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: k */
        public final int mo94778k() {
            boolean z;
            long j;
            long j2 = this.f96319g;
            C40672b bVar = this.f96316d;
            C41536l.m120486f(bVar);
            if (j2 != bVar.mo94709M0()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long j3 = this.f96319g;
                if (j3 == -1) {
                    j = 0;
                } else {
                    j = j3 + ((long) (this.f96322j - this.f96321i));
                }
                return mo94780o(j);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        /* renamed from: m */
        public final long mo94779m(long j) {
            boolean z;
            long j2 = j;
            C40672b bVar = this.f96316d;
            if (bVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (this.f96317e) {
                long M0 = bVar.mo94709M0();
                int i = (j2 > M0 ? 1 : (j2 == M0 ? 0 : -1));
                int i2 = 1;
                if (i <= 0) {
                    if (j2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        long j3 = M0 - j2;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            C40701u uVar = bVar.f96314d;
                            C41536l.m120486f(uVar);
                            C40701u uVar2 = uVar.f96377g;
                            C41536l.m120486f(uVar2);
                            int i3 = uVar2.f96373c;
                            long j4 = (long) (i3 - uVar2.f96372b);
                            if (j4 > j3) {
                                uVar2.f96373c = i3 - ((int) j3);
                                break;
                            }
                            bVar.f96314d = uVar2.mo94861b();
                            C40703v.m117851b(uVar2);
                            j3 -= j4;
                        }
                        mo94781p((C40701u) null);
                        this.f96319g = j2;
                        this.f96320h = null;
                        this.f96321i = -1;
                        this.f96322j = -1;
                    } else {
                        throw new IllegalArgumentException(C41536l.m120497q("newSize < 0: ", Long.valueOf(j)).toString());
                    }
                } else if (i > 0) {
                    long j5 = j2 - M0;
                    boolean z2 = true;
                    while (j5 > 0) {
                        C40701u W0 = bVar.mo94722W0(i2);
                        int min = (int) Math.min(j5, (long) (8192 - W0.f96373c));
                        W0.f96373c += min;
                        j5 -= (long) min;
                        if (z2) {
                            mo94781p(W0);
                            this.f96319g = M0;
                            this.f96320h = W0.f96371a;
                            int i4 = W0.f96373c;
                            this.f96321i = i4 - min;
                            this.f96322j = i4;
                            z2 = false;
                        }
                        i2 = 1;
                    }
                }
                bVar.mo94706K0(j2);
                return M0;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
        }

        /* renamed from: o */
        public final int mo94780o(long j) {
            C40701u uVar;
            C40672b bVar = this.f96316d;
            if (bVar != null) {
                int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
                if (i < 0 || j > bVar.mo94709M0()) {
                    throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + bVar.mo94709M0());
                } else if (i == 0 || j == bVar.mo94709M0()) {
                    mo94781p((C40701u) null);
                    this.f96319g = j;
                    this.f96320h = null;
                    this.f96321i = -1;
                    this.f96322j = -1;
                    return -1;
                } else {
                    long M0 = bVar.mo94709M0();
                    C40701u uVar2 = bVar.f96314d;
                    long j2 = 0;
                    if (mo94776a() != null) {
                        long j3 = this.f96319g;
                        int i2 = this.f96321i;
                        C40701u a = mo94776a();
                        C41536l.m120486f(a);
                        long j4 = j3 - ((long) (i2 - a.f96372b));
                        if (j4 > j) {
                            uVar = uVar2;
                            uVar2 = mo94776a();
                            M0 = j4;
                        } else {
                            uVar = mo94776a();
                            j2 = j4;
                        }
                    } else {
                        uVar = uVar2;
                    }
                    if (M0 - j > j - j2) {
                        while (true) {
                            C41536l.m120486f(uVar);
                            int i3 = uVar.f96373c;
                            int i4 = uVar.f96372b;
                            if (j < ((long) (i3 - i4)) + j2) {
                                break;
                            }
                            j2 += (long) (i3 - i4);
                            uVar = uVar.f96376f;
                        }
                    } else {
                        while (M0 > j) {
                            C41536l.m120486f(uVar2);
                            uVar2 = uVar2.f96377g;
                            C41536l.m120486f(uVar2);
                            M0 -= (long) (uVar2.f96373c - uVar2.f96372b);
                        }
                        j2 = M0;
                        uVar = uVar2;
                    }
                    if (this.f96317e) {
                        C41536l.m120486f(uVar);
                        if (uVar.f96374d) {
                            C40701u f = uVar.mo94865f();
                            if (bVar.f96314d == uVar) {
                                bVar.f96314d = f;
                            }
                            uVar = uVar.mo94862c(f);
                            C40701u uVar3 = uVar.f96377g;
                            C41536l.m120486f(uVar3);
                            uVar3.mo94861b();
                        }
                    }
                    mo94781p(uVar);
                    this.f96319g = j;
                    C41536l.m120486f(uVar);
                    this.f96320h = uVar.f96371a;
                    int i5 = uVar.f96372b + ((int) (j - j2));
                    this.f96321i = i5;
                    int i6 = uVar.f96373c;
                    this.f96322j = i6;
                    return i6 - i5;
                }
            } else {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
        }

        /* renamed from: p */
        public final void mo94781p(C40701u uVar) {
            this.f96318f = uVar;
        }
    }

    /* renamed from: dg1.b$c */
    public static final class C40675c extends OutputStream {

        /* renamed from: d */
        final /* synthetic */ C40672b f96324d;

        C40675c(C40672b bVar) {
            this.f96324d = bVar;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return this.f96324d + ".outputStream()";
        }

        public void write(int i) {
            this.f96324d.mo94715R0(i);
        }

        public void write(byte[] bArr, int i, int i2) {
            C41536l.m120489i(bArr, "data");
            this.f96324d.mo94730e1(bArr, i, i2);
        }
    }

    /* renamed from: m0 */
    public static /* synthetic */ C40673a m117576m0(C40672b bVar, C40673a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = C40683e0.m117730c();
        }
        return bVar.mo94732h0(aVar);
    }

    /* renamed from: B */
    public C40672b mo94690B() {
        return this;
    }

    /* renamed from: B0 */
    public void mo94691B0(long j) {
        if (this.f96315e < j) {
            throw new EOFException();
        }
    }

    /* renamed from: B1 */
    public C40672b mo94728d0(String str) {
        C41536l.m120489i(str, "string");
        return mo94740l0(str, 0, str.length());
    }

    /* renamed from: C */
    public C40669a0 mo94678C() {
        return C40669a0.f96310e;
    }

    /* renamed from: C1 */
    public long mo94694C1(C40705x xVar) {
        C41536l.m120489i(xVar, "sink");
        long M0 = mo94709M0();
        if (M0 > 0) {
            xVar.mo21301x1(this, M0);
        }
        return M0;
    }

    /* renamed from: D */
    public C40679d mo94695D() {
        return C40691m.m117770b(new C40697r(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r8 != r9) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        r14.f96314d = r6.mo94861b();
        dg1.C40703v.m117851b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        r6.f96372b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r1 != false) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0074 A[SYNTHETIC] */
    /* renamed from: D1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo94696D1() {
        /*
            r14 = this;
            long r0 = r14.mo94709M0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a2
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000d:
            dg1.u r6 = r14.f96314d
            kotlin.jvm.internal.C41536l.m120486f(r6)
            byte[] r7 = r6.f96371a
            int r8 = r6.f96372b
            int r9 = r6.f96373c
        L_0x0018:
            if (r8 >= r9) goto L_0x0084
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0029
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0029
            int r11 = r10 - r11
            goto L_0x0043
        L_0x0029:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0038
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0038
        L_0x0033:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0043
        L_0x0038:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0070
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0070
            goto L_0x0033
        L_0x0043:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0053
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0053:
            dg1.b r0 = new dg1.b
            r0.<init>()
            dg1.b r0 = r0.mo94733h1(r4)
            dg1.b r0 = r0.mo94715R0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r0.mo94746o1()
            java.lang.String r0 = kotlin.jvm.internal.C41536l.m120497q(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x0070:
            if (r0 == 0) goto L_0x0074
            r1 = 1
            goto L_0x0084
        L_0x0074:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r2 = dg1.C40683e0.m117735h(r10)
            java.lang.String r1 = kotlin.jvm.internal.C41536l.m120497q(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0084:
            if (r8 != r9) goto L_0x0090
            dg1.u r7 = r6.mo94861b()
            r14.f96314d = r7
            dg1.C40703v.m117851b(r6)
            goto L_0x0092
        L_0x0090:
            r6.f96372b = r8
        L_0x0092:
            if (r1 != 0) goto L_0x0098
            dg1.u r6 = r14.f96314d
            if (r6 != 0) goto L_0x000d
        L_0x0098:
            long r1 = r14.mo94709M0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.mo94706K0(r1)
            return r4
        L_0x00a2:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dg1.C40672b.mo94696D1():long");
    }

    /* renamed from: E */
    public long mo94697E(C40681e eVar) {
        C41536l.m120489i(eVar, "targetBytes");
        return mo94713Q(eVar, 0);
    }

    /* renamed from: E1 */
    public InputStream mo94698E1() {
        return new C40674b(this);
    }

    /* renamed from: F0 */
    public String mo94699F0(Charset charset) {
        C41536l.m120489i(charset, "charset");
        return mo94772x0(this.f96315e, charset);
    }

    /* renamed from: F1 */
    public C40672b mo94740l0(String str, int i, int i2) {
        char charAt;
        C41536l.m120489i(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            C40701u W0 = mo94722W0(1);
                            byte[] bArr = W0.f96371a;
                            int i3 = W0.f96373c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    int i5 = W0.f96373c;
                                    int i6 = (i3 + i) - i5;
                                    W0.f96373c = i5 + i6;
                                    mo94706K0(mo94709M0() + ((long) i6));
                                } else {
                                    i4 = i + 1;
                                    bArr[i + i3] = (byte) charAt;
                                }
                            }
                            int i52 = W0.f96373c;
                            int i62 = (i3 + i) - i52;
                            W0.f96373c = i52 + i62;
                            mo94706K0(mo94709M0() + ((long) i62));
                        } else {
                            if (charAt2 < 2048) {
                                C40701u W02 = mo94722W0(2);
                                byte[] bArr2 = W02.f96371a;
                                int i7 = W02.f96373c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                W02.f96373c = i7 + 2;
                                mo94706K0(mo94709M0() + 2);
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                C40701u W03 = mo94722W0(3);
                                byte[] bArr3 = W03.f96371a;
                                int i8 = W03.f96373c;
                                bArr3[i8] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                                W03.f96373c = i8 + 3;
                                mo94706K0(mo94709M0() + 3);
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt2 <= 56319) {
                                    if (56320 <= charAt3 && charAt3 <= 57343) {
                                        int i12 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 0;
                                        C40701u W04 = mo94722W0(4);
                                        byte[] bArr4 = W04.f96371a;
                                        int i13 = W04.f96373c;
                                        bArr4[i13] = (byte) ((i12 >> 18) | 240);
                                        bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                                        bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                                        bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                                        W04.f96373c = i13 + 4;
                                        mo94706K0(mo94709M0() + 4);
                                        i += 2;
                                    }
                                }
                                mo94715R0(63);
                                i = i9;
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(C41536l.m120497q("beginIndex < 0: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: G0 */
    public String mo94701G0(long j) {
        return mo94772x0(j, C40407d.f95989b);
    }

    /* renamed from: G1 */
    public C40672b mo94702G1(int i) {
        if (i < 128) {
            mo94715R0(i);
        } else if (i < 2048) {
            C40701u W0 = mo94722W0(2);
            byte[] bArr = W0.f96371a;
            int i2 = W0.f96373c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            W0.f96373c = i2 + 2;
            mo94706K0(mo94709M0() + 2);
        } else {
            boolean z = false;
            if (55296 <= i && i <= 57343) {
                z = true;
            }
            if (z) {
                mo94715R0(63);
            } else if (i < 65536) {
                C40701u W02 = mo94722W0(3);
                byte[] bArr2 = W02.f96371a;
                int i3 = W02.f96373c;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                W02.f96373c = i3 + 3;
                mo94706K0(mo94709M0() + 3);
            } else if (i <= 1114111) {
                C40701u W03 = mo94722W0(4);
                byte[] bArr3 = W03.f96371a;
                int i4 = W03.f96373c;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                W03.f96373c = i4 + 4;
                mo94706K0(mo94709M0() + 4);
            } else {
                throw new IllegalArgumentException(C41536l.m120497q("Unexpected code point: 0x", C40683e0.m117736i(i)));
            }
        }
        return this;
    }

    /* renamed from: H0 */
    public int mo94703H0() {
        byte b;
        int i;
        byte b2;
        if (mo94709M0() != 0) {
            byte t = mo94764t(0);
            boolean z = false;
            if ((t & 128) == 0) {
                b2 = t & Byte.MAX_VALUE;
                b = 0;
                i = 1;
            } else if ((t & 224) == 192) {
                b2 = t & 31;
                i = 2;
                b = 128;
            } else if ((t & 240) == 224) {
                b2 = t & 15;
                i = 3;
                b = 2048;
            } else if ((t & 248) == 240) {
                b2 = t & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (mo94709M0() >= j) {
                if (1 < i) {
                    int i2 = 1;
                    while (true) {
                        int i3 = i2 + 1;
                        long j2 = (long) i2;
                        byte t2 = mo94764t(j2);
                        if ((t2 & 192) == 128) {
                            b2 = (b2 << 6) | (t2 & 63);
                            if (i3 >= i) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            skip(j2);
                            return 65533;
                        }
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if (55296 <= b2 && b2 <= 57343) {
                    z = true;
                }
                if (!z && b2 >= b) {
                    return b2;
                }
                return 65533;
            }
            throw new EOFException("size < " + i + ": " + mo94709M0() + " (to read code point prefixed 0x" + C40683e0.m117735h(t) + ')');
        }
        throw new EOFException();
    }

    /* renamed from: J */
    public C40672b mo94704J() {
        return this;
    }

    /* renamed from: J0 */
    public C40681e mo94705J0(long j) {
        boolean z;
        if (j < 0 || j > 2147483647L) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(C41536l.m120497q("byteCount: ", Long.valueOf(j)).toString());
        } else if (mo94709M0() < j) {
            throw new EOFException();
        } else if (j < 4096) {
            return new C40681e(mo94765t0(j));
        } else {
            C40681e V0 = mo94720V0((int) j);
            skip(j);
            return V0;
        }
    }

    /* renamed from: K0 */
    public final void mo94706K0(long j) {
        this.f96315e = j;
    }

    /* renamed from: M0 */
    public final long mo94709M0() {
        return this.f96315e;
    }

    /* renamed from: O0 */
    public final C40681e mo94710O0() {
        boolean z;
        if (mo94709M0() <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo94720V0((int) mo94709M0());
        }
        throw new IllegalStateException(C41536l.m120497q("size > Int.MAX_VALUE: ", Long.valueOf(mo94709M0())).toString());
    }

    /* renamed from: P0 */
    public byte[] mo94712P0() {
        return mo94765t0(mo94709M0());
    }

    /* renamed from: Q */
    public long mo94713Q(C40681e eVar, long j) {
        boolean z;
        long j2;
        int i;
        int i2;
        int i3;
        C41536l.m120489i(eVar, "targetBytes");
        long j3 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C40701u uVar = this.f96314d;
            if (uVar == null) {
                return -1;
            }
            if (mo94709M0() - j < j) {
                j2 = mo94709M0();
                while (j2 > j) {
                    uVar = uVar.f96377g;
                    C41536l.m120486f(uVar);
                    j2 -= (long) (uVar.f96373c - uVar.f96372b);
                }
                if (eVar.mo94793B() == 2) {
                    byte f = eVar.mo94804f(0);
                    byte f2 = eVar.mo94804f(1);
                    while (j2 < mo94709M0()) {
                        byte[] bArr = uVar.f96371a;
                        i2 = (int) ((((long) uVar.f96372b) + j) - j2);
                        int i4 = uVar.f96373c;
                        while (i2 < i4) {
                            byte b = bArr[i2];
                            if (!(b == f || b == f2)) {
                                i2++;
                            }
                        }
                        j2 += (long) (uVar.f96373c - uVar.f96372b);
                        uVar = uVar.f96376f;
                        C41536l.m120486f(uVar);
                        j = j2;
                    }
                    return -1;
                }
                byte[] q = eVar.mo94811q();
                while (j2 < mo94709M0()) {
                    byte[] bArr2 = uVar.f96371a;
                    i = (int) ((((long) uVar.f96372b) + j) - j2);
                    int i5 = uVar.f96373c;
                    while (i < i5) {
                        byte b2 = bArr2[i];
                        int length = q.length;
                        int i6 = 0;
                        while (i6 < length) {
                            byte b3 = q[i6];
                            i6++;
                            if (b2 == b3) {
                                i3 = uVar.f96372b;
                                return ((long) (i2 - i3)) + j2;
                            }
                        }
                        i++;
                    }
                    j2 += (long) (uVar.f96373c - uVar.f96372b);
                    uVar = uVar.f96376f;
                    C41536l.m120486f(uVar);
                    j = j2;
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (uVar.f96373c - uVar.f96372b)) + j3;
                if (j4 > j) {
                    break;
                }
                uVar = uVar.f96376f;
                C41536l.m120486f(uVar);
                j3 = j4;
            }
            if (eVar.mo94793B() == 2) {
                byte f3 = eVar.mo94804f(0);
                byte f4 = eVar.mo94804f(1);
                while (j2 < mo94709M0()) {
                    byte[] bArr3 = uVar.f96371a;
                    int i7 = (int) ((((long) uVar.f96372b) + j) - j2);
                    int i8 = uVar.f96373c;
                    while (i2 < i8) {
                        byte b4 = bArr3[i2];
                        if (!(b4 == f3 || b4 == f4)) {
                            i7 = i2 + 1;
                        }
                    }
                    j3 = j2 + ((long) (uVar.f96373c - uVar.f96372b));
                    uVar = uVar.f96376f;
                    C41536l.m120486f(uVar);
                    j = j3;
                }
                return -1;
            }
            byte[] q2 = eVar.mo94811q();
            while (j2 < mo94709M0()) {
                byte[] bArr4 = uVar.f96371a;
                int i9 = (int) ((((long) uVar.f96372b) + j) - j2);
                int i12 = uVar.f96373c;
                while (i < i12) {
                    byte b5 = bArr4[i];
                    int length2 = q2.length;
                    int i13 = 0;
                    while (i13 < length2) {
                        byte b6 = q2[i13];
                        i13++;
                        if (b5 == b6) {
                            i3 = uVar.f96372b;
                            return ((long) (i2 - i3)) + j2;
                        }
                    }
                    i9 = i + 1;
                }
                j3 = j2 + ((long) (uVar.f96373c - uVar.f96372b));
                uVar = uVar.f96376f;
                C41536l.m120486f(uVar);
                j = j3;
            }
            return -1;
            i3 = uVar.f96372b;
            return ((long) (i2 - i3)) + j2;
        }
        throw new IllegalArgumentException(C41536l.m120497q("fromIndex < 0: ", Long.valueOf(j)).toString());
    }

    /* renamed from: Q0 */
    public boolean mo94714Q0() {
        return this.f96315e == 0;
    }

    /* renamed from: S0 */
    public int mo94716S0(C40694p pVar) {
        C41536l.m120489i(pVar, "options");
        int f = C40890a.m118624f(this, pVar, false, 2, (Object) null);
        if (f == -1) {
            return -1;
        }
        skip((long) pVar.mo94837j()[f].mo94793B());
        return f;
    }

    /* renamed from: U */
    public OutputStream mo94718U() {
        return new C40675c(this);
    }

    /* renamed from: V0 */
    public final C40681e mo94720V0(int i) {
        if (i == 0) {
            return C40681e.f96328h;
        }
        C40683e0.m117729b(mo94709M0(), 0, (long) i);
        C40701u uVar = this.f96314d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C41536l.m120486f(uVar);
            int i5 = uVar.f96373c;
            int i6 = uVar.f96372b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                uVar = uVar.f96376f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        C40701u uVar2 = this.f96314d;
        int i7 = 0;
        while (i2 < i) {
            C41536l.m120486f(uVar2);
            bArr[i7] = uVar2.f96371a;
            i2 += uVar2.f96373c - uVar2.f96372b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = uVar2.f96372b;
            uVar2.f96374d = true;
            i7++;
            uVar2 = uVar2.f96376f;
        }
        return new C40704w(bArr, iArr);
    }

    /* renamed from: W */
    public String mo94721W(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long u = mo94768u(b, 0, j2);
            if (u != -1) {
                return C40890a.m118622d(this, u);
            }
            if (j2 < mo94709M0() && mo94764t(j2 - 1) == ((byte) 13) && mo94764t(j2) == b) {
                return C40890a.m118622d(this, j2);
            }
            C40672b bVar = new C40672b();
            mo94747p(bVar, 0, Math.min((long) 32, mo94709M0()));
            throw new EOFException("\\n not found: limit=" + Math.min(mo94709M0(), j) + " content=" + bVar.mo94743n0().mo94810o() + BogTextInputET.emptyChar);
        }
        throw new IllegalArgumentException(C41536l.m120497q("limit < 0: ", Long.valueOf(j)).toString());
    }

    /* renamed from: W0 */
    public final C40701u mo94722W0(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C40701u uVar = this.f96314d;
            if (uVar == null) {
                C40701u c = C40703v.m117852c();
                this.f96314d = c;
                c.f96377g = c;
                c.f96376f = c;
                return c;
            }
            C41536l.m120486f(uVar);
            C40701u uVar2 = uVar.f96377g;
            C41536l.m120486f(uVar2);
            if (uVar2.f96373c + i > 8192 || !uVar2.f96375e) {
                return uVar2.mo94862c(C40703v.m117852c());
            }
            return uVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* renamed from: Y0 */
    public C40672b mo94717T(C40681e eVar) {
        C41536l.m120489i(eVar, "byteString");
        eVar.mo94798G(this, 0, eVar.mo94793B());
        return this;
    }

    /* renamed from: a */
    public final void mo94724a() {
        skip(mo94709M0());
    }

    /* renamed from: a0 */
    public boolean mo94725a0(long j, C40681e eVar) {
        C41536l.m120489i(eVar, "bytes");
        return mo94729e0(j, eVar, 0, eVar.mo94793B());
    }

    /* renamed from: a1 */
    public C40672b mo94770w0(byte[] bArr) {
        C41536l.m120489i(bArr, "source");
        return mo94730e1(bArr, 0, bArr.length);
    }

    public void close() {
    }

    /* renamed from: e0 */
    public boolean mo94729e0(long j, C40681e eVar, int i, int i2) {
        C41536l.m120489i(eVar, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || mo94709M0() - j < ((long) i2) || eVar.mo94793B() - i < i2) {
            return false;
        }
        if (i2 > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (mo94764t(((long) i3) + j) != eVar.mo94804f(i3 + i)) {
                    return false;
                }
                if (i4 >= i2) {
                    break;
                }
                i3 = i4;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L_0x0009
            goto L_0x008a
        L_0x0009:
            boolean r3 = r1 instanceof dg1.C40672b
            r4 = 0
            if (r3 != 0) goto L_0x0011
        L_0x000e:
            r2 = r4
            goto L_0x008a
        L_0x0011:
            long r5 = r18.mo94709M0()
            dg1.b r1 = (dg1.C40672b) r1
            long r7 = r1.mo94709M0()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0020
            goto L_0x000e
        L_0x0020:
            long r5 = r18.mo94709M0()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002b
            goto L_0x008a
        L_0x002b:
            dg1.u r3 = r0.f96314d
            kotlin.jvm.internal.C41536l.m120486f(r3)
            dg1.u r1 = r1.f96314d
            kotlin.jvm.internal.C41536l.m120486f(r1)
            int r5 = r3.f96372b
            int r6 = r1.f96372b
            r9 = r7
        L_0x003a:
            long r11 = r18.mo94709M0()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x008a
            int r11 = r3.f96373c
            int r11 = r11 - r5
            int r12 = r1.f96373c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0072
            r13 = r7
        L_0x0052:
            r15 = 1
            long r13 = r13 + r15
            byte[] r15 = r3.f96371a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f96371a
            int r17 = r6 + 1
            byte r6 = r15[r6]
            if (r5 == r6) goto L_0x0064
            goto L_0x000e
        L_0x0064:
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 < 0) goto L_0x006d
            r5 = r16
            r6 = r17
            goto L_0x0072
        L_0x006d:
            r5 = r16
            r6 = r17
            goto L_0x0052
        L_0x0072:
            int r13 = r3.f96373c
            if (r5 != r13) goto L_0x007d
            dg1.u r3 = r3.f96376f
            kotlin.jvm.internal.C41536l.m120486f(r3)
            int r5 = r3.f96372b
        L_0x007d:
            int r13 = r1.f96373c
            if (r6 != r13) goto L_0x0088
            dg1.u r1 = r1.f96376f
            kotlin.jvm.internal.C41536l.m120486f(r1)
            int r6 = r1.f96372b
        L_0x0088:
            long r9 = r9 + r11
            goto L_0x003a
        L_0x008a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dg1.C40672b.equals(java.lang.Object):boolean");
    }

    public void flush() {
    }

    /* renamed from: g */
    public long mo21305g(C40672b bVar, long j) {
        boolean z;
        C41536l.m120489i(bVar, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C41536l.m120497q("byteCount < 0: ", Long.valueOf(j)).toString());
        } else if (mo94709M0() == 0) {
            return -1;
        } else {
            if (j > mo94709M0()) {
                j = mo94709M0();
            }
            bVar.mo21301x1(this, j);
            return j;
        }
    }

    /* renamed from: h0 */
    public final C40673a mo94732h0(C40673a aVar) {
        C41536l.m120489i(aVar, "unsafeCursor");
        return C40890a.m118619a(this, aVar);
    }

    public int hashCode() {
        C40701u uVar = this.f96314d;
        if (uVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = uVar.f96373c;
            for (int i3 = uVar.f96372b; i3 < i2; i3++) {
                i = (i * 31) + uVar.f96371a[i3];
            }
            uVar = uVar.f96376f;
            C41536l.m120486f(uVar);
        } while (uVar != this.f96314d);
        return i;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j0 */
    public void mo94736j0(C40672b bVar, long j) {
        C41536l.m120489i(bVar, "sink");
        if (mo94709M0() >= j) {
            bVar.mo21301x1(this, j);
        } else {
            bVar.mo21301x1(this, mo94709M0());
            throw new EOFException();
        }
    }

    /* renamed from: k */
    public C40672b clone() {
        return mo94744o();
    }

    /* renamed from: k1 */
    public C40672b mo94730e1(byte[] bArr, int i, int i2) {
        C41536l.m120489i(bArr, "source");
        long j = (long) i2;
        C40683e0.m117729b((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C40701u W0 = mo94722W0(1);
            int min = Math.min(i3 - i, 8192 - W0.f96373c);
            int i4 = i + min;
            byte[] unused = C41331l.m119760d(bArr, W0.f96371a, W0.f96373c, i, i4);
            W0.f96373c += min;
            i = i4;
        }
        mo94706K0(mo94709M0() + j);
        return this;
    }

    /* renamed from: l */
    public boolean mo94739l(long j) {
        return this.f96315e >= j;
    }

    /* renamed from: l1 */
    public long mo94741l1(C40707z zVar) {
        C41536l.m120489i(zVar, "source");
        long j = 0;
        while (true) {
            long g = zVar.mo21305g(this, 8192);
            if (g == -1) {
                return j;
            }
            j += g;
        }
    }

    /* renamed from: n */
    public final long mo94742n() {
        long M0 = mo94709M0();
        if (M0 == 0) {
            return 0;
        }
        C40701u uVar = this.f96314d;
        C41536l.m120486f(uVar);
        C40701u uVar2 = uVar.f96377g;
        C41536l.m120486f(uVar2);
        int i = uVar2.f96373c;
        if (i < 8192 && uVar2.f96375e) {
            M0 -= (long) (i - uVar2.f96372b);
        }
        return M0;
    }

    /* renamed from: n0 */
    public C40681e mo94743n0() {
        return mo94705J0(mo94709M0());
    }

    /* renamed from: o */
    public final C40672b mo94744o() {
        C40672b bVar = new C40672b();
        if (mo94709M0() != 0) {
            C40701u uVar = this.f96314d;
            C41536l.m120486f(uVar);
            C40701u d = uVar.mo94863d();
            bVar.f96314d = d;
            d.f96377g = d;
            d.f96376f = d;
            for (C40701u uVar2 = uVar.f96376f; uVar2 != uVar; uVar2 = uVar2.f96376f) {
                C40701u uVar3 = d.f96377g;
                C41536l.m120486f(uVar3);
                C41536l.m120486f(uVar2);
                uVar3.mo94862c(uVar2.mo94863d());
            }
            bVar.mo94706K0(mo94709M0());
        }
        return bVar;
    }

    /* renamed from: o0 */
    public int mo94745o0() {
        return C40683e0.m117733f(readInt());
    }

    /* renamed from: o1 */
    public String mo94746o1() {
        return mo94772x0(this.f96315e, C40407d.f95989b);
    }

    /* renamed from: p */
    public final C40672b mo94747p(C40672b bVar, long j, long j2) {
        C41536l.m120489i(bVar, "out");
        C40683e0.m117729b(mo94709M0(), j, j2);
        if (j2 != 0) {
            bVar.mo94706K0(bVar.mo94709M0() + j2);
            C40701u uVar = this.f96314d;
            while (true) {
                C41536l.m120486f(uVar);
                int i = uVar.f96373c;
                int i2 = uVar.f96372b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                uVar = uVar.f96376f;
            }
            while (j2 > 0) {
                C41536l.m120486f(uVar);
                C40701u d = uVar.mo94863d();
                int i3 = d.f96372b + ((int) j);
                d.f96372b = i3;
                d.f96373c = Math.min(i3 + ((int) j2), d.f96373c);
                C40701u uVar2 = bVar.f96314d;
                if (uVar2 == null) {
                    d.f96377g = d;
                    d.f96376f = d;
                    bVar.f96314d = d;
                } else {
                    C41536l.m120486f(uVar2);
                    C40701u uVar3 = uVar2.f96377g;
                    C41536l.m120486f(uVar3);
                    uVar3.mo94862c(d);
                }
                j2 -= (long) (d.f96373c - d.f96372b);
                uVar = uVar.f96376f;
                j = 0;
            }
        }
        return this;
    }

    /* renamed from: p0 */
    public short mo94748p0() {
        return C40683e0.m117734g(readShort());
    }

    /* renamed from: p1 */
    public C40672b mo94715R0(int i) {
        C40701u W0 = mo94722W0(1);
        byte[] bArr = W0.f96371a;
        int i2 = W0.f96373c;
        W0.f96373c = i2 + 1;
        bArr[i2] = (byte) i;
        mo94706K0(mo94709M0() + 1);
        return this;
    }

    /* renamed from: q */
    public C40672b mo94708M() {
        return this;
    }

    /* renamed from: q1 */
    public C40672b mo94693C0(long j) {
        boolean z;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return mo94715R0(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo94728d0("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        C40701u W0 = mo94722W0(i2);
        byte[] bArr = W0.f96371a;
        int i3 = W0.f96373c + i2;
        while (j != 0) {
            long j2 = (long) 10;
            i3--;
            bArr[i3] = C40890a.m118620b()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        W0.f96373c += i2;
        mo94706K0(mo94709M0() + ((long) i2));
        return this;
    }

    /* renamed from: r0 */
    public String mo94752r0() {
        return mo94721W(Long.MAX_VALUE);
    }

    /* renamed from: r1 */
    public C40672b mo94733h1(long j) {
        if (j == 0) {
            return mo94715R0(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j12 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j13 = j12 + (j12 >>> 8);
        long j14 = j13 + (j13 >>> 16);
        int i = (int) ((((j14 & 63) + ((j14 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C40701u W0 = mo94722W0(i);
        byte[] bArr = W0.f96371a;
        int i2 = W0.f96373c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C40890a.m118620b()[(int) (15 & j)];
            j >>>= 4;
        }
        W0.f96373c += i;
        mo94706K0(mo94709M0() + ((long) i));
        return this;
    }

    public int read(ByteBuffer byteBuffer) {
        C41536l.m120489i(byteBuffer, "sink");
        C40701u uVar = this.f96314d;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.f96373c - uVar.f96372b);
        byteBuffer.put(uVar.f96371a, uVar.f96372b, min);
        int i = uVar.f96372b + min;
        uVar.f96372b = i;
        this.f96315e -= (long) min;
        if (i == uVar.f96373c) {
            this.f96314d = uVar.mo94861b();
            C40703v.m117851b(uVar);
        }
        return min;
    }

    public byte readByte() {
        if (mo94709M0() != 0) {
            C40701u uVar = this.f96314d;
            C41536l.m120486f(uVar);
            int i = uVar.f96372b;
            int i2 = uVar.f96373c;
            int i3 = i + 1;
            byte b = uVar.f96371a[i];
            mo94706K0(mo94709M0() - 1);
            if (i3 == i2) {
                this.f96314d = uVar.mo94861b();
                C40703v.m117851b(uVar);
            } else {
                uVar.f96372b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public void readFully(byte[] bArr) {
        C41536l.m120489i(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        if (mo94709M0() >= 4) {
            C40701u uVar = this.f96314d;
            C41536l.m120486f(uVar);
            int i = uVar.f96372b;
            int i2 = uVar.f96373c;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = uVar.f96371a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            mo94706K0(mo94709M0() - 4);
            if (i6 == i2) {
                this.f96314d = uVar.mo94861b();
                C40703v.m117851b(uVar);
            } else {
                uVar.f96372b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public long readLong() {
        if (mo94709M0() >= 8) {
            C40701u uVar = this.f96314d;
            C41536l.m120486f(uVar);
            int i = uVar.f96372b;
            int i2 = uVar.f96373c;
            if (((long) (i2 - i)) < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = uVar.f96371a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
            int i9 = i8 + 1;
            int i12 = i9 + 1;
            long j2 = j | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            mo94706K0(mo94709M0() - 8);
            if (i12 == i2) {
                this.f96314d = uVar.mo94861b();
                C40703v.m117851b(uVar);
            } else {
                uVar.f96372b = i12;
            }
            return j2;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (mo94709M0() >= 2) {
            C40701u uVar = this.f96314d;
            C41536l.m120486f(uVar);
            int i = uVar.f96372b;
            int i2 = uVar.f96373c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = uVar.f96371a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            mo94706K0(mo94709M0() - 2);
            if (i4 == i2) {
                this.f96314d = uVar.mo94861b();
                C40703v.m117851b(uVar);
            } else {
                uVar.f96372b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public C40672b mo94719V() {
        return this;
    }

    /* renamed from: s1 */
    public C40672b mo94711P(int i) {
        C40701u W0 = mo94722W0(4);
        byte[] bArr = W0.f96371a;
        int i2 = W0.f96373c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & C11051p3.f31759c);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & C11051p3.f31759c);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & C11051p3.f31759c);
        bArr[i5] = (byte) (i & C11051p3.f31759c);
        W0.f96373c = i5 + 1;
        mo94706K0(mo94709M0() + 4);
        return this;
    }

    public void skip(long j) {
        while (j > 0) {
            C40701u uVar = this.f96314d;
            if (uVar != null) {
                int min = (int) Math.min(j, (long) (uVar.f96373c - uVar.f96372b));
                long j2 = (long) min;
                mo94706K0(mo94709M0() - j2);
                j -= j2;
                int i = uVar.f96372b + min;
                uVar.f96372b = i;
                if (i == uVar.f96373c) {
                    this.f96314d = uVar.mo94861b();
                    C40703v.m117851b(uVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: t */
    public final byte mo94764t(long j) {
        C40683e0.m117729b(mo94709M0(), j, 1);
        C40701u uVar = this.f96314d;
        if (uVar == null) {
            C41536l.m120486f((Object) null);
            throw null;
        } else if (mo94709M0() - j < j) {
            long M0 = mo94709M0();
            while (M0 > j) {
                uVar = uVar.f96377g;
                C41536l.m120486f(uVar);
                M0 -= (long) (uVar.f96373c - uVar.f96372b);
            }
            C41536l.m120486f(uVar);
            return uVar.f96371a[(int) ((((long) uVar.f96372b) + j) - M0)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = ((long) (uVar.f96373c - uVar.f96372b)) + j2;
                if (j3 > j) {
                    C41536l.m120486f(uVar);
                    return uVar.f96371a[(int) ((((long) uVar.f96372b) + j) - j2)];
                }
                uVar = uVar.f96376f;
                C41536l.m120486f(uVar);
                j2 = j3;
            }
        }
    }

    /* renamed from: t0 */
    public byte[] mo94765t0(long j) {
        boolean z;
        if (j < 0 || j > 2147483647L) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(C41536l.m120497q("byteCount: ", Long.valueOf(j)).toString());
        } else if (mo94709M0() >= j) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: t1 */
    public C40672b mo94766t1(long j) {
        C40701u W0 = mo94722W0(8);
        byte[] bArr = W0.f96371a;
        int i = W0.f96373c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        W0.f96373c = i8 + 1;
        mo94706K0(mo94709M0() + 8);
        return this;
    }

    public String toString() {
        return mo94710O0().toString();
    }

    /* renamed from: u */
    public long mo94768u(byte b, long j, long j2) {
        C40701u uVar;
        long j3;
        int i;
        long j4 = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (z) {
            if (j2 > mo94709M0()) {
                j2 = mo94709M0();
            }
            long j5 = j2;
            if (j == j5 || (uVar = this.f96314d) == null) {
                return -1;
            }
            if (mo94709M0() - j < j) {
                j3 = mo94709M0();
                while (j3 > j) {
                    uVar = uVar.f96377g;
                    C41536l.m120486f(uVar);
                    j3 -= (long) (uVar.f96373c - uVar.f96372b);
                }
                while (j3 < j5) {
                    byte[] bArr = uVar.f96371a;
                    int min = (int) Math.min((long) uVar.f96373c, (((long) uVar.f96372b) + j5) - j3);
                    i = (int) ((((long) uVar.f96372b) + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += (long) (uVar.f96373c - uVar.f96372b);
                    uVar = uVar.f96376f;
                    C41536l.m120486f(uVar);
                    j = j3;
                }
                return -1;
            }
            while (true) {
                long j6 = ((long) (uVar.f96373c - uVar.f96372b)) + j4;
                if (j6 > j) {
                    break;
                }
                uVar = uVar.f96376f;
                C41536l.m120486f(uVar);
                j4 = j6;
            }
            while (j3 < j5) {
                byte[] bArr2 = uVar.f96371a;
                int min2 = (int) Math.min((long) uVar.f96373c, (((long) uVar.f96372b) + j5) - j3);
                int i2 = (int) ((((long) uVar.f96372b) + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i2 = i + 1;
                    }
                }
                j4 = j3 + ((long) (uVar.f96373c - uVar.f96372b));
                uVar = uVar.f96376f;
                C41536l.m120486f(uVar);
                j = j4;
            }
            return -1;
            return ((long) (i - uVar.f96372b)) + j3;
        }
        throw new IllegalArgumentException(("size=" + mo94709M0() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    /* renamed from: v1 */
    public long mo94769v1(C40681e eVar) {
        C41536l.m120489i(eVar, "bytes");
        return mo94773y(eVar, 0);
    }

    public int write(ByteBuffer byteBuffer) {
        C41536l.m120489i(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C40701u W0 = mo94722W0(1);
            int min = Math.min(i, 8192 - W0.f96373c);
            byteBuffer.get(W0.f96371a, W0.f96373c, min);
            i -= min;
            W0.f96373c += min;
        }
        this.f96315e += (long) remaining;
        return remaining;
    }

    /* renamed from: x0 */
    public String mo94772x0(long j, Charset charset) {
        boolean z;
        C41536l.m120489i(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0 || j > 2147483647L) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(C41536l.m120497q("byteCount: ", Long.valueOf(j)).toString());
        } else if (this.f96315e < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C40701u uVar = this.f96314d;
            C41536l.m120486f(uVar);
            int i2 = uVar.f96372b;
            if (((long) i2) + j > ((long) uVar.f96373c)) {
                return new String(mo94765t0(j), charset);
            }
            int i3 = (int) j;
            String str = new String(uVar.f96371a, i2, i3, charset);
            int i4 = uVar.f96372b + i3;
            uVar.f96372b = i4;
            this.f96315e -= j;
            if (i4 == uVar.f96373c) {
                this.f96314d = uVar.mo94861b();
                C40703v.m117851b(uVar);
            }
            return str;
        }
    }

    /* renamed from: x1 */
    public void mo21301x1(C40672b bVar, long j) {
        boolean z;
        C40701u uVar;
        int i;
        C41536l.m120489i(bVar, "source");
        if (bVar != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C40683e0.m117729b(bVar.mo94709M0(), 0, j);
            while (j > 0) {
                C40701u uVar2 = bVar.f96314d;
                C41536l.m120486f(uVar2);
                int i2 = uVar2.f96373c;
                C40701u uVar3 = bVar.f96314d;
                C41536l.m120486f(uVar3);
                if (j < ((long) (i2 - uVar3.f96372b))) {
                    C40701u uVar4 = this.f96314d;
                    if (uVar4 != null) {
                        C41536l.m120486f(uVar4);
                        uVar = uVar4.f96377g;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null && uVar.f96375e) {
                        long j2 = ((long) uVar.f96373c) + j;
                        if (uVar.f96374d) {
                            i = 0;
                        } else {
                            i = uVar.f96372b;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            C40701u uVar5 = bVar.f96314d;
                            C41536l.m120486f(uVar5);
                            uVar5.mo94866g(uVar, (int) j);
                            bVar.mo94706K0(bVar.mo94709M0() - j);
                            mo94706K0(mo94709M0() + j);
                            return;
                        }
                    }
                    C40701u uVar6 = bVar.f96314d;
                    C41536l.m120486f(uVar6);
                    bVar.f96314d = uVar6.mo94864e((int) j);
                }
                C40701u uVar7 = bVar.f96314d;
                C41536l.m120486f(uVar7);
                long j3 = (long) (uVar7.f96373c - uVar7.f96372b);
                bVar.f96314d = uVar7.mo94861b();
                C40701u uVar8 = this.f96314d;
                if (uVar8 == null) {
                    this.f96314d = uVar7;
                    uVar7.f96377g = uVar7;
                    uVar7.f96376f = uVar7;
                } else {
                    C41536l.m120486f(uVar8);
                    C40701u uVar9 = uVar8.f96377g;
                    C41536l.m120486f(uVar9);
                    uVar9.mo94862c(uVar7).mo94860a();
                }
                bVar.mo94706K0(bVar.mo94709M0() - j3);
                mo94706K0(mo94709M0() + j3);
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: y */
    public long mo94773y(C40681e eVar, long j) {
        boolean z;
        boolean z2;
        C41536l.m120489i(eVar, "bytes");
        if (eVar.mo94793B() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = 0;
            if (j >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C40701u uVar = this.f96314d;
                if (uVar != null) {
                    if (mo94709M0() - j < j) {
                        long M0 = mo94709M0();
                        while (M0 > j) {
                            uVar = uVar.f96377g;
                            C41536l.m120486f(uVar);
                            M0 -= (long) (uVar.f96373c - uVar.f96372b);
                        }
                        byte[] q = eVar.mo94811q();
                        byte b = q[0];
                        int B = eVar.mo94793B();
                        long M02 = (mo94709M0() - ((long) B)) + 1;
                        long j3 = M0;
                        long j4 = j;
                        while (j3 < M02) {
                            byte[] bArr = uVar.f96371a;
                            int min = (int) Math.min((long) uVar.f96373c, (((long) uVar.f96372b) + M02) - j3);
                            int i = (int) ((((long) uVar.f96372b) + j4) - j3);
                            if (i < min) {
                                while (true) {
                                    int i2 = i + 1;
                                    if (bArr[i] == b && C40890a.m118621c(uVar, i2, q, 1, B)) {
                                        return ((long) (i - uVar.f96372b)) + j3;
                                    }
                                    if (i2 >= min) {
                                        break;
                                    }
                                    i = i2;
                                }
                            }
                            j3 += (long) (uVar.f96373c - uVar.f96372b);
                            uVar = uVar.f96376f;
                            C41536l.m120486f(uVar);
                            j4 = j3;
                        }
                    } else {
                        while (true) {
                            long j5 = ((long) (uVar.f96373c - uVar.f96372b)) + j2;
                            if (j5 > j) {
                                break;
                            }
                            uVar = uVar.f96376f;
                            C41536l.m120486f(uVar);
                            j2 = j5;
                        }
                        byte[] q2 = eVar.mo94811q();
                        byte b2 = q2[0];
                        int B2 = eVar.mo94793B();
                        long M03 = (mo94709M0() - ((long) B2)) + 1;
                        long j6 = j2;
                        long j7 = j;
                        while (j6 < M03) {
                            byte[] bArr2 = uVar.f96371a;
                            long j8 = M03;
                            int min2 = (int) Math.min((long) uVar.f96373c, (((long) uVar.f96372b) + M03) - j6);
                            int i3 = (int) ((((long) uVar.f96372b) + j7) - j6);
                            if (i3 < min2) {
                                while (true) {
                                    int i4 = i3 + 1;
                                    if (bArr2[i3] == b2 && C40890a.m118621c(uVar, i4, q2, 1, B2)) {
                                        return ((long) (i3 - uVar.f96372b)) + j6;
                                    }
                                    if (i4 >= min2) {
                                        break;
                                    }
                                    i3 = i4;
                                }
                            }
                            j6 += (long) (uVar.f96373c - uVar.f96372b);
                            uVar = uVar.f96376f;
                            C41536l.m120486f(uVar);
                            j7 = j6;
                            M03 = j8;
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(C41536l.m120497q("fromIndex < 0: ", Long.valueOf(j)).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    /* renamed from: y1 */
    public C40672b mo94707L0(int i) {
        C40701u W0 = mo94722W0(2);
        byte[] bArr = W0.f96371a;
        int i2 = W0.f96373c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & C11051p3.f31759c);
        bArr[i3] = (byte) (i & C11051p3.f31759c);
        W0.f96373c = i3 + 1;
        mo94706K0(mo94709M0() + 2);
        return this;
    }

    /* renamed from: z1 */
    public C40672b mo94775z1(String str, int i, int i2, Charset charset) {
        boolean z;
        boolean z2;
        C41536l.m120489i(str, "string");
        C41536l.m120489i(charset, "charset");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > str.length()) {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
                } else if (C41536l.m120484d(charset, C40407d.f95989b)) {
                    return mo94740l0(str, i, i2);
                } else {
                    String substring = str.substring(i, i2);
                    C41536l.m120488h(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        C41536l.m120488h(bytes, "(this as java.lang.String).getBytes(charset)");
                        return mo94730e1(bytes, 0, bytes.length);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
            }
        } else {
            throw new IllegalArgumentException(C41536l.m120497q("beginIndex < 0: ", Integer.valueOf(i)).toString());
        }
    }

    /* renamed from: dg1.b$b */
    public static final class C40674b extends InputStream {

        /* renamed from: d */
        final /* synthetic */ C40672b f96323d;

        C40674b(C40672b bVar) {
            this.f96323d = bVar;
        }

        public int available() {
            return (int) Math.min(this.f96323d.mo94709M0(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f96323d.mo94709M0() > 0) {
                return this.f96323d.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return this.f96323d + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            C41536l.m120489i(bArr, "sink");
            return this.f96323d.read(bArr, i, i2);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        C41536l.m120489i(bArr, "sink");
        C40683e0.m117729b((long) bArr.length, (long) i, (long) i2);
        C40701u uVar = this.f96314d;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i2, uVar.f96373c - uVar.f96372b);
        byte[] bArr2 = uVar.f96371a;
        int i3 = uVar.f96372b;
        byte[] unused = C41331l.m119760d(bArr2, bArr, i, i3, i3 + min);
        uVar.f96372b += min;
        mo94706K0(mo94709M0() - ((long) min));
        if (uVar.f96372b == uVar.f96373c) {
            this.f96314d = uVar.mo94861b();
            C40703v.m117851b(uVar);
        }
        return min;
    }
}
