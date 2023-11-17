package p058e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0836a;
import com.github.mikephil.charting.utils.Utils;
import p030c.C2210a;
import p030c.C2218i;
import p030c.C2219j;

/* renamed from: e.d */
public class C5877d extends Drawable {

    /* renamed from: m */
    private static final float f18453m = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    private final Paint f18454a;

    /* renamed from: b */
    private float f18455b;

    /* renamed from: c */
    private float f18456c;

    /* renamed from: d */
    private float f18457d;

    /* renamed from: e */
    private float f18458e;

    /* renamed from: f */
    private boolean f18459f;

    /* renamed from: g */
    private final Path f18460g = new Path();

    /* renamed from: h */
    private final int f18461h;

    /* renamed from: i */
    private boolean f18462i = false;

    /* renamed from: j */
    private float f18463j;

    /* renamed from: k */
    private float f18464k;

    /* renamed from: l */
    private int f18465l = 2;

    public C5877d(Context context) {
        Paint paint = new Paint();
        this.f18454a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, C2219j.f6746Z0, C2210a.f6469y, C2218i.f6615b);
        mo19210d(obtainStyledAttributes.getColor(C2219j.f6767d1, 0));
        mo19209c(obtainStyledAttributes.getDimension(C2219j.f6787h1, Utils.FLOAT_EPSILON));
        mo19213f(obtainStyledAttributes.getBoolean(C2219j.f6782g1, true));
        mo19212e((float) Math.round(obtainStyledAttributes.getDimension(C2219j.f6777f1, Utils.FLOAT_EPSILON)));
        this.f18461h = obtainStyledAttributes.getDimensionPixelSize(C2219j.f6772e1, 0);
        this.f18456c = (float) Math.round(obtainStyledAttributes.getDimension(C2219j.f6762c1, Utils.FLOAT_EPSILON));
        this.f18455b = (float) Math.round(obtainStyledAttributes.getDimension(C2219j.f6752a1, Utils.FLOAT_EPSILON));
        this.f18457d = obtainStyledAttributes.getDimension(C2219j.f6757b1, Utils.FLOAT_EPSILON);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private static float m23644b(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public float mo19208a() {
        return this.f18463j;
    }

    /* renamed from: c */
    public void mo19209c(float f) {
        if (this.f18454a.getStrokeWidth() != f) {
            this.f18454a.setStrokeWidth(f);
            this.f18464k = (float) (((double) (f / 2.0f)) * Math.cos((double) f18453m));
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void mo19210d(int i) {
        if (i != this.f18454a.getColor()) {
            this.f18454a.setColor(i);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        int i;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i2 = this.f18465l;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? C0836a.m3144f(this) == 0 : C0836a.m3144f(this) == 1))) {
            z = true;
        }
        float f3 = this.f18455b;
        float b = m23644b(this.f18456c, (float) Math.sqrt((double) (f3 * f3 * 2.0f)), this.f18463j);
        float b2 = m23644b(this.f18456c, this.f18457d, this.f18463j);
        float round = (float) Math.round(m23644b(Utils.FLOAT_EPSILON, this.f18464k, this.f18463j));
        float b3 = m23644b(Utils.FLOAT_EPSILON, f18453m, this.f18463j);
        if (z) {
            f = 0.0f;
        } else {
            f = -180.0f;
        }
        if (z) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        float b4 = m23644b(f, f2, this.f18463j);
        double d = (double) b;
        float f4 = b4;
        double d2 = (double) b3;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(d * Math.sin(d2));
        this.f18460g.rewind();
        float b5 = m23644b(this.f18458e + this.f18454a.getStrokeWidth(), -this.f18464k, this.f18463j);
        float f5 = (-b2) / 2.0f;
        this.f18460g.moveTo(f5 + round, Utils.FLOAT_EPSILON);
        this.f18460g.rLineTo(b2 - (round * 2.0f), Utils.FLOAT_EPSILON);
        this.f18460g.moveTo(f5, b5);
        this.f18460g.rLineTo(round2, round3);
        this.f18460g.moveTo(f5, -b5);
        this.f18460g.rLineTo(round2, -round3);
        this.f18460g.close();
        canvas.save();
        float strokeWidth = this.f18454a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f6 = this.f18458e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f6))) / 4) * 2)) + (strokeWidth * 1.5f) + f6);
        if (this.f18459f) {
            if (this.f18462i ^ z2) {
                i = -1;
            } else {
                i = 1;
            }
            canvas2.rotate(f4 * ((float) i));
        } else if (z2) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f18460g, this.f18454a);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo19212e(float f) {
        if (f != this.f18458e) {
            this.f18458e = f;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void mo19213f(boolean z) {
        if (this.f18459f != z) {
            this.f18459f = z;
            invalidateSelf();
        }
    }

    public int getIntrinsicHeight() {
        return this.f18461h;
    }

    public int getIntrinsicWidth() {
        return this.f18461h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        if (i != this.f18454a.getAlpha()) {
            this.f18454a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f18454a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f) {
        if (this.f18463j != f) {
            this.f18463j = f;
            invalidateSelf();
        }
    }
}
