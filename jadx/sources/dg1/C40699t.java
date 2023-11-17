package dg1;

import eg1.C40890a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p975ui.views.widgets.deprecated.BogTextInputET;

/* renamed from: dg1.t */
public final class C40699t implements C40679d {

    /* renamed from: d */
    public final C40707z f96366d;

    /* renamed from: e */
    public final C40672b f96367e = new C40672b();

    /* renamed from: f */
    public boolean f96368f;

    public C40699t(C40707z zVar) {
        C41536l.m120489i(zVar, "source");
        this.f96366d = zVar;
    }

    /* renamed from: B */
    public C40672b mo94690B() {
        return this.f96367e;
    }

    /* renamed from: B0 */
    public void mo94691B0(long j) {
        if (!mo94739l(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: C */
    public C40669a0 mo94678C() {
        return this.f96366d.mo94678C();
    }

    /* renamed from: C1 */
    public long mo94694C1(C40705x xVar) {
        C41536l.m120489i(xVar, "sink");
        long j = 0;
        while (this.f96366d.mo21305g(this.f96367e, 8192) != -1) {
            long n = this.f96367e.mo94742n();
            if (n > 0) {
                j += n;
                xVar.mo21301x1(this.f96367e, n);
            }
        }
        if (this.f96367e.mo94709M0() <= 0) {
            return j;
        }
        long M0 = j + this.f96367e.mo94709M0();
        C40672b bVar = this.f96367e;
        xVar.mo21301x1(bVar, bVar.mo94709M0());
        return M0;
    }

    /* renamed from: D */
    public C40679d mo94695D() {
        return C40691m.m117770b(new C40697r(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: D1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo94696D1() {
        /*
            r5 = this;
            r0 = 1
            r5.mo94691B0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo94739l(r2)
            if (r2 == 0) goto L_0x0059
            dg1.b r2 = r5.f96367e
            long r3 = (long) r0
            byte r2 = r2.mo94764t(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0059
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            int r1 = cf1.C40405b.m116976a(r1)
            int r1 = cf1.C40405b.m116976a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = kotlin.jvm.internal.C41536l.m120497q(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x0059:
            dg1.b r0 = r5.f96367e
            long r0 = r0.mo94696D1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dg1.C40699t.mo94696D1():long");
    }

    /* renamed from: E */
    public long mo94697E(C40681e eVar) {
        C41536l.m120489i(eVar, "targetBytes");
        return mo94849e(eVar, 0);
    }

    /* renamed from: E1 */
    public InputStream mo94698E1() {
        return new C40700a(this);
    }

    /* renamed from: J */
    public C40672b mo94704J() {
        return this.f96367e;
    }

    /* renamed from: J0 */
    public C40681e mo94705J0(long j) {
        mo94691B0(j);
        return this.f96367e.mo94705J0(j);
    }

    /* renamed from: P0 */
    public byte[] mo94712P0() {
        this.f96367e.mo94741l1(this.f96366d);
        return this.f96367e.mo94712P0();
    }

    /* renamed from: Q0 */
    public boolean mo94714Q0() {
        if (!(!this.f96368f)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f96367e.mo94714Q0() || this.f96366d.mo21305g(this.f96367e, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: S0 */
    public int mo94716S0(C40694p pVar) {
        C41536l.m120489i(pVar, "options");
        if (!this.f96368f) {
            while (true) {
                int e = C40890a.m118623e(this.f96367e, pVar, true);
                if (e == -2) {
                    if (this.f96366d.mo21305g(this.f96367e, 8192) == -1) {
                        break;
                    }
                } else if (e != -1) {
                    this.f96367e.skip((long) pVar.mo94837j()[e].mo94793B());
                    return e;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: W */
    public String mo94721W(long j) {
        boolean z;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long c = mo94847c(b, 0, j2);
            if (c != -1) {
                return C40890a.m118622d(this.f96367e, c);
            }
            if (j2 < Long.MAX_VALUE && mo94739l(j2) && this.f96367e.mo94764t(j2 - 1) == ((byte) 13) && mo94739l(1 + j2) && this.f96367e.mo94764t(j2) == b) {
                return C40890a.m118622d(this.f96367e, j2);
            }
            C40672b bVar = new C40672b();
            C40672b bVar2 = this.f96367e;
            bVar2.mo94747p(bVar, 0, Math.min((long) 32, bVar2.mo94709M0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f96367e.mo94709M0(), j) + " content=" + bVar.mo94743n0().mo94810o() + BogTextInputET.emptyChar);
        }
        throw new IllegalArgumentException(C41536l.m120497q("limit < 0: ", Long.valueOf(j)).toString());
    }

    /* renamed from: a */
    public long mo94846a(byte b) {
        return mo94847c(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: c */
    public long mo94847c(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f96368f) {
            if (0 > j || j > j2) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long u = this.f96367e.mo94768u(b, j, j2);
                    if (u != -1) {
                        return u;
                    }
                    long M0 = this.f96367e.mo94709M0();
                    if (M0 >= j2 || this.f96366d.mo21305g(this.f96367e, 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, M0);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f96368f) {
            this.f96368f = true;
            this.f96366d.close();
            this.f96367e.mo94724a();
        }
    }

    /* renamed from: d */
    public long mo94848d(C40681e eVar, long j) {
        C41536l.m120489i(eVar, "bytes");
        if (!this.f96368f) {
            while (true) {
                long y = this.f96367e.mo94773y(eVar, j);
                if (y != -1) {
                    return y;
                }
                long M0 = this.f96367e.mo94709M0();
                if (this.f96366d.mo21305g(this.f96367e, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (M0 - ((long) eVar.mo94793B())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: e */
    public long mo94849e(C40681e eVar, long j) {
        C41536l.m120489i(eVar, "targetBytes");
        if (!this.f96368f) {
            while (true) {
                long Q = this.f96367e.mo94713Q(eVar, j);
                if (Q != -1) {
                    return Q;
                }
                long M0 = this.f96367e.mo94709M0();
                if (this.f96366d.mo21305g(this.f96367e, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, M0);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
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
        } else if (!(!this.f96368f)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f96367e.mo94709M0() == 0 && this.f96366d.mo21305g(this.f96367e, 8192) == -1) {
            return -1;
        } else {
            return this.f96367e.mo21305g(bVar, Math.min(j, this.f96367e.mo94709M0()));
        }
    }

    public boolean isOpen() {
        return !this.f96368f;
    }

    /* renamed from: j0 */
    public void mo94736j0(C40672b bVar, long j) {
        C41536l.m120489i(bVar, "sink");
        try {
            mo94691B0(j);
            this.f96367e.mo94736j0(bVar, j);
        } catch (EOFException e) {
            bVar.mo94741l1(this.f96367e);
            throw e;
        }
    }

    /* renamed from: k */
    public int mo94851k() {
        mo94691B0(4);
        return this.f96367e.mo94745o0();
    }

    /* renamed from: l */
    public boolean mo94739l(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C41536l.m120497q("byteCount < 0: ", Long.valueOf(j)).toString());
        } else if (!this.f96368f) {
            while (this.f96367e.mo94709M0() < j) {
                if (this.f96366d.mo21305g(this.f96367e, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: n */
    public short mo94852n() {
        mo94691B0(2);
        return this.f96367e.mo94748p0();
    }

    /* renamed from: o1 */
    public String mo94746o1() {
        this.f96367e.mo94741l1(this.f96366d);
        return this.f96367e.mo94746o1();
    }

    /* renamed from: r0 */
    public String mo94752r0() {
        return mo94721W(Long.MAX_VALUE);
    }

    public int read(ByteBuffer byteBuffer) {
        C41536l.m120489i(byteBuffer, "sink");
        if (this.f96367e.mo94709M0() == 0 && this.f96366d.mo21305g(this.f96367e, 8192) == -1) {
            return -1;
        }
        return this.f96367e.read(byteBuffer);
    }

    public byte readByte() {
        mo94691B0(1);
        return this.f96367e.readByte();
    }

    public void readFully(byte[] bArr) {
        C41536l.m120489i(bArr, "sink");
        try {
            mo94691B0((long) bArr.length);
            this.f96367e.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f96367e.mo94709M0() > 0) {
                C40672b bVar = this.f96367e;
                int read = bVar.read(bArr, i, (int) bVar.mo94709M0());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public int readInt() {
        mo94691B0(4);
        return this.f96367e.readInt();
    }

    public long readLong() {
        mo94691B0(8);
        return this.f96367e.readLong();
    }

    public short readShort() {
        mo94691B0(2);
        return this.f96367e.readShort();
    }

    public void skip(long j) {
        if (!this.f96368f) {
            while (j > 0) {
                if (this.f96367e.mo94709M0() == 0 && this.f96366d.mo21305g(this.f96367e, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f96367e.mo94709M0());
                this.f96367e.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: t0 */
    public byte[] mo94765t0(long j) {
        mo94691B0(j);
        return this.f96367e.mo94765t0(j);
    }

    public String toString() {
        return "buffer(" + this.f96366d + ')';
    }

    /* renamed from: v1 */
    public long mo94769v1(C40681e eVar) {
        C41536l.m120489i(eVar, "bytes");
        return mo94848d(eVar, 0);
    }

    /* renamed from: dg1.t$a */
    public static final class C40700a extends InputStream {

        /* renamed from: d */
        final /* synthetic */ C40699t f96369d;

        C40700a(C40699t tVar) {
            this.f96369d = tVar;
        }

        public int available() {
            C40699t tVar = this.f96369d;
            if (!tVar.f96368f) {
                return (int) Math.min(tVar.f96367e.mo94709M0(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f96369d.close();
        }

        public int read() {
            C40699t tVar = this.f96369d;
            if (!tVar.f96368f) {
                if (tVar.f96367e.mo94709M0() == 0) {
                    C40699t tVar2 = this.f96369d;
                    if (tVar2.f96366d.mo21305g(tVar2.f96367e, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f96369d.f96367e.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f96369d + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            C41536l.m120489i(bArr, "data");
            if (!this.f96369d.f96368f) {
                C40683e0.m117729b((long) bArr.length, (long) i, (long) i2);
                if (this.f96369d.f96367e.mo94709M0() == 0) {
                    C40699t tVar = this.f96369d;
                    if (tVar.f96366d.mo21305g(tVar.f96367e, 8192) == -1) {
                        return -1;
                    }
                }
                return this.f96369d.f96367e.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }
}
