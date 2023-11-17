package p341ge.bog.mobilebank.p975ui.components.ripplepulse;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import g91.C32335t0;
import p366bk.C10318g;

/* renamed from: ge.bog.mobilebank.ui.components.ripplepulse.ExpandableCircleView */
public class ExpandableCircleView extends View {

    /* renamed from: d */
    private boolean f85928d = false;

    /* renamed from: e */
    int f85929e = 50;

    /* renamed from: f */
    int f85930f = 1;

    /* renamed from: g */
    private String f85931g = "PROPERTY_RADIUS";

    /* renamed from: h */
    private String f85932h = "PROPERTY_WIDTH";

    /* renamed from: i */
    Paint f85933i = new Paint();

    /* renamed from: j */
    private boolean f85934j;

    public ExpandableCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int f = C32335t0.m95361f();
        if (f == 1) {
            this.f85933i.setColor(getResources().getColor(C10318g.color_accent_solo));
        } else if (f != 2) {
            this.f85933i.setColor(getResources().getColor(C10318g.color_primary_retail));
        } else {
            this.f85933i.setColor(getResources().getColor(C10318g.color_accent_wealth));
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (getHeight() / 2);
        int height = getHeight() + width;
        int height2 = getHeight();
        if (this.f85928d) {
            int i = this.f85930f;
            RectF rectF = new RectF((float) (width - i), Utils.FLOAT_EPSILON, (float) (height + i), (float) height2);
            int i2 = this.f85929e;
            canvas.drawRoundRect(rectF, (float) i2, (float) i2, this.f85933i);
            return;
        }
        canvas.drawRoundRect(new RectF((float) width, Utils.FLOAT_EPSILON, (float) height, (float) height2), (float) (getHeight() / 2), (float) (getHeight() / 2), this.f85933i);
    }

    public void setIsConfirmable(boolean z) {
        this.f85934j = z;
    }
}
