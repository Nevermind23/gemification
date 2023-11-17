package p068e9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: e9.a0 */
abstract class C6050a0 {
    /* renamed from: a */
    private static void m24174a(InputStream inputStream, File file) {
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            C6063h.m24215f(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        C6063h.m24215f(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C6063h.m24215f(gZIPOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    static void m24175b(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6117z zVar = (C6117z) it.next();
            InputStream inputStream = null;
            try {
                inputStream = zVar.mo19553c();
                if (inputStream != null) {
                    m24174a(inputStream, new File(file, zVar.mo19552b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C6063h.m24215f(inputStream);
                throw th;
            }
            C6063h.m24215f(inputStream);
        }
    }
}
