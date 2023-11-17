package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.salesforce.marketingcloud.storage.p385db.C11769i;

/* renamed from: com.google.android.gms.measurement.internal.i3 */
final class C4669i3 extends SQLiteOpenHelper {

    /* renamed from: d */
    final /* synthetic */ C4680j3 f14509d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4669i3(C4680j3 j3Var, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f14509d = j3Var;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f14509d.f14613a.mo14551d().mo14675r().mo14615a("Opening the local database failed, dropping and recreating it");
            this.f14509d.f14613a.mo14876z();
            if (!this.f14509d.f14613a.mo14550c().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f14509d.f14613a.mo14551d().mo14675r().mo14616b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f14509d.f14613a.mo14551d().mo14675r().mo14616b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C4698l.m17867b(this.f14509d.f14613a.mo14551d(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C4698l.m17866a(this.f14509d.f14613a.mo14551d(), sQLiteDatabase, C11769i.f34134e, "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
