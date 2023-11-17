package p702zm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37623y;
import p603si.C17799b;

/* renamed from: zm.c */
public abstract class C19074c {

    /* renamed from: a */
    private final Object f53236a;

    /* renamed from: b */
    private final boolean f53237b;

    /* renamed from: c */
    private final boolean f53238c;

    /* renamed from: zm.c$a */
    public static final class C19075a extends C19074c {

        /* renamed from: d */
        private final boolean f53239d;

        /* renamed from: e */
        private final boolean f53240e;

        /* renamed from: f */
        private final boolean f53241f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19075a(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
        }

        /* renamed from: b */
        public static /* synthetic */ C19075a m64411b(C19075a aVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f53239d;
            }
            if ((i & 2) != 0) {
                z2 = aVar.f53240e;
            }
            if ((i & 4) != 0) {
                z3 = aVar.f53241f;
            }
            return aVar.mo47265a(z, z2, z3);
        }

        /* renamed from: a */
        public final C19075a mo47265a(boolean z, boolean z2, boolean z3) {
            return new C19075a(z, z2, z3);
        }

        /* renamed from: c */
        public Boolean mo47266c() {
            return Boolean.valueOf(this.f53239d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19075a)) {
                return false;
            }
            C19075a aVar = (C19075a) obj;
            return this.f53239d == aVar.f53239d && this.f53240e == aVar.f53240e && this.f53241f == aVar.f53241f;
        }

        public int hashCode() {
            boolean z = this.f53239d;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f53240e;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f53241f;
            if (!z4) {
                z2 = z4;
            }
            return i2 + (z2 ? 1 : 0);
        }

        public String toString() {
            boolean z = this.f53239d;
            boolean z2 = this.f53240e;
            boolean z3 = this.f53241f;
            return "BooleanField(data=" + z + ", isVisible=" + z2 + ", isEnabled=" + z3 + ")";
        }

        public C19075a(boolean z, boolean z2, boolean z3) {
            super(Boolean.valueOf(z), false, false, 6, (DefaultConstructorMarker) null);
            this.f53239d = z;
            this.f53240e = z2;
            this.f53241f = z3;
        }
    }

    /* renamed from: zm.c$b */
    public static final class C19076b extends C19074c {

        /* renamed from: d */
        private final C19072a f53242d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19076b(C19072a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : aVar);
        }

        /* renamed from: a */
        public final C19076b mo47270a(C19072a aVar) {
            return new C19076b(aVar);
        }

        /* renamed from: b */
        public C19072a mo47271b() {
            return this.f53242d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C19076b) && C41536l.m120484d(this.f53242d, ((C19076b) obj).f53242d);
        }

        public int hashCode() {
            C19072a aVar = this.f53242d;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            C19072a aVar = this.f53242d;
            return "DeliveryDistrict(data=" + aVar + ")";
        }

        public C19076b(C19072a aVar) {
            super(aVar, true, true, (DefaultConstructorMarker) null);
            this.f53242d = aVar;
        }
    }

    /* renamed from: zm.c$c */
    public static abstract class C19077c extends C19074c {

        /* renamed from: d */
        private final String f53243d;

        /* renamed from: e */
        private final boolean f53244e;

        /* renamed from: f */
        private final boolean f53245f;

        /* renamed from: g */
        private final C17799b f53246g;

        public /* synthetic */ C19077c(String str, boolean z, boolean z2, C17799b bVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, z2, bVar);
        }

        /* renamed from: a */
        public abstract String mo47275a();

        /* renamed from: b */
        public abstract C17799b mo47276b();

        /* renamed from: c */
        public final boolean mo47277c() {
            if (mo47275a() == null) {
                return false;
            }
            return mo47276b().mo45386g(String.valueOf(mo47275a()));
        }

        private C19077c(String str, boolean z, boolean z2, C17799b bVar) {
            super(str, z, z2, (DefaultConstructorMarker) null);
            this.f53243d = str;
            this.f53244e = z;
            this.f53245f = z2;
            this.f53246g = bVar;
        }
    }

    public /* synthetic */ C19074c(Object obj, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, z2);
    }

    /* renamed from: zm.c$d */
    public static final class C19078d extends C19077c {

        /* renamed from: h */
        private final String f53247h;

        /* renamed from: i */
        private final boolean f53248i;

        /* renamed from: j */
        private final boolean f53249j;

        /* renamed from: k */
        private final C17799b f53250k;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C19078d(String str, boolean z, boolean z2, C17799b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? C37623y.C37624a.m110637b(C37623y.f90388f, C17799b.C17805f.f50686d, (C37623y.C37625b) null, 1, (Object) null) : bVar);
        }

        /* renamed from: e */
        public static /* synthetic */ C19078d m64419e(C19078d dVar, String str, boolean z, boolean z2, C17799b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f53247h;
            }
            if ((i & 2) != 0) {
                z = dVar.f53248i;
            }
            if ((i & 4) != 0) {
                z2 = dVar.f53249j;
            }
            if ((i & 8) != 0) {
                bVar = dVar.f53250k;
            }
            return dVar.mo47278d(str, z, z2, bVar);
        }

        /* renamed from: a */
        public String mo47275a() {
            return this.f53247h;
        }

        /* renamed from: b */
        public C17799b mo47276b() {
            return this.f53250k;
        }

        /* renamed from: d */
        public final C19078d mo47278d(String str, boolean z, boolean z2, C17799b bVar) {
            C41536l.m120489i(bVar, "validator");
            return new C19078d(str, z, z2, bVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19078d)) {
                return false;
            }
            C19078d dVar = (C19078d) obj;
            return C41536l.m120484d(this.f53247h, dVar.f53247h) && this.f53248i == dVar.f53248i && this.f53249j == dVar.f53249j && C41536l.m120484d(this.f53250k, dVar.f53250k);
        }

        public int hashCode() {
            String str = this.f53247h;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z = this.f53248i;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f53249j;
            if (!z3) {
                z2 = z3;
            }
            return ((i + (z2 ? 1 : 0)) * 31) + this.f53250k.hashCode();
        }

        public String toString() {
            String str = this.f53247h;
            boolean z = this.f53248i;
            boolean z2 = this.f53249j;
            C17799b bVar = this.f53250k;
            return "StringField(data=" + str + ", isEnabled=" + z + ", isVisible=" + z2 + ", validator=" + bVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19078d(String str, boolean z, boolean z2, C17799b bVar) {
            super(str, z, z2, bVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "validator");
            this.f53247h = str;
            this.f53248i = z;
            this.f53249j = z2;
            this.f53250k = bVar;
        }
    }

    private C19074c(Object obj, boolean z, boolean z2) {
        this.f53236a = obj;
        this.f53237b = z;
        this.f53238c = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19074c(Object obj, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (DefaultConstructorMarker) null);
    }
}
