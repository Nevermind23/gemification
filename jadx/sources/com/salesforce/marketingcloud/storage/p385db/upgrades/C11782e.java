package com.salesforce.marketingcloud.storage.p385db.upgrades;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.salesforce.marketingcloud.C11461g;

/* renamed from: com.salesforce.marketingcloud.storage.db.upgrades.e */
public class C11782e {

    /* renamed from: a */
    private static final String f34206a = C11461g.m41875a("Version5ToVersion6");

    /* renamed from: a */
    private static void m43082a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("ALTER TABLE registration ADD COLUMN proximity_enabled SMALLINT DEFAULT 0");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            try {
                C11461g.m41885b(f34206a, e, "Unable to update registration table", new Object[0]);
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS registration");
                sQLiteDatabase.execSQL("CREATE TABLE registration (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, proximity_enabled SMALLINT, hwid VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, locale VARCHAR );");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e2) {
                C11461g.m41885b(f34206a, e2, "Unable to create registration table", new Object[0]);
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: b */
    public static void m43083b(SQLiteDatabase sQLiteDatabase) {
        m43082a(sQLiteDatabase);
    }
}
