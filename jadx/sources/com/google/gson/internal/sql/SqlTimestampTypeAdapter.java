package com.google.gson.internal.sql;

import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.sql.Timestamp;
import java.util.Date;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9146c;

class SqlTimestampTypeAdapter extends TypeAdapter {

    /* renamed from: b */
    static final C5624r f17793b = new C5624r() {
        /* renamed from: a */
        public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
            if (aVar.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.mo18174p(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a */
    private final TypeAdapter f17794a;

    /* renamed from: e */
    public Timestamp mo18185b(C9143a aVar) {
        Date date = (Date) this.f17794a.mo18185b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    /* renamed from: f */
    public void mo18186d(C9146c cVar, Timestamp timestamp) {
        this.f17794a.mo18186d(cVar, timestamp);
    }

    private SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f17794a = typeAdapter;
    }
}
