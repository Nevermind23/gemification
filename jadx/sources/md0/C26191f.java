package md0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: md0.f */
public abstract class C26191f {

    /* renamed from: md0.f$a */
    public static final class C26192a extends C26191f {

        /* renamed from: a */
        private final Throwable f66397a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26192a(Throwable th) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(th, "throwable");
            this.f66397a = th;
        }

        /* renamed from: a */
        public final Throwable mo65219a() {
            return this.f66397a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26192a) && C41536l.m120484d(this.f66397a, ((C26192a) obj).f66397a);
        }

        public int hashCode() {
            return this.f66397a.hashCode();
        }

        public String toString() {
            Throwable th = this.f66397a;
            return "Error(throwable=" + th + ")";
        }
    }

    /* renamed from: md0.f$b */
    public static final class C26193b extends C26191f {

        /* renamed from: a */
        public static final C26193b f66398a = new C26193b();

        private C26193b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: md0.f$c */
    public static final class C26194c extends C26191f {

        /* renamed from: a */
        private final Object f66399a;

        public C26194c(Object obj) {
            super((DefaultConstructorMarker) null);
            this.f66399a = obj;
        }

        /* renamed from: a */
        public final Object mo65223a() {
            return this.f66399a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26194c) && C41536l.m120484d(this.f66399a, ((C26194c) obj).f66399a);
        }

        public int hashCode() {
            Object obj = this.f66399a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            Object obj = this.f66399a;
            return "Success(data=" + obj + ")";
        }
    }

    private C26191f() {
    }

    public /* synthetic */ C26191f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
