package p326y8;

import android.support.p013v4.media.session.C0125b;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import p289v9.C8714a;
import p289v9.C8715b;
import p289v9.C8716c;
import p289v9.C8717d;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: y8.t */
class C9133t implements C8717d, C8716c {

    /* renamed from: a */
    private final Map f25323a = new HashMap();

    /* renamed from: b */
    private Queue f25324b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f25325c;

    C9133t(Executor executor) {
        this.f25325c = executor;
    }

    /* renamed from: e */
    private synchronized Set m33681e(C8714a aVar) {
        throw null;
    }

    /* renamed from: a */
    public void mo24097a(Class cls, C8715b bVar) {
        mo24098b(cls, this.f25325c, bVar);
    }

    /* renamed from: b */
    public synchronized void mo24098b(Class cls, Executor executor, C8715b bVar) {
        C9100a0.m33553b(cls);
        C9100a0.m33553b(bVar);
        C9100a0.m33553b(executor);
        if (!this.f25323a.containsKey(cls)) {
            this.f25323a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f25323a.get(cls)).put(bVar, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24706d() {
        Queue<Object> queue;
        synchronized (this) {
            queue = this.f25324b;
            if (queue != null) {
                this.f25324b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (Object a : queue) {
                C0125b.m366a(a);
                mo24707g((C8714a) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new p326y8.C9132s(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = m33681e(r5).iterator();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24707g(p289v9.C8714a r5) {
        /*
            r4 = this;
            p326y8.C9100a0.m33553b(r5)
            monitor-enter(r4)
            java.util.Queue r0 = r4.f25324b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.m33681e(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            y8.s r3 = new y8.s
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p326y8.C9133t.mo24707g(v9.a):void");
    }
}
