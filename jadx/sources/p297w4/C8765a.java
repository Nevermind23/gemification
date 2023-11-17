package p297w4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.C2626d;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: w4.a */
public class C8765a {

    /* renamed from: f */
    private static final String f24615f = "w4.a";

    /* renamed from: g */
    private static C8765a f24616g;

    /* renamed from: a */
    private String f24617a;

    /* renamed from: b */
    private String f24618b;

    /* renamed from: c */
    private String f24619c;

    /* renamed from: d */
    private boolean f24620d;

    /* renamed from: e */
    private long f24621e;

    /* renamed from: w4.a$b */
    private static final class C8767b implements IInterface {

        /* renamed from: b */
        private IBinder f24622b;

        C8767b(IBinder iBinder) {
            this.f24622b = iBinder;
        }

        public IBinder asBinder() {
            return this.f24622b;
        }

        /* renamed from: k */
        public String mo24177k() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f24622b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: x */
        public boolean mo24178x() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f24622b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: w4.a$c */
    private static final class C8768c implements ServiceConnection {

        /* renamed from: a */
        private AtomicBoolean f24623a;

        /* renamed from: b */
        private final BlockingQueue f24624b;

        private C8768c() {
            this.f24623a = new AtomicBoolean(false);
            this.f24624b = new LinkedBlockingDeque();
        }

