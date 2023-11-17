package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.C1747p implements RecyclerView.C1722a0.C1724b {

    /* renamed from: A */
    boolean f4993A;

    /* renamed from: B */
    private boolean f4994B;

    /* renamed from: C */
    private boolean f4995C;

    /* renamed from: D */
    int f4996D;

    /* renamed from: E */
    int f4997E;

    /* renamed from: F */
    private boolean f4998F;

    /* renamed from: G */
    SavedState f4999G;

    /* renamed from: H */
    final C1717a f5000H;

    /* renamed from: I */
    private final C1718b f5001I;

    /* renamed from: J */
    private int f5002J;

    /* renamed from: K */
    private int[] f5003K;

    /* renamed from: v */
    int f5004v;

    /* renamed from: w */
    private C1719c f5005w;

    /* renamed from: x */
    C1824r f5006x;

    /* renamed from: y */
    private boolean f5007y;

    /* renamed from: z */
    private boolean f5008z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1716a();

        /* renamed from: d */
        int f5009d;

        /* renamed from: e */
        int f5010e;

        /* renamed from: f */
        boolean f5011f;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        class C1716a implements Parcelable.Creator {
            C1716a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5229a() {
            return this.f5009d >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5230b() {
            this.f5009d = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5009d);
            parcel.writeInt(this.f5010e);
            parcel.writeInt(this.f5011f ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f5009d = parcel.readInt();
            this.f5010e = parcel.readInt();
            this.f5011f = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f5009d = savedState.f5009d;
            this.f5010e = savedState.f5010e;
            this.f5011f = savedState.f5011f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C1717a {

        /* renamed from: a */
        C1824r f5012a;

        /* renamed from: b */
        int f5013b;

        /* renamed from: c */
        int f5014c;

        /* renamed from: d */
        boolean f5015d;

        /* renamed from: e */
        boolean f5016e;

        C1717a() {
            mo5241e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5237a() {
            int i;
            if (this.f5015d) {
                i = this.f5012a.mo6039i();
            } else {
                i = this.f5012a.mo6044n();
            }
            this.f5014c = i;
        }

        /* renamed from: b */
        public void mo5238b(View view, int i) {
            if (this.f5015d) {
                this.f5014c = this.f5012a.mo6034d(view) + this.f5012a.mo6046p();
            } else {
                this.f5014c = this.f5012a.mo6037g(view);
            }
            this.f5013b = i;
        }

        /* renamed from: c */
        public void mo5239c(View view, int i) {
            int p = this.f5012a.mo6046p();
            if (p >= 0) {
                mo5238b(view, i);
                return;
            }
            this.f5013b = i;
            if (this.f5015d) {
                int i2 = (this.f5012a.mo6039i() - p) - this.f5012a.mo6034d(view);
                this.f5014c = this.f5012a.mo6039i() - i2;
                if (i2 > 0) {
                    int e = this.f5014c - this.f5012a.mo6035e(view);
                    int n = this.f5012a.mo6044n();
                    int min = e - (n + Math.min(this.f5012a.mo6037g(view) - n, 0));
                    if (min < 0) {
                        this.f5014c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f5012a.mo6037g(view);
            int n2 = g - this.f5012a.mo6044n();
            this.f5014c = g;
            if (n2 > 0) {
                int i3 = (this.f5012a.mo6039i() - Math.min(0, (this.f5012a.mo6039i() - p) - this.f5012a.mo6034d(view))) - (g + this.f5012a.mo6035e(view));
                if (i3 < 0) {
                    this.f5014c -= Math.min(n2, -i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo5240d(View view, RecyclerView.C1726b0 b0Var) {
            RecyclerView.C1752q qVar = (RecyclerView.C1752q) view.getLayoutParams();
            if (qVar.mo5731e() || qVar.mo5729b() < 0 || qVar.mo5729b() >= b0Var.mo5461b()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5241e() {
            this.f5013b = -1;
            this.f5014c = Integer.MIN_VALUE;
            this.f5015d = false;
            this.f5016e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f5013b + ", mCoordinate=" + this.f5014c + ", mLayoutFromEnd=" + this.f5015d + ", mValid=" + this.f5016e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C1718b {

        /* renamed from: a */
        public int f5017a;

        /* renamed from: b */
        public boolean f5018b;

        /* renamed from: c */
        public boolean f5019c;

        /* renamed from: d */
        public boolean f5020d;

        protected C1718b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5243a() {
            this.f5017a = 0;
            this.f5018b = false;
            this.f5019c = false;
            this.f5020d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C1719c {

        /* renamed from: a */
        boolean f5021a = true;

        /* renamed from: b */
        int f5022b;

        /* renamed from: c */
        int f5023c;

        /* renamed from: d */
        int f5024d;

        /* renamed from: e */
        int f5025e;

        /* renamed from: f */
        int f5026f;

        /* renamed from: g */
        int f5027g;

        /* renamed from: h */
        int f5028h = 0;

        /* renamed from: i */
        int f5029i = 0;

        /* renamed from: j */
        boolean f5030j = false;

        /* renamed from: k */
        int f5031k;

        /* renamed from: l */
        List f5032l = null;

        /* renamed from: m */
        boolean f5033m;

        C1719c() {
        }

        /* renamed from: e */
        private View m6161e() {
            int size = this.f5032l.size();
            for (int i = 0; i < size; i++) {
                View view = ((RecyclerView.C1734f0) this.f5032l.get(i)).itemView;
                RecyclerView.C1752q qVar = (RecyclerView.C1752q) view.getLayoutParams();
                if (!qVar.mo5731e() && this.f5024d == qVar.mo5729b()) {
                    mo5245b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo5244a() {
            mo5245b((View) null);
        }

        /* renamed from: b */
        public void mo5245b(View view) {
            View f = mo5248f(view);
            if (f == null) {
                this.f5024d = -1;
            } else {
                this.f5024d = ((RecyclerView.C1752q) f.getLayoutParams()).mo5729b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo5246c(RecyclerView.C1726b0 b0Var) {
            int i = this.f5024d;
            return i >= 0 && i < b0Var.mo5461b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo5247d(RecyclerView.C1759w wVar) {
            if (this.f5032l != null) {
                return m6161e();
            }
            View p = wVar.mo5784p(this.f5024d);
            this.f5024d += this.f5025e;
            return p;
        }

        /* renamed from: f */
        public View mo5248f(View view) {
            int b;
            int size = this.f5032l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((RecyclerView.C1734f0) this.f5032l.get(i2)).itemView;
                RecyclerView.C1752q qVar = (RecyclerView.C1752q) view3.getLayoutParams();
                if (view3 != view && !qVar.mo5731e() && (b = (qVar.mo5729b() - this.f5024d) * this.f5025e) >= 0 && b < i) {
                    view2 = view3;
                    if (b == 0) {
                        break;
                    }
                    i = b;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: G2 */
    private void m6069G2(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, int i, int i2) {
        boolean z;
        RecyclerView.C1759w wVar2 = wVar;
        RecyclerView.C1726b0 b0Var2 = b0Var;
        if (b0Var.mo5466g() && mo5660V() != 0 && !b0Var.mo5464e() && mo5162Z1()) {
            List l = wVar.mo5780l();
            int size = l.size();
            int q0 = mo5700q0(mo5658U(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.C1734f0 f0Var = (RecyclerView.C1734f0) l.get(i5);
                if (!f0Var.isRemoved()) {
                    boolean z2 = true;
                    if (f0Var.getLayoutPosition() < q0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.f4993A) {
                        z2 = true;
                    }
                    if (z2) {
                        i3 += this.f5006x.mo6035e(f0Var.itemView);
                    } else {
                        i4 += this.f5006x.mo6035e(f0Var.itemView);
                    }
                }
            }
            this.f5005w.f5032l = l;
            if (i3 > 0) {
                m6081a3(mo5700q0(m6093z2()), i);
                C1719c cVar = this.f5005w;
                cVar.f5028h = i3;
                cVar.f5023c = 0;
                cVar.mo5244a();
                mo5214i2(wVar2, this.f5005w, b0Var2, false);
            }
            if (i4 > 0) {
                m6079Y2(mo5700q0(m6092y2()), i2);
                C1719c cVar2 = this.f5005w;
                cVar2.f5028h = i4;
                cVar2.f5023c = 0;
                cVar2.mo5244a();
                mo5214i2(wVar2, this.f5005w, b0Var2, false);
            }
            this.f5005w.f5032l = null;
        }
    }

    /* renamed from: I2 */
    private void m6070I2(RecyclerView.C1759w wVar, C1719c cVar) {
        if (cVar.f5021a && !cVar.f5033m) {
            int i = cVar.f5027g;
            int i2 = cVar.f5029i;
            if (cVar.f5026f == -1) {
                m6072K2(wVar, i, i2);
            } else {
                m6073L2(wVar, i, i2);
            }
        }
    }

    /* renamed from: J2 */
    private void m6071J2(RecyclerView.C1759w wVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo5721z1(i3, wVar);
                }
                return;
            }
            while (i > i2) {
                mo5721z1(i, wVar);
                i--;
            }
        }
    }

    /* renamed from: K2 */
    private void m6072K2(RecyclerView.C1759w wVar, int i, int i2) {
        int V = mo5660V();
        if (i >= 0) {
            int h = (this.f5006x.mo6038h() - i) + i2;
            if (this.f4993A) {
                for (int i3 = 0; i3 < V; i3++) {
                    View U = mo5658U(i3);
                    if (this.f5006x.mo6037g(U) < h || this.f5006x.mo6048r(U) < h) {
                        m6071J2(wVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = V - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View U2 = mo5658U(i5);
                if (this.f5006x.mo6037g(U2) < h || this.f5006x.mo6048r(U2) < h) {
                    m6071J2(wVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: L2 */
    private void m6073L2(RecyclerView.C1759w wVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int V = mo5660V();
            if (this.f4993A) {
                int i4 = V - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View U = mo5658U(i5);
                    if (this.f5006x.mo6034d(U) > i3 || this.f5006x.mo6047q(U) > i3) {
                        m6071J2(wVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < V; i6++) {
                View U2 = mo5658U(i6);
                if (this.f5006x.mo6034d(U2) > i3 || this.f5006x.mo6047q(U2) > i3) {
                    m6071J2(wVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* renamed from: N2 */
    private void m6074N2() {
        if (this.f5004v == 1 || !mo5194D2()) {
            this.f4993A = this.f5008z;
        } else {
            this.f4993A = !this.f5008z;
        }
    }

    /* renamed from: U2 */
    private boolean m6075U2(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, C1717a aVar) {
        View v2;
        boolean z;
        boolean z2 = false;
        if (mo5660V() == 0) {
            return false;
        }
        View h0 = mo5683h0();
        if (h0 == null || !aVar.mo5240d(h0, b0Var)) {
            boolean z3 = this.f5007y;
            boolean z4 = this.f4994B;
            if (z3 != z4 || (v2 = mo5177v2(wVar, b0Var, aVar.f5015d, z4)) == null) {
                return false;
            }
            aVar.mo5238b(v2, mo5700q0(v2));
            if (!b0Var.mo5464e() && mo5162Z1()) {
                int g = this.f5006x.mo6037g(v2);
                int d = this.f5006x.mo6034d(v2);
                int n = this.f5006x.mo6044n();
                int i = this.f5006x.mo6039i();
                if (d > n || g >= n) {
                    z = false;
                } else {
                    z = true;
                }
                if (g >= i && d > i) {
                    z2 = true;
                }
                if (z || z2) {
                    if (aVar.f5015d) {
                        n = i;
                    }
                    aVar.f5014c = n;
                }
            }
            return true;
        }
        aVar.mo5239c(h0, mo5700q0(h0));
        return true;
    }

    /* renamed from: V2 */
    private boolean m6076V2(RecyclerView.C1726b0 b0Var, C1717a aVar) {
        int i;
        boolean z;
        int i2;
        boolean z2 = false;
        if (!b0Var.mo5464e() && (i = this.f4996D) != -1) {
            if (i < 0 || i >= b0Var.mo5461b()) {
                this.f4996D = -1;
                this.f4997E = Integer.MIN_VALUE;
            } else {
                aVar.f5013b = this.f4996D;
                SavedState savedState = this.f4999G;
                if (savedState != null && savedState.mo5229a()) {
                    boolean z3 = this.f4999G.f5011f;
                    aVar.f5015d = z3;
                    if (z3) {
                        aVar.f5014c = this.f5006x.mo6039i() - this.f4999G.f5010e;
                    } else {
                        aVar.f5014c = this.f5006x.mo6044n() + this.f4999G.f5010e;
                    }
                    return true;
                } else if (this.f4997E == Integer.MIN_VALUE) {
                    View O = mo5199O(this.f4996D);
                    if (O == null) {
                        if (mo5660V() > 0) {
                            if (this.f4996D < mo5700q0(mo5658U(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.f4993A) {
                                z2 = true;
                            }
                            aVar.f5015d = z2;
                        }
                        aVar.mo5237a();
                    } else if (this.f5006x.mo6035e(O) > this.f5006x.mo6045o()) {
                        aVar.mo5237a();
                        return true;
                    } else if (this.f5006x.mo6037g(O) - this.f5006x.mo6044n() < 0) {
                        aVar.f5014c = this.f5006x.mo6044n();
                        aVar.f5015d = false;
                        return true;
                    } else if (this.f5006x.mo6039i() - this.f5006x.mo6034d(O) < 0) {
                        aVar.f5014c = this.f5006x.mo6039i();
                        aVar.f5015d = true;
                        return true;
                    } else {
                        if (aVar.f5015d) {
                            i2 = this.f5006x.mo6034d(O) + this.f5006x.mo6046p();
                        } else {
                            i2 = this.f5006x.mo6037g(O);
                        }
                        aVar.f5014c = i2;
                    }
                    return true;
                } else {
                    boolean z4 = this.f4993A;
                    aVar.f5015d = z4;
                    if (z4) {
                        aVar.f5014c = this.f5006x.mo6039i() - this.f4997E;
                    } else {
                        aVar.f5014c = this.f5006x.mo6044n() + this.f4997E;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: W2 */
    private void m6077W2(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, C1717a aVar) {
        int i;
        if (!m6076V2(b0Var, aVar) && !m6075U2(wVar, b0Var, aVar)) {
            aVar.mo5237a();
            if (this.f4994B) {
                i = b0Var.mo5461b() - 1;
            } else {
                i = 0;
            }
            aVar.f5013b = i;
        }
    }

    /* renamed from: X2 */
    private void m6078X2(int i, int i2, boolean z, RecyclerView.C1726b0 b0Var) {
        int i3;
        int i4;
        this.f5005w.f5033m = mo5198M2();
        this.f5005w.f5026f = i;
        int[] iArr = this.f5003K;
        boolean z2 = false;
        iArr[0] = 0;
        int i5 = 1;
        iArr[1] = 0;
        mo5210a2(b0Var, iArr);
        int max = Math.max(0, this.f5003K[0]);
        int max2 = Math.max(0, this.f5003K[1]);
        if (i == 1) {
            z2 = true;
        }
        C1719c cVar = this.f5005w;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        cVar.f5028h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.f5029i = max;
        if (z2) {
            cVar.f5028h = i3 + this.f5006x.mo6040j();
            View y2 = m6092y2();
            C1719c cVar2 = this.f5005w;
            if (this.f4993A) {
                i5 = -1;
            }
            cVar2.f5025e = i5;
            int q0 = mo5700q0(y2);
            C1719c cVar3 = this.f5005w;
            cVar2.f5024d = q0 + cVar3.f5025e;
            cVar3.f5022b = this.f5006x.mo6034d(y2);
            i4 = this.f5006x.mo6034d(y2) - this.f5006x.mo6039i();
        } else {
            View z22 = m6093z2();
            this.f5005w.f5028h += this.f5006x.mo6044n();
            C1719c cVar4 = this.f5005w;
            if (!this.f4993A) {
                i5 = -1;
            }
            cVar4.f5025e = i5;
            int q02 = mo5700q0(z22);
            C1719c cVar5 = this.f5005w;
            cVar4.f5024d = q02 + cVar5.f5025e;
            cVar5.f5022b = this.f5006x.mo6037g(z22);
            i4 = (-this.f5006x.mo6037g(z22)) + this.f5006x.mo6044n();
        }
        C1719c cVar6 = this.f5005w;
        cVar6.f5023c = i2;
        if (z) {
            cVar6.f5023c = i2 - i4;
        }
        cVar6.f5027g = i4;
    }

    /* renamed from: Y2 */
    private void m6079Y2(int i, int i2) {
        int i3;
        this.f5005w.f5023c = this.f5006x.mo6039i() - i2;
        C1719c cVar = this.f5005w;
        if (this.f4993A) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        cVar.f5025e = i3;
        cVar.f5024d = i;
        cVar.f5026f = 1;
        cVar.f5022b = i2;
        cVar.f5027g = Integer.MIN_VALUE;
    }

    /* renamed from: Z2 */
    private void m6080Z2(C1717a aVar) {
        m6079Y2(aVar.f5013b, aVar.f5014c);
    }

    /* renamed from: a3 */
    private void m6081a3(int i, int i2) {
        int i3;
        this.f5005w.f5023c = i2 - this.f5006x.mo6044n();
        C1719c cVar = this.f5005w;
        cVar.f5024d = i;
        if (this.f4993A) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        cVar.f5025e = i3;
        cVar.f5026f = -1;
        cVar.f5022b = i2;
        cVar.f5027g = Integer.MIN_VALUE;
    }

    /* renamed from: b3 */
    private void m6082b3(C1717a aVar) {
        m6081a3(aVar.f5013b, aVar.f5014c);
    }

    /* renamed from: c2 */
    private int m6083c2(RecyclerView.C1726b0 b0Var) {
        if (mo5660V() == 0) {
            return 0;
        }
        mo5213h2();
        C1824r rVar = this.f5006x;
        View m2 = mo5217m2(!this.f4995C, true);
        return C1831u.m7117a(b0Var, rVar, m2, mo5216l2(!this.f4995C, true), this, this.f4995C);
    }

    /* renamed from: d2 */
    private int m6084d2(RecyclerView.C1726b0 b0Var) {
        if (mo5660V() == 0) {
            return 0;
        }
        mo5213h2();
        C1824r rVar = this.f5006x;
        View m2 = mo5217m2(!this.f4995C, true);
        return C1831u.m7118b(b0Var, rVar, m2, mo5216l2(!this.f4995C, true), this, this.f4995C, this.f4993A);
    }

    /* renamed from: e2 */
    private int m6085e2(RecyclerView.C1726b0 b0Var) {
        if (mo5660V() == 0) {
            return 0;
        }
        mo5213h2();
        C1824r rVar = this.f5006x;
        View m2 = mo5217m2(!this.f4995C, true);
        return C1831u.m7119c(b0Var, rVar, m2, mo5216l2(!this.f4995C, true), this, this.f4995C);
    }

    /* renamed from: k2 */
    private View m6086k2() {
        return mo5224r2(0, mo5660V());
    }

    /* renamed from: p2 */
    private View m6087p2() {
        return mo5224r2(mo5660V() - 1, -1);
    }

    /* renamed from: t2 */
    private View m6088t2() {
        if (this.f4993A) {
            return m6086k2();
        }
        return m6087p2();
    }

    /* renamed from: u2 */
    private View m6089u2() {
        if (this.f4993A) {
            return m6087p2();
        }
        return m6086k2();
    }

    /* renamed from: w2 */
    private int m6090w2(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, boolean z) {
        int i2;
        int i3 = this.f5006x.mo6039i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -mo5200O2(-i3, wVar, b0Var);
        int i5 = i + i4;
        if (!z || (i2 = this.f5006x.mo6039i() - i5) <= 0) {
            return i4;
        }
        this.f5006x.mo6049s(i2);
        return i2 + i4;
    }

    /* renamed from: x2 */
    private int m6091x2(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, boolean z) {
        int n;
        int n2 = i - this.f5006x.mo6044n();
        if (n2 <= 0) {
            return 0;
        }
        int i2 = -mo5200O2(n2, wVar, b0Var);
        int i3 = i + i2;
        if (!z || (n = i3 - this.f5006x.mo6044n()) <= 0) {
            return i2;
        }
        this.f5006x.mo6049s(-n);
        return i2 - n;
    }

    /* renamed from: y2 */
    private View m6092y2() {
        return mo5658U(this.f4993A ? 0 : mo5660V() - 1);
    }

    /* renamed from: z2 */
    private View m6093z2() {
        return mo5658U(this.f4993A ? mo5660V() - 1 : 0);
    }

    /* renamed from: A */
    public void mo5188A(int i, RecyclerView.C1747p.C1750c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.f4999G;
        int i3 = -1;
        if (savedState == null || !savedState.mo5229a()) {
            m6074N2();
            z = this.f4993A;
            i2 = this.f4996D;
            if (i2 == -1) {
                if (z) {
                    i2 = i - 1;
                } else {
                    i2 = 0;
                }
            }
        } else {
            SavedState savedState2 = this.f4999G;
            z = savedState2.f5011f;
            i2 = savedState2.f5009d;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f5002J && i2 >= 0 && i2 < i; i4++) {
            cVar.mo5727a(i2, 0);
            i2 += i3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A2 */
    public int mo5189A2(RecyclerView.C1726b0 b0Var) {
        if (b0Var.mo5463d()) {
            return this.f5006x.mo6045o();
        }
        return 0;
    }

    /* renamed from: B */
    public int mo5190B(RecyclerView.C1726b0 b0Var) {
        return m6083c2(b0Var);
    }

    /* renamed from: B2 */
    public int mo5191B2() {
        return this.f5004v;
    }

    /* renamed from: C */
    public int mo5146C(RecyclerView.C1726b0 b0Var) {
        return m6084d2(b0Var);
    }

    /* renamed from: C0 */
    public boolean mo5192C0() {
        return true;
    }

    /* renamed from: C2 */
    public boolean mo5193C2() {
        return this.f5008z;
    }

    /* renamed from: D */
    public int mo5147D(RecyclerView.C1726b0 b0Var) {
        return m6085e2(b0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public boolean mo5194D2() {
        return mo5692m0() == 1;
    }

    /* renamed from: E */
    public int mo5195E(RecyclerView.C1726b0 b0Var) {
        return m6083c2(b0Var);
    }

    /* renamed from: E2 */
    public boolean mo5196E2() {
        return this.f4995C;
    }

    /* renamed from: F */
    public int mo5148F(RecyclerView.C1726b0 b0Var) {
        return m6084d2(b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F2 */
    public void mo5149F2(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, C1719c cVar, C1718b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        View d = cVar.mo5247d(wVar);
        if (d == null) {
            bVar.f5018b = true;
            return;
        }
        RecyclerView.C1752q qVar = (RecyclerView.C1752q) d.getLayoutParams();
        if (cVar.f5032l == null) {
            boolean z3 = this.f4993A;
            if (cVar.f5026f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                mo5694n(d);
            } else {
                mo5696o(d, 0);
            }
        } else {
            boolean z4 = this.f4993A;
            if (cVar.f5026f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                mo5688l(d);
            } else {
                mo5691m(d, 0);
            }
        }
        mo5639L0(d, 0, 0);
        bVar.f5017a = this.f5006x.mo6035e(d);
        if (this.f5004v == 1) {
            if (mo5194D2()) {
                i5 = mo5716x0() - getPaddingRight();
                i4 = i5 - this.f5006x.mo6036f(d);
            } else {
                i4 = getPaddingLeft();
                i5 = this.f5006x.mo6036f(d) + i4;
            }
            if (cVar.f5026f == -1) {
                int i6 = cVar.f5022b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f5017a;
            } else {
                int i7 = cVar.f5022b;
                i3 = i7;
                i2 = i5;
                i = bVar.f5017a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f = this.f5006x.mo6036f(d) + paddingTop;
            if (cVar.f5026f == -1) {
                int i8 = cVar.f5022b;
                i2 = i8;
                i3 = paddingTop;
                i = f;
                i4 = i8 - bVar.f5017a;
            } else {
                int i9 = cVar.f5022b;
                i3 = paddingTop;
                i2 = bVar.f5017a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo5637K0(d, i4, i3, i2, i);
        if (qVar.mo5731e() || qVar.mo5730d()) {
            bVar.f5019c = true;
        }
        bVar.f5020d = d.hasFocusable();
    }

    /* renamed from: G */
    public int mo5150G(RecyclerView.C1726b0 b0Var) {
        return m6085e2(b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H2 */
    public void mo5151H2(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, C1717a aVar, int i) {
    }

    /* renamed from: I1 */
    public int mo5152I1(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        if (this.f5004v == 1) {
            return 0;
        }
        return mo5200O2(i, wVar, b0Var);
    }

    /* renamed from: J1 */
    public void mo5197J1(int i) {
        this.f4996D = i;
        this.f4997E = Integer.MIN_VALUE;
        SavedState savedState = this.f4999G;
        if (savedState != null) {
            savedState.mo5230b();
        }
        mo5629F1();
    }

    /* renamed from: K1 */
    public int mo5153K1(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        if (this.f5004v == 0) {
            return 0;
        }
        return mo5200O2(i, wVar, b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M2 */
    public boolean mo5198M2() {
        if (this.f5006x.mo6042l() == 0 && this.f5006x.mo6038h() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public View mo5199O(int i) {
        int V = mo5660V();
        if (V == 0) {
            return null;
        }
        int q0 = i - mo5700q0(mo5658U(0));
        if (q0 >= 0 && q0 < V) {
            View U = mo5658U(q0);
            if (mo5700q0(U) == i) {
                return U;
            }
        }
        return super.mo5199O(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O2 */
    public int mo5200O2(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        int i2;
        if (mo5660V() == 0 || i == 0) {
            return 0;
        }
        mo5213h2();
        this.f5005w.f5021a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m6078X2(i2, abs, true, b0Var);
        C1719c cVar = this.f5005w;
        int i22 = cVar.f5027g + mo5214i2(wVar, cVar, b0Var, false);
        if (i22 < 0) {
            return 0;
        }
        if (abs > i22) {
            i = i2 * i22;
        }
        this.f5006x.mo6049s(-i);
        this.f5005w.f5031k = i;
        return i;
    }

    /* renamed from: P */
    public RecyclerView.C1752q mo5154P() {
        return new RecyclerView.C1752q(-2, -2);
    }

    /* renamed from: P2 */
    public void mo5201P2(int i, int i2) {
        this.f4996D = i;
        this.f4997E = i2;
        SavedState savedState = this.f4999G;
        if (savedState != null) {
            savedState.mo5230b();
        }
        mo5629F1();
    }

    /* renamed from: Q2 */
    public void mo5202Q2(int i) {
        this.f5002J = i;
    }

    /* renamed from: R2 */
    public void mo5203R2(int i) {
        if (i == 0 || i == 1) {
            mo5222q((String) null);
            if (i != this.f5004v || this.f5006x == null) {
                C1824r b = C1824r.m7052b(this, i);
                this.f5006x = b;
                this.f5000H.f5012a = b;
                this.f5004v = i;
                mo5629F1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: S2 */
    public void mo5204S2(boolean z) {
        mo5222q((String) null);
        if (z != this.f5008z) {
            this.f5008z = z;
            mo5629F1();
        }
    }

    /* renamed from: T0 */
    public void mo5205T0(RecyclerView recyclerView, RecyclerView.C1759w wVar) {
        super.mo5205T0(recyclerView, wVar);
        if (this.f4998F) {
            mo5715w1(wVar);
            wVar.mo5772d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T1 */
    public boolean mo5206T1() {
        if (mo5685j0() == 1073741824 || mo5718y0() == 1073741824 || !mo5720z0()) {
            return false;
        }
        return true;
    }

    /* renamed from: T2 */
    public void mo5158T2(boolean z) {
        mo5222q((String) null);
        if (this.f4994B != z) {
            this.f4994B = z;
            mo5629F1();
        }
    }

    /* renamed from: U0 */
    public View mo5159U0(View view, int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        int f2;
        View view2;
        View view3;
        m6074N2();
        if (mo5660V() == 0 || (f2 = mo5211f2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo5213h2();
        m6078X2(f2, (int) (((float) this.f5006x.mo6045o()) * 0.33333334f), false, b0Var);
        C1719c cVar = this.f5005w;
        cVar.f5027g = Integer.MIN_VALUE;
        cVar.f5021a = false;
        mo5214i2(wVar, cVar, b0Var, true);
        if (f2 == -1) {
            view2 = m6089u2();
        } else {
            view2 = m6088t2();
        }
        if (f2 == -1) {
            view3 = m6093z2();
        } else {
            view3 = m6092y2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: V0 */
    public void mo5207V0(AccessibilityEvent accessibilityEvent) {
        super.mo5207V0(accessibilityEvent);
        if (mo5660V() > 0) {
            accessibilityEvent.setFromIndex(mo5219n2());
            accessibilityEvent.setToIndex(mo5223q2());
        }
    }

    /* renamed from: V1 */
    public void mo5208V1(RecyclerView recyclerView, RecyclerView.C1726b0 b0Var, int i) {
        C1817m mVar = new C1817m(recyclerView.getContext());
        mVar.mo5452p(i);
        mo5662W1(mVar);
    }

    /* renamed from: Z1 */
    public boolean mo5162Z1() {
        return this.f4999G == null && this.f5007y == this.f4994B;
    }

    /* renamed from: a */
    public PointF mo5209a(int i) {
        if (mo5660V() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo5700q0(mo5658U(0))) {
            z = true;
        }
        if (z != this.f4993A) {
            i2 = -1;
        }
        if (this.f5004v == 0) {
            return new PointF((float) i2, Utils.FLOAT_EPSILON);
        }
        return new PointF(Utils.FLOAT_EPSILON, (float) i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a2 */
    public void mo5210a2(RecyclerView.C1726b0 b0Var, int[] iArr) {
        int i;
        int A2 = mo5189A2(b0Var);
        if (this.f5005w.f5026f == -1) {
            i = 0;
        } else {
            i = A2;
            A2 = 0;
        }
        iArr[0] = A2;
        iArr[1] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b2 */
    public void mo5164b2(RecyclerView.C1726b0 b0Var, C1719c cVar, RecyclerView.C1747p.C1750c cVar2) {
        int i = cVar.f5024d;
        if (i >= 0 && i < b0Var.mo5461b()) {
            cVar2.mo5727a(i, Math.max(0, cVar.f5027g));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f2 */
    public int mo5211f2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.f5004v == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f5004v == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f5004v == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f5004v == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f5004v != 1 && mo5194D2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f5004v != 1 && mo5194D2()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g2 */
    public C1719c mo5212g2() {
        return new C1719c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h2 */
    public void mo5213h2() {
        if (this.f5005w == null) {
            this.f5005w = mo5212g2();
        }
    }

    /* renamed from: i1 */
    public void mo5170i1(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View O;
        int i8;
        int i9;
        int i12 = -1;
        if (!(this.f4999G == null && this.f4996D == -1) && b0Var.mo5461b() == 0) {
            mo5715w1(wVar);
            return;
        }
        SavedState savedState = this.f4999G;
        if (savedState != null && savedState.mo5229a()) {
            this.f4996D = this.f4999G.f5009d;
        }
        mo5213h2();
        this.f5005w.f5021a = false;
        m6074N2();
        View h0 = mo5683h0();
        C1717a aVar = this.f5000H;
        if (!aVar.f5016e || this.f4996D != -1 || this.f4999G != null) {
            aVar.mo5241e();
            C1717a aVar2 = this.f5000H;
            aVar2.f5015d = this.f4993A ^ this.f4994B;
            m6077W2(wVar, b0Var, aVar2);
            this.f5000H.f5016e = true;
        } else if (h0 != null && (this.f5006x.mo6037g(h0) >= this.f5006x.mo6039i() || this.f5006x.mo6034d(h0) <= this.f5006x.mo6044n())) {
            this.f5000H.mo5239c(h0, mo5700q0(h0));
        }
        C1719c cVar = this.f5005w;
        if (cVar.f5031k >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        cVar.f5026f = i;
        int[] iArr = this.f5003K;
        iArr[0] = 0;
        iArr[1] = 0;
        mo5210a2(b0Var, iArr);
        int max = Math.max(0, this.f5003K[0]) + this.f5006x.mo6044n();
        int max2 = Math.max(0, this.f5003K[1]) + this.f5006x.mo6040j();
        if (!(!b0Var.mo5464e() || (i7 = this.f4996D) == -1 || this.f4997E == Integer.MIN_VALUE || (O = mo5199O(i7)) == null)) {
            if (this.f4993A) {
                i8 = this.f5006x.mo6039i() - this.f5006x.mo6034d(O);
                i9 = this.f4997E;
            } else {
                i9 = this.f5006x.mo6037g(O) - this.f5006x.mo6044n();
                i8 = this.f4997E;
            }
            int i13 = i8 - i9;
            if (i13 > 0) {
                max += i13;
            } else {
                max2 -= i13;
            }
        }
        C1717a aVar3 = this.f5000H;
        if (!aVar3.f5015d ? !this.f4993A : this.f4993A) {
            i12 = 1;
        }
        mo5151H2(wVar, b0Var, aVar3, i12);
        mo5632H(wVar);
        this.f5005w.f5033m = mo5198M2();
        this.f5005w.f5030j = b0Var.mo5464e();
        this.f5005w.f5029i = 0;
        C1717a aVar4 = this.f5000H;
        if (aVar4.f5015d) {
            m6082b3(aVar4);
            C1719c cVar2 = this.f5005w;
            cVar2.f5028h = max;
            mo5214i2(wVar, cVar2, b0Var, false);
            C1719c cVar3 = this.f5005w;
            i3 = cVar3.f5022b;
            int i14 = cVar3.f5024d;
            int i15 = cVar3.f5023c;
            if (i15 > 0) {
                max2 += i15;
            }
            m6080Z2(this.f5000H);
            C1719c cVar4 = this.f5005w;
            cVar4.f5028h = max2;
            cVar4.f5024d += cVar4.f5025e;
            mo5214i2(wVar, cVar4, b0Var, false);
            C1719c cVar5 = this.f5005w;
            i2 = cVar5.f5022b;
            int i16 = cVar5.f5023c;
            if (i16 > 0) {
                m6081a3(i14, i3);
                C1719c cVar6 = this.f5005w;
                cVar6.f5028h = i16;
                mo5214i2(wVar, cVar6, b0Var, false);
                i3 = this.f5005w.f5022b;
            }
        } else {
            m6080Z2(aVar4);
            C1719c cVar7 = this.f5005w;
            cVar7.f5028h = max2;
            mo5214i2(wVar, cVar7, b0Var, false);
            C1719c cVar8 = this.f5005w;
            i2 = cVar8.f5022b;
            int i17 = cVar8.f5024d;
            int i18 = cVar8.f5023c;
            if (i18 > 0) {
                max += i18;
            }
            m6082b3(this.f5000H);
            C1719c cVar9 = this.f5005w;
            cVar9.f5028h = max;
            cVar9.f5024d += cVar9.f5025e;
            mo5214i2(wVar, cVar9, b0Var, false);
            C1719c cVar10 = this.f5005w;
            i3 = cVar10.f5022b;
            int i19 = cVar10.f5023c;
            if (i19 > 0) {
                m6079Y2(i17, i2);
                C1719c cVar11 = this.f5005w;
                cVar11.f5028h = i19;
                mo5214i2(wVar, cVar11, b0Var, false);
                i2 = this.f5005w.f5022b;
            }
        }
        if (mo5660V() > 0) {
            if (this.f4993A ^ this.f4994B) {
                int w2 = m6090w2(i2, wVar, b0Var, true);
                i5 = i3 + w2;
                i4 = i2 + w2;
                i6 = m6091x2(i5, wVar, b0Var, false);
            } else {
                int x2 = m6091x2(i3, wVar, b0Var, true);
                i5 = i3 + x2;
                i4 = i2 + x2;
                i6 = m6090w2(i4, wVar, b0Var, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        m6069G2(wVar, b0Var, i3, i2);
        if (!b0Var.mo5464e()) {
            this.f5006x.mo6050t();
        } else {
            this.f5000H.mo5241e();
        }
        this.f5007y = this.f4994B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i2 */
    public int mo5214i2(RecyclerView.C1759w wVar, C1719c cVar, RecyclerView.C1726b0 b0Var, boolean z) {
        int i = cVar.f5023c;
        int i2 = cVar.f5027g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f5027g = i2 + i;
            }
            m6070I2(wVar, cVar);
        }
        int i3 = cVar.f5023c + cVar.f5028h;
        C1718b bVar = this.f5001I;
        while (true) {
            if ((!cVar.f5033m && i3 <= 0) || !cVar.mo5246c(b0Var)) {
                break;
            }
            bVar.mo5243a();
            mo5149F2(wVar, b0Var, cVar, bVar);
            if (!bVar.f5018b) {
                cVar.f5022b += bVar.f5017a * cVar.f5026f;
                if (!bVar.f5019c || cVar.f5032l != null || !b0Var.mo5464e()) {
                    int i4 = cVar.f5023c;
                    int i5 = bVar.f5017a;
                    cVar.f5023c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f5027g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f5017a;
                    cVar.f5027g = i7;
                    int i8 = cVar.f5023c;
                    if (i8 < 0) {
                        cVar.f5027g = i7 + i8;
                    }
                    m6070I2(wVar, cVar);
                }
                if (z && bVar.f5020d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f5023c;
    }

    /* renamed from: j1 */
    public void mo5171j1(RecyclerView.C1726b0 b0Var) {
        super.mo5171j1(b0Var);
        this.f4999G = null;
        this.f4996D = -1;
        this.f4997E = Integer.MIN_VALUE;
        this.f5000H.mo5241e();
    }

    /* renamed from: j2 */
    public int mo5215j2() {
        View s2 = mo5225s2(0, mo5660V(), true, false);
        if (s2 == null) {
            return -1;
        }
        return mo5700q0(s2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l2 */
    public View mo5216l2(boolean z, boolean z2) {
        if (this.f4993A) {
            return mo5225s2(0, mo5660V(), z, z2);
        }
        return mo5225s2(mo5660V() - 1, -1, z, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m2 */
    public View mo5217m2(boolean z, boolean z2) {
        if (this.f4993A) {
            return mo5225s2(mo5660V() - 1, -1, z, z2);
        }
        return mo5225s2(0, mo5660V(), z, z2);
    }

    /* renamed from: n1 */
    public void mo5218n1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f4999G = savedState;
            if (this.f4996D != -1) {
                savedState.mo5230b();
            }
            mo5629F1();
        }
    }

    /* renamed from: n2 */
    public int mo5219n2() {
        View s2 = mo5225s2(0, mo5660V(), false, true);
        if (s2 == null) {
            return -1;
        }
        return mo5700q0(s2);
    }

    /* renamed from: o1 */
    public Parcelable mo5220o1() {
        if (this.f4999G != null) {
            return new SavedState(this.f4999G);
        }
        SavedState savedState = new SavedState();
        if (mo5660V() > 0) {
            mo5213h2();
            boolean z = this.f5007y ^ this.f4993A;
            savedState.f5011f = z;
            if (z) {
                View y2 = m6092y2();
                savedState.f5010e = this.f5006x.mo6039i() - this.f5006x.mo6034d(y2);
                savedState.f5009d = mo5700q0(y2);
            } else {
                View z2 = m6093z2();
                savedState.f5009d = mo5700q0(z2);
                savedState.f5010e = this.f5006x.mo6037g(z2) - this.f5006x.mo6044n();
            }
        } else {
            savedState.mo5230b();
        }
        return savedState;
    }

    /* renamed from: o2 */
    public int mo5221o2() {
        View s2 = mo5225s2(mo5660V() - 1, -1, true, false);
        if (s2 == null) {
            return -1;
        }
        return mo5700q0(s2);
    }

    /* renamed from: q */
    public void mo5222q(String str) {
        if (this.f4999G == null) {
            super.mo5222q(str);
        }
    }

    /* renamed from: q2 */
    public int mo5223q2() {
        View s2 = mo5225s2(mo5660V() - 1, -1, false, true);
        if (s2 == null) {
            return -1;
        }
        return mo5700q0(s2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r2 */
    public View mo5224r2(int i, int i2) {
        char c;
        int i3;
        int i4;
        mo5213h2();
        if (i2 > i) {
            c = 1;
        } else if (i2 < i) {
            c = 65535;
        } else {
            c = 0;
        }
        if (c == 0) {
            return mo5658U(i);
        }
        if (this.f5006x.mo6037g(mo5658U(i)) < this.f5006x.mo6044n()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f5004v == 0) {
            return this.f5186h.mo6077a(i, i2, i4, i3);
        }
        return this.f5187i.mo6077a(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s2 */
    public View mo5225s2(int i, int i2, boolean z, boolean z2) {
        int i3;
        mo5213h2();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.f5004v == 0) {
            return this.f5186h.mo6077a(i, i2, i3, i4);
        }
        return this.f5187i.mo6077a(i, i2, i3, i4);
    }

    /* renamed from: v */
    public boolean mo5226v() {
        return this.f5004v == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v2 */
    public View mo5177v2(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        mo5213h2();
        int V = mo5660V();
        if (z2) {
            i3 = mo5660V() - 1;
            i2 = -1;
            i = -1;
        } else {
            i2 = V;
            i3 = 0;
            i = 1;
        }
        int b = b0Var.mo5461b();
        int n = this.f5006x.mo6044n();
        int i4 = this.f5006x.mo6039i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i3 != i2) {
            View U = mo5658U(i3);
            int q0 = mo5700q0(U);
            int g = this.f5006x.mo6037g(U);
            int d = this.f5006x.mo6034d(U);
            if (q0 >= 0 && q0 < b) {
                if (!((RecyclerView.C1752q) U.getLayoutParams()).mo5731e()) {
                    if (d > n || g >= n) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (g < i4 || d <= i4) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z3 && !z4) {
                        return U;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = U;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = U;
                    }
                    view2 = U;
                } else if (view3 == null) {
                    view3 = U;
                }
            }
            i3 += i;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    /* renamed from: w */
    public boolean mo5227w() {
        return this.f5004v == 1;
    }

    /* renamed from: z */
    public void mo5228z(int i, int i2, RecyclerView.C1726b0 b0Var, RecyclerView.C1747p.C1750c cVar) {
        int i3;
        if (this.f5004v != 0) {
            i = i2;
        }
        if (mo5660V() != 0 && i != 0) {
            mo5213h2();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            m6078X2(i3, Math.abs(i), true, b0Var);
            mo5164b2(b0Var, this.f5005w, cVar);
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f5004v = 1;
        this.f5008z = false;
        this.f4993A = false;
        this.f4994B = false;
        this.f4995C = true;
        this.f4996D = -1;
        this.f4997E = Integer.MIN_VALUE;
        this.f4999G = null;
        this.f5000H = new C1717a();
        this.f5001I = new C1718b();
        this.f5002J = 2;
        this.f5003K = new int[2];
        mo5203R2(i);
        mo5204S2(z);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f5004v = 1;
        this.f5008z = false;
        this.f4993A = false;
        this.f4994B = false;
        this.f4995C = true;
        this.f4996D = -1;
        this.f4997E = Integer.MIN_VALUE;
        this.f4999G = null;
        this.f5000H = new C1717a();
        this.f5001I = new C1718b();
        this.f5002J = 2;
        this.f5003K = new int[2];
        RecyclerView.C1747p.C1751d r0 = RecyclerView.C1747p.m6431r0(context, attributeSet, i, i2);
        mo5203R2(r0.f5202a);
        mo5204S2(r0.f5204c);
        mo5158T2(r0.f5205d);
    }
}
