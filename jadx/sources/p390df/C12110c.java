package p390df;

import kotlin.jvm.internal.C41536l;
import p652we.C18539d;
import p652we.C18542e;

/* renamed from: df.c */
public final class C12110c implements C18542e {
    /* renamed from: c */
    public String mo26871a(C18539d dVar) {
        C41536l.m120490j(dVar, "message");
        if (dVar instanceof C18539d.C18541b) {
            return ((C18539d.C18541b) dVar).mo46352a();
        }
        throw new IllegalArgumentException("This Message Adapter only supports text Messages");
    }

    /* renamed from: d */
    public C18539d mo26872b(String str) {
        C41536l.m120490j(str, "data");
        return new C18539d.C18541b(str);
    }
}
