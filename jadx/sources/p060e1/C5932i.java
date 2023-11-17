package p060e1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;
import p060e1.C5985p0;

/* renamed from: e1.i */
public class C5932i extends C5936i0 {

    /* renamed from: M */
    private static final String[] f18566M = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: N */
    private static final TypeEvaluator f18567N = new C5933a();

    /* renamed from: O */
    private static final Property f18568O = new C5934b(Matrix.class, "animatedTransform");

    /* renamed from: e1.i$a */
    class C5933a implements TypeEvaluator {
        C5933a() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: e1.i$b */
    class C5934b extends Property {
        C5934b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            C6004w.m24102a(imageView, matrix);
        }
    }

    /* renamed from: e1.i$c */
    static /* synthetic */ class C5935c {

        /* renamed from: a */
        static final /* synthetic */ int[] f18569a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18569a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18569a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p060e1.C5932i.C5935c.<clinit>():void");
        }
    }

    public C5932i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: A0 */
    private void m23775A0(C5989q0 q0Var) {
        View view = q0Var.f18719b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map map = q0Var.f18718a;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put("android:changeImageTransform:matrix", m23777C0(imageView));
            }
        }
    }

    /* renamed from: B0 */
    private static Matrix m23776B0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = (float) imageView.getWidth();
        float f = (float) intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = (float) imageView.getHeight();
        float f2 = (float) intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float) round, (float) round2);
        return matrix;
    }

    /* renamed from: C0 */
    private static Matrix m23777C0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i = C5935c.f18569a[imageView.getScaleType().ordinal()];
        if (i == 1) {
            return m23780F0(imageView);
        }
        if (i != 2) {
            return new Matrix(imageView.getImageMatrix());
        }
        return m23776B0(imageView);
    }

    /* renamed from: D0 */
    private ObjectAnimator m23778D0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, f18568O, new C5985p0.C5986a(), new Matrix[]{matrix, matrix2});
    }

    /* renamed from: E0 */
    private ObjectAnimator m23779E0(ImageView imageView) {
        Property property = f18568O;
        TypeEvaluator typeEvaluator = f18567N;
        Matrix matrix = C6006x.f18753a;
        return ObjectAnimator.ofObject(imageView, property, typeEvaluator, new Matrix[]{matrix, matrix});
    }

    /* renamed from: F0 */
    private static Matrix m23780F0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    /* renamed from: V */
    public String[] mo19264V() {
        return f18566M;
    }

    /* renamed from: k */
    public void mo16526k(C5989q0 q0Var) {
        m23775A0(q0Var);
    }

    /* renamed from: n */
    public void mo16527n(C5989q0 q0Var) {
        m23775A0(q0Var);
    }

    /* renamed from: r */
    public Animator mo16528r(ViewGroup viewGroup, C5989q0 q0Var, C5989q0 q0Var2) {
        boolean z;
        if (q0Var == null || q0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) q0Var.f18718a.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) q0Var2.f18718a.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) q0Var.f18718a.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) q0Var2.f18718a.get("android:changeImageTransform:matrix");
        if (!(matrix == null && matrix2 == null) && (matrix == null || !matrix.equals(matrix2))) {
            z = false;
        } else {
            z = true;
        }
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) q0Var2.f18719b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return m23779E0(imageView);
        }
        if (matrix == null) {
            matrix = C6006x.f18753a;
        }
        if (matrix2 == null) {
            matrix2 = C6006x.f18753a;
        }
        f18568O.set(imageView, matrix);
        return m23778D0(imageView, matrix, matrix2);
    }
}
