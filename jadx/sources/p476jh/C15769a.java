package p476jh;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.widget.C1305j;
import androidx.core.widget.C1314o;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.C41545u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045d.C5769a;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.thumbnailiconbadge.ThumbnailIconBadgeView;
import p341ge.bog.designsystem.components.verifiedbadge.VerifiedBadgeView;
import p352ak.C10003r1;
import p352ak.C10010s1;
import p352ak.C10017t1;
import p352ak.C10024u1;
import p352ak.C10031v1;
import p352ak.C10038w1;
import p352ak.C10045x1;
import p352ak.C10051y0;
import p352ak.C10052y1;
import p352ak.C10058z0;
import p352ak.C10062z4;
import p352ak.C9867a;
import p352ak.C9869a1;
import p352ak.C9877b1;
import p352ak.C9885c1;
import p352ak.C9893d1;
import p352ak.C9901e1;
import p352ak.C9909f1;
import p352ak.C9917g1;
import p352ak.C9925h1;
import p352ak.C9933i1;
import p352ak.C9941j1;
import p352ak.C9943j3;
import p352ak.C9949k1;
import p352ak.C9957l1;
import p352ak.C9965m1;
import p352ak.C9989p1;
import p352ak.C9996q1;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p642vh.C18352d;
import p642vh.C18355e0;
import p642vh.C18357f0;
import p642vh.C18359g0;
import p642vh.C18361h0;
import p642vh.C18363i0;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18376o;
import p642vh.C18381t;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: jh.a */
public abstract class C15769a {

    /* renamed from: a */
    private int f44728a;

    /* renamed from: b */
    private int f44729b;

    /* renamed from: c */
    private int f44730c;

    /* renamed from: d */
    private final C6201a f44731d;

    /* renamed from: jh.a$a */
    public static class C15770a extends C15769a {

        /* renamed from: t */
        static final /* synthetic */ C40303i[] f44732t;

        /* renamed from: e */
        private final C18361h0 f44733e = new C18361h0(C15775e.f44752d);

        /* renamed from: f */
        private ImageView f44734f;

        /* renamed from: g */
        private final C18355e0 f44735g;

        /* renamed from: h */
        private final C18361h0 f44736h;

        /* renamed from: i */
        private final C18363i0 f44737i;

        /* renamed from: j */
        private final C18361h0 f44738j;

        /* renamed from: k */
        private final C18361h0 f44739k;

        /* renamed from: l */
        private final C18361h0 f44740l;

        /* renamed from: m */
        private final ThumbnailIconBadgeView f44741m;

        /* renamed from: n */
        private final VerifiedBadgeView f44742n;

        /* renamed from: o */
        private final C18361h0 f44743o;

        /* renamed from: p */
        private final C18361h0 f44744p;

        /* renamed from: q */
        private final C18361h0 f44745q;

        /* renamed from: r */
        private final C18361h0 f44746r;

        /* renamed from: s */
        private final C18361h0 f44747s;

        /* renamed from: jh.a$a$a */
        static final class C15771a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15771a f44748d = new C15771a();

            C15771a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a$b */
        static final class C15772b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15772b f44749d = new C15772b();

            C15772b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a$c */
        static final class C15773c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15773c f44750d = new C15773c();

            C15773c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a$d */
        static final class C15774d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15774d f44751d = new C15774d();

            C15774d() {
                super(0);
            }

            public final Object invoke() {
                return "Close Action Thumbnail type doesn't support badge";
            }
        }

        /* renamed from: jh.a$a$e */
        static final class C15775e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15775e f44752d = new C15775e();

            C15775e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a$f */
        static final class C15776f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15776f f44753d = new C15776f();

            C15776f() {
                super(0);
            }

