package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import android.util.AttributeSet;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BulletTextView */
public class BulletTextView extends BogTextView {
    private int color;
    private int gapWidth;
    private int radius;

    public BulletTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addBullet() {
        CharSequence text = getText();
        if (!TextUtils.isEmpty(text)) {
            SpannableString spannableString = new SpannableString(text);
            spannableString.setSpan(new BulletSpan(this.gapWidth, this.color), 0, text.length(), 0);
            setText(spannableString);
        }
    }

    public BulletTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        if (!(attributeSet == null || (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29294f1)) == null)) {
            this.radius = (int) obtainStyledAttributes.getDimension(C10330s.f29324i1, 4.0f);
            this.gapWidth = (int) obtainStyledAttributes.getDimension(C10330s.f29314h1, 2.0f);
            this.color = obtainStyledAttributes.getColor(C10330s.f29304g1, 0);
            obtainStyledAttributes.recycle();
        }
        addBullet();
    }
}
