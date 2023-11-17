package sm0;

import p190o1.C7397t;

/* renamed from: sm0.b */
public final class C28250b {

    /* renamed from: a */
    private final long f71687a;

    /* renamed from: b */
    private final long f71688b;

    public C28250b(long j, long j2) {
        this.f71687a = j;
        this.f71688b = j2;
    }

    /* renamed from: a */
    public final long mo67782a() {
        return this.f71687a;
    }

    /* renamed from: b */
    public final long mo67783b() {
        return this.f71688b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28250b)) {
            return false;
        }
        C28250b bVar = (C28250b) obj;
        return this.f71687a == bVar.f71687a && this.f71688b == bVar.f71688b;
    }

    public int hashCode() {
        return (C7397t.m28148a(this.f71687a) * 31) + C7397t.m28148a(this.f71688b);
    }

    public String toString() {
        long j = this.f71687a;
        long j2 = this.f71688b;
        return "ChildOtpRequest(notificationId=" + j + ", validationRequestId=" + j2 + ")";
    }
}
