package p832mv;

import com.github.mikephil.charting.utils.Utils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p793iw.C25263b;

/* renamed from: mv.a */
public abstract class C26301a {
    private C26301a() {
    }

    public /* synthetic */ C26301a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final double mo65457a() {
        if (this instanceof C26304b) {
            Double d = ((C26304b) this).mo65465b().mo63818d();
            if (d != null) {
                return d.doubleValue();
            }
            return Utils.DOUBLE_EPSILON;
        } else if (this instanceof C26302a) {
            return ((C26302a) this).mo65458d();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: mv.a$a */
    public static final class C26302a extends C26301a {

        /* renamed from: d */
        public static final C26303a f66649d = new C26303a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: e */
        public static long f66650e = Long.MIN_VALUE;

        /* renamed from: a */
        private final String f66651a;

        /* renamed from: b */
        private final double f66652b;

        /* renamed from: c */
        private final long f66653c;

        /* renamed from: mv.a$a$a */
        public static final class C26303a {
            private C26303a() {
            }

            public /* synthetic */ C26303a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final long mo65464a() {
                long b = C26302a.f66650e;
                C26302a.f66650e = 1 + b;
                return b;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26302a(String str, double d, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, d, (i & 4) != 0 ? f66649d.mo65464a() : j);
        }

        /* renamed from: d */
        public final double mo65458d() {
            return this.f66652b;
        }

        /* renamed from: e */
        public final String mo65459e() {
            return this.f66651a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26302a)) {
                return false;
            }
            C26302a aVar = (C26302a) obj;
            return C41536l.m120484d(this.f66651a, aVar.f66651a) && Double.compare(this.f66652b, aVar.f66652b) == 0 && this.f66653c == aVar.f66653c;
        }

        /* renamed from: f */
        public long mo65461f() {
            return this.f66653c;
        }

        public int hashCode() {
            return (((this.f66651a.hashCode() * 31) + Double.doubleToLongBits(this.f66652b)) * 31) + C7397t.m28148a(this.f66653c);
        }

        public String toString() {
            String str = this.f66651a;
            double d = this.f66652b;
            long j = this.f66653c;
            return "CashOperation(description=" + str + ", amount=" + d + ", transactionId=" + j + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26302a(String str, double d, long j) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "description");
            this.f66651a = str;
            this.f66652b = d;
            this.f66653c = j;
        }
    }

    /* renamed from: mv.a$b */
    public static final class C26304b extends C26301a {

        /* renamed from: a */
        private final C25263b f66654a;

        /* renamed from: b */
        private final long f66655b;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C26304b(C25263b bVar, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i & 2) != 0 ? bVar.mo63831o() : j);
        }

        /* renamed from: b */
        public final C25263b mo65465b() {
            return this.f66654a;
        }

        /* renamed from: c */
        public long mo65466c() {
            return this.f66655b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C26304b)) {
                return false;
            }
            C26304b bVar = (C26304b) obj;
            return C41536l.m120484d(this.f66654a, bVar.f66654a) && this.f66655b == bVar.f66655b;
        }

        public int hashCode() {
            return (this.f66654a.hashCode() * 31) + C7397t.m28148a(this.f66655b);
        }

        public String toString() {
            C25263b bVar = this.f66654a;
            long j = this.f66655b;
            return "ExistingOperation(transaction=" + bVar + ", transactionId=" + j + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26304b(C25263b bVar, long j) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "transaction");
            this.f66654a = bVar;
            this.f66655b = j;
        }
    }
}
