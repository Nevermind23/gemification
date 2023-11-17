package p217q2;

import androidx.work.C1958d;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q2.k */
public class C7846k {

    /* renamed from: g */
    public static final C7847a f22772g = new C7847a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C7849c f22773a;

    /* renamed from: b */
    private final String f22774b;

    /* renamed from: c */
    private final String f22775c;

    /* renamed from: d */
    private final Map f22776d;

    /* renamed from: e */
    private final boolean f22777e;

    /* renamed from: f */
    private final List f22778f;

    /* renamed from: q2.k$a */
    public static final class C7847a {
        private C7847a() {
        }

        public /* synthetic */ C7847a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7846k mo22810a(String str, String str2, Map map, boolean z, List list) {
            C41536l.m120490j(str, "responseName");
            C41536l.m120490j(str2, "fieldName");
            C7849c cVar = C7849c.BOOLEAN;
            if (map == null) {
                map = C41344r0.m119928j();
            }
            Map map2 = map;
            if (list == null) {
                list = C41341q.m119907j();
            }
            return new C7846k(cVar, str, str2, map2, z, list);
        }

        /* renamed from: b */
        public final C7848b mo22811b(String str, String str2, Map map, boolean z, C7850l lVar, List list) {
            C41536l.m120490j(str, "responseName");
            C41536l.m120490j(str2, "fieldName");
            C41536l.m120490j(lVar, "scalarType");
            if (map == null) {
                map = C41344r0.m119928j();
            }
            Map map2 = map;
            if (list == null) {
                list = C41341q.m119907j();
            }
            return new C7848b(str, str2, map2, z, list, lVar);
        }

        /* renamed from: c */
        public final C7846k mo22812c(String str, String str2, Map map, boolean z, List list) {
            C41536l.m120490j(str, "responseName");
            C41536l.m120490j(str2, "fieldName");
            C7849c cVar = C7849c.ENUM;
            if (map == null) {
                map = C41344r0.m119928j();
            }
            Map map2 = map;
            if (list == null) {
                list = C41341q.m119907j();
            }
            return new C7846k(cVar, str, str2, map2, z, list);
        }

        /* renamed from: d */
        public final C7846k mo22813d(String str, String str2, List list) {
            C41536l.m120490j(str, "responseName");
            C41536l.m120490j(str2, "fieldName");
            C7849c cVar = C7849c.FRAGMENT;
            Map j = C41344r0.m119928j();
            if (list == null) {
                list = C41341q.m119907j();
            }
            return new C7846k(cVar, str, str2, j, false, list);
        }

        /* renamed from: e */
        public final C7846k mo22814e(String str, String str2, Map map, boolean z, List list) {
            C41536l.m120490j(str, "responseName");
            C41536l.m120490j(str2, "fieldName");
            C7849c cVar = C7849c.INT;
            if (map == null) {
                map = C41344r0.m119928j();
            }
            Map map2 = map;
            if (list == null) {
                list = C41341q.m119907j();
            }
            return new C7846k(cVar, str, str2, map2, z, list);
        }

        /* renamed from: f */
        public final C7846k mo22815f(String str, String str2, Map map, boolean z, List list) {
            C41536l.m120490j(str, "responseName");
            C41536l.m120490j(str2, "fieldName");
            C7849c cVar = C7849c.LIST;
            if (map == null) {
                map = C41344r0.m119928j();
            }
            Map map2 = map;
            if (list == null) {
                list = C41341q.m119907j();
            }
            return new C7846k(cVar, str, str2, map2, z, list);
        }

        /* renamed from: g */
        public final C7846k mo22816g(String str, String str2, Map map, boolean z, List list) {
            C41536l.m120490j(str, "responseName");
            C41536l.m120490j(str2, "fieldName");
            C7849c cVar = C7849c.OBJECT;
            if (map == null) {
                map = C41344r0.m119928j();
            }
            Map map2 = map;
            if (list == null) {
                list = C41341q.m119907j();
            }
            return new C7846k(cVar, str, str2, map2, z, list);
        }

        /* renamed from: h */
        public final C7846k mo22817h(String str, String str2, Map map, boolean z, List list) {
            C41536l.m120490j(str, "responseName");
            C41536l.m120490j(str2, "fieldName");
            C7849c cVar = C7849c.STRING;
            if (map == null) {
                map = C41344r0.m119928j();
            }
            Map map2 = map;
            if (list == null) {
                list = C41341q.m119907j();
            }
            return new C7846k(cVar, str, str2, map2, z, list);
        }
    }

    /* renamed from: q2.k$b */
    public static final class C7848b extends C7846k {

        /* renamed from: h */
        private final C7850l f22779h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7848b(String str, String str2, Map map, boolean z, List list, C7850l lVar) {
            super(C7849c.CUSTOM, str, str2, map == null ? C41344r0.m119928j() : map, z, list == null ? C41341q.m119907j() : list);
            C41536l.m120490j(str, "responseName");
            C41536l.m120490j(str2, "fieldName");
            C41536l.m120490j(lVar, "scalarType");
            this.f22779h = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C7848b) && C7846k.super.equals(obj) && !(!C41536l.m120484d(this.f22779h, ((C7848b) obj).f22779h))) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final C7850l mo22818f() {
            return this.f22779h;
        }

        public int hashCode() {
            return (C7846k.super.hashCode() * 31) + this.f22779h.hashCode();
        }
    }

    /* renamed from: q2.k$c */
    public enum C7849c {
        STRING,
        INT,
        LONG,
        DOUBLE,
        BOOLEAN,
        ENUM,
        OBJECT,
        LIST,
        CUSTOM,
        FRAGMENT,
        FRAGMENTS
    }

    public C7846k(C7849c cVar, String str, String str2, Map map, boolean z, List list) {
        C41536l.m120490j(cVar, "type");
        C41536l.m120490j(str, "responseName");
        C41536l.m120490j(str2, "fieldName");
        C41536l.m120490j(map, "arguments");
        C41536l.m120490j(list, "conditions");
        this.f22773a = cVar;
        this.f22774b = str;
        this.f22775c = str2;
        this.f22776d = map;
        this.f22777e = z;
        this.f22778f = list;
    }

    /* renamed from: a */
    public final List mo22803a() {
        return this.f22778f;
    }

    /* renamed from: b */
    public final String mo22804b() {
        return this.f22775c;
    }

    /* renamed from: c */
    public final boolean mo22805c() {
        return this.f22777e;
    }

    /* renamed from: d */
    public final String mo22806d() {
        return this.f22774b;
    }

    /* renamed from: e */
    public final C7849c mo22807e() {
        return this.f22773a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7846k)) {
            return false;
        }
        C7846k kVar = (C7846k) obj;
        if (this.f22773a == kVar.f22773a && !(!C41536l.m120484d(this.f22774b, kVar.f22774b)) && !(!C41536l.m120484d(this.f22775c, kVar.f22775c)) && !(!C41536l.m120484d(this.f22776d, kVar.f22776d)) && this.f22777e == kVar.f22777e && !(!C41536l.m120484d(this.f22778f, kVar.f22778f))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f22773a.hashCode() * 31) + this.f22774b.hashCode()) * 31) + this.f22775c.hashCode()) * 31) + this.f22776d.hashCode()) * 31) + C1958d.m7693a(this.f22777e)) * 31) + this.f22778f.hashCode();
    }
}