            public final Object invoke() {
                return "Close Action Thumbnail type does not support loader";
            }
        }

        /* renamed from: jh.a$a$g */
        static final class C15777g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15777g f44754d = new C15777g();

            C15777g() {
                super(0);
            }

            public final Object invoke() {
                return "Close Action Thumbnail type doesn't support text tint";
            }
        }

        /* renamed from: jh.a$a$h */
        static final class C15778h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15778h f44755d = new C15778h();

            C15778h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a$i */
        static final class C15779i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15779i f44756d = new C15779i();

            C15779i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a$j */
        static final class C15780j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15780j f44757d = new C15780j();

            C15780j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15770a> cls = C15770a.class;
            f44732t = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15770a(C10051y0 y0Var) {
            super(y0Var, C17779d.width_action_thumbnail_badge, 0, 0, 0, 0, 60, (DefaultConstructorMarker) null);
            C41536l.m120489i(y0Var, "binding");
            this.f44734f = y0Var.f27766g;
            AppCompatTextView appCompatTextView = y0Var.f27765f;
            C41536l.m120488h(appCompatTextView, "binding.buttonText");
            this.f44735g = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f44736h = new C18361h0(C15776f.f44753d);
            LayerView layerView = y0Var.f27767h;
            C41536l.m120488h(layerView, "binding.logoContainer");
            this.f44737i = new C18363i0(layerView);
            this.f44738j = new C18361h0(C15777g.f44754d);
            this.f44739k = new C18361h0(C15773c.f44750d);
            this.f44740l = new C18361h0(C15774d.f44751d);
            this.f44741m = y0Var.f27764e;
            this.f44742n = y0Var.f27768i;
            this.f44743o = new C18361h0(C15771a.f44748d);
            this.f44744p = new C18361h0(C15778h.f44755d);
            this.f44745q = new C18361h0(C15780j.f44757d);
            this.f44746r = new C18361h0(C15772b.f44749d);
            this.f44747s = new C18361h0(C15779i.f44756d);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            ((C2394j) C2379b.m9210t(mo43194l()).mo7751t(drawable).mo7222d()).mo7718L0(((C10051y0) mo43184b()).f27766g);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f44737i.setValue(this, f44732t[3], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f44733e.setValue(this, f44732t[0], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f44736h.setValue(this, f44732t[2], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f44735g.setValue(this, f44732t[1], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f44738j.setValue(this, f44732t[4], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f44744p.setValue(this, f44732t[8], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f44747s.setValue(this, f44732t[11], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f44745q.setValue(this, f44732t[9], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f44743o.getValue(this, f44732t[7]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f44739k.getValue(this, f44732t[5]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f44740l.getValue(this, f44732t[6]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return ((C10051y0) mo43184b()).f27766g.getDrawable();
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return this.f44737i.getValue(this, f44732t[3]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f44734f;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f44733e.getValue(this, f44732t[0]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f44736h.getValue(this, f44732t[2])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f44735g.getValue(this, f44732t[1]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f44738j.getValue(this, f44732t[4]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f44744p.getValue(this, f44732t[8])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f44747s.getValue(this, f44732t[11])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f44745q.getValue(this, f44732t[9]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return this.f44741m;
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return this.f44742n;
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f44743o.setValue(this, f44732t[7], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f44746r.setValue(this, f44732t[10], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f44739k.setValue(this, f44732t[5], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f44740l.setValue(this, f44732t[6], num);
        }
    }

    /* renamed from: jh.a$a0 */
    public static class C15781a0 extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f44758u;

        /* renamed from: e */
        private final C18355e0 f44759e;

        /* renamed from: f */
        private final C18361h0 f44760f = new C18361h0(C15786e.f44779d);

        /* renamed from: g */
        private ImageView f44761g;

        /* renamed from: h */
        private final C18361h0 f44762h = new C18361h0(C15788g.f44781d);

        /* renamed from: i */
        private final C18361h0 f44763i = new C18361h0(C15784c.f44777d);

        /* renamed from: j */
        private final C18361h0 f44764j = new C18361h0(C15785d.f44778d);

        /* renamed from: k */
        private final C18361h0 f44765k = new C18361h0(C15789h.f44782d);

        /* renamed from: l */
        private final C18361h0 f44766l = new C18361h0(C15791j.f44784d);

        /* renamed from: m */
        private final C18361h0 f44767m = new C18361h0(C15787f.f44780d);

        /* renamed from: n */
        private final C18361h0 f44768n = new C18361h0(C15790i.f44783d);

        /* renamed from: o */
        private final C18361h0 f44769o = new C18361h0(C15782a.f44775d);

        /* renamed from: p */
        private final C18361h0 f44770p = new C18361h0(C15794m.f44787d);

        /* renamed from: q */
        private final C18361h0 f44771q = new C18361h0(C15795n.f44788d);

        /* renamed from: r */
        private final C18361h0 f44772r = new C18361h0(C15793l.f44786d);

        /* renamed from: s */
        private final C18361h0 f44773s = new C18361h0(C15783b.f44776d);

        /* renamed from: t */
        private final C18361h0 f44774t = new C18361h0(C15792k.f44785d);

        /* renamed from: jh.a$a0$a */
        static final class C15782a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15782a f44775d = new C15782a();

            C15782a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a0$b */
        static final class C15783b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15783b f44776d = new C15783b();

            C15783b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a0$c */
        static final class C15784c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15784c f44777d = new C15784c();

            C15784c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a0$d */
        static final class C15785d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15785d f44778d = new C15785d();

            C15785d() {
                super(0);
            }

            public final Object invoke() {
                return "SmallBorder type button doesn't support badge";
            }
        }

        /* renamed from: jh.a$a0$e */
        static final class C15786e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15786e f44779d = new C15786e();

            C15786e() {
                super(0);
            }

            public final Object invoke() {
                return "SmallBorder type not supports icon";
            }
        }

        /* renamed from: jh.a$a0$f */
        static final class C15787f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15787f f44780d = new C15787f();

            C15787f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a0$g */
        static final class C15788g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15788g f44781d = new C15788g();

            C15788g() {
                super(0);
            }

            public final Object invoke() {
                return "SmallBorder type not supports icon";
            }
        }

        /* renamed from: jh.a$a0$h */
        static final class C15789h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15789h f44782d = new C15789h();

            C15789h() {
                super(0);
            }

            public final Object invoke() {
                return "SmallBorder type not supports loader";
            }
        }

        /* renamed from: jh.a$a0$i */
        static final class C15790i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15790i f44783d = new C15790i();

            C15790i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a0$j */
        static final class C15791j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15791j f44784d = new C15791j();

            C15791j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a0$k */
        static final class C15792k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15792k f44785d = new C15792k();

            C15792k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a0$l */
        static final class C15793l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15793l f44786d = new C15793l();

            C15793l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a0$m */
        static final class C15794m extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15794m f44787d = new C15794m();

            C15794m() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$a0$n */
        static final class C15795n extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15795n f44788d = new C15795n();

            C15795n() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15781a0> cls = C15781a0.class;
            f44758u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C15781a0(p352ak.C10010s1 r17) {
            /*
                r16 = this;
                r9 = r16
                r10 = r17
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                int r4 = p601sg.C17779d.width_min_button_small
                int r3 = p601sg.C17779d.height_button_small
                int r5 = p601sg.C17780e.selector_button_small_border
                int r6 = p601sg.C17786k.f49833r
                r2 = 0
                r7 = 2
                r8 = 0
                r0 = r16
                r1 = r17
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                vh.e0 r0 = new vh.e0
                androidx.appcompat.widget.AppCompatTextView r11 = r10.f27494e
                java.lang.String r1 = "binding.textView"
                kotlin.jvm.internal.C41536l.m120488h(r11, r1)
                r12 = 0
                r13 = 0
                r14 = 6
                r15 = 0
                r10 = r0
                r10.<init>(r11, r12, r13, r14, r15)
                r9.f44759e = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$e r1 = p476jh.C15769a.C15781a0.C15786e.f44779d
                r0.<init>(r1)
                r9.f44760f = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$g r1 = p476jh.C15769a.C15781a0.C15788g.f44781d
                r0.<init>(r1)
                r9.f44762h = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$c r1 = p476jh.C15769a.C15781a0.C15784c.f44777d
                r0.<init>(r1)
                r9.f44763i = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$d r1 = p476jh.C15769a.C15781a0.C15785d.f44778d
                r0.<init>(r1)
                r9.f44764j = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$h r1 = p476jh.C15769a.C15781a0.C15789h.f44782d
                r0.<init>(r1)
                r9.f44765k = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$j r1 = p476jh.C15769a.C15781a0.C15791j.f44784d
                r0.<init>(r1)
                r9.f44766l = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$f r1 = p476jh.C15769a.C15781a0.C15787f.f44780d
                r0.<init>(r1)
                r9.f44767m = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$i r1 = p476jh.C15769a.C15781a0.C15790i.f44783d
                r0.<init>(r1)
                r9.f44768n = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$a r1 = p476jh.C15769a.C15781a0.C15782a.f44775d
                r0.<init>(r1)
                r9.f44769o = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$m r1 = p476jh.C15769a.C15781a0.C15794m.f44787d
                r0.<init>(r1)
                r9.f44770p = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$n r1 = p476jh.C15769a.C15781a0.C15795n.f44788d
                r0.<init>(r1)
                r9.f44771q = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$l r1 = p476jh.C15769a.C15781a0.C15793l.f44786d
                r0.<init>(r1)
                r9.f44772r = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$b r1 = p476jh.C15769a.C15781a0.C15783b.f44776d
                r0.<init>(r1)
                r9.f44773s = r0
                vh.h0 r0 = new vh.h0
                jh.a$a0$k r1 = p476jh.C15769a.C15781a0.C15792k.f44785d
                r0.<init>(r1)
                r9.f44774t = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p476jh.C15769a.C15781a0.<init>(ak.s1):void");
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f44760f.setValue(this, f44758u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f44767m.setValue(this, f44758u[7], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f44762h.setValue(this, f44758u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f44765k.setValue(this, f44758u[5], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f44759e.setValue(this, f44758u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f44768n.setValue(this, f44758u[8], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f44766l.setValue(this, f44758u[6], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f44774t.setValue(this, f44758u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f44772r.setValue(this, f44758u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f44769o.getValue(this, f44758u[9]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f44763i.getValue(this, f44758u[3]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f44764j.getValue(this, f44758u[4]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return (Drawable) this.f44760f.getValue(this, f44758u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f44767m.getValue(this, f44758u[7]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f44761g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f44762h.getValue(this, f44758u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f44765k.getValue(this, f44758u[5])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f44759e.getValue(this, f44758u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f44768n.getValue(this, f44758u[8]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f44766l.getValue(this, f44758u[6])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f44774t.getValue(this, f44758u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f44772r.getValue(this, f44758u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f44770p.getValue(this, f44758u[10]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f44771q.getValue(this, f44758u[11]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C10010s1) mo43184b()).f27494e, C17786k.TextButton2White500Left);
            } else {
                C1314o.m4575q(((C10010s1) mo43184b()).f27494e, C17786k.TextButton2White200Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f44769o.setValue(this, f44758u[9], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f44773s.setValue(this, f44758u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f44763i.setValue(this, f44758u[3], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f44764j.setValue(this, f44758u[4], num);
        }
    }

    /* renamed from: jh.a$b */
    public static class C15796b extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f44789u;

        /* renamed from: e */
        private final C18355e0 f44790e;

        /* renamed from: f */
        private final C18376o f44791f;

        /* renamed from: g */
        private ImageView f44792g;

        /* renamed from: h */
        private final C18361h0 f44793h = new C18361h0(C15807k.f44816d);

        /* renamed from: i */
        private final C18361h0 f44794i = new C18361h0(C15808l.f44817d);

        /* renamed from: j */
        private final C18381t f44795j;

        /* renamed from: k */
        private final C18361h0 f44796k;

        /* renamed from: l */
        private final C18361h0 f44797l;

        /* renamed from: m */
        private final C18361h0 f44798m;

        /* renamed from: n */
        private final C18361h0 f44799n;

        /* renamed from: o */
        private final C18361h0 f44800o;

        /* renamed from: p */
        private final C18361h0 f44801p;

        /* renamed from: q */
        private final C18361h0 f44802q;

        /* renamed from: r */
        private final C18361h0 f44803r;

        /* renamed from: s */
        private final C18361h0 f44804s;

        /* renamed from: t */
        private final C18361h0 f44805t;

        /* renamed from: jh.a$b$a */
        static final class C15797a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15797a f44806d = new C15797a();

            C15797a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b$b */
        static final class C15798b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15798b f44807d = new C15798b();

            C15798b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b$c */
        static final class C15799c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15799c f44808d = new C15799c();

            C15799c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b$d */
        static final class C15800d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15800d f44809d = new C15800d();

            C15800d() {
                super(0);
            }

            public final Object invoke() {
                return "Card Action type doesn't support badge";
            }
        }

        /* renamed from: jh.a$b$e */
        static final class C15801e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15801e f44810d = new C15801e();

            C15801e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b$f */
        static final class C15802f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15802f f44811d = new C15802f();

            C15802f() {
                super(0);
            }

            public final Object invoke() {
                return "Card Action type doesn't support loader";
            }
        }

        /* renamed from: jh.a$b$g */
        static final class C15803g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15803g f44812d = new C15803g();

            C15803g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b$h */
        static final class C15804h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15804h f44813d = new C15804h();

            C15804h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b$i */
        static final class C15805i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15805i f44814d = new C15805i();

            C15805i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b$j */
        static final class C15806j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15806j f44815d = new C15806j();

            C15806j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b$k */
        static final class C15807k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15807k f44816d = new C15807k();

            C15807k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b$l */
        static final class C15808l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15808l f44817d = new C15808l();

            C15808l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15796b> cls = C15796b.class;
            f44789u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15796b(C9893d1 d1Var) {
            super(d1Var, C17779d.width_button_card_action_layer, 0, 0, 0, 0, 12, (DefaultConstructorMarker) null);
            C9893d1 d1Var2 = d1Var;
            C41536l.m120489i(d1Var2, "binding");
            AppCompatTextView appCompatTextView = d1Var2.f26880f;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f44790e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView = d1Var2.f26879e;
            C41536l.m120488h(appCompatImageView, "binding.buttonIconImage");
            this.f44791f = new C18376o(appCompatImageView);
            this.f44792g = d1Var2.f26879e;
            AppCompatImageView appCompatImageView2 = d1Var2.f26879e;
            C41536l.m120488h(appCompatImageView2, "binding.buttonIconImage");
            this.f44795j = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            this.f44796k = new C18361h0(C15801e.f44810d);
            this.f44797l = new C18361h0(C15803g.f44812d);
            this.f44798m = new C18361h0(C15802f.f44811d);
            this.f44799n = new C18361h0(C15799c.f44808d);
            this.f44800o = new C18361h0(C15800d.f44809d);
            this.f44801p = new C18361h0(C15797a.f44806d);
            this.f44802q = new C18361h0(C15804h.f44813d);
            this.f44803r = new C18361h0(C15806j.f44815d);
            this.f44804s = new C18361h0(C15798b.f44807d);
            this.f44805t = new C18361h0(C15805i.f44814d);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f44791f.setValue(this, f44789u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f44796k.setValue(this, f44789u[5], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f44795j.setValue(this, f44789u[4], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f44798m.setValue(this, f44789u[7], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f44790e.setValue(this, f44789u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f44797l.setValue(this, f44789u[6], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f44802q.setValue(this, f44789u[11], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f44805t.setValue(this, f44789u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f44803r.setValue(this, f44789u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f44801p.getValue(this, f44789u[10]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f44799n.getValue(this, f44789u[8]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f44800o.getValue(this, f44789u[9]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f44791f.getValue(this, f44789u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f44796k.getValue(this, f44789u[5]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f44792g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f44795j.getValue(this, f44789u[4]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f44798m.getValue(this, f44789u[7])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f44790e.getValue(this, f44789u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f44797l.getValue(this, f44789u[6]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f44802q.getValue(this, f44789u[11])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f44805t.getValue(this, f44789u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f44803r.getValue(this, f44789u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f44793h.getValue(this, f44789u[2]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f44794i.getValue(this, f44789u[3]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f44801p.setValue(this, f44789u[10], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f44804s.setValue(this, f44789u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f44799n.setValue(this, f44789u[8], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f44800o.setValue(this, f44789u[9], num);
        }
    }

    /* renamed from: jh.a$b0 */
    public static class C15809b0 extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f44818u;

        /* renamed from: e */
        private final C18355e0 f44819e;

        /* renamed from: f */
        private final C18361h0 f44820f = new C18361h0(C15813d.f44838d);

        /* renamed from: g */
        private ImageView f44821g;

        /* renamed from: h */
        private final C18361h0 f44822h = new C18361h0(C15815f.f44840d);

        /* renamed from: i */
        private final C18361h0 f44823i = new C18361h0(C15811b.f44836d);

        /* renamed from: j */
        private final C18361h0 f44824j = new C18361h0(C15812c.f44837d);

        /* renamed from: k */
        private final C18361h0 f44825k = new C18361h0(C15816g.f44841d);

        /* renamed from: l */
        private final C18361h0 f44826l = new C18361h0(C15814e.f44839d);

        /* renamed from: m */
        private final C18361h0 f44827m = new C18361h0(C15817h.f44842d);

        /* renamed from: n */
        private final C18361h0 f44828n = new C18361h0(C15821l.f44846d);

        /* renamed from: o */
        private final C18361h0 f44829o = new C18361h0(C15822m.f44847d);

        /* renamed from: p */
        private final C18361h0 f44830p = new C18361h0(C15818i.f44843d);

        /* renamed from: q */
        private final C18352d f44831q = new C18352d(mo43197o());

        /* renamed from: r */
        private final C18361h0 f44832r = new C18361h0(C15820k.f44845d);

        /* renamed from: s */
        private final C18361h0 f44833s = new C18361h0(C15810a.f44835d);

        /* renamed from: t */
        private final C18361h0 f44834t = new C18361h0(C15819j.f44844d);

        /* renamed from: jh.a$b0$a */
        static final class C15810a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15810a f44835d = new C15810a();

            C15810a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b0$b */
        static final class C15811b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15811b f44836d = new C15811b();

            C15811b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b0$c */
        static final class C15812c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15812c f44837d = new C15812c();

            C15812c() {
                super(0);
            }

            public final Object invoke() {
                return "SmallText type doesn't support badge";
            }
        }

        /* renamed from: jh.a$b0$d */
        static final class C15813d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15813d f44838d = new C15813d();

            C15813d() {
                super(0);
            }

            public final Object invoke() {
                return "SmallText type not supports icon";
            }
        }

        /* renamed from: jh.a$b0$e */
        static final class C15814e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15814e f44839d = new C15814e();

            C15814e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b0$f */
        static final class C15815f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15815f f44840d = new C15815f();

            C15815f() {
                super(0);
            }

            public final Object invoke() {
                return "SmallText type not supports icon";
            }
        }

        /* renamed from: jh.a$b0$g */
        static final class C15816g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15816g f44841d = new C15816g();

            C15816g() {
                super(0);
            }

            public final Object invoke() {
                return "SmallText type not supports loader";
            }
        }

        /* renamed from: jh.a$b0$h */
        static final class C15817h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15817h f44842d = new C15817h();

            C15817h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b0$i */
        static final class C15818i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15818i f44843d = new C15818i();

            C15818i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b0$j */
        static final class C15819j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15819j f44844d = new C15819j();

            C15819j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b0$k */
        static final class C15820k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15820k f44845d = new C15820k();

            C15820k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b0$l */
        static final class C15821l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15821l f44846d = new C15821l();

            C15821l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$b0$m */
        static final class C15822m extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15822m f44847d = new C15822m();

            C15822m() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15809b0> cls = C15809b0.class;
            f44818u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15809b0(C10038w1 w1Var) {
            super(w1Var, 0, C17779d.height_button_small_junior, 0, C17780e.selector_button_small_junior, C17786k.LayerRadius8Shadow0, 10, (DefaultConstructorMarker) null);
            C10038w1 w1Var2 = w1Var;
            C41536l.m120489i(w1Var2, "binding");
            AppCompatTextView appCompatTextView = w1Var2.f27689e;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f44819e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f44820f.setValue(this, f44818u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f44826l.setValue(this, f44818u[6], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f44822h.setValue(this, f44818u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f44825k.setValue(this, f44818u[5], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f44819e.setValue(this, f44818u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f44827m.setValue(this, f44818u[7], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f44830p.setValue(this, f44818u[10], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f44834t.setValue(this, f44818u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f44832r.setValue(this, f44818u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return this.f44831q.getValue(this, f44818u[11]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f44823i.getValue(this, f44818u[3]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f44824j.getValue(this, f44818u[4]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return (Drawable) this.f44820f.getValue(this, f44818u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f44826l.getValue(this, f44818u[6]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f44821g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f44822h.getValue(this, f44818u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f44825k.getValue(this, f44818u[5])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f44819e.getValue(this, f44818u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f44827m.getValue(this, f44818u[7]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f44830p.getValue(this, f44818u[10])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f44834t.getValue(this, f44818u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f44832r.getValue(this, f44818u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f44828n.getValue(this, f44818u[8]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f44829o.getValue(this, f44818u[9]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                ((C10038w1) mo43184b()).f27689e.setTextColor(C18368l.m62755d(mo43194l(), C17777b.f49590A));
            } else {
                ((C10038w1) mo43184b()).f27689e.setTextColor(C18368l.m62755d(mo43194l(), C17777b.color_white_tr_150));
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f44831q.setValue(this, f44818u[11], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f44833s.setValue(this, f44818u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f44823i.setValue(this, f44818u[3], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f44824j.setValue(this, f44818u[4], num);
        }
    }

    /* renamed from: jh.a$c */
    public static class C15823c extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f44848u;

        /* renamed from: e */
        private final C18355e0 f44849e;

        /* renamed from: f */
        private final C18361h0 f44850f = new C18361h0(C15827d.f44868d);

        /* renamed from: g */
        private ImageView f44851g;

        /* renamed from: h */
        private final C18361h0 f44852h = new C18361h0(C15828e.f44869d);

        /* renamed from: i */
        private final C18363i0 f44853i;

        /* renamed from: j */
        private final C18361h0 f44854j;

        /* renamed from: k */
        private final C18361h0 f44855k;

        /* renamed from: l */
        private final C18355e0 f44856l;

        /* renamed from: m */
        private final C18361h0 f44857m;

        /* renamed from: n */
        private final C18361h0 f44858n;

        /* renamed from: o */
        private final C18361h0 f44859o;

        /* renamed from: p */
        private final C18361h0 f44860p;

        /* renamed from: q */
        private final C18361h0 f44861q;

        /* renamed from: r */
        private final C18361h0 f44862r;

        /* renamed from: s */
        private final C18361h0 f44863s;

        /* renamed from: t */
        private final C18361h0 f44864t;

        /* renamed from: jh.a$c$a */
        static final class C15824a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15824a f44865d = new C15824a();

            C15824a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c$b */
        static final class C15825b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15825b f44866d = new C15825b();

            C15825b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c$c */
        static final class C15826c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15826c f44867d = new C15826c();

            C15826c() {
                super(0);
            }

            public final Object invoke() {
                return "Action Digit type doesn't support badge";
            }
        }

        /* renamed from: jh.a$c$d */
        static final class C15827d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15827d f44868d = new C15827d();

            C15827d() {
                super(0);
            }

            public final Object invoke() {
                return "Action Digit type doesn't support icon";
            }
        }

        /* renamed from: jh.a$c$e */
        static final class C15828e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15828e f44869d = new C15828e();

            C15828e() {
                super(0);
            }

            public final Object invoke() {
                return "Action Digit type doesn't support icon tint";
            }
        }

        /* renamed from: jh.a$c$f */
        static final class C15829f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15829f f44870d = new C15829f();

            C15829f() {
                super(0);
            }

            public final Object invoke() {
                return "Action Digit type doesn't support loader";
            }
        }

        /* renamed from: jh.a$c$g */
        static final class C15830g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15830g f44871d = new C15830g();

            C15830g() {
                super(0);
            }

            public final Object invoke() {
                return "Action Digit type doesn't support text tint";
            }
        }

        /* renamed from: jh.a$c$h */
        static final class C15831h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15831h f44872d = new C15831h();

            C15831h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c$i */
        static final class C15832i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15832i f44873d = new C15832i();

            C15832i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c$j */
        static final class C15833j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15833j f44874d = new C15833j();

            C15833j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c$k */
        static final class C15834k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15834k f44875d = new C15834k();

            C15834k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c$l */
        static final class C15835l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15835l f44876d = new C15835l();

            C15835l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15823c> cls = C15823c.class;
            f44848u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15823c(C9869a1 a1Var) {
            super(a1Var, C17779d.width_action_digit_button, 0, 0, 0, 0, 60, (DefaultConstructorMarker) null);
            C9869a1 a1Var2 = a1Var;
            C41536l.m120489i(a1Var2, "binding");
            AppCompatTextView appCompatTextView = a1Var2.f26739g;
            C41536l.m120488h(appCompatTextView, "binding.buttonText");
            this.f44849e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            LayerView layerView = a1Var2.f26737e;
            C41536l.m120488h(layerView, "binding.amountLayer");
            this.f44853i = new C18363i0(layerView);
            this.f44854j = new C18361h0(C15830g.f44871d);
            this.f44855k = new C18361h0(C15829f.f44870d);
            AppCompatTextView appCompatTextView2 = a1Var2.f26738f;
            C41536l.m120488h(appCompatTextView2, "binding.amountText");
            this.f44856l = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f44857m = new C18361h0(C15826c.f44867d);
            this.f44858n = new C18361h0(C15824a.f44865d);
            this.f44859o = new C18361h0(C15834k.f44875d);
            this.f44860p = new C18361h0(C15835l.f44876d);
            this.f44861q = new C18361h0(C15831h.f44872d);
            this.f44862r = new C18361h0(C15833j.f44874d);
            this.f44863s = new C18361h0(C15825b.f44866d);
            this.f44864t = new C18361h0(C15832i.f44873d);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f44850f.setValue(this, f44848u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f44853i.setValue(this, f44848u[3], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f44852h.setValue(this, f44848u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f44855k.setValue(this, f44848u[5], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f44849e.setValue(this, f44848u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f44854j.setValue(this, f44848u[4], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f44861q.setValue(this, f44848u[11], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f44864t.setValue(this, f44848u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f44862r.setValue(this, f44848u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f44858n.getValue(this, f44848u[8]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return this.f44856l.getValue(this, f44848u[6]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f44857m.getValue(this, f44848u[7]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return (Drawable) this.f44850f.getValue(this, f44848u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return this.f44853i.getValue(this, f44848u[3]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f44851g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f44852h.getValue(this, f44848u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f44855k.getValue(this, f44848u[5])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f44849e.getValue(this, f44848u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f44854j.getValue(this, f44848u[4]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f44861q.getValue(this, f44848u[11])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f44864t.getValue(this, f44848u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f44862r.getValue(this, f44848u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f44859o.getValue(this, f44848u[9]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f44860p.getValue(this, f44848u[10]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C9869a1) mo43184b()).f26738f, C17786k.TextSmallButtonPrimary500Left);
            } else {
                C1314o.m4575q(((C9869a1) mo43184b()).f26738f, C17786k.TextSmallButtonPrimary200Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f44858n.setValue(this, f44848u[8], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f44863s.setValue(this, f44848u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f44856l.setValue(this, f44848u[6], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f44857m.setValue(this, f44848u[7], num);
        }
    }

    /* renamed from: jh.a$c0 */
    public static class C15836c0 extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f44877u;

        /* renamed from: e */
        private final C18355e0 f44878e;

        /* renamed from: f */
        private final C18376o f44879f;

        /* renamed from: g */
        private ImageView f44880g;

        /* renamed from: h */
        private final C18381t f44881h;

        /* renamed from: i */
        private final C18361h0 f44882i = new C18361h0(C15842f.f44899d);

        /* renamed from: j */
        private final C18361h0 f44883j = new C18361h0(C15841e.f44898d);

        /* renamed from: k */
        private final C18361h0 f44884k = new C18361h0(C15843g.f44900d);

        /* renamed from: l */
        private final C18361h0 f44885l = new C18361h0(C15839c.f44896d);

        /* renamed from: m */
        private final C18361h0 f44886m = new C18361h0(C15840d.f44897d);

        /* renamed from: n */
        private final C18361h0 f44887n = new C18361h0(C15837a.f44894d);

        /* renamed from: o */
        private final C18361h0 f44888o = new C18361h0(C15847k.f44904d);

        /* renamed from: p */
        private final C18361h0 f44889p = new C18361h0(C15848l.f44905d);

        /* renamed from: q */
        private final C18361h0 f44890q = new C18361h0(C15844h.f44901d);

        /* renamed from: r */
        private final C18361h0 f44891r = new C18361h0(C15846j.f44903d);

        /* renamed from: s */
        private final C18361h0 f44892s = new C18361h0(C15838b.f44895d);

        /* renamed from: t */
        private final C18361h0 f44893t = new C18361h0(C15845i.f44902d);

        /* renamed from: jh.a$c0$a */
        static final class C15837a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15837a f44894d = new C15837a();

            C15837a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c0$b */
        static final class C15838b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15838b f44895d = new C15838b();

            C15838b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c0$c */
        static final class C15839c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15839c f44896d = new C15839c();

            C15839c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c0$d */
        static final class C15840d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15840d f44897d = new C15840d();

            C15840d() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c0$e */
        static final class C15841e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15841e f44898d = new C15841e();

            C15841e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c0$f */
        static final class C15842f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15842f f44899d = new C15842f();

            C15842f() {
                super(0);
            }

            public final Object invoke() {
                return "SmallIconText type not supports loader";
            }
        }

        /* renamed from: jh.a$c0$g */
        static final class C15843g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15843g f44900d = new C15843g();

            C15843g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c0$h */
        static final class C15844h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15844h f44901d = new C15844h();

            C15844h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c0$i */
        static final class C15845i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15845i f44902d = new C15845i();

            C15845i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c0$j */
        static final class C15846j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15846j f44903d = new C15846j();

            C15846j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c0$k */
        static final class C15847k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15847k f44904d = new C15847k();

            C15847k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$c0$l */
        static final class C15848l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15848l f44905d = new C15848l();

            C15848l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15836c0> cls = C15836c0.class;
            f44877u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15836c0(C10024u1 u1Var) {
            super(u1Var, 0, C17779d.height_button_small, 0, C17780e.selector_button_small, C17786k.f49833r, 10, (DefaultConstructorMarker) null);
            C10024u1 u1Var2 = u1Var;
            C41536l.m120489i(u1Var2, "binding");
            AppCompatTextView appCompatTextView = u1Var2.f27609f;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f44878e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView = u1Var2.f27608e;
            C41536l.m120488h(appCompatImageView, "binding.iconView");
            this.f44879f = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = u1Var2.f27608e;
            this.f44880g = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.iconView");
            this.f44881h = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView3 = u1Var2.f27608e;
            appCompatImageView3.setVisibility(0);
            mo43176C(C5769a.m23209a(appCompatImageView3.getContext(), C17778c.selector_button_small_icon));
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f44879f.setValue(this, f44877u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f44883j.setValue(this, f44877u[4], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f44881h.setValue(this, f44877u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f44882i.setValue(this, f44877u[3], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f44878e.setValue(this, f44877u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f44884k.setValue(this, f44877u[5], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f44890q.setValue(this, f44877u[11], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f44893t.setValue(this, f44877u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f44891r.setValue(this, f44877u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f44887n.getValue(this, f44877u[8]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f44885l.getValue(this, f44877u[6]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f44886m.getValue(this, f44877u[7]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f44879f.getValue(this, f44877u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f44883j.getValue(this, f44877u[4]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f44880g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f44881h.getValue(this, f44877u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f44882i.getValue(this, f44877u[3])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f44878e.getValue(this, f44877u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f44884k.getValue(this, f44877u[5]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f44890q.getValue(this, f44877u[11])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f44893t.getValue(this, f44877u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f44891r.getValue(this, f44877u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f44888o.getValue(this, f44877u[9]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f44889p.getValue(this, f44877u[10]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C10024u1) mo43184b()).f27609f, C17786k.TextButton2InvertComponents400Left);
            } else {
                C1314o.m4575q(((C10024u1) mo43184b()).f27609f, C17786k.TextButton2InvertComponents150Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f44887n.setValue(this, f44877u[8], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f44892s.setValue(this, f44877u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f44885l.setValue(this, f44877u[6], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f44886m.setValue(this, f44877u[7], num);
        }
    }

    /* renamed from: jh.a$d */
    public static class C15849d extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f44906u;

        /* renamed from: e */
        private final C18376o f44907e;

        /* renamed from: f */
        private final C18355e0 f44908f;

        /* renamed from: g */
        private ImageView f44909g;

        /* renamed from: h */
        private final C18381t f44910h;

        /* renamed from: i */
        private final C18361h0 f44911i = new C18361h0(C15858i.f44931d);

        /* renamed from: j */
        private final C18361h0 f44912j = new C18361h0(C15859j.f44932d);

        /* renamed from: k */
        private final C18363i0 f44913k;

        /* renamed from: l */
        private final C18361h0 f44914l;

        /* renamed from: m */
        private final C18361h0 f44915m;

        /* renamed from: n */
        private final C18355e0 f44916n;

        /* renamed from: o */
        private final C18361h0 f44917o;

        /* renamed from: p */
        private final C18361h0 f44918p;

        /* renamed from: q */
        private final C18361h0 f44919q;

        /* renamed from: r */
        private final C18361h0 f44920r;

        /* renamed from: s */
        private final C18361h0 f44921s;

        /* renamed from: t */
        private final C18361h0 f44922t;

        /* renamed from: jh.a$d$a */
        static final class C15850a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15850a f44923d = new C15850a();

            C15850a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d$b */
        static final class C15851b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15851b f44924d = new C15851b();

            C15851b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d$c */
        static final class C15852c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15852c f44925d = new C15852c();

            C15852c() {
                super(0);
            }

            public final Object invoke() {
                return "Action Logo type doesn't support badge";
            }
        }

        /* renamed from: jh.a$d$d */
        static final class C15853d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15853d f44926d = new C15853d();

            C15853d() {
                super(0);
            }

            public final Object invoke() {
                return "Action Logo type doesn't support loader";
            }
        }

        /* renamed from: jh.a$d$e */
        static final class C15854e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15854e f44927d = new C15854e();

            C15854e() {
                super(0);
            }

            public final Object invoke() {
                return "Action Logo type doesn't support text tint";
            }
        }

        /* renamed from: jh.a$d$f */
        static final class C15855f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15855f f44928d = new C15855f();

            C15855f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d$g */
        static final class C15856g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15856g f44929d = new C15856g();

            C15856g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d$h */
        static final class C15857h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15857h f44930d = new C15857h();

            C15857h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d$i */
        static final class C15858i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15858i f44931d = new C15858i();

            C15858i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d$j */
        static final class C15859j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15859j f44932d = new C15859j();

            C15859j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15849d> cls = C15849d.class;
            f44906u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15849d(C9877b1 b1Var) {
            super(b1Var, C17779d.width_action_icon, 0, 0, 0, 0, 60, (DefaultConstructorMarker) null);
            C41536l.m120489i(b1Var, "binding");
            AppCompatImageView appCompatImageView = b1Var.f26796h;
            C41536l.m120488h(appCompatImageView, "binding.image");
            this.f44907e = new C18376o(appCompatImageView);
            AppCompatTextView appCompatTextView = b1Var.f26794f;
            C41536l.m120488h(appCompatTextView, "binding.buttonText");
            this.f44908f = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView2 = b1Var.f26796h;
            this.f44909g = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.image");
            this.f44910h = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            LayerView layerView = b1Var.f26795g;
            C41536l.m120488h(layerView, "binding.iconLayerView");
            this.f44913k = new C18363i0(layerView);
            this.f44914l = new C18361h0(C15854e.f44927d);
            this.f44915m = new C18361h0(C15853d.f44926d);
            AppCompatTextView appCompatTextView2 = b1Var.f26793e;
            C41536l.m120488h(appCompatTextView2, "binding.amountText");
            this.f44916n = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f44917o = new C18361h0(C15852c.f44925d);
            this.f44918p = new C18361h0(C15850a.f44923d);
            this.f44919q = new C18361h0(C15855f.f44928d);
            this.f44920r = new C18361h0(C15857h.f44930d);
            this.f44921s = new C18361h0(C15851b.f44924d);
            this.f44922t = new C18361h0(C15856g.f44929d);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f44907e.setValue(this, f44906u[0], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f44913k.setValue(this, f44906u[5], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f44910h.setValue(this, f44906u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f44915m.setValue(this, f44906u[7], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f44908f.setValue(this, f44906u[1], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f44914l.setValue(this, f44906u[6], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f44919q.setValue(this, f44906u[11], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f44922t.setValue(this, f44906u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f44920r.setValue(this, f44906u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f44918p.getValue(this, f44906u[10]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return this.f44916n.getValue(this, f44906u[8]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f44917o.getValue(this, f44906u[9]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f44907e.getValue(this, f44906u[0]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return this.f44913k.getValue(this, f44906u[5]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f44909g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f44910h.getValue(this, f44906u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f44915m.getValue(this, f44906u[7])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f44908f.getValue(this, f44906u[1]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f44914l.getValue(this, f44906u[6]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f44919q.getValue(this, f44906u[11])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f44922t.getValue(this, f44906u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f44920r.getValue(this, f44906u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f44911i.getValue(this, f44906u[3]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f44912j.getValue(this, f44906u[4]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f44918p.setValue(this, f44906u[10], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f44921s.setValue(this, f44906u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f44916n.setValue(this, f44906u[8], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f44917o.setValue(this, f44906u[9], num);
        }
    }

    /* renamed from: jh.a$d0 */
    public static class C15860d0 extends C15769a {

        /* renamed from: t */
        static final /* synthetic */ C40303i[] f44933t;

        /* renamed from: e */
        private final C18381t f44934e;

        /* renamed from: f */
        private CharSequence f44935f;

        /* renamed from: g */
        private ImageView f44936g;

        /* renamed from: h */
        private final C18361h0 f44937h = new C18361h0(C15866f.f44954d);

        /* renamed from: i */
        private final C18361h0 f44938i = new C18361h0(C15865e.f44953d);

        /* renamed from: j */
        private final C18361h0 f44939j = new C18361h0(C15867g.f44955d);

        /* renamed from: k */
        private final C18361h0 f44940k = new C18361h0(C15863c.f44951d);

        /* renamed from: l */
        private final C18361h0 f44941l = new C18361h0(C15864d.f44952d);

        /* renamed from: m */
        private final C18361h0 f44942m = new C18361h0(C15861a.f44949d);

        /* renamed from: n */
        private final C18361h0 f44943n = new C18361h0(C15871k.f44959d);

        /* renamed from: o */
        private final C18361h0 f44944o = new C18361h0(C15872l.f44960d);

        /* renamed from: p */
        private final C18361h0 f44945p = new C18361h0(C15868h.f44956d);

        /* renamed from: q */
        private final C18361h0 f44946q = new C18361h0(C15870j.f44958d);

        /* renamed from: r */
        private final C18361h0 f44947r = new C18361h0(C15862b.f44950d);

        /* renamed from: s */
        private final C18361h0 f44948s = new C18361h0(C15869i.f44957d);

        /* renamed from: jh.a$d0$a */
        static final class C15861a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15861a f44949d = new C15861a();

            C15861a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d0$b */
        static final class C15862b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15862b f44950d = new C15862b();

            C15862b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d0$c */
        static final class C15863c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15863c f44951d = new C15863c();

            C15863c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d0$d */
        static final class C15864d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15864d f44952d = new C15864d();

            C15864d() {
                super(0);
            }

            public final Object invoke() {
                return "Small oval type doesn't support badge";
            }
        }

        /* renamed from: jh.a$d0$e */
        static final class C15865e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15865e f44953d = new C15865e();

            C15865e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d0$f */
        static final class C15866f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15866f f44954d = new C15866f();

            C15866f() {
                super(0);
            }

            public final Object invoke() {
                return "Small oval type does not support loader";
            }
        }

        /* renamed from: jh.a$d0$g */
        static final class C15867g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15867g f44955d = new C15867g();

            C15867g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d0$h */
        static final class C15868h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15868h f44956d = new C15868h();

            C15868h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d0$i */
        static final class C15869i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15869i f44957d = new C15869i();

            C15869i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d0$j */
        static final class C15870j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15870j f44958d = new C15870j();

            C15870j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d0$k */
        static final class C15871k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15871k f44959d = new C15871k();

            C15871k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$d0$l */
        static final class C15872l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15872l f44960d = new C15872l();

            C15872l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15860d0> cls = C15860d0.class;
            f44933t = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C15860d0(p352ak.C10003r1 r11) {
            /*
                r10 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r11, r0)
                int r4 = p601sg.C17779d.width_oval_button_small_thumbnail
                int r6 = p601sg.C17780e.selector_button_small_oval_thumbnail
                int r7 = p601sg.C17786k.LayerRadiusCircleShadow30
                r5 = 0
                r8 = 8
                r9 = 0
                r1 = r10
                r2 = r11
                r3 = r4
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                vh.t r0 = new vh.t
                androidx.appcompat.widget.AppCompatImageView r1 = r11.f27459e
                java.lang.String r2 = "binding.buttonIconImage"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                r2 = 0
                r3 = 2
                r0.<init>(r1, r2, r3, r2)
                r10.f44934e = r0
                androidx.appcompat.widget.AppCompatImageView r11 = r11.f27459e
                r10.f44936g = r11
                vh.h0 r11 = new vh.h0
                jh.a$d0$f r0 = p476jh.C15769a.C15860d0.C15866f.f44954d
                r11.<init>(r0)
                r10.f44937h = r11
                vh.h0 r11 = new vh.h0
                jh.a$d0$e r0 = p476jh.C15769a.C15860d0.C15865e.f44953d
                r11.<init>(r0)
                r10.f44938i = r11
                vh.h0 r11 = new vh.h0
                jh.a$d0$g r0 = p476jh.C15769a.C15860d0.C15867g.f44955d
                r11.<init>(r0)
                r10.f44939j = r11
                vh.h0 r11 = new vh.h0
                jh.a$d0$c r0 = p476jh.C15769a.C15860d0.C15863c.f44951d
                r11.<init>(r0)
                r10.f44940k = r11
                vh.h0 r11 = new vh.h0
                jh.a$d0$d r0 = p476jh.C15769a.C15860d0.C15864d.f44952d
                r11.<init>(r0)
                r10.f44941l = r11
                vh.h0 r11 = new vh.h0
                jh.a$d0$a r0 = p476jh.C15769a.C15860d0.C15861a.f44949d
                r11.<init>(r0)
                r10.f44942m = r11
                vh.h0 r11 = new vh.h0
                jh.a$d0$k r0 = p476jh.C15769a.C15860d0.C15871k.f44959d
                r11.<init>(r0)
                r10.f44943n = r11
                vh.h0 r11 = new vh.h0
                jh.a$d0$l r0 = p476jh.C15769a.C15860d0.C15872l.f44960d
                r11.<init>(r0)
                r10.f44944o = r11
                vh.h0 r11 = new vh.h0
                jh.a$d0$h r0 = p476jh.C15769a.C15860d0.C15868h.f44956d
                r11.<init>(r0)
                r10.f44945p = r11
                vh.h0 r11 = new vh.h0
                jh.a$d0$j r0 = p476jh.C15769a.C15860d0.C15870j.f44958d
                r11.<init>(r0)
                r10.f44946q = r11
                vh.h0 r11 = new vh.h0
                jh.a$d0$b r0 = p476jh.C15769a.C15860d0.C15862b.f44950d
                r11.<init>(r0)
                r10.f44947r = r11
                vh.h0 r11 = new vh.h0
                jh.a$d0$i r0 = p476jh.C15769a.C15860d0.C15869i.f44957d
                r11.<init>(r0)
                r10.f44948s = r11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p476jh.C15769a.C15860d0.<init>(ak.r1):void");
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            ((C2394j) ((C2394j) C2379b.m9210t(mo43194l()).mo7751t(drawable).mo7222d()).mo7220c0(C17780e.f49668q1)).mo7718L0(((C10003r1) mo43184b()).f27459e);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f44938i.setValue(this, f44933t[2], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f44934e.setValue(this, f44933t[0], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f44937h.setValue(this, f44933t[1], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f44935f = charSequence;
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f44939j.setValue(this, f44933t[3], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f44945p.setValue(this, f44933t[9], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f44948s.setValue(this, f44933t[12], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f44946q.setValue(this, f44933t[10], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f44942m.getValue(this, f44933t[6]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f44940k.getValue(this, f44933t[4]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f44941l.getValue(this, f44933t[5]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return ((C10003r1) mo43184b()).f27459e.getDrawable();
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f44938i.getValue(this, f44933t[2]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f44936g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f44934e.getValue(this, f44933t[0]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f44937h.getValue(this, f44933t[1])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f44935f;
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f44939j.getValue(this, f44933t[3]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f44945p.getValue(this, f44933t[9])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f44948s.getValue(this, f44933t[12])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f44946q.getValue(this, f44933t[10]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f44943n.getValue(this, f44933t[7]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f44944o.getValue(this, f44933t[8]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f44942m.setValue(this, f44933t[6], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f44947r.setValue(this, f44933t[11], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f44940k.setValue(this, f44933t[4], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f44941l.setValue(this, f44933t[5], num);
        }
    }

    /* renamed from: jh.a$e */
    public static class C15873e extends C15769a {

        /* renamed from: t */
        static final /* synthetic */ C40303i[] f44961t;

        /* renamed from: e */
        private final C18355e0 f44962e;

        /* renamed from: f */
        private ImageView f44963f;

        /* renamed from: g */
        private final C18361h0 f44964g = new C18361h0(C15878e.f44981d);

        /* renamed from: h */
        private final C18361h0 f44965h = new C18361h0(C15877d.f44980d);

        /* renamed from: i */
        private final C18361h0 f44966i = new C18361h0(C15880g.f44983d);

        /* renamed from: j */
        private final C18361h0 f44967j = new C18361h0(C15879f.f44982d);

        /* renamed from: k */
        private final C18355e0 f44968k;

        /* renamed from: l */
        private final C18361h0 f44969l;

        /* renamed from: m */
        private final C18361h0 f44970m;

        /* renamed from: n */
        private final C18361h0 f44971n;

        /* renamed from: o */
        private final C18361h0 f44972o;

        /* renamed from: p */
        private final C18361h0 f44973p;

        /* renamed from: q */
        private final C18361h0 f44974q;

        /* renamed from: r */
        private final C18361h0 f44975r;

        /* renamed from: s */
        private final C18361h0 f44976s;

        /* renamed from: jh.a$e$a */
        static final class C15874a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15874a f44977d = new C15874a();

            C15874a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e$b */
        static final class C15875b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15875b f44978d = new C15875b();

            C15875b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e$c */
        static final class C15876c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15876c f44979d = new C15876c();

            C15876c() {
                super(0);
            }

            public final Object invoke() {
                return "Action Logo type doesn't support badge";
            }
        }

        /* renamed from: jh.a$e$d */
        static final class C15877d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15877d f44980d = new C15877d();

            C15877d() {
                super(0);
            }

            public final Object invoke() {
                return "Action Logo type doesn't support background tint";
            }
        }

        /* renamed from: jh.a$e$e */
        static final class C15878e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15878e f44981d = new C15878e();

            C15878e() {
                super(0);
            }

            public final Object invoke() {
                return "Action Logo type doesn't support icon tint";
            }
        }

        /* renamed from: jh.a$e$f */
        static final class C15879f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15879f f44982d = new C15879f();

            C15879f() {
                super(0);
            }

            public final Object invoke() {
                return "Action Logo type doesn't support loader";
            }
        }

        /* renamed from: jh.a$e$g */
        static final class C15880g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15880g f44983d = new C15880g();

            C15880g() {
                super(0);
            }

            public final Object invoke() {
                return "Action Logo type doesn't support text tint";
            }
        }

        /* renamed from: jh.a$e$h */
        static final class C15881h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15881h f44984d = new C15881h();

            C15881h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e$i */
        static final class C15882i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15882i f44985d = new C15882i();

            C15882i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e$j */
        static final class C15883j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15883j f44986d = new C15883j();

            C15883j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e$k */
        static final class C15884k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15884k f44987d = new C15884k();

            C15884k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e$l */
        static final class C15885l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15885l f44988d = new C15885l();

            C15885l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15873e> cls = C15873e.class;
            f44961t = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15873e(C9885c1 c1Var) {
            super(c1Var, C17779d.width_action_logo, 0, 0, 0, 0, 60, (DefaultConstructorMarker) null);
            C9885c1 c1Var2 = c1Var;
            C41536l.m120489i(c1Var2, "binding");
            AppCompatTextView appCompatTextView = c1Var2.f26837f;
            C41536l.m120488h(appCompatTextView, "binding.buttonText");
            this.f44962e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f44963f = c1Var2.f26838g;
            AppCompatTextView appCompatTextView2 = c1Var2.f26836e;
            C41536l.m120488h(appCompatTextView2, "binding.amountText");
            this.f44968k = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f44969l = new C18361h0(C15876c.f44979d);
            this.f44970m = new C18361h0(C15874a.f44977d);
            this.f44971n = new C18361h0(C15884k.f44987d);
            this.f44972o = new C18361h0(C15885l.f44988d);
            this.f44973p = new C18361h0(C15881h.f44984d);
            this.f44974q = new C18361h0(C15883j.f44986d);
            this.f44975r = new C18361h0(C15875b.f44978d);
            this.f44976s = new C18361h0(C15882i.f44985d);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            ((C2394j) ((C2394j) C2379b.m9210t(mo43194l()).mo7751t(drawable).mo7222d()).mo7220c0(C17780e.f49668q1)).mo7718L0(((C9885c1) mo43184b()).f26838g);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f44965h.setValue(this, f44961t[2], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f44964g.setValue(this, f44961t[1], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f44967j.setValue(this, f44961t[4], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f44962e.setValue(this, f44961t[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f44966i.setValue(this, f44961t[3], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f44973p.setValue(this, f44961t[10], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f44976s.setValue(this, f44961t[13], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f44974q.setValue(this, f44961t[11], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f44970m.getValue(this, f44961t[7]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return this.f44968k.getValue(this, f44961t[5]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f44969l.getValue(this, f44961t[6]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return ((C9885c1) mo43184b()).f26838g.getDrawable();
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f44965h.getValue(this, f44961t[2]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f44963f;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f44964g.getValue(this, f44961t[1]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f44967j.getValue(this, f44961t[4])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f44962e.getValue(this, f44961t[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f44966i.getValue(this, f44961t[3]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f44973p.getValue(this, f44961t[10])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f44976s.getValue(this, f44961t[13])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f44974q.getValue(this, f44961t[11]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f44971n.getValue(this, f44961t[8]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f44972o.getValue(this, f44961t[9]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C9885c1) mo43184b()).f26836e, C17786k.TextButton2Negative500Left);
            } else {
                C1314o.m4575q(((C9885c1) mo43184b()).f26836e, C17786k.TextButton2Negative150Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f44970m.setValue(this, f44961t[7], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f44975r.setValue(this, f44961t[12], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f44968k.setValue(this, f44961t[5], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f44969l.setValue(this, f44961t[6], num);
        }
    }

    /* renamed from: jh.a$e0 */
    public static class C15886e0 extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f44989u;

        /* renamed from: e */
        private final C18355e0 f44990e;

        /* renamed from: f */
        private final C18361h0 f44991f = new C18361h0(C15891e.f45010d);

        /* renamed from: g */
        private ImageView f44992g;

        /* renamed from: h */
        private final C18361h0 f44993h = new C18361h0(C15893g.f45012d);

        /* renamed from: i */
        private final C18361h0 f44994i = new C18361h0(C15889c.f45008d);

        /* renamed from: j */
        private final C18361h0 f44995j = new C18361h0(C15890d.f45009d);

        /* renamed from: k */
        private final C18361h0 f44996k = new C18361h0(C15894h.f45013d);

        /* renamed from: l */
        private final C18361h0 f44997l = new C18361h0(C15892f.f45011d);

        /* renamed from: m */
        private final C18361h0 f44998m = new C18361h0(C15895i.f45014d);

        /* renamed from: n */
        private final C18361h0 f44999n = new C18361h0(C15887a.f45006d);

        /* renamed from: o */
        private final C18361h0 f45000o = new C18361h0(C15899m.f45018d);

        /* renamed from: p */
        private final C18361h0 f45001p = new C18361h0(C15900n.f45019d);

        /* renamed from: q */
        private final C18361h0 f45002q = new C18361h0(C15896j.f45015d);

        /* renamed from: r */
        private final C18361h0 f45003r = new C18361h0(C15898l.f45017d);

        /* renamed from: s */
        private final C18361h0 f45004s = new C18361h0(C15888b.f45007d);

        /* renamed from: t */
        private final C18361h0 f45005t = new C18361h0(C15897k.f45016d);

        /* renamed from: jh.a$e0$a */
        static final class C15887a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15887a f45006d = new C15887a();

            C15887a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e0$b */
        static final class C15888b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15888b f45007d = new C15888b();

            C15888b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e0$c */
        static final class C15889c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15889c f45008d = new C15889c();

            C15889c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e0$d */
        static final class C15890d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15890d f45009d = new C15890d();

            C15890d() {
                super(0);
            }

            public final Object invoke() {
                return "SmallText type doesn't support badge";
            }
        }

        /* renamed from: jh.a$e0$e */
        static final class C15891e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15891e f45010d = new C15891e();

            C15891e() {
                super(0);
            }

            public final Object invoke() {
                return "SmallText type not supports icon";
            }
        }

        /* renamed from: jh.a$e0$f */
        static final class C15892f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15892f f45011d = new C15892f();

            C15892f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e0$g */
        static final class C15893g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15893g f45012d = new C15893g();

            C15893g() {
                super(0);
            }

            public final Object invoke() {
                return "SmallText type not supports icon";
            }
        }

        /* renamed from: jh.a$e0$h */
        static final class C15894h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15894h f45013d = new C15894h();

            C15894h() {
                super(0);
            }

            public final Object invoke() {
                return "SmallText type not supports loader";
            }
        }

        /* renamed from: jh.a$e0$i */
        static final class C15895i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15895i f45014d = new C15895i();

            C15895i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e0$j */
        static final class C15896j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15896j f45015d = new C15896j();

            C15896j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e0$k */
        static final class C15897k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15897k f45016d = new C15897k();

            C15897k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e0$l */
        static final class C15898l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15898l f45017d = new C15898l();

            C15898l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e0$m */
        static final class C15899m extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15899m f45018d = new C15899m();

            C15899m() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$e0$n */
        static final class C15900n extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15900n f45019d = new C15900n();

            C15900n() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15886e0> cls = C15886e0.class;
            f44989u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15886e0(C10010s1 s1Var) {
            super(s1Var, 0, C17779d.height_button_small, 0, C17780e.selector_button_small, C17786k.f49833r, 10, (DefaultConstructorMarker) null);
            C10010s1 s1Var2 = s1Var;
            C41536l.m120489i(s1Var2, "binding");
            AppCompatTextView appCompatTextView = s1Var2.f27494e;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f44990e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f44991f.setValue(this, f44989u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f44997l.setValue(this, f44989u[6], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f44993h.setValue(this, f44989u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f44996k.setValue(this, f44989u[5], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f44990e.setValue(this, f44989u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f44998m.setValue(this, f44989u[7], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45002q.setValue(this, f44989u[11], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45005t.setValue(this, f44989u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45003r.setValue(this, f44989u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f44999n.getValue(this, f44989u[8]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f44994i.getValue(this, f44989u[3]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f44995j.getValue(this, f44989u[4]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return (Drawable) this.f44991f.getValue(this, f44989u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f44997l.getValue(this, f44989u[6]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f44992g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f44993h.getValue(this, f44989u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f44996k.getValue(this, f44989u[5])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f44990e.getValue(this, f44989u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f44998m.getValue(this, f44989u[7]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45002q.getValue(this, f44989u[11])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45005t.getValue(this, f44989u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45003r.getValue(this, f44989u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45000o.getValue(this, f44989u[9]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45001p.getValue(this, f44989u[10]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C10010s1) mo43184b()).f27494e, C17786k.TextButton2InvertComponents400Left);
            } else {
                C1314o.m4575q(((C10010s1) mo43184b()).f27494e, C17786k.TextButton2InvertComponents150Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f44999n.setValue(this, f44989u[8], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45004s.setValue(this, f44989u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f44994i.setValue(this, f44989u[3], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f44995j.setValue(this, f44989u[4], num);
        }
    }

    /* renamed from: jh.a$f */
    public static final class C15901f extends C15769a {

        /* renamed from: t */
        static final /* synthetic */ C40303i[] f45020t;

        /* renamed from: e */
        private final C18355e0 f45021e;

        /* renamed from: f */
        private ImageView f45022f;

        /* renamed from: g */
        private final C18361h0 f45023g = new C18361h0(C15907f.f45041d);

        /* renamed from: h */
        private final C18361h0 f45024h = new C18361h0(C15906e.f45040d);

        /* renamed from: i */
        private final C18361h0 f45025i = new C18361h0(C15909h.f45043d);

        /* renamed from: j */
        private final C18361h0 f45026j = new C18361h0(C15908g.f45042d);

        /* renamed from: k */
        private final C18361h0 f45027k = new C18361h0(C15904c.f45038d);

        /* renamed from: l */
        private final C18361h0 f45028l = new C18361h0(C15905d.f45039d);

        /* renamed from: m */
        private final C18361h0 f45029m = new C18361h0(C15902a.f45036d);

        /* renamed from: n */
        private final C18361h0 f45030n = new C18361h0(C15913l.f45047d);

        /* renamed from: o */
        private final C18361h0 f45031o = new C18361h0(C15914m.f45048d);

        /* renamed from: p */
        private final C18361h0 f45032p = new C18361h0(C15910i.f45044d);

        /* renamed from: q */
        private final C18361h0 f45033q = new C18361h0(C15912k.f45046d);

        /* renamed from: r */
        private final C18361h0 f45034r = new C18361h0(C15903b.f45037d);

        /* renamed from: s */
        private final C18361h0 f45035s = new C18361h0(C15911j.f45045d);

        /* renamed from: jh.a$f$a */
        static final class C15902a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15902a f45036d = new C15902a();

            C15902a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f$b */
        static final class C15903b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15903b f45037d = new C15903b();

            C15903b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f$c */
        static final class C15904c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15904c f45038d = new C15904c();

            C15904c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f$d */
        static final class C15905d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15905d f45039d = new C15905d();

            C15905d() {
                super(0);
            }

            public final Object invoke() {
                return "Card Action type doesn't support badge";
            }
        }

        /* renamed from: jh.a$f$e */
        static final class C15906e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15906e f45040d = new C15906e();

            C15906e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f$f */
        static final class C15907f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15907f f45041d = new C15907f();

            C15907f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f$g */
        static final class C15908g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15908g f45042d = new C15908g();

            C15908g() {
                super(0);
            }

            public final Object invoke() {
                return "Card Action type doesn't support loader";
            }
        }

        /* renamed from: jh.a$f$h */
        static final class C15909h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15909h f45043d = new C15909h();

            C15909h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f$i */
        static final class C15910i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15910i f45044d = new C15910i();

            C15910i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f$j */
        static final class C15911j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15911j f45045d = new C15911j();

            C15911j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f$k */
        static final class C15912k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15912k f45046d = new C15912k();

            C15912k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f$l */
        static final class C15913l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15913l f45047d = new C15913l();

            C15913l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f$m */
        static final class C15914m extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15914m f45048d = new C15914m();

            C15914m() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15901f> cls = C15901f.class;
            f45020t = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15901f(C9867a aVar) {
            super(aVar, C17779d.width_button_card_action_layer, 0, 0, 0, 0, 12, (DefaultConstructorMarker) null);
            C9867a aVar2 = aVar;
            C41536l.m120489i(aVar2, "binding");
            AppCompatTextView appCompatTextView = aVar2.f26733f;
            C41536l.m120488h(appCompatTextView, "binding.buttonText");
            this.f45021e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f45022f = aVar2.f26732e;
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            ((C2394j) C2379b.m9210t(mo43194l()).mo7751t(drawable).mo7232j(C17780e.f49662k1)).mo7718L0(((C9867a) mo43184b()).f26732e);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45024h.setValue(this, f45020t[2], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45023g.setValue(this, f45020t[1], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45026j.setValue(this, f45020t[4], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45021e.setValue(this, f45020t[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45025i.setValue(this, f45020t[3], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45032p.setValue(this, f45020t[10], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45035s.setValue(this, f45020t[13], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45033q.setValue(this, f45020t[11], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45029m.getValue(this, f45020t[7]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45027k.getValue(this, f45020t[5]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45028l.getValue(this, f45020t[6]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return ((C9867a) mo43184b()).f26732e.getDrawable();
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45024h.getValue(this, f45020t[2]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45022f;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f45023g.getValue(this, f45020t[1]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45026j.getValue(this, f45020t[4])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45021e.getValue(this, f45020t[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45025i.getValue(this, f45020t[3]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45032p.getValue(this, f45020t[10])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45035s.getValue(this, f45020t[13])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45033q.getValue(this, f45020t[11]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45030n.getValue(this, f45020t[8]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45031o.getValue(this, f45020t[9]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45029m.setValue(this, f45020t[7], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45034r.setValue(this, f45020t[12], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45027k.setValue(this, f45020t[5], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45028l.setValue(this, f45020t[6], num);
        }
    }

    /* renamed from: jh.a$f0 */
    public static class C15915f0 extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45049u;

        /* renamed from: e */
        private final C18355e0 f45050e;

        /* renamed from: f */
        private final C18376o f45051f;

        /* renamed from: g */
        private ImageView f45052g;

        /* renamed from: h */
        private final C18381t f45053h;

        /* renamed from: i */
        private final C18361h0 f45054i = new C18361h0(C15920e.f45070d);

        /* renamed from: j */
        private final C18361h0 f45055j = new C18361h0(C15919d.f45069d);

        /* renamed from: k */
        private final C18361h0 f45056k = new C18361h0(C15921f.f45071d);

        /* renamed from: l */
        private final C18361h0 f45057l = new C18361h0(C15918c.f45068d);

        /* renamed from: m */
        private final C18361h0 f45058m = new C18361h0(C15925j.f45075d);

        /* renamed from: n */
        private final C18361h0 f45059n = new C18361h0(C15926k.f45076d);

        /* renamed from: o */
        private final C18361h0 f45060o = new C18361h0(C15922g.f45072d);

        /* renamed from: p */
        private Integer f45061p;

        /* renamed from: q */
        private final C18361h0 f45062q = new C18361h0(C15916a.f45066d);

        /* renamed from: r */
        private final C18361h0 f45063r = new C18361h0(C15924i.f45074d);

        /* renamed from: s */
        private final C18361h0 f45064s = new C18361h0(C15917b.f45067d);

        /* renamed from: t */
        private final C18361h0 f45065t = new C18361h0(C15923h.f45073d);

        /* renamed from: jh.a$f0$a */
        static final class C15916a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15916a f45066d = new C15916a();

            C15916a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f0$b */
        static final class C15917b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15917b f45067d = new C15917b();

            C15917b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f0$c */
        static final class C15918c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15918c f45068d = new C15918c();

            C15918c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f0$d */
        static final class C15919d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15919d f45069d = new C15919d();

            C15919d() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f0$e */
        static final class C15920e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15920e f45070d = new C15920e();

            C15920e() {
                super(0);
            }

            public final Object invoke() {
                return "SmallTextIcon type not supports loader";
            }
        }

        /* renamed from: jh.a$f0$f */
        static final class C15921f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15921f f45071d = new C15921f();

            C15921f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f0$g */
        static final class C15922g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15922g f45072d = new C15922g();

            C15922g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f0$h */
        static final class C15923h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15923h f45073d = new C15923h();

            C15923h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f0$i */
        static final class C15924i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15924i f45074d = new C15924i();

            C15924i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f0$j */
        static final class C15925j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15925j f45075d = new C15925j();

            C15925j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$f0$k */
        static final class C15926k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15926k f45076d = new C15926k();

            C15926k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15915f0> cls = C15915f0.class;
            f45049u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15915f0(C10017t1 t1Var) {
            super(t1Var, 0, C17779d.height_button_small, 0, C17780e.selector_button_small, C17786k.f49833r, 10, (DefaultConstructorMarker) null);
            C10017t1 t1Var2 = t1Var;
            C41536l.m120489i(t1Var2, "binding");
            AppCompatTextView appCompatTextView = t1Var2.f27578g;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f45050e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView = t1Var2.f27577f;
            C41536l.m120488h(appCompatImageView, "binding.iconView");
            this.f45051f = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = t1Var2.f27577f;
            this.f45052g = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.iconView");
            this.f45053h = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView3 = t1Var2.f27577f;
            appCompatImageView3.setVisibility(0);
            mo43176C(C5769a.m23209a(appCompatImageView3.getContext(), C17778c.selector_button_small_icon));
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45051f.setValue(this, f45049u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45055j.setValue(this, f45049u[4], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45053h.setValue(this, f45049u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45054i.setValue(this, f45049u[3], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45050e.setValue(this, f45049u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45056k.setValue(this, f45049u[5], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45060o.setValue(this, f45049u[9], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45065t.setValue(this, f45049u[13], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45063r.setValue(this, f45049u[11], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45062q.getValue(this, f45049u[10]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45057l.getValue(this, f45049u[6]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return this.f45061p;
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45051f.getValue(this, f45049u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45055j.getValue(this, f45049u[4]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45052g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45053h.getValue(this, f45049u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45054i.getValue(this, f45049u[3])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45050e.getValue(this, f45049u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45056k.getValue(this, f45049u[5]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45060o.getValue(this, f45049u[9])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45065t.getValue(this, f45049u[13])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45063r.getValue(this, f45049u[11]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45058m.getValue(this, f45049u[7]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45059n.getValue(this, f45049u[8]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z5) {
                ((C10017t1) mo43184b()).f27576e.setVisibility(0);
            } else {
                ((C10017t1) mo43184b()).f27576e.setVisibility(8);
            }
            if (z || z2) {
                if (z5) {
                    ((C10017t1) mo43184b()).f27576e.setBadgeColor(Integer.valueOf(C0767a.m2893c(mo43194l(), C17778c.color_support_first_solid_df_500)));
                }
                C1314o.m4575q(((C10017t1) mo43184b()).f27578g, C17786k.TextButton2InvertComponents400Left);
                return;
            }
            if (z5) {
                ((C10017t1) mo43184b()).f27576e.setBadgeColor(Integer.valueOf(C0767a.m2893c(mo43194l(), C17778c.color_support_first_tr_150)));
            }
            C1314o.m4575q(((C10017t1) mo43184b()).f27578g, C17786k.TextButton2InvertComponents150Left);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45062q.setValue(this, f45049u[10], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45064s.setValue(this, f45049u[12], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45057l.setValue(this, f45049u[6], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            int i;
            NotificationBadgeView notificationBadgeView = ((C10017t1) mo43184b()).f27576e;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            notificationBadgeView.setBadge(new NotificationBadgeView.BadgeType.Number(i));
            this.f45061p = num;
        }
    }

    /* renamed from: jh.a$g */
    public static class C15927g extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45077u;

        /* renamed from: e */
        private CharSequence f45078e;

        /* renamed from: f */
        private final C18376o f45079f;

        /* renamed from: g */
        private ImageView f45080g;

        /* renamed from: h */
        private final C18381t f45081h;

        /* renamed from: i */
        private final C18361h0 f45082i = new C18361h0(C15933f.f45099d);

        /* renamed from: j */
        private final C18361h0 f45083j = new C18361h0(C15932e.f45098d);

        /* renamed from: k */
        private final C18361h0 f45084k = new C18361h0(C15934g.f45100d);

        /* renamed from: l */
        private final C18361h0 f45085l = new C18361h0(C15930c.f45096d);

        /* renamed from: m */
        private final C18361h0 f45086m = new C18361h0(C15931d.f45097d);

        /* renamed from: n */
        private final C18361h0 f45087n = new C18361h0(C15928a.f45094d);

        /* renamed from: o */
        private final C18361h0 f45088o = new C18361h0(C15938k.f45104d);

        /* renamed from: p */
        private final C18361h0 f45089p = new C18361h0(C15939l.f45105d);

        /* renamed from: q */
        private final C18361h0 f45090q = new C18361h0(C15935h.f45101d);

        /* renamed from: r */
        private final C18361h0 f45091r = new C18361h0(C15937j.f45103d);

        /* renamed from: s */
        private final C18361h0 f45092s = new C18361h0(C15929b.f45095d);

        /* renamed from: t */
        private final C18361h0 f45093t = new C18361h0(C15936i.f45102d);

        /* renamed from: jh.a$g$a */
        static final class C15928a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15928a f45094d = new C15928a();

            C15928a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g$b */
        static final class C15929b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15929b f45095d = new C15929b();

            C15929b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g$c */
        static final class C15930c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15930c f45096d = new C15930c();

            C15930c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g$d */
        static final class C15931d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15931d f45097d = new C15931d();

            C15931d() {
                super(0);
            }

            public final Object invoke() {
                return "Delete type doesn't support badge";
            }
        }

        /* renamed from: jh.a$g$e */
        static final class C15932e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15932e f45098d = new C15932e();

            C15932e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g$f */
        static final class C15933f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15933f f45099d = new C15933f();

            C15933f() {
                super(0);
            }

            public final Object invoke() {
                return "Delete type does not support loader";
            }
        }

        /* renamed from: jh.a$g$g */
        static final class C15934g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15934g f45100d = new C15934g();

            C15934g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g$h */
        static final class C15935h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15935h f45101d = new C15935h();

            C15935h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g$i */
        static final class C15936i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15936i f45102d = new C15936i();

            C15936i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g$j */
        static final class C15937j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15937j f45103d = new C15937j();

            C15937j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g$k */
        static final class C15938k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15938k f45104d = new C15938k();

            C15938k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g$l */
        static final class C15939l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15939l f45105d = new C15939l();

            C15939l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15927g> cls = C15927g.class;
            f45077u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15927g(C9917g1 g1Var) {
            super(g1Var, C17779d.width_button_delete, C17779d.height_button_delete, 0, 0, 0, 8, (DefaultConstructorMarker) null);
            C41536l.m120489i(g1Var, "binding");
            AppCompatImageView appCompatImageView = g1Var.f27018e;
            C41536l.m120488h(appCompatImageView, "binding.deleteButton");
            this.f45079f = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = g1Var.f27018e;
            this.f45080g = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.deleteButton");
            this.f45081h = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45079f.setValue(this, f45077u[0], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45083j.setValue(this, f45077u[3], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45081h.setValue(this, f45077u[1], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45082i.setValue(this, f45077u[2], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45078e = charSequence;
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45084k.setValue(this, f45077u[4], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45090q.setValue(this, f45077u[10], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45093t.setValue(this, f45077u[13], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45091r.setValue(this, f45077u[11], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45087n.getValue(this, f45077u[7]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45085l.getValue(this, f45077u[5]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45086m.getValue(this, f45077u[6]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45079f.getValue(this, f45077u[0]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45083j.getValue(this, f45077u[3]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45080g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45081h.getValue(this, f45077u[1]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45082i.getValue(this, f45077u[2])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45078e;
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45084k.getValue(this, f45077u[4]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45090q.getValue(this, f45077u[10])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45093t.getValue(this, f45077u[13])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45091r.getValue(this, f45077u[11]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45088o.getValue(this, f45077u[8]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45089p.getValue(this, f45077u[9]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45087n.setValue(this, f45077u[7], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45092s.setValue(this, f45077u[12], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45085l.setValue(this, f45077u[5], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45086m.setValue(this, f45077u[6], num);
        }
    }

    /* renamed from: jh.a$g0 */
    public static class C15940g0 extends C15769a {

        /* renamed from: v */
        static final /* synthetic */ C40303i[] f45106v;

        /* renamed from: e */
        private final C18365j0 f45107e;

        /* renamed from: f */
        private final C18376o f45108f;

        /* renamed from: g */
        private ImageView f45109g;

        /* renamed from: h */
        private final C18381t f45110h;

        /* renamed from: i */
        private final C18363i0 f45111i;

        /* renamed from: j */
        private CharSequence f45112j;

        /* renamed from: k */
        private ColorStateList f45113k;

        /* renamed from: l */
        private final C18361h0 f45114l = new C18361h0(C15943c.f45126d);

        /* renamed from: m */
        private final C18361h0 f45115m = new C18361h0(C15944d.f45127d);

        /* renamed from: n */
        private final C18361h0 f45116n = new C18361h0(C15945e.f45128d);

        /* renamed from: o */
        private final C18361h0 f45117o = new C18361h0(C15941a.f45124d);

        /* renamed from: p */
        private final C18361h0 f45118p = new C18361h0(C15949i.f45132d);

        /* renamed from: q */
        private final C18361h0 f45119q = new C18361h0(C15950j.f45133d);

        /* renamed from: r */
        private final C18361h0 f45120r = new C18361h0(C15946f.f45129d);

        /* renamed from: s */
        private final C18361h0 f45121s = new C18361h0(C15948h.f45131d);

        /* renamed from: t */
        private final C18361h0 f45122t = new C18361h0(C15942b.f45125d);

        /* renamed from: u */
        private final C18361h0 f45123u = new C18361h0(C15947g.f45130d);

        /* renamed from: jh.a$g0$a */
        static final class C15941a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15941a f45124d = new C15941a();

            C15941a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g0$b */
        static final class C15942b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15942b f45125d = new C15942b();

            C15942b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g0$c */
        static final class C15943c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15943c f45126d = new C15943c();

            C15943c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g0$d */
        static final class C15944d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15944d f45127d = new C15944d();

            C15944d() {
                super(0);
            }

            public final Object invoke() {
                return "Swipe type doesn't support badge";
            }
        }

        /* renamed from: jh.a$g0$e */
        static final class C15945e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15945e f45128d = new C15945e();

            C15945e() {
                super(0);
            }

            public final Object invoke() {
                return "Swipe type not supports loader";
            }
        }

        /* renamed from: jh.a$g0$f */
        static final class C15946f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15946f f45129d = new C15946f();

            C15946f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g0$g */
        static final class C15947g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15947g f45130d = new C15947g();

            C15947g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g0$h */
        static final class C15948h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15948h f45131d = new C15948h();

            C15948h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g0$i */
        static final class C15949i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15949i f45132d = new C15949i();

            C15949i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$g0$j */
        static final class C15950j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15950j f45133d = new C15950j();

            C15950j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15940g0> cls = C15940g0.class;
            f45106v = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "isButtonTextVisible", "isButtonTextVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15940g0(C10045x1 x1Var) {
            super(x1Var, (DefaultConstructorMarker) null);
            C41536l.m120489i(x1Var, "binding");
            AppCompatTextView appCompatTextView = x1Var.f27726g;
            C41536l.m120488h(appCompatTextView, "binding.buttonSwipeText");
            this.f45107e = new C18365j0(appCompatTextView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView = x1Var.f27724e;
            C41536l.m120488h(appCompatImageView, "binding.buttonSwipeIcon");
            this.f45108f = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = x1Var.f27724e;
            this.f45109g = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.buttonSwipeIcon");
            this.f45110h = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            LayerView layerView = x1Var.f27725f;
            C41536l.m120488h(layerView, "binding.buttonSwipeLayerView");
            this.f45111i = new C18363i0(layerView);
            x1Var.f27725f.setBackgroundTintMode(PorterDuff.Mode.SRC_IN);
            mo43176C(C5769a.m23209a(x1Var.f27724e.getContext(), C17778c.selector_button_swipe_icon));
        }

        /* renamed from: J */
        private final void m57188J(boolean z) {
            this.f45107e.mo46151c(this, f45106v[0], z);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45108f.setValue(this, f45106v[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45111i.setValue(this, f45106v[3], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45110h.setValue(this, f45106v[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45116n.setValue(this, f45106v[6], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            boolean z;
            this.f45112j = charSequence;
            ((C10045x1) mo43184b()).f27726g.setText(charSequence);
            if (charSequence != null) {
                z = true;
            } else {
                z = false;
            }
            m57188J(z);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45113k = colorStateList;
            ((C10045x1) mo43184b()).f27726g.setTextColor(colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45120r.setValue(this, f45106v[10], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45123u.setValue(this, f45106v[13], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45121s.setValue(this, f45106v[11], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45117o.getValue(this, f45106v[7]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45114l.getValue(this, f45106v[4]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45115m.getValue(this, f45106v[5]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45108f.getValue(this, f45106v[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return this.f45111i.getValue(this, f45106v[3]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45109g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45110h.getValue(this, f45106v[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45116n.getValue(this, f45106v[6])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return ((C10045x1) mo43184b()).f27726g.getText();
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return ((C10045x1) mo43184b()).f27726g.getTextColors();
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45120r.getValue(this, f45106v[10])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45123u.getValue(this, f45106v[13])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45121s.getValue(this, f45106v[11]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45118p.getValue(this, f45106v[8]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45119q.getValue(this, f45106v[9]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45117o.setValue(this, f45106v[7], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45122t.setValue(this, f45106v[12], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45114l.setValue(this, f45106v[4], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45115m.setValue(this, f45106v[5], num);
        }
    }

    /* renamed from: jh.a$h */
    public static class C15951h extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45134u;

        /* renamed from: e */
        private final C18355e0 f45135e;

        /* renamed from: f */
        private final C18376o f45136f;

        /* renamed from: g */
        private ImageView f45137g;

        /* renamed from: h */
        private final C18381t f45138h;

        /* renamed from: i */
        private final C18361h0 f45139i = new C18361h0(C15956e.f45155d);

        /* renamed from: j */
        private final C18363i0 f45140j;

        /* renamed from: k */
        private final C18361h0 f45141k;

        /* renamed from: l */
        private final C18361h0 f45142l;

        /* renamed from: m */
        private final C18361h0 f45143m;

        /* renamed from: n */
        private final C18361h0 f45144n;

        /* renamed from: o */
        private final C18361h0 f45145o;

        /* renamed from: p */
        private final C18361h0 f45146p;

        /* renamed from: q */
        private final C18361h0 f45147q;

        /* renamed from: r */
        private final C18361h0 f45148r;

        /* renamed from: s */
        private final C18361h0 f45149s;

        /* renamed from: t */
        private final C18357f0 f45150t;

        /* renamed from: jh.a$h$a */
        static final class C15952a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15952a f45151d = new C15952a();

            C15952a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h$b */
        static final class C15953b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15953b f45152d = new C15953b();

            C15953b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h$c */
        static final class C15954c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15954c f45153d = new C15954c();

            C15954c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h$d */
        static final class C15955d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15955d f45154d = new C15955d();

            C15955d() {
                super(0);
            }

            public final Object invoke() {
                return "Action type doesn't support badge";
            }
        }

        /* renamed from: jh.a$h$e */
        static final class C15956e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15956e f45155d = new C15956e();

            C15956e() {
                super(0);
            }

            public final Object invoke() {
                return "Action type not supports loader";
            }
        }

        /* renamed from: jh.a$h$f */
        static final class C15957f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15957f f45156d = new C15957f();

            C15957f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h$g */
        static final class C15958g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15958g f45157d = new C15958g();

            C15958g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h$h */
        static final class C15959h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15959h f45158d = new C15959h();

            C15959h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h$i */
        static final class C15960i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15960i f45159d = new C15960i();

            C15960i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h$j */
        static final class C15961j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15961j f45160d = new C15961j();

            C15961j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15951h> cls = C15951h.class;
            f45134u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15951h(C10058z0 z0Var) {
            super(z0Var, C17779d.width_button_action, 0, 0, 0, 0, 12, (DefaultConstructorMarker) null);
            C10058z0 z0Var2 = z0Var;
            C41536l.m120489i(z0Var2, "binding");
            AppCompatTextView appCompatTextView = z0Var2.f27795f;
            C41536l.m120488h(appCompatTextView, "binding.actionTypeText");
            this.f45135e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView = z0Var2.f27794e;
            C41536l.m120488h(appCompatImageView, "binding.actionButton");
            this.f45136f = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = z0Var2.f27794e;
            this.f45137g = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.actionButton");
            this.f45138h = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            LayerView layerView = z0Var2.f27796g;
            C41536l.m120488h(layerView, "binding.iconLayerView");
            this.f45140j = new C18363i0(layerView);
            this.f45141k = new C18361h0(C15957f.f45156d);
            this.f45142l = new C18361h0(C15954c.f45153d);
            this.f45143m = new C18361h0(C15955d.f45154d);
            this.f45144n = new C18361h0(C15952a.f45151d);
            this.f45145o = new C18361h0(C15960i.f45159d);
            this.f45146p = new C18361h0(C15961j.f45160d);
            this.f45147q = new C18361h0(C15958g.f45157d);
            this.f45148r = new C18361h0(C15959h.f45158d);
            this.f45149s = new C18361h0(C15953b.f45152d);
            AppCompatTextView appCompatTextView2 = z0Var2.f27795f;
            C41536l.m120488h(appCompatTextView2, "binding.actionTypeText");
            this.f45150t = new C18357f0(appCompatTextView2);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45136f.setValue(this, f45134u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45140j.setValue(this, f45134u[4], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45138h.setValue(this, f45134u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45139i.setValue(this, f45134u[3], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45135e.setValue(this, f45134u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45141k.setValue(this, f45134u[5], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45147q.setValue(this, f45134u[11], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45150t.mo46140b(this, f45134u[14], i);
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45148r.setValue(this, f45134u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45144n.getValue(this, f45134u[8]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45142l.getValue(this, f45134u[6]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45143m.getValue(this, f45134u[7]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45136f.getValue(this, f45134u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return this.f45140j.getValue(this, f45134u[4]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45137g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45138h.getValue(this, f45134u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45139i.getValue(this, f45134u[3])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45135e.getValue(this, f45134u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45141k.getValue(this, f45134u[5]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45147q.getValue(this, f45134u[11])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return this.f45150t.getValue(this, f45134u[14]).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45148r.getValue(this, f45134u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45145o.getValue(this, f45134u[9]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45146p.getValue(this, f45134u[10]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45144n.setValue(this, f45134u[8], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45149s.setValue(this, f45134u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45142l.setValue(this, f45134u[6], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45143m.setValue(this, f45134u[7], num);
        }
    }

    /* renamed from: jh.a$h0 */
    public static class C15962h0 extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45161u;

        /* renamed from: e */
        private final C18355e0 f45162e;

        /* renamed from: f */
        private final C18361h0 f45163f = new C18361h0(C15967e.f45182d);

        /* renamed from: g */
        private ImageView f45164g;

        /* renamed from: h */
        private final C18361h0 f45165h = new C18361h0(C15969g.f45184d);

        /* renamed from: i */
        private final C18361h0 f45166i = new C18361h0(C15970h.f45185d);

        /* renamed from: j */
        private final C18361h0 f45167j = new C18361h0(C15968f.f45183d);

        /* renamed from: k */
        private final C18361h0 f45168k = new C18361h0(C15971i.f45186d);

        /* renamed from: l */
        private final C18361h0 f45169l = new C18361h0(C15965c.f45180d);

        /* renamed from: m */
        private final C18361h0 f45170m = new C18361h0(C15966d.f45181d);

        /* renamed from: n */
        private final C18361h0 f45171n = new C18361h0(C15963a.f45178d);

        /* renamed from: o */
        private final C18361h0 f45172o = new C18361h0(C15975m.f45190d);

        /* renamed from: p */
        private final C18361h0 f45173p = new C18361h0(C15976n.f45191d);

        /* renamed from: q */
        private final C18361h0 f45174q = new C18361h0(C15972j.f45187d);

        /* renamed from: r */
        private final C18361h0 f45175r = new C18361h0(C15974l.f45189d);

        /* renamed from: s */
        private final C18361h0 f45176s = new C18361h0(C15964b.f45179d);

        /* renamed from: t */
        private final C18361h0 f45177t = new C18361h0(C15973k.f45188d);

        /* renamed from: jh.a$h0$a */
        static final class C15963a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15963a f45178d = new C15963a();

            C15963a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h0$b */
        static final class C15964b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15964b f45179d = new C15964b();

            C15964b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h0$c */
        static final class C15965c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15965c f45180d = new C15965c();

            C15965c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h0$d */
        static final class C15966d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15966d f45181d = new C15966d();

            C15966d() {
                super(0);
            }

            public final Object invoke() {
                return "TextLarge type doesn't support badge";
            }
        }

        /* renamed from: jh.a$h0$e */
        static final class C15967e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15967e f45182d = new C15967e();

            C15967e() {
                super(0);
            }

            public final Object invoke() {
                return "TextLarge type not supports icon";
            }
        }

        /* renamed from: jh.a$h0$f */
        static final class C15968f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15968f f45183d = new C15968f();

            C15968f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h0$g */
        static final class C15969g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15969g f45184d = new C15969g();

            C15969g() {
                super(0);
            }

            public final Object invoke() {
                return "TextLarge type not supports icon";
            }
        }

        /* renamed from: jh.a$h0$h */
        static final class C15970h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15970h f45185d = new C15970h();

            C15970h() {
                super(0);
            }

            public final Object invoke() {
                return "TextLarge type not supports loader";
            }
        }

        /* renamed from: jh.a$h0$i */
        static final class C15971i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15971i f45186d = new C15971i();

            C15971i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h0$j */
        static final class C15972j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15972j f45187d = new C15972j();

            C15972j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h0$k */
        static final class C15973k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15973k f45188d = new C15973k();

            C15973k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h0$l */
        static final class C15974l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15974l f45189d = new C15974l();

            C15974l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h0$m */
        static final class C15975m extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15975m f45190d = new C15975m();

            C15975m() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$h0$n */
        static final class C15976n extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15976n f45191d = new C15976n();

            C15976n() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15962h0> cls = C15962h0.class;
            f45161u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15962h0(C10052y1 y1Var) {
            super(y1Var, (DefaultConstructorMarker) null);
            C41536l.m120489i(y1Var, "binding");
            AppCompatTextView appCompatTextView = y1Var.f27770e;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f45162e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45163f.setValue(this, f45161u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45167j.setValue(this, f45161u[4], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45165h.setValue(this, f45161u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45166i.setValue(this, f45161u[3], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45162e.setValue(this, f45161u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45168k.setValue(this, f45161u[5], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45174q.setValue(this, f45161u[11], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45177t.setValue(this, f45161u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45175r.setValue(this, f45161u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45171n.getValue(this, f45161u[8]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45169l.getValue(this, f45161u[6]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45170m.getValue(this, f45161u[7]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return (Drawable) this.f45163f.getValue(this, f45161u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45167j.getValue(this, f45161u[4]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45164g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f45165h.getValue(this, f45161u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45166i.getValue(this, f45161u[3])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45162e.getValue(this, f45161u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45168k.getValue(this, f45161u[5]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45174q.getValue(this, f45161u[11])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45177t.getValue(this, f45161u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45175r.getValue(this, f45161u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45172o.getValue(this, f45161u[9]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45173p.getValue(this, f45161u[10]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C10052y1) mo43184b()).f27770e, C17786k.TextButton2Primary500Left);
            } else {
                C1314o.m4575q(((C10052y1) mo43184b()).f27770e, C17786k.TextButton2Primary150Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45171n.setValue(this, f45161u[8], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45176s.setValue(this, f45161u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45169l.setValue(this, f45161u[6], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45170m.setValue(this, f45161u[7], num);
        }
    }

    /* renamed from: jh.a$i */
    public static class C15977i extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45192u;

        /* renamed from: e */
        private final C18376o f45193e;

        /* renamed from: f */
        private ImageView f45194f;

        /* renamed from: g */
        private final C18381t f45195g;

        /* renamed from: h */
        private final C18355e0 f45196h;

        /* renamed from: i */
        private final C18361h0 f45197i = new C18361h0(C15982e.f45213d);

        /* renamed from: j */
        private final C18361h0 f45198j = new C18361h0(C15981d.f45212d);

        /* renamed from: k */
        private final C18361h0 f45199k = new C18361h0(C15983f.f45214d);

        /* renamed from: l */
        private final C18355e0 f45200l;

        /* renamed from: m */
        private final C18361h0 f45201m;

        /* renamed from: n */
        private final C18361h0 f45202n;

        /* renamed from: o */
        private final C18361h0 f45203o;

        /* renamed from: p */
        private final C18361h0 f45204p;

        /* renamed from: q */
        private final C18361h0 f45205q;

        /* renamed from: r */
        private final C18361h0 f45206r;

        /* renamed from: s */
        private final C18361h0 f45207s;

        /* renamed from: t */
        private final C18361h0 f45208t;

        /* renamed from: jh.a$i$a */
        static final class C15978a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15978a f45209d = new C15978a();

            C15978a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i$b */
        static final class C15979b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15979b f45210d = new C15979b();

            C15979b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i$c */
        static final class C15980c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15980c f45211d = new C15980c();

            C15980c() {
                super(0);
            }

            public final Object invoke() {
                return "Close Action Icon type doesn't support badge";
            }
        }

        /* renamed from: jh.a$i$d */
        static final class C15981d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15981d f45212d = new C15981d();

            C15981d() {
                super(0);
            }

            public final Object invoke() {
                return "Close Action Icon type does not support icon background tint";
            }
        }

        /* renamed from: jh.a$i$e */
        static final class C15982e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15982e f45213d = new C15982e();

            C15982e() {
                super(0);
            }

            public final Object invoke() {
                return "Close Action Icon type does not support loader";
            }
        }

        /* renamed from: jh.a$i$f */
        static final class C15983f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15983f f45214d = new C15983f();

            C15983f() {
                super(0);
            }

            public final Object invoke() {
                return "Close Action Icon type does not support text tint";
            }
        }

        /* renamed from: jh.a$i$g */
        static final class C15984g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15984g f45215d = new C15984g();

            C15984g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i$h */
        static final class C15985h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15985h f45216d = new C15985h();

            C15985h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i$i */
        static final class C15986i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15986i f45217d = new C15986i();

            C15986i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i$j */
        static final class C15987j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15987j f45218d = new C15987j();

            C15987j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i$k */
        static final class C15988k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15988k f45219d = new C15988k();

            C15988k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15977i> cls = C15977i.class;
            f45192u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15977i(C9901e1 e1Var) {
            super(e1Var, C17779d.width_close_action_icon, 0, 0, 0, 0, 60, (DefaultConstructorMarker) null);
            C41536l.m120489i(e1Var, "binding");
            AppCompatImageView appCompatImageView = e1Var.f26927g;
            C41536l.m120488h(appCompatImageView, "binding.icon");
            this.f45193e = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = e1Var.f26927g;
            this.f45194f = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.icon");
            this.f45195g = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView = e1Var.f26926f;
            C41536l.m120488h(appCompatTextView, "binding.buttonText");
            this.f45196h = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = e1Var.f26925e;
            C41536l.m120488h(appCompatTextView2, "binding.amountText");
            this.f45200l = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f45201m = new C18361h0(C15980c.f45211d);
            this.f45202n = new C18361h0(C15978a.f45209d);
            this.f45203o = new C18361h0(C15987j.f45218d);
            this.f45204p = new C18361h0(C15988k.f45219d);
            this.f45205q = new C18361h0(C15984g.f45215d);
            this.f45206r = new C18361h0(C15986i.f45217d);
            this.f45207s = new C18361h0(C15979b.f45210d);
            this.f45208t = new C18361h0(C15985h.f45216d);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45193e.setValue(this, f45192u[0], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45198j.setValue(this, f45192u[4], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45195g.setValue(this, f45192u[1], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45197i.setValue(this, f45192u[3], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45196h.setValue(this, f45192u[2], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45199k.setValue(this, f45192u[5], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45205q.setValue(this, f45192u[11], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45208t.setValue(this, f45192u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45206r.setValue(this, f45192u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45202n.getValue(this, f45192u[8]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return this.f45200l.getValue(this, f45192u[6]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45201m.getValue(this, f45192u[7]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45193e.getValue(this, f45192u[0]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45198j.getValue(this, f45192u[4]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45194f;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45195g.getValue(this, f45192u[1]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45197i.getValue(this, f45192u[3])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45196h.getValue(this, f45192u[2]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45199k.getValue(this, f45192u[5]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45205q.getValue(this, f45192u[11])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45208t.getValue(this, f45192u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45206r.getValue(this, f45192u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45203o.getValue(this, f45192u[9]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45204p.getValue(this, f45192u[10]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45202n.setValue(this, f45192u[8], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45207s.setValue(this, f45192u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45200l.setValue(this, f45192u[6], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45201m.setValue(this, f45192u[7], num);
        }
    }

    /* renamed from: jh.a$i0 */
    public static class C15989i0 extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45220u;

        /* renamed from: e */
        private final C18355e0 f45221e;

        /* renamed from: f */
        private final C18361h0 f45222f = new C18361h0(C15994e.f45241d);

        /* renamed from: g */
        private ImageView f45223g;

        /* renamed from: h */
        private final C18361h0 f45224h = new C18361h0(C15996g.f45243d);

        /* renamed from: i */
        private final C18361h0 f45225i = new C18361h0(C15997h.f45244d);

        /* renamed from: j */
        private final C18361h0 f45226j = new C18361h0(C15995f.f45242d);

        /* renamed from: k */
        private final C18361h0 f45227k = new C18361h0(C15998i.f45245d);

        /* renamed from: l */
        private final C18361h0 f45228l = new C18361h0(C15992c.f45239d);

        /* renamed from: m */
        private final C18361h0 f45229m = new C18361h0(C15993d.f45240d);

        /* renamed from: n */
        private final C18361h0 f45230n = new C18361h0(C15990a.f45237d);

        /* renamed from: o */
        private final C18361h0 f45231o = new C18361h0(C16002m.f45249d);

        /* renamed from: p */
        private final C18361h0 f45232p = new C18361h0(C16003n.f45250d);

        /* renamed from: q */
        private final C18361h0 f45233q = new C18361h0(C15999j.f45246d);

        /* renamed from: r */
        private final C18361h0 f45234r = new C18361h0(C16001l.f45248d);

        /* renamed from: s */
        private final C18361h0 f45235s = new C18361h0(C15991b.f45238d);

        /* renamed from: t */
        private final C18361h0 f45236t = new C18361h0(C16000k.f45247d);

        /* renamed from: jh.a$i0$a */
        static final class C15990a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15990a f45237d = new C15990a();

            C15990a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i0$b */
        static final class C15991b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15991b f45238d = new C15991b();

            C15991b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i0$c */
        static final class C15992c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15992c f45239d = new C15992c();

            C15992c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i0$d */
        static final class C15993d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15993d f45240d = new C15993d();

            C15993d() {
                super(0);
            }

            public final Object invoke() {
                return "TextSmall type doesn't support badge";
            }
        }

        /* renamed from: jh.a$i0$e */
        static final class C15994e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15994e f45241d = new C15994e();

            C15994e() {
                super(0);
            }

            public final Object invoke() {
                return "TextSmall type not supports icon";
            }
        }

        /* renamed from: jh.a$i0$f */
        static final class C15995f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15995f f45242d = new C15995f();

            C15995f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i0$g */
        static final class C15996g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15996g f45243d = new C15996g();

            C15996g() {
                super(0);
            }

            public final Object invoke() {
                return "TextSmall type not supports icon";
            }
        }

        /* renamed from: jh.a$i0$h */
        static final class C15997h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15997h f45244d = new C15997h();

            C15997h() {
                super(0);
            }

            public final Object invoke() {
                return "TextSmall type not supports loader";
            }
        }

        /* renamed from: jh.a$i0$i */
        static final class C15998i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15998i f45245d = new C15998i();

            C15998i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i0$j */
        static final class C15999j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C15999j f45246d = new C15999j();

            C15999j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i0$k */
        static final class C16000k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16000k f45247d = new C16000k();

            C16000k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i0$l */
        static final class C16001l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16001l f45248d = new C16001l();

            C16001l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i0$m */
        static final class C16002m extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16002m f45249d = new C16002m();

            C16002m() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$i0$n */
        static final class C16003n extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16003n f45250d = new C16003n();

            C16003n() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C15989i0> cls = C15989i0.class;
            f45220u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15989i0(C10052y1 y1Var) {
            super(y1Var, (DefaultConstructorMarker) null);
            C41536l.m120489i(y1Var, "binding");
            AppCompatTextView appCompatTextView = y1Var.f27770e;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f45221e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45222f.setValue(this, f45220u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45226j.setValue(this, f45220u[4], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45224h.setValue(this, f45220u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45225i.setValue(this, f45220u[3], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45221e.setValue(this, f45220u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45227k.setValue(this, f45220u[5], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45233q.setValue(this, f45220u[11], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45236t.setValue(this, f45220u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45234r.setValue(this, f45220u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45230n.getValue(this, f45220u[8]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45228l.getValue(this, f45220u[6]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45229m.getValue(this, f45220u[7]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return (Drawable) this.f45222f.getValue(this, f45220u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45226j.getValue(this, f45220u[4]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45223g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f45224h.getValue(this, f45220u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45225i.getValue(this, f45220u[3])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45221e.getValue(this, f45220u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45227k.getValue(this, f45220u[5]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45233q.getValue(this, f45220u[11])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45236t.getValue(this, f45220u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45234r.getValue(this, f45220u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45231o.getValue(this, f45220u[9]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45232p.getValue(this, f45220u[10]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C10052y1) mo43184b()).f27770e, C17786k.TextSmallButtonPrimary500Left);
            } else {
                C1314o.m4575q(((C10052y1) mo43184b()).f27770e, C17786k.TextSmallButtonPrimary150Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45230n.setValue(this, f45220u[8], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45235s.setValue(this, f45220u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45228l.setValue(this, f45220u[6], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45229m.setValue(this, f45220u[7], num);
        }
    }

    /* renamed from: jh.a$j */
    public static class C16004j extends C15769a {

        /* renamed from: t */
        static final /* synthetic */ C40303i[] f45251t;

        /* renamed from: e */
        private final C18381t f45252e;

        /* renamed from: f */
        private ImageView f45253f;

        /* renamed from: g */
        private final C18355e0 f45254g;

        /* renamed from: h */
        private final C18361h0 f45255h = new C18361h0(C16005a.f45267d);

        /* renamed from: i */
        private final C18361h0 f45256i = new C18361h0(C16009e.f45271d);

        /* renamed from: j */
        private final C18361h0 f45257j = new C18361h0(C16008d.f45270d);

        /* renamed from: k */
        private final C18361h0 f45258k = new C18361h0(C16010f.f45272d);

        /* renamed from: l */
        private final C18355e0 f45259l;

        /* renamed from: m */
        private final C18361h0 f45260m;

        /* renamed from: n */
        private final C18361h0 f45261n;

        /* renamed from: o */
        private final C18361h0 f45262o;

        /* renamed from: p */
        private final C18361h0 f45263p;

        /* renamed from: q */
        private final C18361h0 f45264q;

        /* renamed from: r */
        private final C18361h0 f45265r;

        /* renamed from: s */
        private final C18361h0 f45266s;

        /* renamed from: jh.a$j$a */
        static final class C16005a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16005a f45267d = new C16005a();

            C16005a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$j$b */
        static final class C16006b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16006b f45268d = new C16006b();

            C16006b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$j$c */
        static final class C16007c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16007c f45269d = new C16007c();

            C16007c() {
                super(0);
            }

            public final Object invoke() {
                return "Close Action Thumbnail type doesn't support badge";
            }
        }

        /* renamed from: jh.a$j$d */
        static final class C16008d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16008d f45270d = new C16008d();

            C16008d() {
                super(0);
            }

            public final Object invoke() {
                return "Close Action Thumbnail type doesn't support icon background tint";
            }
        }

        /* renamed from: jh.a$j$e */
        static final class C16009e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16009e f45271d = new C16009e();

            C16009e() {
                super(0);
            }

            public final Object invoke() {
                return "Close Action Thumbnail type does not support loader";
            }
        }

        /* renamed from: jh.a$j$f */
        static final class C16010f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16010f f45272d = new C16010f();

            C16010f() {
                super(0);
            }

            public final Object invoke() {
                return "Close Action Thumbnail type doesn't support text tint";
            }
        }

        /* renamed from: jh.a$j$g */
        static final class C16011g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16011g f45273d = new C16011g();

            C16011g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$j$h */
        static final class C16012h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16012h f45274d = new C16012h();

            C16012h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$j$i */
        static final class C16013i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16013i f45275d = new C16013i();

            C16013i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$j$j */
        static final class C16014j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16014j f45276d = new C16014j();

            C16014j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$j$k */
        static final class C16015k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16015k f45277d = new C16015k();

            C16015k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16004j> cls = C16004j.class;
            f45251t = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16004j(C9909f1 f1Var) {
            super(f1Var, C17779d.width_close_action_thumbnail, 0, 0, 0, 0, 60, (DefaultConstructorMarker) null);
            C41536l.m120489i(f1Var, "binding");
            AppCompatImageView appCompatImageView = f1Var.f26976g;
            C41536l.m120488h(appCompatImageView, "binding.logo");
            this.f45252e = new C18381t(appCompatImageView, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            this.f45253f = f1Var.f26976g;
            AppCompatTextView appCompatTextView = f1Var.f26975f;
            C41536l.m120488h(appCompatTextView, "binding.buttonText");
            this.f45254g = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = f1Var.f26974e;
            C41536l.m120488h(appCompatTextView2, "binding.amountText");
            this.f45259l = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f45260m = new C18361h0(C16007c.f45269d);
            this.f45261n = new C18361h0(C16014j.f45276d);
            this.f45262o = new C18361h0(C16015k.f45277d);
            this.f45263p = new C18361h0(C16011g.f45273d);
            this.f45264q = new C18361h0(C16013i.f45275d);
            this.f45265r = new C18361h0(C16006b.f45268d);
            this.f45266s = new C18361h0(C16012h.f45274d);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            ((C2394j) ((C2394j) C2379b.m9210t(mo43194l()).mo7751t(drawable).mo7222d()).mo7220c0(C17780e.f49668q1)).mo7718L0(((C9909f1) mo43184b()).f26976g);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45257j.setValue(this, f45251t[4], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45252e.setValue(this, f45251t[0], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45256i.setValue(this, f45251t[3], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45254g.setValue(this, f45251t[1], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45258k.setValue(this, f45251t[5], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45263p.setValue(this, f45251t[10], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45266s.setValue(this, f45251t[13], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45264q.setValue(this, f45251t[11], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45255h.getValue(this, f45251t[2]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return this.f45259l.getValue(this, f45251t[6]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45260m.getValue(this, f45251t[7]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return ((C9909f1) mo43184b()).f26976g.getDrawable();
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45257j.getValue(this, f45251t[4]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45253f;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45252e.getValue(this, f45251t[0]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45256i.getValue(this, f45251t[3])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45254g.getValue(this, f45251t[1]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45258k.getValue(this, f45251t[5]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45263p.getValue(this, f45251t[10])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45266s.getValue(this, f45251t[13])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45264q.getValue(this, f45251t[11]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45261n.getValue(this, f45251t[8]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45262o.getValue(this, f45251t[9]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45255h.setValue(this, f45251t[2], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45265r.setValue(this, f45251t[12], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45259l.setValue(this, f45251t[6], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45260m.setValue(this, f45251t[7], num);
        }
    }

    /* renamed from: jh.a$k */
    public static class C16016k extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45278u;

        /* renamed from: e */
        private final C18355e0 f45279e;

        /* renamed from: f */
        private final C18376o f45280f;

        /* renamed from: g */
        private ImageView f45281g;

        /* renamed from: h */
        private final C18381t f45282h;

        /* renamed from: i */
        private final C18361h0 f45283i = new C18361h0(C16022f.f45300d);

        /* renamed from: j */
        private final C18361h0 f45284j = new C18361h0(C16021e.f45299d);

        /* renamed from: k */
        private final C18361h0 f45285k = new C18361h0(C16023g.f45301d);

        /* renamed from: l */
        private final C18361h0 f45286l = new C18361h0(C16019c.f45297d);

        /* renamed from: m */
        private final C18361h0 f45287m = new C18361h0(C16020d.f45298d);

        /* renamed from: n */
        private final C18361h0 f45288n = new C18361h0(C16017a.f45295d);

        /* renamed from: o */
        private final C18361h0 f45289o = new C18361h0(C16027k.f45305d);

        /* renamed from: p */
        private final C18361h0 f45290p = new C18361h0(C16028l.f45306d);

        /* renamed from: q */
        private final C18361h0 f45291q = new C18361h0(C16024h.f45302d);

        /* renamed from: r */
        private final C18361h0 f45292r = new C18361h0(C16026j.f45304d);

        /* renamed from: s */
        private final C18361h0 f45293s = new C18361h0(C16018b.f45296d);

        /* renamed from: t */
        private final C18361h0 f45294t = new C18361h0(C16025i.f45303d);

        /* renamed from: jh.a$k$a */
        static final class C16017a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16017a f45295d = new C16017a();

            C16017a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$k$b */
        static final class C16018b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16018b f45296d = new C16018b();

            C16018b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$k$c */
        static final class C16019c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16019c f45297d = new C16019c();

            C16019c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$k$d */
        static final class C16020d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16020d f45298d = new C16020d();

            C16020d() {
                super(0);
            }

            public final Object invoke() {
                return "Function type doesn't support badge";
            }
        }

        /* renamed from: jh.a$k$e */
        static final class C16021e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16021e f45299d = new C16021e();

            C16021e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$k$f */
        static final class C16022f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16022f f45300d = new C16022f();

            C16022f() {
                super(0);
            }

            public final Object invoke() {
                return "Function type not supports loader";
            }
        }

        /* renamed from: jh.a$k$g */
        static final class C16023g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16023g f45301d = new C16023g();

            C16023g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$k$h */
        static final class C16024h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16024h f45302d = new C16024h();

            C16024h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$k$i */
        static final class C16025i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16025i f45303d = new C16025i();

            C16025i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$k$j */
        static final class C16026j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16026j f45304d = new C16026j();

            C16026j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$k$k */
        static final class C16027k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16027k f45305d = new C16027k();

            C16027k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$k$l */
        static final class C16028l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16028l f45306d = new C16028l();

            C16028l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16016k> cls = C16016k.class;
            f45278u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C16016k(p352ak.C9925h1 r18) {
            /*
                r17 = this;
                r9 = r17
                r10 = r18
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                int r4 = p601sg.C17779d.width_min_button_function
                int r3 = p601sg.C17779d.height_button_function
                int r5 = p601sg.C17780e.selector_button_function
                int r6 = p601sg.C17786k.LayerRadius24Shadow0
                r2 = 0
                r7 = 2
                r8 = 0
                r0 = r17
                r1 = r18
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                vh.e0 r0 = new vh.e0
                androidx.appcompat.widget.AppCompatTextView r12 = r10.f27053f
                java.lang.String r1 = "binding.textView"
                kotlin.jvm.internal.C41536l.m120488h(r12, r1)
                r13 = 0
                r14 = 0
                r15 = 6
                r16 = 0
                r11 = r0
                r11.<init>(r12, r13, r14, r15, r16)
                r9.f45279e = r0
                vh.o r0 = new vh.o
                androidx.appcompat.widget.AppCompatImageView r1 = r10.f27052e
                java.lang.String r2 = "binding.iconView"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                r0.<init>(r1)
                r9.f45280f = r0
                androidx.appcompat.widget.AppCompatImageView r0 = r10.f27052e
                r9.f45281g = r0
                vh.t r1 = new vh.t
                kotlin.jvm.internal.C41536l.m120488h(r0, r2)
                r2 = 0
                r3 = 2
                r1.<init>(r0, r2, r3, r2)
                r9.f45282h = r1
                vh.h0 r0 = new vh.h0
                jh.a$k$f r1 = p476jh.C15769a.C16016k.C16022f.f45300d
                r0.<init>(r1)
                r9.f45283i = r0
                vh.h0 r0 = new vh.h0
                jh.a$k$e r1 = p476jh.C15769a.C16016k.C16021e.f45299d
                r0.<init>(r1)
                r9.f45284j = r0
                vh.h0 r0 = new vh.h0
                jh.a$k$g r1 = p476jh.C15769a.C16016k.C16023g.f45301d
                r0.<init>(r1)
                r9.f45285k = r0
                vh.h0 r0 = new vh.h0
                jh.a$k$c r1 = p476jh.C15769a.C16016k.C16019c.f45297d
                r0.<init>(r1)
                r9.f45286l = r0
                vh.h0 r0 = new vh.h0
                jh.a$k$d r1 = p476jh.C15769a.C16016k.C16020d.f45298d
                r0.<init>(r1)
                r9.f45287m = r0
                vh.h0 r0 = new vh.h0
                jh.a$k$a r1 = p476jh.C15769a.C16016k.C16017a.f45295d
                r0.<init>(r1)
                r9.f45288n = r0
                vh.h0 r0 = new vh.h0
                jh.a$k$k r1 = p476jh.C15769a.C16016k.C16027k.f45305d
                r0.<init>(r1)
                r9.f45289o = r0
                vh.h0 r0 = new vh.h0
                jh.a$k$l r1 = p476jh.C15769a.C16016k.C16028l.f45306d
                r0.<init>(r1)
                r9.f45290p = r0
                vh.h0 r0 = new vh.h0
                jh.a$k$h r1 = p476jh.C15769a.C16016k.C16024h.f45302d
                r0.<init>(r1)
                r9.f45291q = r0
                vh.h0 r0 = new vh.h0
                jh.a$k$j r1 = p476jh.C15769a.C16016k.C16026j.f45304d
                r0.<init>(r1)
                r9.f45292r = r0
                vh.h0 r0 = new vh.h0
                jh.a$k$b r1 = p476jh.C15769a.C16016k.C16018b.f45296d
                r0.<init>(r1)
                r9.f45293s = r0
                vh.h0 r0 = new vh.h0
                jh.a$k$i r1 = p476jh.C15769a.C16016k.C16025i.f45303d
                r0.<init>(r1)
                r9.f45294t = r0
                androidx.appcompat.widget.AppCompatImageView r0 = r10.f27052e
                android.content.Context r0 = r0.getContext()
                int r1 = p601sg.C17778c.selector_button_function_icon
                android.content.res.ColorStateList r0 = p045d.C5769a.m23209a(r0, r1)
                r9.mo43176C(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p476jh.C15769a.C16016k.<init>(ak.h1):void");
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45280f.setValue(this, f45278u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45284j.setValue(this, f45278u[4], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45282h.setValue(this, f45278u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45283i.setValue(this, f45278u[3], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45279e.setValue(this, f45278u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45285k.setValue(this, f45278u[5], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45291q.setValue(this, f45278u[11], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45294t.setValue(this, f45278u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45292r.setValue(this, f45278u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45288n.getValue(this, f45278u[8]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45286l.getValue(this, f45278u[6]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45287m.getValue(this, f45278u[7]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45280f.getValue(this, f45278u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45284j.getValue(this, f45278u[4]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45281g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45282h.getValue(this, f45278u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45283i.getValue(this, f45278u[3])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45279e.getValue(this, f45278u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45285k.getValue(this, f45278u[5]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45291q.getValue(this, f45278u[11])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45294t.getValue(this, f45278u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45292r.getValue(this, f45278u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45289o.getValue(this, f45278u[9]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45290p.getValue(this, f45278u[10]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C9925h1) mo43184b()).f27053f, C17786k.f49835t0);
            } else {
                C1314o.m4575q(((C9925h1) mo43184b()).f27053f, C17786k.TextCaption1InvertComponents150Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45288n.setValue(this, f45278u[8], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45293s.setValue(this, f45278u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45286l.setValue(this, f45278u[6], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45287m.setValue(this, f45278u[7], num);
        }
    }

    /* renamed from: jh.a$l */
    public static class C16029l extends C15769a {

        /* renamed from: t */
        static final /* synthetic */ C40303i[] f45307t;

        /* renamed from: e */
        private final C18361h0 f45308e = new C18361h0(C16033d.f45326d);

        /* renamed from: f */
        private final C18361h0 f45309f = new C18361h0(C16035f.f45328d);

        /* renamed from: g */
        private final C18361h0 f45310g = new C18361h0(C16034e.f45327d);

        /* renamed from: h */
        private final C18361h0 f45311h = new C18361h0(C16031b.f45324d);

        /* renamed from: i */
        private final C18361h0 f45312i = new C18361h0(C16032c.f45325d);

        /* renamed from: j */
        private final C18361h0 f45313j = new C18361h0(C16039j.f45332d);

        /* renamed from: k */
        private final C18361h0 f45314k = new C18361h0(C16040k.f45333d);

        /* renamed from: l */
        private final C18361h0 f45315l = new C18361h0(C16036g.f45329d);

        /* renamed from: m */
        private final C18361h0 f45316m = new C18361h0(C16038i.f45331d);

        /* renamed from: n */
        private final C18361h0 f45317n = new C18361h0(C16030a.f45323d);

        /* renamed from: o */
        private final C18361h0 f45318o = new C18361h0(C16037h.f45330d);

        /* renamed from: p */
        private final C18355e0 f45319p;

        /* renamed from: q */
        private ImageView f45320q;

        /* renamed from: r */
        private final C18381t f45321r;

        /* renamed from: s */
        private final C18352d f45322s;

        /* renamed from: jh.a$l$a */
        static final class C16030a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16030a f45323d = new C16030a();

            C16030a() {
                super(0);
            }

            public final Object invoke() {
                return "Hub Action type doesn't support a badge color";
            }
        }

        /* renamed from: jh.a$l$b */
        static final class C16031b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16031b f45324d = new C16031b();

            C16031b() {
                super(0);
            }

            public final Object invoke() {
                return "Hub Action type doesn't support amount text";
            }
        }

        /* renamed from: jh.a$l$c */
        static final class C16032c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16032c f45325d = new C16032c();

            C16032c() {
                super(0);
            }

            public final Object invoke() {
                return "Hub Action type doesn't support badge";
            }
        }

        /* renamed from: jh.a$l$d */
        static final class C16033d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16033d f45326d = new C16033d();

            C16033d() {
                super(0);
            }

            public final Object invoke() {
                return "Hub Action type doesn't support background tint";
            }
        }

        /* renamed from: jh.a$l$e */
        static final class C16034e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16034e f45327d = new C16034e();

            C16034e() {
                super(0);
            }

            public final Object invoke() {
                return "Hub Action type doesn't support loader";
            }
        }

        /* renamed from: jh.a$l$f */
        static final class C16035f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16035f f45328d = new C16035f();

            C16035f() {
                super(0);
            }

            public final Object invoke() {
                return "Hub Action type doesn't support text tint";
            }
        }

        /* renamed from: jh.a$l$g */
        static final class C16036g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16036g f45329d = new C16036g();

            C16036g() {
                super(0);
            }

            public final Object invoke() {
                return "Hub Action type doesn't support a icon before text";
            }
        }

        /* renamed from: jh.a$l$h */
        static final class C16037h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16037h f45330d = new C16037h();

            C16037h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$l$i */
        static final class C16038i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16038i f45331d = new C16038i();

            C16038i() {
                super(0);
            }

            public final Object invoke() {
                return "Hub Action type doesn't support a text color";
            }
        }

        /* renamed from: jh.a$l$j */
        static final class C16039j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16039j f45332d = new C16039j();

            C16039j() {
                super(0);
            }

            public final Object invoke() {
                return "Hub Action type doesn't support a thumbnail icon badge";
            }
        }

        /* renamed from: jh.a$l$k */
        static final class C16040k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16040k f45333d = new C16040k();

            C16040k() {
                super(0);
            }

            public final Object invoke() {
                return "Hub Action type doesn't support a verification badge view";
            }
        }

        static {
            Class<C16029l> cls = C16029l.class;
            f45307t = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0)), C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16029l(C9943j3 j3Var) {
            super(j3Var, C17779d.hub_action_button_width, 0, 0, 0, 0, 60, (DefaultConstructorMarker) null);
            C41536l.m120489i(j3Var, "binding");
            AppCompatTextView appCompatTextView = j3Var.f27148h;
            C41536l.m120488h(appCompatTextView, "binding.hubTitle");
            this.f45319p = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView = j3Var.f27147g;
            this.f45320q = appCompatImageView;
            C41536l.m120488h(appCompatImageView, "binding.hubIcon");
            this.f45321r = new C18381t(appCompatImageView, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            LayerView layerView = j3Var.f27145e;
            C41536l.m120488h(layerView, "binding.hubBackground");
            this.f45322s = new C18352d(layerView);
        }

        /* renamed from: J */
        private final ColorDrawable m57388J(boolean z, boolean z2) {
            if (!z) {
                return new ColorDrawable(C18368l.m62755d(mo43194l(), C17777b.color_white_tr_150));
            }
            if (z2) {
                return new ColorDrawable(C18368l.m62755d(mo43194l(), C17777b.color_black_tr_25));
            }
            return null;
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            ((C2394j) C2379b.m9210t(mo43194l()).mo7751t(drawable).mo7220c0(C17780e.f49662k1)).mo7718L0(((C9943j3) mo43184b()).f27147g);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45308e.setValue(this, f45307t[0], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45321r.setValue(this, f45307t[12], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45310g.setValue(this, f45307t[2], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45319p.setValue(this, f45307t[11], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45309f.setValue(this, f45307t[1], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45315l.setValue(this, f45307t[7], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45318o.setValue(this, f45307t[10], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45316m.setValue(this, f45307t[8], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return this.f45322s.getValue(this, f45307t[13]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45311h.getValue(this, f45307t[3]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45312i.getValue(this, f45307t[4]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return ((C9943j3) mo43184b()).f27147g.getDrawable();
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45308e.getValue(this, f45307t[0]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45320q;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45321r.getValue(this, f45307t[12]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45310g.getValue(this, f45307t[2])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45319p.getValue(this, f45307t[11]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45309f.getValue(this, f45307t[1]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45315l.getValue(this, f45307t[7])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45318o.getValue(this, f45307t[10])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45316m.getValue(this, f45307t[8]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45313j.getValue(this, f45307t[5]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45314k.getValue(this, f45307t[6]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            ((C9943j3) mo43184b()).f27145e.setForeground(m57388J(z, z2));
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45322s.setValue(this, f45307t[13], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45317n.setValue(this, f45307t[9], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45311h.setValue(this, f45307t[3], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45312i.setValue(this, f45307t[4], num);
        }
    }

    /* renamed from: jh.a$m */
    public static class C16041m extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45334u;

        /* renamed from: e */
        private CharSequence f45335e;

        /* renamed from: f */
        private final C18376o f45336f;

        /* renamed from: g */
        private ImageView f45337g;

        /* renamed from: h */
        private final C18381t f45338h;

        /* renamed from: i */
        private final C18361h0 f45339i = new C18361h0(C16047f.f45356d);

        /* renamed from: j */
        private final C18361h0 f45340j = new C18361h0(C16046e.f45355d);

        /* renamed from: k */
        private final C18361h0 f45341k = new C18361h0(C16048g.f45357d);

        /* renamed from: l */
        private final C18361h0 f45342l = new C18361h0(C16044c.f45353d);

        /* renamed from: m */
        private final C18361h0 f45343m = new C18361h0(C16045d.f45354d);

        /* renamed from: n */
        private final C18361h0 f45344n = new C18361h0(C16042a.f45351d);

        /* renamed from: o */
        private final C18361h0 f45345o = new C18361h0(C16052k.f45361d);

        /* renamed from: p */
        private final C18361h0 f45346p = new C18361h0(C16053l.f45362d);

        /* renamed from: q */
        private final C18361h0 f45347q = new C18361h0(C16049h.f45358d);

        /* renamed from: r */
        private final C18361h0 f45348r = new C18361h0(C16051j.f45360d);

        /* renamed from: s */
        private final C18361h0 f45349s = new C18361h0(C16043b.f45352d);

        /* renamed from: t */
        private final C18361h0 f45350t = new C18361h0(C16050i.f45359d);

        /* renamed from: jh.a$m$a */
        static final class C16042a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16042a f45351d = new C16042a();

            C16042a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$m$b */
        static final class C16043b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16043b f45352d = new C16043b();

            C16043b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$m$c */
        static final class C16044c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16044c f45353d = new C16044c();

            C16044c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$m$d */
        static final class C16045d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16045d f45354d = new C16045d();

            C16045d() {
                super(0);
            }

            public final Object invoke() {
                return "IconNormal type doesn't support badge";
            }
        }

        /* renamed from: jh.a$m$e */
        static final class C16046e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16046e f45355d = new C16046e();

            C16046e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$m$f */
        static final class C16047f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16047f f45356d = new C16047f();

            C16047f() {
                super(0);
            }

            public final Object invoke() {
                return "IconNormal type not supports loader";
            }
        }

        /* renamed from: jh.a$m$g */
        static final class C16048g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16048g f45357d = new C16048g();

            C16048g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$m$h */
        static final class C16049h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16049h f45358d = new C16049h();

            C16049h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$m$i */
        static final class C16050i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16050i f45359d = new C16050i();

            C16050i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$m$j */
        static final class C16051j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16051j f45360d = new C16051j();

            C16051j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$m$k */
        static final class C16052k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16052k f45361d = new C16052k();

            C16052k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$m$l */
        static final class C16053l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16053l f45362d = new C16053l();

            C16053l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16041m> cls = C16041m.class;
            f45334u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16041m(C9933i1 i1Var) {
            super(i1Var, C17779d.width_icon_button_normal, C17779d.height_icon_button_normal, 0, C17780e.selector_button_icon_normal, C17786k.LayerRadiusCircleShadow0, 8, (DefaultConstructorMarker) null);
            C41536l.m120489i(i1Var, "binding");
            AppCompatImageView appCompatImageView = i1Var.f27092e;
            C41536l.m120488h(appCompatImageView, "binding.buttonIconImage");
            this.f45336f = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = i1Var.f27092e;
            this.f45337g = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.buttonIconImage");
            this.f45338h = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            mo43176C(C5769a.m23209a(i1Var.f27092e.getContext(), C17778c.selector_button_icon_normal_icon));
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45336f.setValue(this, f45334u[0], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45340j.setValue(this, f45334u[3], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45338h.setValue(this, f45334u[1], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45339i.setValue(this, f45334u[2], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45335e = charSequence;
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45341k.setValue(this, f45334u[4], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45347q.setValue(this, f45334u[10], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45350t.setValue(this, f45334u[13], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45348r.setValue(this, f45334u[11], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45344n.getValue(this, f45334u[7]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45342l.getValue(this, f45334u[5]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45343m.getValue(this, f45334u[6]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45336f.getValue(this, f45334u[0]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45340j.getValue(this, f45334u[3]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45337g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45338h.getValue(this, f45334u[1]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45339i.getValue(this, f45334u[2])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45335e;
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45341k.getValue(this, f45334u[4]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45347q.getValue(this, f45334u[10])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45350t.getValue(this, f45334u[13])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45348r.getValue(this, f45334u[11]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45345o.getValue(this, f45334u[8]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45346p.getValue(this, f45334u[9]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45344n.setValue(this, f45334u[7], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45349s.setValue(this, f45334u[12], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45342l.setValue(this, f45334u[5], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45343m.setValue(this, f45334u[6], num);
        }
    }

    /* renamed from: jh.a$n */
    public static class C16054n extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45363u;

        /* renamed from: e */
        private CharSequence f45364e;

        /* renamed from: f */
        private final C18376o f45365f;

        /* renamed from: g */
        private ImageView f45366g;

        /* renamed from: h */
        private final C18381t f45367h;

        /* renamed from: i */
        private final C18361h0 f45368i = new C18361h0(C16059e.f45384d);

        /* renamed from: j */
        private final C18361h0 f45369j = new C18361h0(C16058d.f45383d);

        /* renamed from: k */
        private final C18361h0 f45370k = new C18361h0(C16060f.f45385d);

        /* renamed from: l */
        private final C18361h0 f45371l = new C18361h0(C16056b.f45381d);

        /* renamed from: m */
        private final C18361h0 f45372m = new C18361h0(C16057c.f45382d);

        /* renamed from: n */
        private final C18361h0 f45373n = new C18361h0(C16055a.f45380d);

        /* renamed from: o */
        private final C18361h0 f45374o = new C18361h0(C16064j.f45389d);

        /* renamed from: p */
        private final C18361h0 f45375p = new C18361h0(C16065k.f45390d);

        /* renamed from: q */
        private final C18361h0 f45376q = new C18361h0(C16061g.f45386d);

        /* renamed from: r */
        private final C18361h0 f45377r = new C18361h0(C16063i.f45388d);

        /* renamed from: s */
        private Integer f45378s;

        /* renamed from: t */
        private final C18361h0 f45379t = new C18361h0(C16062h.f45387d);

        /* renamed from: jh.a$n$a */
        static final class C16055a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16055a f45380d = new C16055a();

            C16055a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$n$b */
        static final class C16056b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16056b f45381d = new C16056b();

            C16056b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$n$c */
        static final class C16057c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16057c f45382d = new C16057c();

            C16057c() {
                super(0);
            }

            public final Object invoke() {
                return "IconSmall type doesn't support number badge";
            }
        }

        /* renamed from: jh.a$n$d */
        static final class C16058d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16058d f45383d = new C16058d();

            C16058d() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$n$e */
        static final class C16059e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16059e f45384d = new C16059e();

            C16059e() {
                super(0);
            }

            public final Object invoke() {
                return "IconSmall type not supports loader";
            }
        }

        /* renamed from: jh.a$n$f */
        static final class C16060f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16060f f45385d = new C16060f();

            C16060f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$n$g */
        static final class C16061g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16061g f45386d = new C16061g();

            C16061g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$n$h */
        static final class C16062h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16062h f45387d = new C16062h();

            C16062h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$n$i */
        static final class C16063i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16063i f45388d = new C16063i();

            C16063i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$n$j */
        static final class C16064j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16064j f45389d = new C16064j();

            C16064j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$n$k */
        static final class C16065k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16065k f45390d = new C16065k();

            C16065k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16054n> cls = C16054n.class;
            f45363u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16054n(C9949k1 k1Var) {
            super(k1Var, C17779d.width_icon_button_small, C17779d.height_icon_button_small, 0, 0, 0, 56, (DefaultConstructorMarker) null);
            C41536l.m120489i(k1Var, "binding");
            AppCompatImageView appCompatImageView = k1Var.f27188e;
            C41536l.m120488h(appCompatImageView, "binding.buttonIconImage");
            this.f45365f = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = k1Var.f27188e;
            this.f45366g = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.buttonIconImage");
            this.f45367h = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            mo43176C(C5769a.m23209a(k1Var.f27188e.getContext(), C17778c.selector_button_icon_small_icon));
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45365f.setValue(this, f45363u[0], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45369j.setValue(this, f45363u[3], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45367h.setValue(this, f45363u[1], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45368i.setValue(this, f45363u[2], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45364e = charSequence;
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45370k.setValue(this, f45363u[4], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45376q.setValue(this, f45363u[10], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45379t.setValue(this, f45363u[12], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45377r.setValue(this, f45363u[11], colorStateList);
        }

        /* renamed from: J */
        public Integer mo43209J() {
            return this.f45378s;
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45373n.getValue(this, f45363u[7]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45371l.getValue(this, f45363u[5]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45372m.getValue(this, f45363u[6]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45365f.getValue(this, f45363u[0]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45369j.getValue(this, f45363u[3]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45366g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45367h.getValue(this, f45363u[1]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45368i.getValue(this, f45363u[2])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45364e;
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45370k.getValue(this, f45363u[4]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45376q.getValue(this, f45363u[10])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45379t.getValue(this, f45363u[12])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45377r.getValue(this, f45363u[11]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45374o.getValue(this, f45363u[8]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45375p.getValue(this, f45363u[9]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            int i;
            int i2;
            if (z5) {
                ((C9949k1) mo43184b()).mo3946b().getBadgeView().setVisibility(0);
            } else {
                ((C9949k1) mo43184b()).mo3946b().getBadgeView().setVisibility(8);
            }
            if (z || z2) {
                NotificationBadgeView badgeView = ((C9949k1) mo43184b()).mo3946b().getBadgeView();
                Context l = mo43194l();
                Integer J = mo43209J();
                if (J != null) {
                    i = J.intValue();
                } else {
                    i = C17778c.color_negative_solid_400;
                }
                badgeView.setBadgeColor(Integer.valueOf(C0767a.m2893c(l, i)));
                return;
            }
            NotificationBadgeView badgeView2 = ((C9949k1) mo43184b()).mo3946b().getBadgeView();
            Context l2 = mo43194l();
            Integer J2 = mo43209J();
            if (J2 != null) {
                i2 = J2.intValue();
            } else {
                i2 = C17778c.color_negative_solid_150;
            }
            badgeView2.setBadgeColor(Integer.valueOf(C0767a.m2893c(l2, i2)));
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45373n.setValue(this, f45363u[7], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45378s = num;
            if (num != null) {
                ((C9949k1) mo43184b()).mo3946b().getBadgeView().setBadgeColor(Integer.valueOf(C0767a.m2893c(mo43194l(), num.intValue())));
            }
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45371l.setValue(this, f45363u[5], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45372m.setValue(this, f45363u[6], num);
        }
    }

    /* renamed from: jh.a$o */
    public static class C16066o extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45391u;

        /* renamed from: e */
        private final C18376o f45392e;

        /* renamed from: f */
        private ImageView f45393f;

        /* renamed from: g */
        private final C18381t f45394g;

        /* renamed from: h */
        private CharSequence f45395h;

        /* renamed from: i */
        private final C18361h0 f45396i = new C18361h0(C16072f.f45413d);

        /* renamed from: j */
        private final C18361h0 f45397j = new C18361h0(C16071e.f45412d);

        /* renamed from: k */
        private final C18361h0 f45398k = new C18361h0(C16073g.f45414d);

        /* renamed from: l */
        private final C18361h0 f45399l = new C18361h0(C16069c.f45410d);

        /* renamed from: m */
        private final C18361h0 f45400m = new C18361h0(C16070d.f45411d);

        /* renamed from: n */
        private final C18361h0 f45401n = new C18361h0(C16067a.f45408d);

        /* renamed from: o */
        private final C18361h0 f45402o = new C18361h0(C16077k.f45418d);

        /* renamed from: p */
        private final C18361h0 f45403p = new C18361h0(C16078l.f45419d);

        /* renamed from: q */
        private final C18361h0 f45404q = new C18361h0(C16074h.f45415d);

        /* renamed from: r */
        private final C18361h0 f45405r = new C18361h0(C16076j.f45417d);

        /* renamed from: s */
        private final C18361h0 f45406s = new C18361h0(C16068b.f45409d);

        /* renamed from: t */
        private final C18361h0 f45407t = new C18361h0(C16075i.f45416d);

        /* renamed from: jh.a$o$a */
        static final class C16067a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16067a f45408d = new C16067a();

            C16067a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$o$b */
        static final class C16068b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16068b f45409d = new C16068b();

            C16068b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$o$c */
        static final class C16069c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16069c f45410d = new C16069c();

            C16069c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$o$d */
        static final class C16070d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16070d f45411d = new C16070d();

            C16070d() {
                super(0);
            }

            public final Object invoke() {
                return "Small oval type doesn't support badge";
            }
        }

        /* renamed from: jh.a$o$e */
        static final class C16071e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16071e f45412d = new C16071e();

            C16071e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$o$f */
        static final class C16072f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16072f f45413d = new C16072f();

            C16072f() {
                super(0);
            }

            public final Object invoke() {
                return "Small oval type does not support loader";
            }
        }

        /* renamed from: jh.a$o$g */
        static final class C16073g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16073g f45414d = new C16073g();

            C16073g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$o$h */
        static final class C16074h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16074h f45415d = new C16074h();

            C16074h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$o$i */
        static final class C16075i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16075i f45416d = new C16075i();

            C16075i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$o$j */
        static final class C16076j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16076j f45417d = new C16076j();

            C16076j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$o$k */
        static final class C16077k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16077k f45418d = new C16077k();

            C16077k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$o$l */
        static final class C16078l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16078l f45419d = new C16078l();

            C16078l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16066o> cls = C16066o.class;
            f45391u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16066o(C9941j1 j1Var) {
            super(j1Var, C17779d.width_oval_icon_button_small, C17779d.height_oval_icon_button_small, 0, C17780e.selector_button_icon_small_oval, C17786k.LayerRadiusCircleShadow30, 8, (DefaultConstructorMarker) null);
            C41536l.m120489i(j1Var, "binding");
            AppCompatImageView appCompatImageView = j1Var.f27135e;
            C41536l.m120488h(appCompatImageView, "binding.buttonIconImage");
            this.f45392e = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = j1Var.f27135e;
            this.f45393f = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.buttonIconImage");
            this.f45394g = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            mo43176C(C5769a.m23209a(j1Var.f27135e.getContext(), C17778c.selector_button_icon_small_oval_icon));
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45392e.setValue(this, f45391u[0], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45397j.setValue(this, f45391u[3], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45394g.setValue(this, f45391u[1], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45396i.setValue(this, f45391u[2], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45395h = charSequence;
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45398k.setValue(this, f45391u[4], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45404q.setValue(this, f45391u[10], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45407t.setValue(this, f45391u[13], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45405r.setValue(this, f45391u[11], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45401n.getValue(this, f45391u[7]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45399l.getValue(this, f45391u[5]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45400m.getValue(this, f45391u[6]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45392e.getValue(this, f45391u[0]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45397j.getValue(this, f45391u[3]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45393f;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45394g.getValue(this, f45391u[1]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45396i.getValue(this, f45391u[2])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45395h;
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45398k.getValue(this, f45391u[4]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45404q.getValue(this, f45391u[10])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45407t.getValue(this, f45391u[13])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45405r.getValue(this, f45391u[11]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45402o.getValue(this, f45391u[8]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45403p.getValue(this, f45391u[9]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45401n.setValue(this, f45391u[7], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45406s.setValue(this, f45391u[12], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45399l.setValue(this, f45391u[5], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45400m.setValue(this, f45391u[6], num);
        }
    }

    /* renamed from: jh.a$p */
    public static class C16079p extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45420u;

        /* renamed from: e */
        private final C18355e0 f45421e;

        /* renamed from: f */
        private final C18376o f45422f;

        /* renamed from: g */
        private ImageView f45423g;

        /* renamed from: h */
        private final C18381t f45424h;

        /* renamed from: i */
        private final C18361h0 f45425i = new C18361h0(C16085f.f45442d);

        /* renamed from: j */
        private final C18361h0 f45426j = new C18361h0(C16082c.f45439d);

        /* renamed from: k */
        private final C18361h0 f45427k = new C18361h0(C16083d.f45440d);

        /* renamed from: l */
        private final C18361h0 f45428l = new C18361h0(C16084e.f45441d);

        /* renamed from: m */
        private ColorStateList f45429m;

        /* renamed from: n */
        private final C18361h0 f45430n = new C18361h0(C16080a.f45437d);

        /* renamed from: o */
        private final C18361h0 f45431o = new C18361h0(C16089j.f45446d);

        /* renamed from: p */
        private final C18361h0 f45432p = new C18361h0(C16090k.f45447d);

        /* renamed from: q */
        private final C18361h0 f45433q = new C18361h0(C16086g.f45443d);

        /* renamed from: r */
        private final C18361h0 f45434r = new C18361h0(C16088i.f45445d);

        /* renamed from: s */
        private final C18361h0 f45435s = new C18361h0(C16081b.f45438d);

        /* renamed from: t */
        private final C18361h0 f45436t = new C18361h0(C16087h.f45444d);

        /* renamed from: jh.a$p$a */
        static final class C16080a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16080a f45437d = new C16080a();

            C16080a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$p$b */
        static final class C16081b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16081b f45438d = new C16081b();

            C16081b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$p$c */
        static final class C16082c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16082c f45439d = new C16082c();

            C16082c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$p$d */
        static final class C16083d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16083d f45440d = new C16083d();

            C16083d() {
                super(0);
            }

            public final Object invoke() {
                return "Icon text type doesn't support badge";
            }
        }

        /* renamed from: jh.a$p$e */
        static final class C16084e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16084e f45441d = new C16084e();

            C16084e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$p$f */
        static final class C16085f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16085f f45442d = new C16085f();

            C16085f() {
                super(0);
            }

            public final Object invoke() {
                return "Icon text type does not support loader";
            }
        }

        /* renamed from: jh.a$p$g */
        static final class C16086g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16086g f45443d = new C16086g();

            C16086g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$p$h */
        static final class C16087h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16087h f45444d = new C16087h();

            C16087h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$p$i */
        static final class C16088i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16088i f45445d = new C16088i();

            C16088i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$p$j */
        static final class C16089j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16089j f45446d = new C16089j();

            C16089j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$p$k */
        static final class C16090k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16090k f45447d = new C16090k();

            C16090k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16079p> cls = C16079p.class;
            f45420u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16079p(C9957l1 l1Var) {
            super(l1Var, (DefaultConstructorMarker) null);
            C41536l.m120489i(l1Var, "binding");
            AppCompatTextView appCompatTextView = l1Var.f27233f;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f45421e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView = l1Var.f27232e;
            C41536l.m120488h(appCompatImageView, "binding.iconView");
            this.f45422f = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = l1Var.f27232e;
            this.f45423g = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.iconView");
            this.f45424h = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView3 = l1Var.f27232e;
            appCompatImageView3.setVisibility(0);
            mo43176C(C5769a.m23209a(appCompatImageView3.getContext(), C17778c.selector_button_icon_text));
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45422f.setValue(this, f45420u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45428l.setValue(this, f45420u[6], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45424h.setValue(this, f45420u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45425i.setValue(this, f45420u[3], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45421e.setValue(this, f45420u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45429m = colorStateList;
            ((C9957l1) mo43184b()).f27233f.setTextColor(colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45433q.setValue(this, f45420u[10], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45436t.setValue(this, f45420u[13], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45434r.setValue(this, f45420u[11], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45430n.getValue(this, f45420u[7]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45426j.getValue(this, f45420u[4]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45427k.getValue(this, f45420u[5]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45422f.getValue(this, f45420u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45428l.getValue(this, f45420u[6]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45423g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45424h.getValue(this, f45420u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45425i.getValue(this, f45420u[3])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45421e.getValue(this, f45420u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return this.f45429m;
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45433q.getValue(this, f45420u[10])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45436t.getValue(this, f45420u[13])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45434r.getValue(this, f45420u[11]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45431o.getValue(this, f45420u[8]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45432p.getValue(this, f45420u[9]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (mo43193k() == null) {
                if (z) {
                    C1314o.m4575q(((C9957l1) mo43184b()).f27233f, C17786k.TextSmallButtonPrimary500Left);
                } else {
                    C1314o.m4575q(((C9957l1) mo43184b()).f27233f, C17786k.TextSmallButtonPrimary150Left);
                }
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45430n.setValue(this, f45420u[7], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45435s.setValue(this, f45420u[12], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45426j.setValue(this, f45420u[4], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45427k.setValue(this, f45420u[5], num);
        }
    }

    /* renamed from: jh.a$q */
    public static class C16091q extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45448u;

        /* renamed from: e */
        private final C18355e0 f45449e;

        /* renamed from: f */
        private Drawable f45450f;

        /* renamed from: g */
        private ImageView f45451g;

        /* renamed from: h */
        private final C18381t f45452h;

        /* renamed from: i */
        private final C18361h0 f45453i = new C18361h0(C16097f.f45470d);

        /* renamed from: j */
        private final C18361h0 f45454j = new C18361h0(C16094c.f45467d);

        /* renamed from: k */
        private final C18361h0 f45455k = new C18361h0(C16095d.f45468d);

        /* renamed from: l */
        private final C18361h0 f45456l = new C18361h0(C16096e.f45469d);

        /* renamed from: m */
        private final C18361h0 f45457m = new C18361h0(C16098g.f45471d);

        /* renamed from: n */
        private final C18361h0 f45458n = new C18361h0(C16092a.f45465d);

        /* renamed from: o */
        private final C18361h0 f45459o = new C18361h0(C16102k.f45475d);

        /* renamed from: p */
        private final C18361h0 f45460p = new C18361h0(C16103l.f45476d);

        /* renamed from: q */
        private final C18361h0 f45461q = new C18361h0(C16099h.f45472d);

        /* renamed from: r */
        private final C18361h0 f45462r = new C18361h0(C16101j.f45474d);

        /* renamed from: s */
        private final C18361h0 f45463s = new C18361h0(C16093b.f45466d);

        /* renamed from: t */
        private final C18361h0 f45464t = new C18361h0(C16100i.f45473d);

        /* renamed from: jh.a$q$a */
        static final class C16092a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16092a f45465d = new C16092a();

            C16092a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$q$b */
        static final class C16093b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16093b f45466d = new C16093b();

            C16093b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$q$c */
        static final class C16094c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16094c f45467d = new C16094c();

            C16094c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$q$d */
        static final class C16095d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16095d f45468d = new C16095d();

            C16095d() {
                super(0);
            }

            public final Object invoke() {
                return "Languages type doesn't support badge";
            }
        }

        /* renamed from: jh.a$q$e */
        static final class C16096e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16096e f45469d = new C16096e();

            C16096e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$q$f */
        static final class C16097f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16097f f45470d = new C16097f();

            C16097f() {
                super(0);
            }

            public final Object invoke() {
                return "Languages type doesn't support loader";
            }
        }

        /* renamed from: jh.a$q$g */
        static final class C16098g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16098g f45471d = new C16098g();

            C16098g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$q$h */
        static final class C16099h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16099h f45472d = new C16099h();

            C16099h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$q$i */
        static final class C16100i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16100i f45473d = new C16100i();

            C16100i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$q$j */
        static final class C16101j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16101j f45474d = new C16101j();

            C16101j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$q$k */
        static final class C16102k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16102k f45475d = new C16102k();

            C16102k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$q$l */
        static final class C16103l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16103l f45476d = new C16103l();

            C16103l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16091q> cls = C16091q.class;
            f45448u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16091q(C9965m1 m1Var) {
            super(m1Var, 0, 0, 0, C17780e.selector_button_languages, C17786k.LayerRadius24Shadow0, 14, (DefaultConstructorMarker) null);
            C9965m1 m1Var2 = m1Var;
            C41536l.m120489i(m1Var2, "binding");
            AppCompatTextView appCompatTextView = m1Var2.f27265f;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f45449e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f45450f = m1Var2.f27264e.getDrawable();
            AppCompatImageView appCompatImageView = m1Var2.f27264e;
            this.f45451g = appCompatImageView;
            C41536l.m120488h(appCompatImageView, "binding.buttonIconImage");
            this.f45452h = new C18381t(appCompatImageView, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            if (drawable == null) {
                ((C9965m1) mo43184b()).f27264e.setVisibility(8);
                return;
            }
            this.f45450f = drawable;
            ((C9965m1) mo43184b()).f27264e.setVisibility(0);
            ((C9965m1) mo43184b()).f27264e.setImageDrawable(drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45456l.setValue(this, f45448u[5], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45452h.setValue(this, f45448u[1], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45453i.setValue(this, f45448u[2], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45449e.setValue(this, f45448u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45457m.setValue(this, f45448u[6], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45461q.setValue(this, f45448u[10], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45464t.setValue(this, f45448u[13], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45462r.setValue(this, f45448u[11], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45458n.getValue(this, f45448u[7]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45454j.getValue(this, f45448u[3]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45455k.getValue(this, f45448u[4]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return ((C9965m1) mo43184b()).f27264e.getDrawable();
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45456l.getValue(this, f45448u[5]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45451g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45452h.getValue(this, f45448u[1]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45453i.getValue(this, f45448u[2])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45449e.getValue(this, f45448u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45457m.getValue(this, f45448u[6]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45461q.getValue(this, f45448u[10])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45464t.getValue(this, f45448u[13])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45462r.getValue(this, f45448u[11]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45459o.getValue(this, f45448u[8]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45460p.getValue(this, f45448u[9]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C9965m1) mo43184b()).f27265f, C17786k.TextButton2White500Left);
            } else {
                C1314o.m4575q(((C9965m1) mo43184b()).f27265f, C17786k.TextButton2Black150Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45458n.setValue(this, f45448u[7], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45463s.setValue(this, f45448u[12], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45454j.setValue(this, f45448u[3], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45455k.setValue(this, f45448u[4], num);
        }
    }

    /* renamed from: jh.a$t */
    public static class C16132t extends C16104r {

        /* renamed from: y */
        static final /* synthetic */ C40303i[] f45537y;

        /* renamed from: v */
        private final C18361h0 f45538v = new C18361h0(C16133a.f45541d);

        /* renamed from: w */
        private final C18361h0 f45539w = new C18361h0(C16134b.f45542d);

        /* renamed from: x */
        private ImageView f45540x;

        /* renamed from: jh.a$t$a */
        static final class C16133a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16133a f45541d = new C16133a();

            C16133a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$t$b */
        static final class C16134b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16134b f45542d = new C16134b();

            C16134b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16132t> cls = C16132t.class;
            f45537y = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16132t(C9989p1 p1Var) {
            super(p1Var, C17779d.height_button_primary_small, C17786k.LayerRadius12Shadow0);
            C41536l.m120489i(p1Var, "binding");
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45538v.setValue(this, f45537y[0], colorStateList);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45539w.setValue(this, f45537y[1], colorStateList);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45538v.getValue(this, f45537y[0]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45540x;
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45539w.getValue(this, f45537y[1]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C9989p1) mo43184b()).f27387f, C17786k.TextButton2White500Left);
            } else {
                C1314o.m4575q(((C9989p1) mo43184b()).f27387f, C17786k.TextButton2White200Left);
            }
        }
    }

    /* renamed from: jh.a$u */
    public static class C16135u extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45543u;

        /* renamed from: e */
        private final C18355e0 f45544e;

        /* renamed from: f */
        private final C18376o f45545f;

        /* renamed from: g */
        private ImageView f45546g;

        /* renamed from: h */
        private final C18381t f45547h;

        /* renamed from: i */
        private final C18361h0 f45548i = new C18361h0(C16141f.f45565d);

        /* renamed from: j */
        private final C18361h0 f45549j = new C18361h0(C16140e.f45564d);

        /* renamed from: k */
        private final C18361h0 f45550k = new C18361h0(C16142g.f45566d);

        /* renamed from: l */
        private final C18361h0 f45551l = new C18361h0(C16138c.f45562d);

        /* renamed from: m */
        private final C18361h0 f45552m = new C18361h0(C16139d.f45563d);

        /* renamed from: n */
        private final C18361h0 f45553n = new C18361h0(C16136a.f45560d);

        /* renamed from: o */
        private final C18361h0 f45554o = new C18361h0(C16146k.f45570d);

        /* renamed from: p */
        private final C18361h0 f45555p = new C18361h0(C16147l.f45571d);

        /* renamed from: q */
        private final C18361h0 f45556q = new C18361h0(C16143h.f45567d);

        /* renamed from: r */
        private final C18361h0 f45557r = new C18361h0(C16145j.f45569d);

        /* renamed from: s */
        private final C18361h0 f45558s = new C18361h0(C16137b.f45561d);

        /* renamed from: t */
        private final C18361h0 f45559t = new C18361h0(C16144i.f45568d);

        /* renamed from: jh.a$u$a */
        static final class C16136a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16136a f45560d = new C16136a();

            C16136a() {
                super(0);
            }

            public final Object invoke() {
                return "PrimarySmallIconText type not supports backgroundSelector";
            }
        }

        /* renamed from: jh.a$u$b */
        static final class C16137b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16137b f45561d = new C16137b();

            C16137b() {
                super(0);
            }

            public final Object invoke() {
                return "PrimarySmallIconText type not supports badgeColor";
            }
        }

        /* renamed from: jh.a$u$c */
        static final class C16138c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16138c f45562d = new C16138c();

            C16138c() {
                super(0);
            }

            public final Object invoke() {
                return "PrimarySmallIconText type not supports buttonAmountText";
            }
        }

        /* renamed from: jh.a$u$d */
        static final class C16139d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16139d f45563d = new C16139d();

            C16139d() {
                super(0);
            }

            public final Object invoke() {
                return "PrimarySmallIconText type not supports buttonBadgeCount";
            }
        }

        /* renamed from: jh.a$u$e */
        static final class C16140e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16140e f45564d = new C16140e();

            C16140e() {
                super(0);
            }

            public final Object invoke() {
                return "PrimarySmallIconText type not supports buttonIconBackgroundTint";
            }
        }

        /* renamed from: jh.a$u$f */
        static final class C16141f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16141f f45565d = new C16141f();

            C16141f() {
                super(0);
            }

            public final Object invoke() {
                return "PrimarySmallIconText type not supports buttonIsLoading";
            }
        }

        /* renamed from: jh.a$u$g */
        static final class C16142g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16142g f45566d = new C16142g();

            C16142g() {
                super(0);
            }

            public final Object invoke() {
                return "PrimarySmallIconText type not supports buttonTextTint";
            }
        }

        /* renamed from: jh.a$u$h */
        static final class C16143h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16143h f45567d = new C16143h();

            C16143h() {
                super(0);
            }

            public final Object invoke() {
                return "PrimarySmallIconText type not supports iconBeforeText";
            }
        }

        /* renamed from: jh.a$u$i */
        static final class C16144i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16144i f45568d = new C16144i();

            C16144i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$u$j */
        static final class C16145j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16145j f45569d = new C16145j();

            C16145j() {
                super(0);
            }

            public final Object invoke() {
                return "PrimarySmallIconText type not supports textColor";
            }
        }

        /* renamed from: jh.a$u$k */
        static final class C16146k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16146k f45570d = new C16146k();

            C16146k() {
                super(0);
            }

            public final Object invoke() {
                return "PrimarySmallIconText type not supports thumbnailIconBadge";
            }
        }

        /* renamed from: jh.a$u$l */
        static final class C16147l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16147l f45571d = new C16147l();

            C16147l() {
                super(0);
            }

            public final Object invoke() {
                return "PrimarySmallIconText type not supports verificationBadgeView";
            }
        }

        static {
            Class<C16135u> cls = C16135u.class;
            f45543u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16135u(C10031v1 v1Var) {
            super(v1Var, 0, C17779d.height_button_small, 0, C17780e.selector_button_primary, C17786k.LayerRadius24Shadow0, 10, (DefaultConstructorMarker) null);
            C10031v1 v1Var2 = v1Var;
            C41536l.m120489i(v1Var2, "binding");
            AppCompatTextView appCompatTextView = v1Var2.f27645f;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f45544e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView = v1Var2.f27644e;
            C41536l.m120488h(appCompatImageView, "binding.iconView");
            this.f45545f = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = v1Var2.f27644e;
            this.f45546g = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.iconView");
            this.f45547h = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView3 = v1Var2.f27644e;
            appCompatImageView3.setVisibility(0);
            mo43176C(C5769a.m23209a(appCompatImageView3.getContext(), C17778c.selector_button_small_icon));
        }

        /* renamed from: J */
        private final int m57626J(boolean z, boolean z2) {
            if (z || z2) {
                return C17786k.TextButton2White500Left;
            }
            return C17786k.TextButton2White200Left;
        }

        /* renamed from: K */
        private final ColorStateList m57627K(int i) {
            return C5769a.m23209a(mo43194l(), i);
        }

        /* renamed from: L */
        private final ColorStateList m57628L(boolean z, boolean z2) {
            int i;
            if (z || z2) {
                i = C17778c.f49623b0;
            } else {
                i = C17778c.f49624d0;
            }
            return m57627K(i);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45545f.setValue(this, f45543u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45549j.setValue(this, f45543u[4], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45547h.setValue(this, f45543u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45548i.setValue(this, f45543u[3], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45544e.setValue(this, f45543u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45550k.setValue(this, f45543u[5], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45556q.setValue(this, f45543u[11], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45559t.setValue(this, f45543u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45557r.setValue(this, f45543u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45553n.getValue(this, f45543u[8]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45551l.getValue(this, f45543u[6]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45552m.getValue(this, f45543u[7]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45545f.getValue(this, f45543u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45549j.getValue(this, f45543u[4]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45546g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45547h.getValue(this, f45543u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45548i.getValue(this, f45543u[3])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45544e.getValue(this, f45543u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45550k.getValue(this, f45543u[5]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45556q.getValue(this, f45543u[11])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45559t.getValue(this, f45543u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45557r.getValue(this, f45543u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45554o.getValue(this, f45543u[9]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45555p.getValue(this, f45543u[10]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            C10031v1 v1Var = (C10031v1) mo43184b();
            C1314o.m4575q(v1Var.f27645f, m57626J(z, z2));
            C1305j.m4529c(v1Var.f27644e, m57628L(z, z2));
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45553n.setValue(this, f45543u[8], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45558s.setValue(this, f45543u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45551l.setValue(this, f45543u[6], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45552m.setValue(this, f45543u[7], num);
        }
    }

    /* renamed from: jh.a$v */
    public static class C16148v extends C15769a {

        /* renamed from: s */
        static final /* synthetic */ C40303i[] f45572s;

        /* renamed from: e */
        private final C18355e0 f45573e;

        /* renamed from: f */
        private final C18361h0 f45574f = new C18361h0(C16150b.f45588d);

        /* renamed from: g */
        private final C18361h0 f45575g = new C18361h0(C16151c.f45589d);

        /* renamed from: h */
        private final C18361h0 f45576h = new C18361h0(C16152d.f45590d);

        /* renamed from: i */
        private final C18361h0 f45577i = new C18361h0(C16153e.f45591d);

        /* renamed from: j */
        private final C18352d f45578j;

        /* renamed from: k */
        private final C18359g0 f45579k;

        /* renamed from: l */
        private ImageView f45580l;

        /* renamed from: m */
        private final C18363i0 f45581m;

        /* renamed from: n */
        private final C18361h0 f45582n;

        /* renamed from: o */
        private final C18361h0 f45583o;

        /* renamed from: p */
        private final C18361h0 f45584p;

        /* renamed from: q */
        private final C18361h0 f45585q;

        /* renamed from: r */
        private boolean f45586r;

        /* renamed from: jh.a$v$a */
        static final class C16149a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16149a f45587d = new C16149a();

            C16149a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$v$b */
        static final class C16150b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16150b f45588d = new C16150b();

            C16150b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$v$c */
        static final class C16151c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16151c f45589d = new C16151c();

            C16151c() {
                super(0);
            }

            public final Object invoke() {
                return "SecondarySolidText type doesn't support badge";
            }
        }

        /* renamed from: jh.a$v$d */
        static final class C16152d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16152d f45590d = new C16152d();

            C16152d() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$v$e */
        static final class C16153e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16153e f45591d = new C16153e();

            C16153e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$v$f */
        static final class C16154f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16154f f45592d = new C16154f();

            C16154f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$v$g */
        static final class C16155g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16155g f45593d = new C16155g();

            C16155g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$v$h */
        static final class C16156h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16156h f45594d = new C16156h();

            C16156h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16148v> cls = C16148v.class;
            f45572s = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16148v(C10062z4 z4Var) {
            super(z4Var, 0, C17779d.height_rectangle_small_button, 0, C17780e.selector_rectangle_small_button, C17786k.f49833r, 10, (DefaultConstructorMarker) null);
            C10062z4 z4Var2 = z4Var;
            C41536l.m120489i(z4Var2, "binding");
            AppCompatTextView appCompatTextView = z4Var2.f27821h;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f45573e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            LayerView layerView = z4Var2.f27820g;
            C41536l.m120488h(layerView, "binding.root");
            this.f45578j = new C18352d(layerView);
            AppCompatTextView appCompatTextView2 = z4Var2.f27821h;
            C41536l.m120488h(appCompatTextView2, "binding.textView");
            this.f45579k = new C18359g0(appCompatTextView2);
            this.f45580l = z4Var2.f27818e;
            LayerView layerView2 = z4Var2.f27820g;
            C41536l.m120488h(layerView2, "binding.root");
            this.f45581m = new C18363i0(layerView2);
            this.f45582n = new C18361h0(C16155g.f45593d);
            this.f45583o = new C18361h0(C16156h.f45594d);
            this.f45584p = new C18361h0(C16149a.f45587d);
            this.f45585q = new C18361h0(C16154f.f45592d);
            this.f45586r = true;
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            ((C10062z4) mo43184b()).f27818e.setImageDrawable(drawable);
            ((C10062z4) mo43184b()).f27819f.setImageDrawable(drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45581m.setValue(this, f45572s[7], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            C1305j.m4529c(((C10062z4) mo43184b()).f27818e, colorStateList);
            C1305j.m4529c(((C10062z4) mo43184b()).f27819f, colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45576h.setValue(this, f45572s[3], Boolean.valueOf(z));
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45573e.setValue(this, f45572s[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45577i.setValue(this, f45572s[4], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45586r = z;
            if (!z) {
                mo43210J(((C10062z4) mo43184b()).f27819f);
                ((C10062z4) mo43184b()).f27818e.setVisibility(8);
                ((C10062z4) mo43184b()).f27819f.setVisibility(0);
            }
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45585q.setValue(this, f45572s[11], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45579k.setValue(this, f45572s[6], colorStateList);
        }

        /* renamed from: J */
        public void mo43210J(ImageView imageView) {
            this.f45580l = imageView;
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return this.f45578j.getValue(this, f45572s[5]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45574f.getValue(this, f45572s[1]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45575g.getValue(this, f45572s[2]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return ((C10062z4) mo43184b()).f27818e.getDrawable();
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return this.f45581m.getValue(this, f45572s[7]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45580l;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return C1305j.m4527a(((C10062z4) mo43184b()).f27818e);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return ((Boolean) this.f45576h.getValue(this, f45572s[3])).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45573e.getValue(this, f45572s[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45577i.getValue(this, f45572s[4]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return this.f45586r;
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45585q.getValue(this, f45572s[11])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return this.f45579k.getValue(this, f45572s[6]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45582n.getValue(this, f45572s[8]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45583o.getValue(this, f45572s[9]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45578j.setValue(this, f45572s[5], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45584p.setValue(this, f45572s[10], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45574f.setValue(this, f45572s[1], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45575g.setValue(this, f45572s[2], num);
        }
    }

    /* renamed from: jh.a$w */
    public static class C16157w extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45595u;

        /* renamed from: e */
        private final C18355e0 f45596e;

        /* renamed from: f */
        private final C18361h0 f45597f = new C18361h0(C16162e.f45616d);

        /* renamed from: g */
        private ImageView f45598g;

        /* renamed from: h */
        private final C18361h0 f45599h = new C18361h0(C16164g.f45618d);

        /* renamed from: i */
        private final C18361h0 f45600i = new C18361h0(C16160c.f45614d);

        /* renamed from: j */
        private final C18361h0 f45601j = new C18361h0(C16161d.f45615d);

        /* renamed from: k */
        private final C18365j0 f45602k;

        /* renamed from: l */
        private final C18361h0 f45603l;

        /* renamed from: m */
        private final C18361h0 f45604m;

        /* renamed from: n */
        private final C18361h0 f45605n;

        /* renamed from: o */
        private final C18361h0 f45606o;

        /* renamed from: p */
        private final C18361h0 f45607p;

        /* renamed from: q */
        private final C18361h0 f45608q;

        /* renamed from: r */
        private final C18361h0 f45609r;

        /* renamed from: s */
        private final C18361h0 f45610s;

        /* renamed from: t */
        private final C18361h0 f45611t;

        /* renamed from: jh.a$w$a */
        static final class C16158a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16158a f45612d = new C16158a();

            C16158a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$w$b */
        static final class C16159b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16159b f45613d = new C16159b();

            C16159b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$w$c */
        static final class C16160c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16160c f45614d = new C16160c();

            C16160c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$w$d */
        static final class C16161d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16161d f45615d = new C16161d();

            C16161d() {
                super(0);
            }

            public final Object invoke() {
                return "SecondaryDashText type doesn't support badge";
            }
        }

        /* renamed from: jh.a$w$e */
        static final class C16162e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16162e f45616d = new C16162e();

            C16162e() {
                super(0);
            }

            public final Object invoke() {
                return "SecondaryDashText type not supports icon";
            }
        }

        /* renamed from: jh.a$w$f */
        static final class C16163f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16163f f45617d = new C16163f();

            C16163f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$w$g */
        static final class C16164g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16164g f45618d = new C16164g();

            C16164g() {
                super(0);
            }

            public final Object invoke() {
                return "SecondaryDashText type not supports icon";
            }
        }

        /* renamed from: jh.a$w$h */
        static final class C16165h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16165h f45619d = new C16165h();

            C16165h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$w$i */
        static final class C16166i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16166i f45620d = new C16166i();

            C16166i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$w$j */
        static final class C16167j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16167j f45621d = new C16167j();

            C16167j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$w$k */
        static final class C16168k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16168k f45622d = new C16168k();

            C16168k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$w$l */
        static final class C16169l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16169l f45623d = new C16169l();

            C16169l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$w$m */
        static final class C16170m extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16170m f45624d = new C16170m();

            C16170m() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16157w> cls = C16157w.class;
            f45595u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16157w(C9996q1 q1Var) {
            super(q1Var, 0, C17779d.height_button_secondary, 0, C17780e.selector_button_secondary_dash, C17786k.LayerRadius12Shadow0, 10, (DefaultConstructorMarker) null);
            C9996q1 q1Var2 = q1Var;
            C41536l.m120489i(q1Var2, "binding");
            AppCompatTextView appCompatTextView = q1Var2.f27422g;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f45596e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            ProgressBar progressBar = q1Var2.f27421f;
            C41536l.m120488h(progressBar, "binding.loader");
            this.f45602k = new C18365j0(progressBar, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            this.f45603l = new C18361h0(C16166i.f45620d);
            this.f45604m = new C18361h0(C16163f.f45617d);
            this.f45605n = new C18361h0(C16165h.f45619d);
            this.f45606o = new C18361h0(C16158a.f45612d);
            this.f45607p = new C18361h0(C16169l.f45623d);
            this.f45608q = new C18361h0(C16170m.f45624d);
            this.f45609r = new C18361h0(C16168k.f45622d);
            this.f45610s = new C18361h0(C16159b.f45613d);
            this.f45611t = new C18361h0(C16167j.f45621d);
            q1Var2.f27420e.setVisibility(8);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45597f.setValue(this, f45595u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45604m.setValue(this, f45595u[7], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45599h.setValue(this, f45595u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45602k.mo46151c(this, f45595u[5], z);
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45596e.setValue(this, f45595u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45605n.setValue(this, f45595u[8], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45603l.setValue(this, f45595u[6], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45611t.setValue(this, f45595u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45609r.setValue(this, f45595u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45606o.getValue(this, f45595u[9]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45600i.getValue(this, f45595u[3]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45601j.getValue(this, f45595u[4]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return (Drawable) this.f45597f.getValue(this, f45595u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45604m.getValue(this, f45595u[7]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45598g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f45599h.getValue(this, f45595u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return this.f45602k.getValue(this, f45595u[5]).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45596e.getValue(this, f45595u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45605n.getValue(this, f45595u[8]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45603l.getValue(this, f45595u[6])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45611t.getValue(this, f45595u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45609r.getValue(this, f45595u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45607p.getValue(this, f45595u[10]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45608q.getValue(this, f45595u[11]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C9996q1) mo43184b()).f27422g, C17786k.TextSmallButtonPrimary500Left);
            } else {
                C1314o.m4575q(((C9996q1) mo43184b()).f27422g, C17786k.TextSmallButtonPrimary150Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45606o.setValue(this, f45595u[9], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45610s.setValue(this, f45595u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45600i.setValue(this, f45595u[3], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45601j.setValue(this, f45595u[4], num);
        }
    }

    /* renamed from: jh.a$x */
    public static class C16171x extends C16157w {

        /* renamed from: F */
        static final /* synthetic */ C40303i[] f45625F;

        /* renamed from: A */
        private final C18361h0 f45626A = new C18361h0(C16172a.f45636d);

        /* renamed from: B */
        private final C18361h0 f45627B = new C18361h0(C16177f.f45641d);

        /* renamed from: C */
        private final C18361h0 f45628C = new C18361h0(C16178g.f45642d);

        /* renamed from: D */
        private final C18361h0 f45629D = new C18361h0(C16176e.f45640d);

        /* renamed from: E */
        private final C18361h0 f45630E = new C18361h0(C16173b.f45637d);

        /* renamed from: v */
        private final C18376o f45631v;

        /* renamed from: w */
        private ImageView f45632w;

        /* renamed from: x */
        private final C18381t f45633x;

        /* renamed from: y */
        private final C18361h0 f45634y = new C18361h0(C16174c.f45638d);

        /* renamed from: z */
        private final C18361h0 f45635z = new C18361h0(C16175d.f45639d);

        /* renamed from: jh.a$x$a */
        static final class C16172a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16172a f45636d = new C16172a();

            C16172a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$x$b */
        static final class C16173b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16173b f45637d = new C16173b();

            C16173b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$x$c */
        static final class C16174c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16174c f45638d = new C16174c();

            C16174c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$x$d */
        static final class C16175d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16175d f45639d = new C16175d();

            C16175d() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$x$e */
        static final class C16176e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16176e f45640d = new C16176e();

            C16176e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$x$f */
        static final class C16177f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16177f f45641d = new C16177f();

            C16177f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$x$g */
        static final class C16178g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16178g f45642d = new C16178g();

            C16178g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16171x> cls = C16171x.class;
            f45625F = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16171x(C9996q1 q1Var) {
            super(q1Var);
            C41536l.m120489i(q1Var, "binding");
            AppCompatImageView appCompatImageView = q1Var.f27420e;
            C41536l.m120488h(appCompatImageView, "binding.iconView");
            this.f45631v = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = q1Var.f27420e;
            this.f45632w = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.iconView");
            this.f45633x = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView3 = q1Var.f27420e;
            appCompatImageView3.setVisibility(0);
            mo43176C(C5769a.m23209a(appCompatImageView3.getContext(), C17778c.selector_button_secondary_icon));
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45631v.setValue(this, f45625F[0], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45634y.setValue(this, f45625F[2], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45633x.setValue(this, f45625F[1], colorStateList);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45635z.setValue(this, f45625F[3], colorStateList);
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45629D.setValue(this, f45625F[7], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45626A.getValue(this, f45625F[4]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45631v.getValue(this, f45625F[0]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45634y.getValue(this, f45625F[2]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45632w;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45633x.getValue(this, f45625F[1]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45635z.getValue(this, f45625F[3]);
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45629D.getValue(this, f45625F[7]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45627B.getValue(this, f45625F[5]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45628C.getValue(this, f45625F[6]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45626A.setValue(this, f45625F[4], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45630E.setValue(this, f45625F[8], num);
        }
    }

    /* renamed from: jh.a$y */
    public static class C16179y extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45643u;

        /* renamed from: e */
        private final C18355e0 f45644e;

        /* renamed from: f */
        private final C18361h0 f45645f = new C18361h0(C16184e.f45664d);

        /* renamed from: g */
        private ImageView f45646g;

        /* renamed from: h */
        private final C18361h0 f45647h = new C18361h0(C16186g.f45666d);

        /* renamed from: i */
        private final C18361h0 f45648i = new C18361h0(C16182c.f45662d);

        /* renamed from: j */
        private final C18361h0 f45649j = new C18361h0(C16183d.f45663d);

        /* renamed from: k */
        private final C18365j0 f45650k;

        /* renamed from: l */
        private final C18361h0 f45651l;

        /* renamed from: m */
        private final C18361h0 f45652m;

        /* renamed from: n */
        private final C18361h0 f45653n;

        /* renamed from: o */
        private final C18361h0 f45654o;

        /* renamed from: p */
        private final C18361h0 f45655p;

        /* renamed from: q */
        private final C18361h0 f45656q;

        /* renamed from: r */
        private final C18361h0 f45657r;

        /* renamed from: s */
        private final C18361h0 f45658s;

        /* renamed from: t */
        private final C18361h0 f45659t;

        /* renamed from: jh.a$y$a */
        static final class C16180a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16180a f45660d = new C16180a();

            C16180a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$y$b */
        static final class C16181b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16181b f45661d = new C16181b();

            C16181b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$y$c */
        static final class C16182c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16182c f45662d = new C16182c();

            C16182c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$y$d */
        static final class C16183d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16183d f45663d = new C16183d();

            C16183d() {
                super(0);
            }

            public final Object invoke() {
                return "SecondarySolidText type doesn't support badge";
            }
        }

        /* renamed from: jh.a$y$e */
        static final class C16184e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16184e f45664d = new C16184e();

            C16184e() {
                super(0);
            }

            public final Object invoke() {
                return "SecondarySolidText type not supports icon";
            }
        }

        /* renamed from: jh.a$y$f */
        static final class C16185f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16185f f45665d = new C16185f();

            C16185f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$y$g */
        static final class C16186g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16186g f45666d = new C16186g();

            C16186g() {
                super(0);
            }

            public final Object invoke() {
                return "SecondarySolidText type not supports icon";
            }
        }

        /* renamed from: jh.a$y$h */
        static final class C16187h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16187h f45667d = new C16187h();

            C16187h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$y$i */
        static final class C16188i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16188i f45668d = new C16188i();

            C16188i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$y$j */
        static final class C16189j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16189j f45669d = new C16189j();

            C16189j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$y$k */
        static final class C16190k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16190k f45670d = new C16190k();

            C16190k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$y$l */
        static final class C16191l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16191l f45671d = new C16191l();

            C16191l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$y$m */
        static final class C16192m extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16192m f45672d = new C16192m();

            C16192m() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16179y> cls = C16179y.class;
            f45643u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16179y(C9996q1 q1Var) {
            super(q1Var, 0, C17779d.height_button_secondary, 0, C17780e.selector_button_secondary_solid, C17786k.LayerRadius12Shadow0, 10, (DefaultConstructorMarker) null);
            C9996q1 q1Var2 = q1Var;
            C41536l.m120489i(q1Var2, "binding");
            AppCompatTextView appCompatTextView = q1Var2.f27422g;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f45644e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            ProgressBar progressBar = q1Var2.f27421f;
            C41536l.m120488h(progressBar, "binding.loader");
            this.f45650k = new C18365j0(progressBar, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            this.f45651l = new C18361h0(C16188i.f45668d);
            this.f45652m = new C18361h0(C16185f.f45665d);
            this.f45653n = new C18361h0(C16187h.f45667d);
            this.f45654o = new C18361h0(C16180a.f45660d);
            this.f45655p = new C18361h0(C16191l.f45671d);
            this.f45656q = new C18361h0(C16192m.f45672d);
            this.f45657r = new C18361h0(C16190k.f45670d);
            this.f45658s = new C18361h0(C16181b.f45661d);
            this.f45659t = new C18361h0(C16189j.f45669d);
            q1Var2.f27420e.setVisibility(8);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45645f.setValue(this, f45643u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45652m.setValue(this, f45643u[7], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45647h.setValue(this, f45643u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45650k.mo46151c(this, f45643u[5], z);
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45644e.setValue(this, f45643u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45653n.setValue(this, f45643u[8], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45651l.setValue(this, f45643u[6], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45659t.setValue(this, f45643u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45657r.setValue(this, f45643u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45654o.getValue(this, f45643u[9]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45648i.getValue(this, f45643u[3]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45649j.getValue(this, f45643u[4]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return (Drawable) this.f45645f.getValue(this, f45643u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45652m.getValue(this, f45643u[7]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45646g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f45647h.getValue(this, f45643u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return this.f45650k.getValue(this, f45643u[5]).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45644e.getValue(this, f45643u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45653n.getValue(this, f45643u[8]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45651l.getValue(this, f45643u[6])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45659t.getValue(this, f45643u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45657r.getValue(this, f45643u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45655p.getValue(this, f45643u[10]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45656q.getValue(this, f45643u[11]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C9996q1) mo43184b()).f27422g, C17786k.TextSmallButtonPrimary500Left);
            } else {
                C1314o.m4575q(((C9996q1) mo43184b()).f27422g, C17786k.TextSmallButtonPrimary150Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45654o.setValue(this, f45643u[9], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45658s.setValue(this, f45643u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45648i.setValue(this, f45643u[3], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45649j.setValue(this, f45643u[4], num);
        }
    }

    /* renamed from: jh.a$z */
    public static class C16193z extends C16179y {

        /* renamed from: F */
        static final /* synthetic */ C40303i[] f45673F;

        /* renamed from: A */
        private final C18361h0 f45674A = new C18361h0(C16194a.f45684d);

        /* renamed from: B */
        private final C18361h0 f45675B = new C18361h0(C16199f.f45689d);

        /* renamed from: C */
        private final C18361h0 f45676C = new C18361h0(C16200g.f45690d);

        /* renamed from: D */
        private final C18361h0 f45677D = new C18361h0(C16198e.f45688d);

        /* renamed from: E */
        private final C18361h0 f45678E = new C18361h0(C16195b.f45685d);

        /* renamed from: v */
        private final C18376o f45679v;

        /* renamed from: w */
        private ImageView f45680w;

        /* renamed from: x */
        private final C18381t f45681x;

        /* renamed from: y */
        private final C18361h0 f45682y = new C18361h0(C16196c.f45686d);

        /* renamed from: z */
        private final C18361h0 f45683z = new C18361h0(C16197d.f45687d);

        /* renamed from: jh.a$z$a */
        static final class C16194a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16194a f45684d = new C16194a();

            C16194a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$z$b */
        static final class C16195b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16195b f45685d = new C16195b();

            C16195b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$z$c */
        static final class C16196c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16196c f45686d = new C16196c();

            C16196c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$z$d */
        static final class C16197d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16197d f45687d = new C16197d();

            C16197d() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$z$e */
        static final class C16198e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16198e f45688d = new C16198e();

            C16198e() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$z$f */
        static final class C16199f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16199f f45689d = new C16199f();

            C16199f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$z$g */
        static final class C16200g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16200g f45690d = new C16200g();

            C16200g() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16193z> cls = C16193z.class;
            f45673F = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16193z(C9996q1 q1Var) {
            super(q1Var);
            C41536l.m120489i(q1Var, "binding");
            AppCompatImageView appCompatImageView = q1Var.f27420e;
            C41536l.m120488h(appCompatImageView, "binding.iconView");
            this.f45679v = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = q1Var.f27420e;
            this.f45680w = appCompatImageView2;
            C41536l.m120488h(appCompatImageView2, "binding.iconView");
            this.f45681x = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView3 = q1Var.f27420e;
            appCompatImageView3.setVisibility(0);
            mo43176C(C5769a.m23209a(appCompatImageView3.getContext(), C17778c.selector_button_secondary_icon));
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45679v.setValue(this, f45673F[0], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45682y.setValue(this, f45673F[2], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45681x.setValue(this, f45673F[1], colorStateList);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45683z.setValue(this, f45673F[3], colorStateList);
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45677D.setValue(this, f45673F[7], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45674A.getValue(this, f45673F[4]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return this.f45679v.getValue(this, f45673F[0]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45682y.getValue(this, f45673F[2]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45680w;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return this.f45681x.getValue(this, f45673F[1]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45683z.getValue(this, f45673F[3]);
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45677D.getValue(this, f45673F[7]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45675B.getValue(this, f45673F[5]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45676C.getValue(this, f45673F[6]);
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45674A.setValue(this, f45673F[4], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45678E.setValue(this, f45673F[8], num);
        }
    }

    public /* synthetic */ C15769a(C6201a aVar, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i, i2, i3, i4, i5);
    }

    /* renamed from: A */
    public abstract void mo43174A(Drawable drawable);

    /* renamed from: B */
    public abstract void mo43175B(ColorStateList colorStateList);

    /* renamed from: C */
    public abstract void mo43176C(ColorStateList colorStateList);

    /* renamed from: D */
    public abstract void mo43177D(boolean z);

    /* renamed from: E */
    public abstract void mo43178E(CharSequence charSequence);

    /* renamed from: F */
    public abstract void mo43179F(ColorStateList colorStateList);

    /* renamed from: G */
    public abstract void mo43180G(boolean z);

    /* renamed from: H */
    public abstract void mo43181H(int i);

    /* renamed from: I */
    public abstract void mo43182I(ColorStateList colorStateList);

    /* renamed from: a */
    public abstract Drawable mo43183a();

    /* renamed from: b */
    public final C6201a mo43184b() {
        return this.f44731d;
    }

    /* renamed from: c */
    public abstract CharSequence mo43185c();

    /* renamed from: d */
    public abstract Integer mo43186d();

    /* renamed from: e */
    public abstract Drawable mo43187e();

    /* renamed from: f */
    public abstract ColorStateList mo43188f();

    /* renamed from: g */
    public abstract ImageView mo43189g();

    /* renamed from: h */
    public abstract ColorStateList mo43190h();

    /* renamed from: i */
    public abstract boolean mo43191i();

    /* renamed from: j */
    public abstract CharSequence mo43192j();

    /* renamed from: k */
    public abstract ColorStateList mo43193k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Context mo43194l() {
        Context context = this.f44731d.mo3946b().getContext();
        C41536l.m120488h(context, "binding.root.context");
        return context;
    }

    /* renamed from: m */
    public final int mo43195m() {
        return this.f44728a;
    }

    /* renamed from: n */
    public abstract boolean mo43196n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final LayerView mo43197o() {
        ViewParent parent = this.f44731d.mo3946b().getParent();
        C41536l.m120487g(parent, "null cannot be cast to non-null type ge.bog.designsystem.components.layersandshadows.LayerView");
        return (LayerView) parent;
    }

    /* renamed from: p */
    public abstract int mo43198p();

    /* renamed from: q */
    public final int mo43199q() {
        return this.f44730c;
    }

    /* renamed from: r */
    public abstract ColorStateList mo43200r();

    /* renamed from: s */
    public abstract ThumbnailIconBadgeView mo43201s();

    /* renamed from: t */
    public abstract VerifiedBadgeView mo43202t();

    /* renamed from: u */
    public final int mo43203u() {
        return this.f44729b;
    }

    /* renamed from: v */
    public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
    }

    /* renamed from: w */
    public abstract void mo43205w(Drawable drawable);

    /* renamed from: x */
    public abstract void mo43206x(Integer num);

    /* renamed from: y */
    public abstract void mo43207y(CharSequence charSequence);

    /* renamed from: z */
    public abstract void mo43208z(Integer num);

    public /* synthetic */ C15769a(C6201a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: jh.a$r */
    public static class C16104r extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45477u;

        /* renamed from: e */
        private final C18355e0 f45478e;

        /* renamed from: f */
        private final C18361h0 f45479f;

        /* renamed from: g */
        private ImageView f45480g;

        /* renamed from: h */
        private final C18361h0 f45481h;

        /* renamed from: i */
        private final C18361h0 f45482i;

        /* renamed from: j */
        private final C18361h0 f45483j;

        /* renamed from: k */
        private final C18365j0 f45484k;

        /* renamed from: l */
        private final C18361h0 f45485l;

        /* renamed from: m */
        private final C18361h0 f45486m;

        /* renamed from: n */
        private final C18361h0 f45487n;

        /* renamed from: o */
        private final C18361h0 f45488o;

        /* renamed from: p */
        private final C18361h0 f45489p;

        /* renamed from: q */
        private final C18361h0 f45490q;

        /* renamed from: r */
        private final C18361h0 f45491r;

        /* renamed from: s */
        private final C18361h0 f45492s;

        /* renamed from: t */
        private final C18361h0 f45493t;

        /* renamed from: jh.a$r$a */
        static final class C16105a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16105a f45494d = new C16105a();

            C16105a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$r$b */
        static final class C16106b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16106b f45495d = new C16106b();

            C16106b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$r$c */
        static final class C16107c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16107c f45496d = new C16107c();

            C16107c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$r$d */
        static final class C16108d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16108d f45497d = new C16108d();

            C16108d() {
                super(0);
            }

            public final Object invoke() {
                return "Primary type doesn't support badge";
            }
        }

        /* renamed from: jh.a$r$e */
        static final class C16109e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16109e f45498d = new C16109e();

            C16109e() {
                super(0);
            }

            public final Object invoke() {
                return "Primary type not supports icon";
            }
        }

        /* renamed from: jh.a$r$f */
        static final class C16110f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16110f f45499d = new C16110f();

            C16110f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$r$g */
        static final class C16111g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16111g f45500d = new C16111g();

            C16111g() {
                super(0);
            }

            public final Object invoke() {
                return "Primary type not supports icon";
            }
        }

        /* renamed from: jh.a$r$h */
        static final class C16112h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16112h f45501d = new C16112h();

            C16112h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$r$i */
        static final class C16113i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16113i f45502d = new C16113i();

            C16113i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$r$j */
        static final class C16114j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16114j f45503d = new C16114j();

            C16114j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$r$k */
        static final class C16115k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16115k f45504d = new C16115k();

            C16115k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$r$l */
        static final class C16116l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16116l f45505d = new C16116l();

            C16116l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$r$m */
        static final class C16117m extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16117m f45506d = new C16117m();

            C16117m() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16104r> cls = C16104r.class;
            f45477u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C16104r(C9989p1 p1Var, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(p1Var, (i3 & 2) != 0 ? C17779d.height_button_primary : i, (i3 & 4) != 0 ? C17786k.f49833r : i2);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45479f.setValue(this, f45477u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45486m.setValue(this, f45477u[7], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45481h.setValue(this, f45477u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45484k.mo46151c(this, f45477u[5], z);
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45478e.setValue(this, f45477u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45487n.setValue(this, f45477u[8], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45485l.setValue(this, f45477u[6], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45493t.setValue(this, f45477u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45489p.setValue(this, f45477u[10], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45488o.getValue(this, f45477u[9]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45482i.getValue(this, f45477u[3]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45483j.getValue(this, f45477u[4]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return (Drawable) this.f45479f.getValue(this, f45477u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45486m.getValue(this, f45477u[7]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45480g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f45481h.getValue(this, f45477u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return this.f45484k.getValue(this, f45477u[5]).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45478e.getValue(this, f45477u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45487n.getValue(this, f45477u[8]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45485l.getValue(this, f45477u[6])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45493t.getValue(this, f45477u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45489p.getValue(this, f45477u[10]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45490q.getValue(this, f45477u[11]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45491r.getValue(this, f45477u[12]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C9989p1) mo43184b()).f27387f, C17786k.TextButton1White500Left);
            } else {
                C1314o.m4575q(((C9989p1) mo43184b()).f27387f, C17786k.TextButton1White200Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45488o.setValue(this, f45477u[9], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45492s.setValue(this, f45477u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45482i.setValue(this, f45477u[3], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45483j.setValue(this, f45477u[4], num);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16104r(C9989p1 p1Var, int i, int i2) {
            super(p1Var, 0, i, 0, C17780e.selector_button_primary, i2, 10, (DefaultConstructorMarker) null);
            C9989p1 p1Var2 = p1Var;
            C41536l.m120489i(p1Var2, "binding");
            AppCompatTextView appCompatTextView = p1Var2.f27387f;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f45478e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f45479f = new C18361h0(C16109e.f45498d);
            this.f45481h = new C18361h0(C16111g.f45500d);
            this.f45482i = new C18361h0(C16107c.f45496d);
            this.f45483j = new C18361h0(C16108d.f45497d);
            ProgressBar progressBar = p1Var2.f27386e;
            C41536l.m120488h(progressBar, "binding.loader");
            this.f45484k = new C18365j0(progressBar, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            this.f45485l = new C18361h0(C16113i.f45502d);
            this.f45486m = new C18361h0(C16110f.f45499d);
            this.f45487n = new C18361h0(C16112h.f45501d);
            this.f45488o = new C18361h0(C16105a.f45494d);
            this.f45489p = new C18361h0(C16115k.f45504d);
            this.f45490q = new C18361h0(C16116l.f45505d);
            this.f45491r = new C18361h0(C16117m.f45506d);
            this.f45492s = new C18361h0(C16106b.f45495d);
            this.f45493t = new C18361h0(C16114j.f45503d);
        }
    }

    /* renamed from: jh.a$s */
    public static class C16118s extends C15769a {

        /* renamed from: u */
        static final /* synthetic */ C40303i[] f45507u;

        /* renamed from: e */
        private final C18355e0 f45508e;

        /* renamed from: f */
        private final C18361h0 f45509f;

        /* renamed from: g */
        private ImageView f45510g;

        /* renamed from: h */
        private final C18361h0 f45511h;

        /* renamed from: i */
        private final C18361h0 f45512i;

        /* renamed from: j */
        private final C18361h0 f45513j;

        /* renamed from: k */
        private final C18365j0 f45514k;

        /* renamed from: l */
        private final C18361h0 f45515l;

        /* renamed from: m */
        private final C18361h0 f45516m;

        /* renamed from: n */
        private final C18361h0 f45517n;

        /* renamed from: o */
        private final C18361h0 f45518o;

        /* renamed from: p */
        private final C18361h0 f45519p;

        /* renamed from: q */
        private final C18361h0 f45520q;

        /* renamed from: r */
        private final C18361h0 f45521r;

        /* renamed from: s */
        private final C18361h0 f45522s;

        /* renamed from: t */
        private final C18361h0 f45523t;

        /* renamed from: jh.a$s$a */
        static final class C16119a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16119a f45524d = new C16119a();

            C16119a() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$s$b */
        static final class C16120b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16120b f45525d = new C16120b();

            C16120b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$s$c */
        static final class C16121c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16121c f45526d = new C16121c();

            C16121c() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$s$d */
        static final class C16122d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16122d f45527d = new C16122d();

            C16122d() {
                super(0);
            }

            public final Object invoke() {
                return "Primary type doesn't support badge";
            }
        }

        /* renamed from: jh.a$s$e */
        static final class C16123e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16123e f45528d = new C16123e();

            C16123e() {
                super(0);
            }

            public final Object invoke() {
                return "Primary type not supports icon";
            }
        }

        /* renamed from: jh.a$s$f */
        static final class C16124f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16124f f45529d = new C16124f();

            C16124f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$s$g */
        static final class C16125g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16125g f45530d = new C16125g();

            C16125g() {
                super(0);
            }

            public final Object invoke() {
                return "Primary type not supports icon";
            }
        }

        /* renamed from: jh.a$s$h */
        static final class C16126h extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16126h f45531d = new C16126h();

            C16126h() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$s$i */
        static final class C16127i extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16127i f45532d = new C16127i();

            C16127i() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$s$j */
        static final class C16128j extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16128j f45533d = new C16128j();

            C16128j() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$s$k */
        static final class C16129k extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16129k f45534d = new C16129k();

            C16129k() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$s$l */
        static final class C16130l extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16130l f45535d = new C16130l();

            C16130l() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: jh.a$s$m */
        static final class C16131m extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16131m f45536d = new C16131m();

            C16131m() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16118s> cls = C16118s.class;
            f45507u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "buttonText", "getButtonText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIcon", "getButtonIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconTint", "getButtonIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonAmountText", "getButtonAmountText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonBadgeCount", "getButtonBadgeCount()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIsLoading", "getButtonIsLoading()Z", 0)), C41520a0.m120439e(new C41539o(cls, "iconBeforeText", "getIconBeforeText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonIconBackgroundTint", "getButtonIconBackgroundTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "buttonTextTint", "getButtonTextTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "backgroundSelector", "getBackgroundSelector()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120441g(new C41545u(cls, "thumbnailIconBadge", "getThumbnailIconBadge()Lge/bog/designsystem/components/thumbnailiconbadge/ThumbnailIconBadgeView;", 0)), C41520a0.m120441g(new C41545u(cls, "verificationBadgeView", "getVerificationBadgeView()Lge/bog/designsystem/components/verifiedbadge/VerifiedBadgeView;", 0)), C41520a0.m120439e(new C41539o(cls, "textColor", "getTextColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "maxLines", "getMaxLines()I", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C16118s(C9989p1 p1Var, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(p1Var, (i3 & 2) != 0 ? C17779d.height_button_primary_junior : i, (i3 & 4) != 0 ? C17786k.LayerRadius20Shadow0New : i2);
        }

        /* renamed from: A */
        public void mo43174A(Drawable drawable) {
            this.f45509f.setValue(this, f45507u[1], drawable);
        }

        /* renamed from: B */
        public void mo43175B(ColorStateList colorStateList) {
            this.f45516m.setValue(this, f45507u[7], colorStateList);
        }

        /* renamed from: C */
        public void mo43176C(ColorStateList colorStateList) {
            this.f45511h.setValue(this, f45507u[2], colorStateList);
        }

        /* renamed from: D */
        public void mo43177D(boolean z) {
            this.f45514k.mo46151c(this, f45507u[5], z);
        }

        /* renamed from: E */
        public void mo43178E(CharSequence charSequence) {
            this.f45508e.setValue(this, f45507u[0], charSequence);
        }

        /* renamed from: F */
        public void mo43179F(ColorStateList colorStateList) {
            this.f45517n.setValue(this, f45507u[8], colorStateList);
        }

        /* renamed from: G */
        public void mo43180G(boolean z) {
            this.f45515l.setValue(this, f45507u[6], Boolean.valueOf(z));
        }

        /* renamed from: H */
        public void mo43181H(int i) {
            this.f45523t.setValue(this, f45507u[14], Integer.valueOf(i));
        }

        /* renamed from: I */
        public void mo43182I(ColorStateList colorStateList) {
            this.f45521r.setValue(this, f45507u[12], colorStateList);
        }

        /* renamed from: a */
        public Drawable mo43183a() {
            return (Drawable) this.f45518o.getValue(this, f45507u[9]);
        }

        /* renamed from: c */
        public CharSequence mo43185c() {
            return (CharSequence) this.f45512i.getValue(this, f45507u[3]);
        }

        /* renamed from: d */
        public Integer mo43186d() {
            return (Integer) this.f45513j.getValue(this, f45507u[4]);
        }

        /* renamed from: e */
        public Drawable mo43187e() {
            return (Drawable) this.f45509f.getValue(this, f45507u[1]);
        }

        /* renamed from: f */
        public ColorStateList mo43188f() {
            return (ColorStateList) this.f45516m.getValue(this, f45507u[7]);
        }

        /* renamed from: g */
        public ImageView mo43189g() {
            return this.f45510g;
        }

        /* renamed from: h */
        public ColorStateList mo43190h() {
            return (ColorStateList) this.f45511h.getValue(this, f45507u[2]);
        }

        /* renamed from: i */
        public boolean mo43191i() {
            return this.f45514k.getValue(this, f45507u[5]).booleanValue();
        }

        /* renamed from: j */
        public CharSequence mo43192j() {
            return this.f45508e.getValue(this, f45507u[0]);
        }

        /* renamed from: k */
        public ColorStateList mo43193k() {
            return (ColorStateList) this.f45517n.getValue(this, f45507u[8]);
        }

        /* renamed from: n */
        public boolean mo43196n() {
            return ((Boolean) this.f45515l.getValue(this, f45507u[6])).booleanValue();
        }

        /* renamed from: p */
        public int mo43198p() {
            return ((Number) this.f45523t.getValue(this, f45507u[14])).intValue();
        }

        /* renamed from: r */
        public ColorStateList mo43200r() {
            return (ColorStateList) this.f45521r.getValue(this, f45507u[12]);
        }

        /* renamed from: s */
        public ThumbnailIconBadgeView mo43201s() {
            return (ThumbnailIconBadgeView) this.f45519p.getValue(this, f45507u[10]);
        }

        /* renamed from: t */
        public VerifiedBadgeView mo43202t() {
            return (VerifiedBadgeView) this.f45520q.getValue(this, f45507u[11]);
        }

        /* renamed from: v */
        public void mo43204v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z || z2) {
                C1314o.m4575q(((C9989p1) mo43184b()).f27387f, C17786k.TextButton1White500Left);
            } else {
                C1314o.m4575q(((C9989p1) mo43184b()).f27387f, C17786k.TextButton1White200Left);
            }
        }

        /* renamed from: w */
        public void mo43205w(Drawable drawable) {
            this.f45518o.setValue(this, f45507u[9], drawable);
        }

        /* renamed from: x */
        public void mo43206x(Integer num) {
            this.f45522s.setValue(this, f45507u[13], num);
        }

        /* renamed from: y */
        public void mo43207y(CharSequence charSequence) {
            this.f45512i.setValue(this, f45507u[3], charSequence);
        }

        /* renamed from: z */
        public void mo43208z(Integer num) {
            this.f45513j.setValue(this, f45507u[4], num);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16118s(C9989p1 p1Var, int i, int i2) {
            super(p1Var, 0, i, 0, C17780e.selector_button_primary, i2, 10, (DefaultConstructorMarker) null);
            C9989p1 p1Var2 = p1Var;
            C41536l.m120489i(p1Var2, "binding");
            AppCompatTextView appCompatTextView = p1Var2.f27387f;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            this.f45508e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f45509f = new C18361h0(C16123e.f45528d);
            this.f45511h = new C18361h0(C16125g.f45530d);
            this.f45512i = new C18361h0(C16121c.f45526d);
            this.f45513j = new C18361h0(C16122d.f45527d);
            ProgressBar progressBar = p1Var2.f27386e;
            C41536l.m120488h(progressBar, "binding.loader");
            this.f45514k = new C18365j0(progressBar, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            this.f45515l = new C18361h0(C16127i.f45532d);
            this.f45516m = new C18361h0(C16124f.f45529d);
            this.f45517n = new C18361h0(C16126h.f45531d);
            this.f45518o = new C18361h0(C16119a.f45524d);
            this.f45519p = new C18361h0(C16130l.f45535d);
            this.f45520q = new C18361h0(C16131m.f45536d);
            this.f45521r = new C18361h0(C16129k.f45534d);
            this.f45522s = new C18361h0(C16120b.f45525d);
            this.f45523t = new C18361h0(C16128j.f45533d);
        }
    }

    private C15769a(C6201a aVar) {
        this.f44728a = -1;
        this.f44729b = -1;
        this.f44730c = -1;
        this.f44731d = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15769a(C6201a aVar, int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5, (DefaultConstructorMarker) null);
    }

    private C15769a(C6201a aVar, int i, int i2, int i3, int i4, int i5) {
        this(aVar, (DefaultConstructorMarker) null);
        if (i2 != 0) {
            this.f44728a = mo43194l().getResources().getDimensionPixelSize(i2);
        }
        if (i != 0) {
            this.f44729b = mo43194l().getResources().getDimensionPixelSize(i);
        }
        if (i3 != 0) {
            this.f44730c = mo43194l().getResources().getDimensionPixelSize(i3);
        }
        if (i4 != 0) {
            mo43197o().setBackgroundResource(i4);
        }
        if (i5 != 0) {
            mo43197o().setLayerStyle(i5);
        }
    }
}
