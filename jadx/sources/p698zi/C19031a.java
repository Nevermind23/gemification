package p698zi;

import af1.C40303i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p352ak.C9952k4;
import p352ak.C9960l4;
import p601sg.C17779d;
import p601sg.C17780e;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18387x;
import ue1.C43075l;

/* renamed from: zi.a */
public abstract class C19031a {

    /* renamed from: d */
    static final /* synthetic */ C40303i[] f53167d = {C41520a0.m120439e(new C41539o(C19031a.class, "drawableType", "getDrawableType()Lge/bog/designsystem/components/pagedescription/PageDescriptionView$DrawableType;", 0))};

    /* renamed from: a */
    private final C6201a f53168a;

    /* renamed from: b */
    private final C41555e f53169b;

    /* renamed from: c */
    private Image f53170c;

    /* renamed from: zi.a$a */
    public static final class C19032a extends C19031a {

        /* renamed from: o */
        static final /* synthetic */ C40303i[] f53171o;

        /* renamed from: e */
        private final C9960l4 f53172e;

        /* renamed from: f */
        private final C18365j0 f53173f;

        /* renamed from: g */
        private final C18365j0 f53174g;

        /* renamed from: h */
        private String f53175h;

        /* renamed from: i */
        private CharSequence f53176i;

        /* renamed from: j */
        private View.OnClickListener f53177j;

        /* renamed from: k */
        private String f53178k;

        /* renamed from: l */
        private boolean f53179l;

        /* renamed from: m */
        private final C41555e f53180m = new C19033a((Object) null, this);

        /* renamed from: n */
        private PageDescriptionView.C13419a f53181n;

        /* renamed from: zi.a$a$a */
        public static final class C19033a extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C19032a f53182a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19033a(Object obj, C19032a aVar) {
                super(obj);
                this.f53182a = aVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Integer num = (Integer) obj2;
                if (!C41536l.m120484d((Integer) obj, num) && num != null) {
                    this.f53182a.mo47247z().f27243e.getBadgeView().setBadgeColor(Integer.valueOf(num.intValue()));
                }
            }
        }

        static {
            Class<C19032a> cls = C19032a.class;
            f53171o = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "isDrawableVisible", "isDrawableVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isTextVisible", "isTextVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0))};
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C19032a(p352ak.C9960l4 r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                java.lang.String r2 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r1, r2)
                r2 = 0
                r0.<init>(r1, r2)
                r0.f53172e = r1
                ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout r3 = r1.f27243e
                ge.bog.designsystem.components.notificationbadges.NotificationBadgeView r3 = r3.getBadgeView()
                ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Empty r4 = p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView.BadgeType.Empty.f39879d
                r3.setBadge(r4)
                vh.j0 r3 = new vh.j0
                ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout r6 = r1.f27243e
                java.lang.String r4 = "binding.badgeLayout"
                kotlin.jvm.internal.C41536l.m120488h(r6, r4)
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r3
                r5.<init>(r6, r7, r8, r9, r10)
                r0.f53173f = r3
                vh.j0 r3 = new vh.j0
                androidx.appcompat.widget.AppCompatTextView r12 = r1.f27245g
                java.lang.String r1 = "binding.pageDescriptionText"
                kotlin.jvm.internal.C41536l.m120488h(r12, r1)
                r13 = 0
                r14 = 0
                r15 = 6
                r16 = 0
                r11 = r3
                r11.<init>(r12, r13, r14, r15, r16)
                r0.f53174g = r3
                kotlin.properties.a r1 = kotlin.properties.C41551a.f97718a
                zi.a$a$a r1 = new zi.a$a$a
                r1.<init>(r2, r0)
                r0.f53180m = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p698zi.C19031a.C19032a.<init>(ak.l4):void");
        }

