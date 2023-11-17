package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.C0829d;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.internal.C5089m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0011d;
import p009a8.C0072b;
import p009a8.C0074d;
import p009a8.C0080j;
import p009a8.C0081k;
import p009a8.C0082l;
import p184n8.C7343c;
import p223q8.C7922g;
import p223q8.C7929k;
import p292w.C8720a;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C0644c {

    /* renamed from: e0 */
    private static final int f15597e0 = C0081k.f363k;

    /* renamed from: A */
    private ValueAnimator f15598A;

    /* renamed from: B */
    int f15599B;

    /* renamed from: C */
    int f15600C;

    /* renamed from: D */
    int f15601D;

    /* renamed from: E */
    float f15602E = 0.5f;

    /* renamed from: F */
    int f15603F;

    /* renamed from: G */
    float f15604G = -1.0f;

    /* renamed from: H */
    boolean f15605H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f15606I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f15607J = true;

    /* renamed from: K */
    int f15608K = 4;

    /* renamed from: L */
    int f15609L = 4;

    /* renamed from: M */
    C0011d f15610M;

    /* renamed from: N */
    private boolean f15611N;

    /* renamed from: O */
    private int f15612O;

    /* renamed from: P */
    private boolean f15613P;

    /* renamed from: Q */
    private float f15614Q = 0.1f;

    /* renamed from: R */
    private int f15615R;

    /* renamed from: S */
    int f15616S;

    /* renamed from: T */
    int f15617T;

    /* renamed from: U */
    WeakReference f15618U;

    /* renamed from: V */
    WeakReference f15619V;

    /* renamed from: W */
    private final ArrayList f15620W = new ArrayList();

    /* renamed from: X */
    private VelocityTracker f15621X;

    /* renamed from: Y */
    int f15622Y;

    /* renamed from: Z */
    private int f15623Z;

    /* renamed from: a */
    private int f15624a = 0;

    /* renamed from: a0 */
    boolean f15625a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f15626b = true;

    /* renamed from: b0 */
    private Map f15627b0;

    /* renamed from: c */
    private boolean f15628c = false;

    /* renamed from: c0 */
    private int f15629c0 = -1;

    /* renamed from: d */
    private float f15630d;

    /* renamed from: d0 */
    private final C0011d.C0014c f15631d0 = new C4951d();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f15632e;

    /* renamed from: f */
    private boolean f15633f;

    /* renamed from: g */
    private int f15634g;

    /* renamed from: h */
    private int f15635h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C7922g f15636i;

    /* renamed from: j */
    private ColorStateList f15637j;

    /* renamed from: k */
    private int f15638k = -1;

    /* renamed from: l */
    private int f15639l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f15640m;

    /* renamed from: n */
    private boolean f15641n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f15642o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f15643p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f15644q;

    /* renamed from: r */
    private boolean f15645r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f15646s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f15647t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f15648u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f15649v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f15650w;

    /* renamed from: x */
    private C7929k f15651x;

    /* renamed from: y */
    private boolean f15652y;

    /* renamed from: z */
    private final C4954g f15653z = new C4954g(this, (C4948a) null);

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C4948a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ View f15659d;

        /* renamed from: e */
        final /* synthetic */ int f15660e;

        C4948a(View view, int i) {
            this.f15659d = view;
            this.f15660e = i;
        }

        public void run() {
            BottomSheetBehavior.this.m18918Q0(this.f15659d, this.f15660e, false);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C4949b implements ValueAnimator.AnimatorUpdateListener {
        C4949b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f15636i != null) {
                BottomSheetBehavior.this.f15636i.mo22942Y(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C4950c implements C5089m.C5093d {

        /* renamed from: a */
        final /* synthetic */ boolean f15663a;

        C4950c(boolean z) {
            this.f15663a = z;
        }

        /* renamed from: a */
        public WindowInsetsCompat mo15563a(View view, WindowInsetsCompat windowInsetsCompat, C5089m.C5094e eVar) {
            boolean z;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            C0829d f = windowInsetsCompat.mo3489f(WindowInsetsCompat.C1048m.m3910e());
            C0829d f2 = windowInsetsCompat.mo3489f(WindowInsetsCompat.C1048m.m3909d());
            int unused = BottomSheetBehavior.this.f15650w = f.f3466b;
            boolean f3 = C5089m.m19905f(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f15642o) {
                int unused2 = BottomSheetBehavior.this.f15649v = windowInsetsCompat.mo3493i();
                paddingBottom = eVar.f16262d + BottomSheetBehavior.this.f15649v;
            }
            if (BottomSheetBehavior.this.f15643p) {
                if (f3) {
                    i5 = eVar.f16261c;
                } else {
                    i5 = eVar.f16259a;
                }
                paddingLeft = i5 + f.f3465a;
            }
            if (BottomSheetBehavior.this.f15644q) {
                if (f3) {
                    i4 = eVar.f16259a;
                } else {
                    i4 = eVar.f16261c;
                }
                paddingRight = i4 + f.f3467c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z2 = true;
            if (!BottomSheetBehavior.this.f15646s || marginLayoutParams.leftMargin == (i3 = f.f3465a)) {
                z = false;
            } else {
                marginLayoutParams.leftMargin = i3;
                z = true;
            }
            if (BottomSheetBehavior.this.f15647t && marginLayoutParams.rightMargin != (i2 = f.f3467c)) {
                marginLayoutParams.rightMargin = i2;
                z = true;
            }
            if (!BottomSheetBehavior.this.f15648u || marginLayoutParams.topMargin == (i = f.f3466b)) {
                z2 = z;
            } else {
                marginLayoutParams.topMargin = i;
            }
            if (z2) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f15663a) {
                int unused3 = BottomSheetBehavior.this.f15640m = f2.f3468d;
            }
            if (BottomSheetBehavior.this.f15642o || this.f15663a) {
                BottomSheetBehavior.this.m18926U0(false);
            }
            return windowInsetsCompat;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C4951d extends C0011d.C0014c {

        /* renamed from: c */
        private long f15665c;

        C4951d() {
        }

        /* renamed from: a */
        private boolean m18989a(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f15617T + bottomSheetBehavior.mo15588h0()) / 2;
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            int i3;
            int h0 = BottomSheetBehavior.this.mo15588h0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f15605H) {
                i3 = bottomSheetBehavior.f15617T;
            } else {
                i3 = bottomSheetBehavior.f15603F;
            }
            return C8720a.m32478b(i, h0, i3);
        }

        public int getViewVerticalDragRange(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f15605H) {
                return bottomSheetBehavior.f15617T;
            }
            return bottomSheetBehavior.f15603F;
        }

        public void onViewDragStateChanged(int i) {
            if (i == 1 && BottomSheetBehavior.this.f15607J) {
                BottomSheetBehavior.this.mo15580J0(1);
            }
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo15586d0(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
            if (r9 > r7.f15666d.f15601D) goto L_0x0124;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f15666d.mo15588h0()) < java.lang.Math.abs(r8.getTop() - r7.f15666d.f15601D)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c9, code lost:
            if (r7.f15666d.mo15583O0() == false) goto L_0x0124;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00eb, code lost:
            if (java.lang.Math.abs(r9 - r7.f15666d.f15600C) < java.lang.Math.abs(r9 - r7.f15666d.f15603F)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
            if (r7.f15666d.mo15583O0() != false) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0121, code lost:
            if (r7.f15666d.mo15583O0() == false) goto L_0x0124;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
            if (r10.mo15581L0(r0, (((float) r9) * 100.0f) / ((float) r10.f15617T)) != false) goto L_0x0010;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onViewReleased(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 6
                r3 = 3
                r4 = 4
                if (r1 >= 0) goto L_0x003f
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f15626b
                if (r9 == 0) goto L_0x0013
            L_0x0010:
                r2 = r3
                goto L_0x0124
            L_0x0013:
                int r9 = r8.getTop()
                long r0 = java.lang.System.currentTimeMillis()
                long r5 = r7.f15665c
                long r0 = r0 - r5
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.mo15583O0()
                if (r10 == 0) goto L_0x0037
                float r9 = (float) r9
                r10 = 1120403456(0x42c80000, float:100.0)
                float r9 = r9 * r10
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r2 = r10.f15617T
                float r2 = (float) r2
                float r9 = r9 / r2
                boolean r9 = r10.mo15581L0(r0, r9)
                if (r9 == 0) goto L_0x00a7
                goto L_0x0010
            L_0x0037:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f15601D
                if (r9 <= r10) goto L_0x0010
                goto L_0x0124
            L_0x003f:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r1.f15605H
                if (r5 == 0) goto L_0x008e
                boolean r1 = r1.mo15582N0(r8, r10)
                if (r1 == 0) goto L_0x008e
                float r9 = java.lang.Math.abs(r9)
                float r0 = java.lang.Math.abs(r10)
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x005d
                r9 = 1140457472(0x43fa0000, float:500.0)
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 > 0) goto L_0x0063
            L_0x005d:
                boolean r9 = r7.m18989a(r8)
                if (r9 == 0) goto L_0x0066
            L_0x0063:
                r2 = 5
                goto L_0x0124
            L_0x0066:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f15626b
                if (r9 == 0) goto L_0x006f
                goto L_0x0010
            L_0x006f:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.mo15588h0()
                int r9 = r9 - r10
                int r9 = java.lang.Math.abs(r9)
                int r10 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f15601D
                int r10 = r10 - r0
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x0124
                goto L_0x0010
            L_0x008e:
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00cc
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x009f
                goto L_0x00cc
            L_0x009f:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f15626b
                if (r9 == 0) goto L_0x00aa
            L_0x00a7:
                r2 = r4
                goto L_0x0124
            L_0x00aa:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f15601D
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f15603F
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00a7
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.mo15583O0()
                if (r9 == 0) goto L_0x0124
                goto L_0x00a7
            L_0x00cc:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f15626b
                if (r10 == 0) goto L_0x00ef
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f15600C
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f15603F
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00a7
                goto L_0x0010
            L_0x00ef:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r10.f15601D
                if (r9 >= r0) goto L_0x010a
                int r10 = r10.f15603F
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x0101
                goto L_0x0010
            L_0x0101:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.mo15583O0()
                if (r9 == 0) goto L_0x0124
                goto L_0x00a7
            L_0x010a:
                int r10 = r9 - r0
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f15603F
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00a7
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.mo15583O0()
                if (r9 == 0) goto L_0x0124
                goto L_0x00a7
            L_0x0124:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.mo15584P0()
                r9.m18918Q0(r8, r2, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C4951d.onViewReleased(android.view.View, float, float):void");
        }

        public boolean tryCaptureView(View view, int i) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f15608K;
            if (i2 == 1 || bottomSheetBehavior.f15625a0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f15622Y == i) {
                WeakReference weakReference = bottomSheetBehavior.f15619V;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f15665c = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f15618U;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    class C4952e implements AccessibilityViewCommand {

        /* renamed from: a */
        final /* synthetic */ int f15667a;

        C4952e(int i) {
            this.f15667a = i;
        }

        /* renamed from: a */
        public boolean mo3654a(View view, AccessibilityViewCommand.C1068a aVar) {
            BottomSheetBehavior.this.mo15579I0(this.f15667a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public static abstract class C4953f {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15608a(View view) {
        }

        /* renamed from: b */
        public abstract void mo15609b(View view, float f);

        /* renamed from: c */
        public abstract void mo15610c(View view, int i);
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: K0 */
    private void m18910K0(View view) {
        boolean z;
        if (Build.VERSION.SDK_INT < 29 || mo15592n0() || this.f15633f) {
            z = false;
        } else {
            z = true;
        }
        if (this.f15642o || this.f15643p || this.f15644q || this.f15646s || this.f15647t || this.f15648u || z) {
            C5089m.m19900a(view, new C4950c(z));
        }
    }

    /* renamed from: M0 */
    private boolean m18913M0() {
        return this.f15610M != null && (this.f15607J || this.f15608K == 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m18918Q0(View view, int i, boolean z) {
        boolean z2;
        int k0 = m18936k0(i);
        C0011d dVar = this.f15610M;
        if (dVar == null || (!z ? !dVar.mo42I(view, view.getLeft(), k0) : !dVar.mo40G(view.getLeft(), k0))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            mo15580J0(2);
            m18922S0(i);
            this.f15653z.mo15611c(i);
            return;
        }
        mo15580J0(i);
    }

    /* renamed from: R0 */
    private void m18920R0() {
        View view;
        WeakReference weakReference = this.f15618U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ViewCompat.m3607l0(view, 524288);
            ViewCompat.m3607l0(view, 262144);
            ViewCompat.m3607l0(view, 1048576);
            int i = this.f15629c0;
            if (i != -1) {
                ViewCompat.m3607l0(view, i);
            }
            int i2 = 6;
            if (!this.f15626b && this.f15608K != 6) {
                this.f15629c0 = m18927V(view, C0080j.f328a, 6);
            }
            if (this.f15605H && this.f15608K != 5) {
                m18939s0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3762y, 5);
            }
            int i3 = this.f15608K;
            if (i3 == 3) {
                if (this.f15626b) {
                    i2 = 4;
                }
                m18939s0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3761x, i2);
            } else if (i3 == 4) {
                if (this.f15626b) {
                    i2 = 3;
                }
                m18939s0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3760w, i2);
            } else if (i3 == 6) {
                m18939s0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3761x, 4);
                m18939s0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3760w, 3);
            }
        }
    }

    /* renamed from: S0 */
    private void m18922S0(int i) {
        boolean z;
        ValueAnimator valueAnimator;
        float f;
        if (i != 2) {
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            if (this.f15652y != z) {
                this.f15652y = z;
                if (this.f15636i != null && (valueAnimator = this.f15598A) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f15598A.reverse();
                        return;
                    }
                    if (z) {
                        f = Utils.FLOAT_EPSILON;
                    } else {
                        f = 1.0f;
                    }
                    this.f15598A.setFloatValues(new float[]{1.0f - f, f});
                    this.f15598A.start();
                }
            }
        }
    }

    /* renamed from: T0 */
    private void m18924T0(boolean z) {
        Map map;
        WeakReference weakReference = this.f15618U;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.f15627b0 == null) {
                        this.f15627b0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f15618U.get()) {
                        if (z) {
                            this.f15627b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f15628c) {
                                ViewCompat.m3544C0(childAt, 4);
                            }
                        } else if (this.f15628c && (map = this.f15627b0) != null && map.containsKey(childAt)) {
                            ViewCompat.m3544C0(childAt, ((Integer) this.f15627b0.get(childAt)).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f15627b0 = null;
                } else if (this.f15628c) {
                    ((View) this.f15618U.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public void m18926U0(boolean z) {
        View view;
        if (this.f15618U != null) {
            m18928X();
            if (this.f15608K == 4 && (view = (View) this.f15618U.get()) != null) {
                if (z) {
                    mo15579I0(4);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: V */
    private int m18927V(View view, int i, int i2) {
        return ViewCompat.m3588c(view, view.getResources().getString(i), m18931a0(i2));
    }

    /* renamed from: X */
    private void m18928X() {
        int Z = m18930Z();
        if (this.f15626b) {
            this.f15603F = Math.max(this.f15617T - Z, this.f15600C);
        } else {
            this.f15603F = this.f15617T - Z;
        }
    }

    /* renamed from: Y */
    private void m18929Y() {
        this.f15601D = (int) (((float) this.f15617T) * (1.0f - this.f15602E));
    }

    /* renamed from: Z */
    private int m18930Z() {
        int i;
        if (this.f15633f) {
            return Math.min(Math.max(this.f15634g, this.f15617T - ((this.f15616S * 9) / 16)), this.f15615R) + this.f15649v;
        }
        if (this.f15641n || this.f15642o || (i = this.f15640m) <= 0) {
            return this.f15632e + this.f15649v;
        }
        return Math.max(this.f15632e, i + this.f15635h);
    }

    /* renamed from: a0 */
    private AccessibilityViewCommand m18931a0(int i) {
        return new C4952e(i);
    }

    /* renamed from: b0 */
    private void m18932b0(Context context) {
        if (this.f15651x != null) {
            C7922g gVar = new C7922g(this.f15651x);
            this.f15636i = gVar;
            gVar.mo22934M(context);
            ColorStateList colorStateList = this.f15637j;
            if (colorStateList != null) {
                this.f15636i.mo22941X(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f15636i.setTint(typedValue.data);
        }
    }

    /* renamed from: c0 */
    private void m18933c0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        this.f15598A = ofFloat;
        ofFloat.setDuration(500);
        this.f15598A.addUpdateListener(new C4949b());
    }

    /* renamed from: f0 */
    public static BottomSheetBehavior m18934f0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0647f) {
            CoordinatorLayout.C0644c f = ((CoordinatorLayout.C0647f) layoutParams).mo3069f();
            if (f instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: g0 */
    private int m18935g0(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* renamed from: k0 */
    private int m18936k0(int i) {
        if (i == 3) {
            return mo15588h0();
        }
        if (i == 4) {
            return this.f15603F;
        }
        if (i == 5) {
            return this.f15617T;
        }
        if (i == 6) {
            return this.f15601D;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    /* renamed from: l0 */
    private float m18937l0() {
        VelocityTracker velocityTracker = this.f15621X;
        if (velocityTracker == null) {
            return Utils.FLOAT_EPSILON;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f15630d);
        return this.f15621X.getYVelocity(this.f15622Y);
    }

    /* renamed from: p0 */
    private boolean m18938p0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || !parent.isLayoutRequested() || !ViewCompat.m3578U(view)) {
            return false;
        }
        return true;
    }

    /* renamed from: s0 */
    private void m18939s0(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i) {
        ViewCompat.m3611n0(view, accessibilityActionCompat, (CharSequence) null, m18931a0(i));
    }

    /* renamed from: t0 */
    private void m18940t0() {
        this.f15622Y = -1;
        VelocityTracker velocityTracker = this.f15621X;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f15621X = null;
        }
    }

    /* renamed from: u0 */
    private void m18941u0(SavedState savedState) {
        int i = this.f15624a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f15632e = savedState.f15655g;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f15626b = savedState.f15656h;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f15605H = savedState.f15657i;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f15606I = savedState.f15658j;
            }
        }
    }

    /* renamed from: v0 */
    private void m18942v0(View view, Runnable runnable) {
        if (m18938p0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: A */
    public boolean mo3031A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.f15612O = 0;
        this.f15613P = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public void mo15571A0(float f) {
        if (f <= Utils.FLOAT_EPSILON || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f15602E = f;
        if (this.f15618U != null) {
            m18929Y();
        }
    }

    /* renamed from: B0 */
    public void mo15572B0(boolean z) {
        if (this.f15605H != z) {
            this.f15605H = z;
            if (!z && this.f15608K == 5) {
                mo15579I0(4);
            }
            m18920R0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r4.getTop() <= r2.f15601D) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.f15600C) < java.lang.Math.abs(r3 - r2.f15603F)) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (mo15583O0() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f15603F)) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.f15601D) < java.lang.Math.abs(r3 - r2.f15603F)) goto L_0x00a9;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3033C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.mo15588h0()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.mo15580J0(r0)
            return
        L_0x000f:
            boolean r3 = r2.mo15594q0()
            if (r3 == 0) goto L_0x0024
            java.lang.ref.WeakReference r3 = r2.f15619V
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x0023
            boolean r3 = r2.f15613P
            if (r3 != 0) goto L_0x0024
        L_0x0023:
            return
        L_0x0024:
            int r3 = r2.f15612O
            r5 = 6
            if (r3 <= 0) goto L_0x0039
            boolean r3 = r2.f15626b
            if (r3 == 0) goto L_0x002f
            goto L_0x00aa
        L_0x002f:
            int r3 = r4.getTop()
            int r6 = r2.f15601D
            if (r3 <= r6) goto L_0x00aa
            goto L_0x00a9
        L_0x0039:
            boolean r3 = r2.f15605H
            if (r3 == 0) goto L_0x0049
            float r3 = r2.m18937l0()
            boolean r3 = r2.mo15582N0(r4, r3)
            if (r3 == 0) goto L_0x0049
            r0 = 5
            goto L_0x00aa
        L_0x0049:
            int r3 = r2.f15612O
            r6 = 4
            if (r3 != 0) goto L_0x008e
            int r3 = r4.getTop()
            boolean r1 = r2.f15626b
            if (r1 == 0) goto L_0x0068
            int r5 = r2.f15600C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f15603F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0092
            goto L_0x00aa
        L_0x0068:
            int r1 = r2.f15601D
            if (r3 >= r1) goto L_0x007e
            int r1 = r2.f15603F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L_0x0077
            goto L_0x00aa
        L_0x0077:
            boolean r3 = r2.mo15583O0()
            if (r3 == 0) goto L_0x00a9
            goto L_0x0092
        L_0x007e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f15603F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
            goto L_0x00a9
        L_0x008e:
            boolean r3 = r2.f15626b
            if (r3 == 0) goto L_0x0094
        L_0x0092:
            r0 = r6
            goto L_0x00aa
        L_0x0094:
            int r3 = r4.getTop()
            int r0 = r2.f15601D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f15603F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
        L_0x00a9:
            r0 = r5
        L_0x00aa:
            r3 = 0
            r2.m18918Q0(r4, r0, r3)
            r2.f15613P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3033C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: C0 */
    public void mo15573C0(int i) {
        this.f15639l = i;
    }

    /* renamed from: D */
    public boolean mo3034D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f15608K == 1 && actionMasked == 0) {
            return true;
        }
        if (m18913M0()) {
            this.f15610M.mo38A(motionEvent);
        }
        if (actionMasked == 0) {
            m18940t0();
        }
        if (this.f15621X == null) {
            this.f15621X = VelocityTracker.obtain();
        }
        this.f15621X.addMovement(motionEvent);
        if (m18913M0() && actionMasked == 2 && !this.f15611N && Math.abs(((float) this.f15623Z) - motionEvent.getY()) > ((float) this.f15610M.mo49v())) {
            this.f15610M.mo45b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f15611N;
    }

    /* renamed from: D0 */
    public void mo15574D0(int i) {
        this.f15638k = i;
    }

    /* renamed from: E0 */
    public void mo15575E0(int i) {
        mo15576F0(i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15576F0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r4 != r0) goto L_0x000c
            boolean r4 = r3.f15633f
            if (r4 != 0) goto L_0x0015
            r3.f15633f = r1
            goto L_0x001f
        L_0x000c:
            boolean r0 = r3.f15633f
            if (r0 != 0) goto L_0x0017
            int r0 = r3.f15632e
            if (r0 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = r2
            goto L_0x001f
        L_0x0017:
            r3.f15633f = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f15632e = r4
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r3.m18926U0(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo15576F0(int, boolean):void");
    }

    /* renamed from: G0 */
    public void mo15577G0(int i) {
        this.f15624a = i;
    }

    /* renamed from: H0 */
    public void mo15578H0(boolean z) {
        this.f15606I = z;
    }

    /* renamed from: I0 */
    public void mo15579I0(int i) {
        String str;
        int i2;
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            if (i == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            sb.append(str);
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f15605H || i != 5) {
            if (i != 6 || !this.f15626b || m18936k0(i) > this.f15600C) {
                i2 = i;
            } else {
                i2 = 3;
            }
            WeakReference weakReference = this.f15618U;
            if (weakReference == null || weakReference.get() == null) {
                mo15580J0(i);
                return;
            }
            View view = (View) this.f15618U.get();
            m18942v0(view, new C4948a(view, i2));
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void mo15580J0(int i) {
        View view;
        if (this.f15608K != i) {
            this.f15608K = i;
            if (i == 4 || i == 3 || i == 6 || (this.f15605H && i == 5)) {
                this.f15609L = i;
            }
            WeakReference weakReference = this.f15618U;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    m18924T0(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m18924T0(false);
                }
                m18922S0(i);
                for (int i2 = 0; i2 < this.f15620W.size(); i2++) {
                    ((C4953f) this.f15620W.get(i2)).mo15610c(view, i);
                }
                m18920R0();
            }
        }
    }

    /* renamed from: L0 */
    public boolean mo15581L0(long j, float f) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public boolean mo15582N0(View view, float f) {
        if (this.f15606I) {
            return true;
        }
        if (view.getTop() < this.f15603F) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * this.f15614Q)) - ((float) this.f15603F)) / ((float) m18930Z()) > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: O0 */
    public boolean mo15583O0() {
        return false;
    }

    /* renamed from: P0 */
    public boolean mo15584P0() {
        return true;
    }

    /* renamed from: W */
    public void mo15585W(C4953f fVar) {
        if (!this.f15620W.contains(fVar)) {
            this.f15620W.add(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo15586d0(int i) {
        float f;
        float f2;
        View view = (View) this.f15618U.get();
        if (view != null && !this.f15620W.isEmpty()) {
            int i2 = this.f15603F;
            if (i > i2 || i2 == mo15588h0()) {
                int i3 = this.f15603F;
                f = (float) (i3 - i);
                f2 = (float) (this.f15617T - i3);
            } else {
                int i4 = this.f15603F;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo15588h0());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f15620W.size(); i5++) {
                ((C4953f) this.f15620W.get(i5)).mo15609b(view, f3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public View mo15587e0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.m3580W(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View e0 = mo15587e0(viewGroup.getChildAt(i));
                if (e0 != null) {
                    return e0;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public void mo3041g(CoordinatorLayout.C0647f fVar) {
        super.mo3041g(fVar);
        this.f15618U = null;
        this.f15610M = null;
    }

    /* renamed from: h0 */
    public int mo15588h0() {
        int i;
        if (this.f15626b) {
            return this.f15600C;
        }
        int i2 = this.f15599B;
        if (this.f15645r) {
            i = 0;
        } else {
            i = this.f15650w;
        }
        return Math.max(i2, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public C7922g mo15589i0() {
        return this.f15636i;
    }

    /* renamed from: j */
    public void mo3044j() {
        super.mo3044j();
        this.f15618U = null;
        this.f15610M = null;
    }

    /* renamed from: j0 */
    public int mo15590j0() {
        return this.f15608K;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3045k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r9.f15607J
            if (r0 != 0) goto L_0x000e
            goto L_0x00d2
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.m18940t0()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.f15621X
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f15621X = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.f15621X
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.f15625a0 = r1
            r9.f15622Y = r4
            boolean r11 = r9.f15611N
            if (r11 == 0) goto L_0x007f
            r9.f15611N = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f15623Z = r7
            int r7 = r9.f15608K
            if (r7 == r5) goto L_0x006e
            java.lang.ref.WeakReference r7 = r9.f15619V
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.f15623Z
            boolean r7 = r10.mo3022v(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f15622Y = r7
            r9.f15625a0 = r2
        L_0x006e:
            int r7 = r9.f15622Y
            if (r7 != r4) goto L_0x007c
            int r4 = r9.f15623Z
            boolean r11 = r10.mo3022v(r11, r6, r4)
            if (r11 != 0) goto L_0x007c
            r11 = r2
            goto L_0x007d
        L_0x007c:
            r11 = r1
        L_0x007d:
            r9.f15611N = r11
        L_0x007f:
            boolean r11 = r9.f15611N
            if (r11 != 0) goto L_0x008e
            a0.d r11 = r9.f15610M
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.mo41H(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference r11 = r9.f15619V
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r5) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r11 = r9.f15611N
            if (r11 != 0) goto L_0x00d1
            int r11 = r9.f15608K
            if (r11 == r2) goto L_0x00d1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.mo3022v(r3, r11, r0)
            if (r10 != 0) goto L_0x00d1
            a0.d r10 = r9.f15610M
            if (r10 == 0) goto L_0x00d1
            int r10 = r9.f15623Z
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            a0.d r11 = r9.f15610M
            int r11 = r11.mo49v()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d1
            r1 = r2
        L_0x00d1:
            return r1
        L_0x00d2:
            r9.f15611N = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3045k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: l */
    public boolean mo3046l(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean z;
        float f;
        if (ViewCompat.m3632y(coordinatorLayout) && !ViewCompat.m3632y(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f15618U == null) {
            this.f15634g = coordinatorLayout.getResources().getDimensionPixelSize(C0074d.f208h);
            m18910K0(view);
            this.f15618U = new WeakReference(view);
            C7922g gVar = this.f15636i;
            if (gVar != null) {
                ViewCompat.m3627v0(view, gVar);
                C7922g gVar2 = this.f15636i;
                float f2 = this.f15604G;
                if (f2 == -1.0f) {
                    f2 = ViewCompat.m3628w(view);
                }
                gVar2.mo22940W(f2);
                if (this.f15608K == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.f15652y = z;
                C7922g gVar3 = this.f15636i;
                if (z) {
                    f = Utils.FLOAT_EPSILON;
                } else {
                    f = 1.0f;
                }
                gVar3.mo22942Y(f);
            } else {
                ColorStateList colorStateList = this.f15637j;
                if (colorStateList != null) {
                    ViewCompat.m3629w0(view, colorStateList);
                }
            }
            m18920R0();
            if (ViewCompat.m3634z(view) == 0) {
                ViewCompat.m3544C0(view, 1);
            }
        }
        if (this.f15610M == null) {
            this.f15610M = C0011d.m81m(coordinatorLayout, this.f15631d0);
        }
        int top = view.getTop();
        coordinatorLayout.mo2968C(view, i);
        this.f15616S = coordinatorLayout.getWidth();
        this.f15617T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f15615R = height;
        int i2 = this.f15617T;
        int i3 = i2 - height;
        int i4 = this.f15650w;
        if (i3 < i4) {
            if (this.f15645r) {
                this.f15615R = i2;
            } else {
                this.f15615R = i2 - i4;
            }
        }
        this.f15600C = Math.max(0, i2 - this.f15615R);
        m18929Y();
        m18928X();
        int i5 = this.f15608K;
        if (i5 == 3) {
            ViewCompat.m3589c0(view, mo15588h0());
        } else if (i5 == 6) {
            ViewCompat.m3589c0(view, this.f15601D);
        } else if (this.f15605H && i5 == 5) {
            ViewCompat.m3589c0(view, this.f15617T);
        } else if (i5 == 4) {
            ViewCompat.m3589c0(view, this.f15603F);
        } else if (i5 == 1 || i5 == 2) {
            ViewCompat.m3589c0(view, top - view.getTop());
        }
        this.f15619V = new WeakReference(mo15587e0(view));
        for (int i6 = 0; i6 < this.f15620W.size(); i6++) {
            ((C4953f) this.f15620W.get(i6)).mo15608a(view);
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo3047m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m18935g0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f15638k, marginLayoutParams.width), m18935g0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f15639l, marginLayoutParams.height));
        return true;
    }

    /* renamed from: m0 */
    public boolean mo15591m0() {
        return this.f15607J;
    }

    /* renamed from: n0 */
    public boolean mo15592n0() {
        return this.f15641n;
    }

    /* renamed from: o */
    public boolean mo3049o(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        WeakReference weakReference;
        if (!mo15594q0() || (weakReference = this.f15619V) == null || view2 != weakReference.get()) {
            return false;
        }
        if (this.f15608K != 3 || super.mo3049o(coordinatorLayout, view, view2, f, f2)) {
            return true;
        }
        return false;
    }

    /* renamed from: o0 */
    public boolean mo15593o0() {
        return this.f15605H;
    }

    /* renamed from: q */
    public void mo3051q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        View view3;
        if (i3 != 1) {
            WeakReference weakReference = this.f15619V;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (!mo15594q0() || view2 == view3) {
                int top = view.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < mo15588h0()) {
                        int h0 = top - mo15588h0();
                        iArr[1] = h0;
                        ViewCompat.m3589c0(view, -h0);
                        mo15580J0(3);
                    } else if (this.f15607J) {
                        iArr[1] = i2;
                        ViewCompat.m3589c0(view, -i2);
                        mo15580J0(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                    int i5 = this.f15603F;
                    if (i4 > i5 && !this.f15605H) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        ViewCompat.m3589c0(view, -i6);
                        mo15580J0(4);
                    } else if (this.f15607J) {
                        iArr[1] = i2;
                        ViewCompat.m3589c0(view, -i2);
                        mo15580J0(1);
                    } else {
                        return;
                    }
                }
                mo15586d0(view.getTop());
                this.f15612O = i2;
                this.f15613P = true;
            }
        }
    }

    /* renamed from: q0 */
    public boolean mo15594q0() {
        return true;
    }

    /* renamed from: r0 */
    public void mo15595r0(C4953f fVar) {
        this.f15620W.remove(fVar);
    }

    /* renamed from: t */
    public void mo3054t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: w0 */
    public void mo15596w0(boolean z) {
        this.f15607J = z;
    }

    /* renamed from: x */
    public void mo3058x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo3058x(coordinatorLayout, view, savedState.mo3880a());
        m18941u0(savedState);
        int i = savedState.f15654f;
        if (i == 1 || i == 2) {
            this.f15608K = 4;
            this.f15609L = 4;
            return;
        }
        this.f15608K = i;
        this.f15609L = i;
    }

    /* renamed from: x0 */
    public void mo15597x0(int i) {
        if (i >= 0) {
            this.f15599B = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: y */
    public Parcelable mo3059y(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.mo3059y(coordinatorLayout, view), this);
    }

    /* renamed from: y0 */
    public void mo15598y0(boolean z) {
        int i;
        if (this.f15626b != z) {
            this.f15626b = z;
            if (this.f15618U != null) {
                m18928X();
            }
            if (!this.f15626b || this.f15608K != 6) {
                i = this.f15608K;
            } else {
                i = 3;
            }
            mo15580J0(i);
            m18920R0();
        }
    }

    /* renamed from: z0 */
    public void mo15599z0(boolean z) {
        this.f15641n = z;
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    private class C4954g {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f15669a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f15670b;

        /* renamed from: c */
        private final Runnable f15671c;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g$a */
        class C4955a implements Runnable {
            C4955a() {
            }

            public void run() {
                boolean unused = C4954g.this.f15670b = false;
                C0011d dVar = BottomSheetBehavior.this.f15610M;
                if (dVar == null || !dVar.mo46k(true)) {
                    C4954g gVar = C4954g.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.f15608K == 2) {
                        bottomSheetBehavior.mo15580J0(gVar.f15669a);
                        return;
                    }
                    return;
                }
                C4954g gVar2 = C4954g.this;
                gVar2.mo15611c(gVar2.f15669a);
            }
        }

        private C4954g() {
            this.f15671c = new C4955a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo15611c(int i) {
            WeakReference weakReference = BottomSheetBehavior.this.f15618U;
            if (weakReference != null && weakReference.get() != null) {
                this.f15669a = i;
                if (!this.f15670b) {
                    ViewCompat.m3603j0((View) BottomSheetBehavior.this.f15618U.get(), this.f15671c);
                    this.f15670b = true;
                }
            }
        }

        /* synthetic */ C4954g(BottomSheetBehavior bottomSheetBehavior, C4948a aVar) {
            this();
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4947a();

        /* renamed from: f */
        final int f15654f;

        /* renamed from: g */
        int f15655g;

        /* renamed from: h */
        boolean f15656h;

        /* renamed from: i */
        boolean f15657i;

        /* renamed from: j */
        boolean f15658j;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        class C4947a implements Parcelable.ClassLoaderCreator {
            C4947a() {
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
            this.f15654f = parcel.readInt();
            this.f15655g = parcel.readInt();
            boolean z = false;
            this.f15656h = parcel.readInt() == 1;
            this.f15657i = parcel.readInt() == 1;
            this.f15658j = parcel.readInt() == 1 ? true : z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f15654f);
            parcel.writeInt(this.f15655g);
            parcel.writeInt(this.f15656h ? 1 : 0);
            parcel.writeInt(this.f15657i ? 1 : 0);
            parcel.writeInt(this.f15658j ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f15654f = bottomSheetBehavior.f15608K;
            this.f15655g = bottomSheetBehavior.f15632e;
            this.f15656h = bottomSheetBehavior.f15626b;
            this.f15657i = bottomSheetBehavior.f15605H;
            this.f15658j = bottomSheetBehavior.f15606I;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f15635h = context.getResources().getDimensionPixelSize(C0074d.f199b0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0082l.f673e0);
        int i2 = C0082l.f713i0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f15637j = C7343c.m28003a(context, obtainStyledAttributes, i2);
        }
        if (obtainStyledAttributes.hasValue(C0082l.f883z0)) {
            this.f15651x = C7929k.m29978e(context, attributeSet, C0072b.f148g, f15597e0).mo22998m();
        }
        m18932b0(context);
        m18933c0();
        this.f15604G = obtainStyledAttributes.getDimension(C0082l.f703h0, -1.0f);
        int i3 = C0082l.f683f0;
        if (obtainStyledAttributes.hasValue(i3)) {
            mo15574D0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = C0082l.f693g0;
        if (obtainStyledAttributes.hasValue(i4)) {
            mo15573C0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = C0082l.f773o0;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i5);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo15575E0(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        } else {
            mo15575E0(i);
        }
        mo15572B0(obtainStyledAttributes.getBoolean(C0082l.f763n0, false));
        mo15599z0(obtainStyledAttributes.getBoolean(C0082l.f803r0, false));
        mo15598y0(obtainStyledAttributes.getBoolean(C0082l.f743l0, true));
        mo15578H0(obtainStyledAttributes.getBoolean(C0082l.f793q0, false));
        mo15596w0(obtainStyledAttributes.getBoolean(C0082l.f723j0, true));
        mo15577G0(obtainStyledAttributes.getInt(C0082l.f783p0, 0));
        mo15571A0(obtainStyledAttributes.getFloat(C0082l.f753m0, 0.5f));
        int i6 = C0082l.f733k0;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i6);
        if (peekValue2 == null || peekValue2.type != 16) {
            mo15597x0(obtainStyledAttributes.getDimensionPixelOffset(i6, 0));
        } else {
            mo15597x0(peekValue2.data);
        }
        this.f15642o = obtainStyledAttributes.getBoolean(C0082l.f843v0, false);
        this.f15643p = obtainStyledAttributes.getBoolean(C0082l.f853w0, false);
        this.f15644q = obtainStyledAttributes.getBoolean(C0082l.f863x0, false);
        this.f15645r = obtainStyledAttributes.getBoolean(C0082l.f873y0, true);
        this.f15646s = obtainStyledAttributes.getBoolean(C0082l.f813s0, false);
        this.f15647t = obtainStyledAttributes.getBoolean(C0082l.f823t0, false);
        this.f15648u = obtainStyledAttributes.getBoolean(C0082l.f833u0, false);
        obtainStyledAttributes.recycle();
        this.f15630d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
