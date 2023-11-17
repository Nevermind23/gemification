package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p214q.C7800a;
import p214q.C7806e;

public class Barrier extends C0626b {

    /* renamed from: m */
    private int f2486m;

    /* renamed from: n */
    private int f2487n;

    /* renamed from: o */
    private C7800a f2488o;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: p */
    private void m2381p(C7806e eVar, int i, boolean z) {
        this.f2487n = i;
        if (z) {
            int i2 = this.f2486m;
            if (i2 == 5) {
                this.f2487n = 1;
            } else if (i2 == 6) {
                this.f2487n = 0;
            }
        } else {
            int i3 = this.f2486m;
            if (i3 == 5) {
                this.f2487n = 0;
            } else if (i3 == 6) {
                this.f2487n = 1;
            }
        }
        if (eVar instanceof C7800a) {
            ((C7800a) eVar).mo22566w1(this.f2487n);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f2488o.mo22559q1();
    }

    public int getMargin() {
        return this.f2488o.mo22561s1();
    }

    public int getType() {
        return this.f2486m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo2849i(AttributeSet attributeSet) {
        super.mo2849i(attributeSet);
        this.f2488o = new C7800a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0639g.f3081n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0639g.f3139u1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0639g.f3131t1) {
                    this.f2488o.mo22565v1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0639g.f3147v1) {
                    this.f2488o.mo22567x1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2599g = this.f2488o;
        mo2925o();
    }

    /* renamed from: j */
    public void mo2850j(C7806e eVar, boolean z) {
        m2381p(eVar, this.f2486m, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2488o.mo22565v1(z);
    }

    public void setDpMargin(int i) {
        C7800a aVar = this.f2488o;
        aVar.mo22567x1((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f2488o.mo22567x1(i);
    }

    public void setType(int i) {
        this.f2486m = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
