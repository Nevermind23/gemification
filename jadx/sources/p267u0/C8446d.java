package p267u0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p318y0.C8992c;
import p318y0.C8994e;
import p318y0.C8997h;
import p318y0.C8998i;
import p318y0.C8999j;
import p318y0.C9007l;
import p318y0.C9008m;
import ue1.C43075l;

/* renamed from: u0.d */
public final class C8446d implements C8999j, C8476i {

    /* renamed from: d */
    private final C8999j f24024d;

    /* renamed from: e */
    public final C8443c f24025e;

    /* renamed from: f */
    private final C8447a f24026f;

    /* renamed from: u0.d$a */
    public static final class C8447a implements C8998i {

        /* renamed from: d */
        private final C8443c f24027d;

        /* renamed from: u0.d$a$a */
        static final class C8448a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C8448a f24028d = new C8448a();

            C8448a() {
                super(1);
            }

            /* renamed from: a */
            public final List invoke(C8998i iVar) {
                C41536l.m120489i(iVar, "obj");
                return iVar.mo23651I();
            }
        }

        /* renamed from: u0.d$a$b */
        static final class C8449b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ String f24029d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8449b(String str) {
                super(1);
                this.f24029d = str;
            }

            /* renamed from: a */
            public final Object invoke(C8998i iVar) {
                C41536l.m120489i(iVar, "db");
                iVar.mo23652L(this.f24029d);
                return null;
            }
        }

        /* renamed from: u0.d$a$c */
        static final class C8450c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ String f24030d;

            /* renamed from: e */
            final /* synthetic */ Object[] f24031e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8450c(String str, Object[] objArr) {
                super(1);
                this.f24030d = str;
                this.f24031e = objArr;
            }

            /* renamed from: a */
            public final Object invoke(C8998i iVar) {
                C41536l.m120489i(iVar, "db");
                iVar.mo23656Y(this.f24030d, this.f24031e);
                return null;
            }
        }

        /* renamed from: u0.d$a$d */
        /* synthetic */ class C8451d extends C41535k implements C43075l {

            /* renamed from: d */
            public static final C8451d f24032d = new C8451d();

            C8451d() {
                super(1, C8998i.class, "inTransaction", "inTransaction()Z", 0);
            }

            /* renamed from: b */
            public final Boolean invoke(C8998i iVar) {
                C41536l.m120489i(iVar, "p0");
                return Boolean.valueOf(iVar.mo23664m1());
            }
        }

        /* renamed from: u0.d$a$e */
        static final class C8452e extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C8452e f24033d = new C8452e();

            C8452e() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(C8998i iVar) {
                C41536l.m120489i(iVar, "db");
                return Boolean.valueOf(iVar.mo23665w1());
            }
        }

        /* renamed from: u0.d$a$f */
        static final class C8453f extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C8453f f24034d = new C8453f();

            C8453f() {
                super(1);
            }

            /* renamed from: a */
            public final String invoke(C8998i iVar) {
                C41536l.m120489i(iVar, "obj");
                return iVar.mo23666z();
            }
        }

        /* renamed from: u0.d$a$g */
        static final class C8454g extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C8454g f24035d = new C8454g();

            C8454g() {
                super(1);
            }

            /* renamed from: a */
            public final Object invoke(C8998i iVar) {
                C41536l.m120489i(iVar, "it");
                return null;
            }
        }

        /* renamed from: u0.d$a$h */
        static final class C8455h extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ String f24036d;

            /* renamed from: e */
            final /* synthetic */ int f24037e;

            /* renamed from: f */
            final /* synthetic */ ContentValues f24038f;

            /* renamed from: g */
            final /* synthetic */ String f24039g;

            /* renamed from: h */
            final /* synthetic */ Object[] f24040h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8455h(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f24036d = str;
                this.f24037e = i;
                this.f24038f = contentValues;
                this.f24039g = str2;
                this.f24040h = objArr;
            }

            /* renamed from: a */
            public final Integer invoke(C8998i iVar) {
                C41536l.m120489i(iVar, "db");
                return Integer.valueOf(iVar.mo23654U0(this.f24036d, this.f24037e, this.f24038f, this.f24039g, this.f24040h));
            }
        }

        public C8447a(C8443c cVar) {
            C41536l.m120489i(cVar, "autoCloser");
            this.f24027d = cVar;
        }

        /* renamed from: A1 */
        public Cursor mo23649A1(C9007l lVar, CancellationSignal cancellationSignal) {
            C41536l.m120489i(lVar, "query");
            try {
                return new C8460c(this.f24027d.mo23638j().mo23649A1(lVar, cancellationSignal), this.f24027d);
            } catch (Throwable th) {
                this.f24027d.mo23634e();
                throw th;
            }
        }

        /* renamed from: F */
        public void mo23650F() {
            try {
                this.f24027d.mo23638j().mo23650F();
            } catch (Throwable th) {
                this.f24027d.mo23634e();
                throw th;
            }
        }

        /* renamed from: I */
        public List mo23651I() {
            return (List) this.f24027d.mo23635g(C8448a.f24028d);
        }

        /* renamed from: L */
        public void mo23652L(String str) {
            C41536l.m120489i(str, "sql");
            this.f24027d.mo23635g(new C8449b(str));
        }

        /* renamed from: N0 */
        public C9008m mo23653N0(String str) {
            C41536l.m120489i(str, "sql");
            return new C8456b(str, this.f24027d);
        }

        /* renamed from: U0 */
        public int mo23654U0(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
            C41536l.m120489i(str, "table");
            C41536l.m120489i(contentValues, "values");
            return ((Number) this.f24027d.mo23635g(new C8455h(str, i, contentValues, str2, objArr))).intValue();
        }

        /* renamed from: X */
        public void mo23655X() {
            C41238w wVar;
            C8998i h = this.f24027d.mo23636h();
            if (h != null) {
                h.mo23655X();
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        /* renamed from: Y */
        public void mo23656Y(String str, Object[] objArr) {
            C41536l.m120489i(str, "sql");
            C41536l.m120489i(objArr, "bindArgs");
            this.f24027d.mo23635g(new C8450c(str, objArr));
        }

        /* renamed from: Z */
        public void mo23657Z() {
            try {
                this.f24027d.mo23638j().mo23657Z();
            } catch (Throwable th) {
                this.f24027d.mo23634e();
                throw th;
            }
        }

        /* renamed from: a */
        public final void mo23658a() {
            this.f24027d.mo23635g(C8454g.f24035d);
        }

        /* renamed from: b1 */
        public Cursor mo23659b1(String str) {
            C41536l.m120489i(str, "query");
            try {
                return new C8460c(this.f24027d.mo23638j().mo23659b1(str), this.f24027d);
            } catch (Throwable th) {
                this.f24027d.mo23634e();
                throw th;
            }
        }

        public void close() {
            this.f24027d.mo23633d();
        }

        /* renamed from: g1 */
        public Cursor mo23661g1(C9007l lVar) {
            C41536l.m120489i(lVar, "query");
            try {
                return new C8460c(this.f24027d.mo23638j().mo23661g1(lVar), this.f24027d);
            } catch (Throwable th) {
                this.f24027d.mo23634e();
                throw th;
            }
        }

        /* renamed from: i0 */
        public void mo23662i0() {
            if (this.f24027d.mo23636h() != null) {
                try {
                    C8998i h = this.f24027d.mo23636h();
                    C41536l.m120486f(h);
                    h.mo23662i0();
                } finally {
                    this.f24027d.mo23634e();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null".toString());
            }
        }

        public boolean isOpen() {
            C8998i h = this.f24027d.mo23636h();
            if (h == null) {
                return false;
            }
            return h.isOpen();
        }

        /* renamed from: m1 */
        public boolean mo23664m1() {
            if (this.f24027d.mo23636h() == null) {
                return false;
            }
            return ((Boolean) this.f24027d.mo23635g(C8451d.f24032d)).booleanValue();
        }

        /* renamed from: w1 */
        public boolean mo23665w1() {
            return ((Boolean) this.f24027d.mo23635g(C8452e.f24033d)).booleanValue();
        }

        /* renamed from: z */
        public String mo23666z() {
            return (String) this.f24027d.mo23635g(C8453f.f24034d);
        }
    }

    /* renamed from: u0.d$b */
    private static final class C8456b implements C9008m {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final String f24041d;

        /* renamed from: e */
        private final C8443c f24042e;

        /* renamed from: f */
        private final ArrayList f24043f = new ArrayList();

        /* renamed from: u0.d$b$a */
        static final class C8457a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C8457a f24044d = new C8457a();

            C8457a() {
                super(1);
            }

            /* renamed from: a */
            public final Long invoke(C9008m mVar) {
                C41536l.m120489i(mVar, "obj");
                return Long.valueOf(mVar.mo23675D0());
            }
        }

        /* renamed from: u0.d$b$b */
        static final class C8458b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C8456b f24045d;

            /* renamed from: e */
            final /* synthetic */ C43075l f24046e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8458b(C8456b bVar, C43075l lVar) {
                super(1);
                this.f24045d = bVar;
                this.f24046e = lVar;
            }

            /* renamed from: a */
            public final Object invoke(C8998i iVar) {
                C41536l.m120489i(iVar, "db");
                C9008m N0 = iVar.mo23653N0(this.f24045d.f24041d);
                this.f24045d.m31714d(N0);
                return this.f24046e.invoke(N0);
            }
        }

        /* renamed from: u0.d$b$c */
        static final class C8459c extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C8459c f24047d = new C8459c();

            C8459c() {
                super(1);
            }

            /* renamed from: a */
            public final Integer invoke(C9008m mVar) {
                C41536l.m120489i(mVar, "obj");
                return Integer.valueOf(mVar.mo23676O());
            }
        }

        public C8456b(String str, C8443c cVar) {
            C41536l.m120489i(str, "sql");
            C41536l.m120489i(cVar, "autoCloser");
            this.f24041d = str;
            this.f24042e = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m31714d(C9008m mVar) {
            Iterator it = this.f24043f.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    C41341q.m119917t();
                }
                Object obj = this.f24043f.get(i);
                if (obj == null) {
                    mVar.mo23624j1(i2);
                } else if (obj instanceof Long) {
                    mVar.mo23628r(i2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    mVar.mo23620b(i2, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    mVar.mo23623j(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    mVar.mo23618X0(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        /* renamed from: e */
        private final Object m31715e(C43075l lVar) {
            return this.f24042e.mo23635g(new C8458b(this, lVar));
        }

        /* renamed from: f */
        private final void m31716f(int i, Object obj) {
            int size;
            int i2 = i - 1;
            if (i2 >= this.f24043f.size() && (size = this.f24043f.size()) <= i2) {
                while (true) {
                    this.f24043f.add((Object) null);
                    if (size == i2) {
                        break;
                    }
                    size++;
                }
            }
            this.f24043f.set(i2, obj);
        }

        /* renamed from: D0 */
        public long mo23675D0() {
            return ((Number) m31715e(C8457a.f24044d)).longValue();
        }

        /* renamed from: O */
        public int mo23676O() {
            return ((Number) m31715e(C8459c.f24047d)).intValue();
        }

        /* renamed from: X0 */
        public void mo23618X0(int i, byte[] bArr) {
            C41536l.m120489i(bArr, C11755a.C11756a.f34100b);
            m31716f(i, bArr);
        }

        /* renamed from: b */
        public void mo23620b(int i, double d) {
            m31716f(i, Double.valueOf(d));
        }

        public void close() {
        }

        /* renamed from: j */
        public void mo23623j(int i, String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            m31716f(i, str);
        }

        /* renamed from: j1 */
        public void mo23624j1(int i) {
            m31716f(i, (Object) null);
        }

        /* renamed from: r */
        public void mo23628r(int i, long j) {
            m31716f(i, Long.valueOf(j));
        }
    }

    /* renamed from: u0.d$c */
    private static final class C8460c implements Cursor {

        /* renamed from: d */
        private final Cursor f24048d;

        /* renamed from: e */
        private final C8443c f24049e;

        public C8460c(Cursor cursor, C8443c cVar) {
            C41536l.m120489i(cursor, "delegate");
            C41536l.m120489i(cVar, "autoCloser");
            this.f24048d = cursor;
            this.f24049e = cVar;
        }

        public void close() {
            this.f24048d.close();
            this.f24049e.mo23634e();
        }

        public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.f24048d.copyStringToBuffer(i, charArrayBuffer);
        }

        public void deactivate() {
            this.f24048d.deactivate();
        }

        public byte[] getBlob(int i) {
            return this.f24048d.getBlob(i);
        }

        public int getColumnCount() {
            return this.f24048d.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.f24048d.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) {
            return this.f24048d.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i) {
            return this.f24048d.getColumnName(i);
        }

        public String[] getColumnNames() {
            return this.f24048d.getColumnNames();
        }

        public int getCount() {
            return this.f24048d.getCount();
        }

        public double getDouble(int i) {
            return this.f24048d.getDouble(i);
        }

        public Bundle getExtras() {
            return this.f24048d.getExtras();
        }

        public float getFloat(int i) {
            return this.f24048d.getFloat(i);
        }

        public int getInt(int i) {
            return this.f24048d.getInt(i);
        }

        public long getLong(int i) {
            return this.f24048d.getLong(i);
        }

        public Uri getNotificationUri() {
            return C8992c.m33284a(this.f24048d);
        }

        public List getNotificationUris() {
            return C8997h.m33290a(this.f24048d);
        }

        public int getPosition() {
            return this.f24048d.getPosition();
        }

        public short getShort(int i) {
            return this.f24048d.getShort(i);
        }

        public String getString(int i) {
            return this.f24048d.getString(i);
        }

        public int getType(int i) {
            return this.f24048d.getType(i);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.f24048d.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.f24048d.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.f24048d.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.f24048d.isClosed();
        }

        public boolean isFirst() {
            return this.f24048d.isFirst();
        }

        public boolean isLast() {
            return this.f24048d.isLast();
        }

        public boolean isNull(int i) {
            return this.f24048d.isNull(i);
        }

        public boolean move(int i) {
            return this.f24048d.move(i);
        }

        public boolean moveToFirst() {
            return this.f24048d.moveToFirst();
        }

        public boolean moveToLast() {
            return this.f24048d.moveToLast();
        }

        public boolean moveToNext() {
            return this.f24048d.moveToNext();
        }

        public boolean moveToPosition(int i) {
            return this.f24048d.moveToPosition(i);
        }

        public boolean moveToPrevious() {
            return this.f24048d.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.f24048d.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f24048d.registerDataSetObserver(dataSetObserver);
        }

        public boolean requery() {
            return this.f24048d.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.f24048d.respond(bundle);
        }

        public void setExtras(Bundle bundle) {
            C41536l.m120489i(bundle, "extras");
            C8994e.m33287a(this.f24048d, bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f24048d.setNotificationUri(contentResolver, uri);
        }

        public void setNotificationUris(ContentResolver contentResolver, List list) {
            C41536l.m120489i(contentResolver, "cr");
            C41536l.m120489i(list, "uris");
            C8997h.m33291b(this.f24048d, contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f24048d.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f24048d.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C8446d(C8999j jVar, C8443c cVar) {
        C41536l.m120489i(jVar, "delegate");
        C41536l.m120489i(cVar, "autoCloser");
        this.f24024d = jVar;
        this.f24025e = cVar;
        cVar.mo23639k(mo23644a());
        this.f24026f = new C8447a(cVar);
    }

    /* renamed from: Z0 */
    public C8998i mo23643Z0() {
        this.f24026f.mo23658a();
        return this.f24026f;
    }

    /* renamed from: a */
    public C8999j mo23644a() {
        return this.f24024d;
    }

    public void close() {
        this.f24026f.close();
    }

    public String getDatabaseName() {
        return this.f24024d.getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f24024d.setWriteAheadLoggingEnabled(z);
    }
}
