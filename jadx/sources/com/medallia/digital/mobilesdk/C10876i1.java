package com.medallia.digital.mobilesdk;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.medallia.digital.mobilesdk.C10785e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.medallia.digital.mobilesdk.i1 */
class C10876i1 extends SQLiteOpenHelper implements C10769c8 {

    /* renamed from: b */
    private static final String f31195b = "MedalliaDigitalDB";

    /* renamed from: c */
    private static final int f31196c = C10878b.V15.ordinal();

    /* renamed from: d */
    private static C10876i1 f31197d = null;

    /* renamed from: e */
    private static final double f31198e = 10.0d;

    /* renamed from: a */
    private final HashMap<String, C10929k1> f31199a;

    /* renamed from: com.medallia.digital.mobilesdk.i1$a */
    static /* synthetic */ class C10877a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31200a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.medallia.digital.mobilesdk.e0$a[] r0 = com.medallia.digital.mobilesdk.C10785e0.C10786a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31200a = r0
                com.medallia.digital.mobilesdk.e0$a r1 = com.medallia.digital.mobilesdk.C10785e0.C10786a.UserJourneyData     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31200a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.e0$a r1 = com.medallia.digital.mobilesdk.C10785e0.C10786a.FormData     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31200a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.medallia.digital.mobilesdk.e0$a r1 = com.medallia.digital.mobilesdk.C10785e0.C10786a.Resource     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31200a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.medallia.digital.mobilesdk.e0$a r1 = com.medallia.digital.mobilesdk.C10785e0.C10786a.Template     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31200a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.medallia.digital.mobilesdk.e0$a r1 = com.medallia.digital.mobilesdk.C10785e0.C10786a.Feedback     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31200a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.medallia.digital.mobilesdk.e0$a r1 = com.medallia.digital.mobilesdk.C10785e0.C10786a.AnalyticsData     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31200a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.medallia.digital.mobilesdk.e0$a r1 = com.medallia.digital.mobilesdk.C10785e0.C10786a.MediaFeedback     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f31200a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.medallia.digital.mobilesdk.e0$a r1 = com.medallia.digital.mobilesdk.C10785e0.C10786a.WorkerManager     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f31200a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.medallia.digital.mobilesdk.e0$a r1 = com.medallia.digital.mobilesdk.C10785e0.C10786a.QuarantineRule     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10876i1.C10877a.<clinit>():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.i1$b */
    private enum C10878b {
        V0,
        V1,
        V2,
        V3,
        V4,
        V5,
        V6,
        V7,
        V8,
        V9,
        V10,
        V11,
        V12,
        V13,
        V14,
        V15
    }

    protected C10876i1() {
        super(C10884i4.m39721c().mo28483b(), f31195b, (SQLiteDatabase.CursorFactory) null, f31196c);
        HashMap<String, C10929k1> hashMap = new HashMap<>();
        this.f31199a = hashMap;
        hashMap.put(C10920j8.class.getSimpleName(), new C10920j8());
        hashMap.put(C11029o2.class.getSimpleName(), new C11029o2());
        hashMap.put(C10763c6.class.getSimpleName(), new C10763c6());
        hashMap.put(C10815f7.class.getSimpleName(), new C10815f7());
        hashMap.put(C10847h2.class.getSimpleName(), new C10847h2());
        hashMap.put(C10799f.class.getSimpleName(), new C10799f());
        hashMap.put(C11239z4.class.getSimpleName(), new C11239z4());
        hashMap.put(C11040o8.class.getSimpleName(), new C11040o8());
        hashMap.put(C11125u5.class.getSimpleName(), new C11125u5());
    }

    /* renamed from: a */
    public static C10876i1 m39698a() {
        if (f31197d == null && C10884i4.m39721c().mo28483b() != null) {
            f31197d = new C10876i1();
        }
        return f31197d;
    }

