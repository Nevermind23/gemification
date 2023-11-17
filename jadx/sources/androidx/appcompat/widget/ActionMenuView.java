package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0301i;
import androidx.appcompat.view.menu.C0313m;
import androidx.appcompat.view.menu.C0315n;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.github.mikephil.charting.utils.Utils;

public class ActionMenuView extends LinearLayoutCompat implements C0297g.C0299b, C0315n {

    /* renamed from: A */
    private int f1789A;

    /* renamed from: B */
    private int f1790B;

    /* renamed from: C */
    private int f1791C;

    /* renamed from: D */
    C0342e f1792D;

    /* renamed from: s */
    private C0297g f1793s;

    /* renamed from: t */
    private Context f1794t;

    /* renamed from: u */
    private int f1795u;

    /* renamed from: v */
    private boolean f1796v;

    /* renamed from: w */
    private ActionMenuPresenter f1797w;

    /* renamed from: x */
    private C0313m.C0314a f1798x;

    /* renamed from: y */
    C0297g.C0298a f1799y;

    /* renamed from: z */
    private boolean f1800z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0338a {
        /* renamed from: a */
        boolean mo803a();

        /* renamed from: b */
        boolean mo804b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0339b implements C0313m.C0314a {
        C0339b() {
        }

        /* renamed from: c */
        public void mo519c(C0297g gVar, boolean z) {
        }

        /* renamed from: d */
        public boolean mo520d(C0297g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0340c extends LinearLayoutCompat.C0360a {

        /* renamed from: a */
        public boolean f1801a;

        /* renamed from: b */
        public int f1802b;

        /* renamed from: c */
        public int f1803c;

        /* renamed from: d */
        public boolean f1804d;

        /* renamed from: e */
        public boolean f1805e;

        /* renamed from: f */
        boolean f1806f;

        public C0340c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0340c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0340c(C0340c cVar) {
            super(cVar);
            this.f1801a = cVar.f1801a;
        }

        public C0340c(int i, int i2) {
            super(i, i2);
            this.f1801a = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0341d implements C0297g.C0298a {
        C0341d() {
        }

        /* renamed from: a */
        public boolean mo462a(C0297g gVar, MenuItem menuItem) {
            C0342e eVar = ActionMenuView.this.f1792D;
            if (eVar == null || !eVar.onMenuItemClick(menuItem)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public void mo464b(C0297g gVar) {
            C0297g.C0298a aVar = ActionMenuView.this.f1799y;
            if (aVar != null) {
                aVar.mo464b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0342e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: L */
    static int m1336L(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        int i5;
        C0340c cVar = (C0340c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = true;
        if (actionMenuItemView == null || !actionMenuItemView.mo807f()) {
            z = false;
        } else {
            z = true;
        }
        if (i2 > 0) {
            i5 = 2;
            if (!z || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z || i6 >= 2) {
                    i5 = i6;
                }
                if (cVar.f1801a || !z) {
                    z2 = false;
                }
                cVar.f1804d = z2;
                cVar.f1802b = i5;
                view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
                return i5;
            }
        }
        i5 = 0;
        z2 = false;
        cVar.f1804d = z2;
        cVar.f1802b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: M */
    private void m1337M(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        boolean z7;
        int i12;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i13 = size - paddingLeft;
        int i14 = this.f1790B;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (i15 == 0) {
            setMeasuredDimension(i13, 0);
            return;
        }
        int i17 = i14 + (i16 / i15);
        int childCount = getChildCount();
        int i18 = 0;
        int i19 = 0;
        boolean z8 = false;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        long j = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            int i25 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z9 = childAt instanceof ActionMenuItemView;
                int i26 = i22 + 1;
                if (z9) {
                    int i27 = this.f1791C;
                    i9 = i26;
                    z6 = false;
                    childAt.setPadding(i27, 0, i27, 0);
                } else {
                    i9 = i26;
                    z6 = false;
                }
                C0340c cVar = (C0340c) childAt.getLayoutParams();
                cVar.f1806f = z6;
                cVar.f1803c = z6 ? 1 : 0;
                cVar.f1802b = z6;
                cVar.f1804d = z6;
                cVar.leftMargin = z6;
                cVar.rightMargin = z6;
                if (!z9 || !((ActionMenuItemView) childAt).mo807f()) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                cVar.f1805e = z7;
                if (cVar.f1801a) {
                    i12 = 1;
                } else {
                    i12 = i15;
                }
                int L = m1336L(childAt, i17, i12, childMeasureSpec, paddingTop);
                i23 = Math.max(i23, L);
                if (cVar.f1804d) {
                    i24++;
                }
                if (cVar.f1801a) {
                    z8 = true;
                }
                i15 -= L;
                i18 = Math.max(i18, childAt.getMeasuredHeight());
                if (L == 1) {
                    j |= (long) (1 << i19);
                    i18 = i18;
                } else {
                    int i28 = i18;
                }
                i22 = i9;
            }
            i19++;
            size2 = i25;
        }
        int i29 = size2;
        if (!z8 || i22 != 2) {
            z = false;
        } else {
            z = true;
        }
        boolean z12 = false;
        while (true) {
            if (i24 <= 0 || i15 <= 0) {
                i5 = mode;
                i3 = i13;
                z2 = z12;
                i4 = i18;
            } else {
                int i32 = Integer.MAX_VALUE;
                int i33 = 0;
                int i34 = 0;
                long j2 = 0;
                while (i34 < childCount) {
                    boolean z13 = z12;
                    C0340c cVar2 = (C0340c) getChildAt(i34).getLayoutParams();
                    int i35 = i18;
                    if (cVar2.f1804d) {
                        int i36 = cVar2.f1802b;
                        if (i36 < i32) {
                            j2 = 1 << i34;
                            i32 = i36;
                            i33 = 1;
                        } else if (i36 == i32) {
                            i33++;
                            j2 |= 1 << i34;
                        }
                    }
                    i34++;
                    i18 = i35;
                    z12 = z13;
                }
                z2 = z12;
                i4 = i18;
                j |= j2;
                if (i33 > i15) {
                    i5 = mode;
                    i3 = i13;
                    break;
                }
                int i37 = i32 + 1;
                int i38 = 0;
                while (i38 < childCount) {
                    View childAt2 = getChildAt(i38);
                    C0340c cVar3 = (C0340c) childAt2.getLayoutParams();
                    int i39 = i13;
                    int i42 = mode;
                    long j3 = (long) (1 << i38);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f1802b == i37) {
                            j |= j3;
                        }
                        z5 = z;
                    } else {
                        if (!z || !cVar3.f1805e || i15 != 1) {
                            z5 = z;
                        } else {
                            int i43 = this.f1791C;
                            z5 = z;
                            childAt2.setPadding(i43 + i17, 0, i43, 0);
                        }
                        cVar3.f1802b++;
                        cVar3.f1806f = true;
                        i15--;
                    }
                    i38++;
                    mode = i42;
                    i13 = i39;
                    z = z5;
                }
                i18 = i4;
                z12 = true;
            }
        }
        if (z8 || i22 != 1) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i15 <= 0 || j == 0 || (i15 >= i22 - 1 && !z3 && i23 <= 1)) {
            i6 = 0;
            z4 = z2;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z3) {
                i6 = 0;
                if ((j & 1) != 0 && !((C0340c) getChildAt(0).getLayoutParams()).f1805e) {
                    bitCount -= 0.5f;
                }
                int i44 = childCount - 1;
                if ((j & ((long) (1 << i44))) != 0 && !((C0340c) getChildAt(i44).getLayoutParams()).f1805e) {
                    bitCount -= 0.5f;
                }
            } else {
                i6 = 0;
            }
            if (bitCount > Utils.FLOAT_EPSILON) {
                i8 = (int) (((float) (i15 * i17)) / bitCount);
            } else {
                i8 = i6;
            }
            z4 = z2;
            for (int i45 = i6; i45 < childCount; i45++) {
                if ((j & ((long) (1 << i45))) != 0) {
                    View childAt3 = getChildAt(i45);
                    C0340c cVar4 = (C0340c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1803c = i8;
                        cVar4.f1806f = true;
                        if (i45 == 0 && !cVar4.f1805e) {
                            cVar4.leftMargin = (-i8) / 2;
                        }
                        z4 = true;
                    } else if (cVar4.f1801a) {
                        cVar4.f1803c = i8;
                        cVar4.f1806f = true;
                        cVar4.rightMargin = (-i8) / 2;
                        z4 = true;
                    } else {
                        if (i45 != 0) {
                            cVar4.leftMargin = i8 / 2;
                        }
                        if (i45 != childCount - 1) {
                            cVar4.rightMargin = i8 / 2;
                        }
                    }
                }
            }
        }
        if (z4) {
            for (int i46 = i6; i46 < childCount; i46++) {
                View childAt4 = getChildAt(i46);
                C0340c cVar5 = (C0340c) childAt4.getLayoutParams();
                if (cVar5.f1806f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1802b * i17) + cVar5.f1803c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i5 != 1073741824) {
            i7 = i4;
        } else {
            i7 = i29;
        }
        setMeasuredDimension(i3, i7);
    }

    /* renamed from: B */
    public void mo1354B() {
        ActionMenuPresenter actionMenuPresenter = this.f1797w;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1332B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C0340c mo1376m() {
        C0340c cVar = new C0340c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: D */
    public C0340c mo1377n(AttributeSet attributeSet) {
        return new C0340c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public C0340c mo1378o(ViewGroup.LayoutParams layoutParams) {
        C0340c cVar;
        if (layoutParams == null) {
            return mo1376m();
        }
        if (layoutParams instanceof C0340c) {
            cVar = new C0340c((C0340c) layoutParams);
        } else {
            cVar = new C0340c(layoutParams);
        }
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    /* renamed from: F */
    public C0340c mo1358F() {
        C0340c C = mo1376m();
        C.f1801a = true;
        return C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo1359G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0338a)) {
            z = false | ((C0338a) childAt).mo803a();
        }
        if (i <= 0 || !(childAt2 instanceof C0338a)) {
            return z;
        }
        return z | ((C0338a) childAt2).mo804b();
    }

    /* renamed from: H */
    public boolean mo1360H() {
        ActionMenuPresenter actionMenuPresenter = this.f1797w;
        return actionMenuPresenter != null && actionMenuPresenter.mo1334E();
    }

    /* renamed from: I */
    public boolean mo1361I() {
        ActionMenuPresenter actionMenuPresenter = this.f1797w;
        return actionMenuPresenter != null && actionMenuPresenter.mo1336G();
    }

    /* renamed from: J */
    public boolean mo1362J() {
        ActionMenuPresenter actionMenuPresenter = this.f1797w;
        return actionMenuPresenter != null && actionMenuPresenter.mo1337H();
    }

    /* renamed from: K */
    public boolean mo1363K() {
        return this.f1796v;
    }

    /* renamed from: N */
    public C0297g mo1364N() {
        return this.f1793s;
    }

    /* renamed from: O */
    public void mo1365O(C0313m.C0314a aVar, C0297g.C0298a aVar2) {
        this.f1798x = aVar;
        this.f1799y = aVar2;
    }

    /* renamed from: P */
    public boolean mo1366P() {
        ActionMenuPresenter actionMenuPresenter = this.f1797w;
        return actionMenuPresenter != null && actionMenuPresenter.mo1343N();
    }

    /* renamed from: a */
    public void mo826a(C0297g gVar) {
        this.f1793s = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0340c;
    }

    /* renamed from: d */
    public boolean mo827d(C0301i iVar) {
        return this.f1793s.mo980N(iVar, 0);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1793s == null) {
            Context context = getContext();
            C0297g gVar = new C0297g(context);
            this.f1793s = gVar;
            gVar.mo987V(new C0341d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f1797w = actionMenuPresenter;
            actionMenuPresenter.mo1342M(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f1797w;
            C0313m.C0314a aVar = this.f1798x;
            if (aVar == null) {
                aVar = new C0339b();
            }
            actionMenuPresenter2.mo905f(aVar);
            this.f1793s.mo1004c(this.f1797w, this.f1794t);
            this.f1797w.mo1340K(this);
        }
        return this.f1793s;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1797w.mo1333D();
    }

    public int getPopupTheme() {
        return this.f1795u;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f1797w;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo907j(false);
            if (this.f1797w.mo1337H()) {
                this.f1797w.mo1334E();
                this.f1797w.mo1343N();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1354B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (!this.f1800z) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean b = C0417d2.m1689b(this);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0340c cVar = (C0340c) childAt.getLayoutParams();
                if (cVar.f1801a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1359G(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i6 = getPaddingLeft() + cVar.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i15 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i15, i7, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo1359G(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i9 / 2) - (measuredWidth2 / 2);
            int i17 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = paddingRight / i18;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                C0340c cVar2 = (C0340c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1801a) {
                    int i22 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width = i22 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            C0340c cVar3 = (C0340c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1801a) {
                int i25 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft = i25 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        C0297g gVar;
        boolean z2 = this.f1800z;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f1800z = z;
        if (z2 != z) {
            this.f1789A = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1800z || (gVar = this.f1793s) == null || size == this.f1789A)) {
            this.f1789A = size;
            gVar.mo979M(true);
        }
        int childCount = getChildCount();
        if (!this.f1800z || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0340c cVar = (C0340c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m1337M(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1797w.mo1339J(z);
    }

    public void setOnMenuItemClickListener(C0342e eVar) {
        this.f1792D = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1797w.mo1341L(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1796v = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1795u != i) {
            this.f1795u = i;
            if (i == 0) {
                this.f1794t = getContext();
            } else {
                this.f1794t = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f1797w = actionMenuPresenter;
        actionMenuPresenter.mo1340K(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1790B = (int) (56.0f * f);
        this.f1791C = (int) (f * 4.0f);
        this.f1794t = context;
        this.f1795u = 0;
    }
}
