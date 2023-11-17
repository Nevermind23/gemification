package wd1;

import ae1.C40293a;
import ed1.C40742i;
import id1.C41300a;
import md1.C41737f;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;

/* renamed from: wd1.b */
public abstract class C43188b implements C40742i, C41737f {

    /* renamed from: d */
    protected final C43107b f100737d;

    /* renamed from: e */
    protected C43108c f100738e;

    /* renamed from: f */
    protected C41737f f100739f;

    /* renamed from: g */
    protected boolean f100740g;

    /* renamed from: h */
    protected int f100741h;

    public C43188b(C43107b bVar) {
        this.f100737d = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo101741a() {
    }

    /* renamed from: b */
    public final void mo27070b(C43108c cVar) {
        if (C43259d.m124224h(this.f100738e, cVar)) {
            this.f100738e = cVar;
            if (cVar instanceof C41737f) {
                this.f100739f = (C41737f) cVar;
            }
            if (mo101742g()) {
                this.f100737d.mo27070b(this);
                mo101741a();
            }
        }
    }

    public void cancel() {
        this.f100738e.cancel();
    }

    public void clear() {
        this.f100739f.clear();
    }

    /* renamed from: f */
    public final boolean mo96261f(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo101742g() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo101743h(Throwable th) {
        C41300a.m119661b(th);
        this.f100738e.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo101744i(int i) {
        C41737f fVar = this.f100739f;
        if (fVar == null || (i & 4) != 0) {
            return 0;
        }
        int e = fVar.mo96260e(i);
        if (e != 0) {
            this.f100741h = e;
        }
        return e;
    }

    public boolean isEmpty() {
        return this.f100739f.isEmpty();
    }

    /* renamed from: l */
    public void mo94357l(long j) {
        this.f100738e.mo94357l(j);
    }

    public void onComplete() {
        if (!this.f100740g) {
            this.f100740g = true;
            this.f100737d.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f100740g) {
            C40293a.m116722s(th);
            return;
        }
        this.f100740g = true;
        this.f100737d.onError(th);
    }
}
