package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0155k;
import androidx.activity.C0156l;
import androidx.activity.C0159o;
import androidx.appcompat.app.C0209a;
import androidx.appcompat.view.C0266c;
import androidx.appcompat.view.C0272g;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0301i;
import androidx.appcompat.view.menu.C0313m;
import androidx.appcompat.view.menu.C0322r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C1058a0;
import androidx.core.view.C1114b0;
import androidx.core.view.C1141e0;
import androidx.core.view.C1242t0;
import androidx.core.view.C1266x;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p030c.C2210a;
import p030c.C2219j;
import p045d.C5769a;

public class Toolbar extends ViewGroup implements C1114b0 {

    /* renamed from: A */
    private CharSequence f1945A;

    /* renamed from: B */
    private CharSequence f1946B;

    /* renamed from: C */
    private ColorStateList f1947C;

    /* renamed from: D */
    private ColorStateList f1948D;

    /* renamed from: E */
    private boolean f1949E;

    /* renamed from: F */
    private boolean f1950F;

    /* renamed from: G */
    private final ArrayList f1951G;

    /* renamed from: H */
    private final ArrayList f1952H;

    /* renamed from: I */
    private final int[] f1953I;

    /* renamed from: J */
    final C1141e0 f1954J;

    /* renamed from: K */
    private ArrayList f1955K;

    /* renamed from: L */
    C0390h f1956L;

    /* renamed from: M */
    private final ActionMenuView.C0342e f1957M;

    /* renamed from: N */
    private C0504v1 f1958N;

    /* renamed from: O */
    private ActionMenuPresenter f1959O;

    /* renamed from: P */
    private C0388f f1960P;

    /* renamed from: Q */
    private C0313m.C0314a f1961Q;

    /* renamed from: R */
    C0297g.C0298a f1962R;

    /* renamed from: S */
    private boolean f1963S;

    /* renamed from: T */
    private OnBackInvokedCallback f1964T;

    /* renamed from: U */
    private OnBackInvokedDispatcher f1965U;

    /* renamed from: V */
    private boolean f1966V;

    /* renamed from: W */
    private final Runnable f1967W;

    /* renamed from: d */
    ActionMenuView f1968d;

    /* renamed from: e */
    private TextView f1969e;

    /* renamed from: f */
    private TextView f1970f;

    /* renamed from: g */
    private ImageButton f1971g;

    /* renamed from: h */
    private ImageView f1972h;

    /* renamed from: i */
    private Drawable f1973i;

    /* renamed from: j */
    private CharSequence f1974j;

    /* renamed from: k */
    ImageButton f1975k;

    /* renamed from: l */
    View f1976l;

    /* renamed from: m */
    private Context f1977m;

    /* renamed from: n */
    private int f1978n;

    /* renamed from: o */
    private int f1979o;

    /* renamed from: p */
    private int f1980p;

    /* renamed from: q */
    int f1981q;

    /* renamed from: r */
    private int f1982r;

    /* renamed from: s */
    private int f1983s;

    /* renamed from: t */
    private int f1984t;

    /* renamed from: u */
    private int f1985u;

    /* renamed from: v */
    private int f1986v;

    /* renamed from: w */
    private C0457j1 f1987w;

    /* renamed from: x */
    private int f1988x;

    /* renamed from: y */
    private int f1989y;

