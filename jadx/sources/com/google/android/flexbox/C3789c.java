package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.view.C1058a0;
import androidx.core.widget.C1295d;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.flexbox.c */
class C3789c {

    /* renamed from: a */
    private final C3787a f11947a;

    /* renamed from: b */
    private boolean[] f11948b;

    /* renamed from: c */
    int[] f11949c;

    /* renamed from: d */
    long[] f11950d;

    /* renamed from: e */
    private long[] f11951e;

    /* renamed from: com.google.android.flexbox.c$b */
    static class C3791b {

        /* renamed from: a */
        List f11952a;

        /* renamed from: b */
        int f11953b;

        C3791b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11568a() {
            this.f11952a = null;
            this.f11953b = 0;
        }
    }

    /* renamed from: com.google.android.flexbox.c$c */
    private static class C3792c implements Comparable {

        /* renamed from: d */
        int f11954d;

        /* renamed from: e */
        int f11955e;

        private C3792c() {
        }

        /* renamed from: a */
        public int compareTo(C3792c cVar) {
            int i = this.f11955e;
            int i2 = cVar.f11955e;
            if (i != i2) {
                return i - i2;
            }
            return this.f11954d - cVar.f11954d;
        }

        public String toString() {
            return "Order{order=" + this.f11955e + ", index=" + this.f11954d + '}';
        }
    }

    C3789c(C3787a aVar) {
        this.f11947a = aVar;
    }

