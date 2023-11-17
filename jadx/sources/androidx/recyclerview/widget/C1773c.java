package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1796h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c */
public final class C1773c {

    /* renamed from: a */
    private final Executor f5295a;

    /* renamed from: b */
    private final Executor f5296b;

    /* renamed from: c */
    private final C1796h.C1802f f5297c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    public static final class C1774a {

        /* renamed from: d */
        private static final Object f5298d = new Object();

        /* renamed from: e */
        private static Executor f5299e;

        /* renamed from: a */
        private Executor f5300a;

        /* renamed from: b */
        private Executor f5301b;

        /* renamed from: c */
        private final C1796h.C1802f f5302c;

        public C1774a(C1796h.C1802f fVar) {
            this.f5302c = fVar;
        }

        /* renamed from: a */
        public C1773c mo5900a() {
            if (this.f5301b == null) {
                synchronized (f5298d) {
                    if (f5299e == null) {
                        f5299e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f5301b = f5299e;
            }
            return new C1773c(this.f5300a, this.f5301b, this.f5302c);
        }
    }

    C1773c(Executor executor, Executor executor2, C1796h.C1802f fVar) {
        this.f5295a = executor;
        this.f5296b = executor2;
        this.f5297c = fVar;
    }

    /* renamed from: a */
    public Executor mo5897a() {
        return this.f5296b;
    }

    /* renamed from: b */
    public C1796h.C1802f mo5898b() {
        return this.f5297c;
    }

    /* renamed from: c */
    public Executor mo5899c() {
        return this.f5295a;
    }
}
