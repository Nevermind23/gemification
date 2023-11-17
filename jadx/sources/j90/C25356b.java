package j90;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r80.C27948b;

/* renamed from: j90.b */
public abstract class C25356b {

    /* renamed from: j90.b$a */
    public static final class C25357a extends C25356b {

        /* renamed from: a */
        private final Throwable f65003a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25357a(Throwable th) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(th, "error");
            this.f65003a = th;
        }

        /* renamed from: a */
        public final Throwable mo63932a() {
            return this.f65003a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25357a) && C41536l.m120484d(this.f65003a, ((C25357a) obj).f65003a);
        }

        public int hashCode() {
            return this.f65003a.hashCode();
        }

        public String toString() {
            Throwable th = this.f65003a;
            return "Error(error=" + th + ")";
        }
    }

    /* renamed from: j90.b$b */
    public static final class C25358b extends C25356b {

        /* renamed from: a */
        public static final C25358b f65004a = new C25358b();

        private C25358b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: j90.b$c */
    public static final class C25359c extends C25356b {

        /* renamed from: a */
        private final C27948b f65005a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25359c(C27948b bVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "loanCalculation");
            this.f65005a = bVar;
        }

        /* renamed from: a */
        public final C27948b mo63936a() {
            return this.f65005a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25359c) && C41536l.m120484d(this.f65005a, ((C25359c) obj).f65005a);
        }

        public int hashCode() {
            return this.f65005a.hashCode();
        }

        public String toString() {
            C27948b bVar = this.f65005a;
            return "Success(loanCalculation=" + bVar + ")";
        }
    }

    private C25356b() {
    }

    public /* synthetic */ C25356b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
