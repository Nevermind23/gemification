package p330z0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import ue1.C43081r;

/* renamed from: z0.b */
public final /* synthetic */ class C9151b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ C43081r f25379a;

    public /* synthetic */ C9151b(C43081r rVar) {
        this.f25379a = rVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return C9152c.m33780e(this.f25379a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
