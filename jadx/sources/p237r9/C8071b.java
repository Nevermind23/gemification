package p237r9;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: r9.b */
public final class C8071b {

    /* renamed from: a */
    private final String f23235a;

    /* renamed from: b */
    private final Map f23236b;

    /* renamed from: r9.b$b */
    public static final class C8073b {

        /* renamed from: a */
        private final String f23237a;

        /* renamed from: b */
        private Map f23238b = null;

        C8073b(String str) {
            this.f23237a = str;
        }

        /* renamed from: a */
        public C8071b mo23251a() {
            Map map;
            String str = this.f23237a;
            if (this.f23238b == null) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(new HashMap(this.f23238b));
            }
            return new C8071b(str, map);
        }

        /* renamed from: b */
        public C8073b mo23252b(Annotation annotation) {
            if (this.f23238b == null) {
                this.f23238b = new HashMap();
            }
            this.f23238b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    /* renamed from: a */
    public static C8073b m30586a(String str) {
        return new C8073b(str);
    }

    /* renamed from: d */
    public static C8071b m30587d(String str) {
        return new C8071b(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String mo23246b() {
        return this.f23235a;
    }

    /* renamed from: c */
    public Annotation mo23247c(Class cls) {
        return (Annotation) this.f23236b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8071b)) {
            return false;
        }
        C8071b bVar = (C8071b) obj;
        if (!this.f23235a.equals(bVar.f23235a) || !this.f23236b.equals(bVar.f23236b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f23235a.hashCode() * 31) + this.f23236b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f23235a + ", properties=" + this.f23236b.values() + "}";
    }

    private C8071b(String str, Map map) {
        this.f23235a = str;
        this.f23236b = map;
    }
}
