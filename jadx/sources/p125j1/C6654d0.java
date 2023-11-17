package p125j1;

import android.os.Build;
import android.webkit.WebView;
import ig1.C41367a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: j1.d0 */
public abstract class C6654d0 {

    /* renamed from: j1.d0$a */
    private static class C6655a {

        /* renamed from: a */
        static final C6662g0 f20206a = new C6662g0(C6654d0.m26075d().getWebkitToCompatConverter());
    }

    /* renamed from: j1.d0$b */
    private static class C6656b {

        /* renamed from: a */
        static final C6658e0 f20207a = C6654d0.m26072a();
    }

    /* renamed from: a */
    static C6658e0 m26072a() {
        try {
            return new C6660f0((WebViewProviderFactoryBoundaryInterface) C41367a.m120055a(WebViewProviderFactoryBoundaryInterface.class, m26073b()));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (ClassNotFoundException unused) {
            return new C6681z();
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static InvocationHandler m26073b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m26076e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke((Object) null, new Object[0]);
    }

    /* renamed from: c */
    public static C6662g0 m26074c() {
        return C6655a.f20206a;
    }

    /* renamed from: d */
    public static C6658e0 m26075d() {
        return C6656b.f20207a;
    }

    /* renamed from: e */
    public static ClassLoader m26076e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C6671p.m26097b();
        }
        return m26077f().getClass().getClassLoader();
    }

    /* renamed from: f */
    private static Object m26077f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, new Object[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        }
    }
}
