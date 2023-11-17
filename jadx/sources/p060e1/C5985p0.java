package p060e1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: e1.p0 */
abstract class C5985p0 {

    /* renamed from: a */
    private static final boolean f18711a = true;

    /* renamed from: b */
    private static final boolean f18712b = true;

    /* renamed from: c */
    private static final boolean f18713c;

    /* renamed from: e1.p0$a */
    static class C5986a implements TypeEvaluator {

        /* renamed from: a */
        final float[] f18714a = new float[9];

        /* renamed from: b */
        final float[] f18715b = new float[9];

        /* renamed from: c */
        final Matrix f18716c = new Matrix();

        C5986a() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f18714a);
            matrix2.getValues(this.f18715b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f18715b;
                float f2 = fArr[i];
                float f3 = this.f18714a[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.f18716c.setValues(this.f18715b);
            return this.f18716c;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i < 28) {
            z = false;
        }
        f18713c = z;
    }

    /* renamed from: a */
    static View m24054a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        C5887a1.m23693j(view, matrix);
        C5887a1.m23694k(viewGroup, matrix);
        RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b = m24055b(view, matrix, rectF, viewGroup);
        if (b != null) {
            imageView.setImageBitmap(b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* renamed from: b */
    private static Bitmap m24055b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z;
        boolean z2;
        int i;
        ViewGroup viewGroup2;
        if (f18711a) {
            z2 = !view.isAttachedToWindow();
            if (viewGroup == null) {
                z = false;
            } else {
                z = viewGroup.isAttachedToWindow();
            }
        } else {
            z2 = false;
            z = false;
        }
        boolean z3 = f18712b;
        Bitmap bitmap = null;
        if (!z3 || !z2) {
            i = 0;
            viewGroup2 = null;
        } else if (!z) {
            return null;
        } else {
            viewGroup2 = (ViewGroup) view.getParent();
            i = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
            int round3 = Math.round(((float) round) * min);
            int round4 = Math.round(((float) round2) * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f18713c) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z3 && z2) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i);
        }
        return bitmap;
    }

    /* renamed from: c */
    static Animator m24056c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        return animatorSet;
    }
}
