package l81;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.bumptech.glide.load.resource.bitmap.C2506h;
import com.github.mikephil.charting.utils.Utils;
import java.security.MessageDigest;
import p205p3.C7676d;

/* renamed from: l81.e */
public class C37108e extends C2506h {

    /* renamed from: b */
    private int f89289b;

    public C37108e(int i) {
        this.f89289b = i;
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        messageDigest.update(("ColorFilterTransformation(color=" + this.f89289b + ")").getBytes());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo8005c(C7676d dVar, Bitmap bitmap, int i, int i2) {
        Bitmap.Config config;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap d = dVar.mo22395d(width, height, config);
        Canvas canvas = new Canvas(d);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(new PorterDuffColorFilter(this.f89289b, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, paint);
        return d;
    }
}
