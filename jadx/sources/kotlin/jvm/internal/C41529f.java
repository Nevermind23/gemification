package kotlin.jvm.internal;

import af1.C40296c;
import he1.C41224m;
import he1.C41233s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import te1.C42994a;
import ue1.C43064a;
import ue1.C43065b;
import ue1.C43066c;
import ue1.C43067d;
import ue1.C43068e;
import ue1.C43069f;
import ue1.C43070g;
import ue1.C43071h;
import ue1.C43072i;
import ue1.C43073j;
import ue1.C43074k;
import ue1.C43075l;
import ue1.C43076m;
import ue1.C43077n;
import ue1.C43078o;
import ue1.C43079p;
import ue1.C43080q;
import ue1.C43081r;
import ue1.C43082s;
import ue1.C43083t;
import ue1.C43084u;
import ue1.C43085v;
import ue1.C43086w;

/* renamed from: kotlin.jvm.internal.f */
public final class C41529f implements C40296c, C41528e {

    /* renamed from: e */
    public static final C41530a f97703e = new C41530a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Map f97704f;

    /* renamed from: g */
    private static final HashMap f97705g;

    /* renamed from: h */
    private static final HashMap f97706h;

    /* renamed from: i */
    private static final HashMap f97707i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Map f97708j;

    /* renamed from: d */
    private final Class f97709d;

    /* renamed from: kotlin.jvm.internal.f$a */
    public static final class C41530a {
        private C41530a() {
        }

        public /* synthetic */ C41530a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
            if (r2 == null) goto L_0x0043;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo96310a(java.lang.Class r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.C41536l.m120489i(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto L_0x000e
                goto L_0x00b6
            L_0x000e:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L_0x006c
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L_0x0043
                kotlin.jvm.internal.C41536l.m120488h(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = cf1.C40440x.m117132I0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L_0x0040
                goto L_0x0043
            L_0x0040:
                r1 = r2
                goto L_0x00b6
            L_0x0043:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                if (r8 == 0) goto L_0x0064
                kotlin.jvm.internal.C41536l.m120488h(r0, r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = cf1.C40440x.m117132I0(r0, r8, r1, r3, r1)
                goto L_0x00b6
            L_0x0064:
                kotlin.jvm.internal.C41536l.m120488h(r0, r5)
                java.lang.String r1 = cf1.C40440x.m117130H0(r0, r4, r1, r3, r1)
                goto L_0x00b6
            L_0x006c:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto L_0x00a1
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L_0x009e
                java.util.Map r0 = kotlin.jvm.internal.C41529f.f97708j
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L_0x009e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = r0.toString()
                r1 = r8
            L_0x009e:
                if (r1 != 0) goto L_0x00b6
                goto L_0x0040
            L_0x00a1:
                java.util.Map r0 = kotlin.jvm.internal.C41529f.f97708j
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L_0x00b6
                java.lang.String r1 = r8.getSimpleName()
            L_0x00b6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C41529f.C41530a.mo96310a(java.lang.Class):java.lang.String");
        }

        /* renamed from: b */
        public final boolean mo96311b(Object obj, Class cls) {
            C41536l.m120489i(cls, "jClass");
            Map d = C41529f.f97704f;
            C41536l.m120487g(d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) d.get(cls);
            if (num != null) {
                return C41527d0.m120466m(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = C42994a.m123349b(C42994a.m123350c(cls));
            }
            return cls.isInstance(obj);
        }
    }

    static {
        int i = 0;
        List m = C41341q.m119910m(C43064a.class, C43075l.class, C43079p.class, C43080q.class, C43081r.class, C43082s.class, C43083t.class, C43084u.class, C43085v.class, C43086w.class, C43065b.class, C43066c.class, C43067d.class, C43068e.class, C43069f.class, C43070g.class, C43071h.class, C43072i.class, C43073j.class, C43074k.class, C43076m.class, C43077n.class, C43078o.class);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(m, 10));
        for (Object next : m) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            arrayList.add(C41233s.m119492a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f97704f = C41344r0.m119939u(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f97705g = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f97706h = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C41536l.m120488h(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C41536l.m120488h(str, "kotlinName");
            sb.append(C40440x.m117136K0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C41224m a = C41233s.m119492a(sb2, str + ".Companion");
            hashMap3.put(a.mo95678e(), a.mo95680f());
        }
        for (Map.Entry entry : f97704f.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f97707i = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C41342q0.m119921f(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), C40440x.m117136K0((String) entry2.getValue(), '.', (String) null, 2, (Object) null));
        }
        f97708j = linkedHashMap;
    }

    public C41529f(Class cls) {
        C41536l.m120489i(cls, "jClass");
        this.f97709d = cls;
    }

    /* renamed from: a */
    public boolean mo94324a(Object obj) {
        return f97703e.mo96311b(obj, mo96307b());
    }

    /* renamed from: b */
    public Class mo96307b() {
        return this.f97709d;
    }

    /* renamed from: c */
    public String mo94325c() {
        return f97703e.mo96310a(mo96307b());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C41529f) && C41536l.m120484d(C42994a.m123349b(this), C42994a.m123349b((C40296c) obj));
    }

    public int hashCode() {
        return C42994a.m123349b(this).hashCode();
    }

    public String toString() {
        return mo96307b().toString() + " (Kotlin reflection is not available)";
    }
}
