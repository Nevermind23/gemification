package p193o4;

import android.os.AsyncTask;
import java.io.File;
import p334z4.C9207a;

/* renamed from: o4.f */
public class C7445f extends AsyncTask {

    /* renamed from: a */
    private C7446a f21717a;

    /* renamed from: b */
    private File f21718b;

    /* renamed from: c */
    private String f21719c;

    /* renamed from: o4.f$a */
    public interface C7446a {
        /* renamed from: a */
        void mo21848a(File file);
    }

    public C7445f(String str, File file, C7446a aVar) {
        this.f21719c = str;
        this.f21718b = file;
        this.f21717a = aVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        p334z4.C9207a.m34023b(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0048 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean mo21844a(java.lang.String... r5) {
        /*
            r4 = this;
            boolean r5 = p334z4.C9207a.m34024c(r4)
            r0 = 0
            if (r5 == 0) goto L_0x0008
            return r0
        L_0x0008:
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x0048 }
            java.lang.String r1 = r4.f21719c     // Catch:{ Exception -> 0x0048 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0048 }
            java.net.URLConnection r1 = r5.openConnection()     // Catch:{ Exception -> 0x0048 }
            java.lang.Object r1 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r1)     // Catch:{ Exception -> 0x0048 }
            java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch:{ Exception -> 0x0048 }
            int r1 = r1.getContentLength()     // Catch:{ Exception -> 0x0048 }
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0048 }
            java.io.InputStream r5 = com.google.firebase.perf.network.FirebasePerfUrlConnection.openStream(r5)     // Catch:{ Exception -> 0x0048 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0048 }
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0048 }
            r2.readFully(r5)     // Catch:{ Exception -> 0x0048 }
            r2.close()     // Catch:{ Exception -> 0x0048 }
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0048 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0048 }
            java.io.File r3 = r4.f21718b     // Catch:{ Exception -> 0x0048 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0048 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0048 }
            r1.write(r5)     // Catch:{ Exception -> 0x0048 }
            r1.flush()     // Catch:{ Exception -> 0x0048 }
            r1.close()     // Catch:{ Exception -> 0x0048 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0048 }
            return r5
        L_0x0046:
            r5 = move-exception
            goto L_0x004b
        L_0x0048:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0046 }
            return r5
        L_0x004b:
            p334z4.C9207a.m34023b(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p193o4.C7445f.mo21844a(java.lang.String[]):java.lang.Boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21845b(Boolean bool) {
        if (!C9207a.m34024c(this)) {
            try {
                if (bool.booleanValue()) {
                    this.f21717a.mo21848a(this.f21718b);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C9207a.m34024c(this)) {
            return null;
        }
        try {
            return mo21844a((String[]) objArr);
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!C9207a.m34024c(this)) {
            try {
                mo21845b((Boolean) obj);
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }
}
