package p260t6;

import com.salesforce.marketingcloud.C11398b;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: t6.l */
public abstract class C8410l {
    /* renamed from: a */
    public static void m31557a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static long m31558b(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    m31557a(inputStream);
                    m31557a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            m31557a(inputStream);
            m31557a(outputStream);
        }
        return j;
    }

    /* renamed from: c */
    public static byte[] m31559c(InputStream inputStream) {
        return m31560d(inputStream, true);
    }

    /* renamed from: d */
    public static byte[] m31560d(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m31558b(inputStream, byteArrayOutputStream, z, C11398b.f33141t);
        return byteArrayOutputStream.toByteArray();
    }
}
