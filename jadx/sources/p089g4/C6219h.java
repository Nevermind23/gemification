package p089g4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: g4.h */
public class C6219h {

    /* renamed from: a */
    private final Map f19234a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f19235b;

    /* renamed from: c */
    private long f19236c;

    /* renamed from: d */
    private long f19237d;

    /* renamed from: g4.h$a */
    static final class C6220a {

        /* renamed from: a */
        final Object f19238a;

        /* renamed from: b */
        final int f19239b;

        C6220a(Object obj, int i) {
            this.f19238a = obj;
            this.f19239b = i;
        }
    }

    public C6219h(long j) {
        this.f19235b = j;
        this.f19236c = j;
    }

    /* renamed from: f */
    private void m24715f() {
        mo19822m(this.f19236c);
    }

    /* renamed from: b */
    public void mo19815b() {
        mo19822m(0);
    }

    /* renamed from: g */
    public synchronized Object mo19816g(Object obj) {
        Object obj2;
        C6220a aVar = (C6220a) this.f19234a.get(obj);
        if (aVar != null) {
            obj2 = aVar.f19238a;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    /* renamed from: h */
    public synchronized long mo19817h() {
        return this.f19236c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo19818i(Object obj) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo19819j(Object obj, Object obj2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return r4;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object mo19820k(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.mo19818i(r9)     // Catch:{ all -> 0x004a }
            long r1 = (long) r0     // Catch:{ all -> 0x004a }
            long r3 = r7.f19236c     // Catch:{ all -> 0x004a }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L_0x0012
            r7.mo19819j(r8, r9)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r4
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r5 = r7.f19237d     // Catch:{ all -> 0x004a }
            long r5 = r5 + r1
            r7.f19237d = r5     // Catch:{ all -> 0x004a }
        L_0x0019:
            java.util.Map r1 = r7.f19234a     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x001f
            r2 = r4
            goto L_0x0024
        L_0x001f:
            g4.h$a r2 = new g4.h$a     // Catch:{ all -> 0x004a }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x004a }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004a }
            g4.h$a r0 = (p089g4.C6219h.C6220a) r0     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f19237d     // Catch:{ all -> 0x004a }
            int r3 = r0.f19239b     // Catch:{ all -> 0x004a }
            long r5 = (long) r3     // Catch:{ all -> 0x004a }
            long r1 = r1 - r5
            r7.f19237d = r1     // Catch:{ all -> 0x004a }
            java.lang.Object r1 = r0.f19238a     // Catch:{ all -> 0x004a }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x0041
            java.lang.Object r9 = r0.f19238a     // Catch:{ all -> 0x004a }
            r7.mo19819j(r8, r9)     // Catch:{ all -> 0x004a }
        L_0x0041:
            r7.m24715f()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r4 = r0.f19238a     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r7)
            return r4
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p089g4.C6219h.mo19820k(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: l */
    public synchronized Object mo19821l(Object obj) {
        C6220a aVar = (C6220a) this.f19234a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f19237d -= (long) aVar.f19239b;
        return aVar.f19238a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void mo19822m(long j) {
        while (this.f19237d > j) {
            Iterator it = this.f19234a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C6220a aVar = (C6220a) entry.getValue();
            this.f19237d -= (long) aVar.f19239b;
            Object key = entry.getKey();
            it.remove();
            mo19819j(key, aVar.f19238a);
        }
    }
}
