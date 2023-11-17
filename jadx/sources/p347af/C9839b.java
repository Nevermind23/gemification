package p347af;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C41536l;
import p469io.reactivex.exceptions.CompositeException;
import p652we.C18542e;

/* renamed from: af.b */
public final class C9839b {

    /* renamed from: a */
    private final Map f26690a = new LinkedHashMap();

    /* renamed from: b */
    private final List f26691b;

    /* renamed from: af.b$a */
    private static final class C9840a {

        /* renamed from: a */
        private final Type f26692a;

        /* renamed from: b */
        private final Annotation[] f26693b;

        public C9840a(Type type, Annotation[] annotationArr) {
            C41536l.m120490j(type, "type");
            C41536l.m120490j(annotationArr, "annotations");
            this.f26692a = type;
            this.f26693b = annotationArr;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<C9840a> cls2 = C9840a.class;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!C41536l.m120484d(cls2, cls)) {
                return false;
            }
            if (obj != null) {
                C9840a aVar = (C9840a) obj;
                if (!(!C41536l.m120484d(this.f26692a, aVar.f26692a)) && Arrays.equals(this.f26693b, aVar.f26693b)) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.scarlet.internal.servicemethod.MessageAdapterResolver.MessageAdapterKey");
        }

        public int hashCode() {
            return (this.f26692a.hashCode() * 31) + Arrays.hashCode(this.f26693b);
        }

        public String toString() {
            return "MessageAdapterKey(type=" + this.f26692a + ", annotations=" + Arrays.toString(this.f26693b) + ")";
        }
    }

    public C9839b(List list) {
        C41536l.m120490j(list, "messageAdapterFactories");
        this.f26691b = list;
    }

    /* renamed from: a */
    private final C18542e m36134a(Type type, Annotation[] annotationArr) {
        ArrayList arrayList = new ArrayList();
        for (C18542e.C18543a a : this.f26691b) {
            try {
                C18542e a2 = a.mo26875a(type, annotationArr);
                if (a2 != null) {
                    return a2;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.scarlet.MessageAdapter<kotlin.Any>");
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        Object[] array = arrayList.toArray(new Throwable[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Throwable[] thArr = (Throwable[]) array;
        CompositeException compositeException = new CompositeException((Throwable[]) Arrays.copyOf(thArr, thArr.length));
        throw new IllegalStateException("Cannot resolve message adapter for type: " + type + ", annotations: " + annotationArr + '.', compositeException);
    }

    /* renamed from: b */
    public final C18542e mo26329b(Type type, Annotation[] annotationArr) {
        C41536l.m120490j(type, "type");
        C41536l.m120490j(annotationArr, "annotations");
        C9840a aVar = new C9840a(type, annotationArr);
        if (this.f26690a.containsKey(aVar)) {
            Object obj = this.f26690a.get(aVar);
            if (obj == null) {
                C41536l.m120500t();
            }
            return (C18542e) obj;
        }
        C18542e a = m36134a(type, annotationArr);
        this.f26690a.put(aVar, a);
        return a;
    }
}
