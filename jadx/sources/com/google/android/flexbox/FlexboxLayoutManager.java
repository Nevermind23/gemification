package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.C1817m;
import androidx.recyclerview.widget.C1824r;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.flexbox.C3789c;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.C1747p implements C3787a, RecyclerView.C1722a0.C1724b {

    /* renamed from: V */
    private static final Rect f11873V = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f11874A;

    /* renamed from: B */
    private boolean f11875B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public List f11876C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final C3789c f11877D;

    /* renamed from: E */
    private RecyclerView.C1759w f11878E;

    /* renamed from: F */
    private RecyclerView.C1726b0 f11879F;

    /* renamed from: G */
    private C3786c f11880G;

    /* renamed from: H */
    private C3785b f11881H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C1824r f11882I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C1824r f11883J;

    /* renamed from: K */
    private SavedState f11884K;

    /* renamed from: L */
    private int f11885L;

    /* renamed from: M */
    private int f11886M;

    /* renamed from: N */
    private int f11887N;

    /* renamed from: O */
    private int f11888O;

    /* renamed from: P */
    private boolean f11889P;

    /* renamed from: Q */
    private SparseArray f11890Q;

    /* renamed from: R */
    private final Context f11891R;

    /* renamed from: S */
    private View f11892S;

    /* renamed from: T */
    private int f11893T;

    /* renamed from: U */
    private C3789c.C3791b f11894U;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f11895v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f11896w;

    /* renamed from: x */
    private int f11897x;

    /* renamed from: y */
    private int f11898y;

    /* renamed from: z */
    private int f11899z;

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    private class C3785b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f11911a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f11912b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f11913c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f11914d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f11915e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f11916f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f11917g;

        private C3785b() {
            this.f11914d = 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public void m14185q() {
            int i;
            int i2;
            if (FlexboxLayoutManager.this.mo11485k() || !FlexboxLayoutManager.this.f11874A) {
                if (this.f11915e) {
                    i = FlexboxLayoutManager.this.f11882I.mo6039i();
                } else {
                    i = FlexboxLayoutManager.this.f11882I.mo6044n();
                }
                this.f11913c = i;
                return;
            }
            if (this.f11915e) {
                i2 = FlexboxLayoutManager.this.f11882I.mo6039i();
            } else {
                i2 = FlexboxLayoutManager.this.mo5716x0() - FlexboxLayoutManager.this.f11882I.mo6044n();
            }
            this.f11913c = i2;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public void m14186r(View view) {
            C1824r rVar;
            if (FlexboxLayoutManager.this.f11896w == 0) {
                rVar = FlexboxLayoutManager.this.f11883J;
            } else {
                rVar = FlexboxLayoutManager.this.f11882I;
            }
            if (FlexboxLayoutManager.this.mo11485k() || !FlexboxLayoutManager.this.f11874A) {
                if (this.f11915e) {
                    this.f11913c = rVar.mo6034d(view) + rVar.mo6046p();
                } else {
                    this.f11913c = rVar.mo6037g(view);
                }
            } else if (this.f11915e) {
                this.f11913c = rVar.mo6037g(view) + rVar.mo6046p();
            } else {
                this.f11913c = rVar.mo6034d(view);
            }
            this.f11911a = FlexboxLayoutManager.this.mo5700q0(view);
            int i = 0;
            this.f11917g = false;
            int[] iArr = FlexboxLayoutManager.this.f11877D.f11949c;
            int i2 = this.f11911a;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = iArr[i2];
            if (i3 != -1) {
                i = i3;
            }
            this.f11912b = i;
            if (FlexboxLayoutManager.this.f11876C.size() > this.f11912b) {
                this.f11911a = ((C3788b) FlexboxLayoutManager.this.f11876C.get(this.f11912b)).f11943o;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m14187s() {
            this.f11911a = -1;
            this.f11912b = -1;
            this.f11913c = Integer.MIN_VALUE;
            boolean z = false;
            this.f11916f = false;
            this.f11917g = false;
            if (FlexboxLayoutManager.this.mo11485k()) {
                if (FlexboxLayoutManager.this.f11896w == 0) {
                    if (FlexboxLayoutManager.this.f11895v == 1) {
                        z = true;
                    }
                    this.f11915e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.f11896w == 2) {
                    z = true;
                }
                this.f11915e = z;
            } else if (FlexboxLayoutManager.this.f11896w == 0) {
                if (FlexboxLayoutManager.this.f11895v == 3) {
                    z = true;
                }
                this.f11915e = z;
            } else {
                if (FlexboxLayoutManager.this.f11896w == 2) {
                    z = true;
                }
                this.f11915e = z;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f11911a + ", mFlexLinePosition=" + this.f11912b + ", mCoordinate=" + this.f11913c + ", mPerpendicularCoordinate=" + this.f11914d + ", mLayoutFromEnd=" + this.f11915e + ", mValid=" + this.f11916f + ", mAssignedFromSavedState=" + this.f11917g + '}';
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c */
    private static class C3786c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f11919a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f11920b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f11921c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f11922d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f11923e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f11924f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f11925g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f11926h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f11927i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f11928j;

        private C3786c() {
            this.f11926h = 1;
            this.f11927i = 1;
        }

        /* renamed from: i */
        static /* synthetic */ int m14196i(C3786c cVar) {
            int i = cVar.f11921c;
            cVar.f11921c = i + 1;
            return i;
        }

        /* renamed from: j */
        static /* synthetic */ int m14197j(C3786c cVar) {
            int i = cVar.f11921c;
            cVar.f11921c = i - 1;
            return i;
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public boolean m14210w(RecyclerView.C1726b0 b0Var, List list) {
            int i;
            int i2 = this.f11922d;
            if (i2 < 0 || i2 >= b0Var.mo5461b() || (i = this.f11921c) < 0 || i >= list.size()) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f11919a + ", mFlexLinePosition=" + this.f11921c + ", mPosition=" + this.f11922d + ", mOffset=" + this.f11923e + ", mScrollingOffset=" + this.f11924f + ", mLastScrollDelta=" + this.f11925g + ", mItemDirection=" + this.f11926h + ", mLayoutDirection=" + this.f11927i + '}';
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    /* renamed from: A2 */
    private int m14044A2(View view) {
        return mo5668a0(view) + ((RecyclerView.C1752q) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: B2 */
    private View m14045B2() {
        return mo5658U(0);
    }

    /* renamed from: C2 */
    private int m14046C2(View view) {
        return mo5671c0(view) - ((RecyclerView.C1752q) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: D2 */
    private int m14047D2(View view) {
        return mo5674f0(view) + ((RecyclerView.C1752q) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: E2 */
    private int m14048E2(View view) {
        return mo5675g0(view) - ((RecyclerView.C1752q) view.getLayoutParams()).topMargin;
    }

    /* renamed from: H0 */
    private static boolean m14049H0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i) {
                return true;
            }
            return false;
        } else if (size >= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: H2 */
    private int m14050H2(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        boolean z;
        if (mo5660V() == 0 || i == 0) {
            return 0;
        }
        m14085o2();
        int i2 = 1;
        boolean unused = this.f11880G.f11928j = true;
        if (mo11485k() || !this.f11874A) {
            z = false;
        } else {
            z = true;
        }
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m14072d3(i2, abs);
        int k = this.f11880G.f11924f + m14086p2(wVar, b0Var, this.f11880G);
        if (k < 0) {
            return 0;
        }
        if (z) {
            if (abs > k) {
                i = (-i2) * k;
            }
        } else if (abs > k) {
            i = i2 * k;
        }
        this.f11882I.mo6049s(-i);
        int unused2 = this.f11880G.f11925g = i;
        return i;
    }

    /* renamed from: I2 */
    private int m14051I2(int i) {
        int i2;
        int i3;
        int j;
        boolean z = false;
        if (mo5660V() == 0 || i == 0) {
            return 0;
        }
        m14085o2();
        boolean k = mo11485k();
        View view = this.f11892S;
        if (k) {
            i2 = view.getWidth();
        } else {
            i2 = view.getHeight();
        }
        if (k) {
            i3 = mo5716x0();
        } else {
            i3 = mo5684i0();
        }
        if (mo5692m0() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                j = Math.min((i3 + this.f11881H.f11914d) - i2, abs);
            } else if (this.f11881H.f11914d + i <= 0) {
                return i;
            } else {
                j = this.f11881H.f11914d;
            }
        } else if (i > 0) {
            return Math.min((i3 - this.f11881H.f11914d) - i2, i);
        } else {
            if (this.f11881H.f11914d + i >= 0) {
                return i;
            }
            j = this.f11881H.f11914d;
        }
        return -j;
    }

    /* renamed from: K2 */
    private boolean m14052K2(View view, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int x0 = mo5716x0() - getPaddingRight();
        int i0 = mo5684i0() - getPaddingBottom();
        int C2 = m14046C2(view);
        int E2 = m14048E2(view);
        int D2 = m14047D2(view);
        int A2 = m14044A2(view);
        if (paddingLeft > C2 || x0 < D2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (C2 >= x0 || D2 >= paddingLeft) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (paddingTop > E2 || i0 < A2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (E2 >= i0 || A2 >= paddingTop) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z) {
            if (!z2 || !z4) {
                return false;
            }
            return true;
        } else if (!z3 || !z5) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: L2 */
    private int m14053L2(C3788b bVar, C3786c cVar) {
        if (mo11485k()) {
            return m14054M2(bVar, cVar);
        }
        return m14055N2(bVar, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* renamed from: M2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m14054M2(com.google.android.flexbox.C3788b r22, com.google.android.flexbox.FlexboxLayoutManager.C3786c r23) {
        /*
            r21 = this;
            r0 = r21
            r8 = r22
            int r1 = r21.getPaddingLeft()
            int r2 = r21.getPaddingRight()
            int r3 = r21.mo5716x0()
            int r4 = r23.f11923e
            int r5 = r23.f11927i
            r6 = -1
            if (r5 != r6) goto L_0x001e
            int r5 = r8.f11935g
            int r4 = r4 - r5
        L_0x001e:
            r9 = r4
            int r10 = r23.f11922d
            int r4 = r0.f11897x
            r5 = 0
            r11 = 1
            if (r4 == 0) goto L_0x00ac
            if (r4 == r11) goto L_0x009e
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x008e
            r6 = 3
            if (r4 == r6) goto L_0x007b
            r6 = 4
            if (r4 == r6) goto L_0x0066
            r6 = 5
            if (r4 != r6) goto L_0x004d
            int r4 = r8.f11936h
            if (r4 == 0) goto L_0x0046
            int r6 = r8.f11933e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r11
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0047
        L_0x0046:
            r6 = r5
        L_0x0047:
            float r1 = (float) r1
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b0
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f11897x
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0066:
            int r4 = r8.f11936h
            if (r4 == 0) goto L_0x0072
            int r6 = r8.f11933e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0073
        L_0x0072:
            r6 = r5
        L_0x0073:
            float r1 = (float) r1
            float r4 = r6 / r7
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b0
        L_0x007b:
            float r1 = (float) r1
            int r4 = r8.f11936h
            if (r4 == r11) goto L_0x0083
            int r4 = r4 - r11
            float r4 = (float) r4
            goto L_0x0085
        L_0x0083:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0085:
            int r6 = r8.f11933e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r6 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b0
        L_0x008e:
            float r1 = (float) r1
            int r4 = r8.f11933e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
            goto L_0x00af
        L_0x009e:
            int r4 = r8.f11933e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r6 = r5
            r20 = r2
            r2 = r1
            r1 = r20
            goto L_0x00b0
        L_0x00ac:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
        L_0x00af:
            r6 = r5
        L_0x00b0:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11881H
            int r3 = r3.f11914d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11881H
            int r3 = r3.f11914d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r12 = java.lang.Math.max(r6, r5)
            int r13 = r22.mo11541b()
            r3 = 0
            r14 = r10
        L_0x00ca:
            int r4 = r10 + r13
            if (r14 >= r4) goto L_0x0197
            android.view.View r15 = r0.mo11461d(r14)
            if (r15 != 0) goto L_0x00d6
            goto L_0x0192
        L_0x00d6:
            int r4 = r23.f11927i
            if (r4 != r11) goto L_0x00e5
            android.graphics.Rect r4 = f11873V
            r0.mo5709u(r15, r4)
            r0.mo5694n(r15)
            goto L_0x00ef
        L_0x00e5:
            android.graphics.Rect r4 = f11873V
            r0.mo5709u(r15, r4)
            r0.mo5696o(r15, r3)
            int r3 = r3 + 1
        L_0x00ef:
            r16 = r3
            com.google.android.flexbox.c r3 = r0.f11877D
            long[] r4 = r3.f11950d
            r5 = r4[r14]
            int r3 = r3.mo11567y(r5)
            com.google.android.flexbox.c r4 = r0.f11877D
            int r4 = r4.mo11566x(r5)
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            r7 = r5
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r7 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) r7
            boolean r5 = r0.m14060S1(r15, r3, r4, r7)
            if (r5 == 0) goto L_0x0111
            r15.measure(r3, r4)
        L_0x0111:
            int r3 = r7.leftMargin
            int r4 = r0.mo5695n0(r15)
            int r3 = r3 + r4
            float r3 = (float) r3
            float r17 = r1 + r3
            int r1 = r7.rightMargin
            int r3 = r0.mo5705s0(r15)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r0.mo5712v0(r15)
            int r5 = r9 + r1
            boolean r1 = r0.f11874A
            if (r1 == 0) goto L_0x014f
            com.google.android.flexbox.c r1 = r0.f11877D
            int r2 = java.lang.Math.round(r18)
            int r3 = r15.getMeasuredWidth()
            int r4 = r2 - r3
            int r6 = java.lang.Math.round(r18)
            int r2 = r15.getMeasuredHeight()
            int r19 = r5 + r2
            r2 = r15
            r3 = r22
            r11 = r7
            r7 = r19
            r1.mo11545Q(r2, r3, r4, r5, r6, r7)
            goto L_0x016c
        L_0x014f:
            r11 = r7
            com.google.android.flexbox.c r1 = r0.f11877D
            int r4 = java.lang.Math.round(r17)
            int r2 = java.lang.Math.round(r17)
            int r3 = r15.getMeasuredWidth()
            int r6 = r2 + r3
            int r2 = r15.getMeasuredHeight()
            int r7 = r5 + r2
            r2 = r15
            r3 = r22
            r1.mo11545Q(r2, r3, r4, r5, r6, r7)
        L_0x016c:
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.rightMargin
            int r1 = r1 + r2
            int r2 = r0.mo5705s0(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r17 = r17 + r1
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.leftMargin
            int r1 = r1 + r2
            int r2 = r0.mo5695n0(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r18 = r18 - r1
            r3 = r16
            r1 = r17
            r2 = r18
        L_0x0192:
            int r14 = r14 + 1
            r11 = 1
            goto L_0x00ca
        L_0x0197:
            int r1 = r23.f11921c
            com.google.android.flexbox.FlexboxLayoutManager$c r2 = r0.f11880G
            int r2 = r2.f11927i
            int r1 = r1 + r2
            r2 = r23
            int unused = r2.f11921c = r1
            int r1 = r22.mo11540a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m14054M2(com.google.android.flexbox.b, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d4  */
    /* renamed from: N2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m14055N2(com.google.android.flexbox.C3788b r26, com.google.android.flexbox.FlexboxLayoutManager.C3786c r27) {
        /*
            r25 = this;
            r0 = r25
            r9 = r26
            int r1 = r25.getPaddingTop()
            int r2 = r25.getPaddingBottom()
            int r3 = r25.mo5684i0()
            int r4 = r27.f11923e
            int r5 = r27.f11923e
            int r6 = r27.f11927i
            r7 = -1
            if (r6 != r7) goto L_0x0023
            int r6 = r9.f11935g
            int r4 = r4 - r6
            int r5 = r5 + r6
        L_0x0023:
            r10 = r4
            r11 = r5
            int r12 = r27.f11922d
            int r4 = r0.f11897x
            r5 = 0
            r13 = 1
            if (r4 == 0) goto L_0x00b2
            if (r4 == r13) goto L_0x00a4
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x0094
            r6 = 3
            if (r4 == r6) goto L_0x0081
            r6 = 4
            if (r4 == r6) goto L_0x006c
            r6 = 5
            if (r4 != r6) goto L_0x0053
            int r4 = r9.f11936h
            if (r4 == 0) goto L_0x004c
            int r6 = r9.f11933e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r13
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x004d
        L_0x004c:
            r6 = r5
        L_0x004d:
            float r1 = (float) r1
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b6
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f11897x
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006c:
            int r4 = r9.f11936h
            if (r4 == 0) goto L_0x0078
            int r6 = r9.f11933e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0079
        L_0x0078:
            r6 = r5
        L_0x0079:
            float r1 = (float) r1
            float r4 = r6 / r7
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b6
        L_0x0081:
            float r1 = (float) r1
            int r4 = r9.f11936h
            if (r4 == r13) goto L_0x0089
            int r4 = r4 - r13
            float r4 = (float) r4
            goto L_0x008b
        L_0x0089:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x008b:
            int r6 = r9.f11933e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r6 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b6
        L_0x0094:
            float r1 = (float) r1
            int r4 = r9.f11933e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
            goto L_0x00b5
        L_0x00a4:
            int r4 = r9.f11933e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r6 = r5
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x00b6
        L_0x00b2:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
        L_0x00b5:
            r6 = r5
        L_0x00b6:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11881H
            int r3 = r3.f11914d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f11881H
            int r3 = r3.f11914d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r14 = java.lang.Math.max(r6, r5)
            int r15 = r26.mo11541b()
            r3 = 0
            r8 = r12
        L_0x00d0:
            int r4 = r12 + r15
            if (r8 >= r4) goto L_0x020d
            android.view.View r7 = r0.mo11461d(r8)
            if (r7 != 0) goto L_0x00e2
            r23 = r8
            r22 = r13
            r17 = r14
            goto L_0x0205
        L_0x00e2:
            com.google.android.flexbox.c r4 = r0.f11877D
            long[] r5 = r4.f11950d
            r17 = r14
            r13 = r5[r8]
            int r4 = r4.mo11567y(r13)
            com.google.android.flexbox.c r5 = r0.f11877D
            int r5 = r5.mo11566x(r13)
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            r13 = r6
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r13 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) r13
            boolean r6 = r0.m14060S1(r7, r4, r5, r13)
            if (r6 == 0) goto L_0x0104
            r7.measure(r4, r5)
        L_0x0104:
            int r4 = r13.topMargin
            int r5 = r0.mo5712v0(r7)
            int r4 = r4 + r5
            float r4 = (float) r4
            float r14 = r1 + r4
            int r1 = r13.rightMargin
            int r4 = r0.mo5657T(r7)
            int r1 = r1 + r4
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r27.f11927i
            r6 = 1
            if (r1 != r6) goto L_0x0128
            android.graphics.Rect r1 = f11873V
            r0.mo5709u(r7, r1)
            r0.mo5694n(r7)
            goto L_0x0132
        L_0x0128:
            android.graphics.Rect r1 = f11873V
            r0.mo5709u(r7, r1)
            r0.mo5696o(r7, r3)
            int r3 = r3 + 1
        L_0x0132:
            r16 = r3
            int r1 = r0.mo5695n0(r7)
            int r5 = r10 + r1
            int r1 = r0.mo5705s0(r7)
            int r19 = r11 - r1
            boolean r4 = r0.f11874A
            if (r4 == 0) goto L_0x0198
            boolean r1 = r0.f11875B
            if (r1 == 0) goto L_0x0172
            com.google.android.flexbox.c r1 = r0.f11877D
            int r2 = r7.getMeasuredWidth()
            int r5 = r19 - r2
            int r2 = java.lang.Math.round(r18)
            int r3 = r7.getMeasuredHeight()
            int r20 = r2 - r3
            int r21 = java.lang.Math.round(r18)
            r2 = r7
            r3 = r26
            r22 = r6
            r6 = r20
            r20 = r7
            r7 = r19
            r23 = r8
            r8 = r21
            r1.mo11546R(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01dd
        L_0x0172:
            r22 = r6
            r20 = r7
            r23 = r8
            com.google.android.flexbox.c r1 = r0.f11877D
            int r2 = r20.getMeasuredWidth()
            int r5 = r19 - r2
            int r6 = java.lang.Math.round(r14)
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r7 = r19
            r1.mo11546R(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01dd
        L_0x0198:
            r22 = r6
            r20 = r7
            r23 = r8
            boolean r1 = r0.f11875B
            if (r1 == 0) goto L_0x01c0
            com.google.android.flexbox.c r1 = r0.f11877D
            int r2 = java.lang.Math.round(r18)
            int r3 = r20.getMeasuredHeight()
            int r6 = r2 - r3
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r8 = java.lang.Math.round(r18)
            r2 = r20
            r3 = r26
            r1.mo11546R(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01dd
        L_0x01c0:
            com.google.android.flexbox.c r1 = r0.f11877D
            int r6 = java.lang.Math.round(r14)
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r1.mo11546R(r2, r3, r4, r5, r6, r7, r8)
        L_0x01dd:
            int r1 = r20.getMeasuredHeight()
            int r2 = r13.topMargin
            int r1 = r1 + r2
            r2 = r20
            int r3 = r0.mo5657T(r2)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r1 = r1 + r17
            float r14 = r14 + r1
            int r1 = r2.getMeasuredHeight()
            int r3 = r13.bottomMargin
            int r1 = r1 + r3
            int r2 = r0.mo5712v0(r2)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r17
            float r18 = r18 - r1
            r1 = r14
            r3 = r16
            r2 = r18
        L_0x0205:
            int r8 = r23 + 1
            r14 = r17
            r13 = r22
            goto L_0x00d0
        L_0x020d:
            int r1 = r27.f11921c
            com.google.android.flexbox.FlexboxLayoutManager$c r2 = r0.f11880G
            int r2 = r2.f11927i
            int r1 = r1 + r2
            r2 = r27
            int unused = r2.f11921c = r1
            int r1 = r26.mo11540a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m14055N2(com.google.android.flexbox.b, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    /* renamed from: O2 */
    private void m14056O2(RecyclerView.C1759w wVar, C3786c cVar) {
        if (cVar.f11928j) {
            if (cVar.f11927i == -1) {
                m14058Q2(wVar, cVar);
            } else {
                m14059R2(wVar, cVar);
            }
        }
    }

    /* renamed from: P2 */
    private void m14057P2(RecyclerView.C1759w wVar, int i, int i2) {
        while (i2 >= i) {
            mo5721z1(i2, wVar);
            i2--;
        }
    }

    /* renamed from: Q2 */
    private void m14058Q2(RecyclerView.C1759w wVar, C3786c cVar) {
        if (cVar.f11924f >= 0) {
            this.f11882I.mo6038h();
            int unused = cVar.f11924f;
            int V = mo5660V();
            if (V != 0) {
                int i = V - 1;
                int i2 = this.f11877D.f11949c[mo5700q0(mo5658U(i))];
                if (i2 != -1) {
                    C3788b bVar = (C3788b) this.f11876C.get(i2);
                    int i3 = i;
                    while (true) {
                        if (i3 < 0) {
                            break;
                        }
                        View U = mo5658U(i3);
                        if (!m14078h2(U, cVar.f11924f)) {
                            break;
                        }
                        if (bVar.f11943o == mo5700q0(U)) {
                            if (i2 <= 0) {
                                V = i3;
                                break;
                            }
                            i2 += cVar.f11927i;
                            bVar = (C3788b) this.f11876C.get(i2);
                            V = i3;
                        }
                        i3--;
                    }
                    m14057P2(wVar, V, i);
                }
            }
        }
    }

    /* renamed from: R2 */
    private void m14059R2(RecyclerView.C1759w wVar, C3786c cVar) {
        int V;
        if (cVar.f11924f >= 0 && (V = mo5660V()) != 0) {
            int i = this.f11877D.f11949c[mo5700q0(mo5658U(0))];
            int i2 = -1;
            if (i != -1) {
                C3788b bVar = (C3788b) this.f11876C.get(i);
                int i3 = 0;
                while (true) {
                    if (i3 >= V) {
                        break;
                    }
                    View U = mo5658U(i3);
                    if (!m14079i2(U, cVar.f11924f)) {
                        break;
                    }
                    if (bVar.f11944p == mo5700q0(U)) {
                        if (i >= this.f11876C.size() - 1) {
                            i2 = i3;
                            break;
                        }
                        i += cVar.f11927i;
                        bVar = (C3788b) this.f11876C.get(i);
                        i2 = i3;
                    }
                    i3++;
                }
                m14057P2(wVar, 0, i2);
            }
        }
    }

    /* renamed from: S1 */
    private boolean m14060S1(View view, int i, int i2, RecyclerView.C1752q qVar) {
        if (view.isLayoutRequested() || !mo5630G0() || !m14049H0(view.getWidth(), i, qVar.width) || !m14049H0(view.getHeight(), i2, qVar.height)) {
            return true;
        }
        return false;
    }

    /* renamed from: S2 */
    private void m14061S2() {
        int i;
        boolean z;
        if (mo11485k()) {
            i = mo5685j0();
        } else {
            i = mo5718y0();
        }
        C3786c cVar = this.f11880G;
        if (i == 0 || i == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        boolean unused = cVar.f11920b = z;
    }

    /* renamed from: T2 */
    private void m14062T2() {
        boolean z;
        boolean z2;
        boolean z3;
        int m0 = mo5692m0();
        int i = this.f11895v;
        boolean z4 = false;
        if (i == 0) {
            if (m0 == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f11874A = z;
            if (this.f11896w == 2) {
                z4 = true;
            }
            this.f11875B = z4;
        } else if (i == 1) {
            if (m0 != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f11874A = z2;
            if (this.f11896w == 2) {
                z4 = true;
            }
            this.f11875B = z4;
        } else if (i == 2) {
            if (m0 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f11874A = z3;
            if (this.f11896w == 2) {
                this.f11874A = !z3;
            }
            this.f11875B = false;
        } else if (i != 3) {
            this.f11874A = false;
            this.f11875B = false;
        } else {
            if (m0 == 1) {
                z4 = true;
            }
            this.f11874A = z4;
            if (this.f11896w == 2) {
                this.f11874A = !z4;
            }
            this.f11875B = true;
        }
    }

    /* renamed from: Y2 */
    private boolean m14063Y2(RecyclerView.C1726b0 b0Var, C3785b bVar) {
        View view;
        int i;
        boolean z = false;
        if (mo5660V() == 0) {
            return false;
        }
        if (bVar.f11915e) {
            view = m14089t2(b0Var.mo5461b());
        } else {
            view = m14087q2(b0Var.mo5461b());
        }
        if (view == null) {
            return false;
        }
        bVar.m14186r(view);
        if (!b0Var.mo5464e() && mo5162Z1()) {
            if (this.f11882I.mo6037g(view) >= this.f11882I.mo6039i() || this.f11882I.mo6034d(view) < this.f11882I.mo6044n()) {
                z = true;
            }
            if (z) {
                if (bVar.f11915e) {
                    i = this.f11882I.mo6039i();
                } else {
                    i = this.f11882I.mo6044n();
                }
                int unused = bVar.f11913c = i;
            }
        }
        return true;
    }

    /* renamed from: Z2 */
    private boolean m14064Z2(RecyclerView.C1726b0 b0Var, C3785b bVar, SavedState savedState) {
        int i;
        int i2;
        boolean z = false;
        if (!b0Var.mo5464e() && (i = this.f11885L) != -1) {
            if (i < 0 || i >= b0Var.mo5461b()) {
                this.f11885L = -1;
                this.f11886M = Integer.MIN_VALUE;
            } else {
                int unused = bVar.f11911a = this.f11885L;
                int unused2 = bVar.f11912b = this.f11877D.f11949c[bVar.f11911a];
                SavedState savedState2 = this.f11884K;
                if (savedState2 != null && savedState2.m14165h(b0Var.mo5461b())) {
                    int unused3 = bVar.f11913c = this.f11882I.mo6044n() + savedState.f11910e;
                    boolean unused4 = bVar.f11917g = true;
                    int unused5 = bVar.f11912b = -1;
                    return true;
                } else if (this.f11886M == Integer.MIN_VALUE) {
                    View O = mo5199O(this.f11885L);
                    if (O == null) {
                        if (mo5660V() > 0) {
                            if (this.f11885L < mo5700q0(mo5658U(0))) {
                                z = true;
                            }
                            boolean unused6 = bVar.f11915e = z;
                        }
                        bVar.m14185q();
                    } else if (this.f11882I.mo6035e(O) > this.f11882I.mo6045o()) {
                        bVar.m14185q();
                        return true;
                    } else if (this.f11882I.mo6037g(O) - this.f11882I.mo6044n() < 0) {
                        int unused7 = bVar.f11913c = this.f11882I.mo6044n();
                        boolean unused8 = bVar.f11915e = false;
                        return true;
                    } else if (this.f11882I.mo6039i() - this.f11882I.mo6034d(O) < 0) {
                        int unused9 = bVar.f11913c = this.f11882I.mo6039i();
                        boolean unused10 = bVar.f11915e = true;
                        return true;
                    } else {
                        if (bVar.f11915e) {
                            i2 = this.f11882I.mo6034d(O) + this.f11882I.mo6046p();
                        } else {
                            i2 = this.f11882I.mo6037g(O);
                        }
                        int unused11 = bVar.f11913c = i2;
                    }
                    return true;
                } else {
                    if (mo11485k() || !this.f11874A) {
                        int unused12 = bVar.f11913c = this.f11882I.mo6044n() + this.f11886M;
                    } else {
                        int unused13 = bVar.f11913c = this.f11886M - this.f11882I.mo6040j();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a3 */
    private void m14066a3(RecyclerView.C1726b0 b0Var, C3785b bVar) {
        if (!m14064Z2(b0Var, bVar, this.f11884K) && !m14063Y2(b0Var, bVar)) {
            bVar.m14185q();
            int unused = bVar.f11911a = 0;
            int unused2 = bVar.f11912b = 0;
        }
    }

    /* renamed from: b3 */
    private void m14068b3(int i) {
        if (i < mo11518v2()) {
            int V = mo5660V();
            this.f11877D.mo11564t(V);
            this.f11877D.mo11565u(V);
            this.f11877D.mo11563s(V);
            if (i < this.f11877D.f11949c.length) {
                this.f11893T = i;
                View B2 = m14045B2();
                if (B2 != null) {
                    this.f11885L = mo5700q0(B2);
                    if (mo11485k() || !this.f11874A) {
                        this.f11886M = this.f11882I.mo6037g(B2) - this.f11882I.mo6044n();
                    } else {
                        this.f11886M = this.f11882I.mo6034d(B2) + this.f11882I.mo6040j();
                    }
                }
            }
        }
    }

    /* renamed from: c3 */
    private void m14070c3(int i) {
        int i2;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(mo5716x0(), mo5718y0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(mo5684i0(), mo5685j0());
        int x0 = mo5716x0();
        int i0 = mo5684i0();
        boolean z = true;
        if (mo11485k()) {
            int i4 = this.f11887N;
            if (i4 == Integer.MIN_VALUE || i4 == x0) {
                z = false;
            }
            if (this.f11880G.f11920b) {
                i2 = this.f11891R.getResources().getDisplayMetrics().heightPixels;
            } else {
                i2 = this.f11880G.f11919a;
            }
        } else {
            int i5 = this.f11888O;
            if (i5 == Integer.MIN_VALUE || i5 == i0) {
                z = false;
            }
            if (this.f11880G.f11920b) {
                i2 = this.f11891R.getResources().getDisplayMetrics().widthPixels;
            } else {
                i2 = this.f11880G.f11919a;
            }
        }
        int i6 = i2;
        this.f11887N = x0;
        this.f11888O = i0;
        int i7 = this.f11893T;
        if (i7 != -1 || (this.f11885L == -1 && !z)) {
            if (i7 != -1) {
                i3 = Math.min(i7, this.f11881H.f11911a);
            } else {
                i3 = this.f11881H.f11911a;
            }
            int i8 = i3;
            this.f11894U.mo11568a();
            if (mo11485k()) {
                if (this.f11876C.size() > 0) {
                    this.f11877D.mo11557j(this.f11876C, i8);
                    this.f11877D.mo11550b(this.f11894U, makeMeasureSpec, makeMeasureSpec2, i6, i8, this.f11881H.f11911a, this.f11876C);
                } else {
                    this.f11877D.mo11563s(i);
                    this.f11877D.mo11552d(this.f11894U, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f11876C);
                }
            } else if (this.f11876C.size() > 0) {
                this.f11877D.mo11557j(this.f11876C, i8);
                this.f11877D.mo11550b(this.f11894U, makeMeasureSpec2, makeMeasureSpec, i6, i8, this.f11881H.f11911a, this.f11876C);
            } else {
                this.f11877D.mo11563s(i);
                this.f11877D.mo11555g(this.f11894U, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f11876C);
            }
            this.f11876C = this.f11894U.f11952a;
            this.f11877D.mo11562q(makeMeasureSpec, makeMeasureSpec2, i8);
            this.f11877D.mo11549Y(i8);
        } else if (!this.f11881H.f11915e) {
            this.f11876C.clear();
            this.f11894U.mo11568a();
            if (mo11485k()) {
                this.f11877D.mo11553e(this.f11894U, makeMeasureSpec, makeMeasureSpec2, i6, this.f11881H.f11911a, this.f11876C);
            } else {
                this.f11877D.mo11556h(this.f11894U, makeMeasureSpec, makeMeasureSpec2, i6, this.f11881H.f11911a, this.f11876C);
            }
            this.f11876C = this.f11894U.f11952a;
            this.f11877D.mo11561p(makeMeasureSpec, makeMeasureSpec2);
            this.f11877D.mo11548X();
            C3785b bVar = this.f11881H;
            int unused = bVar.f11912b = this.f11877D.f11949c[bVar.f11911a];
            int unused2 = this.f11880G.f11921c = this.f11881H.f11912b;
        }
    }

    /* renamed from: d3 */
    private void m14072d3(int i, int i2) {
        boolean z;
        int i3;
        int unused = this.f11880G.f11927i = i;
        boolean k = mo11485k();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(mo5716x0(), mo5718y0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(mo5684i0(), mo5685j0());
        int i4 = 0;
        if (k || !this.f11874A) {
            z = false;
        } else {
            z = true;
        }
        if (i == 1) {
            View U = mo5658U(mo5660V() - 1);
            int unused2 = this.f11880G.f11923e = this.f11882I.mo6034d(U);
            int q0 = mo5700q0(U);
            View u2 = m14090u2(U, (C3788b) this.f11876C.get(this.f11877D.f11949c[q0]));
            int unused3 = this.f11880G.f11926h = 1;
            C3786c cVar = this.f11880G;
            int unused4 = cVar.f11922d = q0 + cVar.f11926h;
            if (this.f11877D.f11949c.length <= this.f11880G.f11922d) {
                int unused5 = this.f11880G.f11921c = -1;
            } else {
                C3786c cVar2 = this.f11880G;
                int unused6 = cVar2.f11921c = this.f11877D.f11949c[cVar2.f11922d];
            }
            if (z) {
                int unused7 = this.f11880G.f11923e = this.f11882I.mo6037g(u2);
                int unused8 = this.f11880G.f11924f = (-this.f11882I.mo6037g(u2)) + this.f11882I.mo6044n();
                C3786c cVar3 = this.f11880G;
                if (cVar3.f11924f >= 0) {
                    i4 = this.f11880G.f11924f;
                }
                int unused9 = cVar3.f11924f = i4;
            } else {
                int unused10 = this.f11880G.f11923e = this.f11882I.mo6034d(u2);
                int unused11 = this.f11880G.f11924f = this.f11882I.mo6034d(u2) - this.f11882I.mo6039i();
            }
            if ((this.f11880G.f11921c == -1 || this.f11880G.f11921c > this.f11876C.size() - 1) && this.f11880G.f11922d <= getFlexItemCount()) {
                int k2 = i2 - this.f11880G.f11924f;
                this.f11894U.mo11568a();
                if (k2 > 0) {
                    if (k) {
                        this.f11877D.mo11552d(this.f11894U, makeMeasureSpec, makeMeasureSpec2, k2, this.f11880G.f11922d, this.f11876C);
                    } else {
                        this.f11877D.mo11555g(this.f11894U, makeMeasureSpec, makeMeasureSpec2, k2, this.f11880G.f11922d, this.f11876C);
                    }
                    this.f11877D.mo11562q(makeMeasureSpec, makeMeasureSpec2, this.f11880G.f11922d);
                    this.f11877D.mo11549Y(this.f11880G.f11922d);
                }
            }
        } else {
            View U2 = mo5658U(0);
            int unused12 = this.f11880G.f11923e = this.f11882I.mo6037g(U2);
            int q02 = mo5700q0(U2);
            View r2 = m14088r2(U2, (C3788b) this.f11876C.get(this.f11877D.f11949c[q02]));
            int unused13 = this.f11880G.f11926h = 1;
            int i5 = this.f11877D.f11949c[q02];
            if (i5 == -1) {
                i5 = 0;
            }
            if (i5 > 0) {
                int unused14 = this.f11880G.f11922d = q02 - ((C3788b) this.f11876C.get(i5 - 1)).mo11541b();
            } else {
                int unused15 = this.f11880G.f11922d = -1;
            }
            C3786c cVar4 = this.f11880G;
            if (i5 > 0) {
                i3 = i5 - 1;
            } else {
                i3 = 0;
            }
            int unused16 = cVar4.f11921c = i3;
            if (z) {
                int unused17 = this.f11880G.f11923e = this.f11882I.mo6034d(r2);
                int unused18 = this.f11880G.f11924f = this.f11882I.mo6034d(r2) - this.f11882I.mo6039i();
                C3786c cVar5 = this.f11880G;
                if (cVar5.f11924f >= 0) {
                    i4 = this.f11880G.f11924f;
                }
                int unused19 = cVar5.f11924f = i4;
            } else {
                int unused20 = this.f11880G.f11923e = this.f11882I.mo6037g(r2);
                int unused21 = this.f11880G.f11924f = (-this.f11882I.mo6037g(r2)) + this.f11882I.mo6044n();
            }
        }
        C3786c cVar6 = this.f11880G;
        int unused22 = cVar6.f11919a = i2 - cVar6.f11924f;
    }

    /* renamed from: e3 */
    private void m14074e3(C3785b bVar, boolean z, boolean z2) {
        if (z2) {
            m14061S2();
        } else {
            boolean unused = this.f11880G.f11920b = false;
        }
        if (mo11485k() || !this.f11874A) {
            int unused2 = this.f11880G.f11919a = this.f11882I.mo6039i() - bVar.f11913c;
        } else {
            int unused3 = this.f11880G.f11919a = bVar.f11913c - getPaddingRight();
        }
        int unused4 = this.f11880G.f11922d = bVar.f11911a;
        int unused5 = this.f11880G.f11926h = 1;
        int unused6 = this.f11880G.f11927i = 1;
        int unused7 = this.f11880G.f11923e = bVar.f11913c;
        int unused8 = this.f11880G.f11924f = Integer.MIN_VALUE;
        int unused9 = this.f11880G.f11921c = bVar.f11912b;
        if (z && this.f11876C.size() > 1 && bVar.f11912b >= 0 && bVar.f11912b < this.f11876C.size() - 1) {
            C3786c.m14196i(this.f11880G);
            C3786c cVar = this.f11880G;
            int unused10 = cVar.f11922d = cVar.f11922d + ((C3788b) this.f11876C.get(bVar.f11912b)).mo11541b();
        }
    }

    /* renamed from: f3 */
    private void m14076f3(C3785b bVar, boolean z, boolean z2) {
        if (z2) {
            m14061S2();
        } else {
            boolean unused = this.f11880G.f11920b = false;
        }
        if (mo11485k() || !this.f11874A) {
            int unused2 = this.f11880G.f11919a = bVar.f11913c - this.f11882I.mo6044n();
        } else {
            int unused3 = this.f11880G.f11919a = (this.f11892S.getWidth() - bVar.f11913c) - this.f11882I.mo6044n();
        }
        int unused4 = this.f11880G.f11922d = bVar.f11911a;
        int unused5 = this.f11880G.f11926h = 1;
        int unused6 = this.f11880G.f11927i = -1;
        int unused7 = this.f11880G.f11923e = bVar.f11913c;
        int unused8 = this.f11880G.f11924f = Integer.MIN_VALUE;
        int unused9 = this.f11880G.f11921c = bVar.f11912b;
        if (z && bVar.f11912b > 0 && this.f11876C.size() > bVar.f11912b) {
            C3786c.m14197j(this.f11880G);
            C3786c cVar = this.f11880G;
            int unused10 = cVar.f11922d = cVar.f11922d - ((C3788b) this.f11876C.get(bVar.f11912b)).mo11541b();
        }
    }

    /* renamed from: h2 */
    private boolean m14078h2(View view, int i) {
        if (mo11485k() || !this.f11874A) {
            if (this.f11882I.mo6037g(view) >= this.f11882I.mo6038h() - i) {
                return true;
            }
            return false;
        } else if (this.f11882I.mo6034d(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: i2 */
    private boolean m14079i2(View view, int i) {
        if (mo11485k() || !this.f11874A) {
            if (this.f11882I.mo6034d(view) <= i) {
                return true;
            }
            return false;
        } else if (this.f11882I.mo6038h() - this.f11882I.mo6037g(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: j2 */
    private void m14080j2() {
        this.f11876C.clear();
        this.f11881H.m14187s();
        int unused = this.f11881H.f11914d = 0;
    }

    /* renamed from: k2 */
    private int m14081k2(RecyclerView.C1726b0 b0Var) {
        if (mo5660V() == 0) {
            return 0;
        }
        int b = b0Var.mo5461b();
        m14085o2();
        View q2 = m14087q2(b);
        View t2 = m14089t2(b);
        if (b0Var.mo5461b() == 0 || q2 == null || t2 == null) {
            return 0;
        }
        return Math.min(this.f11882I.mo6045o(), this.f11882I.mo6034d(t2) - this.f11882I.mo6037g(q2));
    }

    /* renamed from: l2 */
    private int m14082l2(RecyclerView.C1726b0 b0Var) {
        if (mo5660V() == 0) {
            return 0;
        }
        int b = b0Var.mo5461b();
        View q2 = m14087q2(b);
        View t2 = m14089t2(b);
        if (!(b0Var.mo5461b() == 0 || q2 == null || t2 == null)) {
            int q0 = mo5700q0(q2);
            int q02 = mo5700q0(t2);
            int abs = Math.abs(this.f11882I.mo6034d(t2) - this.f11882I.mo6037g(q2));
            int[] iArr = this.f11877D.f11949c;
            int i = iArr[q0];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[q02] - i) + 1)))) + ((float) (this.f11882I.mo6044n() - this.f11882I.mo6037g(q2))));
            }
        }
        return 0;
    }

    /* renamed from: m2 */
    private int m14083m2(RecyclerView.C1726b0 b0Var) {
        if (mo5660V() == 0) {
            return 0;
        }
        int b = b0Var.mo5461b();
        View q2 = m14087q2(b);
        View t2 = m14089t2(b);
        if (b0Var.mo5461b() == 0 || q2 == null || t2 == null) {
            return 0;
        }
        int s2 = mo11517s2();
        return (int) ((((float) Math.abs(this.f11882I.mo6034d(t2) - this.f11882I.mo6037g(q2))) / ((float) ((mo11518v2() - s2) + 1))) * ((float) b0Var.mo5461b()));
    }

    /* renamed from: n2 */
    private void m14084n2() {
        if (this.f11880G == null) {
            this.f11880G = new C3786c();
        }
    }

    /* renamed from: o2 */
    private void m14085o2() {
        if (this.f11882I == null) {
            if (mo11485k()) {
                if (this.f11896w == 0) {
                    this.f11882I = C1824r.m7051a(this);
                    this.f11883J = C1824r.m7053c(this);
                    return;
                }
                this.f11882I = C1824r.m7053c(this);
                this.f11883J = C1824r.m7051a(this);
            } else if (this.f11896w == 0) {
                this.f11882I = C1824r.m7053c(this);
                this.f11883J = C1824r.m7051a(this);
            } else {
                this.f11882I = C1824r.m7051a(this);
                this.f11883J = C1824r.m7053c(this);
            }
        }
    }

    /* renamed from: p2 */
    private int m14086p2(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, C3786c cVar) {
        if (cVar.f11924f != Integer.MIN_VALUE) {
            if (cVar.f11919a < 0) {
                int unused = cVar.f11924f = cVar.f11924f + cVar.f11919a;
            }
            m14056O2(wVar, cVar);
        }
        int e = cVar.f11919a;
        int e2 = cVar.f11919a;
        boolean k = mo11485k();
        int i = 0;
        while (true) {
            if ((e2 > 0 || this.f11880G.f11920b) && cVar.m14210w(b0Var, this.f11876C)) {
                C3788b bVar = (C3788b) this.f11876C.get(cVar.f11921c);
                int unused2 = cVar.f11922d = bVar.f11943o;
                i += m14053L2(bVar, cVar);
                if (k || !this.f11874A) {
                    int unused3 = cVar.f11923e = cVar.f11923e + (bVar.mo11540a() * cVar.f11927i);
                } else {
                    int unused4 = cVar.f11923e = cVar.f11923e - (bVar.mo11540a() * cVar.f11927i);
                }
                e2 -= bVar.mo11540a();
            }
        }
        int unused5 = cVar.f11919a = cVar.f11919a - i;
        if (cVar.f11924f != Integer.MIN_VALUE) {
            int unused6 = cVar.f11924f = cVar.f11924f + i;
            if (cVar.f11919a < 0) {
                int unused7 = cVar.f11924f = cVar.f11924f + cVar.f11919a;
            }
            m14056O2(wVar, cVar);
        }
        return e - cVar.f11919a;
    }

    /* renamed from: q2 */
    private View m14087q2(int i) {
        int i2;
        View x2 = m14092x2(0, mo5660V(), i);
        if (x2 == null || (i2 = this.f11877D.f11949c[mo5700q0(x2)]) == -1) {
            return null;
        }
        return m14088r2(x2, (C3788b) this.f11876C.get(i2));
    }

    /* renamed from: r2 */
    private View m14088r2(View view, C3788b bVar) {
        boolean k = mo11485k();
        int i = bVar.f11936h;
        for (int i2 = 1; i2 < i; i2++) {
            View U = mo5658U(i2);
            if (!(U == null || U.getVisibility() == 8)) {
                if (!this.f11874A || k) {
                    if (this.f11882I.mo6037g(view) <= this.f11882I.mo6037g(U)) {
                    }
                } else if (this.f11882I.mo6034d(view) >= this.f11882I.mo6034d(U)) {
                }
                view = U;
            }
        }
        return view;
    }

    /* renamed from: t2 */
    private View m14089t2(int i) {
        View x2 = m14092x2(mo5660V() - 1, -1, i);
        if (x2 == null) {
            return null;
        }
        return m14090u2(x2, (C3788b) this.f11876C.get(this.f11877D.f11949c[mo5700q0(x2)]));
    }

    /* renamed from: u2 */
    private View m14090u2(View view, C3788b bVar) {
        boolean k = mo11485k();
        int V = (mo5660V() - bVar.f11936h) - 1;
        for (int V2 = mo5660V() - 2; V2 > V; V2--) {
            View U = mo5658U(V2);
            if (!(U == null || U.getVisibility() == 8)) {
                if (!this.f11874A || k) {
                    if (this.f11882I.mo6034d(view) >= this.f11882I.mo6034d(U)) {
                    }
                } else if (this.f11882I.mo6037g(view) <= this.f11882I.mo6037g(U)) {
                }
                view = U;
            }
        }
        return view;
    }

    /* renamed from: w2 */
    private View m14091w2(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View U = mo5658U(i);
            if (m14052K2(U, z)) {
                return U;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: x2 */
    private View m14092x2(int i, int i2, int i3) {
        int i4;
        m14085o2();
        m14084n2();
        int n = this.f11882I.mo6044n();
        int i5 = this.f11882I.mo6039i();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View U = mo5658U(i);
            int q0 = mo5700q0(U);
            if (q0 >= 0 && q0 < i3) {
                if (((RecyclerView.C1752q) U.getLayoutParams()).mo5731e()) {
                    if (view2 == null) {
                        view2 = U;
                    }
                } else if (this.f11882I.mo6037g(U) >= n && this.f11882I.mo6034d(U) <= i5) {
                    return U;
                } else {
                    if (view == null) {
                        view = U;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* renamed from: y2 */
    private int m14093y2(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, boolean z) {
        boolean z2;
        int i2;
        int i3;
        if (mo11485k() || !this.f11874A) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int n = i - this.f11882I.mo6044n();
            if (n <= 0) {
                return 0;
            }
            i2 = m14050H2(n, wVar, b0Var);
        } else {
            int i4 = this.f11882I.mo6039i() - i;
            if (i4 <= 0) {
                return 0;
            }
            i2 = -m14050H2(-i4, wVar, b0Var);
        }
        int i5 = i + i2;
        if (!z || (i3 = this.f11882I.mo6039i() - i5) <= 0) {
            return i2;
        }
        this.f11882I.mo6049s(i3);
        return i3 + i2;
    }

    /* renamed from: z2 */
    private int m14094z2(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var, boolean z) {
        int i2;
        int n;
        if (mo11485k() || !this.f11874A) {
            int n2 = i - this.f11882I.mo6044n();
            if (n2 <= 0) {
                return 0;
            }
            i2 = -m14050H2(n2, wVar, b0Var);
        } else {
            int i3 = this.f11882I.mo6039i() - i;
            if (i3 <= 0) {
                return 0;
            }
            i2 = m14050H2(-i3, wVar, b0Var);
        }
        int i4 = i + i2;
        if (!z || (n = i4 - this.f11882I.mo6044n()) <= 0) {
            return i2;
        }
        this.f11882I.mo6049s(-n);
        return i2 - n;
    }

    /* renamed from: B */
    public int mo5190B(RecyclerView.C1726b0 b0Var) {
        return m14081k2(b0Var);
    }

    /* renamed from: C */
    public int mo5146C(RecyclerView.C1726b0 b0Var) {
        return m14082l2(b0Var);
    }

    /* renamed from: D */
    public int mo5147D(RecyclerView.C1726b0 b0Var) {
        return m14083m2(b0Var);
    }

    /* renamed from: E */
    public int mo5195E(RecyclerView.C1726b0 b0Var) {
        return m14081k2(b0Var);
    }

    /* renamed from: F */
    public int mo5148F(RecyclerView.C1726b0 b0Var) {
        return m14082l2(b0Var);
    }

    /* renamed from: F2 */
    public List mo11510F2() {
        ArrayList arrayList = new ArrayList(this.f11876C.size());
        int size = this.f11876C.size();
        for (int i = 0; i < size; i++) {
            C3788b bVar = (C3788b) this.f11876C.get(i);
            if (bVar.mo11541b() != 0) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: G */
    public int mo5150G(RecyclerView.C1726b0 b0Var) {
        return m14083m2(b0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G2 */
    public int mo11511G2(int i) {
        return this.f11877D.f11949c[i];
    }

    /* renamed from: I1 */
    public int mo5152I1(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        if (!mo11485k() || (this.f11896w == 0 && mo11485k())) {
            int H2 = m14050H2(i, wVar, b0Var);
            this.f11890Q.clear();
            return H2;
        }
        int I2 = m14051I2(i);
        C3785b bVar = this.f11881H;
        int unused = bVar.f11914d = bVar.f11914d + I2;
        this.f11883J.mo6049s(-I2);
        return I2;
    }

    /* renamed from: J1 */
    public void mo5197J1(int i) {
        this.f11885L = i;
        this.f11886M = Integer.MIN_VALUE;
        SavedState savedState = this.f11884K;
        if (savedState != null) {
            savedState.m14166i();
        }
        mo5629F1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J2 */
    public boolean mo11512J2() {
        return this.f11874A;
    }

    /* renamed from: K1 */
    public int mo5153K1(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        if (mo11485k() || (this.f11896w == 0 && !mo11485k())) {
            int H2 = m14050H2(i, wVar, b0Var);
            this.f11890Q.clear();
            return H2;
        }
        int I2 = m14051I2(i);
        C3785b bVar = this.f11881H;
        int unused = bVar.f11914d = bVar.f11914d + I2;
        this.f11883J.mo6049s(-I2);
        return I2;
    }

    /* renamed from: P */
    public RecyclerView.C1752q mo5154P() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: P0 */
    public void mo5649P0(RecyclerView.C1736h hVar, RecyclerView.C1736h hVar2) {
        mo5713v1();
    }

    /* renamed from: Q */
    public RecyclerView.C1752q mo5156Q(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: R0 */
    public void mo5652R0(RecyclerView recyclerView) {
        super.mo5652R0(recyclerView);
        this.f11892S = (View) recyclerView.getParent();
    }

    /* renamed from: T0 */
    public void mo5205T0(RecyclerView recyclerView, RecyclerView.C1759w wVar) {
        super.mo5205T0(recyclerView, wVar);
        if (this.f11889P) {
            mo5715w1(wVar);
            wVar.mo5772d();
        }
    }

    /* renamed from: U2 */
    public void mo11513U2(int i) {
        int i2 = this.f11898y;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                mo5713v1();
                m14080j2();
            }
            this.f11898y = i;
            mo5629F1();
        }
    }

    /* renamed from: V1 */
    public void mo5208V1(RecyclerView recyclerView, RecyclerView.C1726b0 b0Var, int i) {
        C1817m mVar = new C1817m(recyclerView.getContext());
        mVar.mo5452p(i);
        mo5662W1(mVar);
    }

    /* renamed from: V2 */
    public void mo11514V2(int i) {
        if (this.f11895v != i) {
            mo5713v1();
            this.f11895v = i;
            this.f11882I = null;
            this.f11883J = null;
            m14080j2();
            mo5629F1();
        }
    }

    /* renamed from: W2 */
    public void mo11515W2(int i) {
        if (i != 2) {
            int i2 = this.f11896w;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    mo5713v1();
                    m14080j2();
                }
                this.f11896w = i;
                this.f11882I = null;
                this.f11883J = null;
                mo5629F1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    /* renamed from: X2 */
    public void mo11516X2(int i) {
        if (this.f11897x != i) {
            this.f11897x = i;
            mo5629F1();
        }
    }

    /* renamed from: a */
    public PointF mo5209a(int i) {
        int i2;
        if (mo5660V() == 0) {
            return null;
        }
        if (i < mo5700q0(mo5658U(0))) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (mo11485k()) {
            return new PointF(Utils.FLOAT_EPSILON, (float) i2);
        }
        return new PointF((float) i2, Utils.FLOAT_EPSILON);
    }

    /* renamed from: b */
    public void mo11458b(View view, int i, int i2, C3788b bVar) {
        mo5709u(view, f11873V);
        if (mo11485k()) {
            int n0 = mo5695n0(view) + mo5705s0(view);
            bVar.f11933e += n0;
            bVar.f11934f += n0;
            return;
        }
        int v0 = mo5712v0(view) + mo5657T(view);
        bVar.f11933e += v0;
        bVar.f11934f += v0;
    }

    /* renamed from: c */
    public int mo11459c(int i, int i2, int i3) {
        return RecyclerView.C1747p.m6428W(mo5716x0(), mo5718y0(), i2, i3, mo5226v());
    }

    /* renamed from: c1 */
    public void mo5165c1(RecyclerView recyclerView, int i, int i2) {
        super.mo5165c1(recyclerView, i, i2);
        m14068b3(i);
    }

    /* renamed from: d */
    public View mo11461d(int i) {
        View view = (View) this.f11890Q.get(i);
        if (view != null) {
            return view;
        }
        return this.f11878E.mo5784p(i);
    }

    /* renamed from: e */
    public int mo11462e(int i, int i2, int i3) {
        return RecyclerView.C1747p.m6428W(mo5684i0(), mo5685j0(), i2, i3, mo5227w());
    }

    /* renamed from: e1 */
    public void mo5167e1(RecyclerView recyclerView, int i, int i2, int i3) {
        super.mo5167e1(recyclerView, i, i2, i3);
        m14068b3(Math.min(i, i2));
    }

    /* renamed from: f */
    public int mo11463f(View view) {
        int n0;
        int s0;
        if (mo11485k()) {
            n0 = mo5712v0(view);
            s0 = mo5657T(view);
        } else {
            n0 = mo5695n0(view);
            s0 = mo5705s0(view);
        }
        return n0 + s0;
    }

    /* renamed from: f1 */
    public void mo5168f1(RecyclerView recyclerView, int i, int i2) {
        super.mo5168f1(recyclerView, i, i2);
        m14068b3(i);
    }

    /* renamed from: g */
    public void mo11464g(C3788b bVar) {
    }

    /* renamed from: g1 */
    public void mo5676g1(RecyclerView recyclerView, int i, int i2) {
        super.mo5676g1(recyclerView, i, i2);
        m14068b3(i);
    }

    public int getAlignContent() {
        return 5;
    }

    public int getAlignItems() {
        return this.f11898y;
    }

    public int getFlexDirection() {
        return this.f11895v;
    }

    public int getFlexItemCount() {
        return this.f11879F.mo5461b();
    }

    public List getFlexLinesInternal() {
        return this.f11876C;
    }

    public int getFlexWrap() {
        return this.f11896w;
    }

    public int getLargestMainSize() {
        if (this.f11876C.size() == 0) {
            return 0;
        }
        int size = this.f11876C.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((C3788b) this.f11876C.get(i2)).f11933e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.f11899z;
    }

    public int getSumOfCrossSize() {
        int size = this.f11876C.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C3788b) this.f11876C.get(i2)).f11935g;
        }
        return i;
    }

    /* renamed from: h */
    public View mo11482h(int i) {
        return mo11461d(i);
    }

    /* renamed from: h1 */
    public void mo5169h1(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.mo5169h1(recyclerView, i, i2, obj);
        m14068b3(i);
    }

    /* renamed from: i */
    public void mo11483i(int i, View view) {
        this.f11890Q.put(i, view);
    }

    /* renamed from: i1 */
    public void mo5170i1(RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        int i;
        int i2;
        this.f11878E = wVar;
        this.f11879F = b0Var;
        int b = b0Var.mo5461b();
        if (b != 0 || !b0Var.mo5464e()) {
            m14062T2();
            m14085o2();
            m14084n2();
            this.f11877D.mo11564t(b);
            this.f11877D.mo11565u(b);
            this.f11877D.mo11563s(b);
            boolean unused = this.f11880G.f11928j = false;
            SavedState savedState = this.f11884K;
            if (savedState != null && savedState.m14165h(b)) {
                this.f11885L = this.f11884K.f11909d;
            }
            if (!(this.f11881H.f11916f && this.f11885L == -1 && this.f11884K == null)) {
                this.f11881H.m14187s();
                m14066a3(b0Var, this.f11881H);
                boolean unused2 = this.f11881H.f11916f = true;
            }
            mo5632H(wVar);
            if (this.f11881H.f11915e) {
                m14076f3(this.f11881H, false, true);
            } else {
                m14074e3(this.f11881H, false, true);
            }
            m14070c3(b);
            if (this.f11881H.f11915e) {
                m14086p2(wVar, b0Var, this.f11880G);
                i2 = this.f11880G.f11923e;
                m14074e3(this.f11881H, true, false);
                m14086p2(wVar, b0Var, this.f11880G);
                i = this.f11880G.f11923e;
            } else {
                m14086p2(wVar, b0Var, this.f11880G);
                i = this.f11880G.f11923e;
                m14076f3(this.f11881H, true, false);
                m14086p2(wVar, b0Var, this.f11880G);
                i2 = this.f11880G.f11923e;
            }
            if (mo5660V() <= 0) {
                return;
            }
            if (this.f11881H.f11915e) {
                m14094z2(i2 + m14093y2(i, wVar, b0Var, true), wVar, b0Var, false);
            } else {
                m14093y2(i + m14094z2(i2, wVar, b0Var, true), wVar, b0Var, false);
            }
        }
    }

    /* renamed from: j */
    public int mo11484j(View view, int i, int i2) {
        int v0;
        int T;
        if (mo11485k()) {
            v0 = mo5695n0(view);
            T = mo5705s0(view);
        } else {
            v0 = mo5712v0(view);
            T = mo5657T(view);
        }
        return v0 + T;
    }

    /* renamed from: j1 */
    public void mo5171j1(RecyclerView.C1726b0 b0Var) {
        super.mo5171j1(b0Var);
        this.f11884K = null;
        this.f11885L = -1;
        this.f11886M = Integer.MIN_VALUE;
        this.f11893T = -1;
        this.f11881H.m14187s();
        this.f11890Q.clear();
    }

    /* renamed from: k */
    public boolean mo11485k() {
        int i = this.f11895v;
        return i == 0 || i == 1;
    }

    /* renamed from: n1 */
    public void mo5218n1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f11884K = (SavedState) parcelable;
            mo5629F1();
        }
    }

    /* renamed from: o1 */
    public Parcelable mo5220o1() {
        if (this.f11884K != null) {
            return new SavedState(this.f11884K);
        }
        SavedState savedState = new SavedState();
        if (mo5660V() > 0) {
            View B2 = m14045B2();
            int unused = savedState.f11909d = mo5700q0(B2);
            int unused2 = savedState.f11910e = this.f11882I.mo6037g(B2) - this.f11882I.mo6044n();
        } else {
            savedState.m14166i();
        }
        return savedState;
    }

    /* renamed from: s2 */
    public int mo11517s2() {
        View w2 = m14091w2(0, mo5660V(), false);
        if (w2 == null) {
            return -1;
        }
        return mo5700q0(w2);
    }

    public void setFlexLines(List list) {
        this.f11876C = list;
    }

    /* renamed from: v */
    public boolean mo5226v() {
        int i;
        if (this.f11896w == 0) {
            return mo11485k();
        }
        if (mo11485k()) {
            int x0 = mo5716x0();
            View view = this.f11892S;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (x0 > i) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: v2 */
    public int mo11518v2() {
        View w2 = m14091w2(mo5660V() - 1, -1, false);
        if (w2 == null) {
            return -1;
        }
        return mo5700q0(w2);
    }

    /* renamed from: w */
    public boolean mo5227w() {
        int i;
        if (this.f11896w == 0) {
            return !mo11485k();
        }
        if (mo11485k()) {
            return true;
        }
        int i0 = mo5684i0();
        View view = this.f11892S;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (i0 > i) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public boolean mo5178x(RecyclerView.C1752q qVar) {
        return qVar instanceof LayoutParams;
    }

    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3783a();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f11909d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f11910e;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$SavedState$a */
        static class C3783a implements Parcelable.Creator {
            C3783a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public boolean m14165h(int i) {
            int i2 = this.f11909d;
            return i2 >= 0 && i2 < i;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public void m14166i() {
            this.f11909d = -1;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f11909d + ", mAnchorOffset=" + this.f11910e + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11909d);
            parcel.writeInt(this.f11910e);
        }

        SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.f11909d = parcel.readInt();
            this.f11910e = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.f11909d = savedState.f11909d;
            this.f11910e = savedState.f11910e;
        }
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.f11899z = -1;
        this.f11876C = new ArrayList();
        this.f11877D = new C3789c(this);
        this.f11881H = new C3785b();
        this.f11885L = -1;
        this.f11886M = Integer.MIN_VALUE;
        this.f11887N = Integer.MIN_VALUE;
        this.f11888O = Integer.MIN_VALUE;
        this.f11890Q = new SparseArray();
        this.f11893T = -1;
        this.f11894U = new C3789c.C3791b();
        mo11514V2(i);
        mo11515W2(i2);
        mo11513U2(4);
        mo5640L1(true);
        this.f11891R = context;
    }

    public static class LayoutParams extends RecyclerView.C1752q implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C3782a();

        /* renamed from: h */
        private float f11900h = Utils.FLOAT_EPSILON;

        /* renamed from: i */
        private float f11901i = 1.0f;

        /* renamed from: j */
        private int f11902j = -1;

        /* renamed from: k */
        private float f11903k = -1.0f;

        /* renamed from: l */
        private int f11904l;

        /* renamed from: m */
        private int f11905m;

        /* renamed from: n */
        private int f11906n = 16777215;

        /* renamed from: o */
        private int f11907o = 16777215;

        /* renamed from: p */
        private boolean f11908p;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$a */
        static class C3782a implements Parcelable.Creator {
            C3782a() {
            }

            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* renamed from: b */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: H0 */
        public int mo11439H0() {
            return this.f11906n;
        }

        /* renamed from: U */
        public int mo11440U() {
            return this.f11904l;
        }

        /* renamed from: V0 */
        public void mo11441V0(int i) {
            this.f11904l = i;
        }

        /* renamed from: W0 */
        public int mo11442W0() {
            return this.bottomMargin;
        }

        /* renamed from: Y0 */
        public int mo11443Y0() {
            return this.leftMargin;
        }

        public int describeContents() {
            return 0;
        }

        public int getHeight() {
            return this.height;
        }

        public int getOrder() {
            return 1;
        }

        public int getWidth() {
            return this.width;
        }

        /* renamed from: h0 */
        public int mo11447h0() {
            return this.topMargin;
        }

        /* renamed from: m0 */
        public void mo11448m0(int i) {
            this.f11905m = i;
        }

        /* renamed from: n */
        public int mo11449n() {
            return this.f11902j;
        }

        /* renamed from: n0 */
        public float mo11450n0() {
            return this.f11900h;
        }

        /* renamed from: o */
        public float mo11451o() {
            return this.f11901i;
        }

        /* renamed from: p0 */
        public float mo11452p0() {
            return this.f11903k;
        }

        /* renamed from: r1 */
        public int mo11453r1() {
            return this.rightMargin;
        }

        /* renamed from: t1 */
        public int mo11454t1() {
            return this.f11905m;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f11900h);
            parcel.writeFloat(this.f11901i);
            parcel.writeInt(this.f11902j);
            parcel.writeFloat(this.f11903k);
            parcel.writeInt(this.f11904l);
            parcel.writeInt(this.f11905m);
            parcel.writeInt(this.f11906n);
            parcel.writeInt(this.f11907o);
            parcel.writeByte(this.f11908p ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        /* renamed from: x0 */
        public boolean mo11455x0() {
            return this.f11908p;
        }

        /* renamed from: y1 */
        public int mo11456y1() {
            return this.f11907o;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f11900h = parcel.readFloat();
            this.f11901i = parcel.readFloat();
            this.f11902j = parcel.readInt();
            this.f11903k = parcel.readFloat();
            this.f11904l = parcel.readInt();
            this.f11905m = parcel.readInt();
            this.f11906n = parcel.readInt();
            this.f11907o = parcel.readInt();
            this.f11908p = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f11899z = -1;
        this.f11876C = new ArrayList();
        this.f11877D = new C3789c(this);
        this.f11881H = new C3785b();
        this.f11885L = -1;
        this.f11886M = Integer.MIN_VALUE;
        this.f11887N = Integer.MIN_VALUE;
        this.f11888O = Integer.MIN_VALUE;
        this.f11890Q = new SparseArray();
        this.f11893T = -1;
        this.f11894U = new C3789c.C3791b();
        RecyclerView.C1747p.C1751d r0 = RecyclerView.C1747p.m6431r0(context, attributeSet, i, i2);
        int i3 = r0.f5202a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (r0.f5204c) {
                    mo11514V2(3);
                } else {
                    mo11514V2(2);
                }
            }
        } else if (r0.f5204c) {
            mo11514V2(1);
        } else {
            mo11514V2(0);
        }
        mo11515W2(1);
        mo11513U2(4);
        mo5640L1(true);
        this.f11891R = context;
    }
}
