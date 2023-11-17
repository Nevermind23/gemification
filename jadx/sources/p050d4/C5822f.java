package p050d4;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p063e4.C6032d;

/* renamed from: d4.f */
public abstract class C5822f extends C5826j implements C6032d.C6033a {

    /* renamed from: k */
    private Animatable f18322k;

    public C5822f(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: q */
    private void m23454q(Object obj) {
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f18322k = animatable;
            animatable.start();
            return;
        }
        this.f18322k = null;
    }

    /* renamed from: s */
    private void m23455s(Object obj) {
        mo19037r(obj);
        m23454q(obj);
    }

    /* renamed from: b */
    public void mo7276b(Object obj, C6032d dVar) {
        if (dVar == null || !dVar.mo19524a(obj, this)) {
            m23455s(obj);
        } else {
            m23454q(obj);
        }
    }

    /* renamed from: c */
    public void mo19047c(Drawable drawable) {
        ((ImageView) this.f18325d).setImageDrawable(drawable);
    }

    /* renamed from: e */
    public Drawable mo19048e() {
        return ((ImageView) this.f18325d).getDrawable();
    }

    /* renamed from: f */
    public void mo7279f() {
        Animatable animatable = this.f18322k;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: g */
    public void mo7280g(Drawable drawable) {
        super.mo7280g(drawable);
        m23455s((Object) null);
        mo19047c(drawable);
    }

    /* renamed from: i */
    public void mo7284i(Drawable drawable) {
        super.mo7284i(drawable);
        Animatable animatable = this.f18322k;
        if (animatable != null) {
            animatable.stop();
        }
        m23455s((Object) null);
        mo19047c(drawable);
    }

    /* renamed from: k */
    public void mo7288k(Drawable drawable) {
        super.mo7288k(drawable);
        m23455s((Object) null);
        mo19047c(drawable);
    }

    /* renamed from: o */
    public void mo7289o() {
        Animatable animatable = this.f18322k;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo19037r(Object obj);
}
