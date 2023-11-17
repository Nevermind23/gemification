package p272u5;

import android.database.sqlite.SQLiteDatabase;
import p272u5.C8628t0;

/* renamed from: u5.q0 */
public final /* synthetic */ class C8622q0 implements C8628t0.C8629a {
    /* renamed from: a */
    public final void mo23965a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
