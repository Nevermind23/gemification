package com.salesforce.marketingcloud.storage.p385db.upgrades;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.C11461g;

@SuppressLint({"Range"})
/* renamed from: com.salesforce.marketingcloud.storage.db.upgrades.g */
public class C11784g {

    /* renamed from: a */
    private static final String f34208a = C11461g.m41875a("Version7ToVersion8");

    private C11784g() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070 A[SYNTHETIC, Splitter:B:29:0x0070] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m43086a(android.database.sqlite.SQLiteDatabase r8) {
        /*
            java.lang.String r0 = "id"
            r1 = 0
            r2 = 0
            java.lang.String r3 = "SELECT id,read,message_deleted FROM cloud_page_messages WHERE message_type=1"
            android.database.Cursor r3 = r8.rawQuery(r3, r1)     // Catch:{ Exception -> 0x0061 }
            if (r3 == 0) goto L_0x005f
            boolean r4 = r3.moveToFirst()     // Catch:{ Exception -> 0x0061 }
            if (r4 == 0) goto L_0x0058
        L_0x0012:
            r4 = 1
            java.lang.String r5 = "message_deleted"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x005d }
            int r5 = r3.getInt(r5)     // Catch:{ Exception -> 0x005d }
            r6 = -1
            if (r5 != r4) goto L_0x0022
            r5 = 2
            goto L_0x0031
        L_0x0022:
            java.lang.String r5 = "read"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x005d }
            int r5 = r3.getInt(r5)     // Catch:{ Exception -> 0x005d }
            if (r5 != r4) goto L_0x0030
            r5 = r4
            goto L_0x0031
        L_0x0030:
            r5 = r6
        L_0x0031:
            if (r5 == r6) goto L_0x0051
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ Exception -> 0x005d }
            r6.<init>()     // Catch:{ Exception -> 0x005d }
            int r7 = r3.getColumnIndex(r0)     // Catch:{ Exception -> 0x005d }
            java.lang.String r7 = r3.getString(r7)     // Catch:{ Exception -> 0x005d }
            r6.put(r0, r7)     // Catch:{ Exception -> 0x005d }
            java.lang.String r7 = "status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x005d }
            r6.put(r7, r5)     // Catch:{ Exception -> 0x005d }
            java.lang.String r5 = "inbox_message_status"
            r8.insert(r5, r1, r6)     // Catch:{ Exception -> 0x005d }
        L_0x0051:
            boolean r5 = r3.moveToNext()     // Catch:{ Exception -> 0x005d }
            if (r5 != 0) goto L_0x0012
            goto L_0x0059
        L_0x0058:
            r4 = r2
        L_0x0059:
            r3.close()     // Catch:{ Exception -> 0x005d }
            goto L_0x006c
        L_0x005d:
            r0 = move-exception
            goto L_0x0063
        L_0x005f:
            r4 = r2
            goto L_0x006c
        L_0x0061:
            r0 = move-exception
            r4 = r2
        L_0x0063:
            java.lang.String r3 = f34208a
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = "Unable to set inbox message statuses for legacy messages"
            com.salesforce.marketingcloud.C11461g.m41885b(r3, r0, r6, r5)
        L_0x006c:
            java.lang.String r0 = "DELETE FROM cloud_page_messages WHERE message_type=1"
            if (r4 == 0) goto L_0x009e
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ Exception -> 0x0086 }
            r3.<init>()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r4 = "message_type"
            r5 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0086 }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r4 = "cloud_page_messages"
            r8.update(r4, r3, r1, r1)     // Catch:{ Exception -> 0x0086 }
            goto L_0x009e
        L_0x0086:
            r3 = move-exception
            java.lang.String r4 = f34208a
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = "Unable to update message_type for legacy Inbox messages.  Attempting to delete them."
            com.salesforce.marketingcloud.C11461g.m41885b(r4, r3, r6, r5)
            r8.execSQL(r0, r1)     // Catch:{ Exception -> 0x0094 }
            goto L_0x009e
        L_0x0094:
            r3 = move-exception
            java.lang.String r4 = f34208a
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = "Unable to delete legacy Inbox messages."
            com.salesforce.marketingcloud.C11461g.m41885b(r4, r3, r6, r5)
        L_0x009e:
            r8.execSQL(r0, r1)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00ac
        L_0x00a2:
            r8 = move-exception
            java.lang.String r0 = f34208a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "Final attempt to delete legacy Inbox messages failed."
            com.salesforce.marketingcloud.C11461g.m41885b(r0, r8, r2, r1)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.p385db.upgrades.C11784g.m43086a(android.database.sqlite.SQLiteDatabase):void");
    }
}
