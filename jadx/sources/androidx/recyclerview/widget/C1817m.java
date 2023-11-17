package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.recyclerview.widget.m */
public class C1817m extends RecyclerView.C1722a0 {

    /* renamed from: i */
    protected final LinearInterpolator f5470i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f5471j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f5472k;

    /* renamed from: l */
    private final DisplayMetrics f5473l;

    /* renamed from: m */
    private boolean f5474m = false;

    /* renamed from: n */
    private float f5475n;

    /* renamed from: o */
    protected int f5476o = 0;

    /* renamed from: p */
    protected int f5477p = 0;

    public C1817m(Context context) {
        this.f5473l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m7009A() {
        if (!this.f5474m) {
            this.f5475n = mo6019v(this.f5473l);
            this.f5474m = true;
        }
        return this.f5475n;
    }

    /* renamed from: y */
    private int m7010y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo6014B() {
        PointF pointF = this.f5472k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != Utils.FLOAT_EPSILON) {
                return f > Utils.FLOAT_EPSILON ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo6015C(RecyclerView.C1722a0.C1723a aVar) {
        PointF a = mo5437a(mo5442f());
        if (a == null || (a.x == Utils.FLOAT_EPSILON && a.y == Utils.FLOAT_EPSILON)) {
            aVar.mo5456b(mo5442f());
            mo5454r();
            return;
        }
        mo5445i(a);
        this.f5472k = a;
        this.f5476o = (int) (a.x * 10000.0f);
        this.f5477p = (int) (a.y * 10000.0f);
        aVar.mo5458d((int) (((float) this.f5476o) * 1.2f), (int) (((float) this.f5477p) * 1.2f), (int) (((float) mo6021x(10000)) * 1.2f), this.f5470i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo5448l(int i, int i2, RecyclerView.C1726b0 b0Var, RecyclerView.C1722a0.C1723a aVar) {
        if (mo5439c() == 0) {
            mo5454r();
            return;
        }
        this.f5476o = m7010y(this.f5476o, i);
        int y = m7010y(this.f5477p, i2);
        this.f5477p = y;
        if (this.f5476o == 0 && y == 0) {
            mo6015C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo5449m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo5450n() {
        this.f5477p = 0;
        this.f5476o = 0;
        this.f5472k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo5451o(View view, RecyclerView.C1726b0 b0Var, RecyclerView.C1722a0.C1723a aVar) {
        int t = mo6017t(view, mo6022z());
        int u = mo6018u(view, mo6014B());
        int w = mo6020w((int) Math.sqrt((double) ((t * t) + (u * u))));
        if (w > 0) {
            aVar.mo5458d(-t, -u, w, this.f5471j);
        }
    }

    /* renamed from: s */
    public int mo6016s(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: t */
    public int mo6017t(View view, int i) {
        RecyclerView.C1747p e = mo5441e();
        if (e == null || !e.mo5226v()) {
            return 0;
        }
        RecyclerView.C1752q qVar = (RecyclerView.C1752q) view.getLayoutParams();
        return mo6016s(e.mo5671c0(view) - qVar.leftMargin, e.mo5674f0(view) + qVar.rightMargin, e.getPaddingLeft(), e.mo5716x0() - e.getPaddingRight(), i);
    }

    /* renamed from: u */
    public int mo6018u(View view, int i) {
        RecyclerView.C1747p e = mo5441e();
        if (e == null || !e.mo5227w()) {
            return 0;
        }
        RecyclerView.C1752q qVar = (RecyclerView.C1752q) view.getLayoutParams();
        return mo6016s(e.mo5675g0(view) - qVar.topMargin, e.mo5668a0(view) + qVar.bottomMargin, e.getPaddingTop(), e.mo5684i0() - e.getPaddingBottom(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public float mo6019v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo6020w(int i) {
        return (int) Math.ceil(((double) mo6021x(i)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo6021x(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m7009A()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo6022z() {
        PointF pointF = this.f5472k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != Utils.FLOAT_EPSILON) {
                return f > Utils.FLOAT_EPSILON ? 1 : -1;
            }
        }
        return 0;
    }
}
