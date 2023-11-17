package com.facetec.sdk;

import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: com.facetec.sdk.fn */
public final class C3091fn implements C3013eo {

    /* renamed from: a */
    private final C3017er f10263a;

    /* renamed from: b */
    private final C2970dt f10264b;

    /* renamed from: c */
    private final C3139ft f10265c = C3139ft.m12886d();

    /* renamed from: d */
    private final C3015eq f10266d;

    /* renamed from: e */
    private final C3077fg f10267e;

    /* renamed from: com.facetec.sdk.fn$b */
    static abstract class C3093b {

        /* renamed from: b */
        final boolean f10275b;

        /* renamed from: c */
        final String f10276c;

        /* renamed from: d */
        final boolean f10277d;

        protected C3093b(String str, boolean z, boolean z2) {
            this.f10276c = str;
            this.f10277d = z;
            this.f10275b = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo9323b(Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract void mo9324c(C3160gb gbVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo9325e(C3143fx fxVar, Object obj);
    }

    /* renamed from: com.facetec.sdk.fn$d */
    public static final class C3094d<T> extends C3004eg<T> {

        /* renamed from: b */
        private final Map<String, C3093b> f10278b;

        /* renamed from: e */
        private final C3038ev<T> f10279e;

        C3094d(C3038ev<T> evVar, Map<String, C3093b> map) {
            this.f10279e = evVar;
            this.f10278b = map;
        }

        /* renamed from: b */
        public final void mo8991b(C3160gb gbVar, T t) {
            if (t == null) {
                gbVar.mo9318f();
                return;
            }
            gbVar.mo9316e();
            try {
                for (C3093b next : this.f10278b.values()) {
                    if (next.mo9323b(t)) {
                        gbVar.mo9308a(next.f10276c);
                        next.mo9324c(gbVar, t);
                    }
                }
                gbVar.mo9310c();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: d */
        public final T mo8992d(C3143fx fxVar) {
            if (fxVar.mo9292f() == C3141fv.NULL) {
                fxVar.mo9298l();
                return null;
            }
            T a = this.f10279e.mo9206a();
            try {
                fxVar.mo9289d();
                while (fxVar.mo9291e()) {
                    C3093b bVar = this.f10278b.get(fxVar.mo9293g());
                    if (bVar != null) {
                        if (bVar.f10275b) {
                            bVar.mo9325e(fxVar, a);
                        }
                    }
                    fxVar.mo9301o();
                }
                fxVar.mo9287c();
                return a;
            } catch (IllegalStateException e) {
                throw new C3007ei((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public C3091fn(C3017er erVar, C2970dt dtVar, C3015eq eqVar, C3077fg fgVar) {
        this.f10263a = erVar;
        this.f10264b = dtVar;
        this.f10266d = eqVar;
        this.f10267e = fgVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: com.facetec.sdk.fw<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Class<? super ?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.facetec.sdk.fw<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Class<? super ?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Class<? super ?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: com.facetec.sdk.fw<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Class<? super ?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Class<? super ?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Class<? super ?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.facetec.sdk.fn$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Class<? super ?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013f A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, com.facetec.sdk.C3091fn.C3093b> m12782b(com.facetec.sdk.C2972dv r33, com.facetec.sdk.C3142fw<?> r34, java.lang.Class<?> r35) {
        /*
            r32 = this;
            r11 = r32
            r12 = r33
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            boolean r0 = r35.isInterface()
            if (r0 == 0) goto L_0x0010
            return r13
        L_0x0010:
            java.lang.reflect.Type r14 = r34.mo9332b()
            r15 = r34
            r10 = r35
        L_0x0018:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r10 == r0) goto L_0x0189
            java.lang.reflect.Field[] r9 = r10.getDeclaredFields()
            int r8 = r9.length
            r7 = 0
            r6 = r7
        L_0x0023:
            if (r6 >= r8) goto L_0x016b
            r5 = r9[r6]
            r4 = 1
            boolean r0 = r11.m12784e(r5, r4)
            boolean r16 = r11.m12784e(r5, r7)
            if (r0 != 0) goto L_0x0041
            if (r16 == 0) goto L_0x0035
            goto L_0x0041
        L_0x0035:
            r29 = r6
            r30 = r7
            r24 = r8
            r31 = r9
            r34 = r10
            goto L_0x013f
        L_0x0041:
            com.facetec.sdk.ft r1 = r11.f10265c
            r1.mo9330b(r5)
            java.lang.reflect.Type r1 = r15.mo9332b()
            java.lang.reflect.Type r2 = r5.getGenericType()
            java.lang.reflect.Type r17 = com.facetec.sdk.C3033et.m12671b((java.lang.reflect.Type) r1, (java.lang.Class<?>) r10, (java.lang.reflect.Type) r2)
            java.lang.Class<com.facetec.sdk.em> r1 = com.facetec.sdk.C3011em.class
            java.lang.annotation.Annotation r1 = r5.getAnnotation(r1)
            com.facetec.sdk.em r1 = (com.facetec.sdk.C3011em) r1
            if (r1 != 0) goto L_0x0068
            com.facetec.sdk.dt r1 = r11.f10264b
            java.lang.String r1 = r1.mo9130a(r5)
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x0066:
            r7 = r1
            goto L_0x0090
        L_0x0068:
            java.lang.String r2 = r1.mo9197c()
            java.lang.String[] r1 = r1.mo9196a()
            int r3 = r1.length
            if (r3 != 0) goto L_0x0078
            java.util.List r1 = java.util.Collections.singletonList(r2)
            goto L_0x0066
        L_0x0078:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r7 = r1.length
            int r7 = r7 + r4
            r3.<init>(r7)
            r3.add(r2)
            int r2 = r1.length
            r7 = 0
        L_0x0084:
            if (r7 >= r2) goto L_0x008f
            r4 = r1[r7]
            r3.add(r4)
            int r7 = r7 + 1
            r4 = 1
            goto L_0x0084
        L_0x008f:
            r7 = r3
        L_0x0090:
            int r4 = r7.size()
            r18 = 0
            r2 = r18
            r3 = 0
        L_0x0099:
            if (r3 >= r4) goto L_0x0132
            java.lang.Object r1 = r7.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r3 == 0) goto L_0x00a6
            r19 = 0
            goto L_0x00a8
        L_0x00a6:
            r19 = r0
        L_0x00a8:
            com.facetec.sdk.fw r0 = com.facetec.sdk.C3142fw.m12893c(r17)
            java.lang.Class r20 = r0.mo9331a()
            boolean r20 = com.facetec.sdk.C3064fb.m12711e(r20)
            r21 = r1
            java.lang.Class<com.facetec.sdk.en> r1 = com.facetec.sdk.C3012en.class
            java.lang.annotation.Annotation r1 = r5.getAnnotation(r1)
            com.facetec.sdk.en r1 = (com.facetec.sdk.C3012en) r1
            r22 = r2
            if (r1 == 0) goto L_0x00c9
            com.facetec.sdk.er r2 = r11.f10263a
            com.facetec.sdk.eg r1 = com.facetec.sdk.C3077fg.m12730b(r2, r12, r0, r1)
            goto L_0x00cb
        L_0x00c9:
            r1 = r18
        L_0x00cb:
            if (r1 == 0) goto L_0x00d0
            r23 = 1
            goto L_0x00d2
        L_0x00d0:
            r23 = 0
        L_0x00d2:
            if (r1 != 0) goto L_0x00d8
            com.facetec.sdk.eg r1 = r12.mo9133b(r0)
        L_0x00d8:
            r24 = r1
            com.facetec.sdk.fn$2 r2 = new com.facetec.sdk.fn$2
            r25 = r0
            r0 = r2
            r26 = r21
            r1 = r32
            r12 = r2
            r11 = r22
            r2 = r26
            r21 = r3
            r3 = r19
            r22 = r4
            r27 = 1
            r4 = r16
            r28 = r5
            r29 = r6
            r6 = r23
            r23 = r7
            r30 = 0
            r7 = r24
            r24 = r8
            r8 = r33
            r31 = r9
            r9 = r25
            r34 = r10
            r10 = r20
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r26
            java.lang.Object r0 = r13.put(r1, r12)
            r2 = r0
            com.facetec.sdk.fn$b r2 = (com.facetec.sdk.C3091fn.C3093b) r2
            if (r11 != 0) goto L_0x0119
            goto L_0x011a
        L_0x0119:
            r2 = r11
        L_0x011a:
            int r3 = r21 + 1
            r11 = r32
            r12 = r33
            r10 = r34
            r0 = r19
            r4 = r22
            r7 = r23
            r8 = r24
            r5 = r28
            r6 = r29
            r9 = r31
            goto L_0x0099
        L_0x0132:
            r11 = r2
            r29 = r6
            r24 = r8
            r31 = r9
            r34 = r10
            r30 = 0
            if (r11 != 0) goto L_0x014f
        L_0x013f:
            int r6 = r29 + 1
            r11 = r32
            r12 = r33
            r10 = r34
            r8 = r24
            r7 = r30
            r9 = r31
            goto L_0x0023
        L_0x014f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r11.f10276c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x016b:
            r34 = r10
            java.lang.reflect.Type r0 = r15.mo9332b()
            java.lang.reflect.Type r1 = r34.getGenericSuperclass()
            r2 = r34
            java.lang.reflect.Type r0 = com.facetec.sdk.C3033et.m12671b((java.lang.reflect.Type) r0, (java.lang.Class<?>) r2, (java.lang.reflect.Type) r1)
            com.facetec.sdk.fw r15 = com.facetec.sdk.C3142fw.m12893c(r0)
            java.lang.Class r10 = r15.mo9331a()
            r11 = r32
            r12 = r33
            goto L_0x0018
        L_0x0189:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3091fn.m12782b(com.facetec.sdk.dv, com.facetec.sdk.fw, java.lang.Class):java.util.Map");
    }

    /* renamed from: d */
    private static boolean m12783d(Field field, boolean z, C3015eq eqVar) {
        return !eqVar.mo9203e(field.getType(), z) && !eqVar.mo9201b(field, z);
    }

    /* renamed from: e */
    private boolean m12784e(Field field, boolean z) {
        return m12783d(field, z, this.f10266d);
    }

    /* renamed from: c */
    public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
        Class<? super T> a = fwVar.mo9331a();
        if (!Object.class.isAssignableFrom(a)) {
            return null;
        }
        return new C3094d(this.f10263a.mo9204a(fwVar), m12782b(dvVar, fwVar, a));
    }
}
