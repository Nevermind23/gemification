package com.salesforce.marketingcloud.storage.p385db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.internal.C11493a;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.storage.C11794g;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import com.salesforce.marketingcloud.util.C11808c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness", "Range"})
/* renamed from: com.salesforce.marketingcloud.storage.db.f */
public class C11764f extends C11757b implements C11794g {

    /* renamed from: e */
    public static final String f34116e = "in_app_messages";

    /* renamed from: f */
    public static final String f34117f = "iam_state";

    /* renamed from: g */
    public static final String f34118g = "iam_view";

    /* renamed from: h */
    public static final String f34119h = "iam_state_init";

    /* renamed from: i */
    private static final String f34120i = C11461g.m41875a("InAppMessageDbStorage");

    /* renamed from: j */
    private static final String f34121j = "id IN (%s) AND (display_count < display_limit) AND (start_date IS NULL OR start_date < ?) AND (end_date IS NULL OR end_date > ?) ORDER BY   priority ASC,  modified_date DESC LIMIT 1";

    public C11764f(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: b */
    private static ContentValues m42942b(InAppMessage inAppMessage, C11808c cVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", inAppMessage.mo30522id());
        contentValues.put("priority", Integer.valueOf(inAppMessage.priority()));
        Long l = null;
        contentValues.put(C11769i.C11770a.f34145h, inAppMessage.startDateUtc() != null ? Long.valueOf(inAppMessage.startDateUtc().getTime()) : null);
        if (inAppMessage.endDateUtc() != null) {
            l = Long.valueOf(inAppMessage.endDateUtc().getTime());
        }
        contentValues.put(C11769i.C11770a.f34146i, l);
        contentValues.put("modified_date", Long.valueOf(inAppMessage.modifiedDateUtc().getTime()));
        contentValues.put("display_limit", Integer.valueOf(inAppMessage.displayLimit()));
        InAppMessage.Media media = inAppMessage.media();
        if (media != null && !TextUtils.isEmpty(media.url())) {
            contentValues.put("media_url", cVar.mo31645b(media.url()));
        }
        contentValues.put("message_json", cVar.mo31645b(C11493a.m42004b(inAppMessage).toString()));
        return contentValues;
    }

    /* renamed from: e */
    static void m42947e(SQLiteDatabase sQLiteDatabase) {
        m42950h(sQLiteDatabase);
        m42948f(sQLiteDatabase);
        m42949g(sQLiteDatabase);
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS iam_state_init");
    }

    /* renamed from: f */
    private static void m42948f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS iam_state");
    }

    /* renamed from: g */
    private static void m42949g(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS iam_view");
    }

