package hd1;

import id1.C41300a;
import java.util.ArrayList;
import kd1.C41497b;
import ld1.C41692b;
import p469io.reactivex.exceptions.CompositeException;
import yd1.C43364i;
import yd1.C43371l;

/* renamed from: hd1.a */
public final class C41204a implements C41205b, C41497b {

    /* renamed from: d */
    C43371l f97192d;

    /* renamed from: e */
    volatile boolean f97193e;

    /* renamed from: a */
    public boolean mo95659a(C41205b bVar) {
        if (!mo95661c(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    /* renamed from: b */
    public boolean mo95660b(C41205b bVar) {
        C41692b.m120934e(bVar, "disposable is null");
        if (!this.f97193e) {
            synchronized (this) {
                if (!this.f97193e) {
                    C43371l lVar = this.f97192d;
                    if (lVar == null) {
                        lVar = new C43371l();
                        this.f97192d = lVar;
                    }
                    lVar.mo102045a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo95661c(hd1.C41205b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "disposables is null"
            ld1.C41692b.m120934e(r3, r0)
            boolean r0 = r2.f97193e
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f97193e     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            yd1.l r0 = r2.f97192d     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo102048e(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hd1.C41204a.mo95661c(hd1.b):boolean");
    }

    /* renamed from: d */
    public boolean mo95662d(C41205b... bVarArr) {
        C41692b.m120934e(bVarArr, "disposables is null");
        if (!this.f97193e) {
            synchronized (this) {
                if (!this.f97193e) {
                    C43371l lVar = this.f97192d;
                    if (lVar == null) {
                        lVar = new C43371l(bVarArr.length + 1);
                        this.f97192d = lVar;
                    }
                    for (C41205b bVar : bVarArr) {
                        C41692b.m120934e(bVar, "A Disposable in the disposables array is null");
                        lVar.mo102045a(bVar);
                    }
                    return true;
                }
            }
        }
        for (C41205b dispose : bVarArr) {
            dispose.dispose();
        }
        return false;
    }

    public void dispose() {
        if (!this.f97193e) {
            synchronized (this) {
                if (!this.f97193e) {
                    this.f97193e = true;
                    C43371l lVar = this.f97192d;
                    this.f97192d = null;
                    mo95664f(lVar);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo95663e() {
        if (!this.f97193e) {
            synchronized (this) {
                if (!this.f97193e) {
                    C43371l lVar = this.f97192d;
                    this.f97192d = null;
                    mo95664f(lVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo95664f(C43371l lVar) {
        if (lVar != null) {
            ArrayList arrayList = null;
            for (Object obj : lVar.mo102046b()) {
                if (obj instanceof C41205b) {
                    try {
                        ((C41205b) obj).dispose();
                    } catch (Throwable th) {
                        C41300a.m119661b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C43364i.m124412e((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable) arrayList);
        }
    }

    public boolean isDisposed() {
        return this.f97193e;
    }
}
