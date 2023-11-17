package p330z0;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.C41536l;
import p318y0.C9008m;

/* renamed from: z0.h */
public final class C9167h extends C9166g implements C9008m {

    /* renamed from: e */
    private final SQLiteStatement f25415e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9167h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        C41536l.m120489i(sQLiteStatement, "delegate");
        this.f25415e = sQLiteStatement;
    }

    /* renamed from: D0 */
    public long mo23675D0() {
        return this.f25415e.executeInsert();
    }

    /* renamed from: O */
    public int mo23676O() {
        return this.f25415e.executeUpdateDelete();
    }
}
