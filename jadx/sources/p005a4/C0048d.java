package p005a4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a4.d */
public final class C0048d {

    /* renamed from: a */
    private final Context f88a;

    public C0048d(Context context) {
        this.f88a = context;
    }

    /* renamed from: a */
    private ApplicationInfo m179a() {
        return this.f88a.getPackageManager().getApplicationInfo(this.f88a.getPackageName(), 128);
    }

    /* renamed from: c */
    private static C0046b m180c(String str) {
        Object obj;
        try {
            Class<?> cls = Class.forName(str);
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                m181d(cls, e);
                obj = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
            } catch (IllegalAccessException e2) {
                m181d(cls, e2);
                obj = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
            } catch (NoSuchMethodException e3) {
                m181d(cls, e3);
                obj = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
            } catch (InvocationTargetException e4) {
                m181d(cls, e4);
                obj = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: d */
    private static void m181d(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: b */
    public List mo98b() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo a = m179a();
            if (a != null) {
                if (a.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + a.metaData);
                    }
                    for (String next : a.metaData.keySet()) {
                        if ("GlideModule".equals(a.metaData.get(next))) {
                            m180c(next);
                            arrayList.add((Object) null);
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + next);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                    return arrayList;
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
