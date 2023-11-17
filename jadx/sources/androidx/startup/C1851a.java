package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p019b1.C2109a;
import p019b1.C2110b;
import p047d1.C5797b;

/* renamed from: androidx.startup.a */
public final class C1851a {

    /* renamed from: d */
    private static volatile C1851a f5532d;

    /* renamed from: e */
    private static final Object f5533e = new Object();

    /* renamed from: a */
    final Map f5534a = new HashMap();

    /* renamed from: b */
    final Set f5535b = new HashSet();

    /* renamed from: c */
    final Context f5536c;

    C1851a(Context context) {
        this.f5536c = context.getApplicationContext();
    }

    /* renamed from: d */
    private Object m7224d(Class cls, Set set) {
        Object obj;
        if (C5797b.m23311d()) {
            try {
                C5797b.m23308a(cls.getSimpleName());
            } catch (Throwable th) {
                C5797b.m23309b();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f5534a.containsKey(cls)) {
                set.add(cls);
                C2109a aVar = (C2109a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> a = aVar.mo3965a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!this.f5534a.containsKey(cls2)) {
                            m7224d(cls2, set);
                        }
                    }
                }
                obj = aVar.mo3966b(this.f5536c);
                set.remove(cls);
                this.f5534a.put(cls, obj);
            } else {
                obj = this.f5534a.get(cls);
            }
            C5797b.m23309b();
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    /* renamed from: e */
    public static C1851a m7225e(Context context) {
        if (f5532d == null) {
            synchronized (f5533e) {
                if (f5532d == null) {
                    f5532d = new C1851a(context);
                }
            }
        }
        return f5532d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6130a() {
        try {
            C5797b.m23308a("Startup");
            mo6131b(this.f5536c.getPackageManager().getProviderInfo(new ComponentName(this.f5536c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            C5797b.m23309b();
        } catch (PackageManager.NameNotFoundException e) {
            throw new StartupException((Throwable) e);
        } catch (Throwable th) {
            C5797b.m23309b();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6131b(Bundle bundle) {
        String string = this.f5536c.getString(C2110b.f6262a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (C2109a.class.isAssignableFrom(cls)) {
                            this.f5535b.add(cls);
                        }
                    }
                }
                for (Class d : this.f5535b) {
                    m7224d(d, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Object mo6132c(Class cls) {
        Object obj;
        synchronized (f5533e) {
            obj = this.f5534a.get(cls);
            if (obj == null) {
                obj = m7224d(cls, new HashSet());
            }
        }
        return obj;
    }

    /* renamed from: f */
    public Object mo6133f(Class cls) {
        return mo6132c(cls);
    }

    /* renamed from: g */
    public boolean mo6134g(Class cls) {
        return this.f5535b.contains(cls);
    }
}
