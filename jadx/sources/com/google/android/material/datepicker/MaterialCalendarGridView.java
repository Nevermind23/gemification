package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C1004d;
import androidx.core.view.C1055a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.C5089m;
import java.util.Calendar;
import java.util.Iterator;
import p009a8.C0076f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: d */
    private final Calendar f15922d;

    /* renamed from: e */
    private final boolean f15923e;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C4993a extends C1055a {
        C4993a() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.mo3595a0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m19414a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().mo16293i());
        } else if (i == 130) {
            setSelection(getAdapter().mo16283b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* renamed from: c */
    private View m19415c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    /* renamed from: d */
    private static int m19416d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: e */
    private static boolean m19417e(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: b */
    public C5033o getAdapter() {
        return (C5033o) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i12;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C5033o b = getAdapter();
        DateSelector dateSelector = b.f16064e;
        C5001b bVar = b.f16066g;
        int max = Math.max(b.mo16283b(), getFirstVisiblePosition());
        int min = Math.min(b.mo16293i(), getLastVisiblePosition());
        Long c = b.getItem(max);
        Long c2 = b.getItem(min);
        Iterator it = dateSelector.mo16171M0().iterator();
        while (it.hasNext()) {
            C1004d dVar = (C1004d) it.next();
            Object obj = dVar.f3642a;
            if (obj == null) {
                materialCalendarGridView = this;
            } else if (dVar.f3643b != null) {
                long longValue = ((Long) obj).longValue();
                long longValue2 = ((Long) dVar.f3643b).longValue();
                if (!m19417e(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                    boolean f = C5089m.m19905f(this);
                    if (longValue < c.longValue()) {
                        if (b.mo16286f(max)) {
                            i12 = 0;
                        } else if (!f) {
                            i12 = materialCalendarGridView.m19415c(max - 1).getRight();
                        } else {
                            i12 = materialCalendarGridView.m19415c(max - 1).getLeft();
                        }
                        i = i12;
                        i2 = max;
                    } else {
                        materialCalendarGridView.f15922d.setTimeInMillis(longValue);
                        i2 = b.mo16282a(materialCalendarGridView.f15922d.get(5));
                        i = m19416d(materialCalendarGridView.m19415c(i2));
                    }
                    if (longValue2 > c2.longValue()) {
                        if (b.mo16287g(min)) {
                            i9 = getWidth();
                        } else if (!f) {
                            i9 = materialCalendarGridView.m19415c(min).getRight();
                        } else {
                            i9 = materialCalendarGridView.m19415c(min).getLeft();
                        }
                        i3 = i9;
                        i4 = min;
                    } else {
                        materialCalendarGridView.f15922d.setTimeInMillis(longValue2);
                        i4 = b.mo16282a(materialCalendarGridView.f15922d.get(5));
                        i3 = m19416d(materialCalendarGridView.m19415c(i4));
                    }
                    int itemId = (int) b.getItemId(i2);
                    int i13 = max;
                    int i14 = min;
                    int itemId2 = (int) b.getItemId(i4);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View c3 = materialCalendarGridView.m19415c(numColumns);
                        int top = c3.getTop() + bVar.f15955a.mo16241c();
                        C5033o oVar = b;
                        int bottom = c3.getBottom() - bVar.f15955a.mo16240b();
                        if (!f) {
                            if (numColumns > i2) {
                                i6 = 0;
                            } else {
                                i6 = i;
                            }
                            if (i4 > numColumns2) {
                                i5 = getWidth();
                            } else {
                                i5 = i3;
                            }
                        } else {
                            if (i4 > numColumns2) {
                                i7 = 0;
                            } else {
                                i7 = i3;
                            }
                            if (numColumns > i2) {
                                i8 = getWidth();
                            } else {
                                i8 = i;
                            }
                            int i15 = i7;
                            i5 = i8;
                            i6 = i15;
                        }
                        canvas.drawRect((float) i6, (float) top, (float) i5, (float) bottom, bVar.f15962h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        b = oVar;
                    }
                    materialCalendarGridView = this;
                    max = i13;
                    min = i14;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m19414a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo16283b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo16283b());
        return true;
    }

    public void onMeasure(int i, int i2) {
        if (this.f15923e) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo16283b()) {
            super.setSelection(getAdapter().mo16283b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15922d = C5045x.m19625q();
        if (C5023l.m19551R1(getContext())) {
            setNextFocusLeftId(C0076f.f260a);
            setNextFocusRightId(C0076f.f266d);
        }
        this.f15923e = C5023l.m19552S1(getContext());
        ViewCompat.m3619r0(this, new C4993a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C5033o) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C5033o.class.getCanonicalName()}));
        }
    }
}
