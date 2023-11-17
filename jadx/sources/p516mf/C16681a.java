package p516mf;

import p627uf.C18153a;
import p627uf.C18154b;

/* renamed from: mf.a */
public abstract class C16681a {
    /* renamed from: a */
    public static Object m59022a(Object obj, Class cls) {
        if (obj instanceof C18153a) {
            return cls.cast(obj);
        }
        if (obj instanceof C18154b) {
            return m59022a(((C18154b) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), C18153a.class, C18154b.class}));
    }
}
