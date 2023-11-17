package dg1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.k */
public final class C40689k implements C40707z {

    /* renamed from: d */
    private final C40679d f96345d;

    /* renamed from: e */
    private final Inflater f96346e;

    /* renamed from: f */
    private int f96347f;

    /* renamed from: g */
    private boolean f96348g;

    public C40689k(C40679d dVar, Inflater inflater) {
        C41536l.m120489i(dVar, "source");
        C41536l.m120489i(inflater, "inflater");
        this.f96345d = dVar;
        this.f96346e = inflater;
    }

    /* renamed from: n */
    private final void m117762n() {
        int i = this.f96347f;
        if (i != 0) {
            int remaining = i - this.f96346e.getRemaining();
            this.f96347f -= remaining;
            this.f96345d.skip((long) remaining);
        }
    }

    /* renamed from: C */
    public C40669a0 mo94678C() {
        return this.f96345d.mo94678C();
    }

    /* renamed from: a */
    public final long mo94832a(C40672b bVar, long j) {
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
        } else if (!(!this.f96348g)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            try {
                C40701u W0 = bVar.mo94722W0(1);
                mo94833k();
                int inflate = this.f96346e.inflate(W0.f96371a, W0.f96373c, (int) Math.min(j, (long) (8192 - W0.f96373c)));
                m117762n();
                if (inflate > 0) {
                    W0.f96373c += inflate;
                    long j2 = (long) inflate;
                    bVar.mo94706K0(bVar.mo94709M0() + j2);
                    return j2;
                }
                if (W0.f96372b == W0.f96373c) {
                    bVar.f96314d = W0.mo94861b();
                    C40703v.m117851b(W0);
                }
                return 0;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    public void close() {
        if (!this.f96348g) {
            this.f96346e.end();
            this.f96348g = true;
            this.f96345d.close();
        }
    }

    /* renamed from: g */
    public long mo21305g(C40672b bVar, long j) {
        C41536l.m120489i(bVar, "sink");
        do {
            long a = mo94832a(bVar, j);
            if (a > 0) {
                return a;
            }
            if (this.f96346e.finished() || this.f96346e.needsDictionary()) {
                return -1;
            }
        } while (!this.f96345d.mo94714Q0());
        throw new EOFException("source exhausted prematurely");
    }

    /* renamed from: k */
    public final boolean mo94833k() {
        if (!this.f96346e.needsInput()) {
            return false;
        }
        if (this.f96345d.mo94714Q0()) {
            return true;
        }
        C40701u uVar = this.f96345d.mo94690B().f96314d;
        C41536l.m120486f(uVar);
        int i = uVar.f96373c;
        int i2 = uVar.f96372b;
        int i3 = i - i2;
        this.f96347f = i3;
        this.f96346e.setInput(uVar.f96371a, i2, i3);
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C40689k(C40707z zVar, Inflater inflater) {
        this(C40691m.m117770b(zVar), inflater);
        C41536l.m120489i(zVar, "source");
        C41536l.m120489i(inflater, "inflater");
    }
}
