package p341ge.bog.designsystem.components.pagestate;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C1314o;
import com.airbnb.lottie.LottieAnimationView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageStateType;
import p352ak.C9968m4;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.pagestate.PageState */
public final class PageState extends FrameLayout {

    /* renamed from: g */
    static final /* synthetic */ C40303i[] f39987g = {C41520a0.m120439e(new C41539o(PageState.class, "titleText", "getTitleText()Ljava/lang/CharSequence;", 0))};

    /* renamed from: d */
    private C9968m4 f39988d;

    /* renamed from: e */
    private final C18355e0 f39989e;

    /* renamed from: f */
    private PageStateType f39990f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PageState(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m50423a(PageStateType pageStateType) {
        C9968m4 m4Var = this.f39988d;
        if (pageStateType.mo36386a() instanceof Image.Animation) {
            LayerView layerView = m4Var.f27273e;
            C41536l.m120488h(layerView, "iconBackground");
            layerView.setVisibility(8);
            LottieAnimationView lottieAnimationView = m4Var.f27275g;
            C41536l.m120488h(lottieAnimationView, "applyState$lambda$4$lambda$1");
            C18368l.m62746A(lottieAnimationView, pageStateType.mo36386a(), (C43075l) null, 2, (Object) null);
            lottieAnimationView.setVisibility(0);
        } else {
            LottieAnimationView lottieAnimationView2 = m4Var.f27275g;
            C41536l.m120488h(lottieAnimationView2, "pageStateLottieImage");
            lottieAnimationView2.setVisibility(8);
            LayerView layerView2 = m4Var.f27273e;
            Color b = pageStateType.mo36387b();
            Context context = layerView2.getContext();
            C41536l.m120488h(context, "context");
            layerView2.setBackgroundColor(b.mo35260a(context));
            C41536l.m120488h(layerView2, "applyState$lambda$4$lambda$2");
            layerView2.setVisibility(0);
            AppCompatImageView appCompatImageView = m4Var.f27274f;
            C41536l.m120488h(appCompatImageView, "applyState$lambda$4$lambda$3");
            C18368l.m62746A(appCompatImageView, pageStateType.mo36386a(), (C43075l) null, 2, (Object) null);
            Color d = pageStateType.mo36388d();
            Context context2 = appCompatImageView.getContext();
            C41536l.m120488h(context2, "context");
            appCompatImageView.setImageTintList(d.mo35261b(context2));
        }
        C1314o.m4575q(m4Var.f27276h, pageStateType.mo36389e());
    }

    /* renamed from: b */
    private final PageStateType m50424b(int i) {
        int i2 = i;
        if (i2 == 0) {
            return new PageStateType.Success((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        }
        if (i2 == 1) {
            return new PageStateType.Error((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        }
        if (i2 == 2) {
            return new PageStateType.Info((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        }
        if (i2 == 3) {
            return new PageStateType.Warning((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException("Invalid PageStateType key: " + i2);
    }

    public final C9968m4 getBinding() {
        return this.f39988d;
    }

    public final PageStateType getPageStateType() {
        return this.f39990f;
    }

    public final CharSequence getTitleText() {
        return this.f39989e.getValue(this, f39987g[0]);
    }

    public final void setBinding(C9968m4 m4Var) {
        C41536l.m120489i(m4Var, "<set-?>");
        this.f39988d = m4Var;
    }

    public final void setPageStateType(PageStateType pageStateType) {
        C41536l.m120489i(pageStateType, C11755a.C11756a.f34100b);
        m50423a(pageStateType);
    }

    public final void setTitleText(CharSequence charSequence) {
        this.f39989e.setValue(this, f39987g[0], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageState(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageState(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9968m4 c = C9968m4.m36562c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39988d = c;
        AppCompatTextView appCompatTextView = c.f27276h;
        C41536l.m120488h(appCompatTextView, "binding.pageStateTitle");
        this.f39989e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        this.f39990f = new PageStateType.Success((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C17787l.f49895D9);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.PageState)");
        setPageStateType(m50424b(obtainStyledAttributes.getInt(C17787l.f49925F9, 0)));
        setTitleText(obtainStyledAttributes.getString(C17787l.f49910E9));
        obtainStyledAttributes.recycle();
    }
}
