package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.p016os.C0904b;
import androidx.core.util.C1000a;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1606m;
import androidx.lifecycle.C1619q;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f1019a;

    /* renamed from: b */
    final ArrayDeque f1020b = new ArrayDeque();

    /* renamed from: c */
    private C1000a f1021c;

    /* renamed from: d */
    private OnBackInvokedCallback f1022d;

    /* renamed from: e */
    private OnBackInvokedDispatcher f1023e;

    /* renamed from: f */
    private boolean f1024f = false;

    private class LifecycleOnBackPressedCancellable implements C1606m, C0145a {

        /* renamed from: d */
        private final C1593j f1025d;

        /* renamed from: e */
        private final C0152h f1026e;

        /* renamed from: f */
        private C0145a f1027f;

        LifecycleOnBackPressedCancellable(C1593j jVar, C0152h hVar) {
            this.f1025d = jVar;
            this.f1026e = hVar;
            jVar.mo4906a(this);
        }

        /* renamed from: b */
        public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
            if (aVar == C1593j.C1594a.ON_START) {
                this.f1027f = OnBackPressedDispatcher.this.mo343d(this.f1026e);
            } else if (aVar == C1593j.C1594a.ON_STOP) {
                C0145a aVar2 = this.f1027f;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == C1593j.C1594a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f1025d.mo4909d(this);
            this.f1026e.mo364e(this);
            C0145a aVar = this.f1027f;
            if (aVar != null) {
                aVar.cancel();
                this.f1027f = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    static class C0143a {
        /* renamed from: a */
        static OnBackInvokedCallback m398a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0159o(runnable);
        }

        /* renamed from: b */
        static void m399b(Object obj, int i, Object obj2) {
            C0155k.m415a(obj).registerOnBackInvokedCallback(i, C0156l.m416a(obj2));
        }

        /* renamed from: c */
        static void m400c(Object obj, Object obj2) {
            C0155k.m415a(obj).unregisterOnBackInvokedCallback(C0156l.m416a(obj2));
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$b */
    private class C0144b implements C0145a {

        /* renamed from: d */
        private final C0152h f1029d;

        C0144b(C0152h hVar) {
            this.f1029d = hVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f1020b.remove(this.f1029d);
            this.f1029d.mo364e(this);
            if (C0904b.m3331c()) {
                this.f1029d.mo366g((C1000a) null);
                OnBackPressedDispatcher.this.mo347i();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f1019a = runnable;
        if (C0904b.m3331c()) {
            this.f1021c = new C0153i(this);
            this.f1022d = C0143a.m398a(new C0154j(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m389f(Boolean bool) {
        if (C0904b.m3331c()) {
            mo347i();
        }
    }

    /* renamed from: b */
    public void mo341b(C0152h hVar) {
        mo343d(hVar);
    }

    /* renamed from: c */
    public void mo342c(C1619q qVar, C0152h hVar) {
        C1593j lifecycle = qVar.getLifecycle();
        if (lifecycle.mo4907b() != C1593j.C1598b.DESTROYED) {
            hVar.mo360a(new LifecycleOnBackPressedCancellable(lifecycle, hVar));
            if (C0904b.m3331c()) {
                mo347i();
                hVar.mo366g(this.f1021c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0145a mo343d(C0152h hVar) {
        this.f1020b.add(hVar);
        C0144b bVar = new C0144b(hVar);
        hVar.mo360a(bVar);
        if (C0904b.m3331c()) {
            mo347i();
            hVar.mo366g(this.f1021c);
        }
        return bVar;
    }

    /* renamed from: e */
    public boolean mo344e() {
        Iterator descendingIterator = this.f1020b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (((C0152h) descendingIterator.next()).mo362c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public void mo345g() {
        Iterator descendingIterator = this.f1020b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0152h hVar = (C0152h) descendingIterator.next();
            if (hVar.mo362c()) {
                hVar.mo361b();
                return;
            }
        }
        Runnable runnable = this.f1019a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: h */
    public void mo346h(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.f1023e = onBackInvokedDispatcher;
        mo347i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo347i() {
        boolean e = mo344e();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1023e;
        if (onBackInvokedDispatcher == null) {
            return;
        }
        if (e && !this.f1024f) {
            C0143a.m399b(onBackInvokedDispatcher, 0, this.f1022d);
            this.f1024f = true;
        } else if (!e && this.f1024f) {
            C0143a.m400c(onBackInvokedDispatcher, this.f1022d);
            this.f1024f = false;
        }
    }
}
