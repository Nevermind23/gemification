package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: L */
    boolean f4978L = false;

    /* renamed from: M */
    int f4979M = -1;

    /* renamed from: N */
    int[] f4980N;

    /* renamed from: O */
    View[] f4981O;

    /* renamed from: P */
    final SparseIntArray f4982P = new SparseIntArray();

    /* renamed from: Q */
    final SparseIntArray f4983Q = new SparseIntArray();

    /* renamed from: R */
    C1715c f4984R = new C1713a();

    /* renamed from: S */
    final Rect f4985S = new Rect();

    /* renamed from: T */
    private boolean f4986T;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1713a extends C1715c {
        /* renamed from: e */
        public int mo5179e(int i, int i2) {
            return i % i2;
        }

        /* renamed from: f */
        public int mo5180f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C1715c {

        /* renamed from: a */
        final SparseIntArray f4989a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f4990b = new SparseIntArray();

        /* renamed from: c */
        private boolean f4991c = false;

        /* renamed from: d */
        private boolean f4992d = false;

        /* renamed from: a */
        static int m6061a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5183b(int i, int i2) {
            if (!this.f4992d) {
                return mo5185d(i, i2);
            }
            int i3 = this.f4990b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo5185d(i, i2);
            this.f4990b.put(i, d);
            return d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo5184c(int i, int i2) {
            if (!this.f4991c) {
                return mo5179e(i, i2);
            }
            int i3 = this.f4989a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = mo5179e(i, i2);
            this.f4989a.put(i, e);
            return e;
        }

        /* renamed from: d */
        public int mo5185d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int a;
            if (!this.f4992d || (a = m6061a(this.f4990b, i)) == -1) {
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                i5 = this.f4990b.get(a);
                i4 = a + 1;
                i3 = mo5184c(a, i2) + mo5180f(a);
                if (i3 == i2) {
                    i5++;
                    i3 = 0;
                }
            }
            int f = mo5180f(i);
            while (i4 < i) {
                int f2 = mo5180f(i4);
                int i6 = i3 + f2;
                if (i6 == i2) {
                    i5++;
                    i6 = 0;
                } else if (i6 > i2) {
                    i5++;
                    i6 = f2;
                }
                i4++;
            }
            if (i3 + f > i2) {
                return i5 + 1;
            }
            return i5;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo5179e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo5180f(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f4991c
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.f4989a
                int r2 = m6061a(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.f4989a
                int r3 = r3.get(r2)
                int r4 = r5.mo5180f(r2)
                int r3 = r3 + r4
                goto L_0x0030
            L_0x0020:
                r2 = r1
                r3 = r2
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r4 = r5.mo5180f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x002d
                r3 = r1
                goto L_0x0030
            L_0x002d:
                if (r3 <= r7) goto L_0x0030
                r3 = r4
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x0037
                return r3
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C1715c.mo5179e(int, int):int");
        }

        /* renamed from: f */
        public abstract int mo5180f(int i);

        /* renamed from: g */
        public void mo5186g() {
            this.f4990b.clear();
        }

        /* renamed from: h */
        public void mo5187h() {
            this.f4989a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo5175t3(RecyclerView.C1747p.m6431r0(context, attributeSet, i, i2).f5203b);
    }

    /* renamed from: c3 */
    private void m6008c3(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i2 = i;
            i3 = 0;
        } else {
            i3 = i - 1;
            i2 = -1;
            i4 = -1;
        }
        while (i3 != i2) {
            View view = this.f4981O[i3];
            C1714b bVar = (C1714b) view.getLayoutParams();
            int p3 = m6019p3(wVar, b0Var, mo5700q0(view));
            bVar.f4988i = p3;
            bVar.f4987h = i5;
            i5 += p3;
            i3 += i4;
        }
    }

    /* renamed from: d3 */
    private void m6009d3() {
        int V = mo5660V();
        for (int i = 0; i < V; i++) {
            C1714b bVar = (C1714b) mo5658U(i).getLayoutParams();
            int b = bVar.mo5729b();
            this.f4982P.put(b, bVar.mo5182h());
            this.f4983Q.put(b, bVar.mo5181g());
        }
    }

    /* renamed from: e3 */
    private void m6010e3(int i) {
        this.f4980N = m6011f3(this.f4980N, this.f4979M, i);
    }

    /* renamed from: f3 */
    static int[] m6011f3(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: g3 */
    private void m6012g3() {
        this.f4982P.clear();
        this.f4983Q.clear();
    }

    /* renamed from: h3 */
    private int m6013h3(RecyclerView.C1726b0 b0Var) {
        int i;
        if (!(mo5660V() == 0 || b0Var.mo5461b() == 0)) {
            mo5213h2();
            boolean E2 = mo5196E2();
            View m2 = mo5217m2(!E2, true);
            View l2 = mo5216l2(!E2, true);
            if (!(m2 == null || l2 == null)) {
                int b = this.f4984R.mo5183b(mo5700q0(m2), this.f4979M);
                int b2 = this.f4984R.mo5183b(mo5700q0(l2), this.f4979M);
                int min = Math.min(b, b2);
                int max = Math.max(b, b2);
                int b3 = this.f4984R.mo5183b(b0Var.mo5461b() - 1, this.f4979M) + 1;
                if (this.f4993A) {
                    i = Math.max(0, (b3 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!E2) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(this.f5006x.mo6034d(l2) - this.f5006x.mo6037g(m2))) / ((float) ((this.f4984R.mo5183b(mo5700q0(l2), this.f4979M) - this.f4984R.mo5183b(mo5700q0(m2), this.f4979M)) + 1)))) + ((float) (this.f5006x.mo6044n() - this.f5006x.mo6037g(m2))));
            }
        }
        return 0;
    }

    /* renamed from: i3 */
    private int m6014i3(RecyclerView.C1726b0 b0Var) {
        if (!(mo5660V() == 0 || b0Var.mo5461b() == 0)) {
            mo5213h2();
            View m2 = mo5217m2(!mo5196E2(), true);
            View l2 = mo5216l2(!mo5196E2(), true);
            if (!(m2 == null || l2 == null)) {
                if (!mo5196E2()) {
                    return this.f4984R.mo5183b(b0Var.mo5461b() - 1, this.f4979M) + 1;
                }
                int d = this.f5006x.mo6034d(l2) - this.f5006x.mo6037g(m2);
                int b = this.f4984R.mo5183b(mo5700q0(m2), this.f4979M);
                return (int) ((((float) d) / ((float) ((this.f4984R.mo5183b(mo5700q0(l2), this.f4979M) - b) + 1))) * ((float) (this.f4984R.mo5183b(b0Var.mo5461b() - 1, this.f4979M) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: j3 */
    private void m6015j3(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, LinearLayoutManager.C1717a aVar, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int o3 = m6018o3(wVar, b0Var, aVar.f5013b);
        if (z) {
            while (o3 > 0) {
                int i2 = aVar.f5013b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f5013b = i3;
                    o3 = m6018o3(wVar, b0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b = b0Var.mo5461b() - 1;
        int i4 = aVar.f5013b;
        while (i4 < b) {
            int i5 = i4 + 1;
            int o32 = m6018o3(wVar, b0Var, i5);
            if (o32 <= o3) {
                break;
            }
            i4 = i5;
            o3 = o32;
        }
        aVar.f5013b = i4;
    }

    /* renamed from: k3 */
    private void m6016k3() {
        View[] viewArr = this.f4981O;
        if (viewArr == null || viewArr.length != this.f4979M) {
            this.f4981O = new View[this.f4979M];
        }
    }

    /* renamed from: n3 */
    private int m6017n3(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, int i) {
        if (!b0Var.mo5464e()) {
            return this.f4984R.mo5183b(i, this.f4979M);
        }
        int g = wVar.mo5775g(i);
        if (g != -1) {
            return this.f4984R.mo5183b(g, this.f4979M);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: o3 */
    private int m6018o3(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, int i) {
        if (!b0Var.mo5464e()) {
            return this.f4984R.mo5184c(i, this.f4979M);
        }
        int i2 = this.f4983Q.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int g = wVar.mo5775g(i);
        if (g != -1) {
            return this.f4984R.mo5184c(g, this.f4979M);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: p3 */
    private int m6019p3(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, int i) {
        if (!b0Var.mo5464e()) {
            return this.f4984R.mo5180f(i);
        }
        int i2 = this.f4982P.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int g = wVar.mo5775g(i);
        if (g != -1) {
            return this.f4984R.mo5180f(g);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: q3 */
    private void m6020q3(float f, int i) {
        m6010e3(Math.max(Math.round(f * ((float) this.f4979M)), i));
    }

    /* renamed from: r3 */
    private void m6021r3(View view, int i, boolean z) {
        int i2;
        int i3;
        C1714b bVar = (C1714b) view.getLayoutParams();
        Rect rect = bVar.f5207e;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int l3 = mo5172l3(bVar.f4987h, bVar.f4988i);
        if (this.f5004v == 1) {
            i2 = RecyclerView.C1747p.m6428W(l3, i, i5, bVar.width, false);
            i3 = RecyclerView.C1747p.m6428W(this.f5006x.mo6045o(), mo5685j0(), i4, bVar.height, true);
        } else {
            int W = RecyclerView.C1747p.m6428W(l3, i, i4, bVar.height, false);
            int W2 = RecyclerView.C1747p.m6428W(this.f5006x.mo6045o(), mo5718y0(), i5, bVar.width, true);
            i3 = W;
            i2 = W2;
        }
        m6022s3(view, i2, i3, z);
    }

    /* renamed from: s3 */
    private void m6022s3(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.C1752q qVar = (RecyclerView.C1752q) view.getLayoutParams();
        if (z) {
            z2 = mo5659U1(view, i, i2, qVar);
        } else {
            z2 = mo5656S1(view, i, i2, qVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: v3 */
    private void m6023v3() {
        int i;
        int i2;
        if (mo5191B2() == 1) {
            i2 = mo5716x0() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = mo5684i0() - getPaddingBottom();
            i = getPaddingTop();
        }
        m6010e3(i2 - i);
    }

    /* renamed from: C */
    public int mo5146C(RecyclerView.C1726b0 b0Var) {
        if (this.f4986T) {
            return m6013h3(b0Var);
        }
        return super.mo5146C(b0Var);
    }

    /* renamed from: D */
    public int mo5147D(RecyclerView.C1726b0 b0Var) {
        if (this.f4986T) {
            return m6014i3(b0Var);
        }
        return super.mo5147D(b0Var);
    }

    /* renamed from: F */
    public int mo5148F(RecyclerView.C1726b0 b0Var) {
        if (this.f4986T) {
            return m6013h3(b0Var);
        }
        return super.mo5148F(b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F2 */
    public void mo5149F2(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, LinearLayoutManager.C1719c cVar, LinearLayoutManager.C1718b bVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        View d;
        RecyclerView.C1759w wVar2 = wVar;
        RecyclerView.C1726b0 b0Var2 = b0Var;
        LinearLayoutManager.C1719c cVar2 = cVar;
        LinearLayoutManager.C1718b bVar2 = bVar;
        int m = this.f5006x.mo6043m();
        if (m != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (mo5660V() > 0) {
            i = this.f4980N[this.f4979M];
        } else {
            i = 0;
        }
        if (z) {
            m6023v3();
        }
        if (cVar2.f5025e == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i17 = this.f4979M;
        if (!z2) {
            i17 = m6018o3(wVar2, b0Var2, cVar2.f5024d) + m6019p3(wVar2, b0Var2, cVar2.f5024d);
        }
        int i18 = 0;
        while (i18 < this.f4979M && cVar2.mo5246c(b0Var2) && i17 > 0) {
            int i19 = cVar2.f5024d;
            int p3 = m6019p3(wVar2, b0Var2, i19);
            if (p3 <= this.f4979M) {
                i17 -= p3;
                if (i17 < 0 || (d = cVar2.mo5247d(wVar2)) == null) {
                    break;
                }
                this.f4981O[i18] = d;
                i18++;
            } else {
                throw new IllegalArgumentException("Item at position " + i19 + " requires " + p3 + " spans but GridLayoutManager has only " + this.f4979M + " spans.");
            }
        }
        if (i18 == 0) {
            bVar2.f5018b = true;
            return;
        }
        m6008c3(wVar2, b0Var2, i18, z2);
        float f = Utils.FLOAT_EPSILON;
        int i22 = 0;
        for (int i23 = 0; i23 < i18; i23++) {
            View view = this.f4981O[i23];
            if (cVar2.f5032l == null) {
                if (z2) {
                    mo5694n(view);
                } else {
                    mo5696o(view, 0);
                }
            } else if (z2) {
                mo5688l(view);
            } else {
                mo5691m(view, 0);
            }
            mo5709u(view, this.f4985S);
            m6021r3(view, m, false);
            int e = this.f5006x.mo6035e(view);
            if (e > i22) {
                i22 = e;
            }
            float f2 = (((float) this.f5006x.mo6036f(view)) * 1.0f) / ((float) ((C1714b) view.getLayoutParams()).f4988i);
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            m6020q3(f, i);
            i22 = 0;
            for (int i24 = 0; i24 < i18; i24++) {
                View view2 = this.f4981O[i24];
                m6021r3(view2, 1073741824, true);
                int e2 = this.f5006x.mo6035e(view2);
                if (e2 > i22) {
                    i22 = e2;
                }
            }
        }
        for (int i25 = 0; i25 < i18; i25++) {
            View view3 = this.f4981O[i25];
            if (this.f5006x.mo6035e(view3) != i22) {
                C1714b bVar3 = (C1714b) view3.getLayoutParams();
                Rect rect = bVar3.f5207e;
                int i26 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i27 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int l3 = mo5172l3(bVar3.f4987h, bVar3.f4988i);
                if (this.f5004v == 1) {
                    i16 = RecyclerView.C1747p.m6428W(l3, 1073741824, i27, bVar3.width, false);
                    i15 = View.MeasureSpec.makeMeasureSpec(i22 - i26, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i22 - i27, 1073741824);
                    i15 = RecyclerView.C1747p.m6428W(l3, 1073741824, i26, bVar3.height, false);
                    i16 = makeMeasureSpec;
                }
                m6022s3(view3, i16, i15, true);
            }
        }
        bVar2.f5017a = i22;
        if (this.f5004v == 1) {
            if (cVar2.f5026f == -1) {
                i5 = cVar2.f5022b;
                i14 = i5 - i22;
            } else {
                i14 = cVar2.f5022b;
                i5 = i14 + i22;
            }
            i2 = i14;
            i4 = 0;
            i3 = 0;
        } else {
            if (cVar2.f5026f == -1) {
                i13 = cVar2.f5022b;
                i12 = i13 - i22;
            } else {
                i12 = cVar2.f5022b;
                i13 = i12 + i22;
            }
            i3 = i12;
            i2 = 0;
            i4 = i13;
            i5 = 0;
        }
        int i28 = 0;
        while (i28 < i18) {
            View view4 = this.f4981O[i28];
            C1714b bVar4 = (C1714b) view4.getLayoutParams();
            if (this.f5004v == 1) {
                if (mo5194D2()) {
                    int paddingLeft = getPaddingLeft() + this.f4980N[this.f4979M - bVar4.f4987h];
                    i9 = i5;
                    i8 = paddingLeft;
                    i7 = paddingLeft - this.f5006x.mo6036f(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.f4980N[bVar4.f4987h];
                    i9 = i5;
                    i7 = paddingLeft2;
                    i8 = this.f5006x.mo6036f(view4) + paddingLeft2;
                }
                i6 = i2;
            } else {
                int paddingTop = getPaddingTop() + this.f4980N[bVar4.f4987h];
                i6 = paddingTop;
                i8 = i4;
                i7 = i3;
                i9 = this.f5006x.mo6036f(view4) + paddingTop;
            }
            mo5637K0(view4, i7, i6, i8, i9);
            if (bVar4.mo5731e() || bVar4.mo5730d()) {
                bVar2.f5019c = true;
            }
            bVar2.f5020d |= view4.hasFocusable();
            i28++;
            i5 = i9;
            i4 = i8;
            i3 = i7;
            i2 = i6;
        }
        Arrays.fill(this.f4981O, (Object) null);
    }

    /* renamed from: G */
    public int mo5150G(RecyclerView.C1726b0 b0Var) {
        if (this.f4986T) {
            return m6014i3(b0Var);
        }
        return super.mo5150G(b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H2 */
    public void mo5151H2(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, LinearLayoutManager.C1717a aVar, int i) {
        super.mo5151H2(wVar, b0Var, aVar, i);
        m6023v3();
        if (b0Var.mo5461b() > 0 && !b0Var.mo5464e()) {
            m6015j3(wVar, b0Var, aVar, i);
        }
        m6016k3();
    }

    /* renamed from: I1 */
    public int mo5152I1(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        m6023v3();
        m6016k3();
        return super.mo5152I1(i, wVar, b0Var);
    }

    /* renamed from: K1 */
    public int mo5153K1(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        m6023v3();
        m6016k3();
        return super.mo5153K1(i, wVar, b0Var);
    }

    /* renamed from: P */
    public RecyclerView.C1752q mo5154P() {
        if (this.f5004v == 0) {
            return new C1714b(-2, -1);
        }
        return new C1714b(-1, -2);
    }

    /* renamed from: P1 */
    public void mo5155P1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f4980N == null) {
            super.mo5155P1(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f5004v == 1) {
            i4 = RecyclerView.C1747p.m6432y(i2, rect.height() + paddingTop, mo5697o0());
            int[] iArr = this.f4980N;
            i3 = RecyclerView.C1747p.m6432y(i, iArr[iArr.length - 1] + paddingLeft, mo5698p0());
        } else {
            i3 = RecyclerView.C1747p.m6432y(i, rect.width() + paddingLeft, mo5698p0());
            int[] iArr2 = this.f4980N;
            i4 = RecyclerView.C1747p.m6432y(i2, iArr2[iArr2.length - 1] + paddingTop, mo5697o0());
        }
        mo5648O1(i3, i4);
    }

    /* renamed from: Q */
    public RecyclerView.C1752q mo5156Q(Context context, AttributeSet attributeSet) {
        return new C1714b(context, attributeSet);
    }

    /* renamed from: R */
    public RecyclerView.C1752q mo5157R(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1714b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1714b(layoutParams);
    }

    /* renamed from: T2 */
    public void mo5158T2(boolean z) {
        if (!z) {
            super.mo5158T2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == r7) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* renamed from: U0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo5159U0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1759w r26, androidx.recyclerview.widget.RecyclerView.C1726b0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo5644N(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C1714b) r5
            int r6 = r5.f4987h
            int r5 = r5.f4988i
            int r5 = r5 + r6
            android.view.View r7 = super.mo5159U0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo5211f2(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f4993A
            if (r7 == r10) goto L_0x0032
            r7 = r9
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo5660V()
            int r7 = r7 - r9
            r11 = r10
            r12 = r11
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo5660V()
            r11 = r7
            r12 = r9
            r7 = 0
        L_0x0045:
            int r13 = r0.f5004v
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo5194D2()
            if (r13 == 0) goto L_0x0051
            r13 = r9
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m6017n3(r1, r2, r7)
            r15 = r10
            r16 = r15
            r8 = 0
            r17 = 0
            r10 = r7
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.m6017n3(r1, r2, r10)
            android.view.View r1 = r0.mo5658U(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C1714b) r9
            int r2 = r9.f4987h
            r18 = r3
            int r3 = r9.f4988i
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo5636J0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f4987h
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f4987h
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo5159U0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    /* renamed from: Y0 */
    public void mo5160Y0(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.mo5160Y0(wVar, b0Var, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.mo3592Y(GridView.class.getName());
    }

    /* renamed from: Z */
    public int mo5161Z(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        if (this.f5004v == 1) {
            return this.f4979M;
        }
        if (b0Var.mo5461b() < 1) {
            return 0;
        }
        return m6017n3(wVar, b0Var, b0Var.mo5461b() - 1) + 1;
    }

    /* renamed from: Z1 */
    public boolean mo5162Z1() {
        return this.f4999G == null && !this.f4978L;
    }

    /* renamed from: a1 */
    public void mo5163a1(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1714b)) {
            super.mo5667Z0(view, accessibilityNodeInfoCompat);
            return;
        }
        C1714b bVar = (C1714b) layoutParams;
        int n3 = m6017n3(wVar, b0Var, bVar.mo5729b());
        if (this.f5004v == 0) {
            accessibilityNodeInfoCompat.mo3597b0(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m4049a(bVar.mo5181g(), bVar.mo5182h(), n3, 1, false, false));
            return;
        }
        accessibilityNodeInfoCompat.mo3597b0(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.m4049a(n3, 1, bVar.mo5181g(), bVar.mo5182h(), false, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b2 */
    public void mo5164b2(RecyclerView.C1726b0 b0Var, LinearLayoutManager.C1719c cVar, RecyclerView.C1747p.C1750c cVar2) {
        int i = this.f4979M;
        for (int i2 = 0; i2 < this.f4979M && cVar.mo5246c(b0Var) && i > 0; i2++) {
            int i3 = cVar.f5024d;
            cVar2.mo5727a(i3, Math.max(0, cVar.f5027g));
            i -= this.f4984R.mo5180f(i3);
            cVar.f5024d += cVar.f5025e;
        }
    }

    /* renamed from: c1 */
    public void mo5165c1(RecyclerView recyclerView, int i, int i2) {
        this.f4984R.mo5187h();
        this.f4984R.mo5186g();
    }

    /* renamed from: d1 */
    public void mo5166d1(RecyclerView recyclerView) {
        this.f4984R.mo5187h();
        this.f4984R.mo5186g();
    }

    /* renamed from: e1 */
    public void mo5167e1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f4984R.mo5187h();
        this.f4984R.mo5186g();
    }

    /* renamed from: f1 */
    public void mo5168f1(RecyclerView recyclerView, int i, int i2) {
        this.f4984R.mo5187h();
        this.f4984R.mo5186g();
    }

    /* renamed from: h1 */
    public void mo5169h1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f4984R.mo5187h();
        this.f4984R.mo5186g();
    }

    /* renamed from: i1 */
    public void mo5170i1(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        if (b0Var.mo5464e()) {
            m6009d3();
        }
        super.mo5170i1(wVar, b0Var);
        m6012g3();
    }

    /* renamed from: j1 */
    public void mo5171j1(RecyclerView.C1726b0 b0Var) {
        super.mo5171j1(b0Var);
        this.f4978L = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l3 */
    public int mo5172l3(int i, int i2) {
        if (this.f5004v != 1 || !mo5194D2()) {
            int[] iArr = this.f4980N;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f4980N;
        int i3 = this.f4979M;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: m3 */
    public int mo5173m3() {
        return this.f4979M;
    }

    /* renamed from: t0 */
    public int mo5174t0(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        if (this.f5004v == 0) {
            return this.f4979M;
        }
        if (b0Var.mo5461b() < 1) {
            return 0;
        }
        return m6017n3(wVar, b0Var, b0Var.mo5461b() - 1) + 1;
    }

    /* renamed from: t3 */
    public void mo5175t3(int i) {
        if (i != this.f4979M) {
            this.f4978L = true;
            if (i >= 1) {
                this.f4979M = i;
                this.f4984R.mo5187h();
                mo5629F1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* renamed from: u3 */
    public void mo5176u3(C1715c cVar) {
        this.f4984R = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v2 */
    public View mo5177v2(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, boolean z, boolean z2) {
        int i;
        int i2;
        int V = mo5660V();
        int i3 = 1;
        if (z2) {
            i2 = mo5660V() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = V;
            i2 = 0;
        }
        int b = b0Var.mo5461b();
        mo5213h2();
        int n = this.f5006x.mo6044n();
        int i4 = this.f5006x.mo6039i();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View U = mo5658U(i2);
            int q0 = mo5700q0(U);
            if (q0 >= 0 && q0 < b && m6018o3(wVar, b0Var, q0) == 0) {
                if (((RecyclerView.C1752q) U.getLayoutParams()).mo5731e()) {
                    if (view2 == null) {
                        view2 = U;
                    }
                } else if (this.f5006x.mo6037g(U) < i4 && this.f5006x.mo6034d(U) >= n) {
                    return U;
                } else {
                    if (view == null) {
                        view = U;
                    }
                }
            }
            i2 += i3;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* renamed from: x */
    public boolean mo5178x(RecyclerView.C1752q qVar) {
        return qVar instanceof C1714b;
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C1714b extends RecyclerView.C1752q {

        /* renamed from: h */
        int f4987h = -1;

        /* renamed from: i */
        int f4988i = 0;

        public C1714b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: g */
        public int mo5181g() {
            return this.f4987h;
        }

        /* renamed from: h */
        public int mo5182h() {
            return this.f4988i;
        }

        public C1714b(int i, int i2) {
            super(i, i2);
        }

        public C1714b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1714b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo5175t3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo5175t3(i);
    }
}
