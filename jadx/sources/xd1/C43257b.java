package xd1;

import uh1.C43107b;

/* renamed from: xd1.b */
public abstract class C43257b extends C43256a {
    private static final long serialVersionUID = -2151279923272604993L;

    /* renamed from: d */
    protected final C43107b f101012d;

    /* renamed from: e */
    protected Object f101013e;

    public C43257b(C43107b bVar) {
        this.f101012d = bVar;
    }

    /* renamed from: c */
    public final Object mo96258c() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f101013e;
        this.f101013e = null;
        return obj;
    }

    public void cancel() {
        set(4);
        this.f101013e = null;
    }

    public final void clear() {
        lazySet(32);
        this.f101013e = null;
    }

    /* renamed from: e */
    public final int mo96260e(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    /* renamed from: g */
    public final void mo101944g(Object obj) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    C43107b bVar = this.f101012d;
                    bVar.onNext(obj);
                    if (get() != 4) {
                        bVar.onComplete();
                        return;
                    }
                    return;
                }
                this.f101013e = obj;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.f101013e = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f101013e = obj;
        lazySet(16);
        C43107b bVar2 = this.f101012d;
        bVar2.onNext(obj);
        if (get() != 4) {
            bVar2.onComplete();
        }
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    /* renamed from: l */
    public final void mo94357l(long j) {
        Object obj;
        if (C43259d.m124223g(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3) && (obj = this.f101013e) != null) {
                            this.f101013e = null;
                            C43107b bVar = this.f101012d;
                            bVar.onNext(obj);
                            if (get() != 4) {
                                bVar.onComplete();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
