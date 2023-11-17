package p184n8;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import p292w.C8720a;

/* renamed from: n8.i */
public abstract class C7351i {
    /* renamed from: a */
    public static Typeface m28038a(Context context, Typeface typeface) {
        return m28039b(context.getResources().getConfiguration(), typeface);
    }

    /* renamed from: b */
    public static Typeface m28039b(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, C8720a.m32478b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
