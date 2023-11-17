package p173ma;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import p147ka.C6851h;

/* renamed from: ma.a */
public final class C7147a extends InputStream {

    /* renamed from: d */
    private final InputStream f21159d;

    /* renamed from: e */
    private final C6851h f21160e;

    /* renamed from: f */
    private final Timer f21161f;

    /* renamed from: g */
    private long f21162g = -1;

    /* renamed from: h */
    private long f21163h;

    /* renamed from: i */
    private long f21164i = -1;

    public C7147a(InputStream inputStream, C6851h hVar, Timer timer) {
        this.f21161f = timer;
        this.f21159d = inputStream;
        this.f21160e = hVar;
        this.f21163h = hVar.mo20908f();
    }

    public int available() {
        try {
            return this.f21159d.available();
        } catch (IOException e) {
            this.f21160e.mo20918u(this.f21161f.mo18040d());
            C7152f.m27527d(this.f21160e);
            throw e;
        }
    }

    public void close() {
        long d = this.f21161f.mo18040d();
        if (this.f21164i == -1) {
            this.f21164i = d;
        }
        try {
            this.f21159d.close();
            long j = this.f21162g;
            if (j != -1) {
                this.f21160e.mo20916s(j);
            }
            long j2 = this.f21163h;
            if (j2 != -1) {
                this.f21160e.mo20919v(j2);
            }
            this.f21160e.mo20918u(this.f21164i);
            this.f21160e.mo20906b();
        } catch (IOException e) {
            this.f21160e.mo20918u(this.f21161f.mo18040d());
            C7152f.m27527d(this.f21160e);
            throw e;
        }
    }

    public void mark(int i) {
        this.f21159d.mark(i);
    }

    public boolean markSupported() {
        return this.f21159d.markSupported();
    }

    public int read() {
        try {
            int read = this.f21159d.read();
            long d = this.f21161f.mo18040d();
            if (this.f21163h == -1) {
                this.f21163h = d;
            }
            if (read == -1 && this.f21164i == -1) {
                this.f21164i = d;
                this.f21160e.mo20918u(d);
                this.f21160e.mo20906b();
            } else {
                long j = this.f21162g + 1;
                this.f21162g = j;
                this.f21160e.mo20916s(j);
            }
            return read;
        } catch (IOException e) {
            this.f21160e.mo20918u(this.f21161f.mo18040d());
            C7152f.m27527d(this.f21160e);
            throw e;
        }
    }

    public void reset() {
        try {
            this.f21159d.reset();
        } catch (IOException e) {
            this.f21160e.mo20918u(this.f21161f.mo18040d());
            C7152f.m27527d(this.f21160e);
            throw e;
        }
    }

    public long skip(long j) {
        try {
            long skip = this.f21159d.skip(j);
            long d = this.f21161f.mo18040d();
            if (this.f21163h == -1) {
                this.f21163h = d;
            }
            if (skip == -1 && this.f21164i == -1) {
                this.f21164i = d;
                this.f21160e.mo20918u(d);
            } else {
                long j2 = this.f21162g + skip;
                this.f21162g = j2;
                this.f21160e.mo20916s(j2);
            }
            return skip;
        } catch (IOException e) {
            this.f21160e.mo20918u(this.f21161f.mo18040d());
            C7152f.m27527d(this.f21160e);
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.f21159d.read(bArr, i, i2);
            long d = this.f21161f.mo18040d();
            if (this.f21163h == -1) {
                this.f21163h = d;
            }
            if (read == -1 && this.f21164i == -1) {
                this.f21164i = d;
                this.f21160e.mo20918u(d);
                this.f21160e.mo20906b();
            } else {
                long j = this.f21162g + ((long) read);
                this.f21162g = j;
                this.f21160e.mo20916s(j);
            }
            return read;
        } catch (IOException e) {
            this.f21160e.mo20918u(this.f21161f.mo18040d());
            C7152f.m27527d(this.f21160e);
            throw e;
        }
    }

    public int read(byte[] bArr) {
        try {
            int read = this.f21159d.read(bArr);
            long d = this.f21161f.mo18040d();
            if (this.f21163h == -1) {
                this.f21163h = d;
            }
            if (read == -1 && this.f21164i == -1) {
                this.f21164i = d;
                this.f21160e.mo20918u(d);
                this.f21160e.mo20906b();
            } else {
                long j = this.f21162g + ((long) read);
                this.f21162g = j;
                this.f21160e.mo20916s(j);
            }
            return read;
        } catch (IOException e) {
            this.f21160e.mo20918u(this.f21161f.mo18040d());
            C7152f.m27527d(this.f21160e);
            throw e;
        }
    }
}
