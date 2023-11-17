package p330z0;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import p318y0.C8999j;
import p330z0.C9155d;

/* renamed from: z0.e */
public final /* synthetic */ class C9164e implements DatabaseErrorHandler {

    /* renamed from: a */
    public final /* synthetic */ C8999j.C9000a f25412a;

    /* renamed from: b */
    public final /* synthetic */ C9155d.C9157b f25413b;

    public /* synthetic */ C9164e(C8999j.C9000a aVar, C9155d.C9157b bVar) {
        this.f25412a = aVar;
        this.f25413b = bVar;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C9155d.C9158c.m33810c(this.f25412a, this.f25413b, sQLiteDatabase);
    }
}
