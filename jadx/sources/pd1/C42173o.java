package pd1;

import ae1.C40293a;
import ed1.C40741h;
import ed1.C40742i;
import ed1.C40757w;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicLong;
import md1.C41732a;
import md1.C41737f;
import md1.C41740i;
import p469io.reactivex.exceptions.MissingBackpressureException;
import ud1.C43062a;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43256a;
import xd1.C43259d;
import yd1.C43358c;

/* renamed from: pd1.o */
public final class C42173o extends C42144a {

    /* renamed from: f */
    final C40757w f99194f;

    /* renamed from: g */
    final boolean f99195g;

    /* renamed from: h */
    final int f99196h;

    /* renamed from: pd1.o$a */
    static abstract class C42174a extends C43256a implements C40742i, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* renamed from: d */
        final C40757w.C40760c f99197d;

        /* renamed from: e */
        final boolean f99198e;

        /* renamed from: f */
        final int f99199f;

        /* renamed from: g */
        final int f99200g;

        /* renamed from: h */
        final AtomicLong f99201h = new AtomicLong();

        /* renamed from: i */
        C43108c f99202i;

        /* renamed from: j */
        C41740i f99203j;

        /* renamed from: k */
        volatile boolean f99204k;

        /* renamed from: l */
        volatile boolean f99205l;

        /* renamed from: m */
        Throwable f99206m;

        /* renamed from: n */
        int f99207n;

        /* renamed from: o */
        long f99208o;

        /* renamed from: p */
        boolean f99209p;

        C42174a(C40757w.C40760c cVar, boolean z, int i) {
            this.f99197d = cVar;
            this.f99198e = z;
            this.f99199f = i;
            this.f99200g = i - (i >> 2);
        }

        public final void cancel() {
            if (!this.f99204k) {
                this.f99204k = true;
                this.f99202i.cancel();
                this.f99197d.dispose();
                if (!this.f99209p && getAndIncrement() == 0) {
                    this.f99203j.clear();
                }
            }
        }

        public final void clear() {
            this.f99203j.clear();
        }

