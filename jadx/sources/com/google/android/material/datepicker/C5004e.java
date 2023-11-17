package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.internal.C5087k;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import p009a8.C0080j;

/* renamed from: com.google.android.material.datepicker.e */
abstract class C5004e extends C5087k {

    /* renamed from: d */
    private final TextInputLayout f15967d;

    /* renamed from: e */
    private final DateFormat f15968e;

    /* renamed from: f */
    private final CalendarConstraints f15969f;

    /* renamed from: g */
    private final String f15970g;

    /* renamed from: h */
    private final Runnable f15971h;

    /* renamed from: i */
    private Runnable f15972i;

    C5004e(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f15968e = dateFormat;
        this.f15967d = textInputLayout;
        this.f15969f = calendarConstraints;
        this.f15970g = textInputLayout.getContext().getString(C0080j.f350z);
        this.f15971h = new C5002c(this, str);
    }

    /* renamed from: c */
    private Runnable m19484c(long j) {
        return new C5003d(this, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m19485d(long j) {
        String c = C5008i.m19496c(j);
        this.f15967d.setError(String.format(this.f15970g, new Object[]{m19487i(c)}));
        mo16226f();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m19486e(String str) {
        TextInputLayout textInputLayout = this.f15967d;
        DateFormat dateFormat = this.f15968e;
        Context context = textInputLayout.getContext();
        String string = context.getString(C0080j.f345u);
        String format = String.format(context.getString(C0080j.f347w), new Object[]{m19487i(str)});
        String format2 = String.format(context.getString(C0080j.f346v), new Object[]{m19487i(dateFormat.format(new Date(C5045x.m19623o().getTimeInMillis())))});
        textInputLayout.setError(string + "\n" + format + "\n" + format2);
        mo16226f();
    }

    /* renamed from: i */
    private String m19487i(String str) {
        return str.replace(' ', 160);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo16226f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo16227g(Long l);

    /* renamed from: h */
    public void mo16245h(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f15967d.removeCallbacks(this.f15971h);
        this.f15967d.removeCallbacks(this.f15972i);
        this.f15967d.setError((CharSequence) null);
        mo16227g((Long) null);
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Date parse = this.f15968e.parse(charSequence.toString());
                this.f15967d.setError((CharSequence) null);
                long time = parse.getTime();
                if (!this.f15969f.mo16138h().mo16149c(time) || !this.f15969f.mo16146q(time)) {
                    Runnable c = m19484c(time);
                    this.f15972i = c;
                    mo16245h(this.f15967d, c);
                    return;
                }
                mo16227g(Long.valueOf(parse.getTime()));
            } catch (ParseException unused) {
                mo16245h(this.f15967d, this.f15971h);
            }
        }
    }
}
