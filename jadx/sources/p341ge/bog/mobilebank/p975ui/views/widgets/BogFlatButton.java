package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g91.C32355x0;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;
import p642vh.C18368l;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BogFlatButton */
public class BogFlatButton extends LinearLayout {

    /* renamed from: bg */
    private GradientDrawable f86340bg;
    private ImageView buttonImage;
    private TextView buttonText;

    public BogFlatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setUpView(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        View.inflate(getContext(), C10324m.bog_flat_button_layout, this);
        this.buttonImage = (ImageView) findViewById(C10322k.f28832f5);
        this.buttonText = (TextView) findViewById(C10322k.f28866m5);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f86340bg = gradientDrawable;
        gradientDrawable.setShape(0);
        this.f86340bg.setCornerRadius((float) C32355x0.m95516g(C10319h.bog_button_radius));
        setBackground(this.f86340bg);
        if (attributeSet != null && (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29218Y)) != null) {
            setImage(obtainStyledAttributes.getResourceId(C10330s.f29228Z, 0));
            setText(obtainStyledAttributes.getString(C10330s.f29272d0), obtainStyledAttributes.getResourceId(C10330s.f29261c0, 0), obtainStyledAttributes.getBoolean(C10330s.f29239a0, false), obtainStyledAttributes.getBoolean(C10330s.f29250b0, false));
            obtainStyledAttributes.recycle();
        }
    }

    public void setImage(int i) {
        this.buttonImage.setImageResource(i);
        this.buttonImage.setVisibility(0);
        this.buttonImage.setImageTintList(ColorStateList.valueOf(C18368l.m62755d(getContext(), C10316e.f28605g)));
    }

    public void setText(String str, int i, boolean z, boolean z2) {
        this.buttonText.setText(str);
        int i2 = 0;
        int[][] iArr = {new int[]{16842919}, new int[]{16842908}, new int[]{16842910}};
        int i3 = C10318g.f28616A;
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{C32355x0.m95514e(i3, getContext()), C32355x0.m95514e(i3, getContext()), C32355x0.m95514e(i, getContext())});
        this.buttonText.setTextColor(colorStateList);
        this.f86340bg.setColor(new ColorStateList(iArr, new int[]{C32355x0.m95514e(i, getContext()), C32355x0.m95514e(i, getContext()), C32355x0.m95514e(C10318g.f28649t2, getContext())}));
        this.f86340bg.setStroke(C32355x0.m95517h(C10319h.payments_circular_view_border_thickness, getContext()), colorStateList);
        if (z) {
            this.buttonText.setTextSize(0, (float) C32355x0.m95516g(C10319h.bog_flat_button_text_Size_large));
        } else {
            this.buttonText.setTextSize(0, (float) C32355x0.m95516g(C10319h.bog_flat_button_text_Size));
        }
        ImageView imageView = this.buttonImage;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }

    public void setTextSize(int i) {
        this.buttonText.setTextSize(2, (float) i);
    }

    public BogFlatButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUpView(attributeSet);
    }

    public void setText(String str, int i) {
        setText(str, i, false, true);
    }
}
