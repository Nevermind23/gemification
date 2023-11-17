package com.salesforce.marketingcloud.storage.p385db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.storage.C11796h;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import com.salesforce.marketingcloud.util.C11808c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

@SuppressLint({"UnknownNullness", "Range"})
/* renamed from: com.salesforce.marketingcloud.storage.db.g */
public final class C11765g extends C11757b implements C11796h {

    /* renamed from: e */
    public static final String f34122e = "inbox_messages";

    /* renamed from: f */
    private static final String f34123f = "(start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?)";

    /* renamed from: g */
    static final String f34124g = C11461g.m41875a("InboxMessageDbStorage");

    /* renamed from: h */
    private static final String[] f34125h = {"id", C11769i.C11770a.f34145h, "is_deleted", "is_read", "message_hash", "is_dirty"};

    /* renamed from: com.salesforce.marketingcloud.storage.db.g$a */
    static /* synthetic */ class C11766a {

        /* renamed from: a */
        static final /* synthetic */ int[] f34126a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.salesforce.marketingcloud.storage.h$a[] r0 = com.salesforce.marketingcloud.storage.C11796h.C11797a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34126a = r0
                com.salesforce.marketingcloud.storage.h$a r1 = com.salesforce.marketingcloud.storage.C11796h.C11797a.READ     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34126a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.storage.h$a r1 = com.salesforce.marketingcloud.storage.C11796h.C11797a.UNREAD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34126a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.storage.h$a r1 = com.salesforce.marketingcloud.storage.C11796h.C11797a.DELETED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34126a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.salesforce.marketingcloud.storage.h$a r1 = com.salesforce.marketingcloud.storage.C11796h.C11797a.NOT_DELETED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.p385db.C11765g.C11766a.<clinit>():void");
        }
    }

    public C11765g(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    /* renamed from: c */
    private static String m42970c(C11796h.C11797a aVar) {
        String str;
        StringBuilder sb = new StringBuilder(101);
        sb.append(f34123f);
        int i = C11766a.f34126a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            str = " AND is_read=? AND is_deleted=?";
        } else if (i == 3 || i == 4) {
            str = " AND is_deleted=?";
        } else {
            throw new IllegalArgumentException("Unknown MessageStatus while getting message counts.");
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public int mo31546a(C11796h.C11797a aVar) {
        return (int) DatabaseUtils.queryNumEntries(this.f34110c, f34122e, m42970c(aVar), m42969b(aVar));
    }

    /* renamed from: b */
    public void mo31551b() {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("is_dirty", 1);
        contentValues.put("is_deleted", 1);
        String valueOf = String.valueOf(System.currentTimeMillis());
        mo31521a(contentValues, "(start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?) AND is_deleted=0", new String[]{valueOf, valueOf});
    }

    /* renamed from: d */
    public int mo31554d() {
        return mo31534i((String) null);
    }

    /* renamed from: e */
    public C11796h.C11798b mo31557e(String str) {
        Cursor a = mo31527a(f34125h, "id=?", new String[]{str});
        C11796h.C11798b bVar = null;
        if (a != null) {
            if (a.moveToFirst()) {
                bVar = m42965a(a);
            }
            a.close();
        }
        return bVar;
    }

    /* renamed from: g */
    public List<C11796h.C11798b> mo31558g() {
        ArrayList arrayList = null;
        Cursor a = mo31527a(f34125h, "is_dirty=1", (String[]) null);
        if (a != null) {
            if (a.moveToFirst()) {
                ArrayList arrayList2 = new ArrayList(a.getCount());
                do {
                    arrayList2.add(m42965a(a));
                } while (a.moveToNext());
                arrayList = arrayList2;
            }
            a.close();
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    /* renamed from: i */
    public List<InboxMessage> mo31559i(C11808c cVar) {
        return m42966a(mo31527a((String[]) null, (String) null, (String[]) null), cVar);
    }

    /* renamed from: j */
    public void mo31560j() {
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f34110c.execSQL("UPDATE inbox_messages SET   is_read = 1,  is_dirty = CASE WHEN is_dirty=1 OR is_deleted=0 THEN 1 ELSE 0 END WHERE (start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?) AND is_read=0", new String[]{valueOf, valueOf});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo31520p() {
        return f34122e;
    }

    /* renamed from: b */
    static void m42968b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE inbox_messages(id TEXT PRIMARY KEY, start_date INTEGER DEFAULT NULL, end_date INTEGER DEFAULT NULL, is_deleted INTEGER DEFAULT 0, is_read INTEGER DEFAULT 0, is_dirty INTEGER DEFAULT 0, message_hash TEXT DEFAULT NULL, message_json TEXT);");
    }

    /* renamed from: a */
    public int mo31547a(List<String> list) {
        if (list.size() == 0) {
            return mo31523a((String) null, (String[]) null);
        }
        try {
            return mo31522a(mo31520p(), (Collection<String>) list);
        } catch (Exception unused) {
            C11461g.m41894e(f34124g, "Unable to clean up %s table.", mo31520p());
            return 0;
        }
    }

    /* renamed from: c */
    public void mo31553c(String str) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f34110c.execSQL("UPDATE inbox_messages SET   is_read = 1,  is_dirty = CASE WHEN is_dirty=1 OR is_deleted=0 THEN 1 ELSE 0 END WHERE   id=? AND (start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?) AND is_read=0", new String[]{str, valueOf, valueOf});
    }

    /* renamed from: d */
    public void mo31555d(String[] strArr) {
        if (strArr.length > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_dirty", 0);
            try {
                mo31530a(contentValues, (Collection<String>) Arrays.asList(strArr));
            } catch (Exception unused) {
                C11461g.m41894e(f34124g, "Unable to update %s table.", mo31520p());
            }
        }
    }

    /* renamed from: c */
    private static boolean m42971c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,start_date,end_date,is_deleted,is_read,is_dirty,message_hash,message_json FROM inbox_messages");
            return true;
        } catch (Exception e) {
            C11461g.m41895e(f34124g, e, "%s is invalid", f34122e);
            return false;
        }
    }

    /* renamed from: d */
    static boolean m42972d(SQLiteDatabase sQLiteDatabase) {
        boolean c = m42971c(sQLiteDatabase);
        if (c) {
            return c;
        }
        try {
            m42967a(sQLiteDatabase);
            m42968b(sQLiteDatabase);
            return m42971c(sQLiteDatabase);
        } catch (Exception e) {
            C11461g.m41885b(f34124g, e, "Unable to recover %s", f34122e);
            return c;
        }
    }

    /* renamed from: a */
    public InboxMessage mo31548a(String str, C11808c cVar) {
        Cursor a = mo31529a((String[]) null, "id=?", new String[]{str}, (String) null, (String) null, (String) null, "1");
        InboxMessage inboxMessage = null;
        if (a != null) {
            if (a.moveToFirst()) {
                inboxMessage = C11759d.m42919a(a, cVar);
            }
            a.close();
        }
        return inboxMessage;
    }

    /* renamed from: b */
    public void mo31552b(String str) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("is_dirty", 1);
        contentValues.put("is_deleted", 1);
        String valueOf = String.valueOf(System.currentTimeMillis());
        mo31521a(contentValues, "id=? AND (start_date IS NULL OR start_date<?) AND (end_date IS NULL OR end_date>?) AND is_deleted=0", new String[]{str, valueOf, valueOf});
    }

    /* renamed from: a */
    private static C11796h.C11798b m42965a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(C11769i.C11770a.f34145h);
        return new C11796h.C11798b(cursor.getString(cursor.getColumnIndex("id")), cursor.getString(cursor.getColumnIndex("message_hash")), cursor.isNull(columnIndex) ? null : new Date(cursor.getLong(columnIndex)), cursor.getInt(cursor.getColumnIndex("is_read")) == 1, cursor.getInt(cursor.getColumnIndex("is_deleted")) == 1, cursor.getInt(cursor.getColumnIndex("is_dirty")) == 1);
    }

    /* renamed from: b */
    private static String[] m42969b(C11796h.C11797a aVar) {
        String[] strArr;
        String valueOf = String.valueOf(System.currentTimeMillis());
        int i = C11766a.f34126a[aVar.ordinal()];
        String str = "1";
        if (i == 1 || i == 2) {
            strArr = new String[4];
            strArr[0] = valueOf;
            strArr[1] = valueOf;
            if (aVar != C11796h.C11797a.READ) {
                str = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
            }
            strArr[2] = str;
            strArr[3] = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
        } else if (i == 3 || i == 4) {
            strArr = new String[3];
            strArr[0] = valueOf;
            strArr[1] = valueOf;
            if (aVar != C11796h.C11797a.DELETED) {
                str = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
            }
            strArr[2] = str;
        } else {
            throw new IllegalArgumentException("Unknown MessageStatus while getting message counts.");
        }
        return strArr;
    }

    /* renamed from: d */
    public boolean mo31556d(String str) {
        return DatabaseUtils.queryNumEntries(this.f34110c, f34122e, "id=?", new String[]{str}) > 0;
    }

    /* renamed from: a */
    private static List<InboxMessage> m42966a(Cursor cursor, C11808c cVar) {
        List<InboxMessage> emptyList = Collections.emptyList();
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                ArrayList arrayList = new ArrayList();
                do {
                    InboxMessage a = C11759d.m42919a(cursor, cVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } while (cursor.moveToNext());
                emptyList = arrayList;
            }
            cursor.close();
        }
        return emptyList;
    }

    /* renamed from: a */
    public List<InboxMessage> mo31549a(C11808c cVar, C11796h.C11797a aVar) {
        String c = m42970c(aVar);
        String[] b = m42969b(aVar);
        return m42966a(mo31528a((String[]) null, c, b, (String) null, (String) null, "IFNULL(start_date, " + System.currentTimeMillis() + ") DESC"), cVar);
    }

    /* renamed from: a */
    static void m42967a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS inbox_messages");
    }

    /* renamed from: a */
    public void mo31550a(InboxMessage inboxMessage, C11808c cVar) {
        ContentValues a = C11759d.m42917a(inboxMessage, cVar);
        if (mo31521a(a, "id = ?", new String[]{inboxMessage.mo30788id()}) == 0) {
            mo31524a(a);
        }
    }
}
