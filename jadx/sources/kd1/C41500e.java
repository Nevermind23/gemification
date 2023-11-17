package kd1;

import hd1.C41205b;
import id1.C41300a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ld1.C41692b;
import p469io.reactivex.exceptions.CompositeException;
import yd1.C43364i;

/* renamed from: kd1.e */
public final class C41500e implements C41205b, C41497b {

    /* renamed from: d */
    List f97674d;

    /* renamed from: e */
    volatile boolean f97675e;

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
        C41692b.m120934e(bVar, "d is null");
        if (!this.f97675e) {
            synchronized (this) {
                if (!this.f97675e) {
                    List list = this.f97674d;
                    if (list == null) {
                        list = new LinkedList();
                        this.f97674d = list;
                    }
                    list.add(bVar);
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
            java.lang.String r0 = "Disposable item is null"
            ld1.C41692b.m120934e(r3, r0)
            boolean r0 = r2.f97675e
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f97675e     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List r0 = r2.f97674d     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: kd1.C41500e.mo95661c(hd1.b):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo96263d(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                try {
                    ((C41205b) it.next()).dispose();
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
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

    public void dispose() {
        if (!this.f97675e) {
            synchronized (this) {
                if (!this.f97675e) {
                    this.f97675e = true;
                    List list = this.f97674d;
                    this.f97674d = null;
                    mo96263d(list);
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.f97675e;
    }
}
