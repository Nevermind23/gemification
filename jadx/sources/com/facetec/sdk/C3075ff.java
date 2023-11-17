package com.facetec.sdk;

import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: com.facetec.sdk.ff */
public final class C3075ff implements C3013eo {

    /* renamed from: e */
    private final C3017er f10236e;

    /* renamed from: com.facetec.sdk.ff$d */
    static final class C3076d<E> extends C3004eg<Collection<E>> {

        /* renamed from: a */
        private final C3038ev<? extends Collection<E>> f10237a;

        /* renamed from: d */
        private final C3004eg<E> f10238d;

        public C3076d(C2972dv dvVar, Type type, C3004eg<E> egVar, C3038ev<? extends Collection<E>> evVar) {
            this.f10238d = new C3095fo(dvVar, egVar, type);
            this.f10237a = evVar;
        }

        /* renamed from: b */
        public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                gbVar.mo9318f();
                return;
            }
            gbVar.mo9312d();
            for (Object b : collection) {
                this.f10238d.mo8991b(gbVar, b);
            }
            gbVar.mo9306a();
        }

        /* renamed from: d */
        public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
            if (fxVar.mo9292f() == C3141fv.NULL) {
                fxVar.mo9298l();
                return null;
            }
            Collection collection = (Collection) this.f10237a.mo9206a();
            fxVar.mo9286b();
            while (fxVar.mo9291e()) {
                collection.add(this.f10238d.mo8992d(fxVar));
            }
            fxVar.mo9284a();
            return collection;
        }
    }

    public C3075ff(C3017er erVar) {
        this.f10236e = erVar;
    }

    /* renamed from: c */
    public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
        Type b = fwVar.mo9332b();
        Class<? super T> a = fwVar.mo9331a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        Type d = C3033et.m12678d(b, a);
        return new C3076d(dvVar, d, dvVar.mo9133b(C3142fw.m12893c(d)), this.f10236e.mo9204a(fwVar));
    }
}
