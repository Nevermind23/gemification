package dg1;

import java.util.zip.Deflater;
import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.f */
public final class C40684f implements C40705x {

    /* renamed from: d */
    private final C40677c f96334d;

    /* renamed from: e */
    private final Deflater f96335e;

    /* renamed from: f */
    private boolean f96336f;

    public C40684f(C40677c cVar, Deflater deflater) {
        C41536l.m120489i(cVar, "sink");
        C41536l.m120489i(deflater, "deflater");
        this.f96334d = cVar;
        this.f96335e = deflater;
    }

    /* renamed from: a */
    private final void m117737a(boolean z) {
        C40701u W0;
        int i;
        C40672b B = this.f96334d.mo94690B();
        while (true) {
            W0 = B.mo94722W0(1);
            if (z) {
                Deflater deflater = this.f96335e;
                byte[] bArr = W0.f96371a;
                int i2 = W0.f96373c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f96335e;
                byte[] bArr2 = W0.f96371a;
                int i3 = W0.f96373c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                W0.f96373c += i;
                B.mo94706K0(B.mo94709M0() + ((long) i));
                this.f96334d.mo94719V();
            } else if (this.f96335e.needsInput()) {
                break;
            }
        }
        if (W0.f96372b == W0.f96373c) {
            B.f96314d = W0.mo94861b();
            C40703v.m117851b(W0);
        }
    }

    /* renamed from: C */
    public C40669a0 mo94673C() {
        return this.f96334d.mo94673C();
    }

    public void close() {
        if (!this.f96336f) {
            try {
                mo94825k();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f96335e.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.f96334d.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f96336f = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        m117737a(true);
        this.f96334d.flush();
    }

    /* renamed from: k */
    public final void mo94825k() {
        this.f96335e.finish();
        m117737a(false);
    }

    public String toString() {
        return "DeflaterSink(" + this.f96334d + ')';
    }

    /* renamed from: x1 */
    public void mo21301x1(C40672b bVar, long j) {
        C41536l.m120489i(bVar, "source");
        C40683e0.m117729b(bVar.mo94709M0(), 0, j);
        while (j > 0) {
            C40701u uVar = bVar.f96314d;
            C41536l.m120486f(uVar);
            int min = (int) Math.min(j, (long) (uVar.f96373c - uVar.f96372b));
            this.f96335e.setInput(uVar.f96371a, uVar.f96372b, min);
            m117737a(false);
            long j2 = (long) min;
            bVar.mo94706K0(bVar.mo94709M0() - j2);
            int i = uVar.f96372b + min;
            uVar.f96372b = i;
            if (i == uVar.f96373c) {
                bVar.f96314d = uVar.mo94861b();
                C40703v.m117851b(uVar);
            }
            j -= j2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C40684f(C40705x xVar, Deflater deflater) {
        this(C40691m.m117769a(xVar), deflater);
        C41536l.m120489i(xVar, "sink");
        C41536l.m120489i(deflater, "deflater");
    }
}
