package p341ge.bog.designsystem.components.actioncard;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.C0630d;
import androidx.core.content.C0767a;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.C2394j;
import com.github.mikephil.charting.utils.Utils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p035c4.C2247a;
import p341ge.bog.designsystem.components.actioncard.BadgeData;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeView;
import p352ak.C10016t0;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17782g;
import p615tg.C17964e;
import p642vh.C18368l;
import p642vh.C18382u;
import p696zg.C19021a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.actioncard.ActionCardView */
public final class ActionCardView extends FrameLayout {

    /* renamed from: h */
    static final /* synthetic */ C40303i[] f38726h = {C41520a0.m120439e(new C41539o(ActionCardView.class, "data", "getData()Lge/bog/designsystem/components/actioncard/ActionCardData;", 0))};

    /* renamed from: d */
    private C13147a f38727d;

    /* renamed from: e */
    private final C10016t0 f38728e;

    /* renamed from: f */
    private final C41555e f38729f;

    /* renamed from: g */
    private final Button f38730g;

    /* renamed from: ge.bog.designsystem.components.actioncard.ActionCardView$a */
    public enum C13147a {
        HORIZONTAL(0),
        VERTICAl(1);
        

        /* renamed from: e */
        public static final C13148a f38731e = null;

        /* renamed from: d */
        private final int f38735d;

        /* renamed from: ge.bog.designsystem.components.actioncard.ActionCardView$a$a */
        public static final class C13148a {
            private C13148a() {
            }

            public /* synthetic */ C13148a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13147a mo34728a(int i) {
                C13147a aVar;
                boolean z;
                C13147a[] values = C13147a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        aVar = null;
                        break;
                    }
                    aVar = values[i2];
                    if (aVar.mo34727b() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                }
                if (aVar == null) {
                    return C13147a.HORIZONTAL;
                }
                return aVar;
            }
        }

        static {
            f38731e = new C13148a((DefaultConstructorMarker) null);
        }

        private C13147a(int i) {
            this.f38735d = i;
        }

