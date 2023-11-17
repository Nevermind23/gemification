package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.b */
abstract class C5308b {
    /* renamed from: a */
    private static byte[] m20987a(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static InputStream m20988b(InputStream inputStream, long j) {
        return new C5309a(inputStream, j);
    }

    /* renamed from: c */
    private static int m20989c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: d */
    public static byte[] m20990d(InputStream inputStream) {
        return m20991e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    private static byte[] m20991e(InputStream inputStream, Queue queue, int i) {
        int i2;
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = inputStream.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return m20987a(queue, i);
                }
                i3 += read;
                i += read;
            }
            long j = (long) min;
            if (min < 4096) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            min = m20989c(j * ((long) i2));
        }
        if (inputStream.read() == -1) {
            return m20987a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: com.google.firebase.messaging.b$a */
    private static final class C5309a extends FilterInputStream {

        /* renamed from: d */
        private long f17021d;

        /* renamed from: e */
        private long f17022e = -1;

        C5309a(InputStream inputStream, long j) {
            super(inputStream);
            this.f17021d = j;
        }

        public int available() {
            return (int) Math.min((long) this.in.available(), this.f17021d);
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f17022e = this.f17021d;
        }

        public int read() {
            if (this.f17021d == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f17021d--;
            }
            return read;
        }

        public synchronized void reset() {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f17022e != -1) {
                this.in.reset();
                this.f17021d = this.f17022e;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) {
            long skip = this.in.skip(Math.min(j, this.f17021d));
            this.f17021d -= skip;
            return skip;
        }

        public int read(byte[] bArr, int i, int i2) {
            long j = this.f17021d;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
            if (read != -1) {
                this.f17021d -= (long) read;
            }
            return read;
        }
    }
}
