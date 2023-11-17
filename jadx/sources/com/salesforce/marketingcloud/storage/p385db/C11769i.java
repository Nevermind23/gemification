package com.salesforce.marketingcloud.storage.p385db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.internal.C11503f;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.storage.C11801k;
import com.salesforce.marketingcloud.util.C11808c;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.storage.db.i */
public final class C11769i extends C11757b implements C11801k {

    /* renamed from: e */
    public static final String f34134e = "messages";

    /* renamed from: f */
    private static final String[] f34135f = {"id", "title", "alert", "sound", C11770a.f34142e, C11770a.f34143f, C11770a.f34144g, C11770a.f34145h, C11770a.f34146i, C11770a.f34147j, C11770a.f34148k, C11770a.f34149l, C11770a.f34150m, C11770a.f34151n, C11770a.f34152o, C11770a.f34154q, C11770a.f34155r, C11770a.f34153p, C11770a.f34156s, C11770a.f34157t, C11770a.f34158u, C11770a.f34159v, C11770a.f34160w, C11770a.f34161x, C11770a.f34162y};

    /* renamed from: g */
    private static final String f34136g = "CREATE TABLE messages (id VARCHAR PRIMARY KEY, title VARCHAR, alert VARCHAR, sound VARCHAR, mediaUrl VARCHAR, mediaAlt VARCHAR, open_direct VARCHAR, start_date VARCHAR, end_date VARCHAR, message_type INTEGER, content_type INTEGER, url VARCHAR, custom VARCHAR, keys VARCHAR, period_show_count INTEGER, last_shown_date VARCHAR, next_allowed_show VARCHAR, show_count INTEGER, message_limit INTEGER, rolling_period SMALLINT, period_type INTEGER, number_of_periods INTEGER, messages_per_period INTEGER, proximity INTEGER, notify_id INTEGER );";

    /* renamed from: h */
    private static final String f34137h = C11461g.m41875a("MessageDbStorage");

    /* renamed from: com.salesforce.marketingcloud.storage.db.i$a */
    public static class C11770a {

        /* renamed from: a */
        public static final String f34138a = "id";

        /* renamed from: b */
        public static final String f34139b = "title";

        /* renamed from: c */
        public static final String f34140c = "alert";

        /* renamed from: d */
        public static final String f34141d = "sound";

        /* renamed from: e */
        public static final String f34142e = "mediaUrl";

        /* renamed from: f */
        public static final String f34143f = "mediaAlt";

        /* renamed from: g */
        public static final String f34144g = "open_direct";

        /* renamed from: h */
        public static final String f34145h = "start_date";

        /* renamed from: i */
        public static final String f34146i = "end_date";

        /* renamed from: j */
        public static final String f34147j = "message_type";

        /* renamed from: k */
        public static final String f34148k = "content_type";

        /* renamed from: l */
        public static final String f34149l = "url";

        /* renamed from: m */
        public static final String f34150m = "custom";

        /* renamed from: n */
        public static final String f34151n = "keys";

        /* renamed from: o */
        public static final String f34152o = "period_show_count";

        /* renamed from: p */
        public static final String f34153p = "show_count";

        /* renamed from: q */
        public static final String f34154q = "last_shown_date";

        /* renamed from: r */
        public static final String f34155r = "next_allowed_show";

        /* renamed from: s */
        public static final String f34156s = "message_limit";

        /* renamed from: t */
        public static final String f34157t = "rolling_period";

        /* renamed from: u */
        public static final String f34158u = "period_type";

        /* renamed from: v */
        public static final String f34159v = "number_of_periods";

        /* renamed from: w */
        public static final String f34160w = "messages_per_period";

        /* renamed from: x */
        public static final String f34161x = "proximity";

        /* renamed from: y */
        public static final String f34162y = "notify_id";
    }

