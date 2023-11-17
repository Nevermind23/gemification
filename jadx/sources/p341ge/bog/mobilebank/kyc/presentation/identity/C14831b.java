package p341ge.bog.mobilebank.kyc.presentation.identity;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.kyc.presentation.identity.b */
public abstract class C14831b {

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.b$a */
    public static final class C14832a extends C14831b {

        /* renamed from: a */
        public static final C14832a f42910a = new C14832a();

        private C14832a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.b$b */
    public static final class C14833b extends C14831b {

        /* renamed from: a */
        public static final C14833b f42911a = new C14833b();

        private C14833b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.kyc.presentation.identity.b$c */
    public static final class C14834c extends C14831b {

        /* renamed from: a */
        private final String f42912a;

        /* renamed from: b */
        private final String f42913b;

        /* renamed from: c */
        private final boolean f42914c;

        /* renamed from: d */
        private final String f42915d;

        /* renamed from: e */
        private final String f42916e;

        /* renamed from: f */
        private final String f42917f;

        /* renamed from: g */
        private final boolean f42918g;

        /* renamed from: h */
        private final String f42919h;

        /* renamed from: i */
        private final boolean f42920i;

        /* renamed from: j */
        private final String f42921j;

        /* renamed from: k */
        private final boolean f42922k;

        /* renamed from: l */
        private final String f42923l;

        /* renamed from: m */
        private final boolean f42924m;

        /* renamed from: n */
        private final boolean f42925n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14834c(String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, String str6, boolean z3, String str7, boolean z4, String str8, boolean z5, boolean z6) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "countryLegal");
            C41536l.m120489i(str2, "cityLegal");
            C41536l.m120489i(str3, "addressLineLegal");
            C41536l.m120489i(str4, "countryActual");
            C41536l.m120489i(str5, "cityActual");
            C41536l.m120489i(str6, "addressLineActual");
            C41536l.m120489i(str7, "citizenShip");
            C41536l.m120489i(str8, "secondCitizenShip");
            this.f42912a = str;
            this.f42913b = str2;
            this.f42914c = z;
            this.f42915d = str3;
            this.f42916e = str4;
            this.f42917f = str5;
            this.f42918g = z2;
            this.f42919h = str6;
            this.f42920i = z3;
            this.f42921j = str7;
            this.f42922k = z4;
            this.f42923l = str8;
            this.f42924m = z5;
            this.f42925n = z6;
        }

        /* renamed from: a */
        public final String mo41452a() {
            return this.f42919h;
        }

        /* renamed from: b */
        public final String mo41453b() {
            return this.f42915d;
        }

        /* renamed from: c */
        public final boolean mo41454c() {
            return this.f42925n;
        }

        /* renamed from: d */
        public final String mo41455d() {
            return this.f42921j;
        }

        /* renamed from: e */
        public final String mo41456e() {
            return this.f42917f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14834c)) {
                return false;
            }
            C14834c cVar = (C14834c) obj;
            return C41536l.m120484d(this.f42912a, cVar.f42912a) && C41536l.m120484d(this.f42913b, cVar.f42913b) && this.f42914c == cVar.f42914c && C41536l.m120484d(this.f42915d, cVar.f42915d) && C41536l.m120484d(this.f42916e, cVar.f42916e) && C41536l.m120484d(this.f42917f, cVar.f42917f) && this.f42918g == cVar.f42918g && C41536l.m120484d(this.f42919h, cVar.f42919h) && this.f42920i == cVar.f42920i && C41536l.m120484d(this.f42921j, cVar.f42921j) && this.f42922k == cVar.f42922k && C41536l.m120484d(this.f42923l, cVar.f42923l) && this.f42924m == cVar.f42924m && this.f42925n == cVar.f42925n;
        }

        /* renamed from: f */
        public final String mo41458f() {
            return this.f42913b;
        }

        /* renamed from: g */
        public final boolean mo41459g() {
            return this.f42920i;
        }

        /* renamed from: h */
        public final String mo41460h() {
            return this.f42916e;
        }

        public int hashCode() {
            int hashCode = ((this.f42912a.hashCode() * 31) + this.f42913b.hashCode()) * 31;
            boolean z = this.f42914c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode2 = (((((((hashCode + (z ? 1 : 0)) * 31) + this.f42915d.hashCode()) * 31) + this.f42916e.hashCode()) * 31) + this.f42917f.hashCode()) * 31;
            boolean z3 = this.f42918g;
            if (z3) {
                z3 = true;
            }
            int hashCode3 = (((hashCode2 + (z3 ? 1 : 0)) * 31) + this.f42919h.hashCode()) * 31;
            boolean z4 = this.f42920i;
            if (z4) {
                z4 = true;
            }
            int hashCode4 = (((hashCode3 + (z4 ? 1 : 0)) * 31) + this.f42921j.hashCode()) * 31;
            boolean z5 = this.f42922k;
            if (z5) {
                z5 = true;
            }
            int hashCode5 = (((hashCode4 + (z5 ? 1 : 0)) * 31) + this.f42923l.hashCode()) * 31;
            boolean z6 = this.f42924m;
            if (z6) {
                z6 = true;
            }
            int i = (hashCode5 + (z6 ? 1 : 0)) * 31;
            boolean z7 = this.f42925n;
            if (!z7) {
                z2 = z7;
            }
            return i + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final String mo41462i() {
            return this.f42912a;
        }

        /* renamed from: j */
        public final boolean mo41463j() {
            return this.f42918g;
        }

        /* renamed from: k */
        public final boolean mo41464k() {
            return this.f42914c;
        }

        /* renamed from: l */
        public final boolean mo41465l() {
            return this.f42922k;
        }

        /* renamed from: m */
        public final String mo41466m() {
            return this.f42923l;
        }

        /* renamed from: n */
        public final boolean mo41467n() {
            return this.f42924m;
        }

        public String toString() {
            String str = this.f42912a;
            String str2 = this.f42913b;
            boolean z = this.f42914c;
            String str3 = this.f42915d;
            String str4 = this.f42916e;
            String str5 = this.f42917f;
            boolean z2 = this.f42918g;
            String str6 = this.f42919h;
            boolean z3 = this.f42920i;
            String str7 = this.f42921j;
            boolean z4 = this.f42922k;
            String str8 = this.f42923l;
            boolean z5 = this.f42924m;
            boolean z6 = this.f42925n;
            return "Success(countryLegal=" + str + ", cityLegal=" + str2 + ", enableLegalCityInput=" + z + ", addressLineLegal=" + str3 + ", countryActual=" + str4 + ", cityActual=" + str5 + ", enableActualCityInput=" + z2 + ", addressLineActual=" + str6 + ", copyActualAddress=" + z3 + ", citizenShip=" + str7 + ", hasDualCitizenship=" + z4 + ", secondCitizenShip=" + str8 + ", showLegalAddress=" + z5 + ", buttonIsActive=" + z6 + ")";
        }
    }

    private C14831b() {
    }

    public /* synthetic */ C14831b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
