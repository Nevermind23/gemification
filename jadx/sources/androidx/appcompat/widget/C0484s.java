package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p030c.C2210a;

/* renamed from: androidx.appcompat.widget.s */
public class C0484s extends RatingBar {

    /* renamed from: d */
    private final C0477q f2211d;

    public C0484s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6437H);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f2211d.mo2292b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C0484s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0470n1.m1922a(this, getContext());
        C0477q qVar = new C0477q(this);
        this.f2211d = qVar;
        qVar.mo2293c(attributeSet, i);
    }
}
