package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

/* renamed from: com.google.android.material.datepicker.o */
class C5033o extends BaseAdapter {

    /* renamed from: i */
    static final int f16061i = C5045x.m19625q().getMaximum(4);

    /* renamed from: j */
    private static final int f16062j = ((C5045x.m19625q().getMaximum(5) + C5045x.m19625q().getMaximum(7)) - 1);

    /* renamed from: d */
    final Month f16063d;

    /* renamed from: e */
    final DateSelector f16064e;

    /* renamed from: f */
    private Collection f16065f;

    /* renamed from: g */
    C5001b f16066g;

    /* renamed from: h */
    final CalendarConstraints f16067h;

    C5033o(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints) {
        this.f16063d = month;
        this.f16064e = dateSelector;
        this.f16067h = calendarConstraints;
        this.f16065f = dateSelector.mo16177p1();
    }

    /* renamed from: e */
    private void m19577e(Context context) {
        if (this.f16066g == null) {
            this.f16066g = new C5001b(context);
        }
    }

    /* renamed from: h */
    private boolean m19578h(long j) {
        for (Long longValue : this.f16064e.mo16177p1()) {
            if (C5045x.m19609a(j) == C5045x.m19609a(longValue.longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m19579k(TextView textView, long j) {
        C5000a aVar;
        if (textView != null) {
            if (this.f16067h.mo16138h().mo16149c(j)) {
                textView.setEnabled(true);
                if (m19578h(j)) {
                    aVar = this.f16066g.f15956b;
                } else if (C5045x.m19623o().getTimeInMillis() == j) {
                    aVar = this.f16066g.f15957c;
                } else {
                    aVar = this.f16066g.f15955a;
                }
            } else {
                textView.setEnabled(false);
                aVar = this.f16066g.f15961g;
            }
            aVar.mo16242d(textView);
        }
    }

    /* renamed from: l */
    private void m19580l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m19420e(j).equals(this.f16063d)) {
            m19579k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().mo16282a(this.f16063d.mo16212j(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo16282a(int i) {
        return mo16283b() + (i - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo16283b() {
        return this.f16063d.mo16209g(this.f16067h.mo16141j());
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < mo16283b() || i > mo16293i()) {
            return null;
        }
        return Long.valueOf(this.f16063d.mo16210h(mo16294j(i)));
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m19577e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p009a8.C0078h.f304o
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo16283b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0075
            com.google.android.material.datepicker.Month r8 = r5.f16063d
            int r2 = r8.f15929h
            if (r7 < r2) goto L_0x002d
            goto L_0x0075
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.f16063d
            long r7 = r8.mo16210h(r7)
            com.google.android.material.datepicker.Month r3 = r5.f16063d
            int r3 = r3.f15927f
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m19421f()
            int r4 = r4.f15927f
            if (r3 != r4) goto L_0x0067
            java.lang.String r7 = com.google.android.material.datepicker.C5008i.m19500g(r7)
            r0.setContentDescription(r7)
            goto L_0x006e
        L_0x0067:
            java.lang.String r7 = com.google.android.material.datepicker.C5008i.m19505l(r7)
            r0.setContentDescription(r7)
        L_0x006e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x007d
        L_0x0075:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x007d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0084
            return r0
        L_0x0084:
            long r6 = r6.longValue()
            r5.m19579k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C5033o.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo16286f(int i) {
        return i % this.f16063d.f15928g == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo16287g(int i) {
        return (i + 1) % this.f16063d.f15928g == 0;
    }

    public int getCount() {
        return f16062j;
    }

    public long getItemId(int i) {
        return (long) (i / this.f16063d.f15928g);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo16293i() {
        return (mo16283b() + this.f16063d.f15929h) - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo16294j(int i) {
        return (i - mo16283b()) + 1;
    }

    /* renamed from: m */
    public void mo16295m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f16065f) {
            m19580l(materialCalendarGridView, longValue.longValue());
        }
        DateSelector dateSelector = this.f16064e;
        if (dateSelector != null) {
            for (Long longValue2 : dateSelector.mo16177p1()) {
                m19580l(materialCalendarGridView, longValue2.longValue());
            }
            this.f16065f = this.f16064e.mo16177p1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo16296n(int i) {
        return i >= mo16283b() && i <= mo16293i();
    }
}
