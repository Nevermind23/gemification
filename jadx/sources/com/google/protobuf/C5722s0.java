package com.google.protobuf;

import java.util.concurrent.ConcurrentMap;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.s0 */
final class C5722s0 {

    /* renamed from: c */
    private static final C5722s0 f18073c = new C5722s0();

    /* renamed from: a */
    private final C5730w0 f18074a = new C5747z();

    /* renamed from: b */
    private final ConcurrentMap f18075b = new ConcurrentHashMap();

    private C5722s0() {
    }

    /* renamed from: a */
    public static C5722s0 m23005a() {
        return f18073c;
    }

    /* renamed from: b */
    public C5728v0 mo18791b(Class cls, C5728v0 v0Var) {
        C5716s.m22991b(cls, "messageType");
        C5716s.m22991b(v0Var, "schema");
        return (C5728v0) this.f18075b.putIfAbsent(cls, v0Var);
    }

    /* renamed from: c */
    public C5728v0 mo18792c(Class cls) {
        C5716s.m22991b(cls, "messageType");
        C5728v0 v0Var = (C5728v0) this.f18075b.get(cls);
        if (v0Var != null) {
            return v0Var;
        }
        C5728v0 a = this.f18074a.mo18815a(cls);
        C5728v0 b = mo18791b(cls, a);
        if (b != null) {
            return b;
        }
        return a;
    }

    /* renamed from: d */
    public C5728v0 mo18793d(Object obj) {
        return mo18792c(obj.getClass());
    }
}
