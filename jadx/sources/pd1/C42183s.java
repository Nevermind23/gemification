package pd1;

import ed1.C40741h;
import ed1.C40742i;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;
import yd1.C43358c;

/* renamed from: pd1.s */
public final class C42183s extends C42144a {

    /* renamed from: pd1.s$a */
    static final class C42184a extends AtomicInteger implements C40742i, C43108c {
        private static final long serialVersionUID = 163080509307634843L;

        /* renamed from: d */
        final C43107b f99235d;

        /* renamed from: e */
        C43108c f99236e;

        /* renamed from: f */
        volatile boolean f99237f;

        /* renamed from: g */
        Throwable f99238g;

        /* renamed from: h */
        volatile boolean f99239h;

        /* renamed from: i */
        final AtomicLong f99240i = new AtomicLong();

        /* renamed from: j */
        final AtomicReference f99241j = new AtomicReference();

        C42184a(C43107b bVar) {
            this.f99235d = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo97660a(boolean z, boolean z2, C43107b bVar, AtomicReference atomicReference) {
            if (this.f99239h) {
                atomicReference.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f99238g;
                if (th != null) {
                    atomicReference.lazySet((Object) null);
                    bVar.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    bVar.onComplete();
                    return true;
                }
            }
        }

        /* renamed from: b */
        public void mo27070b(C43108c cVar) {
            if (C43259d.m124224h(this.f99236e, cVar)) {
                this.f99236e = cVar;
                this.f99235d.mo27070b(this);
                cVar.mo94357l(Long.MAX_VALUE);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo97661c() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                C43107b bVar = this.f99235d;
                AtomicLong atomicLong = this.f99240i;
                AtomicReference atomicReference = this.f99241j;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z3 = this.f99237f;
                        Object andSet = atomicReference.getAndSet((Object) null);
                        if (andSet == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!mo97660a(z3, z2, bVar, atomicReference)) {
                            if (z2) {
                                break;
                            }
                            bVar.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.f99237f;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (mo97660a(z4, z, bVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C43358c.m124398d(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public void cancel() {
            if (!this.f99239h) {
                this.f99239h = true;
                this.f99236e.cancel();
                if (getAndIncrement() == 0) {
                    this.f99241j.lazySet((Object) null);
                }
            }
        }

        /* renamed from: l */
        public void mo94357l(long j) {
            if (C43259d.m124223g(j)) {
                C43358c.m124395a(this.f99240i, j);
                mo97661c();
            }
        }

        public void onComplete() {
            this.f99237f = true;
            mo97661c();
        }

        public void onError(Throwable th) {
            this.f99238g = th;
            this.f99237f = true;
            mo97661c();
        }

        public void onNext(Object obj) {
            this.f99241j.lazySet(obj);
            mo97661c();
        }
    }

    public C42183s(C40741h hVar) {
        super(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        this.f99110e.mo94922E(new C42184a(bVar));
    }
}
