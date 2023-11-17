package g91;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: g91.a0 */
public abstract class C32285a0 {
    /* renamed from: a */
    public static void m95082a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static File m95083b(File file, Bitmap bitmap) {
        return m95084c(file, bitmap, 80);
    }

    /* renamed from: c */
    static File m95084c(File file, Bitmap bitmap, int i) {
        File file2 = new File(file.getAbsolutePath());
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream2);
                fileOutputStream2.flush();
                m95082a(fileOutputStream2);
                return file2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                m95082a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            m95082a(fileOutputStream);
            throw th;
        }
    }
}
