package com.google.gson;

import com.google.gson.internal.C5557c;
import com.google.gson.internal.C5578f;
import com.google.gson.internal.C5589j;
import com.google.gson.internal.C5595l;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.C5552a;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.C5607a;
import com.google.gson.stream.MalformedJsonException;
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
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;
import p342j$.util.concurrent.ConcurrentHashMap;

public final class Gson {

    /* renamed from: A */
    static final C5489c f17496A = C5481b.IDENTITY;

    /* renamed from: B */
    static final C5623q f17497B = C5618p.DOUBLE;

    /* renamed from: C */
    static final C5623q f17498C = C5618p.LAZILY_PARSED_NUMBER;

    /* renamed from: z */
    static final String f17499z = null;

    /* renamed from: a */
    private final ThreadLocal f17500a;

    /* renamed from: b */
    private final ConcurrentMap f17501b;

    /* renamed from: c */
    private final C5557c f17502c;

    /* renamed from: d */
    private final JsonAdapterAnnotationTypeAdapterFactory f17503d;

    /* renamed from: e */
    final List f17504e;

    /* renamed from: f */
    final Excluder f17505f;

    /* renamed from: g */
    final C5489c f17506g;

    /* renamed from: h */
    final Map f17507h;

    /* renamed from: i */
    final boolean f17508i;

    /* renamed from: j */
    final boolean f17509j;

    /* renamed from: k */
    final boolean f17510k;

    /* renamed from: l */
    final boolean f17511l;

    /* renamed from: m */
    final boolean f17512m;

    /* renamed from: n */
    final boolean f17513n;

    /* renamed from: o */
    final boolean f17514o;

    /* renamed from: p */
    final boolean f17515p;

    /* renamed from: q */
    final String f17516q;

    /* renamed from: r */
    final int f17517r;

    /* renamed from: s */
    final int f17518s;

    /* renamed from: t */
    final C5614n f17519t;

    /* renamed from: u */
    final List f17520u;

    /* renamed from: v */
    final List f17521v;

    /* renamed from: w */
    final C5623q f17522w;

    /* renamed from: x */
    final C5623q f17523x;

    /* renamed from: y */
    final List f17524y;

    static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* renamed from: a */
        private TypeAdapter f17529a;

        FutureTypeAdapter() {
        }

        /* renamed from: f */
        private TypeAdapter m21851f() {
            TypeAdapter typeAdapter = this.f17529a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Delegate has not been set yet");
        }

        /* renamed from: b */
        public Object mo18185b(C9143a aVar) {
            return m21851f().mo18185b(aVar);
        }

        /* renamed from: d */
        public void mo18186d(C9146c cVar, Object obj) {
            m21851f().mo18186d(cVar, obj);
        }

        /* renamed from: e */
        public TypeAdapter mo18197e() {
            return m21851f();
        }

