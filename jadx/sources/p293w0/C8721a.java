package p293w0;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import com.salesforce.marketingcloud.messages.iam.C11651j;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: w0.a */
public abstract class C8721a {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        se1.C42550b.m123187a(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.database.Cursor m32479a(android.database.Cursor r7) {
        /*
            java.lang.String r0 = "c"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            android.database.MatrixCursor r0 = new android.database.MatrixCursor     // Catch:{ all -> 0x006f }
            java.lang.String[] r1 = r7.getColumnNames()     // Catch:{ all -> 0x006f }
            int r2 = r7.getCount()     // Catch:{ all -> 0x006f }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x006f }
        L_0x0012:
            boolean r1 = r7.moveToNext()     // Catch:{ all -> 0x006f }
            r2 = 0
            if (r1 == 0) goto L_0x006b
            int r1 = r7.getColumnCount()     // Catch:{ all -> 0x006f }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x006f }
            int r3 = r7.getColumnCount()     // Catch:{ all -> 0x006f }
            r4 = 0
        L_0x0024:
            if (r4 >= r3) goto L_0x0067
            int r5 = r7.getType(r4)     // Catch:{ all -> 0x006f }
            if (r5 == 0) goto L_0x0062
            r6 = 1
            if (r5 == r6) goto L_0x0057
            r6 = 2
            if (r5 == r6) goto L_0x004c
            r6 = 3
            if (r5 == r6) goto L_0x0045
            r6 = 4
            if (r5 != r6) goto L_0x003f
            byte[] r5 = r7.getBlob(r4)     // Catch:{ all -> 0x006f }
            r1[r4] = r5     // Catch:{ all -> 0x006f }
            goto L_0x0064
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006f }
            r0.<init>()     // Catch:{ all -> 0x006f }
            throw r0     // Catch:{ all -> 0x006f }
        L_0x0045:
            java.lang.String r5 = r7.getString(r4)     // Catch:{ all -> 0x006f }
            r1[r4] = r5     // Catch:{ all -> 0x006f }
            goto L_0x0064
        L_0x004c:
            double r5 = r7.getDouble(r4)     // Catch:{ all -> 0x006f }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ all -> 0x006f }
            r1[r4] = r5     // Catch:{ all -> 0x006f }
            goto L_0x0064
        L_0x0057:
            long r5 = r7.getLong(r4)     // Catch:{ all -> 0x006f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x006f }
            r1[r4] = r5     // Catch:{ all -> 0x006f }
            goto L_0x0064
        L_0x0062:
            r1[r4] = r2     // Catch:{ all -> 0x006f }
        L_0x0064:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x0067:
            r0.addRow(r1)     // Catch:{ all -> 0x006f }
            goto L_0x0012
        L_0x006b:
            se1.C42550b.m123187a(r7, r2)
            return r0
        L_0x006f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            se1.C42550b.m123187a(r7, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p293w0.C8721a.m32479a(android.database.Cursor):android.database.Cursor");
    }

    /* renamed from: b */
    private static final int m32480b(Cursor cursor, String str) {
        boolean z;
        if (Build.VERSION.SDK_INT > 25) {
            return -1;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        C41536l.m120488h(columnNames, "columnNames");
        return m32481c(columnNames, str);
    }

    /* renamed from: c */
    public static final int m32481c(String[] strArr, String str) {
        C41536l.m120489i(strArr, "columnNames");
        C41536l.m120489i(str, "name");
        String str2 = '.' + str;
        String str3 = '.' + str + '`';
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str4 = strArr[i];
            int i3 = i2 + 1;
            if (str4.length() >= str.length() + 2) {
                if (C40439w.m117114r(str4, str2, false, 2, (Object) null)) {
                    return i2;
                }
                if (str4.charAt(0) == '`' && C40439w.m117114r(str4, str3, false, 2, (Object) null)) {
                    return i2;
                }
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    /* renamed from: d */
    public static final int m32482d(Cursor cursor, String str) {
        C41536l.m120489i(cursor, "c");
        C41536l.m120489i(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return m32480b(cursor, str);
    }

    /* renamed from: e */
    public static final int m32483e(Cursor cursor, String str) {
        String str2;
        C41536l.m120489i(cursor, "c");
        C41536l.m120489i(str, "name");
        int d = m32482d(cursor, str);
        if (d >= 0) {
            return d;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            C41536l.m120488h(columnNames, "c.columnNames");
            str2 = C41333m.m119782I(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 63, (Object) null);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = C11651j.f33767h;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
