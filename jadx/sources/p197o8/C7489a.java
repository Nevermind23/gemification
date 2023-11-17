package p197o8;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p223q8.C7922g;
import p223q8.C7929k;
import p223q8.C7945n;

/* renamed from: o8.a */
public class C7489a extends Drawable implements C7945n {

    /* renamed from: d */
    private C7491b f21798d;

    /* renamed from: a */
    public C7489a mutate() {
        this.f21798d = new C7491b(this.f21798d);
        return this;
    }

    public void draw(Canvas canvas) {
        C7491b bVar = this.f21798d;
        if (bVar.f21800b) {
            bVar.f21799a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f21798d;
    }

    public int getOpacity() {
        return this.f21798d.f21799a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f21798d.f21799a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f21798d.f21799a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = C7492b.m28458e(iArr);
        C7491b bVar = this.f21798d;
        if (bVar.f21800b == e) {
            return onStateChange;
        }
        bVar.f21800b = e;
        return true;
    }

    public void setAlpha(int i) {
        this.f21798d.f21799a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f21798d.f21799a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C7929k kVar) {
        this.f21798d.f21799a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i) {
        this.f21798d.f21799a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f21798d.f21799a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f21798d.f21799a.setTintMode(mode);
    }

    public C7489a(C7929k kVar) {
        this(new C7491b(new C7922g(kVar)));
    }

    /* renamed from: o8.a$b */
    static final class C7491b extends Drawable.ConstantState {

        /* renamed from: a */
        C7922g f21799a;

        /* renamed from: b */
        boolean f21800b;

        public C7491b(C7922g gVar) {
            this.f21799a = gVar;
            this.f21800b = false;
        }

        /* renamed from: a */
        public C7489a newDrawable() {
            return new C7489a(new C7491b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public C7491b(C7491b bVar) {
            this.f21799a = (C7922g) bVar.f21799a.getConstantState().newDrawable();
            this.f21800b = bVar.f21800b;
        }
    }

    private C7489a(C7491b bVar) {
        this.f21798d = bVar;
    }
}
