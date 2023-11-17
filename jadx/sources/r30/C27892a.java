package r30;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r30.C27906g;

/* renamed from: r30.a */
public abstract class C27892a implements C27906g {

    /* renamed from: a */
    private final C27906g.C27907a f71037a;

    /* renamed from: r30.a$a */
    public static final class C27893a extends C27892a {

        /* renamed from: b */
        private final List f71038b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27893a(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "categories");
            this.f71038b = list;
        }

        /* renamed from: b */
        public final List mo67430b() {
            return this.f71038b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27893a) && C41536l.m120484d(this.f71038b, ((C27893a) obj).f71038b);
        }

        public int hashCode() {
            return this.f71038b.hashCode();
        }

        public String toString() {
            List list = this.f71038b;
            return "Categories(categories=" + list + ")";
        }
    }

    /* renamed from: r30.a$b */
    public static final class C27894b extends C27892a {

        /* renamed from: b */
        public static final C27894b f71039b = new C27894b();

        private C27894b() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C27892a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public C27906g.C27907a mo67429a() {
        return this.f71037a;
    }

    private C27892a() {
        this.f71037a = C27906g.C27907a.CATEGORIES_GROUP;
    }
}
