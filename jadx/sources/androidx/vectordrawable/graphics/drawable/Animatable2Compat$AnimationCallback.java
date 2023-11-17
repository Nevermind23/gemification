package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

public abstract class Animatable2Compat$AnimationCallback {
    Animatable2.AnimationCallback mPlatformCallback;

    /* renamed from: androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$a */
    class C1869a extends Animatable2.AnimationCallback {
        C1869a() {
        }

        public void onAnimationEnd(Drawable drawable) {
            Animatable2Compat$AnimationCallback.this.onAnimationEnd(drawable);
        }

        public void onAnimationStart(Drawable drawable) {
            Animatable2Compat$AnimationCallback.this.onAnimationStart(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public Animatable2.AnimationCallback getPlatformCallback() {
        if (this.mPlatformCallback == null) {
            this.mPlatformCallback = new C1869a();
        }
        return this.mPlatformCallback;
    }

    public void onAnimationEnd(Drawable drawable) {
    }

    public void onAnimationStart(Drawable drawable) {
    }
}
