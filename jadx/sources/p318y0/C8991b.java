package p318y0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;
import kotlin.jvm.internal.C41536l;

/* renamed from: y0.b */
public final class C8991b {

    /* renamed from: a */
    public static final C8991b f25023a = new C8991b();

    private C8991b() {
    }

    /* renamed from: a */
    public static final void m33278a(CancellationSignal cancellationSignal) {
        C41536l.m120489i(cancellationSignal, "cancellationSignal");
        cancellationSignal.cancel();
    }

    /* renamed from: b */
    public static final CancellationSignal m33279b() {
        return new CancellationSignal();
    }

    /* renamed from: c */
    public static final boolean m33280c(File file) {
        C41536l.m120489i(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }

    /* renamed from: d */
    public static final boolean m33281d(SQLiteDatabase sQLiteDatabase) {
        C41536l.m120489i(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    /* renamed from: e */
    public static final Cursor m33282e(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        C41536l.m120489i(sQLiteDatabase, "sQLiteDatabase");
        C41536l.m120489i(str, "sql");
        C41536l.m120489i(strArr, "selectionArgs");
        C41536l.m120489i(cancellationSignal, "cancellationSignal");
        C41536l.m120489i(cursorFactory, "cursorFactory");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        C41536l.m120488h(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    /* renamed from: f */
    public static final void m33283f(SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
        C41536l.m120489i(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
    }
}
