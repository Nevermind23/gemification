package com.salesforce.marketingcloud.storage.p385db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.events.C11440h;
import com.salesforce.marketingcloud.storage.C11804n;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness", "Range"})
/* renamed from: com.salesforce.marketingcloud.storage.db.m */
public class C11775m extends C11757b implements C11804n {

    /* renamed from: g */
    public static final String f34194g = "triggers";

    /* renamed from: h */
    private static final String f34195h = C11461g.m41875a("TriggerDbStorage");

    /* renamed from: e */
    private final SQLiteStatement f34196e;

    /* renamed from: f */
    private final SQLiteStatement f34197f;

    public C11775m(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
        this.f34196e = sQLiteDatabase.compileStatement("UPDATE triggers SET app_open_count = app_open_count + 1 WHERE (start_date IS NULL OR start_date < ?)");
        this.f34197f = sQLiteDatabase.compileStatement("SELECT app_open_count FROM triggers WHERE id = ?");
    }

    /* renamed from: a */
    private static C11440h m43047a(Cursor cursor) {
        try {
            return new C11440h(new JSONObject(cursor.getString(cursor.getColumnIndex("_trigger"))));
        } catch (Exception e) {
            C11461g.m41885b(f34195h, e, "Unable to read trigger from DB", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    private static ContentValues m43050c(C11440h hVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", hVar.mo29936h());
        contentValues.put("_key", hVar.mo29938i());
        contentValues.put(C11769i.C11770a.f34145h, hVar.mo29941l() != null ? Long.valueOf(hVar.mo29941l().getTime()) : null);
        contentValues.put("_trigger", hVar.mo29942m().toString());
        return contentValues;
    }

    /* renamed from: d */
    static boolean m43052d(SQLiteDatabase sQLiteDatabase) {
        boolean c = m43051c(sQLiteDatabase);
        if (c) {
            return c;
        }
        try {
            m43048a(sQLiteDatabase);
            m43049b(sQLiteDatabase);
            return m43051c(sQLiteDatabase);
        } catch (Exception e) {
            C11461g.m41885b(f34195h, e, "Unable to recover %s", f34194g);
            return c;
        }
    }

    /* renamed from: b */
    public int mo31593b(C11440h hVar) {
        if (hVar != null) {
            try {
                this.f34197f.bindString(1, hVar.mo29936h());
                return (int) this.f34197f.simpleQueryForLong();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* renamed from: f */
    public C11440h mo31595f(String str) {
        Cursor a = mo31527a(new String[]{"_trigger"}, "id = ?", new String[]{str});
        C11440h hVar = null;
        if (a != null) {
            if (a.moveToFirst()) {
                hVar = m43047a(a);
            }
            a.close();
        }
        return hVar;
    }

    /* renamed from: g */
    public List<C11440h> mo31596g(String str) {
        ArrayList arrayList;
        Cursor a = mo31527a(new String[]{"_trigger"}, "lower(_key) = lower(?) AND (start_date IS NULL OR start_date < ?)", new String[]{str, String.valueOf(System.currentTimeMillis())});
        try {
            if (a.moveToFirst()) {
                arrayList = new ArrayList(a.getCount());
                do {
                    arrayList.add(m43047a(a));
                } while (a.moveToNext());
            } else {
                arrayList = null;
            }
            return arrayList != null ? arrayList : Collections.emptyList();
        } finally {
            a.close();
        }
    }

    /* renamed from: k */
    public void mo31597k() {
        this.f34196e.bindString(1, String.valueOf(System.currentTimeMillis()));
        this.f34196e.execute();
    }

    /* renamed from: m */
    public JSONArray mo31598m() {
        JSONArray jSONArray = new JSONArray();
        Cursor a = mo31526a(new String[]{"_trigger", "app_open_count"}, (String) null);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    int columnIndex = a.getColumnIndex("_trigger");
                    int columnIndex2 = a.getColumnIndex("app_open_count");
                    do {
                        JSONObject jSONObject = new JSONObject(a.getString(columnIndex));
                        jSONObject.put("appOpenCount", a.getInt(columnIndex2));
                        jSONArray.put(jSONObject);
                    } while (a.moveToNext());
                }
            } catch (JSONException e) {
                C11461g.m41885b(f34195h, e, "Unable to read trigger information from cursor.", new Object[0]);
            } catch (Throwable th) {
                a.close();
                throw th;
            }
            a.close();
        }
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo31520p() {
        return f34194g;
    }

    /* renamed from: a */
    static void m43048a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS triggers");
    }

    /* renamed from: c */
    private static boolean m43051c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,_key,start_date,_trigger,app_open_count FROM triggers");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public int mo31594b(Collection<String> collection) {
        if (collection.size() == 0) {
            return mo31534i((String) null);
        }
        try {
            return mo31522a(mo31520p(), collection);
        } catch (Exception unused) {
            C11461g.m41894e(f34195h, "Unable to clean up %s table.", mo31520p());
            return 0;
        }
    }

    /* renamed from: b */
    static void m43049b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE triggers(id TEXT PRIMARY KEY, _key TEXT, start_date INTEGER DEFAULT NULL, _trigger TEXT, app_open_count INTEGER DEFAULT 0);");
    }

    /* renamed from: a */
    public void mo31592a(C11440h hVar) {
        ContentValues c = m43050c(hVar);
        if (mo31521a(c, "id = ?", new String[]{hVar.mo29936h()}) == 0) {
            mo31524a(c);
        }
    }
}
