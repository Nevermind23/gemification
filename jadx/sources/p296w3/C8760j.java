package p296w3;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p089g4.C6223k;
import p192o3.C7429b;
import p192o3.C7430c;
import p321y3.C9046c;

/* renamed from: w3.j */
public abstract class C8760j implements C7430c, C7429b {

    /* renamed from: d */
    protected final Drawable f24612d;

    public C8760j(Drawable drawable) {
        this.f24612d = (Drawable) C6223k.m24730d(drawable);
    }

    /* renamed from: b */
    public void mo7985b() {
        Drawable drawable = this.f24612d;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C9046c) {
            ((C9046c) drawable).mo24537e().prepareToDraw();
        }
    }

    /* renamed from: c */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f24612d.getConstantState();
        if (constantState == null) {
            return this.f24612d;
        }
        return constantState.newDrawable();
    }
}
