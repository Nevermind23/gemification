package yd0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: yd0.a */
public abstract class C29991a {

    /* renamed from: c */
    public static final C29993b f75801c = new C29993b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f75802a;

    /* renamed from: b */
    private final String f75803b;

    /* renamed from: yd0.a$a */
    private static final class C29992a extends C29991a {

        /* renamed from: d */
        private final boolean f75804d;

        /* renamed from: e */
        private final String f75805e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C29992a(boolean r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = "category"
                kotlin.jvm.internal.C41536l.m120489i(r5, r0)
                if (r4 == 0) goto L_0x0019
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "display_prize_popup_"
                r0.append(r1)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                goto L_0x002a
            L_0x0019:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "display_loss_popup_"
                r0.append(r1)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
            L_0x002a:
                r1 = 0
                java.lang.String r2 = "show_popup"
                r3.<init>(r2, r0, r1)
                r3.f75804d = r4
                r3.f75805e = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yd0.C29991a.C29992a.<init>(boolean, java.lang.String):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29992a)) {
                return false;
            }
            C29992a aVar = (C29992a) obj;
            return this.f75804d == aVar.f75804d && C41536l.m120484d(this.f75805e, aVar.f75805e);
        }

        public int hashCode() {
            boolean z = this.f75804d;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f75805e.hashCode();
        }

        public String toString() {
            boolean z = this.f75804d;
            String str = this.f75805e;
            return "CampaignResult(isVictory=" + z + ", category=" + str + ")";
        }
    }

    /* renamed from: yd0.a$b */
    public static final class C29993b {
        private C29993b() {
        }

        public /* synthetic */ C29993b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: yd0.a$c */
    public static abstract class C29994c extends C29991a {

        /* renamed from: d */
        private final String f75806d;

        /* renamed from: yd0.a$c$a */
        public static final class C29995a extends C29994c {

            /* renamed from: e */
            public static final C29995a f75807e = new C29995a();

            private C29995a() {
                super("3rd_party", (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: yd0.a$c$b */
        public static final class C29996b extends C29994c {

            /* renamed from: e */
            public static final C29996b f75808e = new C29996b();

            private C29996b() {
                super("insurance", (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: yd0.a$c$c */
        public static final class C29997c extends C29994c {

            /* renamed from: e */
            public static final C29997c f75809e = new C29997c();

            private C29997c() {
                super("dd", (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: yd0.a$c$d */
        public static final class C29998d extends C29994c {

            /* renamed from: e */
            public static final C29998d f75810e = new C29998d();

            private C29998d() {
                super("deposit", (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: yd0.a$c$e */
        public static final class C29999e extends C29994c {

            /* renamed from: e */
            public static final C29999e f75811e = new C29999e();

            private C29999e() {
                super("loan", (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: yd0.a$c$f */
        public static final class C30000f extends C29994c {

            /* renamed from: e */
            public static final C30000f f75812e = new C30000f();

            private C30000f() {
                super("card", (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: yd0.a$c$g */
        public static final class C30001g extends C29994c {

            /* renamed from: e */
            public static final C30001g f75813e = new C30001g();

            private C30001g() {
                super("piggy", (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: yd0.a$c$h */
        public static final class C30002h extends C29994c {

            /* renamed from: e */
            public static final C30002h f75814e = new C30002h();

            private C30002h() {
                super("sto", (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C29994c(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* renamed from: c */
        public final C29991a mo70297c(boolean z) {
            return new C29992a(z, this.f75806d);
        }

        private C29994c(String str) {
            super("success_" + str, (String) null, 2, (DefaultConstructorMarker) null);
            this.f75806d = str;
        }
    }

    public /* synthetic */ C29991a(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* renamed from: a */
    public final String mo70292a() {
        return this.f75802a;
    }

    /* renamed from: b */
    public final String mo70293b() {
        return this.f75803b;
    }

    private C29991a(String str, String str2) {
        this.f75802a = str;
        this.f75803b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29991a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (DefaultConstructorMarker) null);
    }
}
