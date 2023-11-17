package wd1;

import ed1.C40742i;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;
import yd1.C43357b;
import yd1.C43366j;

/* renamed from: wd1.d */
public class C43190d extends AtomicInteger implements C40742i, C43108c {
    private static final long serialVersionUID = -4945028590049415624L;

    /* renamed from: d */
    final C43107b f100746d;

    /* renamed from: e */
    final C43357b f100747e = new C43357b();

    /* renamed from: f */
    final AtomicLong f100748f = new AtomicLong();

    /* renamed from: g */
    final AtomicReference f100749g = new AtomicReference();

    /* renamed from: h */
    final AtomicBoolean f100750h = new AtomicBoolean();

    /* renamed from: i */
    volatile boolean f100751i;

    public C43190d(C43107b bVar) {
        this.f100746d = bVar;
    }

    /* renamed from: b */
    public void mo27070b(C43108c cVar) {
        if (this.f100750h.compareAndSet(false, true)) {
            this.f100746d.mo27070b(this);
            C43259d.m124220c(this.f100749g, this.f100748f, cVar);
            return;
        }
        cVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public void cancel() {
        if (!this.f100751i) {
            C43259d.m124218a(this.f100749g);
        }
    }

    /* renamed from: l */
    public void mo94357l(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        C43259d.m124219b(this.f100749g, this.f100748f, j);
    }

    public void onComplete() {
        this.f100751i = true;
        C43366j.m124414b(this.f100746d, this, this.f100747e);
    }

    public void onError(Throwable th) {
        this.f100751i = true;
        C43366j.m124416d(this.f100746d, th, this, this.f100747e);
    }

    public void onNext(Object obj) {
        C43366j.m124418f(this.f100746d, obj, this, this.f100747e);
    }
}
