package com.salesforce.marketingcloud.messages;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.internal.C11503f;
import com.salesforce.marketingcloud.storage.C11801k;
import com.salesforce.marketingcloud.util.C11808c;
import java.util.Date;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.messages.b */
public final class C11604b {

    /* renamed from: a */
    private static final String f33666a = C11608d.f33672z;

    private C11604b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b9, code lost:
        if (r6 != 5) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m42347a(com.salesforce.marketingcloud.messages.Message r15, com.salesforce.marketingcloud.storage.C11800j r16) {
        /*
            r0 = r15
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            com.salesforce.marketingcloud.internal.C11503f.m42036a((com.salesforce.marketingcloud.messages.Message) r15, (java.util.Date) r1)
            int r2 = com.salesforce.marketingcloud.internal.C11503f.m42043e(r15)
            r3 = 1
            int r2 = r2 + r3
            com.salesforce.marketingcloud.internal.C11503f.m42041c(r15, r2)
            int r2 = m42350b(r15)
            r4 = 0
            r5 = -1
            if (r2 <= r5) goto L_0x00d4
            int r6 = r15.numberOfPeriods()
            if (r6 <= r5) goto L_0x00d4
            int r6 = r15.periodType()
            if (r6 == 0) goto L_0x00d4
            int r6 = com.salesforce.marketingcloud.internal.C11503f.m42042d(r15)
            int r6 = r6 + r3
            com.salesforce.marketingcloud.internal.C11503f.m42038b((com.salesforce.marketingcloud.messages.Message) r15, (int) r6)
            int r6 = com.salesforce.marketingcloud.internal.C11503f.m42042d(r15)
            int r7 = r15.messagesPerPeriod()
            if (r6 < r7) goto L_0x00d4
            int r6 = r15.periodType()
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 5
            if (r6 == r3) goto L_0x0065
            if (r6 == r9) goto L_0x005a
            if (r6 == r8) goto L_0x0055
            r11 = 1
            if (r6 == r7) goto L_0x0052
            if (r6 == r10) goto L_0x004f
            r11 = 0
            goto L_0x0075
        L_0x004f:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.HOURS
            goto L_0x0071
        L_0x0052:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS
            goto L_0x0071
        L_0x0055:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS
            r11 = 7
            goto L_0x0071
        L_0x005a:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            int r11 = r11.getActualMaximum(r10)
            goto L_0x0070
        L_0x0065:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            r12 = 6
            int r11 = r11.getActualMaximum(r12)
        L_0x0070:
            long r11 = (long) r11
        L_0x0071:
            long r11 = r6.toMillis(r11)
        L_0x0075:
            java.util.Date r6 = new java.util.Date
            long r13 = r1.getTime()
            int r1 = r15.numberOfPeriods()
            long r7 = (long) r1
            long r7 = r7 * r11
            long r13 = r13 + r7
            r6.<init>(r13)
            com.salesforce.marketingcloud.internal.C11503f.m42039b((com.salesforce.marketingcloud.messages.Message) r15, (java.util.Date) r6)
            boolean r1 = r15.isRollingPeriod()
            if (r1 != 0) goto L_0x00d4
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            java.util.Date r6 = com.salesforce.marketingcloud.internal.C11503f.m42037b(r15)
            long r6 = r6.getTime()
            r1.setTimeInMillis(r6)
            r6 = 14
            r1.set(r6, r4)
            r6 = 13
            r1.set(r6, r4)
            int r6 = r15.periodType()
            r7 = 10
            r8 = 12
            if (r6 == r3) goto L_0x00c1
            if (r6 == r9) goto L_0x00c4
            r9 = 3
            if (r6 == r9) goto L_0x00bc
            r9 = 4
            if (r6 == r9) goto L_0x00c7
            if (r6 == r10) goto L_0x00ca
            goto L_0x00cd
        L_0x00bc:
            r6 = 7
            r1.set(r6, r3)
            goto L_0x00c7
        L_0x00c1:
            r1.set(r9, r4)
        L_0x00c4:
            r1.set(r10, r3)
        L_0x00c7:
            r1.set(r7, r4)
        L_0x00ca:
            r1.set(r8, r4)
        L_0x00cd:
            java.util.Date r1 = r1.getTime()
            com.salesforce.marketingcloud.internal.C11503f.m42039b((com.salesforce.marketingcloud.messages.Message) r15, (java.util.Date) r1)
        L_0x00d4:
            int r1 = com.salesforce.marketingcloud.internal.C11503f.m42042d(r15)
            if (r1 <= r5) goto L_0x00e5
            if (r2 <= r5) goto L_0x00e5
            int r1 = com.salesforce.marketingcloud.internal.C11503f.m42042d(r15)
            if (r1 <= r2) goto L_0x00e5
            com.salesforce.marketingcloud.internal.C11503f.m42038b((com.salesforce.marketingcloud.messages.Message) r15, (int) r4)
        L_0x00e5:
            com.salesforce.marketingcloud.storage.k r1 = r16.mo31622s()
            com.salesforce.marketingcloud.util.c r2 = r16.mo31604b()
            r1.mo31567a((com.salesforce.marketingcloud.messages.Message) r15, (com.salesforce.marketingcloud.util.C11808c) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.C11604b.m42347a(com.salesforce.marketingcloud.messages.Message, com.salesforce.marketingcloud.storage.j):void");
    }

    /* renamed from: b */
    private static int m42350b(Message message) {
        int messagesPerPeriod = message.messagesPerPeriod();
        if (messagesPerPeriod > 0 || message.numberOfPeriods() <= 0 || message.periodType() == 0) {
            return messagesPerPeriod;
        }
        return 1;
    }

    /* renamed from: c */
    static boolean m42351c(Message message) {
        try {
            if (TextUtils.isEmpty(message.alert().trim())) {
                C11461g.m41880a(f33666a, "Message (%s) was tripped, but does not have an alert message", message.mo30330id());
                return false;
            }
            Date date = new Date();
            if (message.endDateUtc() != null && message.endDateUtc().before(date)) {
                C11461g.m41880a(f33666a, "Message (%s) was tripped, but has expired.", message.mo30330id());
                return false;
            } else if (message.startDateUtc() != null && message.startDateUtc().after(date)) {
                C11461g.m41880a(f33666a, "Message (%s) was tripped, but has not started", message.mo30330id());
                return false;
            } else if (message.messageLimit() <= -1 || C11503f.m42043e(message) < message.messageLimit()) {
                int b = m42350b(message);
                if (b > -1 && C11503f.m42042d(message) >= b && C11503f.m42037b(message) != null && date.before(C11503f.m42037b(message))) {
                    C11461g.m41880a(f33666a, "Message (%s) was tripped, but has met its message per period limit", message.mo30330id());
                    return false;
                } else if (C11503f.m42037b(message) == null || !date.before(C11503f.m42037b(message))) {
                    return true;
                } else {
                    C11461g.m41880a(f33666a, "Message (%s) was tripped, but was before its next allowed show time.", message.mo30330id());
                    return false;
                }
            } else {
                C11461g.m41880a(f33666a, "Message (%s) was tripped, but has met its message limit.", message.mo30330id());
                return false;
            }
        } catch (Exception e) {
            C11461g.m41885b(f33666a, e, "Failed to determine is message should be shown.", new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public static void m42348a(Message message, C11801k kVar, C11808c cVar) {
        Message a = kVar.mo31565a(message.mo30330id(), cVar);
        if (a != null) {
            C11503f.m42036a(message, C11503f.m42034a(a));
            C11503f.m42041c(message, C11503f.m42043e(a));
            if (message.periodType() == a.periodType()) {
                C11503f.m42038b(message, C11503f.m42042d(a));
                C11503f.m42039b(message, C11503f.m42037b(a));
            }
        }
    }

    /* renamed from: a */
    public static boolean m42349a(Message message) {
        Date endDateUtc = message.endDateUtc();
        return endDateUtc == null || endDateUtc.getTime() >= System.currentTimeMillis();
    }
}
