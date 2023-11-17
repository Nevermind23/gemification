package com.salesforce.marketingcloud.storage.p385db.upgrades;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.util.C11808c;

@SuppressLint({"Range"})
/* renamed from: com.salesforce.marketingcloud.storage.db.upgrades.i */
public class C11786i {

    /* renamed from: a */
    private static final String f34210a = C11461g.m41875a("Version9ToVersion10");

    private C11786i() {
    }

    /* renamed from: a */
    private static void m43089a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("CREATE TABLE device_stats(id INTEGER PRIMARY KEY, type INTEGER, date INTEGER, event_data TEXT, in_transit INTEGER DEFAULT 0, ready_to_send INTEGER DEFAULT 0);");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            C11461g.m41885b(f34210a, e, "Unable to create device stats table.", new Object[0]);
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: b */
    private static void m43091b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("CREATE TABLE triggers (id TEXT PRIMARY KEY, _key TEXT, start_date INTEGER DEFAULT NULL, _trigger TEXT, app_open_count INTEGER DEFAULT 0);");
            sQLiteDatabase.execSQL("CREATE TABLE in_app_messages(id TEXT PRIMARY KEY, priority INTEGER DEFAULT 999, start_date DATETIME, end_date DATETIME, modified_date DATETIME, display_limit INTEGER DEFAULT 1, media_url TEXT DEFAULT NULL, message_json TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE iam_state(id TEXT PRIMARY KEY, display_count integer DEFAULT 0, FOREIGN KEY (id) REFERENCES in_app_messages(id) ON DELETE CASCADE);");
            sQLiteDatabase.execSQL("CREATE TRIGGER iam_state_init AFTER INSERT ON in_app_messages BEGIN INSERT INTO iam_state (id) VALUES (NEW.id); END;");
            sQLiteDatabase.execSQL("CREATE VIEW iam_view AS SELECT in_app_messages.id,in_app_messages.priority,in_app_messages.start_date,in_app_messages.end_date,in_app_messages.modified_date,in_app_messages.display_limit,in_app_messages.message_json,iam_state.display_count FROM in_app_messages INNER JOIN iam_state ON iam_state.id = in_app_messages.id;");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            C11461g.m41885b(f34210a, e, "Unable to create in app message table", new Object[0]);
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: c */
    private static void m43093c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.execSQL("CREATE TABLE region_messages ( region_id TEXT, message_id TEXT, FOREIGN KEY (region_id) REFERENCES regions(id) ON DELETE CASCADE, PRIMARY KEY (region_id, message_id));");
            sQLiteDatabase.execSQL("INSERT INTO region_messages SELECT region_id,message_id FROM region_message;");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_message");
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            C11461g.m41885b(f34210a, e, "Unable to create region_messages table and migrate data from region_message.", new Object[0]);
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_messages");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_message");
                sQLiteDatabase.execSQL("CREATE TABLE region_messages ( region_id TEXT, message_id TEXT, FOREIGN KEY (region_id) REFERENCES regions(id) ON DELETE CASCADE, PRIMARY KEY (region_id, message_id));");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e2) {
                C11461g.m41885b(f34210a, e2, "Unable to create region_messages table", new Object[0]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase.endTransaction();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        r18 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01fb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01fe, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ff, code lost:
        r1 = r21;
        r19 = r8;
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0206, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0207, code lost:
        r1 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x020b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x020c, code lost:
        r1 = r21;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0226 A[EDGE_INSN: B:101:0x0226->B:67:0x0226 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01b3 A[Catch:{ Exception -> 0x01fb, all -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01ba A[Catch:{ Exception -> 0x01fb, all -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0206 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0227 A[Catch:{ Exception -> 0x023c }, LOOP:0: B:6:0x0036->B:68:0x0227, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0261 A[Catch:{ Exception -> 0x028f, all -> 0x028d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m43090a(android.database.sqlite.SQLiteDatabase r21, com.salesforce.marketingcloud.util.C11808c r22) {
        /*
            r1 = r21
            r2 = r22
            java.lang.String r3 = "message_hash"
            java.lang.String r4 = "sound"
            java.lang.String r5 = "alert"
            java.lang.String r6 = "title"
            java.lang.String r7 = "keys"
            java.lang.String r8 = "custom"
            java.lang.String r9 = "subject"
            java.lang.String r10 = "url"
            java.lang.String r11 = "end_date"
            java.lang.String r12 = "start_date"
            java.lang.String r13 = "id"
            r14 = 0
            r21.beginTransaction()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "DROP TABLE IF EXISTS inbox_messages;"
            r1.execSQL(r0)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "CREATE TABLE inbox_messages(id TEXT PRIMARY KEY, start_date INTEGER DEFAULT NULL, end_date INTEGER DEFAULT NULL, is_deleted INTEGER DEFAULT 0, is_read INTEGER DEFAULT 0, is_dirty INTEGER DEFAULT 0, message_hash TEXT DEFAULT NULL, message_json TEXT);"
            r1.execSQL(r0)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "SELECT * FROM cloud_page_messages"
            android.database.Cursor r15 = r1.rawQuery(r0, r14)     // Catch:{ Exception -> 0x0240 }
            if (r15 == 0) goto L_0x0236
            boolean r0 = r15.moveToFirst()     // Catch:{ Exception -> 0x0240 }
            if (r0 == 0) goto L_0x0230
        L_0x0036:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x020f }
            r0.<init>()     // Catch:{ Exception -> 0x020f }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ Exception -> 0x020f }
            r14.<init>()     // Catch:{ Exception -> 0x020f }
            int r1 = r15.getColumnIndex(r13)     // Catch:{ Exception -> 0x020b, all -> 0x0206 }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x020b, all -> 0x0206 }
            r14.put(r13, r1)     // Catch:{ Exception -> 0x020b, all -> 0x0206 }
            r0.put(r13, r1)     // Catch:{ Exception -> 0x020b, all -> 0x0206 }
            int r1 = r15.getColumnIndex(r12)     // Catch:{ Exception -> 0x020b, all -> 0x0206 }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x020b, all -> 0x0206 }
            if (r1 == 0) goto L_0x0074
            java.util.Date r16 = com.salesforce.marketingcloud.util.C11824l.m43299f(r1)     // Catch:{ Exception -> 0x006f, all -> 0x0206 }
            long r16 = r16.getTime()     // Catch:{ Exception -> 0x006f, all -> 0x0206 }
            r18 = r13
            java.lang.Long r13 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            r14.put(r12, r13)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r13 = "startDateUtc"
            r0.put(r13, r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            goto L_0x0076
        L_0x006f:
            r0 = move-exception
            r18 = r13
            goto L_0x01ff
        L_0x0074:
            r18 = r13
        L_0x0076:
            int r1 = r15.getColumnIndex(r11)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            if (r1 == 0) goto L_0x0094
            java.util.Date r13 = com.salesforce.marketingcloud.util.C11824l.m43299f(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            long r16 = r13.getTime()     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.Long r13 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            r14.put(r11, r13)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r13 = "endDateUtc"
            r0.put(r13, r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
        L_0x0094:
            java.lang.String r1 = "messageType"
            r13 = 8
            r0.put(r1, r13)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r1 = "contentType"
            r13 = 2
            r0.put(r1, r13)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            int r1 = r15.getColumnIndex(r10)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r1 = r2.mo31644a(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            r0.put(r10, r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            int r1 = r15.getColumnIndex(r9)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r1 = r2.mo31644a(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            r0.put(r9, r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r1 = "read"
            int r1 = r15.getColumnIndex(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            int r1 = r15.getInt(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r13 = "is_read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            r14.put(r13, r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r1 = "message_deleted"
            int r1 = r15.getColumnIndex(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            int r1 = r15.getInt(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r13 = "is_deleted"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            r14.put(r13, r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            int r1 = r15.getColumnIndex(r8)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r1 = r2.mo31644a(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            r0.put(r8, r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            int r1 = r15.getColumnIndex(r7)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            java.lang.String r1 = r2.mo31644a(r1)     // Catch:{ Exception -> 0x01fe, all -> 0x0206 }
            if (r1 == 0) goto L_0x015f
            java.util.Map r1 = com.salesforce.marketingcloud.util.C11824l.m43294c((java.lang.String) r1)     // Catch:{ Exception -> 0x0156, all -> 0x0206 }
            boolean r13 = r1.isEmpty()     // Catch:{ Exception -> 0x0156, all -> 0x0206 }
            if (r13 != 0) goto L_0x015f
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{ Exception -> 0x0156, all -> 0x0206 }
            r13.<init>()     // Catch:{ Exception -> 0x0156, all -> 0x0206 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ Exception -> 0x0156, all -> 0x0206 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0156, all -> 0x0206 }
        L_0x0119:
            boolean r16 = r1.hasNext()     // Catch:{ Exception -> 0x0156, all -> 0x0206 }
            if (r16 == 0) goto L_0x014e
            java.lang.Object r16 = r1.next()     // Catch:{ Exception -> 0x0156, all -> 0x0206 }
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16     // Catch:{ Exception -> 0x0156, all -> 0x0206 }
            r17 = r1
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0156, all -> 0x0206 }
            r1.<init>()     // Catch:{ Exception -> 0x0156, all -> 0x0206 }
            r19 = r8
            java.lang.String r8 = "key"
            r20 = r9
            java.lang.Object r9 = r16.getKey()     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            r1.put(r8, r9)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r8 = "value"
            java.lang.Object r9 = r16.getValue()     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            r1.put(r8, r9)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            r13.put(r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            r1 = r17
            r8 = r19
            r9 = r20
            goto L_0x0119
        L_0x014c:
            r0 = move-exception
            goto L_0x0159
        L_0x014e:
            r19 = r8
            r20 = r9
            r0.put(r7, r13)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            goto L_0x0163
        L_0x0156:
            r0 = move-exception
            r19 = r8
        L_0x0159:
            r20 = r9
        L_0x015b:
            r1 = r21
            goto L_0x0216
        L_0x015f:
            r19 = r8
            r20 = r9
        L_0x0163:
            int r1 = r15.getColumnIndex(r6)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r1 = r2.mo31644a(r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            r0.put(r6, r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            int r1 = r15.getColumnIndex(r5)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r1 = r2.mo31644a(r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            r0.put(r5, r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            int r1 = r15.getColumnIndex(r4)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            r0.put(r4, r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r1 = "mediaUrl"
            int r1 = r15.getColumnIndex(r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r1 = r2.mo31644a(r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r8 = "mediaAlt"
            int r8 = r15.getColumnIndex(r8)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r8 = r15.getString(r8)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r8 = r2.mo31644a(r8)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            if (r1 != 0) goto L_0x01ac
            if (r8 == 0) goto L_0x01c4
        L_0x01ac:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            r9.<init>()     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            if (r1 == 0) goto L_0x01b8
            java.lang.String r13 = "androidUrl"
            r9.put(r13, r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
        L_0x01b8:
            if (r8 == 0) goto L_0x01bf
            java.lang.String r1 = "alt"
            r9.put(r1, r8)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
        L_0x01bf:
            java.lang.String r1 = "media"
            r0.put(r1, r9)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
        L_0x01c4:
            int r1 = r15.getColumnIndex(r3)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r1 = r15.getString(r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            r14.put(r3, r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r8 = "hash"
            r0.put(r8, r1)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r1 = "requestId"
            java.lang.String r8 = "request_id"
            int r8 = r15.getColumnIndex(r8)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r8 = r15.getString(r8)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            r0.put(r1, r8)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r1 = "message_json"
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r0 = r2.mo31645b(r0)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            r14.put(r1, r0)     // Catch:{ Exception -> 0x01fb, all -> 0x0206 }
            java.lang.String r0 = "inbox_messages"
            r8 = 0
            r1 = r21
            r1.insert(r0, r8, r14)     // Catch:{ Exception -> 0x01f9 }
            goto L_0x0220
        L_0x01f9:
            r0 = move-exception
            goto L_0x0216
        L_0x01fb:
            r0 = move-exception
            goto L_0x015b
        L_0x01fe:
            r0 = move-exception
        L_0x01ff:
            r1 = r21
            r19 = r8
            r20 = r9
            goto L_0x0216
        L_0x0206:
            r0 = move-exception
            r1 = r21
            goto L_0x02a7
        L_0x020b:
            r0 = move-exception
            r1 = r21
            goto L_0x0210
        L_0x020f:
            r0 = move-exception
        L_0x0210:
            r19 = r8
            r20 = r9
            r18 = r13
        L_0x0216:
            java.lang.String r8 = f34210a     // Catch:{ Exception -> 0x023c }
            java.lang.String r9 = "Unable to update Inbox message."
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x023c }
            com.salesforce.marketingcloud.C11461g.m41885b(r8, r0, r9, r14)     // Catch:{ Exception -> 0x023c }
        L_0x0220:
            boolean r0 = r15.moveToNext()     // Catch:{ Exception -> 0x023c }
            if (r0 != 0) goto L_0x0227
            goto L_0x0232
        L_0x0227:
            r13 = r18
            r8 = r19
            r9 = r20
            r14 = 0
            goto L_0x0036
        L_0x0230:
            r18 = r13
        L_0x0232:
            r15.close()     // Catch:{ Exception -> 0x023c }
            goto L_0x0238
        L_0x0236:
            r18 = r13
        L_0x0238:
            r21.setTransactionSuccessful()     // Catch:{ Exception -> 0x023c }
            goto L_0x024d
        L_0x023c:
            r0 = move-exception
            goto L_0x0243
        L_0x023e:
            r0 = move-exception
            goto L_0x02a7
        L_0x0240:
            r0 = move-exception
            r18 = r13
        L_0x0243:
            java.lang.String r2 = f34210a     // Catch:{ all -> 0x023e }
            java.lang.String r3 = "Unable to update any Inbox messages."
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x023e }
            com.salesforce.marketingcloud.C11461g.m41885b(r2, r0, r3, r5)     // Catch:{ all -> 0x023e }
        L_0x024d:
            r21.endTransaction()
            java.lang.String r0 = "DROP TABLE IF EXISTS cloud_page_messages"
            r1.execSQL(r0)
            r21.beginTransaction()
            java.lang.String r0 = "SELECT id FROM inbox_message_status"
            r2 = 0
            android.database.Cursor r0 = r1.rawQuery(r0, r2)     // Catch:{ Exception -> 0x028f }
            if (r0 == 0) goto L_0x0289
            boolean r2 = r0.moveToFirst()     // Catch:{ Exception -> 0x028f }
            if (r2 == 0) goto L_0x0286
        L_0x0267:
            java.lang.String r2 = "UPDATE inbox_messages SET is_dirty=1 WHERE id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x028f }
            r4 = r18
            int r5 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x028f }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x028f }
            r6 = 0
            r3[r6] = r5     // Catch:{ Exception -> 0x028f }
            r1.execSQL(r2, r3)     // Catch:{ Exception -> 0x028f }
            boolean r2 = r0.moveToNext()     // Catch:{ Exception -> 0x028f }
            if (r2 != 0) goto L_0x0283
            goto L_0x0286
        L_0x0283:
            r18 = r4
            goto L_0x0267
        L_0x0286:
            r0.close()     // Catch:{ Exception -> 0x028f }
        L_0x0289:
            r21.setTransactionSuccessful()     // Catch:{ Exception -> 0x028f }
            goto L_0x029a
        L_0x028d:
            r0 = move-exception
            goto L_0x02a3
        L_0x028f:
            r0 = move-exception
            java.lang.String r2 = f34210a     // Catch:{ all -> 0x028d }
            java.lang.String r3 = "Unable to update inbox status values"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x028d }
            com.salesforce.marketingcloud.C11461g.m41885b(r2, r0, r3, r4)     // Catch:{ all -> 0x028d }
        L_0x029a:
            r21.endTransaction()
            java.lang.String r0 = "DROP TABLE IF EXISTS inbox_message_status"
            r1.execSQL(r0)
            return
        L_0x02a3:
            r21.endTransaction()
            throw r0
        L_0x02a7:
            r21.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.p385db.upgrades.C11786i.m43090a(android.database.sqlite.SQLiteDatabase, com.salesforce.marketingcloud.util.c):void");
    }

    /* renamed from: b */
    public static void m43092b(SQLiteDatabase sQLiteDatabase, C11808c cVar) {
        m43090a(sQLiteDatabase, cVar);
        m43091b(sQLiteDatabase);
        m43089a(sQLiteDatabase);
        m43093c(sQLiteDatabase);
    }
}
