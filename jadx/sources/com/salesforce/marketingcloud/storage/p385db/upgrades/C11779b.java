package com.salesforce.marketingcloud.storage.p385db.upgrades;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;

/* renamed from: com.salesforce.marketingcloud.storage.db.upgrades.b */
public final class C11779b {

    /* renamed from: a */
    private static final String f34203a = C11461g.m41875a("Version2ToVersion3");

    private C11779b() {
    }

    /* renamed from: a */
    public static int m43070a(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("analytic_types"));
        if (string.contains(",")) {
            return string.contains(AgreementTemplateEventKt.CONTRACT_TYPE_MBANK_PENSION_CONTRACT_ANDROID_ID) ? 5 : 2;
        }
        return Integer.parseInt(string.replaceAll("\\[", "").replaceAll("\\]", "").trim());
    }

    /* renamed from: b */
    private static void m43072b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE analytic_item_temp (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_types VARCHAR, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, json_payload VARCHAR)");
            sQLiteDatabase.execSQL("INSERT INTO analytic_item_temp SELECT id,event_date,analytic_product_type,analytic_types,value,ready_to_send,object_ids,json_payload FROM analytic_item");
            sQLiteDatabase.execSQL("DROP TABLE analytic_item");
            sQLiteDatabase.execSQL("CREATE TABLE analytic_item (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_type INTEGER, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, json_payload VARCHAR, request_id VARCHAR)");
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM analytic_item_temp", (String[]) null);
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        try {
                            contentValues.put("id", Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex("id"))));
                            contentValues.put(C11755a.C11756a.f34101c, rawQuery.getString(rawQuery.getColumnIndex(C11755a.C11756a.f34101c)));
                            contentValues.put(C11755a.C11756a.f34106h, Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex(C11755a.C11756a.f34106h))));
                            contentValues.put(C11755a.C11756a.f34102d, Integer.valueOf(m43070a(rawQuery)));
                            contentValues.put(C11755a.C11756a.f34100b, Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex(C11755a.C11756a.f34100b))));
                            contentValues.put(C11755a.C11756a.f34104f, Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex(C11755a.C11756a.f34104f))));
                            contentValues.put(C11755a.C11756a.f34103e, rawQuery.getString(rawQuery.getColumnIndex(C11755a.C11756a.f34103e)));
                            contentValues.put(C11755a.C11756a.f34105g, rawQuery.getString(rawQuery.getColumnIndex(C11755a.C11756a.f34105g)));
                            sQLiteDatabase.insert(C11755a.f34094e, (String) null, contentValues);
                        } catch (Exception e) {
                            C11461g.m41885b(f34203a, e, "Failed to update item in Analytics local storage during upgrade.", new Object[0]);
                        }
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
            }
            sQLiteDatabase.execSQL("DROP TABLE analytic_item_temp");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e2) {
            C11461g.m41885b(f34203a, e2, "Failed to upgrade Analytics local storage.  Starting fresh.  Some analytics items may have been lost.", new Object[0]);
            try {
                sQLiteDatabase.execSQL("CREATE TABLE analytic_item (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_type INTEGER, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, json_payload VARCHAR, request_id VARCHAR)");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e3) {
                C11461g.m41885b(f34203a, e3, "Failed to create local storage for Analytics.", new Object[0]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: c */
    private static void m43073c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put(C11769i.C11770a.f34147j, 8);
            sQLiteDatabase.update("cloud_page_messages", contentValues, (String) null, (String[]) null);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            C11461g.m41895e(f34203a, e, "Failed to convert CloudPageMessage to an InboxMessage.", new Object[0]);
            try {
                sQLiteDatabase.execSQL("DELETE FROM cloud_page_messages WHERE content_type=2 AND message_type=1;");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e2) {
                C11461g.m41885b(f34203a, e2, "Failed to remove legacy CloudPage data.", new Object[0]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: d */
    private static void m43074d(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("CREATE TABLE inbox_message_status (id VARCHAR PRIMARY KEY, status INTEGER);");
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM cloud_page_messages", (String[]) null);
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    do {
                        boolean z = rawQuery.getInt(rawQuery.getColumnIndex("message_deleted")) == 1;
                        boolean z2 = rawQuery.getInt(rawQuery.getColumnIndex("read")) == 1;
                        String string = rawQuery.getString(rawQuery.getColumnIndex("id"));
                        int i = z ? 2 : z2 ? 1 : 0;
                        ContentValues contentValues = new ContentValues();
                        if (i > 0) {
                            try {
                                contentValues.put("id", string);
                                contentValues.put("status", Integer.valueOf(i));
                                sQLiteDatabase.insert("inbox_message_status", (String) null, contentValues);
                            } catch (Exception e) {
                                C11461g.m41895e(f34203a, e, "Failed to add message %s to inbox_message_status table.", string);
                            }
                        }
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e2) {
            C11461g.m41885b(f34203a, e2, "Failed to update inbox_message_status table.", new Object[0]);
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS inbox_message_status;");
                sQLiteDatabase.execSQL("CREATE TABLE inbox_message_status (id VARCHAR PRIMARY KEY, status INTEGER);");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e3) {
                C11461g.m41885b(f34203a, e3, "Failed to create inbox_message_status table.", new Object[0]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: e */
    private static void m43075e(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE reg_temp (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, hwid VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, locale VARCHAR );");
            sQLiteDatabase.execSQL("INSERT INTO reg_temp SELECT " + "id,platform,subscriber_key,et_app_id,timezone,dst,tags,attributes,platform_version,push_enabled,location_enabled,hwid,system_token,device_id,app_version,sdk_version,locale" + " FROM registration");
            sQLiteDatabase.execSQL("DROP TABLE registration");
            sQLiteDatabase.execSQL("CREATE TABLE registration (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, hwid VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, locale VARCHAR );");
            sQLiteDatabase.execSQL("INSERT INTO registration SELECT " + "id,platform,subscriber_key,et_app_id,timezone,dst,tags,attributes,platform_version,push_enabled,location_enabled,hwid,system_token,device_id,app_version,sdk_version,locale" + " FROM reg_temp");
            sQLiteDatabase.execSQL("DROP TABLE reg_temp");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            C11461g.m41885b(f34203a, e, "Failed to upgrade Registration local storage.  Starting fresh.  Attributes, Tags and ContactKey will be lost.", new Object[0]);
            try {
                sQLiteDatabase.execSQL("CREATE TABLE registration (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, hwid VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, locale VARCHAR );");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e2) {
                C11461g.m41885b(f34203a, e2, "Failed to create local storage for Registration.", new Object[0]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: f */
    public static void m43076f(SQLiteDatabase sQLiteDatabase) {
        m43072b(sQLiteDatabase);
        m43075e(sQLiteDatabase);
        m43074d(sQLiteDatabase);
        m43073c(sQLiteDatabase);
        m43071a(sQLiteDatabase);
    }

    /* renamed from: a */
    private static void m43071a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("ALTER TABLE cloud_page_messages ADD COLUMN message_hash VARCHAR;");
            sQLiteDatabase.execSQL("ALTER TABLE cloud_page_messages ADD COLUMN request_id VARCHAR;");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            C11461g.m41885b(f34203a, e, "Failed to update cloud_page_messages table.", new Object[0]);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cloud_page_messages;");
            sQLiteDatabase.execSQL("CREATE TABLE cloud_page_messages (id VARCHAR PRIMARY KEY, start_date VARCHAR, end_date VARCHAR, message_type INTEGER, content_type INTEGER, url VARCHAR, subject VARCHAR, read SMALLINT, message_deleted SMALLINT, message_hash VARCHAR, request_id VARCHAR)");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }
}
