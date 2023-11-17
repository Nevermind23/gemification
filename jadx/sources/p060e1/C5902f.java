package p060e1;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e1.f */
abstract class C5902f {

    /* renamed from: a */
    private static Method f18497a;

    /* renamed from: b */
    private static Method f18498b;

    /* renamed from: c */
    private static boolean f18499c;

    /* renamed from: a */
    static void m23718a(Canvas canvas, boolean z) {
        Method method;
        Class<Canvas> cls = Canvas.class;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i != 28) {
            if (!f18499c) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f18497a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = cls.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    f18498b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f18499c = true;
            }
            if (z) {
                try {
                    Method method2 = f18497a;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
            if (!z && (method = f18498b) != null) {
                method.invoke(canvas, new Object[0]);
            }
        } else {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
    }
}
