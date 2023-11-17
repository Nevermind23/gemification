package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.C0808h;
import com.bumptech.glide.C2379b;
import g91.C32296c1;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Image;
import p366bk.C10321j;
import p642vh.C18368l;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.SuccessScreenDetailsItem */
public final class SuccessScreenDetailsItem extends LinearLayout {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SuccessScreenDetailsItem(Context context) {
        this(context, (AttributeSet) null);
        C41536l.m120489i(context, "context");
    }

    public static /* synthetic */ void addValue$default(SuccessScreenDetailsItem successScreenDetailsItem, String str, Image image, int i, float f, int i2, Integer num, Integer num2, int i3, Object obj) {
        successScreenDetailsItem.addValue(str, (i3 & 2) != 0 ? null : image, i, f, i2, num, num2);
    }

    private final GradientDrawable createRoundShape(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Context context = getContext();
        C41536l.m120488h(context, "context");
        gradientDrawable.setColor(C32343x.m95418U(i, context));
        return gradientDrawable;
    }

    private final void setDefaultMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        C41536l.m120487g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = C32296c1.m95141a(getContext(), 15);
        setLayoutParams(marginLayoutParams);
        requestLayout();
    }

    private final void setImage(Image image, int i, TextView textView, Integer num, Integer num2) {
        if (image instanceof Image.Attribute) {
            Context context = getContext();
            C41536l.m120488h(context, "context");
            Drawable l = C18368l.m62763l(context, ((Image.Attribute) image).mo35371d());
            if (l != null) {
                transformDrawable(l, i, textView, num, num2);
            }
        } else if (image instanceof Image.Drawable) {
            transformDrawable(((Image.Drawable) image).mo35381d(), i, textView, num, num2);
        } else if (image instanceof Image.Resource) {
            Drawable drawable = getContext().getDrawable(((Image.Resource) image).mo35391d());
            if (drawable != null) {
                transformDrawable(drawable, i, textView, num, num2);
            }
        } else if (image instanceof Image.Url) {
            C2379b.m9210t(getContext()).mo7757y(((Image.Url) image).mo35411k()).mo7732z0(new SuccessScreenDetailsItem$setImage$3(this, i, textView, num, num2)).mo7728Z0();
        } else {
            boolean z = image instanceof Image.Animation;
        }
    }

    /* access modifiers changed from: private */
    public final void transformDrawable(Drawable drawable, int i, TextView textView, Integer num, Integer num2) {
        if (num == null || num2 == null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            drawable.setBounds(0, 0, num.intValue(), num2.intValue());
        }
        if (i == 1) {
            textView.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    static /* synthetic */ void transformDrawable$default(SuccessScreenDetailsItem successScreenDetailsItem, Drawable drawable, int i, TextView textView, Integer num, Integer num2, int i2, Object obj) {
        successScreenDetailsItem.transformDrawable(drawable, i, textView, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2);
    }

    public final void addKey(String str, int i) {
        C41536l.m120489i(str, "text");
        TextView textView = new TextView(getContext());
        textView.setMaxWidth(C32296c1.m95141a(getContext(), 240));
        textView.setText(str);
        textView.setTextSize(2, 12.0f);
        Context context = getContext();
        C41536l.m120488h(context, "context");
        textView.setTextColor(C32343x.m95418U(i, context));
        textView.setGravity(8388611);
        textView.setTypeface(C0808h.m3033h(getContext(), C10321j.f28708f));
        addView(textView);
    }

    public final void addValue(String str, Image image, int i, float f, int i2, Integer num, Integer num2) {
        String str2 = str;
        C41536l.m120489i(str, "text");
        LinearLayout linearLayout = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(C32296c1.m95141a(getContext(), 8));
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(8388613);
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(8388613);
        textView.setTypeface(C0808h.m3033h(getContext(), C10321j.f28707e));
        float f2 = f;
        textView.setTextSize(2, f);
        Context context = getContext();
        C41536l.m120488h(context, "context");
        textView.setTextColor(C32343x.m95418U(i2, context));
        if (image != null) {
            setImage(image, i, textView, num, num2);
        }
        textView.setCompoundDrawablePadding(C32296c1.m95141a(getContext(), 8));
        linearLayout.addView(textView);
        addView(linearLayout);
    }

    public final void addValueWithSymbol(String str, int i, int i2) {
        C41536l.m120489i(str, "symbol");
        LinearLayout linearLayout = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(C32296c1.m95141a(getContext(), 8));
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(8388613);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C32296c1.m95141a(getContext(), 24), C32296c1.m95141a(getContext(), 24));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(17);
        textView.setTextSize(2, 12.0f);
        Context context = getContext();
        C41536l.m120488h(context, "context");
        textView.setTextColor(C32343x.m95418U(i2, context));
        textView.setBackground(createRoundShape(i));
        textView.setLayoutParams(layoutParams2);
        linearLayout.addView(textView);
        addView(linearLayout);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setDefaultMargin();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuccessScreenDetailsItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
    }
}
