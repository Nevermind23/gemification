package p256t2;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: t2.h */
public final class C8348h {

    /* renamed from: a */
    public static final C8348h f23750a = new C8348h();

    private C8348h() {
    }

    /* renamed from: a */
    public static final void m31406a(Object obj, C8341f fVar) {
        C41536l.m120490j(fVar, "jsonWriter");
        if (obj == null) {
            fVar.mo23509R();
        } else if (obj instanceof Map) {
            C8341f k = fVar.mo23513k();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                fVar.mo23508Q(String.valueOf(key));
                m31406a(value, k);
            }
            k.mo23516o();
        } else if (obj instanceof List) {
            C8341f a = fVar.mo23510a();
            for (Object a2 : (Iterable) obj) {
                m31406a(a2, a);
            }
            a.mo23514n();
        } else if (obj instanceof Boolean) {
            fVar.mo23517o0((Boolean) obj);
        } else if (obj instanceof Number) {
            fVar.mo23518p0((Number) obj);
        } else {
            fVar.mo23519q0(obj.toString());
        }
    }
}
