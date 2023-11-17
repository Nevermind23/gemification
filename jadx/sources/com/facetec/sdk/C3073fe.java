package com.facetec.sdk;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facetec.sdk.fe */
public final class C3073fe extends C3004eg<Date> {

    /* renamed from: a */
    public static final C3013eo f10234a = new C3013eo() {
        /* renamed from: c */
        public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
            if (fwVar.mo9331a() == Date.class) {
                return new C3073fe();
            }
            return null;
        }
    };

    /* renamed from: b */
    private final List<DateFormat> f10235b;

    public C3073fe() {
        ArrayList arrayList = new ArrayList();
        this.f10235b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C3037eu.m12687b()) {
            arrayList.add(C3049ez.m12704b(2, 2));
        }
    }

    /* renamed from: c */
    private synchronized Date m12722c(String str) {
        for (DateFormat parse : this.f10235b) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C3137fr.m12882b(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new C3007ei(str, e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public synchronized void mo8991b(C3160gb gbVar, Date date) {
        if (date == null) {
            gbVar.mo9318f();
        } else {
            gbVar.mo9315d(this.f10235b.get(0).format(date));
        }
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
        if (fxVar.mo9292f() != C3141fv.NULL) {
            return m12722c(fxVar.mo9295i());
        }
        fxVar.mo9298l();
        return null;
    }
}
