package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p205p3.C7674b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f0 */
public class C2502f0 extends FilterInputStream {

    /* renamed from: d */
    private volatile byte[] f7936d;

    /* renamed from: e */
    private int f7937e;

    /* renamed from: f */
    private int f7938f;

    /* renamed from: g */
    private int f7939g;

    /* renamed from: h */
    private int f7940h;

    /* renamed from: i */
    private final C7674b f7941i;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.f0$a */
    static class C2503a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        C2503a(String str) {
            super(str);
        }
    }

    public C2502f0(InputStream inputStream, C7674b bVar) {
        this(inputStream, bVar, 65536);
    }

    /* renamed from: a */
    private int m9685a(InputStream inputStream, byte[] bArr) {
        int i;
        int i2 = this.f7939g;
        if (i2 == -1 || this.f7940h - i2 >= (i = this.f7938f)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f7939g = -1;
                this.f7940h = 0;
                this.f7937e = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f7937e == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f7941i.mo22387c(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f7936d = bArr2;
            this.f7941i.mo22389e(bArr);
            bArr = bArr2;
        } else if (i2 > 0) {
            System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
        }
        int i3 = this.f7940h - this.f7939g;
        this.f7940h = i3;
        this.f7939g = 0;
        this.f7937e = 0;
        int read2 = inputStream.read(bArr, i3, bArr.length - i3);
        int i4 = this.f7940h;
        if (read2 > 0) {
            i4 += read2;
        }
        this.f7937e = i4;
        return read2;
    }

    /* renamed from: o */
    private static IOException m9686o() {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f7936d == null || inputStream == null) {
            throw m9686o();
        }
        return (this.f7937e - this.f7940h) + inputStream.available();
    }

    public void close() {
        if (this.f7936d != null) {
            this.f7941i.mo22389e(this.f7936d);
            this.f7936d = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: k */
    public synchronized void mo7993k() {
        this.f7938f = this.f7936d.length;
    }

    public synchronized void mark(int i) {
        this.f7938f = Math.max(this.f7938f, i);
        this.f7939g = this.f7940h;
    }

    public boolean markSupported() {
        return true;
    }

    /* renamed from: n */
    public synchronized void mo7996n() {
        if (this.f7936d != null) {
            this.f7941i.mo22389e(this.f7936d);
            this.f7936d = null;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f7936d     // Catch:{ all -> 0x003e }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r2 = r5.f7940h     // Catch:{ all -> 0x003e }
            int r3 = r5.f7937e     // Catch:{ all -> 0x003e }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.m9685a(r1, r0)     // Catch:{ all -> 0x003e }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.f7936d     // Catch:{ all -> 0x003e }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r5.f7936d     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            java.io.IOException r0 = m9686o()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x0026:
            int r1 = r5.f7937e     // Catch:{ all -> 0x003e }
            int r2 = r5.f7940h     // Catch:{ all -> 0x003e }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r5.f7940h = r1     // Catch:{ all -> 0x003e }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0037:
            monitor-exit(r5)
            return r4
        L_0x0039:
            java.io.IOException r0 = m9686o()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2502f0.read():int");
    }

    public synchronized void reset() {
        if (this.f7936d != null) {
            int i = this.f7939g;
            if (-1 != i) {
                this.f7940h = i;
            } else {
                throw new C2503a("Mark has been invalidated, pos: " + this.f7940h + " markLimit: " + this.f7938f);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f7936d;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f7937e;
                int i2 = this.f7940h;
                if (((long) (i - i2)) >= j) {
                    this.f7940h = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f7940h = i;
                if (this.f7939g == -1 || j > ((long) this.f7938f)) {
                    long skip = inputStream.skip(j - j2);
                    if (skip > 0) {
                        this.f7939g = -1;
                    }
                    return j2 + skip;
                } else if (m9685a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f7937e;
                    int i4 = this.f7940h;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f7940h = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) i3)) - ((long) i4);
                    this.f7940h = i3;
                    return j3;
                }
            } else {
                throw m9686o();
            }
        } else {
            throw m9686o();
        }
    }

    C2502f0(InputStream inputStream, C7674b bVar, int i) {
        super(inputStream);
        this.f7939g = -1;
        this.f7941i = bVar;
        this.f7936d = (byte[]) bVar.mo22387c(i, byte[].class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0047, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0054, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f7936d     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008b
            if (r9 != 0) goto L_0x000a
            monitor-exit(r6)
            r7 = 0
            return r7
        L_0x000a:
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0086
            int r2 = r6.f7940h     // Catch:{ all -> 0x0090 }
            int r3 = r6.f7937e     // Catch:{ all -> 0x0090 }
            if (r2 >= r3) goto L_0x0032
            int r4 = r3 - r2
            if (r4 < r9) goto L_0x001a
            r3 = r9
            goto L_0x001b
        L_0x001a:
            int r3 = r3 - r2
        L_0x001b:
            java.lang.System.arraycopy(r0, r2, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r2 = r6.f7940h     // Catch:{ all -> 0x0090 }
            int r2 = r2 + r3
            r6.f7940h = r2     // Catch:{ all -> 0x0090 }
            if (r3 == r9) goto L_0x0030
            int r2 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r2 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r8 = r8 + r3
            int r2 = r9 - r3
            goto L_0x0033
        L_0x0030:
            monitor-exit(r6)
            return r3
        L_0x0032:
            r2 = r9
        L_0x0033:
            int r3 = r6.f7939g     // Catch:{ all -> 0x0090 }
            r4 = -1
            if (r3 != r4) goto L_0x0048
            int r3 = r0.length     // Catch:{ all -> 0x0090 }
            if (r2 < r3) goto L_0x0048
            int r3 = r1.read(r7, r8, r2)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0076
            if (r2 != r9) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            int r4 = r9 - r2
        L_0x0046:
            monitor-exit(r6)
            return r4
        L_0x0048:
            int r3 = r6.m9685a(r1, r0)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0055
            if (r2 != r9) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            int r4 = r9 - r2
        L_0x0053:
            monitor-exit(r6)
            return r4
        L_0x0055:
            byte[] r3 = r6.f7936d     // Catch:{ all -> 0x0090 }
            if (r0 == r3) goto L_0x0063
            byte[] r0 = r6.f7936d     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            java.io.IOException r7 = m9686o()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0063:
            int r3 = r6.f7937e     // Catch:{ all -> 0x0090 }
            int r4 = r6.f7940h     // Catch:{ all -> 0x0090 }
            int r5 = r3 - r4
            if (r5 < r2) goto L_0x006d
            r3 = r2
            goto L_0x006e
        L_0x006d:
            int r3 = r3 - r4
        L_0x006e:
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r4 = r6.f7940h     // Catch:{ all -> 0x0090 }
            int r4 = r4 + r3
            r6.f7940h = r4     // Catch:{ all -> 0x0090 }
        L_0x0076:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x007b
            monitor-exit(r6)
            return r9
        L_0x007b:
            int r4 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r4 != 0) goto L_0x0084
            int r9 = r9 - r2
            monitor-exit(r6)
            return r9
        L_0x0084:
            int r8 = r8 + r3
            goto L_0x0033
        L_0x0086:
            java.io.IOException r7 = m9686o()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x008b:
            java.io.IOException r7 = m9686o()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2502f0.read(byte[], int, int):int");
    }
}
