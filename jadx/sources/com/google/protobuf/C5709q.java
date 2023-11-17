package com.google.protobuf;

import com.google.protobuf.C5627a;
import com.google.protobuf.C5716s;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.q */
public abstract class C5709q extends C5627a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, C5709q> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C5639c1 unknownFields = C5639c1.m22476c();

    /* renamed from: com.google.protobuf.q$a */
    public static abstract class C5710a extends C5627a.C5628a {

        /* renamed from: d */
        private final C5709q f18050d;

        /* renamed from: e */
        protected C5709q f18051e;

        protected C5710a(C5709q qVar) {
            this.f18050d = qVar;
            if (!qVar.mo18749H()) {
                this.f18051e = m22967y();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        /* renamed from: u */
        private static void m22966u(Object obj, Object obj2) {
            C5722s0.m23005a().mo18793d(obj).mo18717a(obj, obj2);
        }

        /* renamed from: y */
        private C5709q m22967y() {
            return this.f18050d.mo18753O();
        }

        /* renamed from: o */
        public final C5709q mo18768o() {
            C5709q p = mo18707q0();
            if (p.mo18748F()) {
                return p;
            }
            throw C5627a.C5628a.m22437n(p);
        }

        /* renamed from: p */
        public C5709q mo18707q0() {
            if (!this.f18051e.mo18749H()) {
                return this.f18051e;
            }
            this.f18051e.mo18750I();
            return this.f18051e;
        }

        /* renamed from: q */
        public C5710a clone() {
            C5710a M = mo18773t().mo18705e();
            M.f18051e = mo18707q0();
            return M;
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public final void mo18771r() {
            if (!this.f18051e.mo18749H()) {
                mo18772s();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public void mo18772s() {
            C5709q y = m22967y();
            m22966u(y, this.f18051e);
            this.f18051e = y;
        }

        /* renamed from: t */
        public C5709q mo18773t() {
            return this.f18050d;
        }
    }

    /* renamed from: com.google.protobuf.q$b */
    protected static class C5711b extends C5634b {

        /* renamed from: b */
        private final C5709q f18052b;

        public C5711b(C5709q qVar) {
            this.f18052b = qVar;
        }
    }

    /* renamed from: com.google.protobuf.q$c */
    public enum C5712c {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: E */
    static Object m22931E(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: G */
    protected static final boolean m22932G(C5709q qVar, boolean z) {
        C5709q qVar2;
        byte byteValue = ((Byte) qVar.mo18764u(C5712c.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C5722s0.m23005a().mo18793d(qVar).mo18720d(qVar);
        if (z) {
            C5712c cVar = C5712c.SET_MEMOIZED_IS_INITIALIZED;
            if (d) {
                qVar2 = qVar;
            } else {
                qVar2 = null;
            }
            qVar.mo18765v(cVar, qVar2);
        }
        return d;
    }

    /* renamed from: K */
    protected static C5716s.C5720d m22933K(C5716s.C5720d dVar) {
        int i;
        int size = dVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return dVar.mo18774a(i);
    }

    /* renamed from: L */
    protected static C5716s.C5721e m22934L(C5716s.C5721e eVar) {
        int i;
        int size = eVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return eVar.mo18774a(i);
    }

    /* renamed from: N */
    protected static Object m22935N(C5677h0 h0Var, String str, Object[] objArr) {
        return new C5726u0(h0Var, str, objArr);
    }

    /* renamed from: P */
    protected static void m22936P(Class cls, C5709q qVar) {
        qVar.mo18751J();
        defaultInstanceMap.put(cls, qVar);
    }

    /* renamed from: s */
    private int m22937s(C5728v0 v0Var) {
        if (v0Var == null) {
            return C5722s0.m23005a().mo18793d(this).mo18721e(this);
        }
        return v0Var.mo18721e(this);
    }

    /* renamed from: x */
    protected static C5716s.C5720d m22938x() {
        return C5714r.m22977j();
    }

    /* renamed from: y */
    protected static C5716s.C5721e m22939y() {
        return C5724t0.m23010g();
    }

    /* renamed from: z */
    static C5709q m22940z(Class cls) {
        C5709q qVar = defaultInstanceMap.get(cls);
        if (qVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                qVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (qVar == null) {
            qVar = ((C5709q) C5660f1.m22602k(cls)).mo18710f();
            if (qVar != null) {
                defaultInstanceMap.put(cls, qVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return qVar;
    }

    /* renamed from: A */
    public final C5709q mo18710f() {
        return (C5709q) mo18764u(C5712c.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int mo18745B() {
        return this.memoizedHashCode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo18746C() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo18747D() {
        return mo18745B() == 0;
    }

    /* renamed from: F */
    public final boolean mo18748F() {
        return m22932G(this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo18749H() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo18750I() {
        C5722s0.m23005a().mo18793d(this).mo18719c(this);
        mo18751J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo18751J() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: M */
    public final C5710a mo18705e() {
        return (C5710a) mo18764u(C5712c.NEW_BUILDER);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public C5709q mo18753O() {
        return (C5709q) mo18764u(C5712c.NEW_MUTABLE_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo18754Q(int i) {
        this.memoizedHashCode = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo18755R(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    /* renamed from: d */
    public int mo18704d() {
        return mo18518l((C5728v0) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C5722s0.m23005a().mo18793d(this).mo18724h(this, (C5709q) obj);
        }
        return false;
    }

    /* renamed from: g */
    public void mo18706g(CodedOutputStream codedOutputStream) {
        C5722s0.m23005a().mo18793d(this).mo18718b(this, C5675h.m22700P(codedOutputStream));
    }

    public int hashCode() {
        if (mo18749H()) {
            return mo18761r();
        }
        if (mo18747D()) {
            mo18754Q(mo18761r());
        }
        return mo18745B();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo18518l(C5728v0 v0Var) {
        if (mo18749H()) {
            int s = m22937s(v0Var);
            if (s >= 0) {
                return s;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + s);
        } else if (mo18746C() != Integer.MAX_VALUE) {
            return mo18746C();
        } else {
            int s2 = m22937s(v0Var);
            mo18755R(s2);
            return s2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public Object mo18758o() {
        return mo18764u(C5712c.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo18759p() {
        this.memoizedHashCode = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo18760q() {
        mo18755R(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo18761r() {
        return C5722s0.m23005a().mo18793d(this).mo18723g(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C5710a mo18762t() {
        return (C5710a) mo18764u(C5712c.NEW_BUILDER);
    }

    public String toString() {
        return C5692j0.m22811f(this, super.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Object mo18764u(C5712c cVar) {
        return mo18766w(cVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo18765v(C5712c cVar, Object obj) {
        return mo18766w(cVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract Object mo18766w(C5712c cVar, Object obj, Object obj2);
}
