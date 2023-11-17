package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g91.C32355x0;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BigDividerView */
public class BigDividerView extends FrameLayout {
    public BigDividerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public BigDividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, C10324m.layout_big_div, this);
        if (!isInEditMode()) {
            if (getLayoutParams() == null || getLayoutParams().height == -2 || getLayoutParams().height == -1) {
                setLayoutParams(new ViewGroup.LayoutParams(-2, C32355x0.m95511b(12.0f, context)));
            }
        }
    }
}
