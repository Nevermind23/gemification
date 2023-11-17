package com.medallia.digital.mobilesdk;

/* renamed from: com.medallia.digital.mobilesdk.r7 */
enum C11080r7 {
    Fade("fade"),
    SlideDown("slideDown"),
    SlideUp("slideUp"),
    SlideLeft("slideLeft"),
    SlideRight("slideRight"),
    None("none");
    

    /* renamed from: a */
    private final String f31855a;

    private C11080r7(String str) {
        this.f31855a = str;
    }

    /* renamed from: a */
    protected static C11080r7 m40646a(String str) {
        if (str == null) {
            return Fade;
        }
        for (C11080r7 r7Var : values()) {
            if (r7Var.mo28957a().equals(str)) {
                return r7Var;
            }
        }
        C10735b4.m39114f("Unsupported transition type");
        return Fade;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28957a() {
        return this.f31855a;
    }
}
