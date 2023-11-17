package p418ff;

import java.lang.reflect.Type;
import kotlin.jvm.internal.C41536l;
import p446hf.C15495c;
import p652we.C18558j;
import p652we.C18559k;

/* renamed from: ff.a */
public final class C12868a implements C18559k.C18560a {
    /* renamed from: a */
    public C18559k mo33551a(Type type) {
        C41536l.m120490j(type, "type");
        if (C41536l.m120484d(C15495c.m56050b(type), C18558j.class)) {
            return new C12869b();
        }
        throw new IllegalArgumentException(type + " is not supported.");
    }
}
