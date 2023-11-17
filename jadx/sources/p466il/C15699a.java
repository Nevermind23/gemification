package p466il;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p438gl.C15292b;
import p438gl.C15295e;
import p563pk.C17371a;
import p563pk.C17377g;
import p615tg.C17959a;

/* renamed from: il.a */
public final class C15699a {
    /* renamed from: a */
    public final C15295e mo43009a(C17371a aVar) {
        C41536l.m120489i(aVar, "provider");
        String c = aVar.mo44815c();
        String d = aVar.mo44816d();
        String e = aVar.mo44817e();
        List<C17377g> a = aVar.mo44813a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (C17377g gVar : a) {
            arrayList.add(new C15292b(C17959a.m61879c(gVar.mo44857d(), gVar.mo44855b()), C17959a.m61879c(gVar.mo44854a(), gVar.mo44855b()), C17959a.m61879c(gVar.mo44858e(), gVar.mo44855b())));
        }
        return new C15295e(c, d, e, arrayList, false, 16, (DefaultConstructorMarker) null);
    }
}
