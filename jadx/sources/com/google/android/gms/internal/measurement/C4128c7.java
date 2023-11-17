package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c7 */
final class C4128c7 extends C4094a7 {

    /* renamed from: d */
    private final Object f13185d;

    C4128c7(Object obj) {
        this.f13185d = obj;
    }

    /* renamed from: a */
    public final Object mo12842a() {
        return this.f13185d;
    }

    /* renamed from: b */
    public final boolean mo12843b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4128c7) {
            return this.f13185d.equals(((C4128c7) obj).f13185d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13185d.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f13185d.toString();
        return "Optional.of(" + obj + ")";
    }
}
