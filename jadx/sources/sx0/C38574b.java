package sx0;

import cx0.C31456c;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: sx0.b */
public abstract class C38574b {

    /* renamed from: a */
    private final int f92419a;

    /* renamed from: sx0.b$a */
    public static final class C38575a extends C38574b {

        /* renamed from: b */
        public static final C38575a f92420b = new C38575a();

        private C38575a() {
            super(-1, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo92173b() {
            return true;
        }
    }

    /* renamed from: sx0.b$b */
    public static final class C38576b extends C38574b {

        /* renamed from: f */
        public static final C38577a f92421f = new C38577a((DefaultConstructorMarker) null);

        /* renamed from: b */
        private final StringSource f92422b;

        /* renamed from: c */
        private final List f92423c;

        /* renamed from: d */
        private final C31456c f92424d;

        /* renamed from: e */
        private final int f92425e;

        /* renamed from: sx0.b$b$a */
        public static final class C38577a extends C38586g {
            public /* synthetic */ C38577a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C38577a() {
                super(3);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38576b(StringSource stringSource, List list, C31456c cVar, int i) {
            super(f92421f.mo92201a(), (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "title");
            C41536l.m120489i(list, "data");
            C41536l.m120489i(cVar, "categoryNode");
            this.f92422b = stringSource;
            this.f92423c = list;
            this.f92424d = cVar;
            this.f92425e = i;
        }

        /* renamed from: b */
        public boolean mo92173b() {
            return !this.f92423c.isEmpty();
        }

        /* renamed from: c */
        public final C31456c mo92174c() {
            return this.f92424d;
        }

        /* renamed from: d */
        public final List mo92175d() {
            return this.f92423c;
        }

        /* renamed from: e */
        public final int mo92176e() {
            return this.f92425e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38576b)) {
                return false;
            }
            C38576b bVar = (C38576b) obj;
            return C41536l.m120484d(this.f92422b, bVar.f92422b) && C41536l.m120484d(this.f92423c, bVar.f92423c) && C41536l.m120484d(this.f92424d, bVar.f92424d) && this.f92425e == bVar.f92425e;
        }

        /* renamed from: f */
        public final StringSource mo92178f() {
            return this.f92422b;
        }

        public int hashCode() {
            return (((((this.f92422b.hashCode() * 31) + this.f92423c.hashCode()) * 31) + this.f92424d.hashCode()) * 31) + this.f92425e;
        }

        public String toString() {
            StringSource stringSource = this.f92422b;
            List list = this.f92423c;
            C31456c cVar = this.f92424d;
            int i = this.f92425e;
            return "Horizontal(title=" + stringSource + ", data=" + list + ", categoryNode=" + cVar + ", maxShown=" + i + ")";
        }
    }

    /* renamed from: sx0.b$c */
    public static final class C38578c extends C38574b {

        /* renamed from: d */
        public static final C38579a f92426d = new C38579a((DefaultConstructorMarker) null);

        /* renamed from: b */
        private final StringSource f92427b;

        /* renamed from: c */
        private final List f92428c;

        /* renamed from: sx0.b$c$a */
        public static final class C38579a extends C38586g {
            public /* synthetic */ C38579a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C38579a() {
                super(1);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38578c(StringSource stringSource, List list) {
            super(f92426d.mo92201a(), (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "title");
            C41536l.m120489i(list, "data");
            this.f92427b = stringSource;
            this.f92428c = list;
        }

        /* renamed from: b */
        public boolean mo92173b() {
            return !this.f92428c.isEmpty();
        }

        /* renamed from: c */
        public final List mo92181c() {
            return this.f92428c;
        }

        /* renamed from: d */
        public final StringSource mo92182d() {
            return this.f92427b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38578c)) {
                return false;
            }
            C38578c cVar = (C38578c) obj;
            return C41536l.m120484d(this.f92427b, cVar.f92427b) && C41536l.m120484d(this.f92428c, cVar.f92428c);
        }

        public int hashCode() {
            return (this.f92427b.hashCode() * 31) + this.f92428c.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f92427b;
            List list = this.f92428c;
            return "Other(title=" + stringSource + ", data=" + list + ")";
        }
    }

    /* renamed from: sx0.b$d */
    public static final class C38580d extends C38574b {

        /* renamed from: d */
        public static final C38581a f92429d = new C38581a((DefaultConstructorMarker) null);

        /* renamed from: b */
        private final StringSource f92430b;

        /* renamed from: c */
        private final List f92431c;

        /* renamed from: sx0.b$d$a */
        public static final class C38581a extends C38586g {
            public /* synthetic */ C38581a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C38581a() {
                super(0);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38580d(StringSource stringSource, List list) {
            super(f92429d.mo92201a(), (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "title");
            C41536l.m120489i(list, "data");
            this.f92430b = stringSource;
            this.f92431c = list;
        }

        /* renamed from: b */
        public boolean mo92173b() {
            return !this.f92431c.isEmpty();
        }

        /* renamed from: c */
        public final List mo92186c() {
            return this.f92431c;
        }

        /* renamed from: d */
        public final StringSource mo92187d() {
            return this.f92430b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38580d)) {
                return false;
            }
            C38580d dVar = (C38580d) obj;
            return C41536l.m120484d(this.f92430b, dVar.f92430b) && C41536l.m120484d(this.f92431c, dVar.f92431c);
        }

        public int hashCode() {
            return (this.f92430b.hashCode() * 31) + this.f92431c.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f92430b;
            List list = this.f92431c;
            return "Popular(title=" + stringSource + ", data=" + list + ")";
        }
    }

    /* renamed from: sx0.b$e */
    public static final class C38582e extends C38574b {

        /* renamed from: d */
        public static final C38583a f92432d = new C38583a((DefaultConstructorMarker) null);

        /* renamed from: b */
        private final StringSource f92433b;

        /* renamed from: c */
        private final List f92434c;

        /* renamed from: sx0.b$e$a */
        public static final class C38583a extends C38586g {
            public /* synthetic */ C38583a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C38583a() {
                super(2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38582e(StringSource stringSource, List list) {
            super(f92432d.mo92201a(), (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "title");
            C41536l.m120489i(list, "data");
            this.f92433b = stringSource;
            this.f92434c = list;
        }

        /* renamed from: b */
        public boolean mo92173b() {
            return !this.f92434c.isEmpty();
        }

        /* renamed from: c */
        public final List mo92191c() {
            return this.f92434c;
        }

        /* renamed from: d */
        public final StringSource mo92192d() {
            return this.f92433b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38582e)) {
                return false;
            }
            C38582e eVar = (C38582e) obj;
            return C41536l.m120484d(this.f92433b, eVar.f92433b) && C41536l.m120484d(this.f92434c, eVar.f92434c);
        }

        public int hashCode() {
            return (this.f92433b.hashCode() * 31) + this.f92434c.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f92433b;
            List list = this.f92434c;
            return "Vertical(title=" + stringSource + ", data=" + list + ")";
        }
    }

    /* renamed from: sx0.b$f */
    public static final class C38584f extends C38574b {

        /* renamed from: d */
        public static final C38585a f92435d = new C38585a((DefaultConstructorMarker) null);

        /* renamed from: b */
        private final StringSource f92436b;

        /* renamed from: c */
        private final List f92437c;

        /* renamed from: sx0.b$f$a */
        public static final class C38585a extends C38586g {
            public /* synthetic */ C38585a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C38585a() {
                super(4);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38584f(StringSource stringSource, List list) {
            super(f92435d.mo92201a(), (DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "title");
            C41536l.m120489i(list, "data");
            this.f92436b = stringSource;
            this.f92437c = list;
        }

        /* renamed from: b */
        public boolean mo92173b() {
            return !this.f92437c.isEmpty();
        }

        /* renamed from: c */
        public final List mo92196c() {
            return this.f92437c;
        }

        /* renamed from: d */
        public final StringSource mo92197d() {
            return this.f92436b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38584f)) {
                return false;
            }
            C38584f fVar = (C38584f) obj;
            return C41536l.m120484d(this.f92436b, fVar.f92436b) && C41536l.m120484d(this.f92437c, fVar.f92437c);
        }

        public int hashCode() {
            return (this.f92436b.hashCode() * 31) + this.f92437c.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f92436b;
            List list = this.f92437c;
            return "VerticalTemplate(title=" + stringSource + ", data=" + list + ")";
        }
    }

    /* renamed from: sx0.b$g */
    public static class C38586g {

        /* renamed from: a */
        private final int f92438a;

        public C38586g(int i) {
            this.f92438a = i;
        }

        /* renamed from: a */
        public final int mo92201a() {
            return this.f92438a;
        }
    }

    public /* synthetic */ C38574b(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* renamed from: a */
    public final int mo92172a() {
        return this.f92419a;
    }

    /* renamed from: b */
    public abstract boolean mo92173b();

    private C38574b(int i) {
        this.f92419a = i;
    }
}
