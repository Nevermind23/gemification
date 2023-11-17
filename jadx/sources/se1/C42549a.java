package se1;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.C41536l;

/* renamed from: se1.a */
public abstract class C42549a {
    /* renamed from: a */
    public static final long m123185a(InputStream inputStream, OutputStream outputStream, int i) {
        C41536l.m120489i(inputStream, "<this>");
        C41536l.m120489i(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m123186b(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m123185a(inputStream, outputStream, i);
    }
}
