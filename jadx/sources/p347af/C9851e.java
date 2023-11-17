package p347af;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p347af.C9841c;
import p361bf.C10262a;
import p488kf.C16418a;
import p488kf.C16419b;
import p680ye.C18881a;

/* renamed from: af.e */
public final class C9851e {

    /* renamed from: a */
    private final Map f26707a;

    /* renamed from: af.e$a */
    public static final class C9852a {

        /* renamed from: a */
        private final C10262a f26708a;

        /* renamed from: b */
        private final C9841c.C9848d.C9849a f26709b;

        /* renamed from: c */
        private final C9841c.C9844c.C9845a f26710c;

        public C9852a(C10262a aVar, C9841c.C9848d.C9849a aVar2, C9841c.C9844c.C9845a aVar3) {
            C41536l.m120490j(aVar, "runtimePlatform");
            C41536l.m120490j(aVar2, "sendServiceMethodFactory");
            C41536l.m120490j(aVar3, "receiveServiceMethodFactory");
            this.f26708a = aVar;
            this.f26709b = aVar2;
            this.f26710c = aVar3;
        }

        /* renamed from: b */
        private final C9841c.C9843b m36153b(Annotation annotation) {
            if (annotation instanceof C16419b) {
                return this.f26709b;
            }
            if (annotation instanceof C16418a) {
                return this.f26710c;
            }
            return null;
        }

        /* renamed from: c */
        private final Map m36154c(Class cls, C18881a aVar) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            C41536l.m120485e(declaredMethods, "declaredMethods");
            ArrayList<Method> arrayList = new ArrayList<>();
            for (Method method : declaredMethods) {
                C10262a aVar2 = this.f26708a;
                C41536l.m120485e(method, "it");
                if (!aVar2.mo26860c(method)) {
                    arrayList.add(method);
                }
            }
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (Method method2 : arrayList) {
                C41536l.m120485e(method2, "it");
                arrayList2.add(m36155d(method2, aVar));
            }
            return C41344r0.m119939u(C41358y.m119996G0(arrayList, arrayList2));
        }

        /* renamed from: d */
        private final C9841c m36155d(Method method, C18881a aVar) {
            Annotation[] annotations = method.getAnnotations();
            C41536l.m120485e(annotations, "annotations");
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (Annotation annotation : annotations) {
                C41536l.m120485e(annotation, "it");
                C9841c.C9843b b = m36153b(annotation);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            if (arrayList.size() == 1) {
                z = true;
            }
            if (z) {
                return ((C9841c.C9843b) C41358y.m120007W(arrayList)).mo26333a(aVar, method);
            }
            throw new IllegalArgumentException(("A method must have one and only one service method annotation: " + method).toString());
        }

        /* renamed from: a */
        public final C9851e mo26345a(Class cls, C18881a aVar) {
            C41536l.m120490j(cls, "serviceInterface");
            C41536l.m120490j(aVar, "connection");
            return new C9851e(m36154c(cls, aVar));
        }
    }

    public C9851e(Map map) {
        C41536l.m120490j(map, "serviceMethods");
        this.f26707a = map;
    }

    /* renamed from: a */
    public final Object mo26344a(Method method, Object[] objArr) {
        C41536l.m120490j(method, "method");
        C41536l.m120490j(objArr, "args");
        Object obj = this.f26707a.get(method);
        if (obj != null) {
            C9841c cVar = (C9841c) obj;
            if (cVar instanceof C9841c.C9848d) {
                return ((C9841c.C9848d) cVar).mo26342a(objArr[0]);
            }
            if (cVar instanceof C9841c.C9844c) {
                return ((C9841c.C9844c) cVar).mo26334b();
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Service method not found".toString());
    }
}
