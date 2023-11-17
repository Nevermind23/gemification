package p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.github.mikephil.charting.utils.Utils;
import com.google.firebase.crashlytics.C5263a;
import kotlin.jvm.internal.C41536l;
import p366bk.C10316e;
import p366bk.C10329r;
import p366bk.C10330s;
import z00.C30128d;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator */
public final class ScrollingPagerIndicator extends View {

    /* renamed from: d */
    private int f57447d;

    /* renamed from: e */
    private int f57448e;

    /* renamed from: f */
    private int f57449f;

    /* renamed from: g */
    private int f57450g;

    /* renamed from: h */
    private int f57451h;

    /* renamed from: i */
    private int f57452i;

    /* renamed from: j */
    private int f57453j;

    /* renamed from: k */
    private int f57454k;

    /* renamed from: l */
    private float f57455l;

    /* renamed from: m */
    private float f57456m;

    /* renamed from: n */
    private float f57457n;

    /* renamed from: o */
    private SparseArray f57458o;

    /* renamed from: p */
    private int f57459p;

    /* renamed from: q */
    private Paint f57460q;

    /* renamed from: r */
    private final ArgbEvaluator f57461r;

    /* renamed from: s */
    private int f57462s;

    /* renamed from: t */
    private int f57463t;

    /* renamed from: u */
    private boolean f57464u;

    /* renamed from: v */
    private Runnable f57465v;

    /* renamed from: w */
    private C21495a f57466w;

    /* renamed from: x */
    private boolean f57467x;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator$a */
    public interface C21495a {
        /* renamed from: a */
        void mo53692a();

        /* renamed from: b */
        void mo53693b(ScrollingPagerIndicator scrollingPagerIndicator, ViewPager2 viewPager2);
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator$b */
    public final class C21496b implements C21495a {

        /* renamed from: a */
        private RecyclerView.C1739j f57468a;

        /* renamed from: b */
        private RecyclerView.C1736h f57469b;

        /* renamed from: c */
        private ViewPager2.C1928i f57470c;

        /* renamed from: d */
        private ViewPager2 f57471d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator$b$a */
        public static final class C21497a extends RecyclerView.C1739j {

            /* renamed from: a */
            final /* synthetic */ ScrollingPagerIndicator f57473a;

            /* renamed from: b */
            final /* synthetic */ ViewPager2 f57474b;

            C21497a(ScrollingPagerIndicator scrollingPagerIndicator, ViewPager2 viewPager2) {
                this.f57473a = scrollingPagerIndicator;
                this.f57474b = viewPager2;
            }

            /* renamed from: a */
            public void mo5583a() {
                this.f57473a.mo53681l();
            }

            /* renamed from: b */
            public void mo5584b(int i, int i2) {
                this.f57473a.mo53681l();
            }

            /* renamed from: c */
            public void mo5585c(int i, int i2, Object obj) {
                this.f57473a.mo53681l();
            }

            /* renamed from: d */
            public void mo5586d(int i, int i2) {
                this.f57473a.mo53681l();
            }

            /* renamed from: e */
            public void mo5587e(int i, int i2, int i3) {
                this.f57473a.mo53681l();
            }

