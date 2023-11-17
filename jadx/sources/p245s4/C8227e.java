package p245s4;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p154l4.C6886d;
import p193o4.C7438b;
import p334z4.C9207a;

/* renamed from: s4.e */
final class C8227e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: g */
    private static final Map f23407g = new HashMap();

    /* renamed from: d */
    private WeakReference f23408d;

    /* renamed from: e */
    private final Handler f23409e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private AtomicBoolean f23410f = new AtomicBoolean(false);

    /* renamed from: s4.e$a */
    class C8228a implements Runnable {
        C8228a() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    View e = C7438b.m28296e((Activity) C8227e.m31011a(C8227e.this).get());
                    Activity activity = (Activity) C8227e.m31011a(C8227e.this).get();
                    if (e == null) {
                        return;
                    }
                    if (activity != null) {
                        for (View view : C8224c.m30998a(e)) {
                            if (!C6886d.m26733g(view)) {
                                String d = C8224c.m31001d(view);
                                if (!d.isEmpty() && d.length() <= 300) {
                                    C8229f.m31019c(view, e, activity.getLocalClassName());
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    private C8227e(Activity activity) {
        this.f23408d = new WeakReference(activity);
    }

    /* renamed from: a */
    static /* synthetic */ WeakReference m31011a(C8227e eVar) {
        Class<C8227e> cls = C8227e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return eVar.f23408d;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    private void m31012b() {
        if (!C9207a.m34024c(this)) {
            try {
                C8228a aVar = new C8228a();
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    aVar.run();
                } else {
                    this.f23409e.post(aVar);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: c */
    private void m31013c() {
        View e;
        if (!C9207a.m34024c(this)) {
            try {
                if (!this.f23410f.getAndSet(true) && (e = C7438b.m28296e((Activity) this.f23408d.get())) != null) {
                    ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        m31012b();
                        Activity activity = (Activity) this.f23408d.get();
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: d */
    static void m31014d(Activity activity) {
        Class<C8227e> cls = C8227e.class;
        if (!C9207a.m34024c(cls)) {
            try {
                int hashCode = activity.hashCode();
                Map map = f23407g;
                if (!map.containsKey(Integer.valueOf(hashCode))) {
                    C8227e eVar = new C8227e(activity);
                    map.put(Integer.valueOf(hashCode), eVar);
                    eVar.m31013c();
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: e */
    private void m31015e() {
        View e;
        if (!C9207a.m34024c(this)) {
            try {
                if (this.f23410f.getAndSet(false) && (e = C7438b.m28296e((Activity) this.f23408d.get())) != null) {
                    ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: f */
    static void m31016f(Activity activity) {
        Class<C8227e> cls = C8227e.class;
        if (!C9207a.m34024c(cls)) {
            try {
                int hashCode = activity.hashCode();
                Map map = f23407g;
                if (map.containsKey(Integer.valueOf(hashCode))) {
                    map.remove(Integer.valueOf(hashCode));
                    ((C8227e) map.get(Integer.valueOf(hashCode))).m31015e();
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    public void onGlobalLayout() {
        if (!C9207a.m34024c(this)) {
            try {
                m31012b();
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }
}