    /* renamed from: A */
    private int m14225A(int i, FlexItem flexItem, int i2) {
        C3787a aVar = this.f11947a;
        int c = aVar.mo11459c(i, aVar.getPaddingLeft() + this.f11947a.getPaddingRight() + flexItem.mo11443Y0() + flexItem.mo11453r1() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(c);
        if (size > flexItem.mo11439H0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo11439H0(), View.MeasureSpec.getMode(c));
        }
        if (size < flexItem.mo11440U()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo11440U(), View.MeasureSpec.getMode(c));
        }
        return c;
    }

    /* renamed from: B */
    private int m14226B(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo11442W0();
        }
        return flexItem.mo11453r1();
    }

    /* renamed from: C */
    private int m14227C(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo11453r1();
        }
        return flexItem.mo11442W0();
    }

    /* renamed from: D */
    private int m14228D(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo11447h0();
        }
        return flexItem.mo11443Y0();
    }

    /* renamed from: E */
    private int m14229E(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo11443Y0();
        }
        return flexItem.mo11447h0();
    }

    /* renamed from: F */
    private int m14230F(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.getHeight();
        }
        return flexItem.getWidth();
    }

    /* renamed from: G */
    private int m14231G(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.getWidth();
        }
        return flexItem.getHeight();
    }

    /* renamed from: H */
    private int m14232H(boolean z) {
        if (z) {
            return this.f11947a.getPaddingBottom();
        }
        return this.f11947a.getPaddingEnd();
    }

    /* renamed from: I */
    private int m14233I(boolean z) {
        if (z) {
            return this.f11947a.getPaddingEnd();
        }
        return this.f11947a.getPaddingBottom();
    }

    /* renamed from: J */
    private int m14234J(boolean z) {
        if (z) {
            return this.f11947a.getPaddingTop();
        }
        return this.f11947a.getPaddingStart();
    }

    /* renamed from: K */
    private int m14235K(boolean z) {
        if (z) {
            return this.f11947a.getPaddingStart();
        }
        return this.f11947a.getPaddingTop();
    }

    /* renamed from: L */
    private int m14236L(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: M */
    private int m14237M(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: N */
    private boolean m14238N(int i, int i2, C3788b bVar) {
        return i == i2 - 1 && bVar.mo11542c() != 0;
    }

    /* renamed from: P */
    private boolean m14239P(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.f11947a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.mo11455x0()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.f11947a.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int j = this.f11947a.mo11484j(view, i5, i6);
        if (j > 0) {
            i4 += j;
        }
        if (i2 < i3 + i4) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private void m14240T(int i, int i2, C3788b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        C3788b bVar2 = bVar;
        int i9 = i3;
        int i12 = bVar2.f11933e;
        float f = bVar2.f11939k;
        float f2 = Utils.FLOAT_EPSILON;
        if (f > Utils.FLOAT_EPSILON && i9 <= i12) {
            float f3 = ((float) (i12 - i9)) / f;
            bVar2.f11933e = i4 + bVar2.f11934f;
            if (!z) {
                bVar2.f11935g = Integer.MIN_VALUE;
            }
            int i13 = 0;
            boolean z2 = false;
            int i14 = 0;
            float f4 = 0.0f;
            while (i13 < bVar2.f11936h) {
                int i15 = bVar2.f11943o + i13;
                View h = this.f11947a.mo11482h(i15);
                if (h == null || h.getVisibility() == 8) {
                    int i16 = i2;
                    i6 = i12;
                    i5 = i13;
                } else {
                    FlexItem flexItem = (FlexItem) h.getLayoutParams();
                    int flexDirection = this.f11947a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i6 = i12;
                        int i17 = i13;
                        int i18 = i;
                        int measuredWidth = h.getMeasuredWidth();
                        long[] jArr = this.f11951e;
                        if (jArr != null) {
                            measuredWidth = mo11567y(jArr[i15]);
                        }
                        int measuredHeight = h.getMeasuredHeight();
                        long[] jArr2 = this.f11951e;
                        int i19 = i17;
                        if (jArr2 != null) {
                            measuredHeight = mo11566x(jArr2[i15]);
                        }
                        if (this.f11948b[i15] || flexItem.mo11451o() <= Utils.FLOAT_EPSILON) {
                            int i22 = i2;
                            i8 = i19;
                        } else {
                            float o = ((float) measuredWidth) - (flexItem.mo11451o() * f3);
                            i8 = i19;
                            if (i8 == bVar2.f11936h - 1) {
                                o += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(o);
                            if (round < flexItem.mo11440U()) {
                                round = flexItem.mo11440U();
                                this.f11948b[i15] = true;
                                bVar2.f11939k -= flexItem.mo11451o();
                                z2 = true;
                            } else {
                                f4 += o - ((float) round);
                                double d = (double) f4;
                                if (d > 1.0d) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f4 += 1.0f;
                                }
                            }
                            int z3 = m14252z(i2, flexItem, bVar2.f11941m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            h.measure(makeMeasureSpec, z3);
                            int measuredWidth2 = h.getMeasuredWidth();
                            int measuredHeight2 = h.getMeasuredHeight();
                            m14244Z(i15, makeMeasureSpec, z3, h);
                            this.f11947a.mo11483i(i15, h);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i14, measuredHeight + flexItem.mo11447h0() + flexItem.mo11442W0() + this.f11947a.mo11463f(h));
                        bVar2.f11933e += measuredWidth + flexItem.mo11443Y0() + flexItem.mo11453r1();
                        i7 = max;
                    } else {
                        int measuredHeight3 = h.getMeasuredHeight();
                        long[] jArr3 = this.f11951e;
                        if (jArr3 != null) {
                            measuredHeight3 = mo11566x(jArr3[i15]);
                        }
                        int measuredWidth3 = h.getMeasuredWidth();
                        long[] jArr4 = this.f11951e;
                        if (jArr4 != null) {
                            measuredWidth3 = mo11567y(jArr4[i15]);
                        }
                        if (this.f11948b[i15] || flexItem.mo11451o() <= f2) {
                            i6 = i12;
                            i5 = i13;
                            int i23 = i;
                        } else {
                            float o2 = ((float) measuredHeight3) - (flexItem.mo11451o() * f3);
                            if (i13 == bVar2.f11936h - 1) {
                                o2 += f4;
                                f4 = f2;
                            }
                            int round2 = Math.round(o2);
                            if (round2 < flexItem.mo11454t1()) {
                                round2 = flexItem.mo11454t1();
                                this.f11948b[i15] = true;
                                bVar2.f11939k -= flexItem.mo11451o();
                                i6 = i12;
                                i5 = i13;
                                z2 = true;
                            } else {
                                f4 += o2 - ((float) round2);
                                i6 = i12;
                                i5 = i13;
                                double d2 = (double) f4;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f4 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f4 += 1.0f;
                                }
                            }
                            int A = m14225A(i, flexItem, bVar2.f11941m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            h.measure(A, makeMeasureSpec2);
                            measuredWidth3 = h.getMeasuredWidth();
                            int measuredHeight4 = h.getMeasuredHeight();
                            m14244Z(i15, A, makeMeasureSpec2, h);
                            this.f11947a.mo11483i(i15, h);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i14, measuredWidth3 + flexItem.mo11443Y0() + flexItem.mo11453r1() + this.f11947a.mo11463f(h));
                        bVar2.f11933e += measuredHeight3 + flexItem.mo11447h0() + flexItem.mo11442W0();
                        int i24 = i2;
                    }
                    bVar2.f11935g = Math.max(bVar2.f11935g, i7);
                    i14 = i7;
                }
                i13 = i5 + 1;
                i12 = i6;
                f2 = Utils.FLOAT_EPSILON;
            }
            int i25 = i2;
            int i26 = i12;
            if (z2 && i26 != bVar2.f11933e) {
                m14240T(i, i2, bVar, i3, i4, true);
            }
        }
    }

    /* renamed from: U */
    private int[] m14241U(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C3792c cVar = (C3792c) it.next();
            int i3 = cVar.f11954d;
            iArr[i2] = i3;
            sparseIntArray.append(i3, cVar.f11955e);
            i2++;
        }
        return iArr;
    }

    /* renamed from: V */
    private void m14242V(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo11443Y0()) - flexItem.mo11453r1()) - this.f11947a.mo11463f(view), flexItem.mo11440U()), flexItem.mo11439H0());
        long[] jArr = this.f11951e;
        if (jArr != null) {
            i3 = mo11566x(jArr[i2]);
        } else {
            i3 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m14244Z(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f11947a.mo11483i(i2, view);
    }

    /* renamed from: W */
    private void m14243W(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo11447h0()) - flexItem.mo11442W0()) - this.f11947a.mo11463f(view), flexItem.mo11454t1()), flexItem.mo11456y1());
        long[] jArr = this.f11951e;
        if (jArr != null) {
            i3 = mo11567y(jArr[i2]);
        } else {
            i3 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m14244Z(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f11947a.mo11483i(i2, view);
    }

    /* renamed from: Z */
    private void m14244Z(int i, int i2, int i3, View view) {
        long[] jArr = this.f11950d;
        if (jArr != null) {
            jArr[i] = mo11547S(i2, i3);
        }
        long[] jArr2 = this.f11951e;
        if (jArr2 != null) {
            jArr2[i] = mo11547S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    private void m14245a(List list, C3788b bVar, int i, int i2) {
        bVar.f11941m = i2;
        this.f11947a.mo11464g(bVar);
        bVar.f11944p = i;
        list.add(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14246i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo11440U()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.mo11440U()
        L_0x0019:
            r3 = r4
            goto L_0x0027
        L_0x001b:
            int r3 = r0.mo11439H0()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.mo11439H0()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.mo11454t1()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.mo11454t1()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.mo11456y1()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.mo11456y1()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m14244Z(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f11947a
            r0.mo11483i(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C3789c.m14246i(android.view.View, int):void");
    }

    /* renamed from: k */
    private List m14247k(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C3788b bVar = new C3788b();
        bVar.f11935g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add((C3788b) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    private List m14248l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C3792c cVar = new C3792c();
            cVar.f11955e = ((FlexItem) this.f11947a.mo11461d(i2).getLayoutParams()).getOrder();
            cVar.f11954d = i2;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: r */
    private void m14249r(int i) {
        boolean[] zArr = this.f11948b;
        if (zArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f11948b = new boolean[i];
        } else if (zArr.length < i) {
            int length = zArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f11948b = new boolean[i];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* renamed from: v */
    private void m14250v(CompoundButton compoundButton) {
        int i;
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int U = flexItem.mo11440U();
        int t1 = flexItem.mo11454t1();
        Drawable a = C1295d.m4505a(compoundButton);
        int i2 = 0;
        if (a == null) {
            i = 0;
        } else {
            i = a.getMinimumWidth();
        }
        if (a != null) {
            i2 = a.getMinimumHeight();
        }
        if (U == -1) {
            U = i;
        }
        flexItem.mo11441V0(U);
        if (t1 == -1) {
            t1 = i2;
        }
        flexItem.mo11448m0(t1);
    }

    /* renamed from: w */
    private void m14251w(int i, int i2, C3788b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        C3788b bVar2 = bVar;
        int i9 = i3;
        float f = bVar2.f11938j;
        float f2 = Utils.FLOAT_EPSILON;
        if (f > Utils.FLOAT_EPSILON && i9 >= (i5 = bVar2.f11933e)) {
            float f3 = ((float) (i9 - i5)) / f;
            bVar2.f11933e = i4 + bVar2.f11934f;
            if (!z) {
                bVar2.f11935g = Integer.MIN_VALUE;
            }
            int i12 = 0;
            boolean z2 = false;
            int i13 = 0;
            float f4 = 0.0f;
            while (i12 < bVar2.f11936h) {
                int i14 = bVar2.f11943o + i12;
                View h = this.f11947a.mo11482h(i14);
                if (h == null || h.getVisibility() == 8) {
                    int i15 = i2;
                    i6 = i5;
                } else {
                    FlexItem flexItem = (FlexItem) h.getLayoutParams();
                    int flexDirection = this.f11947a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int i16 = i5;
                        int i17 = i;
                        int measuredWidth = h.getMeasuredWidth();
                        long[] jArr = this.f11951e;
                        if (jArr != null) {
                            measuredWidth = mo11567y(jArr[i14]);
                        }
                        int measuredHeight = h.getMeasuredHeight();
                        long[] jArr2 = this.f11951e;
                        i6 = i16;
                        if (jArr2 != null) {
                            measuredHeight = mo11566x(jArr2[i14]);
                        }
                        if (this.f11948b[i14] || flexItem.mo11450n0() <= Utils.FLOAT_EPSILON) {
                            int i18 = i2;
                        } else {
                            float n0 = ((float) measuredWidth) + (flexItem.mo11450n0() * f3);
                            if (i12 == bVar2.f11936h - 1) {
                                n0 += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(n0);
                            if (round > flexItem.mo11439H0()) {
                                round = flexItem.mo11439H0();
                                this.f11948b[i14] = true;
                                bVar2.f11938j -= flexItem.mo11450n0();
                                z2 = true;
                            } else {
                                f4 += n0 - ((float) round);
                                double d3 = (double) f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    d = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d = d3 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int z3 = m14252z(i2, flexItem, bVar2.f11941m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            h.measure(makeMeasureSpec, z3);
                            int measuredWidth2 = h.getMeasuredWidth();
                            int measuredHeight2 = h.getMeasuredHeight();
                            m14244Z(i14, makeMeasureSpec, z3, h);
                            this.f11947a.mo11483i(i14, h);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i13, measuredHeight + flexItem.mo11447h0() + flexItem.mo11442W0() + this.f11947a.mo11463f(h));
                        bVar2.f11933e += measuredWidth + flexItem.mo11443Y0() + flexItem.mo11453r1();
                        i7 = max;
                    } else {
                        int measuredHeight3 = h.getMeasuredHeight();
                        long[] jArr3 = this.f11951e;
                        if (jArr3 != null) {
                            measuredHeight3 = mo11566x(jArr3[i14]);
                        }
                        int measuredWidth3 = h.getMeasuredWidth();
                        long[] jArr4 = this.f11951e;
                        if (jArr4 != null) {
                            measuredWidth3 = mo11567y(jArr4[i14]);
                        }
                        if (this.f11948b[i14] || flexItem.mo11450n0() <= f2) {
                            i8 = i5;
                            int i19 = i;
                        } else {
                            float n02 = ((float) measuredHeight3) + (flexItem.mo11450n0() * f3);
                            if (i12 == bVar2.f11936h - 1) {
                                n02 += f4;
                                f4 = f2;
                            }
                            int round2 = Math.round(n02);
                            if (round2 > flexItem.mo11456y1()) {
                                round2 = flexItem.mo11456y1();
                                this.f11948b[i14] = true;
                                bVar2.f11938j -= flexItem.mo11450n0();
                                i8 = i5;
                                z2 = true;
                            } else {
                                f4 += n02 - ((float) round2);
                                i8 = i5;
                                double d4 = (double) f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int A = m14225A(i, flexItem, bVar2.f11941m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            h.measure(A, makeMeasureSpec2);
                            measuredWidth3 = h.getMeasuredWidth();
                            int measuredHeight4 = h.getMeasuredHeight();
                            m14244Z(i14, A, makeMeasureSpec2, h);
                            this.f11947a.mo11483i(i14, h);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i13, measuredWidth3 + flexItem.mo11443Y0() + flexItem.mo11453r1() + this.f11947a.mo11463f(h));
                        bVar2.f11933e += measuredHeight3 + flexItem.mo11447h0() + flexItem.mo11442W0();
                        int i22 = i2;
                        i6 = i8;
                    }
                    bVar2.f11935g = Math.max(bVar2.f11935g, i7);
                    i13 = i7;
                }
                i12++;
                i5 = i6;
                f2 = Utils.FLOAT_EPSILON;
            }
            int i23 = i2;
            int i24 = i5;
            if (z2 && i24 != bVar2.f11933e) {
                m14251w(i, i2, bVar, i3, i4, true);
            }
        }
    }

    /* renamed from: z */
    private int m14252z(int i, FlexItem flexItem, int i2) {
        C3787a aVar = this.f11947a;
        int e = aVar.mo11462e(i, aVar.getPaddingTop() + this.f11947a.getPaddingBottom() + flexItem.mo11447h0() + flexItem.mo11442W0() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(e);
        if (size > flexItem.mo11456y1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo11456y1(), View.MeasureSpec.getMode(e));
        }
        if (size < flexItem.mo11454t1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo11454t1(), View.MeasureSpec.getMode(e));
        }
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean mo11544O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f11947a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View d = this.f11947a.mo11461d(i);
            if (d != null && ((FlexItem) d.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo11545Q(View view, C3788b bVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f11947a.getAlignItems();
        if (flexItem.mo11449n() != -1) {
            alignItems = flexItem.mo11449n();
        }
        int i5 = bVar.f11935g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo11447h0()) - flexItem.mo11442W0()) / 2;
                    if (this.f11947a.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (alignItems != 3) {
                    if (alignItems != 4) {
                        return;
                    }
                } else if (this.f11947a.getFlexWrap() != 2) {
                    int max = Math.max(bVar.f11940l - view.getBaseline(), flexItem.mo11447h0());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((bVar.f11940l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.mo11442W0());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (this.f11947a.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.mo11442W0(), i3, i8 - flexItem.mo11442W0());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.mo11447h0(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.mo11447h0());
                return;
            }
        }
        if (this.f11947a.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.mo11447h0(), i3, i4 + flexItem.mo11447h0());
        } else {
            view.layout(i, i2 - flexItem.mo11442W0(), i3, i4 - flexItem.mo11442W0());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo11546R(View view, C3788b bVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f11947a.getAlignItems();
        if (flexItem.mo11449n() != -1) {
            alignItems = flexItem.mo11449n();
        }
        int i5 = bVar.f11935g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + C1058a0.m3951b(marginLayoutParams)) - C1058a0.m3950a(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo11453r1(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo11453r1(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.mo11443Y0(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.mo11443Y0(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.mo11443Y0(), i2, i3 + flexItem.mo11443Y0(), i4);
        } else {
            view.layout(i - flexItem.mo11453r1(), i2, i3 - flexItem.mo11453r1(), i4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public long mo11547S(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo11548X() {
        mo11549Y(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo11549Y(int i) {
        int i2;
        View h;
        int i3 = i;
        if (i3 < this.f11947a.getFlexItemCount()) {
            int flexDirection = this.f11947a.getFlexDirection();
            if (this.f11947a.getAlignItems() == 4) {
                int[] iArr = this.f11949c;
                if (iArr != null) {
                    i2 = iArr[i3];
                } else {
                    i2 = 0;
                }
                List flexLinesInternal = this.f11947a.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                while (i2 < size) {
                    C3788b bVar = (C3788b) flexLinesInternal.get(i2);
                    int i4 = bVar.f11936h;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = bVar.f11943o + i5;
                        if (!(i5 >= this.f11947a.getFlexItemCount() || (h = this.f11947a.mo11482h(i6)) == null || h.getVisibility() == 8)) {
                            FlexItem flexItem = (FlexItem) h.getLayoutParams();
                            if (flexItem.mo11449n() == -1 || flexItem.mo11449n() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    m14243W(h, bVar.f11935g, i6);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    m14242V(h, bVar.f11935g, i6);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                            }
                        }
                    }
                    i2++;
                }
                return;
            }
            for (C3788b bVar2 : this.f11947a.getFlexLinesInternal()) {
                Iterator it = bVar2.f11942n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View h2 = this.f11947a.mo11482h(num.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            m14243W(h2, bVar2.f11935g, num.intValue());
                        } else if (flexDirection == 2 || flexDirection == 3) {
                            m14242V(h2, bVar2.f11935g, num.intValue());
                        } else {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11550b(C3791b bVar, int i, int i2, int i3, int i4, int i5, List list) {
        ArrayList arrayList;
        boolean z;
        int i6;
        int i7;
        C3791b bVar2;
        int i8;
        int i9;
        List list2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        View view;
        boolean z2;
        boolean z3;
        boolean z4;
        int i19;
        int i22;
        C3791b bVar3 = bVar;
        int i23 = i;
        int i24 = i2;
        int i25 = i5;
        boolean k = this.f11947a.mo11485k();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = list;
        }
        bVar3.f11952a = arrayList;
        if (i25 == -1) {
            z = true;
        } else {
            z = false;
        }
        int K = m14235K(k);
        int I = m14233I(k);
        int J = m14234J(k);
        int H = m14232H(k);
        C3788b bVar4 = new C3788b();
        int i26 = i4;
        bVar4.f11943o = i26;
        int i27 = I + K;
        bVar4.f11933e = i27;
        int flexItemCount = this.f11947a.getFlexItemCount();
        boolean z5 = z;
        int i28 = Integer.MIN_VALUE;
        int i29 = 0;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            if (i6 >= flexItemCount) {
                i7 = i32;
                bVar2 = bVar;
                break;
            }
            View h = this.f11947a.mo11482h(i6);
            if (h != null) {
                if (h.getVisibility() != 8) {
                    if (h instanceof CompoundButton) {
                        m14250v((CompoundButton) h);
                    }
                    FlexItem flexItem = (FlexItem) h.getLayoutParams();
                    int i34 = flexItemCount;
                    if (flexItem.mo11449n() == 4) {
                        bVar4.f11942n.add(Integer.valueOf(i6));
                    }
                    int G = m14231G(flexItem, k);
                    if (flexItem.mo11452p0() != -1.0f && mode == 1073741824) {
                        G = Math.round(((float) size) * flexItem.mo11452p0());
                    }
                    if (k) {
                        int c = this.f11947a.mo11459c(i23, i27 + m14229E(flexItem, true) + m14227C(flexItem, true), G);
                        i9 = size;
                        i8 = mode;
                        int e = this.f11947a.mo11462e(i24, J + H + m14228D(flexItem, true) + m14226B(flexItem, true) + i29, m14230F(flexItem, true));
                        h.measure(c, e);
                        m14244Z(i6, c, e, h);
                        i16 = c;
                    } else {
                        i9 = size;
                        i8 = mode;
                        int c2 = this.f11947a.mo11459c(i24, J + H + m14228D(flexItem, false) + m14226B(flexItem, false) + i29, m14230F(flexItem, false));
                        int e2 = this.f11947a.mo11462e(i23, m14229E(flexItem, false) + i27 + m14227C(flexItem, false), G);
                        h.measure(c2, e2);
                        m14244Z(i6, c2, e2, h);
                        i16 = e2;
                    }
                    this.f11947a.mo11483i(i6, h);
                    m14246i(h, i6);
                    i32 = View.combineMeasuredStates(i32, h.getMeasuredState());
                    int i35 = bVar4.f11933e;
                    int C = m14227C(flexItem, k) + m14237M(h, k) + m14229E(flexItem, k);
                    int i36 = i29;
                    int i37 = i34;
                    C3788b bVar5 = bVar4;
                    int i38 = i27;
                    View view2 = h;
                    int i39 = i35;
                    int i42 = C;
                    int i43 = i6;
                    View view3 = view2;
                    list2 = arrayList;
                    int i44 = i43;
                    int i45 = i16;
                    if (m14239P(h, i8, i9, i39, i42, flexItem, i43, i33, arrayList.size())) {
                        if (bVar5.mo11542c() > 0) {
                            if (i44 > 0) {
                                i22 = i44 - 1;
                            } else {
                                i22 = 0;
                            }
                            C3788b bVar6 = bVar5;
                            m14245a(list2, bVar6, i22, i36);
                            i29 = bVar6.f11935g + i36;
                        } else {
                            i29 = i36;
                        }
                        if (!k) {
                            i14 = i2;
                            view = view3;
                            i6 = i44;
                            int i46 = i45;
                            if (flexItem.getWidth() == -1) {
                                C3787a aVar = this.f11947a;
                                view.measure(aVar.mo11459c(i14, aVar.getPaddingLeft() + this.f11947a.getPaddingRight() + flexItem.mo11443Y0() + flexItem.mo11453r1() + i29, flexItem.getWidth()), i46);
                                m14246i(view, i6);
                            }
                        } else if (flexItem.getHeight() == -1) {
                            C3787a aVar2 = this.f11947a;
                            i14 = i2;
                            i6 = i44;
                            view = view3;
                            view.measure(i45, aVar2.mo11462e(i14, aVar2.getPaddingTop() + this.f11947a.getPaddingBottom() + flexItem.mo11447h0() + flexItem.mo11442W0() + i29, flexItem.getHeight()));
                            m14246i(view, i6);
                        } else {
                            i14 = i2;
                            view = view3;
                            i6 = i44;
                        }
                        bVar4 = new C3788b();
                        z2 = true;
                        bVar4.f11936h = 1;
                        i13 = i38;
                        bVar4.f11933e = i13;
                        bVar4.f11943o = i6;
                        i17 = Integer.MIN_VALUE;
                        i18 = 0;
                    } else {
                        i14 = i2;
                        view = view3;
                        i6 = i44;
                        bVar4 = bVar5;
                        i13 = i38;
                        z2 = true;
                        bVar4.f11936h++;
                        i18 = i33 + 1;
                        i29 = i36;
                        i17 = i28;
                    }
                    boolean z6 = bVar4.f11945q;
                    if (flexItem.mo11450n0() != Utils.FLOAT_EPSILON) {
                        z3 = z2;
                    } else {
                        z3 = false;
                    }
                    bVar4.f11945q = z6 | z3;
                    boolean z7 = bVar4.f11946r;
                    if (flexItem.mo11451o() != Utils.FLOAT_EPSILON) {
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    bVar4.f11946r = z7 | z4;
                    int[] iArr = this.f11949c;
                    if (iArr != null) {
                        iArr[i6] = list2.size();
                    }
                    bVar4.f11933e += m14237M(view, k) + m14229E(flexItem, k) + m14227C(flexItem, k);
                    bVar4.f11938j += flexItem.mo11450n0();
                    bVar4.f11939k += flexItem.mo11451o();
                    this.f11947a.mo11458b(view, i6, i18, bVar4);
                    int max = Math.max(i17, m14236L(view, k) + m14228D(flexItem, k) + m14226B(flexItem, k) + this.f11947a.mo11463f(view));
                    bVar4.f11935g = Math.max(bVar4.f11935g, max);
                    if (k) {
                        if (this.f11947a.getFlexWrap() != 2) {
                            bVar4.f11940l = Math.max(bVar4.f11940l, view.getBaseline() + flexItem.mo11447h0());
                        } else {
                            bVar4.f11940l = Math.max(bVar4.f11940l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.mo11442W0());
                        }
                    }
                    i15 = i34;
                    if (m14238N(i6, i15, bVar4)) {
                        m14245a(list2, bVar4, i6, i29);
                        i29 += bVar4.f11935g;
                    }
                    i12 = i5;
                    if (i12 == -1 || list2.size() <= 0 || ((C3788b) list2.get(list2.size() - (z2 ? 1 : 0))).f11944p < i12 || i6 < i12 || z5) {
                        i19 = i3;
                    } else {
                        i29 = -bVar4.mo11540a();
                        i19 = i3;
                        z5 = z2;
                    }
                    if (i29 > i19 && z5) {
                        bVar2 = bVar;
                        i7 = i32;
                        break;
                    }
                    i33 = i18;
                    i28 = max;
                    i26 = i6 + 1;
                    C3791b bVar7 = bVar;
                    i23 = i;
                    flexItemCount = i15;
                    i24 = i14;
                    i27 = i13;
                    arrayList = list2;
                    size = i9;
                    i25 = i12;
                    mode = i8;
                } else {
                    bVar4.f11937i++;
                    bVar4.f11936h++;
                    if (m14238N(i6, flexItemCount, bVar4)) {
                        m14245a(arrayList, bVar4, i6, i29);
                    }
                }
            } else if (m14238N(i6, flexItemCount, bVar4)) {
                m14245a(arrayList, bVar4, i6, i29);
            }
            int i47 = i3;
            i9 = size;
            i8 = mode;
            i14 = i24;
            i12 = i25;
            list2 = arrayList;
            i13 = i27;
            i15 = flexItemCount;
            i26 = i6 + 1;
            C3791b bVar72 = bVar;
            i23 = i;
            flexItemCount = i15;
            i24 = i14;
            i27 = i13;
            arrayList = list2;
            size = i9;
            i25 = i12;
            mode = i8;
        }
        bVar2.f11953b = i7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11551c(C3791b bVar, int i, int i2) {
        mo11550b(bVar, i, i2, Integer.MAX_VALUE, 0, -1, (List) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11552d(C3791b bVar, int i, int i2, int i3, int i4, List list) {
        mo11550b(bVar, i, i2, i3, i4, -1, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo11553e(C3791b bVar, int i, int i2, int i3, int i4, List list) {
        mo11550b(bVar, i, i2, i3, 0, i4, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11554f(C3791b bVar, int i, int i2) {
        mo11550b(bVar, i2, i, Integer.MAX_VALUE, 0, -1, (List) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo11555g(C3791b bVar, int i, int i2, int i3, int i4, List list) {
        mo11550b(bVar, i2, i, i3, i4, -1, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo11556h(C3791b bVar, int i, int i2, int i3, int i4, List list) {
        mo11550b(bVar, i2, i, i3, 0, i4, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo11557j(List list, int i) {
        int i2 = this.f11949c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.f11949c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f11950d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int[] mo11558m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f11947a.getFlexItemCount();
        return m14241U(flexItemCount, m14248l(flexItemCount), sparseIntArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int[] mo11559n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f11947a.getFlexItemCount();
        List l = m14248l(flexItemCount);
        C3792c cVar = new C3792c();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            cVar.f11955e = 1;
        } else {
            cVar.f11955e = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount) {
            cVar.f11954d = flexItemCount;
        } else if (i < this.f11947a.getFlexItemCount()) {
            cVar.f11954d = i;
            while (i < flexItemCount) {
                ((C3792c) l.get(i)).f11954d++;
                i++;
            }
        } else {
            cVar.f11954d = flexItemCount;
        }
        l.add(cVar);
        return m14241U(flexItemCount + 1, l, sparseIntArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo11560o(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.f11947a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        }
        List<C3788b> flexLinesInternal = this.f11947a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.f11947a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                ((C3788b) flexLinesInternal.get(0)).f11935g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f11947a.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    C3788b bVar = new C3788b();
                    bVar.f11935g = i7;
                    flexLinesInternal.add(0, bVar);
                } else if (alignContent == 2) {
                    this.f11947a.setFlexLines(m14247k(flexLinesInternal, i5, sumOfCrossSize));
                } else if (alignContent != 3) {
                    if (alignContent != 4) {
                        if (alignContent == 5 && sumOfCrossSize < i5) {
                            float size2 = ((float) (i5 - sumOfCrossSize)) / ((float) flexLinesInternal.size());
                            int size3 = flexLinesInternal.size();
                            float f = 0.0f;
                            while (i6 < size3) {
                                C3788b bVar2 = (C3788b) flexLinesInternal.get(i6);
                                float f2 = ((float) bVar2.f11935g) + size2;
                                if (i6 == flexLinesInternal.size() - 1) {
                                    f2 += f;
                                    f = 0.0f;
                                }
                                int round = Math.round(f2);
                                f += f2 - ((float) round);
                                if (f > 1.0f) {
                                    round++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    round--;
                                    f += 1.0f;
                                }
                                bVar2.f11935g = round;
                                i6++;
                            }
                        }
                    } else if (sumOfCrossSize >= i5) {
                        this.f11947a.setFlexLines(m14247k(flexLinesInternal, i5, sumOfCrossSize));
                    } else {
                        int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        C3788b bVar3 = new C3788b();
                        bVar3.f11935g = size4;
                        for (C3788b add : flexLinesInternal) {
                            arrayList.add(bVar3);
                            arrayList.add(add);
                            arrayList.add(bVar3);
                        }
                        this.f11947a.setFlexLines(arrayList);
                    }
                } else if (sumOfCrossSize < i5) {
                    float size5 = ((float) (i5 - sumOfCrossSize)) / ((float) (flexLinesInternal.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i6 < size6) {
                        arrayList2.add((C3788b) flexLinesInternal.get(i6));
                        if (i6 != flexLinesInternal.size() - 1) {
                            C3788b bVar4 = new C3788b();
                            if (i6 == flexLinesInternal.size() - 2) {
                                bVar4.f11935g = Math.round(f3 + size5);
                                f3 = 0.0f;
                            } else {
                                bVar4.f11935g = Math.round(size5);
                            }
                            int i8 = bVar4.f11935g;
                            f3 += size5 - ((float) i8);
                            if (f3 > 1.0f) {
                                bVar4.f11935g = i8 + 1;
                                f3 -= 1.0f;
                            } else if (f3 < -1.0f) {
                                bVar4.f11935g = i8 - 1;
                                f3 += 1.0f;
                            }
                            arrayList2.add(bVar4);
                        }
                        i6++;
                    }
                    this.f11947a.setFlexLines(arrayList2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo11561p(int i, int i2) {
        mo11562q(i, i2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo11562q(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        m14249r(this.f11947a.getFlexItemCount());
        if (i3 < this.f11947a.getFlexItemCount()) {
            int flexDirection = this.f11947a.getFlexDirection();
            int flexDirection2 = this.f11947a.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int largestMainSize = this.f11947a.getLargestMainSize();
                if (mode != 1073741824 && largestMainSize <= size) {
                    size = largestMainSize;
                }
                i6 = this.f11947a.getPaddingLeft();
                i4 = this.f11947a.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.f11947a.getLargestMainSize();
                }
                i6 = this.f11947a.getPaddingTop();
                i4 = this.f11947a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int i8 = i6 + i4;
            int[] iArr = this.f11949c;
            if (iArr != null) {
                i7 = iArr[i3];
            } else {
                i7 = 0;
            }
            List flexLinesInternal = this.f11947a.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            while (i7 < size2) {
                C3788b bVar = (C3788b) flexLinesInternal.get(i7);
                int i9 = bVar.f11933e;
                if (i9 < i5 && bVar.f11945q) {
                    m14251w(i, i2, bVar, i5, i8, false);
                } else if (i9 > i5 && bVar.f11946r) {
                    m14240T(i, i2, bVar, i5, i8, false);
                }
                i7++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo11563s(int i) {
        int[] iArr = this.f11949c;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f11949c = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f11949c = Arrays.copyOf(iArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo11564t(int i) {
        long[] jArr = this.f11950d;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f11950d = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f11950d = Arrays.copyOf(jArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo11565u(int i) {
        long[] jArr = this.f11951e;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f11951e = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f11951e = Arrays.copyOf(jArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo11566x(long j) {
        return (int) (j >> 32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public int mo11567y(long j) {
        return (int) j;
    }
}
