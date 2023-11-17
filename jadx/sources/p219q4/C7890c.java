package p219q4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.C2626d;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p077f5.C6157a;
import p193o4.C7438b;
import p297w4.C8769a0;
import p297w4.C8805i;
import p334z4.C9207a;

/* renamed from: q4.c */
public abstract class C7890c {

    /* renamed from: a */
    private static final String f22848a = "c";

    /* renamed from: b */
    private static Boolean f22849b;

    /* renamed from: q4.c$a */
    enum C7891a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        

        /* renamed from: d */
        private String f22853d;

        private C7891a(String str) {
            this.f22853d = str;
        }

        public String toString() {
            return this.f22853d;
        }
    }

    /* renamed from: q4.c$b */
    static final class C7892b implements ServiceConnection {

        /* renamed from: a */
        private final CountDownLatch f22854a = new CountDownLatch(1);

        /* renamed from: b */
        private IBinder f22855b;

        C7892b() {
        }

        /* renamed from: a */
        public IBinder mo22859a() {
            this.f22854a.await(5, TimeUnit.SECONDS);
            return this.f22855b;
        }

        public void onNullBinding(ComponentName componentName) {
            this.f22854a.countDown();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f22855b = iBinder;
            this.f22854a.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: q4.c$c */
    enum C7893c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    /* renamed from: a */
    private static Intent m29857a(Context context) {
        Class<C7890c> cls = C7890c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && C8805i.m32787b(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) == null || !C8805i.m32787b(context, "com.facebook.wakizashi")) {
                    return null;
                }
                return intent2;
            }
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m29858b() {
        boolean z;
        Class<C7890c> cls = C7890c.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            if (f22849b == null) {
                if (m29857a(C2626d.m10134e()) != null) {
                    z = true;
                } else {
                    z = false;
                }
                f22849b = Boolean.valueOf(z);
            }
            return f22849b.booleanValue();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: c */
    public static C7893c m29859c(String str, List list) {
        Class<C7890c> cls = C7890c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return m29860d(C7891a.CUSTOM_APP_EVENTS, str, list);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    private static C7893c m29860d(C7891a aVar, String str, List list) {
        Context e;
        C7892b bVar;
        Class<C7890c> cls = C7890c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            C7893c cVar = C7893c.SERVICE_NOT_AVAILABLE;
            C7438b.m28293b();
            e = C2626d.m10134e();
            Intent a = m29857a(e);
            if (a == null) {
                return cVar;
            }
            bVar = new C7892b();
            if (!e.bindService(a, bVar, 1)) {
                return C7893c.SERVICE_ERROR;
            }
            try {
                IBinder a2 = bVar.mo22859a();
                if (a2 != null) {
                    C6157a k = C6157a.C6158a.m24575k(a2);
                    Bundle a3 = C7889b.m29854a(aVar, str, list);
                    if (a3 != null) {
                        k.mo19733H(a3);
                        String str2 = f22848a;
                        C8769a0.m32649V(str2, "Successfully sent events to the remote service: " + a3);
                    }
                    cVar = C7893c.OPERATION_SUCCESS;
                }
                e.unbindService(bVar);
                C8769a0.m32649V(f22848a, "Unbound from the remote service");
                return cVar;
            } catch (RemoteException | InterruptedException e2) {
                C7893c cVar2 = C7893c.SERVICE_ERROR;
                String str3 = f22848a;
                C8769a0.m32648U(str3, e2);
                e.unbindService(bVar);
                C8769a0.m32649V(str3, "Unbound from the remote service");
                return cVar2;
            }
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    public static C7893c m29861e(String str) {
        Class<C7890c> cls = C7890c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return m29860d(C7891a.MOBILE_APP_INSTALL, str, new LinkedList());
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }
}
