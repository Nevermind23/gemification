package p140k3;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: k3.c */
class C6783c implements Closeable {

    /* renamed from: d */
    private final InputStream f20394d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Charset f20395e;

    /* renamed from: f */
    private byte[] f20396f;

    /* renamed from: g */
    private int f20397g;

    /* renamed from: h */
    private int f20398h;

    /* renamed from: k3.c$a */
    class C6784a extends ByteArrayOutputStream {
        C6784a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, C6783c.this.f20395e.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C6783c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: k */
    private void m26467k() {
        InputStream inputStream = this.f20394d;
        byte[] bArr = this.f20396f;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f20397g = 0;
            this.f20398h = read;
            return;
        }
        throw new EOFException();
    }

    public void close() {
        synchronized (this.f20394d) {
            if (this.f20396f != null) {
                this.f20396f = null;
                this.f20394d.close();
            }
        }
    }

    /* renamed from: n */
    public boolean mo20842n() {
        return this.f20398h == -1;
    }

    /* renamed from: o */
    public String mo20843o() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f20394d) {
            if (this.f20396f != null) {
                if (this.f20397g >= this.f20398h) {
                    m26467k();
                }
                for (int i3 = this.f20397g; i3 != this.f20398h; i3++) {
                    byte[] bArr2 = this.f20396f;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f20397g;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f20395e.name());
                                this.f20397g = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f20395e.name());
                        this.f20397g = i3 + 1;
                        return str2;
                    }
                }
                C6784a aVar = new C6784a((this.f20398h - this.f20397g) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f20396f;
                    int i5 = this.f20397g;
                    aVar.write(bArr3, i5, this.f20398h - i5);
                    this.f20398h = -1;
                    m26467k();
                    i = this.f20397g;
                    while (true) {
                        if (i != this.f20398h) {
                            bArr = this.f20396f;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f20397g;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f20397g = i + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C6783c(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C6785d.f20400a)) {
            this.f20394d = inputStream;
            this.f20395e = charset;
            this.f20396f = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
