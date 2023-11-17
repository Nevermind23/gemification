package a30;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: a30.e */
public abstract class C19160e {

    /* renamed from: a30.e$a */
    public static final class C19161a extends C19160e {

        /* renamed from: a */
        public static final C19161a f53359a = new C19161a();

        private C19161a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: a30.e$b */
    public static final class C19162b extends C19160e {

        /* renamed from: a */
        public static final C19162b f53360a = new C19162b();

        private C19162b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: a30.e$c */
    public static final class C19163c extends C19160e {

        /* renamed from: a */
        public static final C19163c f53361a = new C19163c();

        private C19163c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: a30.e$d */
    public static final class C19164d extends C19160e {

        /* renamed from: a */
        public static final C19164d f53362a = new C19164d();

        private C19164d() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: a30.e$e */
    public static final class C19165e extends C19160e {

        /* renamed from: a */
        private final List f53363a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19165e(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "operations");
            this.f53363a = list;
        }

        /* renamed from: a */
        public final List mo47388a() {
            return this.f53363a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C19165e) && C41536l.m120484d(this.f53363a, ((C19165e) obj).f53363a);
        }

        public int hashCode() {
            return this.f53363a.hashCode();
        }

        public String toString() {
            List list = this.f53363a;
            return "Success(operations=" + list + ")";
        }
    }

    private C19160e() {
    }

    public /* synthetic */ C19160e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
