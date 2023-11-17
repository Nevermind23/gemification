package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.q */
public final class C41541q implements C41528e {

    /* renamed from: d */
    private final Class f97711d;

    /* renamed from: e */
    private final String f97712e;

    public C41541q(Class cls, String str) {
        C41536l.m120489i(cls, "jClass");
        C41536l.m120489i(str, "moduleName");
        this.f97711d = cls;
        this.f97712e = str;
    }

    /* renamed from: b */
    public Class mo96307b() {
        return this.f97711d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C41541q) && C41536l.m120484d(mo96307b(), ((C41541q) obj).mo96307b());
    }

    public int hashCode() {
        return mo96307b().hashCode();
    }

    public String toString() {
        return mo96307b().toString() + " (Kotlin reflection is not available)";
    }
}
