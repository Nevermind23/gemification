package p341ge.bog.designsystem.components.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.common.CropImageView */
public final class CropImageView extends AppCompatImageView {

    /* renamed from: f */
    public static final C13253a f39151f = new C13253a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private float f39152d;

    /* renamed from: e */
    private float f39153e;

    /* renamed from: ge.bog.designsystem.components.common.CropImageView$a */
    public static final class C13253a {
        private C13253a() {
        }

        public /* synthetic */ C13253a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.common.CropImageView$b */
    private enum C13254b {
        CENTER_CROP(0),
        START_CROP(1),
        END_CROP(2),
        TOP_CROP(3),
        BOTTOM_CROP(4);
        

        /* renamed from: d */
        private final int f39160d;

        private C13254b(int i) {
            this.f39160d = i;
        }

        /* renamed from: b */
        public final int mo35310b() {
            return this.f39160d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.common.CropImageView$c */
    public /* synthetic */ class C13255c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39161a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ge.bog.designsystem.components.common.CropImageView$b[] r0 = p341ge.bog.designsystem.components.common.CropImageView.C13254b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.common.CropImageView$b r1 = p341ge.bog.designsystem.components.common.CropImageView.C13254b.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.designsystem.components.common.CropImageView$b r1 = p341ge.bog.designsystem.components.common.CropImageView.C13254b.START_CROP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.designsystem.components.common.CropImageView$b r1 = p341ge.bog.designsystem.components.common.CropImageView.C13254b.END_CROP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ge.bog.designsystem.components.common.CropImageView$b r1 = p341ge.bog.designsystem.components.common.CropImageView.C13254b.TOP_CROP     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ge.bog.designsystem.components.common.CropImageView$b r1 = p341ge.bog.designsystem.components.common.CropImageView.C13254b.BOTTOM_CROP     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f39161a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.common.CropImageView.C13255c.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f39152d = 0.5f;
        this.f39153e = 0.5f;
        setScaleType(ImageView.ScaleType.MATRIX);
        m49876h(attributeSet);
    }

    /* renamed from: c */
    private final void m49874c() {
        int i;
        int i2;
        float f;
        float f2;
        Matrix imageMatrix = getImageMatrix();
        C41536l.m120488h(imageMatrix, "imageMatrix");
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (getDrawable() != null) {
            i2 = getDrawable().getIntrinsicWidth();
            i = getDrawable().getIntrinsicHeight();
        } else {
            i2 = 0;
            i = 0;
        }
        if (i2 * height > i * width) {
            f2 = (float) height;
            f = (float) i;
        } else {
            f2 = (float) width;
            f = (float) i2;
        }
        float f3 = f2 / f;
        float f4 = (float) width;
        float f5 = f4 / f3;
        float f6 = (float) height;
        float f7 = f6 / f3;
        float f8 = this.f39152d * (((float) i2) - f5);
        float f9 = this.f39153e * (((float) i) - f7);
        imageMatrix.setRectToRect(new RectF(f8, f9, f5 + f8, f7 + f9), new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f4, f6), Matrix.ScaleToFit.FILL);
        setImageMatrix(imageMatrix);
    }

    /* renamed from: g */
    private final C13254b m49875g(int i) {
        C13254b bVar = C13254b.START_CROP;
        if (i == bVar.mo35310b()) {
            return bVar;
        }
        C13254b bVar2 = C13254b.END_CROP;
        if (i == bVar2.mo35310b()) {
            return bVar2;
        }
        C13254b bVar3 = C13254b.TOP_CROP;
        if (i == bVar3.mo35310b()) {
            return bVar3;
        }
        C13254b bVar4 = C13254b.BOTTOM_CROP;
        if (i == bVar4.mo35310b()) {
            return bVar4;
        }
        return C13254b.CENTER_CROP;
    }

    /* renamed from: h */
    private final void m49876h(AttributeSet attributeSet) {
        Context context = getContext();
        C41536l.m120488h(context, "context");
        int[] iArr = C17787l.f49979J3;
        C41536l.m120488h(iArr, "CropImageView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i = C13255c.f39161a[m49875g(obtainStyledAttributes.getInt(C17787l.f49994K3, C13254b.CENTER_CROP.mo35310b())).ordinal()];
        if (i == 1) {
            mo35303e();
        } else if (i == 2) {
            mo35306j();
        } else if (i == 3) {
            mo35304f();
        } else if (i == 4) {
            mo35307k();
        } else if (i == 5) {
            mo35302d();
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void mo35302d() {
        mo35305i(0.5f, 1.0f);
    }

    /* renamed from: e */
    public final void mo35303e() {
        mo35305i(0.5f, 0.5f);
    }

    /* renamed from: f */
    public final void mo35304f() {
        mo35305i(1.0f, 0.5f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35305i(float r4, float r5) {
        /*
            r3 = this;
            float r0 = r3.f39152d
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x0019
            float r2 = r3.f39153e
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0019
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0019
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x0024
            r3.f39152d = r4
            r3.f39153e = r5
            r3.m49874c()
            return
        L_0x0024:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Offset values must be a float between 0.0 and 1.0"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.common.CropImageView.mo35305i(float, float):void");
    }

    /* renamed from: j */
    public final void mo35306j() {
        mo35305i(Utils.FLOAT_EPSILON, 0.5f);
    }

    /* renamed from: k */
    public final void mo35307k() {
        mo35305i(0.5f, Utils.FLOAT_EPSILON);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m49874c();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m49874c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C41536l.m120489i(context, "context");
    }
}
