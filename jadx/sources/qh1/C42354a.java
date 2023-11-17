package qh1;

import df1.C40651b;
import df1.C40659i;
import df1.C40660j;
import df1.C40663k;
import he1.C41224m;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: qh1.a */
public abstract class C42354a {
    /* renamed from: a */
    public static final double m122846a(C43064a aVar) {
        C41536l.m120489i(aVar, "code");
        C40659i a = C40660j.C40661a.f96294a.mo94648a();
        aVar.invoke();
        return C40651b.getInMilliseconds-impl(a.elapsedNow-UwyO8pc());
    }

    /* renamed from: b */
    public static final C41224m m122847b(C43064a aVar) {
        C41536l.m120489i(aVar, "code");
        C40663k kVar = new C40663k(aVar.invoke(), C40660j.C40661a.f96294a.mo94648a().elapsedNow-UwyO8pc(), (DefaultConstructorMarker) null);
        return new C41224m(kVar.mo94660a(), Double.valueOf(C40651b.getInMilliseconds-impl(kVar.getDuration-UwyO8pc())));
    }
}
