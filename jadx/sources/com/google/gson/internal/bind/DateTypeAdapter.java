package com.google.gson.internal.bind;

import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C5576d;
import com.google.gson.internal.C5588i;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p290va.C8718a;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;

public final class DateTypeAdapter extends TypeAdapter {

    /* renamed from: b */
    public static final C5624r f17588b = new C5624r() {
        /* renamed from: a */
        public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
            if (aVar.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final List f17589a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f17589a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C5576d.m22216d()) {
            arrayList.add(C5588i.m22237c(2, 2));
        }
    }

    /* renamed from: e */
    private Date m21940e(C9143a aVar) {
        String I0 = aVar.mo18335I0();
        synchronized (this.f17589a) {
            for (DateFormat parse : this.f17589a) {
                try {
                    Date parse2 = parse.parse(I0);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                return C8718a.m32471c(I0, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException("Failed parsing '" + I0 + "' as Date; at path " + aVar.mo18352w(), e);
            }
        }
    }

    /* renamed from: f */
    public Date mo18185b(C9143a aVar) {
        if (aVar.mo18348n0() != C9145b.NULL) {
            return m21940e(aVar);
        }
        aVar.mo18344f0();
        return null;
    }

    /* renamed from: g */
    public void mo18186d(C9146c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.mo18359Q();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f17589a.get(0);
        synchronized (this.f17589a) {
            format = dateFormat.format(date);
        }
        cVar.mo18356F0(format);
    }
}
