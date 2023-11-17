package p117i6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import p286v6.C8708e;

/* renamed from: i6.h */
public final class C6579h {

    /* renamed from: a */
    private final Context f20085a;

    /* renamed from: b */
    private int f20086b;

    /* renamed from: c */
    private int f20087c = 0;

    public C6579h(Context context) {
        this.f20085a = context;
    }

    /* renamed from: a */
    public final synchronized int mo20576a() {
        PackageInfo packageInfo;
        if (this.f20086b == 0) {
            try {
                packageInfo = C8708e.m32461a(this.f20085a).mo24091e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                Log.w("Metadata", sb.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f20086b = packageInfo.versionCode;
            }
        }
        return this.f20086b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo20577b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f20087c     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f20085a     // Catch:{ all -> 0x007f }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x007f }
            android.content.Context r1 = r5.f20085a     // Catch:{ all -> 0x007f }
            v6.d r1 = p286v6.C8708e.m32461a(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            int r1 = r1.mo24088b(r2, r3)     // Catch:{ all -> 0x007f }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x0028
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return r3
        L_0x0028:
            boolean r1 = p260t6.C8413o.m31570h()     // Catch:{ all -> 0x007f }
            r2 = 1
            if (r1 != 0) goto L_0x004c
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x007f }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x004c
            int r1 = r1.size()     // Catch:{ all -> 0x007f }
            if (r1 > 0) goto L_0x0048
            goto L_0x004c
        L_0x0048:
            r5.f20087c = r2     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return r2
        L_0x004c:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x007f }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x007f }
            r1 = 2
            if (r0 == 0) goto L_0x006a
            int r0 = r0.size()     // Catch:{ all -> 0x007f }
            if (r0 > 0) goto L_0x0066
            goto L_0x006a
        L_0x0066:
            r5.f20087c = r1     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return r1
        L_0x006a:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x007f }
            boolean r0 = p260t6.C8413o.m31570h()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x007b
            r5.f20087c = r1     // Catch:{ all -> 0x007f }
            r2 = r1
            goto L_0x007d
        L_0x007b:
            r5.f20087c = r2     // Catch:{ all -> 0x007f }
        L_0x007d:
            monitor-exit(r5)
            return r2
        L_0x007f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i6.C6579h.mo20577b():int");
    }
}
