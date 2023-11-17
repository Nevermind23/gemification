package com.facetec.sdk;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.facetec.sdk.fj */
public final class C3082fj extends C3004eg<Time> {

    /* renamed from: c */
    public static final C3013eo f10250c = new C3013eo() {
        /* renamed from: c */
        public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
            if (fwVar.mo9331a() == Time.class) {
                return new C3082fj();
            }
            return null;
        }
    };

    /* renamed from: b */
    private final DateFormat f10251b = new SimpleDateFormat("hh:mm:ss a");

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized Time mo8992d(C3143fx fxVar) {
        if (fxVar.mo9292f() == C3141fv.NULL) {
            fxVar.mo9298l();
            return null;
        }
        try {
            return new Time(this.f10251b.parse(fxVar.mo9295i()).getTime());
        } catch (ParseException e) {
            throw new C3007ei((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void mo8991b(C3160gb gbVar, Time time) {
        gbVar.mo9315d(time == null ? null : this.f10251b.format(time));
    }
}
