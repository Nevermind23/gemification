package bg1;

import dg1.C40672b;
import dg1.C40689k;
import dg1.C40707z;
import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C41536l;

/* renamed from: bg1.c */
public final class C40369c implements Closeable {

    /* renamed from: d */
    private final boolean f95878d;

    /* renamed from: e */
    private final C40672b f95879e;

    /* renamed from: f */
    private final Inflater f95880f;

    /* renamed from: g */
    private final C40689k f95881g;

    public C40369c(boolean z) {
        this.f95878d = z;
        C40672b bVar = new C40672b();
        this.f95879e = bVar;
        Inflater inflater = new Inflater(true);
        this.f95880f = inflater;
        this.f95881g = new C40689k((C40707z) bVar, inflater);
    }

    /* renamed from: a */
    public final void mo94406a(C40672b bVar) {
        boolean z;
        C41536l.m120489i(bVar, "buffer");
        if (this.f95879e.mo94709M0() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f95878d) {
                this.f95880f.reset();
            }
            this.f95879e.mo94741l1(bVar);
            this.f95879e.mo94711P(65535);
            long bytesRead = this.f95880f.getBytesRead() + this.f95879e.mo94709M0();
            do {
                this.f95881g.mo94832a(bVar, Long.MAX_VALUE);
            } while (this.f95880f.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void close() {
        this.f95881g.close();
    }
}
