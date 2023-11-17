package ir0;

import er0.C31768a;
import er0.C31769b;
import fd0.C20463a;
import jr0.C36783a;
import jr0.C36786b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ir0.a */
public final class C36491a {
    /* renamed from: a */
    public final C36783a.C36785b mo89289a(C31768a aVar) {
        C41536l.m120489i(aVar, "externalProperty");
        long d = aVar.mo72201d();
        String f = aVar.mo72204f();
        if (f == null) {
            f = aVar.mo72200c() + " " + aVar.mo72202e();
        }
        return new C36783a.C36785b(d, f, aVar.mo72198a(), aVar.mo72199b(), false, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final C36786b mo89290b(C20463a aVar) {
        C41536l.m120489i(aVar, "lookup");
        return new C36786b(aVar.mo49003c(), aVar.mo49004d(), aVar.mo49001a());
    }

    /* renamed from: c */
    public final C36783a mo89291c(C31769b bVar, String str) {
        C41536l.m120489i(bVar, "property");
        C41536l.m120489i(str, "fullName");
        return new C36783a.C36785b(bVar.mo72209c(), str, bVar.mo72207a(), bVar.mo72208b(), false, 16, (DefaultConstructorMarker) null);
    }
}
