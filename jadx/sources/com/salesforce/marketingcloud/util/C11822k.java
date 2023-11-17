package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.util.k */
public class C11822k implements Closeable {

    /* renamed from: f */
    private static final byte f34325f = 13;

    /* renamed from: g */
    private static final byte f34326g = 10;

    /* renamed from: a */
    private final InputStream f34327a;

    /* renamed from: b */
    final Charset f34328b;

    /* renamed from: c */
    private byte[] f34329c;

    /* renamed from: d */
    private int f34330d;

    /* renamed from: e */
    private int f34331e;

    /* renamed from: com.salesforce.marketingcloud.util.k$a */
    class C11823a extends ByteArrayOutputStream {
        C11823a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0) {
                int i2 = i - 1;
                if (this.buf[i2] == 13) {
                    i = i2;
                }
            }
            return new String(this.buf, 0, i, C11822k.this.f34328b);
        }
    }

    public C11822k(InputStream inputStream) {
        this(inputStream, 8192);
    }

    /* renamed from: a */
    private void m43275a() {
        InputStream inputStream = this.f34327a;
        byte[] bArr = this.f34329c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f34330d = 0;
            this.f34331e = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public boolean mo31685b() {
        return this.f34331e == -1;
    }

    /* renamed from: c */
    public int mo31686c() {
        String d = mo31688d();
        try {
            return Integer.parseInt(d);
        } catch (NumberFormatException unused) {
            throw new IOException("expected an int but was \"" + d + "\"");
        }
    }

    public void close() {
        synchronized (this.f34327a) {
            if (this.f34329c != null) {
                this.f34329c = null;
                this.f34327a.close();
            }
        }
    }

    /* renamed from: d */
    public String mo31688d() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f34327a) {
            if (this.f34329c != null) {
                if (this.f34330d >= this.f34331e) {
                    m43275a();
                }
                for (int i3 = this.f34330d; i3 != this.f34331e; i3++) {
                    byte[] bArr2 = this.f34329c;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f34330d;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f34328b);
                                this.f34330d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f34328b);
                        this.f34330d = i3 + 1;
                        return str2;
                    }
                }
                C11823a aVar = new C11823a((this.f34331e - this.f34330d) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f34329c;
                    int i5 = this.f34330d;
                    aVar.write(bArr3, i5, this.f34331e - i5);
                    this.f34331e = -1;
                    m43275a();
                    i = this.f34330d;
                    while (true) {
                        if (i != this.f34331e) {
                            bArr = this.f34329c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f34330d;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f34330d = i + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C11822k(InputStream inputStream, int i) {
        this(inputStream, i, C11818g.f34319a);
    }

    public C11822k(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null) {
            throw new NullPointerException("in == null");
        } else if (charset == null) {
            throw new NullPointerException("charset == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C11818g.f34319a) || charset.equals(C11818g.f34321c) || charset.equals(C11818g.f34320b)) {
            this.f34327a = inputStream;
            this.f34328b = charset;
            this.f34329c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public C11822k(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }
}
