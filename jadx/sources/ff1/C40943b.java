package ff1;

import android.os.Build;
import ef1.C40799e0;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import me1.C41741a;
import me1.C41752f;

/* renamed from: ff1.b */
public final class C40943b extends C41741a implements C40799e0 {
    private volatile Object _preHandler = this;

    public C40943b() {
        super(C40799e0.f96522c3);
    }

    /* renamed from: y */
    private final Method m118725y() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    /* renamed from: x */
    public void mo95155x(C41752f fVar, Throwable th) {
        boolean z;
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Method y = m118725y();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (y != null) {
                obj = y.invoke((Object) null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
