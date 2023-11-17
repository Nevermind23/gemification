package com.google.protobuf;

import com.google.protobuf.C5716s;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.protobuf.b0 */
public final class C5635b0 extends LinkedHashMap {

    /* renamed from: e */
    private static final C5635b0 f17836e;

    /* renamed from: d */
    private boolean f17837d = true;

    static {
        C5635b0 b0Var = new C5635b0();
        f17836e = b0Var;
        b0Var.mo18529m();
    }

    private C5635b0() {
    }

    /* renamed from: a */
    static int m22448a(Map map) {
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            i += m22449b(entry.getValue()) ^ m22449b(entry.getKey());
        }
        return i;
    }

    /* renamed from: b */
    private static int m22449b(Object obj) {
        if (obj instanceof byte[]) {
            return C5716s.m22993d((byte[]) obj);
        }
        if (!(obj instanceof C5716s.C5717a)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    private static void m22450c(Map map) {
        for (Object next : map.keySet()) {
            C5716s.m22990a(next);
            C5716s.m22990a(map.get(next));
        }
    }

    /* renamed from: d */
    public static C5635b0 m22451d() {
        return f17836e;
    }

    /* renamed from: e */
    private void m22452e() {
        if (!mo18528l()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    private static boolean m22453f(Object obj, Object obj2) {
        if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
            return obj.equals(obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m22454h(java.util.Map r4, java.util.Map r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = m22453f(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5635b0.m22454h(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        m22452e();
        super.clear();
    }

    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && m22454h(this, (Map) obj);
    }

    public int hashCode() {
        return m22448a(this);
    }

    /* renamed from: l */
    public boolean mo18528l() {
        return this.f17837d;
    }

    /* renamed from: m */
    public void mo18529m() {
        this.f17837d = false;
    }

    /* renamed from: n */
    public void mo18530n(C5635b0 b0Var) {
        m22452e();
        if (!b0Var.isEmpty()) {
            putAll(b0Var);
        }
    }

    /* renamed from: o */
    public C5635b0 mo18531o() {
        return isEmpty() ? new C5635b0() : new C5635b0(this);
    }

    public Object put(Object obj, Object obj2) {
        m22452e();
        C5716s.m22990a(obj);
        C5716s.m22990a(obj2);
        return super.put(obj, obj2);
    }

    public void putAll(Map map) {
        m22452e();
        m22450c(map);
        super.putAll(map);
    }

    public Object remove(Object obj) {
        m22452e();
        return super.remove(obj);
    }

    private C5635b0(Map map) {
        super(map);
    }
}