    /* renamed from: z */
    private int f1990z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0383a implements ActionMenuView.C0342e {
        C0383a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f1954J.mo3703j(menuItem)) {
                return true;
            }
            C0390h hVar = Toolbar.this.f1956L;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0384b implements Runnable {
        C0384b() {
        }

        public void run() {
            Toolbar.this.mo1799Q();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0385c implements C0297g.C0298a {
        C0385c() {
        }

        /* renamed from: a */
        public boolean mo462a(C0297g gVar, MenuItem menuItem) {
            C0297g.C0298a aVar = Toolbar.this.f1962R;
            if (aVar == null || !aVar.mo462a(gVar, menuItem)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public void mo464b(C0297g gVar) {
            if (!Toolbar.this.f1968d.mo1362J()) {
                Toolbar.this.f1954J.mo3704k(gVar);
            }
            C0297g.C0298a aVar = Toolbar.this.f1962R;
            if (aVar != null) {
                aVar.mo464b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    class C0386d implements View.OnClickListener {
        C0386d() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1804e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    static class C0387e {
        /* renamed from: a */
        static OnBackInvokedDispatcher m1579a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        /* renamed from: b */
        static OnBackInvokedCallback m1580b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0159o(runnable);
        }

        /* renamed from: c */
        static void m1581c(Object obj, Object obj2) {
            C0155k.m415a(obj).registerOnBackInvokedCallback(1000000, C0156l.m416a(obj2));
        }

        /* renamed from: d */
        static void m1582d(Object obj, Object obj2) {
            C0155k.m415a(obj).unregisterOnBackInvokedCallback(C0156l.m416a(obj2));
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    private class C0388f implements C0313m {

        /* renamed from: d */
        C0297g f1997d;

        /* renamed from: e */
        C0301i f1998e;

        C0388f() {
        }

        /* renamed from: a */
        public int mo900a() {
            return 0;
        }

        /* renamed from: c */
        public void mo902c(C0297g gVar, boolean z) {
        }

        /* renamed from: e */
        public boolean mo904e(C0297g gVar, C0301i iVar) {
            Toolbar.this.mo1806g();
            ViewParent parent = Toolbar.this.f1975k.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1975k);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1975k);
            }
            Toolbar.this.f1976l = iVar.getActionView();
            this.f1998e = iVar;
            ViewParent parent2 = Toolbar.this.f1976l.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1976l);
                }
                C0389g m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f1283a = (toolbar4.f1981q & 112) | 8388611;
                m.f2000b = 2;
                toolbar4.f1976l.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1976l);
            }
            Toolbar.this.mo1793I();
            Toolbar.this.requestLayout();
            iVar.mo1081r(true);
            View view = Toolbar.this.f1976l;
            if (view instanceof C0266c) {
                ((C0266c) view).mo741b();
            }
            Toolbar.this.mo1800R();
            return true;
        }

        /* renamed from: g */
        public void mo925g(Parcelable parcelable) {
        }

        /* renamed from: h */
        public boolean mo906h(C0322r rVar) {
            return false;
        }

        /* renamed from: i */
        public Parcelable mo926i() {
            return null;
        }

        /* renamed from: j */
        public void mo907j(boolean z) {
            if (this.f1998e != null) {
                C0297g gVar = this.f1997d;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1997d.getItem(i) == this.f1998e) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo908l(this.f1997d, this.f1998e);
                }
            }
        }

        /* renamed from: k */
        public boolean mo927k() {
            return false;
        }

        /* renamed from: l */
        public boolean mo908l(C0297g gVar, C0301i iVar) {
            View view = Toolbar.this.f1976l;
            if (view instanceof C0266c) {
                ((C0266c) view).mo742f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1976l);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1975k);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1976l = null;
            toolbar3.mo1801a();
            this.f1998e = null;
            Toolbar.this.requestLayout();
            iVar.mo1081r(false);
            Toolbar.this.mo1800R();
            return true;
        }

