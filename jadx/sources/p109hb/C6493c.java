package p109hb;

import android.content.Context;
import android.graphics.Canvas;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: hb.c */
public class C6493c extends AppCompatTextView {

    /* renamed from: d */
    private int f19825d = 0;

    /* renamed from: e */
    private int f19826e = 0;

    public C6493c(Context context) {
        super(context);
    }

    public void draw(Canvas canvas) {
        canvas.translate((float) (this.f19826e / 2), (float) (this.f19825d / 2));
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f19825d = measuredWidth - measuredHeight;
            this.f19826e = 0;
        } else {
            this.f19825d = 0;
            this.f19826e = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }
}
