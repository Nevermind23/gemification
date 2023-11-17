package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C4244j4;
import com.google.android.gms.internal.measurement.C4286lc;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.k */
final class C4687k extends C4583a9 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f14547f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f14548g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String[] f14549h = {C11772k.C11773a.f34185q, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f14550i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String[] f14551j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String[] f14552k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String[] f14553l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String[] f14554m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C4676j f14555d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4828w8 f14556e = new C4828w8(this.f14613a.mo14548a());

    C4687k(C4719m9 m9Var) {
        super(m9Var);
        this.f14613a.mo14876z();
        this.f14555d = new C4676j(this, this.f14613a.mo14550c(), "google_app_measurement.db");
    }

    /* renamed from: H */
    static final void m17811H(ContentValues contentValues, String str, Object obj) {
        C7264i.m27898g(C11755a.C11756a.f34100b);
        C7264i.m27902k(obj);
        if (obj instanceof String) {
            contentValues.put(C11755a.C11756a.f34100b, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(C11755a.C11756a.f34100b, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(C11755a.C11756a.f34100b, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: I */
    private final long m17812I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo14495P().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14675r().mo14617c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: K */
    private final long m17813K(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo14495P().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14675r().mo14617c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14489G(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.C4697k9 r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            p182n6.C7264i.m27902k(r26)
            r20.mo14554h()
            r20.mo14301i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.mo14495P()     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 2
            r12 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0071
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            goto L_0x003a
        L_0x0032:
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            java.lang.String r7 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
        L_0x003a:
            if (r4 == 0) goto L_0x003e
            java.lang.String r5 = "rowid <= ? and "
        L_0x003e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r4.append(r7)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r5 != 0) goto L_0x0062
            r4.close()
            return
        L_0x0062:
            java.lang.String r3 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x006e }
            r4.close()     // Catch:{ SQLiteException -> 0x006e }
            goto L_0x00b3
        L_0x006e:
            r0 = move-exception
            goto L_0x020d
        L_0x0071:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0080
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            java.lang.String r7 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            goto L_0x0084
        L_0x0080:
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
        L_0x0084:
            if (r4 == 0) goto L_0x0088
            java.lang.String r5 = " and rowid <= ?"
        L_0x0088:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            java.lang.String r7 = "select metadata_fingerprint from raw_events where app_id = ?"
            r4.append(r7)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            r4.append(r5)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            java.lang.String r5 = " order by rowid limit 1;"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            android.database.Cursor r4 = r0.rawQuery(r4, r6)     // Catch:{ SQLiteException -> 0x020b, all -> 0x0209 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r5 != 0) goto L_0x00ac
            r4.close()
            return
        L_0x00ac:
            java.lang.String r5 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x006e }
            r4.close()     // Catch:{ SQLiteException -> 0x006e }
        L_0x00b3:
            r16 = r4
            r17 = r5
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0205, all -> 0x0201 }
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0205, all -> 0x0201 }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0205, all -> 0x0201 }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0205, all -> 0x0201 }
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r15 = r11
            r11 = r18
            r12 = r19
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0205, all -> 0x0201 }
            boolean r4 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            if (r4 != 0) goto L_0x00f4
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14675r()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r3)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            r0.mo14616b(r2, r4)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            r12.close()
            return
        L_0x00f4:
            byte[] r4 = r12.getBlob(r15)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            com.google.android.gms.internal.measurement.t4 r5 = com.google.android.gms.internal.measurement.C4431u4.m16847S1()     // Catch:{ IOException -> 0x01d7 }
            com.google.android.gms.internal.measurement.qa r4 = com.google.android.gms.measurement.internal.C4741o9.m18052C(r5, r4)     // Catch:{ IOException -> 0x01d7 }
            com.google.android.gms.internal.measurement.t4 r4 = (com.google.android.gms.internal.measurement.C4414t4) r4     // Catch:{ IOException -> 0x01d7 }
            com.google.android.gms.internal.measurement.p9 r4 = r4.mo13361l()     // Catch:{ IOException -> 0x01d7 }
            com.google.android.gms.internal.measurement.u4 r4 = (com.google.android.gms.internal.measurement.C4431u4) r4     // Catch:{ IOException -> 0x01d7 }
            boolean r5 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            if (r5 == 0) goto L_0x0121
            com.google.android.gms.measurement.internal.t4 r5 = r1.f14613a     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo14551d()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14680w()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r3)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            r5.mo14616b(r6, r7)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
        L_0x0121:
            r12.close()     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            p182n6.C7264i.m27902k(r4)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            r2.f14579a = r4     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            r13 = 3
            if (r4 == 0) goto L_0x0141
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            r5[r15] = r3     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            r14 = 1
            r5[r14] = r17     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            r7 = 2
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            r7 = r4
            r8 = r5
            goto L_0x014d
        L_0x0141:
            r14 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            r6[r14] = r17     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            r7 = r4
            r8 = r6
        L_0x014d:
            java.lang.String r5 = "raw_events"
            java.lang.String r4 = "rowid"
            java.lang.String r6 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r10 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r6, r9, r10}     // Catch:{ SQLiteException -> 0x01fb, all -> 0x01f5 }
            r9 = 0
            r10 = 0
            java.lang.String r11 = "rowid"
            r16 = 0
            r4 = r0
            r17 = r12
            r12 = r16
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01f3, all -> 0x01f1 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x006e }
            if (r0 == 0) goto L_0x01c0
        L_0x0170:
            long r5 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x006e }
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.internal.measurement.i4 r7 = com.google.android.gms.internal.measurement.C4244j4.m16143E()     // Catch:{ IOException -> 0x01a1 }
            com.google.android.gms.internal.measurement.qa r0 = com.google.android.gms.measurement.internal.C4741o9.m18052C(r7, r0)     // Catch:{ IOException -> 0x01a1 }
            com.google.android.gms.internal.measurement.i4 r0 = (com.google.android.gms.internal.measurement.C4227i4) r0     // Catch:{ IOException -> 0x01a1 }
            java.lang.String r7 = r4.getString(r14)     // Catch:{ SQLiteException -> 0x006e }
            r0.mo13234A(r7)     // Catch:{ SQLiteException -> 0x006e }
            r7 = 2
            long r8 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x006e }
            r0.mo13238E(r8)     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.internal.measurement.p9 r0 = r0.mo13361l()     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.internal.measurement.j4 r0 = (com.google.android.gms.internal.measurement.C4244j4) r0     // Catch:{ SQLiteException -> 0x006e }
            boolean r0 = r2.mo14535a(r5, r0)     // Catch:{ SQLiteException -> 0x006e }
            if (r0 != 0) goto L_0x01b6
            r4.close()
            return
        L_0x01a1:
            r0 = move-exception
            r7 = 2
            com.google.android.gms.measurement.internal.t4 r5 = r1.f14613a     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo14551d()     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14675r()     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r3)     // Catch:{ SQLiteException -> 0x006e }
            r5.mo14617c(r6, r8, r0)     // Catch:{ SQLiteException -> 0x006e }
        L_0x01b6:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x006e }
            if (r0 != 0) goto L_0x0170
            r4.close()
            return
        L_0x01c0:
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ SQLiteException -> 0x006e }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14680w()     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r3)     // Catch:{ SQLiteException -> 0x006e }
            r0.mo14616b(r2, r5)     // Catch:{ SQLiteException -> 0x006e }
            r4.close()
            return
        L_0x01d7:
            r0 = move-exception
            r17 = r12
            com.google.android.gms.measurement.internal.t4 r2 = r1.f14613a     // Catch:{ SQLiteException -> 0x01f3, all -> 0x01f1 }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ SQLiteException -> 0x01f3, all -> 0x01f1 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ SQLiteException -> 0x01f3, all -> 0x01f1 }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r3)     // Catch:{ SQLiteException -> 0x01f3, all -> 0x01f1 }
            r2.mo14617c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01f3, all -> 0x01f1 }
            r17.close()
            return
        L_0x01f1:
            r0 = move-exception
            goto L_0x01f8
        L_0x01f3:
            r0 = move-exception
            goto L_0x01fe
        L_0x01f5:
            r0 = move-exception
            r17 = r12
        L_0x01f8:
            r3 = r17
            goto L_0x0228
        L_0x01fb:
            r0 = move-exception
            r17 = r12
        L_0x01fe:
            r4 = r17
            goto L_0x020d
        L_0x0201:
            r0 = move-exception
            r3 = r16
            goto L_0x0228
        L_0x0205:
            r0 = move-exception
            r4 = r16
            goto L_0x020d
        L_0x0209:
            r0 = move-exception
            goto L_0x0228
        L_0x020b:
            r0 = move-exception
            r4 = r3
        L_0x020d:
            com.google.android.gms.measurement.internal.t4 r2 = r1.f14613a     // Catch:{ all -> 0x0226 }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ all -> 0x0226 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x0226 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r3)     // Catch:{ all -> 0x0226 }
            r2.mo14617c(r5, r3, r0)     // Catch:{ all -> 0x0226 }
            if (r4 == 0) goto L_0x0225
            r4.close()
        L_0x0225:
            return
        L_0x0226:
            r0 = move-exception
            r3 = r4
        L_0x0228:
            if (r3 == 0) goto L_0x022d
            r3.close()
        L_0x022d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4687k.mo14489G(java.lang.String, long, long, com.google.android.gms.measurement.internal.k9):void");
    }

    /* renamed from: J */
    public final int mo14490J(String str, String str2) {
        C7264i.m27898g(str);
        C7264i.m27898g(str2);
        mo14554h();
        mo14301i();
        try {
            return mo14495P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14675r().mo14618d("Error deleting conditional property", C4746p3.m18094z(str), this.f14613a.mo14847D().mo14530f(str2), e);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final long mo14491L(String str, String str2) {
        long j;
        SQLiteException e;
        C7264i.m27898g(str);
        C7264i.m27898g("first_open_count");
        mo14554h();
        mo14301i();
        SQLiteDatabase P = mo14495P();
        P.beginTransaction();
        try {
            j = m17813K("select " + "first_open_count" + " from app2 where app_id=?", new String[]{str}, -1);
            if (j == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (P.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f14613a.mo14551d().mo14675r().mo14617c("Failed to insert column (got -1). appId", C4746p3.m18094z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                j = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + j));
                if (((long) P.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    this.f14613a.mo14551d().mo14675r().mo14617c("Failed to update column (got 0). appId", C4746p3.m18094z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                P.setTransactionSuccessful();
                P.endTransaction();
                return j;
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            j = 0;
            e = e3;
            try {
                this.f14613a.mo14551d().mo14675r().mo14618d("Error inserting column. appId", C4746p3.m18094z(str), "first_open_count", e);
                P.endTransaction();
                return j;
            } catch (Throwable th) {
                P.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: M */
    public final long mo14492M() {
        return m17813K("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* renamed from: N */
    public final long mo14493N() {
        return m17813K("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: O */
    public final long mo14494O(String str) {
        C7264i.m27898g(str);
        return m17813K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final SQLiteDatabase mo14495P() {
        mo14554h();
        try {
            return this.f14555d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14680w().mo14616b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo14496Q(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo14554h()
            r7.mo14301i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo14495P()     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00ba }
            if (r2 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.t4 r8 = r7.f14613a     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.p3 r8 = r8.mo14551d()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.n3 r8 = r8.mo14679v()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r2 = "Default event parameters not found"
            r8.mo14615a(r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x0030:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.internal.measurement.i4 r3 = com.google.android.gms.internal.measurement.C4244j4.m16143E()     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.qa r2 = com.google.android.gms.measurement.internal.C4741o9.m18052C(r3, r2)     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.i4 r2 = (com.google.android.gms.internal.measurement.C4227i4) r2     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.p9 r2 = r2.mo13361l()     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.j4 r2 = (com.google.android.gms.internal.measurement.C4244j4) r2     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.measurement.internal.m9 r8 = r7.f15082b     // Catch:{ SQLiteException -> 0x00ba }
            r8.mo14587g0()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.List r8 = r2.mo13283I()     // Catch:{ SQLiteException -> 0x00ba }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00ba }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00ba }
        L_0x0056:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00ba }
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.internal.measurement.n4 r3 = (com.google.android.gms.internal.measurement.C4312n4) r3     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = r3.mo13396G()     // Catch:{ SQLiteException -> 0x00ba }
            boolean r5 = r3.mo13399U()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0074
            double r5 = r3.mo13392A()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0074:
            boolean r5 = r3.mo13400V()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0082
            float r3 = r3.mo13393B()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0082:
            boolean r5 = r3.mo13403Y()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0090
            java.lang.String r3 = r3.mo13397H()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0090:
            boolean r5 = r3.mo13401W()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0056
            long r5 = r3.mo13395D()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x009e:
            r1.close()
            return r2
        L_0x00a2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.t4 r3 = r7.f14613a     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r8)     // Catch:{ SQLiteException -> 0x00ba }
            r3.mo14617c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x00ba:
            r8 = move-exception
            goto L_0x00c0
        L_0x00bc:
            r8 = move-exception
            goto L_0x00d7
        L_0x00be:
            r8 = move-exception
            r1 = r0
        L_0x00c0:
            com.google.android.gms.measurement.internal.t4 r2 = r7.f14613a     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo14616b(r3, r8)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00d4
            r1.close()
        L_0x00d4:
            return r0
        L_0x00d5:
            r8 = move-exception
            r0 = r1
        L_0x00d7:
            if (r0 == 0) goto L_0x00dc
            r0.close()
        L_0x00dc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4687k.mo14496Q(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x011d A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0121 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0155 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0173 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0176 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0185 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01d0 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01f4 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0206 A[Catch:{ SQLiteException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0240  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4748p5 mo14497R(java.lang.String r38) {
        /*
            r37 = this;
            r1 = r37
            r2 = r38
            p182n6.C7264i.m27898g(r38)
            r37.mo14554h()
            r37.mo14301i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r37.mo14495P()     // Catch:{ SQLiteException -> 0x0221, all -> 0x021f }
            java.lang.String r5 = "apps"
            java.lang.String r6 = "app_instance_id"
            java.lang.String r7 = "gmp_app_id"
            java.lang.String r8 = "resettable_device_id_hash"
            java.lang.String r9 = "last_bundle_index"
            java.lang.String r10 = "last_bundle_start_timestamp"
            java.lang.String r11 = "last_bundle_end_timestamp"
            java.lang.String r12 = "app_version"
            java.lang.String r13 = "app_store"
            java.lang.String r14 = "gmp_version"
            java.lang.String r15 = "dev_cert_hash"
            java.lang.String r16 = "measurement_enabled"
            java.lang.String r17 = "day"
            java.lang.String r18 = "daily_public_events_count"
            java.lang.String r19 = "daily_events_count"
            java.lang.String r20 = "daily_conversions_count"
            java.lang.String r21 = "config_fetched_time"
            java.lang.String r22 = "failed_config_fetch_time"
            java.lang.String r23 = "app_version_int"
            java.lang.String r24 = "firebase_instance_id"
            java.lang.String r25 = "daily_error_events_count"
            java.lang.String r26 = "daily_realtime_events_count"
            java.lang.String r27 = "health_monitor_sample"
            java.lang.String r28 = "android_id"
            java.lang.String r29 = "adid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String r34 = "session_stitching_token"
            java.lang.String r35 = "sgtm_upload_enabled"
            java.lang.String r36 = "target_os_version"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36}     // Catch:{ SQLiteException -> 0x0221, all -> 0x021f }
            java.lang.String r7 = "app_id=?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0221, all -> 0x021f }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x0221, all -> 0x021f }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0221, all -> 0x021f }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x021d }
            if (r5 != 0) goto L_0x006f
            r4.close()
            return r3
        L_0x006f:
            com.google.android.gms.measurement.internal.p5 r5 = new com.google.android.gms.measurement.internal.p5     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.m9 r6 = r1.f15082b     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.t4 r6 = r6.mo14582c0()     // Catch:{ SQLiteException -> 0x021d }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14727i(r6)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14748x(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14691G(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14687C(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14688D(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14686B(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14731k(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14729j(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14749y(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14744t(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r7 != 0) goto L_0x00db
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r6 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r6 = r12
            goto L_0x00dc
        L_0x00db:
            r6 = r0
        L_0x00dc:
            r5.mo14689E(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14743s(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14741q(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14740p(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14737n(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14735m(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14746v(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r7 == 0) goto L_0x0121
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0126
        L_0x0121:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x021d }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x021d }
        L_0x0126:
            r5.mo14733l(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14747w(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14739o(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14742r(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14750z(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 23
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r7 != 0) goto L_0x015e
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r6 == 0) goto L_0x015c
            goto L_0x015e
        L_0x015c:
            r6 = r12
            goto L_0x015f
        L_0x015e:
            r6 = r0
        L_0x015f:
            r5.mo14725h(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 24
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14723g(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 25
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r7 == 0) goto L_0x0176
            r6 = 0
            goto L_0x017a
        L_0x0176:
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x021d }
        L_0x017a:
            r5.mo14745u(r6)     // Catch:{ SQLiteException -> 0x021d }
            r6 = 26
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r7 != 0) goto L_0x0197
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r7 = ","
            r8 = -1
            java.lang.String[] r6 = r6.split(r7, r8)     // Catch:{ SQLiteException -> 0x021d }
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14692H(r6)     // Catch:{ SQLiteException -> 0x021d }
        L_0x0197:
            com.google.android.gms.internal.measurement.C4356pe.m16469c()     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.t4 r6 = r1.f14613a     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.g r6 = r6.mo14876z()     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.e3 r7 = com.google.android.gms.measurement.internal.C4636f3.f14393q0     // Catch:{ SQLiteException -> 0x021d }
            boolean r6 = r6.mo14398B(r2, r7)     // Catch:{ SQLiteException -> 0x021d }
            if (r6 != 0) goto L_0x01b6
            com.google.android.gms.measurement.internal.t4 r6 = r1.f14613a     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.g r6 = r6.mo14876z()     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.e3 r7 = com.google.android.gms.measurement.internal.C4636f3.f14389o0     // Catch:{ SQLiteException -> 0x021d }
            boolean r6 = r6.mo14398B(r3, r7)     // Catch:{ SQLiteException -> 0x021d }
            if (r6 == 0) goto L_0x01bf
        L_0x01b6:
            r6 = 28
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14693I(r6)     // Catch:{ SQLiteException -> 0x021d }
        L_0x01bf:
            com.google.android.gms.internal.measurement.C4523ze.m17322c()     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.t4 r6 = r1.f14613a     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.g r6 = r6.mo14876z()     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.e3 r7 = com.google.android.gms.measurement.internal.C4636f3.f14397s0     // Catch:{ SQLiteException -> 0x021d }
            boolean r6 = r6.mo14398B(r3, r7)     // Catch:{ SQLiteException -> 0x021d }
            if (r6 == 0) goto L_0x01e3
            r6 = 29
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r7 != 0) goto L_0x01df
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r6 == 0) goto L_0x01df
            goto L_0x01e0
        L_0x01df:
            r0 = r12
        L_0x01e0:
            r5.mo14694J(r0)     // Catch:{ SQLiteException -> 0x021d }
        L_0x01e3:
            com.google.android.gms.internal.measurement.C4423td.m16772c()     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.g r0 = r0.mo14876z()     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.e3 r6 = com.google.android.gms.measurement.internal.C4636f3.f14337G0     // Catch:{ SQLiteException -> 0x021d }
            boolean r0 = r0.mo14398B(r3, r6)     // Catch:{ SQLiteException -> 0x021d }
            if (r0 == 0) goto L_0x01fd
            r0 = 30
            long r6 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x021d }
            r5.mo14695K(r6)     // Catch:{ SQLiteException -> 0x021d }
        L_0x01fd:
            r5.mo14719e()     // Catch:{ SQLiteException -> 0x021d }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021d }
            if (r0 == 0) goto L_0x0219
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ SQLiteException -> 0x021d }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14675r()     // Catch:{ SQLiteException -> 0x021d }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r38)     // Catch:{ SQLiteException -> 0x021d }
            r0.mo14616b(r6, r7)     // Catch:{ SQLiteException -> 0x021d }
        L_0x0219:
            r4.close()
            return r5
        L_0x021d:
            r0 = move-exception
            goto L_0x0223
        L_0x021f:
            r0 = move-exception
            goto L_0x023e
        L_0x0221:
            r0 = move-exception
            r4 = r3
        L_0x0223:
            com.google.android.gms.measurement.internal.t4 r5 = r1.f14613a     // Catch:{ all -> 0x023c }
            com.google.android.gms.measurement.internal.p3 r5 = r5.mo14551d()     // Catch:{ all -> 0x023c }
            com.google.android.gms.measurement.internal.n3 r5 = r5.mo14675r()     // Catch:{ all -> 0x023c }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r38)     // Catch:{ all -> 0x023c }
            r5.mo14617c(r6, r2, r0)     // Catch:{ all -> 0x023c }
            if (r4 == 0) goto L_0x023b
            r4.close()
        L_0x023b:
            return r3
        L_0x023c:
            r0 = move-exception
            r3 = r4
        L_0x023e:
            if (r3 == 0) goto L_0x0243
            r3.close()
        L_0x0243:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4687k.mo14497R(java.lang.String):com.google.android.gms.measurement.internal.p5");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0126  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzac mo14498S(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            p182n6.C7264i.m27898g(r31)
            p182n6.C7264i.m27898g(r32)
            r30.mo14554h()
            r30.mo14301i()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.mo14495P()     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r12 = "origin"
            java.lang.String r13 = "value"
            java.lang.String r14 = "active"
            java.lang.String r15 = "trigger_event_name"
            java.lang.String r16 = "trigger_timeout"
            java.lang.String r17 = "timed_out_event"
            java.lang.String r18 = "creation_timestamp"
            java.lang.String r19 = "triggered_event"
            java.lang.String r20 = "triggered_timestamp"
            java.lang.String r21 = "time_to_live"
            java.lang.String r22 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r4 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x0057
            java.lang.String r4 = ""
        L_0x0057:
            r17 = r4
            java.lang.Object r6 = r1.mo14503Y(r10, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r0 == 0) goto L_0x0066
            r21 = r3
            goto L_0x0068
        L_0x0066:
            r21 = r2
        L_0x0068:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.m9 r0 = r1.f15082b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.o9 r0 = r0.mo14587g0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r3 = com.google.android.gms.measurement.internal.zzaw.CREATOR     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo14669z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r23 = r0
            com.google.android.gms.measurement.internal.zzaw r23 = (com.google.android.gms.measurement.internal.zzaw) r23     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.m9 r0 = r1.f15082b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.o9 r0 = r0.mo14587g0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo14669z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r26 = r0
            com.google.android.gms.measurement.internal.zzaw r26 = (com.google.android.gms.measurement.internal.zzaw) r26     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.m9 r0 = r1.f15082b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.o9 r0 = r0.mo14587g0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo14669z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r29 = r0
            com.google.android.gms.measurement.internal.zzaw r29 = (com.google.android.gms.measurement.internal.zzaw) r29     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.zzlj r18 = new com.google.android.gms.measurement.internal.zzlj     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.zzac r0 = new com.google.android.gms.measurement.internal.zzac     // Catch:{ SQLiteException -> 0x00f9 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00f9 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.t4 r2 = r1.f14613a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r31)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.t4 r5 = r1.f14613a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo14847D()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r5 = r5.mo14530f(r8)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.mo14617c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x00f5:
            r10.close()
            return r0
        L_0x00f9:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fb:
            r0 = move-exception
            goto L_0x0124
        L_0x00fd:
            r0 = move-exception
            r10 = r9
        L_0x00ff:
            com.google.android.gms.measurement.internal.t4 r2 = r1.f14613a     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r31)     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.t4 r5 = r1.f14613a     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo14847D()     // Catch:{ all -> 0x0122 }
            java.lang.String r5 = r5.mo14530f(r8)     // Catch:{ all -> 0x0122 }
            r2.mo14618d(r3, r4, r5, r0)     // Catch:{ all -> 0x0122 }
            if (r10 == 0) goto L_0x0121
            r10.close()
        L_0x0121:
            return r9
        L_0x0122:
            r0 = move-exception
            r9 = r10
        L_0x0124:
            if (r9 == 0) goto L_0x0129
            r9.close()
        L_0x0129:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4687k.mo14498S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    /* renamed from: T */
    public final C4665i mo14499T(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return mo14500U(j, str, 1, false, false, z3, false, z5);
    }

    /* renamed from: U */
    public final C4665i mo14500U(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C7264i.m27898g(str);
        mo14554h();
        mo14301i();
        String[] strArr = {str};
        C4665i iVar = new C4665i();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo14495P();
            cursor = P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.f14613a.mo14551d().mo14680w().mo14616b("Not updating daily counts, app is not known. appId", C4746p3.m18094z(str));
                cursor.close();
                return iVar;
            }
            if (cursor.getLong(0) == j) {
                iVar.f14502b = cursor.getLong(1);
                iVar.f14501a = cursor.getLong(2);
                iVar.f14503c = cursor.getLong(3);
                iVar.f14504d = cursor.getLong(4);
                iVar.f14505e = cursor.getLong(5);
            }
            if (z) {
                iVar.f14502b += j2;
            }
            if (z2) {
                iVar.f14501a += j2;
            }
            if (z3) {
                iVar.f14503c += j2;
            }
            if (z4) {
                iVar.f14504d += j2;
            }
            if (z5) {
                iVar.f14505e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(iVar.f14501a));
            contentValues.put("daily_events_count", Long.valueOf(iVar.f14502b));
            contentValues.put("daily_conversions_count", Long.valueOf(iVar.f14503c));
            contentValues.put("daily_error_events_count", Long.valueOf(iVar.f14504d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(iVar.f14505e));
            P.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return iVar;
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14675r().mo14617c("Error updating daily counts. appId", C4746p3.m18094z(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return iVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4753q mo14501V(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            p182n6.C7264i.m27898g(r28)
            p182n6.C7264i.m27898g(r29)
            r27.mo14554h()
            r27.mo14301i()
            java.lang.String r2 = "lifetime_count"
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.mo14495P()     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.String r3 = "events"
            r10 = 0
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.Object[] r0 = r0.toArray(r4)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.String r5 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = r11
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r9 = r2
        L_0x00dc:
            com.google.android.gms.measurement.internal.q r24 = new com.google.android.gms.measurement.internal.q     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14675r()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r28)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            r0.mo14616b(r2, r3)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
        L_0x010d:
            r25.close()
            return r24
        L_0x0111:
            r0 = move-exception
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            goto L_0x011e
        L_0x0115:
            r0 = move-exception
            r25 = r13
        L_0x0118:
            r19 = r25
            goto L_0x014e
        L_0x011b:
            r0 = move-exception
            r25 = r13
        L_0x011e:
            r13 = r25
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            goto L_0x014e
        L_0x0123:
            r0 = move-exception
            r13 = r19
        L_0x0126:
            com.google.android.gms.measurement.internal.t4 r2 = r1.f14613a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r28)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.t4 r5 = r1.f14613a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo14847D()     // Catch:{ all -> 0x014b }
            r6 = r29
            java.lang.String r5 = r5.mo14528d(r6)     // Catch:{ all -> 0x014b }
            r2.mo14618d(r3, r4, r5, r0)     // Catch:{ all -> 0x014b }
            if (r13 == 0) goto L_0x014a
            r13.close()
        L_0x014a:
            return r19
        L_0x014b:
            r0 = move-exception
            r19 = r13
        L_0x014e:
            if (r19 == 0) goto L_0x0153
            r19.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4687k.mo14501V(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.q");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4763q9 mo14502X(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            p182n6.C7264i.m27898g(r20)
            p182n6.C7264i.m27898g(r21)
            r19.mo14554h()
            r19.mo14301i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.mo14495P()     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r12 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r14 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.Object r8 = r1.mo14503Y(r11, r3)     // Catch:{ SQLiteException -> 0x0079 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.q9 r0 = new com.google.android.gms.measurement.internal.q9     // Catch:{ SQLiteException -> 0x0079 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r2 == 0) goto L_0x0075
            com.google.android.gms.measurement.internal.t4 r2 = r1.f14613a     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r20)     // Catch:{ SQLiteException -> 0x0079 }
            r2.mo14616b(r3, r4)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x0075:
            r11.close()
            return r0
        L_0x0079:
            r0 = move-exception
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            goto L_0x00a4
        L_0x007d:
            r0 = move-exception
            r11 = r10
        L_0x007f:
            com.google.android.gms.measurement.internal.t4 r2 = r1.f14613a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r20)     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.t4 r5 = r1.f14613a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo14847D()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r5.mo14530f(r9)     // Catch:{ all -> 0x00a2 }
            r2.mo14618d(r3, r4, r5, r0)     // Catch:{ all -> 0x00a2 }
            if (r11 == 0) goto L_0x00a1
            r11.close()
        L_0x00a1:
            return r10
        L_0x00a2:
            r0 = move-exception
            r10 = r11
        L_0x00a4:
            if (r10 == 0) goto L_0x00a9
            r10.close()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4687k.mo14502X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.q9");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final Object mo14503Y(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f14613a.mo14551d().mo14675r().mo14615a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                this.f14613a.mo14551d().mo14675r().mo14616b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f14613a.mo14551d().mo14675r().mo14615a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo14504Z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo14495P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003e
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            com.google.android.gms.measurement.internal.t4 r3 = r6.f14613a     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo14616b(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4687k.mo14504Z():java.lang.String");
    }

    /* renamed from: a0 */
    public final List mo14505a0(String str, String str2, String str3) {
        C7264i.m27898g(str);
        mo14554h();
        mo14301i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo14506b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: b0 */
    public final List mo14506b0(String str, String[] strArr) {
        boolean z;
        mo14554h();
        mo14301i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo14495P();
            String[] strArr2 = {"app_id", "origin", "name", C11755a.C11756a.f34100b, "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
            this.f14613a.mo14876z();
            Cursor query = P.query("conditional_properties", strArr2, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    this.f14613a.mo14876z();
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object Y = mo14503Y(query, 3);
                        if (query.getInt(4) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        C4741o9 g0 = this.f15082b.mo14587g0();
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                        arrayList.add(new zzac(string, string2, new zzlj(string3, query.getLong(10), Y, string2), query.getLong(8), z, string4, (zzaw) g0.mo14669z(blob, creator), j, (zzaw) this.f15082b.mo14587g0().mo14669z(query.getBlob(9), creator), query.getLong(11), (zzaw) this.f15082b.mo14587g0().mo14669z(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        C4724n3 r = this.f14613a.mo14551d().mo14675r();
                        this.f14613a.mo14876z();
                        r.mo14616b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14675r().mo14616b("Error querying conditional user property value", e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c0 */
    public final List mo14507c0(String str) {
        C7264i.m27898g(str);
        mo14554h();
        mo14301i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.f14613a.mo14876z();
            Cursor query = mo14495P().query("user_attributes", new String[]{"name", "origin", "set_timestamp", C11755a.C11756a.f34100b}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object Y = mo14503Y(query, 3);
                    if (Y == null) {
                        this.f14613a.mo14551d().mo14675r().mo14616b("Read invalid user property value, ignoring it. appId", C4746p3.m18094z(str));
                    } else {
                        arrayList.add(new C4763q9(str, str2, string, j, Y));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14675r().mo14617c("Error querying user properties. appId", C4746p3.m18094z(str), e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0123 A[DONT_GENERATE] */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo14508d0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            p182n6.C7264i.m27898g(r18)
            r17.mo14554h()
            r17.mo14301i()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r11 = "1001"
            r12 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0105 }
            r13 = 3
            r3.<init>(r13)     // Catch:{ SQLiteException -> 0x0105 }
            r14 = r18
            r3.add(r14)     // Catch:{ SQLiteException -> 0x0103 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0103 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x0103 }
            boolean r5 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x0103 }
            if (r5 != 0) goto L_0x0038
            r15 = r19
            r3.add(r15)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r5 = " and origin=?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x00ff }
            goto L_0x003a
        L_0x0038:
            r15 = r19
        L_0x003a:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x00ff }
            if (r5 != 0) goto L_0x0059
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00ff }
            r5.<init>()     // Catch:{ SQLiteException -> 0x00ff }
            r5.append(r0)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r6 = "*"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x00ff }
            r3.add(r5)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r5 = " and name glob ?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x00ff }
        L_0x0059:
            int r5 = r3.size()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ SQLiteException -> 0x00ff }
            r7 = r3
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ SQLiteException -> 0x00ff }
            android.database.sqlite.SQLiteDatabase r3 = r17.mo14495P()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r5 = "user_attributes"
            java.lang.String r6 = "name"
            java.lang.String r8 = "set_timestamp"
            java.lang.String r9 = "value"
            java.lang.String r10 = "origin"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r9, r10}     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r8 = r4.toString()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r10 = "rowid"
            com.google.android.gms.measurement.internal.t4 r4 = r1.f14613a     // Catch:{ SQLiteException -> 0x00ff }
            r4.mo14876z()     // Catch:{ SQLiteException -> 0x00ff }
            r9 = 0
            r16 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r16
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00ff }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x00ff }
            if (r3 != 0) goto L_0x009a
            r12.close()
            return r2
        L_0x009a:
            int r3 = r2.size()     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.t4 r4 = r1.f14613a     // Catch:{ SQLiteException -> 0x00ff }
            r4.mo14876z()     // Catch:{ SQLiteException -> 0x00ff }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00c0
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14675r()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            com.google.android.gms.measurement.internal.t4 r5 = r1.f14613a     // Catch:{ SQLiteException -> 0x00ff }
            r5.mo14876z()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x00ff }
            r0.mo14616b(r3, r4)     // Catch:{ SQLiteException -> 0x00ff }
            goto L_0x00fb
        L_0x00c0:
            r3 = 0
            java.lang.String r7 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x00ff }
            r3 = 1
            long r8 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x00ff }
            r3 = 2
            java.lang.Object r10 = r1.mo14503Y(r12, r3)     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r15 = r12.getString(r13)     // Catch:{ SQLiteException -> 0x00ff }
            if (r10 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.t4 r3 = r1.f14613a     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ SQLiteException -> 0x00ff }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ SQLiteException -> 0x00ff }
            java.lang.String r4 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r18)     // Catch:{ SQLiteException -> 0x00ff }
            r3.mo14618d(r4, r5, r15, r0)     // Catch:{ SQLiteException -> 0x00ff }
            goto L_0x00f5
        L_0x00e9:
            com.google.android.gms.measurement.internal.q9 r3 = new com.google.android.gms.measurement.internal.q9     // Catch:{ SQLiteException -> 0x00ff }
            r4 = r3
            r5 = r18
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x00ff }
            r2.add(r3)     // Catch:{ SQLiteException -> 0x00ff }
        L_0x00f5:
            boolean r3 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x00ff }
            if (r3 != 0) goto L_0x009a
        L_0x00fb:
            r12.close()
            return r2
        L_0x00ff:
            r0 = move-exception
            goto L_0x010a
        L_0x0101:
            r0 = move-exception
            goto L_0x0127
        L_0x0103:
            r0 = move-exception
            goto L_0x0108
        L_0x0105:
            r0 = move-exception
            r14 = r18
        L_0x0108:
            r15 = r19
        L_0x010a:
            com.google.android.gms.measurement.internal.t4 r2 = r1.f14613a     // Catch:{ all -> 0x0101 }
            com.google.android.gms.measurement.internal.p3 r2 = r2.mo14551d()     // Catch:{ all -> 0x0101 }
            com.google.android.gms.measurement.internal.n3 r2 = r2.mo14675r()     // Catch:{ all -> 0x0101 }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r18)     // Catch:{ all -> 0x0101 }
            r2.mo14618d(r3, r4, r15, r0)     // Catch:{ all -> 0x0101 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0101 }
            if (r12 == 0) goto L_0x0126
            r12.close()
        L_0x0126:
            return r0
        L_0x0127:
            if (r12 == 0) goto L_0x012c
            r12.close()
        L_0x012c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4687k.mo14508d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: e0 */
    public final void mo14509e0() {
        mo14301i();
        mo14495P().beginTransaction();
    }

    /* renamed from: f0 */
    public final void mo14510f0() {
        mo14301i();
        mo14495P().endTransaction();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final void mo14511g0(List list) {
        mo14554h();
        mo14301i();
        C7264i.m27902k(list);
        C7264i.m27904m(list.size());
        if (mo14521u()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (m17812I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                this.f14613a.mo14551d().mo14680w().mo14615a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                mo14495P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.f14613a.mo14551d().mo14675r().mo14616b("Error incrementing retry count. error", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final void mo14512h0() {
        mo14554h();
        mo14301i();
        if (mo14521u()) {
            long a = this.f15082b.mo14585e0().f14521e.mo14295a();
            long c = this.f14613a.mo14548a().mo23596c();
            long abs = Math.abs(c - a);
            this.f14613a.mo14876z();
            if (abs > ((Long) C4636f3.f14324A.mo14346a((Object) null)).longValue()) {
                this.f15082b.mo14585e0().f14521e.mo14296b(c);
                mo14554h();
                mo14301i();
                if (mo14521u()) {
                    SQLiteDatabase P = mo14495P();
                    this.f14613a.mo14876z();
                    int delete = P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f14613a.mo14548a().mo23594a()), String.valueOf(C4643g.m17723i())});
                    if (delete > 0) {
                        this.f14613a.mo14551d().mo14679v().mo14616b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo14304l() {
        return false;
    }

    /* renamed from: m */
    public final void mo14513m(String str, String str2) {
        C7264i.m27898g(str);
        C7264i.m27898g(str2);
        mo14554h();
        mo14301i();
        try {
            mo14495P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14675r().mo14618d("Error deleting user property. appId", C4746p3.m18094z(str), this.f14613a.mo14847D().mo14530f(str2), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0333, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0347, code lost:
        if (mo14495P().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0349, code lost:
        r1.f14613a.mo14551d().mo14675r().mo14616b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C4746p3.m18094z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x035d, code lost:
        r0 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0361, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r1.f14613a.mo14551d().mo14675r().mo14617c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C4746p3.m18094z(r24), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03ac, code lost:
        r3 = r25;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017a, code lost:
        r11 = r0.mo13806H().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0186, code lost:
        if (r11.hasNext() == false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0192, code lost:
        if (((com.google.android.gms.internal.measurement.C4226i3) r11.next()).mo13232J() != false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0194, code lost:
        r1.f14613a.mo14551d().mo14680w().mo14617c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C4746p3.m18094z(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ad, code lost:
        r11 = r0.mo13805G().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c3, code lost:
        if (r11.hasNext() == false) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r12 = (com.google.android.gms.internal.measurement.C4511z2) r11.next();
        mo14301i();
        mo14554h();
        p182n6.C7264i.m27898g(r24);
        p182n6.C7264i.m27902k(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01df, code lost:
        if (r12.mo13851G().isEmpty() == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e1, code lost:
        r0 = r1.f14613a.mo14551d().mo14680w();
        r9 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f9, code lost:
        if (r12.mo13857O() == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01fb, code lost:
        r20 = java.lang.Integer.valueOf(r12.mo13848B());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0206, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0208, code lost:
        r0.mo14618d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0213, code lost:
        r3 = r12.mo13041g();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r2);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x022c, code lost:
        if (r12.mo13857O() == false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x022e, code lost:
        r9 = java.lang.Integer.valueOf(r12.mo13848B());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0237, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0238, code lost:
        r7.put("filter_id", r9);
        r7.put("event_name", r12.mo13851G());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0248, code lost:
        if (r12.mo13858P() == false) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x024a, code lost:
        r9 = java.lang.Boolean.valueOf(r12.mo13855M());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0253, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0254, code lost:
        r7.put("session_scoped", r9);
        r7.put("data", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0268, code lost:
        if (mo14495P().insertWithOnConflict("event_filters", (java.lang.String) null, r7, 5) != -1) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x026a, code lost:
        r1.f14613a.mo14551d().mo14675r().mo14616b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C4746p3.m18094z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x027d, code lost:
        r3 = r25;
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0299, code lost:
        r21 = r7;
        r0 = r0.mo13806H().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02a7, code lost:
        if (r0.hasNext() == false) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02a9, code lost:
        r3 = (com.google.android.gms.internal.measurement.C4226i3) r0.next();
        mo14301i();
        mo14554h();
        p182n6.C7264i.m27898g(r24);
        p182n6.C7264i.m27902k(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02c3, code lost:
        if (r3.mo13228E().isEmpty() == false) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02c5, code lost:
        r0 = r1.f14613a.mo14551d().mo14680w();
        r8 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02dd, code lost:
        if (r3.mo13232J() == false) goto L_0x02e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02df, code lost:
        r3 = java.lang.Integer.valueOf(r3.mo13226A());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02e8, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02e9, code lost:
        r0.mo14618d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02f2, code lost:
        r7 = r3.mo13041g();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r2);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0309, code lost:
        if (r3.mo13232J() == false) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x030b, code lost:
        r12 = java.lang.Integer.valueOf(r3.mo13226A());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0314, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0315, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.mo13228E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0327, code lost:
        if (r3.mo13233K() == false) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0329, code lost:
        r0 = java.lang.Boolean.valueOf(r3.mo13231I());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0332, code lost:
        r0 = null;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14514n(java.lang.String r24, java.util.List r25) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r5 = "event_filters"
            java.lang.String r6 = "property_filters"
            p182n6.C7264i.m27902k(r25)
            r8 = 0
        L_0x0012:
            int r9 = r25.size()
            if (r8 >= r9) goto L_0x00dc
            java.lang.Object r9 = r3.get(r8)
            com.google.android.gms.internal.measurement.x2 r9 = (com.google.android.gms.internal.measurement.C4479x2) r9
            com.google.android.gms.internal.measurement.m9 r9 = r9.mo13472j()
            com.google.android.gms.internal.measurement.w2 r9 = (com.google.android.gms.internal.measurement.C4463w2) r9
            int r11 = r9.mo13785p()
            if (r11 == 0) goto L_0x009d
            r11 = 0
        L_0x002b:
            int r12 = r9.mo13785p()
            if (r11 >= r12) goto L_0x009d
            com.google.android.gms.internal.measurement.z2 r12 = r9.mo13789t(r11)
            com.google.android.gms.internal.measurement.m9 r12 = r12.mo13472j()
            com.google.android.gms.internal.measurement.y2 r12 = (com.google.android.gms.internal.measurement.C4495y2) r12
            com.google.android.gms.internal.measurement.m9 r13 = r12.clone()
            com.google.android.gms.internal.measurement.y2 r13 = (com.google.android.gms.internal.measurement.C4495y2) r13
            java.lang.String r14 = r12.mo13821t()
            java.lang.String r14 = p248s7.C8263q.m31095b(r14)
            if (r14 == 0) goto L_0x0050
            r13.mo13818q(r14)
            r14 = 1
            goto L_0x0051
        L_0x0050:
            r14 = 0
        L_0x0051:
            r15 = 0
        L_0x0052:
            int r7 = r12.mo13817p()
            if (r15 >= r7) goto L_0x0088
            com.google.android.gms.internal.measurement.b3 r7 = r12.mo13820s(r15)
            java.lang.String r10 = r7.mo12897E()
            r16 = r12
            java.lang.String[] r12 = p248s7.C8264r.f23465a
            r17 = r4
            java.lang.String[] r4 = p248s7.C8264r.f23466b
            java.lang.String r4 = p248s7.C8269w.m31112b(r10, r12, r4)
            if (r4 == 0) goto L_0x0081
            com.google.android.gms.internal.measurement.m9 r7 = r7.mo13472j()
            com.google.android.gms.internal.measurement.a3 r7 = (com.google.android.gms.internal.measurement.C4090a3) r7
            r7.mo12838p(r4)
            com.google.android.gms.internal.measurement.p9 r4 = r7.mo13361l()
            com.google.android.gms.internal.measurement.b3 r4 = (com.google.android.gms.internal.measurement.C4107b3) r4
            r13.mo13819r(r15, r4)
            r14 = 1
        L_0x0081:
            int r15 = r15 + 1
            r12 = r16
            r4 = r17
            goto L_0x0052
        L_0x0088:
            r17 = r4
            if (r14 == 0) goto L_0x0098
            r9.mo13787r(r11, r13)
            com.google.android.gms.internal.measurement.p9 r4 = r9.mo13361l()
            com.google.android.gms.internal.measurement.x2 r4 = (com.google.android.gms.internal.measurement.C4479x2) r4
            r3.set(r8, r4)
        L_0x0098:
            int r11 = r11 + 1
            r4 = r17
            goto L_0x002b
        L_0x009d:
            r17 = r4
            int r4 = r9.mo13786q()
            if (r4 == 0) goto L_0x00d6
            r4 = 0
        L_0x00a6:
            int r7 = r9.mo13786q()
            if (r4 >= r7) goto L_0x00d6
            com.google.android.gms.internal.measurement.i3 r7 = r9.mo13790u(r4)
            java.lang.String r10 = r7.mo13228E()
            java.lang.String[] r11 = p248s7.C8265s.f23469a
            java.lang.String[] r12 = p248s7.C8265s.f23470b
            java.lang.String r10 = p248s7.C8269w.m31112b(r10, r11, r12)
            if (r10 == 0) goto L_0x00d3
            com.google.android.gms.internal.measurement.m9 r7 = r7.mo13472j()
            com.google.android.gms.internal.measurement.h3 r7 = (com.google.android.gms.internal.measurement.C4209h3) r7
            r7.mo13203p(r10)
            r9.mo13788s(r4, r7)
            com.google.android.gms.internal.measurement.p9 r7 = r9.mo13361l()
            com.google.android.gms.internal.measurement.x2 r7 = (com.google.android.gms.internal.measurement.C4479x2) r7
            r3.set(r8, r7)
        L_0x00d3:
            int r4 = r4 + 1
            goto L_0x00a6
        L_0x00d6:
            int r8 = r8 + 1
            r4 = r17
            goto L_0x0012
        L_0x00dc:
            r17 = r4
            r23.mo14301i()
            r23.mo14554h()
            p182n6.C7264i.m27898g(r24)
            p182n6.C7264i.m27902k(r25)
            android.database.sqlite.SQLiteDatabase r4 = r23.mo14495P()
            r4.beginTransaction()
            r23.mo14301i()     // Catch:{ all -> 0x0495 }
            r23.mo14554h()     // Catch:{ all -> 0x0495 }
            p182n6.C7264i.m27898g(r24)     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r7 = r23.mo14495P()     // Catch:{ all -> 0x0495 }
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x0495 }
            r10 = 0
            r9[r10] = r2     // Catch:{ all -> 0x0495 }
            r7.delete(r6, r0, r9)     // Catch:{ all -> 0x0495 }
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x0495 }
            r9[r10] = r2     // Catch:{ all -> 0x0495 }
            r7.delete(r5, r0, r9)     // Catch:{ all -> 0x0495 }
            java.util.Iterator r7 = r25.iterator()     // Catch:{ all -> 0x0495 }
        L_0x0112:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x03b2
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.internal.measurement.x2 r0 = (com.google.android.gms.internal.measurement.C4479x2) r0     // Catch:{ all -> 0x0495 }
            r23.mo14301i()     // Catch:{ all -> 0x0495 }
            r23.mo14554h()     // Catch:{ all -> 0x0495 }
            p182n6.C7264i.m27898g(r24)     // Catch:{ all -> 0x0495 }
            p182n6.C7264i.m27902k(r0)     // Catch:{ all -> 0x0495 }
            boolean r10 = r0.mo13807K()     // Catch:{ all -> 0x0495 }
            if (r10 != 0) goto L_0x0144
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14680w()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "Audience with no ID. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r24)     // Catch:{ all -> 0x0495 }
            r0.mo14616b(r8, r9)     // Catch:{ all -> 0x0495 }
            goto L_0x0112
        L_0x0144:
            int r10 = r0.mo13800A()     // Catch:{ all -> 0x0495 }
            java.util.List r11 = r0.mo13805G()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0495 }
        L_0x0150:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0495 }
            if (r12 == 0) goto L_0x017a
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.internal.measurement.z2 r12 = (com.google.android.gms.internal.measurement.C4511z2) r12     // Catch:{ all -> 0x0495 }
            boolean r12 = r12.mo13857O()     // Catch:{ all -> 0x0495 }
            if (r12 != 0) goto L_0x0150
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14680w()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r24)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r0.mo14617c(r8, r9, r10)     // Catch:{ all -> 0x0495 }
            goto L_0x0112
        L_0x017a:
            java.util.List r11 = r0.mo13806H()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0495 }
        L_0x0182:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0495 }
            if (r12 == 0) goto L_0x01ad
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.internal.measurement.i3 r12 = (com.google.android.gms.internal.measurement.C4226i3) r12     // Catch:{ all -> 0x0495 }
            boolean r12 = r12.mo13232J()     // Catch:{ all -> 0x0495 }
            if (r12 != 0) goto L_0x0182
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14680w()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r24)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r0.mo14617c(r8, r9, r10)     // Catch:{ all -> 0x0495 }
            goto L_0x0112
        L_0x01ad:
            java.util.List r11 = r0.mo13805G()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0495 }
        L_0x01b5:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r9 = "audience_id"
            java.lang.String r15 = "app_id"
            if (r12 == 0) goto L_0x0299
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.internal.measurement.z2 r12 = (com.google.android.gms.internal.measurement.C4511z2) r12     // Catch:{ all -> 0x0495 }
            r23.mo14301i()     // Catch:{ all -> 0x0495 }
            r23.mo14554h()     // Catch:{ all -> 0x0495 }
            p182n6.C7264i.m27898g(r24)     // Catch:{ all -> 0x0495 }
            p182n6.C7264i.m27902k(r12)     // Catch:{ all -> 0x0495 }
            java.lang.String r21 = r12.mo13851G()     // Catch:{ all -> 0x0495 }
            boolean r21 = r21.isEmpty()     // Catch:{ all -> 0x0495 }
            if (r21 == 0) goto L_0x0213
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14680w()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r24)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            boolean r13 = r12.mo13857O()     // Catch:{ all -> 0x0495 }
            if (r13 == 0) goto L_0x0206
            int r12 = r12.mo13848B()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0495 }
            r20 = r12
            goto L_0x0208
        L_0x0206:
            r20 = 0
        L_0x0208:
            java.lang.String r12 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x0495 }
            r0.mo14618d(r8, r9, r11, r12)     // Catch:{ all -> 0x0495 }
            r21 = r7
            goto L_0x0375
        L_0x0213:
            byte[] r3 = r12.mo13041g()     // Catch:{ all -> 0x0495 }
            r21 = r7
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0495 }
            r7.<init>()     // Catch:{ all -> 0x0495 }
            r7.put(r15, r2)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r7.put(r9, r15)     // Catch:{ all -> 0x0495 }
            boolean r9 = r12.mo13857O()     // Catch:{ all -> 0x0495 }
            if (r9 == 0) goto L_0x0237
            int r9 = r12.mo13848B()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0495 }
            goto L_0x0238
        L_0x0237:
            r9 = 0
        L_0x0238:
            r7.put(r14, r9)     // Catch:{ all -> 0x0495 }
            java.lang.String r9 = "event_name"
            java.lang.String r14 = r12.mo13851G()     // Catch:{ all -> 0x0495 }
            r7.put(r9, r14)     // Catch:{ all -> 0x0495 }
            boolean r9 = r12.mo13858P()     // Catch:{ all -> 0x0495 }
            if (r9 == 0) goto L_0x0253
            boolean r9 = r12.mo13855M()     // Catch:{ all -> 0x0495 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0495 }
            goto L_0x0254
        L_0x0253:
            r9 = 0
        L_0x0254:
            r7.put(r13, r9)     // Catch:{ all -> 0x0495 }
            r7.put(r8, r3)     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo14495P()     // Catch:{ SQLiteException -> 0x0283 }
            r8 = 5
            r9 = 0
            long r7 = r3.insertWithOnConflict(r5, r9, r7, r8)     // Catch:{ SQLiteException -> 0x0283 }
            r12 = -1
            int r3 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x027d
            com.google.android.gms.measurement.internal.t4 r3 = r1.f14613a     // Catch:{ SQLiteException -> 0x0283 }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ SQLiteException -> 0x0283 }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ SQLiteException -> 0x0283 }
            java.lang.String r7 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r24)     // Catch:{ SQLiteException -> 0x0283 }
            r3.mo14616b(r7, r8)     // Catch:{ SQLiteException -> 0x0283 }
        L_0x027d:
            r3 = r25
            r7 = r21
            goto L_0x01b5
        L_0x0283:
            r0 = move-exception
            com.google.android.gms.measurement.internal.t4 r3 = r1.f14613a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x0495 }
            java.lang.String r7 = "Error storing event filter. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r24)     // Catch:{ all -> 0x0495 }
            r3.mo14617c(r7, r8, r0)     // Catch:{ all -> 0x0495 }
            goto L_0x0375
        L_0x0299:
            r21 = r7
            java.util.List r0 = r0.mo13806H()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0495 }
        L_0x02a3:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0495 }
            if (r3 == 0) goto L_0x03ac
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.internal.measurement.i3 r3 = (com.google.android.gms.internal.measurement.C4226i3) r3     // Catch:{ all -> 0x0495 }
            r23.mo14301i()     // Catch:{ all -> 0x0495 }
            r23.mo14554h()     // Catch:{ all -> 0x0495 }
            p182n6.C7264i.m27898g(r24)     // Catch:{ all -> 0x0495 }
            p182n6.C7264i.m27902k(r3)     // Catch:{ all -> 0x0495 }
            java.lang.String r7 = r3.mo13228E()     // Catch:{ all -> 0x0495 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0495 }
            if (r7 == 0) goto L_0x02f2
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14680w()     // Catch:{ all -> 0x0495 }
            java.lang.String r7 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r24)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            boolean r11 = r3.mo13232J()     // Catch:{ all -> 0x0495 }
            if (r11 == 0) goto L_0x02e8
            int r3 = r3.mo13226A()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0495 }
            goto L_0x02e9
        L_0x02e8:
            r3 = 0
        L_0x02e9:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0495 }
            r0.mo14618d(r7, r8, r9, r3)     // Catch:{ all -> 0x0495 }
            goto L_0x0375
        L_0x02f2:
            byte[] r7 = r3.mo13041g()     // Catch:{ all -> 0x0495 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0495 }
            r11.<init>()     // Catch:{ all -> 0x0495 }
            r11.put(r15, r2)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r11.put(r9, r12)     // Catch:{ all -> 0x0495 }
            boolean r12 = r3.mo13232J()     // Catch:{ all -> 0x0495 }
            if (r12 == 0) goto L_0x0314
            int r12 = r3.mo13226A()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0495 }
            goto L_0x0315
        L_0x0314:
            r12 = 0
        L_0x0315:
            r11.put(r14, r12)     // Catch:{ all -> 0x0495 }
            java.lang.String r12 = "property_name"
            r22 = r0
            java.lang.String r0 = r3.mo13228E()     // Catch:{ all -> 0x0495 }
            r11.put(r12, r0)     // Catch:{ all -> 0x0495 }
            boolean r0 = r3.mo13233K()     // Catch:{ all -> 0x0495 }
            if (r0 == 0) goto L_0x0332
            boolean r0 = r3.mo13231I()     // Catch:{ all -> 0x0495 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0495 }
            goto L_0x0333
        L_0x0332:
            r0 = 0
        L_0x0333:
            r11.put(r13, r0)     // Catch:{ all -> 0x0495 }
            r11.put(r8, r7)     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo14495P()     // Catch:{ SQLiteException -> 0x0361 }
            r3 = 0
            r7 = 5
            long r11 = r0.insertWithOnConflict(r6, r3, r11, r7)     // Catch:{ SQLiteException -> 0x0361 }
            r18 = -1
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x035d
            com.google.android.gms.measurement.internal.t4 r0 = r1.f14613a     // Catch:{ SQLiteException -> 0x0361 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ SQLiteException -> 0x0361 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14675r()     // Catch:{ SQLiteException -> 0x0361 }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r24)     // Catch:{ SQLiteException -> 0x0361 }
            r0.mo14616b(r3, r7)     // Catch:{ SQLiteException -> 0x0361 }
            goto L_0x0375
        L_0x035d:
            r0 = r22
            goto L_0x02a3
        L_0x0361:
            r0 = move-exception
            com.google.android.gms.measurement.internal.t4 r3 = r1.f14613a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x0495 }
            java.lang.String r7 = "Error storing property filter. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r24)     // Catch:{ all -> 0x0495 }
            r3.mo14617c(r7, r8, r0)     // Catch:{ all -> 0x0495 }
        L_0x0375:
            r23.mo14301i()     // Catch:{ all -> 0x0495 }
            r23.mo14554h()     // Catch:{ all -> 0x0495 }
            p182n6.C7264i.m27898g(r24)     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo14495P()     // Catch:{ all -> 0x0495 }
            r3 = 2
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x0495 }
            r3 = 0
            r7[r3] = r2     // Catch:{ all -> 0x0495 }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r8 = 1
            r7[r8] = r3     // Catch:{ all -> 0x0495 }
            r3 = r17
            r0.delete(r6, r3, r7)     // Catch:{ all -> 0x0495 }
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x0495 }
            r8 = 0
            r7[r8] = r2     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0495 }
            r9 = 1
            r7[r9] = r8     // Catch:{ all -> 0x0495 }
            r0.delete(r5, r3, r7)     // Catch:{ all -> 0x0495 }
            r17 = r3
            r7 = r21
            r3 = r25
            goto L_0x0112
        L_0x03ac:
            r3 = r25
            r7 = r21
            goto L_0x0112
        L_0x03b2:
            r3 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0495 }
            r0.<init>()     // Catch:{ all -> 0x0495 }
            java.util.Iterator r5 = r25.iterator()     // Catch:{ all -> 0x0495 }
        L_0x03bc:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0495 }
            if (r6 == 0) goto L_0x03dc
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.internal.measurement.x2 r6 = (com.google.android.gms.internal.measurement.C4479x2) r6     // Catch:{ all -> 0x0495 }
            boolean r7 = r6.mo13807K()     // Catch:{ all -> 0x0495 }
            if (r7 == 0) goto L_0x03d7
            int r6 = r6.mo13800A()     // Catch:{ all -> 0x0495 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0495 }
            goto L_0x03d8
        L_0x03d7:
            r9 = r3
        L_0x03d8:
            r0.add(r9)     // Catch:{ all -> 0x0495 }
            goto L_0x03bc
        L_0x03dc:
            p182n6.C7264i.m27898g(r24)     // Catch:{ all -> 0x0495 }
            r23.mo14301i()     // Catch:{ all -> 0x0495 }
            r23.mo14554h()     // Catch:{ all -> 0x0495 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo14495P()     // Catch:{ all -> 0x0495 }
            java.lang.String r5 = "select count(1) from audience_filter_values where app_id=?"
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x047a }
            r6 = 0
            r7[r6] = r2     // Catch:{ SQLiteException -> 0x047a }
            long r5 = r1.m17812I(r5, r7)     // Catch:{ SQLiteException -> 0x047a }
            com.google.android.gms.measurement.internal.t4 r7 = r1.f14613a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.g r7 = r7.mo14876z()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.e3 r8 = com.google.android.gms.measurement.internal.C4636f3.f14338H     // Catch:{ all -> 0x0495 }
            int r7 = r7.mo14409o(r2, r8)     // Catch:{ all -> 0x0495 }
            r8 = 2000(0x7d0, float:2.803E-42)
            int r7 = java.lang.Math.min(r8, r7)     // Catch:{ all -> 0x0495 }
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)     // Catch:{ all -> 0x0495 }
            long r8 = (long) r7     // Catch:{ all -> 0x0495 }
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0413
            goto L_0x048e
        L_0x0413:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0495 }
            r5.<init>()     // Catch:{ all -> 0x0495 }
            r10 = 0
        L_0x0419:
            int r6 = r0.size()     // Catch:{ all -> 0x0495 }
            if (r10 >= r6) goto L_0x0435
            java.lang.Object r6 = r0.get(r10)     // Catch:{ all -> 0x0495 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0495 }
            if (r6 == 0) goto L_0x048e
            int r6 = r6.intValue()     // Catch:{ all -> 0x0495 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0495 }
            r5.add(r6)     // Catch:{ all -> 0x0495 }
            int r10 = r10 + 1
            goto L_0x0419
        L_0x0435:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r5)     // Catch:{ all -> 0x0495 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0495 }
            r5.<init>()     // Catch:{ all -> 0x0495 }
            java.lang.String r6 = "("
            r5.append(r6)     // Catch:{ all -> 0x0495 }
            r5.append(r0)     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0495 }
            java.lang.String r5 = "audience_filter_values"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0495 }
            r6.<init>()     // Catch:{ all -> 0x0495 }
            java.lang.String r8 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r6.append(r8)     // Catch:{ all -> 0x0495 }
            r6.append(r0)     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r6.append(r0)     // Catch:{ all -> 0x0495 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0495 }
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0495 }
            r8 = 0
            r6[r8] = r2     // Catch:{ all -> 0x0495 }
            java.lang.String r2 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0495 }
            r7 = 1
            r6[r7] = r2     // Catch:{ all -> 0x0495 }
            r3.delete(r5, r0, r6)     // Catch:{ all -> 0x0495 }
            goto L_0x048e
        L_0x047a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.t4 r3 = r1.f14613a     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.p3 r3 = r3.mo14551d()     // Catch:{ all -> 0x0495 }
            com.google.android.gms.measurement.internal.n3 r3 = r3.mo14675r()     // Catch:{ all -> 0x0495 }
            java.lang.String r5 = "Database error querying filters. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4746p3.m18094z(r24)     // Catch:{ all -> 0x0495 }
            r3.mo14617c(r5, r2, r0)     // Catch:{ all -> 0x0495 }
        L_0x048e:
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x0495 }
            r4.endTransaction()
            return
        L_0x0495:
            r0 = move-exception
            r4.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4687k.mo14514n(java.lang.String, java.util.List):void");
    }

    /* renamed from: o */
    public final void mo14515o() {
        mo14301i();
        mo14495P().setTransactionSuccessful();
    }

    /* renamed from: p */
    public final void mo14516p(C4748p5 p5Var) {
        C7264i.m27902k(p5Var);
        mo14554h();
        mo14301i();
        String i0 = p5Var.mo14728i0();
        C7264i.m27902k(i0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", i0);
        contentValues.put("app_instance_id", p5Var.mo14730j0());
        contentValues.put("gmp_app_id", p5Var.mo14738n0());
        contentValues.put("resettable_device_id_hash", p5Var.mo14713b());
        contentValues.put("last_bundle_index", Long.valueOf(p5Var.mo14716c0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(p5Var.mo14718d0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(p5Var.mo14714b0()));
        contentValues.put(C11772k.C11773a.f34185q, p5Var.mo14734l0());
        contentValues.put("app_store", p5Var.mo14732k0());
        contentValues.put("gmp_version", Long.valueOf(p5Var.mo14712a0()));
        contentValues.put("dev_cert_hash", Long.valueOf(p5Var.mo14708X()));
        contentValues.put("measurement_enabled", Boolean.valueOf(p5Var.mo14697M()));
        contentValues.put("day", Long.valueOf(p5Var.mo14707W()));
        contentValues.put("daily_public_events_count", Long.valueOf(p5Var.mo14705U()));
        contentValues.put("daily_events_count", Long.valueOf(p5Var.mo14704T()));
        contentValues.put("daily_conversions_count", Long.valueOf(p5Var.mo14702R()));
        contentValues.put("config_fetched_time", Long.valueOf(p5Var.mo14701Q()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(p5Var.mo14710Z()));
        contentValues.put("app_version_int", Long.valueOf(p5Var.mo14700P()));
        contentValues.put("firebase_instance_id", p5Var.mo14736m0());
        contentValues.put("daily_error_events_count", Long.valueOf(p5Var.mo14703S()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(p5Var.mo14706V()));
        contentValues.put("health_monitor_sample", p5Var.mo14711a());
        p5Var.mo14685A();
        contentValues.put("android_id", 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(p5Var.mo14696L()));
        contentValues.put("admob_app_id", p5Var.mo14724g0());
        contentValues.put("dynamite_version", Long.valueOf(p5Var.mo14709Y()));
        contentValues.put("session_stitching_token", p5Var.mo14715c());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(p5Var.mo14699O()));
        contentValues.put("target_os_version", Long.valueOf(p5Var.mo14720e0()));
        List d = p5Var.mo14717d();
        if (d != null) {
            if (d.isEmpty()) {
                this.f14613a.mo14551d().mo14680w().mo14616b("Safelisted events should not be an empty list. appId", i0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", d));
            }
        }
        C4286lc.m16235c();
        if (this.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14385m0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase P = mo14495P();
            if (((long) P.update("apps", contentValues, "app_id = ?", new String[]{i0})) == 0 && P.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f14613a.mo14551d().mo14675r().mo14616b("Failed to insert/update app (got -1). appId", C4746p3.m18094z(i0));
            }
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14675r().mo14617c("Error storing app. appId", C4746p3.m18094z(i0), e);
        }
    }

    /* renamed from: q */
    public final void mo14517q(C4753q qVar) {
        long j;
        C7264i.m27902k(qVar);
        mo14554h();
        mo14301i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", qVar.f14770a);
        contentValues.put("name", qVar.f14771b);
        contentValues.put("lifetime_count", Long.valueOf(qVar.f14772c));
        contentValues.put("current_bundle_count", Long.valueOf(qVar.f14773d));
        contentValues.put("last_fire_timestamp", Long.valueOf(qVar.f14775f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(qVar.f14776g));
        contentValues.put("last_bundled_day", qVar.f14777h);
        contentValues.put("last_sampled_complex_event_id", qVar.f14778i);
        contentValues.put("last_sampling_rate", qVar.f14779j);
        contentValues.put("current_session_count", Long.valueOf(qVar.f14774e));
        Boolean bool = qVar.f14780k;
        if (bool == null || !bool.booleanValue()) {
            j = null;
        } else {
            j = 1L;
        }
        contentValues.put("last_exempt_from_sampling", j);
        try {
            if (mo14495P().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.f14613a.mo14551d().mo14675r().mo14616b("Failed to insert/update event aggregates (got -1). appId", C4746p3.m18094z(qVar.f14770a));
            }
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14675r().mo14617c("Error storing event aggregates. appId", C4746p3.m18094z(qVar.f14770a), e);
        }
    }

    /* renamed from: r */
    public final boolean mo14518r() {
        if (m17812I("select count(1) > 0 from raw_events", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo14519s() {
        if (m17812I("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo14520t() {
        if (m17812I("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo14521u() {
        Context c = this.f14613a.mo14550c();
        this.f14613a.mo14876z();
        return c.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: v */
    public final boolean mo14522v(String str, Long l, long j, C4244j4 j4Var) {
        mo14554h();
        mo14301i();
        C7264i.m27902k(j4Var);
        C7264i.m27898g(str);
        C7264i.m27902k(l);
        byte[] g = j4Var.mo13041g();
        this.f14613a.mo14551d().mo14679v().mo14617c("Saving complex main event, appId, data size", this.f14613a.mo14847D().mo14528d(str), Integer.valueOf(g.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", g);
        try {
            if (mo14495P().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f14613a.mo14551d().mo14675r().mo14616b("Failed to insert complex main event (got -1). appId", C4746p3.m18094z(str));
            return false;
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14675r().mo14617c("Error storing complex main event. appId", C4746p3.m18094z(str), e);
            return false;
        }
    }

    /* renamed from: w */
    public final boolean mo14523w(zzac zzac) {
        C7264i.m27902k(zzac);
        mo14554h();
        mo14301i();
        String str = zzac.f15091d;
        C7264i.m27902k(str);
        if (mo14502X(str, zzac.f15093f.f15108e) == null) {
            long I = m17812I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f14613a.mo14876z();
            if (I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzac.f15092e);
        contentValues.put("name", zzac.f15093f.f15108e);
        m17811H(contentValues, C11755a.C11756a.f34100b, C7264i.m27902k(zzac.f15093f.mo14994v()));
        contentValues.put("active", Boolean.valueOf(zzac.f15095h));
        contentValues.put("trigger_event_name", zzac.f15096i);
        contentValues.put("trigger_timeout", Long.valueOf(zzac.f15098k));
        contentValues.put("timed_out_event", this.f14613a.mo14856N().mo14818e0(zzac.f15097j));
        contentValues.put("creation_timestamp", Long.valueOf(zzac.f15094g));
        contentValues.put("triggered_event", this.f14613a.mo14856N().mo14818e0(zzac.f15099l));
        contentValues.put("triggered_timestamp", Long.valueOf(zzac.f15093f.f15109f));
        contentValues.put("time_to_live", Long.valueOf(zzac.f15100m));
        contentValues.put("expired_event", this.f14613a.mo14856N().mo14818e0(zzac.f15101n));
        try {
            if (mo14495P().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f14613a.mo14551d().mo14675r().mo14616b("Failed to insert/update conditional user property (got -1)", C4746p3.m18094z(str));
            }
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14675r().mo14617c("Error storing conditional user property", C4746p3.m18094z(str), e);
        }
        return true;
    }

    /* renamed from: x */
    public final boolean mo14524x(C4763q9 q9Var) {
        C7264i.m27902k(q9Var);
        mo14554h();
        mo14301i();
        if (mo14502X(q9Var.f14802a, q9Var.f14804c) == null) {
            if (C4785s9.m18220Z(q9Var.f14804c)) {
                if (m17812I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{q9Var.f14802a}) >= ((long) this.f14613a.mo14876z().mo14410p(q9Var.f14802a, C4636f3.f14340I, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(q9Var.f14804c)) {
                long I = m17812I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{q9Var.f14802a, q9Var.f14803b});
                this.f14613a.mo14876z();
                if (I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", q9Var.f14802a);
        contentValues.put("origin", q9Var.f14803b);
        contentValues.put("name", q9Var.f14804c);
        contentValues.put("set_timestamp", Long.valueOf(q9Var.f14805d));
        m17811H(contentValues, C11755a.C11756a.f34100b, q9Var.f14806e);
        try {
            if (mo14495P().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f14613a.mo14551d().mo14675r().mo14616b("Failed to insert/update user property (got -1). appId", C4746p3.m18094z(q9Var.f14802a));
            }
        } catch (SQLiteException e) {
            this.f14613a.mo14551d().mo14675r().mo14617c("Error storing user property. appId", C4746p3.m18094z(q9Var.f14802a), e);
        }
        return true;
    }
}
