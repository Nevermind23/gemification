package p060e1;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e1.x0 */
abstract class C6008x0 {

    /* renamed from: a */
    private static boolean f18754a = true;

    /* renamed from: b */
    private static Method f18755b;

    /* renamed from: c */
    private static boolean f18756c;

    /* renamed from: a */
    static int m24106a(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!f18756c) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("getChildDrawingOrder", new Class[]{cls2, cls2});
                f18755b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f18756c = true;
        }
        Method method = f18755b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, new Object[]{Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i)})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* renamed from: b */
    static C6001u0 m24107b(ViewGroup viewGroup) {
        return new C5999t0(viewGroup);
    }

    /* renamed from: c */
    private static void m24108c(ViewGroup viewGroup, boolean z) {
        if (f18754a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f18754a = false;
            }
        }
    }

    /* renamed from: d */
    static void m24109d(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m24108c(viewGroup, z);
        }
    }
}
