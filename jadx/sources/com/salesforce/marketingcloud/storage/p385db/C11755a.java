package com.salesforce.marketingcloud.storage.p385db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.analytics.C11341b;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.storage.C11749a;
import com.salesforce.marketingcloud.util.C11808c;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

@SuppressLint({"UnknownNullness", "Range"})
/* renamed from: com.salesforce.marketingcloud.storage.db.a */
public final class C11755a extends C11757b implements C11749a {

    /* renamed from: e */
    public static final String f34094e = "analytic_item";

    /* renamed from: f */
    private static final String[] f34095f = {"id", C11756a.f34101c, C11756a.f34106h, C11756a.f34102d, C11756a.f34100b, C11756a.f34104f, C11756a.f34103e, C11756a.f34105g, C11756a.f34107i, "predictive_intelligence_identifier"};

    /* renamed from: g */
    private static final String f34096g = "CREATE TABLE analytic_item (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_type INTEGER, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, json_payload VARCHAR, request_id VARCHAR, predictive_intelligence_identifier VARCHAR DEFAULT NULL);";

    /* renamed from: h */
    static final int f34097h = 1000;

    /* renamed from: i */
    private static final String f34098i = C11461g.m41875a("AnalyticItemDbStorage");

    /* renamed from: com.salesforce.marketingcloud.storage.db.a$a */
    public static class C11756a {

        /* renamed from: a */
        public static final String f34099a = "id";

        /* renamed from: b */
        public static final String f34100b = "value";

        /* renamed from: c */
        public static final String f34101c = "event_date";

        /* renamed from: d */
        public static final String f34102d = "analytic_type";

        /* renamed from: e */
        public static final String f34103e = "object_ids";

        /* renamed from: f */
        public static final String f34104f = "ready_to_send";

        /* renamed from: g */
        public static final String f34105g = "json_payload";

        /* renamed from: h */
        public static final String f34106h = "analytic_product_type";

        /* renamed from: i */
        public static final String f34107i = "request_id";

        /* renamed from: j */
        public static final String f34108j = "predictive_intelligence_identifier";
    }

