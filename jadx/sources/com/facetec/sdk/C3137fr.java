package com.facetec.sdk;

import java.util.TimeZone;
import p342j$.util.DesugarTimeZone;

/* renamed from: com.facetec.sdk.fr */
public final class C3137fr {

    /* renamed from: e */
    private static final TimeZone f10360e = DesugarTimeZone.getTimeZone("UTC");

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e2 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b8 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01c0 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m12882b(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            int r3 = r0 + 4
            int r0 = m12883c(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r4 = 45
            boolean r5 = m12884e(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = m12883c(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            boolean r6 = m12884e(r1, r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = m12883c(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r7 = 84
            boolean r7 = m12884e(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            r12 = 2
            if (r7 == 0) goto L_0x00d8
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = m12883c(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r13 = 58
            boolean r14 = m12884e(r1, r7, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r14 == 0) goto L_0x0062
            int r7 = r7 + 1
        L_0x0062:
            int r14 = r7 + 2
            int r7 = m12883c(r1, r7, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            boolean r13 = m12884e(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r13 == 0) goto L_0x0070
            int r14 = r14 + 1
        L_0x0070:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r13 <= r14) goto L_0x00d5
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r13 == r10) goto L_0x00d5
            if (r13 == r9) goto L_0x00d5
            if (r13 == r4) goto L_0x00d5
            int r13 = r14 + 2
            int r14 = m12883c(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r15 = 59
            if (r14 <= r15) goto L_0x0090
            r15 = 63
            if (r14 >= r15) goto L_0x0090
            r14 = 59
        L_0x0090:
            r15 = 46
            boolean r15 = m12884e(r1, r13, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r15 == 0) goto L_0x00d1
            int r13 = r13 + 1
            int r15 = r13 + 1
        L_0x009c:
            int r11 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r15 >= r11) goto L_0x00b4
            char r11 = r1.charAt(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r4 = 48
            if (r11 < r4) goto L_0x00b9
            r4 = 57
            if (r11 <= r4) goto L_0x00af
            goto L_0x00b9
        L_0x00af:
            int r15 = r15 + 1
            r4 = 45
            goto L_0x009c
        L_0x00b4:
            int r4 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r15 = r4
        L_0x00b9:
            int r4 = r13 + 3
            int r4 = java.lang.Math.min(r15, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            int r11 = m12883c(r1, r13, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            int r4 = r4 - r13
            if (r4 == r8) goto L_0x00cc
            if (r4 == r12) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            int r11 = r11 * 10
            goto L_0x00ce
        L_0x00cc:
            int r11 = r11 * 100
        L_0x00ce:
            r4 = r6
            r6 = r15
            goto L_0x00dc
        L_0x00d1:
            r4 = r6
            r6 = r13
            r11 = 0
            goto L_0x00dc
        L_0x00d5:
            r4 = r6
            r6 = r14
            goto L_0x00da
        L_0x00d8:
            r4 = 0
            r7 = 0
        L_0x00da:
            r11 = 0
            r14 = 0
        L_0x00dc:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r13 <= r6) goto L_0x01b8
            char r13 = r1.charAt(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r15 = 5
            if (r13 != r10) goto L_0x00ee
            java.util.TimeZone r9 = f10360e     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            int r6 = r6 + r8
            goto L_0x0187
        L_0x00ee:
            if (r13 == r9) goto L_0x010e
            r9 = 45
            if (r13 != r9) goto L_0x00f5
            goto L_0x010e
        L_0x00f5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r3.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
        L_0x010e:
            java.lang.String r9 = r1.substring(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            int r10 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r10 < r15) goto L_0x0119
            goto L_0x012a
        L_0x0119:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r10.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.String r9 = "00"
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.String r9 = r10.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
        L_0x012a:
            int r10 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            int r6 = r6 + r10
            java.lang.String r10 = "+0000"
            boolean r10 = r10.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r10 != 0) goto L_0x0185
            java.lang.String r10 = "+00:00"
            boolean r10 = r10.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r10 == 0) goto L_0x0140
            goto L_0x0185
        L_0x0140:
            java.lang.String r10 = "GMT"
            java.lang.String r9 = r10.concat(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.util.TimeZone r10 = p342j$.util.DesugarTimeZone.getTimeZone(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.String r13 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            boolean r16 = r13.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r16 != 0) goto L_0x0183
            java.lang.String r15 = ":"
            java.lang.String r12 = ""
            java.lang.String r12 = r13.replace(r15, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            boolean r12 = r12.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            if (r12 == 0) goto L_0x0163
            goto L_0x0183
        L_0x0163:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r3.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.String r4 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
        L_0x0183:
            r9 = r10
            goto L_0x0187
        L_0x0185:
            java.util.TimeZone r9 = f10360e     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
        L_0x0187:
            java.util.GregorianCalendar r10 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r10.<init>(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r9 = 0
            r10.setLenient(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r10.set(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            int r3 = r3 - r8
            r0 = 2
            r10.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r0 = 5
            r10.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r0 = 11
            r10.set(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r0 = 12
            r10.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r0 = 13
            r10.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r0 = 14
            r10.set(r0, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.util.Date r0 = r10.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            return r0
        L_0x01b8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01c4, NumberFormatException -> 0x01c2, IllegalArgumentException -> 0x01c0 }
        L_0x01c0:
            r0 = move-exception
            goto L_0x01c5
        L_0x01c2:
            r0 = move-exception
            goto L_0x01c5
        L_0x01c4:
            r0 = move-exception
        L_0x01c5:
            if (r1 != 0) goto L_0x01c9
            r1 = 0
            goto L_0x01dc
        L_0x01c9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            r3.append(r1)
            r1 = 34
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x01dc:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01e8
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0203
        L_0x01e8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0203:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3137fr.m12882b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: c */
    private static int m12883c(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                StringBuilder sb = new StringBuilder("Invalid number: ");
                sb.append(str.substring(i, i2));
                throw new NumberFormatException(sb.toString());
            }
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                StringBuilder sb2 = new StringBuilder("Invalid number: ");
                sb2.append(str.substring(i, i2));
                throw new NumberFormatException(sb2.toString());
            }
        }
        return -i3;
    }

    /* renamed from: e */
    private static boolean m12884e(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }
}
