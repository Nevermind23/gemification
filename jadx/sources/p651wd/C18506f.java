package p651wd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import p472jd.C15751h;

/* renamed from: wd.f */
public class C18506f extends View {

    /* renamed from: i */
    public static final int f51986i = Color.argb(160, C11051p3.f31759c, C11051p3.f31759c, C11051p3.f31759c);

    /* renamed from: d */
    private C15751h f51987d;

    /* renamed from: e */
    private int f51988e;

    /* renamed from: f */
    private ColorDrawable f51989f;

    /* renamed from: g */
    private ColorDrawable f51990g;

    /* renamed from: h */
    private final float f51991h;

    /* renamed from: wd.f$a */
    static /* synthetic */ class C18507a {

        /* renamed from: a */
        static final /* synthetic */ int[] f51992a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                jd.h[] r0 = p472jd.C15751h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f51992a = r0
                jd.h r1 = p472jd.C15751h.OFF     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f51992a     // Catch:{ NoSuchFieldError -> 0x001d }
                jd.h r1 = p472jd.C15751h.DRAW_3X3     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f51992a     // Catch:{ NoSuchFieldError -> 0x0028 }
                jd.h r1 = p472jd.C15751h.DRAW_PHI     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f51992a     // Catch:{ NoSuchFieldError -> 0x0033 }
                jd.h r1 = p472jd.C15751h.DRAW_4X4     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p651wd.C18506f.C18507a.<clinit>():void");
        }
    }

    public C18506f(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private float m62999a(int i) {
        int lineCount = getLineCount();
        if (this.f51987d != C15751h.DRAW_PHI) {
            return (1.0f / ((float) (lineCount + 1))) * (((float) i) + 1.0f);
        }
        if (i == 1) {
            return 0.38196602f;
        }
        return 0.618034f;
    }

    private int getLineCount() {
        int i = C18507a.f51992a[this.f51987d.ordinal()];
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 0 : 3;
    }

    public int getGridColor() {
        return this.f51988e;
    }

    public C15751h getGridMode() {
        return this.f51987d;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int lineCount = getLineCount();
        for (int i = 0; i < lineCount; i++) {
            float a = m62999a(i);
            canvas.translate(Utils.FLOAT_EPSILON, ((float) getHeight()) * a);
            this.f51989f.draw(canvas);
            float f = -a;
            canvas.translate(Utils.FLOAT_EPSILON, ((float) getHeight()) * f);
            canvas.translate(a * ((float) getWidth()), Utils.FLOAT_EPSILON);
            this.f51990g.draw(canvas);
            canvas.translate(f * ((float) getWidth()), Utils.FLOAT_EPSILON);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f51989f.setBounds(i, 0, i3, (int) this.f51991h);
        this.f51990g.setBounds(0, i2, (int) this.f51991h, i4);
    }

    public void setGridColor(int i) {
        this.f51988e = i;
        this.f51989f.setColor(i);
        this.f51990g.setColor(i);
        postInvalidate();
    }

    public void setGridMode(C15751h hVar) {
        this.f51987d = hVar;
        postInvalidate();
    }

    public C18506f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51988e = f51986i;
        this.f51989f = new ColorDrawable(this.f51988e);
        this.f51990g = new ColorDrawable(this.f51988e);
        this.f51991h = TypedValue.applyDimension(1, 0.9f, context.getResources().getDisplayMetrics());
    }
}
