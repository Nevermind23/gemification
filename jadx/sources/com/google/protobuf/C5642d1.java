package com.google.protobuf;

/* renamed from: com.google.protobuf.d1 */
class C5642d1 extends C5636b1 {
    C5642d1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo18538d(Object obj) {
        mo18535a(obj).mo18565h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C5639c1 mo18535a(Object obj) {
        return ((C5709q) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo18536b(C5639c1 c1Var) {
        return c1Var.mo18562d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo18537c(C5639c1 c1Var) {
        return c1Var.mo18563e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C5639c1 mo18539e(C5639c1 c1Var, C5639c1 c1Var2) {
        if (C5639c1.m22476c().equals(c1Var2)) {
            return c1Var;
        }
        if (C5639c1.m22476c().equals(c1Var)) {
            return C5639c1.m22479j(c1Var, c1Var2);
        }
        return c1Var.mo18567i(c1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo18540f(Object obj, C5639c1 c1Var) {
        ((C5709q) obj).unknownFields = c1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo18541g(C5639c1 c1Var, C5689i1 i1Var) {
        c1Var.mo18569n(i1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo18542h(C5639c1 c1Var, C5689i1 i1Var) {
        c1Var.mo18570p(i1Var);
    }
}
