package p068e9;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p094g9.C6285b0;

/* renamed from: e9.v */
class C6113v implements C6117z {

    /* renamed from: a */
    private final File f18996a;

    /* renamed from: b */
    private final String f18997b;

    /* renamed from: c */
    private final String f18998c;

    C6113v(String str, String str2, File file) {
        this.f18997b = str;
        this.f18998c = str2;
        this.f18996a = file;
    }

    /* renamed from: d */
    private byte[] m24438d() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            InputStream c = mo19553c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (c == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (c != null) {
                            c.close();
                        }
                        return null;
                    }
                    while (true) {
                        int read = c.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            c.close();
                            return byteArray;
                        }
                    }
                } catch (Throwable th) {
                    byteArrayOutputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (c != null) {
                    c.close();
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    /* renamed from: a */
    public C6285b0.C6293d.C6295b mo19551a() {
        byte[] d = m24438d();
        if (d != null) {
            return C6285b0.C6293d.C6295b.m24999a().mo19998b(d).mo19999c(this.f18997b).mo19997a();
        }
        return null;
    }

    /* renamed from: b */
    public String mo19552b() {
        return this.f18998c;
    }

    /* renamed from: c */
    public InputStream mo19553c() {
        if (this.f18996a.exists() && this.f18996a.isFile()) {
            try {
                return new FileInputStream(this.f18996a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
