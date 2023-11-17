package com.salesforce.marketingcloud.storage.p385db;

import af1.C40296c;
import android.content.ContentValues;
import android.database.Cursor;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import com.salesforce.marketingcloud.util.C11808c;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

/* renamed from: com.salesforce.marketingcloud.storage.db.d */
public final class C11759d {

    /* renamed from: com.salesforce.marketingcloud.storage.db.d$a */
    static final class C11760a extends C41537m implements C43064a {

        /* renamed from: a */
        public static final C11760a f34111a = new C11760a();

        C11760a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to read InboxMessage from our local storage.";
        }
    }

    /* renamed from: com.salesforce.marketingcloud.storage.db.d$b */
    static final class C11761b extends C41537m implements C43064a {

        /* renamed from: a */
        public static final C11761b f34112a = new C11761b();

        C11761b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable to read region from DB";
        }
    }

    /* renamed from: com.salesforce.marketingcloud.storage.db.d$c */
    static final class C11762c extends C41537m implements C43064a {

        /* renamed from: a */
        public static final C11762c f34113a = new C11762c();

        C11762c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable to create ContentValues for InboxMessage.  Update failed";
        }
    }

    /* renamed from: a */
    public static final ContentValues m42917a(InboxMessage inboxMessage, C11808c cVar) {
        C41536l.m120489i(inboxMessage, "message");
        C41536l.m120489i(cVar, "crypto");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", inboxMessage.mo30788id());
            contentValues.put(C11769i.C11770a.f34145h, inboxMessage.startDateUtc() != null ? Long.valueOf(inboxMessage.startDateUtc().getTime()) : null);
            contentValues.put(C11769i.C11770a.f34146i, inboxMessage.endDateUtc() != null ? Long.valueOf(inboxMessage.endDateUtc().getTime()) : null);
            contentValues.put("is_read", Integer.valueOf(inboxMessage.read() ? 1 : 0));
            contentValues.put("is_deleted", Integer.valueOf(inboxMessage.deleted() ? 1 : 0));
            contentValues.put("message_hash", inboxMessage.m124977messageHash());
            contentValues.put("message_json", cVar.mo31645b(inboxMessage.toJson$sdk_release().toString()));
            if (inboxMessage.m124976dirty()) {
                contentValues.put("is_dirty", 1);
            }
            return contentValues;
        } catch (Exception e) {
            C11461g gVar = C11461g.f33306a;
            String str = C11765g.f34124g;
            C41536l.m120488h(str, "TAG");
            gVar.mo29962b(str, (Throwable) e, (C43064a) C11762c.f34113a);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x03da A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0464 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0577 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x057a A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0594 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x059b A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0606 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0609 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0623 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x062a A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0696 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0699 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x06b3 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x06ba A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0725 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0726 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0746 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x074d A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x07b8 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x07bb A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x07d5 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x07dc A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0847 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x084a A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0864 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0869 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x08ec A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x08f1 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0962 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0965 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x097f A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0984 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0a0d A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0a14 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0a7f A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0a80 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0a9b A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0aa0 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0b0d A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0b0f A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0b2a A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0b2f A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0b9c A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0b9e A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0bb9 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0bc0 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0c2b A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0c2d A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x0c48 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0c4f A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0cba A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x0cbb A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x0d21 A[Catch:{ Exception -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x0d31 A[Catch:{ Exception -> 0x0d79 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.salesforce.marketingcloud.messages.Message m42921b(android.database.Cursor r29, com.salesforce.marketingcloud.util.C11808c r30) {
        /*
            r0 = r29
            r1 = r30
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "cursor"
            kotlin.jvm.internal.C41536l.m120489i(r0, r4)
            java.lang.String r4 = "crypto"
            kotlin.jvm.internal.C41536l.m120489i(r1, r4)
            java.lang.String r5 = "id"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r8 = "Unsupported type"
            if (r7 == 0) goto L_0x002e
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0d79 }
        L_0x002c:
            r10 = r5
            goto L_0x0099
        L_0x002e:
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0045
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
        L_0x0042:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0d79 }
            goto L_0x002c
        L_0x0045:
            java.lang.Class r7 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x005a
            double r5 = r0.getDouble(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0042
        L_0x005a:
            java.lang.Class r7 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x006f
            float r5 = r0.getFloat(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0042
        L_0x006f:
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0084
            long r5 = r0.getLong(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0042
        L_0x0084:
            java.lang.Class r7 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0d73
            short r5 = r0.getShort(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r5 = java.lang.Short.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0042
        L_0x0099:
            java.lang.String r5 = "Required value was null."
            if (r10 == 0) goto L_0x0d69
            java.lang.String r6 = "title"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x00b6
            java.lang.String r6 = r0.getString(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0121
        L_0x00b6:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x00cd
            int r6 = r0.getInt(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
        L_0x00ca:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0121
        L_0x00cd:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x00e2
            double r6 = r0.getDouble(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x00ca
        L_0x00e2:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x00f7
            float r6 = r0.getFloat(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x00ca
        L_0x00f7:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x010c
            long r6 = r0.getLong(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x00ca
        L_0x010c:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0d63
            short r6 = r0.getShort(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r6 = java.lang.Short.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x00ca
        L_0x0121:
            java.lang.String r11 = r1.mo31644a(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r6 = "alert"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x013e
            java.lang.String r6 = r0.getString(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x01a9
        L_0x013e:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0155
            int r6 = r0.getInt(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
        L_0x0152:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0d79 }
            goto L_0x01a9
        L_0x0155:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x016a
            double r6 = r0.getDouble(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0152
        L_0x016a:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x017f
            float r6 = r0.getFloat(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0152
        L_0x017f:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0194
            long r6 = r0.getLong(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0152
        L_0x0194:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0d5d
            short r6 = r0.getShort(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r6 = java.lang.Short.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0152
        L_0x01a9:
            java.lang.String r12 = r1.mo31644a(r6)     // Catch:{ Exception -> 0x0d79 }
            if (r12 == 0) goto L_0x0d53
            java.lang.String r6 = "sound"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x01c9
            java.lang.String r6 = r0.getString(r6)     // Catch:{ Exception -> 0x0d79 }
        L_0x01c7:
            r13 = r6
            goto L_0x0234
        L_0x01c9:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x01e0
            int r6 = r0.getInt(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
        L_0x01dd:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0d79 }
            goto L_0x01c7
        L_0x01e0:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x01f5
            double r6 = r0.getDouble(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x01dd
        L_0x01f5:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x020a
            float r6 = r0.getFloat(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x01dd
        L_0x020a:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x021f
            long r6 = r0.getLong(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x01dd
        L_0x021f:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0d4d
            short r6 = r0.getShort(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r6 = java.lang.Short.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x01dd
        L_0x0234:
            com.salesforce.marketingcloud.messages.Message$Media r14 = m42918a((com.salesforce.marketingcloud.util.C11808c) r1, (android.database.Cursor) r0)     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r6 = "start_date"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0251
            java.lang.String r6 = r0.getString(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x02bc
        L_0x0251:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0268
            int r6 = r0.getInt(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
        L_0x0265:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0d79 }
            goto L_0x02bc
        L_0x0268:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x027d
            double r6 = r0.getDouble(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0265
        L_0x027d:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0292
            float r6 = r0.getFloat(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0265
        L_0x0292:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x02a7
            long r6 = r0.getLong(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0265
        L_0x02a7:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0d47
            short r6 = r0.getShort(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r6 = java.lang.Short.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0265
        L_0x02bc:
            if (r6 != 0) goto L_0x02c0
            r15 = 0
            goto L_0x02c5
        L_0x02c0:
            java.util.Date r6 = com.salesforce.marketingcloud.internal.C11516m.m42083a((java.lang.String) r6)     // Catch:{ Exception -> 0x0d79 }
            r15 = r6
        L_0x02c5:
            java.lang.String r6 = "end_date"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x02de
            java.lang.String r6 = r0.getString(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0349
        L_0x02de:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x02f5
            int r6 = r0.getInt(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
        L_0x02f2:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0349
        L_0x02f5:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x030a
            double r6 = r0.getDouble(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x02f2
        L_0x030a:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x031f
            float r6 = r0.getFloat(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x02f2
        L_0x031f:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0334
            long r6 = r0.getLong(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x02f2
        L_0x0334:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0d41
            short r6 = r0.getShort(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r6 = java.lang.Short.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x02f2
        L_0x0349:
            if (r6 != 0) goto L_0x034e
            r16 = 0
            goto L_0x0354
        L_0x034e:
            java.util.Date r6 = com.salesforce.marketingcloud.internal.C11516m.m42083a((java.lang.String) r6)     // Catch:{ Exception -> 0x0d79 }
            r16 = r6
        L_0x0354:
            java.lang.String r6 = "message_type"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x036f
            java.lang.String r6 = r0.getString(r6)     // Catch:{ Exception -> 0x0d79 }
        L_0x036c:
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x0d79 }
            goto L_0x03d8
        L_0x036f:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0384
            int r6 = r0.getInt(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x03d8
        L_0x0384:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0399
            double r6 = r0.getDouble(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x036c
        L_0x0399:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x03ae
            float r6 = r0.getFloat(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x036c
        L_0x03ae:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x03c3
            long r6 = r0.getLong(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x036c
        L_0x03c3:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0d3b
            short r6 = r0.getShort(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r6 = java.lang.Short.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x036c
        L_0x03d8:
            if (r6 == 0) goto L_0x0d31
            int r17 = r6.intValue()     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r6 = "content_type"
            int r6 = r0.getColumnIndex(r6)     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x03f9
            java.lang.String r6 = r0.getString(r6)     // Catch:{ Exception -> 0x0d79 }
        L_0x03f6:
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0462
        L_0x03f9:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x040e
            int r6 = r0.getInt(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0462
        L_0x040e:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0423
            double r6 = r0.getDouble(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x03f6
        L_0x0423:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0438
            float r6 = r0.getFloat(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x03f6
        L_0x0438:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x044d
            long r6 = r0.getLong(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x03f6
        L_0x044d:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0d2b
            short r6 = r0.getShort(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r6 = java.lang.Short.valueOf(r6)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x03f6
        L_0x0462:
            if (r6 == 0) goto L_0x0d21
            int r18 = r6.intValue()     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r5 = "url"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0481
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x04ec
        L_0x0481:
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0498
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
        L_0x0495:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0d79 }
            goto L_0x04ec
        L_0x0498:
            java.lang.Class r7 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x04ad
            double r5 = r0.getDouble(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0495
        L_0x04ad:
            java.lang.Class r7 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x04c2
            float r5 = r0.getFloat(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0495
        L_0x04c2:
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x04d7
            long r5 = r0.getLong(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0495
        L_0x04d7:
            java.lang.Class r7 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0d1b
            short r5 = r0.getShort(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r5 = java.lang.Short.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0495
        L_0x04ec:
            java.lang.String r19 = r1.mo31644a(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r5 = "messages_per_period"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x050b
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0d79 }
        L_0x0508:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0574
        L_0x050b:
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0520
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0574
        L_0x0520:
            java.lang.Class r7 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0535
            double r5 = r0.getDouble(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0508
        L_0x0535:
            java.lang.Class r7 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x054a
            float r5 = r0.getFloat(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0508
        L_0x054a:
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x055f
            long r5 = r0.getLong(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0508
        L_0x055f:
            java.lang.Class r7 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0d15
            short r5 = r0.getShort(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r5 = java.lang.Short.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0508
        L_0x0574:
            r6 = -1
            if (r5 != 0) goto L_0x057a
            r20 = r6
            goto L_0x0580
        L_0x057a:
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0d79 }
            r20 = r5
        L_0x0580:
            java.lang.String r5 = "number_of_periods"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x059b
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0d79 }
        L_0x0598:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0604
        L_0x059b:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x05b0
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0604
        L_0x05b0:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x05c5
            double r21 = r0.getDouble(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r5 = java.lang.Double.valueOf(r21)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0598
        L_0x05c5:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x05da
            float r5 = r0.getFloat(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0598
        L_0x05da:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x05ef
            long r21 = r0.getLong(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r5 = java.lang.Long.valueOf(r21)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0598
        L_0x05ef:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0d0f
            short r5 = r0.getShort(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r5 = java.lang.Short.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0598
        L_0x0604:
            if (r5 != 0) goto L_0x0609
            r21 = r6
            goto L_0x060f
        L_0x0609:
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0d79 }
            r21 = r5
        L_0x060f:
            java.lang.String r5 = "period_type"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0d79 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x062a
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0d79 }
        L_0x0627:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0693
        L_0x062a:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x063f
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0693
        L_0x063f:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0654
            double r22 = r0.getDouble(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r5 = java.lang.Double.valueOf(r22)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0627
        L_0x0654:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0669
            float r5 = r0.getFloat(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0627
        L_0x0669:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x067e
            long r22 = r0.getLong(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r5 = java.lang.Long.valueOf(r22)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0627
        L_0x067e:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r7 == 0) goto L_0x0d09
            short r5 = r0.getShort(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r5 = java.lang.Short.valueOf(r5)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0627
        L_0x0693:
            r7 = 0
            if (r5 != 0) goto L_0x0699
            r22 = r7
            goto L_0x069f
        L_0x0699:
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0d79 }
            r22 = r5
        L_0x069f:
            java.lang.String r5 = "rolling_period"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x0d79 }
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r9, r4)     // Catch:{ Exception -> 0x0d79 }
            if (r4 == 0) goto L_0x06ba
            java.lang.String r4 = r0.getString(r5)     // Catch:{ Exception -> 0x0d79 }
        L_0x06b7:
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0723
        L_0x06ba:
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r4)     // Catch:{ Exception -> 0x0d79 }
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r9, r4)     // Catch:{ Exception -> 0x0d79 }
            if (r4 == 0) goto L_0x06cf
            int r4 = r0.getInt(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0723
        L_0x06cf:
            java.lang.Class r4 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r4)     // Catch:{ Exception -> 0x0d79 }
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r9, r4)     // Catch:{ Exception -> 0x0d79 }
            if (r4 == 0) goto L_0x06e4
            double r4 = r0.getDouble(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x06b7
        L_0x06e4:
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r4)     // Catch:{ Exception -> 0x0d79 }
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r9, r4)     // Catch:{ Exception -> 0x0d79 }
            if (r4 == 0) goto L_0x06f9
            float r4 = r0.getFloat(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x06b7
        L_0x06f9:
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r4)     // Catch:{ Exception -> 0x0d79 }
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r9, r4)     // Catch:{ Exception -> 0x0d79 }
            if (r4 == 0) goto L_0x070e
            long r4 = r0.getLong(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x06b7
        L_0x070e:
            java.lang.Class r4 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r4)     // Catch:{ Exception -> 0x0d79 }
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r9, r4)     // Catch:{ Exception -> 0x0d79 }
            if (r4 == 0) goto L_0x0d03
            short r4 = r0.getShort(r5)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x06b7
        L_0x0723:
            if (r4 != 0) goto L_0x0726
            goto L_0x0730
        L_0x0726:
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0d79 }
            r5 = 1
            if (r4 != r5) goto L_0x0730
            r23 = r5
            goto L_0x0732
        L_0x0730:
            r23 = r7
        L_0x0732:
            java.lang.String r4 = "message_limit"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x0d79 }
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x074d
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x0d79 }
        L_0x074a:
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0d79 }
            goto L_0x07b6
        L_0x074d:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0762
            int r4 = r0.getInt(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x07b6
        L_0x0762:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0777
            double r4 = r0.getDouble(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x074a
        L_0x0777:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x078c
            float r4 = r0.getFloat(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x074a
        L_0x078c:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x07a1
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x074a
        L_0x07a1:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r5 == 0) goto L_0x0cfd
            short r4 = r0.getShort(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x074a
        L_0x07b6:
            if (r4 != 0) goto L_0x07bb
            r24 = r6
            goto L_0x07c1
        L_0x07bb:
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0d79 }
            r24 = r4
        L_0x07c1:
            java.lang.String r4 = "proximity"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x0d79 }
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x07dc
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x0d79 }
        L_0x07d9:
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0845
        L_0x07dc:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x07f1
            int r4 = r0.getInt(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0845
        L_0x07f1:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0806
            double r4 = r0.getDouble(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x07d9
        L_0x0806:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x081b
            float r4 = r0.getFloat(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x07d9
        L_0x081b:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0830
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x07d9
        L_0x0830:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r5 == 0) goto L_0x0cf7
            short r4 = r0.getShort(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x07d9
        L_0x0845:
            if (r4 != 0) goto L_0x084a
            r25 = r7
            goto L_0x0850
        L_0x084a:
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0d79 }
            r25 = r4
        L_0x0850:
            java.lang.String r4 = "open_direct"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x0d79 }
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0869
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x08d4
        L_0x0869:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0880
            int r4 = r0.getInt(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
        L_0x087d:
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0d79 }
            goto L_0x08d4
        L_0x0880:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0895
            double r4 = r0.getDouble(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x087d
        L_0x0895:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x08aa
            float r4 = r0.getFloat(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x087d
        L_0x08aa:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x08bf
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x087d
        L_0x08bf:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r5 == 0) goto L_0x0cf1
            short r4 = r0.getShort(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x087d
        L_0x08d4:
            java.lang.String r26 = r1.mo31644a(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r4 = "keys"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x0d79 }
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x08f1
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x095c
        L_0x08f1:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0908
            int r4 = r0.getInt(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
        L_0x0905:
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0d79 }
            goto L_0x095c
        L_0x0908:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x091d
            double r4 = r0.getDouble(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0905
        L_0x091d:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0932
            float r4 = r0.getFloat(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0905
        L_0x0932:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0947
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0905
        L_0x0947:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r5 == 0) goto L_0x0ceb
            short r4 = r0.getShort(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0905
        L_0x095c:
            java.lang.String r4 = r1.mo31644a(r4)     // Catch:{ Exception -> 0x0d79 }
            if (r4 != 0) goto L_0x0965
            r27 = 0
            goto L_0x096b
        L_0x0965:
            java.util.Map r4 = com.salesforce.marketingcloud.util.C11824l.m43294c((java.lang.String) r4)     // Catch:{ Exception -> 0x0d79 }
            r27 = r4
        L_0x096b:
            java.lang.String r4 = "custom"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x0d79 }
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0984
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x09ef
        L_0x0984:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x099b
            int r4 = r0.getInt(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
        L_0x0998:
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0d79 }
            goto L_0x09ef
        L_0x099b:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x09b0
            double r4 = r0.getDouble(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0998
        L_0x09b0:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x09c5
            float r4 = r0.getFloat(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0998
        L_0x09c5:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x09da
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0998
        L_0x09da:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r5 == 0) goto L_0x0ce5
            short r4 = r0.getShort(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0998
        L_0x09ef:
            java.lang.String r28 = r1.mo31644a(r4)     // Catch:{ Exception -> 0x0d79 }
            com.salesforce.marketingcloud.messages.Message r1 = new com.salesforce.marketingcloud.messages.Message     // Catch:{ Exception -> 0x0d79 }
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r4 = "notify_id"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x0d79 }
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0a14
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x0d79 }
        L_0x0a11:
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0a7d
        L_0x0a14:
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0a29
            int r4 = r0.getInt(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0a7d
        L_0x0a29:
            java.lang.Class r9 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0a3e
            double r4 = r0.getDouble(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0a11
        L_0x0a3e:
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0a53
            float r4 = r0.getFloat(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0a11
        L_0x0a53:
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r9 == 0) goto L_0x0a68
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0a11
        L_0x0a68:
            java.lang.Class r9 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r9)     // Catch:{ Exception -> 0x0d79 }
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r9)     // Catch:{ Exception -> 0x0d79 }
            if (r5 == 0) goto L_0x0cdf
            short r4 = r0.getShort(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0a11
        L_0x0a7d:
            if (r4 != 0) goto L_0x0a80
            goto L_0x0a84
        L_0x0a80:
            int r6 = r4.intValue()     // Catch:{ Exception -> 0x0d79 }
        L_0x0a84:
            r1.m124886notificationId(r6)     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r4 = "last_shown_date"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x0d79 }
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0aa0
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0b0b
        L_0x0aa0:
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0ab7
            int r4 = r0.getInt(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
        L_0x0ab4:
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0b0b
        L_0x0ab7:
            java.lang.Class r6 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0acc
            double r4 = r0.getDouble(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0ab4
        L_0x0acc:
            java.lang.Class r6 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0ae1
            float r4 = r0.getFloat(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0ab4
        L_0x0ae1:
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0af6
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0ab4
        L_0x0af6:
            java.lang.Class r6 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r5 == 0) goto L_0x0cd9
            short r4 = r0.getShort(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0ab4
        L_0x0b0b:
            if (r4 != 0) goto L_0x0b0f
            r4 = 0
            goto L_0x0b13
        L_0x0b0f:
            java.util.Date r4 = com.salesforce.marketingcloud.internal.C11516m.m42083a((java.lang.String) r4)     // Catch:{ Exception -> 0x0d79 }
        L_0x0b13:
            r1.m124882lastShownDate(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r4 = "next_allowed_show"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x0d79 }
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0b2f
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0b9a
        L_0x0b2f:
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0b46
            int r4 = r0.getInt(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
        L_0x0b43:
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0b9a
        L_0x0b46:
            java.lang.Class r6 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0b5b
            double r4 = r0.getDouble(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0b43
        L_0x0b5b:
            java.lang.Class r6 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0b70
            float r4 = r0.getFloat(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0b43
        L_0x0b70:
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0b85
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0b43
        L_0x0b85:
            java.lang.Class r6 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r5 == 0) goto L_0x0cd3
            short r4 = r0.getShort(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0b43
        L_0x0b9a:
            if (r4 != 0) goto L_0x0b9e
            r4 = 0
            goto L_0x0ba2
        L_0x0b9e:
            java.util.Date r4 = com.salesforce.marketingcloud.internal.C11516m.m42083a((java.lang.String) r4)     // Catch:{ Exception -> 0x0d79 }
        L_0x0ba2:
            r1.m124884nextAllowedShow(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r4 = "period_show_count"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x0d79 }
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0bc0
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x0d79 }
        L_0x0bbd:
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0c29
        L_0x0bc0:
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0bd5
            int r4 = r0.getInt(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0c29
        L_0x0bd5:
            java.lang.Class r6 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0bea
            double r4 = r0.getDouble(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0bbd
        L_0x0bea:
            java.lang.Class r6 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0bff
            float r4 = r0.getFloat(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0bbd
        L_0x0bff:
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r6 == 0) goto L_0x0c14
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0bbd
        L_0x0c14:
            java.lang.Class r6 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0d79 }
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0d79 }
            if (r5 == 0) goto L_0x0ccd
            short r4 = r0.getShort(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0bbd
        L_0x0c29:
            if (r4 != 0) goto L_0x0c2d
            r4 = r7
            goto L_0x0c31
        L_0x0c2d:
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0d79 }
        L_0x0c31:
            r1.m124888periodShowCount(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r4 = "show_count"
            int r4 = r0.getColumnIndex(r4)     // Catch:{ Exception -> 0x0d79 }
            af1.c r2 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x0d79 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)     // Catch:{ Exception -> 0x0d79 }
            if (r3 == 0) goto L_0x0c4f
            java.lang.String r0 = r0.getString(r4)     // Catch:{ Exception -> 0x0d79 }
        L_0x0c4c:
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0cb8
        L_0x0c4f:
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)     // Catch:{ Exception -> 0x0d79 }
            if (r3 == 0) goto L_0x0c64
            int r0 = r0.getInt(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0cb8
        L_0x0c64:
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)     // Catch:{ Exception -> 0x0d79 }
            if (r3 == 0) goto L_0x0c79
            double r2 = r0.getDouble(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0c4c
        L_0x0c79:
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)     // Catch:{ Exception -> 0x0d79 }
            if (r3 == 0) goto L_0x0c8e
            float r0 = r0.getFloat(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0c4c
        L_0x0c8e:
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)     // Catch:{ Exception -> 0x0d79 }
            if (r3 == 0) goto L_0x0ca3
            long r2 = r0.getLong(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0c4c
        L_0x0ca3:
            java.lang.Class r3 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0d79 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x0d79 }
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)     // Catch:{ Exception -> 0x0d79 }
            if (r2 == 0) goto L_0x0cc7
            short r0 = r0.getShort(r4)     // Catch:{ Exception -> 0x0d79 }
            java.lang.Short r0 = java.lang.Short.valueOf(r0)     // Catch:{ Exception -> 0x0d79 }
            goto L_0x0c4c
        L_0x0cb8:
            if (r0 != 0) goto L_0x0cbb
            goto L_0x0cbf
        L_0x0cbb:
            int r7 = r0.intValue()     // Catch:{ Exception -> 0x0d79 }
        L_0x0cbf:
            r1.m124890showCount(r7)     // Catch:{ Exception -> 0x0d79 }
            he1.w r0 = he1.C41238w.f97225a     // Catch:{ Exception -> 0x0d79 }
            r4 = r1
            goto L_0x0d7a
        L_0x0cc7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0ccd:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0cd3:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0cd9:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0cdf:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0ce5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0ceb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0cf1:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0cf7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0cfd:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d03:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d09:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d0f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d15:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d1b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d2b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d3b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d41:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d47:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d4d:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d53:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d5d:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d63:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d69:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0d79 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d73:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0d79 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0d79 }
            throw r0     // Catch:{ Exception -> 0x0d79 }
        L_0x0d79:
            r4 = 0
        L_0x0d7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.p385db.C11759d.m42921b(android.database.Cursor, com.salesforce.marketingcloud.util.c):com.salesforce.marketingcloud.messages.Message");
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x035a A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x035d A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0375 A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x037c A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03e7 A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03ea A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0402 A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0409 A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0474 A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x061d A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x061e A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0646 A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x066c A[Catch:{ Exception -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0246 A[Catch:{ Exception -> 0x06b0 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.salesforce.marketingcloud.messages.Region m42922c(android.database.Cursor r20, com.salesforce.marketingcloud.util.C11808c r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "cursor"
            kotlin.jvm.internal.C41536l.m120489i(r0, r4)
            java.lang.String r4 = "crypto"
            kotlin.jvm.internal.C41536l.m120489i(r1, r4)
            com.salesforce.marketingcloud.messages.Region r4 = new com.salesforce.marketingcloud.messages.Region     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r5 = "id"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x06b0 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r15 = "Unsupported type"
            if (r7 == 0) goto L_0x0030
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x06b0 }
        L_0x002e:
            r6 = r5
            goto L_0x009b
        L_0x0030:
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x06b0 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x06b0 }
            if (r7 == 0) goto L_0x0047
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x06b0 }
        L_0x0044:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x06b0 }
            goto L_0x002e
        L_0x0047:
            java.lang.Class r7 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x06b0 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x06b0 }
            if (r7 == 0) goto L_0x005c
            double r5 = r0.getDouble(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0044
        L_0x005c:
            java.lang.Class r7 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x06b0 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x06b0 }
            if (r7 == 0) goto L_0x0071
            float r5 = r0.getFloat(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0044
        L_0x0071:
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x06b0 }
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x06b0 }
            if (r7 == 0) goto L_0x0086
            long r5 = r0.getLong(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0044
        L_0x0086:
            java.lang.Class r7 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)     // Catch:{ Exception -> 0x06b0 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)     // Catch:{ Exception -> 0x06b0 }
            if (r6 == 0) goto L_0x06a9
            short r5 = r0.getShort(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Short r5 = java.lang.Short.valueOf(r5)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0044
        L_0x009b:
            java.lang.String r5 = "Required value was null."
            if (r6 == 0) goto L_0x069f
            com.salesforce.marketingcloud.location.LatLon r7 = new com.salesforce.marketingcloud.location.LatLon     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r8 = "latitude"
            int r8 = r0.getColumnIndex(r8)     // Catch:{ Exception -> 0x06b0 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)     // Catch:{ Exception -> 0x06b0 }
            if (r10 == 0) goto L_0x00ba
            java.lang.String r8 = r0.getString(r8)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0125
        L_0x00ba:
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)     // Catch:{ Exception -> 0x06b0 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)     // Catch:{ Exception -> 0x06b0 }
            if (r10 == 0) goto L_0x00d1
            int r8 = r0.getInt(r8)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x06b0 }
        L_0x00ce:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0125
        L_0x00d1:
            java.lang.Class r10 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)     // Catch:{ Exception -> 0x06b0 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)     // Catch:{ Exception -> 0x06b0 }
            if (r10 == 0) goto L_0x00e6
            double r8 = r0.getDouble(r8)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x00ce
        L_0x00e6:
            java.lang.Class r10 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)     // Catch:{ Exception -> 0x06b0 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)     // Catch:{ Exception -> 0x06b0 }
            if (r10 == 0) goto L_0x00fb
            float r8 = r0.getFloat(r8)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x00ce
        L_0x00fb:
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)     // Catch:{ Exception -> 0x06b0 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)     // Catch:{ Exception -> 0x06b0 }
            if (r10 == 0) goto L_0x0110
            long r8 = r0.getLong(r8)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x00ce
        L_0x0110:
            java.lang.Class r10 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)     // Catch:{ Exception -> 0x06b0 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)     // Catch:{ Exception -> 0x06b0 }
            if (r9 == 0) goto L_0x0698
            short r8 = r0.getShort(r8)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Short r8 = java.lang.Short.valueOf(r8)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x00ce
        L_0x0125:
            java.lang.String r8 = r1.mo31644a(r8)     // Catch:{ Exception -> 0x06b0 }
            if (r8 == 0) goto L_0x068e
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r10 = "longitude"
            int r10 = r0.getColumnIndex(r10)     // Catch:{ Exception -> 0x06b0 }
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ Exception -> 0x06b0 }
            if (r12 == 0) goto L_0x0148
            java.lang.String r10 = r0.getString(r10)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x01b3
        L_0x0148:
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r12)     // Catch:{ Exception -> 0x06b0 }
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ Exception -> 0x06b0 }
            if (r12 == 0) goto L_0x015f
            int r10 = r0.getInt(r10)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x06b0 }
        L_0x015c:
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x06b0 }
            goto L_0x01b3
        L_0x015f:
            java.lang.Class r12 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r12)     // Catch:{ Exception -> 0x06b0 }
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ Exception -> 0x06b0 }
            if (r12 == 0) goto L_0x0174
            double r10 = r0.getDouble(r10)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Double r10 = java.lang.Double.valueOf(r10)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x015c
        L_0x0174:
            java.lang.Class r12 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r12)     // Catch:{ Exception -> 0x06b0 }
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ Exception -> 0x06b0 }
            if (r12 == 0) goto L_0x0189
            float r10 = r0.getFloat(r10)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Float r10 = java.lang.Float.valueOf(r10)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x015c
        L_0x0189:
            java.lang.Class r12 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r12)     // Catch:{ Exception -> 0x06b0 }
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ Exception -> 0x06b0 }
            if (r12 == 0) goto L_0x019e
            long r10 = r0.getLong(r10)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x015c
        L_0x019e:
            java.lang.Class r12 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r12)     // Catch:{ Exception -> 0x06b0 }
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ Exception -> 0x06b0 }
            if (r11 == 0) goto L_0x0687
            short r10 = r0.getShort(r10)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Short r10 = java.lang.Short.valueOf(r10)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x015c
        L_0x01b3:
            java.lang.String r10 = r1.mo31644a(r10)     // Catch:{ Exception -> 0x06b0 }
            if (r10 == 0) goto L_0x067d
            double r10 = java.lang.Double.parseDouble(r10)     // Catch:{ Exception -> 0x06b0 }
            r7.<init>(r8, r10)     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r8 = "radius"
            int r8 = r0.getColumnIndex(r8)     // Catch:{ Exception -> 0x06b0 }
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)     // Catch:{ Exception -> 0x06b0 }
            if (r10 == 0) goto L_0x01db
            java.lang.String r8 = r0.getString(r8)     // Catch:{ Exception -> 0x06b0 }
        L_0x01d8:
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0244
        L_0x01db:
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)     // Catch:{ Exception -> 0x06b0 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)     // Catch:{ Exception -> 0x06b0 }
            if (r10 == 0) goto L_0x01f0
            int r8 = r0.getInt(r8)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0244
        L_0x01f0:
            java.lang.Class r10 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)     // Catch:{ Exception -> 0x06b0 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)     // Catch:{ Exception -> 0x06b0 }
            if (r10 == 0) goto L_0x0205
            double r8 = r0.getDouble(r8)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x01d8
        L_0x0205:
            java.lang.Class r10 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)     // Catch:{ Exception -> 0x06b0 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)     // Catch:{ Exception -> 0x06b0 }
            if (r10 == 0) goto L_0x021a
            float r8 = r0.getFloat(r8)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x01d8
        L_0x021a:
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)     // Catch:{ Exception -> 0x06b0 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)     // Catch:{ Exception -> 0x06b0 }
            if (r10 == 0) goto L_0x022f
            long r8 = r0.getLong(r8)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x01d8
        L_0x022f:
            java.lang.Class r10 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)     // Catch:{ Exception -> 0x06b0 }
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)     // Catch:{ Exception -> 0x06b0 }
            if (r9 == 0) goto L_0x0676
            short r8 = r0.getShort(r8)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Short r8 = java.lang.Short.valueOf(r8)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x01d8
        L_0x0244:
            if (r8 == 0) goto L_0x066c
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r9 = "beacon_guid"
            int r9 = r0.getColumnIndex(r9)     // Catch:{ Exception -> 0x06b0 }
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)     // Catch:{ Exception -> 0x06b0 }
            if (r11 == 0) goto L_0x0263
            java.lang.String r9 = r0.getString(r9)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x02ce
        L_0x0263:
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r11)     // Catch:{ Exception -> 0x06b0 }
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)     // Catch:{ Exception -> 0x06b0 }
            if (r11 == 0) goto L_0x027a
            int r9 = r0.getInt(r9)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x06b0 }
        L_0x0277:
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x06b0 }
            goto L_0x02ce
        L_0x027a:
            java.lang.Class r11 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r11)     // Catch:{ Exception -> 0x06b0 }
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)     // Catch:{ Exception -> 0x06b0 }
            if (r11 == 0) goto L_0x028f
            double r9 = r0.getDouble(r9)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0277
        L_0x028f:
            java.lang.Class r11 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r11)     // Catch:{ Exception -> 0x06b0 }
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)     // Catch:{ Exception -> 0x06b0 }
            if (r11 == 0) goto L_0x02a4
            float r9 = r0.getFloat(r9)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0277
        L_0x02a4:
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r11)     // Catch:{ Exception -> 0x06b0 }
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)     // Catch:{ Exception -> 0x06b0 }
            if (r11 == 0) goto L_0x02b9
            long r9 = r0.getLong(r9)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0277
        L_0x02b9:
            java.lang.Class r11 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r11)     // Catch:{ Exception -> 0x06b0 }
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)     // Catch:{ Exception -> 0x06b0 }
            if (r10 == 0) goto L_0x0665
            short r9 = r0.getShort(r9)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Short r9 = java.lang.Short.valueOf(r9)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0277
        L_0x02ce:
            java.lang.String r9 = r1.mo31644a(r9)     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r10 = "beacon_major"
            int r10 = r0.getColumnIndex(r10)     // Catch:{ Exception -> 0x06b0 }
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ Exception -> 0x06b0 }
            if (r12 == 0) goto L_0x02ed
            java.lang.String r10 = r0.getString(r10)     // Catch:{ Exception -> 0x06b0 }
        L_0x02ea:
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0356
        L_0x02ed:
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r12)     // Catch:{ Exception -> 0x06b0 }
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ Exception -> 0x06b0 }
            if (r12 == 0) goto L_0x0302
            int r10 = r0.getInt(r10)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0356
        L_0x0302:
            java.lang.Class r12 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r12)     // Catch:{ Exception -> 0x06b0 }
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ Exception -> 0x06b0 }
            if (r12 == 0) goto L_0x0317
            double r10 = r0.getDouble(r10)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Double r10 = java.lang.Double.valueOf(r10)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x02ea
        L_0x0317:
            java.lang.Class r12 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r12)     // Catch:{ Exception -> 0x06b0 }
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ Exception -> 0x06b0 }
            if (r12 == 0) goto L_0x032c
            float r10 = r0.getFloat(r10)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Float r10 = java.lang.Float.valueOf(r10)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x02ea
        L_0x032c:
            java.lang.Class r12 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r12)     // Catch:{ Exception -> 0x06b0 }
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ Exception -> 0x06b0 }
            if (r12 == 0) goto L_0x0341
            long r10 = r0.getLong(r10)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x02ea
        L_0x0341:
            java.lang.Class r12 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r12)     // Catch:{ Exception -> 0x06b0 }
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ Exception -> 0x06b0 }
            if (r11 == 0) goto L_0x065e
            short r10 = r0.getShort(r10)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Short r10 = java.lang.Short.valueOf(r10)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x02ea
        L_0x0356:
            r18 = 0
            if (r10 != 0) goto L_0x035d
            r10 = r18
            goto L_0x0361
        L_0x035d:
            int r10 = r10.intValue()     // Catch:{ Exception -> 0x06b0 }
        L_0x0361:
            java.lang.String r11 = "beacon_minor"
            int r11 = r0.getColumnIndex(r11)     // Catch:{ Exception -> 0x06b0 }
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x06b0 }
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)     // Catch:{ Exception -> 0x06b0 }
            if (r13 == 0) goto L_0x037c
            java.lang.String r11 = r0.getString(r11)     // Catch:{ Exception -> 0x06b0 }
        L_0x0379:
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ Exception -> 0x06b0 }
            goto L_0x03e5
        L_0x037c:
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r13)     // Catch:{ Exception -> 0x06b0 }
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)     // Catch:{ Exception -> 0x06b0 }
            if (r13 == 0) goto L_0x0391
            int r11 = r0.getInt(r11)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x03e5
        L_0x0391:
            java.lang.Class r13 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r13)     // Catch:{ Exception -> 0x06b0 }
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)     // Catch:{ Exception -> 0x06b0 }
            if (r13 == 0) goto L_0x03a6
            double r11 = r0.getDouble(r11)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0379
        L_0x03a6:
            java.lang.Class r13 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r13)     // Catch:{ Exception -> 0x06b0 }
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)     // Catch:{ Exception -> 0x06b0 }
            if (r13 == 0) goto L_0x03bb
            float r11 = r0.getFloat(r11)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0379
        L_0x03bb:
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r13)     // Catch:{ Exception -> 0x06b0 }
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)     // Catch:{ Exception -> 0x06b0 }
            if (r13 == 0) goto L_0x03d0
            long r11 = r0.getLong(r11)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0379
        L_0x03d0:
            java.lang.Class r13 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r13)     // Catch:{ Exception -> 0x06b0 }
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)     // Catch:{ Exception -> 0x06b0 }
            if (r12 == 0) goto L_0x0657
            short r11 = r0.getShort(r11)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Short r11 = java.lang.Short.valueOf(r11)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0379
        L_0x03e5:
            if (r11 != 0) goto L_0x03ea
            r11 = r18
            goto L_0x03ee
        L_0x03ea:
            int r11 = r11.intValue()     // Catch:{ Exception -> 0x06b0 }
        L_0x03ee:
            java.lang.String r12 = "location_type"
            int r12 = r0.getColumnIndex(r12)     // Catch:{ Exception -> 0x06b0 }
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)     // Catch:{ Exception -> 0x06b0 }
            if (r14 == 0) goto L_0x0409
            java.lang.String r12 = r0.getString(r12)     // Catch:{ Exception -> 0x06b0 }
        L_0x0406:
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0472
        L_0x0409:
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)     // Catch:{ Exception -> 0x06b0 }
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)     // Catch:{ Exception -> 0x06b0 }
            if (r14 == 0) goto L_0x041e
            int r12 = r0.getInt(r12)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0472
        L_0x041e:
            java.lang.Class r14 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)     // Catch:{ Exception -> 0x06b0 }
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)     // Catch:{ Exception -> 0x06b0 }
            if (r14 == 0) goto L_0x0433
            double r12 = r0.getDouble(r12)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Double r12 = java.lang.Double.valueOf(r12)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0406
        L_0x0433:
            java.lang.Class r14 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)     // Catch:{ Exception -> 0x06b0 }
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)     // Catch:{ Exception -> 0x06b0 }
            if (r14 == 0) goto L_0x0448
            float r12 = r0.getFloat(r12)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Float r12 = java.lang.Float.valueOf(r12)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0406
        L_0x0448:
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)     // Catch:{ Exception -> 0x06b0 }
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)     // Catch:{ Exception -> 0x06b0 }
            if (r14 == 0) goto L_0x045d
            long r12 = r0.getLong(r12)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0406
        L_0x045d:
            java.lang.Class r14 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)     // Catch:{ Exception -> 0x06b0 }
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)     // Catch:{ Exception -> 0x06b0 }
            if (r13 == 0) goto L_0x0650
            short r12 = r0.getShort(r12)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Short r12 = java.lang.Short.valueOf(r12)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0406
        L_0x0472:
            if (r12 == 0) goto L_0x0646
            int r12 = r12.intValue()     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r5 = "name"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x06b0 }
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)     // Catch:{ Exception -> 0x06b0 }
            if (r14 == 0) goto L_0x0491
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x04fc
        L_0x0491:
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)     // Catch:{ Exception -> 0x06b0 }
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)     // Catch:{ Exception -> 0x06b0 }
            if (r14 == 0) goto L_0x04a8
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x06b0 }
        L_0x04a5:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x06b0 }
            goto L_0x04fc
        L_0x04a8:
            java.lang.Class r14 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)     // Catch:{ Exception -> 0x06b0 }
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)     // Catch:{ Exception -> 0x06b0 }
            if (r14 == 0) goto L_0x04bd
            double r13 = r0.getDouble(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Double r5 = java.lang.Double.valueOf(r13)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x04a5
        L_0x04bd:
            java.lang.Class r14 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)     // Catch:{ Exception -> 0x06b0 }
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)     // Catch:{ Exception -> 0x06b0 }
            if (r14 == 0) goto L_0x04d2
            float r5 = r0.getFloat(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x04a5
        L_0x04d2:
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)     // Catch:{ Exception -> 0x06b0 }
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)     // Catch:{ Exception -> 0x06b0 }
            if (r14 == 0) goto L_0x04e7
            long r13 = r0.getLong(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Long r5 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x04a5
        L_0x04e7:
            java.lang.Class r14 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)     // Catch:{ Exception -> 0x06b0 }
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)     // Catch:{ Exception -> 0x06b0 }
            if (r13 == 0) goto L_0x063f
            short r5 = r0.getShort(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Short r5 = java.lang.Short.valueOf(r5)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x04a5
        L_0x04fc:
            java.lang.String r13 = r1.mo31644a(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r5 = "description"
            int r5 = r0.getColumnIndex(r5)     // Catch:{ Exception -> 0x06b0 }
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            r16 = r15
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)     // Catch:{ Exception -> 0x06b0 }
            if (r15 == 0) goto L_0x051b
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0586
        L_0x051b:
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)     // Catch:{ Exception -> 0x06b0 }
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)     // Catch:{ Exception -> 0x06b0 }
            if (r15 == 0) goto L_0x0532
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x06b0 }
        L_0x052f:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x06b0 }
            goto L_0x0586
        L_0x0532:
            java.lang.Class r15 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)     // Catch:{ Exception -> 0x06b0 }
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)     // Catch:{ Exception -> 0x06b0 }
            if (r15 == 0) goto L_0x0547
            double r14 = r0.getDouble(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Double r5 = java.lang.Double.valueOf(r14)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x052f
        L_0x0547:
            java.lang.Class r15 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)     // Catch:{ Exception -> 0x06b0 }
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)     // Catch:{ Exception -> 0x06b0 }
            if (r15 == 0) goto L_0x055c
            float r5 = r0.getFloat(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x052f
        L_0x055c:
            java.lang.Class r15 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)     // Catch:{ Exception -> 0x06b0 }
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)     // Catch:{ Exception -> 0x06b0 }
            if (r15 == 0) goto L_0x0571
            long r14 = r0.getLong(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Long r5 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x052f
        L_0x0571:
            java.lang.Class r15 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)     // Catch:{ Exception -> 0x06b0 }
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)     // Catch:{ Exception -> 0x06b0 }
            if (r14 == 0) goto L_0x0637
            short r5 = r0.getShort(r5)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Short r5 = java.lang.Short.valueOf(r5)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x052f
        L_0x0586:
            java.lang.String r14 = r1.mo31644a(r5)     // Catch:{ Exception -> 0x06b0 }
            r15 = 0
            r1 = 512(0x200, float:7.175E-43)
            r17 = 0
            r5 = r4
            r19 = r16
            r16 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r1 = "is_inside"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ Exception -> 0x06b0 }
            af1.c r2 = kotlin.jvm.internal.C41520a0.m120436b(r2)     // Catch:{ Exception -> 0x06b0 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)     // Catch:{ Exception -> 0x06b0 }
            if (r3 == 0) goto L_0x05b2
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x06b0 }
        L_0x05af:
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x06b0 }
            goto L_0x061b
        L_0x05b2:
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)     // Catch:{ Exception -> 0x06b0 }
            if (r3 == 0) goto L_0x05c7
            int r0 = r0.getInt(r1)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x061b
        L_0x05c7:
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)     // Catch:{ Exception -> 0x06b0 }
            if (r3 == 0) goto L_0x05dc
            double r0 = r0.getDouble(r1)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x05af
        L_0x05dc:
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)     // Catch:{ Exception -> 0x06b0 }
            if (r3 == 0) goto L_0x05f1
            float r0 = r0.getFloat(r1)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x05af
        L_0x05f1:
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)     // Catch:{ Exception -> 0x06b0 }
            if (r3 == 0) goto L_0x0606
            long r0 = r0.getLong(r1)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x05af
        L_0x0606:
            java.lang.Class r3 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x06b0 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)     // Catch:{ Exception -> 0x06b0 }
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)     // Catch:{ Exception -> 0x06b0 }
            if (r2 == 0) goto L_0x062f
            short r0 = r0.getShort(r1)     // Catch:{ Exception -> 0x06b0 }
            java.lang.Short r0 = java.lang.Short.valueOf(r0)     // Catch:{ Exception -> 0x06b0 }
            goto L_0x05af
        L_0x061b:
            if (r0 != 0) goto L_0x061e
            goto L_0x0626
        L_0x061e:
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x06b0 }
            r1 = 1
            if (r0 != r1) goto L_0x0626
            goto L_0x0628
        L_0x0626:
            r1 = r18
        L_0x0628:
            r4.m124904isInside(r1)     // Catch:{ Exception -> 0x06b0 }
            he1.w r0 = he1.C41238w.f97225a     // Catch:{ Exception -> 0x06b0 }
            goto L_0x06c0
        L_0x062f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x06b0 }
            r1 = r19
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x0637:
            r1 = r16
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x063f:
            r1 = r15
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x0646:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x0650:
            r1 = r15
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x0657:
            r1 = r15
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x065e:
            r1 = r15
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x0665:
            r1 = r15
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x066c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x0676:
            r1 = r15
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x067d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x0687:
            r1 = r15
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x068e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x0698:
            r1 = r15
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x069f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x06b0 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x06a9:
            r1 = r15
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x06b0 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x06b0 }
            throw r0     // Catch:{ Exception -> 0x06b0 }
        L_0x06b0:
            r0 = move-exception
            com.salesforce.marketingcloud.g r1 = com.salesforce.marketingcloud.C11461g.f33306a
            java.lang.String r2 = com.salesforce.marketingcloud.storage.p385db.C11771j.f34165g
            java.lang.String r3 = "TAG"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            com.salesforce.marketingcloud.storage.db.d$b r3 = com.salesforce.marketingcloud.storage.p385db.C11759d.C11761b.f34112a
            r1.mo29962b((java.lang.String) r2, (java.lang.Throwable) r0, (ue1.C43064a) r3)
            r4 = 0
        L_0x06c0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.p385db.C11759d.m42922c(android.database.Cursor, com.salesforce.marketingcloud.util.c):com.salesforce.marketingcloud.messages.Region");
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x061a  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0630  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x06a2  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0b0e  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x0b28  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0b7e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b4  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.salesforce.marketingcloud.registration.Registration m42923d(android.database.Cursor r28, com.salesforce.marketingcloud.util.C11808c r29) {
        /*
            r0 = r28
            r1 = r29
            java.lang.String r2 = "cursor"
            kotlin.jvm.internal.C41536l.m120489i(r0, r2)
            java.lang.String r2 = "crypto"
            kotlin.jvm.internal.C41536l.m120489i(r1, r2)
            com.salesforce.marketingcloud.registration.Registration r2 = new com.salesforce.marketingcloud.registration.Registration
            java.lang.String r3 = "id"
            int r3 = r0.getColumnIndex(r3)
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r4)
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r5, r7)
            java.lang.String r8 = "Unsupported type"
            if (r7 == 0) goto L_0x0031
            java.lang.String r3 = r0.getString(r3)
        L_0x002e:
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L_0x009a
        L_0x0031:
            java.lang.Class r7 = java.lang.Integer.TYPE
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r5, r7)
            if (r7 == 0) goto L_0x0046
            int r3 = r0.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x009a
        L_0x0046:
            java.lang.Class r7 = java.lang.Double.TYPE
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r5, r7)
            if (r7 == 0) goto L_0x005b
            double r9 = r0.getDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r9)
            goto L_0x002e
        L_0x005b:
            java.lang.Class r7 = java.lang.Float.TYPE
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r5, r7)
            if (r7 == 0) goto L_0x0070
            float r3 = r0.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x002e
        L_0x0070:
            java.lang.Class r7 = java.lang.Long.TYPE
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r5, r7)
            if (r7 == 0) goto L_0x0085
            long r9 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            goto L_0x002e
        L_0x0085:
            java.lang.Class r7 = java.lang.Short.TYPE
            af1.c r7 = kotlin.jvm.internal.C41520a0.m120436b(r7)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r7)
            if (r5 == 0) goto L_0x0b98
            short r3 = r0.getShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x002e
        L_0x009a:
            if (r3 != 0) goto L_0x009e
            r7 = 0
            goto L_0x00a3
        L_0x009e:
            int r3 = r3.intValue()
            r7 = r3
        L_0x00a3:
            java.lang.String r3 = "signed_string"
            int r3 = r0.getColumnIndex(r3)
            af1.c r9 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)
            if (r10 == 0) goto L_0x00bc
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0127
        L_0x00bc:
            java.lang.Class r10 = java.lang.Integer.TYPE
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)
            if (r10 == 0) goto L_0x00d3
            int r3 = r0.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x00d0:
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0127
        L_0x00d3:
            java.lang.Class r10 = java.lang.Double.TYPE
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)
            if (r10 == 0) goto L_0x00e8
            double r9 = r0.getDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r9)
            goto L_0x00d0
        L_0x00e8:
            java.lang.Class r10 = java.lang.Float.TYPE
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)
            if (r10 == 0) goto L_0x00fd
            float r3 = r0.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x00d0
        L_0x00fd:
            java.lang.Class r10 = java.lang.Long.TYPE
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)
            if (r10 == 0) goto L_0x0112
            long r9 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            goto L_0x00d0
        L_0x0112:
            java.lang.Class r10 = java.lang.Short.TYPE
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r10)
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)
            if (r9 == 0) goto L_0x0b91
            short r3 = r0.getShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x00d0
        L_0x0127:
            java.lang.String r9 = r1.mo31644a(r3)
            java.lang.String r3 = "device_id"
            int r3 = r0.getColumnIndex(r3)
            af1.c r10 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)
            if (r11 == 0) goto L_0x0145
            java.lang.String r3 = r0.getString(r3)
        L_0x0143:
            r10 = r3
            goto L_0x01b0
        L_0x0145:
            java.lang.Class r11 = java.lang.Integer.TYPE
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r11)
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)
            if (r11 == 0) goto L_0x015c
            int r3 = r0.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0159:
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0143
        L_0x015c:
            java.lang.Class r11 = java.lang.Double.TYPE
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r11)
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)
            if (r11 == 0) goto L_0x0171
            double r10 = r0.getDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r10)
            goto L_0x0159
        L_0x0171:
            java.lang.Class r11 = java.lang.Float.TYPE
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r11)
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)
            if (r11 == 0) goto L_0x0186
            float r3 = r0.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x0159
        L_0x0186:
            java.lang.Class r11 = java.lang.Long.TYPE
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r11)
            boolean r11 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)
            if (r11 == 0) goto L_0x019b
            long r10 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            goto L_0x0159
        L_0x019b:
            java.lang.Class r11 = java.lang.Short.TYPE
            af1.c r11 = kotlin.jvm.internal.C41520a0.m120436b(r11)
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)
            if (r10 == 0) goto L_0x0b8a
            short r3 = r0.getShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x0159
        L_0x01b0:
            java.lang.String r3 = "Required value was null."
            if (r10 == 0) goto L_0x0b7e
            java.lang.String r11 = "system_token"
            int r11 = r0.getColumnIndex(r11)
            af1.c r12 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)
            if (r13 == 0) goto L_0x01cd
            java.lang.String r11 = r0.getString(r11)
            goto L_0x0238
        L_0x01cd:
            java.lang.Class r13 = java.lang.Integer.TYPE
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r13)
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)
            if (r13 == 0) goto L_0x01e4
            int r11 = r0.getInt(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
        L_0x01e1:
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x0238
        L_0x01e4:
            java.lang.Class r13 = java.lang.Double.TYPE
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r13)
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)
            if (r13 == 0) goto L_0x01f9
            double r11 = r0.getDouble(r11)
            java.lang.Double r11 = java.lang.Double.valueOf(r11)
            goto L_0x01e1
        L_0x01f9:
            java.lang.Class r13 = java.lang.Float.TYPE
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r13)
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)
            if (r13 == 0) goto L_0x020e
            float r11 = r0.getFloat(r11)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            goto L_0x01e1
        L_0x020e:
            java.lang.Class r13 = java.lang.Long.TYPE
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r13)
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)
            if (r13 == 0) goto L_0x0223
            long r11 = r0.getLong(r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            goto L_0x01e1
        L_0x0223:
            java.lang.Class r13 = java.lang.Short.TYPE
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r13)
            boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r12, r13)
            if (r12 == 0) goto L_0x0b77
            short r11 = r0.getShort(r11)
            java.lang.Short r11 = java.lang.Short.valueOf(r11)
            goto L_0x01e1
        L_0x0238:
            java.lang.String r11 = r1.mo31644a(r11)
            java.lang.String r12 = "sdk_version"
            int r12 = r0.getColumnIndex(r12)
            af1.c r13 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)
            if (r14 == 0) goto L_0x0255
            java.lang.String r12 = r0.getString(r12)
            goto L_0x02c0
        L_0x0255:
            java.lang.Class r14 = java.lang.Integer.TYPE
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)
            if (r14 == 0) goto L_0x026c
            int r12 = r0.getInt(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
        L_0x0269:
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x02c0
        L_0x026c:
            java.lang.Class r14 = java.lang.Double.TYPE
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)
            if (r14 == 0) goto L_0x0281
            double r12 = r0.getDouble(r12)
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            goto L_0x0269
        L_0x0281:
            java.lang.Class r14 = java.lang.Float.TYPE
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)
            if (r14 == 0) goto L_0x0296
            float r12 = r0.getFloat(r12)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            goto L_0x0269
        L_0x0296:
            java.lang.Class r14 = java.lang.Long.TYPE
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)
            if (r14 == 0) goto L_0x02ab
            long r12 = r0.getLong(r12)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            goto L_0x0269
        L_0x02ab:
            java.lang.Class r14 = java.lang.Short.TYPE
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r14)
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r13, r14)
            if (r13 == 0) goto L_0x0b70
            short r12 = r0.getShort(r12)
            java.lang.Short r12 = java.lang.Short.valueOf(r12)
            goto L_0x0269
        L_0x02c0:
            if (r12 == 0) goto L_0x0b64
            java.lang.String r13 = "app_version"
            int r13 = r0.getColumnIndex(r13)
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x02db
            java.lang.String r13 = r0.getString(r13)
            goto L_0x0346
        L_0x02db:
            java.lang.Class r15 = java.lang.Integer.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x02f2
            int r13 = r0.getInt(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
        L_0x02ef:
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x0346
        L_0x02f2:
            java.lang.Class r15 = java.lang.Double.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x0307
            double r13 = r0.getDouble(r13)
            java.lang.Double r13 = java.lang.Double.valueOf(r13)
            goto L_0x02ef
        L_0x0307:
            java.lang.Class r15 = java.lang.Float.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x031c
            float r13 = r0.getFloat(r13)
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            goto L_0x02ef
        L_0x031c:
            java.lang.Class r15 = java.lang.Long.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r15 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r15 == 0) goto L_0x0331
            long r13 = r0.getLong(r13)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            goto L_0x02ef
        L_0x0331:
            java.lang.Class r15 = java.lang.Short.TYPE
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r15)
            boolean r14 = kotlin.jvm.internal.C41536l.m120484d(r14, r15)
            if (r14 == 0) goto L_0x0b5d
            short r13 = r0.getShort(r13)
            java.lang.Short r13 = java.lang.Short.valueOf(r13)
            goto L_0x02ef
        L_0x0346:
            if (r13 == 0) goto L_0x0b51
            java.lang.String r14 = "dst"
            int r14 = r0.getColumnIndex(r14)
            af1.c r15 = kotlin.jvm.internal.C41520a0.m120436b(r4)
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r15, r5)
            if (r5 == 0) goto L_0x0363
            java.lang.String r5 = r0.getString(r14)
        L_0x0360:
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L_0x03cc
        L_0x0363:
            java.lang.Class r5 = java.lang.Integer.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r15, r5)
            if (r5 == 0) goto L_0x0378
            int r5 = r0.getInt(r14)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x03cc
        L_0x0378:
            java.lang.Class r5 = java.lang.Double.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r15, r5)
            if (r5 == 0) goto L_0x038d
            double r14 = r0.getDouble(r14)
            java.lang.Double r5 = java.lang.Double.valueOf(r14)
            goto L_0x0360
        L_0x038d:
            java.lang.Class r5 = java.lang.Float.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r15, r5)
            if (r5 == 0) goto L_0x03a2
            float r5 = r0.getFloat(r14)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L_0x0360
        L_0x03a2:
            java.lang.Class r5 = java.lang.Long.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r15, r5)
            if (r5 == 0) goto L_0x03b7
            long r14 = r0.getLong(r14)
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            goto L_0x0360
        L_0x03b7:
            java.lang.Class r5 = java.lang.Short.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r15, r5)
            if (r5 == 0) goto L_0x0b4a
            short r5 = r0.getShort(r14)
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            goto L_0x0360
        L_0x03cc:
            r14 = 1
            if (r5 != 0) goto L_0x03d0
            goto L_0x03d8
        L_0x03d0:
            int r5 = r5.intValue()
            if (r5 != r14) goto L_0x03d8
            r15 = r14
            goto L_0x03d9
        L_0x03d8:
            r15 = 0
        L_0x03d9:
            java.lang.String r5 = "location_enabled"
            int r5 = r0.getColumnIndex(r5)
            af1.c r14 = kotlin.jvm.internal.C41520a0.m120436b(r4)
            r18 = r8
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r14, r8)
            if (r8 == 0) goto L_0x03f6
            java.lang.String r5 = r0.getString(r5)
        L_0x03f3:
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L_0x045f
        L_0x03f6:
            java.lang.Class r8 = java.lang.Integer.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r14, r8)
            if (r8 == 0) goto L_0x040b
            int r5 = r0.getInt(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x045f
        L_0x040b:
            java.lang.Class r8 = java.lang.Double.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r14, r8)
            if (r8 == 0) goto L_0x0420
            double r19 = r0.getDouble(r5)
            java.lang.Double r5 = java.lang.Double.valueOf(r19)
            goto L_0x03f3
        L_0x0420:
            java.lang.Class r8 = java.lang.Float.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r14, r8)
            if (r8 == 0) goto L_0x0435
            float r5 = r0.getFloat(r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L_0x03f3
        L_0x0435:
            java.lang.Class r8 = java.lang.Long.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r14, r8)
            if (r8 == 0) goto L_0x044a
            long r19 = r0.getLong(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r19)
            goto L_0x03f3
        L_0x044a:
            java.lang.Class r8 = java.lang.Short.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r14, r8)
            if (r8 == 0) goto L_0x0b42
            short r5 = r0.getShort(r5)
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            goto L_0x03f3
        L_0x045f:
            if (r5 != 0) goto L_0x0462
            goto L_0x046b
        L_0x0462:
            int r5 = r5.intValue()
            r8 = 1
            if (r5 != r8) goto L_0x046b
            r14 = 1
            goto L_0x046c
        L_0x046b:
            r14 = 0
        L_0x046c:
            java.lang.String r5 = "proximity_enabled"
            int r5 = r0.getColumnIndex(r5)
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r4)
            r19 = r3
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r8, r3)
            if (r3 == 0) goto L_0x0489
            java.lang.String r3 = r0.getString(r5)
        L_0x0486:
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L_0x04f2
        L_0x0489:
            java.lang.Class r3 = java.lang.Integer.TYPE
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r8, r3)
            if (r3 == 0) goto L_0x049e
            int r3 = r0.getInt(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x04f2
        L_0x049e:
            java.lang.Class r3 = java.lang.Double.TYPE
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r8, r3)
            if (r3 == 0) goto L_0x04b3
            double r20 = r0.getDouble(r5)
            java.lang.Double r3 = java.lang.Double.valueOf(r20)
            goto L_0x0486
        L_0x04b3:
            java.lang.Class r3 = java.lang.Float.TYPE
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r8, r3)
            if (r3 == 0) goto L_0x04c8
            float r3 = r0.getFloat(r5)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x0486
        L_0x04c8:
            java.lang.Class r3 = java.lang.Long.TYPE
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r8, r3)
            if (r3 == 0) goto L_0x04dd
            long r20 = r0.getLong(r5)
            java.lang.Long r3 = java.lang.Long.valueOf(r20)
            goto L_0x0486
        L_0x04dd:
            java.lang.Class r3 = java.lang.Short.TYPE
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r3)
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r8, r3)
            if (r3 == 0) goto L_0x0b3a
            short r3 = r0.getShort(r5)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x0486
        L_0x04f2:
            if (r3 != 0) goto L_0x04f5
            goto L_0x04ff
        L_0x04f5:
            int r3 = r3.intValue()
            r5 = 1
            if (r3 != r5) goto L_0x04ff
            r20 = 1
            goto L_0x0501
        L_0x04ff:
            r20 = 0
        L_0x0501:
            java.lang.String r3 = "platform_version"
            int r3 = r0.getColumnIndex(r3)
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r5, r8)
            if (r8 == 0) goto L_0x051c
            java.lang.String r3 = r0.getString(r3)
        L_0x0519:
            r21 = r3
            goto L_0x0587
        L_0x051c:
            java.lang.Class r8 = java.lang.Integer.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r5, r8)
            if (r8 == 0) goto L_0x0533
            int r3 = r0.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0530:
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0519
        L_0x0533:
            java.lang.Class r8 = java.lang.Double.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r5, r8)
            if (r8 == 0) goto L_0x0548
            double r21 = r0.getDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r21)
            goto L_0x0530
        L_0x0548:
            java.lang.Class r8 = java.lang.Float.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r5, r8)
            if (r8 == 0) goto L_0x055d
            float r3 = r0.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x0530
        L_0x055d:
            java.lang.Class r8 = java.lang.Long.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r5, r8)
            if (r8 == 0) goto L_0x0572
            long r21 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r21)
            goto L_0x0530
        L_0x0572:
            java.lang.Class r8 = java.lang.Short.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r8)
            if (r5 == 0) goto L_0x0b32
            short r3 = r0.getShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x0530
        L_0x0587:
            if (r21 == 0) goto L_0x0b28
            java.lang.String r3 = "push_enabled"
            int r3 = r0.getColumnIndex(r3)
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r4)
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r5, r8)
            if (r8 == 0) goto L_0x05a4
            java.lang.String r3 = r0.getString(r3)
        L_0x05a1:
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L_0x060d
        L_0x05a4:
            java.lang.Class r8 = java.lang.Integer.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r5, r8)
            if (r8 == 0) goto L_0x05b9
            int r3 = r0.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x060d
        L_0x05b9:
            java.lang.Class r8 = java.lang.Double.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r5, r8)
            if (r8 == 0) goto L_0x05ce
            double r22 = r0.getDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r22)
            goto L_0x05a1
        L_0x05ce:
            java.lang.Class r8 = java.lang.Float.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r5, r8)
            if (r8 == 0) goto L_0x05e3
            float r3 = r0.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x05a1
        L_0x05e3:
            java.lang.Class r8 = java.lang.Long.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r5, r8)
            if (r8 == 0) goto L_0x05f8
            long r22 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r22)
            goto L_0x05a1
        L_0x05f8:
            java.lang.Class r8 = java.lang.Short.TYPE
            af1.c r8 = kotlin.jvm.internal.C41520a0.m120436b(r8)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r8)
            if (r5 == 0) goto L_0x0b20
            short r3 = r0.getShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x05a1
        L_0x060d:
            if (r3 != 0) goto L_0x0610
            goto L_0x061a
        L_0x0610:
            int r3 = r3.intValue()
            r5 = 1
            if (r3 != r5) goto L_0x061a
            r16 = r5
            goto L_0x061c
        L_0x061a:
            r16 = 0
        L_0x061c:
            java.lang.String r3 = "timezone"
            int r3 = r0.getColumnIndex(r3)
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r4)
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0637
            java.lang.String r3 = r0.getString(r3)
        L_0x0634:
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L_0x06a0
        L_0x0637:
            java.lang.Class r5 = java.lang.Integer.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x064c
            int r3 = r0.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x06a0
        L_0x064c:
            java.lang.Class r5 = java.lang.Double.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0661
            double r3 = r0.getDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x0634
        L_0x0661:
            java.lang.Class r5 = java.lang.Float.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0676
            float r3 = r0.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x0634
        L_0x0676:
            java.lang.Class r5 = java.lang.Long.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x068b
            long r3 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0634
        L_0x068b:
            java.lang.Class r5 = java.lang.Short.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0b18
            short r3 = r0.getShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x0634
        L_0x06a0:
            if (r3 == 0) goto L_0x0b0e
            int r17 = r3.intValue()
            java.lang.String r3 = "subscriber_key"
            int r3 = r0.getColumnIndex(r3)
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x06bf
            java.lang.String r3 = r0.getString(r3)
            goto L_0x072a
        L_0x06bf:
            java.lang.Class r5 = java.lang.Integer.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x06d6
            int r3 = r0.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x06d3:
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x072a
        L_0x06d6:
            java.lang.Class r5 = java.lang.Double.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x06eb
            double r3 = r0.getDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x06d3
        L_0x06eb:
            java.lang.Class r5 = java.lang.Float.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0700
            float r3 = r0.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x06d3
        L_0x0700:
            java.lang.Class r5 = java.lang.Long.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0715
            long r3 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x06d3
        L_0x0715:
            java.lang.Class r5 = java.lang.Short.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0b06
            short r3 = r0.getShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x06d3
        L_0x072a:
            java.lang.String r23 = r1.mo31644a(r3)
            java.lang.String r3 = "platform"
            int r3 = r0.getColumnIndex(r3)
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0749
            java.lang.String r3 = r0.getString(r3)
        L_0x0746:
            r24 = r3
            goto L_0x07b4
        L_0x0749:
            java.lang.Class r5 = java.lang.Integer.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0760
            int r3 = r0.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x075d:
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0746
        L_0x0760:
            java.lang.Class r5 = java.lang.Double.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0775
            double r3 = r0.getDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x075d
        L_0x0775:
            java.lang.Class r5 = java.lang.Float.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x078a
            float r3 = r0.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x075d
        L_0x078a:
            java.lang.Class r5 = java.lang.Long.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x079f
            long r3 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x075d
        L_0x079f:
            java.lang.Class r5 = java.lang.Short.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0afe
            short r3 = r0.getShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x075d
        L_0x07b4:
            if (r24 == 0) goto L_0x0af4
            java.lang.String r3 = "hwid"
            int r3 = r0.getColumnIndex(r3)
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x07d1
            java.lang.String r3 = r0.getString(r3)
        L_0x07ce:
            r25 = r3
            goto L_0x083c
        L_0x07d1:
            java.lang.Class r5 = java.lang.Integer.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x07e8
            int r3 = r0.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x07e5:
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x07ce
        L_0x07e8:
            java.lang.Class r5 = java.lang.Double.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x07fd
            double r3 = r0.getDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x07e5
        L_0x07fd:
            java.lang.Class r5 = java.lang.Float.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0812
            float r3 = r0.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x07e5
        L_0x0812:
            java.lang.Class r5 = java.lang.Long.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0827
            long r3 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x07e5
        L_0x0827:
            java.lang.Class r5 = java.lang.Short.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0aec
            short r3 = r0.getShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x07e5
        L_0x083c:
            if (r25 == 0) goto L_0x0ae2
            java.lang.String r3 = "et_app_id"
            int r3 = r0.getColumnIndex(r3)
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0857
            java.lang.String r3 = r0.getString(r3)
            goto L_0x08c2
        L_0x0857:
            java.lang.Class r5 = java.lang.Integer.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x086e
            int r3 = r0.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x086b:
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x08c2
        L_0x086e:
            java.lang.Class r5 = java.lang.Double.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0883
            double r3 = r0.getDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x086b
        L_0x0883:
            java.lang.Class r5 = java.lang.Float.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0898
            float r3 = r0.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x086b
        L_0x0898:
            java.lang.Class r5 = java.lang.Long.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x08ad
            long r3 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x086b
        L_0x08ad:
            java.lang.Class r5 = java.lang.Short.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0ada
            short r3 = r0.getShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x086b
        L_0x08c2:
            java.lang.String r26 = r1.mo31644a(r3)
            if (r26 == 0) goto L_0x0ad0
            java.lang.String r3 = "locale"
            int r3 = r0.getColumnIndex(r3)
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x08e3
            java.lang.String r3 = r0.getString(r3)
        L_0x08e0:
            r27 = r3
            goto L_0x094e
        L_0x08e3:
            java.lang.Class r5 = java.lang.Integer.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x08fa
            int r3 = r0.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x08f7:
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x08e0
        L_0x08fa:
            java.lang.Class r5 = java.lang.Double.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x090f
            double r3 = r0.getDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x08f7
        L_0x090f:
            java.lang.Class r5 = java.lang.Float.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0924
            float r3 = r0.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x08f7
        L_0x0924:
            java.lang.Class r5 = java.lang.Long.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0939
            long r3 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x08f7
        L_0x0939:
            java.lang.Class r5 = java.lang.Short.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0ac8
            short r3 = r0.getShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x08f7
        L_0x094e:
            if (r27 == 0) goto L_0x0abe
            java.lang.String r3 = "tags"
            int r3 = r0.getColumnIndex(r3)
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0969
            java.lang.String r3 = r0.getString(r3)
            goto L_0x09d4
        L_0x0969:
            java.lang.Class r5 = java.lang.Integer.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0980
            int r3 = r0.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x097d:
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x09d4
        L_0x0980:
            java.lang.Class r5 = java.lang.Double.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0995
            double r3 = r0.getDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x097d
        L_0x0995:
            java.lang.Class r5 = java.lang.Float.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x09aa
            float r3 = r0.getFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x097d
        L_0x09aa:
            java.lang.Class r5 = java.lang.Long.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x09bf
            long r3 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x097d
        L_0x09bf:
            java.lang.Class r5 = java.lang.Short.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0ab6
            short r3 = r0.getShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            goto L_0x097d
        L_0x09d4:
            java.lang.String r3 = r1.mo31644a(r3)
            if (r3 == 0) goto L_0x0aac
            java.util.Set r8 = com.salesforce.marketingcloud.util.C11824l.m43297d(r3)
            java.lang.String r3 = "deserializeTags(checkNot…ationDbNames.ENC_TAGS))))"
            kotlin.jvm.internal.C41536l.m120488h(r8, r3)
            java.lang.String r3 = "attributes"
            int r3 = r0.getColumnIndex(r3)
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r6)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x09fc
            java.lang.String r0 = r0.getString(r3)
            goto L_0x0a67
        L_0x09fc:
            java.lang.Class r5 = java.lang.Integer.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0a13
            int r0 = r0.getInt(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0a10:
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0a67
        L_0x0a13:
            java.lang.Class r5 = java.lang.Double.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0a28
            double r3 = r0.getDouble(r3)
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            goto L_0x0a10
        L_0x0a28:
            java.lang.Class r5 = java.lang.Float.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0a3d
            float r0 = r0.getFloat(r3)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0a10
        L_0x0a3d:
            java.lang.Class r5 = java.lang.Long.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r5 == 0) goto L_0x0a52
            long r3 = r0.getLong(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto L_0x0a10
        L_0x0a52:
            java.lang.Class r5 = java.lang.Short.TYPE
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r5)
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
            if (r4 == 0) goto L_0x0aa4
            short r0 = r0.getShort(r3)
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            goto L_0x0a10
        L_0x0a67:
            java.lang.String r0 = r1.mo31644a(r0)
            if (r0 == 0) goto L_0x0a9a
            java.util.Map r0 = com.salesforce.marketingcloud.util.C11824l.m43294c((java.lang.String) r0)
            r22 = r0
            java.lang.String r1 = "deserializeKeys(checkNot…bNames.ENC_ATTRIBUTES))))"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r3 = r2
            r4 = r7
            r5 = r9
            r6 = r10
            r7 = r11
            r0 = r8
            r8 = r12
            r9 = r13
            r10 = r15
            r11 = r14
            r12 = r20
            r13 = r21
            r14 = r16
            r15 = r17
            r16 = r23
            r17 = r24
            r18 = r25
            r19 = r26
            r20 = r27
            r21 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r2
        L_0x0a9a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r19.toString()
            r0.<init>(r1)
            throw r0
        L_0x0aa4:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r18
            r0.<init>(r1)
            throw r0
        L_0x0aac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r19.toString()
            r0.<init>(r1)
            throw r0
        L_0x0ab6:
            r1 = r18
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0abe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r19.toString()
            r0.<init>(r1)
            throw r0
        L_0x0ac8:
            r1 = r18
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0ad0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r19.toString()
            r0.<init>(r1)
            throw r0
        L_0x0ada:
            r1 = r18
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0ae2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r19.toString()
            r0.<init>(r1)
            throw r0
        L_0x0aec:
            r1 = r18
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0af4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r19.toString()
            r0.<init>(r1)
            throw r0
        L_0x0afe:
            r1 = r18
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b06:
            r1 = r18
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b0e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r19.toString()
            r0.<init>(r1)
            throw r0
        L_0x0b18:
            r1 = r18
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b20:
            r1 = r18
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r19.toString()
            r0.<init>(r1)
            throw r0
        L_0x0b32:
            r1 = r18
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b3a:
            r1 = r18
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b42:
            r1 = r18
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b4a:
            r1 = r8
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b51:
            r19 = r3
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r19.toString()
            r0.<init>(r1)
            throw r0
        L_0x0b5d:
            r1 = r8
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b64:
            r19 = r3
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r19.toString()
            r0.<init>(r1)
            throw r0
        L_0x0b70:
            r1 = r8
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b77:
            r1 = r8
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b7e:
            r19 = r3
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r19.toString()
            r0.<init>(r1)
            throw r0
        L_0x0b8a:
            r1 = r8
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b91:
            r1 = r8
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0b98:
            r1 = r8
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.p385db.C11759d.m42923d(android.database.Cursor, com.salesforce.marketingcloud.util.c):com.salesforce.marketingcloud.registration.Registration");
    }

    /* renamed from: a */
    private static final Message.Media m42918a(C11808c cVar, Cursor cursor) {
        String str;
        String str2;
        Object valueOf;
        Object valueOf2;
        C41536l.m120489i(cVar, "$crypto");
        C41536l.m120489i(cursor, "$cursor");
        int columnIndex = cursor.getColumnIndex(C11769i.C11770a.f34142e);
        Class<String> cls = String.class;
        C40296c b = C41520a0.m120436b(cls);
        if (C41536l.m120484d(b, C41520a0.m120436b(cls))) {
            str = cursor.getString(columnIndex);
        } else {
            if (C41536l.m120484d(b, C41520a0.m120436b(Integer.TYPE))) {
                valueOf2 = Integer.valueOf(cursor.getInt(columnIndex));
            } else if (C41536l.m120484d(b, C41520a0.m120436b(Double.TYPE))) {
                valueOf2 = Double.valueOf(cursor.getDouble(columnIndex));
            } else if (C41536l.m120484d(b, C41520a0.m120436b(Float.TYPE))) {
                valueOf2 = Float.valueOf(cursor.getFloat(columnIndex));
            } else if (C41536l.m120484d(b, C41520a0.m120436b(Long.TYPE))) {
                valueOf2 = Long.valueOf(cursor.getLong(columnIndex));
            } else if (C41536l.m120484d(b, C41520a0.m120436b(Short.TYPE))) {
                valueOf2 = Short.valueOf(cursor.getShort(columnIndex));
            } else {
                throw new UnsupportedOperationException("Unsupported type");
            }
            str = (String) valueOf2;
        }
        String a = cVar.mo31644a(str);
        int columnIndex2 = cursor.getColumnIndex(C11769i.C11770a.f34143f);
        C40296c b2 = C41520a0.m120436b(cls);
        if (C41536l.m120484d(b2, C41520a0.m120436b(cls))) {
            str2 = cursor.getString(columnIndex2);
        } else {
            if (C41536l.m120484d(b2, C41520a0.m120436b(Integer.TYPE))) {
                valueOf = Integer.valueOf(cursor.getInt(columnIndex2));
            } else if (C41536l.m120484d(b2, C41520a0.m120436b(Double.TYPE))) {
                valueOf = Double.valueOf(cursor.getDouble(columnIndex2));
            } else if (C41536l.m120484d(b2, C41520a0.m120436b(Float.TYPE))) {
                valueOf = Float.valueOf(cursor.getFloat(columnIndex2));
            } else if (C41536l.m120484d(b2, C41520a0.m120436b(Long.TYPE))) {
                valueOf = Long.valueOf(cursor.getLong(columnIndex2));
            } else if (C41536l.m120484d(b2, C41520a0.m120436b(Short.TYPE))) {
                valueOf = Short.valueOf(cursor.getShort(columnIndex2));
            } else {
                throw new UnsupportedOperationException("Unsupported type");
            }
            str2 = (String) valueOf;
        }
        String a2 = cVar.mo31644a(str2);
        if (a == null && a2 == null) {
            return null;
        }
        return new Message.Media(a, a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x012c A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014d A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0154 A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01bf A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c0 A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e0 A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e7 A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0252 A[Catch:{ Exception -> 0x0282 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0253 A[Catch:{ Exception -> 0x0282 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.salesforce.marketingcloud.messages.inbox.InboxMessage m42919a(android.database.Cursor r8, com.salesforce.marketingcloud.util.C11808c r9) {
        /*
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r2 = "cursor"
            kotlin.jvm.internal.C41536l.m120489i(r8, r2)
            java.lang.String r2 = "crypto"
            kotlin.jvm.internal.C41536l.m120489i(r9, r2)
            com.salesforce.marketingcloud.messages.inbox.InboxMessage r2 = new com.salesforce.marketingcloud.messages.inbox.InboxMessage     // Catch:{ Exception -> 0x0282 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0282 }
            java.lang.String r4 = "message_json"
            int r4 = r8.getColumnIndex(r4)     // Catch:{ Exception -> 0x0282 }
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r1)     // Catch:{ Exception -> 0x0282 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r1)     // Catch:{ Exception -> 0x0282 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r7 = "Unsupported type"
            if (r6 == 0) goto L_0x002d
            java.lang.String r4 = r8.getString(r4)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0098
        L_0x002d:
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0282 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0282 }
            if (r6 == 0) goto L_0x0044
            int r4 = r8.getInt(r4)     // Catch:{ Exception -> 0x0282 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0282 }
        L_0x0041:
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0282 }
            goto L_0x0098
        L_0x0044:
            java.lang.Class r6 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0282 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0282 }
            if (r6 == 0) goto L_0x0059
            double r4 = r8.getDouble(r4)     // Catch:{ Exception -> 0x0282 }
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0041
        L_0x0059:
            java.lang.Class r6 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0282 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0282 }
            if (r6 == 0) goto L_0x006e
            float r4 = r8.getFloat(r4)     // Catch:{ Exception -> 0x0282 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0041
        L_0x006e:
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0282 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0282 }
            if (r6 == 0) goto L_0x0083
            long r4 = r8.getLong(r4)     // Catch:{ Exception -> 0x0282 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0041
        L_0x0083:
            java.lang.Class r6 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0282 }
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0282 }
            if (r5 == 0) goto L_0x027c
            short r4 = r8.getShort(r4)     // Catch:{ Exception -> 0x0282 }
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0041
        L_0x0098:
            java.lang.String r9 = r9.mo31644a(r4)     // Catch:{ Exception -> 0x0282 }
            if (r9 == 0) goto L_0x0270
            r3.<init>(r9)     // Catch:{ Exception -> 0x0282 }
            r2.<init>((org.json.JSONObject) r3)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r9 = "is_deleted"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ Exception -> 0x0282 }
            af1.c r3 = kotlin.jvm.internal.C41520a0.m120436b(r0)     // Catch:{ Exception -> 0x0282 }
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r1)     // Catch:{ Exception -> 0x0282 }
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)     // Catch:{ Exception -> 0x0282 }
            if (r4 == 0) goto L_0x00bf
            java.lang.String r9 = r8.getString(r9)     // Catch:{ Exception -> 0x0282 }
        L_0x00bc:
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Exception -> 0x0282 }
            goto L_0x0128
        L_0x00bf:
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r4)     // Catch:{ Exception -> 0x0282 }
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)     // Catch:{ Exception -> 0x0282 }
            if (r4 == 0) goto L_0x00d4
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0128
        L_0x00d4:
            java.lang.Class r4 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r4)     // Catch:{ Exception -> 0x0282 }
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)     // Catch:{ Exception -> 0x0282 }
            if (r4 == 0) goto L_0x00e9
            double r3 = r8.getDouble(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Double r9 = java.lang.Double.valueOf(r3)     // Catch:{ Exception -> 0x0282 }
            goto L_0x00bc
        L_0x00e9:
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r4)     // Catch:{ Exception -> 0x0282 }
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)     // Catch:{ Exception -> 0x0282 }
            if (r4 == 0) goto L_0x00fe
            float r9 = r8.getFloat(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch:{ Exception -> 0x0282 }
            goto L_0x00bc
        L_0x00fe:
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r4)     // Catch:{ Exception -> 0x0282 }
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)     // Catch:{ Exception -> 0x0282 }
            if (r4 == 0) goto L_0x0113
            long r3 = r8.getLong(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Long r9 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0282 }
            goto L_0x00bc
        L_0x0113:
            java.lang.Class r4 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r4 = kotlin.jvm.internal.C41520a0.m120436b(r4)     // Catch:{ Exception -> 0x0282 }
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)     // Catch:{ Exception -> 0x0282 }
            if (r3 == 0) goto L_0x026a
            short r9 = r8.getShort(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Short r9 = java.lang.Short.valueOf(r9)     // Catch:{ Exception -> 0x0282 }
            goto L_0x00bc
        L_0x0128:
            r3 = 0
            r4 = 1
            if (r9 != 0) goto L_0x012d
            goto L_0x0135
        L_0x012d:
            int r9 = r9.intValue()     // Catch:{ Exception -> 0x0282 }
            if (r9 != r4) goto L_0x0135
            r9 = r4
            goto L_0x0136
        L_0x0135:
            r9 = r3
        L_0x0136:
            r2.m124960deleted(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r9 = "is_read"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ Exception -> 0x0282 }
            af1.c r5 = kotlin.jvm.internal.C41520a0.m120436b(r0)     // Catch:{ Exception -> 0x0282 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r1)     // Catch:{ Exception -> 0x0282 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0282 }
            if (r6 == 0) goto L_0x0154
            java.lang.String r9 = r8.getString(r9)     // Catch:{ Exception -> 0x0282 }
        L_0x0151:
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Exception -> 0x0282 }
            goto L_0x01bd
        L_0x0154:
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0282 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0282 }
            if (r6 == 0) goto L_0x0169
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0282 }
            goto L_0x01bd
        L_0x0169:
            java.lang.Class r6 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0282 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0282 }
            if (r6 == 0) goto L_0x017e
            double r5 = r8.getDouble(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Double r9 = java.lang.Double.valueOf(r5)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0151
        L_0x017e:
            java.lang.Class r6 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0282 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0282 }
            if (r6 == 0) goto L_0x0193
            float r9 = r8.getFloat(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0151
        L_0x0193:
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0282 }
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0282 }
            if (r6 == 0) goto L_0x01a8
            long r5 = r8.getLong(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0151
        L_0x01a8:
            java.lang.Class r6 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r6 = kotlin.jvm.internal.C41520a0.m120436b(r6)     // Catch:{ Exception -> 0x0282 }
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)     // Catch:{ Exception -> 0x0282 }
            if (r5 == 0) goto L_0x0264
            short r9 = r8.getShort(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Short r9 = java.lang.Short.valueOf(r9)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0151
        L_0x01bd:
            if (r9 != 0) goto L_0x01c0
            goto L_0x01c8
        L_0x01c0:
            int r9 = r9.intValue()     // Catch:{ Exception -> 0x0282 }
            if (r9 != r4) goto L_0x01c8
            r9 = r4
            goto L_0x01c9
        L_0x01c8:
            r9 = r3
        L_0x01c9:
            r2.m124978read(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.String r9 = "is_dirty"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ Exception -> 0x0282 }
            af1.c r0 = kotlin.jvm.internal.C41520a0.m120436b(r0)     // Catch:{ Exception -> 0x0282 }
            af1.c r1 = kotlin.jvm.internal.C41520a0.m120436b(r1)     // Catch:{ Exception -> 0x0282 }
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)     // Catch:{ Exception -> 0x0282 }
            if (r1 == 0) goto L_0x01e7
            java.lang.String r8 = r8.getString(r9)     // Catch:{ Exception -> 0x0282 }
        L_0x01e4:
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x0282 }
            goto L_0x0250
        L_0x01e7:
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r1 = kotlin.jvm.internal.C41520a0.m120436b(r1)     // Catch:{ Exception -> 0x0282 }
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)     // Catch:{ Exception -> 0x0282 }
            if (r1 == 0) goto L_0x01fc
            int r8 = r8.getInt(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0250
        L_0x01fc:
            java.lang.Class r1 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r1 = kotlin.jvm.internal.C41520a0.m120436b(r1)     // Catch:{ Exception -> 0x0282 }
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)     // Catch:{ Exception -> 0x0282 }
            if (r1 == 0) goto L_0x0211
            double r8 = r8.getDouble(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ Exception -> 0x0282 }
            goto L_0x01e4
        L_0x0211:
            java.lang.Class r1 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r1 = kotlin.jvm.internal.C41520a0.m120436b(r1)     // Catch:{ Exception -> 0x0282 }
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)     // Catch:{ Exception -> 0x0282 }
            if (r1 == 0) goto L_0x0226
            float r8 = r8.getFloat(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch:{ Exception -> 0x0282 }
            goto L_0x01e4
        L_0x0226:
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r1 = kotlin.jvm.internal.C41520a0.m120436b(r1)     // Catch:{ Exception -> 0x0282 }
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)     // Catch:{ Exception -> 0x0282 }
            if (r1 == 0) goto L_0x023b
            long r8 = r8.getLong(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0282 }
            goto L_0x01e4
        L_0x023b:
            java.lang.Class r1 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x0282 }
            af1.c r1 = kotlin.jvm.internal.C41520a0.m120436b(r1)     // Catch:{ Exception -> 0x0282 }
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)     // Catch:{ Exception -> 0x0282 }
            if (r0 == 0) goto L_0x025e
            short r8 = r8.getShort(r9)     // Catch:{ Exception -> 0x0282 }
            java.lang.Short r8 = java.lang.Short.valueOf(r8)     // Catch:{ Exception -> 0x0282 }
            goto L_0x01e4
        L_0x0250:
            if (r8 != 0) goto L_0x0253
            goto L_0x025a
        L_0x0253:
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x0282 }
            if (r8 != r4) goto L_0x025a
            r3 = r4
        L_0x025a:
            r2.m124975dirty(r3)     // Catch:{ Exception -> 0x0282 }
            goto L_0x0292
        L_0x025e:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0282 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0282 }
            throw r8     // Catch:{ Exception -> 0x0282 }
        L_0x0264:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0282 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0282 }
            throw r8     // Catch:{ Exception -> 0x0282 }
        L_0x026a:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0282 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0282 }
            throw r8     // Catch:{ Exception -> 0x0282 }
        L_0x0270:
            java.lang.String r8 = "Required value was null."
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0282 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0282 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x0282 }
            throw r9     // Catch:{ Exception -> 0x0282 }
        L_0x027c:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0282 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0282 }
            throw r8     // Catch:{ Exception -> 0x0282 }
        L_0x0282:
            r8 = move-exception
            com.salesforce.marketingcloud.g r9 = com.salesforce.marketingcloud.C11461g.f33306a
            java.lang.String r0 = com.salesforce.marketingcloud.storage.p385db.C11765g.f34124g
            java.lang.String r1 = "TAG"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            com.salesforce.marketingcloud.storage.db.d$a r1 = com.salesforce.marketingcloud.storage.p385db.C11759d.C11760a.f34111a
            r9.mo29962b((java.lang.String) r0, (java.lang.Throwable) r8, (ue1.C43064a) r1)
            r2 = 0
        L_0x0292:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.storage.p385db.C11759d.m42919a(android.database.Cursor, com.salesforce.marketingcloud.util.c):com.salesforce.marketingcloud.messages.inbox.InboxMessage");
    }

    /* renamed from: a */
    private static final /* synthetic */ <T> T m42920a(Cursor cursor, String str) {
        T valueOf;
        int columnIndex = cursor.getColumnIndex(str);
        C41536l.m120494n(4, "T");
        C40296c b = C41520a0.m120436b(Object.class);
        if (C41536l.m120484d(b, C41520a0.m120436b(String.class))) {
            valueOf = cursor.getString(columnIndex);
        } else if (C41536l.m120484d(b, C41520a0.m120436b(Integer.TYPE))) {
            valueOf = Integer.valueOf(cursor.getInt(columnIndex));
        } else if (C41536l.m120484d(b, C41520a0.m120436b(Double.TYPE))) {
            valueOf = Double.valueOf(cursor.getDouble(columnIndex));
        } else if (C41536l.m120484d(b, C41520a0.m120436b(Float.TYPE))) {
            valueOf = Float.valueOf(cursor.getFloat(columnIndex));
        } else if (C41536l.m120484d(b, C41520a0.m120436b(Long.TYPE))) {
            valueOf = Long.valueOf(cursor.getLong(columnIndex));
        } else if (C41536l.m120484d(b, C41520a0.m120436b(Short.TYPE))) {
            valueOf = Short.valueOf(cursor.getShort(columnIndex));
        } else {
            throw new UnsupportedOperationException("Unsupported type");
        }
        C41536l.m120494n(1, "T?");
        return valueOf;
    }
}
