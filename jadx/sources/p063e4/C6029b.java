package p063e4;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import p063e4.C6032d;

/* renamed from: e4.b */
public class C6029b implements C6032d {

    /* renamed from: a */
    private final int f18816a;

    /* renamed from: b */
    private final boolean f18817b;

    public C6029b(int i, boolean z) {
        this.f18816a = i;
        this.f18817b = z;
    }

    /* renamed from: b */
    public boolean mo19524a(Drawable drawable, C6032d.C6033a aVar) {
        Drawable e = aVar.mo19048e();
        if (e == null) {
            e = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{e, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f18817b);
        transitionDrawable.startTransition(this.f18816a);
        aVar.mo19047c(transitionDrawable);
        return true;
    }
}
