package p210p8;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.C0825b;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: p8.a */
public class C7762a {

    /* renamed from: i */
    private static final int[] f22452i = new int[3];

    /* renamed from: j */
    private static final float[] f22453j = {Utils.FLOAT_EPSILON, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f22454k = new int[4];

    /* renamed from: l */
    private static final float[] f22455l = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f22456a;

    /* renamed from: b */
    private final Paint f22457b;

    /* renamed from: c */
    private final Paint f22458c;

    /* renamed from: d */
    private int f22459d;

    /* renamed from: e */
    private int f22460e;

    /* renamed from: f */
    private int f22461f;

    /* renamed from: g */
    private final Path f22462g;

    /* renamed from: h */
    private final Paint f22463h;

    public C7762a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void mo22520a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z;
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        if (f3 < Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.f22462g;
        if (z) {
            int[] iArr = f22454k;
            iArr[0] = 0;
            iArr[1] = this.f22461f;
            iArr[2] = this.f22460e;
            iArr[3] = this.f22459d;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f22454k;
            iArr2[0] = 0;
            iArr2[1] = this.f22459d;
            iArr2[2] = this.f22460e;
            iArr2[3] = this.f22461f;
        }
        float width = rectF.width() / 2.0f;
        if (width > Utils.FLOAT_EPSILON) {
            float f6 = 1.0f - (((float) i2) / width);
            float[] fArr = f22455l;
            fArr[1] = f6;
            fArr[2] = ((1.0f - f6) / 2.0f) + f6;
            this.f22457b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f22454k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f22463h);
            }
            canvas.drawArc(rectF, f, f2, true, this.f22457b);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void mo22521b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(Utils.FLOAT_EPSILON, (float) (-i));
        int[] iArr = f22452i;
        iArr[0] = this.f22461f;
        iArr[1] = this.f22460e;
        iArr[2] = this.f22459d;
        Paint paint = this.f22458c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f22453j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f22458c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint mo22522c() {
        return this.f22456a;
    }

    /* renamed from: d */
    public void mo22523d(int i) {
        this.f22459d = C0825b.m3101j(i, 68);
        this.f22460e = C0825b.m3101j(i, 20);
        this.f22461f = C0825b.m3101j(i, 0);
        this.f22456a.setColor(this.f22459d);
    }

    public C7762a(int i) {
        this.f22462g = new Path();
        Paint paint = new Paint();
        this.f22463h = paint;
        this.f22456a = new Paint();
        mo22523d(i);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f22457b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f22458c = new Paint(paint2);
    }
}
