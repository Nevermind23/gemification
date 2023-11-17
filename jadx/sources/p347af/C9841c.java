package p347af;

import af1.C40297d;
import ed1.C40741h;
import ed1.C40744k;
import ed1.C40757w;
import he1.C41224m;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41534j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p347af.C9822a;
import p446hf.C15494b;
import p446hf.C15495c;
import p652we.C18523b;
import p652we.C18542e;
import p652we.C18559k;
import p680ye.C18881a;
import ue1.C43075l;

/* renamed from: af.c */
public abstract class C9841c {

    /* renamed from: a */
    public static final C9842a f26694a = new C9842a((DefaultConstructorMarker) null);

    /* renamed from: af.c$a */
    public static final class C9842a {
        private C9842a() {
        }

        public /* synthetic */ C9842a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final Annotation[] m36138c(Method method) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            C41536l.m120485e(parameterAnnotations, "parameterAnnotations");
            Object v = C41333m.m119797v(parameterAnnotations);
            C41536l.m120485e(v, "parameterAnnotations.first()");
            return (Annotation[]) v;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final Type m36139d(Method method) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            C41536l.m120485e(genericParameterTypes, "genericParameterTypes");
            Object v = C41333m.m119797v(genericParameterTypes);
            C41536l.m120485e(v, "genericParameterTypes.first()");
            return (Type) v;
        }
    }

    /* renamed from: af.c$b */
    public interface C9843b {
        /* renamed from: a */
        C9841c mo26333a(C18881a aVar, Method method);
    }

    /* renamed from: af.c$c */
    public static final class C9844c extends C9841c {

        /* renamed from: b */
        private final C9822a f26695b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C18881a f26696c;

        /* renamed from: d */
        private final C40757w f26697d;

        /* renamed from: e */
        private final C18559k f26698e;

        /* renamed from: af.c$c$a */
        public static final class C9845a implements C9843b {

            /* renamed from: a */
            private final C40757w f26699a;

            /* renamed from: b */
            private final C9822a.C9824b f26700b;

            /* renamed from: c */
            private final C9853f f26701c;

            public C9845a(C40757w wVar, C9822a.C9824b bVar, C9853f fVar) {
                C41536l.m120490j(wVar, "scheduler");
                C41536l.m120490j(bVar, "eventMapperFactory");
                C41536l.m120490j(fVar, "streamAdapterResolver");
                this.f26699a = wVar;
                this.f26700b = bVar;
                this.f26701c = fVar;
            }

            /* renamed from: c */
            private final C9822a m36143c(Method method) {
                C9822a.C9824b bVar = this.f26700b;
                Type genericReturnType = method.getGenericReturnType();
                if (genericReturnType != null) {
                    Annotation[] annotations = method.getAnnotations();
                    C41536l.m120485e(annotations, "method.annotations");
                    return bVar.mo26319a((ParameterizedType) genericReturnType, annotations);
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
            }

            /* renamed from: d */
            private final C18559k m36144d(Method method) {
                C9853f fVar = this.f26701c;
                Type genericReturnType = method.getGenericReturnType();
                C41536l.m120485e(genericReturnType, "method.genericReturnType");
                return fVar.mo26346a(genericReturnType);
            }

            /* renamed from: b */
            public C9844c mo26333a(C18881a aVar, Method method) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                C41536l.m120490j(aVar, "connection");
                C41536l.m120490j(method, "method");
                C9842a aVar2 = C9841c.f26694a;
                boolean z5 = false;
                Class[] clsArr = new Class[0];
                if (method.getGenericParameterTypes().length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    C41536l.m120485e(genericParameterTypes, "genericParameterTypes");
                    List S = C41333m.m119792S(genericParameterTypes, clsArr);
                    if (!(S instanceof Collection) || !S.isEmpty()) {
                        Iterator it = S.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C41224m mVar = (C41224m) it.next();
                            Type type = (Type) mVar.mo95675a();
                            Class cls = (Class) mVar.mo95676b();
                            if (cls == type || cls.isInstance(type)) {
                                z4 = true;
                                continue;
                            } else {
                                z4 = false;
                                continue;
                            }
                            if (!z4) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        C9842a aVar3 = C9841c.f26694a;
                        Class<ParameterizedType> cls2 = ParameterizedType.class;
                        if (cls2 == method.getGenericReturnType() || cls2.isInstance(method.getGenericReturnType())) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            z5 = true;
                        }
                        if (z5) {
                            Type genericReturnType = method.getGenericReturnType();
                            C41536l.m120485e(genericReturnType, "genericReturnType");
                            if (!C15495c.m56051c(genericReturnType)) {
                                return new C9844c(m36143c(method), aVar, this.f26699a, m36144d(method));
                            }
                            throw new IllegalArgumentException(("Method return type must not include a type variable or wildcard: " + method.getGenericReturnType()).toString());
                        }
                        throw new IllegalArgumentException(("Receive method must return ParameterizedType: " + method).toString());
                    }
                    throw new IllegalArgumentException(("Receive method must have zero parameter: " + method).toString());
                }
                throw new IllegalArgumentException(("Receive method must have zero parameter: " + method).toString());
            }
        }

        /* renamed from: af.c$c$b */
        static final class C9846b implements Callable {

            /* renamed from: d */
            final /* synthetic */ C9844c f26702d;

            C9846b(C9844c cVar) {
                this.f26702d = cVar;
            }

            /* renamed from: a */
            public final C40741h call() {
                return this.f26702d.f26696c.mo46876a();
            }
        }

        /* renamed from: af.c$c$c */
        static final /* synthetic */ class C9847c extends C41534j implements C43075l {
            C9847c(C9822a aVar) {
                super(1, aVar);
            }

            /* renamed from: b */
            public final C40744k invoke(C18523b bVar) {
                C41536l.m120490j(bVar, "p1");
                return ((C9822a) this.receiver).mo26318a(bVar);
            }

            public final String getName() {
                return "mapToData";
            }

            public final C40297d getOwner() {
                return C41520a0.m120436b(C9822a.class);
            }

            public final String getSignature() {
                return "mapToData(Lcom/tinder/scarlet/Event;)Lio/reactivex/Maybe;";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9844c(C9822a aVar, C18881a aVar2, C40757w wVar, C18559k kVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120490j(aVar, "eventMapper");
            C41536l.m120490j(aVar2, "connection");
            C41536l.m120490j(wVar, "scheduler");
            C41536l.m120490j(kVar, "streamAdapter");
            this.f26695b = aVar;
            this.f26696c = aVar2;
            this.f26697d = wVar;
            this.f26698e = kVar;
        }

        /* renamed from: b */
        public final Object mo26334b() {
            C40741h s = C40741h.m117961i(new C9846b(this)).mo94940w(this.f26697d).mo94937s(new C9850d(new C9847c(this.f26695b)));
            C41536l.m120485e(s, "Flowable.defer { connect…e(eventMapper::mapToData)");
            return this.f26698e.mo33552a(C15494b.m56048a(s));
        }
    }

    /* renamed from: af.c$d */
    public static final class C9848d extends C9841c {

        /* renamed from: b */
        private final C18881a f26703b;

        /* renamed from: c */
        private final C18542e f26704c;

        /* renamed from: af.c$d$a */
        public static final class C9849a implements C9843b {

            /* renamed from: a */
            private final C9839b f26705a;

            public C9849a(C9839b bVar) {
                C41536l.m120490j(bVar, "messageAdapterResolver");
                this.f26705a = bVar;
            }

            /* renamed from: b */
            public C9848d mo26333a(C18881a aVar, Method method) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                C41536l.m120490j(aVar, "connection");
                C41536l.m120490j(method, "method");
                C9842a aVar2 = C9841c.f26694a;
                boolean z5 = true;
                Class[] clsArr = {Object.class};
                if (method.getGenericParameterTypes().length == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    C41536l.m120485e(genericParameterTypes, "genericParameterTypes");
                    List S = C41333m.m119792S(genericParameterTypes, clsArr);
                    if (!(S instanceof Collection) || !S.isEmpty()) {
                        Iterator it = S.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C41224m mVar = (C41224m) it.next();
                            Type type = (Type) mVar.mo95675a();
                            Class cls = (Class) mVar.mo95676b();
                            if (cls == type || cls.isInstance(type)) {
                                z4 = true;
                                continue;
                            } else {
                                z4 = false;
                                continue;
                            }
                            if (!z4) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        C9842a aVar3 = C9841c.f26694a;
                        Class cls2 = Void.TYPE;
                        C41536l.m120485e(cls2, "Void.TYPE");
                        Class[] clsArr2 = {Boolean.TYPE, cls2};
                        int i = 0;
                        while (true) {
                            if (i >= 2) {
                                z5 = false;
                                break;
                            }
                            Class cls3 = clsArr2[i];
                            if (cls3 == method.getGenericReturnType() || cls3.isInstance(method.getGenericReturnType())) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                break;
                            }
                            i++;
                        }
                        if (z5) {
                            C9842a aVar4 = C9841c.f26694a;
                            return new C9848d(aVar, this.f26705a.mo26329b(aVar4.m36139d(method), aVar4.m36138c(method)));
                        }
                        throw new IllegalArgumentException(("Send method must return Boolean or Void: " + method).toString());
                    }
                    throw new IllegalArgumentException(("Send method must have one and only one parameter: " + method).toString());
                }
                throw new IllegalArgumentException(("Send method must have one and only one parameter: " + method).toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9848d(C18881a aVar, C18542e eVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120490j(aVar, "connection");
            C41536l.m120490j(eVar, "messageAdapter");
            this.f26703b = aVar;
            this.f26704c = eVar;
        }

        /* renamed from: a */
        public final Object mo26342a(Object obj) {
            C41536l.m120490j(obj, "data");
            return Boolean.valueOf(this.f26703b.mo46877b(this.f26704c.mo26872b(obj)));
        }
    }

    private C9841c() {
    }

    public /* synthetic */ C9841c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