    public C11769i(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: c */
    private static boolean m43002c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement(C11758c.m42915a("SELECT %s FROM %s", TextUtils.join(",", f34135f), f34134e));
            return true;
        } catch (Exception e) {
            C11461g.m41895e(f34137h, e, "%s is invalid", f34134e);
            return false;
        }
    }

    /* renamed from: d */
    static boolean m43003d(SQLiteDatabase sQLiteDatabase) {
        boolean c = m43002c(sQLiteDatabase);
        if (c) {
            return c;
        }
        try {
            m42999a(sQLiteDatabase);
            m43001b(sQLiteDatabase);
            return m43002c(sQLiteDatabase);
        } catch (Exception e) {
            C11461g.m41885b(f34137h, e, "Unable to recover %s", f34134e);
            return c;
        }
    }

    /* renamed from: a */
    public int mo31564a(String str) {
        return mo31523a(m42997a("%s = ?", "id"), new String[]{str});
    }

    /* renamed from: b */
    public int mo31568b(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C11770a.f34162y, Integer.valueOf(i));
        return mo31521a(contentValues, m42997a("%s = ?", "id"), new String[]{str});
    }

    /* renamed from: f */
    public int mo31570f(int i) {
        return mo31523a(m42997a("%s = ?", C11770a.f34147j), new String[]{String.valueOf(i)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo31520p() {
        return f34134e;
    }

    /* renamed from: b */
    private static ContentValues m43000b(Message message, C11808c cVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", message.mo30330id());
        contentValues.put("title", cVar.mo31645b(message.title()));
        contentValues.put("alert", cVar.mo31645b(message.alert()));
        contentValues.put("sound", message.sound());
        if (message.media() != null) {
            contentValues.put(C11770a.f34142e, cVar.mo31645b(message.media().url()));
            contentValues.put(C11770a.f34143f, cVar.mo31645b(message.media().altText()));
        }
        contentValues.put(C11770a.f34145h, C11824l.m43282a(message.startDateUtc()));
        contentValues.put(C11770a.f34146i, C11824l.m43282a(message.endDateUtc()));
        contentValues.put(C11770a.f34147j, Integer.valueOf(message.messageType()));
        contentValues.put(C11770a.f34148k, Integer.valueOf(message.contentType()));
        contentValues.put(C11770a.f34149l, cVar.mo31645b(message.url()));
        contentValues.put(C11770a.f34150m, cVar.mo31645b(message.custom()));
        contentValues.put(C11770a.f34160w, Integer.valueOf(message.messagesPerPeriod()));
        contentValues.put(C11770a.f34159v, Integer.valueOf(message.numberOfPeriods()));
        contentValues.put(C11770a.f34158u, Integer.valueOf(message.periodType()));
        contentValues.put(C11770a.f34157t, Integer.valueOf(message.isRollingPeriod() ? 1 : 0));
        contentValues.put(C11770a.f34156s, Integer.valueOf(message.messageLimit()));
        contentValues.put(C11770a.f34161x, Integer.valueOf(message.proximity()));
        contentValues.put(C11770a.f34144g, cVar.mo31645b(message.openDirect()));
        contentValues.put(C11770a.f34151n, cVar.mo31645b(C11824l.m43283a(message.customKeys())));
        contentValues.put(C11770a.f34155r, C11824l.m43282a(C11503f.m42037b(message)));
        contentValues.put(C11770a.f34152o, Integer.valueOf(C11503f.m42042d(message)));
        contentValues.put(C11770a.f34162y, Integer.valueOf(C11503f.m42040c(message)));
        contentValues.put(C11770a.f34153p, Integer.valueOf(C11503f.m42043e(message)));
        contentValues.put(C11770a.f34154q, C11824l.m43282a(C11503f.m42034a(message)));
        return contentValues;
    }

    /* renamed from: a */
    public Message mo31565a(String str, C11808c cVar) {
        Cursor a = mo31529a(f34135f, m42997a("%s = ?", "id"), new String[]{str}, (String) null, (String) null, (String) null, "1");
        Message message = null;
        if (a != null) {
            if (a.moveToFirst()) {
                message = C11759d.m42921b(a, cVar);
            }
            a.close();
        }
        return message;
    }

    /* renamed from: a */
    private static String m42997a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    /* renamed from: b */
    public List<Message> mo31569b(C11808c cVar) {
        List<Message> emptyList = Collections.emptyList();
        Cursor a = mo31526a(f34135f, m42998a(5));
        if (a != null) {
            if (a.moveToFirst()) {
                ArrayList arrayList = new ArrayList(a.getCount());
                do {
                    Message b = C11759d.m42921b(a, cVar);
                    if (b != null) {
                        arrayList.add(b);
                    }
                } while (a.moveToNext());
                emptyList = arrayList;
            }
            a.close();
        }
        return emptyList;
    }

    /* renamed from: a */
    private String m42998a(int... iArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (int i : iArr) {
            if (z) {
                sb.append(C11770a.f34147j);
                sb.append(" IN(");
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(i);
        }
        sb.append(");");
        return sb.toString();
    }

    /* renamed from: b */
    static void m43001b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f34136g);
    }

    /* renamed from: a */
    public List<Message> mo31566a(C11808c cVar) {
        List<Message> emptyList = Collections.emptyList();
        Cursor a = mo31526a(f34135f, m42998a(3, 4));
        if (a != null) {
            if (a.moveToFirst()) {
                ArrayList arrayList = new ArrayList(a.getCount());
                do {
                    Message b = C11759d.m42921b(a, cVar);
                    if (b != null) {
                        arrayList.add(b);
                    }
                } while (a.moveToNext());
                emptyList = arrayList;
            }
            a.close();
        }
        return emptyList;
    }

    /* renamed from: a */
    static void m42999a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS messages");
    }

    /* renamed from: a */
    public void mo31567a(Message message, C11808c cVar) {
        ContentValues b = m43000b(message, cVar);
        if (mo31521a(b, m42997a("%s = ?", "id"), new String[]{message.mo30330id()}) == 0) {
            mo31524a(b);
        }
    }
}
