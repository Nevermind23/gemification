package p046d0;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* renamed from: d0.a */
class C5770a {

    /* renamed from: g */
    public static final ThreadLocal f18218g = new ThreadLocal();

    /* renamed from: a */
    private final SimpleArrayMap f18219a = new SimpleArrayMap();

    /* renamed from: b */
    final ArrayList f18220b = new ArrayList();

    /* renamed from: c */
    private final C5771a f18221c = new C5771a();

    /* renamed from: d */
    private C5773c f18222d;

    /* renamed from: e */
    long f18223e = 0;

    /* renamed from: f */
    private boolean f18224f = false;

    /* renamed from: d0.a$a */
    class C5771a {
        C5771a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo18911a() {
            C5770a.this.f18223e = SystemClock.uptimeMillis();
            C5770a aVar = C5770a.this;
            aVar.mo18908c(aVar.f18223e);
            if (C5770a.this.f18220b.size() > 0) {
                C5770a.this.mo18909e().mo18913a();
            }
        }
    }

    /* renamed from: d0.a$b */
    interface C5772b {
        /* renamed from: a */
        boolean mo18912a(long j);
    }

    /* renamed from: d0.a$c */
    static abstract class C5773c {

        /* renamed from: a */
        final C5771a f18226a;

        C5773c(C5771a aVar) {
            this.f18226a = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo18913a();
    }

    /* renamed from: d0.a$d */
    private static class C5774d extends C5773c {

        /* renamed from: b */
        private final Choreographer f18227b = Choreographer.getInstance();

        /* renamed from: c */
        private final Choreographer.FrameCallback f18228c = new C5775a();

        /* renamed from: d0.a$d$a */
        class C5775a implements Choreographer.FrameCallback {
            C5775a() {
            }

            public void doFrame(long j) {
                C5774d.this.f18226a.mo18911a();
            }
        }

        C5774d(C5771a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo18913a() {
            this.f18227b.postFrameCallback(this.f18228c);
        }
    }

    C5770a() {
    }

    /* renamed from: b */
    private void m23211b() {
        if (this.f18224f) {
            for (int size = this.f18220b.size() - 1; size >= 0; size--) {
                if (this.f18220b.get(size) == null) {
                    this.f18220b.remove(size);
                }
            }
            this.f18224f = false;
        }
    }

    /* renamed from: d */
    public static C5770a m23212d() {
        ThreadLocal threadLocal = f18218g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C5770a());
        }
        return (C5770a) threadLocal.get();
    }

    /* renamed from: f */
    private boolean m23213f(C5772b bVar, long j) {
        Long l = (Long) this.f18219a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f18219a.remove(bVar);
        return true;
    }

    /* renamed from: a */
    public void mo18907a(C5772b bVar, long j) {
        if (this.f18220b.size() == 0) {
            mo18909e().mo18913a();
        }
        if (!this.f18220b.contains(bVar)) {
            this.f18220b.add(bVar);
        }
        if (j > 0) {
            this.f18219a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo18908c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f18220b.size(); i++) {
            C5772b bVar = (C5772b) this.f18220b.get(i);
            if (bVar != null && m23213f(bVar, uptimeMillis)) {
                bVar.mo18912a(j);
            }
        }
        m23211b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5773c mo18909e() {
        if (this.f18222d == null) {
            this.f18222d = new C5774d(this.f18221c);
        }
        return this.f18222d;
    }

    /* renamed from: g */
    public void mo18910g(C5772b bVar) {
        this.f18219a.remove(bVar);
        int indexOf = this.f18220b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f18220b.set(indexOf, (Object) null);
            this.f18224f = true;
        }
    }
}
