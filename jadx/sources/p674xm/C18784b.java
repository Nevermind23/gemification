package p674xm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p380ck.C10463g;
import p537nm.C17071b;

/* renamed from: xm.b */
public abstract class C18784b {

    /* renamed from: a */
    private final String f52510a;

    /* renamed from: b */
    private final String f52511b;

    /* renamed from: xm.b$a */
    public static abstract class C18785a extends C18784b {

        /* renamed from: c */
        private final String f52512c;

        public /* synthetic */ C18785a(String str, boolean z, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, str2);
        }

        /* renamed from: a */
        public String mo46585a() {
            return this.f52512c;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C18785a(java.lang.String r2, boolean r3, java.lang.String r4) {
            /*
                r1 = this;
                if (r3 == 0) goto L_0x0005
                java.lang.String r3 = "digital"
                goto L_0x0007
            L_0x0005:
                java.lang.String r3 = "physical"
            L_0x0007:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = "_"
                r0.append(r2)
                r0.append(r3)
                java.lang.String r2 = r0.toString()
                r3 = 0
                r1.<init>(r4, r2, r3)
                r1.f52512c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p674xm.C18784b.C18785a.<init>(java.lang.String, boolean, java.lang.String):void");
        }
    }

    /* renamed from: xm.b$b */
    public static final class C18786b extends C18784b {

        /* renamed from: c */
        private final C17071b f52513c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18786b(C17071b bVar) {
            super("choose_category_click", bVar.mo44268b(), (DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "type");
            this.f52513c = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18786b) && this.f52513c == ((C18786b) obj).f52513c;
        }

        public int hashCode() {
            return this.f52513c.hashCode();
        }

        public String toString() {
            C17071b bVar = this.f52513c;
            return "CardApplicationTypeClickEvent(type=" + bVar + ")";
        }
    }

    /* renamed from: xm.b$c */
    public static final class C18787c extends C18785a {

        /* renamed from: d */
        private final String f52514d;

        /* renamed from: e */
        private final boolean f52515e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18787c(String str, boolean z) {
            super(str, z, "order_card_click", (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "subProductCode");
            this.f52514d = str;
            this.f52515e = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18787c)) {
                return false;
            }
            C18787c cVar = (C18787c) obj;
            return C41536l.m120484d(this.f52514d, cVar.f52514d) && this.f52515e == cVar.f52515e;
        }

        public int hashCode() {
            int hashCode = this.f52514d.hashCode() * 31;
            boolean z = this.f52515e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f52514d;
            boolean z = this.f52515e;
            return "CardListOrderClicked(subProductCode=" + str + ", isDigital=" + z + ")";
        }
    }

    /* renamed from: xm.b$d */
    public static final class C18788d extends C18784b {

        /* renamed from: c */
        private final String f52516c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18788d(String str) {
            super("slide_scroll", str, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "subProductCode");
            this.f52516c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18788d) && C41536l.m120484d(this.f52516c, ((C18788d) obj).f52516c);
        }

        public int hashCode() {
            return this.f52516c.hashCode();
        }

        public String toString() {
            String str = this.f52516c;
            return "CardListSliderScrollEvent(subProductCode=" + str + ")";
        }
    }

    /* renamed from: xm.b$e */
    public static final class C18789e extends C18785a {

        /* renamed from: d */
        private final String f52517d;

        /* renamed from: e */
        private final boolean f52518e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18789e(String str, boolean z) {
            super(str, z, "final_order_card_click", (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "subProductCode");
            this.f52517d = str;
            this.f52518e = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18789e)) {
                return false;
            }
            C18789e eVar = (C18789e) obj;
            return C41536l.m120484d(this.f52517d, eVar.f52517d) && this.f52518e == eVar.f52518e;
        }

        public int hashCode() {
            int hashCode = this.f52517d.hashCode() * 31;
            boolean z = this.f52518e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f52517d;
            boolean z = this.f52518e;
            return "CardOrderClicked(subProductCode=" + str + ", isDigital=" + z + ")";
        }
    }

    /* renamed from: xm.b$f */
    public static final class C18790f extends C18784b {

        /* renamed from: c */
        private final int f52519c;

        /* renamed from: d */
        private final boolean f52520d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C18790f(int r4, boolean r5) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "click_next__"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                if (r5 == 0) goto L_0x0016
                java.lang.String r1 = "digital"
                goto L_0x0018
            L_0x0016:
                java.lang.String r1 = "physical"
            L_0x0018:
                r2 = 0
                r3.<init>(r0, r1, r2)
                r3.f52519c = r4
                r3.f52520d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p674xm.C18784b.C18790f.<init>(int, boolean):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18790f)) {
                return false;
            }
            C18790f fVar = (C18790f) obj;
            return this.f52519c == fVar.f52519c && this.f52520d == fVar.f52520d;
        }

        public int hashCode() {
            int i = this.f52519c * 31;
            boolean z = this.f52520d;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            int i = this.f52519c;
            boolean z = this.f52520d;
            return "CardOrderNextClicked(step=" + i + ", isDigital=" + z + ")";
        }
    }

    /* renamed from: xm.b$g */
    public static final class C18791g extends C18785a {

        /* renamed from: d */
        private final String f52521d;

        /* renamed from: e */
        private final boolean f52522e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18791g(String str, boolean z) {
            super(str, z, "card_ordered", (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "subProductCode");
            this.f52521d = str;
            this.f52522e = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18791g)) {
                return false;
            }
            C18791g gVar = (C18791g) obj;
            return C41536l.m120484d(this.f52521d, gVar.f52521d) && this.f52522e == gVar.f52522e;
        }

        public int hashCode() {
            int hashCode = this.f52521d.hashCode() * 31;
            boolean z = this.f52522e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f52521d;
            boolean z = this.f52522e;
            return "CardOrderedEvent(subProductCode=" + str + ", isDigital=" + z + ")";
        }
    }

    /* renamed from: xm.b$h */
    public static final class C18792h extends C18784b {

        /* renamed from: c */
        public static final C18792h f52523c = new C18792h();

        private C18792h() {
            super("choose_org_click", (String) null, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: xm.b$i */
    public static final class C18793i extends C18784b {

        /* renamed from: c */
        private final boolean f52524c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C18793i(boolean r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x0005
                java.lang.String r0 = "expired_card"
                goto L_0x0007
            L_0x0005:
                java.lang.String r0 = "other_card"
            L_0x0007:
                r1 = 0
                java.lang.String r2 = "choose_card_for_renewal_click"
                r3.<init>(r2, r0, r1)
                r3.f52524c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p674xm.C18784b.C18793i.<init>(boolean):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18793i) && this.f52524c == ((C18793i) obj).f52524c;
        }

        public int hashCode() {
            boolean z = this.f52524c;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.f52524c;
            return "RecoverCardClickEvent(isExpiredCard=" + z + ")";
        }
    }

    /* renamed from: xm.b$j */
    public static final class C18794j extends C18784b {

        /* renamed from: c */
        public static final C18794j f52525c = new C18794j();

        private C18794j() {
            super("choose_child_click", (String) null, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C18784b(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* renamed from: a */
    public String mo46585a() {
        return this.f52510a;
    }

    /* renamed from: b */
    public String mo46586b() {
        return this.f52511b;
    }

    /* renamed from: c */
    public final void mo46587c(C10463g gVar) {
        C41536l.m120489i(gVar, "analytics");
        gVar.mo27152s("debit_card_application", mo46586b(), mo46585a());
    }

    private C18784b(String str, String str2) {
        this.f52510a = str;
        this.f52511b = str2;
    }
}
