package com.salesforce.marketingcloud.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.internal.C11513l;
import java.io.File;

/* renamed from: com.salesforce.marketingcloud.storage.f */
public class C11791f {

    /* renamed from: a */
    final Object f34218a = new Object();

    /* renamed from: b */
    private final Object f34219b = new Object();

    /* renamed from: c */
    private final Context f34220c;

    /* renamed from: d */
    private final SharedPreferences f34221d;

    /* renamed from: e */
    final File f34222e;

    /* renamed from: f */
    private final String f34223f;

    /* renamed from: g */
    private final C11513l f34224g;

    /* renamed from: h */
    private String f34225h;

    /* renamed from: i */
    private boolean f34226i;

    /* renamed from: com.salesforce.marketingcloud.storage.f$a */
    class C11792a extends Thread {
        C11792a(String str) {
            super(str);
        }

        public void run() {
            C11791f.this.mo31610b();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.storage.f$b */
    class C11793b extends C11505g {

        /* renamed from: b */
        final /* synthetic */ String f34228b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11793b(String str, Object[] objArr, String str2) {
            super(str, objArr);
            this.f34228b = str2;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(9:13|12|15|16|17|18|19|20|21) */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
            r4 = r3;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo29760a() {
            /*
                r8 = this;
                com.salesforce.marketingcloud.storage.f r0 = com.salesforce.marketingcloud.storage.C11791f.this
                java.lang.Object r0 = r0.f34218a
                monitor-enter(r0)
                r1 = 1
                r2 = 0
                r3 = 0
                java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0035 }
                com.salesforce.marketingcloud.storage.f r5 = com.salesforce.marketingcloud.storage.C11791f.this     // Catch:{ Exception -> 0x0035 }
                java.io.File r5 = r5.f34222e     // Catch:{ Exception -> 0x0035 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0035 }
                java.lang.String r3 = r8.f34228b     // Catch:{ Exception -> 0x0031, all -> 0x002f }
                if (r3 == 0) goto L_0x001c
                java.nio.charset.Charset r5 = com.salesforce.marketingcloud.util.C11824l.f34334b     // Catch:{ Exception -> 0x0031, all -> 0x002f }
                byte[] r3 = r3.getBytes(r5)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
                goto L_0x001e
            L_0x001c:
                byte[] r3 = new byte[r2]     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            L_0x001e:
                r4.write(r3)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
                java.lang.String r3 = com.salesforce.marketingcloud.storage.C11788e.f34211c     // Catch:{ Exception -> 0x0031, all -> 0x002f }
                java.lang.String r5 = "Gdpr mode [%s] written to file."
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0031, all -> 0x002f }
                java.lang.String r7 = r8.f34228b     // Catch:{ Exception -> 0x0031, all -> 0x002f }
                r6[r2] = r7     // Catch:{ Exception -> 0x0031, all -> 0x002f }
                com.salesforce.marketingcloud.C11461g.m41891d((java.lang.String) r3, (java.lang.String) r5, (java.lang.Object[]) r6)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
                goto L_0x0049
            L_0x002f:
                r1 = move-exception
                goto L_0x004f
            L_0x0031:
                r3 = r4
                goto L_0x0035
            L_0x0033:
                r1 = move-exception
                goto L_0x004e
            L_0x0035:
                java.lang.String r4 = com.salesforce.marketingcloud.storage.C11788e.f34211c     // Catch:{ all -> 0x0033 }
                java.lang.String r5 = "Failed to write gdpr mode to file: "
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0033 }
                com.salesforce.marketingcloud.storage.f r6 = com.salesforce.marketingcloud.storage.C11791f.this     // Catch:{ all -> 0x0033 }
                java.io.File r6 = r6.f34222e     // Catch:{ all -> 0x0033 }
                java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x0033 }
                r1[r2] = r6     // Catch:{ all -> 0x0033 }
                com.salesforce.marketingcloud.C11461g.m41884b((java.lang.String) r4, (java.lang.String) r5, (java.lang.Object[]) r1)     // Catch:{ all -> 0x0033 }
                r4 = r3
            L_0x0049:
                com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r4)     // Catch:{ all -> 0x0053 }
                monitor-exit(r0)     // Catch:{ all -> 0x0053 }
                return
            L_0x004e:
                r4 = r3
            L_0x004f:
                com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r4)     // Catch:{ all -> 0x0053 }
                throw r1     // Catch:{ all -> 0x0053 }
            L_0x0053:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0053 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.C11791f.C11793b.mo29760a():void");
        }
    }

    C11791f(Context context, SharedPreferences sharedPreferences, String str, C11513l lVar) {
        this.f34220c = context;
        this.f34221d = sharedPreferences;
        this.f34224g = lVar;
        this.f34226i = false;
        String str2 = str + "_SFMC_PrivacyMode";
        this.f34223f = str2;
        this.f34222e = new File(context.getNoBackupFilesDir(), str2);
        m43110c();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m43108a(java.io.File r6) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x001b, all -> 0x0019 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x001b, all -> 0x0019 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            java.nio.charset.Charset r4 = com.salesforce.marketingcloud.util.C11824l.f34334b     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            r3.<init>(r1, r4)     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            goto L_0x002d
        L_0x0017:
            r6 = move-exception
            goto L_0x0034
        L_0x0019:
            r6 = move-exception
            goto L_0x0033
        L_0x001b:
            r1 = r0
        L_0x001c:
            java.lang.String r2 = com.salesforce.marketingcloud.storage.C11788e.f34211c     // Catch:{ all -> 0x0031 }
            java.lang.String r3 = "Failed to read gdpr mode from file: "
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0031 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x0031 }
            r5 = 0
            r4[r5] = r6     // Catch:{ all -> 0x0031 }
            com.salesforce.marketingcloud.C11461g.m41884b((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object[]) r4)     // Catch:{ all -> 0x0031 }
        L_0x002d:
            com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r1)
            return r0
        L_0x0031:
            r6 = move-exception
            r0 = r1
        L_0x0033:
            r1 = r0
        L_0x0034:
            com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.C11791f.m43108a(java.io.File):java.lang.String");
    }

    /* renamed from: c */
    private void m43110c() {
        synchronized (this.f34219b) {
            this.f34226i = false;
        }
        new C11792a("gdpr_file_load").start();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r0 = m43108a(r5.f34222e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r0 = com.salesforce.marketingcloud.storage.C11788e.f34211c;
        com.salesforce.marketingcloud.C11461g.m41880a(r0, "Checking SharedPreferences for gdpr mode", new java.lang.Object[0]);
        r1 = r5.f34221d.getString("cc_state", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r1 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r5.f34221d.edit().remove("cc_state").apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        com.salesforce.marketingcloud.C11461g.m41880a(r0, "Checking pre-lollipop location for gdpr mode", new java.lang.Object[0]);
        r0 = new java.io.File(r5.f34220c.getFilesDir(), r5.f34223f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r0.exists() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r1 = m43108a(r0);
        com.salesforce.marketingcloud.util.C11818g.m43264b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        mo31612c(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r2 = r5.f34219b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5.f34225h = r1;
        r5.f34226i = true;
        r5.f34219b.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r5.f34222e.exists() == false) goto L_0x0022;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31610b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f34219b
            monitor-enter(r0)
            boolean r1 = r5.f34226i     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            java.io.File r0 = r5.f34222e
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 == 0) goto L_0x0022
            java.io.File r0 = r5.f34222e
            java.lang.String r0 = m43108a((java.io.File) r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0020
            goto L_0x006a
        L_0x0020:
            r1 = r0
            goto L_0x006a
        L_0x0022:
            java.lang.String r0 = com.salesforce.marketingcloud.storage.C11788e.f34211c
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "Checking SharedPreferences for gdpr mode"
            com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r0, (java.lang.String) r4, (java.lang.Object[]) r3)
            android.content.SharedPreferences r3 = r5.f34221d
            java.lang.String r4 = "cc_state"
            java.lang.String r1 = r3.getString(r4, r1)
            if (r1 == 0) goto L_0x0046
            android.content.SharedPreferences r0 = r5.f34221d
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "cc_state"
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
            r0.apply()
            goto L_0x0067
        L_0x0046:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Checking pre-lollipop location for gdpr mode"
            com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r0, (java.lang.String) r3, (java.lang.Object[]) r2)
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r5.f34220c
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = r5.f34223f
            r0.<init>(r2, r3)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x0067
            java.lang.String r1 = m43108a((java.io.File) r0)
            com.salesforce.marketingcloud.util.C11818g.m43264b(r0)
        L_0x0067:
            r5.mo31612c(r1)
        L_0x006a:
            java.lang.Object r2 = r5.f34219b
            monitor-enter(r2)
            r5.f34225h = r1     // Catch:{ all -> 0x0079 }
            r0 = 1
            r5.f34226i = r0     // Catch:{ all -> 0x0079 }
            java.lang.Object r0 = r5.f34219b     // Catch:{ all -> 0x0079 }
            r0.notifyAll()     // Catch:{ all -> 0x0079 }
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            return
        L_0x0079:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            throw r0
        L_0x007c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.C11791f.mo31610b():void");
    }

    /* renamed from: a */
    public String mo31609a(String str) {
        synchronized (this.f34219b) {
            m43109a();
            String str2 = this.f34225h;
            if (str2 != null) {
                str = str2;
            }
        }
        return str;
    }

    /* renamed from: b */
    public void mo31611b(String str) {
        synchronized (this.f34219b) {
            C11461g.m41891d(C11788e.f34211c, "Updating gdpr mode: %s", str);
            this.f34225h = str;
            mo31612c(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo31612c(String str) {
        this.f34224g.mo30089b().execute(new C11793b("storing_gdpr", new Object[0], str));
    }

    /* renamed from: a */
    private void m43109a() {
        while (!this.f34226i) {
            try {
                this.f34219b.wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
