package p272u5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: u5.t0 */
final class C8628t0 extends SQLiteOpenHelper {

    /* renamed from: f */
    private static final String f24387f = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: g */
    static int f24388g = 5;

    /* renamed from: h */
    private static final C8629a f24389h;

    /* renamed from: i */
    private static final C8629a f24390i;

    /* renamed from: j */
    private static final C8629a f24391j;

    /* renamed from: k */
    private static final C8629a f24392k;

    /* renamed from: l */
    private static final C8629a f24393l;

    /* renamed from: m */
    private static final List f24394m;

    /* renamed from: d */
    private final int f24395d;

    /* renamed from: e */
    private boolean f24396e = false;

    /* renamed from: u5.t0$a */
    public interface C8629a {
        /* renamed from: a */
        void mo23965a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C8618o0 o0Var = new C8618o0();
        f24389h = o0Var;
        C8620p0 p0Var = new C8620p0();
        f24390i = p0Var;
        C8622q0 q0Var = new C8622q0();
        f24391j = q0Var;
        C8624r0 r0Var = new C8624r0();
        f24392k = r0Var;
        C8626s0 s0Var = new C8626s0();
        f24393l = s0Var;
        f24394m = Arrays.asList(new C8629a[]{o0Var, p0Var, q0Var, r0Var, s0Var});
    }

    C8628t0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f24395d = i;
    }

    /* renamed from: h */
    private void m32231h(SQLiteDatabase sQLiteDatabase) {
        if (!this.f24396e) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m32232i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m32233k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m32235n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ void m32236o(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f24387f);
    }

    /* renamed from: p */
    private void m32237p(SQLiteDatabase sQLiteDatabase, int i) {
        m32231h(sQLiteDatabase);
        m32238q(sQLiteDatabase, 0, i);
    }

    /* renamed from: q */
    private void m32238q(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List list = f24394m;
        if (i2 <= list.size()) {
            while (i < i2) {
                ((C8629a) f24394m.get(i)).mo23965a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f24396e = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m32237p(sQLiteDatabase, this.f24395d);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m32237p(sQLiteDatabase, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m32231h(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m32231h(sQLiteDatabase);
        m32238q(sQLiteDatabase, i, i2);
    }
}
