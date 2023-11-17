package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p175n.C7177e;
import p214q.C7803d;
import p214q.C7806e;
import p214q.C7809f;
import p214q.C7810g;
import p214q.C7814j;
import p227r.C8006b;

public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static C0640h sSharedValues;
    SparseArray<View> mChildrenByIds = new SparseArray<>();
    /* access modifiers changed from: private */
    public ArrayList<C0626b> mConstraintHelpers = new ArrayList<>(4);
    protected C0627c mConstraintLayoutSpec = null;
    private C0630d mConstraintSet = null;
    private int mConstraintSetId = -1;
    private C0637e mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds = new HashMap<>();
    protected boolean mDirtyHierarchy = true;
    private int mLastMeasureHeight = -1;
    int mLastMeasureHeightMode = 0;
    int mLastMeasureHeightSize = -1;
    private int mLastMeasureWidth = -1;
    int mLastMeasureWidthMode = 0;
    int mLastMeasureWidthSize = -1;
    protected C7809f mLayoutWidget = new C7809f();
    private int mMaxHeight = Integer.MAX_VALUE;
    private int mMaxWidth = Integer.MAX_VALUE;
    C0622c mMeasurer = new C0622c(this);
    private C7177e mMetrics;
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    private int mOnMeasureHeightMeasureSpec = 0;
    private int mOnMeasureWidthMeasureSpec = 0;
    /* access modifiers changed from: private */
    public int mOptimizationLevel = 257;
    private SparseArray<C7806e> mTempMapIdToWidget = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0619a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2489a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                q.e$b[] r0 = p214q.C7806e.C7808b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2489a = r0
                q.e$b r1 = p214q.C7806e.C7808b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2489a     // Catch:{ NoSuchFieldError -> 0x001d }
                q.e$b r1 = p214q.C7806e.C7808b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2489a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q.e$b r1 = p214q.C7806e.C7808b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2489a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q.e$b r1 = p214q.C7806e.C7808b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0619a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    class C0622c implements C8006b.C8008b {

        /* renamed from: a */
        ConstraintLayout f2566a;

        /* renamed from: b */
        int f2567b;

        /* renamed from: c */
        int f2568c;

        /* renamed from: d */
        int f2569d;

        /* renamed from: e */
        int f2570e;

        /* renamed from: f */
        int f2571f;

        /* renamed from: g */
        int f2572g;

        public C0622c(ConstraintLayout constraintLayout) {
            this.f2566a = constraintLayout;
        }

        /* renamed from: d */
        private boolean m2391d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo2896a() {
            int childCount = this.f2566a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2566a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).mo2911b(this.f2566a);
                }
            }
            int size = this.f2566a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0626b) this.f2566a.mConstraintHelpers.get(i2)).mo2922l(this.f2566a);
                }
            }
        }

        /* renamed from: b */
        public final void mo2897b(C7806e eVar, C8006b.C8007a aVar) {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int i3;
            int i4;
            int i5;
            int i6;
            boolean z7;
            boolean z8;
            int i7;
            int i8;
            boolean z9;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            C7806e eVar2 = eVar;
            C8006b.C8007a aVar2 = aVar;
            if (eVar2 != null) {
                if (eVar.mo22625T() == 8 && !eVar.mo22654h0()) {
                    aVar2.f23081e = 0;
                    aVar2.f23082f = 0;
                    aVar2.f23083g = 0;
                } else if (eVar.mo22605I() != null) {
                    C7806e.C7808b bVar = aVar2.f23077a;
                    C7806e.C7808b bVar2 = aVar2.f23078b;
                    int i9 = aVar2.f23079c;
                    int i12 = aVar2.f23080d;
                    int i13 = this.f2567b + this.f2568c;
                    int i14 = this.f2569d;
                    View view = (View) eVar.mo22674q();
                    int[] iArr = C0619a.f2489a;
                    int i15 = iArr[bVar.ordinal()];
                    if (i15 == 1) {
                        i = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    } else if (i15 == 2) {
                        i = ViewGroup.getChildMeasureSpec(this.f2571f, i14, -2);
                    } else if (i15 == 3) {
                        i = ViewGroup.getChildMeasureSpec(this.f2571f, i14 + eVar.mo22689z(), -1);
                    } else if (i15 != 4) {
                        i = 0;
                    } else {
                        i = ViewGroup.getChildMeasureSpec(this.f2571f, i14, -2);
                        if (eVar2.f22656w == 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        int i16 = aVar2.f23086j;
                        if (i16 == C8006b.C8007a.f23075l || i16 == C8006b.C8007a.f23076m) {
                            if (view.getMeasuredHeight() == eVar.mo22683v()) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (aVar2.f23086j == C8006b.C8007a.f23076m || !z15 || ((z15 && z16) || (view instanceof Placeholder) || eVar.mo22556l0())) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                i = View.MeasureSpec.makeMeasureSpec(eVar.mo22627U(), 1073741824);
                            }
                        }
                    }
                    int i17 = iArr[bVar2.ordinal()];
                    if (i17 == 1) {
                        i2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    } else if (i17 == 2) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f2572g, i13, -2);
                    } else if (i17 == 3) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f2572g, i13 + eVar.mo22623S(), -1);
                    } else if (i17 != 4) {
                        i2 = 0;
                    } else {
                        i2 = ViewGroup.getChildMeasureSpec(this.f2572g, i13, -2);
                        if (eVar2.f22658x == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int i18 = aVar2.f23086j;
                        if (i18 == C8006b.C8007a.f23075l || i18 == C8006b.C8007a.f23076m) {
                            if (view.getMeasuredWidth() == eVar.mo22627U()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (aVar2.f23086j == C8006b.C8007a.f23076m || !z12 || ((z12 && z13) || (view instanceof Placeholder) || eVar.mo22557m0())) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                i2 = View.MeasureSpec.makeMeasureSpec(eVar.mo22683v(), 1073741824);
                            }
                        }
                    }
                    C7809f fVar = (C7809f) eVar.mo22605I();
                    if (fVar != null && C7814j.m29727b(ConstraintLayout.this.mOptimizationLevel, C11398b.f33139r) && view.getMeasuredWidth() == eVar.mo22627U() && view.getMeasuredWidth() < fVar.mo22627U() && view.getMeasuredHeight() == eVar.mo22683v() && view.getMeasuredHeight() < fVar.mo22683v() && view.getBaseline() == eVar.mo22668n() && !eVar.mo22662k0()) {
                        if (!m2391d(eVar.mo22589A(), i, eVar.mo22627U()) || !m2391d(eVar.mo22591B(), i2, eVar.mo22683v())) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            aVar2.f23081e = eVar.mo22627U();
                            aVar2.f23082f = eVar.mo22683v();
                            aVar2.f23083g = eVar.mo22668n();
                            return;
                        }
                    }
                    C7806e.C7808b bVar3 = C7806e.C7808b.MATCH_CONSTRAINT;
                    if (bVar == bVar3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVar2 == bVar3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C7806e.C7808b bVar4 = C7806e.C7808b.MATCH_PARENT;
                    if (bVar2 == bVar4 || bVar2 == C7806e.C7808b.FIXED) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVar == bVar4 || bVar == C7806e.C7808b.FIXED) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z || eVar2.f22619d0 <= Utils.FLOAT_EPSILON) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (!z2 || eVar2.f22619d0 <= Utils.FLOAT_EPSILON) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (view != null) {
                        C0620b bVar5 = (C0620b) view.getLayoutParams();
                        int i19 = aVar2.f23086j;
                        if (i19 == C8006b.C8007a.f23075l || i19 == C8006b.C8007a.f23076m || !z || eVar2.f22656w != 0 || !z2 || eVar2.f22658x != 0) {
                            view.measure(i, i2);
                            eVar2.mo22622R0(i, i2);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i4 = view.getBaseline();
                            int i22 = eVar2.f22662z;
                            if (i22 > 0) {
                                i3 = Math.max(i22, measuredWidth);
                            } else {
                                i3 = measuredWidth;
                            }
                            int i23 = eVar2.f22576A;
                            if (i23 > 0) {
                                i3 = Math.min(i23, i3);
                            }
                            int i24 = eVar2.f22580C;
                            if (i24 > 0) {
                                i5 = Math.max(i24, measuredHeight);
                                i7 = i;
                            } else {
                                i7 = i;
                                i5 = measuredHeight;
                            }
                            int i25 = eVar2.f22582D;
                            if (i25 > 0) {
                                i5 = Math.min(i25, i5);
                            }
                            if (!C7814j.m29727b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                                if (z5 && z3) {
                                    i3 = (int) ((((float) i5) * eVar2.f22619d0) + 0.5f);
                                } else if (z6 && z4) {
                                    i5 = (int) ((((float) i3) / eVar2.f22619d0) + 0.5f);
                                }
                            }
                            if (!(measuredWidth == i3 && measuredHeight == i5)) {
                                if (measuredWidth != i3) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i8 = i7;
                                }
                                if (measuredHeight != i5) {
                                    i2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                }
                                view.measure(i8, i2);
                                eVar2.mo22622R0(i8, i2);
                                i3 = view.getMeasuredWidth();
                                i5 = view.getMeasuredHeight();
                                i4 = view.getBaseline();
                            }
                            i6 = -1;
                        } else {
                            i6 = -1;
                            i5 = 0;
                            i4 = 0;
                            i3 = 0;
                        }
                        if (i4 != i6) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i3 == aVar2.f23079c && i5 == aVar2.f23080d) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        aVar2.f23085i = z8;
                        if (bVar5.f2529g0) {
                            z7 = true;
                        }
                        if (!(!z7 || i4 == -1 || eVar.mo22668n() == i4)) {
                            aVar2.f23085i = true;
                        }
                        aVar2.f23081e = i3;
                        aVar2.f23082f = i5;
                        aVar2.f23084h = z7;
                        aVar2.f23083g = i4;
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo2898c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f2567b = i3;
            this.f2568c = i4;
            this.f2569d = i5;
            this.f2570e = i6;
            this.f2571f = i;
            this.f2572g = i2;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m2385c((AttributeSet) null, 0, 0);
    }

    /* renamed from: b */
    private final C7806e m2384b(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C0620b) view.getLayoutParams()).f2559v0;
    }

    /* renamed from: c */
    private void m2385c(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.mo22688y0(this);
        this.mLayoutWidget.mo22706R1(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0639g.f3081n1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0639g.f3115r1) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == C0639g.f3123s1) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == C0639g.f3099p1) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == C0639g.f3107q1) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == C0639g.f2797F2) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == C0639g.f2756A1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == C0639g.f3155w1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0630d dVar = new C0630d();
                        this.mConstraintSet = dVar;
                        dVar.mo2947p(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.mo22707S1(this.mOptimizationLevel);
    }

    /* renamed from: d */
    private void m2386d() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    /* renamed from: e */
    private void m2387e() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C7806e viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo22677r0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m2384b(childAt.getId()).mo22690z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                int id = getChildAt(i3).getId();
                int i4 = this.mConstraintSetId;
            }
        }
        C0630d dVar = this.mConstraintSet;
        if (dVar != null) {
            dVar.mo2938d(this, true);
        }
        this.mLayoutWidget.mo22736q1();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.mConstraintHelpers.get(i5).mo2924n(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2 instanceof Placeholder) {
                ((Placeholder) childAt2).mo2912c(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt3 = getChildAt(i7);
            this.mTempMapIdToWidget.put(childAt3.getId(), getViewWidget(childAt3));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt4 = getChildAt(i8);
            C7806e viewWidget2 = getViewWidget(childAt4);
            if (viewWidget2 != null) {
                this.mLayoutWidget.mo22733a(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt4, viewWidget2, (C0620b) childAt4.getLayoutParams(), this.mTempMapIdToWidget);
            }
        }
    }

    /* renamed from: f */
    private void m2388f(C7806e eVar, C0620b bVar, SparseArray sparseArray, int i, C7803d.C7805b bVar2) {
        View view = this.mChildrenByIds.get(i);
        C7806e eVar2 = (C7806e) sparseArray.get(i);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof C0620b)) {
            bVar.f2529g0 = true;
            C7803d.C7805b bVar3 = C7803d.C7805b.BASELINE;
            if (bVar2 == bVar3) {
                C0620b bVar4 = (C0620b) view.getLayoutParams();
                bVar4.f2529g0 = true;
                bVar4.f2559v0.mo22604H0(true);
            }
            eVar.mo22666m(bVar3).mo22569a(eVar2.mo22666m(bVar2), bVar.f2493D, bVar.f2492C, true);
            eVar.mo22604H0(true);
            eVar.mo22666m(C7803d.C7805b.TOP).mo22584p();
            eVar.mo22666m(C7803d.C7805b.BOTTOM).mo22584p();
        }
    }

    /* renamed from: g */
    private boolean m2389g() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m2387e();
        }
        return z;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static C0640h getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new C0640h();
        }
        return sSharedValues;
    }

    /* access modifiers changed from: protected */
    public void applyConstraintsFromLayoutParams(boolean z, View view, C7806e eVar, C0620b bVar, SparseArray<C7806e> sparseArray) {
        int i;
        C7806e eVar2;
        C7806e eVar3;
        C7806e eVar4;
        C7806e eVar5;
        View view2 = view;
        C7806e eVar6 = eVar;
        C0620b bVar2 = bVar;
        SparseArray<C7806e> sparseArray2 = sparseArray;
        bVar.mo2894a();
        bVar2.f2561w0 = false;
        eVar6.mo22651f1(view.getVisibility());
        if (bVar2.f2535j0) {
            eVar6.mo22620Q0(true);
            eVar6.mo22651f1(8);
        }
        eVar6.mo22688y0(view2);
        if (view2 instanceof C0626b) {
            ((C0626b) view2).mo2850j(eVar6, this.mLayoutWidget.mo22702L1());
        }
        if (bVar2.f2531h0) {
            C7810g gVar = (C7810g) eVar6;
            int i2 = bVar2.f2553s0;
            int i3 = bVar2.f2555t0;
            float f = bVar2.f2557u0;
            if (f != -1.0f) {
                gVar.mo22726v1(f);
            } else if (i2 != -1) {
                gVar.mo22724t1(i2);
            } else if (i3 != -1) {
                gVar.mo22725u1(i3);
            }
        } else {
            int i4 = bVar2.f2539l0;
            int i5 = bVar2.f2541m0;
            int i6 = bVar2.f2543n0;
            int i7 = bVar2.f2545o0;
            int i8 = bVar2.f2547p0;
            int i9 = bVar2.f2549q0;
            float f2 = bVar2.f2551r0;
            int i12 = bVar2.f2546p;
            if (i12 != -1) {
                C7806e eVar7 = sparseArray2.get(i12);
                if (eVar7 != null) {
                    eVar6.mo22658j(eVar7, bVar2.f2550r, bVar2.f2548q);
                }
            } else {
                if (i4 != -1) {
                    C7806e eVar8 = sparseArray2.get(i4);
                    if (eVar8 != null) {
                        C7803d.C7805b bVar3 = C7803d.C7805b.LEFT;
                        eVar.mo22643c0(bVar3, eVar8, bVar3, bVar2.leftMargin, i8);
                    }
                } else if (!(i5 == -1 || (eVar5 = sparseArray2.get(i5)) == null)) {
                    eVar.mo22643c0(C7803d.C7805b.LEFT, eVar5, C7803d.C7805b.RIGHT, bVar2.leftMargin, i8);
                }
                if (i6 != -1) {
                    C7806e eVar9 = sparseArray2.get(i6);
                    if (eVar9 != null) {
                        eVar.mo22643c0(C7803d.C7805b.RIGHT, eVar9, C7803d.C7805b.LEFT, bVar2.rightMargin, i9);
                    }
                } else if (!(i7 == -1 || (eVar4 = sparseArray2.get(i7)) == null)) {
                    C7803d.C7805b bVar4 = C7803d.C7805b.RIGHT;
                    eVar.mo22643c0(bVar4, eVar4, bVar4, bVar2.rightMargin, i9);
                }
                int i13 = bVar2.f2532i;
                if (i13 != -1) {
                    C7806e eVar10 = sparseArray2.get(i13);
                    if (eVar10 != null) {
                        C7803d.C7805b bVar5 = C7803d.C7805b.TOP;
                        eVar.mo22643c0(bVar5, eVar10, bVar5, bVar2.topMargin, bVar2.f2562x);
                    }
                } else {
                    int i14 = bVar2.f2534j;
                    if (!(i14 == -1 || (eVar3 = sparseArray2.get(i14)) == null)) {
                        eVar.mo22643c0(C7803d.C7805b.TOP, eVar3, C7803d.C7805b.BOTTOM, bVar2.topMargin, bVar2.f2562x);
                    }
                }
                int i15 = bVar2.f2536k;
                if (i15 != -1) {
                    C7806e eVar11 = sparseArray2.get(i15);
                    if (eVar11 != null) {
                        eVar.mo22643c0(C7803d.C7805b.BOTTOM, eVar11, C7803d.C7805b.TOP, bVar2.bottomMargin, bVar2.f2564z);
                    }
                } else {
                    int i16 = bVar2.f2538l;
                    if (!(i16 == -1 || (eVar2 = sparseArray2.get(i16)) == null)) {
                        C7803d.C7805b bVar6 = C7803d.C7805b.BOTTOM;
                        eVar.mo22643c0(bVar6, eVar2, bVar6, bVar2.bottomMargin, bVar2.f2564z);
                    }
                }
                int i17 = bVar2.f2540m;
                if (i17 != -1) {
                    m2388f(eVar, bVar, sparseArray, i17, C7803d.C7805b.BASELINE);
                } else {
                    int i18 = bVar2.f2542n;
                    if (i18 != -1) {
                        m2388f(eVar, bVar, sparseArray, i18, C7803d.C7805b.TOP);
                    } else {
                        int i19 = bVar2.f2544o;
                        if (i19 != -1) {
                            m2388f(eVar, bVar, sparseArray, i19, C7803d.C7805b.BOTTOM);
                        }
                    }
                }
                if (f2 >= Utils.FLOAT_EPSILON) {
                    eVar6.mo22608J0(f2);
                }
                float f3 = bVar2.f2497H;
                if (f3 >= Utils.FLOAT_EPSILON) {
                    eVar6.mo22638Z0(f3);
                }
            }
            if (z && !((i = bVar2.f2513X) == -1 && bVar2.f2514Y == -1)) {
                eVar6.mo22634X0(i, bVar2.f2514Y);
            }
            if (bVar2.f2525e0) {
                eVar6.mo22614M0(C7806e.C7808b.FIXED);
                eVar6.mo22653g1(bVar2.width);
                if (bVar2.width == -2) {
                    eVar6.mo22614M0(C7806e.C7808b.WRAP_CONTENT);
                }
            } else if (bVar2.width == -1) {
                if (bVar2.f2517a0) {
                    eVar6.mo22614M0(C7806e.C7808b.MATCH_CONSTRAINT);
                } else {
                    eVar6.mo22614M0(C7806e.C7808b.MATCH_PARENT);
                }
                eVar6.mo22666m(C7803d.C7805b.LEFT).f22561g = bVar2.leftMargin;
                eVar6.mo22666m(C7803d.C7805b.RIGHT).f22561g = bVar2.rightMargin;
            } else {
                eVar6.mo22614M0(C7806e.C7808b.MATCH_CONSTRAINT);
                eVar6.mo22653g1(0);
            }
            if (bVar2.f2527f0) {
                eVar6.mo22644c1(C7806e.C7808b.FIXED);
                eVar6.mo22606I0(bVar2.height);
                if (bVar2.height == -2) {
                    eVar6.mo22644c1(C7806e.C7808b.WRAP_CONTENT);
                }
            } else if (bVar2.height == -1) {
                if (bVar2.f2519b0) {
                    eVar6.mo22644c1(C7806e.C7808b.MATCH_CONSTRAINT);
                } else {
                    eVar6.mo22644c1(C7806e.C7808b.MATCH_PARENT);
                }
                eVar6.mo22666m(C7803d.C7805b.TOP).f22561g = bVar2.topMargin;
                eVar6.mo22666m(C7803d.C7805b.BOTTOM).f22561g = bVar2.bottomMargin;
            } else {
                eVar6.mo22644c1(C7806e.C7808b.MATCH_CONSTRAINT);
                eVar6.mo22606I0(0);
            }
            eVar6.mo22590A0(bVar2.f2498I);
            eVar6.mo22616O0(bVar2.f2501L);
            eVar6.mo22648e1(bVar2.f2502M);
            eVar6.mo22610K0(bVar2.f2503N);
            eVar6.mo22640a1(bVar2.f2504O);
            eVar6.mo22655h1(bVar2.f2523d0);
            eVar6.mo22615N0(bVar2.f2505P, bVar2.f2507R, bVar2.f2509T, bVar2.f2511V);
            eVar6.mo22645d1(bVar2.f2506Q, bVar2.f2508S, bVar2.f2510U, bVar2.f2512W);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0620b;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<C0626b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).mo2923m(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) i4;
                        float f3 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f4 = f2;
                        float f5 = f2;
                        float f6 = f3;
                        float f7 = f;
                        Paint paint2 = paint;
                        canvas2.drawLine(f, f4, f6, f5, paint);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f3;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f5, f6, f9, paint);
                        float f12 = parseInt4;
                        float f13 = f7;
                        canvas2.drawLine(f8, f12, f13, f9, paint);
                        float f14 = f7;
                        canvas2.drawLine(f14, f12, f13, f5, paint);
                        paint.setColor(-16711936);
                        float f15 = f3;
                        Paint paint3 = paint;
                        canvas2.drawLine(f14, f5, f15, parseInt4, paint);
                        canvas2.drawLine(f14, parseInt4, f15, f5, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(C7177e eVar) {
        this.mLayoutWidget.mo22695E1(eVar);
    }

    public void forceLayout() {
        m2386d();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.mo22697G1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.f22640o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.f22640o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.f22640o = "parent";
            }
        }
        if (this.mLayoutWidget.mo22676r() == null) {
            C7809f fVar = this.mLayoutWidget;
            fVar.mo22690z0(fVar.f22640o);
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.mo22676r());
        }
        Iterator it = this.mLayoutWidget.mo22734n1().iterator();
        while (it.hasNext()) {
            C7806e eVar = (C7806e) it.next();
            View view = (View) eVar.mo22674q();
            if (view != null) {
                if (eVar.f22640o == null && (id = view.getId()) != -1) {
                    eVar.f22640o = getContext().getResources().getResourceEntryName(id);
                }
                if (eVar.mo22676r() == null) {
                    eVar.mo22690z0(eVar.f22640o);
                    Log.v(TAG, " setDebugName " + eVar.mo22676r());
                }
            }
        }
        this.mLayoutWidget.mo22613M(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final C7806e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0620b) {
            return ((C0620b) view.getLayoutParams()).f2559v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0620b) {
            return ((C0620b) view.getLayoutParams()).f2559v0;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean isRtl() {
        boolean z;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C0627c(getContext(), this, i);
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
            }
        } else {
            this.mConstraintLayoutSpec = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0620b bVar = (C0620b) childAt.getLayoutParams();
            C7806e eVar = bVar.f2559v0;
            if ((childAt.getVisibility() != 8 || bVar.f2531h0 || bVar.f2533i0 || bVar.f2537k0 || isInEditMode) && !bVar.f2535j0) {
                int V = eVar.mo22629V();
                int W = eVar.mo22631W();
                int U = eVar.mo22627U() + V;
                int v = eVar.mo22683v() + W;
                childAt.layout(V, W, U, v);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(V, W, U, v);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).mo2900k(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mOnMeasureWidthMeasureSpec == i) {
            int i3 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        boolean z = this.mDirtyHierarchy;
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.mo22709U1(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (m2389g()) {
                this.mLayoutWidget.mo22711W1();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.mo22627U(), this.mLayoutWidget.mo22683v(), this.mLayoutWidget.mo22703M1(), this.mLayoutWidget.mo22701K1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C7806e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C7810g)) {
            C0620b bVar = (C0620b) view.getLayoutParams();
            C7810g gVar = new C7810g();
            bVar.f2559v0 = gVar;
            bVar.f2531h0 = true;
            gVar.mo22727w1(bVar.f2515Z);
        }
        if (view instanceof C0626b) {
            C0626b bVar2 = (C0626b) view;
            bVar2.mo2925o();
            ((C0620b) view.getLayoutParams()).f2533i0 = true;
            if (!this.mConstraintHelpers.contains(bVar2)) {
                this.mConstraintHelpers.add(bVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.mo22735p1(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    /* access modifiers changed from: protected */
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C0627c(getContext(), this, i);
    }

    public void requestLayout() {
        m2386d();
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0622c cVar = this.mMeasurer;
        int i5 = cVar.f2570e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + cVar.f2569d, i, 0);
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    /* access modifiers changed from: protected */
    public void resolveSystem(C7809f fVar, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.mo2898c(i2, i3, max, max2, paddingWidth, i5);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i4 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            i4 = max4;
        } else {
            i4 = max3;
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        setSelfDimensionBehaviour(fVar, mode, i6, mode2, i7);
        fVar.mo22704N1(i, mode, i6, mode2, i7, this.mLastMeasureWidth, this.mLastMeasureHeight, i4, max);
    }

    public void setConstraintSet(C0630d dVar) {
        this.mConstraintSet = dVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf(C11110u2.f31950c);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.mMaxHeight) {
            this.mMaxHeight = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.mMaxWidth) {
            this.mMaxWidth = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.mMinHeight) {
            this.mMinHeight = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.mMinWidth) {
            this.mMinWidth = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C0637e eVar) {
        C0627c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.mo2932c(eVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.mo22707S1(i);
    }

    /* access modifiers changed from: protected */
    public void setSelfDimensionBehaviour(C7809f fVar, int i, int i2, int i3, int i4) {
        C7806e.C7808b bVar;
        C0622c cVar = this.mMeasurer;
        int i5 = cVar.f2570e;
        int i6 = cVar.f2569d;
        C7806e.C7808b bVar2 = C7806e.C7808b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                bVar = C7806e.C7808b.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.mMinWidth);
                }
            } else if (i != 1073741824) {
                bVar = bVar2;
            } else {
                i2 = Math.min(this.mMaxWidth - i6, i2);
                bVar = bVar2;
            }
            i2 = 0;
        } else {
            bVar = C7806e.C7808b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                bVar2 = C7806e.C7808b.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.mMinHeight);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.mMaxHeight - i5, i4);
            }
            i4 = 0;
        } else {
            bVar2 = C7806e.C7808b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        }
        if (!(i2 == fVar.mo22627U() && i4 == fVar.mo22683v())) {
            fVar.mo22700J1();
        }
        fVar.mo22657i1(0);
        fVar.mo22660j1(0);
        fVar.mo22626T0(this.mMaxWidth - i6);
        fVar.mo22624S0(this.mMaxHeight - i5);
        fVar.mo22632W0(0);
        fVar.mo22630V0(0);
        fVar.mo22614M0(bVar);
        fVar.mo22653g1(i2);
        fVar.mo22644c1(bVar2);
        fVar.mo22606I0(i4);
        fVar.mo22632W0(this.mMinWidth - i6);
        fVar.mo22630V0(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        C0627c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.mo2933d(i, (float) i2, (float) i3);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public C0620b generateDefaultLayoutParams() {
        return new C0620b(-2, -2);
    }

    public C0620b generateLayoutParams(AttributeSet attributeSet) {
        return new C0620b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0620b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2385c(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2385c(attributeSet, i, 0);
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C0620b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public int f2490A = Integer.MIN_VALUE;

        /* renamed from: B */
        public int f2491B = Integer.MIN_VALUE;

        /* renamed from: C */
        public int f2492C = Integer.MIN_VALUE;

        /* renamed from: D */
        public int f2493D = 0;

        /* renamed from: E */
        boolean f2494E = true;

        /* renamed from: F */
        boolean f2495F = true;

        /* renamed from: G */
        public float f2496G = 0.5f;

        /* renamed from: H */
        public float f2497H = 0.5f;

        /* renamed from: I */
        public String f2498I = null;

        /* renamed from: J */
        float f2499J = Utils.FLOAT_EPSILON;

        /* renamed from: K */
        int f2500K = 1;

        /* renamed from: L */
        public float f2501L = -1.0f;

        /* renamed from: M */
        public float f2502M = -1.0f;

        /* renamed from: N */
        public int f2503N = 0;

        /* renamed from: O */
        public int f2504O = 0;

        /* renamed from: P */
        public int f2505P = 0;

        /* renamed from: Q */
        public int f2506Q = 0;

        /* renamed from: R */
        public int f2507R = 0;

        /* renamed from: S */
        public int f2508S = 0;

        /* renamed from: T */
        public int f2509T = 0;

        /* renamed from: U */
        public int f2510U = 0;

        /* renamed from: V */
        public float f2511V = 1.0f;

        /* renamed from: W */
        public float f2512W = 1.0f;

        /* renamed from: X */
        public int f2513X = -1;

        /* renamed from: Y */
        public int f2514Y = -1;

        /* renamed from: Z */
        public int f2515Z = -1;

        /* renamed from: a */
        public int f2516a = -1;

        /* renamed from: a0 */
        public boolean f2517a0 = false;

        /* renamed from: b */
        public int f2518b = -1;

        /* renamed from: b0 */
        public boolean f2519b0 = false;

        /* renamed from: c */
        public float f2520c = -1.0f;

        /* renamed from: c0 */
        public String f2521c0 = null;

        /* renamed from: d */
        public boolean f2522d = true;

        /* renamed from: d0 */
        public int f2523d0 = 0;

        /* renamed from: e */
        public int f2524e = -1;

        /* renamed from: e0 */
        boolean f2525e0 = true;

        /* renamed from: f */
        public int f2526f = -1;

        /* renamed from: f0 */
        boolean f2527f0 = true;

        /* renamed from: g */
        public int f2528g = -1;

        /* renamed from: g0 */
        boolean f2529g0 = false;

        /* renamed from: h */
        public int f2530h = -1;

        /* renamed from: h0 */
        boolean f2531h0 = false;

        /* renamed from: i */
        public int f2532i = -1;

        /* renamed from: i0 */
        boolean f2533i0 = false;

        /* renamed from: j */
        public int f2534j = -1;

        /* renamed from: j0 */
        boolean f2535j0 = false;

        /* renamed from: k */
        public int f2536k = -1;

        /* renamed from: k0 */
        boolean f2537k0 = false;

        /* renamed from: l */
        public int f2538l = -1;

        /* renamed from: l0 */
        int f2539l0 = -1;

        /* renamed from: m */
        public int f2540m = -1;

        /* renamed from: m0 */
        int f2541m0 = -1;

        /* renamed from: n */
        public int f2542n = -1;

        /* renamed from: n0 */
        int f2543n0 = -1;

        /* renamed from: o */
        public int f2544o = -1;

        /* renamed from: o0 */
        int f2545o0 = -1;

        /* renamed from: p */
        public int f2546p = -1;

        /* renamed from: p0 */
        int f2547p0 = Integer.MIN_VALUE;

        /* renamed from: q */
        public int f2548q = 0;

        /* renamed from: q0 */
        int f2549q0 = Integer.MIN_VALUE;

        /* renamed from: r */
        public float f2550r = Utils.FLOAT_EPSILON;

        /* renamed from: r0 */
        float f2551r0 = 0.5f;

        /* renamed from: s */
        public int f2552s = -1;

        /* renamed from: s0 */
        int f2553s0;

        /* renamed from: t */
        public int f2554t = -1;

        /* renamed from: t0 */
        int f2555t0;

        /* renamed from: u */
        public int f2556u = -1;

        /* renamed from: u0 */
        float f2557u0;

        /* renamed from: v */
        public int f2558v = -1;

        /* renamed from: v0 */
        C7806e f2559v0 = new C7806e();

        /* renamed from: w */
        public int f2560w = Integer.MIN_VALUE;

        /* renamed from: w0 */
        public boolean f2561w0 = false;

        /* renamed from: x */
        public int f2562x = Integer.MIN_VALUE;

        /* renamed from: y */
        public int f2563y = Integer.MIN_VALUE;

        /* renamed from: z */
        public int f2564z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        private static class C0621a {

            /* renamed from: a */
            public static final SparseIntArray f2565a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2565a = sparseIntArray;
                sparseIntArray.append(C0639g.f3108q2, 64);
                sparseIntArray.append(C0639g.f2908T1, 65);
                sparseIntArray.append(C0639g.f2983c2, 8);
                sparseIntArray.append(C0639g.f2992d2, 9);
                sparseIntArray.append(C0639g.f3010f2, 10);
                sparseIntArray.append(C0639g.f3019g2, 11);
                sparseIntArray.append(C0639g.f3073m2, 12);
                sparseIntArray.append(C0639g.f3064l2, 13);
                sparseIntArray.append(C0639g.f2828J1, 14);
                sparseIntArray.append(C0639g.f2820I1, 15);
                sparseIntArray.append(C0639g.f2788E1, 16);
                sparseIntArray.append(C0639g.f2804G1, 52);
                sparseIntArray.append(C0639g.f2796F1, 53);
                sparseIntArray.append(C0639g.f2836K1, 2);
                sparseIntArray.append(C0639g.f2852M1, 3);
                sparseIntArray.append(C0639g.f2844L1, 4);
                sparseIntArray.append(C0639g.f3148v2, 49);
                sparseIntArray.append(C0639g.f3156w2, 50);
                sparseIntArray.append(C0639g.f2884Q1, 5);
                sparseIntArray.append(C0639g.f2892R1, 6);
                sparseIntArray.append(C0639g.f2900S1, 7);
                sparseIntArray.append(C0639g.f3179z1, 67);
                sparseIntArray.append(C0639g.f3090o1, 1);
                sparseIntArray.append(C0639g.f3028h2, 17);
                sparseIntArray.append(C0639g.f3037i2, 18);
                sparseIntArray.append(C0639g.f2876P1, 19);
                sparseIntArray.append(C0639g.f2868O1, 20);
                sparseIntArray.append(C0639g.f2757A2, 21);
                sparseIntArray.append(C0639g.f2781D2, 22);
                sparseIntArray.append(C0639g.f2765B2, 23);
                sparseIntArray.append(C0639g.f3172y2, 24);
                sparseIntArray.append(C0639g.f2773C2, 25);
                sparseIntArray.append(C0639g.f3180z2, 26);
                sparseIntArray.append(C0639g.f3164x2, 55);
                sparseIntArray.append(C0639g.f2789E2, 54);
                sparseIntArray.append(C0639g.f2948Y1, 29);
                sparseIntArray.append(C0639g.f3082n2, 30);
                sparseIntArray.append(C0639g.f2860N1, 44);
                sparseIntArray.append(C0639g.f2965a2, 45);
                sparseIntArray.append(C0639g.f3100p2, 46);
                sparseIntArray.append(C0639g.f2956Z1, 47);
                sparseIntArray.append(C0639g.f3091o2, 48);
                sparseIntArray.append(C0639g.f2772C1, 27);
                sparseIntArray.append(C0639g.f2764B1, 28);
                sparseIntArray.append(C0639g.f3116r2, 31);
                sparseIntArray.append(C0639g.f2916U1, 32);
                sparseIntArray.append(C0639g.f3132t2, 33);
                sparseIntArray.append(C0639g.f3124s2, 34);
                sparseIntArray.append(C0639g.f3140u2, 35);
                sparseIntArray.append(C0639g.f2932W1, 36);
                sparseIntArray.append(C0639g.f2924V1, 37);
                sparseIntArray.append(C0639g.f2940X1, 38);
                sparseIntArray.append(C0639g.f2974b2, 39);
                sparseIntArray.append(C0639g.f3055k2, 40);
                sparseIntArray.append(C0639g.f3001e2, 41);
                sparseIntArray.append(C0639g.f2812H1, 42);
                sparseIntArray.append(C0639g.f2780D1, 43);
                sparseIntArray.append(C0639g.f3046j2, 51);
                sparseIntArray.append(C0639g.f2805G2, 66);
            }
        }

        public C0620b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0639g.f3081n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = C0621a.f2565a.get(index);
                switch (i2) {
                    case 1:
                        this.f2515Z = obtainStyledAttributes.getInt(index, this.f2515Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2546p);
                        this.f2546p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f2546p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f2548q = obtainStyledAttributes.getDimensionPixelSize(index, this.f2548q);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f2550r) % 360.0f;
                        this.f2550r = f;
                        if (f >= Utils.FLOAT_EPSILON) {
                            break;
                        } else {
                            this.f2550r = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f2516a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2516a);
                        break;
                    case 6:
                        this.f2518b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2518b);
                        break;
                    case 7:
                        this.f2520c = obtainStyledAttributes.getFloat(index, this.f2520c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2524e);
                        this.f2524e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f2524e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2526f);
                        this.f2526f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f2526f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2528g);
                        this.f2528g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f2528g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2530h);
                        this.f2530h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f2530h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2532i);
                        this.f2532i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f2532i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2534j);
                        this.f2534j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f2534j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2536k);
                        this.f2536k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f2536k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2538l);
                        this.f2538l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f2538l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2540m);
                        this.f2540m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f2540m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2552s);
                        this.f2552s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f2552s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2554t);
                        this.f2554t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f2554t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2556u);
                        this.f2556u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f2556u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2558v);
                        this.f2558v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f2558v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f2560w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2560w);
                        break;
                    case 22:
                        this.f2562x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2562x);
                        break;
                    case 23:
                        this.f2563y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2563y);
                        break;
                    case 24:
                        this.f2564z = obtainStyledAttributes.getDimensionPixelSize(index, this.f2564z);
                        break;
                    case 25:
                        this.f2490A = obtainStyledAttributes.getDimensionPixelSize(index, this.f2490A);
                        break;
                    case 26:
                        this.f2491B = obtainStyledAttributes.getDimensionPixelSize(index, this.f2491B);
                        break;
                    case 27:
                        this.f2517a0 = obtainStyledAttributes.getBoolean(index, this.f2517a0);
                        break;
                    case 28:
                        this.f2519b0 = obtainStyledAttributes.getBoolean(index, this.f2519b0);
                        break;
                    case 29:
                        this.f2496G = obtainStyledAttributes.getFloat(index, this.f2496G);
                        break;
                    case 30:
                        this.f2497H = obtainStyledAttributes.getFloat(index, this.f2497H);
                        break;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.f2505P = i3;
                        if (i3 != 1) {
                            break;
                        } else {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f2506Q = i4;
                        if (i4 != 1) {
                            break;
                        } else {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f2507R = obtainStyledAttributes.getDimensionPixelSize(index, this.f2507R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f2507R) != -2) {
                                break;
                            } else {
                                this.f2507R = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f2509T = obtainStyledAttributes.getDimensionPixelSize(index, this.f2509T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f2509T) != -2) {
                                break;
                            } else {
                                this.f2509T = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f2511V = Math.max(Utils.FLOAT_EPSILON, obtainStyledAttributes.getFloat(index, this.f2511V));
                        this.f2505P = 2;
                        break;
                    case 36:
                        try {
                            this.f2508S = obtainStyledAttributes.getDimensionPixelSize(index, this.f2508S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f2508S) != -2) {
                                break;
                            } else {
                                this.f2508S = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f2510U = obtainStyledAttributes.getDimensionPixelSize(index, this.f2510U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f2510U) != -2) {
                                break;
                            } else {
                                this.f2510U = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f2512W = Math.max(Utils.FLOAT_EPSILON, obtainStyledAttributes.getFloat(index, this.f2512W));
                        this.f2506Q = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                C0630d.m2436u(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f2501L = obtainStyledAttributes.getFloat(index, this.f2501L);
                                break;
                            case 46:
                                this.f2502M = obtainStyledAttributes.getFloat(index, this.f2502M);
                                break;
                            case 47:
                                this.f2503N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f2504O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f2513X = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2513X);
                                break;
                            case 50:
                                this.f2514Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2514Y);
                                break;
                            case 51:
                                this.f2521c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f2542n);
                                this.f2542n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f2542n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f2544o);
                                this.f2544o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f2544o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.f2493D = obtainStyledAttributes.getDimensionPixelSize(index, this.f2493D);
                                break;
                            case 55:
                                this.f2492C = obtainStyledAttributes.getDimensionPixelSize(index, this.f2492C);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        C0630d.m2434s(this, obtainStyledAttributes, index, 0);
                                        this.f2494E = true;
                                        break;
                                    case 65:
                                        C0630d.m2434s(this, obtainStyledAttributes, index, 1);
                                        this.f2495F = true;
                                        break;
                                    case 66:
                                        this.f2523d0 = obtainStyledAttributes.getInt(index, this.f2523d0);
                                        break;
                                    case 67:
                                        this.f2522d = obtainStyledAttributes.getBoolean(index, this.f2522d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo2894a();
        }

        /* renamed from: a */
        public void mo2894a() {
            this.f2531h0 = false;
            this.f2525e0 = true;
            this.f2527f0 = true;
            int i = this.width;
            if (i == -2 && this.f2517a0) {
                this.f2525e0 = false;
                if (this.f2505P == 0) {
                    this.f2505P = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.f2519b0) {
                this.f2527f0 = false;
                if (this.f2506Q == 0) {
                    this.f2506Q = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f2525e0 = false;
                if (i == 0 && this.f2505P == 1) {
                    this.width = -2;
                    this.f2517a0 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f2527f0 = false;
                if (i2 == 0 && this.f2506Q == 1) {
                    this.height = -2;
                    this.f2519b0 = true;
                }
            }
            if (this.f2520c != -1.0f || this.f2516a != -1 || this.f2518b != -1) {
                this.f2531h0 = true;
                this.f2525e0 = true;
                this.f2527f0 = true;
                if (!(this.f2559v0 instanceof C7810g)) {
                    this.f2559v0 = new C7810g();
                }
                ((C7810g) this.f2559v0).mo22727w1(this.f2515Z);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f2543n0 = r4
                r10.f2545o0 = r4
                r10.f2539l0 = r4
                r10.f2541m0 = r4
                int r5 = r10.f2560w
                r10.f2547p0 = r5
                int r5 = r10.f2563y
                r10.f2549q0 = r5
                float r5 = r10.f2496G
                r10.f2551r0 = r5
                int r6 = r10.f2516a
                r10.f2553s0 = r6
                int r7 = r10.f2518b
                r10.f2555t0 = r7
                float r8 = r10.f2520c
                r10.f2557u0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0094
                int r11 = r10.f2552s
                if (r11 == r4) goto L_0x003f
                r10.f2543n0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f2554t
                if (r11 == r4) goto L_0x0046
                r10.f2545o0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f2556u
                if (r11 == r4) goto L_0x004d
                r10.f2541m0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.f2558v
                if (r11 == r4) goto L_0x0054
                r10.f2539l0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.f2490A
                if (r11 == r9) goto L_0x005a
                r10.f2549q0 = r11
            L_0x005a:
                int r11 = r10.f2491B
                if (r11 == r9) goto L_0x0060
                r10.f2547p0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f2551r0 = r2
            L_0x0068:
                boolean r2 = r10.f2531h0
                if (r2 == 0) goto L_0x00b8
                int r2 = r10.f2515Z
                if (r2 != r3) goto L_0x00b8
                boolean r2 = r10.f2522d
                if (r2 == 0) goto L_0x00b8
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f2557u0 = r11
                r10.f2553s0 = r4
                r10.f2555t0 = r4
                goto L_0x00b8
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f2555t0 = r6
                r10.f2553s0 = r4
                r10.f2557u0 = r2
                goto L_0x00b8
            L_0x008b:
                if (r7 == r4) goto L_0x00b8
                r10.f2553s0 = r7
                r10.f2555t0 = r4
                r10.f2557u0 = r2
                goto L_0x00b8
            L_0x0094:
                int r11 = r10.f2552s
                if (r11 == r4) goto L_0x009a
                r10.f2541m0 = r11
            L_0x009a:
                int r11 = r10.f2554t
                if (r11 == r4) goto L_0x00a0
                r10.f2539l0 = r11
            L_0x00a0:
                int r11 = r10.f2556u
                if (r11 == r4) goto L_0x00a6
                r10.f2543n0 = r11
            L_0x00a6:
                int r11 = r10.f2558v
                if (r11 == r4) goto L_0x00ac
                r10.f2545o0 = r11
            L_0x00ac:
                int r11 = r10.f2490A
                if (r11 == r9) goto L_0x00b2
                r10.f2547p0 = r11
            L_0x00b2:
                int r11 = r10.f2491B
                if (r11 == r9) goto L_0x00b8
                r10.f2549q0 = r11
            L_0x00b8:
                int r11 = r10.f2556u
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f2558v
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f2554t
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f2552s
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f2528g
                if (r11 == r4) goto L_0x00d7
                r10.f2543n0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
                goto L_0x00e5
            L_0x00d7:
                int r11 = r10.f2530h
                if (r11 == r4) goto L_0x00e5
                r10.f2545o0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
            L_0x00e5:
                int r11 = r10.f2524e
                if (r11 == r4) goto L_0x00f4
                r10.f2539l0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
                goto L_0x0102
            L_0x00f4:
                int r11 = r10.f2526f
                if (r11 == r4) goto L_0x0102
                r10.f2541m0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0620b.resolveLayoutDirection(int):void");
        }

        public C0620b(int i, int i2) {
            super(i, i2);
        }

        public C0620b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
