package com.facetec.sdk;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.facetec.sdk.fm */
public final class C3089fm implements C3013eo {

    /* renamed from: c */
    final boolean f10257c;

    /* renamed from: d */
    private final C3017er f10258d;

    /* renamed from: com.facetec.sdk.fm$d */
    final class C3090d<K, V> extends C3004eg<Map<K, V>> {

        /* renamed from: a */
        private final C3004eg<V> f10259a;

        /* renamed from: c */
        private final C3004eg<K> f10261c;

        /* renamed from: d */
        private final C3038ev<? extends Map<K, V>> f10262d;

        public C3090d(C2972dv dvVar, Type type, C3004eg<K> egVar, Type type2, C3004eg<V> egVar2, C3038ev<? extends Map<K, V>> evVar) {
            this.f10261c = new C3095fo(dvVar, egVar, type);
            this.f10259a = new C3095fo(dvVar, egVar2, type2);
            this.f10262d = evVar;
        }

        /* renamed from: b */
        public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
            String str;
            boolean z;
            Map map = (Map) obj;
            if (map == null) {
                gbVar.mo9318f();
            } else if (!C3089fm.this.f10257c) {
                gbVar.mo9316e();
                for (Map.Entry entry : map.entrySet()) {
                    gbVar.mo9308a(String.valueOf(entry.getKey()));
                    this.f10259a.mo8991b(gbVar, entry.getValue());
                }
                gbVar.mo9310c();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z2 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    C3000ee e = this.f10261c.mo9186e(entry2.getKey());
                    arrayList.add(e);
                    arrayList2.add(entry2.getValue());
                    if (e.mo9180g() || e.mo9181h()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 |= z;
                }
                if (z2) {
                    gbVar.mo9312d();
                    int size = arrayList.size();
                    while (i < size) {
                        gbVar.mo9312d();
                        C3065fc.m12714c((C3000ee) arrayList.get(i), gbVar);
                        this.f10259a.mo8991b(gbVar, arrayList2.get(i));
                        gbVar.mo9306a();
                        i++;
                    }
                    gbVar.mo9306a();
                    return;
                }
                gbVar.mo9316e();
                int size2 = arrayList.size();
                while (i < size2) {
                    C3000ee eeVar = (C3000ee) arrayList.get(i);
                    if (eeVar.mo9179f()) {
                        C3008ej o = eeVar.mo9183o();
                        if (o.mo9192n()) {
                            str = String.valueOf(o.mo9147d());
                        } else if (o.mo9191l()) {
                            str = Boolean.toString(o.mo9152i());
                        } else if (o.mo9190k()) {
                            str = o.mo9144b();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (eeVar.mo9182j()) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    gbVar.mo9308a(str);
                    this.f10259a.mo8991b(gbVar, arrayList2.get(i));
                    i++;
                }
                gbVar.mo9310c();
            }
        }

        /* renamed from: d */
        public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
            C3141fv f = fxVar.mo9292f();
            if (f == C3141fv.NULL) {
                fxVar.mo9298l();
                return null;
            }
            Map map = (Map) this.f10262d.mo9206a();
            if (f == C3141fv.BEGIN_ARRAY) {
                fxVar.mo9286b();
                while (fxVar.mo9291e()) {
                    fxVar.mo9286b();
                    K d = this.f10261c.mo8992d(fxVar);
                    if (map.put(d, this.f10259a.mo8992d(fxVar)) == null) {
                        fxVar.mo9284a();
                    } else {
                        throw new C3007ei("duplicate key: ".concat(String.valueOf(d)));
                    }
                }
                fxVar.mo9284a();
            } else {
                fxVar.mo9289d();
                while (fxVar.mo9291e()) {
                    C3048ey.f10208e.mo9263c(fxVar);
                    K d2 = this.f10261c.mo8992d(fxVar);
                    if (map.put(d2, this.f10259a.mo8992d(fxVar)) != null) {
                        throw new C3007ei("duplicate key: ".concat(String.valueOf(d2)));
                    }
                }
                fxVar.mo9287c();
            }
            return map;
        }
    }

    public C3089fm(C3017er erVar, boolean z) {
        this.f10258d = erVar;
        this.f10257c = z;
    }

    /* renamed from: c */
    public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
        C3004eg<Boolean> egVar;
        Type b = fwVar.mo9332b();
        if (!Map.class.isAssignableFrom(fwVar.mo9331a())) {
            return null;
        }
        Type[] c = C3033et.m12676c(b, C3033et.m12677d(b));
        Type type = c[0];
        if (type == Boolean.TYPE || type == Boolean.class) {
            egVar = C3096fp.f10307a;
        } else {
            egVar = dvVar.mo9133b(C3142fw.m12893c(type));
        }
        C3004eg<?> b2 = dvVar.mo9133b(C3142fw.m12893c(c[1]));
        C3038ev<T> a = this.f10258d.mo9204a(fwVar);
        return new C3090d(dvVar, c[0], egVar, c[1], b2, a);
    }
}
