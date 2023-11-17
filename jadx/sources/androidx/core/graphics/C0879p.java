package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.C0799e;
import androidx.core.provider.C0953g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: androidx.core.graphics.p */
public class C0879p extends C0863h {

    /* renamed from: g */
    protected final Class f3510g;

    /* renamed from: h */
    protected final Constructor f3511h;

    /* renamed from: i */
    protected final Method f3512i;

    /* renamed from: j */
    protected final Method f3513j;

    /* renamed from: k */
    protected final Method f3514k;

    /* renamed from: l */
    protected final Method f3515l;

    /* renamed from: m */
    protected final Method f3516m;

    public C0879p() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor constructor;
        Class cls;
        try {
            cls = mo3340v();
            constructor = mo3341w(cls);
            method5 = mo3337s(cls);
            method4 = mo3338t(cls);
            method3 = mo3342x(cls);
            method2 = mo3336r(cls);
            method = mo3339u(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            cls = null;
            constructor = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f3510g = cls;
        this.f3511h = constructor;
        this.f3512i = method5;
        this.f3513j = method4;
        this.f3514k = method3;
        this.f3515l = method2;
        this.f3516m = method;
    }

    /* renamed from: l */
    private Object m3253l() {
        try {
            return this.f3511h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    private void m3254m(Object obj) {
        try {
            this.f3515l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: n */
    private boolean m3255n(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3512i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    private boolean m3256o(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f3513j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p */
    private boolean m3257p(Object obj) {
        try {
            return ((Boolean) this.f3514k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: q */
    private boolean m3258q() {
        if (this.f3512i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.f3512i != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Typeface mo3331a(Context context, C0799e.C0802c cVar, Resources resources, int i) {
        if (!m3258q()) {
            return super.mo3331a(context, cVar, resources, i);
        }
        Object l = m3253l();
        if (l == null) {
            return null;
        }
        for (C0799e.C0803d dVar : cVar.mo3269a()) {
            if (!m3255n(context, l, dVar.mo3270a(), dVar.mo3272c(), dVar.mo3274e(), dVar.mo3275f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.mo3273d()))) {
                m3254m(l);
                return null;
            }
        }
        if (!m3257p(l)) {
            return null;
        }
        return mo3335i(l);
    }

    /* renamed from: b */
    public Typeface mo3332b(Context context, CancellationSignal cancellationSignal, C0953g.C0955b[] bVarArr, int i) {
        Typeface i2;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m3258q()) {
            C0953g.C0955b g = mo3334g(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(g.mo3404d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                C0877o.m3246a();
                Typeface a = C0875n.m3244a(openFileDescriptor.getFileDescriptor()).setWeight(g.mo3405e()).setItalic(g.mo3406f()).build();
                openFileDescriptor.close();
                return a;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map h = C0884q0.m3292h(context, bVarArr, cancellationSignal);
            Object l = m3253l();
            if (l == null) {
                return null;
            }
            boolean z = false;
            for (C0953g.C0955b bVar : bVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) h.get(bVar.mo3404d());
                if (byteBuffer != null) {
                    if (!m3256o(l, byteBuffer, bVar.mo3403c(), bVar.mo3405e(), bVar.mo3406f() ? 1 : 0)) {
                        m3254m(l);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m3254m(l);
                return null;
            } else if (m3257p(l) && (i2 = mo3335i(l)) != null) {
                return Typeface.create(i2, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: d */
    public Typeface mo3333d(Context context, Resources resources, int i, String str, int i2) {
        if (!m3258q()) {
            return super.mo3333d(context, resources, i, str, i2);
        }
        Object l = m3253l();
        if (l == null) {
            return null;
        }
        if (!m3255n(context, l, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m3254m(l);
            return null;
        } else if (!m3257p(l)) {
            return null;
        } else {
            return mo3335i(l);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Typeface mo3335i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3510g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3516m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Method mo3336r(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Method mo3337s(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Method mo3338t(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Method mo3339u(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Class mo3340v() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Constructor mo3341w(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo3342x(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
