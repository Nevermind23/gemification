package sq0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo.RefinanceInfoUiModel;

/* renamed from: sq0.a */
public interface C38508a {

    /* renamed from: sq0.a$a */
    public static final class C38509a implements C38508a {

        /* renamed from: a */
        public static final C38509a f92310a = new C38509a();

        /* renamed from: b */
        private static final int f92311b = C38512d.FEEDBACK.ordinal();

        private C38509a() {
        }

        /* renamed from: d */
        public int mo92070d() {
            return f92311b;
        }
    }

    /* renamed from: sq0.a$b */
    public static final class C38510b implements C38508a {

        /* renamed from: a */
        private final String f92312a;

        /* renamed from: b */
        private final String f92313b;

        /* renamed from: c */
        private final int f92314c = C38512d.HEADER.ordinal();

        public C38510b(String str, String str2) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "desc");
            this.f92312a = str;
            this.f92313b = str2;
        }

        /* renamed from: a */
        public final String mo92071a() {
            return this.f92313b;
        }

        /* renamed from: b */
        public final String mo92072b() {
            return this.f92312a;
        }

        /* renamed from: d */
        public int mo92070d() {
            return this.f92314c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38510b)) {
                return false;
            }
            C38510b bVar = (C38510b) obj;
            return C41536l.m120484d(this.f92312a, bVar.f92312a) && C41536l.m120484d(this.f92313b, bVar.f92313b);
        }

        public int hashCode() {
            return (this.f92312a.hashCode() * 31) + this.f92313b.hashCode();
        }

        public String toString() {
            String str = this.f92312a;
            String str2 = this.f92313b;
            return "Header(title=" + str + ", desc=" + str2 + ")";
        }
    }

    /* renamed from: sq0.a$c */
    public static final class C38511c implements C38508a {

        /* renamed from: a */
        private final RefinanceInfoUiModel f92315a;

        /* renamed from: b */
        private final boolean f92316b;

        /* renamed from: c */
        private final boolean f92317c;

        /* renamed from: d */
        private final int f92318d = C38512d.REFINANCE_ITEM.ordinal();

        public C38511c(RefinanceInfoUiModel refinanceInfoUiModel, boolean z, boolean z2) {
            C41536l.m120489i(refinanceInfoUiModel, "info");
            this.f92315a = refinanceInfoUiModel;
            this.f92316b = z;
            this.f92317c = z2;
        }

        /* renamed from: b */
        public static /* synthetic */ C38511c m113051b(C38511c cVar, RefinanceInfoUiModel refinanceInfoUiModel, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                refinanceInfoUiModel = cVar.f92315a;
            }
            if ((i & 2) != 0) {
                z = cVar.f92316b;
            }
            if ((i & 4) != 0) {
                z2 = cVar.f92317c;
            }
            return cVar.mo92076a(refinanceInfoUiModel, z, z2);
        }

        /* renamed from: a */
        public final C38511c mo92076a(RefinanceInfoUiModel refinanceInfoUiModel, boolean z, boolean z2) {
            C41536l.m120489i(refinanceInfoUiModel, "info");
            return new C38511c(refinanceInfoUiModel, z, z2);
        }

        /* renamed from: c */
        public final RefinanceInfoUiModel mo92077c() {
            return this.f92315a;
        }

        /* renamed from: d */
        public int mo92070d() {
            return this.f92318d;
        }

        /* renamed from: e */
        public final boolean mo92078e() {
            return this.f92316b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38511c)) {
                return false;
            }
            C38511c cVar = (C38511c) obj;
            return C41536l.m120484d(this.f92315a, cVar.f92315a) && this.f92316b == cVar.f92316b && this.f92317c == cVar.f92317c;
        }

        /* renamed from: f */
        public final boolean mo92080f() {
            return this.f92317c;
        }

        public int hashCode() {
            int hashCode = this.f92315a.hashCode() * 31;
            boolean z = this.f92316b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f92317c;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            RefinanceInfoUiModel refinanceInfoUiModel = this.f92315a;
            boolean z = this.f92316b;
            boolean z2 = this.f92317c;
            return "RefinanceItem(info=" + refinanceInfoUiModel + ", isChecked=" + z + ", isEditable=" + z2 + ")";
        }
    }

    /* renamed from: sq0.a$d */
    public enum C38512d {
        HEADER,
        REFINANCE_ITEM,
        FEEDBACK
    }

    /* renamed from: d */
    int mo92070d();
}