        /* renamed from: b */
        public final int mo34727b() {
            return this.f38735d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.actioncard.ActionCardView$b */
    public /* synthetic */ class C13149b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38736a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.designsystem.components.actioncard.ActionCardView$a[] r0 = p341ge.bog.designsystem.components.actioncard.ActionCardView.C13147a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.actioncard.ActionCardView$a r1 = p341ge.bog.designsystem.components.actioncard.ActionCardView.C13147a.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.designsystem.components.actioncard.ActionCardView$a r1 = p341ge.bog.designsystem.components.actioncard.ActionCardView.C13147a.VERTICAl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f38736a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.actioncard.ActionCardView.C13149b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.actioncard.ActionCardView$c */
    static final class C13150c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActionCardData f38737d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13150c(ActionCardData actionCardData) {
            super(1);
            this.f38737d = actionCardData;
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            if (!this.f38737d.mo34708p().mo47191f()) {
                return jVar;
            }
            C2247a d = jVar.mo7222d();
            C41536l.m120488h(d, "circleCrop()");
            return (C2394j) d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.actioncard.ActionCardView$d */
    public static final class C13151d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ActionCardView f38738a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13151d(Object obj, ActionCardView actionCardView) {
            super(obj);
            this.f38738a = actionCardView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            ActionCardData actionCardData = (ActionCardData) obj;
            this.f38738a.m49514c((ActionCardData) obj2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ActionCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: b */
    private final void m49513b() {
        C0630d dVar;
        int i = C13149b.f38736a[this.f38727d.ordinal()];
        if (i == 1) {
            dVar = getHorizontalConstraints();
        } else if (i == 2) {
            dVar = getVerticalConstraints();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        dVar.mo2937c(this.f38728e.f27565q);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m49514c(ActionCardData actionCardData) {
        int i;
        boolean z;
        AppCompatTextView appCompatTextView = this.f38728e.f27555g;
        C41536l.m120488h(appCompatTextView, "binding.actionCardMidText");
        m49517f(appCompatTextView, actionCardData.mo34710r(), actionCardData.mo34711s());
        AppCompatTextView appCompatTextView2 = this.f38728e.f27553e;
        C41536l.m120488h(appCompatTextView2, "binding.actionCardBotText");
        m49517f(appCompatTextView2, actionCardData.mo34700g(), actionCardData.mo34701h());
        AppCompatTextView appCompatTextView3 = this.f38728e.f27559k;
        C41536l.m120488h(appCompatTextView3, "binding.actionCardTopText");
        m49517f(appCompatTextView3, actionCardData.mo34716w(), actionCardData.mo34718x());
        Button button = this.f38728e.f27563o;
        C41536l.m120488h(button, "binding.button");
        if (actionCardData.mo34715v()) {
            i = 0;
        } else {
            i = 8;
        }
        button.setVisibility(i);
        Integer i2 = actionCardData.mo34703i();
        if (i2 != null) {
            this.f38728e.f27563o.setButtonIcon(C0767a.m2895e(getContext(), i2.intValue()));
        }
        this.f38728e.f27563o.setButtonText(actionCardData.mo34704j());
        m49515d(actionCardData);
        LayerView c = this.f38728e.mo3946b();
        Color d = actionCardData.mo34695d();
        Context context = getContext();
        C41536l.m120488h(context, "context");
        c.setBackgroundTintList(d.mo35261b(context));
        AppCompatImageView appCompatImageView = this.f38728e.f27564p;
        C41536l.m120488h(appCompatImageView, "binding.chevronIcon");
        if (!actionCardData.mo34706l() || this.f38727d != C13147a.HORIZONTAL) {
            z = false;
        } else {
            z = true;
        }
        Drawable drawable = null;
        C18368l.m62751F(appCompatImageView, z, false, 2, (Object) null);
        Color k = actionCardData.mo34705k();
        if (k != null) {
            Context context2 = getContext();
            C41536l.m120488h(context2, "context");
            ColorStateList b = k.mo35261b(context2);
            if (b != null) {
                this.f38728e.f27564p.setImageTintList(b);
            }
        }
        m49522k(this, actionCardData, (C13147a) null, 2, (Object) null);
        LayerView c2 = this.f38728e.mo3946b();
        Color f = actionCardData.mo34699f();
        if (f != null) {
            Context context3 = getContext();
            C41536l.m120488h(context3, "context");
            drawable = C17964e.m61889b(context3, f, 0, 0, 12, (Object) null);
        }
        c2.setForeground(drawable);
        m49513b();
    }

    /* renamed from: d */
    private final void m49515d(ActionCardData actionCardData) {
        if (actionCardData.mo34708p() == C19021a.OVAL_ICON) {
            setOvalIcon(actionCardData);
        } else {
            setRegularIcon(actionCardData);
        }
        m49516e(actionCardData.mo34708p());
    }

    /* renamed from: e */
    private final void m49516e(C19021a aVar) {
        boolean z;
        LayerView layerView = this.f38728e.f27557i;
        C41536l.m120488h(layerView, "binding.actionCardOvalIconContainer");
        C19021a aVar2 = C19021a.OVAL_ICON;
        boolean z2 = true;
        if (aVar == aVar2) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(layerView, z, false, 2, (Object) null);
        LottieAnimationView lottieAnimationView = this.f38728e.f27554f;
        C41536l.m120488h(lottieAnimationView, "binding.actionCardIcon");
        if (aVar == aVar2) {
            z2 = false;
        }
        C18368l.m62751F(lottieAnimationView, z2, false, 2, (Object) null);
        if (aVar != aVar2) {
            LottieAnimationView lottieAnimationView2 = this.f38728e.f27554f;
            C41536l.m120488h(lottieAnimationView2, "binding.actionCardIcon");
            ViewGroup.LayoutParams layoutParams = lottieAnimationView2.getLayoutParams();
            if (layoutParams != null) {
                C18382u e = aVar.mo47190e();
                Context context = getContext();
                C41536l.m120488h(context, "context");
                layoutParams.width = e.mo46173a(context);
                C18382u c = aVar.mo47189c();
                Context context2 = getContext();
                C41536l.m120488h(context2, "context");
                layoutParams.height = c.mo46173a(context2);
                lottieAnimationView2.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    /* renamed from: f */
    private final void m49517f(AppCompatTextView appCompatTextView, String str, Color color) {
        boolean z;
        int i = 0;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        appCompatTextView.setText(str);
        if (color != null) {
            Context context = appCompatTextView.getContext();
            C41536l.m120488h(context, "context");
            appCompatTextView.setTextColor(color.mo35261b(context));
        }
    }

    /* renamed from: g */
    private final ActionCardData m49518g(Context context) {
        Image.Drawable drawable;
        if (!isInEditMode()) {
            return null;
        }
        Drawable e = C0767a.m2895e(context, C17780e.thumbnail_card);
        if (e != null) {
            drawable = new Image.Drawable(e, (Boolean) null, 2, (DefaultConstructorMarker) null);
        } else {
            drawable = null;
        }
        return new ActionCardData("Internet, TV and Telephone", drawable, (C19021a) null, (Color) null, (Color) null, (Color) null, (Color) null, false, (Color) null, (BadgeData) null, (String) null, (String) null, (Color) null, (Color) null, (Color) null, false, (Integer) null, (String) null, (Color) null, 524284, (DefaultConstructorMarker) null);
    }

    private final C0630d getHorizontalConstraints() {
        int i;
        C0630d dVar = new C0630d();
        dVar.mo2942h(this.f38728e.f27565q);
        m49519h(dVar, C17782g.action_card_icon);
        m49519h(dVar, C17782g.action_card_oval_icon_container);
        int i2 = C17782g.action_card_texts;
        dVar.mo2946l(i2, true);
        dVar.mo2949x(i2, Utils.FLOAT_EPSILON);
        int i3 = C17782g.icon_barrier_horizontal;
        Resources resources = getResources();
        int i4 = C17779d.f49645S1;
        int i5 = i2;
        dVar.mo2944j(i5, 6, i3, 7, resources.getDimensionPixelSize(i4));
        dVar.mo2944j(i5, 7, C17782g.end_elements_barrier, 6, getResources().getDimensionPixelSize(i4));
        if (getData().mo34715v()) {
            i = C17782g.bottom_guideline_with_button;
        } else {
            i = C17782g.f49786r0;
        }
        dVar.mo2943i(i2, 4, i, 4);
        dVar.mo2944j(i2, 3, C17782g.f49785q9, 3, 0);
        return dVar;
    }

    private final C0630d getVerticalConstraints() {
        int i;
        C0630d dVar = new C0630d();
        dVar.mo2942h(this.f38728e.f27565q);
        m49520i(dVar, C17782g.action_card_icon);
        m49520i(dVar, C17782g.action_card_oval_icon_container);
        int i2 = C17782g.action_card_texts;
        dVar.mo2949x(i2, 0.5f);
        dVar.mo2946l(i2, true);
        dVar.mo2944j(i2, 6, C17782g.f49723R7, 6, 0);
        dVar.mo2943i(i2, 7, C17782g.f49757f3, 7);
        if (getData().mo34715v()) {
            i = C17782g.bottom_guideline_with_button;
        } else {
            i = C17782g.bottom_guideline_vertical_mode;
        }
        dVar.mo2943i(i2, 4, i, 4);
        dVar.mo2944j(i2, 3, C17782g.icon_barrier_bottom, 4, getResources().getDimensionPixelSize(C17779d.f49645S1));
        return dVar;
    }

    /* renamed from: h */
    private final void m49519h(C0630d dVar, int i) {
        int i2;
        dVar.mo2949x(i, Utils.FLOAT_EPSILON);
        dVar.mo2943i(i, 6, C17782g.f49723R7, 6);
        dVar.mo2943i(i, 7, C17782g.action_card_texts, 6);
        dVar.mo2943i(i, 3, C17782g.f49785q9, 3);
        if (getData().mo34715v()) {
            i2 = C17782g.bottom_guideline_with_button;
        } else {
            i2 = C17782g.f49786r0;
        }
        dVar.mo2943i(i, 4, i2, 4);
    }

    /* renamed from: i */
    private final void m49520i(C0630d dVar, int i) {
        dVar.mo2949x(i, 0.5f);
        dVar.mo2943i(i, 6, C17782g.f49723R7, 6);
        dVar.mo2943i(i, 7, C17782g.f49757f3, 7);
        dVar.mo2943i(i, 3, C17782g.top_guideline_vertical_mode, 3);
        dVar.mo2943i(i, 4, C17782g.action_card_texts, 3);
    }

    /* renamed from: j */
    private final void m49521j(ActionCardData actionCardData, C13147a aVar) {
        boolean z;
        boolean z2;
        Integer num;
        StatusBadgeView statusBadgeView = this.f38728e.f27574z;
        C41536l.m120488h(statusBadgeView, "binding.statusBadge");
        boolean z3 = true;
        if (!(actionCardData.mo34697e() instanceof BadgeData.Status) || aVar != C13147a.HORIZONTAL) {
            z = false;
        } else {
            z = true;
        }
        Integer num2 = null;
        C18368l.m62751F(statusBadgeView, z, false, 2, (Object) null);
        AppCompatImageView appCompatImageView = this.f38728e.f27571w;
        C41536l.m120488h(appCompatImageView, "binding.newBadge");
        if (!(actionCardData.mo34697e() instanceof BadgeData.TextBadge) || aVar != C13147a.HORIZONTAL) {
            z2 = false;
        } else {
            z2 = true;
        }
        C18368l.m62751F(appCompatImageView, z2, false, 2, (Object) null);
        NotificationBadgeView notificationBadgeView = this.f38728e.f27572x;
        C41536l.m120488h(notificationBadgeView, "binding.notificationBadge");
        if (!(actionCardData.mo34697e() instanceof BadgeData.Notification) || aVar != C13147a.HORIZONTAL) {
            z3 = false;
        }
        C18368l.m62751F(notificationBadgeView, z3, false, 2, (Object) null);
        BadgeData e = actionCardData.mo34697e();
        if (e instanceof BadgeData.Notification) {
            NotificationBadgeView notificationBadgeView2 = this.f38728e.f27572x;
            notificationBadgeView2.setMaxCharacterCount(((BadgeData.Notification) actionCardData.mo34697e()).mo34732d());
            Color b = ((BadgeData.Notification) actionCardData.mo34697e()).mo34731b();
            if (b != null) {
                Context context = notificationBadgeView2.getContext();
                C41536l.m120488h(context, "context");
                num = Integer.valueOf(b.mo35260a(context));
            } else {
                num = null;
            }
            notificationBadgeView2.setBadgeColor(num);
            Color a = ((BadgeData.Notification) actionCardData.mo34697e()).mo34730a();
            if (a != null) {
                Context context2 = notificationBadgeView2.getContext();
                C41536l.m120488h(context2, "context");
                num2 = Integer.valueOf(a.mo35260a(context2));
            }
            notificationBadgeView2.setBorderColor(num2);
            notificationBadgeView2.setBadge(((BadgeData.Notification) actionCardData.mo34697e()).mo34734e());
        } else if (e instanceof BadgeData.Status) {
            this.f38728e.f27574z.setType(((BadgeData.Status) actionCardData.mo34697e()).mo34745d());
            this.f38728e.f27574z.setFillType(((BadgeData.Status) actionCardData.mo34697e()).mo34743a());
            this.f38728e.f27574z.setSize(((BadgeData.Status) actionCardData.mo34697e()).mo34744b());
        } else if (e instanceof BadgeData.TextBadge) {
            this.f38728e.f27571w.setVisibility(0);
        }
    }

    /* renamed from: k */
    static /* synthetic */ void m49522k(ActionCardView actionCardView, ActionCardData actionCardData, C13147a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            actionCardData = actionCardView.getData();
        }
        if ((i & 2) != 0) {
            aVar = actionCardView.f38727d;
        }
        actionCardView.m49521j(actionCardData, aVar);
    }

    private final void setOvalIcon(ActionCardData actionCardData) {
        int i;
        ColorStateList colorStateList = null;
        if (!(actionCardData.mo34707m() instanceof Image.Drawable) || !isInEditMode()) {
            AppCompatImageView appCompatImageView = this.f38728e.f27556h;
            C41536l.m120488h(appCompatImageView, "binding.actionCardOvalIcon");
            C18368l.m62746A(appCompatImageView, actionCardData.mo34707m(), (C43075l) null, 2, (Object) null);
        } else {
            this.f38728e.f27556h.setImageDrawable(((Image.Drawable) actionCardData.mo34707m()).mo35381d());
        }
        AppCompatImageView appCompatImageView2 = this.f38728e.f27556h;
        Color u = actionCardData.mo34714u();
        if (u != null) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            colorStateList = u.mo35261b(context);
        }
        appCompatImageView2.setImageTintList(colorStateList);
        LayerView layerView = this.f38728e.f27557i;
        Color t = actionCardData.mo34712t();
        if (t != null) {
            Context context2 = getContext();
            C41536l.m120488h(context2, "context");
            i = t.mo35260a(context2);
        } else {
            i = 0;
        }
        layerView.setBackgroundColor(i);
    }

    private final void setRegularIcon(ActionCardData actionCardData) {
        ColorStateList colorStateList;
        if (!(actionCardData.mo34707m() instanceof Image.Drawable) || !isInEditMode()) {
            LottieAnimationView lottieAnimationView = this.f38728e.f27554f;
            C41536l.m120488h(lottieAnimationView, "binding.actionCardIcon");
            C18368l.m62777z(lottieAnimationView, actionCardData.mo34707m(), new C13150c(actionCardData));
        } else {
            this.f38728e.f27554f.setImageDrawable(((Image.Drawable) actionCardData.mo34707m()).mo35381d());
        }
        LottieAnimationView lottieAnimationView2 = this.f38728e.f27554f;
        Color q = actionCardData.mo34709q();
        if (q != null) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            colorStateList = q.mo35261b(context);
        } else {
            colorStateList = null;
        }
        lottieAnimationView2.setImageTintList(colorStateList);
    }

    public final Button getButton() {
        return this.f38730g;
    }

    public final ActionCardData getData() {
        return (ActionCardData) this.f38729f.getValue(this, f38726h[0]);
    }

    public final void setData(ActionCardData actionCardData) {
        C41536l.m120489i(actionCardData, "<set-?>");
        this.f38729f.setValue(this, f38726h[0], actionCardData);
    }

    public final void setOrientation(C13147a aVar) {
        C41536l.m120489i(aVar, "orientation");
        this.f38727d = aVar;
        m49513b();
        if (aVar == C13147a.HORIZONTAL) {
            this.f38728e.f27558j.setGravity(8388611);
            this.f38728e.f27559k.setGravity(8388611);
            this.f38728e.f27555g.setGravity(8388611);
            this.f38728e.f27553e.setGravity(8388611);
            AppCompatImageView appCompatImageView = this.f38728e.f27564p;
            C41536l.m120488h(appCompatImageView, "binding.chevronIcon");
            C18368l.m62751F(appCompatImageView, getData().mo34706l(), false, 2, (Object) null);
            m49522k(this, (ActionCardData) null, aVar, 1, (Object) null);
            return;
        }
        this.f38728e.f27558j.setGravity(17);
        this.f38728e.f27559k.setGravity(17);
        this.f38728e.f27555g.setGravity(17);
        this.f38728e.f27553e.setGravity(17);
        AppCompatImageView appCompatImageView2 = this.f38728e.f27564p;
        C41536l.m120488h(appCompatImageView2, "binding.chevronIcon");
        C18368l.m62766o(appCompatImageView2, false, 1, (Object) null);
        StatusBadgeView statusBadgeView = this.f38728e.f27574z;
        C41536l.m120488h(statusBadgeView, "binding.statusBadge");
        C18368l.m62766o(statusBadgeView, false, 1, (Object) null);
        AppCompatImageView appCompatImageView3 = this.f38728e.f27571w;
        C41536l.m120488h(appCompatImageView3, "binding.newBadge");
        C18368l.m62766o(appCompatImageView3, false, 1, (Object) null);
        NotificationBadgeView notificationBadgeView = this.f38728e.f27572x;
        C41536l.m120488h(notificationBadgeView, "binding.notificationBadge");
        C18368l.m62766o(notificationBadgeView, false, 1, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0182 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionCardView(android.content.Context r37, android.util.AttributeSet r38, int r39) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            java.lang.String r2 = "context"
            kotlin.jvm.internal.C41536l.m120489i(r1, r2)
            r36.<init>(r37, r38, r39)
            ge.bog.designsystem.components.actioncard.ActionCardView$a r2 = p341ge.bog.designsystem.components.actioncard.ActionCardView.C13147a.HORIZONTAL
            r0.f38727d = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r37)
            r3 = 1
            ak.t0 r2 = p352ak.C10016t0.m36738d(r2, r0, r3)
            java.lang.String r4 = "inflate(LayoutInflater.from(context), this, true)"
            kotlin.jvm.internal.C41536l.m120488h(r2, r4)
            r0.f38728e = r2
            kotlin.properties.a r4 = kotlin.properties.C41551a.f97718a
            ge.bog.designsystem.components.actioncard.ActionCardData r4 = new ge.bog.designsystem.components.actioncard.ActionCardData
            r5 = r4
            java.lang.String r6 = ""
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 524286(0x7fffe, float:7.34681E-40)
            r26 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            ge.bog.designsystem.components.actioncard.ActionCardView$d r5 = new ge.bog.designsystem.components.actioncard.ActionCardView$d
            r5.<init>(r4, r0)
            r0.f38729f = r5
            ge.bog.designsystem.components.buttons.Button r2 = r2.f27563o
            java.lang.String r4 = "binding.button"
            kotlin.jvm.internal.C41536l.m120488h(r2, r4)
            r0.f38730g = r2
            int[] r2 = p601sg.C17787l.f50595x
            java.lang.String r4 = "ActionCardView"
            kotlin.jvm.internal.C41536l.m120488h(r2, r4)
            r4 = 0
            r5 = r38
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r5, r2, r4, r4)
            java.lang.String r5 = "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)"
            kotlin.jvm.internal.C41536l.m120488h(r2, r5)
            ge.bog.designsystem.components.actioncard.ActionCardView$a$a r5 = p341ge.bog.designsystem.components.actioncard.ActionCardView.C13147a.f38731e
            int r6 = p601sg.C17787l.f49930G
            r13 = -1
            int r6 = r2.getInt(r6, r13)
            ge.bog.designsystem.components.actioncard.ActionCardView$a r5 = r5.mo34728a(r6)
            r0.setOrientation(r5)
            ge.bog.designsystem.components.actioncard.ActionCardData r1 = r36.m49518g(r37)
            int r5 = p601sg.C17787l.f49975J
            java.lang.String r15 = r2.getString(r5)
            int r5 = p601sg.C17787l.f49900E
            java.lang.String r25 = r2.getString(r5)
            int r5 = p601sg.C17787l.f50625z
            java.lang.String r26 = r2.getString(r5)
            int r5 = p601sg.C17787l.f49990K
            android.content.res.ColorStateList r5 = r2.getColorStateList(r5)
            if (r5 == 0) goto L_0x00a2
            ge.bog.designsystem.components.common.Color r5 = p642vh.C18358g.m62730d(r5)
            r27 = r5
            goto L_0x00a4
        L_0x00a2:
            r27 = r14
        L_0x00a4:
            int r5 = p601sg.C17787l.f49915F
            android.content.res.ColorStateList r5 = r2.getColorStateList(r5)
            if (r5 == 0) goto L_0x00b3
            ge.bog.designsystem.components.common.Color r5 = p642vh.C18358g.m62730d(r5)
            r28 = r5
            goto L_0x00b5
        L_0x00b3:
            r28 = r14
        L_0x00b5:
            int r5 = p601sg.C17787l.f49840A
            android.content.res.ColorStateList r5 = r2.getColorStateList(r5)
            if (r5 == 0) goto L_0x00c4
            ge.bog.designsystem.components.common.Color r5 = p642vh.C18358g.m62730d(r5)
            r29 = r5
            goto L_0x00c6
        L_0x00c4:
            r29 = r14
        L_0x00c6:
            int r5 = p601sg.C17787l.f49855B
            android.graphics.drawable.Drawable r5 = r2.getDrawable(r5)
            if (r5 == 0) goto L_0x00d7
            ge.bog.designsystem.components.common.Image$Drawable r1 = new ge.bog.designsystem.components.common.Image$Drawable
            r6 = 2
            r1.<init>(r5, r14, r6, r14)
        L_0x00d4:
            r16 = r1
            goto L_0x00e0
        L_0x00d7:
            if (r1 == 0) goto L_0x00de
            ge.bog.designsystem.components.common.Image r1 = r1.mo34707m()
            goto L_0x00d4
        L_0x00de:
            r16 = r14
        L_0x00e0:
            int r1 = p601sg.C17787l.f49870C
            int r1 = r2.getInt(r1, r13)
            zg.a$a r5 = p696zg.C19021a.f53127h
            zg.a r17 = r5.mo47192a(r1)
            int r1 = p601sg.C17787l.f50610y
            android.content.res.ColorStateList r1 = r2.getColorStateList(r1)
            if (r1 == 0) goto L_0x00fc
            ge.bog.designsystem.components.common.Color$StateList r5 = new ge.bog.designsystem.components.common.Color$StateList
            r5.<init>(r1)
            r18 = r5
            goto L_0x0105
        L_0x00fc:
            ge.bog.designsystem.components.common.Color$Resource r1 = new ge.bog.designsystem.components.common.Color$Resource
            int r5 = p601sg.C17778c.selector_action_card_background
            r1.<init>(r5)
            r18 = r1
        L_0x0105:
            int r1 = p601sg.C17787l.f49885D
            android.content.res.ColorStateList r1 = r2.getColorStateList(r1)
            if (r1 == 0) goto L_0x0115
            ge.bog.designsystem.components.common.Color$StateList r5 = new ge.bog.designsystem.components.common.Color$StateList
            r5.<init>(r1)
            r21 = r5
            goto L_0x0117
        L_0x0115:
            r21 = r14
        L_0x0117:
            int r1 = p601sg.C17787l.f49960I
            android.content.res.ColorStateList r1 = r2.getColorStateList(r1)
            if (r1 == 0) goto L_0x0127
            ge.bog.designsystem.components.common.Color$StateList r5 = new ge.bog.designsystem.components.common.Color$StateList
            r5.<init>(r1)
            r19 = r5
            goto L_0x0130
        L_0x0127:
            ge.bog.designsystem.components.common.Color$Attribute r1 = new ge.bog.designsystem.components.common.Color$Attribute
            int r5 = p601sg.C17777b.f49603w
            r1.<init>(r5)
            r19 = r1
        L_0x0130:
            int r1 = p601sg.C17787l.f49945H
            android.content.res.ColorStateList r1 = r2.getColorStateList(r1)
            if (r1 == 0) goto L_0x0140
            ge.bog.designsystem.components.common.Color$StateList r5 = new ge.bog.designsystem.components.common.Color$StateList
            r5.<init>(r1)
            r20 = r5
            goto L_0x0149
        L_0x0140:
            ge.bog.designsystem.components.common.Color$Attribute r1 = new ge.bog.designsystem.components.common.Color$Attribute
            int r5 = p601sg.C17777b.f49604x
            r1.<init>(r5)
            r20 = r1
        L_0x0149:
            int r1 = p601sg.C17787l.f50065P
            boolean r22 = r2.getBoolean(r1, r4)
            int r1 = p601sg.C17787l.f50080Q
            boolean r1 = r2.getBoolean(r1, r4)
            int r5 = p601sg.C17787l.f50095R
            int r5 = r2.getInt(r5, r4)
            lj.a$a r6 = p506lj.C16578a.f46751e
            lj.a r12 = r6.mo43727a(r5)
            ge.bog.designsystem.components.statusbadge.StatusBadgeType$a r5 = p341ge.bog.designsystem.components.statusbadge.StatusBadgeType.f40334k
            ge.bog.designsystem.components.statusbadge.StatusBadgeType[] r5 = r5.mo36786a()
            int r6 = r5.length
            r7 = r4
        L_0x0169:
            if (r7 >= r6) goto L_0x0182
            r8 = r5[r7]
            int r9 = r8.mo36731a()
            int r10 = p601sg.C17787l.f50215Z
            int r10 = r2.getInt(r10, r13)
            if (r9 != r10) goto L_0x017b
            r9 = r3
            goto L_0x017c
        L_0x017b:
            r9 = r4
        L_0x017c:
            if (r9 == 0) goto L_0x017f
            goto L_0x0183
        L_0x017f:
            int r7 = r7 + 1
            goto L_0x0169
        L_0x0182:
            r8 = r14
        L_0x0183:
            if (r8 != 0) goto L_0x019b
            ge.bog.designsystem.components.statusbadge.StatusBadgeView$a r5 = p341ge.bog.designsystem.components.statusbadge.StatusBadgeView.f40357k
            int r7 = p601sg.C17787l.f50110S
            int r8 = p601sg.C17787l.f50155V
            int r9 = p601sg.C17787l.f50125T
            int r10 = p601sg.C17787l.f50170W
            int r11 = p601sg.C17787l.f50140U
            int r3 = p601sg.C17787l.f50185X
            r6 = r2
            r14 = r12
            r12 = r3
            ge.bog.designsystem.components.statusbadge.StatusBadgeType r8 = r5.mo36794a(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x019c
        L_0x019b:
            r14 = r12
        L_0x019c:
            int r3 = p601sg.C17787l.f50200Y
            int r3 = r2.getInt(r3, r13)
            lj.b$a r5 = p506lj.C16580b.f46756h
            lj.b r3 = r5.mo43732a(r3)
            int r5 = p601sg.C17787l.f50050O
            boolean r30 = r2.getBoolean(r5, r4)
            int r4 = p601sg.C17787l.f50005L
            int r4 = r2.getResourceId(r4, r13)
            int r5 = p601sg.C17787l.f50020M
            java.lang.String r32 = r2.getString(r5)
            int r5 = p601sg.C17787l.f50035N
            android.content.res.ColorStateList r5 = r2.getColorStateList(r5)
            if (r5 == 0) goto L_0x01c9
            ge.bog.designsystem.components.common.Color r5 = p642vh.C18358g.m62730d(r5)
            r33 = r5
            goto L_0x01cb
        L_0x01c9:
            r33 = 0
        L_0x01cb:
            r23 = 0
            if (r1 == 0) goto L_0x01d7
            ge.bog.designsystem.components.actioncard.BadgeData$Status r1 = new ge.bog.designsystem.components.actioncard.BadgeData$Status
            r1.<init>(r8, r14, r3)
            r24 = r1
            goto L_0x01d9
        L_0x01d7:
            r24 = 0
        L_0x01d9:
            if (r4 == r13) goto L_0x01e2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r31 = r1
            goto L_0x01e4
        L_0x01e2:
            r31 = 0
        L_0x01e4:
            r34 = 256(0x100, float:3.59E-43)
            r35 = 0
            ge.bog.designsystem.components.actioncard.ActionCardData r1 = new ge.bog.designsystem.components.actioncard.ActionCardData
            r14 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r0.setData(r1)
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.actioncard.ActionCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
