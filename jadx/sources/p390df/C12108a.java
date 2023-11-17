package p390df;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C41536l;
import p446hf.C15495c;
import p652we.C18542e;

/* renamed from: df.a */
public final class C12108a implements C18542e.C18543a {
    /* renamed from: a */
    public C18542e mo26875a(Type type, Annotation[] annotationArr) {
        C41536l.m120490j(type, "type");
        C41536l.m120490j(annotationArr, "annotations");
        Class b = C15495c.m56050b(type);
        if (C41536l.m120484d(b, String.class)) {
            return new C12110c();
        }
        if (C41536l.m120484d(b, byte[].class)) {
            return new C12109b();
        }
        throw new IllegalArgumentException("Type is not supported by this MessageAdapterFactory: " + type);
    }
}
