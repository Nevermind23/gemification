package com.google.gson.internal.sql;

import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;

final class SqlDateTypeAdapter extends TypeAdapter {

    /* renamed from: b */
    static final C5624r f17789b = new C5624r() {
        /* renamed from: a */
        public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
            if (aVar.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final DateFormat f17790a;

    /* renamed from: e */
    public Date mo18185b(C9143a aVar) {
        java.util.Date parse;
        if (aVar.mo18348n0() == C9145b.NULL) {
            aVar.mo18344f0();
            return null;
        }
        String I0 = aVar.mo18335I0();
        try {
            synchronized (this) {
                parse = this.f17790a.parse(I0);
            }
            return new Date(parse.getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException("Failed parsing '" + I0 + "' as SQL Date; at path " + aVar.mo18352w(), e);
        }
    }

    /* renamed from: f */
    public void mo18186d(C9146c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.mo18359Q();
            return;
        }
        synchronized (this) {
            format = this.f17790a.format(date);
        }
        cVar.mo18356F0(format);
    }

    private SqlDateTypeAdapter() {
        this.f17790a = new SimpleDateFormat("MMM d, yyyy");
    }
}
