package g11;

import f11.C31907a;
import f11.C31908b;
import f11.C31909c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p642vh.C18358g;
import z21.C40141a;

/* renamed from: g11.b */
public abstract class C32041b implements C40141a {

    /* renamed from: a */
    private final Color f78876a;

    /* renamed from: b */
    private final Color f78877b;

    /* renamed from: g11.b$a */
    public static abstract class C32042a extends C32041b {

        /* renamed from: c */
        private final StringSource f78878c;

        /* renamed from: d */
        private final int f78879d;

        /* renamed from: e */
        private final boolean f78880e;

        /* renamed from: g11.b$a$a */
        public static final class C32043a extends C32042a {

            /* renamed from: f */
            public static final C32043a f78881f = new C32043a();

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private C32043a() {
                /*
                    r6 = this;
                    int r2 = f11.C31909c.f78654c
                    r0 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.String r1 = "text.settings.cards.accounts.management"
                    ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                    r3 = 0
                    r4 = 4
                    r5 = 0
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: g11.C32041b.C32042a.C32043a.<init>():void");
            }
        }

        /* renamed from: g11.b$a$b */
        public static final class C32044b extends C32042a {

            /* renamed from: f */
            private final Color f78882f;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C32044b(Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : color);
            }

            /* renamed from: a */
            public Color mo66930a() {
                return this.f78882f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C32044b) && C41536l.m120484d(this.f78882f, ((C32044b) obj).f78882f);
            }

            public int hashCode() {
                Color color = this.f78882f;
                if (color == null) {
                    return 0;
                }
                return color.hashCode();
            }

