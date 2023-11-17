package p341ge.bog.mobilebank.p975ui.views.widgets.cropview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import g91.C32355x0;
import p366bk.C10319h;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.b */
class C35793b extends View {

    /* renamed from: d */
    private Paint f86463d;

    /* renamed from: e */
    private Paint f86464e;

    /* renamed from: f */
    private Path f86465f = new Path();

    /* renamed from: g */
    private int f86466g;

    /* renamed from: h */
    private int f86467h;

    /* renamed from: i */
    private boolean f86468i;

    /* renamed from: j */
    private int f86469j;

    /* renamed from: k */
    private int f86470k;

    /* renamed from: l */
    private RectF f86471l = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);

    /* renamed from: m */
    private int f86472m;

    public C35793b(Context context, boolean z) {
        super(context);
        this.f86468i = z;
        m106188a();
    }

    /* renamed from: a */
    private void m106188a() {
        this.f86472m = C32355x0.m95511b(16.0f, getContext());
        this.f86467h = C32355x0.m95516g(C10319h.default_corner_radius);
        this.f86469j = C32355x0.m95516g(C10319h.product_child_item_height);
        int l = C32355x0.m95521l(getContext());
        int i = this.f86472m;
        this.f86470k = l - i;
        this.f86466g = (l / 2) - i;
        Paint paint = new Paint();
        this.f86463d = paint;
        paint.setColor(0);
        this.f86463d.setStrokeWidth(Utils.FLOAT_EPSILON);
        Paint paint2 = new Paint();
        this.f86464e = paint2;
        paint2.setColor(0);
        this.f86464e.setStrokeWidth(Utils.FLOAT_EPSILON);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f86465f.reset();
        if (!this.f86468i) {
            this.f86471l.set((float) this.f86472m, (float) ((canvas.getHeight() / 2) - (this.f86469j / 2)), (float) this.f86470k, (float) ((canvas.getHeight() / 2) + (this.f86469j / 2)));
            Path path = this.f86465f;
            RectF rectF = this.f86471l;
            int i = this.f86467h;
            path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
            this.f86465f.setFillType(Path.FillType.INVERSE_EVEN_ODD);
            RectF rectF2 = this.f86471l;
            int i2 = this.f86467h;
            canvas.drawRoundRect(rectF2, (float) i2, (float) i2, this.f86464e);
        } else {
            this.f86465f.addCircle((float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2), (float) this.f86466g, Path.Direction.CW);
            this.f86465f.setFillType(Path.FillType.INVERSE_EVEN_ODD);
            canvas.drawCircle((float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2), (float) this.f86466g, this.f86463d);
        }
        canvas.drawPath(this.f86465f, this.f86464e);
        canvas.clipPath(this.f86465f);
        canvas.drawColor(Color.parseColor("#A6000000"));
    }
}
