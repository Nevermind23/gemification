package com.google.gson.internal;

import android.support.p013v4.media.session.C0125b;
import com.google.gson.C5617o;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.internal.k */
public abstract class C5590k {

    /* renamed from: com.google.gson.internal.k$b */
    private static abstract class C5592b {

        /* renamed from: a */
        public static final C5592b f17777a;

        /* renamed from: com.google.gson.internal.k$b$a */
        class C5593a extends C5592b {

            /* renamed from: b */
            final /* synthetic */ Method f17778b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C5593a(Method method) {
                super();
                this.f17778b = method;
            }

            /* renamed from: a */
            public boolean mo18424a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f17778b.invoke(accessibleObject, new Object[]{obj})).booleanValue();
                } catch (Exception e) {
                    throw new RuntimeException("Failed invoking canAccess", e);
                }
            }
        }

        /* renamed from: com.google.gson.internal.k$b$b */
        class C5594b extends C5592b {
            C5594b() {
                super();
            }

            /* renamed from: a */
            public boolean mo18424a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
        static {
            /*
                boolean r0 = com.google.gson.internal.C5576d.m22216d()
                if (r0 == 0) goto L_0x001c
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001c }
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                r4 = 0
                r2[r4] = r3     // Catch:{ NoSuchMethodException -> 0x001c }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x001c }
                com.google.gson.internal.k$b$a r1 = new com.google.gson.internal.k$b$a     // Catch:{ NoSuchMethodException -> 0x001c }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x001c }
                goto L_0x001d
            L_0x001c:
                r1 = 0
            L_0x001d:
                if (r1 != 0) goto L_0x0024
                com.google.gson.internal.k$b$b r1 = new com.google.gson.internal.k$b$b
                r1.<init>()
            L_0x0024:
                f17777a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C5590k.C5592b.<clinit>():void");
        }

        private C5592b() {
        }

        /* renamed from: a */
        public abstract boolean mo18424a(AccessibleObject accessibleObject, Object obj);
    }

    /* renamed from: a */
    public static boolean m22240a(AccessibleObject accessibleObject, Object obj) {
        return C5592b.f17777a.mo18424a(accessibleObject, obj);
    }

    /* renamed from: b */
    public static C5617o m22241b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return C5617o.ALLOW;
        }
        C0125b.m366a(it.next());
        throw null;
    }
}
