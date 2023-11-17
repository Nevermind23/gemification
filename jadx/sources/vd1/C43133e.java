package vd1;

import ed1.C40757w;
import java.util.concurrent.ThreadFactory;

/* renamed from: vd1.e */
public final class C43133e extends C40757w {

    /* renamed from: d */
    private static final C43136h f100636d = new C43136h("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: c */
    final ThreadFactory f100637c;

    public C43133e() {
        this(f100636d);
    }

    /* renamed from: b */
    public C40757w.C40760c mo95051b() {
        return new C43134f(this.f100637c);
    }

    public C43133e(ThreadFactory threadFactory) {
        this.f100637c = threadFactory;
    }
}
