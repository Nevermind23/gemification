package com.salesforce.marketingcloud.storage.p385db.upgrades;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.storage.p385db.C11769i;

/* renamed from: com.salesforce.marketingcloud.storage.db.upgrades.d */
public class C11781d {

    /* renamed from: a */
    private static final String f34205a = C11461g.m41875a("Version4ToVersion5");

    private C11781d() {
    }

    /* renamed from: a */
    private static void m43080a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("ALTER TABLE cloud_page_messages ADD COLUMN custom VARCHAR;");
            sQLiteDatabase.execSQL("ALTER TABLE cloud_page_messages ADD COLUMN keys VARCHAR;");
            sQLiteDatabase.execSQL("ALTER TABLE cloud_page_messages ADD COLUMN title VARCHAR;");
            sQLiteDatabase.execSQL("ALTER TABLE cloud_page_messages ADD COLUMN alert VARCHAR;");
            sQLiteDatabase.execSQL("ALTER TABLE cloud_page_messages ADD COLUMN sound VARCHAR;");
            sQLiteDatabase.execSQL("ALTER TABLE cloud_page_messages ADD COLUMN mediaUrl VARCHAR;");
            sQLiteDatabase.execSQL("ALTER TABLE cloud_page_messages ADD COLUMN mediaAlt VARCHAR;");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cloud_page_messages");
                sQLiteDatabase.execSQL("CREATE TABLE cloud_page_messages (id VARCHAR PRIMARY KEY, start_date VARCHAR, end_date VARCHAR, message_type INTEGER, content_type INTEGER, url VARCHAR, subject VARCHAR, read SMALLINT, message_deleted SMALLINT, custom VARCHAR, keys VARCHAR, title VARCHAR, alert VARCHAR, sound VARCHAR, mediaUrl VARCHAR, mediaAlt VARCHAR, message_hash VARCHAR, request_id VARCHAR);");
                sQLiteDatabase.setTransactionSuccessful();
                C11461g.m41885b(f34205a, e, "Unable to update cloud_page_messages table", new Object[0]);
            } catch (SQLException e2) {
                C11461g.m41885b(f34205a, e2, "Unable to create cloud_page_messages table", new Object[0]);
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: b */
    public static void m43081b(SQLiteDatabase sQLiteDatabase) {
        try {
            Cursor query = sQLiteDatabase.query("cloud_page_messages", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            if (query != null) {
                if (query.getColumnIndex(C11769i.C11770a.f34150m) == -1) {
                    m43080a(sQLiteDatabase);
                }
                query.close();
            }
        } catch (Exception unused) {
            C11461g.m41884b(f34205a, "Failed to update cloud_page_messages table.", new Object[0]);
        }
    }
}
