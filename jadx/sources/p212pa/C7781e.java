package p212pa;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pa.e */
public class C7781e implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a */
    private final Handler f22496a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final AtomicReference f22497b;

    /* renamed from: c */
    private final Runnable f22498c;

    /* renamed from: pa.e$a */
    class C7782a implements View.OnAttachStateChangeListener {
        C7782a() {
        }

        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(C7781e.this);
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private C7781e(View view, Runnable runnable) {
        this.f22497b = new AtomicReference(view);
        this.f22498c = runnable;
    }

    /* renamed from: b */
    private static boolean m29482b(View view) {
        return view.getViewTreeObserver().isAlive() && m29483c(view);
    }

    /* renamed from: c */
    private static boolean m29483c(View view) {
        return view.isAttachedToWindow();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m29484d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    /* renamed from: e */
    public static void m29485e(View view, Runnable runnable) {
        C7781e eVar = new C7781e(view, runnable);
        if (Build.VERSION.SDK_INT >= 26 || m29482b(view)) {
            view.getViewTreeObserver().addOnDrawListener(eVar);
        } else {
            view.addOnAttachStateChangeListener(new C7782a());
        }
    }

    public void onDraw() {
        View view = (View) this.f22497b.getAndSet((Object) null);
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C7780d(this, view));
            this.f22496a.postAtFrontOfQueue(this.f22498c);
        }
    }
}
