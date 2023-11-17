package com.facetec.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facetec.sdk.dv */
public final class C2972dv {

    /* renamed from: c */
    private static C3142fw<?> f10050c = C3142fw.m12892b(Object.class);

    /* renamed from: a */
    private ThreadLocal<Map<C3142fw<?>, C2978a<?>>> f10051a;

    /* renamed from: b */
    private C3077fg f10052b;

    /* renamed from: d */
    private Map<C3142fw<?>, C3004eg<?>> f10053d;

    /* renamed from: e */
    private C3017er f10054e;

    /* renamed from: f */
    private boolean f10055f;

    /* renamed from: g */
    private C3015eq f10056g;

    /* renamed from: h */
    private List<C3013eo> f10057h;

    /* renamed from: i */
    private C2970dt f10058i;

    /* renamed from: j */
    private Map<Type, C2979dw<?>> f10059j;

    /* renamed from: k */
    private boolean f10060k;

    /* renamed from: l */
    private boolean f10061l;

    /* renamed from: m */
    private boolean f10062m;

    /* renamed from: n */
    private boolean f10063n;

    /* renamed from: o */
    private boolean f10064o;

    /* renamed from: p */
    private String f10065p;

    /* renamed from: q */
    private int f10066q;

    /* renamed from: r */
    private int f10067r;

    /* renamed from: s */
    private boolean f10068s;

    /* renamed from: t */
    private C3001ef f10069t;

    /* renamed from: x */
    private List<C3013eo> f10070x;

    /* renamed from: y */
    private List<C3013eo> f10071y;

    /* renamed from: com.facetec.sdk.dv$a */
    static class C2978a<T> extends C3004eg<T> {

        /* renamed from: a */
        C3004eg<T> f10076a;

        C2978a() {
        }