    /* renamed from: h */
    private static void m42950h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS in_app_messages");
    }

    /* renamed from: i */
    static void m42951i(SQLiteDatabase sQLiteDatabase) {
        m42946d(sQLiteDatabase);
        m42941a(sQLiteDatabase);
        m42944b(sQLiteDatabase);
        m42945c(sQLiteDatabase);
    }

    /* renamed from: j */
    private static boolean m42952j(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,display_count FROM iam_state");
            return false;
        } catch (Exception e) {
            C11461g.m41895e(f34120i, e, "%s is invalid", f34117f);
            return true;
        }
    }

    /* renamed from: k */
    private static boolean m42953k(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,priority,start_date,end_date,modified_date,display_limit,media_url,message_json FROM in_app_messages");
            return false;
        } catch (Exception e) {
            C11461g.m41895e(f34120i, e, "%s is invalid", f34116e);
            return true;
        }
    }

    /* renamed from: l */
    private static boolean m42954l(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,priority,start_date,end_date,modified_date,display_limit,message_json,display_count FROM iam_view");
            return false;
        } catch (Exception e) {
            C11461g.m41895e(f34120i, e, "%s is invalid", f34118g);
            return true;
        }
    }

    /* renamed from: m */
    static boolean m42955m(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        if (m42953k(sQLiteDatabase)) {
            sQLiteDatabase.beginTransaction();
            try {
                m42950h(sQLiteDatabase);
                m42946d(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e) {
                C11461g.m41885b(f34120i, e, "Unable to recover %s", f34116e);
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
            sQLiteDatabase.endTransaction();
            if (m42953k(sQLiteDatabase)) {
                return false;
            }
        }
        if (m42952j(sQLiteDatabase)) {
            sQLiteDatabase.beginTransaction();
            try {
                m42948f(sQLiteDatabase);
                m42941a(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e2) {
                C11461g.m41885b(f34120i, e2, "Unable to recover %s", f34117f);
            } catch (Throwable th2) {
                sQLiteDatabase.endTransaction();
                throw th2;
            }
            sQLiteDatabase.endTransaction();
            if (m42952j(sQLiteDatabase)) {
                return false;
            }
            z = true;
        } else {
            z = false;
        }
        if (m42954l(sQLiteDatabase)) {
            try {
                m42949g(sQLiteDatabase);
                m42945c(sQLiteDatabase);
            } catch (Exception e3) {
                C11461g.m41885b(f34120i, e3, "Unable to recover %s", f34118g);
            }
            if (m42954l(sQLiteDatabase)) {
                return false;
            }
        }
        if (C11758c.m42916a(sQLiteDatabase, "trigger", f34119h)) {
            try {
                m42944b(sQLiteDatabase);
            } catch (Exception e4) {
                C11461g.m41885b(f34120i, e4, "Unable to recover %s", f34119h);
            }
            if (C11758c.m42916a(sQLiteDatabase, "trigger", f34119h)) {
                return false;
            }
            z = true;
        }
        if (z) {
            try {
                sQLiteDatabase.execSQL("INSERT OR IGNORE INTO iam_state(id) SELECT id FROM in_app_messages;");
            } catch (Exception e5) {
                C11461g.m41885b(f34120i, e5, "Unable to correct relationship between iam data and iam state.", new Object[0]);
            }
        }
        return true;
    }

    /* renamed from: a */
    public int mo31538a(InAppMessage inAppMessage, C11808c cVar) {
        ContentValues b = m42942b(inAppMessage, cVar);
        if (this.f34110c.update(f34116e, b, "id = ?", new String[]{inAppMessage.mo30522id()}) != 0) {
            return 2;
        }
        this.f34110c.insert(f34116e, (String) null, b);
        return 1;
    }

    /* renamed from: c */
    public JSONArray mo31543c(C11808c cVar) {
        JSONArray jSONArray = new JSONArray();
        Cursor a = mo31525a(f34118g, new String[]{"message_json", "display_count"}, (String) null, (String[]) null);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    int columnIndex = a.getColumnIndex("message_json");
                    int columnIndex2 = a.getColumnIndex("display_count");
                    do {
                        JSONObject jSONObject = new JSONObject(cVar.mo31644a(a.getString(columnIndex)));
                        jSONObject.put("displayCount", a.getInt(columnIndex2));
                        jSONArray.put(jSONObject);
                    } while (a.moveToNext());
                }
            } catch (Exception e) {
                C11461g.m41885b(f34120i, e, "Unable to read message information from cursor.", new Object[0]);
            } catch (Throwable th) {
                a.close();
                throw th;
            }
            a.close();
        }
        return jSONArray;
    }

    /* renamed from: d */
    public List<String> mo31545d(C11808c cVar) {
        ArrayList arrayList = null;
        Cursor a = mo31525a(f34116e, new String[]{"media_url"}, "media_url IS NOT NULL", (String[]) null);
        try {
            if (a.moveToFirst()) {
                arrayList = new ArrayList(a.getCount());
                do {
                    String a2 = m42940a(a, cVar);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } while (a.moveToNext());
            }
            return arrayList != null ? arrayList : Collections.emptyList();
        } finally {
            a.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo31520p() {
        return null;
    }

    /* renamed from: b */
    private static InAppMessage m42943b(Cursor cursor, C11808c cVar) {
        try {
            return new InAppMessage(new JSONObject(cVar.mo31644a(cursor.getString(cursor.getColumnIndex("message_json")))));
        } catch (Exception e) {
            C11461g.m41885b(f34120i, e, "Unable to retrieve InAppMessage from db cursor", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    private static void m42945c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE VIEW iam_view AS SELECT in_app_messages.id,in_app_messages.priority,in_app_messages.start_date,in_app_messages.end_date,in_app_messages.modified_date,in_app_messages.display_limit,in_app_messages.message_json,iam_state.display_count FROM in_app_messages INNER JOIN iam_state ON iam_state.id = in_app_messages.id;");
    }

    /* renamed from: d */
    private static void m42946d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE in_app_messages(id TEXT PRIMARY KEY, priority INTEGER DEFAULT 999, start_date INTEGER DEFAULT NULL, end_date INTEGER DEFAULT NULL, modified_date INTEGER DEFAULT NULL, display_limit INTEGER DEFAULT 1, media_url TEXT DEFAULT NULL, message_json TEXT);");
    }

    /* renamed from: a */
    public int mo31539a(Collection<String> collection) {
        if (collection.size() == 0) {
            return this.f34110c.delete(f34116e, (String) null, (String[]) null);
        }
        try {
            return mo31522a(f34116e, collection);
        } catch (SQLException unused) {
            C11461g.m41894e(f34120i, "Unable to clean up %s table.", f34116e);
            return 0;
        }
    }

    /* renamed from: b */
    private static void m42944b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TRIGGER iam_state_init AFTER INSERT ON in_app_messages BEGIN INSERT INTO iam_state (id) VALUES (NEW.id); END;");
    }

    /* renamed from: a */
    public InAppMessage mo31540a(String str, C11808c cVar) {
        Cursor a = mo31525a(f34116e, new String[]{"message_json"}, "id = ?", new String[]{str});
        InAppMessage inAppMessage = null;
        if (a != null) {
            if (a.moveToFirst()) {
                inAppMessage = m42943b(a, cVar);
            }
            a.close();
        }
        return inAppMessage;
    }

    /* renamed from: c */
    public void mo31544c(String str, int i) {
        if (str != null && i >= 0) {
            this.f34110c.execSQL("UPDATE iam_state SET display_count = MAX(display_count, ?) WHERE id = ?", new Object[]{Integer.valueOf(i), str});
        }
    }

    /* renamed from: a */
    public InAppMessage mo31541a(Collection<String> collection, C11808c cVar) {
        InAppMessage inAppMessage = null;
        if (collection.size() > 0) {
            this.f34110c.beginTransaction();
            mo31531b(f34118g, collection);
            String a = C11758c.m42915a(f34121j, C11758c.m42915a("SELECT %1$s.id FROM %1$s LEFT JOIN tmp_%1$s ON %1$s.id = tmp_%1$s.id WHERE tmp_%1$s.id IS NOT NULL", f34118g));
            String valueOf = String.valueOf(System.currentTimeMillis());
            Cursor a2 = mo31525a(f34118g, new String[]{"message_json"}, a, new String[]{valueOf, valueOf});
            if (a2 != null) {
                if (a2.moveToFirst()) {
                    inAppMessage = m42943b(a2, cVar);
                }
                a2.close();
            }
            mo31533h(f34118g);
            this.f34110c.setTransactionSuccessful();
            this.f34110c.endTransaction();
        }
        return inAppMessage;
    }

    /* renamed from: a */
    private static String m42940a(Cursor cursor, C11808c cVar) {
        try {
            return cVar.mo31644a(cursor.getString(cursor.getColumnIndex("media_url")));
        } catch (Exception e) {
            C11461g.m41885b(f34120i, e, "Unable to retrieve media_url from db cursor", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    private static void m42941a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE iam_state(id TEXT PRIMARY KEY, display_count integer default 0, FOREIGN KEY (id) REFERENCES in_app_messages(id) ON DELETE CASCADE);");
    }

    /* renamed from: a */
    public void mo31542a(InAppMessage inAppMessage) {
        if (inAppMessage != null) {
            this.f34110c.execSQL("UPDATE iam_state SET display_count = display_count + 1 WHERE id = ?", new String[]{inAppMessage.mo30522id()});
        }
    }
}
