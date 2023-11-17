package gc0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37623y;
import p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel;
import p603si.C17799b;

/* renamed from: gc0.c */
public abstract class C20794c {

    /* renamed from: a */
    private final Object f56032a;

    /* renamed from: b */
    private final boolean f56033b;

    /* renamed from: c */
    private final boolean f56034c;

    /* renamed from: gc0.c$a */
    public static final class C20795a extends C20794c {

        /* renamed from: d */
        private final Long f56035d;

        /* renamed from: e */
        private final boolean f56036e;

        /* renamed from: f */
        private final boolean f56037f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C20795a(Long l, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
        }

        /* renamed from: a */
        public Long mo49388a() {
            return this.f56035d;
        }

        /* renamed from: b */
        public boolean mo49389b() {
            return this.f56037f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20795a)) {
                return false;
            }
            C20795a aVar = (C20795a) obj;
            return C41536l.m120484d(this.f56035d, aVar.f56035d) && this.f56036e == aVar.f56036e && this.f56037f == aVar.f56037f;
        }

        public int hashCode() {
            Long l = this.f56035d;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            boolean z = this.f56036e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f56037f;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            Long l = this.f56035d;
            boolean z = this.f56036e;
            boolean z2 = this.f56037f;
            return "DateField(data=" + l + ", isVisible=" + z + ", isEnabled=" + z2 + ")";
        }

        public C20795a(Long l, boolean z, boolean z2) {
            super(l, false, false, 6, (DefaultConstructorMarker) null);
            this.f56035d = l;
            this.f56036e = z;
            this.f56037f = z2;
        }
    }

    /* renamed from: gc0.c$b */
    public static abstract class C20796b extends C20794c {

        /* renamed from: d */
        private final String f56038d;

        /* renamed from: e */
        private final boolean f56039e;

        /* renamed from: f */
        private final boolean f56040f;

        /* renamed from: g */
        private final C17799b f56041g;

        public /* synthetic */ C20796b(String str, boolean z, boolean z2, C17799b bVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, z2, bVar);
        }

        /* renamed from: a */
        public abstract String mo49393a();

        /* renamed from: b */
        public abstract C17799b mo49394b();

        /* renamed from: c */
        public final boolean mo49395c() {
            if (mo49393a() == null) {
                return false;
            }
            return mo49394b().mo45386g(String.valueOf(mo49393a()));
        }

        private C20796b(String str, boolean z, boolean z2, C17799b bVar) {
            super(str, z, z2, (DefaultConstructorMarker) null);
            this.f56038d = str;
            this.f56039e = z;
            this.f56040f = z2;
            this.f56041g = bVar;
        }
    }

    /* renamed from: gc0.c$c */
    public static final class C20797c extends C20794c {

        /* renamed from: d */
        private final SavingGoalUiModel f56042d;

        /* renamed from: e */
        private final boolean f56043e;

        /* renamed from: f */
        private final boolean f56044f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C20797c(SavingGoalUiModel savingGoalUiModel, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : savingGoalUiModel, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
        }

        /* renamed from: a */
        public SavingGoalUiModel mo49396a() {
            return this.f56042d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20797c)) {
                return false;
            }
            C20797c cVar = (C20797c) obj;
            return C41536l.m120484d(this.f56042d, cVar.f56042d) && this.f56043e == cVar.f56043e && this.f56044f == cVar.f56044f;
        }

        public int hashCode() {
            SavingGoalUiModel savingGoalUiModel = this.f56042d;
            int hashCode = (savingGoalUiModel == null ? 0 : savingGoalUiModel.hashCode()) * 31;
            boolean z = this.f56043e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f56044f;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            SavingGoalUiModel savingGoalUiModel = this.f56042d;
            boolean z = this.f56043e;
            boolean z2 = this.f56044f;
            return "GoalField(data=" + savingGoalUiModel + ", isVisible=" + z + ", isEnabled=" + z2 + ")";
        }

        public C20797c(SavingGoalUiModel savingGoalUiModel, boolean z, boolean z2) {
            super(savingGoalUiModel, false, false, 6, (DefaultConstructorMarker) null);
            this.f56042d = savingGoalUiModel;
            this.f56043e = z;
            this.f56044f = z2;
        }
    }

    public /* synthetic */ C20794c(Object obj, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, z2);
    }

    /* renamed from: gc0.c$d */
    public static final class C20798d extends C20796b {

        /* renamed from: h */
        private final String f56045h;

        /* renamed from: i */
        private final boolean f56046i;

        /* renamed from: j */
        private final boolean f56047j;

        /* renamed from: k */
        private final C17799b f56048k;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C20798d(String str, boolean z, boolean z2, C17799b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? C37623y.C37624a.m110637b(C37623y.f90388f, C17799b.C17805f.f50686d, (C37623y.C37625b) null, 1, (Object) null) : bVar);
        }

        /* renamed from: e */
        public static /* synthetic */ C20798d m67296e(C20798d dVar, String str, boolean z, boolean z2, C17799b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f56045h;
            }
            if ((i & 2) != 0) {
                z = dVar.f56046i;
            }
            if ((i & 4) != 0) {
                z2 = dVar.f56047j;
            }
            if ((i & 8) != 0) {
                bVar = dVar.f56048k;
            }
            return dVar.mo49400d(str, z, z2, bVar);
        }

        /* renamed from: a */
        public String mo49393a() {
            return this.f56045h;
        }

        /* renamed from: b */
        public C17799b mo49394b() {
            return this.f56048k;
        }

        /* renamed from: d */
        public final C20798d mo49400d(String str, boolean z, boolean z2, C17799b bVar) {
            C41536l.m120489i(bVar, "validator");
            return new C20798d(str, z, z2, bVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20798d)) {
                return false;
            }
            C20798d dVar = (C20798d) obj;
            return C41536l.m120484d(this.f56045h, dVar.f56045h) && this.f56046i == dVar.f56046i && this.f56047j == dVar.f56047j && C41536l.m120484d(this.f56048k, dVar.f56048k);
        }

        public int hashCode() {
            String str = this.f56045h;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z = this.f56046i;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f56047j;
            if (!z3) {
                z2 = z3;
            }
            return ((i + (z2 ? 1 : 0)) * 31) + this.f56048k.hashCode();
        }

        public String toString() {
            String str = this.f56045h;
            boolean z = this.f56046i;
            boolean z2 = this.f56047j;
            C17799b bVar = this.f56048k;
            return "StringField(data=" + str + ", isEnabled=" + z + ", isVisible=" + z2 + ", validator=" + bVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20798d(String str, boolean z, boolean z2, C17799b bVar) {
            super(str, z, z2, bVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "validator");
            this.f56045h = str;
            this.f56046i = z;
            this.f56047j = z2;
            this.f56048k = bVar;
        }
    }

    private C20794c(Object obj, boolean z, boolean z2) {
        this.f56032a = obj;
        this.f56033b = z;
        this.f56034c = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20794c(Object obj, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (DefaultConstructorMarker) null);
    }
}
