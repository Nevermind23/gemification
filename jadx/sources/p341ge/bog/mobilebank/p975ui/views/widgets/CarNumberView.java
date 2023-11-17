package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.ClipDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.CarNumberView */
public class CarNumberView extends FrameLayout {
    private static final int VIEW_TYPE_BIG = 1;
    private static final int VIEW_TYPE_SMALL = 0;
    private static final int VIEW_TYPE_SMALL_NEW = 2;
    private TextView mCardNumberTV;
    private ImageView mSemiCircleIV;
    private int viewType;

    public CarNumberView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static String formatCardNumber(String str) {
        if (str == null) {
            return str;
        }
        int length = str.length() - str.replace("-", "").length();
        if (str.length() == 9 && length == 2 && str.charAt(2) == '-' && str.charAt(6) == '-') {
            str = String.format("  %s\n%s\n%s  ", new Object[]{str.substring(0, 3), str.substring(3, 6), str.substring(6, 9)});
        }
        return str.toUpperCase();
    }

    private void setUpAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29444u1);
        if (obtainStyledAttributes != null) {
            this.viewType = obtainStyledAttributes.getInt(C10330s.f29454v1, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private void setupViews() {
        this.mCardNumberTV = (TextView) findViewById(C10322k.car_number_tv);
        ImageView imageView = (ImageView) findViewById(C10322k.semi_circle_view);
        this.mSemiCircleIV = imageView;
        if (imageView != null) {
            ClipDrawable clipDrawable = (ClipDrawable) imageView.getBackground();
            clipDrawable.setLevel(clipDrawable.getLevel() + 3000);
        }
        getChildAt(0).setClipToOutline(true);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Path path = new Path();
        path.addCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((float) getWidth()) / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    public String getCardNumber() {
        return this.mCardNumberTV.getText().toString();
    }

    public void setCardNumber(String str) {
        this.mCardNumberTV.setText(formatCardNumber(str));
    }

    public CarNumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            setUpAttrs(attributeSet);
        }
        int i = this.viewType;
        if (i == 0) {
            View.inflate(getContext(), C10324m.view_car_number_small, this);
        } else if (i == 1) {
            View.inflate(getContext(), C10324m.view_car_number, this);
        } else {
            View.inflate(getContext(), C10324m.view_car_number_small_new, this);
        }
        setupViews();
    }
}
