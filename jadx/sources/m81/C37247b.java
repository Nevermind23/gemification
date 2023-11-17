package m81;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import g91.C32290b1;

/* renamed from: m81.b */
public class C37247b extends Animation {

    /* renamed from: d */
    private final float f89667d;

    /* renamed from: e */
    private final float f89668e;

    /* renamed from: f */
    private final View f89669f;

    public C37247b(View view, float f, float f2) {
        this.f89667d = f;
        this.f89668e = f2 - f;
        this.f89669f = view;
        setDuration(200);
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        C32290b1.m95125o(this.f89669f, this.f89667d + (this.f89668e * f));
    }

    public boolean willChangeBounds() {
        return true;
    }
}