            /* renamed from: f */
            public void mo5588f(int i, int i2) {
                if (this.f57474b.getCurrentItem() >= i && this.f57474b.getCurrentItem() < i2 + i) {
                    this.f57474b.setCurrentItem(Math.max(i - 1, 0));
                }
                this.f57473a.mo53681l();
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator$b$b */
        public static final class C21498b extends ViewPager2.C1928i {

            /* renamed from: a */
            private boolean f57475a = true;

            /* renamed from: b */
            final /* synthetic */ C21496b f57476b;

            /* renamed from: c */
            final /* synthetic */ ScrollingPagerIndicator f57477c;

            C21498b(C21496b bVar, ScrollingPagerIndicator scrollingPagerIndicator) {
                this.f57476b = bVar;
                this.f57477c = scrollingPagerIndicator;
            }

            public void onPageScrollStateChanged(int i) {
                this.f57475a = i == 0;
            }

            public void onPageScrolled(int i, float f, int i2) {
                this.f57476b.mo53694e(this.f57477c, i, f);
            }

            public void onPageSelected(int i) {
                if (this.f57475a) {
                    this.f57476b.m69483d(this.f57477c);
                }
            }
        }

        public C21496b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m69483d(ScrollingPagerIndicator scrollingPagerIndicator) {
            RecyclerView.C1736h hVar = this.f57469b;
            C41536l.m120486f(hVar);
            scrollingPagerIndicator.setDotCount(hVar.getItemCount());
            ViewPager2 viewPager2 = this.f57471d;
            C41536l.m120486f(viewPager2);
            scrollingPagerIndicator.setCurrentPosition(viewPager2.getCurrentItem());
        }

        /* renamed from: a */
        public void mo53692a() {
            RecyclerView.C1736h hVar = this.f57469b;
            C41536l.m120486f(hVar);
            RecyclerView.C1739j jVar = this.f57468a;
            C41536l.m120486f(jVar);
            hVar.unregisterAdapterDataObserver(jVar);
            ViewPager2 viewPager2 = this.f57471d;
            C41536l.m120486f(viewPager2);
            ViewPager2.C1928i iVar = this.f57470c;
            C41536l.m120486f(iVar);
            viewPager2.mo6614p(iVar);
        }

        /* renamed from: b */
        public void mo53693b(ScrollingPagerIndicator scrollingPagerIndicator, ViewPager2 viewPager2) {
            C41536l.m120489i(scrollingPagerIndicator, "indicator");
            C41536l.m120489i(viewPager2, "pager");
            RecyclerView.C1736h adapter = viewPager2.getAdapter();
            this.f57469b = adapter;
            if (adapter != null) {
                this.f57471d = viewPager2;
                m69483d(scrollingPagerIndicator);
                this.f57468a = new C21497a(scrollingPagerIndicator, viewPager2);
                RecyclerView.C1736h hVar = this.f57469b;
                C41536l.m120486f(hVar);
                RecyclerView.C1739j jVar = this.f57468a;
                C41536l.m120486f(jVar);
                hVar.registerAdapterDataObserver(jVar);
                C21498b bVar = new C21498b(this, scrollingPagerIndicator);
                this.f57470c = bVar;
                C41536l.m120486f(bVar);
                viewPager2.mo6603h(bVar);
                return;
            }
            throw new IllegalStateException("Set adapter before call attachToPager() method".toString());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (r5 > 1.0f) goto L_0x000a;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo53694e(p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator r3, int r4, float r5) {
            /*
                r2 = this;
                java.lang.String r0 = "indicator"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                r0 = 0
                int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r1 >= 0) goto L_0x000c
            L_0x000a:
                r5 = r0
                goto L_0x0013
            L_0x000c:
                r0 = 1065353216(0x3f800000, float:1.0)
                int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r1 <= 0) goto L_0x0013
                goto L_0x000a
            L_0x0013:
                r3.mo53680k(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator.C21496b.mo53694e(ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator, int, float):void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrollingPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10316e.f28615x);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: b */
    private final void m69466b(float f, int i) {
        int i2 = this.f57459p;
        int i3 = this.f57452i;
        if (i2 <= i3) {
            this.f57455l = Utils.FLOAT_EPSILON;
        } else if (this.f57464u || i2 <= i3) {
            this.f57455l = (m69469h(this.f57447d / 2) + (((float) this.f57451h) * f)) - (this.f57456m / ((float) 2));
        } else {
            float f2 = (float) 2;
            this.f57455l = (m69469h(i) + (((float) this.f57451h) * f)) - (this.f57456m / f2);
            int i4 = this.f57452i / 2;
            float h = m69469h((getDotCount() - 1) - i4);
            if (this.f57455l + (this.f57456m / f2) < m69469h(i4)) {
                this.f57455l = m69469h(i4) - (this.f57456m / f2);
                return;
            }
            float f3 = this.f57455l;
            float f4 = this.f57456m;
            if (f3 + (f4 / f2) > h) {
                this.f57455l = h - (f4 / f2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m69467e(ScrollingPagerIndicator scrollingPagerIndicator, ViewPager2 viewPager2, C21495a aVar) {
        C41536l.m120489i(scrollingPagerIndicator, "this$0");
        C41536l.m120489i(viewPager2, "$pager");
        C41536l.m120489i(aVar, "$attacher");
        scrollingPagerIndicator.f57459p = -1;
        scrollingPagerIndicator.mo53673d(viewPager2, aVar);
    }

    /* renamed from: f */
    private final int m69468f(float f) {
        Object evaluate = this.f57461r.evaluate(f, Integer.valueOf(this.f57462s), Integer.valueOf(this.f57463t));
        C41536l.m120487g(evaluate, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) evaluate).intValue();
    }

    private final int getDotCount() {
        if (!this.f57464u || this.f57459p <= this.f57452i) {
            return this.f57459p;
        }
        return this.f57447d;
    }

    /* renamed from: h */
    private final float m69469h(int i) {
        return this.f57457n + ((float) (i * this.f57451h));
    }

    /* renamed from: i */
    private final float m69470i(int i) {
        SparseArray sparseArray = this.f57458o;
        C41536l.m120486f(sparseArray);
        Float f = (Float) sparseArray.get(i);
        if (f == null) {
            return Utils.FLOAT_EPSILON;
        }
        return f.floatValue();
    }

    /* renamed from: j */
    private final void m69471j(int i) {
        float f;
        if (this.f57459p != i || !this.f57467x) {
            this.f57459p = i;
            this.f57467x = true;
            this.f57458o = new SparseArray();
            if (i < this.f57453j) {
                requestLayout();
                invalidate();
                return;
            }
            if (!this.f57464u || this.f57459p <= this.f57452i) {
                f = ((float) this.f57450g) / 2.0f;
            } else {
                f = Utils.FLOAT_EPSILON;
            }
            this.f57457n = f;
            this.f57456m = ((float) ((this.f57452i - 1) * this.f57451h)) + ((float) this.f57450g);
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: m */
    private final void m69472m(int i, float f) {
        if (this.f57458o != null && getDotCount() != 0) {
            m69473n(i, ((float) 1) - Math.abs(f));
        }
    }

    /* renamed from: n */
    private final void m69473n(int i, float f) {
        boolean z;
        if (f == Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SparseArray sparseArray = this.f57458o;
            C41536l.m120486f(sparseArray);
            sparseArray.remove(i);
            return;
        }
        SparseArray sparseArray2 = this.f57458o;
        C41536l.m120486f(sparseArray2);
        sparseArray2.put(i, Float.valueOf(f));
    }

    /* renamed from: o */
    private final void m69474o(int i) {
        if (!this.f57464u || this.f57459p < this.f57452i) {
            SparseArray sparseArray = this.f57458o;
            C41536l.m120486f(sparseArray);
            sparseArray.clear();
            SparseArray sparseArray2 = this.f57458o;
            C41536l.m120486f(sparseArray2);
            sparseArray2.put(i, Float.valueOf(1.0f));
            invalidate();
        }
    }

    /* renamed from: c */
    public final void mo53672c(ViewPager2 viewPager2) {
        C41536l.m120489i(viewPager2, "pager");
        mo53673d(viewPager2, new C21496b());
    }

    /* renamed from: d */
    public final void mo53673d(ViewPager2 viewPager2, C21495a aVar) {
        C41536l.m120489i(viewPager2, "pager");
        C41536l.m120489i(aVar, "attacher");
        mo53674g();
        aVar.mo53693b(this, viewPager2);
        this.f57466w = aVar;
        this.f57465v = new C30128d(this, viewPager2, aVar);
    }

    /* renamed from: g */
    public final void mo53674g() {
        C21495a aVar = this.f57466w;
        if (aVar != null) {
            C41536l.m120486f(aVar);
            aVar.mo53692a();
            this.f57466w = null;
            this.f57465v = null;
        }
        this.f57467x = false;
    }

    public final int getDotColor() {
        return this.f57462s;
    }

    public final int getOrientation() {
        return this.f57454k;
    }

    public final int getSelectedDotColor() {
        return this.f57463t;
    }

    public final int getVisibleDotCount() {
        return this.f57452i;
    }

    public final int getVisibleDotThreshold() {
        return this.f57453j;
    }

    /* renamed from: k */
    public final void mo53680k(int i, float f) {
        boolean z;
        int i2;
        if (f < Utils.FLOAT_EPSILON || f > 1.0f) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Offset must be [0, 1]".toString());
        } else if (i < 0 || (i != 0 && i >= this.f57459p)) {
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        } else {
            if (!this.f57464u || ((i2 = this.f57459p) <= this.f57452i && i2 > 1)) {
                SparseArray sparseArray = this.f57458o;
                C41536l.m120486f(sparseArray);
                sparseArray.clear();
                if (this.f57454k == 0) {
                    m69472m(i, f);
                    int i3 = this.f57459p;
                    if (i < i3 - 1) {
                        m69472m(i + 1, ((float) 1) - f);
                    } else if (i3 > 1) {
                        m69472m(0, ((float) 1) - f);
                    }
                } else {
                    m69472m(i - 1, f);
                    m69472m(i, ((float) 1) - f);
                }
                invalidate();
            }
            if (this.f57454k == 0) {
                m69466b(f, i);
            } else {
                m69466b(f, i - 1);
            }
            invalidate();
        }
    }

    /* renamed from: l */
    public final void mo53681l() {
        Runnable runnable = this.f57465v;
        if (runnable != null) {
            C41536l.m120486f(runnable);
            runnable.run();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012c A[LOOP:0: B:9:0x004a->B:63:0x012c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0131 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "canvas"
            kotlin.jvm.internal.C41536l.m120489i(r1, r2)
            int r2 = r17.getDotCount()
            int r3 = r0.f57453j
            if (r2 >= r3) goto L_0x0012
            return
        L_0x0012:
            int r3 = r0.f57451h
            int r4 = r0.f57450g
            int r5 = r0.f57449f
            int r5 = r4 - r5
            r6 = 2
            int r5 = r5 / r6
            int r5 = r5 + r3
            float r5 = (float) r5
            r7 = 1060320051(0x3f333333, float:0.7)
            float r5 = r5 * r7
            float r4 = (float) r4
            r7 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r7
            r8 = 1062956471(0x3f5b6db7, float:0.85714287)
            float r9 = (float) r3
            float r9 = r9 * r8
            float r8 = r0.f57455l
            float r10 = r0.f57457n
            float r10 = r8 - r10
            int r10 = (int) r10
            int r10 = r10 / r3
            float r3 = r0.f57456m
            float r8 = r8 + r3
            float r3 = r0.m69469h(r10)
            float r8 = r8 - r3
            int r3 = (int) r8
            int r8 = r0.f57451h
            int r3 = r3 / r8
            int r3 = r3 + r10
            if (r10 != 0) goto L_0x0048
            int r8 = r3 + 1
            if (r8 <= r2) goto L_0x0048
            int r3 = r2 + -1
        L_0x0048:
            if (r10 > r3) goto L_0x0131
        L_0x004a:
            float r8 = r0.m69469h(r10)
            float r11 = r0.f57455l
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 < 0) goto L_0x0129
            float r12 = r0.f57456m
            float r13 = r11 + r12
            int r13 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x0129
            boolean r13 = r0.f57464u
            r14 = 1
            if (r13 == 0) goto L_0x008c
            int r13 = r0.f57459p
            int r15 = r0.f57452i
            if (r13 <= r15) goto L_0x008c
            float r13 = (float) r6
            float r12 = r12 / r13
            float r11 = r11 + r12
            float r12 = r11 - r9
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 < 0) goto L_0x0079
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 > 0) goto L_0x0079
            float r11 = r8 - r11
            float r11 = r11 + r9
            float r11 = r11 / r9
            goto L_0x0090
        L_0x0079:
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x008a
            float r12 = r11 + r9
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x008a
            float r12 = (float) r14
            float r11 = r8 - r11
            float r11 = r11 / r9
            float r11 = r12 - r11
            goto L_0x0090
        L_0x008a:
            r11 = 0
            goto L_0x0090
        L_0x008c:
            float r11 = r0.m69470i(r10)
        L_0x0090:
            int r12 = r0.f57449f
            float r13 = (float) r12
            int r15 = r0.f57450g
            int r15 = r15 - r12
            float r12 = (float) r15
            float r12 = r12 * r11
            float r13 = r13 + r12
            int r12 = r0.f57459p
            int r15 = r0.f57452i
            if (r12 <= r15) goto L_0x00ef
            boolean r12 = r0.f57464u
            if (r12 != 0) goto L_0x00ab
            if (r10 == 0) goto L_0x00a9
            int r12 = r2 + -1
            if (r10 != r12) goto L_0x00ab
        L_0x00a9:
            r12 = r4
            goto L_0x00ac
        L_0x00ab:
            r12 = r5
        L_0x00ac:
            int r15 = r17.getWidth()
            int r6 = r0.f57454k
            if (r6 != r14) goto L_0x00b8
            int r15 = r17.getHeight()
        L_0x00b8:
            float r6 = r0.f57455l
            float r14 = r8 - r6
            int r14 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x00d3
            float r6 = r8 - r6
            float r6 = r6 * r13
            float r6 = r6 / r12
            int r12 = r0.f57448e
            float r14 = (float) r12
            int r14 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x00cd
            float r13 = (float) r12
            goto L_0x00ef
        L_0x00cd:
            int r12 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x00ef
            r13 = r6
            goto L_0x00ef
        L_0x00d3:
            float r14 = r8 - r6
            float r15 = (float) r15
            float r16 = r15 - r12
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x00ef
            float r14 = -r8
            float r14 = r14 + r6
            float r14 = r14 + r15
            float r14 = r14 * r13
            float r14 = r14 / r12
            int r6 = r0.f57448e
            float r12 = (float) r6
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x00ea
            float r13 = (float) r6
            goto L_0x00ef
        L_0x00ea:
            int r6 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ef
            r13 = r14
        L_0x00ef:
            android.graphics.Paint r6 = r0.f57460q
            kotlin.jvm.internal.C41536l.m120486f(r6)
            int r11 = r0.m69468f(r11)
            r6.setColor(r11)
            int r6 = r0.f57454k
            if (r6 != 0) goto L_0x0114
            float r6 = r0.f57455l
            float r8 = r8 - r6
            int r6 = r17.getMeasuredHeight()
            float r6 = (float) r6
            float r6 = r6 / r7
            r11 = 2
            float r12 = (float) r11
            float r13 = r13 / r12
            android.graphics.Paint r12 = r0.f57460q
            kotlin.jvm.internal.C41536l.m120486f(r12)
            r1.drawCircle(r8, r6, r13, r12)
            goto L_0x012a
        L_0x0114:
            r11 = 2
            int r6 = r17.getMeasuredWidth()
            float r6 = (float) r6
            float r6 = r6 / r7
            float r12 = r0.f57455l
            float r8 = r8 - r12
            float r12 = (float) r11
            float r13 = r13 / r12
            android.graphics.Paint r12 = r0.f57460q
            kotlin.jvm.internal.C41536l.m120486f(r12)
            r1.drawCircle(r6, r8, r13, r12)
            goto L_0x012a
        L_0x0129:
            r11 = r6
        L_0x012a:
            if (r10 == r3) goto L_0x0131
            int r10 = r10 + 1
            r6 = r11
            goto L_0x004a
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f57454k
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x0040
            boolean r5 = r4.isInEditMode()
            if (r5 == 0) goto L_0x0019
            int r5 = r4.f57452i
            int r5 = r5 + -1
            int r0 = r4.f57451h
            int r5 = r5 * r0
            int r0 = r4.f57450g
        L_0x0017:
            int r5 = r5 + r0
            goto L_0x002b
        L_0x0019:
            int r5 = r4.f57459p
            int r0 = r4.f57452i
            if (r5 < r0) goto L_0x0023
            float r5 = r4.f57456m
            int r5 = (int) r5
            goto L_0x002b
        L_0x0023:
            int r5 = r5 + -1
            int r0 = r4.f57451h
            int r5 = r5 * r0
            int r0 = r4.f57450g
            goto L_0x0017
        L_0x002b:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r3 = r4.f57450g
            if (r0 == r2) goto L_0x003b
            if (r0 == r1) goto L_0x0077
            r6 = r3
            goto L_0x0077
        L_0x003b:
            int r6 = java.lang.Math.min(r3, r6)
            goto L_0x0077
        L_0x0040:
            boolean r6 = r4.isInEditMode()
            if (r6 == 0) goto L_0x0051
            int r6 = r4.f57452i
            int r6 = r6 + -1
            int r0 = r4.f57451h
            int r6 = r6 * r0
            int r0 = r4.f57450g
        L_0x004f:
            int r6 = r6 + r0
            goto L_0x0063
        L_0x0051:
            int r6 = r4.f57459p
            int r0 = r4.f57452i
            if (r6 < r0) goto L_0x005b
            float r6 = r4.f57456m
            int r6 = (int) r6
            goto L_0x0063
        L_0x005b:
            int r6 = r6 + -1
            int r0 = r4.f57451h
            int r6 = r6 * r0
            int r0 = r4.f57450g
            goto L_0x004f
        L_0x0063:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r3 = r4.f57450g
            if (r0 == r2) goto L_0x0073
            if (r0 == r1) goto L_0x0077
            r5 = r3
            goto L_0x0077
        L_0x0073:
            int r5 = java.lang.Math.min(r3, r5)
        L_0x0077:
            r4.setMeasuredDimension(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator.onMeasure(int, int):void");
    }

    public final void setCurrentPosition(int i) {
        if (i != 0 && (i < 0 || i >= this.f57459p)) {
            C5263a a = C5263a.m20766a();
            a.mo17443c("ScrollingPager " + i);
            i = 0;
        }
        if (this.f57459p != 0) {
            m69466b(Utils.FLOAT_EPSILON, i);
            m69474o(i);
        }
    }

    public final void setDotColor(int i) {
        this.f57462s = i;
        invalidate();
    }

    public final void setDotCount(int i) {
        m69471j(i);
    }

    public final void setLooped(boolean z) {
        this.f57464u = z;
        mo53681l();
        invalidate();
    }

    public final void setOrientation(int i) {
        this.f57454k = i;
        if (this.f57465v != null) {
            mo53681l();
        } else {
            requestLayout();
        }
    }

    public final void setSelectedDotColor(int i) {
        this.f57463t = i;
        invalidate();
    }

    public final void setVisibleDotCount(int i) {
        boolean z;
        if (i % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f57452i = i;
            this.f57447d = i + 2;
            if (this.f57465v != null) {
                mo53681l();
            } else {
                requestLayout();
            }
        } else {
            throw new IllegalArgumentException("visibleDotCount must be odd".toString());
        }
    }

    public final void setVisibleDotThreshold(int i) {
        this.f57453j = i;
        if (this.f57465v != null) {
            mo53681l();
        } else {
            requestLayout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f57461r = new ArgbEvaluator();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10330s.f29025E6, i, C10329r.f28973o);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…gPagerIndicator\n        )");
        int color = obtainStyledAttributes.getColor(C10330s.f29035F6, 0);
        this.f57462s = color;
        this.f57463t = obtainStyledAttributes.getColor(C10330s.f29055H6, color);
        this.f57449f = obtainStyledAttributes.getDimensionPixelSize(C10330s.f29075J6, 0);
        this.f57450g = obtainStyledAttributes.getDimensionPixelSize(C10330s.f29065I6, 0);
        int i2 = -1;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C10330s.f29045G6, -1);
        this.f57448e = dimensionPixelSize <= this.f57449f ? dimensionPixelSize : i2;
        this.f57451h = obtainStyledAttributes.getDimensionPixelSize(C10330s.f29085K6, 0) + this.f57449f;
        this.f57464u = obtainStyledAttributes.getBoolean(C10330s.f29095L6, false);
        int i3 = obtainStyledAttributes.getInt(C10330s.f29115N6, 0);
        setVisibleDotCount(i3);
        this.f57453j = obtainStyledAttributes.getInt(C10330s.f29125O6, 2);
        this.f57454k = obtainStyledAttributes.getInt(C10330s.f29105M6, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f57460q = paint;
        C41536l.m120486f(paint);
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i3);
            mo53680k(i3 / 2, Utils.FLOAT_EPSILON);
        }
    }
}
