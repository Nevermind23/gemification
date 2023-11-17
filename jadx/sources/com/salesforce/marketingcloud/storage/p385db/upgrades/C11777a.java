package com.salesforce.marketingcloud.storage.p385db.upgrades;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.collection.ArraySet;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import com.salesforce.marketingcloud.util.C11808c;
import com.salesforce.marketingcloud.util.C11810e;
import com.salesforce.marketingcloud.util.C11819h;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.salesforce.marketingcloud.storage.db.upgrades.a */
public final class C11777a {

    /* renamed from: a */
    static final String f34198a = "geofence_request";

    /* renamed from: b */
    static final String f34199b = "beacon_request";

    /* renamed from: c */
    private static final String f34200c = C11461g.m41875a("Version1ToVersion2");

    /* renamed from: com.salesforce.marketingcloud.storage.db.upgrades.a$a */
    private static class C11778a {

        /* renamed from: a */
        final String f34201a;

        /* renamed from: b */
        final String f34202b;

        C11778a(String str, String str2) {
            this.f34201a = str;
            this.f34202b = str2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11778a)) {
                return false;
            }
            C11778a aVar = (C11778a) obj;
            String str = this.f34201a;
            if (str == null && aVar.f34201a == null) {
                return true;
            }
            return str.equalsIgnoreCase(aVar.f34201a);
        }

        public int hashCode() {
            return this.f34201a.toLowerCase().hashCode();
        }
    }

    private C11777a() {
    }

    /* renamed from: a */
    private static synchronized String m43061a(Collection<C11778a> collection) {
        synchronized (C11777a.class) {
            if (collection == null) {
                return null;
            }
            ArrayList<C11778a> arrayList = new ArrayList<>(collection.size());
            for (C11778a add : collection) {
                arrayList.add(add);
            }
            StringBuilder sb = new StringBuilder();
            for (C11778a aVar : arrayList) {
                if (aVar != null) {
                    sb.append(aVar.f34201a);
                    sb.append("^|^");
                    sb.append(aVar.f34202b);
                    sb.append("^|^");
                } else {
                    C11461g.m41894e(f34200c, "A null attribute was encountered.", new Object[0]);
                }
            }
            String sb2 = sb.toString();
            return sb2;
        }
    }

    /* renamed from: b */
    private static void m43065b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DELETE FROM messages WHERE message_type NOT IN ( 5, 3, 4 )");
        } catch (Exception e) {
            C11461g.m41885b(f34200c, e, "Unable to clean unused messages from db.", new Object[0]);
        }
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("ALTER TABLE messages RENAME TO " + "old_messages");
            sQLiteDatabase.execSQL("CREATE TABLE messages (id VARCHAR PRIMARY KEY, alert VARCHAR, sound VARCHAR, open_direct VARCHAR, start_date VARCHAR, end_date VARCHAR, message_type INTEGER, content_type INTEGER, url VARCHAR, custom VARCHAR, keys VARCHAR, period_show_count INTEGER, last_shown_date VARCHAR, next_allowed_show VARCHAR, show_count INTEGER, message_limit INTEGER, rolling_period SMALLINT, period_type INTEGER, number_of_periods INTEGER, messages_per_period INTEGER, proximity INTEGER, has_entered SMALLINT, notify_id INTEGER );");
            sQLiteDatabase.execSQL("INSERT INTO messages SELECT id, alert, sound, open_direct, start_date, end_date, message_type, content_type, url, custom, keys, period_show_count, last_shown_date, next_allowed_show, show_count, message_limit, rolling_period, period_type, number_of_periods, messages_per_period, proximity, has_entered, notify_id FROM " + "old_messages");
            sQLiteDatabase.execSQL("DROP TABLE " + "old_messages");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e2) {
            sQLiteDatabase.endTransaction();
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS messages");
                sQLiteDatabase.execSQL("CREATE TABLE messages (id VARCHAR PRIMARY KEY, alert VARCHAR, sound VARCHAR, open_direct VARCHAR, start_date VARCHAR, end_date VARCHAR, message_type INTEGER, content_type INTEGER, url VARCHAR, custom VARCHAR, keys VARCHAR, period_show_count INTEGER, last_shown_date VARCHAR, next_allowed_show VARCHAR, show_count INTEGER, message_limit INTEGER, rolling_period SMALLINT, period_type INTEGER, number_of_periods INTEGER, messages_per_period INTEGER, proximity INTEGER, has_entered SMALLINT, notify_id INTEGER );");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e3) {
                C11461g.m41885b(f34200c, e3, "Unable a create message table.", new Object[0]);
            }
            C11461g.m41885b(f34200c, e2, "Unable to update message table", new Object[0]);
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0018 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m43067c(android.database.sqlite.SQLiteDatabase r3) {
        /*
            java.lang.String r0 = "CREATE TABLE regions (id VARCHAR PRIMARY KEY, latitude VARCHAR, longitude VARCHAR, radius INTEGER, beacon_guid VARCHAR, beacon_major INTEGER, beacon_minor INTEGER, description VARCHAR, name VARCHAR, location_type INTEGER );"
            java.lang.String r1 = "DROP TABLE IF EXISTS regions"
            r3.beginTransaction()     // Catch:{ SQLException -> 0x0018 }
            r3.execSQL(r1)     // Catch:{ SQLException -> 0x0018 }
            r3.execSQL(r0)     // Catch:{ SQLException -> 0x0018 }
            java.lang.String r2 = "DELETE FROM region_message"
            r3.execSQL(r2)     // Catch:{ SQLException -> 0x0018 }
            r3.setTransactionSuccessful()     // Catch:{ SQLException -> 0x0018 }
            goto L_0x002b
        L_0x0016:
            r0 = move-exception
            goto L_0x002f
        L_0x0018:
            r3.execSQL(r1)     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = "DROP TABLE IF EXISTS region_message"
            r3.execSQL(r1)     // Catch:{ all -> 0x0016 }
            r3.execSQL(r0)     // Catch:{ all -> 0x0016 }
            java.lang.String r0 = "CREATE TABLE region_message (id INTEGER PRIMARY KEY AUTOINCREMENT, region_id VARCHAR, message_id VARCHAR );"
            r3.execSQL(r0)     // Catch:{ all -> 0x0016 }
            r3.setTransactionSuccessful()     // Catch:{ all -> 0x0016 }
        L_0x002b:
            r3.endTransaction()
            return
        L_0x002f:
            r3.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.p385db.upgrades.C11777a.m43067c(android.database.sqlite.SQLiteDatabase):void");
    }

    /* renamed from: d */
    private static void m43068d(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("CREATE TABLE location_table (id INTEGER PRIMARY KEY CHECK (id = 0), latitude VARCHAR, longitude VARCHAR );");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            C11461g.m41885b(f34200c, e, "Unable to create location table", new Object[0]);
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
        try {
            sQLiteDatabase.execSQL("DROP TABLE beacon_request");
            sQLiteDatabase.execSQL("DROP TABLE geofence_request");
        } catch (Exception e2) {
            C11461g.m41885b(f34200c, e2, "Unable to drop unused request tables", new Object[0]);
        }
    }

    /* renamed from: e */
    private static void m43069e(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("CREATE TABLE cloud_page_messages (id VARCHAR PRIMARY KEY, start_date VARCHAR, end_date VARCHAR, message_type INTEGER, content_type INTEGER, url VARCHAR, subject VARCHAR, read SMALLINT, message_deleted SMALLINT)");
            sQLiteDatabase.execSQL("INSERT INTO cloud_page_messages SELECT id,start_date,end_date,message_type,content_type,url,subject,read,message_deleted FROM messages WHERE message_type=1 AND content_type=2");
            sQLiteDatabase.execSQL("DELETE FROM messages WHERE message_type=1 AND content_type=2");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            C11461g.m41885b(f34200c, e, "Failed to move Messages to CloudPage Messages table.", new Object[0]);
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cloud_page_messages");
                sQLiteDatabase.execSQL("CREATE TABLE cloud_page_messages (id VARCHAR PRIMARY KEY, start_date VARCHAR, end_date VARCHAR, message_type INTEGER, content_type INTEGER, url VARCHAR, subject VARCHAR, read SMALLINT, message_deleted SMALLINT)");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e2) {
                C11461g.m41885b(f34200c, e2, "Could not create cloud_page_messages table.", new Object[0]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: a */
    private static ArrayList<C11778a> m43062a(String str) {
        ArrayList<C11778a> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("\\^\\|\\^");
            int i = 0;
            while (i < split.length) {
                while (true) {
                    String str2 = split[i];
                    if (str2 != null && !str2.isEmpty()) {
                        break;
                    }
                    i++;
                }
                int i2 = i + 1;
                if (i2 >= split.length) {
                    arrayList.add(new C11778a(split[i], ""));
                } else {
                    arrayList.add(new C11778a(split[i], split[i2]));
                }
                i += 2;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m43066b(SQLiteDatabase sQLiteDatabase, Context context, C11808c cVar) {
        m43069e(sQLiteDatabase);
        m43065b(sQLiteDatabase);
        m43068d(sQLiteDatabase);
        m43067c(sQLiteDatabase);
        m43064a(sQLiteDatabase, context, cVar);
        m43063a(sQLiteDatabase);
    }

    /* renamed from: a */
    private static void m43063a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("ALTER TABLE analytic_item RENAME TO " + "old_analytic_item");
            sQLiteDatabase.execSQL("CREATE TABLE analytic_item (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_types VARCHAR, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, json_payload VARCHAR)");
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + "old_analytic_item", (String[]) null);
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        try {
                            contentValues.put("id", Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex("id"))));
                            contentValues.put(C11755a.C11756a.f34101c, rawQuery.getString(rawQuery.getColumnIndex(C11755a.C11756a.f34101c)));
                            contentValues.put(C11755a.C11756a.f34106h, Integer.valueOf(TextUtils.isEmpty(rawQuery.getString(rawQuery.getColumnIndex("pi_app_key"))) ^ true ? 1 : 0));
                            contentValues.put("analytic_types", rawQuery.getString(rawQuery.getColumnIndex("analytic_types")));
                            contentValues.put(C11755a.C11756a.f34100b, Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex(C11755a.C11756a.f34100b))));
                            contentValues.put(C11755a.C11756a.f34104f, Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex(C11755a.C11756a.f34104f))));
                            contentValues.put(C11755a.C11756a.f34103e, rawQuery.getString(rawQuery.getColumnIndex(C11755a.C11756a.f34103e)));
                            contentValues.put(C11755a.C11756a.f34105g, rawQuery.getString(rawQuery.getColumnIndex(C11755a.C11756a.f34105g)));
                            sQLiteDatabase.insert(C11755a.f34094e, (String) null, contentValues);
                        } catch (Exception e) {
                            C11461g.m41885b(f34200c, e, "Failed to update item in Analytics local storage during upgrade.", new Object[0]);
                        }
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
            }
            sQLiteDatabase.execSQL("DROP TABLE " + "old_analytic_item");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e2) {
            C11461g.m41885b(f34200c, e2, "Failed to upgrade Analytics local storage.  Starting fresh.  Some analytics items may have been lost.", new Object[0]);
            try {
                sQLiteDatabase.execSQL("CREATE TABLE analytic_item (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_type INTEGER, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, json_payload VARCHAR, request_id VARCHAR);");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e3) {
                C11461g.m41885b(f34200c, e3, "Failed to create local storage for Analytics.", new Object[0]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: a */
    private static void m43064a(SQLiteDatabase sQLiteDatabase, Context context, C11808c cVar) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("ALTER TABLE registration RENAME TO old_registration");
            sQLiteDatabase.execSQL("CREATE TABLE registration (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, badge INTEGER, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, hwid VARCHAR, gcm_sender_id VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, locale VARCHAR )");
            sQLiteDatabase.execSQL("INSERT INTO registration (" + "id,platform,subscriber_key,et_app_id,badge,timezone,dst,tags,attributes,platform_version,push_enabled,location_enabled,hwid,gcm_sender_id,locale" + ") SELECT " + "id,platform,subscriber_key,et_app_id,badge,timezone,dst,tags,attributes,platform_version,push_enabled,location_enabled,hwid,gcm_sender_id,locale" + " FROM old_registration");
            if (DatabaseUtils.queryNumEntries(sQLiteDatabase, C11772k.f34166e) > 0) {
                ContentValues contentValues = new ContentValues(3);
                contentValues.put(C11772k.C11773a.f34184p, C11810e.m43212a(context, (String) null));
                contentValues.put(C11772k.C11773a.f34185q, C11819h.m43265a(context));
                contentValues.put(C11772k.C11773a.f34186r, MarketingCloudSdk.getSdkVersionName());
                sQLiteDatabase.update(C11772k.f34166e, contentValues, (String) null, (String[]) null);
            }
            sQLiteDatabase.execSQL("DROP TABLE old_registration");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            C11461g.m41885b(f34200c, e, "Unable to update registration table", new Object[0]);
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS registration");
                sQLiteDatabase.execSQL("CREATE TABLE registration (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, badge INTEGER, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, hwid VARCHAR, gcm_sender_id VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, locale VARCHAR )");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e2) {
                C11461g.m41885b(f34200c, e2, "Unable to create registration table", new Object[0]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
        try {
            sQLiteDatabase.beginTransaction();
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT id, attributes FROM registration", (String[]) null);
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    do {
                        ArrayList<C11778a> a = m43062a(cVar.mo31644a(rawQuery.getString(rawQuery.getColumnIndex(C11772k.C11773a.f34176h))));
                        ArraySet arraySet = new ArraySet();
                        if (!a.isEmpty()) {
                            for (int size = a.size() - 1; size >= 0; size--) {
                                arraySet.add(a.get(size));
                            }
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put(C11772k.C11773a.f34176h, cVar.mo31645b(m43061a((Collection<C11778a>) arraySet)));
                            sQLiteDatabase.update(C11772k.f34166e, contentValues2, "id=?", new String[]{rawQuery.getString(rawQuery.getColumnIndex("id"))});
                        }
                    } while (rawQuery.moveToNext());
                }
                rawQuery.close();
            }
        } catch (Exception e3) {
            C11461g.m41884b(f34200c, "Unable to remove duplicate attributes from row", e3);
        } catch (Throwable th2) {
            sQLiteDatabase.endTransaction();
            throw th2;
        }
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
    }
}
