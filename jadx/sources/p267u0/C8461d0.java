package p267u0;

import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C41536l;
import p318y0.C8999j;

/* renamed from: u0.d0 */
public final class C8461d0 implements C8999j.C9005c {

    /* renamed from: a */
    private final String f24050a;

    /* renamed from: b */
    private final File f24051b;

    /* renamed from: c */
    private final Callable f24052c;

    /* renamed from: d */
    private final C8999j.C9005c f24053d;

    public C8461d0(String str, File file, Callable callable, C8999j.C9005c cVar) {
        C41536l.m120489i(cVar, "mDelegate");
        this.f24050a = str;
        this.f24051b = file;
        this.f24052c = callable;
        this.f24053d = cVar;
    }

    /* renamed from: a */
    public C8999j mo6928a(C8999j.C9002b bVar) {
        C41536l.m120489i(bVar, "configuration");
        return new C8445c0(bVar.f25031a, this.f24050a, this.f24051b, this.f24052c, bVar.f25033c.f25029a, this.f24053d.mo6928a(bVar));
    }
}
