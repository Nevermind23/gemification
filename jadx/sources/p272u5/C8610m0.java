package p272u5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import ge1.C41084a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p142k5.C6811b;
import p142k5.C6813d;
import p168m5.C7117h;
import p168m5.C7118i;
import p168m5.C7129p;
import p207p5.C7711a;
import p207p5.C7713b;
import p207p5.C7715c;
import p207p5.C7718d;
import p207p5.C7720e;
import p207p5.C7722f;
import p220q5.C7894a;
import p285v5.C8702a;
import p298w5.C8850a;
import p311x5.C8965a;

/* renamed from: u5.m0 */
public class C8610m0 implements C8587d, C8702a, C8585c {

    /* renamed from: i */
    private static final C6811b f24360i = C6811b.m26540b("proto");

    /* renamed from: d */
    private final C8628t0 f24361d;

    /* renamed from: e */
    private final C8850a f24362e;

    /* renamed from: f */
    private final C8850a f24363f;

    /* renamed from: g */
    private final C8589e f24364g;

    /* renamed from: h */
    private final C41084a f24365h;

    /* renamed from: u5.m0$b */
    interface C8612b {
        Object apply(Object obj);
    }

    /* renamed from: u5.m0$c */
    private static class C8613c {

        /* renamed from: a */
        final String f24366a;

        /* renamed from: b */
        final String f24367b;

        private C8613c(String str, String str2) {
            this.f24366a = str;
            this.f24367b = str2;
        }
    }

    /* renamed from: u5.m0$d */
    interface C8614d {
        /* renamed from: a */
        Object mo23955a();
    }

    C8610m0(C8850a aVar, C8850a aVar2, C8589e eVar, C8628t0 t0Var, C41084a aVar3) {
        this.f24361d = t0Var;
        this.f24362e = aVar;
        this.f24363f = aVar2;
        this.f24364g = eVar;
        this.f24365h = aVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public /* synthetic */ List m32132B1(C7129p pVar, SQLiteDatabase sQLiteDatabase) {
        List R1 = m32152R1(sQLiteDatabase, pVar, this.f24364g.mo23923d());
        for (C6813d dVar : C6813d.values()) {
            if (dVar != pVar.mo21357d()) {
                int d = this.f24364g.mo23923d() - R1.size();
                if (d <= 0) {
                    break;
                }
                R1.addAll(m32152R1(sQLiteDatabase, pVar.mo21387f(dVar), d));
            }
        }
        return m32159W0(R1, m32153S1(sQLiteDatabase, R1));
    }

    /* renamed from: F0 */
    private C7713b m32133F0() {
        return C7713b.m29297b().mo22454b(C7720e.m29314c().mo22468b(mo23962s0()).mo22469c(C8589e.f24344a.mo23926f()).mo22467a()).mo22453a();
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public /* synthetic */ C7711a m32134F1(Map map, C7711a.C7712a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C7715c.C7717b o0 = m32182o0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C7715c.m29301c().mo22459c(o0).mo22458b(j).mo22457a());
        }
        m32156U1(aVar, map);
        aVar.mo22451e(m32141K0());
        aVar.mo22450d(m32133F0());
        aVar.mo22449c((String) this.f24365h.get());
        return aVar.mo22448b();
    }

    /* renamed from: G0 */
    private long m32135G0() {
        return mo23963x0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public /* synthetic */ C7711a m32136G1(String str, Map map, C7711a.C7712a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C7711a) m32164Z1(sQLiteDatabase.rawQuery(str, new String[0]), new C8584b0(this, map, aVar));
    }

