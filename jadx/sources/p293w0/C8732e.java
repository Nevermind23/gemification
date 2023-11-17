package p293w0;

import android.database.Cursor;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p293w0.C8724d;
import p318y0.C8998i;
import se1.C42550b;

/* renamed from: w0.e */
public abstract class C8732e {
    /* renamed from: a */
    private static final Map m32498a(C8998i iVar, String str) {
        Throwable th;
        boolean z;
        Cursor b1 = iVar.mo23659b1("PRAGMA table_info(`" + str + "`)");
        try {
            if (b1.getColumnCount() <= 0) {
                Map j = C41344r0.m119928j();
                C42550b.m123187a(b1, (Throwable) null);
                return j;
            }
            int columnIndex = b1.getColumnIndex("name");
            int columnIndex2 = b1.getColumnIndex("type");
            int columnIndex3 = b1.getColumnIndex("notnull");
            int columnIndex4 = b1.getColumnIndex("pk");
            int columnIndex5 = b1.getColumnIndex("dflt_value");
            Map d = C41342q0.m119919d();
            while (b1.moveToNext()) {
                String string = b1.getString(columnIndex);
                String string2 = b1.getString(columnIndex2);
                if (b1.getInt(columnIndex3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i = b1.getInt(columnIndex4);
                String string3 = b1.getString(columnIndex5);
                C41536l.m120488h(string, "name");
                C41536l.m120488h(string2, "type");
                C8724d.C8725a aVar = r11;
                C8724d.C8725a aVar2 = new C8724d.C8725a(string, string2, z, i, string3, 2);
                d.put(string, aVar);
            }
            Map c = C41342q0.m119918c(d);
            C42550b.m123187a(b1, (Throwable) null);
            return c;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            C42550b.m123187a(b1, th);
            throw th3;
        }
    }

    /* renamed from: b */
    private static final List m32499b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List c = C41339p.m119898c();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            C41536l.m120488h(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            C41536l.m120488h(string2, "cursor.getString(toColumnIndex)");
            c.add(new C8724d.C8729d(i, i2, string, string2));
        }
        return C41358y.m120029s0(C41339p.m119896a(c));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d5, code lost:
        se1.C42550b.m123187a(r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d8, code lost:
        throw r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.Set m32500c(p318y0.C8998i r13, java.lang.String r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA foreign_key_list(`"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = "`)"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            android.database.Cursor r13 = r13.mo23659b1(r14)
            java.lang.String r14 = "id"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "seq"
            int r0 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "table"
            int r1 = r13.getColumnIndex(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = "on_delete"
            int r2 = r13.getColumnIndex(r2)     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = "on_update"
            int r3 = r13.getColumnIndex(r3)     // Catch:{ all -> 0x00d2 }
            java.util.List r4 = m32499b(r13)     // Catch:{ all -> 0x00d2 }
            r5 = -1
            r13.moveToPosition(r5)     // Catch:{ all -> 0x00d2 }
            java.util.Set r5 = ie1.C41355w0.m119979b()     // Catch:{ all -> 0x00d2 }
        L_0x0044:
            boolean r6 = r13.moveToNext()     // Catch:{ all -> 0x00d2 }
            if (r6 == 0) goto L_0x00c9
            int r6 = r13.getInt(r0)     // Catch:{ all -> 0x00d2 }
            if (r6 == 0) goto L_0x0051
            goto L_0x0044
        L_0x0051:
            int r6 = r13.getInt(r14)     // Catch:{ all -> 0x00d2 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x00d2 }
            r11.<init>()     // Catch:{ all -> 0x00d2 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x00d2 }
            r12.<init>()     // Catch:{ all -> 0x00d2 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00d2 }
            r7.<init>()     // Catch:{ all -> 0x00d2 }
            java.util.Iterator r8 = r4.iterator()     // Catch:{ all -> 0x00d2 }
        L_0x0068:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r9 == 0) goto L_0x0084
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x00d2 }
            r10 = r9
            w0.d$d r10 = (p293w0.C8724d.C8729d) r10     // Catch:{ all -> 0x00d2 }
            int r10 = r10.mo24112c()     // Catch:{ all -> 0x00d2 }
            if (r10 != r6) goto L_0x007d
            r10 = 1
            goto L_0x007e
        L_0x007d:
            r10 = 0
        L_0x007e:
            if (r10 == 0) goto L_0x0068
            r7.add(r9)     // Catch:{ all -> 0x00d2 }
            goto L_0x0068
        L_0x0084:
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x00d2 }
        L_0x0088:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x00a3
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x00d2 }
            w0.d$d r7 = (p293w0.C8724d.C8729d) r7     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = r7.mo24111b()     // Catch:{ all -> 0x00d2 }
            r11.add(r8)     // Catch:{ all -> 0x00d2 }
            java.lang.String r7 = r7.mo24114e()     // Catch:{ all -> 0x00d2 }
            r12.add(r7)     // Catch:{ all -> 0x00d2 }
            goto L_0x0088
        L_0x00a3:
            w0.d$c r6 = new w0.d$c     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = r13.getString(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r7 = "cursor.getString(tableColumnIndex)"
            kotlin.jvm.internal.C41536l.m120488h(r8, r7)     // Catch:{ all -> 0x00d2 }
            java.lang.String r9 = r13.getString(r2)     // Catch:{ all -> 0x00d2 }
            java.lang.String r7 = "cursor.getString(onDeleteColumnIndex)"
            kotlin.jvm.internal.C41536l.m120488h(r9, r7)     // Catch:{ all -> 0x00d2 }
            java.lang.String r10 = r13.getString(r3)     // Catch:{ all -> 0x00d2 }
            java.lang.String r7 = "cursor.getString(onUpdateColumnIndex)"
            kotlin.jvm.internal.C41536l.m120488h(r10, r7)     // Catch:{ all -> 0x00d2 }
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00d2 }
            r5.add(r6)     // Catch:{ all -> 0x00d2 }
            goto L_0x0044
        L_0x00c9:
            java.util.Set r14 = ie1.C41355w0.m119978a(r5)     // Catch:{ all -> 0x00d2 }
            r0 = 0
            se1.C42550b.m123187a(r13, r0)
            return r14
        L_0x00d2:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r0 = move-exception
            se1.C42550b.m123187a(r13, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p293w0.C8732e.m32500c(y0.i, java.lang.String):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        se1.C42550b.m123187a(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        throw r14;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final p293w0.C8724d.C8730e m32501d(p318y0.C8998i r12, java.lang.String r13, boolean r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA index_xinfo(`"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = "`)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.database.Cursor r12 = r12.mo23659b1(r0)
            java.lang.String r0 = "seqno"
            int r0 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = "cid"
            int r1 = r12.getColumnIndex(r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r2 = "name"
            int r2 = r12.getColumnIndex(r2)     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "desc"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00a2 }
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x009e
            if (r1 == r5) goto L_0x009e
            if (r2 == r5) goto L_0x009e
            if (r3 != r5) goto L_0x003d
            goto L_0x009e
        L_0x003d:
            java.util.TreeMap r5 = new java.util.TreeMap     // Catch:{ all -> 0x00a2 }
            r5.<init>()     // Catch:{ all -> 0x00a2 }
            java.util.TreeMap r6 = new java.util.TreeMap     // Catch:{ all -> 0x00a2 }
            r6.<init>()     // Catch:{ all -> 0x00a2 }
        L_0x0047:
            boolean r7 = r12.moveToNext()     // Catch:{ all -> 0x00a2 }
            if (r7 == 0) goto L_0x007b
            int r7 = r12.getInt(r1)     // Catch:{ all -> 0x00a2 }
            if (r7 >= 0) goto L_0x0054
            goto L_0x0047
        L_0x0054:
            int r7 = r12.getInt(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.String r8 = r12.getString(r2)     // Catch:{ all -> 0x00a2 }
            int r9 = r12.getInt(r3)     // Catch:{ all -> 0x00a2 }
            if (r9 <= 0) goto L_0x0065
            java.lang.String r9 = "DESC"
            goto L_0x0067
        L_0x0065:
            java.lang.String r9 = "ASC"
        L_0x0067:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00a2 }
            java.lang.String r11 = "columnName"
            kotlin.jvm.internal.C41536l.m120488h(r8, r11)     // Catch:{ all -> 0x00a2 }
            r5.put(r10, r8)     // Catch:{ all -> 0x00a2 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00a2 }
            r6.put(r7, r9)     // Catch:{ all -> 0x00a2 }
            goto L_0x0047
        L_0x007b:
            java.util.Collection r0 = r5.values()     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = "columnsMap.values"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)     // Catch:{ all -> 0x00a2 }
            java.util.List r0 = ie1.C41358y.m120036z0(r0)     // Catch:{ all -> 0x00a2 }
            java.util.Collection r1 = r6.values()     // Catch:{ all -> 0x00a2 }
            java.lang.String r2 = "ordersMap.values"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)     // Catch:{ all -> 0x00a2 }
            java.util.List r1 = ie1.C41358y.m120036z0(r1)     // Catch:{ all -> 0x00a2 }
            w0.d$e r2 = new w0.d$e     // Catch:{ all -> 0x00a2 }
            r2.<init>(r13, r14, r0, r1)     // Catch:{ all -> 0x00a2 }
            se1.C42550b.m123187a(r12, r4)
            return r2
        L_0x009e:
            se1.C42550b.m123187a(r12, r4)
            return r4
        L_0x00a2:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r14 = move-exception
            se1.C42550b.m123187a(r12, r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p293w0.C8732e.m32501d(y0.i, java.lang.String, boolean):w0.d$e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        se1.C42550b.m123187a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        throw r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.Set m32502e(p318y0.C8998i r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "name"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "PRAGMA index_list(`"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = "`)"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.database.Cursor r10 = r9.mo23659b1(r10)
            int r1 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = "origin"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = "unique"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x0076 }
            r4 = -1
            r5 = 0
            if (r1 == r4) goto L_0x0072
            if (r2 == r4) goto L_0x0072
            if (r3 != r4) goto L_0x0035
            goto L_0x0072
        L_0x0035:
            java.util.Set r4 = ie1.C41355w0.m119979b()     // Catch:{ all -> 0x0076 }
        L_0x0039:
            boolean r6 = r10.moveToNext()     // Catch:{ all -> 0x0076 }
            if (r6 == 0) goto L_0x006a
            java.lang.String r6 = r10.getString(r2)     // Catch:{ all -> 0x0076 }
            java.lang.String r7 = "c"
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r7, r6)     // Catch:{ all -> 0x0076 }
            if (r6 != 0) goto L_0x004c
            goto L_0x0039
        L_0x004c:
            java.lang.String r6 = r10.getString(r1)     // Catch:{ all -> 0x0076 }
            int r7 = r10.getInt(r3)     // Catch:{ all -> 0x0076 }
            r8 = 1
            if (r7 != r8) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r8 = 0
        L_0x0059:
            kotlin.jvm.internal.C41536l.m120488h(r6, r0)     // Catch:{ all -> 0x0076 }
            w0.d$e r6 = m32501d(r9, r6, r8)     // Catch:{ all -> 0x0076 }
            if (r6 != 0) goto L_0x0066
            se1.C42550b.m123187a(r10, r5)
            return r5
        L_0x0066:
            r4.add(r6)     // Catch:{ all -> 0x0076 }
            goto L_0x0039
        L_0x006a:
            java.util.Set r9 = ie1.C41355w0.m119978a(r4)     // Catch:{ all -> 0x0076 }
            se1.C42550b.m123187a(r10, r5)
            return r9
        L_0x0072:
            se1.C42550b.m123187a(r10, r5)
            return r5
        L_0x0076:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            se1.C42550b.m123187a(r10, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p293w0.C8732e.m32502e(y0.i, java.lang.String):java.util.Set");
    }

    /* renamed from: f */
    public static final C8724d m32503f(C8998i iVar, String str) {
        C41536l.m120489i(iVar, "database");
        C41536l.m120489i(str, "tableName");
        return new C8724d(str, m32498a(iVar, str), m32500c(iVar, str), m32502e(iVar, str));
    }
}
