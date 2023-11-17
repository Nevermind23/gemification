package p341ge.bog.chatkit.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ge.bog.chatkit.utils.ShapeImageView */
public class ShapeImageView extends AppCompatImageView {

    /* renamed from: d */
    private Path f38623d;

    public ShapeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(1, (Paint) null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f38623d.isEmpty()) {
            super.onDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f38623d);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = new Path();
        this.f38623d = path;
        float f = (float) i;
        float f2 = f / 2.0f;
        float f3 = 0.1f * f;
        float f4 = f * 0.8875f;
        path.moveTo(f2, f);
        this.f38623d.cubicTo(f3, f, Utils.FLOAT_EPSILON, f4, Utils.FLOAT_EPSILON, f2);
        this.f38623d.cubicTo(Utils.FLOAT_EPSILON, f3, f3, Utils.FLOAT_EPSILON, f2, Utils.FLOAT_EPSILON);
        this.f38623d.cubicTo(f4, Utils.FLOAT_EPSILON, f, f3, f, f2);
        this.f38623d.cubicTo(f, f4, f4, f, f2, f);
        this.f38623d.close();
    }
}
