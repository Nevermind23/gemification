package com.salesforce.marketingcloud.storage.p385db.upgrades;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.salesforce.marketingcloud.C11461g;

/* renamed from: com.salesforce.marketingcloud.storage.db.upgrades.h */
public class C11785h {

    /* renamed from: a */
    private static final String f34209a = C11461g.m41875a("Version8ToVersion9");

    private C11785h() {
    }

    /* renamed from: a */
    private static void m43087a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("ALTER TABLE analytic_item ADD COLUMN predictive_intelligence_identifier VARCHAR DEFAULT NULL");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            try {
                C11461g.m41885b(f34209a, e, "Unable to update analytic_item table", new Object[0]);
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS analytic_item");
                sQLiteDatabase.execSQL("CREATE TABLE analytic_item (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_type INTEGER, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, json_payload VARCHAR, request_id VARCHAR, predictive_intelligence_identifier VARCHAR DEFAULT NULL);");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e2) {
                C11461g.m41885b(f34209a, e2, "Unable to create analytic_item table", new Object[0]);
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: b */
    public static void m43088b(SQLiteDatabase sQLiteDatabase) {
        m43087a(sQLiteDatabase);
    }
}
