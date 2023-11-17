package p341ge.bog.designsystem.components.smallsteps;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9889c5;
import p478jj.C16203a;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18358g;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18375n;
import p642vh.C18378q;
import p642vh.C18379r;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.smallsteps.SmallStepsView */
public final class SmallStepsView extends LayerView {

    /* renamed from: m */
    static final /* synthetic */ C40303i[] f40320m;

    /* renamed from: d */
    private final C9889c5 f40321d;

    /* renamed from: e */
    private final C18355e0 f40322e;

    /* renamed from: f */
    private Drawable f40323f;

    /* renamed from: g */
    private Integer f40324g;

    /* renamed from: h */
    private final C18379r f40325h;

    /* renamed from: i */
    private final C18378q f40326i;

    /* renamed from: j */
    private final C18375n f40327j;

    /* renamed from: k */
    private final C18365j0 f40328k;

    /* renamed from: l */
    private final C18365j0 f40329l;

    static {
        Class<SmallStepsView> cls = SmallStepsView.class;
        f40320m = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "leftIconTintColor", "getLeftIconTintColor()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "rightIconTint", "getRightIconTint()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "rightIcon", "getRightIcon()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "rightIconVisibility", "getRightIconVisibility()Z", 0)), C41520a0.m120439e(new C41539o(cls, "loaderVisibility", "getLoaderVisibility()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SmallStepsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public static /* synthetic */ void getLeftIcon$annotations() {
    }

    public static /* synthetic */ void getLeftIconTint$annotations() {
    }

    private final Color getLeftIconTintColor() {
        return this.f40325h.getValue(this, f40320m[1]);
    }

    private final boolean getLoaderVisibility() {
        return this.f40329l.getValue(this, f40320m[5]).booleanValue();
    }

    private final Image getRightIcon() {
        return this.f40327j.getValue(this, f40320m[3]);
    }

    private final Integer getRightIconTint() {
        return this.f40326i.getValue(this, f40320m[2]);
    }

    private final boolean getRightIconVisibility() {
        return this.f40328k.getValue(this, f40320m[4]).booleanValue();
    }

    private final void setLeftIconTintColor(Color color) {
        this.f40325h.setValue(this, f40320m[1], color);
    }

    private final void setLoaderVisibility(boolean z) {
        this.f40329l.mo46151c(this, f40320m[5], z);
    }

    private final void setRightIcon(Image image) {
        this.f40327j.setValue(this, f40320m[3], image);
    }

    private final void setRightIconTint(Integer num) {
        this.f40326i.setValue(this, f40320m[2], num);
    }

    private final void setRightIconVisibility(boolean z) {
        this.f40328k.mo46151c(this, f40320m[4], z);
    }

    public final C9889c5 getBinding() {
        return this.f40321d;
    }

    public final Drawable getLeftIcon() {
        return this.f40323f;
    }

    public final Integer getLeftIconTint() {
        return this.f40324g;
    }

    public final CharSequence getTitle() {
        return this.f40322e.getValue(this, f40320m[0]);
    }

    public final void setLeftIcon(Drawable drawable) {
        this.f40323f = drawable;
        Image.Drawable drawable2 = null;
        if (drawable != null) {
            drawable2 = new Image.Drawable(drawable, (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
        setLeftIcon((Image) drawable2);
    }

    public final void setLeftIconTint(Integer num) {
        setLeftIconTint(num != null ? C18358g.m62729c(num.intValue()) : null);
        this.f40324g = num;
    }

    public final void setState(C16203a aVar) {
        boolean z;
        C41536l.m120489i(aVar, "state");
        setBackgroundResource(aVar.mo43213c());
        Integer f = aVar.mo43215f();
        Image.Resource resource = null;
        if (f != null) {
            resource = new Image.Resource(f.intValue(), (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
        setRightIcon(resource);
        setRightIconTint(aVar.mo43216g());
        if (aVar.mo43218l() || this.f40321d.f26866h.getDrawable() == null) {
            z = false;
        } else {
            z = true;
        }
        setRightIconVisibility(z);
        setLoaderVisibility(aVar.mo43218l());
        setEnabled(aVar.mo43214e());
    }

    public final void setTitle(CharSequence charSequence) {
        this.f40322e.setValue(this, f40320m[0], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SmallStepsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmallStepsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9889c5 c = C9889c5.m36272c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f40321d = c;
        AppCompatTextView appCompatTextView = c.f26867i;
        C41536l.m120488h(appCompatTextView, "binding.stepsTitle");
        this.f40322e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView = c.f26865g;
        C41536l.m120488h(appCompatImageView, "binding.stepsIconLeft");
        this.f40325h = new C18379r(appCompatImageView);
        AppCompatImageView appCompatImageView2 = c.f26866h;
        C41536l.m120488h(appCompatImageView2, "binding.stepsIconRight");
        this.f40326i = new C18378q(appCompatImageView2);
        AppCompatImageView appCompatImageView3 = c.f26866h;
        C41536l.m120488h(appCompatImageView3, "binding.stepsIconRight");
        this.f40327j = new C18375n(appCompatImageView3);
        AppCompatImageView appCompatImageView4 = c.f26866h;
        C41536l.m120488h(appCompatImageView4, "binding.stepsIconRight");
        this.f40328k = new C18365j0(appCompatImageView4, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        ProgressBar progressBar = c.f26864f;
        C41536l.m120488h(progressBar, "binding.loader");
        this.f40329l = new C18365j0(progressBar, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        setLayerStyle(C17786k.f49833r);
        setBackgroundColor(C0767a.m2893c(context2, C17778c.f49638w));
        int[] iArr = C17787l.f50061Oa;
        C41536l.m120488h(iArr, "SmallStepsView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        C16203a a = C16203a.f45693j.mo43219a(obtainStyledAttributes.getInt(C17787l.f50106Ra, C16203a.NEGATIVE.mo43217h()));
        if (a != null) {
            setState(a);
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(C17787l.f50076Pa);
        if (drawable != null) {
            setLeftIcon((Image) new Image.Drawable(drawable, (Boolean) null, 2, (DefaultConstructorMarker) null));
        }
        setLeftIconTintColor(C18358g.m62728b(obtainStyledAttributes.getColor(C17787l.f50091Qa, C18368l.m62755d(context2, C17777b.f49603w))));
        setTitle(obtainStyledAttributes.getString(C17787l.f50121Sa));
        obtainStyledAttributes.recycle();
    }

    public final void setLeftIcon(Image image) {
        AppCompatImageView appCompatImageView = this.f40321d.f26865g;
        C41536l.m120488h(appCompatImageView, "binding.stepsIconLeft");
        C18368l.m62746A(appCompatImageView, image, (C43075l) null, 2, (Object) null);
    }

    public final void setLeftIconTint(Color color) {
        setLeftIconTintColor(color);
    }
}
