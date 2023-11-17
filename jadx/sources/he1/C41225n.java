package he1;

import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: he1.n */
public abstract class C41225n implements Serializable {

    /* renamed from: d */
    public static final C41226a f97210d = new C41226a((DefaultConstructorMarker) null);

    /* renamed from: he1.n$a */
    public static final class C41226a {
        private C41226a() {
        }

        public /* synthetic */ C41226a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: he1.n$b */
    public static final class C41227b implements Serializable {

        /* renamed from: d */
        public final Throwable f97211d;

        public C41227b(Throwable th) {
            C41536l.m120489i(th, "exception");
            this.f97211d = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C41227b) && C41536l.m120484d(this.f97211d, ((C41227b) obj).f97211d);
        }

        public int hashCode() {
            return this.f97211d.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f97211d + ')';
        }
    }

    /* renamed from: a */
    public static Object m119478a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m119479b(Object obj) {
        if (obj instanceof C41227b) {
            return ((C41227b) obj).f97211d;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m119480c(Object obj) {
        return obj instanceof C41227b;
    }

    /* renamed from: d */
    public static final boolean m119481d(Object obj) {
        return !(obj instanceof C41227b);
    }
}
