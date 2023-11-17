package p217q2;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41224m;
import he1.C41233s;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7823b;
import ue1.C43075l;

/* renamed from: q2.m */
public final class C7851m {

    /* renamed from: c */
    public static final C7851m f22792c = new C7851m(C41344r0.m119928j());

    /* renamed from: d */
    private static final Map f22793d;

    /* renamed from: e */
    public static final C7862k f22794e;

    /* renamed from: a */
    private final Map f22795a;

    /* renamed from: b */
    private final Map f22796b;

    /* renamed from: q2.m$a */
    static final class C7852a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7852a f22797d = new C7852a();

        C7852a() {
            super(1);
        }

        /* renamed from: a */
        public final Object invoke(C7823b bVar) {
            C41536l.m120490j(bVar, C11755a.C11756a.f34100b);
            Object obj = bVar.f22746a;
            if (obj == null) {
                C41536l.m120500t();
            }
            return obj;
        }
    }

    /* renamed from: q2.m$b */
    static final class C7853b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7853b f22798d = new C7853b();

        C7853b() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
            if (r1 != null) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
            throw r3;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke(p217q2.C7823b r3) {
            /*
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.C41536l.m120490j(r3, r0)
                boolean r0 = r3 instanceof p217q2.C7823b.C7826c
                if (r0 != 0) goto L_0x0015
                boolean r0 = r3 instanceof p217q2.C7823b.C7827d
                if (r0 == 0) goto L_0x000e
                goto L_0x0015
            L_0x000e:
                java.lang.Object r3 = r3.f22746a
                java.lang.String r3 = java.lang.String.valueOf(r3)
                goto L_0x0031
            L_0x0015:
                dg1.b r0 = new dg1.b
                r0.<init>()
                t2.f$a r1 = p256t2.C8341f.f23740k
                t2.f r1 = r1.mo23535a(r0)
                java.lang.Object r3 = r3.f22746a     // Catch:{ all -> 0x0032 }
                p256t2.C8348h.m31406a(r3, r1)     // Catch:{ all -> 0x0032 }
                he1.w r3 = he1.C41238w.f97225a     // Catch:{ all -> 0x0032 }
                if (r1 != 0) goto L_0x002a
                goto L_0x002d
            L_0x002a:
                r1.close()
            L_0x002d:
                java.lang.String r3 = r0.mo94746o1()
            L_0x0031:
                return r3
            L_0x0032:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x0034 }
            L_0x0034:
                r3 = move-exception
                if (r1 == 0) goto L_0x003a
                r1.close()     // Catch:{ all -> 0x003a }
            L_0x003a:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p217q2.C7851m.C7853b.invoke(q2.b):java.lang.String");
        }
    }

    /* renamed from: q2.m$c */
    static final class C7854c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7854c f22799d = new C7854c();

        C7854c() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo22824a(C7823b bVar) {
            C41536l.m120490j(bVar, C11755a.C11756a.f34100b);
            if (bVar instanceof C7823b.C7825b) {
                return ((Boolean) ((C7823b.C7825b) bVar).f22746a).booleanValue();
            }
            if (bVar instanceof C7823b.C7829f) {
                return Boolean.parseBoolean((String) ((C7823b.C7829f) bVar).f22746a);
            }
            throw new IllegalArgumentException("Can't decode: " + bVar + " into Boolean");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo22824a((C7823b) obj));
        }
    }

    /* renamed from: q2.m$d */
    static final class C7855d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7855d f22800d = new C7855d();

        C7855d() {
            super(1);
        }

        /* renamed from: a */
        public final int mo22825a(C7823b bVar) {
            C41536l.m120490j(bVar, C11755a.C11756a.f34100b);
            if (bVar instanceof C7823b.C7828e) {
                return ((Number) ((C7823b.C7828e) bVar).f22746a).intValue();
            }
            if (bVar instanceof C7823b.C7829f) {
                return Integer.parseInt((String) ((C7823b.C7829f) bVar).f22746a);
            }
            throw new IllegalArgumentException("Can't decode: " + bVar + " into Integer");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(mo22825a((C7823b) obj));
        }
    }

    /* renamed from: q2.m$e */
    static final class C7856e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7856e f22801d = new C7856e();

        C7856e() {
            super(1);
        }

        /* renamed from: a */
        public final long mo22826a(C7823b bVar) {
            C41536l.m120490j(bVar, C11755a.C11756a.f34100b);
            if (bVar instanceof C7823b.C7828e) {
                return ((Number) ((C7823b.C7828e) bVar).f22746a).longValue();
            }
            if (bVar instanceof C7823b.C7829f) {
                return Long.parseLong((String) ((C7823b.C7829f) bVar).f22746a);
            }
            throw new IllegalArgumentException("Can't decode: " + bVar + " into Long");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Long.valueOf(mo22826a((C7823b) obj));
        }
    }

    /* renamed from: q2.m$f */
    static final class C7857f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7857f f22802d = new C7857f();

        C7857f() {
            super(1);
        }

        /* renamed from: a */
        public final float mo22827a(C7823b bVar) {
            C41536l.m120490j(bVar, C11755a.C11756a.f34100b);
            if (bVar instanceof C7823b.C7828e) {
                return ((Number) ((C7823b.C7828e) bVar).f22746a).floatValue();
            }
            if (bVar instanceof C7823b.C7829f) {
                return Float.parseFloat((String) ((C7823b.C7829f) bVar).f22746a);
            }
            throw new IllegalArgumentException("Can't decode: " + bVar + " into Float");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Float.valueOf(mo22827a((C7823b) obj));
        }
    }

    /* renamed from: q2.m$g */
    static final class C7858g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7858g f22803d = new C7858g();

        C7858g() {
            super(1);
        }

        /* renamed from: a */
        public final double mo22828a(C7823b bVar) {
            C41536l.m120490j(bVar, C11755a.C11756a.f34100b);
            if (bVar instanceof C7823b.C7828e) {
                return ((Number) ((C7823b.C7828e) bVar).f22746a).doubleValue();
            }
            if (bVar instanceof C7823b.C7829f) {
                return Double.parseDouble((String) ((C7823b.C7829f) bVar).f22746a);
            }
            throw new IllegalArgumentException("Can't decode: " + bVar + " into Double");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Double.valueOf(mo22828a((C7823b) obj));
        }
    }

    /* renamed from: q2.m$h */
    public static final class C7859h implements C7822a {
        C7859h() {
        }

        /* renamed from: c */
        public C7832d mo22743b(C7823b bVar) {
            String str;
            C41536l.m120490j(bVar, C11755a.C11756a.f34100b);
            Object obj = bVar.f22746a;
            if (obj == null || (str = obj.toString()) == null) {
                str = "";
            }
            return new C7832d("", str);
        }

        /* renamed from: d */
        public C7823b mo22742a(C7832d dVar) {
            C41536l.m120490j(dVar, C11755a.C11756a.f34100b);
            return new C7823b.C7829f(dVar.mo22762b());
        }
    }

    /* renamed from: q2.m$i */
    static final class C7860i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7860i f22804d = new C7860i();

        C7860i() {
            super(1);
        }

        /* renamed from: a */
        public final Map invoke(C7823b bVar) {
            C41536l.m120490j(bVar, C11755a.C11756a.f34100b);
            if (bVar instanceof C7823b.C7827d) {
                return (Map) ((C7823b.C7827d) bVar).f22746a;
            }
            throw new IllegalArgumentException("Can't decode: " + bVar + " into Map");
        }
    }

    /* renamed from: q2.m$j */
    static final class C7861j extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7861j f22805d = new C7861j();

        C7861j() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C7823b bVar) {
            C41536l.m120490j(bVar, C11755a.C11756a.f34100b);
            if (bVar instanceof C7823b.C7826c) {
                return (List) ((C7823b.C7826c) bVar).f22746a;
            }
            throw new IllegalArgumentException("Can't decode: " + bVar + " into List");
        }
    }

    /* renamed from: q2.m$k */
    public static final class C7862k {

        /* renamed from: q2.m$k$a */
        public static final class C7863a implements C7822a {

            /* renamed from: a */
            final /* synthetic */ C43075l f22806a;

            C7863a(C43075l lVar) {
                this.f22806a = lVar;
            }

            /* renamed from: a */
            public C7823b mo22742a(Object obj) {
                C41536l.m120490j(obj, C11755a.C11756a.f34100b);
                return C7823b.f22745b.mo22744a(obj);
            }

            /* renamed from: b */
            public Object mo22743b(C7823b bVar) {
                C41536l.m120490j(bVar, C11755a.C11756a.f34100b);
                return this.f22806a.invoke(bVar);
            }
        }

        private C7862k() {
        }

        public /* synthetic */ C7862k(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final Map m29801b(String[] strArr, C43075l lVar) {
            C7863a aVar = new C7863a(lVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C43429k.m124585d(C41342q0.m119921f(strArr.length), 16));
            for (String a : strArr) {
                C41224m a2 = C41233s.m119492a(a, aVar);
                linkedHashMap.put(a2.mo95678e(), a2.mo95680f());
            }
            return linkedHashMap;
        }
    }

    static {
        C7862k kVar = new C7862k((DefaultConstructorMarker) null);
        f22794e = kVar;
        f22793d = C41344r0.m119936r(C41344r0.m119936r(C41344r0.m119936r(C41344r0.m119936r(C41344r0.m119936r(C41344r0.m119936r(C41344r0.m119936r(C41344r0.m119936r(C41344r0.m119936r(C41344r0.m119936r(C41344r0.m119928j(), kVar.m29801b(new String[]{"java.lang.String", "kotlin.String"}, C7853b.f22798d)), kVar.m29801b(new String[]{"java.lang.Boolean", "kotlin.Boolean", "boolean"}, C7854c.f22799d)), kVar.m29801b(new String[]{"java.lang.Integer", "kotlin.Int", "int"}, C7855d.f22800d)), kVar.m29801b(new String[]{"java.lang.Long", "kotlin.Long", "long"}, C7856e.f22801d)), kVar.m29801b(new String[]{"java.lang.Float", "kotlin.Float", "float"}, C7857f.f22802d)), kVar.m29801b(new String[]{"java.lang.Double", "kotlin.Double", "double"}, C7858g.f22803d)), C41342q0.m119922g(C41233s.m119492a("com.apollographql.apollo.api.FileUpload", new C7859h()))), kVar.m29801b(new String[]{"java.util.Map", "kotlin.collections.Map"}, C7860i.f22804d)), kVar.m29801b(new String[]{"java.util.List", "kotlin.collections.List"}, C7861j.f22805d)), kVar.m29801b(new String[]{"java.lang.Object", "kotlin.Any"}, C7852a.f22797d));
    }

    public C7851m(Map map) {
        C41536l.m120490j(map, "customAdapters");
        this.f22796b = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C41342q0.m119921f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((C7850l) entry.getKey()).typeName(), entry.getValue());
        }
        this.f22795a = linkedHashMap;
    }

    /* renamed from: a */
    public final C7822a mo22821a(C7850l lVar) {
        C41536l.m120490j(lVar, "scalarType");
        C7822a aVar = (C7822a) this.f22795a.get(lVar.typeName());
        if (aVar == null) {
            aVar = (C7822a) f22793d.get(lVar.className());
        }
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException(("Can't map GraphQL type: `" + lVar.typeName() + "` to: `" + lVar.className() + "`. Did you forget to add a custom type adapter?").toString());
    }
}
