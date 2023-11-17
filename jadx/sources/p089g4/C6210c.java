package p089g4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: g4.c */
public final class C6210c extends FilterInputStream {

    /* renamed from: d */
    private final long f19224d;

    /* renamed from: e */
    private int f19225e;

    private C6210c(InputStream inputStream, long j) {
        super(inputStream);
        this.f19224d = j;
    }

    /* renamed from: a */
    private int m24704a(int i) {
        if (i >= 0) {
            this.f19225e += i;
        } else if (this.f19224d - ((long) this.f19225e) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f19224d + ", but read: " + this.f19225e);
        }
        return i;
    }

    /* renamed from: c */
    public static InputStream m24705c(InputStream inputStream, long j) {
        return new C6210c(inputStream, j);
    }

    public synchronized int available() {
        return (int) Math.max(this.f19224d - ((long) this.f19225e), (long) this.in.available());
    }

    public synchronized int read() {
        int read;
        read = super.read();
        m24704a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        return m24704a(super.read(bArr, i, i2));
    }
}
