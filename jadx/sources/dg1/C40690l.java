package dg1;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.l */
class C40690l implements C40707z {

    /* renamed from: d */
    private final InputStream f96349d;

    /* renamed from: e */
    private final C40669a0 f96350e;

    public C40690l(InputStream inputStream, C40669a0 a0Var) {
        C41536l.m120489i(inputStream, "input");
        C41536l.m120489i(a0Var, "timeout");
        this.f96349d = inputStream;
        this.f96350e = a0Var;
    }

    /* renamed from: C */
    public C40669a0 mo94678C() {
        return this.f96350e;
    }

    public void close() {
        this.f96349d.close();
    }

    /* renamed from: g */
    public long mo21305g(C40672b bVar, long j) {
        boolean z;
        C41536l.m120489i(bVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.f96350e.mo94687f();
                C40701u W0 = bVar.mo94722W0(1);
                int read = this.f96349d.read(W0.f96371a, W0.f96373c, (int) Math.min(j, (long) (8192 - W0.f96373c)));
                if (read != -1) {
                    W0.f96373c += read;
                    long j2 = (long) read;
                    bVar.mo94706K0(bVar.mo94709M0() + j2);
                    return j2;
                } else if (W0.f96372b != W0.f96373c) {
                    return -1;
                } else {
                    bVar.f96314d = W0.mo94861b();
                    C40703v.m117851b(W0);
                    return -1;
                }
            } catch (AssertionError e) {
                if (C40691m.m117771c(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(C41536l.m120497q("byteCount < 0: ", Long.valueOf(j)).toString());
        }
    }

    public String toString() {
        return "source(" + this.f96349d + ')';
    }
}
