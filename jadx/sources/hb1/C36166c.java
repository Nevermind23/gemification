package hb1;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p217q2.C7822a;
import p217q2.C7823b;

/* renamed from: hb1.c */
public final class C36166c implements C7822a {
    /* renamed from: c */
    public BigDecimal mo22743b(C7823b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        Object obj = bVar.f22746a;
        if (obj != null) {
            return (BigDecimal) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.math.BigDecimal");
    }

    /* renamed from: d */
    public C7823b mo22742a(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        return new C7823b.C7828e(bigDecimal);
    }
}
