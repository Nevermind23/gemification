package dg1;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.j */
public final class C40688j implements C40707z {

    /* renamed from: d */
    private byte f96340d;

    /* renamed from: e */
    private final C40699t f96341e;

    /* renamed from: f */
    private final Inflater f96342f;

    /* renamed from: g */
    private final C40689k f96343g;

    /* renamed from: h */
    private final CRC32 f96344h = new CRC32();

    public C40688j(C40707z zVar) {
        C41536l.m120489i(zVar, "source");
        C40699t tVar = new C40699t(zVar);
        this.f96341e = tVar;
        Inflater inflater = new Inflater(true);
        this.f96342f = inflater;
        this.f96343g = new C40689k((C40679d) tVar, inflater);
    }

    /* renamed from: a */
    private final void m117756a(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            C41536l.m120488h(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: k */
    private final void m117757k() {
        boolean z;
        boolean z2;
        boolean z3;
        this.f96341e.mo94691B0(10);
        byte t = this.f96341e.f96367e.mo94764t(3);
        boolean z4 = true;
        if (((t >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m117759o(this.f96341e.f96367e, 0, 10);
        }
        m117756a("ID1ID2", 8075, this.f96341e.readShort());
        this.f96341e.skip(8);
        if (((t >> 2) & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f96341e.mo94691B0(2);
            if (z) {
                m117759o(this.f96341e.f96367e, 0, 2);
            }
            long p0 = (long) this.f96341e.f96367e.mo94748p0();
            this.f96341e.mo94691B0(p0);
            if (z) {
                m117759o(this.f96341e.f96367e, 0, p0);
            }
            this.f96341e.skip(p0);
        }
        if (((t >> 3) & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            long a = this.f96341e.mo94846a((byte) 0);
            if (a != -1) {
                if (z) {
                    m117759o(this.f96341e.f96367e, 0, a + 1);
                }
                this.f96341e.skip(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((t >> 4) & 1) != 1) {
            z4 = false;
        }
        if (z4) {
            long a2 = this.f96341e.mo94846a((byte) 0);
            if (a2 != -1) {
                if (z) {
                    m117759o(this.f96341e.f96367e, 0, a2 + 1);
                }
                this.f96341e.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m117756a("FHCRC", this.f96341e.mo94852n(), (short) ((int) this.f96344h.getValue()));
            this.f96344h.reset();
        }
    }

    /* renamed from: n */
    private final void m117758n() {
        m117756a("CRC", this.f96341e.mo94851k(), (int) this.f96344h.getValue());
        m117756a("ISIZE", this.f96341e.mo94851k(), (int) this.f96342f.getBytesWritten());
    }

    /* renamed from: o */
    private final void m117759o(C40672b bVar, long j, long j2) {
        C40701u uVar = bVar.f96314d;
        C41536l.m120486f(uVar);
        while (true) {
            int i = uVar.f96373c;
            int i2 = uVar.f96372b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            uVar = uVar.f96376f;
            C41536l.m120486f(uVar);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) uVar.f96372b) + j);
            int min = (int) Math.min((long) (uVar.f96373c - i3), j2);
            this.f96344h.update(uVar.f96371a, i3, min);
            j2 -= (long) min;
            uVar = uVar.f96376f;
            C41536l.m120486f(uVar);
            j = 0;
        }
    }

    /* renamed from: C */
    public C40669a0 mo94678C() {
        return this.f96341e.mo94678C();
    }

    public void close() {
        this.f96343g.close();
    }

    /* renamed from: g */
    public long mo21305g(C40672b bVar, long j) {
        boolean z;
        C41536l.m120489i(bVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C41536l.m120497q("byteCount < 0: ", Long.valueOf(j)).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f96340d == 0) {
                m117757k();
                this.f96340d = 1;
            }
            if (this.f96340d == 1) {
                long M0 = bVar.mo94709M0();
                long g = this.f96343g.mo21305g(bVar, j);
                if (g != -1) {
                    m117759o(bVar, M0, g);
                    return g;
                }
                this.f96340d = 2;
            }
            if (this.f96340d == 2) {
                m117758n();
                this.f96340d = 3;
                if (!this.f96341e.mo94714Q0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }
}
