package p060e1;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: e1.w */
abstract class C6004w {

    /* renamed from: a */
    private static boolean f18752a = true;

    /* renamed from: a */
    static void m24102a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else {
            m24103b(imageView, matrix);
        }
    }

    /* renamed from: b */
    private static void m24103b(ImageView imageView, Matrix matrix) {
        if (f18752a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f18752a = false;
            }
        }
    }
}
