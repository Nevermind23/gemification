package p342j$.time.zone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import p342j$.lang.C9284a;
import p342j$.time.Instant;
import p342j$.time.LocalDate;
import p342j$.time.LocalDateTime;
import p342j$.time.ZoneOffset;
import p342j$.util.C9381a;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.zone.c */
public final class C9351c implements Serializable {

    /* renamed from: i */
    private static final long[] f25905i = new long[0];

    /* renamed from: j */
    private static final C9350b[] f25906j = new C9350b[0];

    /* renamed from: k */
    private static final LocalDateTime[] f25907k = new LocalDateTime[0];

    /* renamed from: l */
    private static final C9349a[] f25908l = new C9349a[0];

    /* renamed from: a */
    private final long[] f25909a;

    /* renamed from: b */
    private final ZoneOffset[] f25910b;

    /* renamed from: c */
    private final long[] f25911c;

    /* renamed from: d */
    private final LocalDateTime[] f25912d;

    /* renamed from: e */
    private final ZoneOffset[] f25913e;

    /* renamed from: f */
    private final C9350b[] f25914f;

    /* renamed from: g */
    private final TimeZone f25915g;

    /* renamed from: h */
    private final transient ConcurrentHashMap f25916h = new ConcurrentHashMap();

    private C9351c(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f25910b = zoneOffsetArr;
        zoneOffsetArr[0] = zoneOffset;
        long[] jArr = f25905i;
        this.f25909a = jArr;
        this.f25911c = jArr;
        this.f25912d = f25907k;
        this.f25913e = zoneOffsetArr;
        this.f25914f = f25906j;
        this.f25915g = null;
    }

    C9351c(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f25910b = zoneOffsetArr;
        zoneOffsetArr[0] = m34551k(timeZone.getRawOffset());
        long[] jArr = f25905i;
        this.f25909a = jArr;
        this.f25911c = jArr;
        this.f25912d = f25907k;
        this.f25913e = zoneOffsetArr;
        this.f25914f = f25906j;
        this.f25915g = timeZone;
    }

    /* renamed from: a */
    private static Object m34546a(LocalDateTime localDateTime, C9349a aVar) {
        LocalDateTime c = aVar.mo25146c();
        boolean j = aVar.mo25154j();
        boolean q = localDateTime.mo24985q(c);
        return j ? q ? aVar.mo25151h() : localDateTime.mo24985q(aVar.mo25145a()) ? aVar : aVar.mo25150f() : !q ? aVar.mo25150f() : localDateTime.mo24985q(aVar.mo25145a()) ? aVar.mo25151h() : aVar;
    }

    /* renamed from: b */
    private C9349a[] m34547b(int i) {
        long j;
        long j2;
        int i2 = i;
        Integer valueOf = Integer.valueOf(i);
        C9349a[] aVarArr = (C9349a[]) this.f25916h.get(valueOf);
        if (aVarArr != null) {
            return aVarArr;
        }
        if (this.f25915g != null) {
            C9349a[] aVarArr2 = f25908l;
            if (i2 < 1800) {
                return aVarArr2;
            }
            long x = LocalDateTime.m34245r(i2 - 1).mo24989x(this.f25910b[0]);
            long j3 = 1000;
            int offset = this.f25915g.getOffset(x * 1000);
            long j4 = 31968000 + x;
            while (x < j4) {
                long j5 = 7776000 + x;
                long j6 = x;
                if (offset != this.f25915g.getOffset(j5 * j3)) {
                    x = j6;
                    while (j5 - x > 1) {
                        long j7 = j4;
                        long j8 = C9284a.m34183j(j5 + x, 2);
                        long j9 = j5;
                        if (this.f25915g.getOffset(j8 * 1000) == offset) {
                            x = j8;
                            j5 = j9;
                        } else {
                            j5 = j8;
                        }
                        j3 = 1000;
                        j4 = j7;
                    }
                    j = j4;
                    long j12 = j5;
                    j2 = j3;
                    if (this.f25915g.getOffset(x * j2) == offset) {
                        x = j12;
                    }
                    ZoneOffset k = m34551k(offset);
                    offset = this.f25915g.getOffset(x * j2);
                    ZoneOffset k2 = m34551k(offset);
                    if (m34548c(x, k2) == i2) {
                        aVarArr2 = (C9349a[]) Arrays.copyOf(aVarArr2, aVarArr2.length + 1);
                        aVarArr2[aVarArr2.length - 1] = new C9349a(x, k, k2);
                    }
                } else {
                    j = j4;
                    j2 = j3;
                    x = j5;
                }
                j3 = j2;
                j4 = j;
            }
            if (1916 <= i2 && i2 < 2100) {
                this.f25916h.putIfAbsent(valueOf, aVarArr2);
            }
            return aVarArr2;
        }
        C9350b[] bVarArr = this.f25914f;
        C9349a[] aVarArr3 = new C9349a[bVarArr.length];
        if (bVarArr.length <= 0) {
            if (i2 < 2100) {
                this.f25916h.putIfAbsent(valueOf, aVarArr3);
            }
            return aVarArr3;
        }
        C9350b bVar = bVarArr[0];
        throw null;
    }

