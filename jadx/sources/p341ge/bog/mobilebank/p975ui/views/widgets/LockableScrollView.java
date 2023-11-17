package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.LockableScrollView */
public class LockableScrollView extends ScrollView {
    private boolean mScrollable = true;

    public LockableScrollView(Context context) {
        super(context);
    }

    public boolean isScrollable() {
        return this.mScrollable;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mScrollable && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.mScrollable || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setScrollingEnabled(boolean z) {
        this.mScrollable = z;
    }

    public LockableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LockableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
