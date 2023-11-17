package tu0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import su0.C38536a;

/* renamed from: tu0.a */
public abstract class C38796a {

    /* renamed from: g */
    public static final C38797a f92845g = new C38797a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f92846a;

    /* renamed from: b */
    private final String f92847b;

    /* renamed from: c */
    private final String f92848c;

    /* renamed from: d */
    private final String f92849d;

    /* renamed from: e */
    private final Integer f92850e;

    /* renamed from: f */
    private final String f92851f;

    /* renamed from: tu0.a$a */
    public static final class C38797a {
        private C38797a() {
        }

        public /* synthetic */ C38797a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: tu0.a$b */
    public static final class C38798b extends C38796a {

        /* renamed from: h */
        private final C38536a f92852h;

        /* renamed from: i */
        private final String f92853i;

        /* renamed from: j */
        private final String f92854j;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C38798b(C38536a aVar, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i & 2) != 0 ? "click_banner" : str, (i & 4) != 0 ? "NBO" : str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38798b)) {
                return false;
            }
            C38798b bVar = (C38798b) obj;
            return C41536l.m120484d(this.f92852h, bVar.f92852h) && C41536l.m120484d(this.f92853i, bVar.f92853i) && C41536l.m120484d(this.f92854j, bVar.f92854j);
        }

        public int hashCode() {
            return (((this.f92852h.hashCode() * 31) + this.f92853i.hashCode()) * 31) + this.f92854j.hashCode();
        }

        public String toString() {
            C38536a aVar = this.f92852h;
            String str = this.f92853i;
            String str2 = this.f92854j;
            return "NboBannerClickEvent(offer=" + aVar + ", clickAction=" + str + ", clickEventName=" + str2 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C38798b(su0.C38536a r9, java.lang.String r10, java.lang.String r11) {
            /*
                r8 = this;
                java.lang.String r0 = "offer"
                kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                java.lang.String r0 = "clickAction"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                java.lang.String r0 = "clickEventName"
                kotlin.jvm.internal.C41536l.m120489i(r11, r0)
                su0.b r0 = r9.mo92150y()
                java.lang.String r4 = r0.mo92152a()
                su0.d r0 = r9.mo92144t()
                java.lang.String r0 = r0.mo92159a()
                if (r0 != 0) goto L_0x0023
                java.lang.String r0 = ""
            L_0x0023:
                r5 = r0
                java.lang.Integer r6 = r9.mo92134j()
                r7 = 0
                r1 = r8
                r2 = r11
                r3 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r8.f92852h = r9
                r8.f92853i = r10
                r8.f92854j = r11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tu0.C38796a.C38798b.<init>(su0.a, java.lang.String, java.lang.String):void");
        }
    }

    /* renamed from: tu0.a$c */
    public static final class C38799c extends C38796a {

        /* renamed from: h */
        private final C38536a f92855h;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C38799c(su0.C38536a r10) {
            /*
                r9 = this;
                java.lang.String r0 = "offer"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                r2 = 0
                java.lang.String r3 = "close_banner"
                su0.b r0 = r10.mo92150y()
                java.lang.String r4 = r0.mo92152a()
                su0.d r0 = r10.mo92144t()
                java.lang.String r0 = r0.mo92159a()
                if (r0 != 0) goto L_0x001c
                java.lang.String r0 = ""
            L_0x001c:
                r5 = r0
                java.lang.Integer r6 = r10.mo92134j()
                r7 = 1
                r8 = 0
                r1 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                r9.f92855h = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tu0.C38796a.C38799c.<init>(su0.a):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C38799c) && C41536l.m120484d(this.f92855h, ((C38799c) obj).f92855h);
        }

        public int hashCode() {
            return this.f92855h.hashCode();
        }

        public String toString() {
            C38536a aVar = this.f92855h;
            return "NboBannerClosedEvent(offer=" + aVar + ")";
        }
    }

    /* renamed from: tu0.a$d */
    public static final class C38800d extends C38796a {

        /* renamed from: h */
        private final C38536a f92856h;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C38800d(su0.C38536a r10) {
            /*
                r9 = this;
                java.lang.String r0 = "offer"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                r2 = 0
                java.lang.String r3 = "banner_impression"
                su0.b r0 = r10.mo92150y()
                java.lang.String r4 = r0.mo92152a()
                su0.d r0 = r10.mo92144t()
                java.lang.String r0 = r0.mo92159a()
                if (r0 != 0) goto L_0x001c
                java.lang.String r0 = ""
            L_0x001c:
                r5 = r0
                java.lang.Integer r6 = r10.mo92134j()
                r7 = 1
                r8 = 0
                r1 = r9
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                r9.f92856h = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tu0.C38796a.C38800d.<init>(su0.a):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C38800d) && C41536l.m120484d(this.f92856h, ((C38800d) obj).f92856h);
        }

        public int hashCode() {
            return this.f92856h.hashCode();
        }

        public String toString() {
            C38536a aVar = this.f92856h;
            return "NboBannerImpressionEvent(offer=" + aVar + ")";
        }
    }

    public /* synthetic */ C38796a(String str, String str2, String str3, String str4, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, num);
    }

    /* renamed from: a */
    public final String mo92502a() {
        return this.f92847b;
    }

    /* renamed from: b */
    public final String mo92503b() {
        return this.f92846a;
    }

    /* renamed from: c */
    public final String mo92504c() {
        return this.f92851f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r2 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C38796a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Integer r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.f92846a = r1
            r0.f92847b = r2
            r0.f92848c = r3
            r0.f92849d = r4
            r0.f92850e = r5
            java.lang.String r1 = "|"
            if (r5 == 0) goto L_0x0025
            r5.intValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r2 = ""
        L_0x0027:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r1)
            r5.append(r4)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
            r0.f92851f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tu0.C38796a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38796a(String str, String str2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "NBO" : str, str2, str3, str4, (i & 16) != 0 ? null : num, (DefaultConstructorMarker) null);
    }
}
