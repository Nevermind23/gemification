package p390df;

import kotlin.jvm.internal.C41536l;
import p652we.C18539d;
import p652we.C18542e;

/* renamed from: df.b */
public final class C12109b implements C18542e {
    /* renamed from: c */
    public byte[] mo26871a(C18539d dVar) {
        C41536l.m120490j(dVar, "message");
        if (dVar instanceof C18539d.C18540a) {
            return ((C18539d.C18540a) dVar).mo46351a();
        }
        throw new IllegalArgumentException("This Message Adapter only supports bytes Messages");
    }

    /* renamed from: d */
    public C18539d mo26872b(byte[] bArr) {
        C41536l.m120490j(bArr, "data");
        return new C18539d.C18540a(bArr);
    }
}
