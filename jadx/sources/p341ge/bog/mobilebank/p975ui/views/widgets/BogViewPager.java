package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.viewpager.widget.ViewPager;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import com.github.mikephil.charting.charts.LineChart;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BogViewPager */
public class BogViewPager extends ViewPager {
    private boolean calculateHeight;
    private boolean childrenCanInterceptScroll;
    private boolean fingerSwipable;

    public BogViewPager(Context context) {
        this(context, (AttributeSet) null);
    }

    private int measureHeight(int i, View view) {
        int i2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        if (view != null) {
            i2 = view.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        return i2;
    }

    private void setUpAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29069J0);
        if (obtainStyledAttributes != null) {
            this.calculateHeight = obtainStyledAttributes.getBoolean(C10330s.f29079K0, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int width;
        if (((view instanceof LineChart) || (view instanceof WebView) || (view instanceof AccountItemView) || (view instanceof AccountCardItemView) || (view instanceof SwipeLayout)) && i2 > (width = (view.getWidth() * 10) / 100) && i2 < view.getWidth() - width) {
            return true;
        }
        return super.canScroll(view, z, i, i2, i3);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return this.fingerSwipable && super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.calculateHeight) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.measure(i, i2);
            }
            setMeasuredDimension(getMeasuredWidth(), measureHeight(i2, childAt));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return !this.fingerSwipable || super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void setFingerSwipable(boolean z) {
        this.fingerSwipable = z;
    }

    public BogViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fingerSwipable = true;
        this.calculateHeight = true;
        this.childrenCanInterceptScroll = false;
        if (attributeSet != null) {
            setUpAttrs(attributeSet);
        }
    }
}
