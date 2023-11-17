package com.google.protobuf;

import android.support.p013v4.media.session.C0125b;
import com.google.protobuf.C5679h1;
import com.google.protobuf.C5716s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.n */
final class C5699n {

    /* renamed from: d */
    private static final C5699n f17974d = new C5699n(true);

    /* renamed from: a */
    private final C5737y0 f17975a;

    /* renamed from: b */
    private boolean f17976b;

    /* renamed from: c */
    private boolean f17977c;

    /* renamed from: com.google.protobuf.n$a */
    static /* synthetic */ class C5700a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17978a;

        /* renamed from: b */
        static final /* synthetic */ int[] f17979b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.google.protobuf.h1$b[] r0 = com.google.protobuf.C5679h1.C5681b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17979b = r0
                r1 = 1
                com.google.protobuf.h1$b r2 = com.google.protobuf.C5679h1.C5681b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f17979b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.h1$b r3 = com.google.protobuf.C5679h1.C5681b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f17979b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.h1$b r4 = com.google.protobuf.C5679h1.C5681b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f17979b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.h1$b r5 = com.google.protobuf.C5679h1.C5681b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f17979b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.h1$b r6 = com.google.protobuf.C5679h1.C5681b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f17979b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.h1$b r7 = com.google.protobuf.C5679h1.C5681b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f17979b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.h1$b r8 = com.google.protobuf.C5679h1.C5681b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f17979b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.h1$b r9 = com.google.protobuf.C5679h1.C5681b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f17979b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.h1$b r10 = com.google.protobuf.C5679h1.C5681b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f17979b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.h1$b r10 = com.google.protobuf.C5679h1.C5681b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f17979b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.h1$b r10 = com.google.protobuf.C5679h1.C5681b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f17979b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.h1$b r10 = com.google.protobuf.C5679h1.C5681b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f17979b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.h1$b r10 = com.google.protobuf.C5679h1.C5681b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f17979b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.h1$b r10 = com.google.protobuf.C5679h1.C5681b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f17979b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.h1$b r10 = com.google.protobuf.C5679h1.C5681b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f17979b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.h1$b r10 = com.google.protobuf.C5679h1.C5681b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f17979b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.h1$b r10 = com.google.protobuf.C5679h1.C5681b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f17979b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.h1$b r10 = com.google.protobuf.C5679h1.C5681b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.protobuf.h1$c[] r9 = com.google.protobuf.C5679h1.C5686c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f17978a = r9
                com.google.protobuf.h1$c r10 = com.google.protobuf.C5679h1.C5686c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f17978a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.protobuf.h1$c r9 = com.google.protobuf.C5679h1.C5686c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f17978a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.protobuf.h1$c r1 = com.google.protobuf.C5679h1.C5686c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f17978a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.protobuf.h1$c r1 = com.google.protobuf.C5679h1.C5686c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f17978a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.protobuf.h1$c r1 = com.google.protobuf.C5679h1.C5686c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f17978a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.protobuf.h1$c r1 = com.google.protobuf.C5679h1.C5686c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f17978a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.protobuf.h1$c r1 = com.google.protobuf.C5679h1.C5686c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f17978a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.protobuf.h1$c r1 = com.google.protobuf.C5679h1.C5686c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f17978a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.protobuf.h1$c r1 = com.google.protobuf.C5679h1.C5686c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5699n.C5700a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.n$b */
    public interface C5701b extends Comparable {
        /* renamed from: i */
        int mo18739i();

        /* renamed from: k */
        boolean mo18740k();

        /* renamed from: m */
        C5679h1.C5681b mo18741m();

        /* renamed from: p */
        boolean mo18742p();
    }

    private C5699n() {
        this.f17975a = C5737y0.m23122s(16);
    }

    /* renamed from: b */
    static int m22895b(C5679h1.C5681b bVar, int i, Object obj) {
        int O = CodedOutputStream.m22319O(i);
        if (bVar == C5679h1.C5681b.GROUP) {
            O *= 2;
        }
        return O + m22896c(bVar, obj);
    }

