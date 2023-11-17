package ff1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import he1.C41225n;
import he1.C41228o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ff1.e */
public abstract class C40948e {

    /* renamed from: a */
    public static final C40947d f96721a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        C40947d dVar = null;
        try {
            C41225n.C41226a aVar = C41225n.f97210d;
            obj = C41225n.m119478a(new C40944c(m118734a(Looper.getMainLooper(), true), (String) null, 2, (DefaultConstructorMarker) null));
        } catch (Throwable th) {
            C41225n.C41226a aVar2 = C41225n.f97210d;
            obj = C41225n.m119478a(C41228o.m119482a(th));
        }
        if (!C41225n.m119480c(obj)) {
            dVar = obj;
        }
        f96721a = dVar;
    }

    /* renamed from: a */
    public static final Handler m118734a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        Class<Looper> cls = Looper.class;
        Class<Handler> cls2 = Handler.class;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = cls2.getDeclaredMethod("createAsync", new Class[]{cls}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return cls2.getDeclaredConstructor(new Class[]{cls, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
