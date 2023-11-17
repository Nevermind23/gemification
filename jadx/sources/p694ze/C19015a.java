package p694ze;

import fe1.C40940a;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C41536l;
import p652we.C18523b;
import p652we.C18532c;
import p680ye.C18881a;

/* renamed from: ze.a */
public final class C19015a extends C40940a {

    /* renamed from: e */
    private final AtomicInteger f53116e = new AtomicInteger();

    /* renamed from: f */
    private final C18881a.C18884b f53117f;

    public C19015a(C18881a.C18884b bVar) {
        C41536l.m120490j(bVar, "stateManager");
        this.f53117f = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47174a() {
        mo95331c(1);
    }

    /* renamed from: e */
    public Void onError(Throwable th) {
        C41536l.m120490j(th, "throwable");
        throw th;
    }

    /* renamed from: f */
    public void onNext(C18532c.C18533a aVar) {
        C41536l.m120490j(aVar, "lifecycleState");
        if (this.f53116e.decrementAndGet() < 0) {
            this.f53116e.set(0);
        }
        this.f53117f.mo46882n(new C18523b.C18524a.C18525a(aVar));
    }

    /* renamed from: g */
    public final void mo47177g() {
        if (this.f53116e.get() == 0) {
            this.f53116e.incrementAndGet();
            mo95331c(1);
        }
    }

    public void onComplete() {
        this.f53117f.mo46882n(C18523b.C18524a.C18526b.f52024a);
    }
}
