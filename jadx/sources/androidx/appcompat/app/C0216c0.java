package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.app.c0 */
abstract class C0216c0 {

    /* renamed from: a */
    private static Field f1287a;

    /* renamed from: b */
    private static boolean f1288b;

    /* renamed from: c */
    private static Class f1289c;

    /* renamed from: d */
    private static boolean f1290d;

    /* renamed from: e */
    private static Field f1291e;

    /* renamed from: f */
    private static boolean f1292f;

    /* renamed from: g */
    private static Field f1293g;

    /* renamed from: h */
    private static boolean f1294h;

    /* renamed from: androidx.appcompat.app.c0$a */
    static class C0217a {
        /* renamed from: a */
        static void m680a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    static void m676a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m678c(resources);
            } else {
                m677b(resources);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m677b(android.content.res.Resources r4) {
        /*
            boolean r0 = f1288b
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L_0x001d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0015 }
            f1287a = r2     // Catch:{ NoSuchFieldException -> 0x0015 }
            r2.setAccessible(r0)     // Catch:{ NoSuchFieldException -> 0x0015 }
            goto L_0x001b
        L_0x0015:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L_0x001b:
            f1288b = r0
        L_0x001d:
            java.lang.reflect.Field r0 = f1287a
            if (r0 == 0) goto L_0x002c
            java.lang.Object r4 = r0.get(r4)     // Catch:{ IllegalAccessException -> 0x0026 }
            goto L_0x002d
        L_0x0026:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
        L_0x002c:
            r4 = 0
        L_0x002d:
            if (r4 != 0) goto L_0x0030
            return
        L_0x0030:
            m679d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0216c0.m677b(android.content.res.Resources):void");
    }

    /* renamed from: c */
    private static void m678c(Resources resources) {
        Object obj;
        if (!f1294h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1293g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f1294h = true;
        }
        Field field = f1293g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f1288b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f1287a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f1288b = true;
                }
                Field field2 = f1287a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m679d(obj2);
                }
            }
        }
    }

    /* renamed from: d */
    private static void m679d(Object obj) {
        LongSparseArray longSparseArray;
        if (!f1290d) {
            try {
                f1289c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f1290d = true;
        }
        Class cls = f1289c;
        if (cls != null) {
            if (!f1292f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f1291e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f1292f = true;
            }
            Field field = f1291e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    C0217a.m680a(longSparseArray);
                }
            }
        }
    }
}
