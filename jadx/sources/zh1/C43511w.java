package zh1;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import of1.C41882e;
import of1.C41931v;
import of1.C41944z;
import p342j$.util.concurrent.ConcurrentHashMap;
import zh1.C43432a;
import zh1.C43444c;
import zh1.C43455h;

/* renamed from: zh1.w */
public final class C43511w {

    /* renamed from: a */
    private final Map f101472a = new ConcurrentHashMap();

    /* renamed from: b */
    final C41882e.C41883a f101473b;

    /* renamed from: c */
    final C41931v f101474c;

    /* renamed from: d */
    final List f101475d;

    /* renamed from: e */
    final List f101476e;

    /* renamed from: f */
    final Executor f101477f;

    /* renamed from: g */
    final boolean f101478g;

    /* renamed from: zh1.w$a */
    class C43512a implements InvocationHandler {

        /* renamed from: a */
        private final C43503s f101479a = C43503s.m124737g();

        /* renamed from: b */
        private final Object[] f101480b = new Object[0];

        /* renamed from: c */
        final /* synthetic */ Class f101481c;

        C43512a(Class cls) {
            this.f101481c = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f101480b;
            }
            if (this.f101479a.mo102199i(method)) {
                return this.f101479a.mo102198h(method, this.f101481c, obj, objArr);
            }
            return C43511w.this.mo102221c(method).mo102170a(objArr);
        }
    }

    C43511w(C41882e.C41883a aVar, C41931v vVar, List list, List list2, Executor executor, boolean z) {
        this.f101473b = aVar;
        this.f101474c = vVar;
        this.f101475d = list;
        this.f101476e = list2;
        this.f101477f = executor;
        this.f101478g = z;
    }

    /* renamed from: k */
    private void m124781k(Class cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f101478g) {
                C43503s g = C43503s.m124737g();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!g.mo102199i(method) && !Modifier.isStatic(method.getModifiers())) {
                        mo102221c(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: a */
    public C43444c mo102219a(Type type, Annotation[] annotationArr) {
        return mo102223e((C43444c.C43445a) null, type, annotationArr);
    }

    /* renamed from: b */
    public Object mo102220b(Class cls) {
        m124781k(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C43512a(cls));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C43514x mo102221c(Method method) {
        C43514x xVar;
        C43514x xVar2 = (C43514x) this.f101472a.get(method);
        if (xVar2 != null) {
            return xVar2;
        }
        synchronized (this.f101472a) {
            xVar = (C43514x) this.f101472a.get(method);
            if (xVar == null) {
                xVar = C43514x.m124799b(this, method);
                this.f101472a.put(method, xVar);
            }
        }
        return xVar;
    }

    /* renamed from: d */
    public C43513b mo102222d() {
        return new C43513b(this);
    }

    /* renamed from: e */
    public C43444c mo102223e(C43444c.C43445a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f101476e.indexOf(aVar) + 1;
        int size = this.f101476e.size();
        for (int i = indexOf; i < size; i++) {
            C43444c a = ((C43444c.C43445a) this.f101476e.get(i)).mo92682a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(((C43444c.C43445a) this.f101476e.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f101476e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C43444c.C43445a) this.f101476e.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public C43455h mo102224f(C43455h.C43456a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f101475d.indexOf(aVar) + 1;
        int size = this.f101475d.size();
        for (int i = indexOf; i < size; i++) {
            C43455h c = ((C43455h.C43456a) this.f101475d.get(i)).mo94448c(type, annotationArr, annotationArr2, this);
            if (c != null) {
                return c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(((C43455h.C43456a) this.f101475d.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f101475d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C43455h.C43456a) this.f101475d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public C43455h mo102225g(C43455h.C43456a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f101475d.indexOf(aVar) + 1;
        int size = this.f101475d.size();
        for (int i = indexOf; i < size; i++) {
            C43455h d = ((C43455h.C43456a) this.f101475d.get(i)).mo94449d(type, annotationArr, this);
            if (d != null) {
                return d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(((C43455h.C43456a) this.f101475d.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f101475d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((C43455h.C43456a) this.f101475d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    public C43455h mo102226h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo102224f((C43455h.C43456a) null, type, annotationArr, annotationArr2);
    }

    /* renamed from: i */
    public C43455h mo102227i(Type type, Annotation[] annotationArr) {
        return mo102225g((C43455h.C43456a) null, type, annotationArr);
    }

    /* renamed from: j */
    public C43455h mo102228j(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f101475d.size();
        for (int i = 0; i < size; i++) {
            C43455h e = ((C43455h.C43456a) this.f101475d.get(i)).mo102165e(type, annotationArr, this);
            if (e != null) {
                return e;
            }
        }
        return C43432a.C43436d.f101299a;
    }

    /* renamed from: zh1.w$b */
    public static final class C43513b {

        /* renamed from: a */
        private final C43503s f101483a;

        /* renamed from: b */
        private C41882e.C41883a f101484b;

        /* renamed from: c */
        private C41931v f101485c;

        /* renamed from: d */
        private final List f101486d;

        /* renamed from: e */
        private final List f101487e;

        /* renamed from: f */
        private Executor f101488f;

        /* renamed from: g */
        private boolean f101489g;

        C43513b(C43503s sVar) {
            this.f101486d = new ArrayList();
            this.f101487e = new ArrayList();
            this.f101483a = sVar;
        }

        /* renamed from: a */
        public C43513b mo102230a(C43444c.C43445a aVar) {
            List list = this.f101487e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C43513b mo102231b(C43455h.C43456a aVar) {
            List list = this.f101486d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: c */
        public C43513b mo102232c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return mo102233d(C41931v.m121621h(str));
        }

        /* renamed from: d */
        public C43513b mo102233d(C41931v vVar) {
            Objects.requireNonNull(vVar, "baseUrl == null");
            List n = vVar.mo96958n();
            if ("".equals(n.get(n.size() - 1))) {
                this.f101485c = vVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + vVar);
        }

        /* renamed from: e */
        public C43511w mo102234e() {
            if (this.f101485c != null) {
                C41882e.C41883a aVar = this.f101484b;
                if (aVar == null) {
                    aVar = new C41944z();
                }
                C41882e.C41883a aVar2 = aVar;
                Executor executor = this.f101488f;
                if (executor == null) {
                    executor = this.f101483a.mo102195c();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f101487e);
                arrayList.addAll(this.f101483a.mo102193a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f101486d.size() + 1 + this.f101483a.mo102197e());
                arrayList2.add(new C43432a());
                arrayList2.addAll(this.f101486d);
                arrayList2.addAll(this.f101483a.mo102196d());
                return new C43511w(aVar2, this.f101485c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f101489g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: f */
        public C43513b mo102235f(C41882e.C41883a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f101484b = aVar;
            return this;
        }

        /* renamed from: g */
        public C43513b mo102236g(C41944z zVar) {
            Objects.requireNonNull(zVar, "client == null");
            return mo102235f(zVar);
        }

        public C43513b() {
            this(C43503s.m124737g());
        }

        C43513b(C43511w wVar) {
            this.f101486d = new ArrayList();
            this.f101487e = new ArrayList();
            C43503s g = C43503s.m124737g();
            this.f101483a = g;
            this.f101484b = wVar.f101473b;
            this.f101485c = wVar.f101474c;
            int size = wVar.f101475d.size() - g.mo102197e();
            for (int i = 1; i < size; i++) {
                this.f101486d.add((C43455h.C43456a) wVar.f101475d.get(i));
            }
            int size2 = wVar.f101476e.size() - this.f101483a.mo102194b();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f101487e.add((C43444c.C43445a) wVar.f101476e.get(i2));
            }
            this.f101488f = wVar.f101477f;
            this.f101489g = wVar.f101478g;
        }
    }
}
