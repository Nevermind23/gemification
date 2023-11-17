package ym0;

import cf1.C40419j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37623y;
import p603si.C17799b;

/* renamed from: ym0.a */
public abstract class C30096a {

    /* renamed from: d */
    public static final C30099c f75927d = new C30099c((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Object f75928a;

    /* renamed from: b */
    private final boolean f75929b;

    /* renamed from: c */
    private final boolean f75930c;

    /* renamed from: ym0.a$a */
    public static final class C30097a extends C30096a {

        /* renamed from: e */
        private final boolean f75931e;

        public C30097a(boolean z) {
            super(Boolean.valueOf(z), false, false, 6, (DefaultConstructorMarker) null);
            this.f75931e = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C30097a) && this.f75931e == ((C30097a) obj).f75931e;
        }

        public int hashCode() {
            boolean z = this.f75931e;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f75931e;
            return "BooleanField(data=" + z + ")";
        }
    }

    /* renamed from: ym0.a$b */
    public static final class C30098b extends C30096a {

        /* renamed from: e */
        private final C30104c f75932e;

        /* renamed from: f */
        private final boolean f75933f;

        /* renamed from: g */
        private final boolean f75934g;

        /* renamed from: h */
        private final C17799b f75935h;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C30098b(C30104c cVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
        }

        /* renamed from: b */
        public static /* synthetic */ C30098b m91065b(C30098b bVar, C30104c cVar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = bVar.f75932e;
            }
            if ((i & 2) != 0) {
                z = bVar.f75933f;
            }
            if ((i & 4) != 0) {
                z2 = bVar.f75934g;
            }
            return bVar.mo70362a(cVar, z, z2);
        }

        /* renamed from: a */
        public final C30098b mo70362a(C30104c cVar, boolean z, boolean z2) {
            C41536l.m120489i(cVar, "data");
            return new C30098b(cVar, z, z2);
        }

        /* renamed from: c */
        public C30104c mo70363c() {
            return this.f75932e;
        }

        /* renamed from: d */
        public final boolean mo70364d() {
            return (!mo70363c().mo70390c() || mo70363c().mo70392e()) && mo70365e();
        }

        /* renamed from: e */
        public final boolean mo70365e() {
            return this.f75935h.mo45386g(mo70363c().mo70391d());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30098b)) {
                return false;
            }
            C30098b bVar = (C30098b) obj;
            return C41536l.m120484d(this.f75932e, bVar.f75932e) && this.f75933f == bVar.f75933f && this.f75934g == bVar.f75934g;
        }

        public int hashCode() {
            int hashCode = this.f75932e.hashCode() * 31;
            boolean z = this.f75933f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f75934g;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            C30104c cVar = this.f75932e;
            boolean z = this.f75933f;
            boolean z2 = this.f75934g;
            return "ChildPhoneField(data=" + cVar + ", isEnabled=" + z + ", isVisible=" + z2 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30098b(C30104c cVar, boolean z, boolean z2) {
            super(cVar, z, z2, (DefaultConstructorMarker) null);
            C41536l.m120489i(cVar, "data");
            this.f75932e = cVar;
            this.f75933f = z;
            this.f75934g = z2;
            this.f75935h = C37623y.C37624a.m110637b(C37623y.f90388f, new C17799b.C17807h(new C40419j("^([0-9]{9}|[0-9]{12}|\\+[0-9]{12})$")), (C37623y.C37625b) null, 1, (Object) null);
        }
    }

    /* renamed from: ym0.a$c */
    public static final class C30099c {
        private C30099c() {
        }

        public /* synthetic */ C30099c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ym0.a$d */
    public static final class C30100d extends C30096a {

        /* renamed from: e */
        private final Long f75936e;

        /* renamed from: f */
        private final boolean f75937f;

        /* renamed from: g */
        private final boolean f75938g;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C30100d(Long l, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
        }

        /* renamed from: a */
        public Long mo70369a() {
            return this.f75936e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30100d)) {
                return false;
            }
            C30100d dVar = (C30100d) obj;
            return C41536l.m120484d(this.f75936e, dVar.f75936e) && this.f75937f == dVar.f75937f && this.f75938g == dVar.f75938g;
        }

        public int hashCode() {
            Long l = this.f75936e;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            boolean z = this.f75937f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f75938g;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            Long l = this.f75936e;
            boolean z = this.f75937f;
            boolean z2 = this.f75938g;
            return "DateField(data=" + l + ", isVisible=" + z + ", isEnabled=" + z2 + ")";
        }

        public C30100d(Long l, boolean z, boolean z2) {
            super(l, false, false, 6, (DefaultConstructorMarker) null);
            this.f75936e = l;
            this.f75937f = z;
            this.f75938g = z2;
        }
    }

    /* renamed from: ym0.a$e */
    public static abstract class C30101e extends C30096a {

        /* renamed from: e */
        private final String f75939e;

        /* renamed from: f */
        private final boolean f75940f;

        /* renamed from: g */
        private final boolean f75941g;

        /* renamed from: h */
        private final C17799b f75942h;

        public /* synthetic */ C30101e(String str, boolean z, boolean z2, C17799b bVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, z2, bVar);
        }

        /* renamed from: a */
        public abstract String mo70373a();

        /* renamed from: b */
        public abstract C17799b mo70374b();

        /* renamed from: c */
        public final boolean mo70375c() {
            if (mo70373a() == null) {
                return false;
            }
            return mo70374b().mo45386g(String.valueOf(mo70373a()));
        }

        private C30101e(String str, boolean z, boolean z2, C17799b bVar) {
            super(str, z, z2, (DefaultConstructorMarker) null);
            this.f75939e = str;
            this.f75940f = z;
            this.f75941g = z2;
            this.f75942h = bVar;
        }
    }

    public /* synthetic */ C30096a(Object obj, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, z2);
    }

    /* renamed from: ym0.a$f */
    public static final class C30102f extends C30101e {

        /* renamed from: i */
        private final String f75943i;

        /* renamed from: j */
        private final boolean f75944j;

        /* renamed from: k */
        private final boolean f75945k;

        /* renamed from: l */
        private final C17799b f75946l;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C30102f(String str, boolean z, boolean z2, C17799b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? C37623y.C37624a.m110637b(C37623y.f90388f, C17799b.C17805f.f50686d, (C37623y.C37625b) null, 1, (Object) null) : bVar);
        }

        /* renamed from: a */
        public String mo70373a() {
            return this.f75943i;
        }

        /* renamed from: b */
        public C17799b mo70374b() {
            return this.f75946l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30102f)) {
                return false;
            }
            C30102f fVar = (C30102f) obj;
            return C41536l.m120484d(this.f75943i, fVar.f75943i) && this.f75944j == fVar.f75944j && this.f75945k == fVar.f75945k && C41536l.m120484d(this.f75946l, fVar.f75946l);
        }

        public int hashCode() {
            String str = this.f75943i;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z = this.f75944j;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f75945k;
            if (!z3) {
                z2 = z3;
            }
            return ((i + (z2 ? 1 : 0)) * 31) + this.f75946l.hashCode();
        }

        public String toString() {
            String str = this.f75943i;
            boolean z = this.f75944j;
            boolean z2 = this.f75945k;
            C17799b bVar = this.f75946l;
            return "StringField(data=" + str + ", isEnabled=" + z + ", isVisible=" + z2 + ", validator=" + bVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30102f(String str, boolean z, boolean z2, C17799b bVar) {
            super(str, z, z2, bVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "validator");
            this.f75943i = str;
            this.f75944j = z;
            this.f75945k = z2;
            this.f75946l = bVar;
        }
    }

    private C30096a(Object obj, boolean z, boolean z2) {
        this.f75928a = obj;
        this.f75929b = z;
        this.f75930c = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30096a(Object obj, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (DefaultConstructorMarker) null);
    }
}
