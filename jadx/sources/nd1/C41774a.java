package nd1;

import ae1.C40293a;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import kd1.C41498c;
import md1.C41735d;

/* renamed from: nd1.a */
public abstract class C41774a implements C40756v, C41735d {

    /* renamed from: d */
    protected final C40756v f98079d;

    /* renamed from: e */
    protected C41205b f98080e;

    /* renamed from: f */
    protected C41735d f98081f;

    /* renamed from: g */
    protected boolean f98082g;

    /* renamed from: h */
    protected int f98083h;

    public C41774a(C40756v vVar) {
        this.f98079d = vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96597a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo96598b() {
        return true;
    }

    public void clear() {
        this.f98081f.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo96599d(Throwable th) {
        C41300a.m119661b(th);
        this.f98080e.dispose();
        onError(th);
    }

    public void dispose() {
        this.f98080e.dispose();
    }

    /* renamed from: f */
    public final boolean mo96261f(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo96600g(int i) {
        C41735d dVar = this.f98081f;
        if (dVar == null || (i & 4) != 0) {
            return 0;
        }
        int e = dVar.mo96260e(i);
        if (e != 0) {
            this.f98083h = e;
        }
        return e;
    }

    public boolean isDisposed() {
        return this.f98080e.isDisposed();
    }

    public boolean isEmpty() {
        return this.f98081f.isEmpty();
    }

    public void onComplete() {
        if (!this.f98082g) {
            this.f98082g = true;
            this.f98079d.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f98082g) {
            C40293a.m116722s(th);
            return;
        }
        this.f98082g = true;
        this.f98079d.onError(th);
    }

    public final void onSubscribe(C41205b bVar) {
        if (C41498c.m120378l(this.f98080e, bVar)) {
            this.f98080e = bVar;
            if (bVar instanceof C41735d) {
                this.f98081f = (C41735d) bVar;
            }
            if (mo96598b()) {
                this.f98079d.onSubscribe(this);
                mo96597a();
            }
        }
    }
}
