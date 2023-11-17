package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.t */
class C5041t {

    /* renamed from: c */
    private static final C5041t f16078c = new C5041t((Long) null, (TimeZone) null);

    /* renamed from: a */
    private final Long f16079a;

    /* renamed from: b */
    private final TimeZone f16080b;

    private C5041t(Long l, TimeZone timeZone) {
        this.f16079a = l;
        this.f16080b = timeZone;
    }

    /* renamed from: c */
    static C5041t m19603c() {
        return f16078c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar mo16304a() {
        return mo16305b(this.f16080b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Calendar mo16305b(TimeZone timeZone) {
        Calendar calendar;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = this.f16079a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
