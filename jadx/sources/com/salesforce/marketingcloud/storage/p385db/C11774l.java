package com.salesforce.marketingcloud.storage.p385db;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.storage.exceptions.C11789a;
import com.salesforce.marketingcloud.storage.p385db.upgrades.C11777a;
import com.salesforce.marketingcloud.storage.p385db.upgrades.C11779b;
import com.salesforce.marketingcloud.storage.p385db.upgrades.C11780c;
import com.salesforce.marketingcloud.storage.p385db.upgrades.C11781d;
import com.salesforce.marketingcloud.storage.p385db.upgrades.C11782e;
import com.salesforce.marketingcloud.storage.p385db.upgrades.C11783f;
import com.salesforce.marketingcloud.storage.p385db.upgrades.C11784g;
import com.salesforce.marketingcloud.storage.p385db.upgrades.C11785h;
import com.salesforce.marketingcloud.storage.p385db.upgrades.C11786i;
import com.salesforce.marketingcloud.util.C11808c;
import java.util.Locale;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.storage.db.l */
public final class C11774l extends SQLiteOpenHelper {

    /* renamed from: d */
    public static final int f34188d = 10;

    /* renamed from: e */
    private static final String f34189e = "mcsdk_%s.db";

    /* renamed from: f */
    private static final String f34190f = C11461g.m41875a("StorageSqliteOpenHelper");

    /* renamed from: a */
    private final Context f34191a;

    /* renamed from: b */
    private final C11808c f34192b;

    /* renamed from: c */
    private boolean f34193c;

    public C11774l(Context context, C11808c cVar, String str) {
        this(context, cVar, m43042a(str), 10);
    }

    /* renamed from: a */
    public static String m43042a(String str) {
        return String.format(Locale.ENGLISH, f34189e, new Object[]{str});
    }

    /* renamed from: b */
    public void mo31586b() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        m43043a(writableDatabase);
        writableDatabase.execSQL("VACUUM");
        onCreate(writableDatabase);
    }

    /* renamed from: c */
    public void mo31587c() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!C11772k.m43035c(writableDatabase)) {
            C11461g.m41894e(f34190f, "Database table %s was not initialized properly and will be dropped and recreated.  Some data may be lost.", C11772k.f34166e);
            try {
                mo31586b();
                if (!C11772k.m43035c(writableDatabase)) {
                    throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", new Object[]{C11772k.f34166e}));
                }
                throw new C11789a();
            } catch (Exception e) {
                throw new IllegalStateException(e.getMessage(), e);
            }
        } else if (!C11765g.m42972d(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", new Object[]{C11765g.f34122e}));
        } else if (!C11755a.m42880d(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", new Object[]{C11755a.f34094e}));
        } else if (!C11771j.m43020g(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", new Object[]{C11771j.f34163e}));
        } else if (!C11769i.m43003d(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", new Object[]{C11769i.f34134e}));
        } else if (!C11767h.m42992d(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", new Object[]{C11767h.f34127e}));
        } else if (!C11775m.m43052d(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", new Object[]{C11775m.f34194g}));
        } else if (!C11764f.m42955m(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", new Object[]{C11764f.f34116e}));
        } else if (!C11763e.m42932d(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", new Object[]{"device_stats"}));
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            C11772k.m43033b(sQLiteDatabase);
            C11765g.m42968b(sQLiteDatabase);
            C11755a.m42877b(sQLiteDatabase);
            C11771j.m43017d(sQLiteDatabase);
            C11769i.m43001b(sQLiteDatabase);
            C11767h.m42990b(sQLiteDatabase);
            C11764f.m42951i(sQLiteDatabase);
            C11775m.m43049b(sQLiteDatabase);
            C11763e.m42930b(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C11461g.m41894e(f34190f, "SQLite database being downgraded from %d to %d", Integer.valueOf(i2), Integer.valueOf(i));
        this.f34193c = true;
        m43043a(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            C11777a.m43066b(sQLiteDatabase, this.f34191a, this.f34192b);
        }
        if (i < 3) {
            C11779b.m43076f(sQLiteDatabase);
        }
        if (i < 4) {
            C11780c.m43079c(sQLiteDatabase);
        }
        if (i < 5) {
            C11781d.m43081b(sQLiteDatabase);
        }
        if (i < 6) {
            C11782e.m43083b(sQLiteDatabase);
        }
        if (i < 7) {
            C11783f.m43085b(sQLiteDatabase);
        }
        if (i < 8) {
            C11784g.m43086a(sQLiteDatabase);
        }
        if (i < 9) {
            C11785h.m43088b(sQLiteDatabase);
        }
        if (i < 10) {
            C11786i.m43092b(sQLiteDatabase, this.f34192b);
        }
    }

    C11774l(Context context, C11808c cVar, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f34191a = context;
        this.f34192b = cVar;
    }

    /* renamed from: a */
    private void m43043a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            C11772k.m43032a(sQLiteDatabase);
            C11765g.m42967a(sQLiteDatabase);
            C11755a.m42875a(sQLiteDatabase);
            C11771j.m43016c(sQLiteDatabase);
            C11769i.m42999a(sQLiteDatabase);
            C11767h.m42989a(sQLiteDatabase);
            C11764f.m42947e(sQLiteDatabase);
            C11775m.m43048a(sQLiteDatabase);
            C11763e.m42928a(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: a */
    public boolean mo31585a() {
        return this.f34193c;
    }
}