        /* renamed from: b */
        public final void mo8991b(C3160gb gbVar, T t) {
            C3004eg<T> egVar = this.f10076a;
            if (egVar != null) {
                egVar.mo8991b(gbVar, t);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: d */
        public final T mo8992d(C3143fx fxVar) {
            C3004eg<T> egVar = this.f10076a;
            if (egVar != null) {
                return egVar.mo8992d(fxVar);
            }
            throw new IllegalStateException();
        }
    }

    public C2972dv() {
        this(C3015eq.f10136a, C2963ds.f10044d, Collections.emptyMap(), false, false, false, true, false, false, false, C3001ef.f10132b, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    private String m12525a(C3000ee eeVar) {
        StringWriter stringWriter = new StringWriter();
        m12527b(eeVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: c */
    static void m12530c(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e */
    private String m12536e(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m12538e(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: b */
    public final <T> C3004eg<T> mo9133b(C3142fw<T> fwVar) {
        boolean z;
        C3004eg<T> egVar = this.f10053d.get(fwVar == null ? f10050c : fwVar);
        if (egVar != null) {
            return egVar;
        }
        Map map = this.f10051a.get();
        if (map == null) {
            map = new HashMap();
            this.f10051a.set(map);
            z = true;
        } else {
            z = false;
        }
        C2978a aVar = (C2978a) map.get(fwVar);
        if (aVar != null) {
            return aVar;
        }
        try {
            C2978a aVar2 = new C2978a();
            map.put(fwVar, aVar2);
            for (C3013eo c : this.f10057h) {
                C3004eg<T> c2 = c.mo9200c(this, fwVar);
                if (c2 != null) {
                    if (aVar2.f10076a == null) {
                        aVar2.f10076a = c2;
                        this.f10053d.put(fwVar, c2);
                        return c2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle ".concat(String.valueOf(fwVar)));
        } finally {
            map.remove(fwVar);
            if (z) {
                this.f10051a.remove();
            }
        }
    }

    /* renamed from: d */
    public final <T> C3004eg<T> mo9136d(C3013eo eoVar, C3142fw<T> fwVar) {
        if (!this.f10057h.contains(eoVar)) {
            eoVar = this.f10052b;
        }
        boolean z = false;
        for (C3013eo next : this.f10057h) {
            if (z) {
                C3004eg<T> c = next.mo9200c(this, fwVar);
                if (c != null) {
                    return c;
                }
            } else if (next == eoVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(fwVar)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.f10055f);
        sb.append(",factories:");
        sb.append(this.f10057h);
        sb.append(",instanceCreators:");
        sb.append(this.f10054e);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: c */
    private C3000ee m12528c(Object obj, Type type) {
        C3080fi fiVar = new C3080fi();
        m12537e(obj, type, (C3160gb) fiVar);
        return fiVar.mo9309b();
    }

    /* renamed from: e */
    private void m12538e(Object obj, Type type, Appendable appendable) {
        try {
            m12537e(obj, type, m12531d(C3065fc.m12713c(appendable)));
        } catch (IOException e) {
            throw new C2997eb((Throwable) e);
        }
    }

    C2972dv(C3015eq eqVar, C2970dt dtVar, Map<Type, C2979dw<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C3001ef efVar, String str, int i, int i2, List<C3013eo> list, List<C3013eo> list2, List<C3013eo> list3) {
        final C3004eg egVar;
        C3004eg egVar2;
        C3004eg egVar3;
        boolean z8 = z7;
        C3001ef efVar2 = efVar;
        ArrayList arrayList = new ArrayList(list3);
        arrayList.add(new C3178gu());
        this.f10051a = new ThreadLocal<>();
        this.f10053d = new ConcurrentHashMap();
        this.f10056g = eqVar;
        this.f10058i = dtVar;
        this.f10059j = map;
        this.f10054e = new C3017er(map);
        this.f10055f = z;
        this.f10063n = z2;
        this.f10061l = z3;
        this.f10064o = z4;
        this.f10062m = z5;
        this.f10060k = z6;
        this.f10068s = z8;
        this.f10069t = efVar2;
        this.f10065p = str;
        this.f10067r = i;
        this.f10066q = i2;
        this.f10070x = list;
        this.f10071y = list2;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(C3096fp.f10285C);
        arrayList2.add(C3086fl.f10254e);
        arrayList2.add(eqVar);
        arrayList2.addAll(arrayList);
        arrayList2.add(C3096fp.f10328t);
        arrayList2.add(C3096fp.f10315g);
        arrayList2.add(C3096fp.f10312d);
        arrayList2.add(C3096fp.f10310b);
        arrayList2.add(C3096fp.f10314f);
        if (efVar2 == C3001ef.f10132b) {
            egVar = C3096fp.f10320l;
        } else {
            egVar = new C3004eg<Number>() {
                /* renamed from: b */
                public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                    Number number = (Number) obj;
                    if (number == null) {
                        gbVar.mo9318f();
                    } else {
                        gbVar.mo9315d(number.toString());
                    }
                }

                /* renamed from: d */
                public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                    if (fxVar.mo9292f() != C3141fv.NULL) {
                        return Long.valueOf(fxVar.mo9297k());
                    }
                    fxVar.mo9298l();
                    return null;
                }
            };
        }
        arrayList2.add(C3096fp.m12796a(Long.TYPE, Long.class, egVar));
        Class cls = Double.TYPE;
        if (z8) {
            egVar2 = C3096fp.f10322n;
        } else {
            egVar2 = new C3004eg<Number>() {
                /* renamed from: b */
                public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                    Number number = (Number) obj;
                    if (number == null) {
                        gbVar.mo9318f();
                        return;
                    }
                    C2972dv.m12530c(number.doubleValue());
                    gbVar.mo9307a(number);
                }

                /* renamed from: d */
                public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                    if (fxVar.mo9292f() != C3141fv.NULL) {
                        return Double.valueOf(fxVar.mo9300n());
                    }
                    fxVar.mo9298l();
                    return null;
                }
            };
        }
        arrayList2.add(C3096fp.m12796a(cls, Double.class, egVar2));
        Class cls2 = Float.TYPE;
        if (z8) {
            egVar3 = C3096fp.f10319k;
        } else {
            egVar3 = new C3004eg<Number>() {
                /* renamed from: b */
                public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                    Number number = (Number) obj;
                    if (number == null) {
                        gbVar.mo9318f();
                        return;
                    }
                    C2972dv.m12530c((double) number.floatValue());
                    gbVar.mo9307a(number);
                }

                /* renamed from: d */
                public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                    if (fxVar.mo9292f() != C3141fv.NULL) {
                        return Float.valueOf((float) fxVar.mo9300n());
                    }
                    fxVar.mo9298l();
                    return null;
                }
            };
        }
        arrayList2.add(C3096fp.m12796a(cls2, Float.class, egVar3));
        arrayList2.add(C3096fp.f10321m);
        arrayList2.add(C3096fp.f10316h);
        arrayList2.add(C3096fp.f10317i);
        arrayList2.add(C3096fp.m12797c(AtomicLong.class, new C3004eg<AtomicLong>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                C3004eg.this.mo8991b(gbVar, Long.valueOf(((AtomicLong) obj).get()));
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                return new AtomicLong(((Number) C3004eg.this.mo8992d(fxVar)).longValue());
            }
        }.mo9185c()));
        arrayList2.add(C3096fp.m12797c(AtomicLongArray.class, new C3004eg<AtomicLongArray>() {
            /* renamed from: b */
            public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                gbVar.mo9312d();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    C3004eg.this.mo8991b(gbVar, Long.valueOf(atomicLongArray.get(i)));
                }
                gbVar.mo9306a();
            }

            /* renamed from: d */
            public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
                ArrayList arrayList = new ArrayList();
                fxVar.mo9286b();
                while (fxVar.mo9291e()) {
                    arrayList.add(Long.valueOf(((Number) C3004eg.this.mo8992d(fxVar)).longValue()));
                }
                fxVar.mo9284a();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }
        }.mo9185c()));
        arrayList2.add(C3096fp.f10318j);
        arrayList2.add(C3096fp.f10323o);
        arrayList2.add(C3096fp.f10326r);
        arrayList2.add(C3096fp.f10327s);
        arrayList2.add(C3096fp.m12797c(BigDecimal.class, C3096fp.f10325q));
        arrayList2.add(C3096fp.m12797c(BigInteger.class, C3096fp.f10324p));
        arrayList2.add(C3096fp.f10333y);
        arrayList2.add(C3096fp.f10332x);
        arrayList2.add(C3096fp.f10331w);
        arrayList2.add(C3096fp.f10330v);
        arrayList2.add(C3096fp.f10286D);
        arrayList2.add(C3096fp.f10329u);
        arrayList2.add(C3096fp.f10313e);
        arrayList2.add(C3073fe.f10234a);
        arrayList2.add(C3096fp.f10283A);
        arrayList2.add(C3082fj.f10250c);
        arrayList2.add(C3084fk.f10252d);
        arrayList2.add(C3096fp.f10334z);
        arrayList2.add(C3062fa.f10223d);
        arrayList2.add(C3096fp.f10311c);
        arrayList2.add(new C3075ff(this.f10054e));
        arrayList2.add(new C3089fm(this.f10054e, z2));
        C3077fg fgVar = new C3077fg(this.f10054e);
        this.f10052b = fgVar;
        arrayList2.add(fgVar);
        arrayList2.add(C3096fp.f10287E);
        arrayList2.add(new C3091fn(this.f10054e, dtVar, eqVar, this.f10052b));
        this.f10057h = Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: d */
    private C3160gb m12531d(Writer writer) {
        if (this.f10061l) {
            writer.write(")]}'\n");
        }
        C3160gb gbVar = new C3160gb(writer);
        if (this.f10062m) {
            gbVar.mo9357c("  ");
        }
        gbVar.mo9358d(this.f10055f);
        return gbVar;
    }

    /* renamed from: c */
    public final String mo9135c(Object obj) {
        if (obj == null) {
            return m12525a(C2996ea.f10129b);
        }
        return m12536e(obj, (Type) obj.getClass());
    }

    /* renamed from: e */
    private void m12537e(Object obj, Type type, C3160gb gbVar) {
        C3004eg<?> b = mo9133b(C3142fw.m12893c(type));
        boolean i = gbVar.mo9360i();
        gbVar.mo9355a(true);
        boolean j = gbVar.mo9361j();
        gbVar.mo9356b(this.f10064o);
        boolean h = gbVar.mo9359h();
        gbVar.mo9358d(this.f10055f);
        try {
            b.mo8991b(gbVar, obj);
            gbVar.mo9355a(i);
            gbVar.mo9356b(j);
            gbVar.mo9358d(h);
        } catch (IOException e) {
            throw new C2997eb((Throwable) e);
        } catch (AssertionError e2) {
            StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.6): ");
            sb.append(e2.getMessage());
            AssertionError assertionError = new AssertionError(sb.toString());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            gbVar.mo9355a(i);
            gbVar.mo9356b(j);
            gbVar.mo9358d(h);
            throw th;
        }
    }

    /* renamed from: c */
    private C3143fx m12529c(Reader reader) {
        C3143fx fxVar = new C3143fx(reader);
        fxVar.mo9336a(this.f10060k);
        return fxVar;
    }

    /* renamed from: d */
    private void m12532d(C3000ee eeVar, C3160gb gbVar) {
        boolean i = gbVar.mo9360i();
        gbVar.mo9355a(true);
        boolean j = gbVar.mo9361j();
        gbVar.mo9356b(this.f10064o);
        boolean h = gbVar.mo9359h();
        gbVar.mo9358d(this.f10055f);
        try {
            C3065fc.m12714c(eeVar, gbVar);
            gbVar.mo9355a(i);
            gbVar.mo9356b(j);
            gbVar.mo9358d(h);
        } catch (IOException e) {
            throw new C2997eb((Throwable) e);
        } catch (AssertionError e2) {
            StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.6): ");
            sb.append(e2.getMessage());
            AssertionError assertionError = new AssertionError(sb.toString());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            gbVar.mo9355a(i);
            gbVar.mo9356b(j);
            gbVar.mo9358d(h);
            throw th;
        }
    }

    /* renamed from: b */
    public final <T> C3004eg<T> mo9134b(Class<T> cls) {
        return mo9133b(C3142fw.m12892b(cls));
    }

    /* renamed from: b */
    public final C3000ee mo9132b(Object obj) {
        if (obj == null) {
            return C2996ea.f10129b;
        }
        return m12528c(obj, obj.getClass());
    }

    /* renamed from: b */
    private void m12527b(C3000ee eeVar, Appendable appendable) {
        try {
            m12532d(eeVar, m12531d(C3065fc.m12713c(appendable)));
        } catch (IOException e) {
            throw new C2997eb((Throwable) e);
        }
    }

    /* renamed from: b */
    private <T> T m12526b(C3143fx fxVar, Type type) {
        boolean q = fxVar.mo9338q();
        fxVar.mo9336a(true);
        try {
            fxVar.mo9292f();
            T d = mo9133b(C3142fw.m12893c(type)).mo8992d(fxVar);
            fxVar.mo9336a(q);
            return d;
        } catch (EOFException e) {
            if (1 != 0) {
                fxVar.mo9336a(q);
                return null;
            }
            throw new C3007ei((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new C3007ei((Throwable) e2);
        } catch (IOException e3) {
            throw new C3007ei((Throwable) e3);
        } catch (AssertionError e4) {
            StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.6): ");
            sb.append(e4.getMessage());
            AssertionError assertionError = new AssertionError(sb.toString());
            assertionError.initCause(e4);
            throw assertionError;
        } catch (Throwable th) {
            fxVar.mo9336a(q);
            throw th;
        }
    }

    /* renamed from: e */
    public final <T> T mo9137e(String str, Class<T> cls) {
        return C3064fb.m12710b(cls).cast(m12535e(str, (Type) cls));
    }

    /* renamed from: e */
    private <T> T m12535e(String str, Type type) {
        if (str == null) {
            return null;
        }
        return m12534e((Reader) new StringReader(str), type);
    }

    /* renamed from: d */
    private static void m12533d(Object obj, C3143fx fxVar) {
        if (obj != null) {
            try {
                if (fxVar.mo9292f() != C3141fv.END_DOCUMENT) {
                    throw new C2997eb("JSON document was not fully consumed.");
                }
            } catch (C3145fy e) {
                throw new C3007ei((Throwable) e);
            } catch (IOException e2) {
                throw new C2997eb((Throwable) e2);
            }
        }
    }

    /* renamed from: e */
    private <T> T m12534e(Reader reader, Type type) {
        C3143fx c = m12529c(reader);
        T b = m12526b(c, type);
        m12533d((Object) b, c);
        return b;
    }
}
