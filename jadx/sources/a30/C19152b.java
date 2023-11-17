package a30;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: a30.b */
public abstract class C19152b {

    /* renamed from: a30.b$a */
    public static final class C19153a extends C19152b {

        /* renamed from: a */
        public static final C19153a f53340a = new C19153a();

        private C19153a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: a30.b$b */
    public static final class C19154b extends C19152b {

        /* renamed from: a */
        public static final C19154b f53341a = new C19154b();

        private C19154b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: a30.b$c */
    public static final class C19155c extends C19152b {

        /* renamed from: a */
        public static final C19155c f53342a = new C19155c();

        private C19155c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: a30.b$d */
    public static final class C19156d extends C19152b {

        /* renamed from: a */
        public static final C19156d f53343a = new C19156d();

        private C19156d() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: a30.b$e */
    public static final class C19157e extends C19152b {

        /* renamed from: a */
        private final List f53344a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19157e(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "contacts");
            this.f53344a = list;
        }

        /* renamed from: a */
        public final List mo47364a() {
            return this.f53344a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C19157e) && C41536l.m120484d(this.f53344a, ((C19157e) obj).f53344a);
        }

        public int hashCode() {
            return this.f53344a.hashCode();
        }

        public String toString() {
            List list = this.f53344a;
            return "Success(contacts=" + list + ")";
        }
    }

    private C19152b() {
    }

    public /* synthetic */ C19152b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
