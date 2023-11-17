package dg1;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.s */
public final class C40698s implements C40677c {

    /* renamed from: d */
    public final C40705x f96363d;

    /* renamed from: e */
    public final C40672b f96364e = new C40672b();

    /* renamed from: f */
    public boolean f96365f;

    public C40698s(C40705x xVar) {
        C41536l.m120489i(xVar, "sink");
        this.f96363d = xVar;
    }

    /* renamed from: B */
    public C40672b mo94690B() {
        return this.f96364e;
    }

    /* renamed from: C */
    public C40669a0 mo94673C() {
        return this.f96363d.mo94673C();
    }

    /* renamed from: C0 */
    public C40677c mo94693C0(long j) {
        if (!this.f96365f) {
            this.f96364e.mo94693C0(j);
            return mo94719V();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: L0 */
    public C40677c mo94707L0(int i) {
        if (!this.f96365f) {
            this.f96364e.mo94707L0(i);
            return mo94719V();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: M */
    public C40677c mo94708M() {
        if (!this.f96365f) {
            long M0 = this.f96364e.mo94709M0();
            if (M0 > 0) {
                this.f96363d.mo21301x1(this.f96364e, M0);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: P */
    public C40677c mo94711P(int i) {
        if (!this.f96365f) {
            this.f96364e.mo94711P(i);
            return mo94719V();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: R0 */
    public C40677c mo94715R0(int i) {
        if (!this.f96365f) {
            this.f96364e.mo94715R0(i);
            return mo94719V();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: T */
    public C40677c mo94717T(C40681e eVar) {
        C41536l.m120489i(eVar, "byteString");
        if (!this.f96365f) {
            this.f96364e.mo94717T(eVar);
            return mo94719V();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: V */
    public C40677c mo94719V() {
        if (!this.f96365f) {
            long n = this.f96364e.mo94742n();
            if (n > 0) {
                this.f96363d.mo21301x1(this.f96364e, n);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f96365f) {
            try {
                if (this.f96364e.mo94709M0() > 0) {
                    C40705x xVar = this.f96363d;
                    C40672b bVar = this.f96364e;
                    xVar.mo21301x1(bVar, bVar.mo94709M0());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f96363d.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f96365f = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: d0 */
    public C40677c mo94728d0(String str) {
        C41536l.m120489i(str, "string");
        if (!this.f96365f) {
            this.f96364e.mo94728d0(str);
            return mo94719V();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: e1 */
    public C40677c mo94730e1(byte[] bArr, int i, int i2) {
        C41536l.m120489i(bArr, "source");
        if (!this.f96365f) {
            this.f96364e.mo94730e1(bArr, i, i2);
            return mo94719V();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void flush() {
        if (!this.f96365f) {
            if (this.f96364e.mo94709M0() > 0) {
                C40705x xVar = this.f96363d;
                C40672b bVar = this.f96364e;
                xVar.mo21301x1(bVar, bVar.mo94709M0());
            }
            this.f96363d.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: h1 */
    public C40677c mo94733h1(long j) {
        if (!this.f96365f) {
            this.f96364e.mo94733h1(j);
            return mo94719V();
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f96365f;
    }

    /* renamed from: l0 */
    public C40677c mo94740l0(String str, int i, int i2) {
        C41536l.m120489i(str, "string");
        if (!this.f96365f) {
            this.f96364e.mo94740l0(str, i, i2);
            return mo94719V();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: l1 */
    public long mo94741l1(C40707z zVar) {
        C41536l.m120489i(zVar, "source");
        long j = 0;
        while (true) {
            long g = zVar.mo21305g(this.f96364e, 8192);
            if (g == -1) {
                return j;
            }
            j += g;
            mo94719V();
        }
    }

    public String toString() {
        return "buffer(" + this.f96363d + ')';
    }

    /* renamed from: w0 */
    public C40677c mo94770w0(byte[] bArr) {
        C41536l.m120489i(bArr, "source");
        if (!this.f96365f) {
            this.f96364e.mo94770w0(bArr);
            return mo94719V();
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        C41536l.m120489i(byteBuffer, "source");
        if (!this.f96365f) {
            int write = this.f96364e.write(byteBuffer);
            mo94719V();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: x1 */
    public void mo21301x1(C40672b bVar, long j) {
        C41536l.m120489i(bVar, "source");
        if (!this.f96365f) {
            this.f96364e.mo21301x1(bVar, j);
            mo94719V();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
