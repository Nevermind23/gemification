package p942xq;

import ed1.C40762x;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p706ar.C19270b;

/* renamed from: xq.a */
public final class C29823a {

    /* renamed from: a */
    private final C19270b f75515a;

    public C29823a(C19270b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f75515a = bVar;
    }

    /* renamed from: a */
    public final C40762x mo70086a(String str) {
        C41536l.m120489i(str, "contractType");
        return this.f75515a.getContract(str);
    }

    /* renamed from: b */
    public final C40762x mo70087b(Map map) {
        C41536l.m120489i(map, "parameters");
        return this.f75515a.mo47494a(map);
    }
}
