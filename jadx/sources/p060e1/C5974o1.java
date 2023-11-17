package p060e1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.C0820l;
import p060e1.C5936i0;

/* renamed from: e1.o1 */
public abstract class C5974o1 extends C5936i0 {

    /* renamed from: N */
    private static final String[] f18675N = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: M */
    private int f18676M = 3;

    /* renamed from: e1.o1$a */
    class C5975a extends C5955k0 {

        /* renamed from: d */
        final /* synthetic */ ViewGroup f18677d;

        /* renamed from: e */
        final /* synthetic */ View f18678e;

        /* renamed from: f */
        final /* synthetic */ View f18679f;

        C5975a(ViewGroup viewGroup, View view, View view2) {
            this.f18677d = viewGroup;
            this.f18678e = view;
            this.f18679f = view2;
        }

        /* renamed from: b */
        public void mo19293b(C5936i0 i0Var) {
            if (this.f18678e.getParent() == null) {
                C6008x0.m24107b(this.f18677d).mo19451c(this.f18678e);
            } else {
                C5974o1.this.cancel();
            }
        }

        /* renamed from: c */
        public void mo19294c(C5936i0 i0Var) {
            this.f18679f.setTag(C5894c0.f18491d, (Object) null);
            C6008x0.m24107b(this.f18677d).mo19452d(this.f18678e);
            i0Var.mo19343k0(this);
        }

        /* renamed from: e */
        public void mo19295e(C5936i0 i0Var) {
            C6008x0.m24107b(this.f18677d).mo19452d(this.f18678e);
        }
    }

    /* renamed from: e1.o1$b */
    private static class C5976b extends AnimatorListenerAdapter implements C5936i0.C5943g {

        /* renamed from: d */
        private final View f18681d;

        /* renamed from: e */
        private final int f18682e;

        /* renamed from: f */
        private final ViewGroup f18683f;

        /* renamed from: g */
        private final boolean f18684g;

        /* renamed from: h */
        private boolean f18685h;

        /* renamed from: i */
        boolean f18686i = false;

        C5976b(View view, int i, boolean z) {
            this.f18681d = view;
            this.f18682e = i;
            this.f18683f = (ViewGroup) view.getParent();
            this.f18684g = z;
            m24016g(true);
        }

