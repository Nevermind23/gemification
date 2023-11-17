package p089g4;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: g4.i */
public class C6221i extends FilterInputStream {

    /* renamed from: d */
    private int f19240d = Integer.MIN_VALUE;

    public C6221i(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: c */
    private long m24724c(long j) {
        int i = this.f19240d;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    /* renamed from: d */
    private void m24725d(long j) {
        int i = this.f19240d;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f19240d = (int) (((long) i) - j);
        }
    }

    public int available() {
        int i = this.f19240d;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f19240d = i;
    }

    public int read() {
        if (m24724c(1) == -1) {
            return -1;
        }
        int read = super.read();
        m24725d(1);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f19240d = Integer.MIN_VALUE;
    }

    public long skip(long j) {
        long c = m24724c(j);
        if (c == -1) {
            return 0;
        }
        long skip = super.skip(c);
        m24725d(skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) {
        int c = (int) m24724c((long) i2);
        if (c == -1) {
            return -1;
        }
        int read = super.read(bArr, i, c);
        m24725d((long) read);
        return read;
    }
}
