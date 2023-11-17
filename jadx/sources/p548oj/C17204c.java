package p548oj;

import af1.C40303i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C1314o;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.load.resource.bitmap.C2507h0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p035c4.C2247a;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chipsbadge.ChipsBadgeView;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.currencybadge.CurrencyBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.timer.TimerView;
import p352ak.C10014s5;
import p352ak.C10028u5;
import p352ak.C10035v5;
import p352ak.C10042w5;
import p352ak.C10049x5;
import p352ak.C10056y5;
import p352ak.C10063z5;
import p352ak.C9874a6;
import p352ak.C9882b6;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p631uj.C18174a;
import p642vh.C18355e0;
import p642vh.C18361h0;
import p642vh.C18365j0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: oj.c */
public abstract class C17204c {

    /* renamed from: a */
    private final C6201a f48417a;

    /* renamed from: b */
    private C17202a f48418b;

    /* renamed from: oj.c$a */
    public static class C17205a extends C17204c {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f48419j;

        /* renamed from: c */
        private final C18355e0 f48420c;

        /* renamed from: d */
        private final C18361h0 f48421d = new C18361h0(C17211f.f48432d);

        /* renamed from: e */
        private final C18361h0 f48422e = new C18361h0(C17207b.f48428d);

        /* renamed from: f */
        private final C18361h0 f48423f = new C18361h0(C17206a.f48427d);

        /* renamed from: g */
        private final C41555e f48424g;

        /* renamed from: h */
        private final C18365j0 f48425h;

        /* renamed from: i */
        private final C18361h0 f48426i;

        /* renamed from: oj.c$a$a */
        static final class C17206a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17206a f48427d = new C17206a();

            C17206a() {
                super(0);
            }

            public final Object invoke() {
                return "Big does not support button";
            }
        }

        /* renamed from: oj.c$a$b */
        static final class C17207b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17207b f48428d = new C17207b();

            C17207b() {
                super(0);
            }

