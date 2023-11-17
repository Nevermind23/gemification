package p341ge.bog.mobilebank.shared2.session;

import d51.C31539b;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.shared2.session.h */
public final class C34697h {

    /* renamed from: a */
    public static final C34697h f83869a = new C34697h();

    private C34697h() {
    }

    /* renamed from: a */
    public final SessionManager mo84774a(C31539b bVar) {
        C41536l.m120489i(bVar, "accessTokenRefresher");
        return new SessionManager(5, TimeUnit.MINUTES, 30, bVar);
    }
}
