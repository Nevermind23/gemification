package p276u9;

import java.io.OutputStream;

/* renamed from: u9.b */
final class C8651b extends OutputStream {

    /* renamed from: d */
    private long f24445d = 0;

    C8651b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo23993a() {
        return this.f24445d;
    }

    public void write(int i) {
        this.f24445d++;
    }

    public void write(byte[] bArr) {
        this.f24445d += (long) bArr.length;
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f24445d += (long) i2;
    }
}
