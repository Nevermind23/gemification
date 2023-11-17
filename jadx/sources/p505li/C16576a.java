package p505li;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C9971n;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18368l;
import p642vh.C18376o;
import p642vh.C18377p;
import ue1.C43064a;

/* renamed from: li.a */
public final class C16576a extends ConstraintLayout {

    /* renamed from: h */
    static final /* synthetic */ C40303i[] f46746h;

    /* renamed from: d */
    private final C9971n f46747d;

    /* renamed from: e */
    private final C18355e0 f46748e;

    /* renamed from: f */
    private final C18377p f46749f;

    /* renamed from: g */
    private final C18376o f46750g;

    static {
        Class<C16576a> cls = C16576a.class;
        f46746h = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "icon", "getIcon()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "drawable", "getDrawable()Landroid/graphics/drawable/Drawable;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16576a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final Drawable getDrawable() {
        return this.f46750g.getValue(this, f46746h[2]);
    }

    public final Integer getIcon() {
        return this.f46749f.getValue(this, f46746h[1]);
    }

    public final CharSequence getText() {
        return this.f46748e.getValue(this, f46746h[0]);
    }

    public final void setDrawable(Drawable drawable) {
        this.f46750g.setValue(this, f46746h[2], drawable);
    }

    public final void setDrawableTint(Integer num) {
        AppCompatImageView appCompatImageView = this.f46747d.f27282e;
        if (num == null) {
            appCompatImageView.clearColorFilter();
        } else {
            appCompatImageView.setColorFilter(C0767a.m2893c(getContext(), num.intValue()));
        }
    }

    public final void setDrawableTintAttr(Integer num) {
        AppCompatImageView appCompatImageView = this.f46747d.f27282e;
        if (num == null) {
            appCompatImageView.clearColorFilter();
            return;
        }
        Context context = getContext();
        C41536l.m120488h(context, "context");
        appCompatImageView.setColorFilter(C18368l.m62755d(context, num.intValue()));
    }

    public final void setIcon(Integer num) {
        this.f46749f.setValue(this, f46746h[1], num);
    }

    public final void setInfoBubble(C16577b bVar) {
        C41536l.m120489i(bVar, "elem");
        throw null;
    }

    public final void setText(CharSequence charSequence) {
        this.f46748e.setValue(this, f46746h[0], charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16576a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9971n c = C9971n.m36574c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f46747d = c;
        TextView textView = c.f27284g;
        C41536l.m120488h(textView, "binding.infoBubbleText");
        this.f46748e = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView = c.f27282e;
        C41536l.m120488h(appCompatImageView, "binding.infoBubbleImage");
        this.f46749f = new C18377p(appCompatImageView);
        AppCompatImageView appCompatImageView2 = c.f27282e;
        C41536l.m120488h(appCompatImageView2, "binding.infoBubbleImage");
        this.f46750g = new C18376o(appCompatImageView2);
        int[] iArr = C17787l.f50237a6;
        C41536l.m120488h(iArr, "InfoBubbleItemView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setIcon(Integer.valueOf(obtainStyledAttributes.getResourceId(C17787l.f50253b6, 0)));
        setText(obtainStyledAttributes.getString(C17787l.f50269c6));
        obtainStyledAttributes.recycle();
    }
}
