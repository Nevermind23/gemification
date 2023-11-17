package p419fg;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fg.m */
public abstract class C12888m {

    /* renamed from: fg.m$a */
    public static final class C12889a extends C12888m {

        /* renamed from: a */
        private final C12878g f38072a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12889a(C12878g gVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(gVar, "message");
            this.f38072a = gVar;
        }

        /* renamed from: a */
        public final C12878g mo33621a() {
            return this.f38072a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12889a) && C41536l.m120484d(this.f38072a, ((C12889a) obj).f38072a);
        }

        public int hashCode() {
            return this.f38072a.hashCode();
        }

        public String toString() {
            C12878g gVar = this.f38072a;
            return "StartTyping(message=" + gVar + ")";
        }
    }

    /* renamed from: fg.m$b */
    public static final class C12890b extends C12888m {

        /* renamed from: a */
        private final C12878g f38073a;

        public C12890b(C12878g gVar) {
            super((DefaultConstructorMarker) null);
            this.f38073a = gVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12890b) && C41536l.m120484d(this.f38073a, ((C12890b) obj).f38073a);
        }

        public int hashCode() {
            C12878g gVar = this.f38073a;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        public String toString() {
            C12878g gVar = this.f38073a;
            return "StopTyping(message=" + gVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C12890b(C12878g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gVar);
        }
    }

    private C12888m() {
    }

    public /* synthetic */ C12888m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
