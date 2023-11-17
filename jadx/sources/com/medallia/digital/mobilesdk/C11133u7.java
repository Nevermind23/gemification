package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11209y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: com.medallia.digital.mobilesdk.u7 */
abstract class C11133u7<T> implements C10756c1 {

    /* renamed from: d */
    private static final String f32002d = "mdCParamNull";

    /* renamed from: e */
    private static final int f32003e = 3;

    /* renamed from: f */
    private static final int f32004f = 2;

    /* renamed from: g */
    private static final int f32005g = 1;

    /* renamed from: a */
    private ArrayList<C10802f0> f32006a;

    /* renamed from: b */
    private ArrayList<C10802f0> f32007b;

    /* renamed from: c */
    private ArrayList<C11204x5> f32008c;

    /* renamed from: com.medallia.digital.mobilesdk.u7$a */
    static /* synthetic */ class C11134a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32009a;

        /* renamed from: b */
        static final /* synthetic */ int[] f32010b;

        /* renamed from: c */
        static final /* synthetic */ int[] f32011c;

        /* renamed from: d */
        static final /* synthetic */ int[] f32012d;

        /* renamed from: e */
        static final /* synthetic */ int[] f32013e;

        /* renamed from: f */
        static final /* synthetic */ int[] f32014f;

        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|(2:19|20)|21|(2:23|24)|25|27|28|29|30|31|32|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|(3:79|80|82)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|(2:19|20)|21|(2:23|24)|25|27|28|29|30|31|32|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|(3:79|80|82)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|(2:19|20)|21|23|24|25|27|28|29|30|31|32|(2:33|34)|35|(2:37|38)|39|41|42|43|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|(3:79|80|82)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(70:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|30|31|32|(2:33|34)|35|37|38|39|41|42|43|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|79|80|82) */
        /* JADX WARNING: Can't wrap try/catch for region: R(71:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|30|31|32|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|73|74|75|76|77|78|79|80|82) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00ca */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00de */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00e8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00f2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x013d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0147 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0151 */
        static {
            /*
                com.medallia.digital.mobilesdk.y1$g[] r0 = com.medallia.digital.mobilesdk.C11209y1.C11216g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32014f = r0
                r1 = 1
                com.medallia.digital.mobilesdk.y1$g r2 = com.medallia.digital.mobilesdk.C11209y1.C11216g.VALUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f32014f     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.y1$g r3 = com.medallia.digital.mobilesdk.C11209y1.C11216g.TIMESTAMP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.medallia.digital.mobilesdk.y1$f[] r2 = com.medallia.digital.mobilesdk.C11209y1.C11215f.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f32013e = r2
                com.medallia.digital.mobilesdk.y1$f r3 = com.medallia.digital.mobilesdk.C11209y1.C11215f.TIME_NOW     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                com.medallia.digital.mobilesdk.y1$h[] r2 = com.medallia.digital.mobilesdk.C11209y1.C11217h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f32012d = r2
                com.medallia.digital.mobilesdk.y1$h r3 = com.medallia.digital.mobilesdk.C11209y1.C11217h.OS     // Catch:{ NoSuchFieldError -> 0x003f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r2 = f32012d     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.medallia.digital.mobilesdk.y1$h r3 = com.medallia.digital.mobilesdk.C11209y1.C11217h.CUSTOM_PARAM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r2 = 3
                int[] r3 = f32012d     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.medallia.digital.mobilesdk.y1$h r4 = com.medallia.digital.mobilesdk.C11209y1.C11217h.USER_JOURNEY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r3 = 4
                int[] r4 = f32012d     // Catch:{ NoSuchFieldError -> 0x005f }
                com.medallia.digital.mobilesdk.y1$h r5 = com.medallia.digital.mobilesdk.C11209y1.C11217h.OCQ_RULE     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                com.medallia.digital.mobilesdk.y1$e[] r4 = com.medallia.digital.mobilesdk.C11209y1.C11214e.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f32011c = r4
                com.medallia.digital.mobilesdk.y1$e r5 = com.medallia.digital.mobilesdk.C11209y1.C11214e.ADD     // Catch:{ NoSuchFieldError -> 0x0070 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0070 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0070 }
            L_0x0070:
                int[] r4 = f32011c     // Catch:{ NoSuchFieldError -> 0x007a }
                com.medallia.digital.mobilesdk.y1$e r5 = com.medallia.digital.mobilesdk.C11209y1.C11214e.MULT     // Catch:{ NoSuchFieldError -> 0x007a }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r4 = f32011c     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.medallia.digital.mobilesdk.y1$e r5 = com.medallia.digital.mobilesdk.C11209y1.C11214e.DIVIDE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r4 = f32011c     // Catch:{ NoSuchFieldError -> 0x008e }
                com.medallia.digital.mobilesdk.y1$e r5 = com.medallia.digital.mobilesdk.C11209y1.C11214e.SUBSTRACT     // Catch:{ NoSuchFieldError -> 0x008e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                r4 = 5
                int[] r5 = f32011c     // Catch:{ NoSuchFieldError -> 0x0099 }
                com.medallia.digital.mobilesdk.y1$e r6 = com.medallia.digital.mobilesdk.C11209y1.C11214e.LOWER_CASE     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                r5 = 6
                int[] r6 = f32011c     // Catch:{ NoSuchFieldError -> 0x00a4 }
                com.medallia.digital.mobilesdk.y1$e r7 = com.medallia.digital.mobilesdk.C11209y1.C11214e.UPPER_CASE     // Catch:{ NoSuchFieldError -> 0x00a4 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x00a4 }
            L_0x00a4:
                r6 = 7
                int[] r7 = f32011c     // Catch:{ NoSuchFieldError -> 0x00af }
                com.medallia.digital.mobilesdk.y1$e r8 = com.medallia.digital.mobilesdk.C11209y1.C11214e.ABS     // Catch:{ NoSuchFieldError -> 0x00af }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                com.medallia.digital.mobilesdk.y1$c[] r7 = com.medallia.digital.mobilesdk.C11209y1.C11212c.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f32010b = r7
                com.medallia.digital.mobilesdk.y1$c r8 = com.medallia.digital.mobilesdk.C11209y1.C11212c.MATCH     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r7 = f32010b     // Catch:{ NoSuchFieldError -> 0x00ca }
                com.medallia.digital.mobilesdk.y1$c r8 = com.medallia.digital.mobilesdk.C11209y1.C11212c.EQUALS     // Catch:{ NoSuchFieldError -> 0x00ca }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ca }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x00ca }
            L_0x00ca:
                int[] r7 = f32010b     // Catch:{ NoSuchFieldError -> 0x00d4 }
                com.medallia.digital.mobilesdk.y1$c r8 = com.medallia.digital.mobilesdk.C11209y1.C11212c.DOES_NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x00d4 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d4 }
                r7[r8] = r2     // Catch:{ NoSuchFieldError -> 0x00d4 }
            L_0x00d4:
                int[] r7 = f32010b     // Catch:{ NoSuchFieldError -> 0x00de }
                com.medallia.digital.mobilesdk.y1$c r8 = com.medallia.digital.mobilesdk.C11209y1.C11212c.CONTAINS     // Catch:{ NoSuchFieldError -> 0x00de }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00de }
                r7[r8] = r3     // Catch:{ NoSuchFieldError -> 0x00de }
            L_0x00de:
                int[] r7 = f32010b     // Catch:{ NoSuchFieldError -> 0x00e8 }
                com.medallia.digital.mobilesdk.y1$c r8 = com.medallia.digital.mobilesdk.C11209y1.C11212c.ENDS_WITH     // Catch:{ NoSuchFieldError -> 0x00e8 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e8 }
                r7[r8] = r4     // Catch:{ NoSuchFieldError -> 0x00e8 }
            L_0x00e8:
                int[] r4 = f32010b     // Catch:{ NoSuchFieldError -> 0x00f2 }
                com.medallia.digital.mobilesdk.y1$c r7 = com.medallia.digital.mobilesdk.C11209y1.C11212c.HAS_VALUE     // Catch:{ NoSuchFieldError -> 0x00f2 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f2 }
                r4[r7] = r5     // Catch:{ NoSuchFieldError -> 0x00f2 }
            L_0x00f2:
                int[] r4 = f32010b     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.medallia.digital.mobilesdk.y1$c r5 = com.medallia.digital.mobilesdk.C11209y1.C11212c.STARTS_WITH     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r4 = f32010b     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.medallia.digital.mobilesdk.y1$c r5 = com.medallia.digital.mobilesdk.C11209y1.C11212c.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r4 = f32010b     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.medallia.digital.mobilesdk.y1$c r5 = com.medallia.digital.mobilesdk.C11209y1.C11212c.DOES_NOT_CONTAIN     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r6 = 9
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r4 = f32010b     // Catch:{ NoSuchFieldError -> 0x0120 }
                com.medallia.digital.mobilesdk.y1$c r5 = com.medallia.digital.mobilesdk.C11209y1.C11212c.SMALLER_THAN     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r6 = 10
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r4 = f32010b     // Catch:{ NoSuchFieldError -> 0x012c }
                com.medallia.digital.mobilesdk.y1$c r5 = com.medallia.digital.mobilesdk.C11209y1.C11212c.DIFF     // Catch:{ NoSuchFieldError -> 0x012c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r6 = 11
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                com.medallia.digital.mobilesdk.y1$i[] r4 = com.medallia.digital.mobilesdk.C11209y1.C11218i.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f32009a = r4
                com.medallia.digital.mobilesdk.y1$i r5 = com.medallia.digital.mobilesdk.C11209y1.C11218i.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x013d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x013d }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x013d }
            L_0x013d:
                int[] r1 = f32009a     // Catch:{ NoSuchFieldError -> 0x0147 }
                com.medallia.digital.mobilesdk.y1$i r4 = com.medallia.digital.mobilesdk.C11209y1.C11218i.STRING     // Catch:{ NoSuchFieldError -> 0x0147 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0147 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0147 }
            L_0x0147:
                int[] r0 = f32009a     // Catch:{ NoSuchFieldError -> 0x0151 }
                com.medallia.digital.mobilesdk.y1$i r1 = com.medallia.digital.mobilesdk.C11209y1.C11218i.INTEGER     // Catch:{ NoSuchFieldError -> 0x0151 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0151 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0151 }
            L_0x0151:
                int[] r0 = f32009a     // Catch:{ NoSuchFieldError -> 0x015b }
                com.medallia.digital.mobilesdk.y1$i r1 = com.medallia.digital.mobilesdk.C11209y1.C11218i.DOUBLE     // Catch:{ NoSuchFieldError -> 0x015b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x015b }
            L_0x015b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11133u7.C11134a.<clinit>():void");
        }
    }

    C11133u7() {
    }

    /* renamed from: a */
    private C10802f0 m40786a(String str) {
        ArrayList<C10802f0> arrayList = this.f32006a;
        if (!(arrayList == null || str == null)) {
            Iterator<C10802f0> it = arrayList.iterator();
            while (it.hasNext()) {
                C10802f0 next = it.next();
                if (next.getName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private String m40789b(String str) {
        ArrayList<C11204x5> arrayList;
        if (!(str == null || (arrayList = this.f32008c) == null)) {
            Iterator<C11204x5> it = arrayList.iterator();
            while (it.hasNext()) {
                C11204x5 next = it.next();
                if (str.equals(next.f32240a)) {
                    return String.valueOf(next.f32242c);
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private String m40791c(String str) {
        C11209y1.C11215f a;
        if (str == null || (a = C11209y1.C11215f.m41115a(str)) == null || C11134a.f32013e[a.ordinal()] != 1) {
            return null;
        }
        return String.valueOf(System.currentTimeMillis());
    }

    public String toJsonString() {
        return null;
    }

    /* renamed from: b */
    private String m40790b(String str, C11209y1.C11218i iVar) {
        if (!(this.f32007b == null || str == null || iVar == null)) {
            Pattern compile = Pattern.compile("Name:\\s(.*)\\sValue:\\s(.*)");
            Iterator<C10802f0> it = this.f32007b.iterator();
            while (it.hasNext()) {
                C10802f0 next = it.next();
                if (next.mo28284i() != null && compile.matcher(next.mo28284i().toString()).matches() && next.mo28284i().toString().replaceAll("Name:\\s", "").replaceAll("\\sValue:\\s(.*)", "").equals(str)) {
                    C11209y1.C11218i a = C11209y1.C11218i.m41118a(next.mo28285j());
                    if (a == null) {
                        return f32002d;
                    }
                    C11209y1.C11218i iVar2 = C11209y1.C11218i.STRING;
                    if (iVar == iVar2 && a != iVar2) {
                        return f32002d;
                    }
                    C11209y1.C11218i iVar3 = C11209y1.C11218i.BOOLEAN;
                    if (iVar == iVar3 && a != iVar3) {
                        return f32002d;
                    }
                    C11209y1.C11218i iVar4 = C11209y1.C11218i.DOUBLE;
                    return (iVar != iVar4 || a == iVar4 || a == C11209y1.C11218i.INTEGER) ? next.mo28284i().toString().replaceAll("Name:\\s(.*)\\sValue:\\s", "") : f32002d;
                }
            }
        }
        return f32002d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <K> K mo29046a(Object obj, Class<K> cls) {
        try {
            return cls.cast(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r8v15, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r8v25, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r8v26, types: [java.lang.Double] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0079, code lost:
        if (r7 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        r0 = r7.equals(f32002d);
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007f, code lost:
        if (r0 == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0081, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0082, code lost:
        if (r8 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0088, code lost:
        if (r8.equals(f32002d) == false) goto L_0x00d7;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0127  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo29047a(java.lang.String r7, java.lang.String r8, com.medallia.digital.mobilesdk.C11209y1.C11218i r9, com.medallia.digital.mobilesdk.C11209y1.C11212c r10) {
        /*
            r6 = this;
            int[] r0 = com.medallia.digital.mobilesdk.C11133u7.C11134a.f32009a
            int r1 = r9.ordinal()
            r0 = r0[r1]
            r1 = 0
            java.lang.String r2 = "mdCParamNull"
            r3 = 1
            r4 = 0
            if (r0 == r3) goto L_0x008c
            r5 = 2
            if (r0 == r5) goto L_0x0079
            r5 = 3
            if (r0 == r5) goto L_0x0046
            r5 = 4
            if (r0 == r5) goto L_0x001c
            r7 = r4
            r8 = r7
            goto L_0x00d7
        L_0x001c:
            if (r7 == 0) goto L_0x0025
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L_0x0025
            goto L_0x0034
        L_0x0025:
            if (r7 == 0) goto L_0x0034
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ Exception -> 0x002c }
            goto L_0x0035
        L_0x002c:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39114f(r7)
        L_0x0034:
            r7 = r4
        L_0x0035:
            if (r8 == 0) goto L_0x003e
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x003e
            goto L_0x008a
        L_0x003e:
            if (r8 == 0) goto L_0x008a
            java.lang.Double r8 = java.lang.Double.valueOf(r8)     // Catch:{ Exception -> 0x0070 }
            goto L_0x00d7
        L_0x0046:
            if (r7 == 0) goto L_0x004f
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L_0x004f
            goto L_0x005e
        L_0x004f:
            if (r7 == 0) goto L_0x005e
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0056 }
            goto L_0x005f
        L_0x0056:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39114f(r7)
        L_0x005e:
            r7 = r4
        L_0x005f:
            if (r8 == 0) goto L_0x0068
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x0068
            goto L_0x00ba
        L_0x0068:
            if (r8 == 0) goto L_0x008a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0070 }
            goto L_0x00d7
        L_0x0070:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39114f(r8)
            goto L_0x008a
        L_0x0079:
            if (r7 == 0) goto L_0x0082
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L_0x0082
            r7 = r4
        L_0x0082:
            if (r8 == 0) goto L_0x00d7
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x00d7
        L_0x008a:
            r8 = r4
            goto L_0x00d7
        L_0x008c:
            if (r7 == 0) goto L_0x0096
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L_0x0096
            r7 = r4
            goto L_0x00b2
        L_0x0096:
            if (r7 == 0) goto L_0x00a2
            boolean r7 = java.lang.Boolean.parseBoolean(r7)     // Catch:{ Exception -> 0x00a0 }
            if (r7 == 0) goto L_0x00a2
            r7 = r3
            goto L_0x00a3
        L_0x00a0:
            r7 = move-exception
            goto L_0x00a8
        L_0x00a2:
            r7 = r1
        L_0x00a3:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x00b2
        L_0x00a8:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r7 = r7.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39114f(r7)
            r7 = r0
        L_0x00b2:
            if (r8 == 0) goto L_0x00bb
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x00bb
        L_0x00ba:
            goto L_0x008a
        L_0x00bb:
            if (r8 == 0) goto L_0x00c7
            boolean r8 = java.lang.Boolean.parseBoolean(r8)     // Catch:{ Exception -> 0x00c5 }
            if (r8 == 0) goto L_0x00c7
            r8 = r3
            goto L_0x00c8
        L_0x00c5:
            r8 = move-exception
            goto L_0x00cd
        L_0x00c7:
            r8 = r1
        L_0x00c8:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00d7
        L_0x00cd:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r8 = r8.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39114f(r8)
            r8 = r0
        L_0x00d7:
            int[] r0 = com.medallia.digital.mobilesdk.C11133u7.C11134a.f32010b
            int r10 = r10.ordinal()
            r10 = r0[r10]
            switch(r10) {
                case 1: goto L_0x024c;
                case 2: goto L_0x023e;
                case 3: goto L_0x0230;
                case 4: goto L_0x0210;
                case 5: goto L_0x01f0;
                case 6: goto L_0x01e8;
                case 7: goto L_0x01c9;
                case 8: goto L_0x018a;
                case 9: goto L_0x0166;
                case 10: goto L_0x0127;
                case 11: goto L_0x00e5;
                default: goto L_0x00e2;
            }
        L_0x00e2:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x00e5:
            if (r7 == 0) goto L_0x0126
            if (r8 != 0) goto L_0x00ea
            goto L_0x0126
        L_0x00ea:
            boolean r9 = r7 instanceof java.lang.Long
            if (r9 == 0) goto L_0x0102
            r9 = r8
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            r0 = r7
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r9 = r9 - r0
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            goto L_0x0103
        L_0x0102:
            r9 = r4
        L_0x0103:
            boolean r10 = r7 instanceof java.lang.Double
            if (r10 == 0) goto L_0x0118
            java.lang.Double r8 = (java.lang.Double) r8
            long r8 = r8.longValue()
            java.lang.Double r7 = (java.lang.Double) r7
            long r0 = r7.longValue()
            long r8 = r8 - r0
            java.lang.Long r9 = java.lang.Long.valueOf(r8)
        L_0x0118:
            if (r9 == 0) goto L_0x0126
            long r7 = r9.longValue()
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            return r9
        L_0x0126:
            return r4
        L_0x0127:
            if (r7 == 0) goto L_0x0163
            if (r8 != 0) goto L_0x012c
            goto L_0x0163
        L_0x012c:
            boolean r9 = r7 instanceof java.lang.Long
            if (r9 == 0) goto L_0x0146
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            java.lang.Long r8 = (java.lang.Long) r8
            long r7 = r8.longValue()
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0141
            r1 = r3
        L_0x0141:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            return r7
        L_0x0146:
            boolean r9 = r7 instanceof java.lang.Double
            if (r9 == 0) goto L_0x0160
            java.lang.Double r7 = (java.lang.Double) r7
            double r9 = r7.doubleValue()
            java.lang.Double r8 = (java.lang.Double) r8
            double r7 = r8.doubleValue()
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x015b
            r1 = r3
        L_0x015b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            return r7
        L_0x0160:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x0163:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x0166:
            com.medallia.digital.mobilesdk.y1$i r10 = com.medallia.digital.mobilesdk.C11209y1.C11218i.STRING
            if (r9 == r10) goto L_0x016d
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x016d:
            if (r7 == 0) goto L_0x0187
            if (r8 != 0) goto L_0x0172
            goto L_0x0187
        L_0x0172:
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L_0x0184
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            boolean r7 = r7.contains(r8)
        L_0x017e:
            r7 = r7 ^ r3
        L_0x017f:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L_0x0184:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x0187:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x018a:
            if (r7 == 0) goto L_0x01c6
            if (r8 != 0) goto L_0x018f
            goto L_0x01c6
        L_0x018f:
            boolean r9 = r7 instanceof java.lang.Long
            if (r9 == 0) goto L_0x01a9
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            java.lang.Long r8 = (java.lang.Long) r8
            long r7 = r8.longValue()
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x01a4
            r1 = r3
        L_0x01a4:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            return r7
        L_0x01a9:
            boolean r9 = r7 instanceof java.lang.Double
            if (r9 == 0) goto L_0x01c3
            java.lang.Double r7 = (java.lang.Double) r7
            double r9 = r7.doubleValue()
            java.lang.Double r8 = (java.lang.Double) r8
            double r7 = r8.doubleValue()
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x01be
            r1 = r3
        L_0x01be:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            return r7
        L_0x01c3:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x01c6:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x01c9:
            com.medallia.digital.mobilesdk.y1$i r10 = com.medallia.digital.mobilesdk.C11209y1.C11218i.STRING
            if (r9 == r10) goto L_0x01d0
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x01d0:
            if (r7 == 0) goto L_0x01e5
            if (r8 != 0) goto L_0x01d5
            goto L_0x01e5
        L_0x01d5:
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L_0x01e2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            boolean r7 = r7.startsWith(r8)
            goto L_0x017f
        L_0x01e2:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x01e5:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x01e8:
            if (r7 == 0) goto L_0x01eb
            r1 = r3
        L_0x01eb:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            return r7
        L_0x01f0:
            com.medallia.digital.mobilesdk.y1$i r10 = com.medallia.digital.mobilesdk.C11209y1.C11218i.STRING
            if (r9 == r10) goto L_0x01f7
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x01f7:
            if (r7 == 0) goto L_0x020d
            if (r8 != 0) goto L_0x01fc
            goto L_0x020d
        L_0x01fc:
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L_0x020a
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            boolean r7 = r7.endsWith(r8)
            goto L_0x017f
        L_0x020a:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x020d:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x0210:
            com.medallia.digital.mobilesdk.y1$i r10 = com.medallia.digital.mobilesdk.C11209y1.C11218i.STRING
            if (r9 == r10) goto L_0x0217
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x0217:
            if (r7 == 0) goto L_0x022d
            if (r8 != 0) goto L_0x021c
            goto L_0x022d
        L_0x021c:
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L_0x022a
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            boolean r7 = r7.contains(r8)
            goto L_0x017f
        L_0x022a:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x022d:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x0230:
            if (r7 == 0) goto L_0x023b
            if (r8 != 0) goto L_0x0235
            goto L_0x023b
        L_0x0235:
            boolean r7 = r7.equals(r8)
            goto L_0x017e
        L_0x023b:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x023e:
            if (r7 == 0) goto L_0x0249
            if (r8 != 0) goto L_0x0243
            goto L_0x0249
        L_0x0243:
            boolean r7 = r7.equals(r8)
            goto L_0x017f
        L_0x0249:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x024c:
            if (r7 == 0) goto L_0x028e
            if (r8 != 0) goto L_0x0251
            goto L_0x028e
        L_0x0251:
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L_0x028b
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L_0x028b
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0288 }
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)     // Catch:{ Exception -> 0x0288 }
            r10 = r7
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Exception -> 0x0288 }
            java.util.regex.Matcher r9 = r9.matcher(r10)     // Catch:{ Exception -> 0x0288 }
            boolean r9 = r9.matches()     // Catch:{ Exception -> 0x0288 }
            if (r9 == 0) goto L_0x0270
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L_0x0270:
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0285 }
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)     // Catch:{ Exception -> 0x0285 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ Exception -> 0x0285 }
            java.util.regex.Matcher r7 = r7.matcher(r8)     // Catch:{ Exception -> 0x0285 }
            boolean r7 = r7.matches()     // Catch:{ Exception -> 0x0285 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L_0x0285:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x0288:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x028b:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L_0x028e:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11133u7.mo29047a(java.lang.String, java.lang.String, com.medallia.digital.mobilesdk.y1$i, com.medallia.digital.mobilesdk.y1$c):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public T mo29048a(ArrayList<C10802f0> arrayList, ArrayList<C10802f0> arrayList2, ArrayList<C11204x5> arrayList3) {
        this.f32006a = arrayList;
        this.f32007b = arrayList2;
        this.f32008c = arrayList3;
        return null;
    }

    /* renamed from: a */
    private String m40787a(C10802f0 f0Var, String str) {
        C11209y1.C11216g a;
        if (str == null || f0Var == null || (a = C11209y1.C11216g.m41116a(str)) == null) {
            return null;
        }
        int i = C11134a.f32014f[a.ordinal()];
        if (i == 1) {
            return f0Var.mo28284i().toString();
        }
        if (i != 2) {
            return null;
        }
        return String.valueOf(f0Var.mo28283h());
    }

    /* renamed from: a */
    private String m40788a(C11209y1.C11214e eVar, String str, String str2) {
        long parseLong;
        if (eVar == null) {
            return str;
        }
        switch (C11134a.f32011c[eVar.ordinal()]) {
            case 1:
                if (str != null && str2 != null) {
                    parseLong = Long.parseLong(str) + Long.parseLong(str2);
                    break;
                } else {
                    return str;
                }
            case 2:
                if (str != null && str2 != null) {
                    parseLong = Long.parseLong(str) * Long.parseLong(str2);
                    break;
                } else {
                    return str;
                }
            case 3:
                if (str != null && str2 != null) {
                    parseLong = Long.parseLong(str) / Long.parseLong(str2);
                    break;
                } else {
                    return str;
                }
            case 4:
                if (str != null && str2 != null) {
                    parseLong = Long.parseLong(str) - Long.parseLong(str2);
                    break;
                } else {
                    return str;
                }
            case 5:
                return str == null ? str : str.toLowerCase();
            case 6:
                return str == null ? str : str.toUpperCase();
            case 7:
                if (str != null) {
                    parseLong = Math.abs(Long.parseLong(str));
                    break;
                } else {
                    return str;
                }
            default:
                return null;
        }
        return String.valueOf(parseLong);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        if (r2.equals("LastSubmitTimestamp") == false) goto L_0x00d4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo29049a(java.lang.String r13, com.medallia.digital.mobilesdk.C11209y1.C11218i r14) {
        /*
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "$"
            boolean r2 = r13.startsWith(r1)
            if (r2 != 0) goto L_0x000d
            return r13
        L_0x000d:
            java.lang.String r2 = "$CUSTOM_PARAM."
            boolean r2 = r13.startsWith(r2)
            java.lang.String r3 = "\\."
            java.lang.String r4 = ""
            r5 = 2
            if (r2 != 0) goto L_0x002c
            java.lang.String r2 = "$OCQ_RULE."
            boolean r2 = r13.startsWith(r2)
            if (r2 == 0) goto L_0x0023
            goto L_0x002c
        L_0x0023:
            java.lang.String r13 = r13.replace(r1, r4)
            java.lang.String[] r13 = r13.split(r3)
            goto L_0x0034
        L_0x002c:
            java.lang.String r13 = r13.replace(r1, r4)
            java.lang.String[] r13 = r13.split(r3, r5)
        L_0x0034:
            int r1 = r13.length
            if (r1 == 0) goto L_0x0289
            r1 = 0
            r2 = r13[r1]
            if (r2 == 0) goto L_0x0289
            r3 = 1
            r4 = r13[r3]
            if (r4 != 0) goto L_0x0043
            goto L_0x0289
        L_0x0043:
            com.medallia.digital.mobilesdk.y1$h r2 = com.medallia.digital.mobilesdk.C11209y1.C11217h.m41117a(r2)
            if (r2 != 0) goto L_0x004a
            return r0
        L_0x004a:
            int[] r4 = com.medallia.digital.mobilesdk.C11133u7.C11134a.f32012d
            int r2 = r2.ordinal()
            r2 = r4[r2]
            if (r2 == r3) goto L_0x0282
            if (r2 == r5) goto L_0x027b
            r14 = 3
            if (r2 == r14) goto L_0x0064
            r14 = 4
            if (r2 == r14) goto L_0x005d
            return r0
        L_0x005d:
            r13 = r13[r3]
            java.lang.String r13 = r12.m40789b(r13)
            return r13
        L_0x0064:
            int r2 = r13.length
            if (r2 != r14) goto L_0x027a
            r2 = r13[r3]
            r13 = r13[r5]
            com.medallia.digital.mobilesdk.f0 r4 = r12.m40786a(r2)
            java.lang.String r13 = r12.m40787a((com.medallia.digital.mobilesdk.C10802f0) r4, (java.lang.String) r13)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "TREV2 collectorName: "
            r4.append(r6)
            r4.append(r2)
            java.lang.String r7 = " getValueFrom returned: "
            r4.append(r7)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r4)
            java.lang.String r4 = "LastSubmitTimestamp"
            boolean r8 = r4.equals(r2)
            java.lang.String r9 = "SessionCalculatedPercentage"
            java.lang.String r10 = "InvitationDisplayed"
            java.lang.String r11 = "LastDeclineTimestamp"
            if (r8 != 0) goto L_0x00af
            boolean r8 = r11.equals(r2)
            if (r8 != 0) goto L_0x00af
            boolean r8 = r10.equals(r2)
            if (r8 != 0) goto L_0x00af
            boolean r8 = r9.equals(r2)
            if (r8 == 0) goto L_0x00c7
        L_0x00af:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r2)
            r8.append(r7)
            r8.append(r13)
            java.lang.String r6 = r8.toString()
            com.medallia.digital.mobilesdk.Broadcasts.C10695h.m38952a(r6)
        L_0x00c7:
            if (r13 != 0) goto L_0x0279
            r2.hashCode()
            int r6 = r2.hashCode()
            r7 = -1
            switch(r6) {
                case -644932978: goto L_0x00ef;
                case -531760746: goto L_0x00e6;
                case 727667272: goto L_0x00df;
                case 1677912360: goto L_0x00d6;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            r5 = r7
            goto L_0x00f7
        L_0x00d6:
            boolean r1 = r2.equals(r10)
            if (r1 != 0) goto L_0x00dd
            goto L_0x00d4
        L_0x00dd:
            r5 = r14
            goto L_0x00f7
        L_0x00df:
            boolean r14 = r2.equals(r4)
            if (r14 != 0) goto L_0x00f7
            goto L_0x00d4
        L_0x00e6:
            boolean r14 = r2.equals(r11)
            if (r14 != 0) goto L_0x00ed
            goto L_0x00d4
        L_0x00ed:
            r5 = r3
            goto L_0x00f7
        L_0x00ef:
            boolean r14 = r2.equals(r9)
            if (r14 != 0) goto L_0x00f6
            goto L_0x00d4
        L_0x00f6:
            r5 = r1
        L_0x00f7:
            java.lang.String r14 = " getValueFromString value updated to: "
            java.lang.String r1 = " from SharedPreferences was: "
            java.lang.String r3 = " from SharedPreferences"
            java.lang.String r4 = "TREV2 trying to get "
            java.lang.String r6 = "TREV2 "
            switch(r5) {
                case 0: goto L_0x0213;
                case 1: goto L_0x01ba;
                case 2: goto L_0x0160;
                case 3: goto L_0x0106;
                default: goto L_0x0104;
            }
        L_0x0104:
            goto L_0x0279
        L_0x0106:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r3)
            com.medallia.digital.mobilesdk.s6 r3 = com.medallia.digital.mobilesdk.C11089s6.m40668b()
            com.medallia.digital.mobilesdk.s6$a r4 = com.medallia.digital.mobilesdk.C11089s6.C11090a.INVITATION_DISPLAYED
            java.lang.String r0 = r3.mo28975a((com.medallia.digital.mobilesdk.C11089s6.C11090a) r4, (java.lang.String) r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r2)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r1)
            if (r0 == 0) goto L_0x0279
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            r13.append(r2)
            r13.append(r14)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "TREV2 InvitationDisplayed getValueFromString updated from SharedPreferences to: "
            goto L_0x026b
        L_0x0160:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r3)
            com.medallia.digital.mobilesdk.s6 r3 = com.medallia.digital.mobilesdk.C11089s6.m40668b()
            com.medallia.digital.mobilesdk.s6$a r4 = com.medallia.digital.mobilesdk.C11089s6.C11090a.LAST_SUBMIT_TIMESTAMP
            java.lang.String r0 = r3.mo28975a((com.medallia.digital.mobilesdk.C11089s6.C11090a) r4, (java.lang.String) r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r2)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r1)
            if (r0 == 0) goto L_0x0279
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            r13.append(r2)
            r13.append(r14)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "TREV2 LastSubmitTimestamp getValueFromString updated from SharedPreferences to: "
            goto L_0x026b
        L_0x01ba:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r3)
            com.medallia.digital.mobilesdk.s6 r3 = com.medallia.digital.mobilesdk.C11089s6.m40668b()
            com.medallia.digital.mobilesdk.s6$a r4 = com.medallia.digital.mobilesdk.C11089s6.C11090a.LAST_DECLINE_TIMESTAMP
            java.lang.String r0 = r3.mo28975a((com.medallia.digital.mobilesdk.C11089s6.C11090a) r4, (java.lang.String) r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r2)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r1)
            if (r0 == 0) goto L_0x0279
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            r13.append(r2)
            r13.append(r14)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "TREV2 LastDeclineTimestamp getValueFromString updated from SharedPreferences to: "
            goto L_0x026b
        L_0x0213:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r3)
            com.medallia.digital.mobilesdk.s6 r3 = com.medallia.digital.mobilesdk.C11089s6.m40668b()
            com.medallia.digital.mobilesdk.s6$a r4 = com.medallia.digital.mobilesdk.C11089s6.C11090a.SESSION_CALCULATED_PERCENTAGE
            java.lang.String r0 = r3.mo28975a((com.medallia.digital.mobilesdk.C11089s6.C11090a) r4, (java.lang.String) r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r2)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r1)
            if (r0 == 0) goto L_0x0279
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            r13.append(r2)
            r13.append(r14)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "TREV2 SessionCalculatedPercentage getValueFromString updated from SharedPreferences to: "
        L_0x026b:
            r13.append(r14)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.medallia.digital.mobilesdk.Broadcasts.C10695h.m38952a(r13)
            r13 = r0
        L_0x0279:
            return r13
        L_0x027a:
            return r0
        L_0x027b:
            r13 = r13[r3]
            java.lang.String r13 = r12.m40790b(r13, r14)
            return r13
        L_0x0282:
            r13 = r13[r3]
            java.lang.String r13 = r12.m40791c(r13)
            return r13
        L_0x0289:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11133u7.mo29049a(java.lang.String, com.medallia.digital.mobilesdk.y1$i):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo29050a(ArrayList<C10840g6> arrayList, String str, C11209y1.C11218i iVar) {
        if (!(arrayList == null || str == null)) {
            Iterator<C10840g6> it = arrayList.iterator();
            while (it.hasNext()) {
                C10840g6 next = it.next();
                str = m40788a(next.mo28356a(), str, mo29049a(next.mo28357b(), iVar));
            }
        }
        return str;
    }
}
