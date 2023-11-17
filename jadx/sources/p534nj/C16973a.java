package p534nj;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10000q5;
import p352ak.C9945j5;
import p352ak.C9953k5;
import p352ak.C9961l5;
import p352ak.C9969m5;
import p352ak.C9977n5;
import p352ak.C9985o5;
import p352ak.C9993p5;
import p601sg.C17779d;
import p601sg.C17786k;
import p642vh.C18355e0;
import p642vh.C18361h0;
import p642vh.C18376o;
import p642vh.C18381t;
import ue1.C43064a;

/* renamed from: nj.a */
public abstract class C16973a {

    /* renamed from: a */
    private final C6201a f47404a;

    /* renamed from: nj.a$f */
    public static class C16997f extends C16973a {

        /* renamed from: k */
        static final /* synthetic */ C40303i[] f47473k;

        /* renamed from: b */
        private final C18355e0 f47474b;

        /* renamed from: c */
        private final C18361h0 f47475c = new C18361h0(C17002e.f47487d);

        /* renamed from: d */
        private final C18361h0 f47476d = new C18361h0(C16998a.f47483d);

        /* renamed from: e */
        private final C18361h0 f47477e = new C18361h0(C17000c.f47485d);

        /* renamed from: f */
        private final C18361h0 f47478f = new C18361h0(C17001d.f47486d);

        /* renamed from: g */
        private boolean f47479g;

        /* renamed from: h */
        private int f47480h;

        /* renamed from: i */
        private final C18361h0 f47481i = new C18361h0(C17003f.f47488d);

        /* renamed from: j */
        private final C18361h0 f47482j = new C18361h0(C16999b.f47484d);

        /* renamed from: nj.a$f$a */
        static final class C16998a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16998a f47483d = new C16998a();

            C16998a() {
                super(0);
            }

            public final Object invoke() {
                return "Single line text badge doesn't support caption text";
            }
        }

        /* renamed from: nj.a$f$b */
        static final class C16999b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16999b f47484d = new C16999b();

            C16999b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: nj.a$f$c */
        static final class C17000c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17000c f47485d = new C17000c();

            C17000c() {
                super(0);
            }

