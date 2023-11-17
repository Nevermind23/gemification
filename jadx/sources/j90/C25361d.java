package j90;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x80.C29660d;

/* renamed from: j90.d */
public abstract class C25361d {

    /* renamed from: j90.d$a */
    public static final class C25362a extends C25361d {

        /* renamed from: a */
        private final Throwable f65008a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25362a(Throwable th) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(th, "error");
            this.f65008a = th;
        }

        /* renamed from: a */
        public final Throwable mo63945a() {
            return this.f65008a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25362a) && C41536l.m120484d(this.f65008a, ((C25362a) obj).f65008a);
        }

        public int hashCode() {
            return this.f65008a.hashCode();
        }

        public String toString() {
            Throwable th = this.f65008a;
            return "Error(error=" + th + ")";
        }
    }

    /* renamed from: j90.d$b */
    public static final class C25363b extends C25361d {

        /* renamed from: a */
        private final C29660d f65009a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25363b(C29660d dVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(dVar, "response");
            this.f65009a = dVar;
        }

        /* renamed from: a */
        public final C29660d mo63949a() {
            return this.f65009a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25363b) && C41536l.m120484d(this.f65009a, ((C25363b) obj).f65009a);
        }

        public int hashCode() {
            return this.f65009a.hashCode();
        }

        public String toString() {
            C29660d dVar = this.f65009a;
            return "Success(response=" + dVar + ")";
        }
    }

    private C25361d() {
    }

    public /* synthetic */ C25361d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
