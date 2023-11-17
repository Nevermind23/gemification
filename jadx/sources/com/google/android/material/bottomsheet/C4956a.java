package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0253u;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1055a;
import androidx.core.view.C1060a1;
import androidx.core.view.C1200m3;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.C5075c;
import p009a8.C0072b;
import p009a8.C0076f;
import p009a8.C0078h;
import p009a8.C0081k;
import p080f8.C6170a;
import p223q8.C7922g;

/* renamed from: com.google.android.material.bottomsheet.a */
public class C4956a extends C0253u {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public BottomSheetBehavior f15674h;

    /* renamed from: i */
    private FrameLayout f15675i;

    /* renamed from: j */
    private CoordinatorLayout f15676j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public FrameLayout f15677k;

    /* renamed from: l */
    boolean f15678l;

    /* renamed from: m */
    boolean f15679m = true;

    /* renamed from: n */
    private boolean f15680n = true;

    /* renamed from: o */
    private boolean f15681o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C4962f f15682p;

    /* renamed from: q */
    private boolean f15683q;

    /* renamed from: r */
    private BottomSheetBehavior.C4953f f15684r = new C4961e();

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    class C4957a implements C1060a1 {
        C4957a() {
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            if (C4956a.this.f15682p != null) {
                C4956a.this.f15674h.mo15595r0(C4956a.this.f15682p);
            }
            if (windowInsetsCompat != null) {
                C4956a aVar = C4956a.this;
                C4962f unused = aVar.f15682p = new C4962f(aVar.f15677k, windowInsetsCompat, (C4957a) null);
                C4956a.this.f15682p.mo15624e(C4956a.this.getWindow());
                C4956a.this.f15674h.mo15585W(C4956a.this.f15682p);
            }
            return windowInsetsCompat;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    class C4958b implements View.OnClickListener {
        C4958b() {
        }

        public void onClick(View view) {
            C4956a aVar = C4956a.this;
            if (aVar.f15679m && aVar.isShowing() && C4956a.this.mo15619q()) {
                C4956a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    class C4959c extends C1055a {
        C4959c() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (C4956a.this.f15679m) {
                accessibilityNodeInfoCompat.mo3594a(1048576);
                accessibilityNodeInfoCompat.mo3600d0(true);
                return;
            }
            accessibilityNodeInfoCompat.mo3600d0(false);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                C4956a aVar = C4956a.this;
                if (aVar.f15679m) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    class C4960d implements View.OnTouchListener {
        C4960d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$e */
    class C4961e extends BottomSheetBehavior.C4953f {
        C4961e() {
        }

        /* renamed from: b */
        public void mo15609b(View view, float f) {
        }

        /* renamed from: c */
        public void mo15610c(View view, int i) {
            if (i == 5) {
                C4956a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$f */
    private static class C4962f extends BottomSheetBehavior.C4953f {

        /* renamed from: a */
        private final Boolean f15690a;

        /* renamed from: b */
        private final WindowInsetsCompat f15691b;

        /* renamed from: c */
        private Window f15692c;

        /* renamed from: d */
        private boolean f15693d;

        /* synthetic */ C4962f(View view, WindowInsetsCompat windowInsetsCompat, C4957a aVar) {
            this(view, windowInsetsCompat);
        }

        /* renamed from: d */
        private void m19010d(View view) {
            boolean z;
            if (view.getTop() < this.f15691b.mo3496l()) {
                Window window = this.f15692c;
                if (window != null) {
                    Boolean bool = this.f15690a;
                    if (bool == null) {
                        z = this.f15693d;
                    } else {
                        z = bool.booleanValue();
                    }
                    C5075c.m19858f(window, z);
                }
                view.setPadding(view.getPaddingLeft(), this.f15691b.mo3496l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                Window window2 = this.f15692c;
                if (window2 != null) {
                    C5075c.m19858f(window2, this.f15693d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15608a(View view) {
            m19010d(view);
        }

        /* renamed from: b */
        public void mo15609b(View view, float f) {
            m19010d(view);
        }

        /* renamed from: c */
        public void mo15610c(View view, int i) {
            m19010d(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo15624e(Window window) {
            if (this.f15692c != window) {
                this.f15692c = window;
                if (window != null) {
                    this.f15693d = C1200m3.m4285a(window, window.getDecorView()).mo3540b();
                }
            }
        }

        private C4962f(View view, WindowInsetsCompat windowInsetsCompat) {
            ColorStateList colorStateList;
            this.f15691b = windowInsetsCompat;
            C7922g i0 = BottomSheetBehavior.m18934f0(view).mo15589i0();
            if (i0 != null) {
                colorStateList = i0.mo22965x();
            } else {
                colorStateList = ViewCompat.m3620s(view);
            }
            if (colorStateList != null) {
                this.f15690a = Boolean.valueOf(C6170a.m24585f(colorStateList.getDefaultColor()));
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f15690a = Boolean.valueOf(C6170a.m24585f(((ColorDrawable) view.getBackground()).getColor()));
            } else {
                this.f15690a = null;
            }
        }
    }

    public C4956a(Context context, int i) {
        super(context, m18997f(context, i));
        mo707h(1);
        this.f15683q = getContext().getTheme().obtainStyledAttributes(new int[]{C0072b.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* renamed from: f */
    private static int m18997f(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C0072b.f147f, typedValue, true)) {
            return typedValue.resourceId;
        }
        return C0081k.f359g;
    }

    /* renamed from: m */
    private FrameLayout m19002m() {
        if (this.f15675i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0078h.f292b, (ViewGroup) null);
            this.f15675i = frameLayout;
            this.f15676j = (CoordinatorLayout) frameLayout.findViewById(C0076f.f268e);
            FrameLayout frameLayout2 = (FrameLayout) this.f15675i.findViewById(C0076f.f270f);
            this.f15677k = frameLayout2;
            BottomSheetBehavior f0 = BottomSheetBehavior.m18934f0(frameLayout2);
            this.f15674h = f0;
            f0.mo15585W(this.f15684r);
            this.f15674h.mo15572B0(this.f15679m);
        }
        return this.f15675i;
    }

    /* renamed from: r */
    private View m19003r(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m19002m();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f15675i.findViewById(C0076f.f268e);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        if (this.f15683q) {
            ViewCompat.m3550F0(this.f15677k, new C4957a());
        }
        this.f15677k.removeAllViews();
        if (layoutParams == null) {
            this.f15677k.addView(view);
        } else {
            this.f15677k.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C0076f.f265c0).setOnClickListener(new C4958b());
        ViewCompat.m3619r0(this.f15677k, new C4959c());
        this.f15677k.setOnTouchListener(new C4960d());
        return this.f15675i;
    }

    public void cancel() {
        BottomSheetBehavior n = mo15614n();
        if (!this.f15678l || n.mo15590j0() == 5) {
            super.cancel();
        } else {
            n.mo15579I0(5);
        }
    }

    /* renamed from: n */
    public BottomSheetBehavior mo15614n() {
        if (this.f15674h == null) {
            m19002m();
        }
        return this.f15674h;
    }

    /* renamed from: o */
    public boolean mo15615o() {
        return this.f15678l;
    }

    public void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (!this.f15683q || Color.alpha(window.getNavigationBarColor()) >= 255) {
                z = false;
            } else {
                z = true;
            }
            FrameLayout frameLayout = this.f15675i;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f15676j;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            C1200m3.m4286b(window, !z);
            C4962f fVar = this.f15682p;
            if (fVar != null) {
                fVar.mo15624e(window);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public void onDetachedFromWindow() {
        C4962f fVar = this.f15682p;
        if (fVar != null) {
            fVar.mo15624e((Window) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f15674h;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo15590j0() == 5) {
            this.f15674h.mo15579I0(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo15618p() {
        this.f15674h.mo15595r0(this.f15684r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo15619q() {
        if (!this.f15681o) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f15680n = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f15681o = true;
        }
        return this.f15680n;
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f15679m != z) {
            this.f15679m = z;
            BottomSheetBehavior bottomSheetBehavior = this.f15674h;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo15572B0(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f15679m) {
            this.f15679m = true;
        }
        this.f15680n = z;
        this.f15681o = true;
    }

    public void setContentView(int i) {
        super.setContentView(m19003r(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(m19003r(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m19003r(0, view, layoutParams));
    }
}
