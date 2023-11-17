package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.github.mikephil.charting.utils.Utils;
import p223q8.C7922g;
import p223q8.C7929k;

/* renamed from: com.google.android.material.textfield.i */
class C5188i extends C7922g {

    /* renamed from: C */
    private final RectF f16616C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5188i(C7929k kVar) {
        super(kVar == null ? new C7929k() : kVar);
        this.f16616C = new RectF();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public boolean mo17225k0() {
        return !this.f16616C.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo17226l0() {
        mo17227m0(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo17227m0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f16616C;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo17228n0(RectF rectF) {
        mo17227m0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo17229r(Canvas canvas) {
        if (this.f16616C.isEmpty()) {
            super.mo17229r(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            boolean unused = canvas.clipOutRect(this.f16616C);
        } else {
            canvas.clipRect(this.f16616C, Region.Op.DIFFERENCE);
        }
        super.mo17229r(canvas);
        canvas.restore();
    }
}
