package p173ma;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;
import p147ka.C6851h;

/* renamed from: ma.b */
public final class C7148b extends OutputStream {

    /* renamed from: d */
    private final OutputStream f21165d;

    /* renamed from: e */
    private final Timer f21166e;

    /* renamed from: f */
    C6851h f21167f;

    /* renamed from: g */
    long f21168g = -1;

    public C7148b(OutputStream outputStream, C6851h hVar, Timer timer) {
        this.f21165d = outputStream;
        this.f21167f = hVar;
        this.f21166e = timer;
    }

    public void close() {
        long j = this.f21168g;
        if (j != -1) {
            this.f21167f.mo20913p(j);
        }
        this.f21167f.mo20917t(this.f21166e.mo18040d());
        try {
            this.f21165d.close();
        } catch (IOException e) {
            this.f21167f.mo20918u(this.f21166e.mo18040d());
            C7152f.m27527d(this.f21167f);
            throw e;
        }
    }

    public void flush() {
        try {
            this.f21165d.flush();
        } catch (IOException e) {
            this.f21167f.mo20918u(this.f21166e.mo18040d());
            C7152f.m27527d(this.f21167f);
            throw e;
        }
    }

    public void write(int i) {
        try {
            this.f21165d.write(i);
            long j = this.f21168g + 1;
            this.f21168g = j;
            this.f21167f.mo20913p(j);
        } catch (IOException e) {
            this.f21167f.mo20918u(this.f21166e.mo18040d());
            C7152f.m27527d(this.f21167f);
            throw e;
        }
    }

    public void write(byte[] bArr) {
        try {
            this.f21165d.write(bArr);
            long length = this.f21168g + ((long) bArr.length);
            this.f21168g = length;
            this.f21167f.mo20913p(length);
        } catch (IOException e) {
            this.f21167f.mo20918u(this.f21166e.mo18040d());
            C7152f.m27527d(this.f21167f);
            throw e;
        }
    }

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.f21165d.write(bArr, i, i2);
            long j = this.f21168g + ((long) i2);
            this.f21168g = j;
            this.f21167f.mo20913p(j);
        } catch (IOException e) {
            this.f21167f.mo20918u(this.f21166e.mo18040d());
            C7152f.m27527d(this.f21167f);
            throw e;
        }
    }
}
