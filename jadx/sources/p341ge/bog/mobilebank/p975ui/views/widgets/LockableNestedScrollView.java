package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.LockableNestedScrollView */
public class LockableNestedScrollView extends NestedScrollView {
    /* access modifiers changed from: private */
    public long lastScrollUpdate = -1;
    /* access modifiers changed from: private */
    public OnEndScrollListener mOnEndScrollListener;
    private boolean mScrollable = true;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.LockableNestedScrollView$OnEndScrollListener */
    public interface OnEndScrollListener {
        void onEndScroll(int i);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.LockableNestedScrollView$a */
    private class C35741a implements Runnable {
        public void run() {
            if (System.currentTimeMillis() - LockableNestedScrollView.this.lastScrollUpdate > 100) {
                LockableNestedScrollView.this.lastScrollUpdate = -1;
                if (LockableNestedScrollView.this.mOnEndScrollListener != null) {
                    LockableNestedScrollView.this.mOnEndScrollListener.onEndScroll(LockableNestedScrollView.this.getScrollY());
                    return;
                }
                return;
            }
            LockableNestedScrollView.this.postDelayed(this, 100);
        }

        private C35741a() {
        }
    }

    public LockableNestedScrollView(Context context) {
        super(context);
    }

    public boolean isScrollable() {
        return this.mScrollable;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mScrollable && super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.lastScrollUpdate == -1 && this.mOnEndScrollListener != null) {
            postDelayed(new C35741a(), 100);
        }
        this.lastScrollUpdate = System.currentTimeMillis();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() != 0) {
                return super.onTouchEvent(motionEvent);
            }
            if (!this.mScrollable || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void setOnEndScrollListener(OnEndScrollListener onEndScrollListener) {
        this.mOnEndScrollListener = onEndScrollListener;
    }

    public void setScrollingEnabled(boolean z) {
        this.mScrollable = z;
    }

    public LockableNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LockableNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