            public String toString() {
                Color color = this.f78882f;
                return "BogScoolAppActivation(iconTint=" + color + ")";
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C32044b(p341ge.bog.designsystem.components.common.Color r7) {
                /*
                    r6 = this;
                    int r2 = f11.C31909c.f78653b
                    r0 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.String r1 = "text.settings.scoolapp.activation"
                    ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                    r3 = 0
                    r4 = 4
                    r5 = 0
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    r6.f78882f = r7
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: g11.C32041b.C32042a.C32044b.<init>(ge.bog.designsystem.components.common.Color):void");
            }
        }

        /* renamed from: g11.b$a$c */
        public static final class C32045c extends C32042a {

            /* renamed from: f */
            private final StringSource f78883f;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C32045c(p341ge.bog.mobilebank.shared.helper.StringSource r7) {
                /*
                    r6 = this;
                    int r2 = f11.C31909c.f78652a
                    r0 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.String r1 = "text.settings.theme"
                    ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                    r3 = 0
                    r4 = 4
                    r5 = 0
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    r6.f78883f = r7
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: g11.C32041b.C32042a.C32045c.<init>(ge.bog.mobilebank.shared.helper.StringSource):void");
            }

            /* renamed from: c */
            public List mo66925c() {
                List<String> m = C41341q.m119910m("theme.switcher.actionsheet.radiobutton.light", "theme.switcher.actionsheet.radiobutton.dark", "theme.switcher.actionsheet.radiobutton.system");
                ArrayList arrayList = new ArrayList(C41343r.m119925u(m, 10));
                for (String b : m) {
                    arrayList.add(C34646b.m101748b(b, new Object[0]));
                }
                ArrayList arrayList2 = new ArrayList(C41343r.m119925u(m, 10));
                for (String c : m) {
                    arrayList2.add(C34646b.m101749c(c));
                }
                return C41358y.m120023m0(arrayList, arrayList2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C32045c) && C41536l.m120484d(this.f78883f, ((C32045c) obj).f78883f);
            }

            /* renamed from: g */
            public final StringSource mo72541g() {
                return this.f78883f;
            }

            public int hashCode() {
                StringSource stringSource = this.f78883f;
                if (stringSource == null) {
                    return 0;
                }
                return stringSource.hashCode();
            }

            public String toString() {
                StringSource stringSource = this.f78883f;
                return "DarkMode(subTitleRes=" + stringSource + ")";
            }
        }

        /* renamed from: g11.b$a$d */
        public static final class C32046d extends C32042a {

            /* renamed from: f */
            public static final C32046d f78884f = new C32046d();

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private C32046d() {
                /*
                    r6 = this;
                    int r2 = f11.C31909c.icons_16_system_success
                    r0 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.String r1 = "text.settings.interests.management"
                    ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                    r3 = 0
                    r4 = 4
                    r5 = 0
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: g11.C32041b.C32042a.C32046d.<init>():void");
            }
        }

        /* renamed from: g11.b$a$e */
        public static final class C32047e extends C32042a {

            /* renamed from: f */
            private final boolean f78885f;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C32047e(boolean r7) {
                /*
                    r6 = this;
                    int r2 = f11.C31909c.f78656f
                    r0 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.String r1 = "text.settings.investment.account.deactivation"
                    ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                    r3 = 0
                    r4 = 4
                    r5 = 0
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    r6.f78885f = r7
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: g11.C32041b.C32042a.C32047e.<init>(boolean):void");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C32047e) && this.f78885f == ((C32047e) obj).f78885f;
            }

            /* renamed from: f */
            public boolean mo72536f() {
                return this.f78885f;
            }

            /* renamed from: g */
            public final C32047e mo72545g(boolean z) {
                return new C32047e(z);
            }

            public int hashCode() {
                boolean z = this.f78885f;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public String toString() {
                boolean z = this.f78885f;
                return "InvestmentAccount(isLoading=" + z + ")";
            }
        }

        /* renamed from: g11.b$a$f */
        public static final class C32048f extends C32042a {

            /* renamed from: f */
            public static final C32048f f78886f = new C32048f();

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private C32048f() {
                /*
                    r6 = this;
                    int r2 = f11.C31909c.f78655e
                    r0 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.String r1 = "text.settings.pension.savings.management"
                    ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                    r3 = 0
                    r4 = 4
                    r5 = 0
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: g11.C32041b.C32042a.C32048f.<init>():void");
            }
        }

        /* renamed from: g11.b$a$g */
        public static final class C32049g extends C32042a {

            /* renamed from: f */
            public static final C32049g f78887f = new C32049g();

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private C32049g() {
                /*
                    r6 = this;
                    int r2 = f11.C31909c.icons_16_contacts_chat_fill
                    r0 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.String r1 = "text.settings.sms.push.notification.management"
                    ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r1, r0)
                    r3 = 0
                    r4 = 4
                    r5 = 0
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: g11.C32041b.C32042a.C32049g.<init>():void");
            }
        }

        public /* synthetic */ C32042a(StringSource stringSource, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, z);
        }

        /* renamed from: b */
        public int mo66931b() {
            return this.f78879d;
        }

        /* renamed from: d */
        public StringSource mo66932d() {
            return this.f78878c;
        }

        /* renamed from: f */
        public boolean mo72536f() {
            return this.f78880e;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C32042a(StringSource stringSource, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, (i2 & 4) != 0 ? false : z, (DefaultConstructorMarker) null);
        }

        private C32042a(StringSource stringSource, int i, boolean z) {
            super((DefaultConstructorMarker) null);
            this.f78878c = stringSource;
            this.f78879d = i;
            this.f78880e = z;
        }
    }

    /* renamed from: g11.b$b */
    public static abstract class C32050b extends C32041b {

        /* renamed from: c */
        private final StringSource f78888c;

        /* renamed from: d */
        private final int f78889d;

        /* renamed from: g11.b$b$a */
        public static final class C32051a extends C32050b {

            /* renamed from: e */
            public static final C32051a f78890e = new C32051a();

            private C32051a() {
                super(C34646b.m101748b("text.settings.confidentiality.policy", new Object[0]), C31909c.icons_16_general_doc_fill, (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C32050b(StringSource stringSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i);
        }

        /* renamed from: b */
        public int mo66931b() {
            return this.f78889d;
        }

        /* renamed from: d */
        public StringSource mo66932d() {
            return this.f78888c;
        }

        private C32050b(StringSource stringSource, int i) {
            super((DefaultConstructorMarker) null);
            this.f78888c = stringSource;
            this.f78889d = i;
        }

        /* renamed from: g11.b$b$b */
        public static final class C32052b extends C32050b {

            /* renamed from: e */
            private final List f78891e;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C32052b(java.util.List r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
                /*
                    r2 = this;
                    r5 = 1
                    r4 = r4 & r5
                    if (r4 == 0) goto L_0x0036
                    r3 = 4
                    ge.bog.mobilebank.shared.helper.StringSource$Dictionary[] r3 = new p341ge.bog.mobilebank.shared.helper.StringSource.Dictionary[r3]
                    java.lang.String r4 = "text.settings.choice.faceid"
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r4, r1)
                    r3[r0] = r4
                    java.lang.String r4 = "text.settings.passcode"
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r4, r1)
                    r3[r5] = r4
                    java.lang.String r4 = "text.settings.customer.devices"
                    java.lang.Object[] r5 = new java.lang.Object[r0]
                    ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r4, r5)
                    r5 = 2
                    r3[r5] = r4
                    java.lang.String r4 = "text.settings.change.password"
                    java.lang.Object[] r5 = new java.lang.Object[r0]
                    ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r4, r5)
                    r5 = 3
                    r3[r5] = r4
                    java.util.List r3 = ie1.C41341q.m119910m(r3)
                L_0x0036:
                    r2.<init>(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: g11.C32041b.C32050b.C32052b.<init>(java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: c */
            public List mo66925c() {
                return this.f78891e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C32052b) && C41536l.m120484d(this.f78891e, ((C32052b) obj).f78891e);
            }

            public int hashCode() {
                return this.f78891e.hashCode();
            }

            public String toString() {
                List list = this.f78891e;
                return "SignInAndAuth(additionalSearchKeys=" + list + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C32052b(List list) {
                super(C34646b.m101748b("text.settings.signin.authentication", new Object[0]), C31909c.f78657h, (DefaultConstructorMarker) null);
                C41536l.m120489i(list, "additionalSearchKeys");
                this.f78891e = list;
            }
        }
    }

    public /* synthetic */ C32041b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public Color mo66930a() {
        return this.f78877b;
    }

    /* renamed from: c */
    public List mo66925c() {
        return C40141a.C40142a.m116276a(this);
    }

    /* renamed from: e */
    public Color mo72535e() {
        return this.f78876a;
    }

    private C32041b() {
        this.f78876a = C18358g.m62729c(C31908b.f78651a);
        this.f78877b = C18358g.m62727a(C31907a.f78650a);
    }
}
