package p068e9;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p094g9.C6285b0;

/* renamed from: e9.f */
class C6059f implements C6117z {

    /* renamed from: a */
    private final byte[] f18847a;

    /* renamed from: b */
    private final String f18848b;

    /* renamed from: c */
    private final String f18849c;

    C6059f(String str, String str2, byte[] bArr) {
        this.f18848b = str;
        this.f18849c = str2;
        this.f18847a = bArr;
    }

    /* renamed from: d */
    private byte[] m24194d() {
        GZIPOutputStream gZIPOutputStream;
        if (m24195e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(this.f18847a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: e */
    private boolean m24195e() {
        byte[] bArr = this.f18847a;
        return bArr == null || bArr.length == 0;
    }

    /* renamed from: a */
    public C6285b0.C6293d.C6295b mo19551a() {
        byte[] d = m24194d();
        if (d == null) {
            return null;
        }
        return C6285b0.C6293d.C6295b.m24999a().mo19998b(d).mo19999c(this.f18848b).mo19997a();
    }

    /* renamed from: b */
    public String mo19552b() {
        return this.f18849c;
    }

    /* renamed from: c */
    public InputStream mo19553c() {
        if (m24195e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f18847a);
    }
}
