package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.util.C11818g;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Locale;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.q */
public class C11585q extends C11591u {

    /* renamed from: b */
    private static final String f33621b = C11461g.m41875a("NetworkRequestHandler");

    /* renamed from: a */
    private final C11586r f33622a;

    public C11585q(C11586r rVar) {
        this.f33622a = rVar;
    }

    /* renamed from: a */
    private Bitmap m42282a(String str, C11587s sVar) {
        InputStream a = this.f33622a.mo30241a(str);
        Bitmap bitmap = null;
        if (a == null) {
            return null;
        }
        try {
            bitmap = C11591u.m42320a(a, sVar);
            C11818g.m43258a((Closeable) a);
            return bitmap;
        } catch (Exception e) {
            C11461g.m41881a(f33621b, (Throwable) e, "Failed to decode cache into Bitmap.", new Object[0]);
            return bitmap;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30203a(com.salesforce.marketingcloud.media.C11580o r8, com.salesforce.marketingcloud.media.C11587s r9, com.salesforce.marketingcloud.media.C11591u.C11592a r10) {
        /*
            r7 = this;
            android.net.Uri r8 = r9.f33628a
            java.lang.String r8 = r8.toString()
            android.graphics.Bitmap r0 = r7.m42282a(r8, r9)
            if (r0 == 0) goto L_0x0017
            com.salesforce.marketingcloud.media.u$b r8 = new com.salesforce.marketingcloud.media.u$b
            com.salesforce.marketingcloud.media.o$b r9 = com.salesforce.marketingcloud.media.C11580o.C11582b.DISK
            r8.<init>((android.graphics.Bitmap) r0, (com.salesforce.marketingcloud.media.C11580o.C11582b) r9)
            r10.mo30227a((com.salesforce.marketingcloud.media.C11591u.C11593b) r8)
            return
        L_0x0017:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Starting network request for image"
            java.lang.String r3 = "IMAGE"
            com.salesforce.marketingcloud.C11461g.m41880a((java.lang.String) r3, (java.lang.String) r2, (java.lang.Object[]) r1)
            r1 = 1
            java.net.HttpURLConnection.setFollowRedirects(r1)
            r2 = 0
            java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x0083 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x0083 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ Exception -> 0x0083 }
            java.lang.Object r4 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r4)     // Catch:{ Exception -> 0x0083 }
            java.net.URLConnection r4 = (java.net.URLConnection) r4     // Catch:{ Exception -> 0x0083 }
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch:{ Exception -> 0x0083 }
            r4.setUseCaches(r0)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r2 = 30000(0x7530, float:4.2039E-41)
            r4.setConnectTimeout(r2)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.lang.String r2 = "GET"
            r4.setRequestMethod(r2)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.io.InputStream r2 = r4.getInputStream()     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            int r5 = r9.f33631d     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            boolean r5 = com.salesforce.marketingcloud.media.C11587s.C11589b.m42306c(r5)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            if (r5 == 0) goto L_0x0066
            byte[] r5 = com.salesforce.marketingcloud.util.C11818g.m43263a((java.io.InputStream) r2)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r2)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            com.salesforce.marketingcloud.media.r r2 = r7.f33622a     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r6.<init>(r5)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r2.mo30243a(r8, r6)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r2.<init>(r5)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
        L_0x0066:
            android.graphics.Bitmap r9 = com.salesforce.marketingcloud.media.C11591u.m42320a(r2, r9)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r2)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            com.salesforce.marketingcloud.media.u$b r2 = new com.salesforce.marketingcloud.media.u$b     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            com.salesforce.marketingcloud.media.o$b r5 = com.salesforce.marketingcloud.media.C11580o.C11582b.NETWORK     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r2.<init>((android.graphics.Bitmap) r9, (com.salesforce.marketingcloud.media.C11580o.C11582b) r5)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r10.mo30227a((com.salesforce.marketingcloud.media.C11591u.C11593b) r2)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r4.disconnect()
            goto L_0x0095
        L_0x007b:
            r8 = move-exception
            r2 = r4
            goto L_0x0096
        L_0x007e:
            r9 = move-exception
            r2 = r4
            goto L_0x0084
        L_0x0081:
            r8 = move-exception
            goto L_0x0096
        L_0x0083:
            r9 = move-exception
        L_0x0084:
            java.lang.String r4 = "Image network error for URL: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0081 }
            r1[r0] = r8     // Catch:{ all -> 0x0081 }
            com.salesforce.marketingcloud.C11461g.m41885b(r3, r9, r4, r1)     // Catch:{ all -> 0x0081 }
            r10.mo30228a((java.lang.Throwable) r9)     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x0095
            r2.disconnect()
        L_0x0095:
            return
        L_0x0096:
            if (r2 == 0) goto L_0x009b
            r2.disconnect()
        L_0x009b:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.media.C11585q.mo30203a(com.salesforce.marketingcloud.media.o, com.salesforce.marketingcloud.media.s, com.salesforce.marketingcloud.media.u$a):void");
    }

    /* renamed from: a */
    public boolean mo30204a(C11587s sVar) {
        String lowerCase = sVar.f33628a.getScheme().toLowerCase(Locale.ENGLISH);
        return "http".equalsIgnoreCase(lowerCase) || "https".equalsIgnoreCase(lowerCase);
    }
}
