package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.VerticalViewPager */
public class VerticalViewPager extends ViewPager {
    private boolean fingerSwipable = true;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.VerticalViewPager$a */
    private class C35765a implements ViewPager.C1903k {
        /* renamed from: a */
        public void mo6551a(View view, float f) {
            if (f < -1.0f) {
                view.setAlpha(Utils.FLOAT_EPSILON);
            } else if (f <= 1.0f) {
                view.setAlpha(1.0f);
                view.setTranslationX(((float) view.getWidth()) * (-f));
                view.setTranslationY(f * ((float) view.getHeight()));
            } else {
                view.setAlpha(Utils.FLOAT_EPSILON);
            }
        }

        private C35765a() {
        }
    }

    public VerticalViewPager(Context context) {
        super(context);
        init();
    }

    private void init() {
        setPageTransformer(true, new C35765a());
        setOverScrollMode(2);
    }

    private MotionEvent swapXY(MotionEvent motionEvent) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
        return motionEvent;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(swapXY(motionEvent));
        swapXY(motionEvent);
        if (!this.fingerSwipable || !onInterceptTouchEvent) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.fingerSwipable && super.onTouchEvent(swapXY(motionEvent));
    }

    public void setFingerSwipable(boolean z) {
        this.fingerSwipable = z;
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
