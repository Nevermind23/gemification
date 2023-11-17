package p326y8;

/* renamed from: y8.b0 */
public final class C9102b0 {

    /* renamed from: a */
    private final Class f25265a;

    /* renamed from: b */
    private final Class f25266b;

    /* renamed from: y8.b0$a */
    private @interface C9103a {
    }

    public C9102b0(Class cls, Class cls2) {
        this.f25265a = cls;
        this.f25266b = cls2;
    }

    /* renamed from: a */
    public static C9102b0 m33557a(Class cls, Class cls2) {
        return new C9102b0(cls, cls2);
    }

    /* renamed from: b */
    public static C9102b0 m33558b(Class cls) {
        return new C9102b0(C9103a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9102b0.class != obj.getClass()) {
            return false;
        }
        C9102b0 b0Var = (C9102b0) obj;
        if (!this.f25266b.equals(b0Var.f25266b)) {
            return false;
        }
        return this.f25265a.equals(b0Var.f25265a);
    }

    public int hashCode() {
        return (this.f25266b.hashCode() * 31) + this.f25265a.hashCode();
    }

    public String toString() {
        if (this.f25265a == C9103a.class) {
            return this.f25266b.getName();
        }
        return "@" + this.f25265a.getName() + " " + this.f25266b.getName();
    }
}
