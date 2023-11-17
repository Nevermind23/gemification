package p335z5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.C3941b;
import com.google.android.gms.common.C3943d;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p008a7.C0066e;
import p008a7.C0067f;
import p130j6.C6725a;
import p182n6.C7264i;
import p247s6.C8242b;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: z5.a */
public class C9208a {

    /* renamed from: a */
    C6725a f25628a;

    /* renamed from: b */
    C0067f f25629b;

    /* renamed from: c */
    boolean f25630c;

    /* renamed from: d */
    final Object f25631d = new Object();

    /* renamed from: e */
    C9211c f25632e;

    /* renamed from: f */
    private final Context f25633f;

    /* renamed from: g */
    final long f25634g;

    /* renamed from: z5.a$a */
    public static final class C9209a {

        /* renamed from: a */
        private final String f25635a;

        /* renamed from: b */
        private final boolean f25636b;

        public C9209a(String str, boolean z) {
            this.f25635a = str;
            this.f25636b = z;
        }

        /* renamed from: a */
        public String mo24847a() {
            return this.f25635a;
        }

        /* renamed from: b */
        public boolean mo24848b() {
            return this.f25636b;
        }

        public String toString() {
            String str = this.f25635a;
            boolean z = this.f25636b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public C9208a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        C7264i.m27902k(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f25633f = context;
        this.f25630c = false;
        this.f25634g = j;
    }

    /* renamed from: a */
    public static C9209a m34026a(Context context) {
        C9208a aVar = new C9208a(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.mo24844d(false);
            C9209a f = aVar.m34028f(-1);
            aVar.mo24845e(f, true, Utils.FLOAT_EPSILON, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            aVar.mo24843c();
            return f;
        } catch (Throwable th) {
            aVar.mo24843c();
            throw th;
        }
    }

    /* renamed from: b */
    public static void m34027b(boolean z) {
    }

    /* renamed from: f */
    private final C9209a m34028f(int i) {
        C9209a aVar;
        C7264i.m27901j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f25630c) {
                synchronized (this.f25631d) {
                    C9211c cVar = this.f25632e;
                    if (cVar == null || !cVar.f25641g) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    mo24844d(false);
                    if (!this.f25630c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C7264i.m27902k(this.f25628a);
            C7264i.m27902k(this.f25629b);
            aVar = new C9209a(this.f25629b.mo120s(), this.f25629b.mo119Q(true));
        }
        m34029g();
        return aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m34029g() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f25631d
            monitor-enter(r0)
            z5.c r1 = r5.f25632e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f25640f     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            z5.c r1 = r5.f25632e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r5.f25634g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0020
            z5.c r3 = new z5.c     // Catch:{ all -> 0x0022 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0022 }
            r5.f25632e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p335z5.C9208a.m34029g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24843c() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            p182n6.C7264i.m27901j(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f25633f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            j6.a r0 = r3.f25628a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f25630c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            s6.b r0 = p247s6.C8242b.m31044b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f25633f     // Catch:{ all -> 0x001f }
            j6.a r2 = r3.f25628a     // Catch:{ all -> 0x001f }
            r0.mo23426c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f25630c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f25629b = r0     // Catch:{ all -> 0x0033 }
            r3.f25628a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p335z5.C9208a.mo24843c():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo24844d(boolean z) {
        C7264i.m27901j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f25630c) {
                mo24843c();
            }
            Context context = this.f25633f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int j = C3941b.m14941h().mo11873j(context, C3943d.f12557a);
                if (j != 0) {
                    if (j != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                C6725a aVar = new C6725a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (C8242b.m31044b().mo23425a(context, intent, aVar, 1)) {
                    this.f25628a = aVar;
                    this.f25629b = C0066e.m209k(aVar.mo20739a(10000, TimeUnit.MILLISECONDS));
                    this.f25630c = true;
                    if (z) {
                        m34029g();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new GooglePlayServicesNotAvailableException(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo24845e(C9209a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > Utils.DOUBLE_EPSILON) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", str2);
        if (aVar != null) {
            if (true != aVar.mo24848b()) {
                str2 = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
            }
            hashMap.put("limit_ad_tracking", str2);
            String a = aVar.mo24847a();
            if (a != null) {
                hashMap.put("ad_id_size", Integer.toString(a.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C9210b(this, hashMap).start();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo24843c();
        super.finalize();
    }
}
