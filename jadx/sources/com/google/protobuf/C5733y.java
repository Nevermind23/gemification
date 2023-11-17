package com.google.protobuf;

import com.google.protobuf.C5716s;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.y */
abstract class C5733y {

    /* renamed from: a */
    private static final C5733y f18105a = new C5735b();

    /* renamed from: b */
    private static final C5733y f18106b = new C5736c();

    /* renamed from: com.google.protobuf.y$b */
    private static final class C5735b extends C5733y {

        /* renamed from: c */
        private static final Class f18107c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private C5735b() {
            super();
        }

        /* renamed from: e */
        static List m23106e(Object obj, long j) {
            return (List) C5660f1.m22574C(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.w} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.w} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.w} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.List m23107f(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m23106e(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.google.protobuf.C5731x
                if (r1 == 0) goto L_0x0014
                com.google.protobuf.w r0 = new com.google.protobuf.w
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.google.protobuf.C5713q0
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.protobuf.C5716s.C5721e
                if (r1 == 0) goto L_0x0024
                com.google.protobuf.s$e r0 = (com.google.protobuf.C5716s.C5721e) r0
                com.google.protobuf.s$e r6 = r0.mo18774a(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.google.protobuf.C5660f1.m22589R(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class r1 = f18107c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.protobuf.C5660f1.m22589R(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof com.google.protobuf.C5645e1
                if (r1 == 0) goto L_0x0062
                com.google.protobuf.w r1 = new com.google.protobuf.w
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.protobuf.e1 r0 = (com.google.protobuf.C5645e1) r0
                r1.addAll(r0)
                com.google.protobuf.C5660f1.m22589R(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof com.google.protobuf.C5713q0
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof com.google.protobuf.C5716s.C5721e
                if (r1 == 0) goto L_0x007f
                r1 = r0
                com.google.protobuf.s$e r1 = (com.google.protobuf.C5716s.C5721e) r1
                boolean r2 = r1.mo18543G0()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.protobuf.s$e r0 = r1.mo18774a(r0)
                com.google.protobuf.C5660f1.m22589R(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5733y.C5735b.m23107f(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo18816c(Object obj, long j) {
            Object obj2;
            List list = (List) C5660f1.m22574C(obj, j);
            if (list instanceof C5731x) {
                obj2 = ((C5731x) list).mo18584q1();
            } else if (!f18107c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C5713q0) || !(list instanceof C5716s.C5721e)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C5716s.C5721e eVar = (C5716s.C5721e) list;
                    if (eVar.mo18543G0()) {
                        eVar.mo18555y();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C5660f1.m22589R(obj, j, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo18817d(Object obj, Object obj2, long j) {
            List e = m23106e(obj2, j);
            List f = m23107f(obj, j, e.size());
            int size = f.size();
            int size2 = e.size();
            if (size > 0 && size2 > 0) {
                f.addAll(e);
            }
            if (size > 0) {
                e = f;
            }
            C5660f1.m22589R(obj, j, e);
        }
    }

    /* renamed from: com.google.protobuf.y$c */
    private static final class C5736c extends C5733y {
        private C5736c() {
            super();
        }

        /* renamed from: e */
        static C5716s.C5721e m23110e(Object obj, long j) {
            return (C5716s.C5721e) C5660f1.m22574C(obj, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo18816c(Object obj, long j) {
            m23110e(obj, j).mo18555y();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo18817d(Object obj, Object obj2, long j) {
            C5716s.C5721e e = m23110e(obj, j);
            C5716s.C5721e e2 = m23110e(obj2, j);
            int size = e.size();
            int size2 = e2.size();
            if (size > 0 && size2 > 0) {
                if (!e.mo18543G0()) {
                    e = e.mo18774a(size2 + size);
                }
                e.addAll(e2);
            }
            if (size > 0) {
                e2 = e;
            }
            C5660f1.m22589R(obj, j, e2);
        }
    }

    private C5733y() {
    }

    /* renamed from: a */
    static C5733y m23102a() {
        return f18105a;
    }

    /* renamed from: b */
    static C5733y m23103b() {
        return f18106b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo18816c(Object obj, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo18817d(Object obj, Object obj2, long j);
}
