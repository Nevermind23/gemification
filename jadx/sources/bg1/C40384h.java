package bg1;

import dg1.C40672b;
import dg1.C40677c;
import dg1.C40681e;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.C41536l;

/* renamed from: bg1.h */
public final class C40384h implements Closeable {

    /* renamed from: d */
    private final boolean f95950d;

    /* renamed from: e */
    private final C40677c f95951e;

    /* renamed from: f */
    private final Random f95952f;

    /* renamed from: g */
    private final boolean f95953g;

    /* renamed from: h */
    private final boolean f95954h;

    /* renamed from: i */
    private final long f95955i;

    /* renamed from: j */
    private final C40672b f95956j = new C40672b();

    /* renamed from: k */
    private final C40672b f95957k;

    /* renamed from: l */
    private boolean f95958l;

    /* renamed from: m */
    private C40367a f95959m;

    /* renamed from: n */
    private final byte[] f95960n;

    /* renamed from: o */
    private final C40672b.C40673a f95961o;

    public C40384h(boolean z, C40677c cVar, Random random, boolean z2, boolean z3, long j) {
        byte[] bArr;
        C41536l.m120489i(cVar, "sink");
        C41536l.m120489i(random, "random");
        this.f95950d = z;
        this.f95951e = cVar;
        this.f95952f = random;
        this.f95953g = z2;
        this.f95954h = z3;
        this.f95955i = j;
        this.f95957k = cVar.mo94690B();
        C40672b.C40673a aVar = null;
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.f95960n = bArr;
        this.f95961o = z ? new C40672b.C40673a() : aVar;
    }

    /* renamed from: c */
    private final void m116943c(int i, C40681e eVar) {
        boolean z;
        if (!this.f95958l) {
            int B = eVar.mo94793B();
            if (((long) B) <= 125) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f95957k.mo94715R0(i | 128);
                if (this.f95950d) {
                    this.f95957k.mo94715R0(B | 128);
                    Random random = this.f95952f;
                    byte[] bArr = this.f95960n;
                    C41536l.m120486f(bArr);
                    random.nextBytes(bArr);
                    this.f95957k.mo94770w0(this.f95960n);
                    if (B > 0) {
                        long M0 = this.f95957k.mo94709M0();
                        this.f95957k.mo94717T(eVar);
                        C40672b bVar = this.f95957k;
                        C40672b.C40673a aVar = this.f95961o;
                        C41536l.m120486f(aVar);
                        bVar.mo94732h0(aVar);
                        this.f95961o.mo94780o(M0);
                        C40381f.f95933a.mo94437b(this.f95961o, this.f95960n);
                        this.f95961o.close();
                    }
                } else {
                    this.f95957k.mo94715R0(B);
                    this.f95957k.mo94717T(eVar);
                }
                this.f95951e.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    /* renamed from: a */
    public final void mo94441a(int i, C40681e eVar) {
        C40681e eVar2 = C40681e.f96328h;
        if (!(i == 0 && eVar == null)) {
            if (i != 0) {
                C40381f.f95933a.mo94438c(i);
            }
            C40672b bVar = new C40672b();
            bVar.mo94707L0(i);
            if (eVar != null) {
                bVar.mo94717T(eVar);
            }
            eVar2 = bVar.mo94743n0();
        }
        try {
            m116943c(8, eVar2);
        } finally {
            this.f95958l = true;
        }
    }

    public void close() {
        C40367a aVar = this.f95959m;
        if (aVar != null) {
            aVar.close();
        }
    }

    /* renamed from: d */
    public final void mo94443d(int i, C40681e eVar) {
        C41536l.m120489i(eVar, "data");
        if (!this.f95958l) {
            this.f95956j.mo94717T(eVar);
            int i2 = 128;
            int i3 = i | 128;
            if (this.f95953g && ((long) eVar.mo94793B()) >= this.f95955i) {
                C40367a aVar = this.f95959m;
                if (aVar == null) {
                    aVar = new C40367a(this.f95954h);
                    this.f95959m = aVar;
                }
                aVar.mo94404a(this.f95956j);
                i3 |= 64;
            }
            long M0 = this.f95956j.mo94709M0();
            this.f95957k.mo94715R0(i3);
            if (!this.f95950d) {
                i2 = 0;
            }
            if (M0 <= 125) {
                this.f95957k.mo94715R0(((int) M0) | i2);
            } else if (M0 <= 65535) {
                this.f95957k.mo94715R0(i2 | 126);
                this.f95957k.mo94707L0((int) M0);
            } else {
                this.f95957k.mo94715R0(i2 | C11051p3.f31760d);
                this.f95957k.mo94766t1(M0);
            }
            if (this.f95950d) {
                Random random = this.f95952f;
                byte[] bArr = this.f95960n;
                C41536l.m120486f(bArr);
                random.nextBytes(bArr);
                this.f95957k.mo94770w0(this.f95960n);
                if (M0 > 0) {
                    C40672b bVar = this.f95956j;
                    C40672b.C40673a aVar2 = this.f95961o;
                    C41536l.m120486f(aVar2);
                    bVar.mo94732h0(aVar2);
                    this.f95961o.mo94780o(0);
                    C40381f.f95933a.mo94437b(this.f95961o, this.f95960n);
                    this.f95961o.close();
                }
            }
            this.f95957k.mo21301x1(this.f95956j, M0);
            this.f95951e.mo94708M();
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: e */
    public final void mo94444e(C40681e eVar) {
        C41536l.m120489i(eVar, "payload");
        m116943c(9, eVar);
    }

    /* renamed from: f */
    public final void mo94445f(C40681e eVar) {
        C41536l.m120489i(eVar, "payload");
        m116943c(10, eVar);
    }
}
