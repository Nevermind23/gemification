package p455ho;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ho.c */
public abstract class C15549c {
    /* renamed from: a */
    public static final boolean m56155a(List list) {
        C41536l.m120489i(list, "<this>");
        if (list.contains(C15547a.EMPLOYER) || list.contains(C15547a.E_MAIL) || list.contains(C15547a.MOBILE_PHONE) || list.contains(C15547a.FEE_PAYMENT_TYPE)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m56156b(List list) {
        C41536l.m120489i(list, "<this>");
        return list.contains(C15547a.PRE_CONTRACT);
    }

    /* renamed from: c */
    public static final boolean m56157c(List list) {
        C41536l.m120489i(list, "<this>");
        if (list.contains(C15547a.EMPLOYER) || list.contains(C15547a.MOBILE_PHONE) || list.contains(C15547a.E_MAIL)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m56158d(List list) {
        C41536l.m120489i(list, "<this>");
        if (list.contains(C15547a.FINANCIAL_INFO) || list.contains(C15547a.SOLO_LOUNGE)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m56159e(List list) {
        C41536l.m120489i(list, "<this>");
        return list.contains(C15547a.SOLO_USAGE_TERMS);
    }
}