            public final Object invoke() {
                return "Single line text badge doesn't support icon";
            }
        }

        /* renamed from: nj.a$f$d */
        static final class C17001d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17001d f47486d = new C17001d();

            C17001d() {
                super(0);
            }

            public final Object invoke() {
                return "Single line text badge doesn't support icon tint";
            }
        }

        /* renamed from: nj.a$f$e */
        static final class C17002e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17002e f47487d = new C17002e();

            C17002e() {
                super(0);
            }

            public final Object invoke() {
                return "Single line text badge doesn't support second text";
            }
        }

        /* renamed from: nj.a$f$f */
        static final class C17003f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17003f f47488d = new C17003f();

            C17003f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16997f> cls = C16997f.class;
            f47473k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "badgeText", "getBadgeText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondText", "getBadgeSecondText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaption", "getBadgeCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIcon", "getBadgeIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIconTint", "getBadgeIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondTextColor", "getBadgeSecondTextColor()I", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaptionColor", "getBadgeCaptionColor()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16997f(C9969m5 m5Var) {
            super(m5Var, C17786k.LayerRadius12Shadow0, (DefaultConstructorMarker) null);
            C41536l.m120489i(m5Var, "binding");
            AppCompatTextView appCompatTextView = m5Var.f27278e;
            C41536l.m120488h(appCompatTextView, "binding.textBadgeText");
            this.f47474b = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public boolean mo44195a() {
            return this.f47479g;
        }

        /* renamed from: b */
        public CharSequence mo44196b() {
            return (CharSequence) this.f47476d.getValue(this, f47473k[2]);
        }

        /* renamed from: c */
        public Drawable mo44197c() {
            return (Drawable) this.f47477e.getValue(this, f47473k[3]);
        }

        /* renamed from: d */
        public ColorStateList mo44198d() {
            return (ColorStateList) this.f47478f.getValue(this, f47473k[4]);
        }

        /* renamed from: e */
        public CharSequence mo44199e() {
            return (CharSequence) this.f47475c.getValue(this, f47473k[1]);
        }

        /* renamed from: f */
        public CharSequence mo44200f() {
            return this.f47474b.getValue(this, f47473k[0]);
        }

        /* renamed from: g */
        public int mo44201g() {
            return this.f47480h;
        }

        /* renamed from: k */
        public void mo44205k(boolean z) {
            int i;
            this.f47479g = z;
            Resources resources = mo44203i().getResources();
            if (z) {
                i = C17779d.f49645S1;
            } else {
                i = C17779d.f49642K1;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            AppCompatTextView appCompatTextView = ((C9969m5) mo44202h()).f27278e;
            C41536l.m120488h(appCompatTextView, "binding.textBadgeText");
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) layoutParams;
                bVar.setMarginStart(dimensionPixelSize);
                bVar.setMarginEnd(dimensionPixelSize);
                appCompatTextView.setLayoutParams(bVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }

        /* renamed from: l */
        public void mo44206l(CharSequence charSequence) {
            this.f47476d.setValue(this, f47473k[2], charSequence);
        }

        /* renamed from: m */
        public void mo44207m(int i) {
            this.f47482j.setValue(this, f47473k[6], Integer.valueOf(i));
        }

        /* renamed from: n */
        public void mo44208n(Drawable drawable) {
            this.f47477e.setValue(this, f47473k[3], drawable);
        }

        /* renamed from: o */
        public void mo44209o(ColorStateList colorStateList) {
            this.f47478f.setValue(this, f47473k[4], colorStateList);
        }

        /* renamed from: p */
        public void mo44210p(CharSequence charSequence) {
            this.f47475c.setValue(this, f47473k[1], charSequence);
        }

        /* renamed from: q */
        public void mo44211q(int i) {
            this.f47481i.setValue(this, f47473k[5], Integer.valueOf(i));
        }

        /* renamed from: r */
        public void mo44212r(CharSequence charSequence) {
            this.f47474b.setValue(this, f47473k[0], charSequence);
        }

        /* renamed from: s */
        public void mo44213s(int i) {
            this.f47480h = i;
            ((C9969m5) mo44202h()).f27278e.setTextColor(i);
        }
    }

    /* renamed from: nj.a$g */
    public static class C17004g extends C16973a {

        /* renamed from: k */
        static final /* synthetic */ C40303i[] f47489k;

        /* renamed from: b */
        private final C18355e0 f47490b;

        /* renamed from: c */
        private final C18361h0 f47491c = new C18361h0(C17009e.f47503d);

        /* renamed from: d */
        private final C18361h0 f47492d = new C18361h0(C17005a.f47499d);

        /* renamed from: e */
        private final C18361h0 f47493e = new C18361h0(C17007c.f47501d);

        /* renamed from: f */
        private final C18361h0 f47494f = new C18361h0(C17008d.f47502d);

        /* renamed from: g */
        private int f47495g;

        /* renamed from: h */
        private final C18361h0 f47496h = new C18361h0(C17010f.f47504d);

        /* renamed from: i */
        private final C18361h0 f47497i = new C18361h0(C17006b.f47500d);

        /* renamed from: j */
        private boolean f47498j;

        /* renamed from: nj.a$g$a */
        static final class C17005a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17005a f47499d = new C17005a();

            C17005a() {
                super(0);
            }

            public final Object invoke() {
                return "Single line text badge doesn't support caption text";
            }
        }

        /* renamed from: nj.a$g$b */
        static final class C17006b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17006b f47500d = new C17006b();

            C17006b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: nj.a$g$c */
        static final class C17007c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17007c f47501d = new C17007c();

            C17007c() {
                super(0);
            }

            public final Object invoke() {
                return "Single line text badge doesn't support icon";
            }
        }

        /* renamed from: nj.a$g$d */
        static final class C17008d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17008d f47502d = new C17008d();

            C17008d() {
                super(0);
            }

            public final Object invoke() {
                return "Single line text badge doesn't support icon tint";
            }
        }

        /* renamed from: nj.a$g$e */
        static final class C17009e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17009e f47503d = new C17009e();

            C17009e() {
                super(0);
            }

            public final Object invoke() {
                return "Single line text badge doesn't support second text";
            }
        }

        /* renamed from: nj.a$g$f */
        static final class C17010f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17010f f47504d = new C17010f();

            C17010f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C17004g> cls = C17004g.class;
            f47489k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "badgeText", "getBadgeText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondText", "getBadgeSecondText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaption", "getBadgeCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIcon", "getBadgeIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIconTint", "getBadgeIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondTextColor", "getBadgeSecondTextColor()I", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaptionColor", "getBadgeCaptionColor()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17004g(C9977n5 n5Var) {
            super(n5Var, C17786k.LayerRadius12Shadow0, (DefaultConstructorMarker) null);
            C41536l.m120489i(n5Var, "binding");
            AppCompatTextView appCompatTextView = n5Var.f27320e;
            C41536l.m120488h(appCompatTextView, "binding.textBadgeText");
            this.f47490b = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public boolean mo44195a() {
            return this.f47498j;
        }

        /* renamed from: b */
        public CharSequence mo44196b() {
            return (CharSequence) this.f47492d.getValue(this, f47489k[2]);
        }

        /* renamed from: c */
        public Drawable mo44197c() {
            return (Drawable) this.f47493e.getValue(this, f47489k[3]);
        }

        /* renamed from: d */
        public ColorStateList mo44198d() {
            return (ColorStateList) this.f47494f.getValue(this, f47489k[4]);
        }

        /* renamed from: e */
        public CharSequence mo44199e() {
            return (CharSequence) this.f47491c.getValue(this, f47489k[1]);
        }

        /* renamed from: f */
        public CharSequence mo44200f() {
            return this.f47490b.getValue(this, f47489k[0]);
        }

        /* renamed from: g */
        public int mo44201g() {
            return this.f47495g;
        }

        /* renamed from: k */
        public void mo44205k(boolean z) {
            int i;
            this.f47498j = z;
            Resources resources = mo44203i().getResources();
            if (z) {
                i = C17779d.f49645S1;
            } else {
                i = C17779d.f49642K1;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            AppCompatTextView appCompatTextView = ((C9977n5) mo44202h()).f27320e;
            C41536l.m120488h(appCompatTextView, "binding.textBadgeText");
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) layoutParams;
                bVar.setMarginStart(dimensionPixelSize);
                bVar.setMarginEnd(dimensionPixelSize);
                appCompatTextView.setLayoutParams(bVar);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }

        /* renamed from: l */
        public void mo44206l(CharSequence charSequence) {
            this.f47492d.setValue(this, f47489k[2], charSequence);
        }

        /* renamed from: m */
        public void mo44207m(int i) {
            this.f47497i.setValue(this, f47489k[6], Integer.valueOf(i));
        }

        /* renamed from: n */
        public void mo44208n(Drawable drawable) {
            this.f47493e.setValue(this, f47489k[3], drawable);
        }

        /* renamed from: o */
        public void mo44209o(ColorStateList colorStateList) {
            this.f47494f.setValue(this, f47489k[4], colorStateList);
        }

        /* renamed from: p */
        public void mo44210p(CharSequence charSequence) {
            this.f47491c.setValue(this, f47489k[1], charSequence);
        }

        /* renamed from: q */
        public void mo44211q(int i) {
            this.f47496h.setValue(this, f47489k[5], Integer.valueOf(i));
        }

        /* renamed from: r */
        public void mo44212r(CharSequence charSequence) {
            this.f47490b.setValue(this, f47489k[0], charSequence);
        }

        /* renamed from: s */
        public void mo44213s(int i) {
            this.f47495g = i;
            ((C9977n5) mo44202h()).f27320e.setTextColor(i);
        }
    }

    public /* synthetic */ C16973a(C6201a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i);
    }

    /* renamed from: a */
    public abstract boolean mo44195a();

    /* renamed from: b */
    public abstract CharSequence mo44196b();

    /* renamed from: c */
    public abstract Drawable mo44197c();

    /* renamed from: d */
    public abstract ColorStateList mo44198d();

    /* renamed from: e */
    public abstract CharSequence mo44199e();

    /* renamed from: f */
    public abstract CharSequence mo44200f();

    /* renamed from: g */
    public abstract int mo44201g();

    /* renamed from: h */
    public final C6201a mo44202h() {
        return this.f47404a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Context mo44203i() {
        Context context = this.f47404a.mo3946b().getContext();
        C41536l.m120488h(context, "binding.root.context");
        return context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final LayerView mo44204j() {
        ViewParent parent = this.f47404a.mo3946b().getParent();
        C41536l.m120487g(parent, "null cannot be cast to non-null type ge.bog.designsystem.components.layersandshadows.LayerView");
        return (LayerView) parent;
    }

    /* renamed from: k */
    public abstract void mo44205k(boolean z);

    /* renamed from: l */
    public abstract void mo44206l(CharSequence charSequence);

    /* renamed from: m */
    public abstract void mo44207m(int i);

    /* renamed from: n */
    public abstract void mo44208n(Drawable drawable);

    /* renamed from: o */
    public abstract void mo44209o(ColorStateList colorStateList);

    /* renamed from: p */
    public abstract void mo44210p(CharSequence charSequence);

    /* renamed from: q */
    public abstract void mo44211q(int i);

    /* renamed from: r */
    public abstract void mo44212r(CharSequence charSequence);

    /* renamed from: s */
    public abstract void mo44213s(int i);

    /* renamed from: nj.a$a */
    public static class C16974a extends C16973a {

        /* renamed from: k */
        static final /* synthetic */ C40303i[] f47405k;

        /* renamed from: b */
        private final C18355e0 f47406b;

        /* renamed from: c */
        private final C18361h0 f47407c;

        /* renamed from: d */
        private final C18355e0 f47408d;

        /* renamed from: e */
        private final C18361h0 f47409e;

        /* renamed from: f */
        private final C18361h0 f47410f;

        /* renamed from: g */
        private int f47411g;

        /* renamed from: h */
        private final C18361h0 f47412h;

        /* renamed from: i */
        private int f47413i;

        /* renamed from: j */
        private boolean f47414j;

        /* renamed from: nj.a$a$a */
        static final class C16975a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16975a f47415d = new C16975a();

            C16975a() {
                super(0);
            }

            public final Object invoke() {
                return "Caption badge doesn't support icon";
            }
        }

        /* renamed from: nj.a$a$b */
        static final class C16976b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16976b f47416d = new C16976b();

            C16976b() {
                super(0);
            }

            public final Object invoke() {
                return "Caption badge doesn't support icon tint";
            }
        }

        /* renamed from: nj.a$a$c */
        static final class C16977c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16977c f47417d = new C16977c();

            C16977c() {
                super(0);
            }

            public final Object invoke() {
                return "Caption badge doesn't support second text";
            }
        }

        /* renamed from: nj.a$a$d */
        static final class C16978d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16978d f47418d = new C16978d();

            C16978d() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16974a> cls = C16974a.class;
            f47405k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "badgeText", "getBadgeText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondText", "getBadgeSecondText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaption", "getBadgeCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIcon", "getBadgeIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIconTint", "getBadgeIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondTextColor", "getBadgeSecondTextColor()I", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C16974a(C9993p5 p5Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(p5Var, (i2 & 2) != 0 ? C17786k.LayerRadius12Shadow0 : i);
        }

        /* renamed from: a */
        public boolean mo44195a() {
            return this.f47414j;
        }

        /* renamed from: b */
        public CharSequence mo44196b() {
            return this.f47408d.getValue(this, f47405k[2]);
        }

        /* renamed from: c */
        public Drawable mo44197c() {
            return (Drawable) this.f47409e.getValue(this, f47405k[3]);
        }

        /* renamed from: d */
        public ColorStateList mo44198d() {
            return (ColorStateList) this.f47410f.getValue(this, f47405k[4]);
        }

        /* renamed from: e */
        public CharSequence mo44199e() {
            return (CharSequence) this.f47407c.getValue(this, f47405k[1]);
        }

        /* renamed from: f */
        public CharSequence mo44200f() {
            return this.f47406b.getValue(this, f47405k[0]);
        }

        /* renamed from: g */
        public int mo44201g() {
            return this.f47411g;
        }

        /* renamed from: k */
        public void mo44205k(boolean z) {
            int i;
            float f;
            this.f47414j = z;
            Resources resources = mo44203i().getResources();
            if (z) {
                i = C17779d.f49645S1;
            } else {
                i = C17779d.spacing_28;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            ConstraintLayout constraintLayout = ((C9993p5) mo44202h()).f27405e;
            C41536l.m120488h(constraintLayout, "binding.container");
            constraintLayout.setPadding(dimensionPixelSize, constraintLayout.getPaddingTop(), dimensionPixelSize, constraintLayout.getPaddingBottom());
            AppCompatTextView appCompatTextView = ((C9993p5) mo44202h()).f27406f;
            C41536l.m120488h(appCompatTextView, "binding.textWithCaptionText");
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) layoutParams;
                float f2 = Utils.FLOAT_EPSILON;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 0.5f;
                }
                bVar.f2496G = f;
                appCompatTextView.setLayoutParams(bVar);
                AppCompatTextView appCompatTextView2 = ((C9993p5) mo44202h()).f27407g;
                C41536l.m120488h(appCompatTextView2, "binding.textWithCaptionValue");
                ViewGroup.LayoutParams layoutParams2 = appCompatTextView2.getLayoutParams();
                if (layoutParams2 != null) {
                    ConstraintLayout.C0620b bVar2 = (ConstraintLayout.C0620b) layoutParams2;
                    if (!z) {
                        f2 = 0.5f;
                    }
                    bVar2.f2496G = f2;
                    appCompatTextView2.setLayoutParams(bVar2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }

        /* renamed from: l */
        public void mo44206l(CharSequence charSequence) {
            this.f47408d.setValue(this, f47405k[2], charSequence);
        }

        /* renamed from: m */
        public void mo44207m(int i) {
            this.f47413i = i;
            ((C9993p5) mo44202h()).f27407g.setTextColor(i);
        }

        /* renamed from: n */
        public void mo44208n(Drawable drawable) {
            this.f47409e.setValue(this, f47405k[3], drawable);
        }

        /* renamed from: o */
        public void mo44209o(ColorStateList colorStateList) {
            this.f47410f.setValue(this, f47405k[4], colorStateList);
        }

        /* renamed from: p */
        public void mo44210p(CharSequence charSequence) {
            this.f47407c.setValue(this, f47405k[1], charSequence);
        }

        /* renamed from: q */
        public void mo44211q(int i) {
            this.f47412h.setValue(this, f47405k[5], Integer.valueOf(i));
        }

        /* renamed from: r */
        public void mo44212r(CharSequence charSequence) {
            this.f47406b.setValue(this, f47405k[0], charSequence);
        }

        /* renamed from: s */
        public void mo44213s(int i) {
            this.f47411g = i;
            ((C9993p5) mo44202h()).f27406f.setTextColor(i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16974a(C9993p5 p5Var, int i) {
            super(p5Var, i, (DefaultConstructorMarker) null);
            C41536l.m120489i(p5Var, "binding");
            AppCompatTextView appCompatTextView = p5Var.f27406f;
            C41536l.m120488h(appCompatTextView, "binding.textWithCaptionText");
            this.f47406b = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f47407c = new C18361h0(C16977c.f47417d);
            AppCompatTextView appCompatTextView2 = p5Var.f27407g;
            C41536l.m120488h(appCompatTextView2, "binding.textWithCaptionValue");
            this.f47408d = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f47409e = new C18361h0(C16975a.f47415d);
            this.f47410f = new C18361h0(C16976b.f47416d);
            this.f47412h = new C18361h0(C16978d.f47418d);
        }
    }

    /* renamed from: nj.a$b */
    public static class C16979b extends C16973a {

        /* renamed from: k */
        static final /* synthetic */ C40303i[] f47419k;

        /* renamed from: b */
        private final C18355e0 f47420b;

        /* renamed from: c */
        private final C18361h0 f47421c;

        /* renamed from: d */
        private final C18355e0 f47422d;

        /* renamed from: e */
        private final C18361h0 f47423e;

        /* renamed from: f */
        private final C18361h0 f47424f;

        /* renamed from: g */
        private int f47425g;

        /* renamed from: h */
        private final C18361h0 f47426h;

        /* renamed from: i */
        private int f47427i;

        /* renamed from: j */
        private boolean f47428j;

        /* renamed from: nj.a$b$a */
        static final class C16980a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16980a f47429d = new C16980a();

            C16980a() {
                super(0);
            }

            public final Object invoke() {
                return "Caption badge doesn't support icon";
            }
        }

        /* renamed from: nj.a$b$b */
        static final class C16981b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16981b f47430d = new C16981b();

            C16981b() {
                super(0);
            }

            public final Object invoke() {
                return "Caption badge doesn't support icon tint";
            }
        }

        /* renamed from: nj.a$b$c */
        static final class C16982c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16982c f47431d = new C16982c();

            C16982c() {
                super(0);
            }

            public final Object invoke() {
                return "Caption badge doesn't support second text";
            }
        }

        /* renamed from: nj.a$b$d */
        static final class C16983d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16983d f47432d = new C16983d();

            C16983d() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16979b> cls = C16979b.class;
            f47419k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "badgeText", "getBadgeText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondText", "getBadgeSecondText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaption", "getBadgeCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIcon", "getBadgeIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIconTint", "getBadgeIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondTextColor", "getBadgeSecondTextColor()I", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C16979b(C10000q5 q5Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(q5Var, (i2 & 2) != 0 ? C17786k.LayerRadius12Shadow0 : i);
        }

        /* renamed from: a */
        public boolean mo44195a() {
            return this.f47428j;
        }

        /* renamed from: b */
        public CharSequence mo44196b() {
            return this.f47422d.getValue(this, f47419k[2]);
        }

        /* renamed from: c */
        public Drawable mo44197c() {
            return (Drawable) this.f47423e.getValue(this, f47419k[3]);
        }

        /* renamed from: d */
        public ColorStateList mo44198d() {
            return (ColorStateList) this.f47424f.getValue(this, f47419k[4]);
        }

        /* renamed from: e */
        public CharSequence mo44199e() {
            return (CharSequence) this.f47421c.getValue(this, f47419k[1]);
        }

        /* renamed from: f */
        public CharSequence mo44200f() {
            return this.f47420b.getValue(this, f47419k[0]);
        }

        /* renamed from: g */
        public int mo44201g() {
            return this.f47425g;
        }

        /* renamed from: k */
        public void mo44205k(boolean z) {
            int i;
            this.f47428j = z;
            Resources resources = mo44203i().getResources();
            if (z) {
                i = C17779d.f49645S1;
            } else {
                i = C17779d.f49642K1;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            AppCompatTextView appCompatTextView = ((C10000q5) mo44202h()).f27436e;
            C41536l.m120488h(appCompatTextView, "binding.textWithCaptionText");
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(dimensionPixelSize);
                layoutParams2.setMarginEnd(dimensionPixelSize);
                appCompatTextView.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }

        /* renamed from: l */
        public void mo44206l(CharSequence charSequence) {
            this.f47422d.setValue(this, f47419k[2], charSequence);
        }

        /* renamed from: m */
        public void mo44207m(int i) {
            this.f47427i = i;
            ((C10000q5) mo44202h()).f27437f.setTextColor(i);
        }

        /* renamed from: n */
        public void mo44208n(Drawable drawable) {
            this.f47423e.setValue(this, f47419k[3], drawable);
        }

        /* renamed from: o */
        public void mo44209o(ColorStateList colorStateList) {
            this.f47424f.setValue(this, f47419k[4], colorStateList);
        }

        /* renamed from: p */
        public void mo44210p(CharSequence charSequence) {
            this.f47421c.setValue(this, f47419k[1], charSequence);
        }

        /* renamed from: q */
        public void mo44211q(int i) {
            this.f47426h.setValue(this, f47419k[5], Integer.valueOf(i));
        }

        /* renamed from: r */
        public void mo44212r(CharSequence charSequence) {
            this.f47420b.setValue(this, f47419k[0], charSequence);
        }

        /* renamed from: s */
        public void mo44213s(int i) {
            this.f47425g = i;
            ((C10000q5) mo44202h()).f27436e.setTextColor(i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16979b(C10000q5 q5Var, int i) {
            super(q5Var, i, (DefaultConstructorMarker) null);
            C41536l.m120489i(q5Var, "binding");
            AppCompatTextView appCompatTextView = q5Var.f27436e;
            C41536l.m120488h(appCompatTextView, "binding.textWithCaptionText");
            this.f47420b = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f47421c = new C18361h0(C16982c.f47431d);
            AppCompatTextView appCompatTextView2 = q5Var.f27437f;
            C41536l.m120488h(appCompatTextView2, "binding.textWithCaptionValue");
            this.f47422d = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f47423e = new C18361h0(C16980a.f47429d);
            this.f47424f = new C18361h0(C16981b.f47430d);
            this.f47426h = new C18361h0(C16983d.f47432d);
        }
    }

    /* renamed from: nj.a$c */
    public static class C16984c extends C16973a {

        /* renamed from: k */
        static final /* synthetic */ C40303i[] f47433k;

        /* renamed from: b */
        private final C18355e0 f47434b;

        /* renamed from: c */
        private final C18355e0 f47435c;

        /* renamed from: d */
        private final C18361h0 f47436d;

        /* renamed from: e */
        private final C18361h0 f47437e;

        /* renamed from: f */
        private final C18361h0 f47438f;

        /* renamed from: g */
        private boolean f47439g;

        /* renamed from: h */
        private int f47440h;

        /* renamed from: i */
        private int f47441i;

        /* renamed from: j */
        private final C18361h0 f47442j;

        /* renamed from: nj.a$c$a */
        static final class C16985a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16985a f47443d = new C16985a();

            C16985a() {
                super(0);
            }

            public final Object invoke() {
                return "Double text badge doesn't support caption";
            }
        }

        /* renamed from: nj.a$c$b */
        static final class C16986b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16986b f47444d = new C16986b();

            C16986b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: nj.a$c$c */
        static final class C16987c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16987c f47445d = new C16987c();

            C16987c() {
                super(0);
            }

            public final Object invoke() {
                return "Double text badge doesn't support icon";
            }
        }

        /* renamed from: nj.a$c$d */
        static final class C16988d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16988d f47446d = new C16988d();

            C16988d() {
                super(0);
            }

            public final Object invoke() {
                return "Double text badge doesn't support icon tint";
            }
        }

        static {
            Class<C16984c> cls = C16984c.class;
            f47433k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "badgeText", "getBadgeText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondText", "getBadgeSecondText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaption", "getBadgeCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIcon", "getBadgeIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIconTint", "getBadgeIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaptionColor", "getBadgeCaptionColor()I", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C16984c(C9945j5 j5Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j5Var, (i2 & 2) != 0 ? C17786k.LayerRadius12Shadow0 : i);
        }

        /* renamed from: a */
        public boolean mo44195a() {
            return this.f47439g;
        }

        /* renamed from: b */
        public CharSequence mo44196b() {
            return (CharSequence) this.f47436d.getValue(this, f47433k[2]);
        }

        /* renamed from: c */
        public Drawable mo44197c() {
            return (Drawable) this.f47437e.getValue(this, f47433k[3]);
        }

        /* renamed from: d */
        public ColorStateList mo44198d() {
            return (ColorStateList) this.f47438f.getValue(this, f47433k[4]);
        }

        /* renamed from: e */
        public CharSequence mo44199e() {
            return this.f47435c.getValue(this, f47433k[1]);
        }

        /* renamed from: f */
        public CharSequence mo44200f() {
            return this.f47434b.getValue(this, f47433k[0]);
        }

        /* renamed from: g */
        public int mo44201g() {
            return this.f47440h;
        }

        /* renamed from: k */
        public void mo44205k(boolean z) {
            int i;
            this.f47439g = z;
            Resources resources = mo44203i().getResources();
            if (z) {
                i = C17779d.f49645S1;
            } else {
                i = C17779d.text_badge_view_horizontal_margin;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            ConstraintLayout constraintLayout = ((C9945j5) mo44202h()).f27169e;
            C41536l.m120488h(constraintLayout, "binding.container");
            constraintLayout.setPadding(dimensionPixelSize, constraintLayout.getPaddingTop(), dimensionPixelSize, constraintLayout.getPaddingBottom());
        }

        /* renamed from: l */
        public void mo44206l(CharSequence charSequence) {
            this.f47436d.setValue(this, f47433k[2], charSequence);
        }

        /* renamed from: m */
        public void mo44207m(int i) {
            this.f47442j.setValue(this, f47433k[5], Integer.valueOf(i));
        }

        /* renamed from: n */
        public void mo44208n(Drawable drawable) {
            this.f47437e.setValue(this, f47433k[3], drawable);
        }

        /* renamed from: o */
        public void mo44209o(ColorStateList colorStateList) {
            this.f47438f.setValue(this, f47433k[4], colorStateList);
        }

        /* renamed from: p */
        public void mo44210p(CharSequence charSequence) {
            this.f47435c.setValue(this, f47433k[1], charSequence);
        }

        /* renamed from: q */
        public void mo44211q(int i) {
            this.f47441i = i;
            ((C9945j5) mo44202h()).f27171g.setTextColor(i);
        }

        /* renamed from: r */
        public void mo44212r(CharSequence charSequence) {
            this.f47434b.setValue(this, f47433k[0], charSequence);
        }

        /* renamed from: s */
        public void mo44213s(int i) {
            this.f47440h = i;
            ((C9945j5) mo44202h()).f27170f.setTextColor(i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16984c(C9945j5 j5Var, int i) {
            super(j5Var, i, (DefaultConstructorMarker) null);
            C41536l.m120489i(j5Var, "binding");
            AppCompatTextView appCompatTextView = j5Var.f27170f;
            C41536l.m120488h(appCompatTextView, "binding.doubleTextBadgeText");
            this.f47434b = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = j5Var.f27171g;
            C41536l.m120488h(appCompatTextView2, "binding.doubleTextSecond");
            this.f47435c = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f47436d = new C18361h0(C16985a.f47443d);
            this.f47437e = new C18361h0(C16987c.f47445d);
            this.f47438f = new C18361h0(C16988d.f47446d);
            this.f47442j = new C18361h0(C16986b.f47444d);
        }
    }

    /* renamed from: nj.a$d */
    public static class C16989d extends C16973a {

        /* renamed from: k */
        static final /* synthetic */ C40303i[] f47447k;

        /* renamed from: b */
        private final C18355e0 f47448b;

        /* renamed from: c */
        private final C18355e0 f47449c;

        /* renamed from: d */
        private final C18355e0 f47450d;

        /* renamed from: e */
        private final C18361h0 f47451e;

        /* renamed from: f */
        private final C18361h0 f47452f;

        /* renamed from: g */
        private int f47453g;

        /* renamed from: h */
        private int f47454h;

        /* renamed from: i */
        private int f47455i;

        /* renamed from: j */
        private boolean f47456j;

        /* renamed from: nj.a$d$a */
        static final class C16990a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16990a f47457d = new C16990a();

            C16990a() {
                super(0);
            }

            public final Object invoke() {
                return "Double with caption doesn't support icon";
            }
        }

        /* renamed from: nj.a$d$b */
        static final class C16991b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16991b f47458d = new C16991b();

            C16991b() {
                super(0);
            }

            public final Object invoke() {
                return "Double with caption doesn't support icon tint";
            }
        }

        static {
            Class<C16989d> cls = C16989d.class;
            f47447k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "badgeText", "getBadgeText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondText", "getBadgeSecondText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaption", "getBadgeCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIcon", "getBadgeIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIconTint", "getBadgeIconTint()Landroid/content/res/ColorStateList;", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C16989d(C9953k5 k5Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(k5Var, (i2 & 2) != 0 ? C17786k.LayerRadius12Shadow0 : i);
        }

        /* renamed from: a */
        public boolean mo44195a() {
            return this.f47456j;
        }

        /* renamed from: b */
        public CharSequence mo44196b() {
            return this.f47450d.getValue(this, f47447k[2]);
        }

        /* renamed from: c */
        public Drawable mo44197c() {
            return (Drawable) this.f47451e.getValue(this, f47447k[3]);
        }

        /* renamed from: d */
        public ColorStateList mo44198d() {
            return (ColorStateList) this.f47452f.getValue(this, f47447k[4]);
        }

        /* renamed from: e */
        public CharSequence mo44199e() {
            return this.f47449c.getValue(this, f47447k[1]);
        }

        /* renamed from: f */
        public CharSequence mo44200f() {
            return this.f47448b.getValue(this, f47447k[0]);
        }

        /* renamed from: g */
        public int mo44201g() {
            return this.f47453g;
        }

        /* renamed from: k */
        public void mo44205k(boolean z) {
            int i;
            this.f47456j = z;
            Resources resources = mo44203i().getResources();
            if (z) {
                i = C17779d.f49645S1;
            } else {
                i = C17779d.spacing_12;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            ConstraintLayout constraintLayout = ((C9953k5) mo44202h()).f27211e;
            C41536l.m120488h(constraintLayout, "binding.container");
            constraintLayout.setPadding(dimensionPixelSize, constraintLayout.getPaddingTop(), dimensionPixelSize, constraintLayout.getPaddingBottom());
        }

        /* renamed from: l */
        public void mo44206l(CharSequence charSequence) {
            this.f47450d.setValue(this, f47447k[2], charSequence);
        }

        /* renamed from: m */
        public void mo44207m(int i) {
            this.f47455i = i;
            ((C9953k5) mo44202h()).f27215i.setTextColor(i);
        }

        /* renamed from: n */
        public void mo44208n(Drawable drawable) {
            this.f47451e.setValue(this, f47447k[3], drawable);
        }

        /* renamed from: o */
        public void mo44209o(ColorStateList colorStateList) {
            this.f47452f.setValue(this, f47447k[4], colorStateList);
        }

        /* renamed from: p */
        public void mo44210p(CharSequence charSequence) {
            this.f47449c.setValue(this, f47447k[1], charSequence);
        }

        /* renamed from: q */
        public void mo44211q(int i) {
            this.f47454h = i;
            ((C9953k5) mo44202h()).f27213g.setTextColor(i);
        }

        /* renamed from: r */
        public void mo44212r(CharSequence charSequence) {
            this.f47448b.setValue(this, f47447k[0], charSequence);
        }

        /* renamed from: s */
        public void mo44213s(int i) {
            this.f47453g = i;
            ((C9953k5) mo44202h()).f27214h.setTextColor(i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16989d(C9953k5 k5Var, int i) {
            super(k5Var, i, (DefaultConstructorMarker) null);
            C41536l.m120489i(k5Var, "binding");
            AppCompatTextView appCompatTextView = k5Var.f27214h;
            C41536l.m120488h(appCompatTextView, "binding.doubleWithCaptionText");
            this.f47448b = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = k5Var.f27213g;
            C41536l.m120488h(appCompatTextView2, "binding.doubleWithCaptionSecond");
            this.f47449c = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView3 = k5Var.f27215i;
            C41536l.m120488h(appCompatTextView3, "binding.doubleWithCaptionValue");
            this.f47450d = new C18355e0(appCompatTextView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f47451e = new C18361h0(C16990a.f47457d);
            this.f47452f = new C18361h0(C16991b.f47458d);
        }
    }

    /* renamed from: nj.a$e */
    public static class C16992e extends C16973a {

        /* renamed from: k */
        static final /* synthetic */ C40303i[] f47459k;

        /* renamed from: b */
        private final C18355e0 f47460b;

        /* renamed from: c */
        private final C18361h0 f47461c;

        /* renamed from: d */
        private final C18361h0 f47462d;

        /* renamed from: e */
        private final C18376o f47463e;

        /* renamed from: f */
        private final C18381t f47464f;

        /* renamed from: g */
        private int f47465g;

        /* renamed from: h */
        private final C18361h0 f47466h;

        /* renamed from: i */
        private final C18361h0 f47467i;

        /* renamed from: j */
        private boolean f47468j;

        /* renamed from: nj.a$e$a */
        static final class C16993a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16993a f47469d = new C16993a();

            C16993a() {
                super(0);
            }

            public final Object invoke() {
                return "Caption badge doesn't support caption";
            }
        }

        /* renamed from: nj.a$e$b */
        static final class C16994b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16994b f47470d = new C16994b();

            C16994b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: nj.a$e$c */
        static final class C16995c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16995c f47471d = new C16995c();

            C16995c() {
                super(0);
            }

            public final Object invoke() {
                return "Icon badge doesn't support second text";
            }
        }

        /* renamed from: nj.a$e$d */
        static final class C16996d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16996d f47472d = new C16996d();

            C16996d() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C16992e> cls = C16992e.class;
            f47459k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "badgeText", "getBadgeText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondText", "getBadgeSecondText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaption", "getBadgeCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIcon", "getBadgeIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIconTint", "getBadgeIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondTextColor", "getBadgeSecondTextColor()I", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaptionColor", "getBadgeCaptionColor()I", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C16992e(C9961l5 l5Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(l5Var, (i2 & 2) != 0 ? C17786k.LayerRadius12Shadow0 : i);
        }

        /* renamed from: a */
        public boolean mo44195a() {
            return this.f47468j;
        }

        /* renamed from: b */
        public CharSequence mo44196b() {
            return (CharSequence) this.f47462d.getValue(this, f47459k[2]);
        }

        /* renamed from: c */
        public Drawable mo44197c() {
            return this.f47463e.getValue(this, f47459k[3]);
        }

        /* renamed from: d */
        public ColorStateList mo44198d() {
            return this.f47464f.getValue(this, f47459k[4]);
        }

        /* renamed from: e */
        public CharSequence mo44199e() {
            return (CharSequence) this.f47461c.getValue(this, f47459k[1]);
        }

        /* renamed from: f */
        public CharSequence mo44200f() {
            return this.f47460b.getValue(this, f47459k[0]);
        }

        /* renamed from: g */
        public int mo44201g() {
            return this.f47465g;
        }

        /* renamed from: k */
        public void mo44205k(boolean z) {
            int i;
            this.f47468j = z;
            Resources resources = mo44203i().getResources();
            if (z) {
                i = C17779d.f49645S1;
            } else {
                i = C17779d.spacing_12;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            ConstraintLayout constraintLayout = ((C9961l5) mo44202h()).f27248e;
            C41536l.m120488h(constraintLayout, "binding.container");
            constraintLayout.setPadding(dimensionPixelSize, constraintLayout.getPaddingTop(), dimensionPixelSize, constraintLayout.getPaddingBottom());
        }

        /* renamed from: l */
        public void mo44206l(CharSequence charSequence) {
            this.f47462d.setValue(this, f47459k[2], charSequence);
        }

        /* renamed from: m */
        public void mo44207m(int i) {
            this.f47467i.setValue(this, f47459k[6], Integer.valueOf(i));
        }

        /* renamed from: n */
        public void mo44208n(Drawable drawable) {
            this.f47463e.setValue(this, f47459k[3], drawable);
        }

        /* renamed from: o */
        public void mo44209o(ColorStateList colorStateList) {
            this.f47464f.setValue(this, f47459k[4], colorStateList);
        }

        /* renamed from: p */
        public void mo44210p(CharSequence charSequence) {
            this.f47461c.setValue(this, f47459k[1], charSequence);
        }

        /* renamed from: q */
        public void mo44211q(int i) {
            this.f47466h.setValue(this, f47459k[5], Integer.valueOf(i));
        }

        /* renamed from: r */
        public void mo44212r(CharSequence charSequence) {
            this.f47460b.setValue(this, f47459k[0], charSequence);
        }

        /* renamed from: s */
        public void mo44213s(int i) {
            this.f47465g = i;
            ((C9961l5) mo44202h()).f27250g.setTextColor(i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16992e(C9961l5 l5Var, int i) {
            super(l5Var, i, (DefaultConstructorMarker) null);
            C41536l.m120489i(l5Var, "binding");
            AppCompatTextView appCompatTextView = l5Var.f27250g;
            C41536l.m120488h(appCompatTextView, "binding.iconText");
            this.f47460b = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f47461c = new C18361h0(C16995c.f47471d);
            this.f47462d = new C18361h0(C16993a.f47469d);
            AppCompatImageView appCompatImageView = l5Var.f27249f;
            C41536l.m120488h(appCompatImageView, "binding.iconImage");
            this.f47463e = new C18376o(appCompatImageView);
            AppCompatImageView appCompatImageView2 = l5Var.f27249f;
            C41536l.m120488h(appCompatImageView2, "binding.iconImage");
            this.f47464f = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            this.f47466h = new C18361h0(C16996d.f47472d);
            this.f47467i = new C18361h0(C16994b.f47470d);
        }
    }

    /* renamed from: nj.a$h */
    public static class C17011h extends C16973a {

        /* renamed from: k */
        static final /* synthetic */ C40303i[] f47505k;

        /* renamed from: b */
        private final C18355e0 f47506b;

        /* renamed from: c */
        private final C18361h0 f47507c;

        /* renamed from: d */
        private final C18361h0 f47508d;

        /* renamed from: e */
        private final C18361h0 f47509e;

        /* renamed from: f */
        private final C18361h0 f47510f;

        /* renamed from: g */
        private int f47511g;

        /* renamed from: h */
        private final C18361h0 f47512h;

        /* renamed from: i */
        private final C18361h0 f47513i;

        /* renamed from: j */
        private boolean f47514j;

        /* renamed from: nj.a$h$a */
        static final class C17012a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17012a f47515d = new C17012a();

            C17012a() {
                super(0);
            }

            public final Object invoke() {
                return "Virtual card badge doesn't support caption";
            }
        }

        /* renamed from: nj.a$h$b */
        static final class C17013b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17013b f47516d = new C17013b();

            C17013b() {
                super(0);
            }

            public final void invoke() {
            }
        }

        /* renamed from: nj.a$h$c */
        static final class C17014c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17014c f47517d = new C17014c();

            C17014c() {
                super(0);
            }

            public final Object invoke() {
                return "Virtual card badge doesn't support icon";
            }
        }

        /* renamed from: nj.a$h$d */
        static final class C17015d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17015d f47518d = new C17015d();

            C17015d() {
                super(0);
            }

            public final Object invoke() {
                return "Virtual card badge doesn't support icon tint";
            }
        }

        /* renamed from: nj.a$h$e */
        static final class C17016e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17016e f47519d = new C17016e();

            C17016e() {
                super(0);
            }

            public final Object invoke() {
                return "Virtual card badge doesn't support second text";
            }
        }

        /* renamed from: nj.a$h$f */
        static final class C17017f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17017f f47520d = new C17017f();

            C17017f() {
                super(0);
            }

            public final void invoke() {
            }
        }

        static {
            Class<C17011h> cls = C17011h.class;
            f47505k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "badgeText", "getBadgeText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondText", "getBadgeSecondText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaption", "getBadgeCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIcon", "getBadgeIcon()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeIconTint", "getBadgeIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "badgeSecondTextColor", "getBadgeSecondTextColor()I", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCaptionColor", "getBadgeCaptionColor()I", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C17011h(C9985o5 o5Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(o5Var, (i2 & 2) != 0 ? C17786k.LayerRadius4Shadow0 : i);
        }

        /* renamed from: a */
        public boolean mo44195a() {
            return this.f47514j;
        }

        /* renamed from: b */
        public CharSequence mo44196b() {
            return (CharSequence) this.f47508d.getValue(this, f47505k[2]);
        }

        /* renamed from: c */
        public Drawable mo44197c() {
            return (Drawable) this.f47509e.getValue(this, f47505k[3]);
        }

        /* renamed from: d */
        public ColorStateList mo44198d() {
            return (ColorStateList) this.f47510f.getValue(this, f47505k[4]);
        }

        /* renamed from: e */
        public CharSequence mo44199e() {
            return (CharSequence) this.f47507c.getValue(this, f47505k[1]);
        }

        /* renamed from: f */
        public CharSequence mo44200f() {
            return this.f47506b.getValue(this, f47505k[0]);
        }

        /* renamed from: g */
        public int mo44201g() {
            return this.f47511g;
        }

        /* renamed from: k */
        public void mo44205k(boolean z) {
            this.f47514j = z;
        }

        /* renamed from: l */
        public void mo44206l(CharSequence charSequence) {
            this.f47508d.setValue(this, f47505k[2], charSequence);
        }

        /* renamed from: m */
        public void mo44207m(int i) {
            this.f47513i.setValue(this, f47505k[6], Integer.valueOf(i));
        }

        /* renamed from: n */
        public void mo44208n(Drawable drawable) {
            this.f47509e.setValue(this, f47505k[3], drawable);
        }

        /* renamed from: o */
        public void mo44209o(ColorStateList colorStateList) {
            this.f47510f.setValue(this, f47505k[4], colorStateList);
        }

        /* renamed from: p */
        public void mo44210p(CharSequence charSequence) {
            this.f47507c.setValue(this, f47505k[1], charSequence);
        }

        /* renamed from: q */
        public void mo44211q(int i) {
            this.f47512h.setValue(this, f47505k[5], Integer.valueOf(i));
        }

        /* renamed from: r */
        public void mo44212r(CharSequence charSequence) {
            this.f47506b.setValue(this, f47505k[0], charSequence);
        }

        /* renamed from: s */
        public void mo44213s(int i) {
            this.f47511g = i;
            ((C9985o5) mo44202h()).f27373e.setTextColor(i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17011h(C9985o5 o5Var, int i) {
            super(o5Var, i, (DefaultConstructorMarker) null);
            C41536l.m120489i(o5Var, "binding");
            AppCompatTextView appCompatTextView = o5Var.f27373e;
            C41536l.m120488h(appCompatTextView, "binding.virtualCardBadgeText");
            this.f47506b = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f47507c = new C18361h0(C17016e.f47519d);
            this.f47508d = new C18361h0(C17012a.f47515d);
            this.f47509e = new C18361h0(C17014c.f47517d);
            this.f47510f = new C18361h0(C17015d.f47518d);
            this.f47512h = new C18361h0(C17017f.f47520d);
            this.f47513i = new C18361h0(C17013b.f47516d);
        }
    }

    public /* synthetic */ C16973a(C6201a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private C16973a(C6201a aVar) {
        this.f47404a = aVar;
    }

    private C16973a(C6201a aVar, int i) {
        this(aVar, (DefaultConstructorMarker) null);
        if (i != 0) {
            mo44204j().setLayerStyle(i);
        }
    }
}
