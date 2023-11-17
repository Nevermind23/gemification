package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.flexbox.C3789c;
import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayout extends ViewGroup implements C3787a {

    /* renamed from: d */
    private int f11846d;

    /* renamed from: e */
    private int f11847e;

    /* renamed from: f */
    private int f11848f;

    /* renamed from: g */
    private int f11849g;

    /* renamed from: h */
    private int f11850h;

    /* renamed from: i */
    private int f11851i;

    /* renamed from: j */
    private Drawable f11852j;

    /* renamed from: k */
    private Drawable f11853k;

    /* renamed from: l */
    private int f11854l;

    /* renamed from: m */
    private int f11855m;

    /* renamed from: n */
    private int f11856n;

    /* renamed from: o */
    private int f11857o;

    /* renamed from: p */
    private int[] f11858p;

    /* renamed from: q */
    private SparseIntArray f11859q;

    /* renamed from: r */
    private C3789c f11860r;

    /* renamed from: s */
    private List f11861s;

    /* renamed from: t */
    private C3789c.C3791b f11862t;

    public FlexboxLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private void m14000A() {
        if (this.f11852j == null && this.f11853k == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* renamed from: a */
    private boolean m14001a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (((C3788b) this.f11861s.get(i2)).mo11542c() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    private boolean m14002l(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View r = mo11490r(i - i3);
            if (r != null && r.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    private void m14003m(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f11861s.size();
        for (int i5 = 0; i5 < size; i5++) {
            C3788b bVar = (C3788b) this.f11861s.get(i5);
            for (int i6 = 0; i6 < bVar.f11936h; i6++) {
                int i7 = bVar.f11943o + i6;
                View r = mo11490r(i7);
                if (!(r == null || r.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) r.getLayoutParams();
                    if (m14007s(i7, i6)) {
                        if (z) {
                            i4 = r.getRight() + layoutParams.rightMargin;
                        } else {
                            i4 = (r.getLeft() - layoutParams.leftMargin) - this.f11857o;
                        }
                        m14006p(canvas, i4, bVar.f11930b, bVar.f11935g);
                    }
                    if (i6 == bVar.f11936h - 1 && (this.f11855m & 4) > 0) {
                        if (z) {
                            i3 = (r.getLeft() - layoutParams.leftMargin) - this.f11857o;
                        } else {
                            i3 = r.getRight() + layoutParams.rightMargin;
                        }
                        m14006p(canvas, i3, bVar.f11930b, bVar.f11935g);
                    }
                }
            }
            if (m14008t(i5)) {
                if (z2) {
                    i2 = bVar.f11932d;
                } else {
                    i2 = bVar.f11930b - this.f11856n;
                }
                m14005o(canvas, paddingLeft, i2, max);
            }
            if (m14009u(i5) && (this.f11854l & 4) > 0) {
                if (z2) {
                    i = bVar.f11930b - this.f11856n;
                } else {
                    i = bVar.f11932d;
                }
                m14005o(canvas, paddingLeft, i, max);
            }
        }
    }

    /* renamed from: n */
    private void m14004n(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f11861s.size();
        for (int i5 = 0; i5 < size; i5++) {
            C3788b bVar = (C3788b) this.f11861s.get(i5);
            for (int i6 = 0; i6 < bVar.f11936h; i6++) {
                int i7 = bVar.f11943o + i6;
                View r = mo11490r(i7);
                if (!(r == null || r.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) r.getLayoutParams();
                    if (m14007s(i7, i6)) {
                        if (z2) {
                            i4 = r.getBottom() + layoutParams.bottomMargin;
                        } else {
                            i4 = (r.getTop() - layoutParams.topMargin) - this.f11856n;
                        }
                        m14005o(canvas, bVar.f11929a, i4, bVar.f11935g);
                    }
                    if (i6 == bVar.f11936h - 1 && (this.f11854l & 4) > 0) {
                        if (z2) {
                            i3 = (r.getTop() - layoutParams.topMargin) - this.f11856n;
                        } else {
                            i3 = r.getBottom() + layoutParams.bottomMargin;
                        }
                        m14005o(canvas, bVar.f11929a, i3, bVar.f11935g);
                    }
                }
            }
            if (m14008t(i5)) {
                if (z) {
                    i2 = bVar.f11931c;
                } else {
                    i2 = bVar.f11929a - this.f11857o;
                }
                m14006p(canvas, i2, paddingTop, max);
            }
            if (m14009u(i5) && (this.f11855m & 4) > 0) {
                if (z) {
                    i = bVar.f11929a - this.f11857o;
                } else {
                    i = bVar.f11931c;
                }
                m14006p(canvas, i, paddingTop, max);
            }
        }
    }

    /* renamed from: o */
    private void m14005o(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f11852j;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.f11856n + i2);
            this.f11852j.draw(canvas);
        }
    }

    /* renamed from: p */
    private void m14006p(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f11853k;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.f11857o + i, i3 + i2);
            this.f11853k.draw(canvas);
        }
    }

    /* renamed from: s */
    private boolean m14007s(int i, int i2) {
        if (m14002l(i, i2)) {
            if (mo11485k()) {
                if ((this.f11855m & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f11854l & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (mo11485k()) {
            if ((this.f11855m & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f11854l & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m14008t(int i) {
        if (i < 0 || i >= this.f11861s.size()) {
            return false;
        }
        if (m14001a(i)) {
            if (mo11485k()) {
                if ((this.f11854l & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f11855m & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (mo11485k()) {
            if ((this.f11854l & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f11855m & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: u */
    private boolean m14009u(int i) {
        if (i < 0 || i >= this.f11861s.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f11861s.size(); i2++) {
            if (((C3788b) this.f11861s.get(i2)).mo11542c() > 0) {
                return false;
            }
        }
        if (mo11485k()) {
            if ((this.f11854l & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f11855m & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fd  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14010v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingLeft()
            int r2 = r28.getPaddingRight()
            int r3 = r33 - r31
            int r4 = r32 - r30
            int r5 = r28.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r28.getPaddingTop()
            java.util.List r6 = r0.f11861s
            int r6 = r6.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r6) goto L_0x022c
            java.util.List r9 = r0.f11861s
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.b r9 = (com.google.android.flexbox.C3788b) r9
            boolean r10 = r0.m14008t(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f11856n
            int r3 = r3 - r10
            int r5 = r5 + r10
        L_0x0032:
            int r10 = r0.f11848f
            r15 = 4
            r14 = 2
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L_0x00c7
            if (r10 == r13) goto L_0x00bd
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x00ab
            r7 = 3
            if (r10 == r7) goto L_0x0093
            if (r10 == r15) goto L_0x007a
            r7 = 5
            if (r10 != r7) goto L_0x0061
            int r7 = r9.mo11542c()
            if (r7 == 0) goto L_0x0058
            int r10 = r9.f11933e
            int r10 = r4 - r10
            float r10 = (float) r10
            int r7 = r7 + 1
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0059
        L_0x0058:
            r10 = r11
        L_0x0059:
            float r7 = (float) r1
            float r7 = r7 + r10
            int r12 = r4 - r2
            float r12 = (float) r12
            float r12 = r12 - r10
            goto L_0x00cc
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f11848f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007a:
            int r7 = r9.mo11542c()
            if (r7 == 0) goto L_0x0088
            int r10 = r9.f11933e
            int r10 = r4 - r10
            float r10 = (float) r10
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0089
        L_0x0088:
            r10 = r11
        L_0x0089:
            float r7 = (float) r1
            float r12 = r10 / r12
            float r7 = r7 + r12
            int r14 = r4 - r2
            float r14 = (float) r14
            float r12 = r14 - r12
            goto L_0x00cc
        L_0x0093:
            float r7 = (float) r1
            int r10 = r9.mo11542c()
            if (r10 == r13) goto L_0x009e
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x00a0
        L_0x009e:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00a0:
            int r12 = r9.f11933e
            int r12 = r4 - r12
            float r12 = (float) r12
            float r10 = r12 / r10
            int r12 = r4 - r2
            float r12 = (float) r12
            goto L_0x00cc
        L_0x00ab:
            float r7 = (float) r1
            int r10 = r9.f11933e
            int r14 = r4 - r10
            float r14 = (float) r14
            float r14 = r14 / r12
            float r7 = r7 + r14
            int r14 = r4 - r2
            float r14 = (float) r14
            int r10 = r4 - r10
            float r10 = (float) r10
            float r10 = r10 / r12
            float r12 = r14 - r10
            goto L_0x00cb
        L_0x00bd:
            int r7 = r9.f11933e
            int r10 = r4 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            float r12 = (float) r7
            r7 = r10
            goto L_0x00cb
        L_0x00c7:
            float r7 = (float) r1
            int r10 = r4 - r2
            float r12 = (float) r10
        L_0x00cb:
            r10 = r11
        L_0x00cc:
            float r17 = java.lang.Math.max(r10, r11)
            r14 = 0
        L_0x00d1:
            int r10 = r9.f11936h
            if (r14 >= r10) goto L_0x0220
            int r10 = r9.f11943o
            int r10 = r10 + r14
            android.view.View r18 = r0.mo11490r(r10)
            if (r18 == 0) goto L_0x020c
            int r11 = r18.getVisibility()
            r15 = 8
            if (r11 != r15) goto L_0x00f2
            r23 = r1
            r26 = r13
            r22 = r14
            r25 = 2
            r27 = 4
            goto L_0x0216
        L_0x00f2:
            android.view.ViewGroup$LayoutParams r11 = r18.getLayoutParams()
            r15 = r11
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r11 = r15.leftMargin
            float r11 = (float) r11
            float r7 = r7 + r11
            int r11 = r15.rightMargin
            float r11 = (float) r11
            float r12 = r12 - r11
            boolean r10 = r0.m14007s(r10, r14)
            if (r10 == 0) goto L_0x0111
            int r10 = r0.f11857o
            float r11 = (float) r10
            float r7 = r7 + r11
            float r12 = r12 - r11
            r20 = r10
            r19 = r12
            goto L_0x0115
        L_0x0111:
            r19 = r12
            r20 = 0
        L_0x0115:
            int r10 = r9.f11936h
            int r10 = r10 - r13
            if (r14 != r10) goto L_0x0127
            int r10 = r0.f11855m
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0129
            int r10 = r0.f11857o
            r21 = r10
            goto L_0x012b
        L_0x0127:
            r16 = 4
        L_0x0129:
            r21 = 0
        L_0x012b:
            int r10 = r0.f11847e
            r12 = 2
            if (r10 != r12) goto L_0x018d
            if (r29 == 0) goto L_0x0163
            com.google.android.flexbox.c r10 = r0.f11860r
            int r11 = java.lang.Math.round(r19)
            int r22 = r18.getMeasuredWidth()
            int r22 = r11 - r22
            int r11 = r18.getMeasuredHeight()
            int r23 = r3 - r11
            int r24 = java.lang.Math.round(r19)
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = r13
            r13 = r22
            r22 = r14
            r14 = r23
            r23 = r1
            r1 = r15
            r27 = r16
            r15 = r24
            r16 = r3
            r10.mo11545Q(r11, r12, r13, r14, r15, r16)
            goto L_0x01d5
        L_0x0163:
            r23 = r1
            r25 = r12
            r26 = r13
            r22 = r14
            r1 = r15
            r27 = r16
            com.google.android.flexbox.c r10 = r0.f11860r
            int r13 = java.lang.Math.round(r7)
            int r11 = r18.getMeasuredHeight()
            int r14 = r3 - r11
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r3
            r10.mo11545Q(r11, r12, r13, r14, r15, r16)
            goto L_0x01d5
        L_0x018d:
            r23 = r1
            r25 = r12
            r26 = r13
            r22 = r14
            r1 = r15
            r27 = r16
            if (r29 == 0) goto L_0x01b8
            com.google.android.flexbox.c r10 = r0.f11860r
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredWidth()
            int r13 = r11 - r12
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.mo11545Q(r11, r12, r13, r14, r15, r16)
            goto L_0x01d5
        L_0x01b8:
            com.google.android.flexbox.c r10 = r0.f11860r
            int r13 = java.lang.Math.round(r7)
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.mo11545Q(r11, r12, r13, r14, r15, r16)
        L_0x01d5:
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r11 = r1.rightMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r7 = r7 + r10
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r10 = r10 + r1
            float r19 = r19 - r10
            if (r29 == 0) goto L_0x01fd
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r21
            r14 = r20
            r10.mo11543d(r11, r12, r13, r14, r15)
            goto L_0x0209
        L_0x01fd:
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r20
            r14 = r21
            r10.mo11543d(r11, r12, r13, r14, r15)
        L_0x0209:
            r12 = r19
            goto L_0x0216
        L_0x020c:
            r23 = r1
            r26 = r13
            r22 = r14
            r27 = r15
            r25 = 2
        L_0x0216:
            int r14 = r22 + 1
            r1 = r23
            r13 = r26
            r15 = r27
            goto L_0x00d1
        L_0x0220:
            r23 = r1
            int r1 = r9.f11935g
            int r5 = r5 + r1
            int r3 = r3 - r1
            int r8 = r8 + 1
            r1 = r23
            goto L_0x001e
        L_0x022c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m14010v(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f5  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14011w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            r29 = this;
            r0 = r29
            int r1 = r29.getPaddingTop()
            int r2 = r29.getPaddingBottom()
            int r3 = r29.getPaddingRight()
            int r4 = r29.getPaddingLeft()
            int r5 = r34 - r32
            int r6 = r35 - r33
            int r5 = r5 - r3
            java.util.List r3 = r0.f11861s
            int r3 = r3.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r3) goto L_0x021c
            java.util.List r9 = r0.f11861s
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.b r9 = (com.google.android.flexbox.C3788b) r9
            boolean r10 = r0.m14008t(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f11857o
            int r4 = r4 + r10
            int r5 = r5 - r10
        L_0x0032:
            int r10 = r0.f11848f
            r15 = 4
            r11 = 0
            r14 = 1
            if (r10 == 0) goto L_0x00c5
            if (r10 == r14) goto L_0x00bd
            r12 = 2
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x00aa
            r12 = 3
            if (r10 == r12) goto L_0x0093
            if (r10 == r15) goto L_0x007a
            r12 = 5
            if (r10 != r12) goto L_0x0061
            int r10 = r9.mo11542c()
            if (r10 == 0) goto L_0x0058
            int r12 = r9.f11933e
            int r12 = r6 - r12
            float r12 = (float) r12
            int r10 = r10 + 1
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0059
        L_0x0058:
            r12 = r11
        L_0x0059:
            float r10 = (float) r1
            float r10 = r10 + r12
            int r13 = r6 - r2
            float r13 = (float) r13
            float r13 = r13 - r12
            goto L_0x00ca
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f11848f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007a:
            int r10 = r9.mo11542c()
            if (r10 == 0) goto L_0x0088
            int r12 = r9.f11933e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0089
        L_0x0088:
            r12 = r11
        L_0x0089:
            float r10 = (float) r1
            float r13 = r12 / r13
            float r10 = r10 + r13
            int r7 = r6 - r2
            float r7 = (float) r7
            float r13 = r7 - r13
            goto L_0x00ca
        L_0x0093:
            float r10 = (float) r1
            int r7 = r9.mo11542c()
            if (r7 == r14) goto L_0x009e
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x00a0
        L_0x009e:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x00a0:
            int r12 = r9.f11933e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r12 = r12 / r7
            int r7 = r6 - r2
            float r13 = (float) r7
            goto L_0x00ca
        L_0x00aa:
            float r7 = (float) r1
            int r10 = r9.f11933e
            int r12 = r6 - r10
            float r12 = (float) r12
            float r12 = r12 / r13
            float r7 = r7 + r12
            int r12 = r6 - r2
            float r12 = (float) r12
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r13 = r12 - r10
            r10 = r7
            goto L_0x00c9
        L_0x00bd:
            int r7 = r9.f11933e
            int r10 = r6 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            goto L_0x00c8
        L_0x00c5:
            float r10 = (float) r1
            int r7 = r6 - r2
        L_0x00c8:
            float r13 = (float) r7
        L_0x00c9:
            r12 = r11
        L_0x00ca:
            float r7 = java.lang.Math.max(r12, r11)
            r12 = 0
        L_0x00cf:
            int r11 = r9.f11936h
            if (r12 >= r11) goto L_0x0214
            int r11 = r9.f11943o
            int r11 = r11 + r12
            android.view.View r18 = r0.mo11490r(r11)
            if (r18 == 0) goto L_0x0206
            int r15 = r18.getVisibility()
            r14 = 8
            if (r15 != r14) goto L_0x00ec
            r25 = r12
            r26 = 1
            r28 = 4
            goto L_0x020c
        L_0x00ec:
            android.view.ViewGroup$LayoutParams r14 = r18.getLayoutParams()
            r15 = r14
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r14 = r15.topMargin
            float r14 = (float) r14
            float r10 = r10 + r14
            int r14 = r15.bottomMargin
            float r14 = (float) r14
            float r13 = r13 - r14
            boolean r11 = r0.m14007s(r11, r12)
            if (r11 == 0) goto L_0x010d
            int r11 = r0.f11856n
            float r14 = (float) r11
            float r10 = r10 + r14
            float r13 = r13 - r14
            r19 = r10
            r21 = r11
            r20 = r13
            goto L_0x0113
        L_0x010d:
            r19 = r10
            r20 = r13
            r21 = 0
        L_0x0113:
            int r10 = r9.f11936h
            r14 = 1
            int r10 = r10 - r14
            if (r12 != r10) goto L_0x0126
            int r10 = r0.f11854l
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0128
            int r10 = r0.f11856n
            r22 = r10
            goto L_0x012a
        L_0x0126:
            r16 = 4
        L_0x0128:
            r22 = 0
        L_0x012a:
            if (r30 == 0) goto L_0x0185
            if (r31 == 0) goto L_0x015d
            com.google.android.flexbox.c r10 = r0.f11860r
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r17 = r5 - r11
            int r11 = java.lang.Math.round(r20)
            int r23 = r18.getMeasuredHeight()
            int r23 = r11 - r23
            int r24 = java.lang.Math.round(r20)
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = r14
            r14 = r17
            r27 = r15
            r28 = r16
            r15 = r23
            r16 = r5
            r17 = r24
            r10.mo11546R(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cc
        L_0x015d:
            r25 = r12
            r26 = r14
            r27 = r15
            r28 = r16
            com.google.android.flexbox.c r10 = r0.f11860r
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r14 = r5 - r11
            int r15 = java.lang.Math.round(r19)
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r5
            r10.mo11546R(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cc
        L_0x0185:
            r25 = r12
            r26 = r14
            r27 = r15
            r28 = r16
            if (r31 == 0) goto L_0x01ae
            com.google.android.flexbox.c r10 = r0.f11860r
            r13 = 0
            int r11 = java.lang.Math.round(r20)
            int r12 = r18.getMeasuredHeight()
            int r15 = r11 - r12
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r17 = java.lang.Math.round(r20)
            r11 = r18
            r12 = r9
            r14 = r4
            r10.mo11546R(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01cc
        L_0x01ae:
            com.google.android.flexbox.c r10 = r0.f11860r
            r13 = 0
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r14 = r4
            r10.mo11546R(r11, r12, r13, r14, r15, r16, r17)
        L_0x01cc:
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            r14 = r27
            int r11 = r14.bottomMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r19 = r19 + r10
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r11 = r14.topMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r20 = r20 - r10
            if (r31 == 0) goto L_0x01f5
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r22
            r15 = r21
            r10.mo11543d(r11, r12, r13, r14, r15)
            goto L_0x0201
        L_0x01f5:
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r21
            r15 = r22
            r10.mo11543d(r11, r12, r13, r14, r15)
        L_0x0201:
            r10 = r19
            r13 = r20
            goto L_0x020c
        L_0x0206:
            r25 = r12
            r26 = r14
            r28 = r15
        L_0x020c:
            int r12 = r25 + 1
            r14 = r26
            r15 = r28
            goto L_0x00cf
        L_0x0214:
            int r7 = r9.f11935g
            int r4 = r4 + r7
            int r5 = r5 - r7
            int r8 = r8 + 1
            goto L_0x001e
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.m14011w(boolean, boolean, int, int, int, int):void");
    }

    /* renamed from: x */
    private void m14012x(int i, int i2) {
        this.f11861s.clear();
        this.f11862t.mo11568a();
        this.f11860r.mo11551c(this.f11862t, i, i2);
        this.f11861s = this.f11862t.f11952a;
        this.f11860r.mo11561p(i, i2);
        if (this.f11849g == 3) {
            for (C3788b bVar : this.f11861s) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < bVar.f11936h; i4++) {
                    View r = mo11490r(bVar.f11943o + i4);
                    if (!(r == null || r.getVisibility() == 8)) {
                        LayoutParams layoutParams = (LayoutParams) r.getLayoutParams();
                        if (this.f11847e != 2) {
                            i3 = Math.max(i3, r.getMeasuredHeight() + Math.max(bVar.f11940l - r.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin);
                        } else {
                            i3 = Math.max(i3, r.getMeasuredHeight() + layoutParams.topMargin + Math.max((bVar.f11940l - r.getMeasuredHeight()) + r.getBaseline(), layoutParams.bottomMargin));
                        }
                    }
                }
                bVar.f11935g = i3;
            }
        }
        this.f11860r.mo11560o(i, i2, getPaddingTop() + getPaddingBottom());
        this.f11860r.mo11548X();
        m14014z(this.f11846d, i, i2, this.f11862t.f11953b);
    }

    /* renamed from: y */
    private void m14013y(int i, int i2) {
        this.f11861s.clear();
        this.f11862t.mo11568a();
        this.f11860r.mo11554f(this.f11862t, i, i2);
        this.f11861s = this.f11862t.f11952a;
        this.f11860r.mo11561p(i, i2);
        this.f11860r.mo11560o(i, i2, getPaddingLeft() + getPaddingRight());
        this.f11860r.mo11548X();
        m14014z(this.f11846d, i, i2, this.f11862t.f11953b);
    }

    /* renamed from: z */
    private void m14014z(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i5 = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            i6 = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            i5 = getLargestMainSize();
            i6 = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = i6;
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i7 = View.resolveSizeAndState(i6, i2, i4);
        } else if (mode == 1073741824) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, C11398b.f33139r);
            } else {
                size2 = i5;
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            i8 = View.resolveSizeAndState(i5, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, C11398b.f33139r);
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(i7, i8);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f11859q == null) {
            this.f11859q = new SparseIntArray(getChildCount());
        }
        this.f11858p = this.f11860r.mo11559n(view, i, layoutParams, this.f11859q);
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public void mo11458b(View view, int i, int i2, C3788b bVar) {
        if (!m14007s(i, i2)) {
            return;
        }
        if (mo11485k()) {
            int i3 = bVar.f11933e;
            int i4 = this.f11857o;
            bVar.f11933e = i3 + i4;
            bVar.f11934f += i4;
            return;
        }
        int i5 = bVar.f11933e;
        int i6 = this.f11856n;
        bVar.f11933e = i5 + i6;
        bVar.f11934f += i6;
    }

    /* renamed from: c */
    public int mo11459c(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public View mo11461d(int i) {
        return getChildAt(i);
    }

    /* renamed from: e */
    public int mo11462e(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: f */
    public int mo11463f(View view) {
        return 0;
    }

    /* renamed from: g */
    public void mo11464g(C3788b bVar) {
        if (mo11485k()) {
            if ((this.f11855m & 4) > 0) {
                int i = bVar.f11933e;
                int i2 = this.f11857o;
                bVar.f11933e = i + i2;
                bVar.f11934f += i2;
            }
        } else if ((this.f11854l & 4) > 0) {
            int i3 = bVar.f11933e;
            int i4 = this.f11856n;
            bVar.f11933e = i3 + i4;
            bVar.f11934f += i4;
        }
    }

    public int getAlignContent() {
        return this.f11850h;
    }

    public int getAlignItems() {
        return this.f11849g;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f11852j;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f11853k;
    }

    public int getFlexDirection() {
        return this.f11846d;
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C3788b> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f11861s.size());
        for (C3788b bVar : this.f11861s) {
            if (bVar.mo11542c() != 0) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public List<C3788b> getFlexLinesInternal() {
        return this.f11861s;
    }

    public int getFlexWrap() {
        return this.f11847e;
    }

    public int getJustifyContent() {
        return this.f11848f;
    }

    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (C3788b bVar : this.f11861s) {
            i = Math.max(i, bVar.f11933e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.f11851i;
    }

    public int getShowDividerHorizontal() {
        return this.f11854l;
    }

    public int getShowDividerVertical() {
        return this.f11855m;
    }

    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.f11861s.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C3788b bVar = (C3788b) this.f11861s.get(i4);
            if (m14008t(i4)) {
                if (mo11485k()) {
                    i2 = this.f11856n;
                } else {
                    i2 = this.f11857o;
                }
                i3 += i2;
            }
            if (m14009u(i4)) {
                if (mo11485k()) {
                    i = this.f11856n;
                } else {
                    i = this.f11857o;
                }
                i3 += i;
            }
            i3 += bVar.f11935g;
        }
        return i3;
    }

    /* renamed from: h */
    public View mo11482h(int i) {
        return mo11490r(i);
    }

    /* renamed from: i */
    public void mo11483i(int i, View view) {
    }

    /* renamed from: j */
    public int mo11484j(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (mo11485k()) {
            if (m14007s(i, i2)) {
                i4 = 0 + this.f11857o;
            }
            if ((this.f11855m & 4) <= 0) {
                return i4;
            }
            i3 = this.f11857o;
        } else {
            if (m14007s(i, i2)) {
                i4 = 0 + this.f11856n;
            }
            if ((this.f11854l & 4) <= 0) {
                return i4;
            }
            i3 = this.f11856n;
        }
        return i4 + i3;
    }

    /* renamed from: k */
    public boolean mo11485k() {
        int i = this.f11846d;
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f11853k != null || this.f11852j != null) {
            if (this.f11854l != 0 || this.f11855m != 0) {
                int B = ViewCompat.m3541B(this);
                int i = this.f11846d;
                boolean z3 = false;
                boolean z4 = true;
                if (i == 0) {
                    if (B == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.f11847e == 2) {
                        z3 = true;
                    }
                    m14003m(canvas, z, z3);
                } else if (i == 1) {
                    if (B != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.f11847e == 2) {
                        z3 = true;
                    }
                    m14003m(canvas, z2, z3);
                } else if (i == 2) {
                    if (B != 1) {
                        z4 = false;
                    }
                    if (this.f11847e == 2) {
                        z4 = !z4;
                    }
                    m14004n(canvas, z4, false);
                } else if (i == 3) {
                    if (B == 1) {
                        z3 = true;
                    }
                    if (this.f11847e == 2) {
                        z3 = !z3;
                    }
                    m14004n(canvas, z3, true);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int B = ViewCompat.m3541B(this);
        int i5 = this.f11846d;
        boolean z6 = false;
        if (i5 == 0) {
            if (B == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            m14010v(z2, i, i2, i3, i4);
        } else if (i5 == 1) {
            if (B != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            m14010v(z3, i, i2, i3, i4);
        } else if (i5 == 2) {
            if (B == 1) {
                z6 = true;
            }
            if (this.f11847e == 2) {
                z4 = !z6;
            } else {
                z4 = z6;
            }
            m14011w(z4, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            if (B == 1) {
                z6 = true;
            }
            if (this.f11847e == 2) {
                z5 = !z6;
            } else {
                z5 = z6;
            }
            m14011w(z5, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f11846d);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f11859q == null) {
            this.f11859q = new SparseIntArray(getChildCount());
        }
        if (this.f11860r.mo11544O(this.f11859q)) {
            this.f11858p = this.f11860r.mo11558m(this.f11859q);
        }
        int i3 = this.f11846d;
        if (i3 == 0 || i3 == 1) {
            m14012x(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            m14013y(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f11846d);
        }
    }

    /* renamed from: q */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: r */
    public View mo11490r(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f11858p;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public void setAlignContent(int i) {
        if (this.f11850h != i) {
            this.f11850h = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f11849g != i) {
            this.f11849g = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.f11852j) {
            this.f11852j = drawable;
            if (drawable != null) {
                this.f11856n = drawable.getIntrinsicHeight();
            } else {
                this.f11856n = 0;
            }
            m14000A();
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.f11853k) {
            this.f11853k = drawable;
            if (drawable != null) {
                this.f11857o = drawable.getIntrinsicWidth();
            } else {
                this.f11857o = 0;
            }
            m14000A();
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.f11846d != i) {
            this.f11846d = i;
            requestLayout();
        }
    }

    public void setFlexLines(List<C3788b> list) {
        this.f11861s = list;
    }

    public void setFlexWrap(int i) {
        if (this.f11847e != i) {
            this.f11847e = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f11848f != i) {
            this.f11848f = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f11851i != i) {
            this.f11851i = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f11854l) {
            this.f11854l = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f11855m) {
            this.f11855m = i;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11851i = -1;
        this.f11860r = new C3789c(this);
        this.f11861s = new ArrayList();
        this.f11862t = new C3789c.C3791b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3794e.f11959a, i, 0);
        this.f11846d = obtainStyledAttributes.getInt(C3794e.f11965g, 0);
        this.f11847e = obtainStyledAttributes.getInt(C3794e.f11966h, 0);
        this.f11848f = obtainStyledAttributes.getInt(C3794e.f11967i, 0);
        this.f11849g = obtainStyledAttributes.getInt(C3794e.f11961c, 0);
        this.f11850h = obtainStyledAttributes.getInt(C3794e.f11960b, 0);
        this.f11851i = obtainStyledAttributes.getInt(C3794e.f11968j, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(C3794e.f11962d);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(C3794e.f11963e);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(C3794e.f11964f);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(C3794e.f11969k, 0);
        if (i2 != 0) {
            this.f11855m = i2;
            this.f11854l = i2;
        }
        int i3 = obtainStyledAttributes.getInt(C3794e.f11971m, 0);
        if (i3 != 0) {
            this.f11855m = i3;
        }
        int i4 = obtainStyledAttributes.getInt(C3794e.f11970l, 0);
        if (i4 != 0) {
            this.f11854l = i4;
        }
        obtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C3781a();

        /* renamed from: d */
        private int f11863d = 1;

        /* renamed from: e */
        private float f11864e = Utils.FLOAT_EPSILON;

        /* renamed from: f */
        private float f11865f = 1.0f;

        /* renamed from: g */
        private int f11866g = -1;

        /* renamed from: h */
        private float f11867h = -1.0f;

        /* renamed from: i */
        private int f11868i = -1;

        /* renamed from: j */
        private int f11869j = -1;

        /* renamed from: k */
        private int f11870k = 16777215;

        /* renamed from: l */
        private int f11871l = 16777215;

        /* renamed from: m */
        private boolean f11872m;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$LayoutParams$a */
        static class C3781a implements Parcelable.Creator {
            C3781a() {
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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3794e.f11972n);
            this.f11863d = obtainStyledAttributes.getInt(C3794e.f11981w, 1);
            this.f11864e = obtainStyledAttributes.getFloat(C3794e.f11975q, Utils.FLOAT_EPSILON);
            this.f11865f = obtainStyledAttributes.getFloat(C3794e.f11976r, 1.0f);
            this.f11866g = obtainStyledAttributes.getInt(C3794e.f11973o, -1);
            this.f11867h = obtainStyledAttributes.getFraction(C3794e.f11974p, 1, 1, -1.0f);
            this.f11868i = obtainStyledAttributes.getDimensionPixelSize(C3794e.f11980v, -1);
            this.f11869j = obtainStyledAttributes.getDimensionPixelSize(C3794e.f11979u, -1);
            this.f11870k = obtainStyledAttributes.getDimensionPixelSize(C3794e.f11978t, 16777215);
            this.f11871l = obtainStyledAttributes.getDimensionPixelSize(C3794e.f11977s, 16777215);
            this.f11872m = obtainStyledAttributes.getBoolean(C3794e.f11982x, false);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: H0 */
        public int mo11439H0() {
            return this.f11870k;
        }

        /* renamed from: U */
        public int mo11440U() {
            return this.f11868i;
        }

        /* renamed from: V0 */
        public void mo11441V0(int i) {
            this.f11868i = i;
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
            return this.f11863d;
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
            this.f11869j = i;
        }

        /* renamed from: n */
        public int mo11449n() {
            return this.f11866g;
        }

        /* renamed from: n0 */
        public float mo11450n0() {
            return this.f11864e;
        }

        /* renamed from: o */
        public float mo11451o() {
            return this.f11865f;
        }

        /* renamed from: p0 */
        public float mo11452p0() {
            return this.f11867h;
        }

        /* renamed from: r1 */
        public int mo11453r1() {
            return this.rightMargin;
        }

        /* renamed from: t1 */
        public int mo11454t1() {
            return this.f11869j;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11863d);
            parcel.writeFloat(this.f11864e);
            parcel.writeFloat(this.f11865f);
            parcel.writeInt(this.f11866g);
            parcel.writeFloat(this.f11867h);
            parcel.writeInt(this.f11868i);
            parcel.writeInt(this.f11869j);
            parcel.writeInt(this.f11870k);
            parcel.writeInt(this.f11871l);
            parcel.writeByte(this.f11872m ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        /* renamed from: x0 */
        public boolean mo11455x0() {
            return this.f11872m;
        }

        /* renamed from: y1 */
        public int mo11456y1() {
            return this.f11871l;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f11863d = layoutParams.f11863d;
            this.f11864e = layoutParams.f11864e;
            this.f11865f = layoutParams.f11865f;
            this.f11866g = layoutParams.f11866g;
            this.f11867h = layoutParams.f11867h;
            this.f11868i = layoutParams.f11868i;
            this.f11869j = layoutParams.f11869j;
            this.f11870k = layoutParams.f11870k;
            this.f11871l = layoutParams.f11871l;
            this.f11872m = layoutParams.f11872m;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.f11863d = parcel.readInt();
            this.f11864e = parcel.readFloat();
            this.f11865f = parcel.readFloat();
            this.f11866g = parcel.readInt();
            this.f11867h = parcel.readFloat();
            this.f11868i = parcel.readInt();
            this.f11869j = parcel.readInt();
            this.f11870k = parcel.readInt();
            this.f11871l = parcel.readInt();
            this.f11872m = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }
}
