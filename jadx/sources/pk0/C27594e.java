package pk0;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ok0.C27025a;
import ok0.C27026b;
import ok0.C27028d;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p642vh.C18358g;
import z21.C40141a;

/* renamed from: pk0.e */
public abstract class C27594e implements C40141a {

    /* renamed from: pk0.e$a */
    public static abstract class C27595a extends C27594e {

        /* renamed from: a */
        private final StringSource f70524a;

        /* renamed from: b */
        private final Color f70525b;

        /* renamed from: c */
        private final int f70526c;

        /* renamed from: d */
        private final Color f70527d;

        /* renamed from: pk0.e$a$a */
        public static final class C27596a extends C27595a {

            /* renamed from: e */
            public static final C27596a f70528e = new C27596a();

            private C27596a() {
                super(C34646b.m101748b("text.hub.item.logout", new Object[0]), (Color) null, C27028d.icons_16_system_log_out, C18358g.m62729c(C27026b.f67854e), 2, (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C27595a(StringSource stringSource, Color color, int i, Color color2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, color, i, color2);
        }

        /* renamed from: a */
        public Color mo66930a() {
            return this.f70527d;
        }

        /* renamed from: b */
        public int mo66931b() {
            return this.f70526c;
        }

        /* renamed from: d */
        public StringSource mo66932d() {
            return this.f70524a;
        }

        /* renamed from: e */
        public Color mo66966e() {
            return this.f70525b;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27595a(StringSource stringSource, Color color, int i, Color color2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, (i2 & 2) != 0 ? C18358g.m62729c(C27026b.f67855f) : color, i, (i2 & 8) != 0 ? null : color2, (DefaultConstructorMarker) null);
        }

        private C27595a(StringSource stringSource, Color color, int i, Color color2) {
            super((DefaultConstructorMarker) null);
            this.f70524a = stringSource;
            this.f70525b = color;
            this.f70526c = i;
            this.f70527d = color2;
        }
    }

    /* renamed from: pk0.e$b */
    public static abstract class C27597b extends C27594e {

        /* renamed from: a */
        private final StringSource f70529a;

        /* renamed from: b */
        private final Color f70530b;

        /* renamed from: c */
        private final int f70531c;

        /* renamed from: d */
        private final Color f70532d;

        /* renamed from: pk0.e$b$a */
        public static final class C27598a extends C27597b {

            /* renamed from: e */
            public static final C27598a f70533e = new C27598a();

            private C27598a() {
                super(C34646b.m101748b("text.settings.choice.language", new Object[0]), (Color) null, C27028d.icons_16_system_language, C18358g.m62727a(C27025a.f67847a), 2, (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C27597b(StringSource stringSource, Color color, int i, Color color2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, color, i, color2);
        }

        /* renamed from: a */
        public Color mo66930a() {
            return this.f70532d;
        }

        /* renamed from: b */
        public int mo66931b() {
            return this.f70531c;
        }

        /* renamed from: d */
        public StringSource mo66932d() {
            return this.f70529a;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27597b(StringSource stringSource, Color color, int i, Color color2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, (i2 & 2) != 0 ? C18358g.m62729c(C27026b.f67855f) : color, i, (i2 & 8) != 0 ? null : color2, (DefaultConstructorMarker) null);
        }

        private C27597b(StringSource stringSource, Color color, int i, Color color2) {
            super((DefaultConstructorMarker) null);
            this.f70529a = stringSource;
            this.f70530b = color;
            this.f70531c = i;
            this.f70532d = color2;
        }
    }

    private C27594e() {
    }

    public /* synthetic */ C27594e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: c */
    public List mo66925c() {
        return C40141a.C40142a.m116276a(this);
    }
}
