package p342j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p342j$.util.C9371P;

/* renamed from: j$.util.stream.d */
abstract class C9639d extends C9649f {

    /* renamed from: h */
    protected final AtomicReference f26362h;

    /* renamed from: i */
    protected volatile boolean f26363i;

    protected C9639d(C9639d dVar, C9371P p) {
        super((C9649f) dVar, p);
        this.f26362h = dVar.f26362h;
    }

    protected C9639d(C9735w0 w0Var, C9371P p) {
        super(w0Var, p);
        this.f26362h = new AtomicReference((Object) null);
    }

    /* renamed from: b */
    public final Object mo26041b() {
        if (!(mo26050c() == null)) {
            return super.mo26041b();
        }
        Object obj = this.f26362h.get();
        return obj == null ? mo25899i() : obj;
    }

    public final void compute() {
        Object obj;
        C9371P trySplit;
        C9371P p = this.f26376b;
        long estimateSize = p.estimateSize();
        long j = this.f26377c;
        if (j == 0) {
            j = C9649f.m35495f(estimateSize);
            this.f26377c = j;
        }
        AtomicReference atomicReference = this.f26362h;
        boolean z = false;
        C9639d dVar = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z2 = dVar.f26363i;
            if (!z2) {
                C9649f c = dVar.mo26050c();
                while (true) {
                    C9639d dVar2 = (C9639d) c;
                    if (z2 || dVar2 == null) {
                        break;
                    }
                    z2 = dVar2.f26363i;
                    c = dVar2.mo26050c();
                }
            }
            if (z2) {
                obj = dVar.mo25899i();
                break;
            } else if (estimateSize <= j || (trySplit = p.trySplit()) == null) {
                obj = dVar.mo25896a();
            } else {
                C9639d dVar3 = (C9639d) dVar.mo25897d(trySplit);
                dVar.f26378d = dVar3;
                C9639d dVar4 = (C9639d) dVar.mo25897d(p);
                dVar.f26379e = dVar4;
                dVar.setPendingCount(1);
                if (z) {
                    p = trySplit;
                    dVar = dVar3;
                    dVar3 = dVar4;
                } else {
                    dVar = dVar4;
                }
                z = !z;
                dVar3.fork();
                estimateSize = p.estimateSize();
            }
        }
        dVar.mo26043e(obj);
        dVar.tryComplete();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[LOOP:0: B:7:0x000f->B:10:0x001b, LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26043e(java.lang.Object r3) {
        /*
            r2 = this;
            j$.util.stream.f r0 = r2.mo26050c()
            if (r0 != 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x001e
            if (r3 == 0) goto L_0x0021
            java.util.concurrent.atomic.AtomicReference r0 = r2.f26362h
        L_0x000f:
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r3)
            if (r1 == 0) goto L_0x0017
            goto L_0x0021
        L_0x0017:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x000f
            goto L_0x0021
        L_0x001e:
            super.mo26043e(r3)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.stream.C9639d.mo26043e(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26044g() {
        this.f26363i = true;
    }

    public final Object getRawResult() {
        return mo26041b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo26046h() {
        C9639d dVar = this;
        for (C9639d dVar2 = (C9639d) mo26050c(); dVar2 != null; dVar2 = (C9639d) dVar2.mo26050c()) {
            if (dVar2.f26378d == dVar) {
                C9639d dVar3 = (C9639d) dVar2.f26379e;
                if (!dVar3.f26363i) {
                    dVar3.mo26044g();
                }
            }
            dVar = dVar2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract Object mo25899i();
}
