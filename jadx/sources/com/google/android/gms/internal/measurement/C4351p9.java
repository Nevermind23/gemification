package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.p9 */
public abstract class C4351p9 extends C4146d8 {
    private static final Map zza = new ConcurrentHashMap();
    protected C4234ib zzc = C4234ib.m16102c();
    private int zzd = -1;

    /* renamed from: h */
    private final int m16433h(C4132cb cbVar) {
        if (cbVar != null) {
            return cbVar.mo12992e(this);
        }
        return C4519za.m17310a().mo13872b(getClass()).mo12992e(this);
    }

    /* renamed from: k */
    static C4351p9 m16434k(Class cls) {
        Map map = zza;
        C4351p9 p9Var = (C4351p9) map.get(cls);
        if (p9Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                p9Var = (C4351p9) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (p9Var == null) {
            p9Var = (C4351p9) ((C4351p9) C4387rb.m16583j(cls)).mo12903z(6, (Object) null, (Object) null);
            if (p9Var != null) {
                map.put(cls, p9Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return p9Var;
    }

    /* renamed from: m */
    protected static C4419t9 m16435m() {
        return C4368q9.m16503g();
    }

    /* renamed from: n */
    protected static C4436u9 m16436n() {
        return C4199ga.m15905c();
    }

    /* renamed from: o */
    protected static C4436u9 m16437o(C4436u9 u9Var) {
        int i;
        int size = u9Var.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return u9Var.mo13153h(i);
    }

    /* renamed from: p */
    protected static C4453v9 m16438p() {
        return C4098ab.m15505c();
    }

    /* renamed from: q */
    protected static C4453v9 m16439q(C4453v9 v9Var) {
        int i;
        int size = v9Var.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return v9Var.mo12866e(i);
    }

    /* renamed from: r */
    static Object m16440r(Method method, Object obj, Object... objArr) {
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

    /* renamed from: s */
    protected static Object m16441s(C4386ra raVar, String str, Object[] objArr) {
        return new C4115bb(raVar, str, objArr);
    }

    /* renamed from: v */
    protected static void m16442v(Class cls, C4351p9 p9Var) {
        p9Var.mo13476u();
        zza.put(cls, p9Var);
    }

    /* renamed from: a */
    public final int mo13465a() {
        int i;
        if (mo13478x()) {
            i = m16433h((C4132cb) null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = m16433h((C4132cb) null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public final /* synthetic */ C4369qa mo13466b() {
        return (C4300m9) mo12903z(5, (Object) null, (Object) null);
    }

    /* renamed from: c */
    public final void mo13467c(C4096a9 a9Var) {
        C4519za.m17310a().mo13872b(getClass()).mo12989b(this, C4113b9.m15560K(a9Var));
    }

    /* renamed from: d */
    public final /* synthetic */ C4386ra mo13468d() {
        return (C4351p9) mo12903z(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo13040e(C4132cb cbVar) {
        if (mo13478x()) {
            int h = m16433h(cbVar);
            if (h >= 0) {
                return h;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + h);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int h2 = m16433h(cbVar);
        if (h2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | h2;
            return h2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + h2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C4519za.m17310a().mo13872b(getClass()).mo12994g(this, (C4351p9) obj);
    }

    public final int hashCode() {
        if (mo13478x()) {
            return mo13479y();
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int y = mo13479y();
        this.zzb = y;
        return y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C4300m9 mo13471i() {
        return (C4300m9) mo12903z(5, (Object) null, (Object) null);
    }

    /* renamed from: j */
    public final C4300m9 mo13472j() {
        C4300m9 m9Var = (C4300m9) mo12903z(5, (Object) null, (Object) null);
        m9Var.mo13359j(this);
        return m9Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final C4351p9 mo13473l() {
        return (C4351p9) mo12903z(4, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo13474t() {
        C4519za.m17310a().mo13872b(getClass()).mo12988a(this);
        mo13476u();
    }

    public final String toString() {
        return C4420ta.m16762a(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo13476u() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo13477w(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean mo13478x() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final int mo13479y() {
        return C4519za.m17310a().mo13872b(getClass()).mo12990c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract Object mo12903z(int i, Object obj, Object obj2);
}
