package p342j$.time;

import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p342j$.lang.C9284a;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.C9344l;
import p342j$.time.temporal.C9346n;
import p342j$.time.temporal.C9347o;
import p342j$.time.temporal.TemporalAccessor;
import p342j$.time.temporal.TemporalField;
import p342j$.time.zone.C9351c;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.ZoneOffset */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, Comparable<ZoneOffset> {
    public static final ZoneOffset UTC = m34292s(0);

    /* renamed from: d */
    private static final ConcurrentHashMap f25756d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e */
    private static final ConcurrentHashMap f25757e = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: f */
    public static final ZoneOffset f25758f = m34292s(-64800);

    /* renamed from: g */
    public static final ZoneOffset f25759g = m34292s(64800);

    /* renamed from: b */
    private final int f25760b;

    /* renamed from: c */
    private final transient String f25761c;

    private ZoneOffset(int i) {
        String str;
        this.f25760b = i;
        if (i == 0) {
            str = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? BankApiResponse.SUCCESSFUL_RESPONSE_CODE : "");
            sb.append(i2);
            String str2 = ":0";
            sb.append(i3 < 10 ? str2 : ":");
            sb.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb.append(i4 >= 10 ? ":" : str2);
                sb.append(i4);
            }
            str = sb.toString();
        }
        this.f25761c = str;
    }

    /* renamed from: o */
    public static ZoneOffset m34289o(TemporalAccessor temporalAccessor) {
        if (temporalAccessor != null) {
            ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.mo24922i(C9343k.m34502d());
            if (zoneOffset != null) {
                return zoneOffset;
            }
            throw new C9288c("Unable to obtain ZoneOffset from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
        }
        throw new NullPointerException("temporal");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p342j$.time.ZoneOffset m34290q(java.lang.String r7) {
        /*
            if (r7 == 0) goto L_0x00aa
            j$.util.concurrent.ConcurrentHashMap r0 = f25757e
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (p342j$.time.ZoneOffset) r0
            if (r0 == 0) goto L_0x000d
            return r0
        L_0x000d:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0060
            r1 = 3
            if (r0 == r1) goto L_0x007c
            r4 = 5
            if (r0 == r4) goto L_0x0056
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x004d
            r5 = 7
            if (r0 == r5) goto L_0x0040
            r1 = 9
            if (r0 != r1) goto L_0x0034
            int r0 = m34293t(r7, r2, r3)
            int r1 = m34293t(r7, r6, r2)
            int r2 = m34293t(r7, r5, r2)
            goto L_0x0082
        L_0x0034:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x0040:
            int r0 = m34293t(r7, r2, r3)
            int r1 = m34293t(r7, r1, r3)
            int r2 = m34293t(r7, r4, r3)
            goto L_0x0082
        L_0x004d:
            int r0 = m34293t(r7, r2, r3)
            int r1 = m34293t(r7, r6, r2)
            goto L_0x005e
        L_0x0056:
            int r0 = m34293t(r7, r2, r3)
            int r1 = m34293t(r7, r1, r3)
        L_0x005e:
            r2 = r3
            goto L_0x0082
        L_0x0060:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x007c:
            int r0 = m34293t(r7, r2, r3)
            r1 = r3
            r2 = r1
        L_0x0082:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x009b
            if (r3 != r5) goto L_0x008f
            goto L_0x009b
        L_0x008f:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L_0x009b:
            if (r3 != r5) goto L_0x00a5
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = m34291r(r7, r0, r1)
            return r7
        L_0x00a5:
            j$.time.ZoneOffset r7 = m34291r(r0, r1, r2)
            return r7
        L_0x00aa:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "offsetId"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.time.ZoneOffset.m34290q(java.lang.String):j$.time.ZoneOffset");
    }

    /* renamed from: r */
    public static ZoneOffset m34291r(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C9288c("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C9288c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C9288c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C9288c("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new C9288c("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        } else if (i3 < -59 || i3 > 59) {
            throw new C9288c("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        } else if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return m34292s((i2 * 60) + (i * 3600) + i3);
        } else {
            throw new C9288c("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    /* renamed from: s */
    public static ZoneOffset m34292s(int i) {
        if (i < -64800 || i > 64800) {
            throw new C9288c("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i % 900 != 0) {
            return new ZoneOffset(i);
        } else {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentHashMap concurrentHashMap = f25756d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
            f25757e.putIfAbsent(zoneOffset2.f25761c, zoneOffset2);
            return zoneOffset2;
        }
    }

    /* renamed from: t */
    private static int m34293t(CharSequence charSequence, int i, boolean z) {
        if (!z || charSequence.charAt(i - 1) == ':') {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
                throw new C9288c("Invalid ID for ZoneOffset, non numeric characters found: " + charSequence);
            }
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new C9288c("Invalid ID for ZoneOffset, colon not found when expected: " + charSequence);
    }

    /* renamed from: b */
    public final boolean mo24916b(TemporalField temporalField) {
        return temporalField instanceof C9333a ? temporalField == C9333a.OFFSET_SECONDS : temporalField != null && temporalField.mo25114h(this);
    }

    public final int compareTo(Object obj) {
        return ((ZoneOffset) obj).f25760b - this.f25760b;
    }

    /* renamed from: e */
    public final C9347o mo24917e(TemporalField temporalField) {
        return C9284a.m34177d(this, temporalField);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f25760b == ((ZoneOffset) obj).f25760b;
        }
        return false;
    }

    /* renamed from: f */
    public final long mo24918f(TemporalField temporalField) {
        if (temporalField == C9333a.OFFSET_SECONDS) {
            return (long) this.f25760b;
        }
        if (!(temporalField instanceof C9333a)) {
            return temporalField.mo25113f(this);
        }
        throw new C9346n("Unsupported field: " + temporalField);
    }

    public final int get(TemporalField temporalField) {
        if (temporalField == C9333a.OFFSET_SECONDS) {
            return this.f25760b;
        }
        if (!(temporalField instanceof C9333a)) {
            return C9284a.m34177d(this, temporalField).mo25134a(temporalField, mo24918f(temporalField));
        }
        throw new C9346n("Unsupported field: " + temporalField);
    }

    public final int hashCode() {
        return this.f25760b;
    }

    /* renamed from: i */
    public final Object mo24922i(C9344l lVar) {
        return (lVar == C9343k.m34502d() || lVar == C9343k.m34504f()) ? this : C9284a.m34176c(this, lVar);
    }

    /* renamed from: l */
    public final String mo25004l() {
        return this.f25761c;
    }

    /* renamed from: m */
    public final C9351c mo25005m() {
        return C9351c.m34550j(this);
    }

    /* renamed from: p */
    public final int mo25008p() {
        return this.f25760b;
    }

    public final String toString() {
        return this.f25761c;
    }
}
