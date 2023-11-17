package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.facetec.sdk.jl */
public final class C3251jl {

    /* renamed from: a */
    private static final Pattern f10615a = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: c */
    private static final Pattern f10616c = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: e */
    private static final Pattern f10617e = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: f */
    private static final Pattern f10618f = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: b */
    public final String f10619b;

    /* renamed from: d */
    public final String f10620d;

    /* renamed from: g */
    private final String f10621g;

    /* renamed from: h */
    private final long f10622h;

    /* renamed from: i */
    private final boolean f10623i;

    /* renamed from: j */
    private final String f10624j;

    /* renamed from: k */
    private final boolean f10625k;

    /* renamed from: n */
    private final boolean f10626n;

    /* renamed from: o */
    private final boolean f10627o;

    private C3251jl(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f10620d = str;
        this.f10619b = str2;
        this.f10622h = j;
        this.f10624j = str3;
        this.f10621g = str4;
        this.f10623i = z;
        this.f10626n = z2;
        this.f10627o = z3;
        this.f10625k = z4;
    }

    /* renamed from: b */
    private static int m13025b(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: d */
    private static long m13026d(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (!str.matches("-?\\d+")) {
                throw e;
            } else if (str.startsWith("-")) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    /* renamed from: e */
    private static boolean m13029e(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || C3303ki.m13245a(str)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3251jl)) {
            return false;
        }
        C3251jl jlVar = (C3251jl) obj;
        if (jlVar.f10620d.equals(this.f10620d) && jlVar.f10619b.equals(this.f10619b) && jlVar.f10624j.equals(this.f10624j) && jlVar.f10621g.equals(this.f10621g) && jlVar.f10622h == this.f10622h && jlVar.f10623i == this.f10623i && jlVar.f10626n == this.f10626n && jlVar.f10625k == this.f10625k && jlVar.f10627o == this.f10627o) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f10622h;
        return ((((((((((((((((this.f10620d.hashCode() + 527) * 31) + this.f10619b.hashCode()) * 31) + this.f10624j.hashCode()) * 31) + this.f10621g.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.f10623i ^ true ? 1 : 0)) * 31) + (this.f10626n ^ true ? 1 : 0)) * 31) + (this.f10625k ^ true ? 1 : 0)) * 31) + (this.f10627o ^ true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10620d);
        sb.append('=');
        sb.append(this.f10619b);
        if (this.f10625k) {
            if (this.f10622h == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C3342lb.m13358c(new Date(this.f10622h)));
            }
        }
        if (!this.f10627o) {
            sb.append("; domain=");
            sb.append(this.f10624j);
        }
        sb.append("; path=");
        sb.append(this.f10621g);
        if (this.f10623i) {
            sb.append("; secure");
        }
        if (this.f10626n) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static List<C3251jl> m13027d(C3274jx jxVar, C3260jr jrVar) {
        List list;
        int a = jrVar.mo9487a();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < a; i++) {
            if ("Set-Cookie".equalsIgnoreCase(jrVar.mo9489b(i))) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(2);
                }
                arrayList2.add(jrVar.mo9490c(i));
            }
        }
        if (arrayList2 != null) {
            list = Collections.unmodifiableList(arrayList2);
        } else {
            list = Collections.emptyList();
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3251jl e = m13028e(System.currentTimeMillis(), jxVar, (String) list.get(i2));
            if (e != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x025e, code lost:
        if (r0 > 253402300799999L) goto L_0x0266;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02e1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02f2  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facetec.sdk.C3251jl m13028e(long r29, com.facetec.sdk.C3274jx r31, java.lang.String r32) {
        /*
            r0 = r32
            java.lang.String r1 = "."
            int r2 = r32.length()
            r3 = 0
            r4 = 59
            int r5 = com.facetec.sdk.C3303ki.m13241a(r0, r3, r2, r4)
            r6 = 61
            int r7 = com.facetec.sdk.C3303ki.m13241a(r0, r3, r5, r6)
            r8 = 0
            if (r7 != r5) goto L_0x0019
            return r8
        L_0x0019:
            java.lang.String r10 = com.facetec.sdk.C3303ki.m13252b((java.lang.String) r0, (int) r3, (int) r7)
            boolean r9 = r10.isEmpty()
            if (r9 != 0) goto L_0x030c
            int r9 = com.facetec.sdk.C3303ki.m13248b((java.lang.String) r10)
            r11 = -1
            if (r9 == r11) goto L_0x002c
            goto L_0x030c
        L_0x002c:
            r9 = 1
            int r7 = r7 + r9
            java.lang.String r7 = com.facetec.sdk.C3303ki.m13252b((java.lang.String) r0, (int) r7, (int) r5)
            int r12 = com.facetec.sdk.C3303ki.m13248b((java.lang.String) r7)
            if (r12 == r11) goto L_0x0039
            return r8
        L_0x0039:
            int r5 = r5 + r9
            r16 = r3
            r17 = r16
            r19 = r17
            r22 = r8
            r18 = r9
            r20 = -1
            r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x004b:
            if (r5 >= r2) goto L_0x0230
            int r14 = com.facetec.sdk.C3303ki.m13241a(r0, r5, r2, r4)
            int r15 = com.facetec.sdk.C3303ki.m13241a(r0, r5, r14, r6)
            java.lang.String r5 = com.facetec.sdk.C3303ki.m13252b((java.lang.String) r0, (int) r5, (int) r15)
            if (r15 >= r14) goto L_0x0062
            int r15 = r15 + 1
            java.lang.String r15 = com.facetec.sdk.C3303ki.m13252b((java.lang.String) r0, (int) r15, (int) r14)
            goto L_0x0064
        L_0x0062:
            java.lang.String r15 = ""
        L_0x0064:
            java.lang.String r6 = "expires"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x01c4
            int r5 = r15.length()     // Catch:{ IllegalArgumentException -> 0x01c1 }
            int r6 = m13025b(r15, r3, r5, r3)     // Catch:{ IllegalArgumentException -> 0x01c1 }
            java.util.regex.Pattern r12 = f10618f     // Catch:{ IllegalArgumentException -> 0x01c1 }
            java.util.regex.Matcher r12 = r12.matcher(r15)     // Catch:{ IllegalArgumentException -> 0x01c1 }
            r3 = r11
            r4 = r3
            r13 = r4
            r25 = r13
            r26 = r25
            r27 = r26
        L_0x0083:
            if (r6 >= r5) goto L_0x012c
            int r11 = r6 + 1
            int r11 = m13025b(r15, r11, r5, r9)     // Catch:{ IllegalArgumentException -> 0x0127 }
            r12.region(r6, r11)     // Catch:{ IllegalArgumentException -> 0x0127 }
            r6 = -1
            if (r4 != r6) goto L_0x00be
            java.util.regex.Pattern r6 = f10618f     // Catch:{ IllegalArgumentException -> 0x0127 }
            java.util.regex.Matcher r6 = r12.usePattern(r6)     // Catch:{ IllegalArgumentException -> 0x0127 }
            boolean r6 = r6.matches()     // Catch:{ IllegalArgumentException -> 0x0127 }
            if (r6 == 0) goto L_0x00ba
            java.lang.String r4 = r12.group(r9)     // Catch:{ IllegalArgumentException -> 0x0127 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ IllegalArgumentException -> 0x0127 }
            r6 = 2
            java.lang.String r6 = r12.group(r6)     // Catch:{ IllegalArgumentException -> 0x0127 }
            int r26 = java.lang.Integer.parseInt(r6)     // Catch:{ IllegalArgumentException -> 0x0127 }
            r6 = 3
            java.lang.String r6 = r12.group(r6)     // Catch:{ IllegalArgumentException -> 0x0127 }
            int r27 = java.lang.Integer.parseInt(r6)     // Catch:{ IllegalArgumentException -> 0x0127 }
            r6 = r25
            goto L_0x0118
        L_0x00ba:
            r6 = r25
            r9 = -1
            goto L_0x00c1
        L_0x00be:
            r9 = r6
            r6 = r25
        L_0x00c1:
            if (r6 != r9) goto L_0x00da
            java.util.regex.Pattern r9 = f10617e     // Catch:{ IllegalArgumentException -> 0x0127 }
            java.util.regex.Matcher r9 = r12.usePattern(r9)     // Catch:{ IllegalArgumentException -> 0x0127 }
            boolean r9 = r9.matches()     // Catch:{ IllegalArgumentException -> 0x0127 }
            if (r9 == 0) goto L_0x00d9
            r9 = 1
            java.lang.String r6 = r12.group(r9)     // Catch:{ IllegalArgumentException -> 0x0127 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ IllegalArgumentException -> 0x0127 }
            goto L_0x0118
        L_0x00d9:
            r9 = -1
        L_0x00da:
            if (r3 != r9) goto L_0x0100
            java.util.regex.Pattern r9 = f10615a     // Catch:{ IllegalArgumentException -> 0x0127 }
            java.util.regex.Matcher r28 = r12.usePattern(r9)     // Catch:{ IllegalArgumentException -> 0x0127 }
            boolean r28 = r28.matches()     // Catch:{ IllegalArgumentException -> 0x0127 }
            if (r28 == 0) goto L_0x00fe
            r0 = 1
            java.lang.String r3 = r12.group(r0)     // Catch:{ IllegalArgumentException -> 0x0127 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0127 }
            java.lang.String r0 = r3.toLowerCase(r0)     // Catch:{ IllegalArgumentException -> 0x0127 }
            java.lang.String r3 = r9.pattern()     // Catch:{ IllegalArgumentException -> 0x0127 }
            int r0 = r3.indexOf(r0)     // Catch:{ IllegalArgumentException -> 0x0127 }
            int r3 = r0 / 4
            goto L_0x0118
        L_0x00fe:
            r0 = -1
            goto L_0x0101
        L_0x0100:
            r0 = r9
        L_0x0101:
            if (r13 != r0) goto L_0x0118
            java.util.regex.Pattern r0 = f10616c     // Catch:{ IllegalArgumentException -> 0x0127 }
            java.util.regex.Matcher r0 = r12.usePattern(r0)     // Catch:{ IllegalArgumentException -> 0x0127 }
            boolean r0 = r0.matches()     // Catch:{ IllegalArgumentException -> 0x0127 }
            if (r0 == 0) goto L_0x0118
            r0 = 1
            java.lang.String r9 = r12.group(r0)     // Catch:{ IllegalArgumentException -> 0x0127 }
            int r13 = java.lang.Integer.parseInt(r9)     // Catch:{ IllegalArgumentException -> 0x0127 }
        L_0x0118:
            int r11 = r11 + 1
            r0 = 0
            int r9 = m13025b(r15, r11, r5, r0)     // Catch:{ IllegalArgumentException -> 0x0127 }
            r0 = r32
            r25 = r6
            r6 = r9
            r9 = 1
            goto L_0x0083
        L_0x0127:
            r0 = -1
            r9 = 59
            goto L_0x0224
        L_0x012c:
            r6 = r25
            r0 = 70
            if (r13 < r0) goto L_0x0138
            r0 = 99
            if (r13 > r0) goto L_0x0138
            int r13 = r13 + 1900
        L_0x0138:
            if (r13 < 0) goto L_0x0140
            r0 = 69
            if (r13 > r0) goto L_0x0140
            int r13 = r13 + 2000
        L_0x0140:
            r0 = 1601(0x641, float:2.243E-42)
            if (r13 < r0) goto L_0x01b8
            r0 = -1
            if (r3 == r0) goto L_0x01b0
            if (r6 <= 0) goto L_0x01a8
            r5 = 31
            if (r6 > r5) goto L_0x01a8
            if (r4 < 0) goto L_0x01a0
            r5 = 23
            if (r4 > r5) goto L_0x01a0
            r11 = r26
            r9 = 59
            if (r11 < 0) goto L_0x019a
            if (r11 > r9) goto L_0x019a
            r5 = r27
            if (r5 < 0) goto L_0x0194
            if (r5 > r9) goto L_0x0194
            java.util.GregorianCalendar r12 = new java.util.GregorianCalendar     // Catch:{ IllegalArgumentException -> 0x0224 }
            java.util.TimeZone r15 = com.facetec.sdk.C3303ki.f10839a     // Catch:{ IllegalArgumentException -> 0x0224 }
            r12.<init>(r15)     // Catch:{ IllegalArgumentException -> 0x0224 }
            r15 = 0
            r12.setLenient(r15)     // Catch:{ IllegalArgumentException -> 0x0224 }
            r15 = 1
            r12.set(r15, r13)     // Catch:{ IllegalArgumentException -> 0x0224 }
            int r3 = r3 + -1
            r13 = 2
            r12.set(r13, r3)     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3 = 5
            r12.set(r3, r6)     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3 = 11
            r12.set(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3 = 12
            r12.set(r3, r11)     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3 = 13
            r12.set(r3, r5)     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3 = 14
            r4 = 0
            r12.set(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0224 }
            long r23 = r12.getTimeInMillis()     // Catch:{ IllegalArgumentException -> 0x0224 }
            goto L_0x01d2
        L_0x0194:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0224 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0224 }
        L_0x019a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0224 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0224 }
        L_0x01a0:
            r9 = 59
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0224 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0224 }
        L_0x01a8:
            r9 = 59
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0224 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0224 }
        L_0x01b0:
            r9 = 59
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0224 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0224 }
        L_0x01b8:
            r0 = -1
            r9 = 59
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0224 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0224 }
        L_0x01c1:
            r9 = r4
            r0 = r11
            goto L_0x0224
        L_0x01c4:
            r9 = r4
            r0 = r11
            java.lang.String r3 = "max-age"
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x01d5
            long r20 = m13026d(r15)     // Catch:{  }
        L_0x01d2:
            r19 = 1
            goto L_0x0224
        L_0x01d5:
            java.lang.String r3 = "domain"
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0204
            boolean r3 = r15.endsWith(r1)     // Catch:{ IllegalArgumentException -> 0x0224 }
            if (r3 != 0) goto L_0x01fe
            boolean r3 = r15.startsWith(r1)     // Catch:{ IllegalArgumentException -> 0x0224 }
            if (r3 == 0) goto L_0x01ee
            r3 = 1
            java.lang.String r15 = r15.substring(r3)     // Catch:{ IllegalArgumentException -> 0x0224 }
        L_0x01ee:
            java.lang.String r3 = com.facetec.sdk.C3303ki.m13258c((java.lang.String) r15)     // Catch:{ IllegalArgumentException -> 0x0224 }
            if (r3 == 0) goto L_0x01f8
            r8 = r3
            r18 = 0
            goto L_0x0224
        L_0x01f8:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0224 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0224 }
        L_0x01fe:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0224 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0224 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0224 }
        L_0x0204:
            java.lang.String r3 = "path"
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x020f
            r22 = r15
            goto L_0x0224
        L_0x020f:
            java.lang.String r3 = "secure"
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x021a
            r16 = 1
            goto L_0x0224
        L_0x021a:
            java.lang.String r3 = "httponly"
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0224
            r17 = 1
        L_0x0224:
            int r5 = r14 + 1
            r11 = r0
            r4 = r9
            r3 = 0
            r6 = 61
            r9 = 1
            r0 = r32
            goto L_0x004b
        L_0x0230:
            r0 = -9223372036854775808
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0238
        L_0x0236:
            r12 = r0
            goto L_0x026a
        L_0x0238:
            r0 = -1
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0268
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x024c
            r0 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r0
            goto L_0x0251
        L_0x024c:
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0251:
            long r0 = r29 + r20
            int r2 = (r0 > r29 ? 1 : (r0 == r29 ? 0 : -1))
            if (r2 < 0) goto L_0x0261
            r2 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0236
            goto L_0x0266
        L_0x0261:
            r2 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x0266:
            r12 = r2
            goto L_0x026a
        L_0x0268:
            r12 = r23
        L_0x026a:
            java.lang.String r0 = r31.mo9551h()
            if (r8 != 0) goto L_0x0272
            r14 = r0
            goto L_0x027b
        L_0x0272:
            boolean r1 = m13029e(r0, r8)
            if (r1 != 0) goto L_0x027a
            r1 = 0
            return r1
        L_0x027a:
            r14 = r8
        L_0x027b:
            int r0 = r0.length()
            int r1 = r14.length()
            if (r0 == r1) goto L_0x02e3
            com.facetec.sdk.md r0 = com.facetec.sdk.C3419md.m13605d()
            java.lang.String r1 = java.net.IDN.toUnicode(r14)
            java.lang.String r2 = "\\."
            java.lang.String[] r1 = r1.split(r2)
            java.lang.String[] r0 = r0.mo9818d(r1)
            int r3 = r1.length
            int r4 = r0.length
            r5 = 33
            if (r3 != r4) goto L_0x02a8
            r3 = 0
            r4 = r0[r3]
            char r4 = r4.charAt(r3)
            if (r4 == r5) goto L_0x02a9
            r0 = 0
            goto L_0x02df
        L_0x02a8:
            r3 = 0
        L_0x02a9:
            r4 = r0[r3]
            char r4 = r4.charAt(r3)
            if (r4 != r5) goto L_0x02b4
            int r1 = r1.length
            int r0 = r0.length
            goto L_0x02b8
        L_0x02b4:
            int r1 = r1.length
            int r0 = r0.length
            r3 = 1
            int r0 = r0 + r3
        L_0x02b8:
            int r1 = r1 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String[] r2 = r14.split(r2)
        L_0x02c2:
            int r3 = r2.length
            if (r1 >= r3) goto L_0x02d2
            r3 = r2[r1]
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            int r1 = r1 + 1
            goto L_0x02c2
        L_0x02d2:
            int r1 = r0.length()
            r2 = 1
            int r1 = r1 - r2
            r0.deleteCharAt(r1)
            java.lang.String r0 = r0.toString()
        L_0x02df:
            if (r0 != 0) goto L_0x02e3
            r0 = 0
            return r0
        L_0x02e3:
            java.lang.String r0 = "/"
            r8 = r22
            if (r8 == 0) goto L_0x02f2
            boolean r1 = r8.startsWith(r0)
            if (r1 != 0) goto L_0x02f0
            goto L_0x02f2
        L_0x02f0:
            r15 = r8
            goto L_0x0304
        L_0x02f2:
            java.lang.String r1 = r31.mo9549f()
            r2 = 47
            int r2 = r1.lastIndexOf(r2)
            if (r2 == 0) goto L_0x0303
            r3 = 0
            java.lang.String r0 = r1.substring(r3, r2)
        L_0x0303:
            r15 = r0
        L_0x0304:
            com.facetec.sdk.jl r0 = new com.facetec.sdk.jl
            r9 = r0
            r11 = r7
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x030c:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3251jl.m13028e(long, com.facetec.sdk.jx, java.lang.String):com.facetec.sdk.jl");
    }
}
