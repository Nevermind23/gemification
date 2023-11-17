package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p009a8.C0080j;
import p342j$.util.DesugarTimeZone;

/* renamed from: com.google.android.material.datepicker.x */
abstract class C5045x {

    /* renamed from: a */
    static AtomicReference f16081a = new AtomicReference();

    /* renamed from: a */
    static long m19609a(long j) {
        Calendar q = m19625q();
        q.setTimeInMillis(j);
        return m19614f(q).getTimeInMillis();
    }

    /* renamed from: b */
    private static int m19610b(String str, String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0) {
                        break;
                    } else if (i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) == '\'');
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: c */
    static DateFormat m19611c(Locale locale) {
        return m19613e("MMMd", locale);
    }

    /* renamed from: d */
    static DateFormat m19612d(Locale locale) {
        return m19613e("MMMEd", locale);
    }

    /* renamed from: e */
    private static DateFormat m19613e(String str, Locale locale) {
        DateFormat a = DateFormat.getInstanceForSkeleton(str, locale);
        a.setTimeZone(m19624p());
        return a;
    }

    /* renamed from: f */
    static Calendar m19614f(Calendar calendar) {
        Calendar r = m19626r(calendar);
        Calendar q = m19625q();
        q.set(r.get(1), r.get(2), r.get(5));
        return q;
    }

    /* renamed from: g */
    private static java.text.DateFormat m19615g(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m19622n());
        return dateInstance;
    }

    /* renamed from: h */
    static java.text.DateFormat m19616h(Locale locale) {
        return m19615g(0, locale);
    }

    /* renamed from: i */
    static java.text.DateFormat m19617i(Locale locale) {
        return m19615g(2, locale);
    }

    /* renamed from: j */
    static java.text.DateFormat m19618j(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m19617i(locale);
        simpleDateFormat.applyPattern(m19629u(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    /* renamed from: k */
    static SimpleDateFormat m19619k() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(m19622n());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: l */
    static String m19620l(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(C0080j.f322H);
        String string2 = resources.getString(C0080j.f321G);
        String string3 = resources.getString(C0080j.f320F);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    /* renamed from: m */
    static C5041t m19621m() {
        C5041t tVar = (C5041t) f16081a.get();
        if (tVar == null) {
            return C5041t.m19603c();
        }
        return tVar;
    }

    /* renamed from: n */
    private static TimeZone m19622n() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    /* renamed from: o */
    static Calendar m19623o() {
        Calendar a = m19621m().mo16304a();
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        a.setTimeZone(m19622n());
        return a;
    }

    /* renamed from: p */
    private static android.icu.util.TimeZone m19624p() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: q */
    static Calendar m19625q() {
        return m19626r((Calendar) null);
    }

    /* renamed from: r */
    static Calendar m19626r(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m19622n());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    /* renamed from: s */
    static DateFormat m19627s(Locale locale) {
        return m19613e("yMMMd", locale);
    }

    /* renamed from: t */
    static DateFormat m19628t(Locale locale) {
        return m19613e("yMMMEd", locale);
    }

    /* renamed from: u */
    private static String m19629u(String str) {
        int b = m19610b(str, "yY", 1, 0);
        if (b >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int b2 = m19610b(str, str2, 1, b);
        if (b2 < str.length()) {
            str2 = str2 + ",";
        }
        return str.replace(str.substring(m19610b(str, str2, -1, b) + 1, b2), " ").trim();
    }
}
