package pk0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import androidx.core.content.C0767a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ok0.C27025a;
import ok0.C27026b;
import ok0.C27027c;
import ok0.C27028d;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p642vh.C18358g;
import z21.C40141a;

/* renamed from: pk0.a */
public abstract class C27551a implements C40141a {

    /* renamed from: d */
    public static final C27563b f70456d = new C27563b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final boolean f70457a;

    /* renamed from: b */
    private final Color f70458b;

    /* renamed from: c */
    private final Integer f70459c;

    /* renamed from: pk0.a$a */
    public static abstract class C27552a extends C27551a {

        /* renamed from: e */
        private final StringSource f70460e;

        /* renamed from: f */
        private final int f70461f;

        /* renamed from: g */
        private final Color f70462g;

        /* renamed from: pk0.a$a$a */
        public static final class C27553a extends C27552a {

            /* renamed from: h */
            public static final C27553a f70463h = new C27553a();

            private C27553a() {
                super(C34646b.m101748b("text.hub.item.banking.sets", new Object[0]), C27028d.f67874i0, C18358g.m62727a(C27025a.f67849c), (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$a$b */
        public static final class C27554b extends C27552a {

            /* renamed from: h */
            public static final C27554b f70464h = new C27554b();

            private C27554b() {
                super(C34646b.m101748b("text.hub.item.buy.now.pay.later", new Object[0]), C27028d.f67861L, C18358g.m62727a(C27025a.f67849c), (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$a$c */
        public static final class C27555c extends C27552a {

            /* renamed from: h */
            public static final C27555c f70465h = new C27555c();

            private C27555c() {
                super(C34646b.m101748b("text.hub.item.debit.card", new Object[0]), C27028d.f67862N, C18358g.m62727a(C27025a.f67849c), (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$a$d */
        public static final class C27556d extends C27552a {

            /* renamed from: h */
            public static final C27556d f70466h = new C27556d();

            private C27556d() {
                super(C34646b.m101748b("text.hub.item.deposit", new Object[0]), C27028d.f67864P, C18358g.m62727a(C27025a.f67849c), (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$a$e */
        public static final class C27557e extends C27552a {

            /* renamed from: h */
            public static final C27557e f70467h = new C27557e();

            private C27557e() {
                super(C34646b.m101748b("text.hub.item.financialmanager", new Object[0]), C27028d.icons_24_general_pfm_fill, C18358g.m62727a(C27025a.f67849c), (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$a$f */
        public static final class C27558f extends C27552a {

            /* renamed from: h */
            public static final C27558f f70468h = new C27558f();

            private C27558f() {
                super(C34646b.m101748b("text.hub.item.loan", new Object[0]), C27028d.f67868X, C18358g.m62727a(C27025a.f67849c), (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$a$g */
        public static final class C27559g extends C27552a {

            /* renamed from: h */
            public static final C27559g f70469h = new C27559g();

            private C27559g() {
                super(C34646b.m101748b("text.hub.item.loyalty.programs", new Object[0]), C27028d.f67866T, C18358g.m62727a(C27025a.f67849c), (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$a$h */
        public static final class C27560h extends C27552a {

            /* renamed from: h */
            public static final C27560h f70470h = new C27560h();

            private C27560h() {
                super(C34646b.m101748b("text.hub.item.offers.and.apps", new Object[0]), C27028d.icons_24_general_offer_fill, C18358g.m62727a(C27025a.f67849c), (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$a$i */
        public static final class C27561i extends C27552a {

            /* renamed from: h */
            public static final C27561i f70471h = new C27561i();

            private C27561i() {
                super(C34646b.m101748b("text.hub.item.piggy.bank", new Object[0]), C27028d.icons_24_deposit_piggy_bank_fill, C18358g.m62727a(C27025a.f67849c), (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C27552a(StringSource stringSource, int i, Color color, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, color);
        }

        /* renamed from: a */
        public Color mo66930a() {
            return this.f70462g;
        }

        /* renamed from: b */
        public int mo66931b() {
            return this.f70461f;
        }

        /* renamed from: d */
        public StringSource mo66932d() {
            return this.f70460e;
        }

        /* renamed from: pk0.a$a$j */
        public static final class C27562j extends C27552a {

            /* renamed from: h */
            private final StringSource f70472h;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C27562j(StringSource stringSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? C34646b.m101748b("text.hub.item.become.solo", new Object[0]) : stringSource);
            }

            /* renamed from: d */
            public StringSource mo66932d() {
                return this.f70472h;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27562j) && C41536l.m120484d(this.f70472h, ((C27562j) obj).f70472h);
            }

            public int hashCode() {
                return this.f70472h.hashCode();
            }

            public String toString() {
                StringSource stringSource = this.f70472h;
                return "Solo(titleId=" + stringSource + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C27562j(StringSource stringSource) {
                super(stringSource, C27028d.icons_24_solo, (Color) null, 4, (DefaultConstructorMarker) null);
                C41536l.m120489i(stringSource, "titleId");
                this.f70472h = stringSource;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27552a(StringSource stringSource, int i, Color color, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, (i2 & 4) != 0 ? null : color, (DefaultConstructorMarker) null);
        }

        private C27552a(StringSource stringSource, int i, Color color) {
            super((DefaultConstructorMarker) null);
            this.f70460e = stringSource;
            this.f70461f = i;
            this.f70462g = color;
        }
    }

    /* renamed from: pk0.a$b */
    public static final class C27563b {
        private C27563b() {
        }

        public /* synthetic */ C27563b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: pk0.a$c */
    public static abstract class C27564c extends C27551a {

        /* renamed from: e */
        private final StringSource f70473e;

        /* renamed from: f */
        private final int f70474f;

        /* renamed from: g */
        private final Color f70475g;

        /* renamed from: h */
        private final Color f70476h;

        /* renamed from: i */
        private final Integer f70477i;

        /* renamed from: pk0.a$c$a */
        public static final class C27565a extends C27564c {

            /* renamed from: j */
            public static final C27565a f70478j = new C27565a();

            private C27565a() {
                super(C34646b.m101748b("text.hub.item.gamification", new Object[0]), C27028d.ic_gamification_shortcut, (Color) null, (Color) null, Integer.valueOf(C27028d.f67871b), (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$c$b */
        public static final class C27566b extends C27564c {

            /* renamed from: j */
            public static final C27566b f70479j = new C27566b();

            private C27566b() {
                super(C34646b.m101748b("text.hub.item.giftcard", new Object[0]), C27028d.f67866T, (Color) null, (Color) null, Integer.valueOf(C27028d.f67871b), 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$c$c */
        public static final class C27567c extends C27564c {

            /* renamed from: j */
            public static final C27567c f70480j = new C27567c();

            private C27567c() {
                super(C34646b.m101748b("text.hub.item.insurance", new Object[0]), C27028d.f67865S, (Color) null, (Color) null, (Integer) null, 28, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$c$d */
        public static final class C27568d extends C27564c {

            /* renamed from: j */
            public static final C27568d f70481j = new C27568d();

            private C27568d() {
                super(C34646b.m101748b("text.hub.item.investment", new Object[0]), C27028d.icons_24_general_chart, (Color) null, (Color) null, (Integer) null, 28, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$c$e */
        public static final class C27569e extends C27564c {

            /* renamed from: j */
            public static final C27569e f70482j = new C27569e();

            private C27569e() {
                super(C34646b.m101748b("text.hub.item.travel.card", new Object[0]), C27028d.icons_24_payment_category_transportation, (Color) null, (Color) null, (Integer) null, 28, (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C27564c(StringSource stringSource, int i, Color color, Color color2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, color, color2, num);
        }

        /* renamed from: a */
        public Color mo66930a() {
            return this.f70475g;
        }

        /* renamed from: b */
        public int mo66931b() {
            return this.f70474f;
        }

        /* renamed from: d */
        public StringSource mo66932d() {
            return this.f70473e;
        }

        /* renamed from: e */
        public Color mo66926e() {
            return this.f70476h;
        }

        /* renamed from: f */
        public Integer mo66927f() {
            return this.f70477i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27564c(StringSource stringSource, int i, Color color, Color color2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, (i2 & 4) != 0 ? C18358g.m62729c(C27026b.f67857h) : color, (i2 & 8) != 0 ? C18358g.m62729c(C27026b.f67853d) : color2, (i2 & 16) != 0 ? null : num, (DefaultConstructorMarker) null);
        }

        private C27564c(StringSource stringSource, int i, Color color, Color color2, Integer num) {
            super((DefaultConstructorMarker) null);
            this.f70473e = stringSource;
            this.f70474f = i;
            this.f70475g = color;
            this.f70476h = color2;
            this.f70477i = num;
        }
    }

    /* renamed from: pk0.a$d */
    public static abstract class C27570d extends C27551a {

        /* renamed from: e */
        private final StringSource f70483e;

        /* renamed from: f */
        private final int f70484f;

        /* renamed from: g */
        private final Color f70485g;

        /* renamed from: pk0.a$d$a */
        public static final class C27571a extends C27570d {

            /* renamed from: h */
            public static final C27571a f70486h = new C27571a();

            private C27571a() {
                super(C34646b.m101748b("text.hub.item.address", new Object[0]), C27028d.f67863O, (Color) null, 4, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$d$b */
        public static final class C27572b extends C27570d {

            /* renamed from: h */
            public static final C27572b f70487h = new C27572b();

            private C27572b() {
                super(C34646b.m101748b("text.hub.item.exchange.rates", new Object[0]), C27028d.icons_24_payment_transfer_conversion, (Color) null, 4, (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C27570d(StringSource stringSource, int i, Color color, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, color);
        }

        /* renamed from: a */
        public Color mo66930a() {
            return this.f70485g;
        }

        /* renamed from: b */
        public int mo66931b() {
            return this.f70484f;
        }

        /* renamed from: d */
        public StringSource mo66932d() {
            return this.f70483e;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27570d(StringSource stringSource, int i, Color color, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, (i2 & 4) != 0 ? C18358g.m62729c(C27026b.f67856g) : color, (DefaultConstructorMarker) null);
        }

        private C27570d(StringSource stringSource, int i, Color color) {
            super((DefaultConstructorMarker) null);
            this.f70483e = stringSource;
            this.f70484f = i;
            this.f70485g = color;
        }
    }

    /* renamed from: pk0.a$e */
    public static abstract class C27573e extends C27551a {

        /* renamed from: j */
        public static final C27577d f70488j = new C27577d((DefaultConstructorMarker) null);

        /* renamed from: e */
        private final StringSource f70489e;

        /* renamed from: f */
        private final Color f70490f;

        /* renamed from: g */
        private final int f70491g;

        /* renamed from: h */
        private final Color f70492h;

        /* renamed from: i */
        private final String f70493i;

        /* renamed from: pk0.a$e$a */
        public static final class C27574a extends C27573e {

            /* renamed from: k */
            public static final C27574a f70494k = new C27574a();

            private C27574a() {
                super(C34646b.m101748b("text.hub.item.bog.business", new Object[0]), (Color) null, C27028d.icon_bog_business, (Color) null, "ge.bog.businessbank", 10, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$e$b */
        public static final class C27575b extends C27573e {

            /* renamed from: k */
            public static final C27575b f70495k = new C27575b();

            private C27575b() {
                super(C34646b.m101748b("text.hub.item.bog.pay", new Object[0]), (Color) null, C27028d.icon_bog_pay, (Color) null, "ge.bog.bogpay", 10, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$e$c */
        public static final class C27576c extends C27573e {

            /* renamed from: k */
            public static final C27576c f70496k = new C27576c();

            private C27576c() {
                super(C34646b.m101748b("text.hub.item.bog.scool", new Object[0]), (Color) null, C27028d.icon_bog_scool, (Color) null, "ge.bog.mbankjunior", 10, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$e$d */
        public static final class C27577d {
            private C27577d() {
            }

            public /* synthetic */ C27577d(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ C27573e(StringSource stringSource, Color color, int i, Color color2, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, color, i, color2, str);
        }

        /* renamed from: a */
        public Color mo66930a() {
            return this.f70492h;
        }

        /* renamed from: b */
        public int mo66931b() {
            return this.f70491g;
        }

        /* renamed from: d */
        public StringSource mo66932d() {
            return this.f70489e;
        }

        /* renamed from: e */
        public Color mo66926e() {
            return this.f70490f;
        }

        /* renamed from: i */
        public final String mo66936i() {
            return this.f70493i;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27573e(StringSource stringSource, Color color, int i, Color color2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, (i2 & 2) != 0 ? null : color, i, (i2 & 8) != 0 ? null : color2, str, (DefaultConstructorMarker) null);
        }

        private C27573e(StringSource stringSource, Color color, int i, Color color2, String str) {
            super((DefaultConstructorMarker) null);
            this.f70489e = stringSource;
            this.f70490f = color;
            this.f70491g = i;
            this.f70492h = color2;
            this.f70493i = str;
        }
    }

    /* renamed from: pk0.a$f */
    public static abstract class C27578f extends C27551a {

        /* renamed from: e */
        private final StringSource f70497e;

        /* renamed from: f */
        private final int f70498f;

        /* renamed from: g */
        private final Color f70499g;

        /* renamed from: h */
        private final Integer f70500h;

        /* renamed from: pk0.a$f$a */
        public static final class C27579a extends C27578f {

            /* renamed from: i */
            public static final C27579a f70501i = new C27579a();

            private C27579a() {
                super(C34646b.m101748b("text.hub.item.automatic.services", new Object[0]), C27028d.f67870a0, (Color) null, (Integer) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$f$b */
        public static final class C27580b extends C27578f {

            /* renamed from: i */
            public static final C27580b f70502i = new C27580b();

            private C27580b() {
                super(C34646b.m101748b("text.hub.item.money.request", new Object[0]), C27028d.icons_24_payment_transfer_money_request, (Color) null, Integer.valueOf(C27028d.f67871b), 4, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$f$c */
        public static final class C27581c extends C27578f {

            /* renamed from: i */
            public static final C27581c f70503i = new C27581c();

            private C27581c() {
                super(C34646b.m101748b("text.p2p.payment.topup.title", new Object[0]), C27028d.f67875j0, (Color) null, Integer.valueOf(C27028d.f67869a), 4, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$f$d */
        public static final class C27582d extends C27578f {

            /* renamed from: i */
            public static final C27582d f70504i = new C27582d();

            private C27582d() {
                super(C34646b.m101748b("text.hub.item.payments", new Object[0]), C27028d.icons_24_payment, (Color) null, (Integer) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$f$e */
        public static final class C27583e extends C27578f {

            /* renamed from: i */
            public static final C27583e f70505i = new C27583e();

            private C27583e() {
                super(C34646b.m101748b("text.hub.item.receive.remittance", new Object[0]), C27028d.icons_24_payment_transfer_money_transfer, (Color) null, (Integer) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: pk0.a$f$f */
        public static final class C27584f extends C27578f {

            /* renamed from: i */
            public static final C27584f f70506i = new C27584f();

            private C27584f() {
                super(C34646b.m101748b("text.hub.item.transfers", new Object[0]), C27028d.icons_24_payment_transfer_transfer_other_fill, (Color) null, (Integer) null, 12, (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C27578f(StringSource stringSource, int i, Color color, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, color, num);
        }

        /* renamed from: a */
        public Color mo66930a() {
            return this.f70499g;
        }

        /* renamed from: b */
        public int mo66931b() {
            return this.f70498f;
        }

        /* renamed from: d */
        public StringSource mo66932d() {
            return this.f70497e;
        }

        /* renamed from: f */
        public Integer mo66927f() {
            return this.f70500h;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27578f(StringSource stringSource, int i, Color color, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringSource, i, (i2 & 4) != 0 ? C18358g.m62727a(C27025a.f67849c) : color, (i2 & 8) != 0 ? null : num, (DefaultConstructorMarker) null);
        }

        private C27578f(StringSource stringSource, int i, Color color, Integer num) {
            super((DefaultConstructorMarker) null);
            this.f70497e = stringSource;
            this.f70498f = i;
            this.f70499g = color;
            this.f70500h = num;
        }
    }

    public /* synthetic */ C27551a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: c */
    public List mo66925c() {
        return C40141a.C40142a.m116276a(this);
    }

    /* renamed from: e */
    public Color mo66926e() {
        return this.f70458b;
    }

    /* renamed from: f */
    public Integer mo66927f() {
        return this.f70459c;
    }

    /* renamed from: g */
    public final CharSequence mo66928g(String str, Context context, int i) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(context, "context");
        Drawable e = C0767a.m2895e(context, i);
        if (e == null) {
            return str;
        }
        int dimension = (int) context.getResources().getDimension(C27027c.small_icon);
        e.setBounds(0, 0, dimension, dimension);
        e.setTint(C0767a.m2893c(context, C27026b.f67852c));
        ImageSpan imageSpan = new ImageSpan(e, 1);
        SpannableString spannableString = new SpannableString(str + "   ");
        spannableString.setSpan(imageSpan, spannableString.length() + -2, spannableString.length() - 1, 33);
        return spannableString;
    }

    /* renamed from: h */
    public boolean mo66929h() {
        return this.f70457a;
    }

    private C27551a() {
        this.f70457a = true;
        this.f70458b = C18358g.m62729c(C27026b.f67853d);
    }
}
