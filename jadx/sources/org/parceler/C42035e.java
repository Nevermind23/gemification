package org.parceler;

import android.os.Parcelable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentMap;
import org.parceler.NonParcelRepository;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: org.parceler.e */
public abstract class C42035e {

    /* renamed from: a */
    private static final C42037b f98789a;

    /* renamed from: org.parceler.e$b */
    private static final class C42037b {

        /* renamed from: a */
        private ConcurrentMap f98790a;

        private C42037b() {
            this.f98790a = new ConcurrentHashMap();
        }

        /* renamed from: a */
        private static String m122122a(Class cls) {
            return cls.getName() + "$$" + "Parcelable";
        }

        /* renamed from: b */
        public C42038c mo97507b(Class cls, ClassLoader classLoader) {
            try {
                return new C42039d(cls, classLoader.loadClass(m122122a(cls)));
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public C42038c mo97508c(Class cls) {
            C42038c cVar = (C42038c) this.f98790a.get(cls);
            if (cVar != null) {
                return cVar;
            }
            C42038c b = mo97507b(cls, cls.getClassLoader());
            if (Parcelable.class.isAssignableFrom(cls)) {
                b = new NonParcelRepository.C42019t();
            }
            if (b != null) {
                C42038c cVar2 = (C42038c) this.f98790a.putIfAbsent(cls, b);
                if (cVar2 == null) {
                    return b;
                }
                return cVar2;
            }
            throw new ParcelerRuntimeException("Unable to find generated Parcelable class for " + cls.getName() + ", verify that your class is configured properly and that the Parcelable class " + m122122a(cls) + " is generated by Parceler.");
        }

        /* renamed from: d */
        public void mo97509d(C42040f fVar) {
            this.f98790a.putAll(fVar.get());
        }
    }

    /* renamed from: org.parceler.e$c */
    public interface C42038c {
        /* renamed from: a */
        Parcelable mo97470a(Object obj);
    }

    /* renamed from: org.parceler.e$d */
    private static final class C42039d implements C42038c {

        /* renamed from: a */
        private final Constructor f98791a;

        public C42039d(Class cls, Class cls2) {
            try {
                this.f98791a = cls2.getConstructor(new Class[]{cls});
            } catch (NoSuchMethodException e) {
                throw new ParcelerRuntimeException("Unable to create ParcelFactory Type", e);
            }
        }

        /* renamed from: a */
        public Parcelable mo97470a(Object obj) {
            try {
                return (Parcelable) this.f98791a.newInstance(new Object[]{obj});
            } catch (InstantiationException e) {
                throw new ParcelerRuntimeException("Unable to create ParcelFactory Type", e);
            } catch (IllegalAccessException e2) {
                throw new ParcelerRuntimeException("Unable to create ParcelFactory Type", e2);
            } catch (InvocationTargetException e3) {
                throw new ParcelerRuntimeException("Unable to create ParcelFactory Type", e3);
            }
        }
    }

    static {
        C42037b bVar = new C42037b();
        f98789a = bVar;
        bVar.mo97509d(NonParcelRepository.m121938a());
    }

    /* renamed from: a */
    public static Object m122119a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        return ((C42034d) parcelable).getParcel();
    }

    /* renamed from: b */
    public static Parcelable m122120b(Class cls, Object obj) {
        if (obj == null) {
            return null;
        }
        return f98789a.mo97508c(cls).mo97470a(obj);
    }

    /* renamed from: c */
    public static Parcelable m122121c(Object obj) {
        if (obj == null) {
            return null;
        }
        return m122120b(obj.getClass(), obj);
    }
}
