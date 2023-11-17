package p181n5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: n5.k */
class C7241k implements C7233e {

    /* renamed from: a */
    private final C7242a f21426a;

    /* renamed from: b */
    private final C7239i f21427b;

    /* renamed from: c */
    private final Map f21428c;

    /* renamed from: n5.k$a */
    static class C7242a {

        /* renamed from: a */
        private final Context f21429a;

        /* renamed from: b */
        private Map f21430b = null;

        C7242a(Context context) {
            this.f21429a = context;
        }

        /* renamed from: a */
        private Map m27842a(Context context) {
            Bundle d = m27844d(context);
            if (d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String next : d.keySet()) {
                Object obj = d.get(next);
                if ((obj instanceof String) && next.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, next.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map m27843c() {
            if (this.f21430b == null) {
                this.f21430b = m27842a(this.f21429a);
            }
            return this.f21430b;
        }

        /* renamed from: d */
        private static Bundle m27844d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C7232d mo21613b(String str) {
            String str2 = (String) m27843c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (C7232d) Class.forName(str2).asSubclass(C7232d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[]{str2}), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[]{str2}), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[]{str2}), e5);
                return null;
            }
        }
    }

    C7241k(Context context, C7239i iVar) {
        this(new C7242a(context), iVar);
    }

    /* renamed from: a */
    public synchronized C7244m mo21610a(String str) {
        if (this.f21428c.containsKey(str)) {
            return (C7244m) this.f21428c.get(str);
        }
        C7232d b = this.f21426a.mo21613b(str);
        if (b == null) {
            return null;
        }
        C7244m create = b.create(this.f21427b.mo21611a(str));
        this.f21428c.put(str, create);
        return create;
    }

    C7241k(C7242a aVar, C7239i iVar) {
        this.f21428c = new HashMap();
        this.f21426a = aVar;
        this.f21427b = iVar;
    }
}
