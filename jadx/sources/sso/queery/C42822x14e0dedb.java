package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.RefreshTokenQuery;
import ue1.C43075l;

/* renamed from: sso.queery.RefreshTokenQuery$LoginServices$Companion$invoke$1$refreshToken$1 */
final class C42822x14e0dedb extends C41537m implements C43075l {
    public static final C42822x14e0dedb INSTANCE = new C42822x14e0dedb();

    C42822x14e0dedb() {
        super(1);
    }

    public final RefreshTokenQuery.RefreshToken invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return RefreshTokenQuery.RefreshToken.Companion.invoke(oVar);
    }
}
