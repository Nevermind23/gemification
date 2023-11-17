package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.C1747p implements RecyclerView.C1722a0.C1724b {

    /* renamed from: A */
    private int f5226A;

    /* renamed from: B */
    private final C1816l f5227B;

    /* renamed from: C */
    boolean f5228C = false;

    /* renamed from: D */
    boolean f5229D = false;

    /* renamed from: E */
    private BitSet f5230E;

    /* renamed from: F */
    int f5231F = -1;

    /* renamed from: G */
    int f5232G = Integer.MIN_VALUE;

    /* renamed from: H */
    LazySpanLookup f5233H = new LazySpanLookup();

    /* renamed from: I */
    private int f5234I = 2;

    /* renamed from: J */
    private boolean f5235J;

    /* renamed from: K */
    private boolean f5236K;

    /* renamed from: L */
    private SavedState f5237L;

    /* renamed from: M */
    private int f5238M;

    /* renamed from: N */
    private final Rect f5239N = new Rect();

    /* renamed from: O */
    private final C1766b f5240O = new C1766b();

    /* renamed from: P */
    private boolean f5241P = false;

    /* renamed from: Q */
    private boolean f5242Q = true;

    /* renamed from: R */
    private int[] f5243R;

    /* renamed from: S */
    private final Runnable f5244S = new C1765a();

    /* renamed from: v */
    private int f5245v = -1;

    /* renamed from: w */
    C1768d[] f5246w;

    /* renamed from: x */
    C1824r f5247x;

    /* renamed from: y */
    C1824r f5248y;

    /* renamed from: z */
    private int f5249z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1764a();

        /* renamed from: d */
        int f5256d;

        /* renamed from: e */
        int f5257e;

        /* renamed from: f */
        int f5258f;

        /* renamed from: g */
        int[] f5259g;

        /* renamed from: h */
        int f5260h;

        /* renamed from: i */
        int[] f5261i;

        /* renamed from: j */
        List f5262j;

        /* renamed from: k */
        boolean f5263k;

        /* renamed from: l */
        boolean f5264l;

        /* renamed from: m */
        boolean f5265m;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        class C1764a implements Parcelable.Creator {
            C1764a() {
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
        public void mo5833a() {
            this.f5259g = null;
            this.f5258f = 0;
            this.f5256d = -1;
            this.f5257e = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5834b() {
            this.f5259g = null;
            this.f5258f = 0;
            this.f5260h = 0;
            this.f5261i = null;
            this.f5262j = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5256d);
            parcel.writeInt(this.f5257e);
            parcel.writeInt(this.f5258f);
            if (this.f5258f > 0) {
                parcel.writeIntArray(this.f5259g);
            }
            parcel.writeInt(this.f5260h);
            if (this.f5260h > 0) {
                parcel.writeIntArray(this.f5261i);
            }
            parcel.writeInt(this.f5263k ? 1 : 0);
            parcel.writeInt(this.f5264l ? 1 : 0);
            parcel.writeInt(this.f5265m ? 1 : 0);
            parcel.writeList(this.f5262j);
        }

        SavedState(Parcel parcel) {
            this.f5256d = parcel.readInt();
            this.f5257e = parcel.readInt();
            int readInt = parcel.readInt();
            this.f5258f = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f5259g = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f5260h = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f5261i = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f5263k = parcel.readInt() == 1;
            this.f5264l = parcel.readInt() == 1;
            this.f5265m = parcel.readInt() == 1 ? true : z;
            this.f5262j = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f5258f = savedState.f5258f;
            this.f5256d = savedState.f5256d;
            this.f5257e = savedState.f5257e;
            this.f5259g = savedState.f5259g;
            this.f5260h = savedState.f5260h;
            this.f5261i = savedState.f5261i;
            this.f5263k = savedState.f5263k;
            this.f5264l = savedState.f5264l;
            this.f5265m = savedState.f5265m;
            this.f5262j = savedState.f5262j;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C1765a implements Runnable {
        C1765a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo5806g2();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C1766b {

        /* renamed from: a */
        int f5267a;

        /* renamed from: b */
        int f5268b;

        /* renamed from: c */
        boolean f5269c;

        /* renamed from: d */
        boolean f5270d;

        /* renamed from: e */
        boolean f5271e;

        /* renamed from: f */
        int[] f5272f;

        C1766b() {
            mo5844c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5842a() {
            int i;
            if (this.f5269c) {
                i = StaggeredGridLayoutManager.this.f5247x.mo6039i();
            } else {
                i = StaggeredGridLayoutManager.this.f5247x.mo6044n();
            }
            this.f5268b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5843b(int i) {
            if (this.f5269c) {
                this.f5268b = StaggeredGridLayoutManager.this.f5247x.mo6039i() - i;
            } else {
                this.f5268b = StaggeredGridLayoutManager.this.f5247x.mo6044n() + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5844c() {
            this.f5267a = -1;
            this.f5268b = Integer.MIN_VALUE;
            this.f5269c = false;
            this.f5270d = false;
            this.f5271e = false;
            int[] iArr = this.f5272f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5845d(C1768d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f5272f;
            if (iArr == null || iArr.length < length) {
                this.f5272f = new int[StaggeredGridLayoutManager.this.f5246w.length];
            }
            for (int i = 0; i < length; i++) {
                this.f5272f[i] = dVarArr[i].mo5864r(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C1767c extends RecyclerView.C1752q {

        /* renamed from: h */
        C1768d f5274h;

        /* renamed from: i */
        boolean f5275i;

        public C1767c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: g */
        public boolean mo5846g() {
            return this.f5275i;
        }

        public C1767c(int i, int i2) {
            super(i, i2);
        }

        public C1767c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1767c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    class C1768d {

        /* renamed from: a */
        ArrayList f5276a = new ArrayList();

        /* renamed from: b */
        int f5277b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f5278c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f5279d = 0;

        /* renamed from: e */
        final int f5280e;

        C1768d(int i) {
            this.f5280e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5847a(View view) {
            C1767c p = mo5862p(view);
            p.f5274h = this;
            this.f5276a.add(view);
            this.f5278c = Integer.MIN_VALUE;
            if (this.f5276a.size() == 1) {
                this.f5277b = Integer.MIN_VALUE;
            }
            if (p.mo5731e() || p.mo5730d()) {
                this.f5279d += StaggeredGridLayoutManager.this.f5247x.mo6035e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5848b(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo5860n(Integer.MIN_VALUE);
            } else {
                i2 = mo5864r(Integer.MIN_VALUE);
            }
            mo5851e();
            if (i2 != Integer.MIN_VALUE) {
                if (z && i2 < StaggeredGridLayoutManager.this.f5247x.mo6039i()) {
                    return;
                }
                if (z || i2 <= StaggeredGridLayoutManager.this.f5247x.mo6044n()) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f5278c = i2;
                    this.f5277b = i2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5849c() {
            LazySpanLookup.FullSpanItem f;
            ArrayList arrayList = this.f5276a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            C1767c p = mo5862p(view);
            this.f5278c = StaggeredGridLayoutManager.this.f5247x.mo6034d(view);
            if (p.f5275i && (f = StaggeredGridLayoutManager.this.f5233H.mo5818f(p.mo5729b())) != null && f.f5253e == 1) {
                this.f5278c += f.mo5825a(this.f5280e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5850d() {
            LazySpanLookup.FullSpanItem f;
            View view = (View) this.f5276a.get(0);
            C1767c p = mo5862p(view);
            this.f5277b = StaggeredGridLayoutManager.this.f5247x.mo6037g(view);
            if (p.f5275i && (f = StaggeredGridLayoutManager.this.f5233H.mo5818f(p.mo5729b())) != null && f.f5253e == -1) {
                this.f5277b -= f.mo5825a(this.f5280e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5851e() {
            this.f5276a.clear();
            mo5865s();
            this.f5279d = 0;
        }

        /* renamed from: f */
        public int mo5852f() {
            if (StaggeredGridLayoutManager.this.f5228C) {
                return mo5856j(this.f5276a.size() - 1, -1, true);
            }
            return mo5856j(0, this.f5276a.size(), true);
        }

        /* renamed from: g */
        public int mo5853g() {
            if (StaggeredGridLayoutManager.this.f5228C) {
                return mo5856j(0, this.f5276a.size(), true);
            }
            return mo5856j(this.f5276a.size() - 1, -1, true);
        }

        /* renamed from: h */
        public int mo5854h() {
            if (StaggeredGridLayoutManager.this.f5228C) {
                return mo5857k(0, this.f5276a.size(), false);
            }
            return mo5857k(this.f5276a.size() - 1, -1, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo5855i(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int n = StaggeredGridLayoutManager.this.f5247x.mo6044n();
            int i4 = StaggeredGridLayoutManager.this.f5247x.mo6039i();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = (View) this.f5276a.get(i);
                int g = StaggeredGridLayoutManager.this.f5247x.mo6037g(view);
                int d = StaggeredGridLayoutManager.this.f5247x.mo6034d(view);
                boolean z5 = false;
                if (!z3 ? g >= i4 : g > i4) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 ? d > n : d >= n) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.mo5700q0(view);
                        }
                        if (g < n || d > i4) {
                            return StaggeredGridLayoutManager.this.mo5700q0(view);
                        }
                    } else if (g >= n && d <= i4) {
                        return StaggeredGridLayoutManager.this.mo5700q0(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo5856j(int i, int i2, boolean z) {
            return mo5855i(i, i2, false, false, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo5857k(int i, int i2, boolean z) {
            return mo5855i(i, i2, z, true, false);
        }

        /* renamed from: l */
        public int mo5858l() {
            return this.f5279d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public int mo5859m() {
            int i = this.f5278c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5849c();
            return this.f5278c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public int mo5860n(int i) {
            int i2 = this.f5278c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f5276a.size() == 0) {
                return i;
            }
            mo5849c();
            return this.f5278c;
        }

        /* renamed from: o */
        public View mo5861o(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f5276a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f5276a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f5228C && staggeredGridLayoutManager.mo5700q0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f5228C && staggeredGridLayoutManager2.mo5700q0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f5276a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f5276a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f5228C && staggeredGridLayoutManager3.mo5700q0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f5228C && staggeredGridLayoutManager4.mo5700q0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public C1767c mo5862p(View view) {
            return (C1767c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public int mo5863q() {
            int i = this.f5277b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5850d();
            return this.f5277b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public int mo5864r(int i) {
            int i2 = this.f5277b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f5276a.size() == 0) {
                return i;
            }
            mo5850d();
            return this.f5277b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo5865s() {
            this.f5277b = Integer.MIN_VALUE;
            this.f5278c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo5866t(int i) {
            int i2 = this.f5277b;
            if (i2 != Integer.MIN_VALUE) {
                this.f5277b = i2 + i;
            }
            int i3 = this.f5278c;
            if (i3 != Integer.MIN_VALUE) {
                this.f5278c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo5867u() {
            int size = this.f5276a.size();
            View view = (View) this.f5276a.remove(size - 1);
            C1767c p = mo5862p(view);
            p.f5274h = null;
            if (p.mo5731e() || p.mo5730d()) {
                this.f5279d -= StaggeredGridLayoutManager.this.f5247x.mo6035e(view);
            }
            if (size == 1) {
                this.f5277b = Integer.MIN_VALUE;
            }
            this.f5278c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5868v() {
            View view = (View) this.f5276a.remove(0);
            C1767c p = mo5862p(view);
            p.f5274h = null;
            if (this.f5276a.size() == 0) {
                this.f5278c = Integer.MIN_VALUE;
            }
            if (p.mo5731e() || p.mo5730d()) {
                this.f5279d -= StaggeredGridLayoutManager.this.f5247x.mo6035e(view);
            }
            this.f5277b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo5869w(View view) {
            C1767c p = mo5862p(view);
            p.f5274h = this;
            this.f5276a.add(0, view);
            this.f5277b = Integer.MIN_VALUE;
            if (this.f5276a.size() == 1) {
                this.f5278c = Integer.MIN_VALUE;
            }
            if (p.mo5731e() || p.mo5730d()) {
                this.f5279d += StaggeredGridLayoutManager.this.f5247x.mo6035e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo5870x(int i) {
            this.f5277b = i;
            this.f5278c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.C1747p.C1751d r0 = RecyclerView.C1747p.m6431r0(context, attributeSet, i, i2);
        mo5798W2(r0.f5202a);
        mo5800Y2(r0.f5203b);
        mo5799X2(r0.f5204c);
        this.f5227B = new C1816l();
        m6694o2();
    }

    /* renamed from: A2 */
    private int m6661A2(int i) {
        int n = this.f5246w[0].mo5860n(i);
        for (int i2 = 1; i2 < this.f5245v; i2++) {
            int n2 = this.f5246w[i2].mo5860n(i);
            if (n2 > n) {
                n = n2;
            }
        }
        return n;
    }

    /* renamed from: B2 */
    private int m6662B2(int i) {
        int r = this.f5246w[0].mo5864r(i);
        for (int i2 = 1; i2 < this.f5245v; i2++) {
            int r2 = this.f5246w[i2].mo5864r(i);
            if (r2 > r) {
                r = r2;
            }
        }
        return r;
    }

    /* renamed from: C2 */
    private int m6663C2(int i) {
        int n = this.f5246w[0].mo5860n(i);
        for (int i2 = 1; i2 < this.f5245v; i2++) {
            int n2 = this.f5246w[i2].mo5860n(i);
            if (n2 < n) {
                n = n2;
            }
        }
        return n;
    }

    /* renamed from: D2 */
    private int m6664D2(int i) {
        int r = this.f5246w[0].mo5864r(i);
        for (int i2 = 1; i2 < this.f5245v; i2++) {
            int r2 = this.f5246w[i2].mo5864r(i);
            if (r2 < r) {
                r = r2;
            }
        }
        return r;
    }

    /* renamed from: E2 */
    private C1768d m6665E2(C1816l lVar) {
        int i;
        int i2;
        int i3;
        if (m6670M2(lVar.f5465e)) {
            i3 = this.f5245v - 1;
            i2 = -1;
            i = -1;
        } else {
            i2 = this.f5245v;
            i3 = 0;
            i = 1;
        }
        C1768d dVar = null;
        if (lVar.f5465e == 1) {
            int n = this.f5247x.mo6044n();
            int i4 = Integer.MAX_VALUE;
            while (i3 != i2) {
                C1768d dVar2 = this.f5246w[i3];
                int n2 = dVar2.mo5860n(n);
                if (n2 < i4) {
                    dVar = dVar2;
                    i4 = n2;
                }
                i3 += i;
            }
            return dVar;
        }
        int i5 = this.f5247x.mo6039i();
        int i6 = Integer.MIN_VALUE;
        while (i3 != i2) {
            C1768d dVar3 = this.f5246w[i3];
            int r = dVar3.mo5864r(i5);
            if (r > i6) {
                dVar = dVar3;
                i6 = r;
            }
            i3 += i;
        }
        return dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: F2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6666F2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f5229D
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo5812z2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo5811y2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f5233H
            r4.mo5820h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f5233H
            r9.mo5822k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f5233H
            r7.mo5821j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f5233H
            r9.mo5822k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f5233H
            r9.mo5821j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f5229D
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo5811y2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo5812z2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo5629F1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6666F2(int, int, int):void");
    }

    /* renamed from: J2 */
    private void m6667J2(View view, int i, int i2, boolean z) {
        boolean z2;
        mo5709u(view, this.f5239N);
        C1767c cVar = (C1767c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f5239N;
        int g3 = m6686g3(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f5239N;
        int g32 = m6686g3(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z) {
            z2 = mo5659U1(view, g3, g32, cVar);
        } else {
            z2 = mo5656S1(view, g3, g32, cVar);
        }
        if (z2) {
            view.measure(g3, g32);
        }
    }

    /* renamed from: K2 */
    private void m6668K2(View view, C1767c cVar, boolean z) {
        if (cVar.f5275i) {
            if (this.f5249z == 1) {
                m6667J2(view, this.f5238M, RecyclerView.C1747p.m6428W(mo5684i0(), mo5685j0(), getPaddingTop() + getPaddingBottom(), cVar.height, true), z);
            } else {
                m6667J2(view, RecyclerView.C1747p.m6428W(mo5716x0(), mo5718y0(), getPaddingLeft() + getPaddingRight(), cVar.width, true), this.f5238M, z);
            }
        } else if (this.f5249z == 1) {
            m6667J2(view, RecyclerView.C1747p.m6428W(this.f5226A, mo5718y0(), 0, cVar.width, false), RecyclerView.C1747p.m6428W(mo5684i0(), mo5685j0(), getPaddingTop() + getPaddingBottom(), cVar.height, true), z);
        } else {
            m6667J2(view, RecyclerView.C1747p.m6428W(mo5716x0(), mo5718y0(), getPaddingLeft() + getPaddingRight(), cVar.width, true), RecyclerView.C1747p.m6428W(this.f5226A, mo5685j0(), 0, cVar.height, false), z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (mo5806g2() != false) goto L_0x015b;
     */
    /* renamed from: L2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6669L2(androidx.recyclerview.widget.RecyclerView.C1759w r9, androidx.recyclerview.widget.RecyclerView.C1726b0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f5240O
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f5237L
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f5231F
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo5461b()
            if (r1 != 0) goto L_0x0018
            r8.mo5715w1(r9)
            r0.mo5844c()
            return
        L_0x0018:
            boolean r1 = r0.f5271e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f5231F
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f5237L
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo5844c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f5237L
            if (r5 == 0) goto L_0x0037
            r8.m6681b2(r0)
            goto L_0x003e
        L_0x0037:
            r8.m6676T2()
            boolean r5 = r8.f5229D
            r0.f5269c = r5
        L_0x003e:
            r8.mo5803c3(r10, r0)
            r0.f5271e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f5237L
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f5231F
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f5269c
            boolean r6 = r8.f5235J
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo5795I2()
            boolean r6 = r8.f5236K
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f5233H
            r5.mo5814b()
            r0.f5270d = r4
        L_0x0060:
            int r5 = r8.mo5660V()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f5237L
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f5258f
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f5270d
            if (r5 == 0) goto L_0x008e
            r1 = r3
        L_0x0073:
            int r5 = r8.f5245v
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f5246w
            r5 = r5[r1]
            r5.mo5851e()
            int r5 = r0.f5268b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r6 = r8.f5246w
            r6 = r6[r1]
            r6.mo5870x(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f5240O
            int[] r1 = r1.f5272f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r5 = r8.f5245v
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f5246w
            r5 = r5[r1]
            r5.mo5851e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f5240O
            int[] r6 = r6.f5272f
            r6 = r6[r1]
            r5.mo5870x(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = r3
        L_0x00b0:
            int r5 = r8.f5245v
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f5246w
            r5 = r5[r1]
            boolean r6 = r8.f5229D
            int r7 = r0.f5268b
            r5.mo5848b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f5240O
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f5246w
            r1.mo5845d(r5)
        L_0x00c9:
            r8.mo5632H(r9)
            androidx.recyclerview.widget.l r1 = r8.f5227B
            r1.f5461a = r3
            r8.f5241P = r3
            androidx.recyclerview.widget.r r1 = r8.f5248y
            int r1 = r1.mo6045o()
            r8.mo5805e3(r1)
            int r1 = r0.f5267a
            r8.m6682d3(r1, r10)
            boolean r1 = r0.f5269c
            if (r1 == 0) goto L_0x00fc
            r8.m6677V2(r2)
            androidx.recyclerview.widget.l r1 = r8.f5227B
            r8.m6695p2(r9, r1, r10)
            r8.m6677V2(r4)
            androidx.recyclerview.widget.l r1 = r8.f5227B
            int r2 = r0.f5267a
            int r5 = r1.f5464d
            int r2 = r2 + r5
            r1.f5463c = r2
            r8.m6695p2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.m6677V2(r4)
            androidx.recyclerview.widget.l r1 = r8.f5227B
            r8.m6695p2(r9, r1, r10)
            r8.m6677V2(r2)
            androidx.recyclerview.widget.l r1 = r8.f5227B
            int r2 = r0.f5267a
            int r5 = r1.f5464d
            int r2 = r2 + r5
            r1.f5463c = r2
            r8.m6695p2(r9, r1, r10)
        L_0x0113:
            r8.m6675S2()
            int r1 = r8.mo5660V()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f5229D
            if (r1 == 0) goto L_0x0127
            r8.m6698w2(r9, r10, r4)
            r8.m6699x2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.m6699x2(r9, r10, r4)
            r8.m6698w2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.mo5464e()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.f5234I
            if (r11 == 0) goto L_0x014b
            int r11 = r8.mo5660V()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.f5241P
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.mo5793G2()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = r4
            goto L_0x014c
        L_0x014b:
            r11 = r3
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.f5244S
            r8.mo5621A1(r11)
            boolean r11 = r8.mo5806g2()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = r3
        L_0x015b:
            boolean r11 = r10.mo5464e()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f5240O
            r11.mo5844c()
        L_0x0166:
            boolean r11 = r0.f5269c
            r8.f5235J = r11
            boolean r11 = r8.mo5795I2()
            r8.f5236K = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f5240O
            r11.mo5844c()
            r8.m6669L2(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m6669L2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    /* renamed from: M2 */
    private boolean m6670M2(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f5249z == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f5229D) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f5229D) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == mo5795I2()) {
            return true;
        }
        return false;
    }

    /* renamed from: O2 */
    private void m6671O2(View view) {
        for (int i = this.f5245v - 1; i >= 0; i--) {
            this.f5246w[i].mo5869w(view);
        }
    }

    /* renamed from: P2 */
    private void m6672P2(RecyclerView.C1759w wVar, C1816l lVar) {
        int i;
        int i2;
        if (lVar.f5461a && !lVar.f5469i) {
            if (lVar.f5462b == 0) {
                if (lVar.f5465e == -1) {
                    m6673Q2(wVar, lVar.f5467g);
                } else {
                    m6674R2(wVar, lVar.f5466f);
                }
            } else if (lVar.f5465e == -1) {
                int i3 = lVar.f5466f;
                int B2 = i3 - m6662B2(i3);
                if (B2 < 0) {
                    i2 = lVar.f5467g;
                } else {
                    i2 = lVar.f5467g - Math.min(B2, lVar.f5462b);
                }
                m6673Q2(wVar, i2);
            } else {
                int C2 = m6663C2(lVar.f5467g) - lVar.f5467g;
                if (C2 < 0) {
                    i = lVar.f5466f;
                } else {
                    i = Math.min(C2, lVar.f5462b) + lVar.f5466f;
                }
                m6674R2(wVar, i);
            }
        }
    }

    /* renamed from: Q2 */
    private void m6673Q2(RecyclerView.C1759w wVar, int i) {
        int V = mo5660V() - 1;
        while (V >= 0) {
            View U = mo5658U(V);
            if (this.f5247x.mo6037g(U) >= i && this.f5247x.mo6048r(U) >= i) {
                C1767c cVar = (C1767c) U.getLayoutParams();
                if (cVar.f5275i) {
                    int i2 = 0;
                    while (i2 < this.f5245v) {
                        if (this.f5246w[i2].f5276a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f5245v; i3++) {
                        this.f5246w[i3].mo5867u();
                    }
                } else if (cVar.f5274h.f5276a.size() != 1) {
                    cVar.f5274h.mo5867u();
                } else {
                    return;
                }
                mo5719y1(U, wVar);
                V--;
            } else {
                return;
            }
        }
    }

    /* renamed from: R2 */
    private void m6674R2(RecyclerView.C1759w wVar, int i) {
        while (mo5660V() > 0) {
            View U = mo5658U(0);
            if (this.f5247x.mo6034d(U) <= i && this.f5247x.mo6047q(U) <= i) {
                C1767c cVar = (C1767c) U.getLayoutParams();
                if (cVar.f5275i) {
                    int i2 = 0;
                    while (i2 < this.f5245v) {
                        if (this.f5246w[i2].f5276a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f5245v; i3++) {
                        this.f5246w[i3].mo5868v();
                    }
                } else if (cVar.f5274h.f5276a.size() != 1) {
                    cVar.f5274h.mo5868v();
                } else {
                    return;
                }
                mo5719y1(U, wVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: S2 */
    private void m6675S2() {
        if (this.f5248y.mo6042l() != 1073741824) {
            int V = mo5660V();
            float f = Utils.FLOAT_EPSILON;
            for (int i = 0; i < V; i++) {
                View U = mo5658U(i);
                float e = (float) this.f5248y.mo6035e(U);
                if (e >= f) {
                    if (((C1767c) U.getLayoutParams()).mo5846g()) {
                        e = (e * 1.0f) / ((float) this.f5245v);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f5226A;
            int round = Math.round(f * ((float) this.f5245v));
            if (this.f5248y.mo6042l() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f5248y.mo6045o());
            }
            mo5805e3(round);
            if (this.f5226A != i2) {
                for (int i3 = 0; i3 < V; i3++) {
                    View U2 = mo5658U(i3);
                    C1767c cVar = (C1767c) U2.getLayoutParams();
                    if (!cVar.f5275i) {
                        if (!mo5795I2() || this.f5249z != 1) {
                            int i4 = cVar.f5274h.f5280e;
                            int i5 = this.f5226A * i4;
                            int i6 = i4 * i2;
                            if (this.f5249z == 1) {
                                U2.offsetLeftAndRight(i5 - i6);
                            } else {
                                U2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f5245v;
                            int i8 = cVar.f5274h.f5280e;
                            U2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f5226A) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: T2 */
    private void m6676T2() {
        if (this.f5249z == 1 || !mo5795I2()) {
            this.f5229D = this.f5228C;
        } else {
            this.f5229D = !this.f5228C;
        }
    }

    /* renamed from: V2 */
    private void m6677V2(int i) {
        boolean z;
        C1816l lVar = this.f5227B;
        lVar.f5465e = i;
        boolean z2 = this.f5229D;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        lVar.f5464d = i2;
    }

    /* renamed from: Z2 */
    private void m6678Z2(int i, int i2) {
        for (int i3 = 0; i3 < this.f5245v; i3++) {
            if (!this.f5246w[i3].f5276a.isEmpty()) {
                m6685f3(this.f5246w[i3], i, i2);
            }
        }
    }

    /* renamed from: a2 */
    private void m6679a2(View view) {
        for (int i = this.f5245v - 1; i >= 0; i--) {
            this.f5246w[i].mo5847a(view);
        }
    }

    /* renamed from: a3 */
    private boolean m6680a3(RecyclerView.C1726b0 b0Var, C1766b bVar) {
        int i;
        if (this.f5235J) {
            i = m6697u2(b0Var.mo5461b());
        } else {
            i = m6696q2(b0Var.mo5461b());
        }
        bVar.f5267a = i;
        bVar.f5268b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: b2 */
    private void m6681b2(C1766b bVar) {
        int i;
        SavedState savedState = this.f5237L;
        int i2 = savedState.f5258f;
        if (i2 > 0) {
            if (i2 == this.f5245v) {
                for (int i3 = 0; i3 < this.f5245v; i3++) {
                    this.f5246w[i3].mo5851e();
                    SavedState savedState2 = this.f5237L;
                    int i4 = savedState2.f5259g[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (savedState2.f5264l) {
                            i = this.f5247x.mo6039i();
                        } else {
                            i = this.f5247x.mo6044n();
                        }
                        i4 += i;
                    }
                    this.f5246w[i3].mo5870x(i4);
                }
            } else {
                savedState.mo5834b();
                SavedState savedState3 = this.f5237L;
                savedState3.f5256d = savedState3.f5257e;
            }
        }
        SavedState savedState4 = this.f5237L;
        this.f5236K = savedState4.f5265m;
        mo5799X2(savedState4.f5263k);
        m6676T2();
        SavedState savedState5 = this.f5237L;
        int i5 = savedState5.f5256d;
        if (i5 != -1) {
            this.f5231F = i5;
            bVar.f5269c = savedState5.f5264l;
        } else {
            bVar.f5269c = this.f5229D;
        }
        if (savedState5.f5260h > 1) {
            LazySpanLookup lazySpanLookup = this.f5233H;
            lazySpanLookup.f5250a = savedState5.f5261i;
            lazySpanLookup.f5251b = savedState5.f5262j;
        }
    }

    /* renamed from: d3 */
    private void m6682d3(int i, RecyclerView.C1726b0 b0Var) {
        int i2;
        int i3;
        int c;
        boolean z;
        C1816l lVar = this.f5227B;
        boolean z2 = false;
        lVar.f5462b = 0;
        lVar.f5463c = i;
        if (!mo5634I0() || (c = b0Var.mo5462c()) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            boolean z3 = this.f5229D;
            if (c < i) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                i3 = this.f5247x.mo6045o();
                i2 = 0;
            } else {
                i2 = this.f5247x.mo6045o();
                i3 = 0;
            }
        }
        if (mo5665Y()) {
            this.f5227B.f5466f = this.f5247x.mo6044n() - i2;
            this.f5227B.f5467g = this.f5247x.mo6039i() + i3;
        } else {
            this.f5227B.f5467g = this.f5247x.mo6038h() + i3;
            this.f5227B.f5466f = -i2;
        }
        C1816l lVar2 = this.f5227B;
        lVar2.f5468h = false;
        lVar2.f5461a = true;
        if (this.f5247x.mo6042l() == 0 && this.f5247x.mo6038h() == 0) {
            z2 = true;
        }
        lVar2.f5469i = z2;
    }

    /* renamed from: e2 */
    private void m6683e2(View view, C1767c cVar, C1816l lVar) {
        if (lVar.f5465e == 1) {
            if (cVar.f5275i) {
                m6679a2(view);
            } else {
                cVar.f5274h.mo5847a(view);
            }
        } else if (cVar.f5275i) {
            m6671O2(view);
        } else {
            cVar.f5274h.mo5869w(view);
        }
    }

    /* renamed from: f2 */
    private int m6684f2(int i) {
        boolean z;
        if (mo5660V() != 0) {
            if (i < mo5811y2()) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.f5229D) {
                return -1;
            }
            return 1;
        } else if (this.f5229D) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: f3 */
    private void m6685f3(C1768d dVar, int i, int i2) {
        int l = dVar.mo5858l();
        if (i == -1) {
            if (dVar.mo5863q() + l <= i2) {
                this.f5230E.set(dVar.f5280e, false);
            }
        } else if (dVar.mo5859m() - l >= i2) {
            this.f5230E.set(dVar.f5280e, false);
        }
    }

    /* renamed from: g3 */
    private int m6686g3(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: h2 */
    private boolean m6687h2(C1768d dVar) {
        if (this.f5229D) {
            if (dVar.mo5859m() < this.f5247x.mo6039i()) {
                ArrayList arrayList = dVar.f5276a;
                return !dVar.mo5862p((View) arrayList.get(arrayList.size() - 1)).f5275i;
            }
        } else if (dVar.mo5863q() > this.f5247x.mo6044n()) {
            return !dVar.mo5862p((View) dVar.f5276a.get(0)).f5275i;
        }
        return false;
    }

    /* renamed from: i2 */
    private int m6688i2(RecyclerView.C1726b0 b0Var) {
        if (mo5660V() == 0) {
            return 0;
        }
        return C1831u.m7117a(b0Var, this.f5247x, mo5808s2(!this.f5242Q), mo5807r2(!this.f5242Q), this, this.f5242Q);
    }

    /* renamed from: j2 */
    private int m6689j2(RecyclerView.C1726b0 b0Var) {
        if (mo5660V() == 0) {
            return 0;
        }
        return C1831u.m7118b(b0Var, this.f5247x, mo5808s2(!this.f5242Q), mo5807r2(!this.f5242Q), this, this.f5242Q, this.f5229D);
    }

    /* renamed from: k2 */
    private int m6690k2(RecyclerView.C1726b0 b0Var) {
        if (mo5660V() == 0) {
            return 0;
        }
        return C1831u.m7119c(b0Var, this.f5247x, mo5808s2(!this.f5242Q), mo5807r2(!this.f5242Q), this, this.f5242Q);
    }

    /* renamed from: l2 */
    private int m6691l2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.f5249z == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f5249z == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f5249z == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f5249z == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f5249z != 1 && mo5795I2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f5249z != 1 && mo5795I2()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: m2 */
    private LazySpanLookup.FullSpanItem m6692m2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f5254f = new int[this.f5245v];
        for (int i2 = 0; i2 < this.f5245v; i2++) {
            fullSpanItem.f5254f[i2] = i - this.f5246w[i2].mo5860n(i);
        }
        return fullSpanItem;
    }

    /* renamed from: n2 */
    private LazySpanLookup.FullSpanItem m6693n2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f5254f = new int[this.f5245v];
        for (int i2 = 0; i2 < this.f5245v; i2++) {
            fullSpanItem.f5254f[i2] = this.f5246w[i2].mo5864r(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: o2 */
    private void m6694o2() {
        this.f5247x = C1824r.m7052b(this, this.f5249z);
        this.f5248y = C1824r.m7052b(this, 1 - this.f5249z);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: p2 */
    private int m6695p2(RecyclerView.C1759w wVar, C1816l lVar, RecyclerView.C1726b0 b0Var) {
        int i;
        int i2;
        int i3;
        boolean z;
        C1768d dVar;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        int i12;
        int i13;
        RecyclerView.C1759w wVar2 = wVar;
        C1816l lVar2 = lVar;
        ? r9 = 0;
        this.f5230E.set(0, this.f5245v, true);
        if (this.f5227B.f5469i) {
            if (lVar2.f5465e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (lVar2.f5465e == 1) {
            i = lVar2.f5467g + lVar2.f5462b;
        } else {
            i = lVar2.f5466f - lVar2.f5462b;
        }
        int i14 = i;
        m6678Z2(lVar2.f5465e, i14);
        if (this.f5229D) {
            i2 = this.f5247x.mo6039i();
        } else {
            i2 = this.f5247x.mo6044n();
        }
        int i15 = i2;
        boolean z4 = false;
        while (lVar.mo6011a(b0Var) && (this.f5227B.f5469i || !this.f5230E.isEmpty())) {
            View b = lVar2.mo6012b(wVar2);
            C1767c cVar = (C1767c) b.getLayoutParams();
            int b2 = cVar.mo5729b();
            int g = this.f5233H.mo5819g(b2);
            if (g == -1) {
                z = true;
            } else {
                z = r9;
            }
            if (z) {
                if (cVar.f5275i) {
                    dVar = this.f5246w[r9];
                } else {
                    dVar = m6665E2(lVar2);
                }
                this.f5233H.mo5823n(b2, dVar);
            } else {
                dVar = this.f5246w[g];
            }
            C1768d dVar2 = dVar;
            cVar.f5274h = dVar2;
            if (lVar2.f5465e == 1) {
                mo5694n(b);
            } else {
                mo5696o(b, r9);
            }
            m6668K2(b, cVar, r9);
            if (lVar2.f5465e == 1) {
                if (cVar.f5275i) {
                    i13 = m6661A2(i15);
                } else {
                    i13 = dVar2.mo5860n(i15);
                }
                int e = this.f5247x.mo6035e(b) + i13;
                if (z && cVar.f5275i) {
                    LazySpanLookup.FullSpanItem m2 = m6692m2(i13);
                    m2.f5253e = -1;
                    m2.f5252d = b2;
                    this.f5233H.mo5813a(m2);
                }
                i4 = e;
                i5 = i13;
            } else {
                if (cVar.f5275i) {
                    i12 = m6664D2(i15);
                } else {
                    i12 = dVar2.mo5864r(i15);
                }
                i5 = i12 - this.f5247x.mo6035e(b);
                if (z && cVar.f5275i) {
                    LazySpanLookup.FullSpanItem n2 = m6693n2(i12);
                    n2.f5253e = 1;
                    n2.f5252d = b2;
                    this.f5233H.mo5813a(n2);
                }
                i4 = i12;
            }
            if (cVar.f5275i && lVar2.f5464d == -1) {
                if (z) {
                    this.f5241P = true;
                } else {
                    if (lVar2.f5465e == 1) {
                        z3 = mo5802c2();
                    } else {
                        z3 = mo5804d2();
                    }
                    if (!z3) {
                        LazySpanLookup.FullSpanItem f = this.f5233H.mo5818f(b2);
                        if (f != null) {
                            f.f5255g = true;
                        }
                        this.f5241P = true;
                    }
                }
            }
            m6683e2(b, cVar, lVar2);
            if (!mo5795I2() || this.f5249z != 1) {
                if (cVar.f5275i) {
                    i8 = this.f5248y.mo6044n();
                } else {
                    i8 = (dVar2.f5280e * this.f5226A) + this.f5248y.mo6044n();
                }
                i7 = i8;
                i6 = this.f5248y.mo6035e(b) + i8;
            } else {
                if (cVar.f5275i) {
                    i9 = this.f5248y.mo6039i();
                } else {
                    i9 = this.f5248y.mo6039i() - (((this.f5245v - 1) - dVar2.f5280e) * this.f5226A);
                }
                i6 = i9;
                i7 = i9 - this.f5248y.mo6035e(b);
            }
            if (this.f5249z == 1) {
                mo5637K0(b, i7, i5, i6, i4);
            } else {
                mo5637K0(b, i5, i7, i4, i6);
            }
            if (cVar.f5275i) {
                m6678Z2(this.f5227B.f5465e, i14);
            } else {
                m6685f3(dVar2, this.f5227B.f5465e, i14);
            }
            m6672P2(wVar2, this.f5227B);
            if (this.f5227B.f5468h && b.hasFocusable()) {
                if (cVar.f5275i) {
                    this.f5230E.clear();
                } else {
                    z2 = false;
                    this.f5230E.set(dVar2.f5280e, false);
                    r9 = z2;
                    z4 = true;
                }
            }
            z2 = false;
            r9 = z2;
            z4 = true;
        }
        int i16 = r9;
        if (!z4) {
            m6672P2(wVar2, this.f5227B);
        }
        if (this.f5227B.f5465e == -1) {
            i3 = this.f5247x.mo6044n() - m6664D2(this.f5247x.mo6044n());
        } else {
            i3 = m6661A2(this.f5247x.mo6039i()) - this.f5247x.mo6039i();
        }
        if (i3 > 0) {
            return Math.min(lVar2.f5462b, i3);
        }
        return i16;
    }

    /* renamed from: q2 */
    private int m6696q2(int i) {
        int V = mo5660V();
        for (int i2 = 0; i2 < V; i2++) {
            int q0 = mo5700q0(mo5658U(i2));
            if (q0 >= 0 && q0 < i) {
                return q0;
            }
        }
        return 0;
    }

    /* renamed from: u2 */
    private int m6697u2(int i) {
        for (int V = mo5660V() - 1; V >= 0; V--) {
            int q0 = mo5700q0(mo5658U(V));
            if (q0 >= 0 && q0 < i) {
                return q0;
            }
        }
        return 0;
    }

    /* renamed from: w2 */
    private void m6698w2(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, boolean z) {
        int i;
        int A2 = m6661A2(Integer.MIN_VALUE);
        if (A2 != Integer.MIN_VALUE && (i = this.f5247x.mo6039i() - A2) > 0) {
            int i2 = i - (-mo5797U2(-i, wVar, b0Var));
            if (z && i2 > 0) {
                this.f5247x.mo6049s(i2);
            }
        }
    }

    /* renamed from: x2 */
    private void m6699x2(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, boolean z) {
        int n;
        int D2 = m6664D2(Integer.MAX_VALUE);
        if (D2 != Integer.MAX_VALUE && (n = D2 - this.f5247x.mo6044n()) > 0) {
            int U2 = n - mo5797U2(n, wVar, b0Var);
            if (z && U2 > 0) {
                this.f5247x.mo6049s(-U2);
            }
        }
    }

    /* renamed from: B */
    public int mo5190B(RecyclerView.C1726b0 b0Var) {
        return m6688i2(b0Var);
    }

    /* renamed from: C */
    public int mo5146C(RecyclerView.C1726b0 b0Var) {
        return m6689j2(b0Var);
    }

    /* renamed from: C0 */
    public boolean mo5192C0() {
        return this.f5234I != 0;
    }

    /* renamed from: D */
    public int mo5147D(RecyclerView.C1726b0 b0Var) {
        return m6690k2(b0Var);
    }

    /* renamed from: E */
    public int mo5195E(RecyclerView.C1726b0 b0Var) {
        return m6688i2(b0Var);
    }

    /* renamed from: F */
    public int mo5148F(RecyclerView.C1726b0 b0Var) {
        return m6689j2(b0Var);
    }

    /* renamed from: G */
    public int mo5150G(RecyclerView.C1726b0 b0Var) {
        return m6690k2(b0Var);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: G2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo5793G2() {
        /*
            r12 = this;
            int r0 = r12.mo5660V()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f5245v
            r2.<init>(r3)
            int r3 = r12.f5245v
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f5249z
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo5795I2()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.f5229D
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo5658U(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1767c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f5274h
            int r9 = r9.f5280e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f5274h
            boolean r9 = r12.m6687h2(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f5274h
            int r9 = r9.f5280e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f5275i
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo5658U(r9)
            boolean r10 = r12.f5229D
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.r r10 = r12.f5247x
            int r10 = r10.mo6034d(r7)
            androidx.recyclerview.widget.r r11 = r12.f5247x
            int r11 = r11.mo6034d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.r r10 = r12.f5247x
            int r10 = r10.mo6037g(r7)
            androidx.recyclerview.widget.r r11 = r12.f5247x
            int r11 = r11.mo6037g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = r1
            goto L_0x008b
        L_0x008a:
            r10 = r4
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1767c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f5274h
            int r8 = r8.f5280e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f5274h
            int r9 = r9.f5280e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = r1
            goto L_0x00a1
        L_0x00a0:
            r8 = r4
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = r1
            goto L_0x00a6
        L_0x00a5:
            r9 = r4
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo5793G2():android.view.View");
    }

    /* renamed from: H2 */
    public void mo5794H2() {
        this.f5233H.mo5814b();
        mo5629F1();
    }

    /* renamed from: I1 */
    public int mo5152I1(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        return mo5797U2(i, wVar, b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I2 */
    public boolean mo5795I2() {
        return mo5692m0() == 1;
    }

    /* renamed from: J1 */
    public void mo5197J1(int i) {
        SavedState savedState = this.f5237L;
        if (!(savedState == null || savedState.f5256d == i)) {
            savedState.mo5833a();
        }
        this.f5231F = i;
        this.f5232G = Integer.MIN_VALUE;
        mo5629F1();
    }

    /* renamed from: K1 */
    public int mo5153K1(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        return mo5797U2(i, wVar, b0Var);
    }

    /* renamed from: N0 */
    public void mo5645N0(int i) {
        super.mo5645N0(i);
        for (int i2 = 0; i2 < this.f5245v; i2++) {
            this.f5246w[i2].mo5866t(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N2 */
    public void mo5796N2(int i, RecyclerView.C1726b0 b0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo5812z2();
            i2 = 1;
        } else {
            i3 = mo5811y2();
            i2 = -1;
        }
        this.f5227B.f5461a = true;
        m6682d3(i3, b0Var);
        m6677V2(i2);
        C1816l lVar = this.f5227B;
        lVar.f5463c = i3 + lVar.f5464d;
        lVar.f5462b = Math.abs(i);
    }

    /* renamed from: O0 */
    public void mo5647O0(int i) {
        super.mo5647O0(i);
        for (int i2 = 0; i2 < this.f5245v; i2++) {
            this.f5246w[i2].mo5866t(i);
        }
    }

    /* renamed from: P */
    public RecyclerView.C1752q mo5154P() {
        if (this.f5249z == 0) {
            return new C1767c(-2, -1);
        }
        return new C1767c(-1, -2);
    }

    /* renamed from: P0 */
    public void mo5649P0(RecyclerView.C1736h hVar, RecyclerView.C1736h hVar2) {
        this.f5233H.mo5814b();
        for (int i = 0; i < this.f5245v; i++) {
            this.f5246w[i].mo5851e();
        }
    }

    /* renamed from: P1 */
    public void mo5155P1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f5249z == 1) {
            i4 = RecyclerView.C1747p.m6432y(i2, rect.height() + paddingTop, mo5697o0());
            i3 = RecyclerView.C1747p.m6432y(i, (this.f5226A * this.f5245v) + paddingLeft, mo5698p0());
        } else {
            i3 = RecyclerView.C1747p.m6432y(i, rect.width() + paddingLeft, mo5698p0());
            i4 = RecyclerView.C1747p.m6432y(i2, (this.f5226A * this.f5245v) + paddingTop, mo5697o0());
        }
        mo5648O1(i3, i4);
    }

    /* renamed from: Q */
    public RecyclerView.C1752q mo5156Q(Context context, AttributeSet attributeSet) {
        return new C1767c(context, attributeSet);
    }

    /* renamed from: R */
    public RecyclerView.C1752q mo5157R(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1767c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1767c(layoutParams);
    }

    /* renamed from: T0 */
    public void mo5205T0(RecyclerView recyclerView, RecyclerView.C1759w wVar) {
        super.mo5205T0(recyclerView, wVar);
        mo5621A1(this.f5244S);
        for (int i = 0; i < this.f5245v; i++) {
            this.f5246w[i].mo5851e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: U0 */
    public View mo5159U0(View view, int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        View N;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        View o;
        if (mo5660V() == 0 || (N = mo5644N(view)) == null) {
            return null;
        }
        m6676T2();
        int l2 = m6691l2(i);
        if (l2 == Integer.MIN_VALUE) {
            return null;
        }
        C1767c cVar = (C1767c) N.getLayoutParams();
        boolean z3 = cVar.f5275i;
        C1768d dVar = cVar.f5274h;
        if (l2 == 1) {
            i2 = mo5812z2();
        } else {
            i2 = mo5811y2();
        }
        m6682d3(i2, b0Var);
        m6677V2(l2);
        C1816l lVar = this.f5227B;
        lVar.f5463c = lVar.f5464d + i2;
        lVar.f5462b = (int) (((float) this.f5247x.mo6045o()) * 0.33333334f);
        C1816l lVar2 = this.f5227B;
        lVar2.f5468h = true;
        lVar2.f5461a = false;
        m6695p2(wVar, lVar2, b0Var);
        this.f5235J = this.f5229D;
        if (!z3 && (o = dVar.mo5861o(i2, l2)) != null && o != N) {
            return o;
        }
        if (m6670M2(l2)) {
            for (int i6 = this.f5245v - 1; i6 >= 0; i6--) {
                View o2 = this.f5246w[i6].mo5861o(i2, l2);
                if (o2 != null && o2 != N) {
                    return o2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f5245v; i7++) {
                View o3 = this.f5246w[i7].mo5861o(i2, l2);
                if (o3 != null && o3 != N) {
                    return o3;
                }
            }
        }
        boolean z4 = !this.f5228C;
        if (l2 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z4 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            if (z2) {
                i5 = dVar.mo5852f();
            } else {
                i5 = dVar.mo5853g();
            }
            View O = mo5199O(i5);
            if (!(O == null || O == N)) {
                return O;
            }
        }
        if (m6670M2(l2)) {
            for (int i8 = this.f5245v - 1; i8 >= 0; i8--) {
                if (i8 != dVar.f5280e) {
                    if (z2) {
                        i4 = this.f5246w[i8].mo5852f();
                    } else {
                        i4 = this.f5246w[i8].mo5853g();
                    }
                    View O2 = mo5199O(i4);
                    if (!(O2 == null || O2 == N)) {
                        return O2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f5245v; i9++) {
                if (z2) {
                    i3 = this.f5246w[i9].mo5852f();
                } else {
                    i3 = this.f5246w[i9].mo5853g();
                }
                View O3 = mo5199O(i3);
                if (O3 != null && O3 != N) {
                    return O3;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U2 */
    public int mo5797U2(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        if (mo5660V() == 0 || i == 0) {
            return 0;
        }
        mo5796N2(i, b0Var);
        int p2 = m6695p2(wVar, this.f5227B, b0Var);
        if (this.f5227B.f5462b >= p2) {
            if (i < 0) {
                i = -p2;
            } else {
                i = p2;
            }
        }
        this.f5247x.mo6049s(-i);
        this.f5235J = this.f5229D;
        C1816l lVar = this.f5227B;
        lVar.f5462b = 0;
        m6672P2(wVar, lVar);
        return i;
    }

    /* renamed from: V0 */
    public void mo5207V0(AccessibilityEvent accessibilityEvent) {
        super.mo5207V0(accessibilityEvent);
        if (mo5660V() > 0) {
            View s2 = mo5808s2(false);
            View r2 = mo5807r2(false);
            if (s2 != null && r2 != null) {
                int q0 = mo5700q0(s2);
                int q02 = mo5700q0(r2);
                if (q0 < q02) {
                    accessibilityEvent.setFromIndex(q0);
                    accessibilityEvent.setToIndex(q02);
                    return;
                }
                accessibilityEvent.setFromIndex(q02);
                accessibilityEvent.setToIndex(q0);
            }
        }
    }

    /* renamed from: V1 */
    public void mo5208V1(RecyclerView recyclerView, RecyclerView.C1726b0 b0Var, int i) {
        C1817m mVar = new C1817m(recyclerView.getContext());
        mVar.mo5452p(i);
        mo5662W1(mVar);
    }

    /* renamed from: W2 */
    public void mo5798W2(int i) {
        if (i == 0 || i == 1) {
            mo5222q((String) null);
            if (i != this.f5249z) {
                this.f5249z = i;
                C1824r rVar = this.f5247x;
                this.f5247x = this.f5248y;
                this.f5248y = rVar;
                mo5629F1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: X2 */
    public void mo5799X2(boolean z) {
        mo5222q((String) null);
        SavedState savedState = this.f5237L;
        if (!(savedState == null || savedState.f5263k == z)) {
            savedState.f5263k = z;
        }
        this.f5228C = z;
        mo5629F1();
    }

    /* renamed from: Y2 */
    public void mo5800Y2(int i) {
        mo5222q((String) null);
        if (i != this.f5245v) {
            mo5794H2();
            this.f5245v = i;
            this.f5230E = new BitSet(this.f5245v);
            this.f5246w = new C1768d[this.f5245v];
            for (int i2 = 0; i2 < this.f5245v; i2++) {
                this.f5246w[i2] = new C1768d(i2);
            }
            mo5629F1();
        }
    }

    /* renamed from: Z1 */
    public boolean mo5162Z1() {
        return this.f5237L == null;
    }

    /* renamed from: a */
    public PointF mo5209a(int i) {
        int f2 = m6684f2(i);
        PointF pointF = new PointF();
        if (f2 == 0) {
            return null;
        }
        if (this.f5249z == 0) {
            pointF.x = (float) f2;
            pointF.y = Utils.FLOAT_EPSILON;
        } else {
            pointF.x = Utils.FLOAT_EPSILON;
            pointF.y = (float) f2;
        }
        return pointF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b3 */
    public boolean mo5801b3(RecyclerView.C1726b0 b0Var, C1766b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!b0Var.mo5464e() && (i = this.f5231F) != -1) {
            if (i < 0 || i >= b0Var.mo5461b()) {
                this.f5231F = -1;
                this.f5232G = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.f5237L;
                if (savedState == null || savedState.f5256d == -1 || savedState.f5258f < 1) {
                    View O = mo5199O(this.f5231F);
                    if (O != null) {
                        if (this.f5229D) {
                            i2 = mo5812z2();
                        } else {
                            i2 = mo5811y2();
                        }
                        bVar.f5267a = i2;
                        if (this.f5232G != Integer.MIN_VALUE) {
                            if (bVar.f5269c) {
                                bVar.f5268b = (this.f5247x.mo6039i() - this.f5232G) - this.f5247x.mo6034d(O);
                            } else {
                                bVar.f5268b = (this.f5247x.mo6044n() + this.f5232G) - this.f5247x.mo6037g(O);
                            }
                            return true;
                        } else if (this.f5247x.mo6035e(O) > this.f5247x.mo6045o()) {
                            if (bVar.f5269c) {
                                i3 = this.f5247x.mo6039i();
                            } else {
                                i3 = this.f5247x.mo6044n();
                            }
                            bVar.f5268b = i3;
                            return true;
                        } else {
                            int g = this.f5247x.mo6037g(O) - this.f5247x.mo6044n();
                            if (g < 0) {
                                bVar.f5268b = -g;
                                return true;
                            }
                            int i4 = this.f5247x.mo6039i() - this.f5247x.mo6034d(O);
                            if (i4 < 0) {
                                bVar.f5268b = i4;
                                return true;
                            }
                            bVar.f5268b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.f5231F;
                        bVar.f5267a = i5;
                        int i6 = this.f5232G;
                        if (i6 == Integer.MIN_VALUE) {
                            if (m6684f2(i5) == 1) {
                                z = true;
                            }
                            bVar.f5269c = z;
                            bVar.mo5842a();
                        } else {
                            bVar.mo5843b(i6);
                        }
                        bVar.f5270d = true;
                    }
                } else {
                    bVar.f5268b = Integer.MIN_VALUE;
                    bVar.f5267a = this.f5231F;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c1 */
    public void mo5165c1(RecyclerView recyclerView, int i, int i2) {
        m6666F2(i, i2, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c2 */
    public boolean mo5802c2() {
        int n = this.f5246w[0].mo5860n(Integer.MIN_VALUE);
        for (int i = 1; i < this.f5245v; i++) {
            if (this.f5246w[i].mo5860n(Integer.MIN_VALUE) != n) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c3 */
    public void mo5803c3(RecyclerView.C1726b0 b0Var, C1766b bVar) {
        if (!mo5801b3(b0Var, bVar) && !m6680a3(b0Var, bVar)) {
            bVar.mo5842a();
            bVar.f5267a = 0;
        }
    }

    /* renamed from: d1 */
    public void mo5166d1(RecyclerView recyclerView) {
        this.f5233H.mo5814b();
        mo5629F1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d2 */
    public boolean mo5804d2() {
        int r = this.f5246w[0].mo5864r(Integer.MIN_VALUE);
        for (int i = 1; i < this.f5245v; i++) {
            if (this.f5246w[i].mo5864r(Integer.MIN_VALUE) != r) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e1 */
    public void mo5167e1(RecyclerView recyclerView, int i, int i2, int i3) {
        m6666F2(i, i2, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e3 */
    public void mo5805e3(int i) {
        this.f5226A = i / this.f5245v;
        this.f5238M = View.MeasureSpec.makeMeasureSpec(i, this.f5248y.mo6042l());
    }

    /* renamed from: f1 */
    public void mo5168f1(RecyclerView recyclerView, int i, int i2) {
        m6666F2(i, i2, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g2 */
    public boolean mo5806g2() {
        int i;
        int i2;
        int i3;
        if (mo5660V() == 0 || this.f5234I == 0 || !mo5622B0()) {
            return false;
        }
        if (this.f5229D) {
            i2 = mo5812z2();
            i = mo5811y2();
        } else {
            i2 = mo5811y2();
            i = mo5812z2();
        }
        if (i2 == 0 && mo5793G2() != null) {
            this.f5233H.mo5814b();
            mo5631G1();
            mo5629F1();
            return true;
        } else if (!this.f5241P) {
            return false;
        } else {
            if (this.f5229D) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            int i4 = i + 1;
            LazySpanLookup.FullSpanItem e = this.f5233H.mo5817e(i2, i4, i3, true);
            if (e == null) {
                this.f5241P = false;
                this.f5233H.mo5816d(i4);
                return false;
            }
            LazySpanLookup.FullSpanItem e2 = this.f5233H.mo5817e(i2, e.f5252d, i3 * -1, true);
            if (e2 == null) {
                this.f5233H.mo5816d(e.f5252d);
            } else {
                this.f5233H.mo5816d(e2.f5252d + 1);
            }
            mo5631G1();
            mo5629F1();
            return true;
        }
    }

    /* renamed from: h1 */
    public void mo5169h1(RecyclerView recyclerView, int i, int i2, Object obj) {
        m6666F2(i, i2, 4);
    }

    /* renamed from: i1 */
    public void mo5170i1(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        m6669L2(wVar, b0Var, true);
    }

    /* renamed from: j1 */
    public void mo5171j1(RecyclerView.C1726b0 b0Var) {
        super.mo5171j1(b0Var);
        this.f5231F = -1;
        this.f5232G = Integer.MIN_VALUE;
        this.f5237L = null;
        this.f5240O.mo5844c();
    }

    /* renamed from: n1 */
    public void mo5218n1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f5237L = savedState;
            if (this.f5231F != -1) {
                savedState.mo5833a();
                this.f5237L.mo5834b();
            }
            mo5629F1();
        }
    }

    /* renamed from: o1 */
    public Parcelable mo5220o1() {
        int i;
        int i2;
        int i3;
        int[] iArr;
        if (this.f5237L != null) {
            return new SavedState(this.f5237L);
        }
        SavedState savedState = new SavedState();
        savedState.f5263k = this.f5228C;
        savedState.f5264l = this.f5235J;
        savedState.f5265m = this.f5236K;
        LazySpanLookup lazySpanLookup = this.f5233H;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f5250a) == null) {
            savedState.f5260h = 0;
        } else {
            savedState.f5261i = iArr;
            savedState.f5260h = iArr.length;
            savedState.f5262j = lazySpanLookup.f5251b;
        }
        if (mo5660V() > 0) {
            if (this.f5235J) {
                i = mo5812z2();
            } else {
                i = mo5811y2();
            }
            savedState.f5256d = i;
            savedState.f5257e = mo5809t2();
            int i4 = this.f5245v;
            savedState.f5258f = i4;
            savedState.f5259g = new int[i4];
            for (int i5 = 0; i5 < this.f5245v; i5++) {
                if (this.f5235J) {
                    i2 = this.f5246w[i5].mo5860n(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f5247x.mo6039i();
                    } else {
                        savedState.f5259g[i5] = i2;
                    }
                } else {
                    i2 = this.f5246w[i5].mo5864r(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f5247x.mo6044n();
                    } else {
                        savedState.f5259g[i5] = i2;
                    }
                }
                i2 -= i3;
                savedState.f5259g[i5] = i2;
            }
        } else {
            savedState.f5256d = -1;
            savedState.f5257e = -1;
            savedState.f5258f = 0;
        }
        return savedState;
    }

    /* renamed from: p1 */
    public void mo5699p1(int i) {
        if (i == 0) {
            mo5806g2();
        }
    }

    /* renamed from: q */
    public void mo5222q(String str) {
        if (this.f5237L == null) {
            super.mo5222q(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r2 */
    public View mo5807r2(boolean z) {
        int n = this.f5247x.mo6044n();
        int i = this.f5247x.mo6039i();
        View view = null;
        for (int V = mo5660V() - 1; V >= 0; V--) {
            View U = mo5658U(V);
            int g = this.f5247x.mo6037g(U);
            int d = this.f5247x.mo6034d(U);
            if (d > n && g < i) {
                if (d <= i || !z) {
                    return U;
                }
                if (view == null) {
                    view = U;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s2 */
    public View mo5808s2(boolean z) {
        int n = this.f5247x.mo6044n();
        int i = this.f5247x.mo6039i();
        int V = mo5660V();
        View view = null;
        for (int i2 = 0; i2 < V; i2++) {
            View U = mo5658U(i2);
            int g = this.f5247x.mo6037g(U);
            if (this.f5247x.mo6034d(U) > n && g < i) {
                if (g >= n || !z) {
                    return U;
                }
                if (view == null) {
                    view = U;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t2 */
    public int mo5809t2() {
        View view;
        if (this.f5229D) {
            view = mo5807r2(true);
        } else {
            view = mo5808s2(true);
        }
        if (view == null) {
            return -1;
        }
        return mo5700q0(view);
    }

    /* renamed from: v */
    public boolean mo5226v() {
        return this.f5249z == 0;
    }

    /* renamed from: v2 */
    public int[] mo5810v2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5245v];
        } else if (iArr.length < this.f5245v) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5245v + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f5245v; i++) {
            iArr[i] = this.f5246w[i].mo5854h();
        }
        return iArr;
    }

    /* renamed from: w */
    public boolean mo5227w() {
        return this.f5249z == 1;
    }

    /* renamed from: x */
    public boolean mo5178x(RecyclerView.C1752q qVar) {
        return qVar instanceof C1767c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y2 */
    public int mo5811y2() {
        if (mo5660V() == 0) {
            return 0;
        }
        return mo5700q0(mo5658U(0));
    }

    /* renamed from: z */
    public void mo5228z(int i, int i2, RecyclerView.C1726b0 b0Var, RecyclerView.C1747p.C1750c cVar) {
        int i3;
        int i4;
        if (this.f5249z != 0) {
            i = i2;
        }
        if (mo5660V() != 0 && i != 0) {
            mo5796N2(i, b0Var);
            int[] iArr = this.f5243R;
            if (iArr == null || iArr.length < this.f5245v) {
                this.f5243R = new int[this.f5245v];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f5245v; i6++) {
                C1816l lVar = this.f5227B;
                if (lVar.f5464d == -1) {
                    i4 = lVar.f5466f;
                    i3 = this.f5246w[i6].mo5864r(i4);
                } else {
                    i4 = this.f5246w[i6].mo5860n(lVar.f5467g);
                    i3 = this.f5227B.f5467g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f5243R[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f5243R, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f5227B.mo6011a(b0Var); i8++) {
                cVar.mo5727a(this.f5227B.f5463c, this.f5243R[i8]);
                C1816l lVar2 = this.f5227B;
                lVar2.f5463c += lVar2.f5464d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z2 */
    public int mo5812z2() {
        int V = mo5660V();
        if (V == 0) {
            return 0;
        }
        return mo5700q0(mo5658U(V - 1));
    }

    static class LazySpanLookup {

        /* renamed from: a */
        int[] f5250a;

        /* renamed from: b */
        List f5251b;

        LazySpanLookup() {
        }

        /* renamed from: i */
        private int m6758i(int i) {
            if (this.f5251b == null) {
                return -1;
            }
            FullSpanItem f = mo5818f(i);
            if (f != null) {
                this.f5251b.remove(f);
            }
            int size = this.f5251b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((FullSpanItem) this.f5251b.get(i2)).f5252d >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f5251b.remove(i2);
            return ((FullSpanItem) this.f5251b.get(i2)).f5252d;
        }

        /* renamed from: l */
        private void m6759l(int i, int i2) {
            List list = this.f5251b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f5251b.get(size);
                    int i3 = fullSpanItem.f5252d;
                    if (i3 >= i) {
                        fullSpanItem.f5252d = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        private void m6760m(int i, int i2) {
            List list = this.f5251b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f5251b.get(size);
                    int i4 = fullSpanItem.f5252d;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f5251b.remove(size);
                        } else {
                            fullSpanItem.f5252d = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo5813a(FullSpanItem fullSpanItem) {
            if (this.f5251b == null) {
                this.f5251b = new ArrayList();
            }
            int size = this.f5251b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f5251b.get(i);
                if (fullSpanItem2.f5252d == fullSpanItem.f5252d) {
                    this.f5251b.remove(i);
                }
                if (fullSpanItem2.f5252d >= fullSpanItem.f5252d) {
                    this.f5251b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f5251b.add(fullSpanItem);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5814b() {
            int[] iArr = this.f5250a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5251b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5815c(int i) {
            int[] iArr = this.f5250a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f5250a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo5824o(i)];
                this.f5250a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f5250a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo5816d(int i) {
            List list = this.f5251b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f5251b.get(size)).f5252d >= i) {
                        this.f5251b.remove(size);
                    }
                }
            }
            return mo5820h(i);
        }

        /* renamed from: e */
        public FullSpanItem mo5817e(int i, int i2, int i3, boolean z) {
            List list = this.f5251b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f5251b.get(i4);
                int i5 = fullSpanItem.f5252d;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f5253e == i3 || (z && fullSpanItem.f5255g))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem mo5818f(int i) {
            List list = this.f5251b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f5251b.get(size);
                if (fullSpanItem.f5252d == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo5819g(int i) {
            int[] iArr = this.f5250a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo5820h(int i) {
            int[] iArr = this.f5250a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = m6758i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f5250a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f5250a.length;
            }
            int min = Math.min(i2 + 1, this.f5250a.length);
            Arrays.fill(this.f5250a, i, min, -1);
            return min;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5821j(int i, int i2) {
            int[] iArr = this.f5250a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo5815c(i3);
                int[] iArr2 = this.f5250a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f5250a, i, i3, -1);
                m6759l(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo5822k(int i, int i2) {
            int[] iArr = this.f5250a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo5815c(i3);
                int[] iArr2 = this.f5250a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f5250a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m6760m(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo5823n(int i, C1768d dVar) {
            mo5815c(i);
            this.f5250a[i] = dVar.f5280e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo5824o(int i) {
            int length = this.f5250a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C1763a();

            /* renamed from: d */
            int f5252d;

            /* renamed from: e */
            int f5253e;

            /* renamed from: f */
            int[] f5254f;

            /* renamed from: g */
            boolean f5255g;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            class C1763a implements Parcelable.Creator {
                C1763a() {
                }

                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* renamed from: b */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f5252d = parcel.readInt();
                this.f5253e = parcel.readInt();
                this.f5255g = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f5254f = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo5825a(int i) {
                int[] iArr = this.f5254f;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f5252d + ", mGapDir=" + this.f5253e + ", mHasUnwantedGapAfter=" + this.f5255g + ", mGapPerSpan=" + Arrays.toString(this.f5254f) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f5252d);
                parcel.writeInt(this.f5253e);
                parcel.writeInt(this.f5255g ? 1 : 0);
                int[] iArr = this.f5254f;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f5254f);
            }

            FullSpanItem() {
            }
        }
    }
}
