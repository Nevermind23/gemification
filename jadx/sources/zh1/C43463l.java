package zh1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import of1.C41880d0;
import of1.C41882e;
import zh1.C43439a0;

/* renamed from: zh1.l */
abstract class C43463l extends C43514x {

    /* renamed from: a */
    private final C43508u f101331a;

    /* renamed from: b */
    private final C41882e.C41883a f101332b;

    /* renamed from: c */
    private final C43455h f101333c;

    /* renamed from: zh1.l$a */
    static final class C43464a extends C43463l {

        /* renamed from: d */
        private final C43444c f101334d;

        C43464a(C43508u uVar, C41882e.C41883a aVar, C43455h hVar, C43444c cVar) {
            super(uVar, aVar, hVar);
            this.f101334d = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo102171c(C43443b bVar, Object[] objArr) {
            return this.f101334d.mo92684b(bVar);
        }
    }

    /* renamed from: zh1.l$b */
    static final class C43465b extends C43463l {

        /* renamed from: d */
        private final C43444c f101335d;

        /* renamed from: e */
        private final boolean f101336e;

        C43465b(C43508u uVar, C41882e.C41883a aVar, C43455h hVar, C43444c cVar, boolean z) {
            super(uVar, aVar, hVar);
            this.f101335d = cVar;
            this.f101336e = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo102171c(C43443b bVar, Object[] objArr) {
            C43443b bVar2 = (C43443b) this.f101335d.mo92684b(bVar);
            Continuation continuation = objArr[objArr.length - 1];
            try {
                if (this.f101336e) {
                    return C43468n.m124681b(bVar2, continuation);
                }
                return C43468n.m124680a(bVar2, continuation);
            } catch (Exception e) {
                return C43468n.m124683d(e, continuation);
            }
        }
    }

    /* renamed from: zh1.l$c */
    static final class C43466c extends C43463l {

        /* renamed from: d */
        private final C43444c f101337d;

        C43466c(C43508u uVar, C41882e.C41883a aVar, C43455h hVar, C43444c cVar) {
            super(uVar, aVar, hVar);
            this.f101337d = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Object mo102171c(C43443b bVar, Object[] objArr) {
            C43443b bVar2 = (C43443b) this.f101337d.mo92684b(bVar);
            Continuation continuation = objArr[objArr.length - 1];
            try {
                return C43468n.m124682c(bVar2, continuation);
            } catch (Exception e) {
                return C43468n.m124683d(e, continuation);
            }
        }
    }

    C43463l(C43508u uVar, C41882e.C41883a aVar, C43455h hVar) {
        this.f101331a = uVar;
        this.f101332b = aVar;
        this.f101333c = hVar;
    }

    /* renamed from: d */
    private static C43444c m124671d(C43511w wVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return wVar.mo102219a(type, annotationArr);
        } catch (RuntimeException e) {
            throw C43439a0.m124626n(method, e, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    private static C43455h m124672e(C43511w wVar, Method method, Type type) {
        try {
            return wVar.mo102227i(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw C43439a0.m124626n(method, e, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    static C43463l m124673f(C43511w wVar, Method method, C43508u uVar) {
        Type type;
        boolean z;
        boolean z2 = uVar.f101443k;
        Annotation[] annotations = method.getAnnotations();
        Class<C43510v> cls = C43510v.class;
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f = C43439a0.m124618f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C43439a0.m124620h(f) != cls || !(f instanceof ParameterizedType)) {
                z = false;
            } else {
                f = C43439a0.m124619g(0, (ParameterizedType) f);
                z = true;
            }
            type = new C43439a0.C43441b((Type) null, C43443b.class, f);
            annotations = C43516z.m124801a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        C43444c d = m124671d(wVar, method, type, annotations);
        Type a = d.mo92683a();
        if (a == C41880d0.class) {
            throw C43439a0.m124625m(method, "'" + C43439a0.m124620h(a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a == cls) {
            throw C43439a0.m124625m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!uVar.f101435c.equals("HEAD") || Void.class.equals(a)) {
            C43455h e = m124672e(wVar, method, a);
            C41882e.C41883a aVar = wVar.f101473b;
            if (!z2) {
                return new C43464a(uVar, aVar, e, d);
            }
            if (z) {
                return new C43466c(uVar, aVar, e, d);
            }
            return new C43465b(uVar, aVar, e, d, false);
        } else {
            throw C43439a0.m124625m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo102170a(Object[] objArr) {
        return mo102171c(new C43477o(this.f101331a, objArr, this.f101332b, this.f101333c), objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Object mo102171c(C43443b bVar, Object[] objArr);
}
