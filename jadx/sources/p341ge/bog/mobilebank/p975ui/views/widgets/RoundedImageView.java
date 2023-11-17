package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.RoundedImageView */
public class RoundedImageView extends ImageView {
    private int borderWidth;
    private int canvasSize;
    private Bitmap image;
    private Paint paint;
    private Paint paintBorder;

    public RoundedImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int measureHeight(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (!(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            size = this.canvasSize;
        }
        return size + 2;
    }

    private int measureWidth(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
            return size;
        }
        return this.canvasSize;
    }

    public void addShadow() {
        setLayerType(1, this.paintBorder);
        this.paintBorder.setShadowLayer(4.0f, Utils.FLOAT_EPSILON, 2.0f, -16777216);
    }

    public Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public void onDraw(Canvas canvas) {
        Bitmap drawableToBitmap = drawableToBitmap(getDrawable());
        this.image = drawableToBitmap;
        if (drawableToBitmap != null) {
            this.canvasSize = canvas.getWidth();
            if (canvas.getHeight() < this.canvasSize) {
                this.canvasSize = canvas.getHeight();
            }
            Bitmap bitmap = this.image;
            int i = this.canvasSize;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i, false);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.paint.setShader(new BitmapShader(createScaledBitmap, tileMode, tileMode));
            int i2 = this.canvasSize;
            int i3 = this.borderWidth;
            int i4 = (i2 - (i3 * 2)) / 2;
            canvas.drawCircle((float) (i4 + i3), (float) (i4 + i3), ((float) (((i2 - (i3 * 2)) / 2) + i3)) - 4.0f, this.paintBorder);
            int i5 = this.borderWidth;
            canvas.drawCircle((float) (i4 + i5), (float) (i4 + i5), ((float) ((this.canvasSize - (i5 * 2)) / 2)) - 4.0f, this.paint);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(measureWidth(i), measureHeight(i2));
    }

    public void setBorderColor(int i) {
        Paint paint2 = this.paintBorder;
        if (paint2 != null) {
            paint2.setColor(i);
        }
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.borderWidth = i;
        requestLayout();
        invalidate();
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint2 = new Paint();
        this.paint = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.paintBorder = paint3;
        paint3.setAntiAlias(true);
    }
}
