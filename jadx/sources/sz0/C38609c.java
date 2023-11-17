package sz0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: sz0.c */
public abstract class C38609c {

    /* renamed from: sz0.c$a */
    public static final class C38610a extends C38609c {

        /* renamed from: a */
        private final String f92473a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38610a(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "warningText");
            this.f92473a = str;
        }

        /* renamed from: a */
        public final String mo92241a() {
            return this.f92473a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C38610a) && C41536l.m120484d(this.f92473a, ((C38610a) obj).f92473a);
        }

        public int hashCode() {
            return this.f92473a.hashCode();
        }

        public String toString() {
            String str = this.f92473a;
            return "CommissionWarning(warningText=" + str + ")";
        }
    }

    /* renamed from: sz0.c$b */
    public static final class C38611b extends C38609c {

        /* renamed from: a */
        private final String f92474a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38611b(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "warningText");
            this.f92474a = str;
        }

        /* renamed from: a */
        public final String mo92245a() {
            return this.f92474a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C38611b) && C41536l.m120484d(this.f92474a, ((C38611b) obj).f92474a);
        }

        public int hashCode() {
            return this.f92474a.hashCode();
        }

        public String toString() {
            String str = this.f92474a;
            return "CommonWarning(warningText=" + str + ")";
        }
    }

    /* renamed from: sz0.c$c */
    public static final class C38612c extends C38609c {

        /* renamed from: a */
        public static final C38612c f92475a = new C38612c();

        private C38612c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: sz0.c$d */
    public static final class C38613d extends C38609c {

        /* renamed from: a */
        private final String f92476a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38613d(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "warningText");
            this.f92476a = str;
        }

        /* renamed from: a */
        public final String mo92249a() {
            return this.f92476a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C38613d) && C41536l.m120484d(this.f92476a, ((C38613d) obj).f92476a);
        }

        public int hashCode() {
            return this.f92476a.hashCode();
        }

        public String toString() {
            String str = this.f92476a;
            return "MultipleWarning(warningText=" + str + ")";
        }
    }

    /* renamed from: sz0.c$e */
    public static final class C38614e extends C38609c {

        /* renamed from: a */
        private final String f92477a;

        /* renamed from: b */
        private final Long f92478b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38614e(String str, Long l) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "warningText");
            this.f92477a = str;
            this.f92478b = l;
        }

        /* renamed from: a */
        public final Long mo92253a() {
            return this.f92478b;
        }

        /* renamed from: b */
        public final String mo92254b() {
            return this.f92477a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38614e)) {
                return false;
            }
            C38614e eVar = (C38614e) obj;
            return C41536l.m120484d(this.f92477a, eVar.f92477a) && C41536l.m120484d(this.f92478b, eVar.f92478b);
        }

        public int hashCode() {
            int hashCode = this.f92477a.hashCode() * 31;
            Long l = this.f92478b;
            return hashCode + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            String str = this.f92477a;
            Long l = this.f92478b;
            return "TransferWarning(warningText=" + str + ", acctKey=" + l + ")";
        }
    }

    /* renamed from: sz0.c$f */
    public static final class C38615f extends C38609c {

        /* renamed from: a */
        private final long f92479a;

        public C38615f(long j) {
            super((DefaultConstructorMarker) null);
            this.f92479a = j;
        }

        /* renamed from: a */
        public final long mo92258a() {
            return this.f92479a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C38615f) && this.f92479a == ((C38615f) obj).f92479a;
        }

        public int hashCode() {
            return C7397t.m28148a(this.f92479a);
        }

        public String toString() {
            long j = this.f92479a;
            return "ValidationSuccess(accKey=" + j + ")";
        }
    }

    private C38609c() {
    }

    public /* synthetic */ C38609c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
