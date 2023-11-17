package wd1;

import ae1.C40293a;
import id1.C41300a;
import md1.C41732a;
import md1.C41737f;
import uh1.C43108c;
import xd1.C43259d;

/* renamed from: wd1.a */
public abstract class C43187a implements C41732a, C41737f {

    /* renamed from: d */
    protected final C41732a f100732d;

    /* renamed from: e */
    protected C43108c f100733e;

    /* renamed from: f */
    protected C41737f f100734f;

    /* renamed from: g */
    protected boolean f100735g;

    /* renamed from: h */
    protected int f100736h;

    public C43187a(C41732a aVar) {
        this.f100732d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo101737a() {
    }

    /* renamed from: b */
    public final void mo27070b(C43108c cVar) {
        if (C43259d.m124224h(this.f100733e, cVar)) {
            this.f100733e = cVar;
            if (cVar instanceof C41737f) {
                this.f100734f = (C41737f) cVar;
            }
            if (mo101738g()) {
                this.f100732d.mo27070b(this);
                mo101737a();
            }
        }
    }

    public void cancel() {
        this.f100733e.cancel();
    }

    public void clear() {
        this.f100734f.clear();
    }

    /* renamed from: f */
    public final boolean mo96261f(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo101738g() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo101739h(Throwable th) {
        C41300a.m119661b(th);
        this.f100733e.cancel();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo101740i(int i) {
        C41737f fVar = this.f100734f;
        if (fVar == null || (i & 4) != 0) {
            return 0;
        }
        int e = fVar.mo96260e(i);
        if (e != 0) {
            this.f100736h = e;
        }
        return e;
    }

    public boolean isEmpty() {
        return this.f100734f.isEmpty();
    }

    /* renamed from: l */
    public void mo94357l(long j) {
        this.f100733e.mo94357l(j);
    }

    public void onComplete() {
        if (!this.f100735g) {
            this.f100735g = true;
            this.f100732d.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f100735g) {
            C40293a.m116722s(th);
            return;
        }
        this.f100735g = true;
        this.f100732d.onError(th);
    }
}
