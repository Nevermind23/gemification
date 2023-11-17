package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p019b1.C2109a;

public class ProfileInstallerInitializer implements C2109a {

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    private static class C1683a {
        /* renamed from: c */
        public static void m5900c(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new C1703m(runnable));
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    private static class C1684b {
        /* renamed from: a */
        public static Handler m5901a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    public static class C1685c {
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m5892l(Context context) {
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new C1702l(context));
    }

    /* renamed from: a */
    public List mo3965a() {
        return Collections.emptyList();
    }

    /* renamed from: f */
    public C1685c mo3966b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C1685c();
        }
        mo5129g(context.getApplicationContext());
        return new C1685c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5129g(Context context) {
        C1683a.m5900c(new C1700j(this, context));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void m5889i(Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = C1684b.m5901a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new C1701k(context), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
    }
}
