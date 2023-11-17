package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.j */
class C5009j extends BaseAdapter {

    /* renamed from: g */
    private static final int f15974g = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: d */
    private final Calendar f15975d;

    /* renamed from: e */
    private final int f15976e;

    /* renamed from: f */
    private final int f15977f;

    public C5009j() {
        Calendar q = C5045x.m19625q();
        this.f15975d = q;
        this.f15976e = q.getMaximum(7);
        this.f15977f = q.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m19507b(int i) {
        int i2 = i + this.f15977f;
        int i3 = this.f15976e;
        if (i2 > i3) {
            return i2 - i3;
        }
        return i2;
    }

    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f15976e) {
            return null;
        }
        return Integer.valueOf(m19507b(i));
    }

    public int getCount() {
        return this.f15976e;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p009a8.C0078h.f305p
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.f15975d
            int r6 = r5.m19507b(r6)
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f15975d
            int r3 = f15974g
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = p009a8.C0080j.f344t
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f15975d
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C5009j.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C5009j(int i) {
        Calendar q = C5045x.m19625q();
        this.f15975d = q;
        this.f15976e = q.getMaximum(7);
        this.f15977f = i;
    }
}
