package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.SpecialAlignedTitleValueView */
public class SpecialAlignedTitleValueView extends LinearLayout {
    private TextView mTitleTV;
    private String mTitleText;
    private TextView mValueTV;
    private String mValueText;
    private int marginBottom;

    public SpecialAlignedTitleValueView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setupViews() {
        this.mTitleTV = (BogTextView) findViewById(C10322k.industry_name);
        this.mValueTV = (BogTextView) findViewById(C10322k.f28775OA);
    }

    public String getTitleText() {
        String str = this.mTitleText;
        if (str == null || str.length() <= 0) {
            return "";
        }
        return this.mTitleText;
    }

    public String getValueText() {
        return this.mValueText;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.marginBottom;
            requestLayout();
        }
    }

    public void setTitleText(String str) {
        this.mTitleText = "";
        if (str != null && str.length() > 0) {
            this.mTitleTV.setText(str);
            this.mTitleText = str;
        }
    }

    public void setValueDrawableEnd(int i) {
        this.mValueTV.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C0767a.m2895e(getContext(), i), (Drawable) null);
    }

    public void setValueText(String str) {
        this.mValueText = "";
        if (str != null && str.length() > 0) {
            this.mValueTV.setText(str);
            this.mValueText = str;
        }
    }

    public SpecialAlignedTitleValueView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpecialAlignedTitleValueView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10330s.f29420r7);
        this.marginBottom = obtainStyledAttributes.getDimensionPixelSize(C10330s.f29430s7, -1);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), C10324m.layout_special_aligned_title_value_view, this);
        setupViews();
        if (this.marginBottom == -1) {
            this.marginBottom = getResources().getDimensionPixelSize(C10319h.margin_large);
        }
    }
}