    public C11755a(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: c */
    private static ContentValues m42878c(C11341b bVar, C11808c cVar) {
        String str;
        ContentValues contentValues = new ContentValues();
        contentValues.put(C11756a.f34101c, C11824l.m43282a(bVar.mo29765b()));
        contentValues.put(C11756a.f34106h, Integer.valueOf(bVar.mo29774i()));
        contentValues.put(C11756a.f34102d, Integer.valueOf(bVar.mo29761a()));
        contentValues.put(C11756a.f34100b, Integer.valueOf(bVar.mo29771f()));
        contentValues.put(C11756a.f34104f, Integer.valueOf(bVar.mo29772g() ? 1 : 0));
        contentValues.put(C11756a.f34103e, new JSONArray(bVar.mo29773h()).toString());
        if (bVar.mo29774i() == 1) {
            contentValues.put("predictive_intelligence_identifier", cVar.mo31645b(bVar.mo29770e()));
            str = cVar.mo31645b(bVar.mo29769d());
        } else {
            contentValues.put("predictive_intelligence_identifier", (String) null);
            str = "";
        }
        contentValues.put(C11756a.f34105g, str);
        contentValues.put(C11756a.f34107i, bVar.mo29775j());
        return contentValues;
    }

    /* renamed from: d */
    static boolean m42880d(SQLiteDatabase sQLiteDatabase) {
        boolean c = m42879c(sQLiteDatabase);
        if (c) {
            return c;
        }
        try {
            m42875a(sQLiteDatabase);
            m42877b(sQLiteDatabase);
            return m42879c(sQLiteDatabase);
        } catch (Exception e) {
            C11461g.m41885b(f34098i, e, "Unable to recover %s", f34094e);
            return c;
        }
    }

    /* renamed from: h */
    private int m42881h(int i) {
        return (int) DatabaseUtils.queryNumEntries(this.f34110c, f34094e, m42873a("%s=%s", C11756a.f34106h, Integer.valueOf(i)));
    }

    /* renamed from: a */
    public int mo31497a(int i) {
        return mo31523a(m42873a("%s = ? AND %s NOT IN (%s)", C11756a.f34106h, C11756a.f34102d, TextUtils.join(",", C11341b.f32964C)), new String[]{String.valueOf(i)});
    }

    /* renamed from: b */
    public int mo31499b(int i) {
        return mo31523a(m42873a("%s = ? AND %s IN (%s)", C11756a.f34106h, C11756a.f34102d, TextUtils.join(",", C11341b.f32964C)), new String[]{String.valueOf(i)});
    }

    /* renamed from: f */
    public List<C11341b> mo31504f() {
        return m42876b(0, (C11808c) null);
    }

    /* renamed from: g */
    public int mo31505g(int i) {
        return mo31523a(m42873a("%s = ?", C11756a.f34106h), new String[]{String.valueOf(i)});
    }

    /* renamed from: i */
    public int mo31507i() {
        return m42881h(0);
    }

    /* renamed from: j */
    public List<C11341b> mo31508j(C11808c cVar) {
        String a = m42873a("%s=? AND %s=?", C11756a.f34106h, C11756a.f34104f);
        String[] strArr = {String.valueOf(1), String.valueOf(1)};
        return mo31519b(mo31528a(f34095f, a, strArr, (String) null, (String) null, m42873a("%s ASC", C11756a.f34101c)), cVar);
    }

    /* renamed from: k */
    public List<C11341b> mo31509k(C11808c cVar) {
        return mo31519b(mo31527a(f34095f, m42873a("(%1$s=? OR %1$s=?) AND %2$s=?", C11756a.f34102d, C11756a.f34104f), new String[]{String.valueOf(13), String.valueOf(11), String.valueOf(0)}), cVar);
    }

    /* renamed from: l */
    public List<C11341b> mo31510l(C11808c cVar) {
        return m42876b(1, cVar);
    }

    /* renamed from: n */
    public int mo31511n() {
        return m42881h(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo31520p() {
        return f34094e;
    }

    /* renamed from: a */
    private static C11341b m42872a(Cursor cursor, C11808c cVar) {
        C11341b bVar;
        try {
            int i = cursor.getInt(cursor.getColumnIndex(C11756a.f34102d));
            int i2 = cursor.getInt(cursor.getColumnIndex(C11756a.f34106h)) == 0 ? 0 : 1;
            String string = cursor.getString(cursor.getColumnIndex(C11756a.f34107i));
            Date f = C11824l.m43299f(cursor.getString(cursor.getColumnIndex(C11756a.f34101c)));
            boolean z = cursor.getInt(cursor.getColumnIndex(C11756a.f34104f)) == 1;
            List emptyList = Collections.emptyList();
            JSONArray jSONArray = new JSONArray(cursor.getString(cursor.getColumnIndex(C11756a.f34103e)));
            if (jSONArray.length() > 0) {
                emptyList = new ArrayList();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    emptyList.add(jSONArray.getString(i3));
                }
            }
            List list = emptyList;
            if (!TextUtils.isEmpty(string)) {
                bVar = C11341b.m41461a(f, i2, i, list, string, z);
            } else if (list.size() > 0) {
                bVar = C11341b.m41462a(f, i2, i, list, z);
            } else {
                bVar = C11341b.m41460a(f, i2, i);
                bVar.mo29764a(z);
            }
            bVar.mo29762a(cursor.getInt(cursor.getColumnIndex("id")));
            bVar.mo29766b(cursor.getInt(cursor.getColumnIndex(C11756a.f34100b)));
            if (i2 != 1 || cVar == null) {
                return bVar;
            }
            bVar.mo29767b(cVar.mo31644a(cursor.getString(cursor.getColumnIndex("predictive_intelligence_identifier"))));
            String string2 = cursor.getString(cursor.getColumnIndex(C11756a.f34105g));
            if (TextUtils.isEmpty(string2)) {
                return bVar;
            }
            bVar.mo29763a(cVar.mo31644a(string2));
            return bVar;
        } catch (Exception e) {
            C11461g.m41885b(f34098i, e, "Failed to create our analytic item from storage.", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public int mo31500b(C11341b bVar, C11808c cVar) {
        return mo31521a(m42878c(bVar, cVar), m42873a("%s = ?", "id"), new String[]{String.valueOf(bVar.mo29768c())});
    }

    /* renamed from: c */
    public boolean mo31503c(int i) {
        return DatabaseUtils.queryNumEntries(this.f34110c, mo31520p(), m42873a("(%1$s=? OR %1$s=?) AND %2$s=? AND %3$s=? AND %4$s=?", C11756a.f34102d, C11756a.f34106h, C11756a.f34100b, C11756a.f34104f), new String[]{String.valueOf(4), String.valueOf(5), String.valueOf(i), String.valueOf(0), String.valueOf(0)}) > 0;
    }

    /* renamed from: h */
    public List<C11341b> mo31506h() {
        return mo31519b(mo31528a(f34095f, m42873a("%s=? AND %s=?", C11756a.f34106h, C11756a.f34104f), new String[]{String.valueOf(0), "1"}, (String) null, (String) null, m42873a("%s ASC", "id")), (C11808c) null);
    }

    /* renamed from: a */
    public static String m42873a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    /* renamed from: c */
    private static boolean m42879c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement(C11758c.m42915a("SELECT %s FROM %s", TextUtils.join(",", f34095f), f34094e));
            return true;
        } catch (Exception e) {
            C11461g.m41895e(f34098i, e, "%s is invalid", f34094e);
            return false;
        }
    }

    /* renamed from: b */
    public int mo31501b(String[] strArr) {
        return mo31534i(m42873a("%s IN (%s)", "id", TextUtils.join(",", strArr)));
    }

    /* renamed from: a */
    private void m42874a(int i, int i2, int i3) {
        mo31534i(m42873a("%s IN ( SELECT %s FROM %s WHERE %s=%d ORDER BY %s ASC LIMIT %d )", "id", "id", f34094e, C11756a.f34106h, Integer.valueOf(i3), "id", Integer.valueOf((i + 1) - i2)));
    }

    /* renamed from: b */
    private List<C11341b> m42876b(int i, C11808c cVar) {
        String a = m42873a("(%1$s=? OR %1$s=?) AND %2$s=? AND %3$s=? AND %4$s=?", C11756a.f34102d, C11756a.f34106h, C11756a.f34100b, C11756a.f34104f);
        String[] strArr = {String.valueOf(4), String.valueOf(5), String.valueOf(i), String.valueOf(0), String.valueOf(0)};
        return mo31519b(mo31528a(f34095f, a, strArr, (String) null, (String) null, m42873a("%s ASC", "id")), cVar);
    }

    /* renamed from: a */
    static void m42875a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS analytic_item");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C11341b> mo31519b(Cursor cursor, C11808c cVar) {
        List<C11341b> emptyList = Collections.emptyList();
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                ArrayList arrayList = new ArrayList();
                do {
                    C11341b a = m42872a(cursor, cVar);
                    if (a != null) {
                        arrayList.add(a);
                    } else {
                        int i = cursor.getInt(cursor.getColumnIndex("id"));
                        if (i >= 0) {
                            mo31523a(m42873a("%s = ?", "id"), new String[]{String.valueOf(i)});
                        }
                    }
                } while (cursor.moveToNext());
                emptyList = arrayList;
            }
            cursor.close();
        }
        return emptyList;
    }

    /* renamed from: a */
    public void mo31498a(C11341b bVar, C11808c cVar) {
        int i = bVar.mo29774i() == 0 ? 0 : 1;
        int h = m42881h(i);
        if (h + 1 > f34097h) {
            m42874a(h, f34097h, i);
        }
        bVar.mo29762a((int) mo31524a(m42878c(bVar, cVar)));
    }

    /* renamed from: b */
    public List<C11341b> mo31502b(Region region, C11808c cVar) {
        return mo31519b(mo31527a(f34095f, m42873a("(%1$s=? OR %1$s=?) AND %2$s LIKE ? AND %3$s=?", C11756a.f34102d, C11756a.f34103e, C11756a.f34104f), new String[]{String.valueOf(13), String.valueOf(11), m42873a("%%%s%%", region.mo30395id()), String.valueOf(0)}), cVar);
    }

    /* renamed from: b */
    static void m42877b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f34096g);
    }
}