        /* renamed from: m */
        public void mo909m(Context context, C0297g gVar) {
            C0301i iVar;
            C0297g gVar2 = this.f1997d;
            if (!(gVar2 == null || (iVar = this.f1998e) == null)) {
                gVar2.mo1013f(iVar);
            }
            this.f1997d = gVar;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$h */
    public interface C0390h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6444O);
    }

    /* renamed from: C */
    private int m1530C(View view, int i, int[] iArr, int i2) {
        C0389g gVar = (C0389g) view.getLayoutParams();
        int i3 = gVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = m1546q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + gVar.rightMargin;
    }

    /* renamed from: D */
    private int m1531D(View view, int i, int[] iArr, int i2) {
        C0389g gVar = (C0389g) view.getLayoutParams();
        int i3 = gVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = m1546q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + gVar.leftMargin);
    }

    /* renamed from: E */
    private int m1532E(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: F */
    private void m1533F(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: G */
    private void m1534G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f1954J.mo3701h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1955K = currentMenuItems2;
    }

    /* renamed from: H */
    private void m1535H() {
        removeCallbacks(this.f1967W);
        post(this.f1967W);
    }

    /* renamed from: O */
    private boolean m1536O() {
        if (!this.f1963S) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1537P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P */
    private boolean m1537P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m1538b(List list, int i) {
        boolean z;
        if (ViewCompat.m3541B(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int b = C1266x.m4406b(i, ViewCompat.m3541B(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0389g gVar = (C0389g) childAt.getLayoutParams();
                if (gVar.f2000b == 0 && m1537P(childAt) && m1545p(gVar.f1283a) == b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0389g gVar2 = (C0389g) childAt2.getLayoutParams();
            if (gVar2.f2000b == 0 && m1537P(childAt2) && m1545p(gVar2.f1283a) == b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m1539c(View view, boolean z) {
        C0389g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = generateLayoutParams(layoutParams);
        } else {
            gVar = (C0389g) layoutParams;
        }
        gVar.f2000b = 1;
        if (!z || this.f1976l == null) {
            addView(view, gVar);
            return;
        }
        view.setLayoutParams(gVar);
        this.f1952H.add(view);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0272g(getContext());
    }

    /* renamed from: h */
    private void m1540h() {
        if (this.f1987w == null) {
            this.f1987w = new C0457j1();
        }
    }

    /* renamed from: i */
    private void m1541i() {
        if (this.f1972h == null) {
            this.f1972h = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: j */
    private void m1542j() {
        m1543k();
        if (this.f1968d.mo1364N() == null) {
            C0297g gVar = (C0297g) this.f1968d.getMenu();
            if (this.f1960P == null) {
                this.f1960P = new C0388f();
            }
            this.f1968d.setExpandedActionViewsExclusive(true);
            gVar.mo1004c(this.f1960P, this.f1977m);
            mo1800R();
        }
    }

    /* renamed from: k */
    private void m1543k() {
        if (this.f1968d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1968d = actionMenuView;
            actionMenuView.setPopupTheme(this.f1978n);
            this.f1968d.setOnMenuItemClickListener(this.f1957M);
            this.f1968d.mo1365O(this.f1961Q, new C0385c());
            C0389g m = generateDefaultLayoutParams();
            m.f1283a = (this.f1981q & 112) | 8388613;
            this.f1968d.setLayoutParams(m);
            m1539c(this.f1968d, false);
        }
    }

    /* renamed from: l */
    private void m1544l() {
        if (this.f1971g == null) {
            this.f1971g = new AppCompatImageButton(getContext(), (AttributeSet) null, C2210a.f6443N);
            C0389g m = generateDefaultLayoutParams();
            m.f1283a = (this.f1981q & 112) | 8388611;
            this.f1971g.setLayoutParams(m);
        }
    }

    /* renamed from: p */
    private int m1545p(int i) {
        int B = ViewCompat.m3541B(this);
        int b = C1266x.m4406b(i, B) & 7;
        if (b == 1 || b == 3 || b == 5) {
            return b;
        }
        if (B == 1) {
            return 5;
        }
        return 3;
    }

    /* renamed from: q */
    private int m1546q(View view, int i) {
        int i2;
        C0389g gVar = (C0389g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int r = m1547r(gVar.f1283a);
        if (r == 48) {
            return getPaddingTop() - i2;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = gVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = gVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: r */
    private int m1547r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1990z & 112;
    }

    /* renamed from: s */
    private int m1548s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C1058a0.m3951b(marginLayoutParams) + C1058a0.m3950a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m1549t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m1550u(List list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = (View) list.get(i3);
            C0389g gVar = (C0389g) view.getLayoutParams();
            int i5 = gVar.leftMargin - i;
            int i6 = gVar.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: z */
    private boolean m1551z(View view) {
        return view.getParent() == this || this.f1952H.contains(view);
    }

    /* renamed from: A */
    public boolean mo1791A() {
        ActionMenuView actionMenuView = this.f1968d;
        return actionMenuView != null && actionMenuView.mo1361I();
    }

    /* renamed from: B */
    public boolean mo1792B() {
        ActionMenuView actionMenuView = this.f1968d;
        return actionMenuView != null && actionMenuView.mo1362J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo1793I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0389g) childAt.getLayoutParams()).f2000b == 2 || childAt == this.f1968d)) {
                removeViewAt(childCount);
                this.f1952H.add(childAt);
            }
        }
    }

    /* renamed from: J */
    public void mo1794J(int i, int i2) {
        m1540h();
        this.f1987w.mo2181g(i, i2);
    }

    /* renamed from: K */
    public void mo1795K(C0297g gVar, ActionMenuPresenter actionMenuPresenter) {
        if (gVar != null || this.f1968d != null) {
            m1543k();
            C0297g N = this.f1968d.mo1364N();
            if (N != gVar) {
                if (N != null) {
                    N.mo982Q(this.f1959O);
                    N.mo982Q(this.f1960P);
                }
                if (this.f1960P == null) {
                    this.f1960P = new C0388f();
                }
                actionMenuPresenter.mo1339J(true);
                if (gVar != null) {
                    gVar.mo1004c(actionMenuPresenter, this.f1977m);
                    gVar.mo1004c(this.f1960P, this.f1977m);
                } else {
                    actionMenuPresenter.mo909m(this.f1977m, (C0297g) null);
                    this.f1960P.mo909m(this.f1977m, (C0297g) null);
                    actionMenuPresenter.mo907j(true);
                    this.f1960P.mo907j(true);
                }
                this.f1968d.setPopupTheme(this.f1978n);
                this.f1968d.setPresenter(actionMenuPresenter);
                this.f1959O = actionMenuPresenter;
                mo1800R();
            }
        }
    }

    /* renamed from: L */
    public void mo1796L(C0313m.C0314a aVar, C0297g.C0298a aVar2) {
        this.f1961Q = aVar;
        this.f1962R = aVar2;
        ActionMenuView actionMenuView = this.f1968d;
        if (actionMenuView != null) {
            actionMenuView.mo1365O(aVar, aVar2);
        }
    }

    /* renamed from: M */
    public void mo1797M(Context context, int i) {
        this.f1980p = i;
        TextView textView = this.f1970f;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: N */
    public void mo1798N(Context context, int i) {
        this.f1979o = i;
        TextView textView = this.f1969e;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: Q */
    public boolean mo1799Q() {
        ActionMenuView actionMenuView = this.f1968d;
        return actionMenuView != null && actionMenuView.mo1366P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo1800R() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = C0387e.m1579a(this);
            if (!mo1885v() || a == null || !ViewCompat.m3578U(this) || !this.f1966V) {
                z = false;
            } else {
                z = true;
            }
            if (z && this.f1965U == null) {
                if (this.f1964T == null) {
                    this.f1964T = C0387e.m1580b(new C0491t1(this));
                }
                C0387e.m1581c(a, this.f1964T);
                this.f1965U = a;
            } else if (!z && (onBackInvokedDispatcher = this.f1965U) != null) {
                C0387e.m1582d(onBackInvokedDispatcher, this.f1964T);
                this.f1965U = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1801a() {
        for (int size = this.f1952H.size() - 1; size >= 0; size--) {
            addView((View) this.f1952H.get(size));
        }
        this.f1952H.clear();
    }

    public void addMenuProvider(C1242t0 t0Var) {
        this.f1954J.mo3698c(t0Var);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0389g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1968d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1803d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1968d
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo1363K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo1803d():boolean");
    }

    /* renamed from: e */
    public void mo1804e() {
        C0301i iVar;
        C0388f fVar = this.f1960P;
        if (fVar == null) {
            iVar = null;
        } else {
            iVar = fVar.f1998e;
        }
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void mo1805f() {
        ActionMenuView actionMenuView = this.f1968d;
        if (actionMenuView != null) {
            actionMenuView.mo1354B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1806g() {
        if (this.f1975k == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, C2210a.f6443N);
            this.f1975k = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1973i);
            this.f1975k.setContentDescription(this.f1974j);
            C0389g m = generateDefaultLayoutParams();
            m.f1283a = (this.f1981q & 112) | 8388611;
            m.f2000b = 2;
            this.f1975k.setLayoutParams(m);
            this.f1975k.setOnClickListener(new C0386d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1975k;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1975k;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0457j1 j1Var = this.f1987w;
        if (j1Var != null) {
            return j1Var.mo2175a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1989y;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0457j1 j1Var = this.f1987w;
        if (j1Var != null) {
            return j1Var.mo2176b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0457j1 j1Var = this.f1987w;
        if (j1Var != null) {
            return j1Var.mo2177c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0457j1 j1Var = this.f1987w;
        if (j1Var != null) {
            return j1Var.mo2178d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1988x;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        C0297g N;
        ActionMenuView actionMenuView = this.f1968d;
        if (actionMenuView == null || (N = actionMenuView.mo1364N()) == null || !N.hasVisibleItems()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1989y, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (ViewCompat.m3541B(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (ViewCompat.m3541B(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1988x, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1972h;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1972h;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1542j();
        return this.f1968d.getMenu();
    }

    /* access modifiers changed from: package-private */
    public View getNavButtonView() {
        return this.f1971g;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1971g;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1971g;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1959O;
    }

    public Drawable getOverflowIcon() {
        m1542j();
        return this.f1968d.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1977m;
    }

    public int getPopupTheme() {
        return this.f1978n;
    }

    public CharSequence getSubtitle() {
        return this.f1946B;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f1970f;
    }

    public CharSequence getTitle() {
        return this.f1945A;
    }

    public int getTitleMarginBottom() {
        return this.f1986v;
    }

    public int getTitleMarginEnd() {
        return this.f1984t;
    }

    public int getTitleMarginStart() {
        return this.f1983s;
    }

    public int getTitleMarginTop() {
        return this.f1985u;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f1969e;
    }

    public C0469n0 getWrapper() {
        if (this.f1958N == null) {
            this.f1958N = new C0504v1(this, true);
        }
        return this.f1958N;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0389g generateDefaultLayoutParams() {
        return new C0389g(-2, -2);
    }

    /* renamed from: n */
    public C0389g generateLayoutParams(AttributeSet attributeSet) {
        return new C0389g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0389g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0389g) {
            return new C0389g((C0389g) layoutParams);
        }
        if (layoutParams instanceof C0209a.C0210a) {
            return new C0389g((C0209a.C0210a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0389g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0389g(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo1800R();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1967W);
        mo1800R();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1950F = false;
        }
        if (!this.f1950F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1950F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1950F = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x029f A[LOOP:0: B:101:0x029d->B:102:0x029f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c1 A[LOOP:1: B:104:0x02bf->B:105:0x02c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fa A[LOOP:2: B:112:0x02f8->B:113:0x02fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.ViewCompat.m3541B(r19)
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = r3
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1953I
            r11[r3] = r2
            r11[r2] = r2
            int r12 = androidx.core.view.ViewCompat.m3543C(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r2
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1971g
            boolean r13 = r0.m1537P(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f1971g
            int r13 = r0.m1531D(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f1971g
            int r13 = r0.m1530C(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f1975k
            boolean r15 = r0.m1537P(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f1975k
            int r14 = r0.m1531D(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f1975k
            int r13 = r0.m1530C(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1968d
            boolean r15 = r0.m1537P(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1968d
            int r13 = r0.m1530C(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1968d
            int r14 = r0.m1531D(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1976l
            boolean r13 = r0.m1537P(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f1976l
            int r10 = r0.m1531D(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f1976l
            int r3 = r0.m1530C(r13, r3, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f1972h
            boolean r13 = r0.m1537P(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f1972h
            int r10 = r0.m1531D(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f1972h
            int r3 = r0.m1530C(r13, r3, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f1969e
            boolean r13 = r0.m1537P(r13)
            android.widget.TextView r14 = r0.f1970f
            boolean r14 = r0.m1537P(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f1969e
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r15 = (androidx.appcompat.widget.Toolbar.C0389g) r15
            int r2 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1969e
            int r7 = r7.getMeasuredHeight()
            int r2 = r2 + r7
            int r7 = r15.bottomMargin
            int r2 = r2 + r7
            r7 = 0
            int r2 = r2 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r2 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f1970f
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.C0389g) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1970f
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r2 = r2 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0290
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f1969e
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f1970f
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f1970f
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f1969e
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r4 = (androidx.appcompat.widget.Toolbar.C0389g) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r7 = (androidx.appcompat.widget.Toolbar.C0389g) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f1969e
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f1970f
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.f1990z
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f1985u
            r24 = r3
            int r3 = r15 + r12
            if (r6 >= r3) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1986v
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r3
            r22 = r12
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f1986v
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L_0x01b5
        L_0x01a6:
            r24 = r3
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1985u
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f1983s
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f1969e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.C0389g) r1
            android.widget.TextView r2 = r0.f1969e
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1969e
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1969e
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1984t
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f1970f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r1 = (androidx.appcompat.widget.Toolbar.C0389g) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1970f
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f1970f
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1970f
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f1984t
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r3 = r24
            goto L_0x0128
        L_0x0227:
            if (r17 == 0) goto L_0x022d
            int r7 = r0.f1983s
            r1 = 0
            goto L_0x022f
        L_0x022d:
            r1 = 0
            r7 = 0
        L_0x022f:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r3 = r24 + r2
            int r2 = -r7
            int r2 = java.lang.Math.max(r1, r2)
            r11[r1] = r2
            if (r13 == 0) goto L_0x0264
            android.widget.TextView r2 = r0.f1969e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r2 = (androidx.appcompat.widget.Toolbar.C0389g) r2
            android.widget.TextView r4 = r0.f1969e
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r3
            android.widget.TextView r5 = r0.f1969e
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1969e
            r6.layout(r3, r8, r4, r5)
            int r6 = r0.f1984t
            int r4 = r4 + r6
            int r2 = r2.bottomMargin
            int r8 = r5 + r2
            goto L_0x0265
        L_0x0264:
            r4 = r3
        L_0x0265:
            if (r14 == 0) goto L_0x0289
            android.widget.TextView r2 = r0.f1970f
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r2 = (androidx.appcompat.widget.Toolbar.C0389g) r2
            int r2 = r2.topMargin
            int r8 = r8 + r2
            android.widget.TextView r2 = r0.f1970f
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r5 = r0.f1970f
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1970f
            r6.layout(r3, r8, r2, r5)
            int r5 = r0.f1984t
            int r2 = r2 + r5
            goto L_0x028a
        L_0x0289:
            r2 = r3
        L_0x028a:
            if (r17 == 0) goto L_0x0290
            int r3 = java.lang.Math.max(r4, r2)
        L_0x0290:
            java.util.ArrayList r2 = r0.f1951G
            r4 = 3
            r0.m1538b(r2, r4)
            java.util.ArrayList r2 = r0.f1951G
            int r2 = r2.size()
            r7 = r1
        L_0x029d:
            if (r7 >= r2) goto L_0x02b0
            java.util.ArrayList r4 = r0.f1951G
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.m1530C(r4, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x029d
        L_0x02b0:
            r12 = r22
            java.util.ArrayList r2 = r0.f1951G
            r4 = 5
            r0.m1538b(r2, r4)
            java.util.ArrayList r2 = r0.f1951G
            int r2 = r2.size()
            r7 = r1
        L_0x02bf:
            if (r7 >= r2) goto L_0x02d0
            java.util.ArrayList r4 = r0.f1951G
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m1531D(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02bf
        L_0x02d0:
            java.util.ArrayList r2 = r0.f1951G
            r4 = 1
            r0.m1538b(r2, r4)
            java.util.ArrayList r2 = r0.f1951G
            int r2 = r0.m1550u(r2, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r2 / 2
            int r6 = r6 - r4
            int r2 = r2 + r6
            if (r6 >= r3) goto L_0x02eb
            goto L_0x02f2
        L_0x02eb:
            if (r2 <= r10) goto L_0x02f1
            int r2 = r2 - r10
            int r3 = r6 - r2
            goto L_0x02f2
        L_0x02f1:
            r3 = r6
        L_0x02f2:
            java.util.ArrayList r2 = r0.f1951G
            int r2 = r2.size()
        L_0x02f8:
            if (r1 >= r2) goto L_0x0309
            java.util.ArrayList r4 = r0.f1951G
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r3 = r0.m1530C(r4, r3, r11, r12)
            int r1 = r1 + 1
            goto L_0x02f8
        L_0x0309:
            java.util.ArrayList r1 = r0.f1951G
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1953I;
        char b = C0417d2.m1689b(this);
        int i12 = 0;
        char c = b ^ 1;
        if (m1537P(this.f1971g)) {
            m1533F(this.f1971g, i, 0, i2, 0, this.f1982r);
            i5 = this.f1971g.getMeasuredWidth() + m1548s(this.f1971g);
            i4 = Math.max(0, this.f1971g.getMeasuredHeight() + m1549t(this.f1971g));
            i3 = View.combineMeasuredStates(0, this.f1971g.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1537P(this.f1975k)) {
            m1533F(this.f1975k, i, 0, i2, 0, this.f1982r);
            i5 = this.f1975k.getMeasuredWidth() + m1548s(this.f1975k);
            i4 = Math.max(i4, this.f1975k.getMeasuredHeight() + m1549t(this.f1975k));
            i3 = View.combineMeasuredStates(i3, this.f1975k.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[b] = Math.max(0, currentContentInsetStart - i5);
        if (m1537P(this.f1968d)) {
            m1533F(this.f1968d, i, max, i2, 0, this.f1982r);
            i6 = this.f1968d.getMeasuredWidth() + m1548s(this.f1968d);
            i4 = Math.max(i4, this.f1968d.getMeasuredHeight() + m1549t(this.f1968d));
            i3 = View.combineMeasuredStates(i3, this.f1968d.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m1537P(this.f1976l)) {
            max2 += m1532E(this.f1976l, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1976l.getMeasuredHeight() + m1549t(this.f1976l));
            i3 = View.combineMeasuredStates(i3, this.f1976l.getMeasuredState());
        }
        if (m1537P(this.f1972h)) {
            max2 += m1532E(this.f1972h, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1972h.getMeasuredHeight() + m1549t(this.f1972h));
            i3 = View.combineMeasuredStates(i3, this.f1972h.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((C0389g) childAt.getLayoutParams()).f2000b == 0 && m1537P(childAt)) {
                max2 += m1532E(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m1549t(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i14 = this.f1985u + this.f1986v;
        int i15 = this.f1983s + this.f1984t;
        if (m1537P(this.f1969e)) {
            m1532E(this.f1969e, i, max2 + i15, i2, i14, iArr);
            int measuredWidth = this.f1969e.getMeasuredWidth() + m1548s(this.f1969e);
            i7 = this.f1969e.getMeasuredHeight() + m1549t(this.f1969e);
            i9 = View.combineMeasuredStates(i3, this.f1969e.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (m1537P(this.f1970f)) {
            i8 = Math.max(i8, m1532E(this.f1970f, i, max2 + i15, i2, i7 + i14, iArr));
            i7 += this.f1970f.getMeasuredHeight() + m1549t(this.f1970f);
            i9 = View.combineMeasuredStates(i9, this.f1970f.getMeasuredState());
        } else {
            int i16 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m1536O()) {
            i12 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i12);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C0297g gVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3880a());
        ActionMenuView actionMenuView = this.f1968d;
        if (actionMenuView != null) {
            gVar = actionMenuView.mo1364N();
        } else {
            gVar = null;
        }
        int i = savedState.f1991f;
        if (!(i == 0 || this.f1960P == null || gVar == null || (findItem = gVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1992g) {
            m1535H();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m1540h();
        C0457j1 j1Var = this.f1987w;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        j1Var.mo2180f(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0301i iVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0388f fVar = this.f1960P;
        if (!(fVar == null || (iVar = fVar.f1998e) == null)) {
            savedState.f1991f = iVar.getItemId();
        }
        savedState.f1992g = mo1792B();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1949E = false;
        }
        if (!this.f1949E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1949E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1949E = false;
        }
        return true;
    }

    public void removeMenuProvider(C1242t0 t0Var) {
        this.f1954J.mo3705l(t0Var);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f1966V != z) {
            this.f1966V = z;
            mo1800R();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C5769a.m23210b(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f1963S = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1989y) {
            this.f1989y = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1988x) {
            this.f1988x = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C5769a.m23210b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C5769a.m23210b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1544l();
        this.f1971g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0390h hVar) {
        this.f1956L = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1542j();
        this.f1968d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1978n != i) {
            this.f1978n = i;
            if (i == 0) {
                this.f1977m = getContext();
            } else {
                this.f1977m = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1986v = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1984t = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1983s = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1985u = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: v */
    public boolean mo1885v() {
        C0388f fVar = this.f1960P;
        return (fVar == null || fVar.f1998e == null) ? false : true;
    }

    /* renamed from: w */
    public boolean mo1886w() {
        ActionMenuView actionMenuView = this.f1968d;
        return actionMenuView != null && actionMenuView.mo1360H();
    }

    /* renamed from: x */
    public void mo1887x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: y */
    public void mo1888y() {
        Iterator it = this.f1955K.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        m1534G();
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0389g extends C0209a.C0210a {

        /* renamed from: b */
        int f2000b = 0;

        public C0389g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1897a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0389g(int i, int i2) {
            super(i, i2);
            this.f1283a = 8388627;
        }

        public C0389g(C0389g gVar) {
            super((C0209a.C0210a) gVar);
            this.f2000b = gVar.f2000b;
        }

        public C0389g(C0209a.C0210a aVar) {
            super(aVar);
        }

        public C0389g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo1897a(marginLayoutParams);
        }

        public C0389g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1990z = 8388627;
        this.f1951G = new ArrayList();
        this.f1952H = new ArrayList();
        this.f1953I = new int[2];
        this.f1954J = new C1141e0(new C0488s1(this));
        this.f1955K = new ArrayList();
        this.f1957M = new C0383a();
        this.f1967W = new C0384b();
        Context context2 = getContext();
        int[] iArr = C2219j.f6809l3;
        C0483r1 v = C0483r1.m1946v(context2, attributeSet, iArr, i, 0);
        ViewCompat.m3615p0(this, context, iArr, attributeSet, v.mo2331r(), i, 0);
        this.f1979o = v.mo2327n(C2219j.f6689N3, 0);
        this.f1980p = v.mo2327n(C2219j.f6644E3, 0);
        this.f1990z = v.mo2325l(C2219j.f6814m3, this.f1990z);
        this.f1981q = v.mo2325l(C2219j.f6819n3, 48);
        int e = v.mo2318e(C2219j.f6659H3, 0);
        int i2 = C2219j.f6684M3;
        e = v.mo2332s(i2) ? v.mo2318e(i2, e) : e;
        this.f1986v = e;
        this.f1985u = e;
        this.f1984t = e;
        this.f1983s = e;
        int e2 = v.mo2318e(C2219j.f6674K3, -1);
        if (e2 >= 0) {
            this.f1983s = e2;
        }
        int e3 = v.mo2318e(C2219j.f6669J3, -1);
        if (e3 >= 0) {
            this.f1984t = e3;
        }
        int e4 = v.mo2318e(C2219j.f6679L3, -1);
        if (e4 >= 0) {
            this.f1985u = e4;
        }
        int e5 = v.mo2318e(C2219j.f6664I3, -1);
        if (e5 >= 0) {
            this.f1986v = e5;
        }
        this.f1982r = v.mo2319f(C2219j.f6874y3, -1);
        int e6 = v.mo2318e(C2219j.f6854u3, Integer.MIN_VALUE);
        int e7 = v.mo2318e(C2219j.f6834q3, Integer.MIN_VALUE);
        int f = v.mo2319f(C2219j.f6844s3, 0);
        int f2 = v.mo2319f(C2219j.f6849t3, 0);
        m1540h();
        this.f1987w.mo2179e(f, f2);
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            this.f1987w.mo2181g(e6, e7);
        }
        this.f1988x = v.mo2318e(C2219j.f6859v3, Integer.MIN_VALUE);
        this.f1989y = v.mo2318e(C2219j.f6839r3, Integer.MIN_VALUE);
        this.f1973i = v.mo2320g(C2219j.f6829p3);
        this.f1974j = v.mo2329p(C2219j.f6824o3);
        CharSequence p = v.mo2329p(C2219j.f6654G3);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.mo2329p(C2219j.f6639D3);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.f1977m = getContext();
        setPopupTheme(v.mo2327n(C2219j.f6634C3, 0));
        Drawable g = v.mo2320g(C2219j.f6629B3);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p3 = v.mo2329p(C2219j.f6624A3);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g2 = v.mo2320g(C2219j.f6864w3);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p4 = v.mo2329p(C2219j.f6869x3);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        int i3 = C2219j.f6694O3;
        if (v.mo2332s(i3)) {
            setTitleTextColor(v.mo2316c(i3));
        }
        int i4 = C2219j.f6649F3;
        if (v.mo2332s(i4)) {
            setSubtitleTextColor(v.mo2316c(i4));
        }
        int i5 = C2219j.f6879z3;
        if (v.mo2332s(i5)) {
            mo1887x(v.mo2327n(i5, 0));
        }
        v.mo2333w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1806g();
        }
        ImageButton imageButton = this.f1975k;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1806g();
            this.f1975k.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1975k;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1973i);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1541i();
            if (!m1551z(this.f1972h)) {
                m1539c(this.f1972h, true);
            }
        } else {
            ImageView imageView = this.f1972h;
            if (imageView != null && m1551z(imageView)) {
                removeView(this.f1972h);
                this.f1952H.remove(this.f1972h);
            }
        }
        ImageView imageView2 = this.f1972h;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1541i();
        }
        ImageView imageView = this.f1972h;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1544l();
        }
        ImageButton imageButton = this.f1971g;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C0512x1.m2056a(this.f1971g, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1544l();
            if (!m1551z(this.f1971g)) {
                m1539c(this.f1971g, true);
            }
        } else {
            ImageButton imageButton = this.f1971g;
            if (imageButton != null && m1551z(imageButton)) {
                removeView(this.f1971g);
                this.f1952H.remove(this.f1971g);
            }
        }
        ImageButton imageButton2 = this.f1971g;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1970f == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1970f = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1970f.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1980p;
                if (i != 0) {
                    this.f1970f.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1948D;
                if (colorStateList != null) {
                    this.f1970f.setTextColor(colorStateList);
                }
            }
            if (!m1551z(this.f1970f)) {
                m1539c(this.f1970f, true);
            }
        } else {
            TextView textView = this.f1970f;
            if (textView != null && m1551z(textView)) {
                removeView(this.f1970f);
                this.f1952H.remove(this.f1970f);
            }
        }
        TextView textView2 = this.f1970f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1946B = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1948D = colorStateList;
        TextView textView = this.f1970f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1969e == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1969e = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1969e.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1979o;
                if (i != 0) {
                    this.f1969e.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1947C;
                if (colorStateList != null) {
                    this.f1969e.setTextColor(colorStateList);
                }
            }
            if (!m1551z(this.f1969e)) {
                m1539c(this.f1969e, true);
            }
        } else {
            TextView textView = this.f1969e;
            if (textView != null && m1551z(textView)) {
                removeView(this.f1969e);
                this.f1952H.remove(this.f1969e);
            }
        }
        TextView textView2 = this.f1969e;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1945A = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1947C = colorStateList;
        TextView textView = this.f1969e;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0382a();

        /* renamed from: f */
        int f1991f;

        /* renamed from: g */
        boolean f1992g;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        class C0382a implements Parcelable.ClassLoaderCreator {
            C0382a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1991f = parcel.readInt();
            this.f1992g = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1991f);
            parcel.writeInt(this.f1992g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
