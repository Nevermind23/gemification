package m81;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: m81.a */
public class C37246a extends Animation {

    /* renamed from: d */
    private int f89664d;

    /* renamed from: e */
    private int f89665e = -1;

    /* renamed from: f */
    private View f89666f;

    public C37246a(View view, int i) {
        this.f89666f = view;
        this.f89664d = i;
        setDuration(150);
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        if (this.f89665e < 0) {
            this.f89665e = this.f89666f.getHeight();
            this.f89666f.getLayoutParams().height = this.f89665e;
        }
        ViewGroup.LayoutParams layoutParams = this.f89666f.getLayoutParams();
        int i = this.f89665e;
        layoutParams.height = i + ((int) (((float) (this.f89664d - i)) * f));
        this.f89666f.requestLayout();
    }

    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
    }

    public boolean willChangeBounds() {
        return true;
    }
}