    /* renamed from: c */
    private static int m34548c(long j, ZoneOffset zoneOffset) {
        return LocalDate.m34221t(C9284a.m34183j(j + ((long) zoneOffset.mo25008p()), 86400)).getYear();
    }

    /* renamed from: e */
    private Object m34549e(LocalDateTime localDateTime) {
        Object obj = null;
        int i = 0;
        if (this.f25915g != null) {
            C9349a[] b = m34547b(localDateTime.mo24983o());
            if (b.length == 0) {
                return m34551k(this.f25915g.getOffset(localDateTime.mo24989x(this.f25910b[0]) * 1000));
            }
            int length = b.length;
            while (i < length) {
                C9349a aVar = b[i];
                Object a = m34546a(localDateTime, aVar);
                if ((a instanceof C9349a) || a.equals(aVar.mo25151h())) {
                    return a;
                }
                i++;
                obj = a;
            }
            return obj;
        } else if (this.f25911c.length == 0) {
            return this.f25910b[0];
        } else {
            if (this.f25914f.length > 0) {
                LocalDateTime[] localDateTimeArr = this.f25912d;
                if (localDateTime.mo24984p(localDateTimeArr[localDateTimeArr.length - 1])) {
                    C9349a[] b2 = m34547b(localDateTime.mo24983o());
                    int length2 = b2.length;
                    while (i < length2) {
                        C9349a aVar2 = b2[i];
                        Object a2 = m34546a(localDateTime, aVar2);
                        if ((a2 instanceof C9349a) || a2.equals(aVar2.mo25151h())) {
                            return a2;
                        }
                        i++;
                        obj = a2;
                    }
                    return obj;
                }
            }
            int binarySearch = Arrays.binarySearch(this.f25912d, localDateTime);
            if (binarySearch == -1) {
                return this.f25913e[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else {
                LocalDateTime[] localDateTimeArr2 = this.f25912d;
                if (binarySearch < localDateTimeArr2.length - 1) {
                    int i2 = binarySearch + 1;
                    if (localDateTimeArr2[binarySearch].equals(localDateTimeArr2[i2])) {
                        binarySearch = i2;
                    }
                }
            }
            if ((binarySearch & 1) != 0) {
                return this.f25913e[(binarySearch / 2) + 1];
            }
            LocalDateTime[] localDateTimeArr3 = this.f25912d;
            LocalDateTime localDateTime2 = localDateTimeArr3[binarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr3[binarySearch + 1];
            ZoneOffset[] zoneOffsetArr = this.f25913e;
            int i3 = binarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr[i3];
            ZoneOffset zoneOffset2 = zoneOffsetArr[i3 + 1];
            return zoneOffset2.mo25008p() > zoneOffset.mo25008p() ? new C9349a(localDateTime2, zoneOffset, zoneOffset2) : new C9349a(localDateTime3, zoneOffset, zoneOffset2);
        }
    }

    /* renamed from: j */
    public static C9351c m34550j(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return new C9351c(zoneOffset);
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: k */
    private static ZoneOffset m34551k(int i) {
        return ZoneOffset.m34292s(i / 1000);
    }

    /* renamed from: d */
    public final ZoneOffset mo25157d(Instant instant) {
        TimeZone timeZone = this.f25915g;
        if (timeZone != null) {
            return m34551k(timeZone.getOffset(instant.mo24944u()));
        }
        if (this.f25911c.length == 0) {
            return this.f25910b[0];
        }
        long n = instant.mo24940n();
        if (this.f25914f.length > 0) {
            long[] jArr = this.f25911c;
            if (n > jArr[jArr.length - 1]) {
                ZoneOffset[] zoneOffsetArr = this.f25913e;
                C9349a[] b = m34547b(m34548c(n, zoneOffsetArr[zoneOffsetArr.length - 1]));
                C9349a aVar = null;
                for (int i = 0; i < b.length; i++) {
                    aVar = b[i];
                    if (n < aVar.mo25155k()) {
                        return aVar.mo25151h();
                    }
                }
                return aVar.mo25150f();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f25911c, n);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f25913e[binarySearch + 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9351c)) {
            return false;
        }
        C9351c cVar = (C9351c) obj;
        return C9381a.m34639D(this.f25915g, cVar.f25915g) && Arrays.equals(this.f25909a, cVar.f25909a) && Arrays.equals(this.f25910b, cVar.f25910b) && Arrays.equals(this.f25911c, cVar.f25911c) && Arrays.equals(this.f25913e, cVar.f25913e) && Arrays.equals(this.f25914f, cVar.f25914f);
    }

    /* renamed from: f */
    public final C9349a mo25159f(LocalDateTime localDateTime) {
        Object e = m34549e(localDateTime);
        if (e instanceof C9349a) {
            return (C9349a) e;
        }
        return null;
    }

    /* renamed from: g */
    public final List mo25160g(LocalDateTime localDateTime) {
        Object e = m34549e(localDateTime);
        return e instanceof C9349a ? ((C9349a) e).mo25153i() : Collections.singletonList((ZoneOffset) e);
    }

    /* renamed from: h */
    public final boolean mo25161h(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.f25915g;
        if (timeZone != null) {
            zoneOffset = m34551k(timeZone.getRawOffset());
        } else if (this.f25911c.length == 0) {
            zoneOffset = this.f25910b[0];
        } else {
            int binarySearch = Arrays.binarySearch(this.f25909a, instant.mo24940n());
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            zoneOffset = this.f25910b[binarySearch + 1];
        }
        return !zoneOffset.equals(mo25157d(instant));
    }

    public final int hashCode() {
        TimeZone timeZone = this.f25915g;
        return (((((timeZone != null ? timeZone.hashCode() : 0) ^ Arrays.hashCode(this.f25909a)) ^ Arrays.hashCode(this.f25910b)) ^ Arrays.hashCode(this.f25911c)) ^ Arrays.hashCode(this.f25913e)) ^ Arrays.hashCode(this.f25914f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25163i() {
        /*
            r17 = this;
            r0 = r17
            java.util.TimeZone r1 = r0.f25915g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0163
            boolean r1 = r1.useDaylightTime()
            if (r1 != 0) goto L_0x0162
            java.util.TimeZone r1 = r0.f25915g
            int r1 = r1.getDSTSavings()
            if (r1 == 0) goto L_0x0018
            goto L_0x0162
        L_0x0018:
            j$.time.Instant r1 = p342j$.time.Instant.f25737c
            j$.time.b r1 = p342j$.time.C9287b.m34320c()
            j$.time.Instant r1 = r1.mo25018a()
            java.util.TimeZone r4 = r0.f25915g
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 1
            if (r4 == 0) goto L_0x00e8
            long r9 = r1.mo24940n()
            int r4 = r1.mo24941o()
            if (r4 <= 0) goto L_0x003c
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x003c
            long r9 = r9 + r7
        L_0x003c:
            j$.time.ZoneOffset r1 = r0.mo25157d(r1)
            int r1 = m34548c(r9, r1)
            j$.time.zone.a[] r4 = r0.m34547b(r1)
            int r5 = r4.length
            int r5 = r5 - r3
        L_0x004a:
            if (r5 < 0) goto L_0x005d
            r6 = r4[r5]
            long r11 = r6.mo25155k()
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x005a
            r1 = r4[r5]
            goto L_0x015f
        L_0x005a:
            int r5 = r5 + -1
            goto L_0x004a
        L_0x005d:
            r4 = 1800(0x708, float:2.522E-42)
            if (r1 <= r4) goto L_0x014b
            int r1 = r1 - r3
            j$.time.zone.a[] r1 = r0.m34547b(r1)
            int r5 = r1.length
            int r5 = r5 - r3
        L_0x0068:
            if (r5 < 0) goto L_0x007b
            r6 = r1[r5]
            long r11 = r6.mo25155k()
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x0078
            r1 = r1[r5]
            goto L_0x015f
        L_0x0078:
            int r5 = r5 + -1
            goto L_0x0068
        L_0x007b:
            r5 = 31104000(0x1da9c00, double:1.5367418E-316)
            long r5 = r9 - r5
            j$.time.b r1 = p342j$.time.C9287b.m34320c()
            long r11 = r1.mo25019b()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            r15 = 31968000(0x1e7cb00, double:1.57942906E-316)
            long r11 = r11 + r15
            long r5 = java.lang.Math.min(r5, r11)
            java.util.TimeZone r1 = r0.f25915g
            long r7 = r9 - r7
            long r7 = r7 * r13
            int r1 = r1.getOffset(r7)
            j$.time.LocalDate r4 = p342j$.time.LocalDate.m34218of(r4, r3, r3)
            long r7 = r4.mo24948g()
            r11 = 86400(0x15180, double:4.26873E-319)
            long r7 = r7 * r11
        L_0x00a8:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x014b
            java.util.TimeZone r4 = r0.f25915g
            long r11 = r5 * r13
            int r4 = r4.getOffset(r11)
            if (r1 == r4) goto L_0x00e3
            j$.time.ZoneOffset r1 = m34551k(r4)
            int r1 = m34548c(r5, r1)
            int r4 = r1 + 1
            j$.time.zone.a[] r4 = r0.m34547b(r4)
            int r5 = r4.length
            int r5 = r5 - r3
        L_0x00c6:
            if (r5 < 0) goto L_0x00d9
            r6 = r4[r5]
            long r6 = r6.mo25155k()
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d6
            r1 = r4[r5]
            goto L_0x015f
        L_0x00d6:
            int r5 = r5 + -1
            goto L_0x00c6
        L_0x00d9:
            j$.time.zone.a[] r1 = r0.m34547b(r1)
            int r4 = r1.length
            int r4 = r4 - r3
            r1 = r1[r4]
            goto L_0x015f
        L_0x00e3:
            r11 = 7776000(0x76a700, double:3.8418545E-317)
            long r5 = r5 - r11
            goto L_0x00a8
        L_0x00e8:
            long[] r4 = r0.f25911c
            int r4 = r4.length
            if (r4 != 0) goto L_0x00ee
            goto L_0x014b
        L_0x00ee:
            long r9 = r1.mo24940n()
            int r1 = r1.mo24941o()
            if (r1 <= 0) goto L_0x00fd
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00fd
            long r9 = r9 + r7
        L_0x00fd:
            long[] r1 = r0.f25911c
            int r4 = r1.length
            int r4 = r4 - r3
            r4 = r1[r4]
            j$.time.zone.b[] r1 = r0.f25914f
            int r1 = r1.length
            if (r1 <= 0) goto L_0x013f
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x013f
            j$.time.ZoneOffset[] r1 = r0.f25913e
            int r6 = r1.length
            int r6 = r6 - r3
            r1 = r1[r6]
            int r6 = m34548c(r9, r1)
            j$.time.zone.a[] r7 = r0.m34547b(r6)
            int r8 = r7.length
            int r8 = r8 - r3
        L_0x011c:
            if (r8 < 0) goto L_0x012e
            r11 = r7[r8]
            long r11 = r11.mo25155k()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x012b
            r1 = r7[r8]
            goto L_0x015f
        L_0x012b:
            int r8 = r8 + -1
            goto L_0x011c
        L_0x012e:
            int r1 = m34548c(r4, r1)
            int r6 = r6 + -1
            if (r6 <= r1) goto L_0x013f
            j$.time.zone.a[] r1 = r0.m34547b(r6)
            int r4 = r1.length
            int r4 = r4 - r3
            r1 = r1[r4]
            goto L_0x015f
        L_0x013f:
            long[] r1 = r0.f25911c
            int r1 = java.util.Arrays.binarySearch(r1, r9)
            if (r1 >= 0) goto L_0x0149
            int r1 = -r1
            int r1 = r1 - r3
        L_0x0149:
            if (r1 > 0) goto L_0x014d
        L_0x014b:
            r1 = 0
            goto L_0x015f
        L_0x014d:
            j$.time.zone.a r4 = new j$.time.zone.a
            long[] r5 = r0.f25911c
            int r6 = r1 + -1
            r7 = r5[r6]
            j$.time.ZoneOffset[] r5 = r0.f25913e
            r6 = r5[r6]
            r1 = r5[r1]
            r4.<init>((long) r7, (p342j$.time.ZoneOffset) r6, (p342j$.time.ZoneOffset) r1)
            r1 = r4
        L_0x015f:
            if (r1 != 0) goto L_0x0162
            r2 = r3
        L_0x0162:
            return r2
        L_0x0163:
            long[] r1 = r0.f25911c
            int r1 = r1.length
            if (r1 != 0) goto L_0x0169
            r2 = r3
        L_0x0169:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.time.zone.C9351c.mo25163i():boolean");
    }

    public final String toString() {
        StringBuilder sb;
        if (this.f25915g != null) {
            sb = new StringBuilder("ZoneRules[timeZone=");
            sb.append(this.f25915g.getID());
        } else {
            sb = new StringBuilder("ZoneRules[currentStandardOffset=");
            ZoneOffset[] zoneOffsetArr = this.f25910b;
            sb.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
