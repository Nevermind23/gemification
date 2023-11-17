package uf1;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.net.Proxy;
import kotlin.jvm.internal.C41536l;
import of1.C41869b0;
import of1.C41931v;

/* renamed from: uf1.i */
public final class C43096i {

    /* renamed from: a */
    public static final C43096i f100537a = new C43096i();

    private C43096i() {
    }

    /* renamed from: b */
    private final boolean m123666b(C41869b0 b0Var, Proxy.Type type) {
        return !b0Var.mo96677f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: a */
    public final String mo101671a(C41869b0 b0Var, Proxy.Type type) {
        C41536l.m120489i(b0Var, "request");
        C41536l.m120489i(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(b0Var.mo96678g());
        sb.append(' ');
        C43096i iVar = f100537a;
        if (iVar.m123666b(b0Var, type)) {
            sb.append(b0Var.mo96681j());
        } else {
            sb.append(iVar.mo101672c(b0Var.mo96681j()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: c */
    public final String mo101672c(C41931v vVar) {
        C41536l.m120489i(vVar, C11769i.C11770a.f34149l);
        String d = vVar.mo96948d();
        String f = vVar.mo96951f();
        if (f == null) {
            return d;
        }
        return d + '?' + f;
    }
}
