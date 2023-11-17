package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.SquareImageButton */
public class SquareImageButton extends ImageButton {
    public SquareImageButton(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size > size2) {
            size = size2;
        }
        setMeasuredDimension(size, size);
    }

    public SquareImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
