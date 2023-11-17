package org.parceler;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

/* renamed from: org.parceler.b */
public abstract class C42028b {

    /* renamed from: org.parceler.b$b */
    private static abstract class C42030b implements PrivilegedExceptionAction {

        /* renamed from: a */
        private final AccessibleObject f98785a;

        protected C42030b(AccessibleObject accessibleObject) {
            this.f98785a = accessibleObject;
        }

        /* renamed from: a */
        public abstract Object mo97503a(AccessibleObject accessibleObject);

        public Object run() {
            boolean isAccessible = this.f98785a.isAccessible();
            this.f98785a.setAccessible(true);
            Object a = mo97503a(this.f98785a);
            this.f98785a.setAccessible(isAccessible);
            return a;
        }
    }

    /* renamed from: org.parceler.b$c */
    private static final class C42031c extends C42030b {

        /* renamed from: b */
        private final Object f98786b;

        /* renamed from: b */
        public Object mo97503a(Field field) {
            return field.get(this.f98786b);
        }

        private C42031c(Field field, Object obj) {
            super(field);
            this.f98786b = obj;
        }
    }

    /* renamed from: org.parceler.b$d */
    private static final class C42032d extends C42030b {

        /* renamed from: b */
        private final Object f98787b;

        /* renamed from: c */
        private final Object f98788c;

        /* renamed from: b */
        public Void mo97503a(Field field) {
            field.set(this.f98787b, this.f98788c);
            return null;
        }

        private C42032d(Field field, Object obj, Object obj2) {
            super(field);
            this.f98787b = obj;
            this.f98788c = obj2;
        }
    }

    /* renamed from: a */
    public static Object m122112a(Class cls, Class cls2, Object obj, String str) {
        try {
            return AccessController.doPrivileged(new C42031c(cls2.getDeclaredField(str), obj));
        } catch (NoSuchFieldException e) {
            throw new ParcelerRuntimeException("NoSuchFieldException Exception during field injection: " + str + " in " + obj.getClass(), e);
        } catch (PrivilegedActionException e2) {
            throw new ParcelerRuntimeException("PrivilegedActionException Exception during field injection", e2);
        } catch (Exception e3) {
            throw new ParcelerRuntimeException("Exception during field injection", e3);
        }
    }

    /* renamed from: b */
    public static void m122113b(Class cls, Object obj, String str, Object obj2) {
        try {
            AccessController.doPrivileged(new C42032d(cls.getDeclaredField(str), obj, obj2));
        } catch (NoSuchFieldException e) {
            throw new ParcelerRuntimeException("NoSuchFieldException Exception during field injection: " + str + " in " + obj.getClass(), e);
        } catch (PrivilegedActionException e2) {
            throw new ParcelerRuntimeException("PrivilegedActionException Exception during field injection", e2);
        } catch (Exception e3) {
            throw new ParcelerRuntimeException("Exception during field injection", e3);
        }
    }
}
