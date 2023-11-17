package com.google.protobuf;

/* renamed from: com.google.protobuf.p */
class C5707p implements C5669g0 {

    /* renamed from: a */
    private static final C5707p f18049a = new C5707p();

    private C5707p() {
    }

    /* renamed from: c */
    public static C5707p m22928c() {
        return f18049a;
    }

    /* renamed from: a */
    public C5659f0 mo18658a(Class cls) {
        Class<C5709q> cls2 = C5709q.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (C5659f0) C5709q.m22940z(cls.asSubclass(cls2)).mo18758o();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
    }

    /* renamed from: b */
    public boolean mo18659b(Class cls) {
        return C5709q.class.isAssignableFrom(cls);
    }
}
