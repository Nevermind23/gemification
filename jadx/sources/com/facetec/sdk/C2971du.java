package com.facetec.sdk;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facetec.sdk.du */
final class C2971du extends C3004eg<Date> {

    /* renamed from: b */
    private final Class<? extends Date> f10048b;

    /* renamed from: c */
    private final List<DateFormat> f10049c;

    C2971du(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f10049c = arrayList;
        this.f10048b = m12522d(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    /* renamed from: c */
    private Date m12521c(String str) {
        synchronized (this.f10049c) {
            for (DateFormat parse : this.f10049c) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date b = C3137fr.m12882b(str, new ParsePosition(0));
                return b;
            } catch (ParseException e) {
                throw new C3007ei(str, e);
            }
        }
    }

    /* renamed from: d */
    private static Class<? extends Date> m12522d(Class<? extends Date> cls) {
        Class cls2;
        Class cls3;
        Class<Date> cls4 = Date.class;
        if (cls == cls4 || cls == (cls2 = java.sql.Date.class) || cls == (cls3 = Timestamp.class)) {
            return cls;
        }
        StringBuilder sb = new StringBuilder("Date type must be one of ");
        sb.append(cls4);
        sb.append(", ");
        sb.append(cls3);
        sb.append(", or ");
        sb.append(cls2);
        sb.append(" but was ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final /* synthetic */ void mo8991b(C3160gb gbVar, Object obj) {
        Date date = (Date) obj;
        if (date == null) {
            gbVar.mo9318f();
            return;
        }
        synchronized (this.f10049c) {
            gbVar.mo9315d(this.f10049c.get(0).format(date));
        }
    }

    public final String toString() {
        DateFormat dateFormat = this.f10049c.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder sb = new StringBuilder("DefaultDateTypeAdapter(");
            sb.append(((SimpleDateFormat) dateFormat).toPattern());
            sb.append(')');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("DefaultDateTypeAdapter(");
        sb2.append(dateFormat.getClass().getSimpleName());
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo8992d(C3143fx fxVar) {
        if (fxVar.mo9292f() == C3141fv.NULL) {
            fxVar.mo9298l();
            return null;
        }
        Date c = m12521c(fxVar.mo9295i());
        Class<? extends Date> cls = this.f10048b;
        if (cls == Date.class) {
            return c;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(c.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(c.getTime());
        }
        throw new AssertionError();
    }

    public C2971du(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f10049c = arrayList;
        this.f10048b = m12522d(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C3037eu.m12687b()) {
            arrayList.add(C3049ez.m12704b(i, i2));
        }
    }
}
