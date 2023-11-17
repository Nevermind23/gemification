package com.salesforce.marketingcloud.storage.p385db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

/* renamed from: com.salesforce.marketingcloud.storage.db.c */
class C11758c {
    private C11758c() {
    }

    /* renamed from: a */
    static String m42915a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    /* renamed from: a */
    static boolean m42916a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z = false;
        Cursor rawQuery = sQLiteDatabase.rawQuery(String.format(Locale.ENGLISH, "SELECT EXISTS(SELECT 1 FROM sqlite_master WHERE type='%s' and name='%s')", new Object[]{str, str2}), (String[]) null);
        if (rawQuery.moveToFirst() && rawQuery.getInt(0) == 0) {
            z = true;
        }
        rawQuery.close();
        return z;
    }
}
