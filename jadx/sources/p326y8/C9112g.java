package p326y8;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: y8.g */
public final class C9112g {

    /* renamed from: a */
    private final Object f25291a;

    /* renamed from: b */
    private final C9115c f25292b;

    /* renamed from: y8.g$b */
    private static class C9114b implements C9115c {

        /* renamed from: a */
        private final Class f25293a;

        /* renamed from: b */
        private Bundle m33618b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f25293a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f25293a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List mo24678a(Context context) {
            Bundle b = m33618b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String next : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(next)) && next.startsWith("com.google.firebase.components:")) {
                    arrayList.add(next.substring(31));
                }
            }
            return arrayList;
        }

        private C9114b(Class cls) {
            this.f25293a = cls;
        }
    }

    /* renamed from: y8.g$c */
    interface C9115c {
        /* renamed from: a */
        List mo24678a(Object obj);
    }

    C9112g(Object obj, C9115c cVar) {
        this.f25291a = obj;
        this.f25292b = cVar;
    }

    /* renamed from: c */
    public static C9112g m33614c(Context context, Class cls) {
        return new C9112g(context, new C9114b(cls));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static ComponentRegistrar m33615d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }

    /* renamed from: b */
    public List mo24677b() {
        ArrayList arrayList = new ArrayList();
        for (String fVar : this.f25292b.mo24678a(this.f25291a)) {
            arrayList.add(new C9111f(fVar));
        }
        return arrayList;
    }
}
