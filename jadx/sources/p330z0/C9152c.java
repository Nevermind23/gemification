package p330z0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p318y0.C8989a;
import p318y0.C8991b;
import p318y0.C8998i;
import p318y0.C9007l;
import p318y0.C9008m;
import ue1.C43081r;

/* renamed from: z0.c */
public final class C9152c implements C8998i {

    /* renamed from: e */
    public static final C9153a f25380e = new C9153a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private static final String[] f25381f = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: g */
    private static final String[] f25382g = new String[0];

    /* renamed from: d */
    private final SQLiteDatabase f25383d;

    /* renamed from: z0.c$a */
    public static final class C9153a {
        private C9153a() {
        }

        public /* synthetic */ C9153a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: z0.c$b */
    static final class C9154b extends C41537m implements C43081r {

        /* renamed from: d */
        final /* synthetic */ C9007l f25384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9154b(C9007l lVar) {
            super(4);
            this.f25384d = lVar;
        }

        /* renamed from: a */
        public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            C9007l lVar = this.f25384d;
            C41536l.m120486f(sQLiteQuery);
            lVar.mo23621c(new C9166g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C9152c(SQLiteDatabase sQLiteDatabase) {
        C41536l.m120489i(sQLiteDatabase, "delegate");
        this.f25383d = sQLiteDatabase;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final Cursor m33780e(C43081r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C41536l.m120489i(rVar, "$tmp0");
        return (Cursor) rVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final Cursor m33781f(C9007l lVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C41536l.m120489i(lVar, "$query");
        C41536l.m120486f(sQLiteQuery);
        lVar.mo23621c(new C9166g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* renamed from: A1 */
    public Cursor mo23649A1(C9007l lVar, CancellationSignal cancellationSignal) {
        C41536l.m120489i(lVar, "query");
        SQLiteDatabase sQLiteDatabase = this.f25383d;
        String a = lVar.mo23619a();
        String[] strArr = f25382g;
        C41536l.m120486f(cancellationSignal);
        return C8991b.m33282e(sQLiteDatabase, a, strArr, (String) null, cancellationSignal, new C9150a(lVar));
    }

    /* renamed from: F */
    public void mo23650F() {
        this.f25383d.beginTransaction();
    }

    /* renamed from: I */
    public List mo23651I() {
        return this.f25383d.getAttachedDbs();
    }

    /* renamed from: L */
    public void mo23652L(String str) {
        C41536l.m120489i(str, "sql");
        this.f25383d.execSQL(str);
    }

    /* renamed from: N0 */
    public C9008m mo23653N0(String str) {
        C41536l.m120489i(str, "sql");
        SQLiteStatement compileStatement = this.f25383d.compileStatement(str);
        C41536l.m120488h(compileStatement, "delegate.compileStatement(sql)");
        return new C9167h(compileStatement);
    }

    /* renamed from: U0 */
    public int mo23654U0(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        boolean z;
        int i2;
        String str3;
        C41536l.m120489i(str, "table");
        C41536l.m120489i(contentValues, "values");
        int i3 = 0;
        if (contentValues.size() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int size = contentValues.size();
            if (objArr == null) {
                i2 = size;
            } else {
                i2 = objArr.length + size;
            }
            Object[] objArr2 = new Object[i2];
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ");
            sb.append(f25381f[i]);
            sb.append(str);
            sb.append(" SET ");
            for (String next : contentValues.keySet()) {
                if (i3 > 0) {
                    str3 = ",";
                } else {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(next);
                objArr2[i3] = contentValues.get(next);
                sb.append("=?");
                i3++;
            }
            if (objArr != null) {
                for (int i4 = size; i4 < i2; i4++) {
                    objArr2[i4] = objArr[i4 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            String sb2 = sb.toString();
            C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
            C9008m N0 = mo23653N0(sb2);
            C8989a.f25020f.mo24407b(N0, objArr2);
            return N0.mo23676O();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    /* renamed from: X */
    public void mo23655X() {
        this.f25383d.setTransactionSuccessful();
    }

    /* renamed from: Y */
    public void mo23656Y(String str, Object[] objArr) {
        C41536l.m120489i(str, "sql");
        C41536l.m120489i(objArr, "bindArgs");
        this.f25383d.execSQL(str, objArr);
    }

    /* renamed from: Z */
    public void mo23657Z() {
        this.f25383d.beginTransactionNonExclusive();
    }

    /* renamed from: b1 */
    public Cursor mo23659b1(String str) {
        C41536l.m120489i(str, "query");
        return mo23661g1(new C8989a(str));
    }

    public void close() {
        this.f25383d.close();
    }

    /* renamed from: d */
    public final boolean mo24727d(SQLiteDatabase sQLiteDatabase) {
        C41536l.m120489i(sQLiteDatabase, "sqLiteDatabase");
        return C41536l.m120484d(this.f25383d, sQLiteDatabase);
    }

    /* renamed from: g1 */
    public Cursor mo23661g1(C9007l lVar) {
        C41536l.m120489i(lVar, "query");
        Cursor rawQueryWithFactory = this.f25383d.rawQueryWithFactory(new C9151b(new C9154b(lVar)), lVar.mo23619a(), f25382g, (String) null);
        C41536l.m120488h(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    /* renamed from: i0 */
    public void mo23662i0() {
        this.f25383d.endTransaction();
    }

    public boolean isOpen() {
        return this.f25383d.isOpen();
    }

    /* renamed from: m1 */
    public boolean mo23664m1() {
        return this.f25383d.inTransaction();
    }

    /* renamed from: w1 */
    public boolean mo23665w1() {
        return C8991b.m33281d(this.f25383d);
    }

    /* renamed from: z */
    public String mo23666z() {
        return this.f25383d.getPath();
    }
}