        /* renamed from: a */
        public IBinder mo24179a() {
            if (!this.f24623a.compareAndSet(true, true)) {
                return (IBinder) this.f24624b.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f24624b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    private static C8765a m32613a(C8765a aVar) {
        aVar.f24621e = System.currentTimeMillis();
        f24616g = aVar;
        return aVar;
    }

    /* renamed from: c */
    private static C8765a m32614c(Context context) {
        C8765a d = m32615d(context);
        if (d != null) {
            return d;
        }
        C8765a e = m32616e(context);
        if (e == null) {
            return new C8765a();
        }
        return e;
    }

    /* renamed from: d */
    private static C8765a m32615d(Context context) {
        Method B;
        Object I;
        try {
            if (!m32619j(context) || (B = C8769a0.m32629B("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (I = C8769a0.m32636I((Object) null, B, context)) == null) {
                return null;
            }
            Method A = C8769a0.m32628A(I.getClass(), "getId", new Class[0]);
            Method A2 = C8769a0.m32628A(I.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
            if (A != null) {
                if (A2 != null) {
                    C8765a aVar = new C8765a();
                    aVar.f24618b = (String) C8769a0.m32636I(I, A, new Object[0]);
                    aVar.f24620d = ((Boolean) C8769a0.m32636I(I, A2, new Object[0])).booleanValue();
                    return aVar;
                }
            }
            return null;
        } catch (Exception e) {
            C8769a0.m32648U("android_id", e);
            return null;
        }
    }

    /* renamed from: e */
    private static C8765a m32616e(Context context) {
        C8768c cVar = new C8768c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, cVar, 1)) {
            try {
                C8767b bVar = new C8767b(cVar.mo24179a());
                C8765a aVar = new C8765a();
                aVar.f24618b = bVar.mo24177k();
                aVar.f24620d = bVar.mo24178x();
                return aVar;
            } catch (Exception e) {
                C8769a0.m32648U("android_id", e);
            } finally {
                context.unbindService(cVar);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d A[Catch:{ Exception -> 0x00db, all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071 A[Catch:{ Exception -> 0x00db, all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076 A[Catch:{ Exception -> 0x00db, all -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0101  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p297w4.C8765a m32617h(android.content.Context r12) {
        /*
            java.lang.String r0 = "limit_tracking"
            java.lang.String r1 = "androidid"
            java.lang.String r2 = "aid"
            w4.a r3 = m32614c(r12)
            r4 = 0
            android.os.Looper r5 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r5 == r6) goto L_0x00d1
            w4.a r5 = f24616g     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r5 == 0) goto L_0x002a
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            w4.a r7 = f24616g     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            long r8 = r7.f24621e     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            long r5 = r5 - r8
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x002a
            return r7
        L_0x002a:
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            android.content.pm.PackageManager r5 = r12.getPackageManager()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r6 = "com.facebook.katana.provider.AttributionIdProvider"
            r8 = 0
            android.content.pm.ProviderInfo r5 = r5.resolveContentProvider(r6, r8)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            android.content.pm.PackageManager r6 = r12.getPackageManager()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r9 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r6 = r6.resolveContentProvider(r9, r8)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r5 == 0) goto L_0x0055
            java.lang.String r5 = r5.packageName     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            boolean r5 = p297w4.C8805i.m32787b(r12, r5)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r5 == 0) goto L_0x0055
            java.lang.String r5 = "content://com.facebook.katana.provider.AttributionIdProvider"
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
        L_0x0053:
            r6 = r5
            goto L_0x0067
        L_0x0055:
            if (r6 == 0) goto L_0x0066
            java.lang.String r5 = r6.packageName     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            boolean r5 = p297w4.C8805i.m32787b(r12, r5)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r5 == 0) goto L_0x0066
            java.lang.String r5 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            goto L_0x0053
        L_0x0066:
            r6 = r4
        L_0x0067:
            java.lang.String r5 = m32618i(r12)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r5 == 0) goto L_0x006f
            r3.f24619c = r5     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
        L_0x006f:
            if (r6 != 0) goto L_0x0076
            w4.a r12 = m32613a(r3)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            return r12
        L_0x0076:
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r12 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r12 == 0) goto L_0x00be
            boolean r5 = r12.moveToFirst()     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            if (r5 != 0) goto L_0x008a
            goto L_0x00be
        L_0x008a:
            int r2 = r12.getColumnIndex(r2)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            int r1 = r12.getColumnIndex(r1)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            int r0 = r12.getColumnIndex(r0)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            java.lang.String r2 = r12.getString(r2)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            r3.f24617a = r2     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            if (r1 <= 0) goto L_0x00b6
            if (r0 <= 0) goto L_0x00b6
            java.lang.String r2 = r3.mo24172b()     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            if (r2 != 0) goto L_0x00b6
            java.lang.String r1 = r12.getString(r1)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            r3.f24618b = r1     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            java.lang.String r0 = r12.getString(r0)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            r3.f24620d = r0     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
        L_0x00b6:
            r12.close()
            w4.a r12 = m32613a(r3)
            return r12
        L_0x00be:
            w4.a r0 = m32613a(r3)     // Catch:{ Exception -> 0x00cc, all -> 0x00c8 }
            if (r12 == 0) goto L_0x00c7
            r12.close()
        L_0x00c7:
            return r0
        L_0x00c8:
            r0 = move-exception
            r4 = r12
            r12 = r0
            goto L_0x00ff
        L_0x00cc:
            r0 = move-exception
            r11 = r0
            r0 = r12
            r12 = r11
            goto L_0x00dd
        L_0x00d1:
            com.facebook.FacebookException r12 = new com.facebook.FacebookException     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r0 = "getAttributionIdentifiers cannot be called on the main thread."
            r12.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            throw r12     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
        L_0x00d9:
            r12 = move-exception
            goto L_0x00ff
        L_0x00db:
            r12 = move-exception
            r0 = r4
        L_0x00dd:
            java.lang.String r1 = f24615f     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r2.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = "Caught unexpected exception in getAttributionId(): "
            r2.append(r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x00fd }
            r2.append(r12)     // Catch:{ all -> 0x00fd }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x00fd }
            p297w4.C8769a0.m32649V(r1, r12)     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00fc
            r0.close()
        L_0x00fc:
            return r4
        L_0x00fd:
            r12 = move-exception
            r4 = r0
        L_0x00ff:
            if (r4 == 0) goto L_0x0104
            r4.close()
        L_0x0104:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p297w4.C8765a.m32617h(android.content.Context):w4.a");
    }

    /* renamed from: i */
    private static String m32618i(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        return null;
    }

    /* renamed from: j */
    private static boolean m32619j(Context context) {
        Method B = C8769a0.m32629B("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (B == null) {
            return false;
        }
        Object I = C8769a0.m32636I((Object) null, B, context);
        if (!(I instanceof Integer) || ((Integer) I).intValue() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m32620l(Context context) {
        C8765a h = m32617h(context);
        if (h == null || !h.mo24175k()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public String mo24172b() {
        if (!C2626d.m10152w() || !C2626d.m10133d()) {
            return null;
        }
        return this.f24618b;
    }

    /* renamed from: f */
    public String mo24173f() {
        return this.f24619c;
    }

    /* renamed from: g */
    public String mo24174g() {
        return this.f24617a;
    }

    /* renamed from: k */
    public boolean mo24175k() {
        return this.f24620d;
    }
}
