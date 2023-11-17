package com.facetec.sdk;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.facetec.sdk.fk */
public final class C3084fk extends C3004eg<Date> {

    /* renamed from: d */
    public static final C3013eo f10252d = new C3013eo() {
        /* renamed from: c */
        public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
            if (fwVar.mo9331a() == Date.class) {
                return new C3084fk();
            }
            return null;
        }
    };

    /* renamed from: b */
    private final DateFormat f10253b = new SimpleDateFormat("MMM d, yyyy");

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized Date mo8992d(C3143fx fxVar) {
        if (fxVar.mo9292f() == C3141fv.NULL) {
            fxVar.mo9298l();
            return null;
        }
        try {
            return new Date(this.f10253b.parse(fxVar.mo9295i()).getTime());
        } catch (ParseException e) {
            throw new C3007ei((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public synchronized void mo8991b(C3160gb gbVar, Date date) {
        String str;
        if (date == null) {
            str = null;
        } else {
            str = this.f10253b.format(date);
        }
        gbVar.mo9315d(str);
    }
}
