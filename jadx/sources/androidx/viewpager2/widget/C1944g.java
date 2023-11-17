package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.github.mikephil.charting.utils.Utils;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.g */
final class C1944g extends RecyclerView.C1756u {

    /* renamed from: a */
    private ViewPager2.C1928i f5846a;

    /* renamed from: b */
    private final ViewPager2 f5847b;

    /* renamed from: c */
    private final RecyclerView f5848c;

    /* renamed from: d */
    private final LinearLayoutManager f5849d;

    /* renamed from: e */
    private int f5850e;

    /* renamed from: f */
    private int f5851f;

    /* renamed from: g */
    private C1945a f5852g = new C1945a();

    /* renamed from: h */
    private int f5853h;

    /* renamed from: i */
    private int f5854i;

    /* renamed from: j */
    private boolean f5855j;

    /* renamed from: k */
    private boolean f5856k;

    /* renamed from: l */
    private boolean f5857l;

    /* renamed from: m */
    private boolean f5858m;

    /* renamed from: androidx.viewpager2.widget.g$a */
    private static final class C1945a {

        /* renamed from: a */
        int f5859a;

        /* renamed from: b */
        float f5860b;

        /* renamed from: c */
        int f5861c;

        C1945a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6672a() {
            this.f5859a = -1;
            this.f5860b = Utils.FLOAT_EPSILON;
            this.f5861c = 0;
        }
    }

    C1944g(ViewPager2 viewPager2) {
        this.f5847b = viewPager2;
        RecyclerView recyclerView = viewPager2.f5803m;
        this.f5848c = recyclerView;
        this.f5849d = (LinearLayoutManager) recyclerView.getLayoutManager();
        m7629q();
    }

