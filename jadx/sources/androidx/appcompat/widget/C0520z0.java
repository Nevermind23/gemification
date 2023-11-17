package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0318p;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C1310m;
import com.facetec.sdk.FaceTecSDK;
import java.lang.reflect.Method;
import p030c.C2210a;
import p030c.C2219j;

/* renamed from: androidx.appcompat.widget.z0 */
public class C0520z0 implements C0318p {

    /* renamed from: J */
    private static Method f2284J;

    /* renamed from: K */
    private static Method f2285K;

    /* renamed from: L */
    private static Method f2286L;

    /* renamed from: A */
    private final C0528h f2287A;

    /* renamed from: B */
    private final C0527g f2288B;

    /* renamed from: C */
    private final C0525e f2289C;

    /* renamed from: D */
    private Runnable f2290D;

    /* renamed from: E */
    final Handler f2291E;

    /* renamed from: F */
    private final Rect f2292F;

    /* renamed from: G */
    private Rect f2293G;

    /* renamed from: H */
    private boolean f2294H;

    /* renamed from: I */
    PopupWindow f2295I;

    /* renamed from: d */
    private Context f2296d;

    /* renamed from: e */
    private ListAdapter f2297e;

    /* renamed from: f */
    C0494u0 f2298f;

    /* renamed from: g */
    private int f2299g;

    /* renamed from: h */
    private int f2300h;

    /* renamed from: i */
    private int f2301i;

    /* renamed from: j */
    private int f2302j;

    /* renamed from: k */
    private int f2303k;

    /* renamed from: l */
    private boolean f2304l;

    /* renamed from: m */
    private boolean f2305m;

    /* renamed from: n */
    private boolean f2306n;

    /* renamed from: o */
    private int f2307o;

    /* renamed from: p */
    private boolean f2308p;

    /* renamed from: q */
    private boolean f2309q;

    /* renamed from: r */
    int f2310r;

    /* renamed from: s */
    private View f2311s;

    /* renamed from: t */
    private int f2312t;

    /* renamed from: u */
    private DataSetObserver f2313u;

    /* renamed from: v */
    private View f2314v;

    /* renamed from: w */
    private Drawable f2315w;

    /* renamed from: x */
    private AdapterView.OnItemClickListener f2316x;

    /* renamed from: y */
    private AdapterView.OnItemSelectedListener f2317y;

    /* renamed from: z */
    final C0529i f2318z;

    /* renamed from: androidx.appcompat.widget.z0$a */
    class C0521a implements Runnable {
        C0521a() {
        }

