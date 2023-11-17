package com.theartofdev.edmodo.cropper;

import android.graphics.RectF;
import com.theartofdev.edmodo.cropper.C11870f;
import com.theartofdev.edmodo.cropper.CropImageView;

/* renamed from: com.theartofdev.edmodo.cropper.e */
final class C11869e {

    /* renamed from: a */
    private final RectF f34648a = new RectF();

    /* renamed from: b */
    private final RectF f34649b = new RectF();

    /* renamed from: c */
    private float f34650c;

    /* renamed from: d */
    private float f34651d;

    /* renamed from: e */
    private float f34652e;

    /* renamed from: f */
    private float f34653f;

    /* renamed from: g */
    private float f34654g;

    /* renamed from: h */
    private float f34655h;

    /* renamed from: i */
    private float f34656i;

    /* renamed from: j */
    private float f34657j;

    /* renamed from: k */
    private float f34658k = 1.0f;

    /* renamed from: l */
    private float f34659l = 1.0f;

    C11869e() {
    }

    /* renamed from: a */
    private boolean m43479a() {
        return !mo31881s();
    }

    /* renamed from: g */
    private C11870f.C11872b m43480g(float f, float f2) {
        float width = this.f34648a.width() / 6.0f;
        RectF rectF = this.f34648a;
        float f3 = rectF.left;
        float f4 = f3 + width;
        float f5 = f3 + (width * 5.0f);
        float height = rectF.height() / 6.0f;
        float f6 = this.f34648a.top;
        float f7 = f6 + height;
        float f8 = f6 + (height * 5.0f);
        if (f < f4) {
            if (f2 < f7) {
                return C11870f.C11872b.TOP_LEFT;
            }
            if (f2 < f8) {
                return C11870f.C11872b.LEFT;
            }
            return C11870f.C11872b.BOTTOM_LEFT;
        } else if (f < f5) {
            if (f2 < f7) {
                return C11870f.C11872b.TOP;
            }
            if (f2 < f8) {
                return C11870f.C11872b.CENTER;
            }
            return C11870f.C11872b.BOTTOM;
        } else if (f2 < f7) {
            return C11870f.C11872b.TOP_RIGHT;
        } else {
            if (f2 < f8) {
                return C11870f.C11872b.RIGHT;
            }
            return C11870f.C11872b.BOTTOM_RIGHT;
        }
    }

    /* renamed from: i */
    private C11870f.C11872b m43481i(float f, float f2, float f3) {
        RectF rectF = this.f34648a;
        if (m43483m(f, f2, rectF.left, rectF.top, f3)) {
            return C11870f.C11872b.TOP_LEFT;
        }
        RectF rectF2 = this.f34648a;
        if (m43483m(f, f2, rectF2.right, rectF2.top, f3)) {
            return C11870f.C11872b.TOP_RIGHT;
        }
        RectF rectF3 = this.f34648a;
        if (m43483m(f, f2, rectF3.left, rectF3.bottom, f3)) {
            return C11870f.C11872b.BOTTOM_LEFT;
        }
        RectF rectF4 = this.f34648a;
        if (m43483m(f, f2, rectF4.right, rectF4.bottom, f3)) {
            return C11870f.C11872b.BOTTOM_RIGHT;
        }
        RectF rectF5 = this.f34648a;
        if (m43482l(f, f2, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom) && m43479a()) {
            return C11870f.C11872b.CENTER;
        }
        RectF rectF6 = this.f34648a;
        if (m43484n(f, f2, rectF6.left, rectF6.right, rectF6.top, f3)) {
            return C11870f.C11872b.TOP;
        }
        RectF rectF7 = this.f34648a;
        if (m43484n(f, f2, rectF7.left, rectF7.right, rectF7.bottom, f3)) {
            return C11870f.C11872b.BOTTOM;
        }
        RectF rectF8 = this.f34648a;
        if (m43485o(f, f2, rectF8.left, rectF8.top, rectF8.bottom, f3)) {
            return C11870f.C11872b.LEFT;
        }
        RectF rectF9 = this.f34648a;
        if (m43485o(f, f2, rectF9.right, rectF9.top, rectF9.bottom, f3)) {
            return C11870f.C11872b.RIGHT;
        }
        RectF rectF10 = this.f34648a;
        if (!m43482l(f, f2, rectF10.left, rectF10.top, rectF10.right, rectF10.bottom) || m43479a()) {
            return null;
        }
        return C11870f.C11872b.CENTER;
    }

    /* renamed from: l */
    private static boolean m43482l(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f5 && f2 > f4 && f2 < f6;
    }

    /* renamed from: m */
    private static boolean m43483m(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f3) <= f5 && Math.abs(f2 - f4) <= f5;
    }

    /* renamed from: n */
    private static boolean m43484n(float f, float f2, float f3, float f4, float f5, float f6) {
        return f > f3 && f < f4 && Math.abs(f2 - f5) <= f6;
    }

    /* renamed from: o */
    private static boolean m43485o(float f, float f2, float f3, float f4, float f5, float f6) {
        return Math.abs(f - f3) <= f6 && f2 > f4 && f2 < f5;
    }

    /* renamed from: b */
    public float mo31870b() {
        return Math.min(this.f34653f, this.f34657j / this.f34659l);
    }

    /* renamed from: c */
    public float mo31871c() {
        return Math.min(this.f34652e, this.f34656i / this.f34658k);
    }

    /* renamed from: d */
    public float mo31872d() {
        return Math.max(this.f34651d, this.f34655h / this.f34659l);
    }

    /* renamed from: e */
    public float mo31873e() {
        return Math.max(this.f34650c, this.f34654g / this.f34658k);
    }

    /* renamed from: f */
    public C11870f mo31874f(float f, float f2, float f3, CropImageView.C11849c cVar) {
        C11870f.C11872b bVar;
        if (cVar == CropImageView.C11849c.OVAL) {
            bVar = m43480g(f, f2);
        } else {
            bVar = m43481i(f, f2, f3);
        }
        if (bVar != null) {
            return new C11870f(bVar, this, f, f2);
        }
        return null;
    }

    /* renamed from: h */
    public RectF mo31875h() {
        this.f34649b.set(this.f34648a);
        return this.f34649b;
    }

    /* renamed from: j */
    public float mo31876j() {
        return this.f34659l;
    }

    /* renamed from: k */
    public float mo31877k() {
        return this.f34658k;
    }

    /* renamed from: p */
    public void mo31878p(float f, float f2, float f3, float f4) {
        this.f34652e = f;
        this.f34653f = f2;
        this.f34658k = f3;
        this.f34659l = f4;
    }

    /* renamed from: q */
    public void mo31879q(CropImageOptions cropImageOptions) {
        this.f34650c = (float) cropImageOptions.f34451A;
        this.f34651d = (float) cropImageOptions.f34452B;
        this.f34654g = (float) cropImageOptions.f34453C;
        this.f34655h = (float) cropImageOptions.f34454D;
        this.f34656i = (float) cropImageOptions.f34455E;
        this.f34657j = (float) cropImageOptions.f34456F;
    }

    /* renamed from: r */
    public void mo31880r(RectF rectF) {
        this.f34648a.set(rectF);
    }

    /* renamed from: s */
    public boolean mo31881s() {
        return this.f34648a.width() >= 100.0f && this.f34648a.height() >= 100.0f;
    }
}
