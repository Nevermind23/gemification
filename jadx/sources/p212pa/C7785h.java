package p212pa;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pa.h */
public class C7785h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    private final Handler f22503d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private final AtomicReference f22504e;

    /* renamed from: f */
    private final Runnable f22505f;

    /* renamed from: g */
    private final Runnable f22506g;

    private C7785h(View view, Runnable runnable, Runnable runnable2) {
        this.f22504e = new AtomicReference(view);
        this.f22505f = runnable;
        this.f22506g = runnable2;
    }

    /* renamed from: a */
    public static void m29496a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new C7785h(view, runnable, runnable2));
    }

    public boolean onPreDraw() {
        View view = (View) this.f22504e.getAndSet((Object) null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f22503d.post(this.f22505f);
        this.f22503d.postAtFrontOfQueue(this.f22506g);
        return true;
    }
}