        /* renamed from: f */
        private void m24015f() {
            if (!this.f18686i) {
                C5887a1.m23692i(this.f18681d, this.f18682e);
                ViewGroup viewGroup = this.f18683f;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m24016g(false);
        }

        /* renamed from: g */
        private void m24016g(boolean z) {
            ViewGroup viewGroup;
            if (this.f18684g && this.f18685h != z && (viewGroup = this.f18683f) != null) {
                this.f18685h = z;
                C6008x0.m24109d(viewGroup, z);
            }
        }

        /* renamed from: a */
        public void mo19292a(C5936i0 i0Var) {
        }

        /* renamed from: b */
        public void mo19293b(C5936i0 i0Var) {
            m24016g(true);
        }

        /* renamed from: c */
        public void mo19294c(C5936i0 i0Var) {
            m24015f();
            i0Var.mo19343k0(this);
        }

        /* renamed from: d */
        public void mo19368d(C5936i0 i0Var) {
        }

        /* renamed from: e */
        public void mo19295e(C5936i0 i0Var) {
            m24016g(false);
        }

        public void onAnimationCancel(Animator animator) {
            this.f18686i = true;
        }

        public void onAnimationEnd(Animator animator) {
            m24015f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f18686i) {
                C5887a1.m23692i(this.f18681d, this.f18682e);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f18686i) {
                C5887a1.m23692i(this.f18681d, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: e1.o1$c */
    private static class C5977c {

        /* renamed from: a */
        boolean f18687a;

        /* renamed from: b */
        boolean f18688b;

        /* renamed from: c */
        int f18689c;

        /* renamed from: d */
        int f18690d;

        /* renamed from: e */
        ViewGroup f18691e;

        /* renamed from: f */
        ViewGroup f18692f;

        C5977c() {
        }
    }

    public C5974o1() {
    }

    /* renamed from: A0 */
    private void m23999A0(C5989q0 q0Var) {
        q0Var.f18718a.put("android:visibility:visibility", Integer.valueOf(q0Var.f18719b.getVisibility()));
        q0Var.f18718a.put("android:visibility:parent", q0Var.f18719b.getParent());
        int[] iArr = new int[2];
        q0Var.f18719b.getLocationOnScreen(iArr);
        q0Var.f18718a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: C0 */
    private C5977c m24000C0(C5989q0 q0Var, C5989q0 q0Var2) {
        C5977c cVar = new C5977c();
        cVar.f18687a = false;
        cVar.f18688b = false;
        if (q0Var == null || !q0Var.f18718a.containsKey("android:visibility:visibility")) {
            cVar.f18689c = -1;
            cVar.f18691e = null;
        } else {
            cVar.f18689c = ((Integer) q0Var.f18718a.get("android:visibility:visibility")).intValue();
            cVar.f18691e = (ViewGroup) q0Var.f18718a.get("android:visibility:parent");
        }
        if (q0Var2 == null || !q0Var2.f18718a.containsKey("android:visibility:visibility")) {
            cVar.f18690d = -1;
            cVar.f18692f = null;
        } else {
            cVar.f18690d = ((Integer) q0Var2.f18718a.get("android:visibility:visibility")).intValue();
            cVar.f18692f = (ViewGroup) q0Var2.f18718a.get("android:visibility:parent");
        }
        if (q0Var != null && q0Var2 != null) {
            int i = cVar.f18689c;
            int i2 = cVar.f18690d;
            if (i == i2 && cVar.f18691e == cVar.f18692f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.f18688b = false;
                    cVar.f18687a = true;
                } else if (i2 == 0) {
                    cVar.f18688b = true;
                    cVar.f18687a = true;
                }
            } else if (cVar.f18692f == null) {
                cVar.f18688b = false;
                cVar.f18687a = true;
            } else if (cVar.f18691e == null) {
                cVar.f18688b = true;
                cVar.f18687a = true;
            }
        } else if (q0Var == null && cVar.f18690d == 0) {
            cVar.f18688b = true;
            cVar.f18687a = true;
        } else if (q0Var2 == null && cVar.f18689c == 0) {
            cVar.f18688b = false;
            cVar.f18687a = true;
        }
        return cVar;
    }

    /* renamed from: B0 */
    public int mo19413B0() {
        return this.f18676M;
    }

    /* renamed from: D0 */
    public abstract Animator mo19298D0(ViewGroup viewGroup, View view, C5989q0 q0Var, C5989q0 q0Var2);

    /* renamed from: E0 */
    public Animator mo19414E0(ViewGroup viewGroup, C5989q0 q0Var, int i, C5989q0 q0Var2, int i2) {
        if ((this.f18676M & 1) != 1 || q0Var2 == null) {
            return null;
        }
        if (q0Var == null) {
            View view = (View) q0Var2.f18719b.getParent();
            if (m24000C0(mo19321K(view, false), mo19330W(view, false)).f18687a) {
                return null;
            }
        }
        return mo19298D0(viewGroup, q0Var2.f18719b, q0Var, q0Var2);
    }

    /* renamed from: F0 */
    public abstract Animator mo19299F0(ViewGroup viewGroup, View view, C5989q0 q0Var, C5989q0 q0Var2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f18603y != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo19415G0(android.view.ViewGroup r18, p060e1.C5989q0 r19, int r20, p060e1.C5989q0 r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.f18676M
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f18719b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f18719b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = p060e1.C5894c0.f18491d
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = r12
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = r11
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = r11
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = r12
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            e1.q0 r14 = r0.mo19330W(r13, r12)
            e1.q0 r15 = r0.mo19321K(r13, r12)
            e1.o1$c r14 = r0.m24000C0(r14, r15)
            boolean r14 = r14.f18687a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = p060e1.C5985p0.m24054a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f18603y
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = r11
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = r11
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map r4 = r2.f18718a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            e1.u0 r4 = p060e1.C6008x0.m24107b(r18)
            r4.mo19451c(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.mo19299F0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            e1.u0 r1 = p060e1.C6008x0.m24107b(r18)
            r1.mo19452d(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            e1.o1$a r3 = new e1.o1$a
            r3.<init>(r1, r10, r5)
            r0.mo19333a(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            p060e1.C5887a1.m23692i(r8, r11)
            android.animation.Animator r1 = r0.mo19299F0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            e1.o1$b r2 = new e1.o1$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            p060e1.C5885a.m23678a(r1, r2)
            r0.mo19333a(r2)
            goto L_0x0106
        L_0x0103:
            p060e1.C5887a1.m23692i(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p060e1.C5974o1.mo19415G0(android.view.ViewGroup, e1.q0, int, e1.q0, int):android.animation.Animator");
    }

    /* renamed from: H0 */
    public void mo19416H0(int i) {
        if ((i & -4) == 0) {
            this.f18676M = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: V */
    public String[] mo19264V() {
        return f18675N;
    }

    /* renamed from: X */
    public boolean mo19331X(C5989q0 q0Var, C5989q0 q0Var2) {
        if (q0Var == null && q0Var2 == null) {
            return false;
        }
        if (q0Var != null && q0Var2 != null && q0Var2.f18718a.containsKey("android:visibility:visibility") != q0Var.f18718a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C5977c C0 = m24000C0(q0Var, q0Var2);
        if (!C0.f18687a) {
            return false;
        }
        if (C0.f18689c == 0 || C0.f18690d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void mo16526k(C5989q0 q0Var) {
        m23999A0(q0Var);
    }

    /* renamed from: n */
    public void mo16527n(C5989q0 q0Var) {
        m23999A0(q0Var);
    }

    /* renamed from: r */
    public Animator mo16528r(ViewGroup viewGroup, C5989q0 q0Var, C5989q0 q0Var2) {
        C5977c C0 = m24000C0(q0Var, q0Var2);
        if (!C0.f18687a) {
            return null;
        }
        if (C0.f18691e == null && C0.f18692f == null) {
            return null;
        }
        if (C0.f18688b) {
            return mo19414E0(viewGroup, q0Var, C0.f18689c, q0Var2, C0.f18690d);
        }
        return mo19415G0(viewGroup, q0Var, C0.f18689c, q0Var2, C0.f18690d);
    }

    public C5974o1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5930h0.f18556e);
        int k = C0820l.m3068k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k != 0) {
            mo19416H0(k);
        }
    }
}
