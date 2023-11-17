package e41;

import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlag;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;

/* renamed from: e41.d */
public abstract class C31662d {
    /* renamed from: a */
    public static final boolean m93797a(TMXFlags tMXFlags, String str) {
        T t;
        Boolean value;
        C41536l.m120489i(tMXFlags, "<this>");
        C41536l.m120489i(str, "tmxFlagKey");
        Iterator<T> it = tMXFlags.getForms().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C41536l.m120484d(((TMXFlag) t).getKey(), str)) {
                break;
            }
        }
        TMXFlag tMXFlag = (TMXFlag) t;
        if (tMXFlag == null || (value = tMXFlag.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }
}
