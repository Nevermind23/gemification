package w20;

import a10.C19148a;
import a30.C19151a;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p812kv.C25782e;
import p832mv.C26305b;

/* renamed from: w20.a */
public abstract class C29192a implements C19148a {

    /* renamed from: w20.a$a */
    public static final class C29193a extends C29192a {

        /* renamed from: a */
        private final String f74208a;

        /* renamed from: b */
        private final String f74209b = "ACCOUNT";

        /* renamed from: c */
        private final C29199g f74210c = C29199g.ENROLLMENT_ACCOUNT;

        public C29193a(String str) {
            super((DefaultConstructorMarker) null);
            this.f74208a = str;
        }

        /* renamed from: a */
        public String mo47349a() {
            return this.f74209b;
        }

        /* renamed from: b */
        public C29199g mo69026b() {
            return this.f74210c;
        }

        /* renamed from: c */
        public final String mo69027c() {
            return this.f74208a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29193a) && C41536l.m120484d(this.f74208a, ((C29193a) obj).f74208a);
        }

        public int hashCode() {
            String str = this.f74208a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f74208a;
            return "EnrollmentAccountItem(accountNumber=" + str + ")";
        }
    }

    /* renamed from: w20.a$b */
    public static final class C29194b extends C29192a {

        /* renamed from: a */
        private final double f74211a;

        /* renamed from: b */
        private final double f74212b;

        /* renamed from: c */
        private final String f74213c;

        /* renamed from: d */
        private final boolean f74214d;

        /* renamed from: e */
        private final C25782e f74215e;

        /* renamed from: f */
        private final String f74216f = "PROGRESS";

        /* renamed from: g */
        private final C29199g f74217g = C29199g.PROGRESS;

        /* renamed from: h */
        private final float f74218h;

        public C29194b(double d, double d2, String str, boolean z, C25782e eVar) {
            super((DefaultConstructorMarker) null);
            boolean z2;
            float f;
            this.f74211a = d;
            this.f74212b = d2;
            this.f74213c = str;
            this.f74214d = z;
            this.f74215e = eVar;
            if (d == Utils.DOUBLE_EPSILON) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f = 100.0f;
            } else {
                f = ((float) (d2 / d)) * ((float) 100);
            }
            this.f74218h = f;
        }

        /* renamed from: a */
        public String mo47349a() {
            return this.f74216f;
        }

        /* renamed from: b */
        public C29199g mo69026b() {
            return this.f74217g;
        }

        /* renamed from: c */
        public final String mo69031c() {
            return this.f74213c;
        }

        /* renamed from: d */
        public final boolean mo69032d() {
            return this.f74214d;
        }

        /* renamed from: e */
        public final float mo69033e() {
            return this.f74218h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29194b)) {
                return false;
            }
            C29194b bVar = (C29194b) obj;
            return Double.compare(this.f74211a, bVar.f74211a) == 0 && Double.compare(this.f74212b, bVar.f74212b) == 0 && C41536l.m120484d(this.f74213c, bVar.f74213c) && this.f74214d == bVar.f74214d && this.f74215e == bVar.f74215e;
        }

        /* renamed from: f */
        public final double mo69035f() {
            return this.f74212b;
        }

        /* renamed from: g */
        public final double mo69036g() {
            return this.f74211a;
        }

        /* renamed from: h */
        public final C25782e mo69037h() {
            return this.f74215e;
        }

        public int hashCode() {
            int a = ((Double.doubleToLongBits(this.f74211a) * 31) + Double.doubleToLongBits(this.f74212b)) * 31;
            String str = this.f74213c;
            int i = 0;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.f74214d;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            C25782e eVar = this.f74215e;
            if (eVar != null) {
                i = eVar.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            double d = this.f74211a;
            double d2 = this.f74212b;
            String str = this.f74213c;
            boolean z = this.f74214d;
            C25782e eVar = this.f74215e;
            return "MoneyRequestProgressItem(requestedAmount=" + d + ", receivedAmount=" + d2 + ", comment=" + str + ", hasOperations=" + z + ", state=" + eVar + ")";
        }
    }

    /* renamed from: w20.a$c */
    public static final class C29195c extends C29192a {

        /* renamed from: a */
        private final C19151a f74219a;

        /* renamed from: b */
        private final String f74220b;

        /* renamed from: c */
        private final C29199g f74221c = C29199g.OPERATION;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29195c(C19151a aVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "operation");
            this.f74219a = aVar;
            long e = aVar.mo47359e();
            this.f74220b = "OPERATION-" + e;
        }

        /* renamed from: a */
        public String mo47349a() {
            return this.f74220b;
        }

        /* renamed from: b */
        public C29199g mo69026b() {
            return this.f74221c;
        }

        /* renamed from: c */
        public final C19151a mo69040c() {
            return this.f74219a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29195c) && C41536l.m120484d(this.f74219a, ((C29195c) obj).f74219a);
        }

        public int hashCode() {
            return this.f74219a.hashCode();
        }

        public String toString() {
            C19151a aVar = this.f74219a;
            return "Operation(operation=" + aVar + ")";
        }
    }

    /* renamed from: w20.a$d */
    public static final class C29196d extends C29192a {

        /* renamed from: a */
        private final List f74222a;

        /* renamed from: b */
        private final String f74223b = "OPERATION_LIST_HORIZONTAL";

        /* renamed from: c */
        private final C29199g f74224c = C29199g.OPERATIONS_HORIZONTAL_LIST;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29196d(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "operations");
            this.f74222a = list;
        }

        /* renamed from: a */
        public String mo47349a() {
            return this.f74223b;
        }

        /* renamed from: b */
        public C29199g mo69026b() {
            return this.f74224c;
        }

        /* renamed from: c */
        public final List mo69044c() {
            return this.f74222a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29196d) && C41536l.m120484d(this.f74222a, ((C29196d) obj).f74222a);
        }

        public int hashCode() {
            return this.f74222a.hashCode();
        }

        public String toString() {
            List list = this.f74222a;
            return "OperationsHorizontalList(operations=" + list + ")";
        }
    }

    /* renamed from: w20.a$e */
    public static final class C29197e extends C29192a {

        /* renamed from: a */
        private final int f74225a;

        /* renamed from: b */
        private final String f74226b = "HEADER";

        /* renamed from: c */
        private final C29199g f74227c = C29199g.HEADER;

        public C29197e(int i) {
            super((DefaultConstructorMarker) null);
            this.f74225a = i;
        }

        /* renamed from: a */
        public String mo47349a() {
            return this.f74226b;
        }

        /* renamed from: b */
        public C29199g mo69026b() {
            return this.f74227c;
        }

        /* renamed from: c */
        public final int mo69048c() {
            return this.f74225a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C29197e) && this.f74225a == ((C29197e) obj).f74225a;
        }

        public int hashCode() {
            return this.f74225a;
        }

        public String toString() {
            int i = this.f74225a;
            return "RequestReceiverHeader(receiversCount=" + i + ")";
        }
    }

    /* renamed from: w20.a$f */
    public static final class C29198f extends C29192a {

        /* renamed from: a */
        private final String f74228a;

        /* renamed from: b */
        private final String f74229b;

        /* renamed from: c */
        private final String f74230c;

        /* renamed from: d */
        private final String f74231d;

        /* renamed from: e */
        private final int f74232e;

        /* renamed from: f */
        private final double f74233f;

        /* renamed from: g */
        private final double f74234g;

        /* renamed from: h */
        private final boolean f74235h;

        /* renamed from: i */
        private final C26305b.C26308c f74236i;

        /* renamed from: j */
        private final boolean f74237j;

        /* renamed from: k */
        private final C29199g f74238k = C29199g.RECEIVER;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29198f(String str, String str2, String str3, String str4, int i, double d, double d2, boolean z, C26305b.C26308c cVar, boolean z2) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "id");
            C41536l.m120489i(str2, "personName");
            C41536l.m120489i(cVar, "status");
            this.f74228a = str;
            this.f74229b = str2;
            this.f74230c = str3;
            this.f74231d = str4;
            this.f74232e = i;
            this.f74233f = d;
            this.f74234g = d2;
            this.f74235h = z;
            this.f74236i = cVar;
            this.f74237j = z2;
        }

        /* renamed from: a */
        public String mo47349a() {
            return this.f74228a;
        }

        /* renamed from: b */
        public C29199g mo69026b() {
            return this.f74238k;
        }

        /* renamed from: c */
        public final int mo69052c() {
            return this.f74232e;
        }

        /* renamed from: d */
        public final String mo69053d() {
            return this.f74229b;
        }

        /* renamed from: e */
        public final String mo69054e() {
            return this.f74230c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29198f)) {
                return false;
            }
            C29198f fVar = (C29198f) obj;
            return C41536l.m120484d(this.f74228a, fVar.f74228a) && C41536l.m120484d(this.f74229b, fVar.f74229b) && C41536l.m120484d(this.f74230c, fVar.f74230c) && C41536l.m120484d(this.f74231d, fVar.f74231d) && this.f74232e == fVar.f74232e && Double.compare(this.f74233f, fVar.f74233f) == 0 && Double.compare(this.f74234g, fVar.f74234g) == 0 && this.f74235h == fVar.f74235h && this.f74236i == fVar.f74236i && this.f74237j == fVar.f74237j;
        }

        /* renamed from: f */
        public final String mo69056f() {
            return this.f74231d;
        }

        /* renamed from: g */
        public final double mo69057g() {
            return this.f74233f;
        }

        /* renamed from: h */
        public final C26305b.C26308c mo69058h() {
            return this.f74236i;
        }

        public int hashCode() {
            int hashCode = ((this.f74228a.hashCode() * 31) + this.f74229b.hashCode()) * 31;
            String str = this.f74230c;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f74231d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int a = (((((((hashCode2 + i) * 31) + this.f74232e) * 31) + Double.doubleToLongBits(this.f74233f)) * 31) + Double.doubleToLongBits(this.f74234g)) * 31;
            boolean z = this.f74235h;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode3 = (((a + (z ? 1 : 0)) * 31) + this.f74236i.hashCode()) * 31;
            boolean z3 = this.f74237j;
            if (!z3) {
                z2 = z3;
            }
            return hashCode3 + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final double mo69060i() {
            return this.f74234g;
        }

        /* renamed from: j */
        public final boolean mo69061j() {
            return this.f74237j;
        }

        /* renamed from: k */
        public final boolean mo69062k() {
            return this.f74235h;
        }

        public String toString() {
            String str = this.f74228a;
            String str2 = this.f74229b;
            String str3 = this.f74230c;
            String str4 = this.f74231d;
            int i = this.f74232e;
            double d = this.f74233f;
            double d2 = this.f74234g;
            boolean z = this.f74235h;
            C26305b.C26308c cVar = this.f74236i;
            boolean z2 = this.f74237j;
            return "RequestReceiverItem(id=" + str + ", personName=" + str2 + ", personNickname=" + str3 + ", pictureUrl=" + str4 + ", defaultIcon=" + i + ", requestedAmount=" + d + ", transferredOrRejectedAmount=" + d2 + ", isOnlyReceiver=" + z + ", status=" + cVar + ", isBogUser=" + z2 + ")";
        }
    }

    /* renamed from: w20.a$g */
    public enum C29199g {
        PROGRESS(0),
        OPERATIONS_HORIZONTAL_LIST(1),
        OPERATION(2),
        HEADER(3),
        RECEIVER(4),
        ENROLLMENT_ACCOUNT(5);
        

        /* renamed from: d */
        private final int f74246d;

        private C29199g(int i) {
            this.f74246d = i;
        }

        /* renamed from: b */
        public final int mo69064b() {
            return this.f74246d;
        }
    }

    private C29192a() {
    }

    public /* synthetic */ C29192a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public abstract C29199g mo69026b();
}
