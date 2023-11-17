package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends C0626b {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2899f(ConstraintLayout constraintLayout) {
        mo2920e(constraintLayout);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo2849i(AttributeSet attributeSet) {
        super.mo2849i(attributeSet);
        this.f2600h = false;
    }

    /* renamed from: k */
    public void mo2900k(ConstraintLayout constraintLayout) {
        ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) getLayoutParams();
        bVar.f2559v0.mo22653g1(0);
        bVar.f2559v0.mo22606I0(0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo2919d();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo2919d();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo2919d();
    }
}
