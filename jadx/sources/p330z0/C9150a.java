package p330z0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import p318y0.C9007l;

/* renamed from: z0.a */
public final /* synthetic */ class C9150a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ C9007l f25378a;

    public /* synthetic */ C9150a(C9007l lVar) {
        this.f25378a = lVar;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return C9152c.m33781f(this.f25378a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
