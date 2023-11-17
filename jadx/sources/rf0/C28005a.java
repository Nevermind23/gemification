package rf0;

import ie0.C25185e;
import ie0.C25190j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: rf0.a */
public abstract class C28005a {

    /* renamed from: rf0.a$a */
    public static final class C28006a extends C28014i {

        /* renamed from: e */
        public static final C28006a f71366e = new C28006a();

        private C28006a() {
            super(C25185e.icons_48_contacts_email_close_fill, C34646b.m101748b("gt.terms.page.block.1.email", new Object[0]), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rf0.a$b */
    public static final class C28007b extends C28017l {

        /* renamed from: e */
        public static final C28007b f71367e = new C28007b();

        private C28007b() {
            super(C25185e.icons_48_general_id_fill, C34646b.m101748b("gt.terms.page.block.1.doc.1", new Object[0]), C34646b.m101748b("gt.terms.page.block.1.doc.2", new Object[0]), C34646b.m101748b("gt.terms.page.block.1.doc.3", new Object[0]), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rf0.a$c */
    public static final class C28008c extends C28005a {

        /* renamed from: a */
        public static final C28008c f71368a = new C28008c();

        private C28008c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rf0.a$d */
    public static abstract class C28009d extends C28005a {

        /* renamed from: a */
        private final StringSource f71369a;

        public /* synthetic */ C28009d(StringSource stringSource, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource);
        }

        /* renamed from: a */
        public final StringSource mo67556a() {
            return this.f71369a;
        }

        private C28009d(StringSource stringSource) {
            super((DefaultConstructorMarker) null);
            this.f71369a = stringSource;
        }
    }

    /* renamed from: rf0.a$e */
    public static final class C28010e extends C28009d {

        /* renamed from: b */
        public static final C28010e f71370b = new C28010e();

        private C28010e() {
            super(C34646b.m101748b("gt.terms.page.block.1.title", new Object[0]), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rf0.a$f */
    public static final class C28011f extends C28009d {

        /* renamed from: b */
        public static final C28011f f71371b = new C28011f();

        private C28011f() {
            super(C34646b.m101748b("gt.terms.page.block.2.title", new Object[0]), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rf0.a$g */
    public static final class C28012g extends C28022q {

        /* renamed from: e */
        public static final C28012g f71372e = new C28012g();

        private C28012g() {
            super(C25185e.f64661q, C34646b.m101748b("gt.terms.page.block.2.text.1", new Object[0]), C34646b.m101748b("gt.terms.page.block.2.text.2", new Object[0]), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rf0.a$h */
    public static final class C28013h extends C28022q {

        /* renamed from: e */
        public static final C28013h f71373e = new C28013h();

        private C28013h() {
            super(C25185e.f64658m, C34646b.m101748b("gt.terms.page.block.2.text.3", new Object[0]), C34646b.m101748b("gt.terms.page.block.2.text.4", new Object[0]), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rf0.a$i */
    public static abstract class C28014i extends C28015j {
        public /* synthetic */ C28014i(int i, StringSource stringSource, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, stringSource);
        }

        private C28014i(int i, StringSource stringSource) {
            super(new Image.Resource(i, (Boolean) null, 2, (DefaultConstructorMarker) null), stringSource, (StringSource) null, (StringSource) null, 12, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rf0.a$j */
    public static abstract class C28015j extends C28005a {

        /* renamed from: a */
        private final Image f71374a;

        /* renamed from: b */
        private final StringSource f71375b;

        /* renamed from: c */
        private final StringSource f71376c;

        /* renamed from: d */
        private final StringSource f71377d;

        public /* synthetic */ C28015j(Image image, StringSource stringSource, StringSource stringSource2, StringSource stringSource3, DefaultConstructorMarker defaultConstructorMarker) {
            this(image, stringSource, stringSource2, stringSource3);
        }

        /* renamed from: a */
        public final StringSource mo67557a() {
            return this.f71377d;
        }

        /* renamed from: b */
        public final Image mo67558b() {
            return this.f71374a;
        }

        /* renamed from: c */
        public final StringSource mo67559c() {
            return this.f71375b;
        }

        /* renamed from: d */
        public final StringSource mo67560d() {
            return this.f71376c;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C28015j(Image image, StringSource stringSource, StringSource stringSource2, StringSource stringSource3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(image, stringSource, (i & 4) != 0 ? null : stringSource2, (i & 8) != 0 ? null : stringSource3, (DefaultConstructorMarker) null);
        }

        private C28015j(Image image, StringSource stringSource, StringSource stringSource2, StringSource stringSource3) {
            super((DefaultConstructorMarker) null);
            this.f71374a = image;
            this.f71375b = stringSource;
            this.f71376c = stringSource2;
            this.f71377d = stringSource3;
        }
    }

    /* renamed from: rf0.a$k */
    public static final class C28016k extends C28005a {

        /* renamed from: a */
        private final StringSource f71378a;

        /* renamed from: b */
        private final StringSource f71379b = C34646b.m101748b("gt.terms.page.agreement.terms", new Object[0]);

        /* renamed from: c */
        private final StringSource f71380c;

        /* renamed from: d */
        private final StringSource f71381d;

        /* renamed from: e */
        private final StringSource f71382e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28016k(StringSource stringSource) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(stringSource, "termsUrl");
            this.f71378a = stringSource;
            int i = C25190j.gt_onboarding_first_step_agree;
            this.f71380c = C34646b.m101750d(i, new Object[0]);
            this.f71381d = C34646b.m101750d(i, new Object[0]);
            this.f71382e = C34646b.m101750d(C25190j.gt_onboarding_first_step_terms_and_conditions, new Object[0]);
        }

        /* renamed from: a */
        public final StringSource mo67561a() {
            return this.f71380c;
        }

        /* renamed from: b */
        public final StringSource mo67562b() {
            return this.f71382e;
        }

        /* renamed from: c */
        public final StringSource mo67563c() {
            return this.f71381d;
        }

        /* renamed from: d */
        public final StringSource mo67564d() {
            return this.f71379b;
        }

        /* renamed from: e */
        public final StringSource mo67565e() {
            return this.f71378a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28016k) && C41536l.m120484d(this.f71378a, ((C28016k) obj).f71378a);
        }

        public int hashCode() {
            return this.f71378a.hashCode();
        }

        public String toString() {
            StringSource stringSource = this.f71378a;
            return "Terms(termsUrl=" + stringSource + ")";
        }
    }

    /* renamed from: rf0.a$l */
    public static abstract class C28017l extends C28015j {
        public /* synthetic */ C28017l(int i, StringSource stringSource, StringSource stringSource2, StringSource stringSource3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, stringSource, stringSource2, stringSource3);
        }

        private C28017l(int i, StringSource stringSource, StringSource stringSource2, StringSource stringSource3) {
            super(new Image.Resource(i, (Boolean) null, 2, (DefaultConstructorMarker) null), stringSource2, stringSource, stringSource3, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rf0.a$m */
    public static abstract class C28018m extends C28005a {

        /* renamed from: a */
        private final StringSource f71383a;

        public /* synthetic */ C28018m(StringSource stringSource, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource);
        }

        /* renamed from: a */
        public final StringSource mo67569a() {
            return this.f71383a;
        }

        private C28018m(StringSource stringSource) {
            super((DefaultConstructorMarker) null);
            this.f71383a = stringSource;
        }
    }

    /* renamed from: rf0.a$n */
    public static final class C28019n extends C28018m {

        /* renamed from: b */
        public static final C28019n f71384b = new C28019n();

        private C28019n() {
            super(C34646b.m101748b("gt.terms.page.block.3.title", new Object[0]), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rf0.a$o */
    public static final class C28020o extends C28022q {

        /* renamed from: e */
        public static final C28020o f71385e = new C28020o();

        private C28020o() {
            super(C25185e.f64661q, C34646b.m101748b("gt.terms.page.block.3.text.1", new Object[0]), C34646b.m101748b("gt.terms.page.block.3.text.2", new Object[0]), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rf0.a$p */
    public static final class C28021p extends C28022q {

        /* renamed from: e */
        public static final C28021p f71386e = new C28021p();

        private C28021p() {
            super(C25185e.f64658m, C34646b.m101748b("gt.terms.page.block.3.text.3", new Object[0]), C34646b.m101748b("gt.terms.page.block.3.text.4", new Object[0]), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: rf0.a$q */
    public static abstract class C28022q extends C28015j {
        public /* synthetic */ C28022q(int i, StringSource stringSource, StringSource stringSource2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, stringSource, stringSource2);
        }

        private C28022q(int i, StringSource stringSource, StringSource stringSource2) {
            super(new Image.Resource(i, (Boolean) null, 2, (DefaultConstructorMarker) null), stringSource, (StringSource) null, stringSource2, 4, (DefaultConstructorMarker) null);
        }
    }

    private C28005a() {
    }

    public /* synthetic */ C28005a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
