package com.google.gson.internal.bind;

import com.google.gson.C5624r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C5576d;
import com.google.gson.internal.C5588i;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p290va.C8718a;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;

public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter {

    /* renamed from: a */
    private final C5505b f17590a;

    /* renamed from: b */
    private final List f17591b;

    /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$b */
    public static abstract class C5505b {

        /* renamed from: b */
        public static final C5505b f17592b = new C5506a(Date.class);

        /* renamed from: a */
        private final Class f17593a;

        /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$b$a */
        class C5506a extends C5505b {
            C5506a(Class cls) {
                super(cls);
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public Date mo18255d(Date date) {
                return date;
            }
        }

        protected C5505b(Class cls) {
            this.f17593a = cls;
        }

        /* renamed from: c */
        private final C5624r m21951c(DefaultDateTypeAdapter defaultDateTypeAdapter) {
            return TypeAdapters.m22018a(this.f17593a, defaultDateTypeAdapter);
        }

        /* renamed from: a */
        public final C5624r mo18253a(int i, int i2) {
            return m21951c(new DefaultDateTypeAdapter(this, i, i2));
        }

        /* renamed from: b */
        public final C5624r mo18254b(String str) {
            return m21951c(new DefaultDateTypeAdapter(this, str));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract Date mo18255d(Date date);
    }

    /* renamed from: e */
    private Date m21946e(C9143a aVar) {
        String I0 = aVar.mo18335I0();
        synchronized (this.f17591b) {
            for (DateFormat parse : this.f17591b) {
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
        if (aVar.mo18348n0() == C9145b.NULL) {
            aVar.mo18344f0();
            return null;
        }
        return this.f17590a.mo18255d(m21946e(aVar));
    }

    /* renamed from: g */
    public void mo18186d(C9146c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.mo18359Q();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f17591b.get(0);
        synchronized (this.f17591b) {
            format = dateFormat.format(date);
        }
        cVar.mo18356F0(format);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f17591b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    private DefaultDateTypeAdapter(C5505b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f17591b = arrayList;
        Objects.requireNonNull(bVar);
        this.f17590a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    private DefaultDateTypeAdapter(C5505b bVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f17591b = arrayList;
        Objects.requireNonNull(bVar);
        this.f17590a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C5576d.m22216d()) {
            arrayList.add(C5588i.m22237c(i, i2));
        }
    }
}
