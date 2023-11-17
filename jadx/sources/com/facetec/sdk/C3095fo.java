package com.facetec.sdk;

import com.facetec.sdk.C3091fn;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.facetec.sdk.fo */
final class C3095fo<T> extends C3004eg<T> {

    /* renamed from: a */
    private final Type f10280a;

    /* renamed from: c */
    private final C2972dv f10281c;

    /* renamed from: d */
    private final C3004eg<T> f10282d;

    C3095fo(C2972dv dvVar, C3004eg<T> egVar, Type type) {
        this.f10281c = dvVar;
        this.f10282d = egVar;
        this.f10280a = type;
    }

    /* renamed from: b */
    public final void mo8991b(C3160gb gbVar, T t) {
        C3004eg<T> egVar = this.f10282d;
        Type type = this.f10280a;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f10280a) {
            egVar = this.f10281c.mo9133b(C3142fw.m12893c(type));
            if (egVar instanceof C3091fn.C3094d) {
                C3004eg<T> egVar2 = this.f10282d;
                if (!(egVar2 instanceof C3091fn.C3094d)) {
                    egVar = egVar2;
                }
            }
        }
        egVar.mo8991b(gbVar, t);
    }

    /* renamed from: d */
    public final T mo8992d(C3143fx fxVar) {
        return this.f10282d.mo8992d(fxVar);
    }
}
