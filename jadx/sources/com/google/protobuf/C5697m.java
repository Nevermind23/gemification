package com.google.protobuf;

/* renamed from: com.google.protobuf.m */
abstract class C5697m {

    /* renamed from: a */
    private static final C5693k f17972a = new C5695l();

    /* renamed from: b */
    private static final C5693k f17973b = m22893c();

    /* renamed from: a */
    static C5693k m22891a() {
        C5693k kVar = f17973b;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    static C5693k m22892b() {
        return f17972a;
    }

    /* renamed from: c */
    private static C5693k m22893c() {
        try {
            return (C5693k) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
