package p133j9;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p027b9.C2184f;

/* renamed from: j9.f */
public class C6762f {

    /* renamed from: a */
    private final File f20317a;

    /* renamed from: b */
    private final File f20318b;

    /* renamed from: c */
    private final File f20319c;

    /* renamed from: d */
    private final File f20320d;

    /* renamed from: e */
    private final File f20321e;

    /* renamed from: f */
    private final File f20322f;

    public C6762f(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f20317a = filesDir;
        if (m26356v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + m26355u(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File q = m26351q(new File(filesDir, str));
        this.f20318b = q;
        this.f20319c = m26351q(new File(q, "open-sessions"));
        this.f20320d = m26351q(new File(q, "reports"));
        this.f20321e = m26351q(new File(q, "priority-reports"));
        this.f20322f = m26351q(new File(q, "native-reports"));
    }

    /* renamed from: a */
    private void m26349a(File file) {
        if (file.exists() && m26353s(file)) {
            C2184f f = C2184f.m8346f();
            f.mo7089b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: n */
    private File m26350n(String str) {
        return m26352r(new File(this.f20319c, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        return r4;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m26351q(java.io.File r4) {
        /*
            java.lang.Class<j9.f> r0 = p133j9.C6762f.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r4.isDirectory()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return r4
        L_0x0011:
            b9.f r1 = p027b9.C2184f.m8346f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Unexpected non-directory file: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "; deleting file and creating new directory."
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo7089b(r2)     // Catch:{ all -> 0x0051 }
            r4.delete()     // Catch:{ all -> 0x0051 }
        L_0x0031:
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x004f
            b9.f r1 = p027b9.C2184f.m8346f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Could not create Crashlytics-specific directory: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo7091d(r2)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)
            return r4
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p133j9.C6762f.m26351q(java.io.File):java.io.File");
    }

    /* renamed from: r */
    private static File m26352r(File file) {
        file.mkdirs();
        return file;
    }

    /* renamed from: s */
    static boolean m26353s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File s : listFiles) {
                m26353s(s);
            }
        }
        return file.delete();
    }

    /* renamed from: t */
    private static List m26354t(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    /* renamed from: u */
    static String m26355u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    /* renamed from: v */
    private static boolean m26356v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: b */
    public void mo20790b() {
        m26349a(new File(this.f20317a, ".com.google.firebase.crashlytics"));
        m26349a(new File(this.f20317a, ".com.google.firebase.crashlytics-ndk"));
        if (m26356v()) {
            m26349a(new File(this.f20317a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    /* renamed from: c */
    public boolean mo20791c(String str) {
        return m26353s(new File(this.f20319c, str));
    }

    /* renamed from: d */
    public List mo20792d() {
        return m26354t(this.f20319c.list());
    }

    /* renamed from: e */
    public File mo20793e(String str) {
        return new File(this.f20318b, str);
    }

    /* renamed from: f */
    public List mo20794f(FilenameFilter filenameFilter) {
        return m26354t(this.f20318b.listFiles(filenameFilter));
    }

    /* renamed from: g */
    public File mo20795g(String str) {
        return new File(this.f20322f, str);
    }

    /* renamed from: h */
    public List mo20796h() {
        return m26354t(this.f20322f.listFiles());
    }

    /* renamed from: i */
    public File mo20797i(String str) {
        return m26352r(new File(m26350n(str), "native"));
    }

    /* renamed from: j */
    public File mo20798j(String str) {
        return new File(this.f20321e, str);
    }

    /* renamed from: k */
    public List mo20799k() {
        return m26354t(this.f20321e.listFiles());
    }

    /* renamed from: l */
    public File mo20800l(String str) {
        return new File(this.f20320d, str);
    }

    /* renamed from: m */
    public List mo20801m() {
        return m26354t(this.f20320d.listFiles());
    }

    /* renamed from: o */
    public File mo20802o(String str, String str2) {
        return new File(m26350n(str), str2);
    }

    /* renamed from: p */
    public List mo20803p(String str, FilenameFilter filenameFilter) {
        return m26354t(m26350n(str).listFiles(filenameFilter));
    }
}
