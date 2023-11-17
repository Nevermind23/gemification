package p089g4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: g4.d */
public final class C6211d extends InputStream {

    /* renamed from: f */
    private static final Queue f19226f = C6224l.m24737f(0);

    /* renamed from: d */
    private InputStream f19227d;

    /* renamed from: e */
    private IOException f19228e;

    C6211d() {
    }

    /* renamed from: c */
    public static C6211d m24706c(InputStream inputStream) {
        C6211d dVar;
        Queue queue = f19226f;
        synchronized (queue) {
            dVar = (C6211d) queue.poll();
        }
        if (dVar == null) {
            dVar = new C6211d();
        }
        dVar.mo19805m(inputStream);
        return dVar;
    }

    /* renamed from: a */
    public IOException mo19801a() {
        return this.f19228e;
    }

    public int available() {
        return this.f19227d.available();
    }

    public void close() {
        this.f19227d.close();
    }

    /* renamed from: k */
    public void mo19804k() {
        this.f19228e = null;
        this.f19227d = null;
        Queue queue = f19226f;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo19805m(InputStream inputStream) {
        this.f19227d = inputStream;
    }

    public void mark(int i) {
        this.f19227d.mark(i);
    }

    public boolean markSupported() {
        return this.f19227d.markSupported();
    }

    public int read() {
        try {
            return this.f19227d.read();
        } catch (IOException e) {
            this.f19228e = e;
            throw e;
        }
    }

    public synchronized void reset() {
        this.f19227d.reset();
    }

    public long skip(long j) {
        try {
            return this.f19227d.skip(j);
        } catch (IOException e) {
            this.f19228e = e;
            throw e;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.f19227d.read(bArr);
        } catch (IOException e) {
            this.f19228e = e;
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f19227d.read(bArr, i, i2);
        } catch (IOException e) {
            this.f19228e = e;
            throw e;
        }
    }
}
