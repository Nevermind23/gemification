package l81;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0767a;
import com.bumptech.glide.load.resource.bitmap.C2506h;
import com.github.mikephil.charting.utils.Utils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import p205p3.C7676d;

/* renamed from: l81.g */
public class C37111g extends C2506h {

    /* renamed from: d */
    private static Paint f89299d = new Paint();

    /* renamed from: e */
    private static String f89300e = "UTF-8";

    /* renamed from: f */
    private static Charset f89301f = Charset.forName("UTF-8");

    /* renamed from: b */
    private Drawable f89302b;

    /* renamed from: c */
    private int f89303c;

    static {
        f89299d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public C37111g(Context context, int i) {
        this.f89302b = C0767a.m2895e(context, i);
        this.f89303c = i;
    }

    /* renamed from: d */
    private byte[] m109705d() {
        return ("MaskTransformation(maskId=" + this.f89303c + ")").getBytes();
    }

    /* renamed from: b */
    public void mo7845b(MessageDigest messageDigest) {
        messageDigest.update(m109705d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo8005c(C7676d dVar, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap d = dVar.mo22395d(width, height, Bitmap.Config.ARGB_8888);
        d.setHasAlpha(true);
        Canvas canvas = new Canvas(d);
        this.f89302b.setBounds(0, 0, width, height);
        this.f89302b.draw(canvas);
        canvas.drawBitmap(bitmap, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f89299d);
        return d;
    }
}
