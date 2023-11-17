package p342j$.time.format;

import java.util.Locale;
import p342j$.time.C9288c;
import p342j$.time.temporal.C9344l;
import p342j$.time.temporal.TemporalAccessor;
import p342j$.time.temporal.TemporalField;

/* renamed from: j$.time.format.v */
final class C9321v {

    /* renamed from: a */
    private TemporalAccessor f25834a;

    /* renamed from: b */
    private DateTimeFormatter f25835b;

    /* renamed from: c */
    private int f25836c;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C9321v(p342j$.time.temporal.TemporalAccessor r10, p342j$.time.format.DateTimeFormatter r11) {
        /*
            r9 = this;
            r9.<init>()
            j$.time.chrono.f r0 = r11.mo25028a()
            j$.time.ZoneId r1 = r11.mo25031d()
            if (r0 != 0) goto L_0x0011
            if (r1 != 0) goto L_0x0011
            goto L_0x0106
        L_0x0011:
            j$.time.temporal.j r2 = p342j$.time.temporal.C9343k.m34499a()
            java.lang.Object r2 = r10.mo24922i(r2)
            j$.time.chrono.f r2 = (p342j$.time.chrono.C9294f) r2
            j$.time.temporal.j r3 = p342j$.time.temporal.C9343k.m34505g()
            java.lang.Object r3 = r10.mo24922i(r3)
            j$.time.ZoneId r3 = (p342j$.time.ZoneId) r3
            boolean r4 = p342j$.util.C9381a.m34639D(r0, r2)
            r5 = 0
            if (r4 == 0) goto L_0x002d
            r0 = r5
        L_0x002d:
            boolean r4 = p342j$.util.C9381a.m34639D(r1, r3)
            if (r4 == 0) goto L_0x0034
            r1 = r5
        L_0x0034:
            if (r0 != 0) goto L_0x003a
            if (r1 != 0) goto L_0x003a
            goto L_0x0106
        L_0x003a:
            if (r0 == 0) goto L_0x003e
            r4 = r0
            goto L_0x003f
        L_0x003e:
            r4 = r2
        L_0x003f:
            if (r1 == 0) goto L_0x00ac
            j$.time.temporal.a r6 = p342j$.time.temporal.C9333a.INSTANT_SECONDS
            boolean r6 = r10.mo24916b(r6)
            if (r6 == 0) goto L_0x005d
            if (r4 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            j$.time.chrono.g r4 = p342j$.time.chrono.C9295g.f25767a
        L_0x004e:
            j$.time.Instant r10 = p342j$.time.Instant.m34198m(r10)
            j$.time.chrono.g r4 = (p342j$.time.chrono.C9295g) r4
            r4.getClass()
            j$.time.ZonedDateTime r10 = p342j$.time.ZonedDateTime.m34302m(r10, r1)
            goto L_0x0106
        L_0x005d:
            j$.time.zone.c r6 = r1.mo25005m()     // Catch:{ d -> 0x006e }
            boolean r7 = r6.mo25163i()     // Catch:{ d -> 0x006e }
            if (r7 == 0) goto L_0x006e
            j$.time.Instant r7 = p342j$.time.Instant.f25737c     // Catch:{ d -> 0x006e }
            j$.time.ZoneOffset r6 = r6.mo25157d(r7)     // Catch:{ d -> 0x006e }
            goto L_0x006f
        L_0x006e:
            r6 = r1
        L_0x006f:
            boolean r6 = r6 instanceof p342j$.time.ZoneOffset
            if (r6 == 0) goto L_0x00ac
            j$.time.temporal.a r6 = p342j$.time.temporal.C9333a.OFFSET_SECONDS
            boolean r7 = r10.mo24916b(r6)
            if (r7 == 0) goto L_0x00ac
            int r6 = r10.get(r6)
            j$.time.zone.c r7 = r1.mo25005m()
            j$.time.Instant r8 = p342j$.time.Instant.f25737c
            j$.time.ZoneOffset r7 = r7.mo25157d(r8)
            int r7 = r7.mo25008p()
            if (r6 != r7) goto L_0x0090
            goto L_0x00ac
        L_0x0090:
            j$.time.c r11 = new j$.time.c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to apply override zone '"
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = "' because the temporal object being formatted has a different offset but does not represent an instant: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L_0x00ac:
            if (r1 == 0) goto L_0x00af
            r3 = r1
        L_0x00af:
            if (r0 == 0) goto L_0x0100
            j$.time.temporal.a r1 = p342j$.time.temporal.C9333a.EPOCH_DAY
            boolean r1 = r10.mo24916b(r1)
            if (r1 == 0) goto L_0x00c4
            r0 = r4
            j$.time.chrono.g r0 = (p342j$.time.chrono.C9295g) r0
            r0.getClass()
            j$.time.LocalDate r5 = p342j$.time.LocalDate.m34216n(r10)
            goto L_0x0100
        L_0x00c4:
            j$.time.chrono.g r1 = p342j$.time.chrono.C9295g.f25767a
            if (r0 != r1) goto L_0x00ca
            if (r2 == 0) goto L_0x0100
        L_0x00ca:
            j$.time.temporal.a[] r1 = p342j$.time.temporal.C9333a.values()
            int r2 = r1.length
            r6 = 0
        L_0x00d0:
            if (r6 >= r2) goto L_0x0100
            r7 = r1[r6]
            boolean r8 = r7.mo25111c()
            if (r8 == 0) goto L_0x00fd
            boolean r7 = r10.mo24916b(r7)
            if (r7 != 0) goto L_0x00e1
            goto L_0x00fd
        L_0x00e1:
            j$.time.c r11 = new j$.time.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to apply override chronology '"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "' because the temporal object being formatted contains date fields but does not represent a whole date: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r11.<init>(r10)
            throw r11
        L_0x00fd:
            int r6 = r6 + 1
            goto L_0x00d0
        L_0x0100:
            j$.time.format.u r0 = new j$.time.format.u
            r0.<init>(r5, r10, r4, r3)
            r10 = r0
        L_0x0106:
            r9.f25834a = r10
            r9.f25835b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.time.format.C9321v.<init>(j$.time.temporal.TemporalAccessor, j$.time.format.DateTimeFormatter):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25076a() {
        this.f25836c--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C9324y mo25077b() {
        return this.f25835b.mo25029b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Locale mo25078c() {
        return this.f25835b.mo25030c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final TemporalAccessor mo25079d() {
        return this.f25834a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Long mo25080e(TemporalField temporalField) {
        try {
            return Long.valueOf(this.f25834a.mo24918f(temporalField));
        } catch (C9288c e) {
            if (this.f25836c > 0) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Object mo25081f(C9344l lVar) {
        Object i = this.f25834a.mo24922i(lVar);
        if (i != null || this.f25836c != 0) {
            return i;
        }
        throw new C9288c("Unable to extract value: " + this.f25834a.getClass());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo25082g() {
        this.f25836c++;
    }

    public final String toString() {
        return this.f25834a.toString();
    }
}
