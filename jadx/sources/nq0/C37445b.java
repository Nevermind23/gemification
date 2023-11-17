package nq0;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: nq0.b */
public interface C37445b {

    /* renamed from: nq0.b$a */
    public static final class C37446a implements C37445b {

        /* renamed from: a */
        public static final C37446a f90031a = new C37446a();

        /* renamed from: b */
        private static final int f90032b = C37451f.BOTTOM_BORDER.ordinal();

        private C37446a() {
        }

        /* renamed from: a */
        public int mo90558a() {
            return f90032b;
        }
    }

    /* renamed from: nq0.b$c */
    public static final class C37448c implements C37445b {

        /* renamed from: a */
        private final String f90041a;

        /* renamed from: b */
        private final int f90042b = C37451f.FEEDBACK.ordinal();

        public C37448c(String str) {
            C41536l.m120489i(str, "title");
            this.f90041a = str;
        }

        /* renamed from: a */
        public int mo90558a() {
            return this.f90042b;
        }

        /* renamed from: b */
        public final String mo90569b() {
            return this.f90041a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37448c) && C41536l.m120484d(this.f90041a, ((C37448c) obj).f90041a);
        }

        public int hashCode() {
            return this.f90041a.hashCode();
        }

        public String toString() {
            String str = this.f90041a;
            return "Feedback(title=" + str + ")";
        }
    }

    /* renamed from: nq0.b$e */
    public static final class C37450e implements C37445b {

        /* renamed from: a */
        private final String f90047a;

        /* renamed from: b */
        private final String f90048b;

        /* renamed from: c */
        private final int f90049c = C37451f.SUMMARY.ordinal();

        public C37450e(String str, String str2) {
            C41536l.m120489i(str, "summaryLabelKey");
            C41536l.m120489i(str2, "summaryValue");
            this.f90047a = str;
            this.f90048b = str2;
        }

        /* renamed from: a */
        public int mo90558a() {
            return this.f90049c;
        }

        /* renamed from: b */
        public final String mo90579b() {
            return this.f90047a;
        }

        /* renamed from: c */
        public final String mo90580c() {
            return this.f90048b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37450e)) {
                return false;
            }
            C37450e eVar = (C37450e) obj;
            return C41536l.m120484d(this.f90047a, eVar.f90047a) && C41536l.m120484d(this.f90048b, eVar.f90048b);
        }

        public int hashCode() {
            return (this.f90047a.hashCode() * 31) + this.f90048b.hashCode();
        }

        public String toString() {
            String str = this.f90047a;
            String str2 = this.f90048b;
            return "Summary(summaryLabelKey=" + str + ", summaryValue=" + str2 + ")";
        }
    }

    /* renamed from: nq0.b$f */
    public enum C37451f {
        HEADER,
        DETAILS_ITEM,
        SUMMARY,
        FEEDBACK,
        BOTTOM_BORDER
    }

    /* renamed from: a */
    int mo90558a();

    /* renamed from: nq0.b$d */
    public static final class C37449d implements C37445b {

        /* renamed from: a */
        private final String f90043a;

        /* renamed from: b */
        private final String f90044b;

        /* renamed from: c */
        private final boolean f90045c;

        /* renamed from: d */
        private final int f90046d;

        public C37449d(String str, String str2, boolean z) {
            C41536l.m120489i(str, "titleKey");
            this.f90043a = str;
            this.f90044b = str2;
            this.f90045c = z;
            this.f90046d = C37451f.HEADER.ordinal();
        }

        /* renamed from: a */
        public int mo90558a() {
            return this.f90046d;
        }

        /* renamed from: b */
        public final String mo90573b() {
            return this.f90044b;
        }

        /* renamed from: c */
        public final boolean mo90574c() {
            return this.f90045c;
        }

        /* renamed from: d */
        public final String mo90575d() {
            return this.f90043a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37449d)) {
                return false;
            }
            C37449d dVar = (C37449d) obj;
            return C41536l.m120484d(this.f90043a, dVar.f90043a) && C41536l.m120484d(this.f90044b, dVar.f90044b) && this.f90045c == dVar.f90045c;
        }

        public int hashCode() {
            int hashCode = this.f90043a.hashCode() * 31;
            String str = this.f90044b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.f90045c;
            if (z) {
                z = true;
            }
            return hashCode2 + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f90043a;
            String str2 = this.f90044b;
            boolean z = this.f90045c;
            return "Header(titleKey=" + str + ", descKey=" + str2 + ", hasTopMargin=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37449d(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z);
        }
    }

    /* renamed from: nq0.b$b */
    public static final class C37447b implements C37445b {

        /* renamed from: a */
        private final int f90033a;

        /* renamed from: b */
        private final String f90034b;

        /* renamed from: c */
        private final String f90035c;

        /* renamed from: d */
        private final String f90036d;

        /* renamed from: e */
        private final boolean f90037e;

        /* renamed from: f */
        private final boolean f90038f;

        /* renamed from: g */
        private final boolean f90039g;

        /* renamed from: h */
        private final int f90040h;

        public C37447b(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            this.f90033a = i;
            this.f90034b = str;
            this.f90035c = str2;
            this.f90036d = str3;
            this.f90037e = z;
            this.f90038f = z2;
            this.f90039g = z3;
            this.f90040h = C37451f.DETAILS_ITEM.ordinal();
        }

        /* renamed from: a */
        public int mo90558a() {
            return this.f90040h;
        }

        /* renamed from: b */
        public final String mo90559b() {
            return this.f90036d;
        }

        /* renamed from: c */
        public final boolean mo90560c() {
            return this.f90038f;
        }

        /* renamed from: d */
        public final int mo90561d() {
            return this.f90033a;
        }

        /* renamed from: e */
        public final boolean mo90562e() {
            return this.f90037e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37447b)) {
                return false;
            }
            C37447b bVar = (C37447b) obj;
            return this.f90033a == bVar.f90033a && C41536l.m120484d(this.f90034b, bVar.f90034b) && C41536l.m120484d(this.f90035c, bVar.f90035c) && C41536l.m120484d(this.f90036d, bVar.f90036d) && this.f90037e == bVar.f90037e && this.f90038f == bVar.f90038f && this.f90039g == bVar.f90039g;
        }

        /* renamed from: f */
        public final String mo90564f() {
            return this.f90035c;
        }

        /* renamed from: g */
        public final String mo90565g() {
            return this.f90034b;
        }

        /* renamed from: h */
        public final boolean mo90566h() {
            return this.f90039g;
        }

        public int hashCode() {
            int hashCode = ((this.f90033a * 31) + this.f90034b.hashCode()) * 31;
            String str = this.f90035c;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f90036d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f90037e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f90038f;
            if (z3) {
                z3 = true;
            }
            int i4 = (i3 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f90039g;
            if (!z4) {
                z2 = z4;
            }
            return i4 + (z2 ? 1 : 0);
        }

        public String toString() {
            int i = this.f90033a;
            String str = this.f90034b;
            String str2 = this.f90035c;
            String str3 = this.f90036d;
            boolean z = this.f90037e;
            boolean z2 = this.f90038f;
            boolean z3 = this.f90039g;
            return "DetailsItem(icon=" + i + ", value=" + str + ", title=" + str2 + ", desc=" + str3 + ", reversed=" + z + ", hasSummary=" + z2 + ", isLast=" + z3 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37447b(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3);
        }
    }
}
