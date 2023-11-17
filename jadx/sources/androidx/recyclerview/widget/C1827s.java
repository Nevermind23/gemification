package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.recyclerview.widget.s */
public class C1827s extends C1833w {

    /* renamed from: d */
    private C1824r f5487d;

    /* renamed from: e */
    private C1824r f5488e;

    /* renamed from: androidx.recyclerview.widget.s$a */
    class C1828a extends C1817m {
        C1828a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo5451o(View view, RecyclerView.C1726b0 b0Var, RecyclerView.C1722a0.C1723a aVar) {
            C1827s sVar = C1827s.this;
            int[] c = sVar.mo6023c(sVar.f5495a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int w = mo6020w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w > 0) {
                aVar.mo5458d(i, i2, w, this.f5471j);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo6019v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public int mo6021x(int i) {
            return Math.min(100, super.mo6021x(i));
        }
    }

    /* renamed from: m */
    private int m7099m(View view, C1824r rVar) {
        return (rVar.mo6037g(view) + (rVar.mo6035e(view) / 2)) - (rVar.mo6044n() + (rVar.mo6045o() / 2));
    }

    /* renamed from: n */
    private View m7100n(RecyclerView.C1747p pVar, C1824r rVar) {
        int V = pVar.mo5660V();
        View view = null;
        if (V == 0) {
            return null;
        }
        int n = rVar.mo6044n() + (rVar.mo6045o() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < V; i2++) {
            View U = pVar.mo5658U(i2);
            int abs = Math.abs((rVar.mo6037g(U) + (rVar.mo6035e(U) / 2)) - n);
            if (abs < i) {
                view = U;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: o */
    private C1824r m7101o(RecyclerView.C1747p pVar) {
        C1824r rVar = this.f5488e;
        if (rVar == null || rVar.f5484a != pVar) {
            this.f5488e = C1824r.m7051a(pVar);
        }
        return this.f5488e;
    }

    /* renamed from: p */
    private C1824r m7102p(RecyclerView.C1747p pVar) {
        if (pVar.mo5227w()) {
            return m7103q(pVar);
        }
        if (pVar.mo5226v()) {
            return m7101o(pVar);
        }
        return null;
    }

    /* renamed from: q */
    private C1824r m7103q(RecyclerView.C1747p pVar) {
        C1824r rVar = this.f5487d;
        if (rVar == null || rVar.f5484a != pVar) {
            this.f5487d = C1824r.m7053c(pVar);
        }
        return this.f5487d;
    }

    /* renamed from: r */
    private boolean m7104r(RecyclerView.C1747p pVar, int i, int i2) {
        return pVar.mo5226v() ? i > 0 : i2 > 0;
    }

    /* renamed from: s */
    private boolean m7105s(RecyclerView.C1747p pVar) {
        PointF a;
        int k0 = pVar.mo5686k0();
        if (!(pVar instanceof RecyclerView.C1722a0.C1724b) || (a = ((RecyclerView.C1722a0.C1724b) pVar).mo5209a(k0 - 1)) == null) {
            return false;
        }
        if (a.x < Utils.FLOAT_EPSILON || a.y < Utils.FLOAT_EPSILON) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int[] mo6023c(RecyclerView.C1747p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.mo5226v()) {
            iArr[0] = m7099m(view, m7101o(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.mo5227w()) {
            iArr[1] = m7099m(view, m7103q(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public RecyclerView.C1722a0 mo6051e(RecyclerView.C1747p pVar) {
        if (!(pVar instanceof RecyclerView.C1722a0.C1724b)) {
            return null;
        }
        return new C1828a(this.f5495a.getContext());
    }

    /* renamed from: h */
    public View mo6024h(RecyclerView.C1747p pVar) {
        if (pVar.mo5227w()) {
            return m7100n(pVar, m7103q(pVar));
        }
        if (pVar.mo5226v()) {
            return m7100n(pVar, m7101o(pVar));
        }
        return null;
    }

    /* renamed from: i */
    public int mo6025i(RecyclerView.C1747p pVar, int i, int i2) {
        C1824r p;
        int i3;
        int k0 = pVar.mo5686k0();
        if (k0 == 0 || (p = m7102p(pVar)) == null) {
            return -1;
        }
        int V = pVar.mo5660V();
        View view = null;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i6 = 0; i6 < V; i6++) {
            View U = pVar.mo5658U(i6);
            if (U != null) {
                int m = m7099m(U, p);
                if (m <= 0 && m > i5) {
                    view2 = U;
                    i5 = m;
                }
                if (m >= 0 && m < i4) {
                    view = U;
                    i4 = m;
                }
            }
        }
        boolean r = m7104r(pVar, i, i2);
        if (r && view != null) {
            return pVar.mo5700q0(view);
        }
        if (!r && view2 != null) {
            return pVar.mo5700q0(view2);
        }
        if (r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int q0 = pVar.mo5700q0(view);
        if (m7105s(pVar) == r) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = q0 + i3;
        if (i7 < 0 || i7 >= k0) {
            return -1;
        }
        return i7;
    }
}
