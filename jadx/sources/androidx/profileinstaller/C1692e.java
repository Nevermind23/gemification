package androidx.profileinstaller;

import com.salesforce.marketingcloud.C11398b;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* renamed from: androidx.profileinstaller.e */
abstract class C1692e {
    /* renamed from: a */
    static int m5920a(int i) {
        return (((i + 8) - 1) & -8) / 8;
    }

    /* renamed from: b */
    static byte[] m5921b(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    /* renamed from: c */
    static RuntimeException m5922c(String str) {
        return new IllegalStateException(str);
    }

    /* renamed from: d */
    static byte[] m5923d(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw m5922c("Not enough bytes to read: " + i);
            }
        }
        return bArr;
    }

    /* renamed from: e */
    static byte[] m5924e(InputStream inputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[C11398b.f33142u];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = inputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } else {
                    throw m5922c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            if (i3 != i) {
                throw m5922c("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw m5922c("Inflater did not finish");
            }
        } catch (DataFormatException e) {
            throw m5922c(e.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* renamed from: f */
    static String m5925f(InputStream inputStream, int i) {
        return new String(m5923d(inputStream, i), StandardCharsets.UTF_8);
    }

    /* renamed from: g */
    static long m5926g(InputStream inputStream, int i) {
        byte[] d = m5923d(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (d[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* renamed from: h */
    static int m5927h(InputStream inputStream) {
        return (int) m5926g(inputStream, 2);
    }

    /* renamed from: i */
    static long m5928i(InputStream inputStream) {
        return m5926g(inputStream, 4);
    }

    /* renamed from: j */
    static int m5929j(InputStream inputStream) {
        return (int) m5926g(inputStream, 1);
    }

    /* renamed from: k */
    static int m5930k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* renamed from: l */
    static void m5931l(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[C11398b.f33140s];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    static void m5932m(OutputStream outputStream, byte[] bArr) {
        m5936q(outputStream, (long) bArr.length);
        byte[] b = m5921b(bArr);
        m5936q(outputStream, (long) b.length);
        outputStream.write(b);
    }

    /* renamed from: n */
    static void m5933n(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: o */
    static void m5934o(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >> (i2 * 8)) & 255));
        }
        outputStream.write(bArr);
    }

    /* renamed from: p */
    static void m5935p(OutputStream outputStream, int i) {
        m5934o(outputStream, (long) i, 2);
    }

    /* renamed from: q */
    static void m5936q(OutputStream outputStream, long j) {
        m5934o(outputStream, j, 4);
    }

    /* renamed from: r */
    static void m5937r(OutputStream outputStream, int i) {
        m5934o(outputStream, (long) i, 1);
    }
}