    /* renamed from: f */
    private void m7624f(int i, float f, int i2) {
        ViewPager2.C1928i iVar = this.f5846a;
        if (iVar != null) {
            iVar.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: g */
    private void m7625g(int i) {
        ViewPager2.C1928i iVar = this.f5846a;
        if (iVar != null) {
            iVar.onPageSelected(i);
        }
    }

    /* renamed from: h */
    private void m7626h(int i) {
        if ((this.f5850e != 3 || this.f5851f != 0) && this.f5851f != i) {
            this.f5851f = i;
            ViewPager2.C1928i iVar = this.f5846a;
            if (iVar != null) {
                iVar.onPageScrollStateChanged(i);
            }
        }
    }

    /* renamed from: i */
    private int m7627i() {
        return this.f5849d.mo5219n2();
    }

    /* renamed from: n */
    private boolean m7628n() {
        int i = this.f5850e;
        return i == 1 || i == 4;
    }

    /* renamed from: q */
    private void m7629q() {
        this.f5850e = 0;
        this.f5851f = 0;
        this.f5852g.mo6672a();
        this.f5853h = -1;
        this.f5854i = -1;
        this.f5855j = false;
        this.f5856k = false;
        this.f5858m = false;
        this.f5857l = false;
    }

    /* renamed from: s */
    private void m7630s(boolean z) {
        int i;
        this.f5858m = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.f5850e = i;
        int i2 = this.f5854i;
        if (i2 != -1) {
            this.f5853h = i2;
            this.f5854i = -1;
        } else if (this.f5853h == -1) {
            this.f5853h = m7627i();
        }
        m7626h(1);
    }

    /* renamed from: t */
    private void m7631t() {
        boolean z;
        int i;
        float f;
        C1945a aVar = this.f5852g;
        int n2 = this.f5849d.mo5219n2();
        aVar.f5859a = n2;
        if (n2 == -1) {
            aVar.mo6672a();
            return;
        }
        View O = this.f5849d.mo5199O(n2);
        if (O == null) {
            aVar.mo6672a();
            return;
        }
        int n0 = this.f5849d.mo5695n0(O);
        int s0 = this.f5849d.mo5705s0(O);
        int v0 = this.f5849d.mo5712v0(O);
        int T = this.f5849d.mo5657T(O);
        ViewGroup.LayoutParams layoutParams = O.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            n0 += marginLayoutParams.leftMargin;
            s0 += marginLayoutParams.rightMargin;
            v0 += marginLayoutParams.topMargin;
            T += marginLayoutParams.bottomMargin;
        }
        int height = O.getHeight() + v0 + T;
        int width = O.getWidth() + n0 + s0;
        if (this.f5849d.mo5191B2() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = (O.getLeft() - n0) - this.f5848c.getPaddingLeft();
            if (this.f5847b.mo6593e()) {
                i = -i;
            }
            height = width;
        } else {
            i = (O.getTop() - v0) - this.f5848c.getPaddingTop();
        }
        int i2 = -i;
        aVar.f5861c = i2;
        if (i2 >= 0) {
            if (height == 0) {
                f = Utils.FLOAT_EPSILON;
            } else {
                f = ((float) i2) / ((float) height);
            }
            aVar.f5860b = f;
        } else if (new C1937a(this.f5849d).mo6656d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f5861c)}));
        }
    }

    /* renamed from: d */
    public void mo5739d(RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f5850e == 1 && this.f5851f == 1) && i == 1) {
            m7630s(false);
        } else if (!m7628n() || i != 2) {
            if (m7628n() && i == 0) {
                m7631t();
                if (!this.f5856k) {
                    int i2 = this.f5852g.f5859a;
                    if (i2 != -1) {
                        m7624f(i2, Utils.FLOAT_EPSILON, 0);
                    }
                } else {
                    C1945a aVar = this.f5852g;
                    if (aVar.f5861c == 0) {
                        int i3 = this.f5853h;
                        int i4 = aVar.f5859a;
                        if (i3 != i4) {
                            m7625g(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    m7626h(0);
                    m7629q();
                }
            }
            if (this.f5850e == 2 && i == 0 && this.f5857l) {
                m7631t();
                C1945a aVar2 = this.f5852g;
                if (aVar2.f5861c == 0) {
                    int i5 = this.f5854i;
                    int i6 = aVar2.f5859a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        m7625g(i6);
                    }
                    m7626h(0);
                    m7629q();
                }
            }
        } else if (this.f5856k) {
            m7626h(2);
            this.f5855j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r5 == r3.f5847b.mo6593e()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5740e(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f5856k = r4
            r3.m7631t()
            boolean r0 = r3.f5855j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003d
            r3.f5855j = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = r4
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f5847b
            boolean r6 = r6.mo6593e()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = r2
            goto L_0x0023
        L_0x0022:
            r5 = r4
        L_0x0023:
            if (r5 == 0) goto L_0x002f
            androidx.viewpager2.widget.g$a r5 = r3.f5852g
            int r6 = r5.f5861c
            if (r6 == 0) goto L_0x002f
            int r5 = r5.f5859a
            int r5 = r5 + r4
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.g$a r5 = r3.f5852g
            int r5 = r5.f5859a
        L_0x0033:
            r3.f5854i = r5
            int r6 = r3.f5853h
            if (r6 == r5) goto L_0x004b
            r3.m7625g(r5)
            goto L_0x004b
        L_0x003d:
            int r5 = r3.f5850e
            if (r5 != 0) goto L_0x004b
            androidx.viewpager2.widget.g$a r5 = r3.f5852g
            int r5 = r5.f5859a
            if (r5 != r1) goto L_0x0048
            r5 = r2
        L_0x0048:
            r3.m7625g(r5)
        L_0x004b:
            androidx.viewpager2.widget.g$a r5 = r3.f5852g
            int r6 = r5.f5859a
            if (r6 != r1) goto L_0x0052
            r6 = r2
        L_0x0052:
            float r0 = r5.f5860b
            int r5 = r5.f5861c
            r3.m7624f(r6, r0, r5)
            androidx.viewpager2.widget.g$a r5 = r3.f5852g
            int r6 = r5.f5859a
            int r0 = r3.f5854i
            if (r6 == r0) goto L_0x0063
            if (r0 != r1) goto L_0x0071
        L_0x0063:
            int r5 = r5.f5861c
            if (r5 != 0) goto L_0x0071
            int r5 = r3.f5851f
            if (r5 == r4) goto L_0x0071
            r3.m7626h(r2)
            r3.m7629q()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C1944g.mo5740e(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public double mo6665j() {
        m7631t();
        C1945a aVar = this.f5852g;
        return ((double) aVar.f5859a) + ((double) aVar.f5860b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo6666k() {
        return this.f5851f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo6667l() {
        return this.f5858m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo6668m() {
        return this.f5851f == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo6669o() {
        this.f5857l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6670p(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f5850e = i2;
        boolean z2 = false;
        this.f5858m = false;
        if (this.f5854i != i) {
            z2 = true;
        }
        this.f5854i = i;
        m7626h(2);
        if (z2) {
            m7625g(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo6671r(ViewPager2.C1928i iVar) {
        this.f5846a = iVar;
    }
}
