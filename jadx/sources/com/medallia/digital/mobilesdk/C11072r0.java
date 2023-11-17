package com.medallia.digital.mobilesdk;

import java.util.Observable;

/* renamed from: com.medallia.digital.mobilesdk.r0 */
abstract class C11072r0<T> extends Observable {

    /* renamed from: a */
    private boolean f31828a;

    /* renamed from: b */
    private C11083s0 f31829b;

    /* renamed from: c */
    private String f31830c;

    /* renamed from: d */
    private Lifetime f31831d;

    /* renamed from: e */
    private T f31832e;

    protected C11072r0(C11083s0 s0Var) {
        this.f31829b = s0Var;
        if (s0Var != null) {
            this.f31830c = s0Var.getName();
            this.f31831d = s0Var.getLifetime();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11083s0 mo28948a() {
        if (this.f31829b == null) {
            this.f31829b = C11083s0.Unknown;
        }
        return this.f31829b;
    }

    /* renamed from: b */
    public String mo28256b() {
        return getClass().getSimpleName().replace("Collector", "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract CollectorContract mo28118c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Lifetime mo28950d() {
        return this.f31831d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28951e() {
        return this.f31830c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public T mo28863f() {
        return this.f31832e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ValueType mo28329g() {
        T t = this.f31832e;
        return t == null ? ValueType.TypeString : t instanceof Integer ? ValueType.TypeInteger : t instanceof Double ? ValueType.TypeDouble : t instanceof Long ? ValueType.TypeLong : t instanceof Boolean ? ValueType.TypeBoolean : ValueType.TypeString;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo28952h() {
        return this.f31828a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C10802f0 mo28953i() {
        T t = this.f31832e;
        return new C10802f0(t == null ? null : t.toString(), GroupType.collector, mo28950d(), mo28329g(), mo28951e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28949a(Lifetime lifetime) {
        this.f31831d = lifetime;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28117a(T t) {
        if (t != null) {
            this.f31832e = t;
            setChanged();
            notifyObservers(mo28953i());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28064a(boolean z) {
        this.f31828a = z;
    }
}
