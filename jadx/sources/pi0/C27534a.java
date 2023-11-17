package pi0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: pi0.a */
public interface C27534a {

    /* renamed from: pi0.a$a */
    public static final class C27535a implements C27534a {

        /* renamed from: a */
        public static final C27535a f70424a = new C27535a();

        private C27535a() {
        }
    }

    /* renamed from: pi0.a$c */
    public static final class C27537c implements C27534a {

        /* renamed from: a */
        private final String f70431a;

        public C27537c(String str) {
            C41536l.m120489i(str, "date");
            this.f70431a = str;
        }

        /* renamed from: a */
        public final String mo66871a() {
            return this.f70431a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27537c) && C41536l.m120484d(this.f70431a, ((C27537c) obj).f70431a);
        }

        public int hashCode() {
            return this.f70431a.hashCode();
        }

        public String toString() {
            String str = this.f70431a;
            return "DateHeader(date=" + str + ")";
        }
    }

    /* renamed from: pi0.a$d */
    public static final class C27538d implements C27534a {

        /* renamed from: a */
        private final String f70432a;

        public C27538d(String str) {
            C41536l.m120489i(str, "emptyTransactionText");
            this.f70432a = str;
        }

        /* renamed from: a */
        public final String mo66875a() {
            return this.f70432a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27538d) && C41536l.m120484d(this.f70432a, ((C27538d) obj).f70432a);
        }

        public int hashCode() {
            return this.f70432a.hashCode();
        }

        public String toString() {
            String str = this.f70432a;
            return "EmptyTransactions(emptyTransactionText=" + str + ")";
        }
    }

    /* renamed from: pi0.a$e */
    public static final class C27539e implements C27534a {

        /* renamed from: a */
        private final List f70433a;

        /* renamed from: b */
        private int f70434b;

        /* renamed from: pi0.a$e$a */
        public static final class C27540a implements C27534a {

            /* renamed from: a */
            private final String f70435a;

            /* renamed from: b */
            private final String f70436b;

            /* renamed from: c */
            private final String f70437c;

            /* renamed from: d */
            private final String f70438d;

            /* renamed from: e */
            private final List f70439e;

            /* renamed from: f */
            private final Boolean f70440f;

            public C27540a(String str, String str2, String str3, String str4, List list, Boolean bool) {
                C41536l.m120489i(str2, "imageUrl");
                this.f70435a = str;
                this.f70436b = str2;
                this.f70437c = str3;
                this.f70438d = str4;
                this.f70439e = list;
                this.f70440f = bool;
            }

            /* renamed from: a */
            public final String mo66885a() {
                return this.f70435a;
            }

            /* renamed from: b */
            public final List mo66886b() {
                return this.f70439e;
            }

            /* renamed from: c */
            public final String mo66887c() {
                return this.f70438d;
            }

            /* renamed from: d */
            public final String mo66888d() {
                return this.f70436b;
            }

            /* renamed from: e */
            public final String mo66889e() {
                return this.f70437c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C27540a)) {
                    return false;
                }
                C27540a aVar = (C27540a) obj;
                return C41536l.m120484d(this.f70435a, aVar.f70435a) && C41536l.m120484d(this.f70436b, aVar.f70436b) && C41536l.m120484d(this.f70437c, aVar.f70437c) && C41536l.m120484d(this.f70438d, aVar.f70438d) && C41536l.m120484d(this.f70439e, aVar.f70439e) && C41536l.m120484d(this.f70440f, aVar.f70440f);
            }

            /* renamed from: f */
            public final Boolean mo66891f() {
                return this.f70440f;
            }

            public int hashCode() {
                String str = this.f70435a;
                int i = 0;
                int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f70436b.hashCode()) * 31;
                String str2 = this.f70437c;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f70438d;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                List list = this.f70439e;
                int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
                Boolean bool = this.f70440f;
                if (bool != null) {
                    i = bool.hashCode();
                }
                return hashCode4 + i;
            }

            public String toString() {
                String str = this.f70435a;
                String str2 = this.f70436b;
                String str3 = this.f70437c;
                String str4 = this.f70438d;
                List list = this.f70439e;
                Boolean bool = this.f70440f;
                return "GiftCardAnimationItem(availableAmount=" + str + ", imageUrl=" + str2 + ", logoUrl=" + str3 + ", designJson=" + str4 + ", designGyro=" + list + ", isDark=" + bool + ")";
            }
        }

        public C27539e(List list, int i) {
            C41536l.m120489i(list, "list");
            this.f70433a = list;
            this.f70434b = i;
        }

        /* renamed from: a */
        public final List mo66879a() {
            return this.f70433a;
        }

        /* renamed from: b */
        public final int mo66880b() {
            return this.f70434b;
        }

        /* renamed from: c */
        public final void mo66881c(int i) {
            this.f70434b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27539e)) {
                return false;
            }
            C27539e eVar = (C27539e) obj;
            return C41536l.m120484d(this.f70433a, eVar.f70433a) && this.f70434b == eVar.f70434b;
        }

        public int hashCode() {
            return (this.f70433a.hashCode() * 31) + this.f70434b;
        }

        public String toString() {
            List list = this.f70433a;
            int i = this.f70434b;
            return "GiftCardAnimation(list=" + list + ", position=" + i + ")";
        }
    }

    /* renamed from: pi0.a$f */
    public static final class C27541f implements C27534a {

        /* renamed from: a */
        private final String f70441a;

        public C27541f(String str) {
            C41536l.m120489i(str, "code");
            this.f70441a = str;
        }

        /* renamed from: a */
        public final String mo66894a() {
            return this.f70441a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27541f) && C41536l.m120484d(this.f70441a, ((C27541f) obj).f70441a);
        }

        public int hashCode() {
            return this.f70441a.hashCode();
        }

        public String toString() {
            String str = this.f70441a;
            return "GiftCardCode(code=" + str + ")";
        }
    }

    /* renamed from: pi0.a$g */
    public static final class C27542g implements C27534a {

        /* renamed from: a */
        public static final C27542g f70442a = new C27542g();

        private C27542g() {
        }
    }

    /* renamed from: pi0.a$h */
    public static final class C27543h implements C27534a {

        /* renamed from: a */
        private final String f70443a;

        /* renamed from: b */
        private final String f70444b;

        public C27543h(String str, String str2) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "bottomTitle");
            this.f70443a = str;
            this.f70444b = str2;
        }

        /* renamed from: a */
        public final String mo66898a() {
            return this.f70444b;
        }

        /* renamed from: b */
        public final String mo66899b() {
            return this.f70443a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27543h)) {
                return false;
            }
            C27543h hVar = (C27543h) obj;
            return C41536l.m120484d(this.f70443a, hVar.f70443a) && C41536l.m120484d(this.f70444b, hVar.f70444b);
        }

        public int hashCode() {
            return (this.f70443a.hashCode() * 31) + this.f70444b.hashCode();
        }

        public String toString() {
            String str = this.f70443a;
            String str2 = this.f70444b;
            return "GiftCardTermsDescription(title=" + str + ", bottomTitle=" + str2 + ")";
        }
    }

    /* renamed from: pi0.a$i */
    public static final class C27544i implements C27534a {

        /* renamed from: a */
        private final boolean f70445a;

        public C27544i(boolean z) {
            this.f70445a = z;
        }

        /* renamed from: a */
        public final boolean mo66903a() {
            return this.f70445a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27544i) && this.f70445a == ((C27544i) obj).f70445a;
        }

        public int hashCode() {
            boolean z = this.f70445a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f70445a;
            return "GooglePayCard(isClosButtonVisible=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27544i(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }
    }

    /* renamed from: pi0.a$j */
    public static final class C27545j implements C27534a {

        /* renamed from: a */
        public static final C27545j f70446a = new C27545j();

        private C27545j() {
        }
    }

    /* renamed from: pi0.a$k */
    public static final class C27546k implements C27534a {

        /* renamed from: a */
        private final String f70447a;

        /* renamed from: b */
        private final String f70448b;

        public C27546k(String str, String str2) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "buttonText");
            this.f70447a = str;
            this.f70448b = str2;
        }

        /* renamed from: a */
        public final String mo66907a() {
            return this.f70448b;
        }

        /* renamed from: b */
        public final String mo66908b() {
            return this.f70447a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27546k)) {
                return false;
            }
            C27546k kVar = (C27546k) obj;
            return C41536l.m120484d(this.f70447a, kVar.f70447a) && C41536l.m120484d(this.f70448b, kVar.f70448b);
        }

        public int hashCode() {
            return (this.f70447a.hashCode() * 31) + this.f70448b.hashCode();
        }

        public String toString() {
            String str = this.f70447a;
            String str2 = this.f70448b;
            return "InlineFeedBack(title=" + str + ", buttonText=" + str2 + ")";
        }
    }

    /* renamed from: pi0.a$l */
    public static final class C27547l implements C27534a {

        /* renamed from: a */
        private final String f70449a;

        /* renamed from: b */
        private final String f70450b;

        public C27547l(String str, String str2) {
            C41536l.m120489i(str, "spentAmount");
            C41536l.m120489i(str2, "remainingAmount");
            this.f70449a = str;
            this.f70450b = str2;
        }

        /* renamed from: a */
        public final String mo66912a() {
            return this.f70450b;
        }

        /* renamed from: b */
        public final String mo66913b() {
            return this.f70449a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27547l)) {
                return false;
            }
            C27547l lVar = (C27547l) obj;
            return C41536l.m120484d(this.f70449a, lVar.f70449a) && C41536l.m120484d(this.f70450b, lVar.f70450b);
        }

        public int hashCode() {
            return (this.f70449a.hashCode() * 31) + this.f70450b.hashCode();
        }

        public String toString() {
            String str = this.f70449a;
            String str2 = this.f70450b;
            return "PaymentHistory(spentAmount=" + str + ", remainingAmount=" + str2 + ")";
        }
    }

    /* renamed from: pi0.a$m */
    public static final class C27548m implements C27534a {

        /* renamed from: a */
        private final String f70451a;

        /* renamed from: b */
        private final String f70452b;

        /* renamed from: c */
        private final String f70453c;

        /* renamed from: d */
        private final boolean f70454d;

        public C27548m(String str, String str2, String str3, boolean z) {
            C41536l.m120489i(str, "offerName");
            C41536l.m120489i(str2, "offerType");
            C41536l.m120489i(str3, "amount");
            this.f70451a = str;
            this.f70452b = str2;
            this.f70453c = str3;
            this.f70454d = z;
        }

        /* renamed from: a */
        public final String mo66917a() {
            return this.f70453c;
        }

        /* renamed from: b */
        public final String mo66918b() {
            return this.f70451a;
        }

        /* renamed from: c */
        public final String mo66919c() {
            return this.f70452b;
        }

        /* renamed from: d */
        public final boolean mo66920d() {
            return this.f70454d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27548m)) {
                return false;
            }
            C27548m mVar = (C27548m) obj;
            return C41536l.m120484d(this.f70451a, mVar.f70451a) && C41536l.m120484d(this.f70452b, mVar.f70452b) && C41536l.m120484d(this.f70453c, mVar.f70453c) && this.f70454d == mVar.f70454d;
        }

        public int hashCode() {
            int hashCode = ((((this.f70451a.hashCode() * 31) + this.f70452b.hashCode()) * 31) + this.f70453c.hashCode()) * 31;
            boolean z = this.f70454d;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f70451a;
            String str2 = this.f70452b;
            String str3 = this.f70453c;
            boolean z = this.f70454d;
            return "Transaction(offerName=" + str + ", offerType=" + str2 + ", amount=" + str3 + ", isPaymentAmount=" + z + ")";
        }
    }

    /* renamed from: pi0.a$n */
    public static final class C27549n implements C27534a {

        /* renamed from: a */
        public static final C27549n f70455a = new C27549n();

        private C27549n() {
        }
    }

    /* renamed from: pi0.a$b */
    public static final class C27536b implements C27534a {

        /* renamed from: a */
        private final long f70425a;

        /* renamed from: b */
        private final String f70426b;

        /* renamed from: c */
        private final String f70427c;

        /* renamed from: d */
        private final String f70428d;

        /* renamed from: e */
        private final List f70429e;

        /* renamed from: f */
        private final boolean f70430f;

        public C27536b(long j, String str, String str2, String str3, List list, boolean z) {
            C41536l.m120489i(str, "sender");
            C41536l.m120489i(str3, "storeName");
            C41536l.m120489i(list, "listOfStores");
            this.f70425a = j;
            this.f70426b = str;
            this.f70427c = str2;
            this.f70428d = str3;
            this.f70429e = list;
            this.f70430f = z;
        }

        /* renamed from: b */
        public static /* synthetic */ C27536b m85351b(C27536b bVar, long j, String str, String str2, String str3, List list, boolean z, int i, Object obj) {
            C27536b bVar2 = bVar;
            return bVar.mo66861a((i & 1) != 0 ? bVar2.f70425a : j, (i & 2) != 0 ? bVar2.f70426b : str, (i & 4) != 0 ? bVar2.f70427c : str2, (i & 8) != 0 ? bVar2.f70428d : str3, (i & 16) != 0 ? bVar2.f70429e : list, (i & 32) != 0 ? bVar2.f70430f : z);
        }

        /* renamed from: a */
        public final C27536b mo66861a(long j, String str, String str2, String str3, List list, boolean z) {
            C41536l.m120489i(str, "sender");
            C41536l.m120489i(str3, "storeName");
            C41536l.m120489i(list, "listOfStores");
            return new C27536b(j, str, str2, str3, list, z);
        }

        /* renamed from: c */
        public final long mo66862c() {
            return this.f70425a;
        }

        /* renamed from: d */
        public final List mo66863d() {
            return this.f70429e;
        }

        /* renamed from: e */
        public final String mo66864e() {
            return this.f70426b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27536b)) {
                return false;
            }
            C27536b bVar = (C27536b) obj;
            return this.f70425a == bVar.f70425a && C41536l.m120484d(this.f70426b, bVar.f70426b) && C41536l.m120484d(this.f70427c, bVar.f70427c) && C41536l.m120484d(this.f70428d, bVar.f70428d) && C41536l.m120484d(this.f70429e, bVar.f70429e) && this.f70430f == bVar.f70430f;
        }

        /* renamed from: f */
        public final String mo66866f() {
            return this.f70428d;
        }

        /* renamed from: g */
        public final String mo66867g() {
            return this.f70427c;
        }

        /* renamed from: h */
        public final boolean mo66868h() {
            return this.f70430f;
        }

        public int hashCode() {
            int a = ((C7397t.m28148a(this.f70425a) * 31) + this.f70426b.hashCode()) * 31;
            String str = this.f70427c;
            int hashCode = (((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f70428d.hashCode()) * 31) + this.f70429e.hashCode()) * 31;
            boolean z = this.f70430f;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            long j = this.f70425a;
            String str = this.f70426b;
            String str2 = this.f70427c;
            String str3 = this.f70428d;
            List list = this.f70429e;
            boolean z = this.f70430f;
            return "CardDetails(giftCardId=" + j + ", sender=" + str + ", validityDate=" + str2 + ", storeName=" + str3 + ", listOfStores=" + list + ", isStoresClickable=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27536b(long j, String str, String str2, String str3, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, str2, str3, list, (i & 32) != 0 ? true : z);
        }
    }
}
