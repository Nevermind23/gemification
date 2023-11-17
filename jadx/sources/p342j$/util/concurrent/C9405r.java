package p342j$.util.concurrent;

/* renamed from: j$.util.concurrent.r */
final class C9405r extends C9399l {

    /* renamed from: e */
    C9405r f26032e;

    /* renamed from: f */
    C9405r f26033f;

    /* renamed from: g */
    C9405r f26034g;

    /* renamed from: h */
    C9405r f26035h;

    /* renamed from: i */
    boolean f26036i;

    C9405r(int i, Object obj, Object obj2, C9405r rVar, C9405r rVar2) {
        super(i, obj, obj2, rVar);
        this.f26032e = rVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C9399l mo25382a(Object obj, int i) {
        return mo25409b(i, obj, (Class) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C9405r mo25409b(int i, Object obj, Class cls) {
        int d;
        if (obj == null) {
            return null;
        }
        C9405r rVar = this;
        do {
            C9405r rVar2 = rVar.f26033f;
            C9405r rVar3 = rVar.f26034g;
            int i2 = rVar.f26011a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = rVar.f26012b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return rVar;
                    }
                    if (rVar2 != null) {
                        if (rVar3 != null) {
                            if ((cls == null && (cls = ConcurrentHashMap.m34683c(obj)) == null) || (d = ConcurrentHashMap.m34684d(cls, obj, obj2)) == 0) {
                                C9405r b = rVar3.mo25409b(i, obj, cls);
                                if (b != null) {
                                    return b;
                                }
                            } else if (d >= 0) {
                                rVar2 = rVar3;
                            }
                        }
                    }
                }
                rVar = rVar3;
                continue;
            }
            rVar = rVar2;
            continue;
        } while (rVar != null);
        return null;
    }
}
