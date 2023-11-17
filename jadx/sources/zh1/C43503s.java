package zh1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p361bf.C10267c;
import zh1.C43444c;

/* renamed from: zh1.s */
class C43503s {

    /* renamed from: c */
    private static final C43503s f101414c = m124736f();

    /* renamed from: a */
    private final boolean f101415a;

    /* renamed from: b */
    private final Constructor f101416b;

    /* renamed from: zh1.s$a */
    static final class C43504a extends C43503s {

        /* renamed from: zh1.s$a$a */
        static final class C43505a implements Executor {

            /* renamed from: d */
            private final Handler f101417d = new Handler(Looper.getMainLooper());

            C43505a() {
            }

            public void execute(Runnable runnable) {
                this.f101417d.post(runnable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43504a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        /* renamed from: c */
        public Executor mo102195c() {
            return new C43505a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Object mo102198h(Method method, Class cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return C43503s.super.mo102198h(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    C43503s(boolean z) {
        this.f101415a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f101416b = constructor;
    }

    /* renamed from: f */
    private static C43503s m124736f() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new C43504a();
        }
        return new C43503s(true);
    }

    /* renamed from: g */
    static C43503s m124737g() {
        return f101414c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List mo102193a(Executor executor) {
        C43457i iVar = new C43457i(executor);
        if (!this.f101415a) {
            return Collections.singletonList(iVar);
        }
        return Arrays.asList(new C43444c.C43445a[]{C43449g.f101309a, iVar});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo102194b() {
        return this.f101415a ? 2 : 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Executor mo102195c() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List mo102196d() {
        return this.f101415a ? Collections.singletonList(C43482p.f101367a) : Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo102197e() {
        return this.f101415a ? 1 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Object mo102198h(Method method, Class cls, Object obj, Object... objArr) {
        MethodHandles.Lookup lookup;
        Constructor constructor = this.f101416b;
        if (constructor != null) {
            lookup = C10267c.m37446a(constructor.newInstance(new Object[]{cls, -1}));
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo102199i(Method method) {
        return this.f101415a && method.isDefault();
    }
}
