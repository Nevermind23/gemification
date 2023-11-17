package gd1;

import android.os.Handler;
import android.os.Looper;
import ed1.C40757w;
import fd1.C40939a;
import java.util.concurrent.Callable;

/* renamed from: gd1.a */
public abstract class C40992a {

    /* renamed from: a */
    private static final C40757w f96800a = C40939a.m118714d(new C40993a());

    /* renamed from: gd1.a$a */
    static class C40993a implements Callable {
        C40993a() {
        }

        /* renamed from: a */
        public C40757w call() {
            return C40994b.f96801a;
        }
    }

    /* renamed from: gd1.a$b */
    private static final class C40994b {

        /* renamed from: a */
        static final C40757w f96801a = new C40995b(new Handler(Looper.getMainLooper()), false);
    }

    /* renamed from: a */
    public static C40757w m118827a() {
        return C40939a.m118715e(f96800a);
    }
}