    /* renamed from: H0 */
    private long m32137H0() {
        return mo23963x0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public /* synthetic */ Object m32138H1(List list, C7129p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            C7118i.C7119a k = C7118i.m27441a().mo21339j(cursor.getString(1)).mo21338i(cursor.getLong(2)).mo21340k(cursor.getLong(3));
            if (z) {
                k.mo21337h(new C7117h(m32161X1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.mo21337h(new C7117h(m32161X1(cursor.getString(4)), m32158V1(j)));
            }
            if (!cursor.isNull(6)) {
                k.mo21336g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C8605k.m32128a(j, pVar, k.mo21333d()));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static /* synthetic */ Object m32139I1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C8613c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public /* synthetic */ Long m32140J1(C7118i iVar, C7129p pVar, SQLiteDatabase sQLiteDatabase) {
        boolean z;
        byte[] bArr;
        if (m32157V0()) {
            mo23943d(1, C7715c.C7717b.CACHE_FULL, iVar.mo21330j());
            return -1L;
        }
        long q0 = m32187q0(sQLiteDatabase, pVar);
        int e = this.f24364g.mo23924e();
        byte[] a = iVar.mo21326e().mo21369a();
        if (a.length <= e) {
            z = true;
        } else {
            z = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(q0));
        contentValues.put("transport_name", iVar.mo21330j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.mo21328f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.mo21331k()));
        contentValues.put("payload_encoding", iVar.mo21326e().mo21370b().mo20883a());
        contentValues.put("code", iVar.mo21325d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z));
        if (z) {
            bArr = a;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(((double) a.length) / ((double) e));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a, (i - 1) * e, Math.min(i * e, a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.mo21377i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put(C11755a.C11756a.f34100b, (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: K0 */
    private C7722f m32141K0() {
        return (C7722f) mo23959O0(new C8586c0(this.f24362e.mo24276a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static /* synthetic */ byte[] m32142K1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public /* synthetic */ Object m32143L1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo23943d((long) i, C7715c.C7717b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: M0 */
    private Long m32144M0(SQLiteDatabase sQLiteDatabase, C7129p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{pVar.mo21355b(), String.valueOf(C8965a.m33237a(pVar.mo21357d()))}));
        if (pVar.mo21356c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.mo21356c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m32164Z1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), new C8636z());
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public /* synthetic */ Object m32145M1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m32164Z1(sQLiteDatabase.rawQuery(str2, (String[]) null), new C8632v(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static /* synthetic */ Boolean m32146N1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static /* synthetic */ Object m32147O1(String str, C7715c.C7717b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m32164Z1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo19678i())}), new C8630u())).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.mo19678i()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo19678i())});
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static /* synthetic */ Object m32148P1(long j, C7129p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.mo21355b(), String.valueOf(C8965a.m33237a(pVar.mo21357d()))}) < 1) {
            contentValues.put("backend_name", pVar.mo21355b());
            contentValues.put("priority", Integer.valueOf(C8965a.m33237a(pVar.mo21357d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public /* synthetic */ Object m32150Q1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f24362e.mo24276a()).execute();
        return null;
    }

    /* renamed from: R1 */
    private List m32152R1(SQLiteDatabase sQLiteDatabase, C7129p pVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long M0 = m32144M0(sQLiteDatabase, pVar);
        if (M0 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m32164Z1(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{M0.toString()}, (String) null, (String) null, (String) null, String.valueOf(i)), new C8634x(this, arrayList, pVar));
        return arrayList;
    }

    /* renamed from: S1 */
    private Map m32153S1(SQLiteDatabase sQLiteDatabase, List list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(((C8605k) list.get(i)).mo23937c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m32164Z1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", C11755a.C11756a.f34100b}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new C8625s(hashMap));
        return hashMap;
    }

    /* renamed from: T1 */
    private static byte[] m32154T1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: U1 */
    private void m32156U1(C7711a.C7712a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.mo22447a(C7718d.m29308c().mo22464c((String) entry.getKey()).mo22463b((List) entry.getValue()).mo22462a());
        }
    }

    /* renamed from: V0 */
    private boolean m32157V0() {
        if (m32135G0() * m32137H0() >= this.f24364g.mo23926f()) {
            return true;
        }
        return false;
    }

    /* renamed from: V1 */
    private byte[] m32158V1(long j) {
        return (byte[]) m32164Z1(mo23963x0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num"), new C8582a0());
    }

    /* renamed from: W0 */
    private List m32159W0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C8605k kVar = (C8605k) listIterator.next();
            if (map.containsKey(Long.valueOf(kVar.mo23937c()))) {
                C7118i.C7119a l = kVar.mo23936b().mo21378l();
                for (C8613c cVar : (Set) map.get(Long.valueOf(kVar.mo23937c()))) {
                    l.mo21381c(cVar.f24366a, cVar.f24367b);
                }
                listIterator.set(C8605k.m32128a(kVar.mo23937c(), kVar.mo23938d(), l.mo21333d()));
            }
        }
        return list;
    }

    /* renamed from: W1 */
    private Object m32160W1(C8614d dVar, C8612b bVar) {
        long a = this.f24363f.mo24276a();
        while (true) {
            try {
                return dVar.mo23955a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f24363f.mo24276a() >= ((long) this.f24364g.mo23921b()) + a) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: X1 */
    private static C6811b m32161X1(String str) {
        if (str == null) {
            return f24360i;
        }
        return C6811b.m26540b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public /* synthetic */ Object m32162Y0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo23943d((long) i, C7715c.C7717b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: Y1 */
    private static String m32163Y1(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C8605k) it.next()).mo23937c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: Z1 */
    static Object m32164Z1(Cursor cursor, C8612b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public /* synthetic */ Integer m32166a1(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m32164Z1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C8623r(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public static /* synthetic */ Object m32175i1(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static /* synthetic */ SQLiteDatabase m32176k1(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* renamed from: o0 */
    private C7715c.C7717b m32182o0(int i) {
        C7715c.C7717b bVar = C7715c.C7717b.REASON_UNKNOWN;
        if (i == bVar.mo19678i()) {
            return bVar;
        }
        C7715c.C7717b bVar2 = C7715c.C7717b.MESSAGE_TOO_OLD;
        if (i == bVar2.mo19678i()) {
            return bVar2;
        }
        C7715c.C7717b bVar3 = C7715c.C7717b.CACHE_FULL;
        if (i == bVar3.mo19678i()) {
            return bVar3;
        }
        C7715c.C7717b bVar4 = C7715c.C7717b.PAYLOAD_TOO_BIG;
        if (i == bVar4.mo19678i()) {
            return bVar4;
        }
        C7715c.C7717b bVar5 = C7715c.C7717b.MAX_RETRIES_REACHED;
        if (i == bVar5.mo19678i()) {
            return bVar5;
        }
        C7715c.C7717b bVar6 = C7715c.C7717b.INVALID_PAYLOD;
        if (i == bVar6.mo19678i()) {
            return bVar6;
        }
        C7715c.C7717b bVar7 = C7715c.C7717b.SERVER_ERROR;
        if (i == bVar7.mo19678i()) {
            return bVar7;
        }
        C7894a.m29864b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return bVar;
    }

    /* renamed from: p0 */
    private void m32184p0(SQLiteDatabase sQLiteDatabase) {
        m32160W1(new C8596g0(sQLiteDatabase), new C8598h0());
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static /* synthetic */ Long m32185p1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* renamed from: q0 */
    private long m32187q0(SQLiteDatabase sQLiteDatabase, C7129p pVar) {
        Long M0 = m32144M0(sQLiteDatabase, pVar);
        if (M0 != null) {
            return M0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.mo21355b());
        contentValues.put("priority", Integer.valueOf(C8965a.m33237a(pVar.mo21357d())));
        contentValues.put("next_request_ms", 0);
        if (pVar.mo21356c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.mo21356c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static /* synthetic */ C7722f m32189r1(long j, SQLiteDatabase sQLiteDatabase) {
        return (C7722f) m32164Z1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C8588d0(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static /* synthetic */ Long m32191s1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public /* synthetic */ Boolean m32193t1(C7129p pVar, SQLiteDatabase sQLiteDatabase) {
        Long M0 = m32144M0(sQLiteDatabase, pVar);
        if (M0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m32164Z1(mo23963x0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{M0.toString()}), new C8635y());
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static /* synthetic */ List m32199y1(SQLiteDatabase sQLiteDatabase) {
        return (List) m32164Z1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C8604j0());
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static /* synthetic */ List m32200z1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(C7129p.m27484a().mo21361b(cursor.getString(1)).mo21363d(C8965a.m33238b(cursor.getInt(2))).mo21362c(m32154T1(cursor.getString(3))).mo21360a());
        }
        return arrayList;
    }

    /* renamed from: A0 */
    public void mo23945A0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            mo23959O0(new C8621q(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m32163Y1(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    /* renamed from: G */
    public int mo23946G() {
        return ((Integer) mo23959O0(new C8601i0(this, this.f24362e.mo24276a() - this.f24364g.mo23922c()))).intValue();
    }

    /* renamed from: H */
    public void mo23947H(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            mo23963x0().compileStatement("DELETE FROM events WHERE _id in " + m32163Y1(iterable)).execute();
        }
    }

    /* renamed from: K */
    public long mo23948K(C7129p pVar) {
        return ((Long) m32164Z1(mo23963x0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.mo21355b(), String.valueOf(C8965a.m33237a(pVar.mo21357d()))}), new C8593f0())).longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public Object mo23959O0(C8612b bVar) {
        SQLiteDatabase x0 = mo23963x0();
        x0.beginTransaction();
        try {
            Object apply = bVar.apply(x0);
            x0.setTransactionSuccessful();
            return apply;
        } finally {
            x0.endTransaction();
        }
    }

    /* renamed from: S */
    public Iterable mo23949S() {
        return (Iterable) mo23959O0(new C8607l());
    }

    /* renamed from: T0 */
    public Iterable mo23950T0(C7129p pVar) {
        return (Iterable) mo23959O0(new C8619p(this, pVar));
    }

    /* renamed from: a */
    public void mo23942a() {
        mo23959O0(new C8617o(this));
    }

    /* renamed from: c */
    public Object mo23960c(C8702a.C8703a aVar) {
        SQLiteDatabase x0 = mo23963x0();
        m32184p0(x0);
        try {
            Object v = aVar.mo23420v();
            x0.setTransactionSuccessful();
            return v;
        } finally {
            x0.endTransaction();
        }
    }

    public void close() {
        this.f24361d.close();
    }

    /* renamed from: d */
    public void mo23943d(long j, C7715c.C7717b bVar, String str) {
        mo23959O0(new C8609m(str, bVar, j));
    }

    /* renamed from: g0 */
    public boolean mo23951g0(C7129p pVar) {
        return ((Boolean) mo23959O0(new C8606k0(this, pVar))).booleanValue();
    }

    /* renamed from: k */
    public C7711a mo23944k() {
        return (C7711a) mo23959O0(new C8627t(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), C7711a.m29286e()));
    }

    /* renamed from: n1 */
    public C8605k mo23952n1(C7129p pVar, C7118i iVar) {
        C7894a.m29865c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.mo21357d(), iVar.mo21330j(), pVar.mo21355b());
        long longValue = ((Long) mo23959O0(new C8608l0(this, iVar, pVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C8605k.m32128a(longValue, pVar, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public long mo23962s0() {
        return m32135G0() * m32137H0();
    }

    /* renamed from: u1 */
    public void mo23953u1(C7129p pVar, long j) {
        mo23959O0(new C8615n(j, pVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public SQLiteDatabase mo23963x0() {
        C8628t0 t0Var = this.f24361d;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) m32160W1(new C8633w(t0Var), new C8591e0());
    }
}
