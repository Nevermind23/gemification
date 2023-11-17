package p652we;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: we.a */
public abstract class C18520a {

    /* renamed from: we.a$a */
    public static final class C18521a extends C18520a {

        /* renamed from: a */
        private final Throwable f52021a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18521a(Throwable th) {
            super((DefaultConstructorMarker) null);
            C41536l.m120490j(th, "throwable");
            this.f52021a = th;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C18521a) && C41536l.m120484d(this.f52021a, ((C18521a) obj).f52021a);
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.f52021a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Error(throwable=" + this.f52021a + ")";
        }
    }

    /* renamed from: we.a$b */
    public static final class C18522b extends C18520a {

        /* renamed from: a */
        private final Object f52022a;

        public C18522b(Object obj) {
            super((DefaultConstructorMarker) null);
            this.f52022a = obj;
        }

        /* renamed from: a */
        public final Object mo46331a() {
            return this.f52022a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C18522b) && C41536l.m120484d(this.f52022a, ((C18522b) obj).f52022a);
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.f52022a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Success(value=" + this.f52022a + ")";
        }
    }

    private C18520a() {
    }

    public /* synthetic */ C18520a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
