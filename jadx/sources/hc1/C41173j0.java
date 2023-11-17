package hc1;

/* renamed from: hc1.j0 */
public enum C41173j0 {
    TRUSTED_AND_KNOWLEDGE(new C41171i0(new C41127a(r3, false), C41341q.m119907j())),
    TRUSTED_AND_BIOMETRY(new C41171i0(r2, C41341q.m119910m(new C41127a(r8, true), new C41127a(r10, true), new C41127a(r11, false)))),
    OTP_AND_KNOWLEDGE(new C41171i0((C41127a) null, C41341q.m119910m(new C41127a(r8, true), new C41127a(r7, false)))),
    NOT_TRUSTED_AND_BIOMETRY(new C41171i0(new C41127a(r8, true), C41341q.m119910m(new C41127a(r10, true), new C41127a(r7, true), new C41127a(r11, false)))),
    STRICT_TRUSTED(new C41171i0(new C41127a(r3, false), C41341q.m119910m(new C41127a(r8, true), new C41127a(r10, true), new C41127a(r11, false)))),
    STRICT_BIOMETRY(new C41171i0(new C41127a(r8, true), C41341q.m119910m(new C41127a(r10, true), new C41127a(r11, false)))),
    BIOMETRY_OTP(new C41171i0(new C41127a(r8, true), C41339p.m119900e(new C41127a(r7, false)))),
    OTP(new C41171i0(new C41127a(r7, false), C41341q.m119907j())),
    PASSCODE(new C41171i0(new C41127a(r10, true), C41339p.m119900e(new C41127a(r7, false)))),
    PASSWORD(new C41171i0(new C41127a(r11, false), C41339p.m119900e(new C41127a(r7, false))));
    

    /* renamed from: d */
    private final C41171i0 f97142d;

    private C41173j0(C41171i0 i0Var) {
        this.f97142d = i0Var;
    }

    /* renamed from: b */
    public final C41171i0 mo95626b() {
        return this.f97142d;
    }
}
