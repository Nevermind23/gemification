package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p030c.C2210a;

public class AppCompatImageButton extends ImageButton {

    /* renamed from: d */
    private final C0414d f1809d;

    /* renamed from: e */
    private final C0468n f1810e;

    /* renamed from: f */
    private boolean f1811f;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6431B);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0414d dVar = this.f1809d;
        if (dVar != null) {
            dVar.mo2019b();
        }
        C0468n nVar = this.f1810e;
        if (nVar != null) {
            nVar.mo2223c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0414d dVar = this.f1809d;
        if (dVar != null) {
            return dVar.mo2020c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0414d dVar = this.f1809d;
        if (dVar != null) {
            return dVar.mo2021d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0468n nVar = this.f1810e;
        if (nVar != null) {
            return nVar.mo2224d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0468n nVar = this.f1810e;
        if (nVar != null) {
            return nVar.mo2225e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1810e.mo2226f() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0414d dVar = this.f1809d;
        if (dVar != null) {
            dVar.mo2023f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0414d dVar = this.f1809d;
        if (dVar != null) {
            dVar.mo2024g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0468n nVar = this.f1810e;
        if (nVar != null) {
            nVar.mo2223c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C0468n nVar = this.f1810e;
        if (!(nVar == null || drawable == null || this.f1811f)) {
            nVar.mo2228h(drawable);
        }
        super.setImageDrawable(drawable);
        C0468n nVar2 = this.f1810e;
        if (nVar2 != null) {
            nVar2.mo2223c();
            if (!this.f1811f) {
                this.f1810e.mo2222b();
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1811f = true;
    }

    public void setImageResource(int i) {
        this.f1810e.mo2229i(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0468n nVar = this.f1810e;
        if (nVar != null) {
            nVar.mo2223c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0414d dVar = this.f1809d;
        if (dVar != null) {
            dVar.mo2026i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0414d dVar = this.f1809d;
        if (dVar != null) {
            dVar.mo2027j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0468n nVar = this.f1810e;
        if (nVar != null) {
            nVar.mo2230j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0468n nVar = this.f1810e;
        if (nVar != null) {
            nVar.mo2231k(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(C0473o1.m1931b(context), attributeSet, i);
        this.f1811f = false;
        C0470n1.m1922a(this, getContext());
        C0414d dVar = new C0414d(this);
        this.f1809d = dVar;
        dVar.mo2022e(attributeSet, i);
        C0468n nVar = new C0468n(this);
        this.f1810e = nVar;
        nVar.mo2227g(attributeSet, i);
    }
}
