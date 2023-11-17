package p003a2;

import com.salesforce.marketingcloud.C11398b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import p048d2.C5804f;

/* renamed from: a2.g */
public class C0023g {

    /* renamed from: a */
    private final C0021e f56a;

    public C0023g(C0021e eVar) {
        this.f56a = eVar;
    }

    /* renamed from: b */
    private static String m124b(String str, C0019c cVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? cVar.mo76b() : cVar.f55d);
        return sb.toString();
    }

    /* renamed from: c */
    private File m125c(String str) {
        File file = new File(m126d(), m124b(str, C0019c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m126d(), m124b(str, C0019c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: d */
    private File m126d() {
        File a = this.f56a.mo78a();
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair mo79a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = r5.m125c(r6)     // Catch:{ FileNotFoundException -> 0x0044 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{  }
            r2.<init>(r1)     // Catch:{  }
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r3 = ".zip"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x001c
            a2.c r0 = p003a2.C0019c.ZIP
            goto L_0x001e
        L_0x001c:
            a2.c r0 = p003a2.C0019c.JSON
        L_0x001e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cache hit for "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " at "
            r3.append(r6)
            java.lang.String r6 = r1.getAbsolutePath()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            p048d2.C5804f.m23332a(r6)
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r0, r2)
            return r6
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.C0023g.mo79a(java.lang.String):android.util.Pair");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo80e(String str, C0019c cVar) {
        File file = new File(m126d(), m124b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        C5804f.m23332a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            C5804f.m23334c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public File mo81f(String str, InputStream inputStream, C0019c cVar) {
        FileOutputStream fileOutputStream;
        File file = new File(m126d(), m124b(str, cVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[C11398b.f33141t];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
