package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.C0799e;
import androidx.core.provider.C0953g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.h */
class C0863h extends C0880p0 {

    /* renamed from: b */
    private static Class f3501b = null;

    /* renamed from: c */
    private static Constructor f3502c = null;

    /* renamed from: d */
    private static Method f3503d = null;

    /* renamed from: e */
    private static Method f3504e = null;

    /* renamed from: f */
    private static boolean f3505f = false;

    C0863h() {
    }

    /* renamed from: h */
    private static boolean m3221h(Object obj, String str, int i, boolean z) {
        m3224k();
        try {
            return ((Boolean) f3503d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: i */
    private static Typeface mo3335i(Object obj) {
        m3224k();
        try {
            Object newInstance = Array.newInstance(f3501b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3504e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    private File m3223j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: k */
    private static void m3224k() {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        Method method2;
        if (!f3505f) {
            f3505f = true;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                constructor = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                cls = null;
                method2 = null;
                constructor = null;
                method = null;
            }
            f3502c = constructor;
            f3501b = cls;
            f3503d = method;
            f3504e = method2;
        }
    }

    /* renamed from: l */
    private static Object m3225l() {
        m3224k();
        try {
            return f3502c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo3331a(Context context, C0799e.C0802c cVar, Resources resources, int i) {
        Object l = m3225l();
        C0799e.C0803d[] a = cVar.mo3269a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C0799e.C0803d dVar = a[i2];
            File e = C0884q0.m3289e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C0884q0.m3287c(e, resources, dVar.mo3271b())) {
                    e.delete();
                    return null;
                } else if (!m3221h(l, e.getPath(), dVar.mo3274e(), dVar.mo3275f())) {
                    return null;
                } else {
                    e.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo3335i(l);
    }

    /* renamed from: b */
    public Typeface mo3332b(Context context, CancellationSignal cancellationSignal, C0953g.C0955b[] bVarArr, int i) {
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        C0953g.C0955b g = mo3334g(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g.mo3404d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File j = m3223j(openFileDescriptor);
                if (j != null) {
                    if (j.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(j);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface c = super.mo3343c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
