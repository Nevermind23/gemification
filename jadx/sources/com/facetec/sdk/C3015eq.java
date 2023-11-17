package com.facetec.sdk;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facetec.sdk.eq */
public final class C3015eq implements C3013eo, Cloneable {

    /* renamed from: a */
    public static final C3015eq f10136a = new C3015eq();

    /* renamed from: b */
    private int f10137b = 136;

    /* renamed from: c */
    private boolean f10138c;

    /* renamed from: d */
    private double f10139d = -1.0d;

    /* renamed from: e */
    private boolean f10140e = true;

    /* renamed from: f */
    private List<C2962dr> f10141f = Collections.emptyList();

    /* renamed from: j */
    private List<C2962dr> f10142j = Collections.emptyList();

    /* renamed from: a */
    private static boolean m12634a(Class<?> cls) {
        return cls.isMemberClass() && !m12641e(cls);
    }

    /* renamed from: d */
    private boolean m12638d(boolean z) {
        for (C2962dr a : z ? this.f10141f : this.f10142j) {
            if (a.mo9128a()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C3015eq clone() {
        try {
            return (C3015eq) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final boolean mo9201b(Field field, boolean z) {
        C3010el elVar;
        if ((this.f10137b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f10139d != -1.0d && !m12633a((C3009ek) field.getAnnotation(C3009ek.class), (C3032es) field.getAnnotation(C3032es.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f10138c && ((elVar = (C3010el) field.getAnnotation(C3010el.class)) == null || (!z ? !elVar.mo9194c() : !elVar.mo9195d()))) {
            return true;
        }
        if ((!this.f10140e && m12634a(field.getType())) || m12635b(field.getType())) {
            return true;
        }
        List<C2962dr> list = z ? this.f10141f : this.f10142j;
        if (list.isEmpty()) {
            return false;
        }
        new C2961dq(field);
        for (C2962dr c : list) {
            if (c.mo9129c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
        boolean c = m12636c(fwVar.mo9331a());
        final boolean z = c || m12638d(true);
        final boolean z2 = c || m12638d(false);
        if (!z && !z2) {
            return null;
        }
        final C2972dv dvVar2 = dvVar;
        final C3142fw<T> fwVar2 = fwVar;
        return new C3004eg<T>() {

            /* renamed from: d */
            private C3004eg<T> f10146d;

            /* renamed from: e */
            private C3004eg<T> m12645e() {
                C3004eg<T> egVar = this.f10146d;
                if (egVar != null) {
                    return egVar;
                }
                C3004eg<T> d = dvVar2.mo9136d((C3013eo) C3015eq.this, fwVar2);
                this.f10146d = d;
                return d;
            }

            /* renamed from: b */
            public final void mo8991b(C3160gb gbVar, T t) {
                if (z) {
                    gbVar.mo9318f();
                } else {
                    m12645e().mo8991b(gbVar, t);
                }
            }

            /* renamed from: d */
            public final T mo8992d(C3143fx fxVar) {
                if (!z2) {
                    return m12645e().mo8992d(fxVar);
                }
                fxVar.mo9301o();
                return null;
            }
        };
    }

    /* renamed from: a */
    private boolean m12633a(C3009ek ekVar, C3032es esVar) {
        return m12640e(ekVar) && m12637d(esVar);
    }

    /* renamed from: e */
    public final boolean mo9203e(Class<?> cls, boolean z) {
        return m12636c(cls) || m12638d(z);
    }

    /* renamed from: d */
    private boolean m12637d(C3032es esVar) {
        return esVar == null || esVar.mo9207d() > this.f10139d;
    }

    /* renamed from: e */
    private static boolean m12641e(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: c */
    private boolean m12636c(Class<?> cls) {
        if (this.f10139d != -1.0d && !m12633a((C3009ek) cls.getAnnotation(C3009ek.class), (C3032es) cls.getAnnotation(C3032es.class))) {
            return true;
        }
        if ((this.f10140e || !m12634a(cls)) && !m12635b(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m12640e(C3009ek ekVar) {
        return ekVar == null || ekVar.mo9193e() <= this.f10139d;
    }

    /* renamed from: b */
    private static boolean m12635b(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls)) {
            return cls.isAnonymousClass() || cls.isLocalClass();
        }
        return false;
    }
}