        /* renamed from: A */
        private final void m64336A() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            LottieAnimationView lottieAnimationView = this.f53172e.f27244f;
            C41536l.m120488h(lottieAnimationView, "binding.pageDescriptionImage");
            ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = mo47225d().mo36376e().mo46173a(mo47224c());
                layoutParams.height = mo47225d().mo36375c().mo46173a(mo47224c());
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    int dimensionPixelSize = mo47224c().getResources().getDimensionPixelSize(mo47225d().mo36377f());
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, mo47224c().getResources().getDimensionPixelSize(mo47225d().mo36378g()), marginLayoutParams.rightMargin, dimensionPixelSize);
                }
                lottieAnimationView.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }

        /* renamed from: a */
        public Integer mo47222a() {
            return (Integer) this.f53180m.getValue(this, f53171o[2]);
        }

        /* renamed from: b */
        public CharSequence mo47223b() {
            return this.f53176i;
        }

        /* renamed from: f */
        public String mo47227f() {
            return this.f53172e.f27245g.getText().toString();
        }

        /* renamed from: g */
        public String mo47228g() {
            return this.f53175h;
        }

        /* renamed from: h */
        public void mo47229h(Integer num) {
            this.f53180m.setValue(this, f53171o[2], num);
        }

        /* renamed from: i */
        public void mo47230i(View.OnClickListener onClickListener) {
            this.f53177j = onClickListener;
        }

        /* renamed from: j */
        public void mo47231j(CharSequence charSequence) {
            this.f53176i = charSequence;
        }

        /* renamed from: k */
        public void mo47232k(Image image) {
            mo47239r(image);
            if (image instanceof Image.Url) {
                String k = ((Image.Url) image).mo35411k();
                if (mo47225d() == PageDescriptionView.C13421b.CIRCLE_IMAGE || mo47225d() == PageDescriptionView.C13421b.CIRCLE_IMAGE_BIG) {
                    ((C2394j) ((C2394j) C2379b.m9211u(this.f53172e.f27244f).mo7757y(k).mo7220c0(C17780e.f49668q1)).mo7222d()).mo7718L0(this.f53172e.f27244f);
                } else {
                    ((C2394j) C2379b.m9211u(this.f53172e.f27244f).mo7757y(k).mo7220c0(C17780e.f49662k1)).mo7718L0(this.f53172e.f27244f);
                }
            } else {
                LottieAnimationView lottieAnimationView = this.f53172e.f27244f;
                C41536l.m120488h(lottieAnimationView, "binding.pageDescriptionImage");
                C18368l.m62746A(lottieAnimationView, image, (C43075l) null, 2, (Object) null);
            }
        }

        /* renamed from: l */
        public void mo47233l(PageDescriptionView.C13419a aVar) {
            this.f53181n = aVar;
        }

        /* renamed from: m */
        public void mo47234m(int i) {
            mo47235n(new Color.Resource(i));
        }

        /* renamed from: n */
        public void mo47235n(Color color) {
            C41536l.m120489i(color, "color");
            this.f53172e.f27244f.setImageTintList(color.mo35261b(mo47224c()));
        }

        /* renamed from: o */
        public void mo47236o(int i) {
            mo47235n(new Color.Attribute(i));
        }

        /* renamed from: p */
        public void mo47237p(int i) {
            mo47235n(new Color.Raw(i));
        }

        /* renamed from: t */
        public void mo47241t(boolean z) {
            this.f53179l = z;
            this.f53172e.f27243e.setBadgeVisible(z);
        }

        /* renamed from: u */
        public void mo47242u(Spanned spanned) {
            this.f53172e.f27245g.setText(spanned);
        }

        /* renamed from: v */
        public void mo47243v(String str) {
            this.f53178k = str;
            this.f53172e.f27245g.setText(str);
        }

        /* renamed from: w */
        public void mo47244w(int i) {
            this.f53172e.f27245g.setGravity(i);
        }

        /* renamed from: x */
        public void mo47245x(String str) {
            this.f53175h = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public void mo47246y(PageDescriptionView.C13421b bVar) {
            C41536l.m120489i(bVar, "drawableType");
            m64336A();
            if (bVar == PageDescriptionView.C13421b.CIRCLE_IMAGE_BIG) {
                this.f53172e.f27244f.setBackground(C0767a.m2895e(mo47224c(), C17780e.shape_page_description_icon_border));
            } else {
                this.f53172e.f27244f.setBackground((Drawable) null);
            }
        }

        /* renamed from: z */
        public final C9960l4 mo47247z() {
            return this.f53172e;
        }
    }

    /* renamed from: zi.a$b */
    public static final class C19034b extends C19031a {

        /* renamed from: p */
        static final /* synthetic */ C40303i[] f53183p;

        /* renamed from: e */
        private final C9952k4 f53184e;

        /* renamed from: f */
        private final C18365j0 f53185f;

        /* renamed from: g */
        private final C18365j0 f53186g;

        /* renamed from: h */
        private final C18365j0 f53187h;

        /* renamed from: i */
        private final C18387x f53188i;

        /* renamed from: j */
        private String f53189j;

        /* renamed from: k */
        private String f53190k;

        /* renamed from: l */
        private CharSequence f53191l;

        /* renamed from: m */
        private boolean f53192m;

        /* renamed from: n */
        private final C41555e f53193n = new C19035a((Object) null, this);

        /* renamed from: o */
        private final C41555e f53194o = new C19036b(PageDescriptionView.C13419a.NormalTitle, this);

        /* renamed from: zi.a$b$a */
        public static final class C19035a extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C19034b f53195a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19035a(Object obj, C19034b bVar) {
                super(obj);
                this.f53195a = bVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Integer num = (Integer) obj2;
                if (!C41536l.m120484d((Integer) obj, num) && num != null) {
                    this.f53195a.mo47248B().f27204e.getBadgeView().setBadgeColor(Integer.valueOf(num.intValue()));
                }
            }
        }

        /* renamed from: zi.a$b$b */
        public static final class C19036b extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C19034b f53196a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19036b(Object obj, C19034b bVar) {
                super(obj);
                this.f53196a = bVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                PageDescriptionView.C13419a aVar = (PageDescriptionView.C13419a) obj2;
                if (((PageDescriptionView.C13419a) obj) != aVar && aVar != null) {
                    this.f53196a.m64358C(aVar);
                }
            }
        }

        static {
            Class<C19034b> cls = C19034b.class;
            f53183p = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "isDrawableVisible", "isDrawableVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isTextVisible", "isTextVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isTitleVisible", "isTitleVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "buttonClickListener", "getButtonClickListener()Landroid/view/View$OnClickListener;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeColor", "getBadgeColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "descriptionType", "getDescriptionType()Lge/bog/designsystem/components/pagedescription/PageDescriptionView$DescriptionType;", 0))};
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C19034b(p352ak.C9952k4 r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                java.lang.String r2 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r1, r2)
                r2 = 0
                r0.<init>(r1, r2)
                r0.f53184e = r1
                ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout r3 = r1.f27204e
                ge.bog.designsystem.components.notificationbadges.NotificationBadgeView r3 = r3.getBadgeView()
                ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Empty r4 = p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView.BadgeType.Empty.f39879d
                r3.setBadge(r4)
                vh.j0 r3 = new vh.j0
                ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout r6 = r1.f27204e
                java.lang.String r4 = "binding.badgeLayout"
                kotlin.jvm.internal.C41536l.m120488h(r6, r4)
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r3
                r5.<init>(r6, r7, r8, r9, r10)
                r0.f53185f = r3
                vh.j0 r3 = new vh.j0
                androidx.appcompat.widget.AppCompatTextView r12 = r1.f27206g
                java.lang.String r4 = "binding.pageDescriptionBaseText"
                kotlin.jvm.internal.C41536l.m120488h(r12, r4)
                r13 = 0
                r14 = 0
                r15 = 6
                r16 = 0
                r11 = r3
                r11.<init>(r12, r13, r14, r15, r16)
                r0.f53186g = r3
                vh.j0 r3 = new vh.j0
                androidx.appcompat.widget.AppCompatTextView r5 = r1.f27209j
                java.lang.String r4 = "binding.pageDescriptionTitleText"
                kotlin.jvm.internal.C41536l.m120488h(r5, r4)
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                r4 = r3
                r4.<init>(r5, r6, r7, r8, r9)
                r0.f53187h = r3
                vh.x r3 = new vh.x
                ge.bog.designsystem.components.buttons.Button r1 = r1.f27207h
                java.lang.String r4 = "binding.pageDescriptionButton"
                kotlin.jvm.internal.C41536l.m120488h(r1, r4)
                r3.<init>(r1)
                r0.f53188i = r3
                kotlin.properties.a r1 = kotlin.properties.C41551a.f97718a
                zi.a$b$a r1 = new zi.a$b$a
                r1.<init>(r2, r0)
                r0.f53193n = r1
                ge.bog.designsystem.components.pagedescription.PageDescriptionView$a r1 = p341ge.bog.designsystem.components.pagedescription.PageDescriptionView.C13419a.NormalTitle
                zi.a$b$b r2 = new zi.a$b$b
                r2.<init>(r1, r0)
                r0.f53194o = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p698zi.C19031a.C19034b.<init>(ak.k4):void");
        }

        /* renamed from: A */
        private final void m64357A() {
            boolean z;
            boolean z2;
            boolean z3;
            int i;
            if (mo47226e() != null) {
                z = true;
            } else {
                z = false;
            }
            CharSequence text = this.f53184e.f27209j.getText();
            if (text == null || C40439w.m117118v(text)) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = !z2;
            CharSequence text2 = this.f53184e.f27206g.getText();
            if (text2 == null || C40439w.m117118v(text2)) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = true ^ z3;
            if (mo47225d() == PageDescriptionView.C13421b.CIRCLE_IMAGE) {
                i = mo47224c().getResources().getDimensionPixelSize(C17779d.spacing_24);
            } else {
                i = mo47224c().getResources().getDimensionPixelSize(C17779d.spacing_12);
            }
            if (z) {
                mo47240s(i);
            } else {
                mo47240s(0);
            }
            mo47250E(z5);
            mo47251F(z4);
            mo47249D(z);
        }

        /* access modifiers changed from: private */
        /* renamed from: C */
        public final void m64358C(PageDescriptionView.C13419a aVar) {
            C1314o.m4575q(this.f53184e.f27209j, aVar.mo36371e());
            C1314o.m4575q(this.f53184e.f27206g, aVar.mo36370c());
            ViewGroup.LayoutParams layoutParams = this.f53184e.f27209j.getLayoutParams();
            C41536l.m120487g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, mo47224c().getResources().getDimensionPixelSize(aVar.mo36372f()));
        }

        /* renamed from: G */
        private final void m64359G() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            LottieAnimationView lottieAnimationView = this.f53184e.f27208i;
            C41536l.m120488h(lottieAnimationView, "binding.pageDescriptionImage");
            ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = mo47225d().mo36376e().mo46173a(mo47224c());
                layoutParams.height = mo47225d().mo36375c().mo46173a(mo47224c());
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    int dimensionPixelSize = mo47224c().getResources().getDimensionPixelSize(mo47225d().mo36377f());
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, mo47224c().getResources().getDimensionPixelSize(mo47225d().mo36378g()), marginLayoutParams.rightMargin, dimensionPixelSize);
                }
                lottieAnimationView.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }

        /* renamed from: B */
        public final C9952k4 mo47248B() {
            return this.f53184e;
        }

        /* renamed from: D */
        public void mo47249D(boolean z) {
            this.f53185f.mo46151c(this, f53183p[0], z);
        }

        /* renamed from: E */
        public void mo47250E(boolean z) {
            this.f53186g.mo46151c(this, f53183p[1], z);
        }

        /* renamed from: F */
        public void mo47251F(boolean z) {
            this.f53187h.mo46151c(this, f53183p[2], z);
        }

        /* renamed from: a */
        public Integer mo47222a() {
            return (Integer) this.f53193n.getValue(this, f53183p[4]);
        }

        /* renamed from: b */
        public CharSequence mo47223b() {
            return this.f53191l;
        }

        /* renamed from: f */
        public String mo47227f() {
            return this.f53184e.f27206g.getText().toString();
        }

        /* renamed from: g */
        public String mo47228g() {
            return this.f53184e.f27209j.getText().toString();
        }

        /* renamed from: h */
        public void mo47229h(Integer num) {
            this.f53193n.setValue(this, f53183p[4], num);
        }

        /* renamed from: i */
        public void mo47230i(View.OnClickListener onClickListener) {
            this.f53188i.setValue(this, f53183p[3], onClickListener);
        }

        /* renamed from: j */
        public void mo47231j(CharSequence charSequence) {
            boolean z;
            this.f53191l = charSequence;
            Button button = this.f53184e.f27207h;
            button.setButtonText(charSequence);
            C41536l.m120488h(button, "_set_buttonText_$lambda$0");
            int i = 0;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                i = 8;
            }
            button.setVisibility(i);
        }

        /* renamed from: k */
        public void mo47232k(Image image) {
            mo47239r(image);
            if (image instanceof Image.Url) {
                String k = ((Image.Url) image).mo35411k();
                if (mo47225d() == PageDescriptionView.C13421b.CIRCLE_IMAGE || mo47225d() == PageDescriptionView.C13421b.CIRCLE_IMAGE_BIG) {
                    ((C2394j) ((C2394j) C2379b.m9211u(this.f53184e.f27208i).mo7757y(k).mo7220c0(C17780e.f49668q1)).mo7222d()).mo7718L0(this.f53184e.f27208i);
                } else {
                    ((C2394j) C2379b.m9211u(this.f53184e.f27208i).mo7757y(k).mo7220c0(C17780e.f49662k1)).mo7718L0(this.f53184e.f27208i);
                }
            } else {
                LottieAnimationView lottieAnimationView = this.f53184e.f27208i;
                C41536l.m120488h(lottieAnimationView, "binding.pageDescriptionImage");
                C18368l.m62746A(lottieAnimationView, image, (C43075l) null, 2, (Object) null);
                m64357A();
            }
        }

        /* renamed from: l */
        public void mo47233l(PageDescriptionView.C13419a aVar) {
            this.f53194o.setValue(this, f53183p[5], aVar);
        }

        /* renamed from: m */
        public void mo47234m(int i) {
            mo47235n(new Color.Resource(i));
        }

        /* renamed from: n */
        public void mo47235n(Color color) {
            C41536l.m120489i(color, "color");
            this.f53184e.f27208i.setImageTintList(color.mo35261b(mo47224c()));
        }

        /* renamed from: o */
        public void mo47236o(int i) {
            mo47235n(new Color.Attribute(i));
        }

        /* renamed from: p */
        public void mo47237p(int i) {
            mo47235n(new Color.Raw(i));
        }

        /* renamed from: t */
        public void mo47241t(boolean z) {
            this.f53192m = z;
            this.f53184e.f27204e.setBadgeVisible(z);
        }

        /* renamed from: u */
        public void mo47242u(Spanned spanned) {
            this.f53184e.f27206g.setText(spanned);
            m64357A();
        }

        /* renamed from: v */
        public void mo47243v(String str) {
            this.f53190k = str;
            this.f53184e.f27206g.setText(str);
            m64357A();
        }

        /* renamed from: w */
        public void mo47244w(int i) {
            this.f53184e.f27206g.setGravity(i);
        }

        /* renamed from: x */
        public void mo47245x(String str) {
            this.f53189j = str;
            this.f53184e.f27209j.setText(str);
            m64357A();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public void mo47246y(PageDescriptionView.C13421b bVar) {
            C41536l.m120489i(bVar, "drawableType");
            m64359G();
            if (bVar == PageDescriptionView.C13421b.CIRCLE_IMAGE_BIG) {
                this.f53184e.f27208i.setBackground(C0767a.m2895e(mo47224c(), C17780e.shape_page_description_icon_border));
            } else {
                this.f53184e.f27208i.setBackground((Drawable) null);
            }
        }
    }

    /* renamed from: zi.a$c */
    public static final class C19037c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C19031a f53197a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19037c(Object obj, C19031a aVar) {
            super(obj);
            this.f53197a = aVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            PageDescriptionView.C13421b bVar = (PageDescriptionView.C13421b) obj;
            this.f53197a.mo47246y((PageDescriptionView.C13421b) obj2);
        }
    }

    public /* synthetic */ C19031a(C6201a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: a */
    public abstract Integer mo47222a();

    /* renamed from: b */
    public abstract CharSequence mo47223b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Context mo47224c() {
        Context context = this.f53168a.mo3946b().getContext();
        C41536l.m120488h(context, "binding.root.context");
        return context;
    }

    /* renamed from: d */
    public final PageDescriptionView.C13421b mo47225d() {
        return (PageDescriptionView.C13421b) this.f53169b.getValue(this, f53167d[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Image mo47226e() {
        return this.f53170c;
    }

    /* renamed from: f */
    public abstract String mo47227f();

    /* renamed from: g */
    public abstract String mo47228g();

    /* renamed from: h */
    public abstract void mo47229h(Integer num);

    /* renamed from: i */
    public abstract void mo47230i(View.OnClickListener onClickListener);

    /* renamed from: j */
    public abstract void mo47231j(CharSequence charSequence);

    /* renamed from: k */
    public abstract void mo47232k(Image image);

    /* renamed from: l */
    public abstract void mo47233l(PageDescriptionView.C13419a aVar);

    /* renamed from: m */
    public abstract void mo47234m(int i);

    /* renamed from: n */
    public abstract void mo47235n(Color color);

    /* renamed from: o */
    public abstract void mo47236o(int i);

    /* renamed from: p */
    public abstract void mo47237p(int i);

    /* renamed from: q */
    public final void mo47238q(PageDescriptionView.C13421b bVar) {
        C41536l.m120489i(bVar, "<set-?>");
        this.f53169b.setValue(this, f53167d[0], bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo47239r(Image image) {
        this.f53170c = image;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo47240s(int i) {
        View b = this.f53168a.mo3946b();
        C41536l.m120488h(b, "binding.root");
        b.setPadding(b.getPaddingLeft(), i, b.getPaddingRight(), i);
    }

    /* renamed from: t */
    public abstract void mo47241t(boolean z);

    /* renamed from: u */
    public abstract void mo47242u(Spanned spanned);

    /* renamed from: v */
    public abstract void mo47243v(String str);

    /* renamed from: w */
    public abstract void mo47244w(int i);

    /* renamed from: x */
    public abstract void mo47245x(String str);

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo47246y(PageDescriptionView.C13421b bVar);

    private C19031a(C6201a aVar) {
        this.f53168a = aVar;
        C41551a aVar2 = C41551a.f97718a;
        this.f53169b = new C19037c(PageDescriptionView.C13421b.ICON, this);
    }
}