        /* renamed from: g */
        public void mo18198g(TypeAdapter typeAdapter) {
            if (this.f17529a == null) {
                this.f17529a = typeAdapter;
                return;
            }
            throw new AssertionError();
        }
    }

    public Gson() {
        this(Excluder.f17562j, f17496A, Collections.emptyMap(), false, false, false, true, false, false, false, true, C5614n.DEFAULT, f17499z, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f17497B, f17498C, Collections.emptyList());
    }

    /* renamed from: a */
    private static void m21802a(Object obj, C9143a aVar) {
        if (obj != null) {
            try {
                if (aVar.mo18348n0() != C9145b.END_DOCUMENT) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        }
    }

    /* renamed from: b */
    private static TypeAdapter m21803b(final TypeAdapter typeAdapter) {
        return new TypeAdapter() {
            /* renamed from: e */
            public AtomicLong mo18185b(C9143a aVar) {
                return new AtomicLong(((Number) TypeAdapter.this.mo18185b(aVar)).longValue());
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, AtomicLong atomicLong) {
                TypeAdapter.this.mo18186d(cVar, Long.valueOf(atomicLong.get()));
            }
        }.mo18199a();
    }

    /* renamed from: c */
    private static TypeAdapter m21804c(final TypeAdapter typeAdapter) {
        return new TypeAdapter() {
            /* renamed from: e */
            public AtomicLongArray mo18185b(C9143a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.mo18340a();
                while (aVar.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.mo18185b(aVar)).longValue()));
                }
                aVar.mo18349s();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, AtomicLongArray atomicLongArray) {
                cVar.mo18362n();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    TypeAdapter.this.mo18186d(cVar, Long.valueOf(atomicLongArray.get(i)));
                }
                cVar.mo18365q();
            }
        }.mo18199a();
    }

    /* renamed from: d */
    static void m21805d(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    private TypeAdapter m21806e(boolean z) {
        if (z) {
            return TypeAdapters.f17695v;
        }
        return new TypeAdapter() {
            /* renamed from: e */
            public Double mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() != C9145b.NULL) {
                    return Double.valueOf(aVar.mo18337R());
                }
                aVar.mo18344f0();
                return null;
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, Number number) {
                if (number == null) {
                    cVar.mo18359Q();
                    return;
                }
                double doubleValue = number.doubleValue();
                Gson.m21805d(doubleValue);
                cVar.mo18364p0(doubleValue);
            }
        };
    }

    /* renamed from: f */
    private TypeAdapter m21807f(boolean z) {
        if (z) {
            return TypeAdapters.f17694u;
        }
        return new TypeAdapter() {
            /* renamed from: e */
            public Float mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() != C9145b.NULL) {
                    return Float.valueOf((float) aVar.mo18337R());
                }
                aVar.mo18344f0();
                return null;
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, Number number) {
                if (number == null) {
                    cVar.mo18359Q();
                    return;
                }
                float floatValue = number.floatValue();
                Gson.m21805d((double) floatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(floatValue);
                }
                cVar.mo18370x0(number);
            }
        };
    }

    /* renamed from: s */
    private static TypeAdapter m21808s(C5614n nVar) {
        if (nVar == C5614n.DEFAULT) {
            return TypeAdapters.f17693t;
        }
        return new TypeAdapter() {
            /* renamed from: e */
            public Number mo18185b(C9143a aVar) {
                if (aVar.mo18348n0() != C9145b.NULL) {
                    return Long.valueOf(aVar.mo18341a0());
                }
                aVar.mo18344f0();
                return null;
            }

            /* renamed from: f */
            public void mo18186d(C9146c cVar, Number number) {
                if (number == null) {
                    cVar.mo18359Q();
                } else {
                    cVar.mo18356F0(number.toString());
                }
            }
        };
    }

    /* renamed from: A */
    public void mo18162A(Object obj, Appendable appendable) {
        if (obj != null) {
            mo18163B(obj, obj.getClass(), appendable);
        } else {
            mo18183y(C5495i.f17561d, appendable);
        }
    }

    /* renamed from: B */
    public void mo18163B(Object obj, Type type, Appendable appendable) {
        try {
            mo18164C(obj, type, mo18179u(C5595l.m22247c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: C */
    public void mo18164C(Object obj, Type type, C9146c cVar) {
        TypeAdapter q = mo18175q(C8982a.get(type));
        boolean v = cVar.mo24722v();
        cVar.mo24718m0(true);
        boolean u = cVar.mo24721u();
        cVar.mo24716f0(this.f17511l);
        boolean t = cVar.mo24720t();
        cVar.mo24719n0(this.f17508i);
        try {
            q.mo18186d(cVar, obj);
            cVar.mo24718m0(v);
            cVar.mo24716f0(u);
            cVar.mo24719n0(t);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            cVar.mo24718m0(v);
            cVar.mo24716f0(u);
            cVar.mo24719n0(t);
            throw th;
        }
    }

    /* renamed from: g */
    public Object mo18165g(C5494h hVar, Class cls) {
        return C5589j.m22239b(cls).cast(mo18167i(hVar, C8982a.get(cls)));
    }

    /* renamed from: h */
    public Object mo18166h(C5494h hVar, Type type) {
        return mo18167i(hVar, C8982a.get(type));
    }

    /* renamed from: i */
    public Object mo18167i(C5494h hVar, C8982a aVar) {
        if (hVar == null) {
            return null;
        }
        return mo18173o(new C5552a(hVar), aVar);
    }

    /* renamed from: j */
    public Object mo18168j(Reader reader, Class cls) {
        return C5589j.m22239b(cls).cast(mo18169k(reader, C8982a.get(cls)));
    }

    /* renamed from: k */
    public Object mo18169k(Reader reader, C8982a aVar) {
        C9143a t = mo18177t(reader);
        Object o = mo18173o(t, aVar);
        m21802a(o, t);
        return o;
    }

    /* renamed from: l */
    public Object mo18170l(String str, Class cls) {
        return C5589j.m22239b(cls).cast(mo18172n(str, C8982a.get(cls)));
    }

    /* renamed from: m */
    public Object mo18171m(String str, Type type) {
        return mo18172n(str, C8982a.get(type));
    }

    /* renamed from: n */
    public Object mo18172n(String str, C8982a aVar) {
        if (str == null) {
            return null;
        }
        return mo18169k(new StringReader(str), aVar);
    }

    /* renamed from: o */
    public Object mo18173o(C9143a aVar, C8982a aVar2) {
        boolean x = aVar.mo24714x();
        aVar.mo24715x0(true);
        try {
            aVar.mo18348n0();
            Object b = mo18175q(aVar2).mo18185b(aVar);
            aVar.mo24715x0(x);
            return b;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.mo24715x0(x);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IOException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (AssertionError e4) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e4.getMessage());
            assertionError.initCause(e4);
            throw assertionError;
        } catch (Throwable th) {
            aVar.mo24715x0(x);
            throw th;
        }
    }

    /* renamed from: p */
    public TypeAdapter mo18174p(Class cls) {
        return mo18175q(C8982a.get(cls));
    }

    /* renamed from: q */
    public TypeAdapter mo18175q(C8982a aVar) {
        boolean z;
        Objects.requireNonNull(aVar, "type must not be null");
        TypeAdapter typeAdapter = (TypeAdapter) this.f17501b.get(aVar);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map map = (Map) this.f17500a.get();
        if (map == null) {
            map = new HashMap();
            this.f17500a.set(map);
            z = true;
        } else {
            z = false;
        }
        FutureTypeAdapter futureTypeAdapter = (FutureTypeAdapter) map.get(aVar);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter futureTypeAdapter2 = new FutureTypeAdapter();
            map.put(aVar, futureTypeAdapter2);
            for (C5624r a : this.f17504e) {
                TypeAdapter a2 = a.mo18225a(this, aVar);
                if (a2 != null) {
                    TypeAdapter typeAdapter2 = (TypeAdapter) this.f17501b.putIfAbsent(aVar, a2);
                    if (typeAdapter2 != null) {
                        a2 = typeAdapter2;
                    }
                    futureTypeAdapter2.mo18198g(a2);
                    return a2;
                }
            }
            throw new IllegalArgumentException("GSON (2.10) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f17500a.remove();
            }
        }
    }

    /* renamed from: r */
    public TypeAdapter mo18176r(C5624r rVar, C8982a aVar) {
        if (!this.f17504e.contains(rVar)) {
            rVar = this.f17503d;
        }
        boolean z = false;
        for (C5624r rVar2 : this.f17504e) {
            if (z) {
                TypeAdapter a = rVar2.mo18225a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (rVar2 == rVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* renamed from: t */
    public C9143a mo18177t(Reader reader) {
        C9143a aVar = new C9143a(reader);
        aVar.mo24715x0(this.f17513n);
        return aVar;
    }

    public String toString() {
        return "{serializeNulls:" + this.f17508i + ",factories:" + this.f17504e + ",instanceCreators:" + this.f17502c + "}";
    }

    /* renamed from: u */
    public C9146c mo18179u(Writer writer) {
        if (this.f17510k) {
            writer.write(")]}'\n");
        }
        C9146c cVar = new C9146c(writer);
        if (this.f17512m) {
            cVar.mo24717h0("  ");
        }
        cVar.mo24716f0(this.f17511l);
        cVar.mo24718m0(this.f17513n);
        cVar.mo24719n0(this.f17508i);
        return cVar;
    }

    /* renamed from: v */
    public String mo18180v(C5494h hVar) {
        StringWriter stringWriter = new StringWriter();
        mo18183y(hVar, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: w */
    public String mo18181w(Object obj) {
        if (obj == null) {
            return mo18180v(C5495i.f17561d);
        }
        return mo18182x(obj, obj.getClass());
    }

    /* renamed from: x */
    public String mo18182x(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo18163B(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: y */
    public void mo18183y(C5494h hVar, Appendable appendable) {
        try {
            mo18184z(hVar, mo18179u(C5595l.m22247c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: z */
    public void mo18184z(C5494h hVar, C9146c cVar) {
        boolean v = cVar.mo24722v();
        cVar.mo24718m0(true);
        boolean u = cVar.mo24721u();
        cVar.mo24716f0(this.f17511l);
        boolean t = cVar.mo24720t();
        cVar.mo24719n0(this.f17508i);
        try {
            C5595l.m22246b(hVar, cVar);
            cVar.mo24718m0(v);
            cVar.mo24716f0(u);
            cVar.mo24719n0(t);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            cVar.mo24718m0(v);
            cVar.mo24716f0(u);
            cVar.mo24719n0(t);
            throw th;
        }
    }

    Gson(Excluder excluder, C5489c cVar, Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, C5614n nVar, String str, int i, int i2, List list, List list2, List list3, C5623q qVar, C5623q qVar2, List list4) {
        Map map2 = map;
        boolean z9 = z2;
        boolean z12 = z7;
        boolean z13 = z8;
        List list5 = list4;
        this.f17500a = new ThreadLocal();
        this.f17501b = new ConcurrentHashMap();
        this.f17505f = excluder;
        this.f17506g = cVar;
        this.f17507h = map2;
        C5557c cVar2 = new C5557c(map2, z13, list5);
        this.f17502c = cVar2;
        this.f17508i = z;
        this.f17509j = z9;
        this.f17510k = z3;
        this.f17511l = z4;
        this.f17512m = z5;
        this.f17513n = z6;
        this.f17514o = z12;
        this.f17515p = z13;
        this.f17519t = nVar;
        this.f17516q = str;
        this.f17517r = i;
        this.f17518s = i2;
        this.f17520u = list;
        this.f17521v = list2;
        this.f17522w = qVar;
        this.f17523x = qVar2;
        this.f17524y = list5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f17672W);
        arrayList.add(ObjectTypeAdapter.m21972e(qVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f17652C);
        arrayList.add(TypeAdapters.f17686m);
        arrayList.add(TypeAdapters.f17680g);
        arrayList.add(TypeAdapters.f17682i);
        arrayList.add(TypeAdapters.f17684k);
        TypeAdapter s = m21808s(nVar);
        arrayList.add(TypeAdapters.m22019b(Long.TYPE, Long.class, s));
        arrayList.add(TypeAdapters.m22019b(Double.TYPE, Double.class, m21806e(z12)));
        arrayList.add(TypeAdapters.m22019b(Float.TYPE, Float.class, m21807f(z12)));
        arrayList.add(NumberTypeAdapter.m21965e(qVar2));
        arrayList.add(TypeAdapters.f17688o);
        arrayList.add(TypeAdapters.f17690q);
        arrayList.add(TypeAdapters.m22018a(AtomicLong.class, m21803b(s)));
        arrayList.add(TypeAdapters.m22018a(AtomicLongArray.class, m21804c(s)));
        arrayList.add(TypeAdapters.f17692s);
        arrayList.add(TypeAdapters.f17697x);
        arrayList.add(TypeAdapters.f17654E);
        arrayList.add(TypeAdapters.f17656G);
        arrayList.add(TypeAdapters.m22018a(BigDecimal.class, TypeAdapters.f17699z));
        arrayList.add(TypeAdapters.m22018a(BigInteger.class, TypeAdapters.f17650A));
        arrayList.add(TypeAdapters.m22018a(C5578f.class, TypeAdapters.f17651B));
        arrayList.add(TypeAdapters.f17658I);
        arrayList.add(TypeAdapters.f17660K);
        arrayList.add(TypeAdapters.f17664O);
        arrayList.add(TypeAdapters.f17666Q);
        arrayList.add(TypeAdapters.f17670U);
        arrayList.add(TypeAdapters.f17662M);
        arrayList.add(TypeAdapters.f17677d);
        arrayList.add(DateTypeAdapter.f17588b);
        arrayList.add(TypeAdapters.f17668S);
        if (C5607a.f17795a) {
            arrayList.add(C5607a.f17799e);
            arrayList.add(C5607a.f17798d);
            arrayList.add(C5607a.f17800f);
        }
        arrayList.add(ArrayTypeAdapter.f17582c);
        arrayList.add(TypeAdapters.f17675b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar2));
        arrayList.add(new MapTypeAdapterFactory(cVar2, z9));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar2);
        this.f17503d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f17673X);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar2, cVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f17504e = Collections.unmodifiableList(arrayList);
    }
}
