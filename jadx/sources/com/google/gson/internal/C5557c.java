package com.google.gson.internal;

import android.support.p013v4.media.session.C0125b;
import com.google.gson.C5617o;
import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p303wa.C8900a;
import p316xa.C8982a;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.gson.internal.c */
public final class C5557c {

    /* renamed from: a */
    private final Map f17732a;

    /* renamed from: b */
    private final boolean f17733b;

    /* renamed from: c */
    private final List f17734c;

    /* renamed from: com.google.gson.internal.c$a */
    class C5558a implements C5587h {
        C5558a() {
        }

        /* renamed from: a */
        public Object mo18376a() {
            return new TreeSet();
        }
    }

    /* renamed from: com.google.gson.internal.c$b */
    class C5559b implements C5587h {
        C5559b() {
        }

        /* renamed from: a */
        public Object mo18376a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.google.gson.internal.c$c */
    class C5560c implements C5587h {
        C5560c() {
        }

        /* renamed from: a */
        public Object mo18376a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: com.google.gson.internal.c$d */
    class C5561d implements C5587h {
        C5561d() {
        }

        /* renamed from: a */
        public Object mo18376a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.google.gson.internal.c$e */
    class C5562e implements C5587h {
        C5562e() {
        }

        /* renamed from: a */
        public Object mo18376a() {
            return new ConcurrentSkipListMap();
        }
    }

    /* renamed from: com.google.gson.internal.c$f */
    class C5563f implements C5587h {
        C5563f() {
        }

        /* renamed from: a */
        public Object mo18376a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.c$g */
    class C5564g implements C5587h {
        C5564g() {
        }

        /* renamed from: a */
        public Object mo18376a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.c$h */
    class C5565h implements C5587h {
        C5565h() {
        }

        /* renamed from: a */
        public Object mo18376a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.c$i */
    class C5566i implements C5587h {
        C5566i() {
        }

        /* renamed from: a */
        public Object mo18376a() {
            return new C5579g();
        }
    }

    /* renamed from: com.google.gson.internal.c$j */
    class C5567j implements C5587h {

        /* renamed from: a */
        final /* synthetic */ Class f17735a;

        C5567j(Class cls) {
            this.f17735a = cls;
        }

        /* renamed from: a */
        public Object mo18376a() {
            try {
                return C5599m.f17783a.mo18437d(this.f17735a);
            } catch (Exception e) {
                throw new RuntimeException("Unable to create instance of " + this.f17735a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.c$k */
    class C5568k implements C5587h {

        /* renamed from: a */
        final /* synthetic */ String f17737a;

        C5568k(String str) {
            this.f17737a = str;
        }

        /* renamed from: a */
        public Object mo18376a() {
            throw new JsonIOException(this.f17737a);
        }
    }

    /* renamed from: com.google.gson.internal.c$l */
    class C5569l implements C5587h {

        /* renamed from: a */
        final /* synthetic */ String f17739a;

        C5569l(String str) {
            this.f17739a = str;
        }

        /* renamed from: a */
        public Object mo18376a() {
            throw new JsonIOException(this.f17739a);
        }
    }

    /* renamed from: com.google.gson.internal.c$m */
    class C5570m implements C5587h {

        /* renamed from: a */
        final /* synthetic */ String f17741a;

        C5570m(String str) {
            this.f17741a = str;
        }

        /* renamed from: a */
        public Object mo18376a() {
            throw new JsonIOException(this.f17741a);
        }
    }

    /* renamed from: com.google.gson.internal.c$n */
    class C5571n implements C5587h {

        /* renamed from: a */
        final /* synthetic */ Type f17743a;

        C5571n(Type type) {
            this.f17743a = type;
        }

        /* renamed from: a */
        public Object mo18376a() {
            Type type = this.f17743a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f17743a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f17743a.toString());
        }
    }

    /* renamed from: com.google.gson.internal.c$o */
    class C5572o implements C5587h {

        /* renamed from: a */
        final /* synthetic */ Type f17744a;

        C5572o(Type type) {
            this.f17744a = type;
        }

        /* renamed from: a */
        public Object mo18376a() {
            Type type = this.f17744a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return new EnumMap((Class) type2);
                }
                throw new JsonIOException("Invalid EnumMap type: " + this.f17744a.toString());
            }
            throw new JsonIOException("Invalid EnumMap type: " + this.f17744a.toString());
        }
    }

