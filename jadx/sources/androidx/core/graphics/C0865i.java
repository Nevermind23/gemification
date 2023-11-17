package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.C0799e;
import androidx.core.provider.C0953g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: androidx.core.graphics.i */
class C0865i extends C0880p0 {

    /* renamed from: b */
    private static final Class f3506b;

    /* renamed from: c */
    private static final Constructor f3507c;

    /* renamed from: d */
    private static final Method f3508d;

    /* renamed from: e */
    private static final Method f3509e;

    static {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            constructor = null;
            method = null;
        }
        f3507c = constructor;
        f3506b = cls;
        f3508d = method;
        f3509e = method2;
    }

    C0865i() {
    }

    /* renamed from: h */
    private static boolean m3229h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f3508d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: i */
    private static Typeface m3230i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f3506b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3509e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static boolean m3231j() {
        Method method = f3508d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private static Object m3232k() {
        try {
            return f3507c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo3331a(Context context, C0799e.C0802c cVar, Resources resources, int i) {
        Object k = m3232k();
        if (k == null) {
            return null;
        }
        for (C0799e.C0803d dVar : cVar.mo3269a()) {
            ByteBuffer b = C0884q0.m3286b(context, resources, dVar.mo3271b());
            if (b == null || !m3229h(k, b, dVar.mo3272c(), dVar.mo3274e(), dVar.mo3275f())) {
                return null;
            }
        }
        return m3230i(k);
    }

    /* renamed from: b */
    public Typeface mo3332b(Context context, CancellationSignal cancellationSignal, C0953g.C0955b[] bVarArr, int i) {
        Object k = m3232k();
        if (k == null) {
            return null;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        for (C0953g.C0955b bVar : bVarArr) {
            Uri d = bVar.mo3404d();
            ByteBuffer byteBuffer = (ByteBuffer) simpleArrayMap.get(d);
            if (byteBuffer == null) {
                byteBuffer = C0884q0.m3290f(context, cancellationSignal, d);
                simpleArrayMap.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m3229h(k, byteBuffer, bVar.mo3403c(), bVar.mo3405e(), bVar.mo3406f())) {
                return null;
            }
        }
        Typeface i2 = m3230i(k);
        if (i2 == null) {
            return null;
        }
        return Typeface.create(i2, i);
    }
}
