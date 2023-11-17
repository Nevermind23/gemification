package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.C0264b;
import p030c.C2219j;

/* renamed from: androidx.appcompat.app.a */
public abstract class C0209a {
    /* renamed from: A */
    public abstract void mo550A(CharSequence charSequence);

    /* renamed from: B */
    public abstract void mo551B(CharSequence charSequence);

    /* renamed from: C */
    public C0264b mo552C(C0264b.C0265a aVar) {
        return null;
    }

    /* renamed from: g */
    public boolean mo553g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo554h();

    /* renamed from: i */
    public abstract void mo555i(boolean z);

    /* renamed from: j */
    public abstract int mo556j();

    /* renamed from: k */
    public abstract Context mo557k();

    /* renamed from: l */
    public boolean mo558l() {
        return false;
    }

    /* renamed from: m */
    public void mo559m(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo560n() {
    }

    /* renamed from: o */
    public abstract boolean mo561o(int i, KeyEvent keyEvent);

    /* renamed from: p */
    public boolean mo562p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo563q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo564r(boolean z);

    /* renamed from: s */
    public abstract void mo565s(boolean z);

    /* renamed from: t */
    public abstract void mo566t(boolean z);

    /* renamed from: u */
    public abstract void mo567u(int i);

    /* renamed from: v */
    public abstract void mo568v(CharSequence charSequence);

    /* renamed from: w */
    public abstract void mo569w(int i);

    /* renamed from: x */
    public abstract void mo570x(Drawable drawable);

    /* renamed from: y */
    public abstract void mo571y(boolean z);

    /* renamed from: z */
    public abstract void mo572z(int i);

    /* renamed from: androidx.appcompat.app.a$a */
    public static class C0210a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1283a = 8388627;

        public C0210a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2219j.f6845t);
            this.f1283a = obtainStyledAttributes.getInt(C2219j.f6850u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0210a(int i, int i2) {
            super(i, i2);
        }

        public C0210a(C0210a aVar) {
            super(aVar);
            this.f1283a = aVar.f1283a;
        }

        public C0210a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