    /* renamed from: com.google.gson.internal.c$p */
    class C5573p implements C5587h {

        /* renamed from: a */
        final /* synthetic */ String f17745a;

        C5573p(String str) {
            this.f17745a = str;
        }

        /* renamed from: a */
        public Object mo18376a() {
            throw new JsonIOException(this.f17745a);
        }
    }

    /* renamed from: com.google.gson.internal.c$q */
    class C5574q implements C5587h {

        /* renamed from: a */
        final /* synthetic */ String f17746a;

        C5574q(String str) {
            this.f17746a = str;
        }

        /* renamed from: a */
        public Object mo18376a() {
            throw new JsonIOException(this.f17746a);
        }
    }

    /* renamed from: com.google.gson.internal.c$r */
    class C5575r implements C5587h {

        /* renamed from: a */
        final /* synthetic */ Constructor f17747a;

        C5575r(Constructor constructor) {
            this.f17747a = constructor;
        }

        /* renamed from: a */
        public Object mo18376a() {
            try {
                return this.f17747a.newInstance(new Object[0]);
            } catch (InstantiationException e) {
                throw new RuntimeException("Failed to invoke constructor '" + C8900a.m33065c(this.f17747a) + "' with no args", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to invoke constructor '" + C8900a.m33065c(this.f17747a) + "' with no args", e2.getCause());
            } catch (IllegalAccessException e3) {
                throw C8900a.m33067e(e3);
            }
        }
    }

    public C5557c(Map map, boolean z, List list) {
        this.f17732a = map;
        this.f17733b = z;
        this.f17734c = list;
    }

    /* renamed from: a */
    static String m22189a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        } else if (!Modifier.isAbstract(modifiers)) {
            return null;
        } else {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
        }
    }

    /* renamed from: c */
    private static C5587h m22190c(Class cls, C5617o oVar) {
        String l;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        boolean z = false;
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            C5617o oVar2 = C5617o.ALLOW;
            if (oVar == oVar2 || (C5590k.m22240a(declaredConstructor, (Object) null) && (oVar != C5617o.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                z = true;
            }
            if (!z) {
                return new C5573p("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
            } else if (oVar != oVar2 || (l = C8900a.m33074l(declaredConstructor)) == null) {
                return new C5575r(declaredConstructor);
            } else {
                return new C5574q(l);
            }
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static C5587h m22191d(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C5558a();
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C5559b();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C5560c();
            }
            return new C5561d();
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C5562e();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C5563f();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C5564g();
            }
            if (type instanceof ParameterizedType) {
                if (!String.class.isAssignableFrom(C8982a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                    return new C5565h();
                }
            }
            return new C5566i();
        }
    }

    /* renamed from: e */
    private static C5587h m22192e(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new C5571n(type);
        }
        if (cls == EnumMap.class) {
            return new C5572o(type);
        }
        return null;
    }

    /* renamed from: f */
    private C5587h m22193f(Class cls) {
        if (this.f17733b) {
            return new C5567j(cls);
        }
        return new C5568k("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    /* renamed from: b */
    public C5587h mo18374b(C8982a aVar) {
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        C0125b.m366a(this.f17732a.get(type));
        C0125b.m366a(this.f17732a.get(rawType));
        C5587h e = m22192e(type, rawType);
        if (e != null) {
            return e;
        }
        C5617o b = C5590k.m22241b(this.f17734c, rawType);
        C5587h c = m22190c(rawType, b);
        if (c != null) {
            return c;
        }
        C5587h d = m22191d(type, rawType);
        if (d != null) {
            return d;
        }
        String a = m22189a(rawType);
        if (a != null) {
            return new C5569l(a);
        }
        if (b == C5617o.ALLOW) {
            return m22193f(rawType);
        }
        return new C5570m("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.f17732a.toString();
    }
}