        public void run() {
            View t = C0520z0.this.mo2393t();
            if (t != null && t.getWindowToken() != null) {
                C0520z0.this.mo923d();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$b */
    class C0522b implements AdapterView.OnItemSelectedListener {
        C0522b() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            C0494u0 u0Var;
            if (i != -1 && (u0Var = C0520z0.this.f2298f) != null) {
                u0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$c */
    static class C0523c {
        /* renamed from: a */
        static int m2108a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$d */
    static class C0524d {
        /* renamed from: a */
        static void m2109a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        static void m2110b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$e */
    private class C0525e implements Runnable {
        C0525e() {
        }

        public void run() {
            C0520z0.this.mo2392r();
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$f */
    private class C0526f extends DataSetObserver {
        C0526f() {
        }

        public void onChanged() {
            if (C0520z0.this.mo922b()) {
                C0520z0.this.mo923d();
            }
        }

        public void onInvalidated() {
            C0520z0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$g */
    private class C0527g implements AbsListView.OnScrollListener {
        C0527g() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0520z0.this.mo2370A() && C0520z0.this.f2295I.getContentView() != null) {
                C0520z0 z0Var = C0520z0.this;
                z0Var.f2291E.removeCallbacks(z0Var.f2318z);
                C0520z0.this.f2318z.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$h */
    private class C0528h implements View.OnTouchListener {
        C0528h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0520z0.this.f2295I) != null && popupWindow.isShowing() && x >= 0 && x < C0520z0.this.f2295I.getWidth() && y >= 0 && y < C0520z0.this.f2295I.getHeight()) {
                C0520z0 z0Var = C0520z0.this;
                z0Var.f2291E.postDelayed(z0Var.f2318z, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0520z0 z0Var2 = C0520z0.this;
                z0Var2.f2291E.removeCallbacks(z0Var2.f2318z);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.z0$i */
    private class C0529i implements Runnable {
        C0529i() {
        }

        public void run() {
            C0494u0 u0Var = C0520z0.this.f2298f;
            if (u0Var != null && ViewCompat.m3578U(u0Var) && C0520z0.this.f2298f.getCount() > C0520z0.this.f2298f.getChildCount()) {
                int childCount = C0520z0.this.f2298f.getChildCount();
                C0520z0 z0Var = C0520z0.this;
                if (childCount <= z0Var.f2310r) {
                    z0Var.f2295I.setInputMethodMode(2);
                    C0520z0.this.mo923d();
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2284J = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2286L = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f2285K = cls.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0520z0(Context context) {
        this(context, (AttributeSet) null, C2210a.f6433D);
    }

    /* renamed from: C */
    private void m2070C() {
        View view = this.f2311s;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2311s);
            }
        }
    }

    /* renamed from: O */
    private void m2071O(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2284J;
            if (method != null) {
                try {
                    method.invoke(this.f2295I, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            C0524d.m2110b(this.f2295I, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.u0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m2072q() {
        /*
            r12 = this;
            androidx.appcompat.widget.u0 r0 = r12.f2298f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00be
            android.content.Context r0 = r12.f2296d
            androidx.appcompat.widget.z0$a r5 = new androidx.appcompat.widget.z0$a
            r5.<init>()
            r12.f2290D = r5
            boolean r5 = r12.f2294H
            r5 = r5 ^ r3
            androidx.appcompat.widget.u0 r5 = r12.mo2054s(r0, r5)
            r12.f2298f = r5
            android.graphics.drawable.Drawable r6 = r12.f2315w
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.u0 r5 = r12.f2298f
            android.widget.ListAdapter r6 = r12.f2297e
            r5.setAdapter(r6)
            androidx.appcompat.widget.u0 r5 = r12.f2298f
            android.widget.AdapterView$OnItemClickListener r6 = r12.f2316x
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.u0 r5 = r12.f2298f
            r5.setFocusable(r3)
            androidx.appcompat.widget.u0 r5 = r12.f2298f
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.u0 r5 = r12.f2298f
            androidx.appcompat.widget.z0$b r6 = new androidx.appcompat.widget.z0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.u0 r5 = r12.f2298f
            androidx.appcompat.widget.z0$g r6 = r12.f2288B
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f2317y
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.u0 r6 = r12.f2298f
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.u0 r5 = r12.f2298f
            android.view.View r6 = r12.f2311s
            if (r6 == 0) goto L_0x00b7
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f2312t
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f2312t
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f2300h
            if (r0 < 0) goto L_0x009b
            r5 = r1
            goto L_0x009d
        L_0x009b:
            r0 = r4
            r5 = r0
        L_0x009d:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b8
        L_0x00b7:
            r0 = r4
        L_0x00b8:
            android.widget.PopupWindow r6 = r12.f2295I
            r6.setContentView(r5)
            goto L_0x00dc
        L_0x00be:
            android.widget.PopupWindow r0 = r12.f2295I
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f2311s
            if (r0 == 0) goto L_0x00db
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dc
        L_0x00db:
            r0 = r4
        L_0x00dc:
            android.widget.PopupWindow r5 = r12.f2295I
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f8
            android.graphics.Rect r6 = r12.f2292F
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f2292F
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f2304l
            if (r7 != 0) goto L_0x00fe
            int r6 = -r6
            r12.f2302j = r6
            goto L_0x00fe
        L_0x00f8:
            android.graphics.Rect r5 = r12.f2292F
            r5.setEmpty()
            r5 = r4
        L_0x00fe:
            android.widget.PopupWindow r6 = r12.f2295I
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r3 = r4
        L_0x0109:
            android.view.View r4 = r12.mo2393t()
            int r6 = r12.f2302j
            int r3 = r12.m2073u(r4, r6, r3)
            boolean r4 = r12.f2308p
            if (r4 != 0) goto L_0x017a
            int r4 = r12.f2299g
            if (r4 != r2) goto L_0x011c
            goto L_0x017a
        L_0x011c:
            int r4 = r12.f2300h
            r6 = -2
            if (r4 == r6) goto L_0x0143
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012a
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x015b
        L_0x012a:
            android.content.Context r2 = r12.f2296d
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f2292F
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x015b
        L_0x0143:
            android.content.Context r2 = r12.f2296d
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f2292F
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x015b:
            r7 = r1
            androidx.appcompat.widget.u0 r6 = r12.f2298f
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo2055d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0178
            androidx.appcompat.widget.u0 r2 = r12.f2298f
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.u0 r3 = r12.f2298f
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0178:
            int r1 = r1 + r0
            return r1
        L_0x017a:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0520z0.m2072q():int");
    }

    /* renamed from: u */
    private int m2073u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return C0523c.m2108a(this.f2295I, view, i, z);
        }
        Method method = f2285K;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f2295I, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f2295I.getMaxAvailableHeight(view, i);
    }

    /* renamed from: A */
    public boolean mo2370A() {
        return this.f2295I.getInputMethodMode() == 2;
    }

    /* renamed from: B */
    public boolean mo2371B() {
        return this.f2294H;
    }

    /* renamed from: D */
    public void mo2372D(View view) {
        this.f2314v = view;
    }

    /* renamed from: E */
    public void mo2373E(int i) {
        this.f2295I.setAnimationStyle(i);
    }

    /* renamed from: F */
    public void mo2374F(int i) {
        Drawable background = this.f2295I.getBackground();
        if (background != null) {
            background.getPadding(this.f2292F);
            Rect rect = this.f2292F;
            this.f2300h = rect.left + rect.right + i;
            return;
        }
        mo2385R(i);
    }

    /* renamed from: G */
    public void mo2375G(int i) {
        this.f2307o = i;
    }

    /* renamed from: H */
    public void mo2376H(Rect rect) {
        this.f2293G = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: I */
    public void mo2377I(int i) {
        this.f2295I.setInputMethodMode(i);
    }

    /* renamed from: J */
    public void mo2378J(boolean z) {
        this.f2294H = z;
        this.f2295I.setFocusable(z);
    }

    /* renamed from: K */
    public void mo2379K(PopupWindow.OnDismissListener onDismissListener) {
        this.f2295I.setOnDismissListener(onDismissListener);
    }

    /* renamed from: L */
    public void mo2380L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f2316x = onItemClickListener;
    }

    /* renamed from: M */
    public void mo2381M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f2317y = onItemSelectedListener;
    }

    /* renamed from: N */
    public void mo2382N(boolean z) {
        this.f2306n = true;
        this.f2305m = z;
    }

    /* renamed from: P */
    public void mo2383P(int i) {
        this.f2312t = i;
    }

    /* renamed from: Q */
    public void mo2384Q(int i) {
        C0494u0 u0Var = this.f2298f;
        if (mo922b() && u0Var != null) {
            u0Var.setListSelectionHidden(false);
            u0Var.setSelection(i);
            if (u0Var.getChoiceMode() != 0) {
                u0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: R */
    public void mo2385R(int i) {
        this.f2300h = i;
    }

    /* renamed from: b */
    public boolean mo922b() {
        return this.f2295I.isShowing();
    }

    /* renamed from: c */
    public Drawable mo2386c() {
        return this.f2295I.getBackground();
    }

    /* renamed from: d */
    public void mo923d() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int q = m2072q();
        boolean A = mo2370A();
        C1310m.m4543b(this.f2295I, this.f2303k);
        boolean z2 = true;
        if (!this.f2295I.isShowing()) {
            int i5 = this.f2300h;
            if (i5 == -1) {
                i5 = -1;
            } else if (i5 == -2) {
                i5 = mo2393t().getWidth();
            }
            int i6 = this.f2299g;
            if (i6 == -1) {
                q = -1;
            } else if (i6 != -2) {
                q = i6;
            }
            this.f2295I.setWidth(i5);
            this.f2295I.setHeight(q);
            m2071O(true);
            PopupWindow popupWindow = this.f2295I;
            if (this.f2309q || this.f2308p) {
                z = false;
            } else {
                z = true;
            }
            popupWindow.setOutsideTouchable(z);
            this.f2295I.setTouchInterceptor(this.f2287A);
            if (this.f2306n) {
                C1310m.m4542a(this.f2295I, this.f2305m);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f2286L;
                if (method != null) {
                    try {
                        method.invoke(this.f2295I, new Object[]{this.f2293G});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                C0524d.m2109a(this.f2295I, this.f2293G);
            }
            C1310m.m4544c(this.f2295I, mo2393t(), this.f2301i, this.f2302j, this.f2307o);
            this.f2298f.setSelection(-1);
            if (!this.f2294H || this.f2298f.isInTouchMode()) {
                mo2392r();
            }
            if (!this.f2294H) {
                this.f2291E.post(this.f2289C);
            }
        } else if (ViewCompat.m3578U(mo2393t())) {
            int i7 = this.f2300h;
            if (i7 == -1) {
                i7 = -1;
            } else if (i7 == -2) {
                i7 = mo2393t().getWidth();
            }
            int i8 = this.f2299g;
            if (i8 == -1) {
                if (!A) {
                    q = -1;
                }
                if (A) {
                    PopupWindow popupWindow2 = this.f2295I;
                    if (this.f2300h == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    popupWindow2.setWidth(i4);
                    this.f2295I.setHeight(0);
                } else {
                    PopupWindow popupWindow3 = this.f2295I;
                    if (this.f2300h == -1) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                    popupWindow3.setWidth(i3);
                    this.f2295I.setHeight(-1);
                }
            } else if (i8 != -2) {
                q = i8;
            }
            PopupWindow popupWindow4 = this.f2295I;
            if (this.f2309q || this.f2308p) {
                z2 = false;
            }
            popupWindow4.setOutsideTouchable(z2);
            PopupWindow popupWindow5 = this.f2295I;
            View t = mo2393t();
            int i9 = this.f2301i;
            int i12 = this.f2302j;
            if (i7 < 0) {
                i = -1;
            } else {
                i = i7;
            }
            if (q < 0) {
                i2 = -1;
            } else {
                i2 = q;
            }
            popupWindow5.update(t, i9, i12, i, i2);
        }
    }

    public void dismiss() {
        this.f2295I.dismiss();
        m2070C();
        this.f2295I.setContentView((View) null);
        this.f2298f = null;
        this.f2291E.removeCallbacks(this.f2318z);
    }

    /* renamed from: e */
    public int mo2387e() {
        return this.f2301i;
    }

    /* renamed from: f */
    public void mo2388f(int i) {
        this.f2301i = i;
    }

    /* renamed from: i */
    public void mo2389i(int i) {
        this.f2302j = i;
        this.f2304l = true;
    }

    /* renamed from: l */
    public int mo2390l() {
        if (!this.f2304l) {
            return 0;
        }
        return this.f2302j;
    }

    /* renamed from: m */
    public void mo1503m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2313u;
        if (dataSetObserver == null) {
            this.f2313u = new C0526f();
        } else {
            ListAdapter listAdapter2 = this.f2297e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2297e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2313u);
        }
        C0494u0 u0Var = this.f2298f;
        if (u0Var != null) {
            u0Var.setAdapter(this.f2297e);
        }
    }

    /* renamed from: o */
    public ListView mo929o() {
        return this.f2298f;
    }

    /* renamed from: p */
    public void mo2391p(Drawable drawable) {
        this.f2295I.setBackgroundDrawable(drawable);
    }

    /* renamed from: r */
    public void mo2392r() {
        C0494u0 u0Var = this.f2298f;
        if (u0Var != null) {
            u0Var.setListSelectionHidden(true);
            u0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0494u0 mo2054s(Context context, boolean z) {
        return new C0494u0(context, z);
    }

    /* renamed from: t */
    public View mo2393t() {
        return this.f2314v;
    }

    /* renamed from: v */
    public Object mo2394v() {
        if (!mo922b()) {
            return null;
        }
        return this.f2298f.getSelectedItem();
    }

    /* renamed from: w */
    public long mo2395w() {
        if (!mo922b()) {
            return Long.MIN_VALUE;
        }
        return this.f2298f.getSelectedItemId();
    }

    /* renamed from: x */
    public int mo2396x() {
        if (!mo922b()) {
            return -1;
        }
        return this.f2298f.getSelectedItemPosition();
    }

    /* renamed from: y */
    public View mo2397y() {
        if (!mo922b()) {
            return null;
        }
        return this.f2298f.getSelectedView();
    }

    /* renamed from: z */
    public int mo2398z() {
        return this.f2300h;
    }

    public C0520z0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0520z0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2299g = -2;
        this.f2300h = -2;
        this.f2303k = FaceTecSDK.REQUEST_CODE_SESSION;
        this.f2307o = 0;
        this.f2308p = false;
        this.f2309q = false;
        this.f2310r = Integer.MAX_VALUE;
        this.f2312t = 0;
        this.f2318z = new C0529i();
        this.f2287A = new C0528h();
        this.f2288B = new C0527g();
        this.f2289C = new C0525e();
        this.f2292F = new Rect();
        this.f2296d = context;
        this.f2291E = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2219j.f6847t1, i, i2);
        this.f2301i = obtainStyledAttributes.getDimensionPixelOffset(C2219j.f6852u1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C2219j.f6857v1, 0);
        this.f2302j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2304l = true;
        }
        obtainStyledAttributes.recycle();
        C0474p pVar = new C0474p(context, attributeSet, i, i2);
        this.f2295I = pVar;
        pVar.setInputMethodMode(1);
    }
}