    /* renamed from: c */
    static int m22896c(C5679h1.C5681b bVar, Object obj) {
        switch (C5700a.f17979b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.m22335j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m22343r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m22350y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m22323S(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m22348w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m22341p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m22339n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m22330e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m22345t((C5677h0) obj);
            case 10:
                return CodedOutputStream.m22306B((C5677h0) obj);
            case 11:
                if (obj instanceof C5648f) {
                    return CodedOutputStream.m22333h((C5648f) obj);
                }
                return CodedOutputStream.m22318N((String) obj);
            case 12:
                if (obj instanceof C5648f) {
                    return CodedOutputStream.m22333h((C5648f) obj);
                }
                return CodedOutputStream.m22331f((byte[]) obj);
            case 13:
                return CodedOutputStream.m22321Q(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m22310F(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m22312H(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m22314J(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m22316L(((Long) obj).longValue());
            case 18:
                if (obj instanceof C5716s.C5717a) {
                    return CodedOutputStream.m22337l(((C5716s.C5717a) obj).mo18790i());
                }
                return CodedOutputStream.m22337l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: d */
    public static int m22897d(C5701b bVar, Object obj) {
        C5679h1.C5681b m = bVar.mo18741m();
        int i = bVar.mo18739i();
        if (!bVar.mo18740k()) {
            return m22895b(m, i, obj);
        }
        int i2 = 0;
        if (bVar.mo18742p()) {
            for (Object c : (List) obj) {
                i2 += m22896c(m, c);
            }
            return CodedOutputStream.m22319O(i) + i2 + CodedOutputStream.m22321Q(i2);
        }
        for (Object b : (List) obj) {
            i2 += m22895b(m, i, b);
        }
        return i2;
    }

    /* renamed from: g */
    private int m22898g(Map.Entry entry) {
        C0125b.m366a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* renamed from: i */
    static int m22899i(C5679h1.C5681b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.mo18709c();
    }

    /* renamed from: l */
    private static boolean m22900l(Map.Entry entry) {
        C0125b.m366a(entry.getKey());
        throw null;
    }

    /* renamed from: m */
    private static boolean m22901m(C5679h1.C5681b bVar, Object obj) {
        C5716s.m22990a(obj);
        switch (C5700a.f17978a[bVar.mo18708b().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof C5648f) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof C5716s.C5717a)) {
                    return true;
                }
                return false;
            case 9:
                if (!(obj instanceof C5677h0)) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: q */
    private void m22902q(Map.Entry entry) {
        C0125b.m366a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* renamed from: r */
    public static C5699n m22903r() {
        return new C5699n();
    }

    /* renamed from: t */
    private void m22904t(C5701b bVar, Object obj) {
        if (!m22901m(bVar.mo18741m(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(bVar.mo18739i()), bVar.mo18741m().mo18708b(), obj.getClass().getName()}));
        }
    }

    /* renamed from: u */
    static void m22905u(CodedOutputStream codedOutputStream, C5679h1.C5681b bVar, int i, Object obj) {
        if (bVar == C5679h1.C5681b.GROUP) {
            codedOutputStream.mo18507r0(i, (C5677h0) obj);
            return;
        }
        codedOutputStream.mo18480N0(i, m22899i(bVar, false));
        m22906v(codedOutputStream, bVar, obj);
    }

    /* renamed from: v */
    static void m22906v(CodedOutputStream codedOutputStream, C5679h1.C5681b bVar, Object obj) {
        switch (C5700a.f17979b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.mo18498i0(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.mo18506q0(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.mo18514y0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo18484R0(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo18512w0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo18504o0(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo18502m0(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo18492c0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.mo18509t0((C5677h0) obj);
                return;
            case 10:
                codedOutputStream.mo18467A0((C5677h0) obj);
                return;
            case 11:
                if (obj instanceof C5648f) {
                    codedOutputStream.mo18496g0((C5648f) obj);
                    return;
                } else {
                    codedOutputStream.mo18479M0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C5648f) {
                    codedOutputStream.mo18496g0((C5648f) obj);
                    return;
                } else {
                    codedOutputStream.mo18493d0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.mo18482P0(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.mo18471E0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo18473G0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.mo18475I0(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.mo18477K0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof C5716s.C5717a) {
                    codedOutputStream.mo18500k0(((C5716s.C5717a) obj).mo18790i());
                    return;
                } else {
                    codedOutputStream.mo18500k0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public C5699n clone() {
        C5699n r = m22903r();
        for (int i = 0; i < this.f17975a.mo18826m(); i++) {
            Map.Entry l = this.f17975a.mo18825l(i);
            C0125b.m366a(l.getKey());
            r.mo18738s((C5701b) null, l.getValue());
        }
        for (Map.Entry entry : this.f17975a.mo18828o()) {
            C0125b.m366a(entry.getKey());
            r.mo18738s((C5701b) null, entry.getValue());
        }
        r.f17977c = this.f17977c;
        return r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Iterator mo18728e() {
        if (this.f17977c) {
            return new C5727v(this.f17975a.mo18824i().iterator());
        }
        return this.f17975a.mo18824i().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5699n)) {
            return false;
        }
        return this.f17975a.equals(((C5699n) obj).f17975a);
    }

    /* renamed from: f */
    public int mo18730f() {
        int i = 0;
        for (int i2 = 0; i2 < this.f17975a.mo18826m(); i2++) {
            i += m22898g(this.f17975a.mo18825l(i2));
        }
        for (Map.Entry g : this.f17975a.mo18828o()) {
            i += m22898g(g);
        }
        return i;
    }

    /* renamed from: h */
    public int mo18731h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f17975a.mo18826m(); i2++) {
            Map.Entry l = this.f17975a.mo18825l(i2);
            C0125b.m366a(l.getKey());
            i += m22897d((C5701b) null, l.getValue());
        }
        for (Map.Entry entry : this.f17975a.mo18828o()) {
            C0125b.m366a(entry.getKey());
            i += m22897d((C5701b) null, entry.getValue());
        }
        return i;
    }

    public int hashCode() {
        return this.f17975a.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo18733j() {
        return this.f17975a.isEmpty();
    }

    /* renamed from: k */
    public boolean mo18734k() {
        for (int i = 0; i < this.f17975a.mo18826m(); i++) {
            if (!m22900l(this.f17975a.mo18825l(i))) {
                return false;
            }
        }
        for (Map.Entry l : this.f17975a.mo18828o()) {
            if (!m22900l(l)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public Iterator mo18735n() {
        if (this.f17977c) {
            return new C5727v(this.f17975a.entrySet().iterator());
        }
        return this.f17975a.entrySet().iterator();
    }

    /* renamed from: o */
    public void mo18736o() {
        if (!this.f17976b) {
            for (int i = 0; i < this.f17975a.mo18826m(); i++) {
                Map.Entry l = this.f17975a.mo18825l(i);
                if (l.getValue() instanceof C5709q) {
                    ((C5709q) l.getValue()).mo18750I();
                }
            }
            this.f17975a.mo18830r();
            this.f17976b = true;
        }
    }

    /* renamed from: p */
    public void mo18737p(C5699n nVar) {
        for (int i = 0; i < nVar.f17975a.mo18826m(); i++) {
            m22902q(nVar.f17975a.mo18825l(i));
        }
        for (Map.Entry q : nVar.f17975a.mo18828o()) {
            m22902q(q);
        }
    }

    /* renamed from: s */
    public void mo18738s(C5701b bVar, Object obj) {
        if (!bVar.mo18740k()) {
            m22904t(bVar, obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object t : arrayList) {
                m22904t(bVar, t);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f17975a.mo18833t(bVar, obj);
    }

    private C5699n(boolean z) {
        this(C5737y0.m23122s(0));
        mo18736o();
    }

    private C5699n(C5737y0 y0Var) {
        this.f17975a = y0Var;
        mo18736o();
    }
}
