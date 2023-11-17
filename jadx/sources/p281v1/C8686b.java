package p281v1;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.C2309b;
import com.airbnb.lottie.C2320e0;
import java.io.IOException;
import java.util.Map;
import p048d2.C5804f;
import p048d2.C5808j;

/* renamed from: v1.b */
public class C8686b {

    /* renamed from: d */
    private static final Object f24507d = new Object();

    /* renamed from: a */
    private final Context f24508a;

    /* renamed from: b */
    private final String f24509b;

    /* renamed from: c */
    private final Map f24510c;

    public C8686b(Drawable.Callback callback, String str, C2309b bVar, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f24509b = str;
        } else {
            this.f24509b = str + '/';
        }
        this.f24510c = map;
        mo24063d(bVar);
        if (!(callback instanceof View)) {
            this.f24508a = null;
        } else {
            this.f24508a = ((View) callback).getContext().getApplicationContext();
        }
    }

    /* renamed from: c */
    private Bitmap m32410c(String str, Bitmap bitmap) {
        synchronized (f24507d) {
            ((C2320e0) this.f24510c.get(str)).mo7536f(bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap mo24061a(String str) {
        C2320e0 e0Var = (C2320e0) this.f24510c.get(str);
        if (e0Var == null) {
            return null;
        }
        Bitmap a = e0Var.mo7531a();
        if (a != null) {
            return a;
        }
        Context context = this.f24508a;
        if (context == null) {
            return null;
        }
        String b = e0Var.mo7532b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b.startsWith("data:") || b.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f24509b)) {
                    AssetManager assets = context.getAssets();
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(assets.open(this.f24509b + b), (Rect) null, options);
                        if (decodeStream != null) {
                            return m32410c(str, C5808j.m23384l(decodeStream, e0Var.mo7535e(), e0Var.mo7533c()));
                        }
                        C5804f.m23334c("Decoded image `" + str + "` is null.");
                        return null;
                    } catch (IllegalArgumentException e) {
                        C5804f.m23335d("Unable to decode image `" + str + "`.", e);
                        return null;
                    }
                } else {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e2) {
                C5804f.m23335d("Unable to open asset.", e2);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                return m32410c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e3) {
                C5804f.m23335d("data URL did not have correct base64 format.", e3);
                return null;
            }
        }
    }

    /* renamed from: b */
    public boolean mo24062b(Context context) {
        return (context == null && this.f24508a == null) || this.f24508a.equals(context);
    }

    /* renamed from: d */
    public void mo24063d(C2309b bVar) {
    }
}