    /* renamed from: b */
    public double mo28466b() {
        return 1.048576E7d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public double mo28469c() {
        return C11064q1.m40586a(C10884i4.m39721c().mo28483b().getDatabasePath(f31195b).length());
    }

    public void clearAndDisconnect() {
        C10735b4.m39107a("Database");
        C10884i4.m39721c().mo28483b().deleteDatabase(f31195b);
        f31197d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo28473d() {
        return ((double) C10884i4.m39721c().mo28483b().getDatabasePath(f31195b).length()) > mo28466b();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (C10929k1 next : this.f31199a.values()) {
            m39701a(sQLiteDatabase, next.mo28233e(), next.mo28230d());
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < C10878b.V2.ordinal()) {
            m39699a(sQLiteDatabase, C10920j8.class);
        }
        if (i < C10878b.V3.ordinal()) {
            m39699a(sQLiteDatabase, C10815f7.class);
        }
        if (i < C10878b.V4.ordinal() || i < C10878b.V7.ordinal() || i < C10878b.V8.ordinal() || i < C10878b.V9.ordinal() || i < C10878b.V10.ordinal() || i < C10878b.V11.ordinal() || i < C10878b.V12.ordinal() || i < C10878b.V13.ordinal() || i < C10878b.V14.ordinal()) {
            m39699a(sQLiteDatabase, C11029o2.class);
        }
        if (i < C10878b.V5.ordinal()) {
            m39699a(sQLiteDatabase, C10763c6.class);
        }
        if (i < C10878b.V6.ordinal()) {
            m39699a(sQLiteDatabase, C10847h2.class);
        }
        if (i < C10878b.V9.ordinal()) {
            m39699a(sQLiteDatabase, C10799f.class);
        }
        if (i < C10878b.V11.ordinal()) {
            m39699a(sQLiteDatabase, C11239z4.class);
            m39699a(sQLiteDatabase, C11040o8.class);
        }
        if (i < C10878b.V15.ordinal()) {
            m39699a(sQLiteDatabase, C11125u5.class);
        }
    }

    /* renamed from: a */
    private void m39699a(SQLiteDatabase sQLiteDatabase, Class cls) {
        C10929k1 k1Var = this.f31199a.get(cls.getSimpleName());
        if (k1Var != null) {
            m39700a(sQLiteDatabase, k1Var.mo28233e());
            m39701a(sQLiteDatabase, k1Var.mo28233e(), k1Var.mo28230d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C10785e0 mo28467b(C10785e0.C10786a aVar, Object... objArr) {
        C10929k1<C10785e0> b;
        if (aVar == null || (b = m39702b(aVar)) == null) {
            return null;
        }
        return b.mo28224b(objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo28470c(C10785e0.C10786a aVar) {
        C10929k1<C10785e0> b;
        if (aVar == null || (b = m39702b(aVar)) == null) {
            return 0;
        }
        return b.mo28225c();
    }

    /* renamed from: a */
    private void m39700a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    /* renamed from: b */
    private C10929k1<C10785e0> m39702b(C10785e0.C10786a aVar) {
        HashMap<String, C10929k1> hashMap;
        Class cls;
        switch (C10877a.f31200a[aVar.ordinal()]) {
            case 1:
                hashMap = this.f31199a;
                cls = C10920j8.class;
                break;
            case 2:
                hashMap = this.f31199a;
                cls = C11029o2.class;
                break;
            case 3:
                hashMap = this.f31199a;
                cls = C10763c6.class;
                break;
            case 4:
                hashMap = this.f31199a;
                cls = C10815f7.class;
                break;
            case 5:
                hashMap = this.f31199a;
                cls = C10847h2.class;
                break;
            case 6:
                hashMap = this.f31199a;
                cls = C10799f.class;
                break;
            case 7:
                hashMap = this.f31199a;
                cls = C11239z4.class;
                break;
            case 8:
                hashMap = this.f31199a;
                cls = C11040o8.class;
                break;
            case 9:
                hashMap = this.f31199a;
                cls = C11125u5.class;
                break;
            default:
                return null;
        }
        return hashMap.get(cls.getSimpleName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ArrayList<? extends C10785e0> mo28471c(C10785e0.C10786a aVar, Object... objArr) {
        C10929k1<C10785e0> b;
        if (aVar == null || (b = m39702b(aVar)) == null) {
            return null;
        }
        return b.mo28226c(objArr);
    }

    /* renamed from: a */
    private void m39701a(SQLiteDatabase sQLiteDatabase, String str, HashMap<String, String> hashMap) {
        StringBuilder sb = new StringBuilder("CREATE TABLE " + str + " ( _id INTEGER PRIMARY KEY AUTOINCREMENT");
        for (Map.Entry next : hashMap.entrySet()) {
            sb.append(", ");
            sb.append((String) next.getKey());
            sb.append(" ");
            sb.append((String) next.getValue());
        }
        sb.append(" )");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo28468b(C10785e0 e0Var) {
        return (e0Var == null || e0Var.getDataTableObjectType() == null || m39702b(e0Var.getDataTableObjectType()) == null || !m39702b(e0Var.getDataTableObjectType()).mo28228c(e0Var)) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo28472c(C10785e0 e0Var) {
        return (e0Var == null || e0Var.getDataTableObjectType() == null || m39702b(e0Var.getDataTableObjectType()) == null || !m39702b(e0Var.getDataTableObjectType()).mo28232d(e0Var)) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28463a(C10785e0.C10786a aVar) {
        C10929k1<C10785e0> b;
        if (aVar == null || (b = m39702b(aVar)) == null) {
            return false;
        }
        return b.mo28624b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28464a(C10785e0.C10786a aVar, Object... objArr) {
        String str;
        if (aVar == null) {
            str = "Record: failed to clear";
        } else {
            C10929k1<C10785e0> b = m39702b(aVar);
            if (b == null) {
                str = aVar + " Record: failed to clear";
            } else {
                C10735b4.m39109b(aVar + " Record: cleared successfully");
                return b.mo28221a(objArr);
            }
        }
        C10735b4.m39114f(str);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28465a(C10785e0 e0Var) {
        C10785e0.C10786a dataTableObjectType;
        C10929k1<C10785e0> b;
        if (e0Var == null || (dataTableObjectType = e0Var.getDataTableObjectType()) == null || (b = m39702b(dataTableObjectType)) == null) {
            return false;
        }
        return b.mo28220a(e0Var);
    }
}
