package p193o4;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.C2626d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p334z4.C9207a;

/* renamed from: o4.h */
public abstract class C7448h {

    /* renamed from: a */
    private static final String f21720a = "o4.h";

    /* renamed from: b */
    private static final AtomicBoolean f21721b = new AtomicBoolean(false);

    /* renamed from: c */
    private static Boolean f21722c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Boolean f21723d = null;

    /* renamed from: e */
    private static ServiceConnection f21724e;

    /* renamed from: f */
    private static Application.ActivityLifecycleCallbacks f21725f;

    /* renamed from: g */
    private static Intent f21726g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static Object f21727h;

    /* renamed from: o4.h$a */
    static class C7449a implements ServiceConnection {
        C7449a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Object unused = C7448h.f21727h = C7453i.m28320a(C2626d.m10134e(), iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: o4.h$b */
    static class C7450b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: o4.h$b$a */
        class C7451a implements Runnable {
            C7451a() {
            }

            public void run() {
                if (!C9207a.m34024c(this)) {
                    try {
                        Context e = C2626d.m10134e();
                        C7448h.m28317f(e, C7453i.m28328i(e, C7448h.f21727h), false);
                        C7448h.m28317f(e, C7453i.m28329j(e, C7448h.f21727h), true);
                    } catch (Throwable th) {
                        C9207a.m34023b(th, this);
                    }
                }
            }
        }

        /* renamed from: o4.h$b$b */
        class C7452b implements Runnable {
            C7452b() {
            }

            public void run() {
                if (!C9207a.m34024c(this)) {
                    try {
                        Context e = C2626d.m10134e();
                        ArrayList i = C7453i.m28328i(e, C7448h.f21727h);
                        if (i.isEmpty()) {
                            i = C7453i.m28326g(e, C7448h.f21727h);
                        }
                        C7448h.m28317f(e, i, false);
                    } catch (Throwable th) {
                        C9207a.m34023b(th, this);
                    }
                }
            }
        }

        C7450b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            try {
                C2626d.m10142m().execute(new C7451a());
            } catch (Exception unused) {
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
            try {
                if (C7448h.f21723d.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                    C2626d.m10142m().execute(new C7452b());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private static void m28316e() {
        if (f21722c == null) {
            try {
                Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                Boolean bool = Boolean.TRUE;
                f21722c = bool;
                try {
                    Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                    f21723d = bool;
                } catch (ClassNotFoundException unused) {
                    f21723d = Boolean.FALSE;
                }
                C7453i.m28321b();
                f21726g = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                f21724e = new C7449a();
                f21725f = new C7450b();
            } catch (ClassNotFoundException unused2) {
                f21722c = Boolean.FALSE;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m28317f(Context context, ArrayList arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException e) {
                    Log.e(f21720a, "Error parsing in-app purchase data.", e);
                }
            }
            for (Map.Entry entry : C7453i.m28330k(context, arrayList2, f21727h, z).entrySet()) {
                C7442d.m28305f((String) hashMap.get(entry.getKey()), (String) entry.getValue(), z);
            }
        }
    }

    /* renamed from: g */
    private static void m28318g() {
        if (f21721b.compareAndSet(false, true)) {
            Context e = C2626d.m10134e();
            if (e instanceof Application) {
                ((Application) e).registerActivityLifecycleCallbacks(f21725f);
                e.bindService(f21726g, f21724e, 1);
            }
        }
    }

    /* renamed from: h */
    public static void m28319h() {
        m28316e();
        if (f21722c.booleanValue() && C7442d.m28302c()) {
            m28318g();
        }
    }
}
