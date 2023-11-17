package b41;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b41.a */
public abstract class C31128a {

    /* renamed from: a */
    private final int f77361a;

    /* renamed from: b */
    private final Object f77362b;

    /* renamed from: b41.a$a */
    public static final class C31129a extends C31128a {

        /* renamed from: c */
        private final Throwable f77363c;

        /* renamed from: d */
        private final int f77364d;

        /* renamed from: e */
        private final Object f77365e;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C31129a(Throwable th, int i, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? null : obj);
        }

        /* renamed from: a */
        public Object mo71340a() {
            return this.f77365e;
        }

        /* renamed from: b */
        public int mo71341b() {
            return this.f77364d;
        }

        /* renamed from: c */
        public final Throwable mo71342c() {
            return this.f77363c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31129a)) {
                return false;
            }
            C31129a aVar = (C31129a) obj;
            return C41536l.m120484d(this.f77363c, aVar.f77363c) && this.f77364d == aVar.f77364d && C41536l.m120484d(this.f77365e, aVar.f77365e);
        }

        public int hashCode() {
            int hashCode = ((this.f77363c.hashCode() * 31) + this.f77364d) * 31;
            Object obj = this.f77365e;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            Throwable th = this.f77363c;
            int i = this.f77364d;
            Object obj = this.f77365e;
            return "Error(exception=" + th + ", requestCode=" + i + ", data=" + obj + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31129a(Throwable th, int i, Object obj) {
            super(i, obj, (DefaultConstructorMarker) null);
            C41536l.m120489i(th, "exception");
            this.f77363c = th;
            this.f77364d = i;
            this.f77365e = obj;
        }
    }

    /* renamed from: b41.a$b */
    public static final class C31130b extends C31128a {

        /* renamed from: c */
        private final int f77366c;

        /* renamed from: d */
        private final Object f77367d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C31130b(int i, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : obj);
        }

        /* renamed from: a */
        public Object mo71340a() {
            return this.f77367d;
        }

        /* renamed from: b */
        public int mo71341b() {
            return this.f77366c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31130b)) {
                return false;
            }
            C31130b bVar = (C31130b) obj;
            return this.f77366c == bVar.f77366c && C41536l.m120484d(this.f77367d, bVar.f77367d);
        }

        public int hashCode() {
            int i = this.f77366c * 31;
            Object obj = this.f77367d;
            return i + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            int i = this.f77366c;
            Object obj = this.f77367d;
            return "Loading(requestCode=" + i + ", data=" + obj + ")";
        }

        public C31130b(int i, Object obj) {
            super(i, obj, (DefaultConstructorMarker) null);
            this.f77366c = i;
            this.f77367d = obj;
        }
    }

    /* renamed from: b41.a$c */
    public static final class C31131c extends C31128a {

        /* renamed from: c */
        private final Object f77368c;

        /* renamed from: d */
        private final int f77369d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C31131c(Object obj, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i2 & 2) != 0 ? -1 : i);
        }

        /* renamed from: a */
        public Object mo71340a() {
            return this.f77368c;
        }

        /* renamed from: b */
        public int mo71341b() {
            return this.f77369d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31131c)) {
                return false;
            }
            C31131c cVar = (C31131c) obj;
            return C41536l.m120484d(this.f77368c, cVar.f77368c) && this.f77369d == cVar.f77369d;
        }

        public int hashCode() {
            Object obj = this.f77368c;
            return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f77369d;
        }

        public String toString() {
            Object obj = this.f77368c;
            int i = this.f77369d;
            return "Success(data=" + obj + ", requestCode=" + i + ")";
        }

        public C31131c(Object obj, int i) {
            super(i, obj, (DefaultConstructorMarker) null);
            this.f77368c = obj;
            this.f77369d = i;
        }
    }

    public /* synthetic */ C31128a(int i, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj);
    }

    /* renamed from: a */
    public abstract Object mo71340a();

    /* renamed from: b */
    public abstract int mo71341b();

    private C31128a(int i, Object obj) {
        this.f77361a = i;
        this.f77362b = obj;
    }
}
