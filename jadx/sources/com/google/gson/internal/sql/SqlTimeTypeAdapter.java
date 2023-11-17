package com.google.gson.internal.sql;

import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;

final class SqlTimeTypeAdapter extends TypeAdapter {

    /* renamed from: b */
    static final C5624r f17791b = new C5624r() {
        /* renamed from: a */
        public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
            if (aVar.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    private final DateFormat f17792a;

    /* renamed from: e */
    public Time mo18185b(C9143a aVar) {
        Time time;
        if (aVar.mo18348n0() == C9145b.NULL) {
            aVar.mo18344f0();
            return null;
        }
        String I0 = aVar.mo18335I0();
        try {
            synchronized (this) {
                time = new Time(this.f17792a.parse(I0).getTime());
            }
            return time;
        } catch (ParseException e) {
            throw new JsonSyntaxException("Failed parsing '" + I0 + "' as SQL Time; at path " + aVar.mo18352w(), e);
        }
    }

    /* renamed from: f */
    public void mo18186d(C9146c cVar, Time time) {
        String format;
        if (time == null) {
            cVar.mo18359Q();
            return;
        }
        synchronized (this) {
            format = this.f17792a.format(time);
        }
        cVar.mo18356F0(format);
    }

    private SqlTimeTypeAdapter() {
        this.f17792a = new SimpleDateFormat("hh:mm:ss a");
    }
}
