package p342j$.util.concurrent;

import java.util.Map;

/* renamed from: j$.util.concurrent.l */
class C9399l implements Map.Entry {

    /* renamed from: a */
    final int f26011a;

    /* renamed from: b */
    final Object f26012b;

    /* renamed from: c */
    volatile Object f26013c;

    /* renamed from: d */
    volatile C9399l f26014d;

    C9399l(int i, Object obj, Object obj2, C9399l lVar) {
        this.f26011a = i;
        this.f26012b = obj;
        this.f26013c = obj2;
        this.f26014d = lVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9399l mo25382a(Object obj, int i) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        C9399l lVar = this;
        do {
            if (lVar.f26011a == i && ((obj2 = lVar.f26012b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return lVar;
            }
            lVar = lVar.f26014d;
        } while (lVar != null);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r2.f26013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (java.util.Map.Entry) r3;
        r0 = r3.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r3.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r1 = r2.f26012b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L_0x0028
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L_0x0028
            java.lang.Object r1 = r2.f26012b
            if (r0 == r1) goto L_0x001c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
        L_0x001c:
            java.lang.Object r0 = r2.f26013c
            if (r3 == r0) goto L_0x0026
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0028
        L_0x0026:
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.C9399l.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        return this.f26012b;
    }

    public final Object getValue() {
        return this.f26013c;
    }

    public final int hashCode() {
        return this.f26012b.hashCode() ^ this.f26013c.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f26012b + "=" + this.f26013c;
    }
}
