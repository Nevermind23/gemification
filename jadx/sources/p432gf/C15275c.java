package p432gf;

import ed1.C40741h;
import ed1.C40749p;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C41536l;
import p446hf.C15495c;
import p652we.C18559k;

/* renamed from: gf.c */
public final class C15275c implements C18559k.C18560a {
    /* renamed from: a */
    public C18559k mo33551a(Type type) {
        C41536l.m120490j(type, "type");
        Class b = C15495c.m56050b(type);
        if (C41536l.m120484d(b, C40741h.class)) {
            return new C15273a();
        }
        if (C41536l.m120484d(b, C40749p.class)) {
            return new C15274b();
        }
        throw new IllegalArgumentException(type + " is not supported by this StreamAdapterFactory");
    }
}
