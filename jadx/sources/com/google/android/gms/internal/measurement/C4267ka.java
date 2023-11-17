package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ka */
final class C4267ka implements C4149db {

    /* renamed from: b */
    private static final C4352pa f13435b = new C4216ha();

    /* renamed from: a */
    private final C4352pa f13436a;

    public C4267ka() {
        C4352pa paVar;
        C4352pa[] paVarArr = new C4352pa[2];
        paVarArr[0] = C4283l9.m16225c();
        try {
            paVar = (C4352pa) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            paVar = f13435b;
        }
        paVarArr[1] = paVar;
        C4233ia iaVar = new C4233ia(paVarArr);
        byte[] bArr = C4470w9.f13784d;
        this.f13436a = iaVar;
    }

    /* renamed from: b */
    private static boolean m16202b(C4335oa oaVar) {
        return oaVar.mo12955s() == 1;
    }

    /* renamed from: a */
    public final C4132cb mo13044a(Class cls) {
        C4166eb.m15746d(cls);
        C4335oa a = this.f13436a.mo13209a(cls);
        Class<C4351p9> cls2 = C4351p9.class;
        if (a.mo12954q()) {
            if (cls2.isAssignableFrom(cls)) {
                return C4454va.m17059i(C4166eb.m15743a(), C4215h9.m15999b(), a.mo12951a());
            }
            return C4454va.m17059i(C4166eb.m15741W(), C4215h9.m15998a(), a.mo12951a());
        } else if (cls2.isAssignableFrom(cls)) {
            if (m16202b(a)) {
                return C4437ua.m16972H(cls, a, C4487xa.m17151b(), C4182fa.m15820d(), C4166eb.m15743a(), C4215h9.m15999b(), C4318na.m16353b());
            }
            return C4437ua.m16972H(cls, a, C4487xa.m17151b(), C4182fa.m15820d(), C4166eb.m15743a(), (C4181f9) null, C4318na.m16353b());
        } else if (m16202b(a)) {
            return C4437ua.m16972H(cls, a, C4487xa.m17150a(), C4182fa.m15819c(), C4166eb.m15741W(), C4215h9.m15998a(), C4318na.m16352a());
        } else {
            return C4437ua.m16972H(cls, a, C4487xa.m17150a(), C4182fa.m15819c(), C4166eb.m15742X(), (C4181f9) null, C4318na.m16352a());
        }
    }
}
