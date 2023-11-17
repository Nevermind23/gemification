package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.graphics.Canvas;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import g91.C32309i;
import g91.C32335t0;
import i91.C36373d;
import java.util.ArrayList;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.RateChartMarkerView */
public class RateChartMarkerView extends MarkerView {
    BogTextView mBogTextView;
    private float mDeltaY;
    ArrayList<String> mLabels;

    public RateChartMarkerView(Context context) {
        super(context, C10324m.rate_chart_marker);
        setupView();
    }

    private void setupView() {
        this.mBogTextView = (BogTextView) findViewById(C10322k.marker_text);
    }

    public void draw(Canvas canvas, float f, float f2) {
        float f3;
        if (f - (((float) getWidth()) / 2.0f) < Utils.FLOAT_EPSILON) {
            f3 = 0.0f;
        } else {
            f3 = f + getOffsetForDrawingAtPoint(f, f2).f11822x;
        }
        canvas.translate(f3, Utils.FLOAT_EPSILON);
        draw(canvas);
        canvas.translate(-f3, -0.0f);
    }

    public MPPointF getOffset() {
        return MPPointF.getInstance(-(((float) getWidth()) / 2.0f), (float) (-getHeight()));
    }

    public void refreshContent(Entry entry, Highlight highlight) {
        String str;
        ArrayList<String> arrayList = this.mLabels;
        if (arrayList != null) {
            str = C32309i.m95242c(arrayList.get((int) entry.getX()), "dd MMM");
        } else {
            str = "";
        }
        this.mBogTextView.setText(C36373d.m107943a(str.concat(", "), String.valueOf(entry.getY()), "", C32335t0.m95359d(getContext(), true), getContext()));
    }

    public RateChartMarkerView(Context context, ArrayList<String> arrayList, float f) {
        super(context, C10324m.rate_chart_marker);
        this.mLabels = arrayList;
        this.mDeltaY = f;
        setupView();
    }
}
