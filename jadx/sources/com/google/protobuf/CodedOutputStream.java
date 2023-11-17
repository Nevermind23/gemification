package com.google.protobuf;

import com.google.protobuf.C5670g1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends C5643e {

    /* renamed from: c */
    private static final Logger f17817c = Logger.getLogger(CodedOutputStream.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final boolean f17818d = C5660f1.m22576E();

    /* renamed from: a */
    C5675h f17819a;

    /* renamed from: b */
    private boolean f17820b;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$b */
    private static class C5626b extends CodedOutputStream {

        /* renamed from: e */
        private final byte[] f17821e;

        /* renamed from: f */
        private final int f17822f;

        /* renamed from: g */
        private final int f17823g;

        /* renamed from: h */
        private int f17824h;

        C5626b(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f17821e = bArr;
                    this.f17822f = i;
                    this.f17824h = i;
                    this.f17823g = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: A0 */
        public final void mo18467A0(C5677h0 h0Var) {
            mo18482P0(h0Var.mo18704d());
            h0Var.mo18706g(this);
        }

        /* renamed from: B0 */
        public final void mo18468B0(int i, C5677h0 h0Var) {
            mo18480N0(1, 3);
            mo18481O0(2, i);
            mo18517T0(3, h0Var);
            mo18480N0(1, 4);
        }

        /* renamed from: C0 */
        public final void mo18469C0(int i, C5648f fVar) {
            mo18480N0(1, 3);
            mo18481O0(2, i);
            mo18495f0(3, fVar);
            mo18480N0(1, 4);
        }

        /* renamed from: L0 */
        public final void mo18478L0(int i, String str) {
            mo18480N0(i, 2);
            mo18479M0(str);
        }

        /* renamed from: M0 */
        public final void mo18479M0(String str) {
            int i = this.f17824h;
            try {
                int Q = CodedOutputStream.m22321Q(str.length() * 3);
                int Q2 = CodedOutputStream.m22321Q(str.length());
                if (Q2 == Q) {
                    int i2 = i + Q2;
                    this.f17824h = i2;
                    int e = C5670g1.m22678e(str, this.f17821e, i2, mo18487Z());
                    this.f17824h = i;
                    mo18482P0((e - i) - Q2);
                    this.f17824h = e;
                    return;
                }
                mo18482P0(C5670g1.m22679f(str));
                this.f17824h = C5670g1.m22678e(str, this.f17821e, this.f17824h, mo18487Z());
            } catch (C5670g1.C5673c e2) {
                this.f17824h = i;
                mo18485V(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        /* renamed from: N0 */
        public final void mo18480N0(int i, int i2) {
            mo18482P0(C5679h1.m22754c(i, i2));
        }

        /* renamed from: O0 */
        public final void mo18481O0(int i, int i2) {
            mo18480N0(i, 0);
            mo18482P0(i2);
        }

        /* renamed from: P0 */
        public final void mo18482P0(int i) {
            while ((i & -128) != 0) {
                byte[] bArr = this.f17821e;
                int i2 = this.f17824h;
                this.f17824h = i2 + 1;
                bArr[i2] = (byte) ((i & C11051p3.f31760d) | 128);
                i >>>= 7;
            }
            try {
                byte[] bArr2 = this.f17821e;
                int i3 = this.f17824h;
                this.f17824h = i3 + 1;
                bArr2[i3] = (byte) i;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f17824h), Integer.valueOf(this.f17823g), 1}), e);
            }
        }

        /* renamed from: Q0 */
        public final void mo18483Q0(int i, long j) {
            mo18480N0(i, 0);
            mo18484R0(j);
        }

        /* renamed from: R0 */
        public final void mo18484R0(long j) {
            if (!CodedOutputStream.f17818d || mo18487Z() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f17821e;
                    int i = this.f17824h;
                    this.f17824h = i + 1;
                    bArr[i] = (byte) ((((int) j) & C11051p3.f31760d) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f17821e;
                    int i2 = this.f17824h;
                    this.f17824h = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f17824h), Integer.valueOf(this.f17823g), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f17821e;
                    int i3 = this.f17824h;
                    this.f17824h = i3 + 1;
                    C5660f1.m22582K(bArr3, (long) i3, (byte) ((((int) j) & C11051p3.f31760d) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f17821e;
                int i4 = this.f17824h;
                this.f17824h = i4 + 1;
                C5660f1.m22582K(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: S0 */
        public final void mo18516S0(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f17821e, this.f17824h, i2);
                this.f17824h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f17824h), Integer.valueOf(this.f17823g), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: T0 */
        public final void mo18517T0(int i, C5677h0 h0Var) {
            mo18480N0(i, 2);
            mo18467A0(h0Var);
        }

        /* renamed from: Z */
        public final int mo18487Z() {
            return this.f17823g - this.f17824h;
        }

        /* renamed from: a */
        public final void mo18488a(byte[] bArr, int i, int i2) {
            mo18516S0(bArr, i, i2);
        }

        /* renamed from: a0 */
        public final void mo18489a0(byte b) {
            try {
                byte[] bArr = this.f17821e;
                int i = this.f17824h;
                this.f17824h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f17824h), Integer.valueOf(this.f17823g), 1}), e);
            }
        }

        /* renamed from: b0 */
        public final void mo18490b0(int i, boolean z) {
            mo18480N0(i, 0);
            mo18489a0(z ? (byte) 1 : 0);
        }

        /* renamed from: e0 */
        public final void mo18494e0(byte[] bArr, int i, int i2) {
            mo18482P0(i2);
            mo18516S0(bArr, i, i2);
        }

        /* renamed from: f0 */
        public final void mo18495f0(int i, C5648f fVar) {
            mo18480N0(i, 2);
            mo18496g0(fVar);
        }

        /* renamed from: g0 */
        public final void mo18496g0(C5648f fVar) {
            mo18482P0(fVar.size());
            fVar.mo18608H(this);
        }

        /* renamed from: l0 */
        public final void mo18501l0(int i, int i2) {
            mo18480N0(i, 5);
            mo18502m0(i2);
        }

        /* renamed from: m0 */
        public final void mo18502m0(int i) {
            try {
                byte[] bArr = this.f17821e;
                int i2 = this.f17824h;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & C11051p3.f31759c);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & C11051p3.f31759c);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & C11051p3.f31759c);
                this.f17824h = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & C11051p3.f31759c);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f17824h), Integer.valueOf(this.f17823g), 1}), e);
            }
        }

        /* renamed from: n0 */
        public final void mo18503n0(int i, long j) {
            mo18480N0(i, 1);
            mo18504o0(j);
        }

        /* renamed from: o0 */
        public final void mo18504o0(long j) {
            try {
                byte[] bArr = this.f17821e;
                int i = this.f17824h;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & C11051p3.f31759c);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & C11051p3.f31759c);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & C11051p3.f31759c);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & C11051p3.f31759c);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & C11051p3.f31759c);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & C11051p3.f31759c);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & C11051p3.f31759c);
                this.f17824h = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & C11051p3.f31759c);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f17824h), Integer.valueOf(this.f17823g), 1}), e);
            }
        }

        /* renamed from: v0 */
        public final void mo18511v0(int i, int i2) {
            mo18480N0(i, 0);
            mo18512w0(i2);
        }

        /* renamed from: w0 */
        public final void mo18512w0(int i) {
            if (i >= 0) {
                mo18482P0(i);
            } else {
                mo18484R0((long) i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z0 */
        public final void mo18515z0(int i, C5677h0 h0Var, C5728v0 v0Var) {
            mo18480N0(i, 2);
            mo18482P0(((C5627a) h0Var).mo18518l(v0Var));
            v0Var.mo18718b(h0Var, this.f17819a);
        }
    }

    /* renamed from: A */
    static int m22305A(int i, C5677h0 h0Var, C5728v0 v0Var) {
        return m22319O(i) + m22307C(h0Var, v0Var);
    }

    /* renamed from: B */
    public static int m22306B(C5677h0 h0Var) {
        return m22351z(h0Var.mo18704d());
    }

    /* renamed from: C */
    static int m22307C(C5677h0 h0Var, C5728v0 v0Var) {
        return m22351z(((C5627a) h0Var).mo18518l(v0Var));
    }

    /* renamed from: D */
    public static int m22308D(int i, C5648f fVar) {
        return (m22319O(1) * 2) + m22320P(2, i) + m22332g(3, fVar);
    }

    /* renamed from: E */
    public static int m22309E(int i, int i2) {
        return m22319O(i) + m22310F(i2);
    }

    /* renamed from: F */
    public static int m22310F(int i) {
        return 4;
    }

    /* renamed from: G */
    public static int m22311G(int i, long j) {
        return m22319O(i) + m22312H(j);
    }

    /* renamed from: H */
    public static int m22312H(long j) {
        return 8;
    }

    /* renamed from: I */
    public static int m22313I(int i, int i2) {
        return m22319O(i) + m22314J(i2);
    }

    /* renamed from: J */
    public static int m22314J(int i) {
        return m22321Q(m22324T(i));
    }

    /* renamed from: K */
    public static int m22315K(int i, long j) {
        return m22319O(i) + m22316L(j);
    }

    /* renamed from: L */
    public static int m22316L(long j) {
        return m22323S(m22325U(j));
    }

    /* renamed from: M */
    public static int m22317M(int i, String str) {
        return m22319O(i) + m22318N(str);
    }

    /* renamed from: N */
    public static int m22318N(String str) {
        int i;
        try {
            i = C5670g1.m22679f(str);
        } catch (C5670g1.C5673c unused) {
            i = str.getBytes(C5716s.f18068b).length;
        }
        return m22351z(i);
    }

    /* renamed from: O */
    public static int m22319O(int i) {
        return m22321Q(C5679h1.m22754c(i, 0));
    }

    /* renamed from: P */
    public static int m22320P(int i, int i2) {
        return m22319O(i) + m22321Q(i2);
    }

    /* renamed from: Q */
    public static int m22321Q(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: R */
    public static int m22322R(int i, long j) {
        return m22319O(i) + m22323S(j);
    }

    /* renamed from: S */
    public static int m22323S(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: T */
    public static int m22324T(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: U */
    public static long m22325U(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: X */
    public static CodedOutputStream m22326X(byte[] bArr) {
        return m22327Y(bArr, 0, bArr.length);
    }

    /* renamed from: Y */
    public static CodedOutputStream m22327Y(byte[] bArr, int i, int i2) {
        return new C5626b(bArr, i, i2);
    }

    /* renamed from: d */
    public static int m22329d(int i, boolean z) {
        return m22319O(i) + m22330e(z);
    }

    /* renamed from: e */
    public static int m22330e(boolean z) {
        return 1;
    }

    /* renamed from: f */
    public static int m22331f(byte[] bArr) {
        return m22351z(bArr.length);
    }

    /* renamed from: g */
    public static int m22332g(int i, C5648f fVar) {
        return m22319O(i) + m22333h(fVar);
    }

    /* renamed from: h */
    public static int m22333h(C5648f fVar) {
        return m22351z(fVar.size());
    }

    /* renamed from: i */
    public static int m22334i(int i, double d) {
        return m22319O(i) + m22335j(d);
    }

    /* renamed from: j */
    public static int m22335j(double d) {
        return 8;
    }

    /* renamed from: k */
    public static int m22336k(int i, int i2) {
        return m22319O(i) + m22337l(i2);
    }

    /* renamed from: l */
    public static int m22337l(int i) {
        return m22348w(i);
    }

    /* renamed from: m */
    public static int m22338m(int i, int i2) {
        return m22319O(i) + m22339n(i2);
    }

    /* renamed from: n */
    public static int m22339n(int i) {
        return 4;
    }

    /* renamed from: o */
    public static int m22340o(int i, long j) {
        return m22319O(i) + m22341p(j);
    }

    /* renamed from: p */
    public static int m22341p(long j) {
        return 8;
    }

    /* renamed from: q */
    public static int m22342q(int i, float f) {
        return m22319O(i) + m22343r(f);
    }

    /* renamed from: r */
    public static int m22343r(float f) {
        return 4;
    }

    /* renamed from: s */
    static int m22344s(int i, C5677h0 h0Var, C5728v0 v0Var) {
        return (m22319O(i) * 2) + m22346u(h0Var, v0Var);
    }

    /* renamed from: t */
    public static int m22345t(C5677h0 h0Var) {
        return h0Var.mo18704d();
    }

    /* renamed from: u */
    static int m22346u(C5677h0 h0Var, C5728v0 v0Var) {
        return ((C5627a) h0Var).mo18518l(v0Var);
    }

    /* renamed from: v */
    public static int m22347v(int i, int i2) {
        return m22319O(i) + m22348w(i2);
    }

    /* renamed from: w */
    public static int m22348w(int i) {
        if (i >= 0) {
            return m22321Q(i);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m22349x(int i, long j) {
        return m22319O(i) + m22350y(j);
    }

    /* renamed from: y */
    public static int m22350y(long j) {
        return m22323S(j);
    }

    /* renamed from: z */
    static int m22351z(int i) {
        return m22321Q(i) + i;
    }

    /* renamed from: A0 */
    public abstract void mo18467A0(C5677h0 h0Var);

    /* renamed from: B0 */
    public abstract void mo18468B0(int i, C5677h0 h0Var);

    /* renamed from: C0 */
    public abstract void mo18469C0(int i, C5648f fVar);

    /* renamed from: D0 */
    public final void mo18470D0(int i, int i2) {
        mo18501l0(i, i2);
    }

    /* renamed from: E0 */
    public final void mo18471E0(int i) {
        mo18502m0(i);
    }

    /* renamed from: F0 */
    public final void mo18472F0(int i, long j) {
        mo18503n0(i, j);
    }

    /* renamed from: G0 */
    public final void mo18473G0(long j) {
        mo18504o0(j);
    }

    /* renamed from: H0 */
    public final void mo18474H0(int i, int i2) {
        mo18481O0(i, m22324T(i2));
    }

    /* renamed from: I0 */
    public final void mo18475I0(int i) {
        mo18482P0(m22324T(i));
    }

    /* renamed from: J0 */
    public final void mo18476J0(int i, long j) {
        mo18483Q0(i, m22325U(j));
    }

    /* renamed from: K0 */
    public final void mo18477K0(long j) {
        mo18484R0(m22325U(j));
    }

    /* renamed from: L0 */
    public abstract void mo18478L0(int i, String str);

    /* renamed from: M0 */
    public abstract void mo18479M0(String str);

    /* renamed from: N0 */
    public abstract void mo18480N0(int i, int i2);

    /* renamed from: O0 */
    public abstract void mo18481O0(int i, int i2);

    /* renamed from: P0 */
    public abstract void mo18482P0(int i);

    /* renamed from: Q0 */
    public abstract void mo18483Q0(int i, long j);

    /* renamed from: R0 */
    public abstract void mo18484R0(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public final void mo18485V(String str, C5670g1.C5673c cVar) {
        f17817c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", cVar);
        byte[] bytes = str.getBytes(C5716s.f18068b);
        try {
            mo18482P0(bytes.length);
            mo18488a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public boolean mo18486W() {
        return this.f17820b;
    }

    /* renamed from: Z */
    public abstract int mo18487Z();

    /* renamed from: a */
    public abstract void mo18488a(byte[] bArr, int i, int i2);

    /* renamed from: a0 */
    public abstract void mo18489a0(byte b);

    /* renamed from: b0 */
    public abstract void mo18490b0(int i, boolean z);

    /* renamed from: c */
    public final void mo18491c() {
        if (mo18487Z() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: c0 */
    public final void mo18492c0(boolean z) {
        mo18489a0(z ? (byte) 1 : 0);
    }

    /* renamed from: d0 */
    public final void mo18493d0(byte[] bArr) {
        mo18494e0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public abstract void mo18494e0(byte[] bArr, int i, int i2);

    /* renamed from: f0 */
    public abstract void mo18495f0(int i, C5648f fVar);

    /* renamed from: g0 */
    public abstract void mo18496g0(C5648f fVar);

    /* renamed from: h0 */
    public final void mo18497h0(int i, double d) {
        mo18503n0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: i0 */
    public final void mo18498i0(double d) {
        mo18504o0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: j0 */
    public final void mo18499j0(int i, int i2) {
        mo18511v0(i, i2);
    }

    /* renamed from: k0 */
    public final void mo18500k0(int i) {
        mo18512w0(i);
    }

    /* renamed from: l0 */
    public abstract void mo18501l0(int i, int i2);

    /* renamed from: m0 */
    public abstract void mo18502m0(int i);

    /* renamed from: n0 */
    public abstract void mo18503n0(int i, long j);

    /* renamed from: o0 */
    public abstract void mo18504o0(long j);

    /* renamed from: p0 */
    public final void mo18505p0(int i, float f) {
        mo18501l0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: q0 */
    public final void mo18506q0(float f) {
        mo18502m0(Float.floatToRawIntBits(f));
    }

    /* renamed from: r0 */
    public final void mo18507r0(int i, C5677h0 h0Var) {
        mo18480N0(i, 3);
        mo18509t0(h0Var);
        mo18480N0(i, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public final void mo18508s0(int i, C5677h0 h0Var, C5728v0 v0Var) {
        mo18480N0(i, 3);
        mo18510u0(h0Var, v0Var);
        mo18480N0(i, 4);
    }

    /* renamed from: t0 */
    public final void mo18509t0(C5677h0 h0Var) {
        h0Var.mo18706g(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public final void mo18510u0(C5677h0 h0Var, C5728v0 v0Var) {
        v0Var.mo18718b(h0Var, this.f17819a);
    }

    /* renamed from: v0 */
    public abstract void mo18511v0(int i, int i2);

    /* renamed from: w0 */
    public abstract void mo18512w0(int i);

    /* renamed from: x0 */
    public final void mo18513x0(int i, long j) {
        mo18483Q0(i, j);
    }

    /* renamed from: y0 */
    public final void mo18514y0(long j) {
        mo18484R0(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public abstract void mo18515z0(int i, C5677h0 h0Var, C5728v0 v0Var);

    private CodedOutputStream() {
    }
}
