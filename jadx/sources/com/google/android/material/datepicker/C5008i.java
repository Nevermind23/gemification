package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.core.util.C1004d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.i */
abstract class C5008i {
    /* renamed from: a */
    static C1004d m19494a(Long l, Long l2) {
        return m19495b(l, l2, (SimpleDateFormat) null);
    }

    /* renamed from: b */
    static C1004d m19495b(Long l, Long l2, SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return C1004d.m3516a((Object) null, (Object) null);
        }
        if (l == null) {
            return C1004d.m3516a((Object) null, m19497d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return C1004d.m3516a(m19497d(l.longValue(), simpleDateFormat), (Object) null);
        }
        Calendar o = C5045x.m19623o();
        Calendar q = C5045x.m19625q();
        q.setTimeInMillis(l.longValue());
        Calendar q2 = C5045x.m19625q();
        q2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return C1004d.m3516a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (q.get(1) != q2.get(1)) {
            return C1004d.m3516a(m19504k(l.longValue(), Locale.getDefault()), m19504k(l2.longValue(), Locale.getDefault()));
        } else {
            if (q.get(1) == o.get(1)) {
                return C1004d.m3516a(m19499f(l.longValue(), Locale.getDefault()), m19499f(l2.longValue(), Locale.getDefault()));
            }
            return C1004d.m3516a(m19499f(l.longValue(), Locale.getDefault()), m19504k(l2.longValue(), Locale.getDefault()));
        }
    }

    /* renamed from: c */
    static String m19496c(long j) {
        return m19497d(j, (SimpleDateFormat) null);
    }

    /* renamed from: d */
    static String m19497d(long j, SimpleDateFormat simpleDateFormat) {
        Calendar o = C5045x.m19623o();
        Calendar q = C5045x.m19625q();
        q.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (o.get(1) == q.get(1)) {
            return m19498e(j);
        }
        return m19503j(j);
    }

    /* renamed from: e */
    static String m19498e(long j) {
        return m19499f(j, Locale.getDefault());
    }

    /* renamed from: f */
    static String m19499f(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C5045x.m19611c(locale).format(new Date(j));
        }
        return C5045x.m19618j(locale).format(new Date(j));
    }

    /* renamed from: g */
    static String m19500g(long j) {
        return m19501h(j, Locale.getDefault());
    }

    /* renamed from: h */
    static String m19501h(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C5045x.m19612d(locale).format(new Date(j));
        }
        return C5045x.m19616h(locale).format(new Date(j));
    }

    /* renamed from: i */
    static String m19502i(long j) {
        return DateUtils.formatDateTime((Context) null, j, 8228);
    }

    /* renamed from: j */
    static String m19503j(long j) {
        return m19504k(j, Locale.getDefault());
    }

    /* renamed from: k */
    static String m19504k(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C5045x.m19627s(locale).format(new Date(j));
        }
        return C5045x.m19617i(locale).format(new Date(j));
    }

    /* renamed from: l */
    static String m19505l(long j) {
        return m19506m(j, Locale.getDefault());
    }

    /* renamed from: m */
    static String m19506m(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C5045x.m19628t(locale).format(new Date(j));
        }
        return C5045x.m19616h(locale).format(new Date(j));
    }
}
