package com.google.protobuf;

/* renamed from: com.google.protobuf.z */
final class C5747z implements C5730w0 {

    /* renamed from: b */
    private static final C5669g0 f18129b = new C5748a();

    /* renamed from: a */
    private final C5669g0 f18130a;

    /* renamed from: com.google.protobuf.z$a */
    class C5748a implements C5669g0 {
        C5748a() {
        }

        /* renamed from: a */
        public C5659f0 mo18658a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo18659b(Class cls) {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.z$b */
    private static class C5749b implements C5669g0 {

        /* renamed from: a */
        private C5669g0[] f18131a;

        C5749b(C5669g0... g0VarArr) {
            this.f18131a = g0VarArr;
        }

        /* renamed from: a */
        public C5659f0 mo18658a(Class cls) {
            for (C5669g0 g0Var : this.f18131a) {
                if (g0Var.mo18659b(cls)) {
                    return g0Var.mo18658a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        /* renamed from: b */
        public boolean mo18659b(Class cls) {
            for (C5669g0 b : this.f18131a) {
                if (b.mo18659b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C5747z() {
        this(m23143b());
    }

    /* renamed from: b */
    private static C5669g0 m23143b() {
        return new C5749b(C5707p.m22928c(), m23144c());
    }

    /* renamed from: c */
    private static C5669g0 m23144c() {
        try {
            return (C5669g0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f18129b;
        }
    }

    /* renamed from: d */
    private static boolean m23145d(C5659f0 f0Var) {
        return f0Var.mo18634c() == C5715r0.PROTO2;
    }

    /* renamed from: e */
    private static C5728v0 m23146e(Class cls, C5659f0 f0Var) {
        if (C5709q.class.isAssignableFrom(cls)) {
            if (m23145d(f0Var)) {
                return C5694k0.m22826I(cls, f0Var, C5706o0.m22926b(), C5733y.m23103b(), C5732x0.m23057J(), C5697m.m22892b(), C5644e0.m22518b());
            }
            return C5694k0.m22826I(cls, f0Var, C5706o0.m22926b(), C5733y.m23103b(), C5732x0.m23057J(), (C5693k) null, C5644e0.m22518b());
        } else if (m23145d(f0Var)) {
            return C5694k0.m22826I(cls, f0Var, C5706o0.m22925a(), C5733y.m23102a(), C5732x0.m23053F(), C5697m.m22891a(), C5644e0.m22517a());
        } else {
            return C5694k0.m22826I(cls, f0Var, C5706o0.m22925a(), C5733y.m23102a(), C5732x0.m23054G(), (C5693k) null, C5644e0.m22517a());
        }
    }

    /* renamed from: a */
    public C5728v0 mo18815a(Class cls) {
        C5732x0.m23055H(cls);
        C5659f0 a = this.f18130a.mo18658a(cls);
        if (!a.mo18632a()) {
            return m23146e(cls, a);
        }
        if (C5709q.class.isAssignableFrom(cls)) {
            return C5696l0.m22881j(C5732x0.m23057J(), C5697m.m22892b(), a.mo18633b());
        }
        return C5696l0.m22881j(C5732x0.m23053F(), C5697m.m22891a(), a.mo18633b());
    }

    private C5747z(C5669g0 g0Var) {
        this.f18130a = (C5669g0) C5716s.m22991b(g0Var, "messageInfoFactory");
    }
}
