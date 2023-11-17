package nd1;

import ae1.C40293a;
import ed1.C40756v;

/* renamed from: nd1.j */
public class C41783j extends C41775b {
    private static final long serialVersionUID = -5502432239815349361L;

    /* renamed from: d */
    protected final C40756v f98097d;

    /* renamed from: e */
    protected Object f98098e;

    public C41783j(C40756v vVar) {
        this.f98097d = vVar;
    }

    /* renamed from: b */
    public final void mo96605b() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.f98097d.onComplete();
        }
    }

    /* renamed from: c */
    public final Object mo96258c() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.f98098e;
        this.f98098e = null;
        lazySet(32);
        return obj;
    }

    public final void clear() {
        lazySet(32);
        this.f98098e = null;
    }

    /* renamed from: d */
    public final void mo96606d(Object obj) {
        int i = get();
        if ((i & 54) == 0) {
            C40756v vVar = this.f98097d;
            if (i == 8) {
                this.f98098e = obj;
                lazySet(16);
                vVar.onNext((Object) null);
            } else {
                lazySet(2);
                vVar.onNext(obj);
            }
            if (get() != 4) {
                vVar.onComplete();
            }
        }
    }

    public void dispose() {
        set(4);
        this.f98098e = null;
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
    public final void mo96607g(Throwable th) {
        if ((get() & 54) != 0) {
            C40293a.m116722s(th);
            return;
        }
        lazySet(2);
        this.f98097d.onError(th);
    }

    public final boolean isDisposed() {
        return get() == 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }
}
