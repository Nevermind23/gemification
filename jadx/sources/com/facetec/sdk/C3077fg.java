package com.facetec.sdk;

/* renamed from: com.facetec.sdk.fg */
public final class C3077fg implements C3013eo {

    /* renamed from: d */
    private final C3017er f10239d;

    public C3077fg(C3017er erVar) {
        this.f10239d = erVar;
    }

    /* renamed from: b */
    static C3004eg<?> m12730b(C3017er erVar, C2972dv dvVar, C3142fw<?> fwVar, C3012en enVar) {
        C3004eg<?> egVar;
        C3006eh ehVar;
        Object a = erVar.mo9204a(C3142fw.m12892b(enVar.mo9199d())).mo9206a();
        if (a instanceof C3004eg) {
            egVar = (C3004eg) a;
        } else if (a instanceof C3013eo) {
            egVar = ((C3013eo) a).mo9200c(dvVar, fwVar);
        } else {
            boolean z = a instanceof C3006eh;
            if (z || (a instanceof C2980dx)) {
                C2980dx dxVar = null;
                if (z) {
                    ehVar = (C3006eh) a;
                } else {
                    ehVar = null;
                }
                if (a instanceof C2980dx) {
                    dxVar = (C2980dx) a;
                }
                egVar = new C3135fq<>(ehVar, dxVar, dvVar, fwVar);
            } else {
                StringBuilder sb = new StringBuilder("Invalid attempt to bind an instance of ");
                sb.append(a.getClass().getName());
                sb.append(" as a @JsonAdapter for ");
                sb.append(fwVar.toString());
                sb.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (egVar == null || !enVar.mo9198a()) {
            return egVar;
        }
        return egVar.mo9185c();
    }

    /* renamed from: c */
    public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
        C3012en enVar = (C3012en) fwVar.mo9331a().getAnnotation(C3012en.class);
        if (enVar == null) {
            return null;
        }
        return m12730b(this.f10239d, dvVar, fwVar, enVar);
    }
}
