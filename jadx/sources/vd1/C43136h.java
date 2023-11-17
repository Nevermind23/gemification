package vd1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: vd1.h */
public final class C43136h extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: d */
    final String f100640d;

    /* renamed from: e */
    final int f100641e;

    /* renamed from: f */
    final boolean f100642f;

    /* renamed from: vd1.h$a */
    static final class C43137a extends Thread implements C43135g {
        C43137a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public C43136h(String str) {
        this(str, 5, false);
    }

    public Thread newThread(Runnable runnable) {
        Thread thread;
        String str = this.f100640d + '-' + incrementAndGet();
        if (this.f100642f) {
            thread = new C43137a(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.f100641e);
        thread.setDaemon(true);
        return thread;
    }

    public String toString() {
        return "RxThreadFactory[" + this.f100640d + "]";
    }

    public C43136h(String str, int i) {
        this(str, i, false);
    }

    public C43136h(String str, int i, boolean z) {
        this.f100640d = str;
        this.f100641e = i;
        this.f100642f = z;
    }
}
