package p362bg;

import cf1.C40407d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p652we.C18539d;
import p652we.C18542e;

/* renamed from: bg.c */
public final class C10273c implements C18542e {

    /* renamed from: bg.c$a */
    public static final class C10274a implements C18542e.C18543a {
        /* renamed from: a */
        public C18542e mo26875a(Type type, Annotation[] annotationArr) {
            C41536l.m120489i(type, "type");
            C41536l.m120489i(annotationArr, "annotations");
            if (C41536l.m120484d(type, C10272b.class)) {
                return new C10273c((DefaultConstructorMarker) null);
            }
            throw new IllegalStateException(("Type " + type + " not supported").toString());
        }
    }

    private C10273c() {
    }

    public /* synthetic */ C10273c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: c */
    public C10272b mo26871a(C18539d dVar) {
        String str;
        C41536l.m120489i(dVar, "message");
        if (dVar instanceof C18539d.C18541b) {
            str = ((C18539d.C18541b) dVar).mo46352a();
        } else if (dVar instanceof C18539d.C18540a) {
            str = new String(((C18539d.C18540a) dVar).mo46351a(), C40407d.f95989b);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C10272b d = C10272b.m37452d(str);
        C41536l.m120488h(d, "from(stringValue)");
        return d;
    }

    /* renamed from: d */
    public C18539d mo26872b(C10272b bVar) {
        C41536l.m120489i(bVar, "data");
        String a = bVar.mo26865a();
        C41536l.m120488h(a, "data.compile()");
        return new C18539d.C18541b(a);
    }
}
