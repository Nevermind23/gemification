package p129j5;

import android.widget.ImageView;

/* renamed from: j5.l */
abstract class C6723l {

    /* renamed from: j5.l$a */
    static /* synthetic */ class C6724a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20296a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f20296a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    static void m26240a(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        } else if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: b */
    static int m26241b(int i) {
        return (i & 65280) >> 8;
    }

    /* renamed from: c */
    static boolean m26242c(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    /* renamed from: d */
    static boolean m26243d(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (C6724a.f20296a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }
}
