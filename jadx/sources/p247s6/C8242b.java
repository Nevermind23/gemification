package p247s6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import p182n6.C7264i;
import p182n6.C7284r0;
import p260t6.C8413o;
import p286v6.C8708e;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: s6.b */
public class C8242b {

    /* renamed from: b */
    private static final Object f23446b = new Object();

    /* renamed from: c */
    private static volatile C8242b f23447c;

    /* renamed from: a */
    public final ConcurrentHashMap f23448a = new ConcurrentHashMap();

    private C8242b() {
    }

    /* renamed from: b */
    public static C8242b m31044b() {
        if (f23447c == null) {
            synchronized (f23446b) {
                if (f23447c == null) {
                    f23447c = new C8242b();
                }
            }
        }
        C8242b bVar = f23447c;
        C7264i.m27902k(bVar);
        return bVar;
    }

    /* renamed from: e */
    private static void m31045e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m31046f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C8708e.m32461a(context).mo24089c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m31047g(serviceConnection)) {
            return m31048h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f23448a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean h = m31048h(context, intent, serviceConnection, i, executor);
            if (h) {
                return h;
            }
            return false;
        } finally {
            this.f23448a.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: g */
    private static boolean m31047g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof C7284r0);
    }

    /* renamed from: h */
    private static final boolean m31048h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (!C8413o.m31572j() || executor == null) {
            return context.bindService(intent, serviceConnection, i);
        }
        return context.bindService(intent, i, executor, serviceConnection);
    }

    /* renamed from: a */
    public boolean mo23425a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m31046f(context, context.getClass().getName(), intent, serviceConnection, i, true, (Executor) null);
    }

    /* renamed from: c */
    public void mo23426c(Context context, ServiceConnection serviceConnection) {
        if (!m31047g(serviceConnection) || !this.f23448a.containsKey(serviceConnection)) {
            m31045e(context, serviceConnection);
            return;
        }
        try {
            m31045e(context, (ServiceConnection) this.f23448a.get(serviceConnection));
        } finally {
            this.f23448a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean mo23427d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return m31046f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
