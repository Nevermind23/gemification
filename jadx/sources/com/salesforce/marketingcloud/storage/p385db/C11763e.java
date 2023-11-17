package com.salesforce.marketingcloud.storage.p385db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.analytics.stats.C11391b;
import com.salesforce.marketingcloud.analytics.stats.C11396d;
import com.salesforce.marketingcloud.storage.C11754d;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.util.C11808c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@SuppressLint({"Range"})
/* renamed from: com.salesforce.marketingcloud.storage.db.e */
public class C11763e extends C11757b implements C11754d {

    /* renamed from: e */
    static final String f34114e = "device_stats";

    /* renamed from: f */
    private static final String f34115f = C11461g.m41875a("DeviceStatsDbStorage");

    public C11763e(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: b */
    private static ContentValues m42929b(C11391b bVar, C11808c cVar) {
        ContentValues contentValues = new ContentValues();
        if (bVar.mo29835b() != null) {
            contentValues.put("id", bVar.mo29835b());
        }
        contentValues.put("type", Integer.valueOf(bVar.mo29837d()));
        contentValues.put("date", Long.valueOf(bVar.mo29832a().getTime()));
        contentValues.put("event_data", cVar.mo31645b(bVar.mo29836c().mo29841a()));
        contentValues.put(C11755a.C11756a.f34104f, Integer.valueOf(bVar.mo29838e() ? 1 : 0));
        return contentValues;
    }

    /* renamed from: d */
    static boolean m42932d(SQLiteDatabase sQLiteDatabase) {
        boolean c = m42931c(sQLiteDatabase);
        if (c) {
            return c;
        }
        try {
            m42928a(sQLiteDatabase);
            m42930b(sQLiteDatabase);
            return m42931c(sQLiteDatabase);
        } catch (Exception e) {
            C11461g.m41885b(f34115f, e, "Unable to recover %s", f34114e);
            return c;
        }
    }

    /* renamed from: a */
    public int mo31513a() {
        return mo31534i((String) null);
    }

    /* renamed from: c */
    public void mo31516c(String[] strArr) {
        if (strArr.length > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("in_transit", 0);
            try {
                mo31530a(contentValues, (Collection<String>) Arrays.asList(strArr));
            } catch (Exception unused) {
                C11461g.m41894e(f34115f, "Unable to update %s table.", mo31520p());
            }
        }
    }

    /* renamed from: f */
    public List<C11391b> mo31517f(C11808c cVar) {
        List<C11391b> emptyList = Collections.emptyList();
        this.f34110c.beginTransaction();
        Cursor rawQuery = this.f34110c.rawQuery("SELECT * FROM device_stats WHERE ready_to_send=1 AND in_transit=0", (String[]) null);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                int count = rawQuery.getCount();
                int columnIndex = rawQuery.getColumnIndex("id");
                String[] strArr = new String[count];
                ArrayList arrayList = new ArrayList(count);
                int i = 0;
                while (true) {
                    arrayList.add(m42927a(rawQuery, cVar));
                    strArr[i] = rawQuery.getString(columnIndex);
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                    int i2 = i + 1;
                    if (i >= count) {
                        break;
                    }
                    i = i2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("in_transit", 1);
                try {
                    mo31530a(contentValues, (Collection<String>) Arrays.asList(strArr));
                    this.f34110c.setTransactionSuccessful();
                } catch (Exception unused) {
                    C11461g.m41894e(f34115f, "Unable to update %s table.", mo31520p());
                }
                emptyList = arrayList;
            }
            rawQuery.close();
            this.f34110c.endTransaction();
        }
        return emptyList;
    }

    /* renamed from: m */
    public List<C11391b> mo31518m(C11808c cVar) {
        List<C11391b> emptyList = Collections.emptyList();
        Cursor rawQuery = this.f34110c.rawQuery("SELECT * FROM device_stats WHERE ready_to_send=0", (String[]) null);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                ArrayList arrayList = new ArrayList(rawQuery.getCount());
                do {
                    arrayList.add(m42927a(rawQuery, cVar));
                } while (rawQuery.moveToNext());
                emptyList = arrayList;
            }
            rawQuery.close();
        }
        return emptyList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo31520p() {
        return f34114e;
    }

    /* renamed from: a */
    private static C11391b m42927a(Cursor cursor, C11808c cVar) {
        try {
            int i = cursor.getInt(cursor.getColumnIndex("id"));
            int i2 = cursor.getInt(cursor.getColumnIndex("type"));
            Date date = new Date(cursor.getLong(cursor.getColumnIndex("date")));
            C11396d a = C11396d.m41683a(cVar.mo31644a(cursor.getString(cursor.getColumnIndex("event_data"))));
            boolean z = true;
            if (cursor.getInt(cursor.getColumnIndex(C11755a.C11756a.f34104f)) != 1) {
                z = false;
            }
            return C11391b.m41654a(i, i2, date, a, z);
        } catch (Exception e) {
            C11461g.m41885b(f34115f, e, "Unable to read analytic item from cursor.", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    static void m42930b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE device_stats(id INTEGER PRIMARY KEY, type INTEGER, date INTEGER, event_data TEXT, in_transit INTEGER DEFAULT 0, ready_to_send INTEGER DEFAULT 0);");
    }

    /* renamed from: c */
    private static boolean m42931c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,type,date,event_data,in_transit,ready_to_send FROM device_stats");
            return true;
        } catch (Exception e) {
            C11461g.m41895e(f34115f, e, "%s is invalid", f34114e);
            return false;
        }
    }

    /* renamed from: a */
    static void m42928a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_stats");
    }

    /* renamed from: a */
    public void mo31514a(C11391b bVar, C11808c cVar) {
        ContentValues b = m42929b(bVar, cVar);
        if (bVar.mo29835b() != null) {
            if (mo31521a(b, "id = ?", new String[]{bVar.mo29835b().toString()}) != 0) {
                return;
            }
        }
        mo31524a(b);
    }

    /* renamed from: a */
    public void mo31515a(String[] strArr) {
        if (strArr.length > 0) {
            try {
                int c = mo31532c(Arrays.asList(strArr));
                C11461g.m41888c(f34115f, "Deleted %d items of %d items", Integer.valueOf(strArr.length), Integer.valueOf(c));
            } catch (Exception unused) {
                C11461g.m41894e(f34115f, "Unable to clean up %s table.", mo31520p());
            }
        }
    }
}
