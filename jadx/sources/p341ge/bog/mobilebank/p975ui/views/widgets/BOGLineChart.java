package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.charts.LineChart;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BOGLineChart */
public class BOGLineChart extends LineChart {
    float downRawX;
    boolean interceptStarted;

    public BOGLineChart(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.downRawX = motionEvent.getRawX();
        } else if (action == 1) {
            this.interceptStarted = false;
        } else if (action != 2) {
            if (action == 3) {
                this.interceptStarted = false;
            }
        } else if (Math.abs(motionEvent.getRawX() - this.downRawX) > 10.0f) {
            this.interceptStarted = true;
        }
        getParent().requestDisallowInterceptTouchEvent(this.interceptStarted);
        return super.onTouchEvent(motionEvent);
    }

    public BOGLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BOGLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
