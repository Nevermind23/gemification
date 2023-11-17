package jr0;

import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: jr0.a */
public abstract class C36783a {

    /* renamed from: a */
    private final String f88741a;

    /* renamed from: b */
    private final String f88742b;

    /* renamed from: c */
    private final boolean f88743c;

    /* renamed from: d */
    private final String f88744d;

    /* renamed from: jr0.a$a */
    public static final class C36784a extends C36783a {

        /* renamed from: e */
        private final boolean f88745e;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C36784a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        /* renamed from: d */
        public boolean mo89664d() {
            return this.f88745e;
        }

        /* renamed from: e */
        public final C36784a mo89665e(boolean z) {
            return new C36784a(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C36784a) && this.f88745e == ((C36784a) obj).f88745e;
        }

        public int hashCode() {
            boolean z = this.f88745e;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f88745e;
            return "LoanPropertyNotChosenItem(isChecked=" + z + ")";
        }

        public C36784a(boolean z) {
            super("loan.page.not.choosen.checkbox", "loan.page.not.choosen.checkbox.desc", z, (String) null, 8, (DefaultConstructorMarker) null);
            this.f88745e = z;
        }
    }

    /* renamed from: jr0.a$b */
    public static final class C36785b extends C36783a {

        /* renamed from: e */
        private final long f88746e;

        /* renamed from: f */
        private final String f88747f;

        /* renamed from: g */
        private final String f88748g;

        /* renamed from: h */
        private final String f88749h;

        /* renamed from: i */
        private final boolean f88750i;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C36785b(long j, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, str2, str3, (i & 16) != 0 ? false : z);
        }

        /* renamed from: f */
        public static /* synthetic */ C36785b m108998f(C36785b bVar, long j, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = bVar.f88746e;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = bVar.f88747f;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                str2 = bVar.f88748g;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = bVar.f88749h;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                z = bVar.f88750i;
            }
            return bVar.mo89669e(j2, str4, str5, str6, z);
        }

        /* renamed from: a */
        public String mo89661a() {
            return this.f88748g;
        }

        /* renamed from: b */
        public String mo89662b() {
            return this.f88749h;
        }

        /* renamed from: c */
        public String mo89663c() {
            return this.f88747f;
        }

        /* renamed from: d */
        public boolean mo89664d() {
            return this.f88750i;
        }

        /* renamed from: e */
        public final C36785b mo89669e(long j, String str, String str2, String str3, boolean z) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "description");
            C41536l.m120489i(str3, NotificationMessage.NOTIF_KEY_SUB_TITLE);
            return new C36785b(j, str, str2, str3, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36785b)) {
                return false;
            }
            C36785b bVar = (C36785b) obj;
            return this.f88746e == bVar.f88746e && C41536l.m120484d(this.f88747f, bVar.f88747f) && C41536l.m120484d(this.f88748g, bVar.f88748g) && C41536l.m120484d(this.f88749h, bVar.f88749h) && this.f88750i == bVar.f88750i;
        }

        /* renamed from: g */
        public final long mo89671g() {
            return this.f88746e;
        }

        public int hashCode() {
            int a = ((((((C7397t.m28148a(this.f88746e) * 31) + this.f88747f.hashCode()) * 31) + this.f88748g.hashCode()) * 31) + this.f88749h.hashCode()) * 31;
            boolean z = this.f88750i;
            if (z) {
                z = true;
            }
            return a + (z ? 1 : 0);
        }

        public String toString() {
            long j = this.f88746e;
            String str = this.f88747f;
            String str2 = this.f88748g;
            String str3 = this.f88749h;
            boolean z = this.f88750i;
            return "Property(id=" + j + ", title=" + str + ", description=" + str2 + ", subtitle=" + str3 + ", isChecked=" + z + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36785b(long j, String str, String str2, String str3, boolean z) {
            super(str, str2, z, str3, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "description");
            C41536l.m120489i(str3, NotificationMessage.NOTIF_KEY_SUB_TITLE);
            this.f88746e = j;
            this.f88747f = str;
            this.f88748g = str2;
            this.f88749h = str3;
            this.f88750i = z;
        }
    }

    public /* synthetic */ C36783a(String str, String str2, boolean z, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, str3);
    }

    /* renamed from: a */
    public String mo89661a() {
        return this.f88742b;
    }

    /* renamed from: b */
    public String mo89662b() {
        return this.f88744d;
    }

    /* renamed from: c */
    public String mo89663c() {
        return this.f88741a;
    }

    /* renamed from: d */
    public abstract boolean mo89664d();

    private C36783a(String str, String str2, boolean z, String str3) {
        this.f88741a = str;
        this.f88742b = str2;
        this.f88743c = z;
        this.f88744d = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36783a(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? null : str3, (DefaultConstructorMarker) null);
    }
}
