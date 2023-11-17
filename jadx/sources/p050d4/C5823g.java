package p050d4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: d4.g */
public class C5823g {
    /* renamed from: a */
    public C5826j mo19049a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new C5816b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C5821e(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
