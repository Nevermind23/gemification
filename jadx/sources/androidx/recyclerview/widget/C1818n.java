package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.recyclerview.widget.n */
public class C1818n extends C1833w {

    /* renamed from: d */
    private C1824r f5478d;

    /* renamed from: e */
    private C1824r f5479e;

    /* renamed from: m */
    private float m7024m(RecyclerView.C1747p pVar, C1824r rVar) {
        int max;
        int V = pVar.mo5660V();
        if (V == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < V; i3++) {
            View U = pVar.mo5658U(i3);
            int q0 = pVar.mo5700q0(U);
            if (q0 != -1) {
                if (q0 < i2) {
                    view = U;
                    i2 = q0;
                }
                if (q0 > i) {
                    view2 = U;
                    i = q0;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(rVar.mo6034d(view), rVar.mo6034d(view2)) - Math.min(rVar.mo6037g(view), rVar.mo6037g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i - i2) + 1));
    }

    /* renamed from: n */
    private int m7025n(View view, C1824r rVar) {
        return (rVar.mo6037g(view) + (rVar.mo6035e(view) / 2)) - (rVar.mo6044n() + (rVar.mo6045o() / 2));
    }

    /* renamed from: o */
    private int m7026o(RecyclerView.C1747p pVar, C1824r rVar, int i, int i2) {
        int i3;
        int[] d = mo6074d(i, i2);
        float m = m7024m(pVar, rVar);
        if (m <= Utils.FLOAT_EPSILON) {
            return 0;
        }
        if (Math.abs(d[0]) > Math.abs(d[1])) {
            i3 = d[0];
        } else {
            i3 = d[1];
        }
        return Math.round(((float) i3) / m);
    }

    /* renamed from: p */
    private View m7027p(RecyclerView.C1747p pVar, C1824r rVar) {
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

    /* renamed from: q */
    private C1824r m7028q(RecyclerView.C1747p pVar) {
        C1824r rVar = this.f5479e;
        if (rVar == null || rVar.f5484a != pVar) {
            this.f5479e = C1824r.m7051a(pVar);
        }
        return this.f5479e;
    }

    /* renamed from: r */
    private C1824r m7029r(RecyclerView.C1747p pVar) {
        C1824r rVar = this.f5478d;
        if (rVar == null || rVar.f5484a != pVar) {
            this.f5478d = C1824r.m7053c(pVar);
        }
        return this.f5478d;
    }

    /* renamed from: c */
    public int[] mo6023c(RecyclerView.C1747p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.mo5226v()) {
            iArr[0] = m7025n(view, m7028q(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.mo5227w()) {
            iArr[1] = m7025n(view, m7029r(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: h */
    public View mo6024h(RecyclerView.C1747p pVar) {
        if (pVar.mo5227w()) {
            return m7027p(pVar, m7029r(pVar));
        }
        if (pVar.mo5226v()) {
            return m7027p(pVar, m7028q(pVar));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r4 = r0 - 1;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo6025i(androidx.recyclerview.widget.RecyclerView.C1747p r9, int r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.recyclerview.widget.RecyclerView.C1722a0.C1724b
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.mo5686k0()
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            android.view.View r2 = r8.mo6024h(r9)
            if (r2 != 0) goto L_0x0014
            return r1
        L_0x0014:
            int r2 = r9.mo5700q0(r2)
            if (r2 != r1) goto L_0x001b
            return r1
        L_0x001b:
            r3 = r9
            androidx.recyclerview.widget.RecyclerView$a0$b r3 = (androidx.recyclerview.widget.RecyclerView.C1722a0.C1724b) r3
            int r4 = r0 + -1
            android.graphics.PointF r3 = r3.mo5209a(r4)
            if (r3 != 0) goto L_0x0027
            return r1
        L_0x0027:
            boolean r5 = r9.mo5226v()
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x003f
            androidx.recyclerview.widget.r r5 = r8.m7028q(r9)
            int r10 = r8.m7026o(r9, r5, r10, r7)
            float r5 = r3.x
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0040
            int r10 = -r10
            goto L_0x0040
        L_0x003f:
            r10 = r7
        L_0x0040:
            boolean r5 = r9.mo5227w()
            if (r5 == 0) goto L_0x0056
            androidx.recyclerview.widget.r r5 = r8.m7029r(r9)
            int r11 = r8.m7026o(r9, r5, r7, r11)
            float r3 = r3.y
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0057
            int r11 = -r11
            goto L_0x0057
        L_0x0056:
            r11 = r7
        L_0x0057:
            boolean r9 = r9.mo5227w()
            if (r9 == 0) goto L_0x005e
            r10 = r11
        L_0x005e:
            if (r10 != 0) goto L_0x0061
            return r1
        L_0x0061:
            int r2 = r2 + r10
            if (r2 >= 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r7 = r2
        L_0x0066:
            if (r7 < r0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r4 = r7
        L_0x006a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1818n.mo6025i(androidx.recyclerview.widget.RecyclerView$p, int, int):int");
    }
}