        /* renamed from: e */
        public final int mo96260e(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f99209p = true;
            return 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final boolean mo97652g(boolean z, boolean z2, C43107b bVar) {
            if (this.f99204k) {
                clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f99198e) {
                    Throwable th = this.f99206m;
                    if (th != null) {
                        this.f99204k = true;
                        clear();
                        bVar.onError(th);
                        this.f99197d.dispose();
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.f99204k = true;
                        bVar.onComplete();
                        this.f99197d.dispose();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    this.f99204k = true;
                    Throwable th2 = this.f99206m;
                    if (th2 != null) {
                        bVar.onError(th2);
                    } else {
                        bVar.onComplete();
                    }
                    this.f99197d.dispose();
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract void mo97653h();

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public abstract void mo97654i();

        public final boolean isEmpty() {
            return this.f99203j.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public abstract void mo97655k();

        /* renamed from: l */
        public final void mo94357l(long j) {
            if (C43259d.m124223g(j)) {
                C43358c.m124395a(this.f99201h, j);
                mo97656m();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public final void mo97656m() {
            if (getAndIncrement() == 0) {
                this.f99197d.mo95058b(this);
            }
        }

        public final void onComplete() {
            if (!this.f99205l) {
                this.f99205l = true;
                mo97656m();
            }
        }

        public final void onError(Throwable th) {
            if (this.f99205l) {
                C40293a.m116722s(th);
                return;
            }
            this.f99206m = th;
            this.f99205l = true;
            mo97656m();
        }

        public final void onNext(Object obj) {
            if (!this.f99205l) {
                if (this.f99207n == 2) {
                    mo97656m();
                    return;
                }
                if (!this.f99203j.mo96261f(obj)) {
                    this.f99202i.cancel();
                    this.f99206m = new MissingBackpressureException("Queue is full?!");
                    this.f99205l = true;
                }
                mo97656m();
            }
        }

        public final void run() {
            if (this.f99209p) {
                mo97654i();
            } else if (this.f99207n == 1) {
                mo97655k();
            } else {
                mo97653h();
            }
        }
    }

    /* renamed from: pd1.o$b */
    static final class C42175b extends C42174a {
        private static final long serialVersionUID = 644624475404284533L;

        /* renamed from: q */
        final C41732a f99210q;

        /* renamed from: r */
        long f99211r;

        C42175b(C41732a aVar, C40757w.C40760c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.f99210q = aVar;
        }

        /* renamed from: b */
        public void mo27070b(C43108c cVar) {
            if (C43259d.m124224h(this.f99202i, cVar)) {
                this.f99202i = cVar;
                if (cVar instanceof C41737f) {
                    C41737f fVar = (C41737f) cVar;
                    int e = fVar.mo96260e(7);
                    if (e == 1) {
                        this.f99207n = 1;
                        this.f99203j = fVar;
                        this.f99205l = true;
                        this.f99210q.mo27070b(this);
                        return;
                    } else if (e == 2) {
                        this.f99207n = 2;
                        this.f99203j = fVar;
                        this.f99210q.mo27070b(this);
                        cVar.mo94357l((long) this.f99199f);
                        return;
                    }
                }
                this.f99203j = new C43062a(this.f99199f);
                this.f99210q.mo27070b(this);
                cVar.mo94357l((long) this.f99199f);
            }
        }

        /* renamed from: c */
        public Object mo96258c() {
            Object c = this.f99203j.mo96258c();
            if (!(c == null || this.f99207n == 1)) {
                long j = this.f99211r + 1;
                if (j == ((long) this.f99200g)) {
                    this.f99211r = 0;
                    this.f99202i.mo94357l(j);
                } else {
                    this.f99211r = j;
                }
            }
            return c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo97653h() {
            int i;
            boolean z;
            C41732a aVar = this.f99210q;
            C41740i iVar = this.f99203j;
            long j = this.f99208o;
            long j2 = this.f99211r;
            int i2 = 1;
            while (true) {
                long j3 = this.f99201h.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.f99205l;
                    try {
                        Object c = iVar.mo96258c();
                        if (c == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo97652g(z2, z, aVar)) {
                            if (z) {
                                break;
                            }
                            if (aVar.mo96525d(c)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.f99200g)) {
                                this.f99202i.mo94357l(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C41300a.m119661b(th);
                        this.f99204k = true;
                        this.f99202i.cancel();
                        iVar.clear();
                        aVar.onError(th);
                        this.f99197d.dispose();
                        return;
                    }
                }
                if (i != 0 || !mo97652g(this.f99205l, iVar.isEmpty(), aVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f99208o = j;
                        this.f99211r = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo97654i() {
            int i = 1;
            while (!this.f99204k) {
                boolean z = this.f99205l;
                this.f99210q.onNext((Object) null);
                if (z) {
                    this.f99204k = true;
                    Throwable th = this.f99206m;
                    if (th != null) {
                        this.f99210q.onError(th);
                    } else {
                        this.f99210q.onComplete();
                    }
                    this.f99197d.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo97655k() {
            C41732a aVar = this.f99210q;
            C41740i iVar = this.f99203j;
            long j = this.f99208o;
            int i = 1;
            while (true) {
                long j2 = this.f99201h.get();
                while (j != j2) {
                    try {
                        Object c = iVar.mo96258c();
                        if (!this.f99204k) {
                            if (c == null) {
                                this.f99204k = true;
                                aVar.onComplete();
                                this.f99197d.dispose();
                                return;
                            } else if (aVar.mo96525d(c)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C41300a.m119661b(th);
                        this.f99204k = true;
                        this.f99202i.cancel();
                        aVar.onError(th);
                        this.f99197d.dispose();
                        return;
                    }
                }
                if (!this.f99204k) {
                    if (iVar.isEmpty()) {
                        this.f99204k = true;
                        aVar.onComplete();
                        this.f99197d.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f99208o = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: pd1.o$c */
    static final class C42176c extends C42174a {
        private static final long serialVersionUID = -4547113800637756442L;

        /* renamed from: q */
        final C43107b f99212q;

        C42176c(C43107b bVar, C40757w.C40760c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.f99212q = bVar;
        }

        /* renamed from: b */
        public void mo27070b(C43108c cVar) {
            if (C43259d.m124224h(this.f99202i, cVar)) {
                this.f99202i = cVar;
                if (cVar instanceof C41737f) {
                    C41737f fVar = (C41737f) cVar;
                    int e = fVar.mo96260e(7);
                    if (e == 1) {
                        this.f99207n = 1;
                        this.f99203j = fVar;
                        this.f99205l = true;
                        this.f99212q.mo27070b(this);
                        return;
                    } else if (e == 2) {
                        this.f99207n = 2;
                        this.f99203j = fVar;
                        this.f99212q.mo27070b(this);
                        cVar.mo94357l((long) this.f99199f);
                        return;
                    }
                }
                this.f99203j = new C43062a(this.f99199f);
                this.f99212q.mo27070b(this);
                cVar.mo94357l((long) this.f99199f);
            }
        }

        /* renamed from: c */
        public Object mo96258c() {
            Object c = this.f99203j.mo96258c();
            if (!(c == null || this.f99207n == 1)) {
                long j = this.f99208o + 1;
                if (j == ((long) this.f99200g)) {
                    this.f99208o = 0;
                    this.f99202i.mo94357l(j);
                } else {
                    this.f99208o = j;
                }
            }
            return c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo97653h() {
            int i;
            boolean z;
            C43107b bVar = this.f99212q;
            C41740i iVar = this.f99203j;
            long j = this.f99208o;
            int i2 = 1;
            while (true) {
                long j2 = this.f99201h.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z2 = this.f99205l;
                    try {
                        Object c = iVar.mo96258c();
                        if (c == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo97652g(z2, z, bVar)) {
                            if (z) {
                                break;
                            }
                            bVar.onNext(c);
                            j++;
                            if (j == ((long) this.f99200g)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.f99201h.addAndGet(-j);
                                }
                                this.f99202i.mo94357l(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C41300a.m119661b(th);
                        this.f99204k = true;
                        this.f99202i.cancel();
                        iVar.clear();
                        bVar.onError(th);
                        this.f99197d.dispose();
                        return;
                    }
                }
                if (i != 0 || !mo97652g(this.f99205l, iVar.isEmpty(), bVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f99208o = j;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo97654i() {
            int i = 1;
            while (!this.f99204k) {
                boolean z = this.f99205l;
                this.f99212q.onNext((Object) null);
                if (z) {
                    this.f99204k = true;
                    Throwable th = this.f99206m;
                    if (th != null) {
                        this.f99212q.onError(th);
                    } else {
                        this.f99212q.onComplete();
                    }
                    this.f99197d.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo97655k() {
            C43107b bVar = this.f99212q;
            C41740i iVar = this.f99203j;
            long j = this.f99208o;
            int i = 1;
            while (true) {
                long j2 = this.f99201h.get();
                while (j != j2) {
                    try {
                        Object c = iVar.mo96258c();
                        if (!this.f99204k) {
                            if (c == null) {
                                this.f99204k = true;
                                bVar.onComplete();
                                this.f99197d.dispose();
                                return;
                            }
                            bVar.onNext(c);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C41300a.m119661b(th);
                        this.f99204k = true;
                        this.f99202i.cancel();
                        bVar.onError(th);
                        this.f99197d.dispose();
                        return;
                    }
                }
                if (!this.f99204k) {
                    if (iVar.isEmpty()) {
                        this.f99204k = true;
                        bVar.onComplete();
                        this.f99197d.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f99208o = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C42173o(C40741h hVar, C40757w wVar, boolean z, int i) {
        super(hVar);
        this.f99194f = wVar;
        this.f99195g = z;
        this.f99196h = i;
    }

    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        C40757w.C40760c b = this.f99194f.mo95051b();
        if (bVar instanceof C41732a) {
            this.f99110e.mo94922E(new C42175b((C41732a) bVar, b, this.f99195g, this.f99196h));
        } else {
            this.f99110e.mo94922E(new C42176c(bVar, b, this.f99195g, this.f99196h));
        }
    }
}
