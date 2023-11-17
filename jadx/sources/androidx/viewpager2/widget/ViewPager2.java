package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.C1827s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.C1918b;
import com.salesforce.marketingcloud.C11398b;
import p099h1.C6420a;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: x */
    static boolean f5793x = true;

    /* renamed from: d */
    private final Rect f5794d = new Rect();

    /* renamed from: e */
    private final Rect f5795e = new Rect();

    /* renamed from: f */
    private C1939b f5796f = new C1939b(3);

    /* renamed from: g */
    int f5797g;

    /* renamed from: h */
    boolean f5798h = false;

    /* renamed from: i */
    private RecyclerView.C1739j f5799i = new C1920a();

    /* renamed from: j */
    private LinearLayoutManager f5800j;

    /* renamed from: k */
    private int f5801k = -1;

    /* renamed from: l */
    private Parcelable f5802l;

    /* renamed from: m */
    RecyclerView f5803m;

    /* renamed from: n */
    private C1827s f5804n;

    /* renamed from: o */
    C1944g f5805o;

    /* renamed from: p */
    private C1939b f5806p;

    /* renamed from: q */
    private C1941d f5807q;

    /* renamed from: r */
    private C1943f f5808r;

    /* renamed from: s */
    private RecyclerView.C1742m f5809s = null;

    /* renamed from: t */
    private boolean f5810t = false;

    /* renamed from: u */
    private boolean f5811u = true;

    /* renamed from: v */
    private int f5812v = -1;

    /* renamed from: w */
    C1924e f5813w;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    class C1920a extends C1926g {
        C1920a() {
            super((C1920a) null);
        }

        /* renamed from: a */
        public void mo5583a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f5798h = true;
            viewPager2.f5805o.mo6669o();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    class C1921b extends C1928i {
        C1921b() {
        }

        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                ViewPager2.this.mo6616q();
            }
        }

        public void onPageSelected(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f5797g != i) {
                viewPager2.f5797g = i;
                viewPager2.f5813w.mo6647q();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    class C1922c extends C1928i {
        C1922c() {
        }

        public void onPageSelected(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f5803m.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    class C1923d implements RecyclerView.C1753r {
        C1923d() {
        }

        /* renamed from: a */
        public void mo5733a(View view) {
        }

        /* renamed from: b */
        public void mo5734b(View view) {
            RecyclerView.C1752q qVar = (RecyclerView.C1752q) view.getLayoutParams();
            if (qVar.width != -1 || qVar.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    private abstract class C1924e {
        private C1924e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6631a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6632b(int i) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6633c(int i, Bundle bundle) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo6634d() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6635e(RecyclerView.C1736h hVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo6636f(RecyclerView.C1736h hVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public String mo6637g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo6638h(C1939b bVar, RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo6639i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo6640j(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo6641k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo6642l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo6643m() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public CharSequence mo6644n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo6645o(AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo6646p() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo6647q() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo6648r() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo6649s() {
        }

        /* synthetic */ C1924e(ViewPager2 viewPager2, C1920a aVar) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    class C1925f extends C1924e {
        C1925f() {
            super(ViewPager2.this, (C1920a) null);
        }

        /* renamed from: b */
        public boolean mo6632b(int i) {
            if ((i == 8192 || i == 4096) && !ViewPager2.this.mo6594f()) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo6634d() {
            return true;
        }

        /* renamed from: j */
        public void mo6640j(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (!ViewPager2.this.mo6594f()) {
                accessibilityNodeInfoCompat.mo3586Q(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3755r);
                accessibilityNodeInfoCompat.mo3586Q(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3754q);
                accessibilityNodeInfoCompat.mo3626s0(false);
            }
        }

        /* renamed from: k */
        public boolean mo6641k(int i) {
            if (mo6632b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        /* renamed from: n */
        public CharSequence mo6644n() {
            if (mo6634d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    private static abstract class C1926g extends RecyclerView.C1739j {
        private C1926g() {
        }

        /* renamed from: a */
        public abstract void mo5583a();

        /* renamed from: b */
        public final void mo5584b(int i, int i2) {
            mo5583a();
        }

        /* renamed from: c */
        public final void mo5585c(int i, int i2, Object obj) {
            mo5583a();
        }

        /* renamed from: d */
        public final void mo5586d(int i, int i2) {
            mo5583a();
        }

        /* renamed from: e */
        public final void mo5587e(int i, int i2, int i3) {
            mo5583a();
        }

        /* renamed from: f */
        public final void mo5588f(int i, int i2) {
            mo5583a();
        }

        /* synthetic */ C1926g(C1920a aVar) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    private class C1927h extends LinearLayoutManager {
        C1927h(Context context) {
            super(context);
        }

        /* renamed from: E1 */
        public boolean mo5627E1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        /* renamed from: Y0 */
        public void mo5160Y0(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.mo5160Y0(wVar, b0Var, accessibilityNodeInfoCompat);
            ViewPager2.this.f5813w.mo6640j(accessibilityNodeInfoCompat);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a2 */
        public void mo5210a2(RecyclerView.C1726b0 b0Var, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo5210a2(b0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        /* renamed from: s1 */
        public boolean mo5706s1(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, int i, Bundle bundle) {
            if (ViewPager2.this.f5813w.mo6632b(i)) {
                return ViewPager2.this.f5813w.mo6641k(i);
            }
            return super.mo5706s1(wVar, b0Var, i, bundle);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public static abstract class C1928i {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    class C1929j extends C1924e {

        /* renamed from: b */
        private final AccessibilityViewCommand f5824b = new C1930a();

        /* renamed from: c */
        private final AccessibilityViewCommand f5825c = new C1931b();

        /* renamed from: d */
        private RecyclerView.C1739j f5826d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        class C1930a implements AccessibilityViewCommand {
            C1930a() {
            }

            /* renamed from: a */
            public boolean mo3654a(View view, AccessibilityViewCommand.C1068a aVar) {
                C1929j.this.mo6651v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        class C1931b implements AccessibilityViewCommand {
            C1931b() {
            }

            /* renamed from: a */
            public boolean mo3654a(View view, AccessibilityViewCommand.C1068a aVar) {
                C1929j.this.mo6651v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        class C1932c extends C1926g {
            C1932c() {
                super((C1920a) null);
            }

            /* renamed from: a */
            public void mo5583a() {
                C1929j.this.mo6652w();
            }
        }

        C1929j() {
            super(ViewPager2.this, (C1920a) null);
        }

        /* renamed from: t */
        private void m7586t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i2 = 0;
                i = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i2 = ViewPager2.this.getAdapter().getItemCount();
                i = 0;
            } else {
                i = ViewPager2.this.getAdapter().getItemCount();
                i2 = 0;
            }
            AccessibilityNodeInfoCompat.m3965A0(accessibilityNodeInfo).mo3595a0(AccessibilityNodeInfoCompat.CollectionInfoCompat.m4048a(i2, i, false, 0));
        }

        /* renamed from: u */
        private void m7587u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.C1736h adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.mo6594f()) {
                if (ViewPager2.this.f5797g > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.f5797g < itemCount - 1) {
                    accessibilityNodeInfo.addAction(C11398b.f33143v);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        /* renamed from: a */
        public boolean mo6631a() {
            return true;
        }

        /* renamed from: c */
        public boolean mo6633c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        /* renamed from: e */
        public void mo6635e(RecyclerView.C1736h hVar) {
            mo6652w();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f5826d);
            }
        }

        /* renamed from: f */
        public void mo6636f(RecyclerView.C1736h hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f5826d);
            }
        }

        /* renamed from: g */
        public String mo6637g() {
            if (mo6631a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        /* renamed from: h */
        public void mo6638h(C1939b bVar, RecyclerView recyclerView) {
            ViewCompat.m3544C0(recyclerView, 2);
            this.f5826d = new C1932c();
            if (ViewCompat.m3634z(ViewPager2.this) == 0) {
                ViewCompat.m3544C0(ViewPager2.this, 1);
            }
        }

        /* renamed from: i */
        public void mo6639i(AccessibilityNodeInfo accessibilityNodeInfo) {
            m7586t(accessibilityNodeInfo);
            m7587u(accessibilityNodeInfo);
        }

        /* renamed from: l */
        public boolean mo6642l(int i, Bundle bundle) {
            int i2;
            if (mo6633c(i, bundle)) {
                if (i == 8192) {
                    i2 = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    i2 = ViewPager2.this.getCurrentItem() + 1;
                }
                mo6651v(i2);
                return true;
            }
            throw new IllegalStateException();
        }

        /* renamed from: m */
        public void mo6643m() {
            mo6652w();
        }

        /* renamed from: o */
        public void mo6645o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo6637g());
        }

        /* renamed from: p */
        public void mo6646p() {
            mo6652w();
        }

        /* renamed from: q */
        public void mo6647q() {
            mo6652w();
        }

        /* renamed from: r */
        public void mo6648r() {
            mo6652w();
        }

        /* renamed from: s */
        public void mo6649s() {
            mo6652w();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo6651v(int i) {
            if (ViewPager2.this.mo6594f()) {
                ViewPager2.this.mo6607m(i, true);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo6652w() {
            int itemCount;
            int i;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i2 = 16908360;
            ViewCompat.m3607l0(viewPager2, 16908360);
            ViewCompat.m3607l0(viewPager2, 16908361);
            ViewCompat.m3607l0(viewPager2, 16908358);
            ViewCompat.m3607l0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0 && ViewPager2.this.mo6594f()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean e = ViewPager2.this.mo6593e();
                    if (e) {
                        i = 16908360;
                    } else {
                        i = 16908361;
                    }
                    if (e) {
                        i2 = 16908361;
                    }
                    if (ViewPager2.this.f5797g < itemCount - 1) {
                        ViewCompat.m3611n0(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i, (CharSequence) null), (CharSequence) null, this.f5824b);
                    }
                    if (ViewPager2.this.f5797g > 0) {
                        ViewCompat.m3611n0(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, (CharSequence) null), (CharSequence) null, this.f5825c);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.f5797g < itemCount - 1) {
                    ViewCompat.m3611n0(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908359, (CharSequence) null), (CharSequence) null, this.f5824b);
                }
                if (ViewPager2.this.f5797g > 0) {
                    ViewCompat.m3611n0(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908358, (CharSequence) null), (CharSequence) null, this.f5825c);
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public interface C1933k {
        /* renamed from: a */
        void mo6653a(View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    private class C1934l extends C1827s {
        C1934l() {
        }

        /* renamed from: h */
        public View mo6024h(RecyclerView.C1747p pVar) {
            if (ViewPager2.this.mo6591d()) {
                return null;
            }
            return super.mo6024h(pVar);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    private class C1935m extends RecyclerView {
        C1935m(Context context) {
            super(context);
        }

        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f5813w.mo6634d()) {
                return ViewPager2.this.f5813w.mo6644n();
            }
            return super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f5797g);
            accessibilityEvent.setToIndex(ViewPager2.this.f5797g);
            ViewPager2.this.f5813w.mo6645o(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo6594f() && super.onInterceptTouchEvent(motionEvent);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo6594f() && super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    private static class C1936n implements Runnable {

        /* renamed from: d */
        private final int f5833d;

        /* renamed from: e */
        private final RecyclerView f5834e;

        C1936n(int i, RecyclerView recyclerView) {
            this.f5833d = i;
            this.f5834e = recyclerView;
        }

        public void run() {
            this.f5834e.mo5263G1(this.f5833d);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7529c(context, attributeSet);
    }

    /* renamed from: b */
    private RecyclerView.C1753r m7528b() {
        return new C1923d();
    }

    /* renamed from: c */
    private void m7529c(Context context, AttributeSet attributeSet) {
        C1924e eVar;
        if (f5793x) {
            eVar = new C1929j();
        } else {
            eVar = new C1925f();
        }
        this.f5813w = eVar;
        C1935m mVar = new C1935m(context);
        this.f5803m = mVar;
        mVar.setId(ViewCompat.m3604k());
        this.f5803m.setDescendantFocusability(131072);
        C1927h hVar = new C1927h(context);
        this.f5800j = hVar;
        this.f5803m.setLayoutManager(hVar);
        this.f5803m.setScrollingTouchSlop(1);
        m7532n(context, attributeSet);
        this.f5803m.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f5803m.mo5357l(m7528b());
        C1944g gVar = new C1944g(this);
        this.f5805o = gVar;
        this.f5807q = new C1941d(this, gVar, this.f5803m);
        C1934l lVar = new C1934l();
        this.f5804n = lVar;
        lVar.mo6073b(this.f5803m);
        this.f5803m.mo5363n(this.f5805o);
        C1939b bVar = new C1939b(3);
        this.f5806p = bVar;
        this.f5805o.mo6671r(bVar);
        C1921b bVar2 = new C1921b();
        C1922c cVar = new C1922c();
        this.f5806p.mo6659a(bVar2);
        this.f5806p.mo6659a(cVar);
        this.f5813w.mo6638h(this.f5806p, this.f5803m);
        this.f5806p.mo6659a(this.f5796f);
        C1943f fVar = new C1943f(this.f5800j);
        this.f5808r = fVar;
        this.f5806p.mo6659a(fVar);
        RecyclerView recyclerView = this.f5803m;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: g */
    private void m7530g(RecyclerView.C1736h hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f5799i);
        }
    }

    /* renamed from: k */
    private void m7531k() {
        RecyclerView.C1736h adapter;
        if (this.f5801k != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.f5802l;
            if (parcelable != null) {
                if (adapter instanceof C1918b) {
                    ((C1918b) adapter).mo6568c(parcelable);
                }
                this.f5802l = null;
            }
            int max = Math.max(0, Math.min(this.f5801k, adapter.getItemCount() - 1));
            this.f5797g = max;
            this.f5801k = -1;
            this.f5803m.mo5425x1(max);
            this.f5813w.mo6643m();
        }
    }

    /* renamed from: n */
    private void m7532n(Context context, AttributeSet attributeSet) {
        int[] iArr = C6420a.f19691g;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C6420a.f19692h, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: o */
    private void m7533o(RecyclerView.C1736h hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f5799i);
        }
    }

    /* renamed from: a */
    public void mo6588a(RecyclerView.C1746o oVar) {
        this.f5803m.mo5351j(oVar);
    }

    public boolean canScrollHorizontally(int i) {
        return this.f5803m.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.f5803m.canScrollVertically(i);
    }

    /* renamed from: d */
    public boolean mo6591d() {
        return this.f5807q.mo6662a();
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f5814d;
            sparseArray.put(this.f5803m.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m7531k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo6593e() {
        return this.f5800j.mo5692m0() == 1;
    }

    /* renamed from: f */
    public boolean mo6594f() {
        return this.f5811u;
    }

    public CharSequence getAccessibilityClassName() {
        if (this.f5813w.mo6631a()) {
            return this.f5813w.mo6637g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.C1736h getAdapter() {
        return this.f5803m.getAdapter();
    }

    public int getCurrentItem() {
        return this.f5797g;
    }

    public int getItemDecorationCount() {
        return this.f5803m.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f5812v;
    }

    public int getOrientation() {
        return this.f5800j.mo5191B2();
    }

    /* access modifiers changed from: package-private */
    public int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.f5803m;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    public int getScrollState() {
        return this.f5805o.mo6666k();
    }

    /* renamed from: h */
    public void mo6603h(C1928i iVar) {
        this.f5796f.mo6659a(iVar);
    }

    /* renamed from: i */
    public void mo6604i(int i) {
        this.f5803m.mo5362m1(i);
    }

    /* renamed from: j */
    public void mo6605j() {
        if (this.f5808r.mo6663a() != null) {
            double j = this.f5805o.mo6665j();
            int i = (int) j;
            float f = (float) (j - ((double) i));
            this.f5808r.onPageScrolled(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    /* renamed from: l */
    public void mo6606l(int i, boolean z) {
        if (!mo6591d()) {
            mo6607m(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6607m(int i, boolean z) {
        int i2;
        RecyclerView.C1736h adapter = getAdapter();
        if (adapter == null) {
            if (this.f5801k != -1) {
                this.f5801k = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min != this.f5797g || !this.f5805o.mo6668m()) {
                int i3 = this.f5797g;
                if (min != i3 || !z) {
                    double d = (double) i3;
                    this.f5797g = min;
                    this.f5813w.mo6647q();
                    if (!this.f5805o.mo6668m()) {
                        d = this.f5805o.mo6665j();
                    }
                    this.f5805o.mo6670p(min, z);
                    if (!z) {
                        this.f5803m.mo5425x1(min);
                        return;
                    }
                    double d2 = (double) min;
                    if (Math.abs(d2 - d) > 3.0d) {
                        RecyclerView recyclerView = this.f5803m;
                        if (d2 > d) {
                            i2 = min - 3;
                        } else {
                            i2 = min + 3;
                        }
                        recyclerView.mo5425x1(i2);
                        RecyclerView recyclerView2 = this.f5803m;
                        recyclerView2.post(new C1936n(min, recyclerView2));
                        return;
                    }
                    this.f5803m.mo5263G1(min);
                }
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f5813w.mo6639i(accessibilityNodeInfo);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f5803m.getMeasuredWidth();
        int measuredHeight = this.f5803m.getMeasuredHeight();
        this.f5794d.left = getPaddingLeft();
        this.f5794d.right = (i3 - i) - getPaddingRight();
        this.f5794d.top = getPaddingTop();
        this.f5794d.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f5794d, this.f5795e);
        RecyclerView recyclerView = this.f5803m;
        Rect rect = this.f5795e;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f5798h) {
            mo6616q();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        measureChild(this.f5803m, i, i2);
        int measuredWidth = this.f5803m.getMeasuredWidth();
        int measuredHeight = this.f5803m.getMeasuredHeight();
        int measuredState = this.f5803m.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f5801k = savedState.f5815e;
        this.f5802l = savedState.f5816f;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5814d = this.f5803m.getId();
        int i = this.f5801k;
        if (i == -1) {
            i = this.f5797g;
        }
        savedState.f5815e = i;
        Parcelable parcelable = this.f5802l;
        if (parcelable != null) {
            savedState.f5816f = parcelable;
        } else {
            RecyclerView.C1736h adapter = this.f5803m.getAdapter();
            if (adapter instanceof C1918b) {
                savedState.f5816f = ((C1918b) adapter).mo6567a();
            }
        }
        return savedState;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    /* renamed from: p */
    public void mo6614p(C1928i iVar) {
        this.f5796f.mo6660b(iVar);
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f5813w.mo6633c(i, bundle)) {
            return this.f5813w.mo6642l(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo6616q() {
        C1827s sVar = this.f5804n;
        if (sVar != null) {
            View h = sVar.mo6024h(this.f5800j);
            if (h != null) {
                int q0 = this.f5800j.mo5700q0(h);
                if (q0 != this.f5797g && getScrollState() == 0) {
                    this.f5806p.onPageSelected(q0);
                }
                this.f5798h = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public void setAdapter(RecyclerView.C1736h hVar) {
        RecyclerView.C1736h adapter = this.f5803m.getAdapter();
        this.f5813w.mo6636f(adapter);
        m7533o(adapter);
        this.f5803m.setAdapter(hVar);
        this.f5797g = 0;
        m7531k();
        this.f5813w.mo6635e(hVar);
        m7530g(hVar);
    }

    public void setCurrentItem(int i) {
        mo6606l(i, true);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f5813w.mo6646p();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.f5812v = i;
            this.f5803m.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.f5800j.mo5203R2(i);
        this.f5813w.mo6648r();
    }

    public void setPageTransformer(C1933k kVar) {
        if (kVar != null) {
            if (!this.f5810t) {
                this.f5809s = this.f5803m.getItemAnimator();
                this.f5810t = true;
            }
            this.f5803m.setItemAnimator((RecyclerView.C1742m) null);
        } else if (this.f5810t) {
            this.f5803m.setItemAnimator(this.f5809s);
            this.f5809s = null;
            this.f5810t = false;
        }
        if (kVar != this.f5808r.mo6663a()) {
            this.f5808r.mo6664b(kVar);
            mo6605j();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.f5811u = z;
        this.f5813w.mo6649s();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1919a();

        /* renamed from: d */
        int f5814d;

        /* renamed from: e */
        int f5815e;

        /* renamed from: f */
        Parcelable f5816f;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        static class C1919a implements Parcelable.ClassLoaderCreator {
            C1919a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m7545a(parcel, classLoader);
        }

        /* renamed from: a */
        private void m7545a(Parcel parcel, ClassLoader classLoader) {
            this.f5814d = parcel.readInt();
            this.f5815e = parcel.readInt();
            this.f5816f = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5814d);
            parcel.writeInt(this.f5815e);
            parcel.writeParcelable(this.f5816f, i);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            m7545a(parcel, (ClassLoader) null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
