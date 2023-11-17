package wd1;

import ae1.C40293a;
import ed1.C40742i;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41394a;
import jd1.C41399f;
import p469io.reactivex.exceptions.CompositeException;
import uh1.C43108c;
import xd1.C43259d;

/* renamed from: wd1.c */
public final class C43189c extends AtomicReference implements C40742i, C43108c, C41205b {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: d */
    final C41399f f100742d;

    /* renamed from: e */
    final C41399f f100743e;

    /* renamed from: f */
    final C41394a f100744f;

    /* renamed from: g */
    final C41399f f100745g;

    public C43189c(C41399f fVar, C41399f fVar2, C41394a aVar, C41399f fVar3) {
        this.f100742d = fVar;
        this.f100743e = fVar2;
        this.f100744f = aVar;
        this.f100745g = fVar3;
    }

    /* renamed from: b */
    public void mo27070b(C43108c cVar) {
        if (C43259d.m124222f(this, cVar)) {
            try {
                this.f100745g.accept(this);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                cVar.cancel();
                onError(th);
            }
        }
    }

    public void cancel() {
        C43259d.m124218a(this);
    }

    public void dispose() {
        cancel();
    }

    public boolean isDisposed() {
        return get() == C43259d.CANCELLED;
    }

    /* renamed from: l */
    public void mo94357l(long j) {
        ((C43108c) get()).mo94357l(j);
    }

    public void onComplete() {
        Object obj = get();
        C43259d dVar = C43259d.CANCELLED;
        if (obj != dVar) {
            lazySet(dVar);
            try {
                this.f100744f.run();
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C40293a.m116722s(th);
            }
        }
    }

    public void onError(Throwable th) {
        Object obj = get();
        C43259d dVar = C43259d.CANCELLED;
        if (obj != dVar) {
            lazySet(dVar);
            try {
                this.f100743e.accept(th);
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                C40293a.m116722s(new CompositeException(th, th2));
            }
        } else {
            C40293a.m116722s(th);
        }
    }

    public void onNext(Object obj) {
        if (!isDisposed()) {
            try {
                this.f100742d.accept(obj);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                ((C43108c) get()).cancel();
                onError(th);
            }
        }
    }
}
