package p342j$.time.zone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p342j$.time.Duration;
import p342j$.time.Instant;
import p342j$.time.LocalDateTime;
import p342j$.time.ZoneOffset;

/* renamed from: j$.time.zone.a */
public final class C9349a implements Comparable, Serializable {

    /* renamed from: a */
    private final LocalDateTime f25902a;

    /* renamed from: b */
    private final ZoneOffset f25903b;

    /* renamed from: c */
    private final ZoneOffset f25904c;

    C9349a(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f25902a = LocalDateTime.m34247t(j, 0, zoneOffset);
        this.f25903b = zoneOffset;
        this.f25904c = zoneOffset2;
    }

    C9349a(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f25902a = localDateTime;
        this.f25903b = zoneOffset;
        this.f25904c = zoneOffset2;
    }

    /* renamed from: a */
    public final LocalDateTime mo25145a() {
        return this.f25902a.mo24988v((long) (this.f25904c.mo25008p() - this.f25903b.mo25008p()));
    }

    /* renamed from: c */
    public final LocalDateTime mo25146c() {
        return this.f25902a;
    }

    public final int compareTo(Object obj) {
        C9349a aVar = (C9349a) obj;
        LocalDateTime localDateTime = this.f25902a;
        Instant q = Instant.m34200q(localDateTime.mo24989x(this.f25903b), (long) localDateTime.mo24973A().mo25092o());
        LocalDateTime localDateTime2 = aVar.f25902a;
        return q.compareTo(Instant.m34200q(localDateTime2.mo24989x(aVar.f25903b), (long) localDateTime2.mo24973A().mo25092o()));
    }

    /* renamed from: e */
    public final Duration mo25148e() {
        return Duration.m34195h((long) (this.f25904c.mo25008p() - this.f25903b.mo25008p()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9349a)) {
            return false;
        }
        C9349a aVar = (C9349a) obj;
        return this.f25902a.equals(aVar.f25902a) && this.f25903b.equals(aVar.f25903b) && this.f25904c.equals(aVar.f25904c);
    }

    /* renamed from: f */
    public final ZoneOffset mo25150f() {
        return this.f25904c;
    }

    /* renamed from: h */
    public final ZoneOffset mo25151h() {
        return this.f25903b;
    }

    public final int hashCode() {
        return (this.f25902a.hashCode() ^ this.f25903b.hashCode()) ^ Integer.rotateLeft(this.f25904c.hashCode(), 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final List mo25153i() {
        if (mo25154j()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new ZoneOffset[]{this.f25903b, this.f25904c});
    }

    /* renamed from: j */
    public final boolean mo25154j() {
        return this.f25904c.mo25008p() > this.f25903b.mo25008p();
    }

    /* renamed from: k */
    public final long mo25155k() {
        return this.f25902a.mo24989x(this.f25903b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(mo25154j() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f25902a);
        sb.append(this.f25903b);
        sb.append(" to ");
        sb.append(this.f25904c);
        sb.append(']');
        return sb.toString();
    }
}
