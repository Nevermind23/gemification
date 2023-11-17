package com.facetec.sdk;

/* renamed from: com.facetec.sdk.fq */
public final class C3135fq<T> extends C3004eg<T> {

    /* renamed from: a */
    private final C3006eh<T> f10352a;

    /* renamed from: b */
    private final C2980dx<T> f10353b;

    /* renamed from: c */
    private C2972dv f10354c;

    /* renamed from: d */
    private final C3142fw<T> f10355d;

    /* renamed from: e */
    private final C3013eo f10356e;

    /* renamed from: h */
    private C3004eg<T> f10357h;

    /* renamed from: i */
    private final C3135fq<T>.C9761a f10358i = new C3136a(this, (byte) 0);

    /* renamed from: com.facetec.sdk.fq$a */
    final class C3136a {
        private C3136a() {
        }

        /* synthetic */ C3136a(C3135fq fqVar, byte b) {
            this();
        }
    }

    public C3135fq(C3006eh<T> ehVar, C2980dx<T> dxVar, C2972dv dvVar, C3142fw<T> fwVar) {
        this.f10352a = ehVar;
        this.f10353b = dxVar;
        this.f10354c = dvVar;
        this.f10355d = fwVar;
        this.f10356e = null;
    }

    /* renamed from: b */
    public final void mo8991b(C3160gb gbVar, T t) {
        C3006eh<T> ehVar = this.f10352a;
        if (ehVar == null) {
            m12879b().mo8991b(gbVar, t);
        } else if (t == null) {
            gbVar.mo9318f();
        } else {
            this.f10355d.mo9332b();
            C3065fc.m12714c(ehVar.mo9187c(), gbVar);
        }
    }

    /* renamed from: d */
    public final T mo8992d(C3143fx fxVar) {
        if (this.f10353b == null) {
            return m12879b().mo8992d(fxVar);
        }
        if (C3065fc.m12712c(fxVar).mo9182j()) {
            return null;
        }
        C2980dx<T> dxVar = this.f10353b;
        this.f10355d.mo9332b();
        return dxVar.mo9140a();
    }

    /* renamed from: b */
    private C3004eg<T> m12879b() {
        C3004eg<T> egVar = this.f10357h;
        if (egVar != null) {
            return egVar;
        }
        C3004eg<T> d = this.f10354c.mo9136d(this.f10356e, this.f10355d);
        this.f10357h = d;
        return d;
    }
}
