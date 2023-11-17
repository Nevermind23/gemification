package p341ge.bog.sso_client.models;

import af1.C40303i;
import ba1.C10146d0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;

/* renamed from: ge.bog.sso_client.models.r */
public abstract class C35962r {

    /* renamed from: a */
    private static final Session f87006a;

    static {
        Map unmodifiableMap = Collections.unmodifiableMap(new HashMap());
        C41536l.m120488h(unmodifiableMap, "unmodifiableMap(SessionAttrsImpl())");
        f87006a = new Session(unmodifiableMap, (Map) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static final void m107005c(Session session, C43075l lVar) {
        C41536l.m120489i(session, "<this>");
        C41536l.m120489i(lVar, "block");
        lVar.invoke(session);
        C10146d0.C10159c.f28157a.mo26693h(session);
    }

    /* renamed from: d */
    public static final Session m107006d() {
        return f87006a;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final Object m107007e(Map map, Object obj, C40303i iVar) {
        C41536l.m120489i(map, "<this>");
        return map.get(iVar.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m107008f(Map map, Object obj, C40303i iVar, Object obj2) {
        C41536l.m120489i(map, "<this>");
        map.put(iVar.getName(), obj2);
    }
}
