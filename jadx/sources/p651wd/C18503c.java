package p651wd;

import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;

/* renamed from: wd.c */
public abstract class C18503c {
    /* renamed from: a */
    public static int m62990a(int i) {
        int i2 = (i + 360) % 360;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 90) {
            return 6;
        }
        if (i2 == 180) {
            return 3;
        }
        if (i2 == 270) {
            return 8;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i);
    }

    /* renamed from: b */
    public static int m62991b(int i) {
        switch (i) {
            case 3:
            case 4:
                return SubsamplingScaleImageView.ORIENTATION_180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return SubsamplingScaleImageView.ORIENTATION_270;
            default:
                return 0;
        }
    }
}
