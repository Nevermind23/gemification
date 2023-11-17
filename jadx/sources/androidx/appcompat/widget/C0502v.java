package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p030c.C2210a;

/* renamed from: androidx.appcompat.widget.v */
public class C0502v extends SeekBar {

    /* renamed from: d */
    private final C0507w f2243d;

    public C0502v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6439J);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f2243d.mo2359h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f2243d.mo2360i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2243d.mo2358g(canvas);
    }

    public C0502v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0470n1.m1922a(this, getContext());
        C0507w wVar = new C0507w(this);
        this.f2243d = wVar;
        wVar.mo2293c(attributeSet, i);
    }
}
