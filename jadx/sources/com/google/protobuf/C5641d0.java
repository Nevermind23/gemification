package com.google.protobuf;

import com.google.protobuf.C5629a0;
import java.util.Map;

/* renamed from: com.google.protobuf.d0 */
class C5641d0 implements C5638c0 {
    C5641d0() {
    }

    /* renamed from: f */
    private static int m22494f(int i, Object obj, Object obj2) {
        C5635b0 b0Var = (C5635b0) obj;
        C5629a0 a0Var = (C5629a0) obj2;
        int i2 = 0;
        if (b0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : b0Var.entrySet()) {
            i2 += a0Var.mo18520a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: g */
    private static C5635b0 m22495g(Object obj, Object obj2) {
        C5635b0 b0Var = (C5635b0) obj;
        C5635b0 b0Var2 = (C5635b0) obj2;
        if (!b0Var2.isEmpty()) {
            if (!b0Var.mo18528l()) {
                b0Var = b0Var.mo18531o();
            }
            b0Var.mo18530n(b0Var2);
        }
        return b0Var;
    }

    /* renamed from: a */
    public Object mo18556a(Object obj, Object obj2) {
        return m22495g(obj, obj2);
    }

    /* renamed from: b */
    public C5629a0.C5630a mo18557b(Object obj) {
        return ((C5629a0) obj).mo18521c();
    }

    /* renamed from: c */
    public Map mo18558c(Object obj) {
        return (C5635b0) obj;
    }

    /* renamed from: d */
    public Object mo18559d(Object obj) {
        ((C5635b0) obj).mo18529m();
        return obj;
    }

    /* renamed from: e */
    public int mo18560e(int i, Object obj, Object obj2) {
        return m22494f(i, obj, obj2);
    }
}
