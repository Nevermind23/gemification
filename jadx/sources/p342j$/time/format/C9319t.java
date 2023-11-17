package p342j$.time.format;

import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p342j$.time.chrono.C9295g;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9341i;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.t */
public final class C9319t {

    /* renamed from: h */
    private static final C9300a f25820h = new C9300a();

    /* renamed from: i */
    private static final Map f25821i;

    /* renamed from: j */
    public static final /* synthetic */ int f25822j = 0;

    /* renamed from: a */
    private C9319t f25823a;

    /* renamed from: b */
    private final C9319t f25824b;

    /* renamed from: c */
    private final List f25825c;

    /* renamed from: d */
    private final boolean f25826d;

    /* renamed from: e */
    private int f25827e;

    /* renamed from: f */
    private char f25828f;

    /* renamed from: g */
    private int f25829g;

    static {
        HashMap hashMap = new HashMap();
        f25821i = hashMap;
        hashMap.put('G', C9333a.ERA);
        hashMap.put('y', C9333a.YEAR_OF_ERA);
        hashMap.put('u', C9333a.YEAR);
        TemporalField temporalField = C9341i.f25877a;
        hashMap.put('Q', temporalField);
        hashMap.put('q', temporalField);
        C9333a aVar = C9333a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', C9333a.DAY_OF_YEAR);
        hashMap.put('d', C9333a.DAY_OF_MONTH);
        hashMap.put('F', C9333a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        C9333a aVar2 = C9333a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', C9333a.AMPM_OF_DAY);
        hashMap.put('H', C9333a.HOUR_OF_DAY);
        hashMap.put('k', C9333a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', C9333a.HOUR_OF_AMPM);
        hashMap.put('h', C9333a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', C9333a.MINUTE_OF_HOUR);
        hashMap.put('s', C9333a.SECOND_OF_MINUTE);
        C9333a aVar3 = C9333a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', C9333a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', C9333a.NANO_OF_DAY);
    }

    public C9319t() {
        this.f25823a = this;
        this.f25825c = new ArrayList();
        this.f25829g = -1;
        this.f25824b = null;
        this.f25826d = false;
    }

    private C9319t(C9319t tVar) {
        this.f25823a = this;
        this.f25825c = new ArrayList();
        this.f25829g = -1;
        this.f25824b = tVar;
        this.f25826d = true;
    }

    /* renamed from: d */
    private int m34360d(C9306g gVar) {
        if (gVar != null) {
            C9319t tVar = this.f25823a;
            int i = tVar.f25827e;
            if (i > 0) {
                C9312m mVar = new C9312m(gVar, i, tVar.f25828f);
                tVar.f25827e = 0;
                tVar.f25828f = 0;
                gVar = mVar;
            }
            ((ArrayList) tVar.f25825c).add(gVar);
            C9319t tVar2 = this.f25823a;
            tVar2.f25829g = -1;
            return ((ArrayList) tVar2.f25825c).size() - 1;
        }
        throw new NullPointerException("pp");
    }

    /* renamed from: m */
    private void m34361m(C9310k kVar) {
        C9310k kVar2;
        C9319t tVar = this.f25823a;
        int i = tVar.f25829g;
        if (i >= 0) {
            C9310k kVar3 = (C9310k) ((ArrayList) tVar.f25825c).get(i);
            int i2 = kVar.f25795b;
            int i3 = kVar.f25796c;
            if (i2 == i3 && kVar.f25797d == C9299A.NOT_NEGATIVE) {
                kVar2 = kVar3.mo25048e(i3);
                m34360d(kVar.mo25047d());
                this.f25823a.f25829g = i;
            } else {
                kVar2 = kVar3.mo25047d();
                this.f25823a.f25829g = m34360d(kVar);
            }
            ((ArrayList) this.f25823a.f25825c).set(i, kVar2);
            return;
        }
        tVar.f25829g = m34360d(kVar);
    }

    /* renamed from: w */
    private DateTimeFormatter m34362w(Locale locale, C9325z zVar, C9295g gVar) {
        if (locale != null) {
            while (this.f25823a.f25824b != null) {
                mo25069p();
            }
            C9305f fVar = new C9305f(this.f25825c, false);
            C9324y yVar = C9324y.f25841a;
            return new DateTimeFormatter(fVar, locale, zVar, gVar);
        }
        throw new NullPointerException(C11772k.C11773a.f34182n);
    }

    /* renamed from: a */
    public final void mo25056a(DateTimeFormatter dateTimeFormatter) {
        m34360d(dateTimeFormatter.mo25032e());
    }

    /* renamed from: b */
    public final void mo25057b(C9333a aVar, int i, int i2, boolean z) {
        m34360d(new C9307h(aVar, i, i2, z));
    }

    /* renamed from: c */
    public final void mo25058c() {
        m34360d(new C9308i());
    }

    /* renamed from: e */
    public final void mo25059e(char c) {
        m34360d(new C9304e(c));
    }

    /* renamed from: f */
    public final void mo25060f(String str) {
        if (str == null) {
            throw new NullPointerException("literal");
        } else if (str.length() > 0) {
            m34360d(str.length() == 1 ? new C9304e(str.charAt(0)) : new C9309j(str, 1));
        }
    }

    /* renamed from: g */
    public final void mo25061g(String str, String str2) {
        m34360d(new C9311l(str, str2));
    }

    /* renamed from: h */
    public final void mo25062h() {
        m34360d(C9311l.f25800d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dc, code lost:
        if (r3 == 1) goto L_0x01dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0292 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x03b0 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25063i(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            if (r1 == 0) goto L_0x0404
            r2 = 0
            r3 = r2
        L_0x0008:
            int r4 = r17.length()
            if (r3 >= r4) goto L_0x0403
            char r4 = r1.charAt(r3)
            r5 = 1
            r6 = 65
            r7 = 122(0x7a, float:1.71E-43)
            r8 = 90
            r9 = 97
            if (r4 < r6) goto L_0x001f
            if (r4 <= r8) goto L_0x0023
        L_0x001f:
            if (r4 < r9) goto L_0x036b
            if (r4 > r7) goto L_0x036b
        L_0x0023:
            int r10 = r3 + 1
        L_0x0025:
            int r11 = r17.length()
            if (r10 >= r11) goto L_0x0034
            char r11 = r1.charAt(r10)
            if (r11 != r4) goto L_0x0034
            int r10 = r10 + 1
            goto L_0x0025
        L_0x0034:
            int r3 = r10 - r3
            r11 = 112(0x70, float:1.57E-43)
            r12 = -1
            if (r4 != r11) goto L_0x0095
            int r11 = r17.length()
            if (r10 >= r11) goto L_0x0061
            char r4 = r1.charAt(r10)
            if (r4 < r6) goto L_0x0049
            if (r4 <= r8) goto L_0x004d
        L_0x0049:
            if (r4 < r9) goto L_0x0061
            if (r4 > r7) goto L_0x0061
        L_0x004d:
            int r6 = r10 + 1
        L_0x004f:
            int r11 = r17.length()
            if (r6 >= r11) goto L_0x005e
            char r11 = r1.charAt(r6)
            if (r11 != r4) goto L_0x005e
            int r6 = r6 + 1
            goto L_0x004f
        L_0x005e:
            int r10 = r6 - r10
            goto L_0x0064
        L_0x0061:
            r6 = r10
            r10 = r3
            r3 = r2
        L_0x0064:
            if (r3 == 0) goto L_0x0089
            if (r3 < r5) goto L_0x0075
            j$.time.format.t r11 = r0.f25823a
            r11.f25827e = r3
            r3 = 32
            r11.f25828f = r3
            r11.f25829g = r12
            r3 = r10
            r10 = r6
            goto L_0x0095
        L_0x0075:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "The pad width must be at least one but was "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0089:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Pad letter 'p' must be followed by valid pad pattern: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x0095:
            java.util.Map r6 = f25821i
            java.lang.Character r11 = java.lang.Character.valueOf(r4)
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r6 = r6.get(r11)
            j$.time.temporal.TemporalField r6 = (p342j$.time.temporal.TemporalField) r6
            r11 = 2
            r13 = 5
            r14 = 4
            java.lang.String r15 = "Too many pattern letters: "
            if (r6 == 0) goto L_0x01f4
            r7 = 19
            r8 = 81
            r12 = 3
            if (r4 == r8) goto L_0x0195
            r8 = 83
            if (r4 == r8) goto L_0x018d
            if (r4 == r9) goto L_0x0178
            r8 = 104(0x68, float:1.46E-43)
            if (r4 == r8) goto L_0x015c
            r8 = 107(0x6b, float:1.5E-43)
            if (r4 == r8) goto L_0x015c
            r8 = 109(0x6d, float:1.53E-43)
            if (r4 == r8) goto L_0x015c
            r8 = 113(0x71, float:1.58E-43)
            if (r4 == r8) goto L_0x015a
            r8 = 115(0x73, float:1.61E-43)
            if (r4 == r8) goto L_0x015c
            r8 = 117(0x75, float:1.64E-43)
            if (r4 == r8) goto L_0x0138
            r8 = 121(0x79, float:1.7E-43)
            if (r4 == r8) goto L_0x0138
            switch(r4) {
                case 68: goto L_0x0114;
                case 69: goto L_0x0195;
                case 70: goto L_0x00fe;
                case 71: goto L_0x00e0;
                case 72: goto L_0x015c;
                default: goto L_0x00d6;
            }
        L_0x00d6:
            switch(r4) {
                case 75: goto L_0x015c;
                case 76: goto L_0x015a;
                case 77: goto L_0x0195;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            switch(r4) {
                case 99: goto L_0x012d;
                case 100: goto L_0x015c;
                case 101: goto L_0x0195;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            if (r3 != r5) goto L_0x0162
            goto L_0x01dc
        L_0x00e0:
            if (r3 == r5) goto L_0x01d4
            if (r3 == r11) goto L_0x01d4
            if (r3 == r12) goto L_0x01d4
            if (r3 == r14) goto L_0x01bf
            if (r3 != r13) goto L_0x00ec
            goto L_0x01a5
        L_0x00ec:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00fe:
            if (r3 != r5) goto L_0x0102
            goto L_0x01dc
        L_0x0102:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0114:
            if (r3 != r5) goto L_0x0118
            goto L_0x01dc
        L_0x0118:
            if (r3 > r12) goto L_0x011b
            goto L_0x0162
        L_0x011b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x012d:
            if (r3 == r11) goto L_0x0130
            goto L_0x015a
        L_0x0130:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid pattern \"cc\""
            r1.<init>(r2)
            throw r1
        L_0x0138:
            if (r3 != r11) goto L_0x014f
            j$.time.LocalDate r3 = p342j$.time.format.C9313n.f25806i
            if (r3 == 0) goto L_0x0147
            j$.time.format.n r4 = new j$.time.format.n
            r4.<init>(r6, r3)
            r0.m34361m(r4)
            goto L_0x0192
        L_0x0147:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "baseDate"
            r1.<init>(r2)
            throw r1
        L_0x014f:
            if (r3 >= r14) goto L_0x0154
            j$.time.format.A r4 = p342j$.time.format.C9299A.NORMAL
            goto L_0x0156
        L_0x0154:
            j$.time.format.A r4 = p342j$.time.format.C9299A.EXCEEDS_PAD
        L_0x0156:
            r0.mo25066l(r6, r3, r7, r4)
            goto L_0x0192
        L_0x015a:
            r8 = r5
            goto L_0x0196
        L_0x015c:
            if (r3 != r5) goto L_0x0160
            goto L_0x01dc
        L_0x0160:
            if (r3 != r11) goto L_0x0166
        L_0x0162:
            r0.mo25067n(r6, r3)
            goto L_0x0192
        L_0x0166:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0178:
            if (r3 != r5) goto L_0x017b
            goto L_0x01d4
        L_0x017b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x018d:
            j$.time.temporal.a r4 = p342j$.time.temporal.C9333a.NANO_OF_SECOND
            r0.mo25057b(r4, r3, r3, r2)
        L_0x0192:
            r3 = -1
            goto L_0x0354
        L_0x0195:
            r8 = r2
        L_0x0196:
            if (r3 == r5) goto L_0x01c7
            if (r3 == r11) goto L_0x01c7
            if (r3 == r12) goto L_0x01c2
            if (r3 == r14) goto L_0x01ba
            if (r3 != r13) goto L_0x01a8
            if (r8 == 0) goto L_0x01a5
            j$.time.format.TextStyle r3 = p342j$.time.format.TextStyle.NARROW_STANDALONE
            goto L_0x01d6
        L_0x01a5:
            j$.time.format.TextStyle r3 = p342j$.time.format.TextStyle.NARROW
            goto L_0x01d6
        L_0x01a8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01ba:
            if (r8 == 0) goto L_0x01bf
            j$.time.format.TextStyle r3 = p342j$.time.format.TextStyle.FULL_STANDALONE
            goto L_0x01d6
        L_0x01bf:
            j$.time.format.TextStyle r3 = p342j$.time.format.TextStyle.FULL
            goto L_0x01d6
        L_0x01c2:
            if (r8 == 0) goto L_0x01d4
            j$.time.format.TextStyle r3 = p342j$.time.format.TextStyle.SHORT_STANDALONE
            goto L_0x01d6
        L_0x01c7:
            r8 = 99
            if (r4 == r8) goto L_0x01eb
            r8 = 101(0x65, float:1.42E-43)
            if (r4 != r8) goto L_0x01d0
            goto L_0x01eb
        L_0x01d0:
            r8 = 69
            if (r4 != r8) goto L_0x01da
        L_0x01d4:
            j$.time.format.TextStyle r3 = p342j$.time.format.TextStyle.SHORT
        L_0x01d6:
            r0.mo25065k(r6, r3)
            goto L_0x0192
        L_0x01da:
            if (r3 != r5) goto L_0x01e7
        L_0x01dc:
            j$.time.format.k r3 = new j$.time.format.k
            j$.time.format.A r4 = p342j$.time.format.C9299A.NORMAL
            r3.<init>(r6, r5, r7, r4)
            r0.m34361m(r3)
            goto L_0x0192
        L_0x01e7:
            r0.mo25067n(r6, r11)
            goto L_0x0192
        L_0x01eb:
            j$.time.format.q r6 = new j$.time.format.q
            r6.<init>(r4, r3)
            r0.m34360d(r6)
            goto L_0x0192
        L_0x01f4:
            if (r4 != r7) goto L_0x021a
            if (r3 > r14) goto L_0x0208
            if (r3 != r14) goto L_0x01fd
            j$.time.format.TextStyle r3 = p342j$.time.format.TextStyle.FULL
            goto L_0x01ff
        L_0x01fd:
            j$.time.format.TextStyle r3 = p342j$.time.format.TextStyle.SHORT
        L_0x01ff:
            j$.time.format.s r4 = new j$.time.format.s
            r4.<init>(r3)
            r0.m34360d(r4)
            goto L_0x0192
        L_0x0208:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x021a:
            r6 = 86
            if (r4 != r6) goto L_0x0244
            if (r3 != r11) goto L_0x0230
            j$.time.format.r r3 = new j$.time.format.r
            j$.time.temporal.j r4 = p342j$.time.temporal.C9343k.m34505g()
            java.lang.String r6 = "ZoneId()"
            r3.<init>(r4, r6)
            r0.m34360d(r3)
            goto L_0x0192
        L_0x0230:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Pattern letter count must be 2: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0244:
            java.lang.String r6 = "+0000"
            if (r4 != r8) goto L_0x0268
            if (r3 >= r14) goto L_0x024e
            java.lang.String r3 = "+HHMM"
            goto L_0x02f3
        L_0x024e:
            if (r3 != r14) goto L_0x0251
            goto L_0x0273
        L_0x0251:
            if (r3 != r13) goto L_0x0256
            java.lang.String r3 = "+HH:MM:ss"
            goto L_0x02be
        L_0x0256:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0268:
            r7 = 79
            if (r4 != r7) goto L_0x02ae
            if (r3 != r5) goto L_0x0271
            j$.time.format.TextStyle r3 = p342j$.time.format.TextStyle.SHORT
            goto L_0x0275
        L_0x0271:
            if (r3 != r14) goto L_0x029a
        L_0x0273:
            j$.time.format.TextStyle r3 = p342j$.time.format.TextStyle.FULL
        L_0x0275:
            if (r3 == 0) goto L_0x0292
            j$.time.format.TextStyle r4 = p342j$.time.format.TextStyle.FULL
            if (r3 == r4) goto L_0x0288
            j$.time.format.TextStyle r4 = p342j$.time.format.TextStyle.SHORT
            if (r3 != r4) goto L_0x0280
            goto L_0x0288
        L_0x0280:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Style must be either full or short"
            r1.<init>(r2)
            throw r1
        L_0x0288:
            j$.time.format.j r4 = new j$.time.format.j
            r4.<init>(r3, r2)
            r0.m34360d(r4)
            goto L_0x0192
        L_0x0292:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "style"
            r1.<init>(r2)
            throw r1
        L_0x029a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Pattern letter count must be 1 or 4: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02ae:
            r7 = 88
            if (r4 != r7) goto L_0x02d7
            if (r3 > r13) goto L_0x02c5
            java.lang.String[] r4 = p342j$.time.format.C9311l.f25799c
            if (r3 != r5) goto L_0x02ba
            r6 = r2
            goto L_0x02bb
        L_0x02ba:
            r6 = r5
        L_0x02bb:
            int r3 = r3 + r6
            r3 = r4[r3]
        L_0x02be:
            java.lang.String r4 = "Z"
            r0.mo25061g(r3, r4)
            goto L_0x0192
        L_0x02c5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02d7:
            r7 = 120(0x78, float:1.68E-43)
            if (r4 != r7) goto L_0x030a
            if (r3 > r13) goto L_0x02f8
            if (r3 != r5) goto L_0x02e2
            java.lang.String r6 = "+00"
            goto L_0x02e9
        L_0x02e2:
            int r4 = r3 % 2
            if (r4 != 0) goto L_0x02e7
            goto L_0x02e9
        L_0x02e7:
            java.lang.String r6 = "+00:00"
        L_0x02e9:
            java.lang.String[] r4 = p342j$.time.format.C9311l.f25799c
            if (r3 != r5) goto L_0x02ef
            r7 = r2
            goto L_0x02f0
        L_0x02ef:
            r7 = r5
        L_0x02f0:
            int r3 = r3 + r7
            r3 = r4[r3]
        L_0x02f3:
            r0.mo25061g(r3, r6)
            goto L_0x0192
        L_0x02f8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x030a:
            r6 = 87
            if (r4 != r6) goto L_0x0328
            if (r3 > r5) goto L_0x0316
            j$.time.format.q r6 = new j$.time.format.q
            r6.<init>(r4, r3)
            goto L_0x034f
        L_0x0316:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0328:
            r6 = 119(0x77, float:1.67E-43)
            if (r4 != r6) goto L_0x0346
            if (r3 > r11) goto L_0x0334
            j$.time.format.q r6 = new j$.time.format.q
            r6.<init>(r4, r3)
            goto L_0x034f
        L_0x0334:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0346:
            r6 = 89
            if (r4 != r6) goto L_0x0357
            j$.time.format.q r6 = new j$.time.format.q
            r6.<init>(r4, r3)
        L_0x034f:
            r0.m34360d(r6)
            goto L_0x0192
        L_0x0354:
            int r3 = r3 + r10
            goto L_0x03e9
        L_0x0357:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown pattern letter: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x036b:
            java.lang.String r6 = "'"
            r7 = 39
            if (r4 != r7) goto L_0x03bc
            int r3 = r3 + 1
            r4 = r3
        L_0x0374:
            int r8 = r17.length()
            if (r4 >= r8) goto L_0x0391
            char r8 = r1.charAt(r4)
            if (r8 != r7) goto L_0x038f
            int r8 = r4 + 1
            int r9 = r17.length()
            if (r8 >= r9) goto L_0x0391
            char r9 = r1.charAt(r8)
            if (r9 != r7) goto L_0x0391
            r4 = r8
        L_0x038f:
            int r4 = r4 + r5
            goto L_0x0374
        L_0x0391:
            int r8 = r17.length()
            if (r4 >= r8) goto L_0x03b0
            java.lang.String r3 = r1.substring(r3, r4)
            int r8 = r3.length()
            if (r8 != 0) goto L_0x03a5
            r0.mo25059e(r7)
            goto L_0x03ae
        L_0x03a5:
            java.lang.String r7 = "''"
            java.lang.String r3 = r3.replace(r7, r6)
            r0.mo25060f(r3)
        L_0x03ae:
            r3 = r4
            goto L_0x03e9
        L_0x03b0:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Pattern ends with an incomplete string literal: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x03bc:
            r7 = 91
            if (r4 != r7) goto L_0x03c4
            r16.mo25070q()
            goto L_0x03e9
        L_0x03c4:
            r7 = 93
            if (r4 != r7) goto L_0x03da
            j$.time.format.t r4 = r0.f25823a
            j$.time.format.t r4 = r4.f25824b
            if (r4 == 0) goto L_0x03d2
            r16.mo25069p()
            goto L_0x03e9
        L_0x03d2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Pattern invalid as it contains ] without previous ["
            r1.<init>(r2)
            throw r1
        L_0x03da:
            r7 = 123(0x7b, float:1.72E-43)
            if (r4 == r7) goto L_0x03ec
            r7 = 125(0x7d, float:1.75E-43)
            if (r4 == r7) goto L_0x03ec
            r7 = 35
            if (r4 == r7) goto L_0x03ec
            r0.mo25059e(r4)
        L_0x03e9:
            int r3 = r3 + r5
            goto L_0x0008
        L_0x03ec:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Pattern includes reserved character: '"
            r2.<init>(r3)
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0403:
            return
        L_0x0404:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "pattern"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.time.format.C9319t.mo25063i(java.lang.String):void");
    }

    /* renamed from: j */
    public final void mo25064j(C9333a aVar, Map map) {
        if (aVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            TextStyle textStyle = TextStyle.FULL;
            m34360d(new C9315p(aVar, textStyle, new C9301b(new C9322w(Collections.singletonMap(textStyle, linkedHashMap)))));
            return;
        }
        throw new NullPointerException("field");
    }

    /* renamed from: k */
    public final void mo25065k(TemporalField temporalField, TextStyle textStyle) {
        if (temporalField == null) {
            throw new NullPointerException("field");
        } else if (textStyle != null) {
            m34360d(new C9315p(temporalField, textStyle, new C9323x()));
        } else {
            throw new NullPointerException("textStyle");
        }
    }

    /* renamed from: l */
    public final C9319t mo25066l(TemporalField temporalField, int i, int i2, C9299A a) {
        if (i == i2 && a == C9299A.NOT_NEGATIVE) {
            mo25067n(temporalField, i2);
            return this;
        } else if (temporalField == null) {
            throw new NullPointerException("field");
        } else if (a == null) {
            throw new NullPointerException("signStyle");
        } else if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i2 >= i) {
            m34361m(new C9310k(temporalField, i, i2, a));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    /* renamed from: n */
    public final void mo25067n(TemporalField temporalField, int i) {
        if (temporalField == null) {
            throw new NullPointerException("field");
        } else if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        } else {
            m34361m(new C9310k(temporalField, i, i, C9299A.NOT_NEGATIVE));
        }
    }

    /* renamed from: o */
    public final void mo25068o() {
        m34360d(new C9317r(f25820h, "ZoneRegionId()"));
    }

    /* renamed from: p */
    public final void mo25069p() {
        C9319t tVar = this.f25823a;
        if (tVar.f25824b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        } else if (((ArrayList) tVar.f25825c).size() > 0) {
            C9319t tVar2 = this.f25823a;
            C9305f fVar = new C9305f(tVar2.f25825c, tVar2.f25826d);
            this.f25823a = this.f25823a.f25824b;
            m34360d(fVar);
        } else {
            this.f25823a = this.f25823a.f25824b;
        }
    }

    /* renamed from: q */
    public final void mo25070q() {
        C9319t tVar = this.f25823a;
        tVar.f25829g = -1;
        this.f25823a = new C9319t(tVar);
    }

    /* renamed from: r */
    public final void mo25071r() {
        m34360d(C9314o.INSENSITIVE);
    }

    /* renamed from: s */
    public final void mo25072s() {
        m34360d(C9314o.SENSITIVE);
    }

    /* renamed from: t */
    public final void mo25073t() {
        m34360d(C9314o.LENIENT);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final DateTimeFormatter mo25074u(C9325z zVar, C9295g gVar) {
        return m34362w(Locale.getDefault(), zVar, gVar);
    }

    /* renamed from: v */
    public final DateTimeFormatter mo25075v(Locale locale) {
        return m34362w(locale, C9325z.SMART, (C9295g) null);
    }
}
