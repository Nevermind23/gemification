package p068e9;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e9.b0 */
public final class C6052b0 {

    /* renamed from: a */
    private final AtomicInteger f18840a = new AtomicInteger();

    /* renamed from: b */
    private final AtomicInteger f18841b = new AtomicInteger();

    /* renamed from: a */
    public void mo19541a() {
        this.f18841b.getAndIncrement();
    }

    /* renamed from: b */
    public void mo19542b() {
        this.f18840a.getAndIncrement();
    }

    /* renamed from: c */
    public void mo19543c() {
        this.f18841b.set(0);
    }
}
