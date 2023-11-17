package t51;

import b50.C19333a;
import b50.C19335b;
import b50.C19336c;
import f50.C20432f;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.account.AccountOperation;

/* renamed from: t51.l */
public abstract class C38671l {
    /* renamed from: a */
    public static final C38669j m113338a(AccountOperation accountOperation) {
        long j;
        C41536l.m120489i(accountOperation, "<this>");
        C20432f.C20434b.C20436b d = C19333a.m64785d(accountOperation);
        String j2 = d.mo48938j();
        String g = d.mo48934g();
        String c = d.mo48929c();
        Integer b = d.mo48928b();
        C19336c f = d.mo48933f();
        BigDecimal h = d.mo48935h();
        C19335b c2 = C19333a.m64784c(d.mo48937i());
        Long e = d.mo48931e();
        if (e != null) {
            j = e.longValue();
        } else {
            j = 0;
        }
        return new C38669j(j2, g, c, b, f, h, c2, j, d.mo48939k(), C41536l.m120484d(d.mo48939k(), accountOperation.getGroupImageUrl()), accountOperation);
    }
}