            public final Object invoke() {
                return "Big does not support caption";
            }
        }

        /* renamed from: oj.c$a$c */
        static final class C17208c extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C17208c f48429d = new C17208c();

            C17208c() {
                super(1);
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                C2247a c0 = jVar.mo7220c0(C17780e.f49662k1);
                C41536l.m120488h(c0, "placeholder(R.drawable.thumbnail_1_1)");
                return (C2394j) c0;
            }
        }

        /* renamed from: oj.c$a$d */
        static final class C17209d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17209d f48430d = new C17209d();

            C17209d() {
                super(0);
            }

            public final Object invoke() {
                return "Big does not support badge";
            }
        }

        /* renamed from: oj.c$a$e */
        public static final class C17210e extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10014s5 f48431a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17210e(Object obj, C10014s5 s5Var) {
                super(obj);
                this.f48431a = s5Var;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Image image = (Image) obj2;
                if (!C41536l.m120484d((Image) obj, image)) {
                    LottieAnimationView lottieAnimationView = this.f48431a.f27546h;
                    C41536l.m120488h(lottieAnimationView, "binding.image");
                    C18368l.m62777z(lottieAnimationView, image, C17208c.f48429d);
                }
            }
        }

        /* renamed from: oj.c$a$f */
        static final class C17211f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17211f f48432d = new C17211f();

            C17211f() {
                super(0);
            }

            public final Object invoke() {
                return "Big does not support text";
            }
        }

        static {
            Class<C17205a> cls = C17205a.class;
            f48419j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "description", "getDescription()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "caption", "getCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "button", "getButton()Lge/bog/designsystem/components/buttons/Button;", 0)), C41520a0.m120439e(new C41539o(cls, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "dismissButtonVisible", "getDismissButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isNewBadgeVisible", "isNewBadgeVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17205a(C10014s5 s5Var) {
            super(s5Var, 0, new Color.Attribute(C17777b.f49596k), C17786k.LayerRadius12Shadow0, 2, (DefaultConstructorMarker) null);
            C41536l.m120489i(s5Var, "binding");
            AppCompatTextView appCompatTextView = s5Var.f27544f;
            C41536l.m120488h(appCompatTextView, "binding.description");
            this.f48420c = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            C41551a aVar = C41551a.f97718a;
            this.f48424g = new C17210e((Object) null, s5Var);
            LayerView c = s5Var.f27545g.mo3946b();
            C41536l.m120488h(c, "binding.dismissButton.root");
            this.f48425h = new C18365j0(c, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            this.f48426i = new C18361h0(C17209d.f48430d);
            LayerView c2 = s5Var.f27545g.mo3946b();
            C41536l.m120488h(c2, "binding.dismissButton.root");
            mo44620c(c2);
        }

        /* renamed from: b */
        public void mo44619b(List list) {
            C41536l.m120489i(list, "badges");
            Context context = ((C10014s5) mo44621e()).mo3946b().getContext();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C17779d.f49644Q1);
            ((C10014s5) mo44621e()).f27543e.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41536l.m120488h(context, "context");
                ChipsBadgeView chipsBadgeView = new ChipsBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                chipsBadgeView.setBadgeType((ChipsBadgeView.C13241a) it.next());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMargins(dimensionPixelSize, 0, 0, 0);
                chipsBadgeView.setLayoutParams(marginLayoutParams);
                ((C10014s5) mo44621e()).f27543e.addView(chipsBadgeView);
            }
        }

        /* renamed from: f */
        public Button mo44622f() {
            return (Button) this.f48423f.getValue(this, f48419j[3]);
        }

        /* renamed from: g */
        public CharSequence mo44623g() {
            return (CharSequence) this.f48422e.getValue(this, f48419j[2]);
        }

        /* renamed from: h */
        public CharSequence mo44624h() {
            return this.f48420c.getValue(this, f48419j[0]);
        }

        /* renamed from: i */
        public boolean mo44625i() {
            return this.f48425h.getValue(this, f48419j[5]).booleanValue();
        }

        /* renamed from: j */
        public Image mo44626j() {
            return (Image) this.f48424g.getValue(this, f48419j[4]);
        }

        /* renamed from: l */
        public CharSequence mo44628l() {
            return (CharSequence) this.f48421d.getValue(this, f48419j[1]);
        }

        /* renamed from: m */
        public void mo44629m(Button button) {
            this.f48423f.setValue(this, f48419j[3], button);
        }

        /* renamed from: n */
        public void mo44630n(CharSequence charSequence) {
            this.f48422e.setValue(this, f48419j[2], charSequence);
        }

        /* renamed from: p */
        public void mo44632p(CharSequence charSequence) {
            this.f48420c.setValue(this, f48419j[0], charSequence);
        }

        /* renamed from: q */
        public void mo44633q(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C10014s5) mo44621e()).f27544f, num.intValue());
            }
            if (color != null) {
                AppCompatTextView appCompatTextView = ((C10014s5) mo44621e()).f27544f;
                Context context = ((C10014s5) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                appCompatTextView.setTextColor(color.mo35260a(context));
            }
        }

        /* renamed from: r */
        public void mo44634r(boolean z) {
            this.f48425h.mo46151c(this, f48419j[5], z);
        }

        /* renamed from: s */
        public void mo44635s(C18174a aVar, String str) {
            boolean z;
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(str, "text");
            TimerView timerView = ((C10014s5) mo44621e()).f27547i;
            timerView.setTimerState(aVar);
            timerView.setTimerText(str);
            TimerView timerView2 = ((C10014s5) mo44621e()).f27547i;
            C41536l.m120488h(timerView2, "binding.timer");
            if (aVar != C18174a.INVISIBLE) {
                z = true;
            } else {
                z = false;
            }
            C18368l.m62751F(timerView2, z, false, 2, (Object) null);
        }

        /* renamed from: t */
        public void mo44636t(Image image) {
            this.f48424g.setValue(this, f48419j[4], image);
        }

        /* renamed from: w */
        public void mo44639w(boolean z) {
            this.f48426i.setValue(this, f48419j[6], Boolean.valueOf(z));
        }

        /* renamed from: y */
        public void mo44641y(CharSequence charSequence) {
            this.f48421d.setValue(this, f48419j[1], charSequence);
        }

        /* renamed from: z */
        public void mo44642z(Integer num, Color color) {
            throw new UnsupportedOperationException("Big does not support text");
        }
    }

    /* renamed from: oj.c$b */
    public static class C17212b extends C17204c {

        /* renamed from: k */
        static final /* synthetic */ C40303i[] f48433k;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f48434c;

        /* renamed from: d */
        private final C18355e0 f48435d;

        /* renamed from: e */
        private final C18361h0 f48436e = new C18361h0(C17219g.f48449d);

        /* renamed from: f */
        private final C18361h0 f48437f = new C18361h0(C17214b.f48443d);

        /* renamed from: g */
        private final C18361h0 f48438g = new C18361h0(C17213a.f48442d);

        /* renamed from: h */
        private final C41555e f48439h;

        /* renamed from: i */
        private final C18361h0 f48440i;

        /* renamed from: j */
        private final C18361h0 f48441j;

        /* renamed from: oj.c$b$a */
        static final class C17213a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17213a f48442d = new C17213a();

            C17213a() {
                super(0);
            }

            public final Object invoke() {
                return "ExtraSmall does not support button";
            }
        }

        /* renamed from: oj.c$b$b */
        static final class C17214b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17214b f48443d = new C17214b();

            C17214b() {
                super(0);
            }

            public final Object invoke() {
                return "ExtraSmall does not support caption";
            }
        }

        /* renamed from: oj.c$b$c */
        static final class C17215c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17215c f48444d = new C17215c();

            C17215c() {
                super(0);
            }

            public final Object invoke() {
                return "ExtraSmall does not support dismissButtonVisible";
            }
        }

        /* renamed from: oj.c$b$d */
        static final class C17216d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C17212b f48445d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C17216d(C17212b bVar) {
                super(1);
                this.f48445d = bVar;
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                C2247a u0 = ((C2394j) jVar.mo7220c0(C17780e.f49662k1)).mo7252u0(new C2507h0(this.f48445d.f48434c));
                C41536l.m120488h(u0, "placeholder(R.drawable.t…m(RoundedCorners(radius))");
                return (C2394j) u0;
            }
        }

        /* renamed from: oj.c$b$e */
        static final class C17217e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17217e f48446d = new C17217e();

            C17217e() {
                super(0);
            }

            public final Object invoke() {
                return "ExtraImage does not support badge";
            }
        }

        /* renamed from: oj.c$b$f */
        public static final class C17218f extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10028u5 f48447a;

            /* renamed from: b */
            final /* synthetic */ C17212b f48448b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17218f(Object obj, C10028u5 u5Var, C17212b bVar) {
                super(obj);
                this.f48447a = u5Var;
                this.f48448b = bVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Image image = (Image) obj2;
                if (!C41536l.m120484d((Image) obj, image)) {
                    LottieAnimationView lottieAnimationView = this.f48447a.f27628e;
                    C41536l.m120488h(lottieAnimationView, "binding.imageView");
                    C18368l.m62777z(lottieAnimationView, image, new C17216d(this.f48448b));
                }
            }
        }

        /* renamed from: oj.c$b$g */
        static final class C17219g extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17219g f48449d = new C17219g();

            C17219g() {
                super(0);
            }

            public final Object invoke() {
                return "ExtraSmall does not support text";
            }
        }

        static {
            Class<C17212b> cls = C17212b.class;
            f48433k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "description", "getDescription()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "caption", "getCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "button", "getButton()Lge/bog/designsystem/components/buttons/Button;", 0)), C41520a0.m120439e(new C41539o(cls, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "dismissButtonVisible", "getDismissButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isNewBadgeVisible", "isNewBadgeVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17212b(C10028u5 u5Var) {
            super(u5Var, (DefaultConstructorMarker) null);
            C41536l.m120489i(u5Var, "binding");
            this.f48434c = u5Var.mo3946b().getContext().getResources().getDimensionPixelSize(C17779d.text_image_card_extra_small_image_radius);
            TextView textView = u5Var.f27629f;
            C41536l.m120488h(textView, "binding.textView");
            this.f48435d = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            C41551a aVar = C41551a.f97718a;
            this.f48439h = new C17218f((Object) null, u5Var, this);
            this.f48440i = new C18361h0(C17215c.f48444d);
            this.f48441j = new C18361h0(C17217e.f48446d);
        }

        /* renamed from: b */
        public void mo44619b(List list) {
            C41536l.m120489i(list, "badges");
            throw new UnsupportedOperationException("ExtraSmall does not support addBadges");
        }

        /* renamed from: f */
        public Button mo44622f() {
            return (Button) this.f48438g.getValue(this, f48433k[3]);
        }

        /* renamed from: g */
        public CharSequence mo44623g() {
            return (CharSequence) this.f48437f.getValue(this, f48433k[2]);
        }

        /* renamed from: h */
        public CharSequence mo44624h() {
            return this.f48435d.getValue(this, f48433k[0]);
        }

        /* renamed from: i */
        public boolean mo44625i() {
            return ((Boolean) this.f48440i.getValue(this, f48433k[5])).booleanValue();
        }

        /* renamed from: j */
        public Image mo44626j() {
            return (Image) this.f48439h.getValue(this, f48433k[4]);
        }

        /* renamed from: l */
        public CharSequence mo44628l() {
            return (CharSequence) this.f48436e.getValue(this, f48433k[1]);
        }

        /* renamed from: m */
        public void mo44629m(Button button) {
            this.f48438g.setValue(this, f48433k[3], button);
        }

        /* renamed from: n */
        public void mo44630n(CharSequence charSequence) {
            this.f48437f.setValue(this, f48433k[2], charSequence);
        }

        /* renamed from: p */
        public void mo44632p(CharSequence charSequence) {
            this.f48435d.setValue(this, f48433k[0], charSequence);
        }

        /* renamed from: q */
        public void mo44633q(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C10028u5) mo44621e()).f27629f, num.intValue());
            }
            if (color != null) {
                TextView textView = ((C10028u5) mo44621e()).f27629f;
                Context context = ((C10028u5) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                textView.setTextColor(color.mo35260a(context));
            }
        }

        /* renamed from: r */
        public void mo44634r(boolean z) {
            this.f48440i.setValue(this, f48433k[5], Boolean.valueOf(z));
        }

        /* renamed from: s */
        public void mo44635s(C18174a aVar, String str) {
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(str, "text");
            throw new UnsupportedOperationException("ExtraSmall does not support setExpirationTime");
        }

        /* renamed from: t */
        public void mo44636t(Image image) {
            this.f48439h.setValue(this, f48433k[4], image);
        }

        /* renamed from: w */
        public void mo44639w(boolean z) {
            this.f48441j.setValue(this, f48433k[6], Boolean.valueOf(z));
        }

        /* renamed from: y */
        public void mo44641y(CharSequence charSequence) {
            this.f48436e.setValue(this, f48433k[1], charSequence);
        }

        /* renamed from: z */
        public void mo44642z(Integer num, Color color) {
            throw new UnsupportedOperationException("ExtraSmall does not support text");
        }
    }

    /* renamed from: oj.c$c */
    public static class C17220c extends C17204c {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f48450j;

        /* renamed from: c */
        private final C18355e0 f48451c;

        /* renamed from: d */
        private final C18361h0 f48452d = new C18361h0(C17225e.f48462d);

        /* renamed from: e */
        private final C18361h0 f48453e = new C18361h0(C17221a.f48458d);

        /* renamed from: f */
        private Button f48454f;

        /* renamed from: g */
        private final C41555e f48455g;

        /* renamed from: h */
        private final C18365j0 f48456h;

        /* renamed from: i */
        private final C18361h0 f48457i;

        /* renamed from: oj.c$c$a */
        static final class C17221a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17221a f48458d = new C17221a();

            C17221a() {
                super(0);
            }

            public final Object invoke() {
                return "Image does not support caption";
            }
        }

        /* renamed from: oj.c$c$b */
        static final class C17222b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C17222b f48459d = new C17222b();

            C17222b() {
                super(1);
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                C2247a c0 = jVar.mo7220c0(C17780e.f49662k1);
                C41536l.m120488h(c0, "placeholder(R.drawable.thumbnail_1_1)");
                return (C2394j) c0;
            }
        }

        /* renamed from: oj.c$c$c */
        static final class C17223c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17223c f48460d = new C17223c();

            C17223c() {
                super(0);
            }

            public final Object invoke() {
                return "Image does not support badge";
            }
        }

        /* renamed from: oj.c$c$d */
        public static final class C17224d extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10035v5 f48461a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17224d(Object obj, C10035v5 v5Var) {
                super(obj);
                this.f48461a = v5Var;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Image image = (Image) obj2;
                if (!C41536l.m120484d((Image) obj, image)) {
                    LottieAnimationView lottieAnimationView = this.f48461a.f27678h;
                    C41536l.m120488h(lottieAnimationView, "binding.image");
                    C18368l.m62777z(lottieAnimationView, image, C17222b.f48459d);
                }
            }
        }

        /* renamed from: oj.c$c$e */
        static final class C17225e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17225e f48462d = new C17225e();

            C17225e() {
                super(0);
            }

            public final Object invoke() {
                return "Image does not support text";
            }
        }

        static {
            Class<C17220c> cls = C17220c.class;
            f48450j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "description", "getDescription()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "caption", "getCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "dismissButtonVisible", "getDismissButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isNewBadgeVisible", "isNewBadgeVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17220c(C10035v5 v5Var) {
            super(v5Var, C17780e.gradient_base_solid_positive, (Color) null, C17786k.f49834t, 4, (DefaultConstructorMarker) null);
            C41536l.m120489i(v5Var, "binding");
            AppCompatTextView appCompatTextView = v5Var.f27676f;
            C41536l.m120488h(appCompatTextView, "binding.description");
            this.f48451c = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f48454f = v5Var.f27675e;
            C41551a aVar = C41551a.f97718a;
            this.f48455g = new C17224d((Object) null, v5Var);
            LayerView c = v5Var.f27677g.mo3946b();
            C41536l.m120488h(c, "binding.dismissButton.root");
            this.f48456h = new C18365j0(c, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            this.f48457i = new C18361h0(C17223c.f48460d);
            LayerView c2 = v5Var.f27677g.mo3946b();
            C41536l.m120488h(c2, "binding.dismissButton.root");
            mo44620c(c2);
        }

        /* renamed from: b */
        public void mo44619b(List list) {
            C41536l.m120489i(list, "badges");
            throw new UnsupportedOperationException("Image does not support addBadges");
        }

        /* renamed from: f */
        public Button mo44622f() {
            return this.f48454f;
        }

        /* renamed from: g */
        public CharSequence mo44623g() {
            return (CharSequence) this.f48453e.getValue(this, f48450j[2]);
        }

        /* renamed from: h */
        public CharSequence mo44624h() {
            return this.f48451c.getValue(this, f48450j[0]);
        }

        /* renamed from: i */
        public boolean mo44625i() {
            return this.f48456h.getValue(this, f48450j[4]).booleanValue();
        }

        /* renamed from: j */
        public Image mo44626j() {
            return (Image) this.f48455g.getValue(this, f48450j[3]);
        }

        /* renamed from: l */
        public CharSequence mo44628l() {
            return (CharSequence) this.f48452d.getValue(this, f48450j[1]);
        }

        /* renamed from: m */
        public void mo44629m(Button button) {
            this.f48454f = button;
        }

        /* renamed from: n */
        public void mo44630n(CharSequence charSequence) {
            this.f48453e.setValue(this, f48450j[2], charSequence);
        }

        /* renamed from: p */
        public void mo44632p(CharSequence charSequence) {
            this.f48451c.setValue(this, f48450j[0], charSequence);
        }

        /* renamed from: q */
        public void mo44633q(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C10035v5) mo44621e()).f27676f, num.intValue());
            }
            if (color != null) {
                AppCompatTextView appCompatTextView = ((C10035v5) mo44621e()).f27676f;
                Context context = ((C10035v5) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                appCompatTextView.setTextColor(color.mo35260a(context));
            }
        }

        /* renamed from: r */
        public void mo44634r(boolean z) {
            this.f48456h.mo46151c(this, f48450j[4], z);
        }

        /* renamed from: s */
        public void mo44635s(C18174a aVar, String str) {
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(str, "text");
            throw new UnsupportedOperationException("Image does not support setExpirationTime");
        }

        /* renamed from: t */
        public void mo44636t(Image image) {
            this.f48455g.setValue(this, f48450j[3], image);
        }

        /* renamed from: w */
        public void mo44639w(boolean z) {
            this.f48457i.setValue(this, f48450j[5], Boolean.valueOf(z));
        }

        /* renamed from: y */
        public void mo44641y(CharSequence charSequence) {
            this.f48452d.setValue(this, f48450j[1], charSequence);
        }

        /* renamed from: z */
        public void mo44642z(Integer num, Color color) {
            throw new UnsupportedOperationException("Image does not support text");
        }
    }

    /* renamed from: oj.c$d */
    public static class C17226d extends C17204c {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f48463j;

        /* renamed from: c */
        private final C18355e0 f48464c;

        /* renamed from: d */
        private final C18355e0 f48465d;

        /* renamed from: e */
        private final C18361h0 f48466e = new C18361h0(C17228b.f48472d);

        /* renamed from: f */
        private final C18361h0 f48467f = new C18361h0(C17227a.f48471d);

        /* renamed from: g */
        private final C41555e f48468g;

        /* renamed from: h */
        private final C18365j0 f48469h;

        /* renamed from: i */
        private final C18361h0 f48470i;

        /* renamed from: oj.c$d$a */
        static final class C17227a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17227a f48471d = new C17227a();

            C17227a() {
                super(0);
            }

            public final Object invoke() {
                return "Large does not support button";
            }
        }

        /* renamed from: oj.c$d$b */
        static final class C17228b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17228b f48472d = new C17228b();

            C17228b() {
                super(0);
            }

            public final Object invoke() {
                return "Large does not support caption";
            }
        }

        /* renamed from: oj.c$d$c */
        static final class C17229c extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C17229c f48473d = new C17229c();

            C17229c() {
                super(1);
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                C2247a c0 = jVar.mo7220c0(C17780e.f49662k1);
                C41536l.m120488h(c0, "placeholder(R.drawable.thumbnail_1_1)");
                return (C2394j) c0;
            }
        }

        /* renamed from: oj.c$d$d */
        static final class C17230d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17230d f48474d = new C17230d();

            C17230d() {
                super(0);
            }

            public final Object invoke() {
                return "Large does not support badge";
            }
        }

        /* renamed from: oj.c$d$e */
        public static final class C17231e extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10042w5 f48475a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17231e(Object obj, C10042w5 w5Var) {
                super(obj);
                this.f48475a = w5Var;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Image image = (Image) obj2;
                if (!C41536l.m120484d((Image) obj, image)) {
                    LottieAnimationView lottieAnimationView = this.f48475a.f27708g;
                    C41536l.m120488h(lottieAnimationView, "binding.image");
                    C18368l.m62777z(lottieAnimationView, image, C17229c.f48473d);
                }
            }
        }

        static {
            Class<C17226d> cls = C17226d.class;
            f48463j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "description", "getDescription()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "caption", "getCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "button", "getButton()Lge/bog/designsystem/components/buttons/Button;", 0)), C41520a0.m120439e(new C41539o(cls, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "dismissButtonVisible", "getDismissButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isNewBadgeVisible", "isNewBadgeVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17226d(C10042w5 w5Var) {
            super(w5Var, 0, new Color.Attribute(C17777b.f49596k), C17786k.LayerRadius12Shadow0, 2, (DefaultConstructorMarker) null);
            C41536l.m120489i(w5Var, "binding");
            AppCompatTextView appCompatTextView = w5Var.f27706e;
            C41536l.m120488h(appCompatTextView, "binding.description");
            this.f48464c = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = w5Var.f27709h;
            C41536l.m120488h(appCompatTextView2, "binding.text");
            this.f48465d = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            C41551a aVar = C41551a.f97718a;
            this.f48468g = new C17231e((Object) null, w5Var);
            LayerView c = w5Var.f27707f.mo3946b();
            C41536l.m120488h(c, "binding.dismissButton.root");
            this.f48469h = new C18365j0(c, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            this.f48470i = new C18361h0(C17230d.f48474d);
            LayerView c2 = w5Var.f27707f.mo3946b();
            C41536l.m120488h(c2, "binding.dismissButton.root");
            mo44620c(c2);
        }

        /* renamed from: b */
        public void mo44619b(List list) {
            C41536l.m120489i(list, "badges");
            throw new UnsupportedOperationException("Large does not support addBadges");
        }

        /* renamed from: f */
        public Button mo44622f() {
            return (Button) this.f48467f.getValue(this, f48463j[3]);
        }

        /* renamed from: g */
        public CharSequence mo44623g() {
            return (CharSequence) this.f48466e.getValue(this, f48463j[2]);
        }

        /* renamed from: h */
        public CharSequence mo44624h() {
            return this.f48464c.getValue(this, f48463j[0]);
        }

        /* renamed from: i */
        public boolean mo44625i() {
            return this.f48469h.getValue(this, f48463j[5]).booleanValue();
        }

        /* renamed from: j */
        public Image mo44626j() {
            return (Image) this.f48468g.getValue(this, f48463j[4]);
        }

        /* renamed from: l */
        public CharSequence mo44628l() {
            return this.f48465d.getValue(this, f48463j[1]);
        }

        /* renamed from: m */
        public void mo44629m(Button button) {
            this.f48467f.setValue(this, f48463j[3], button);
        }

        /* renamed from: n */
        public void mo44630n(CharSequence charSequence) {
            this.f48466e.setValue(this, f48463j[2], charSequence);
        }

        /* renamed from: p */
        public void mo44632p(CharSequence charSequence) {
            this.f48464c.setValue(this, f48463j[0], charSequence);
        }

        /* renamed from: q */
        public void mo44633q(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C10042w5) mo44621e()).f27706e, num.intValue());
            }
            if (color != null) {
                AppCompatTextView appCompatTextView = ((C10042w5) mo44621e()).f27706e;
                Context context = ((C10042w5) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                appCompatTextView.setTextColor(color.mo35260a(context));
            }
        }

        /* renamed from: r */
        public void mo44634r(boolean z) {
            this.f48469h.mo46151c(this, f48463j[5], z);
        }

        /* renamed from: s */
        public void mo44635s(C18174a aVar, String str) {
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(str, "text");
            throw new UnsupportedOperationException("Large does not support setExpirationTime");
        }

        /* renamed from: t */
        public void mo44636t(Image image) {
            this.f48468g.setValue(this, f48463j[4], image);
        }

        /* renamed from: w */
        public void mo44639w(boolean z) {
            this.f48470i.setValue(this, f48463j[6], Boolean.valueOf(z));
        }

        /* renamed from: y */
        public void mo44641y(CharSequence charSequence) {
            this.f48465d.setValue(this, f48463j[1], charSequence);
        }

        /* renamed from: z */
        public void mo44642z(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C10042w5) mo44621e()).f27709h, num.intValue());
            }
            if (color != null) {
                AppCompatTextView appCompatTextView = ((C10042w5) mo44621e()).f27709h;
                Context context = ((C10042w5) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                appCompatTextView.setTextColor(color.mo35260a(context));
            }
        }
    }

    /* renamed from: oj.c$e */
    public static class C17232e extends C17204c {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f48476j;

        /* renamed from: c */
        private final C18355e0 f48477c;

        /* renamed from: d */
        private final C18361h0 f48478d = new C18361h0(C17238f.f48489d);

        /* renamed from: e */
        private final C18361h0 f48479e = new C18361h0(C17234b.f48485d);

        /* renamed from: f */
        private final C18361h0 f48480f = new C18361h0(C17233a.f48484d);

        /* renamed from: g */
        private final C41555e f48481g;

        /* renamed from: h */
        private final C18365j0 f48482h;

        /* renamed from: i */
        private final C18361h0 f48483i;

        /* renamed from: oj.c$e$a */
        static final class C17233a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17233a f48484d = new C17233a();

            C17233a() {
                super(0);
            }

            public final Object invoke() {
                return "Small does not support button";
            }
        }

        /* renamed from: oj.c$e$b */
        static final class C17234b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17234b f48485d = new C17234b();

            C17234b() {
                super(0);
            }

            public final Object invoke() {
                return "Small does not support caption";
            }
        }

        /* renamed from: oj.c$e$c */
        static final class C17235c extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C17235c f48486d = new C17235c();

            C17235c() {
                super(1);
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                C2247a c0 = jVar.mo7220c0(C17780e.f49662k1);
                C41536l.m120488h(c0, "placeholder(R.drawable.thumbnail_1_1)");
                return (C2394j) c0;
            }
        }

        /* renamed from: oj.c$e$d */
        static final class C17236d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17236d f48487d = new C17236d();

            C17236d() {
                super(0);
            }

            public final Object invoke() {
                return "Small does not support badge";
            }
        }

        /* renamed from: oj.c$e$e */
        public static final class C17237e extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10049x5 f48488a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17237e(Object obj, C10049x5 x5Var) {
                super(obj);
                this.f48488a = x5Var;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Image image = (Image) obj2;
                if (!C41536l.m120484d((Image) obj, image)) {
                    LottieAnimationView lottieAnimationView = this.f48488a.f27758h;
                    C41536l.m120488h(lottieAnimationView, "binding.image");
                    C18368l.m62777z(lottieAnimationView, image, C17235c.f48486d);
                }
            }
        }

        /* renamed from: oj.c$e$f */
        static final class C17238f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17238f f48489d = new C17238f();

            C17238f() {
                super(0);
            }

            public final Object invoke() {
                return "Small does not support text";
            }
        }

        static {
            Class<C17232e> cls = C17232e.class;
            f48476j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "description", "getDescription()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "caption", "getCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "button", "getButton()Lge/bog/designsystem/components/buttons/Button;", 0)), C41520a0.m120439e(new C41539o(cls, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "dismissButtonVisible", "getDismissButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isNewBadgeVisible", "isNewBadgeVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17232e(C10049x5 x5Var) {
            super(x5Var, 0, new Color.Attribute(C17777b.f49596k), C17786k.LayerRadius12Shadow0, 2, (DefaultConstructorMarker) null);
            C41536l.m120489i(x5Var, "binding");
            AppCompatTextView appCompatTextView = x5Var.f27756f;
            C41536l.m120488h(appCompatTextView, "binding.description");
            this.f48477c = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            C41551a aVar = C41551a.f97718a;
            this.f48481g = new C17237e((Object) null, x5Var);
            LayerView c = x5Var.f27757g.mo3946b();
            C41536l.m120488h(c, "binding.dismissButton.root");
            this.f48482h = new C18365j0(c, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            this.f48483i = new C18361h0(C17236d.f48487d);
            LayerView c2 = x5Var.f27757g.mo3946b();
            C41536l.m120488h(c2, "binding.dismissButton.root");
            mo44620c(c2);
        }

        /* renamed from: b */
        public void mo44619b(List list) {
            C41536l.m120489i(list, "badges");
            Context context = ((C10049x5) mo44621e()).mo3946b().getContext();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C17779d.f49644Q1);
            ((C10049x5) mo44621e()).f27755e.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C41536l.m120488h(context, "context");
                ChipsBadgeView chipsBadgeView = new ChipsBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                chipsBadgeView.setBadgeType((ChipsBadgeView.C13241a) it.next());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMargins(dimensionPixelSize, 0, 0, 0);
                chipsBadgeView.setLayoutParams(marginLayoutParams);
                ((C10049x5) mo44621e()).f27755e.addView(chipsBadgeView);
            }
        }

        /* renamed from: f */
        public Button mo44622f() {
            return (Button) this.f48480f.getValue(this, f48476j[3]);
        }

        /* renamed from: g */
        public CharSequence mo44623g() {
            return (CharSequence) this.f48479e.getValue(this, f48476j[2]);
        }

        /* renamed from: h */
        public CharSequence mo44624h() {
            return this.f48477c.getValue(this, f48476j[0]);
        }

        /* renamed from: i */
        public boolean mo44625i() {
            return this.f48482h.getValue(this, f48476j[5]).booleanValue();
        }

        /* renamed from: j */
        public Image mo44626j() {
            return (Image) this.f48481g.getValue(this, f48476j[4]);
        }

        /* renamed from: l */
        public CharSequence mo44628l() {
            return (CharSequence) this.f48478d.getValue(this, f48476j[1]);
        }

        /* renamed from: m */
        public void mo44629m(Button button) {
            this.f48480f.setValue(this, f48476j[3], button);
        }

        /* renamed from: n */
        public void mo44630n(CharSequence charSequence) {
            this.f48479e.setValue(this, f48476j[2], charSequence);
        }

        /* renamed from: p */
        public void mo44632p(CharSequence charSequence) {
            this.f48477c.setValue(this, f48476j[0], charSequence);
        }

        /* renamed from: q */
        public void mo44633q(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C10049x5) mo44621e()).f27756f, num.intValue());
            }
            if (color != null) {
                AppCompatTextView appCompatTextView = ((C10049x5) mo44621e()).f27756f;
                Context context = ((C10049x5) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                appCompatTextView.setTextColor(color.mo35260a(context));
            }
        }

        /* renamed from: r */
        public void mo44634r(boolean z) {
            this.f48482h.mo46151c(this, f48476j[5], z);
        }

        /* renamed from: s */
        public void mo44635s(C18174a aVar, String str) {
            boolean z;
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(str, "text");
            TimerView timerView = ((C10049x5) mo44621e()).f27759i;
            timerView.setTimerState(aVar);
            timerView.setTimerText(str);
            TimerView timerView2 = ((C10049x5) mo44621e()).f27759i;
            C41536l.m120488h(timerView2, "binding.timer");
            if (aVar != C18174a.INVISIBLE) {
                z = true;
            } else {
                z = false;
            }
            C18368l.m62751F(timerView2, z, false, 2, (Object) null);
        }

        /* renamed from: t */
        public void mo44636t(Image image) {
            this.f48481g.setValue(this, f48476j[4], image);
        }

        /* renamed from: w */
        public void mo44639w(boolean z) {
            this.f48483i.setValue(this, f48476j[6], Boolean.valueOf(z));
        }

        /* renamed from: y */
        public void mo44641y(CharSequence charSequence) {
            this.f48478d.setValue(this, f48476j[1], charSequence);
        }

        /* renamed from: z */
        public void mo44642z(Integer num, Color color) {
            throw new UnsupportedOperationException("Small does not support text");
        }
    }

    /* renamed from: oj.c$i */
    public static class C17257i extends C17204c {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f48529j;

        /* renamed from: c */
        private final C18355e0 f48530c;

        /* renamed from: d */
        private final C18355e0 f48531d;

        /* renamed from: e */
        private final C18355e0 f48532e;

        /* renamed from: f */
        private final C18361h0 f48533f = new C18361h0(C17258a.f48537d);

        /* renamed from: g */
        private final C41555e f48534g;

        /* renamed from: h */
        private final C18365j0 f48535h;

        /* renamed from: i */
        private final C18365j0 f48536i;

        /* renamed from: oj.c$i$a */
        static final class C17258a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17258a f48537d = new C17258a();

            C17258a() {
                super(0);
            }

            public final Object invoke() {
                return "Wide does not support button";
            }
        }

        /* renamed from: oj.c$i$b */
        static final class C17259b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C17259b f48538d = new C17259b();

            C17259b() {
                super(1);
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                C2247a c0 = jVar.mo7220c0(C17780e.f49662k1);
                C41536l.m120488h(c0, "placeholder(R.drawable.thumbnail_1_1)");
                return (C2394j) c0;
            }
        }

        /* renamed from: oj.c$i$c */
        public static final class C17260c extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10063z5 f48539a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17260c(Object obj, C10063z5 z5Var) {
                super(obj);
                this.f48539a = z5Var;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Image image = (Image) obj2;
                if (!C41536l.m120484d((Image) obj, image)) {
                    LottieAnimationView lottieAnimationView = this.f48539a.f27827i;
                    C41536l.m120488h(lottieAnimationView, "binding.image");
                    C18368l.m62777z(lottieAnimationView, image, C17259b.f48538d);
                }
            }
        }

        static {
            Class<C17257i> cls = C17257i.class;
            f48529j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "description", "getDescription()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "caption", "getCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "button", "getButton()Lge/bog/designsystem/components/buttons/Button;", 0)), C41520a0.m120439e(new C41539o(cls, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "dismissButtonVisible", "getDismissButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isNewBadgeVisible", "isNewBadgeVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17257i(C10063z5 z5Var) {
            super(z5Var, C17780e.gradient_base_solid_positive, (Color) null, C17786k.f49834t, 4, (DefaultConstructorMarker) null);
            C41536l.m120489i(z5Var, "binding");
            AppCompatTextView appCompatTextView = z5Var.f27825g;
            C41536l.m120488h(appCompatTextView, "binding.description");
            this.f48530c = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = z5Var.f27829k;
            C41536l.m120488h(appCompatTextView2, "binding.text");
            this.f48531d = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView3 = z5Var.f27824f;
            C41536l.m120488h(appCompatTextView3, "binding.caption");
            this.f48532e = new C18355e0(appCompatTextView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            C41551a aVar = C41551a.f97718a;
            this.f48534g = new C17260c((Object) null, z5Var);
            LayerView c = z5Var.f27826h.mo3946b();
            C41536l.m120488h(c, "binding.dismissButton.root");
            this.f48535h = new C18365j0(c, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            CurrencyBadgeView c2 = z5Var.f27828j.mo3946b();
            C41536l.m120488h(c2, "binding.newBadgeView.root");
            this.f48536i = new C18365j0(c2, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            LayerView c3 = z5Var.f27826h.mo3946b();
            C41536l.m120488h(c3, "binding.dismissButton.root");
            mo44620c(c3);
        }

        /* renamed from: b */
        public void mo44619b(List list) {
            C41536l.m120489i(list, "badges");
            throw new UnsupportedOperationException("Wide does not support addBadges");
        }

        /* renamed from: f */
        public Button mo44622f() {
            return (Button) this.f48533f.getValue(this, f48529j[3]);
        }

        /* renamed from: g */
        public CharSequence mo44623g() {
            return this.f48532e.getValue(this, f48529j[2]);
        }

        /* renamed from: h */
        public CharSequence mo44624h() {
            return this.f48530c.getValue(this, f48529j[0]);
        }

        /* renamed from: i */
        public boolean mo44625i() {
            return this.f48535h.getValue(this, f48529j[5]).booleanValue();
        }

        /* renamed from: j */
        public Image mo44626j() {
            return (Image) this.f48534g.getValue(this, f48529j[4]);
        }

        /* renamed from: l */
        public CharSequence mo44628l() {
            return this.f48531d.getValue(this, f48529j[1]);
        }

        /* renamed from: m */
        public void mo44629m(Button button) {
            this.f48533f.setValue(this, f48529j[3], button);
        }

        /* renamed from: n */
        public void mo44630n(CharSequence charSequence) {
            this.f48532e.setValue(this, f48529j[2], charSequence);
        }

        /* renamed from: p */
        public void mo44632p(CharSequence charSequence) {
            this.f48530c.setValue(this, f48529j[0], charSequence);
        }

        /* renamed from: q */
        public void mo44633q(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C10063z5) mo44621e()).f27825g, num.intValue());
            }
            if (color != null) {
                AppCompatTextView appCompatTextView = ((C10063z5) mo44621e()).f27825g;
                Context context = ((C10063z5) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                appCompatTextView.setTextColor(color.mo35260a(context));
            }
        }

        /* renamed from: r */
        public void mo44634r(boolean z) {
            this.f48535h.mo46151c(this, f48529j[5], z);
        }

        /* renamed from: s */
        public void mo44635s(C18174a aVar, String str) {
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(str, "text");
            throw new UnsupportedOperationException("Wide does not support setExpirationTime");
        }

        /* renamed from: t */
        public void mo44636t(Image image) {
            this.f48534g.setValue(this, f48529j[4], image);
        }

        /* renamed from: w */
        public void mo44639w(boolean z) {
            this.f48536i.mo46151c(this, f48529j[6], z);
        }

        /* renamed from: y */
        public void mo44641y(CharSequence charSequence) {
            this.f48531d.setValue(this, f48529j[1], charSequence);
        }

        /* renamed from: z */
        public void mo44642z(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C10063z5) mo44621e()).f27829k, num.intValue());
            }
            if (color != null) {
                AppCompatTextView appCompatTextView = ((C10063z5) mo44621e()).f27829k;
                Context context = ((C10063z5) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                appCompatTextView.setTextColor(color.mo35260a(context));
            }
        }
    }

    public /* synthetic */ C17204c(C6201a aVar, int i, Color color, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i, color, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m60393d(C17204c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C17202a aVar = cVar.f48418b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: b */
    public abstract void mo44619b(List list);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo44620c(View view) {
        C41536l.m120489i(view, "<this>");
        view.setOnClickListener(new C17203b(this));
    }

    /* renamed from: e */
    public final C6201a mo44621e() {
        return this.f48417a;
    }

    /* renamed from: f */
    public abstract Button mo44622f();

    /* renamed from: g */
    public abstract CharSequence mo44623g();

    /* renamed from: h */
    public abstract CharSequence mo44624h();

    /* renamed from: i */
    public abstract boolean mo44625i();

    /* renamed from: j */
    public abstract Image mo44626j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final LayerView mo44627k() {
        ViewParent parent = this.f48417a.mo3946b().getParent();
        C41536l.m120487g(parent, "null cannot be cast to non-null type ge.bog.designsystem.components.layersandshadows.LayerView");
        return (LayerView) parent;
    }

    /* renamed from: l */
    public abstract CharSequence mo44628l();

    /* renamed from: m */
    public abstract void mo44629m(Button button);

    /* renamed from: n */
    public abstract void mo44630n(CharSequence charSequence);

    /* renamed from: o */
    public final void mo44631o(Color color) {
        if (color instanceof Color.StateList) {
            this.f48417a.mo3946b().setBackgroundTintList(((Color.StateList) color).mo35292d());
        } else if (color == null) {
            this.f48417a.mo3946b().setBackgroundColor(0);
        } else {
            View b = this.f48417a.mo3946b();
            Context context = this.f48417a.mo3946b().getContext();
            C41536l.m120488h(context, "binding.root.context");
            b.setBackgroundColor(color.mo35260a(context));
        }
    }

    /* renamed from: p */
    public abstract void mo44632p(CharSequence charSequence);

    /* renamed from: q */
    public abstract void mo44633q(Integer num, Color color);

    /* renamed from: r */
    public abstract void mo44634r(boolean z);

    /* renamed from: s */
    public abstract void mo44635s(C18174a aVar, String str);

    /* renamed from: t */
    public abstract void mo44636t(Image image);

    /* renamed from: u */
    public final void mo44637u(Color color) {
        if (color instanceof Color.StateList) {
            mo44627k().setBackgroundTintList(((Color.StateList) color).mo35292d());
        } else if (color == null) {
            LayerView k = mo44627k();
            Color.Attribute attribute = new Color.Attribute(C17777b.f49596k);
            Context context = this.f48417a.mo3946b().getContext();
            C41536l.m120488h(context, "binding.root.context");
            k.setBackgroundColor(attribute.mo35260a(context));
        } else {
            LayerView k2 = mo44627k();
            Context context2 = this.f48417a.mo3946b().getContext();
            C41536l.m120488h(context2, "binding.root.context");
            k2.setBackgroundColor(color.mo35260a(context2));
        }
    }

    /* renamed from: v */
    public final void mo44638v(Image image) {
        C18368l.m62774w(mo44627k(), image, (C43075l) null, 2, (Object) null);
    }

    /* renamed from: w */
    public abstract void mo44639w(boolean z);

    /* renamed from: x */
    public final void mo44640x(C17202a aVar) {
        this.f48418b = aVar;
    }

    /* renamed from: y */
    public abstract void mo44641y(CharSequence charSequence);

    /* renamed from: z */
    public abstract void mo44642z(Integer num, Color color);

    /* renamed from: oj.c$f */
    public static class C17239f extends C17204c {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f48490j;

        /* renamed from: c */
        private final C18355e0 f48491c;

        /* renamed from: d */
        private final C18355e0 f48492d;

        /* renamed from: e */
        private final C18355e0 f48493e;

        /* renamed from: f */
        private final C18361h0 f48494f;

        /* renamed from: g */
        private final C41555e f48495g;

        /* renamed from: h */
        private final C18365j0 f48496h;

        /* renamed from: i */
        private final C18361h0 f48497i;

        /* renamed from: oj.c$f$a */
        static final class C17240a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17240a f48498d = new C17240a();

            C17240a() {
                super(0);
            }

            public final Object invoke() {
                return "Square does not support button";
            }
        }

        /* renamed from: oj.c$f$b */
        static final class C17241b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C17241b f48499d = new C17241b();

            C17241b() {
                super(1);
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                C2247a c0 = jVar.mo7220c0(C17780e.f49662k1);
                C41536l.m120488h(c0, "placeholder(R.drawable.thumbnail_1_1)");
                return (C2394j) c0;
            }
        }

        /* renamed from: oj.c$f$c */
        static final class C17242c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17242c f48500d = new C17242c();

            C17242c() {
                super(0);
            }

            public final Object invoke() {
                return "Square does not support badge";
            }
        }

        /* renamed from: oj.c$f$d */
        public static final class C17243d extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10056y5 f48501a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17243d(Object obj, C10056y5 y5Var) {
                super(obj);
                this.f48501a = y5Var;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Image image = (Image) obj2;
                if (!C41536l.m120484d((Image) obj, image)) {
                    LottieAnimationView lottieAnimationView = this.f48501a.f27785h;
                    C41536l.m120488h(lottieAnimationView, "binding.image");
                    C18368l.m62777z(lottieAnimationView, image, C17241b.f48499d);
                }
            }
        }

        static {
            Class<C17239f> cls = C17239f.class;
            f48490j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "description", "getDescription()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "caption", "getCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "button", "getButton()Lge/bog/designsystem/components/buttons/Button;", 0)), C41520a0.m120439e(new C41539o(cls, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "dismissButtonVisible", "getDismissButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isNewBadgeVisible", "isNewBadgeVisible()Z", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C17239f(C10056y5 y5Var, int i, Color color, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(y5Var, (i2 & 2) != 0 ? C17780e.gradient_base_solid_pending : i, (i2 & 4) != 0 ? null : color);
        }

        /* renamed from: b */
        public void mo44619b(List list) {
            C41536l.m120489i(list, "badges");
            throw new UnsupportedOperationException("Square does not support addBadges");
        }

        /* renamed from: f */
        public Button mo44622f() {
            return (Button) this.f48494f.getValue(this, f48490j[3]);
        }

        /* renamed from: g */
        public CharSequence mo44623g() {
            return this.f48493e.getValue(this, f48490j[2]);
        }

        /* renamed from: h */
        public CharSequence mo44624h() {
            return this.f48491c.getValue(this, f48490j[0]);
        }

        /* renamed from: i */
        public boolean mo44625i() {
            return this.f48496h.getValue(this, f48490j[5]).booleanValue();
        }

        /* renamed from: j */
        public Image mo44626j() {
            return (Image) this.f48495g.getValue(this, f48490j[4]);
        }

        /* renamed from: l */
        public CharSequence mo44628l() {
            return this.f48492d.getValue(this, f48490j[1]);
        }

        /* renamed from: m */
        public void mo44629m(Button button) {
            this.f48494f.setValue(this, f48490j[3], button);
        }

        /* renamed from: n */
        public void mo44630n(CharSequence charSequence) {
            this.f48493e.setValue(this, f48490j[2], charSequence);
        }

        /* renamed from: p */
        public void mo44632p(CharSequence charSequence) {
            this.f48491c.setValue(this, f48490j[0], charSequence);
        }

        /* renamed from: q */
        public void mo44633q(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C10056y5) mo44621e()).f27783f, num.intValue());
            }
            if (color != null) {
                AppCompatTextView appCompatTextView = ((C10056y5) mo44621e()).f27783f;
                Context context = ((C10056y5) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                appCompatTextView.setTextColor(color.mo35260a(context));
            }
        }

        /* renamed from: r */
        public void mo44634r(boolean z) {
            this.f48496h.mo46151c(this, f48490j[5], z);
        }

        /* renamed from: s */
        public void mo44635s(C18174a aVar, String str) {
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(str, "text");
            throw new UnsupportedOperationException("Square does not support setExpirationTime");
        }

        /* renamed from: t */
        public void mo44636t(Image image) {
            this.f48495g.setValue(this, f48490j[4], image);
        }

        /* renamed from: w */
        public void mo44639w(boolean z) {
            this.f48497i.setValue(this, f48490j[6], Boolean.valueOf(z));
        }

        /* renamed from: y */
        public void mo44641y(CharSequence charSequence) {
            this.f48492d.setValue(this, f48490j[1], charSequence);
        }

        /* renamed from: z */
        public void mo44642z(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C10056y5) mo44621e()).f27786i, num.intValue());
            }
            if (color != null) {
                AppCompatTextView appCompatTextView = ((C10056y5) mo44621e()).f27786i;
                Context context = ((C10056y5) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                appCompatTextView.setTextColor(color.mo35260a(context));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17239f(C10056y5 y5Var, int i, Color color) {
            super(y5Var, i, color, C17786k.f49834t, (DefaultConstructorMarker) null);
            C10056y5 y5Var2 = y5Var;
            C41536l.m120489i(y5Var2, "binding");
            AppCompatTextView appCompatTextView = y5Var2.f27783f;
            C41536l.m120488h(appCompatTextView, "binding.description");
            this.f48491c = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = y5Var2.f27786i;
            C41536l.m120488h(appCompatTextView2, "binding.text");
            this.f48492d = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView3 = y5Var2.f27782e;
            C41536l.m120488h(appCompatTextView3, "binding.caption");
            this.f48493e = new C18355e0(appCompatTextView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f48494f = new C18361h0(C17240a.f48498d);
            C41551a aVar = C41551a.f97718a;
            this.f48495g = new C17243d((Object) null, y5Var2);
            LayerView c = y5Var2.f27784g.mo3946b();
            C41536l.m120488h(c, "binding.dismissButton.root");
            this.f48496h = new C18365j0(c, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            this.f48497i = new C18361h0(C17242c.f48500d);
            LayerView c2 = y5Var2.f27784g.mo3946b();
            C41536l.m120488h(c2, "binding.dismissButton.root");
            mo44620c(c2);
        }
    }

    /* renamed from: oj.c$g */
    public static class C17244g extends C17204c {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f48502j;

        /* renamed from: c */
        private final C18355e0 f48503c;

        /* renamed from: d */
        private final C18355e0 f48504d;

        /* renamed from: e */
        private final C18361h0 f48505e;

        /* renamed from: f */
        private final C18361h0 f48506f;

        /* renamed from: g */
        private final C41555e f48507g;

        /* renamed from: h */
        private final C18365j0 f48508h;

        /* renamed from: i */
        private final C18361h0 f48509i;

        /* renamed from: oj.c$g$a */
        static final class C17245a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17245a f48510d = new C17245a();

            C17245a() {
                super(0);
            }

            public final Object invoke() {
                return "Square does not support button";
            }
        }

        /* renamed from: oj.c$g$b */
        static final class C17246b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17246b f48511d = new C17246b();

            C17246b() {
                super(0);
            }

            public final Object invoke() {
                return "Square highlight does not support caption";
            }
        }

        /* renamed from: oj.c$g$c */
        static final class C17247c extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C17247c f48512d = new C17247c();

            C17247c() {
                super(1);
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                C2247a c0 = jVar.mo7220c0(C17780e.f49662k1);
                C41536l.m120488h(c0, "placeholder(R.drawable.thumbnail_1_1)");
                return (C2394j) c0;
            }
        }

        /* renamed from: oj.c$g$d */
        static final class C17248d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17248d f48513d = new C17248d();

            C17248d() {
                super(0);
            }

            public final Object invoke() {
                return "Square highlight does not support badge";
            }
        }

        /* renamed from: oj.c$g$e */
        public static final class C17249e extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C9874a6 f48514a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17249e(Object obj, C9874a6 a6Var) {
                super(obj);
                this.f48514a = a6Var;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Image image = (Image) obj2;
                if (!C41536l.m120484d((Image) obj, image)) {
                    LottieAnimationView lottieAnimationView = this.f48514a.f26780g;
                    C41536l.m120488h(lottieAnimationView, "binding.image");
                    C18368l.m62777z(lottieAnimationView, image, C17247c.f48512d);
                }
            }
        }

        static {
            Class<C17244g> cls = C17244g.class;
            f48502j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "description", "getDescription()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "caption", "getCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "button", "getButton()Lge/bog/designsystem/components/buttons/Button;", 0)), C41520a0.m120439e(new C41539o(cls, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "dismissButtonVisible", "getDismissButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isNewBadgeVisible", "isNewBadgeVisible()Z", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C17244g(C9874a6 a6Var, int i, Color color, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(a6Var, (i2 & 2) != 0 ? C17780e.gradient_base_solid_pending : i, (i2 & 4) != 0 ? null : color);
        }

        /* renamed from: b */
        public void mo44619b(List list) {
            C41536l.m120489i(list, "badges");
            throw new UnsupportedOperationException("Square highlight does not support addBadges");
        }

        /* renamed from: f */
        public Button mo44622f() {
            return (Button) this.f48506f.getValue(this, f48502j[3]);
        }

        /* renamed from: g */
        public CharSequence mo44623g() {
            return (CharSequence) this.f48505e.getValue(this, f48502j[2]);
        }

        /* renamed from: h */
        public CharSequence mo44624h() {
            return this.f48503c.getValue(this, f48502j[0]);
        }

        /* renamed from: i */
        public boolean mo44625i() {
            return this.f48508h.getValue(this, f48502j[5]).booleanValue();
        }

        /* renamed from: j */
        public Image mo44626j() {
            return (Image) this.f48507g.getValue(this, f48502j[4]);
        }

        /* renamed from: l */
        public CharSequence mo44628l() {
            return this.f48504d.getValue(this, f48502j[1]);
        }

        /* renamed from: m */
        public void mo44629m(Button button) {
            this.f48506f.setValue(this, f48502j[3], button);
        }

        /* renamed from: n */
        public void mo44630n(CharSequence charSequence) {
            this.f48505e.setValue(this, f48502j[2], charSequence);
        }

        /* renamed from: p */
        public void mo44632p(CharSequence charSequence) {
            this.f48503c.setValue(this, f48502j[0], charSequence);
        }

        /* renamed from: q */
        public void mo44633q(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C9874a6) mo44621e()).f26778e, num.intValue());
            }
            if (color != null) {
                AppCompatTextView appCompatTextView = ((C9874a6) mo44621e()).f26778e;
                Context context = ((C9874a6) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                appCompatTextView.setTextColor(color.mo35260a(context));
            }
        }

        /* renamed from: r */
        public void mo44634r(boolean z) {
            this.f48508h.mo46151c(this, f48502j[5], z);
        }

        /* renamed from: s */
        public void mo44635s(C18174a aVar, String str) {
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(str, "text");
            throw new UnsupportedOperationException("Square highlight does not support setExpirationTime");
        }

        /* renamed from: t */
        public void mo44636t(Image image) {
            this.f48507g.setValue(this, f48502j[4], image);
        }

        /* renamed from: w */
        public void mo44639w(boolean z) {
            this.f48509i.setValue(this, f48502j[6], Boolean.valueOf(z));
        }

        /* renamed from: y */
        public void mo44641y(CharSequence charSequence) {
            this.f48504d.setValue(this, f48502j[1], charSequence);
        }

        /* renamed from: z */
        public void mo44642z(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C9874a6) mo44621e()).f26781h, num.intValue());
            }
            if (color != null) {
                AppCompatTextView appCompatTextView = ((C9874a6) mo44621e()).f26781h;
                Context context = ((C9874a6) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                appCompatTextView.setTextColor(color.mo35260a(context));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17244g(C9874a6 a6Var, int i, Color color) {
            super(a6Var, i, color, C17786k.f49834t, (DefaultConstructorMarker) null);
            C9874a6 a6Var2 = a6Var;
            C41536l.m120489i(a6Var2, "binding");
            AppCompatTextView appCompatTextView = a6Var2.f26778e;
            C41536l.m120488h(appCompatTextView, "binding.description");
            this.f48503c = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            AppCompatTextView appCompatTextView2 = a6Var2.f26781h;
            C41536l.m120488h(appCompatTextView2, "binding.text");
            this.f48504d = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f48505e = new C18361h0(C17246b.f48511d);
            this.f48506f = new C18361h0(C17245a.f48510d);
            C41551a aVar = C41551a.f97718a;
            this.f48507g = new C17249e((Object) null, a6Var2);
            LayerView c = a6Var2.f26779f.mo3946b();
            C41536l.m120488h(c, "binding.dismissButton.root");
            this.f48508h = new C18365j0(c, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            this.f48509i = new C18361h0(C17248d.f48513d);
            LayerView c2 = a6Var2.f26779f.mo3946b();
            C41536l.m120488h(c2, "binding.dismissButton.root");
            mo44620c(c2);
        }
    }

    /* renamed from: oj.c$h */
    public static class C17250h extends C17204c {

        /* renamed from: j */
        static final /* synthetic */ C40303i[] f48515j;

        /* renamed from: c */
        private final C18355e0 f48516c;

        /* renamed from: d */
        private final C18361h0 f48517d;

        /* renamed from: e */
        private final C18361h0 f48518e;

        /* renamed from: f */
        private final C18361h0 f48519f;

        /* renamed from: g */
        private final C41555e f48520g;

        /* renamed from: h */
        private final C18365j0 f48521h;

        /* renamed from: i */
        private final C18361h0 f48522i;

        /* renamed from: oj.c$h$a */
        static final class C17251a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17251a f48523d = new C17251a();

            C17251a() {
                super(0);
            }

            public final Object invoke() {
                return "Square does not support button";
            }
        }

        /* renamed from: oj.c$h$b */
        static final class C17252b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17252b f48524d = new C17252b();

            C17252b() {
                super(0);
            }

            public final Object invoke() {
                return "Square text does not support caption";
            }
        }

        /* renamed from: oj.c$h$c */
        static final class C17253c extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C17253c f48525d = new C17253c();

            C17253c() {
                super(1);
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                C2247a c0 = jVar.mo7220c0(C17780e.f49662k1);
                C41536l.m120488h(c0, "placeholder(R.drawable.thumbnail_1_1)");
                return (C2394j) c0;
            }
        }

        /* renamed from: oj.c$h$d */
        static final class C17254d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17254d f48526d = new C17254d();

            C17254d() {
                super(0);
            }

            public final Object invoke() {
                return "Square text does not support badge";
            }
        }

        /* renamed from: oj.c$h$e */
        public static final class C17255e extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C9882b6 f48527a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17255e(Object obj, C9882b6 b6Var) {
                super(obj);
                this.f48527a = b6Var;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Image image = (Image) obj2;
                if (!C41536l.m120484d((Image) obj, image)) {
                    LottieAnimationView lottieAnimationView = this.f48527a.f26826g;
                    C41536l.m120488h(lottieAnimationView, "binding.image");
                    C18368l.m62777z(lottieAnimationView, image, C17253c.f48525d);
                }
            }
        }

        /* renamed from: oj.c$h$f */
        static final class C17256f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17256f f48528d = new C17256f();

            C17256f() {
                super(0);
            }

            public final Object invoke() {
                return "Square text does not support text";
            }
        }

        static {
            Class<C17250h> cls = C17250h.class;
            f48515j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "description", "getDescription()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "caption", "getCaption()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "button", "getButton()Lge/bog/designsystem/components/buttons/Button;", 0)), C41520a0.m120439e(new C41539o(cls, "image", "getImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "dismissButtonVisible", "getDismissButtonVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isNewBadgeVisible", "isNewBadgeVisible()Z", 0))};
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C17250h(C9882b6 b6Var, int i, Color color, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(b6Var, (i2 & 2) != 0 ? C17780e.gradient_base_solid_pending : i, (i2 & 4) != 0 ? null : color);
        }

        /* renamed from: b */
        public void mo44619b(List list) {
            C41536l.m120489i(list, "badges");
            throw new UnsupportedOperationException("Square text does not support addBadges");
        }

        /* renamed from: f */
        public Button mo44622f() {
            return (Button) this.f48519f.getValue(this, f48515j[3]);
        }

        /* renamed from: g */
        public CharSequence mo44623g() {
            return (CharSequence) this.f48518e.getValue(this, f48515j[2]);
        }

        /* renamed from: h */
        public CharSequence mo44624h() {
            return this.f48516c.getValue(this, f48515j[0]);
        }

        /* renamed from: i */
        public boolean mo44625i() {
            return this.f48521h.getValue(this, f48515j[5]).booleanValue();
        }

        /* renamed from: j */
        public Image mo44626j() {
            return (Image) this.f48520g.getValue(this, f48515j[4]);
        }

        /* renamed from: l */
        public CharSequence mo44628l() {
            return (CharSequence) this.f48517d.getValue(this, f48515j[1]);
        }

        /* renamed from: m */
        public void mo44629m(Button button) {
            this.f48519f.setValue(this, f48515j[3], button);
        }

        /* renamed from: n */
        public void mo44630n(CharSequence charSequence) {
            this.f48518e.setValue(this, f48515j[2], charSequence);
        }

        /* renamed from: p */
        public void mo44632p(CharSequence charSequence) {
            this.f48516c.setValue(this, f48515j[0], charSequence);
        }

        /* renamed from: q */
        public void mo44633q(Integer num, Color color) {
            if (num != null) {
                num.intValue();
                C1314o.m4575q(((C9882b6) mo44621e()).f26824e, num.intValue());
            }
            if (color != null) {
                AppCompatTextView appCompatTextView = ((C9882b6) mo44621e()).f26824e;
                Context context = ((C9882b6) mo44621e()).mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                appCompatTextView.setTextColor(color.mo35260a(context));
            }
        }

        /* renamed from: r */
        public void mo44634r(boolean z) {
            this.f48521h.mo46151c(this, f48515j[5], z);
        }

        /* renamed from: s */
        public void mo44635s(C18174a aVar, String str) {
            C41536l.m120489i(aVar, "state");
            C41536l.m120489i(str, "text");
            throw new UnsupportedOperationException("Square text does not support setExpirationTime");
        }

        /* renamed from: t */
        public void mo44636t(Image image) {
            this.f48520g.setValue(this, f48515j[4], image);
        }

        /* renamed from: w */
        public void mo44639w(boolean z) {
            this.f48522i.setValue(this, f48515j[6], Boolean.valueOf(z));
        }

        /* renamed from: y */
        public void mo44641y(CharSequence charSequence) {
            this.f48517d.setValue(this, f48515j[1], charSequence);
        }

        /* renamed from: z */
        public void mo44642z(Integer num, Color color) {
            throw new UnsupportedOperationException("SquareText does not support text");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17250h(C9882b6 b6Var, int i, Color color) {
            super(b6Var, i, color, C17786k.f49834t, (DefaultConstructorMarker) null);
            C9882b6 b6Var2 = b6Var;
            C41536l.m120489i(b6Var, "binding");
            AppCompatTextView appCompatTextView = b6Var2.f26824e;
            C41536l.m120488h(appCompatTextView, "binding.description");
            this.f48516c = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
            this.f48517d = new C18361h0(C17256f.f48528d);
            this.f48518e = new C18361h0(C17252b.f48524d);
            this.f48519f = new C18361h0(C17251a.f48523d);
            C41551a aVar = C41551a.f97718a;
            this.f48520g = new C17255e((Object) null, b6Var);
            LayerView c = b6Var2.f26825f.mo3946b();
            C41536l.m120488h(c, "binding.dismissButton.root");
            this.f48521h = new C18365j0(c, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            this.f48522i = new C18361h0(C17254d.f48526d);
            LayerView c2 = b6Var2.f26825f.mo3946b();
            C41536l.m120488h(c2, "binding.dismissButton.root");
            mo44620c(c2);
        }
    }

    public /* synthetic */ C17204c(C6201a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private C17204c(C6201a aVar) {
        this.f48417a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17204c(C6201a aVar, int i, Color color, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : color, (i3 & 8) != 0 ? 0 : i2, (DefaultConstructorMarker) null);
    }

    private C17204c(C6201a aVar, int i, Color color, int i2) {
        this(aVar, (DefaultConstructorMarker) null);
        if (i != 0) {
            mo44627k().setBackgroundResource(i);
        } else if (color != null) {
            LayerView k = mo44627k();
            Context context = aVar.mo3946b().getContext();
            C41536l.m120488h(context, "binding.root.context");
            k.setBackgroundColor(color.mo35260a(context));
        }
        if (i2 != 0) {
            mo44627k().setLayerStyle(i2);
        }
    }
}
