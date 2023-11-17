package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.RefreshTokenQuery;
import ue1.C43075l;

final class RefreshTokenQuery$Data$Companion$invoke$1$loginServices$1 extends C41537m implements C43075l {
    public static final RefreshTokenQuery$Data$Companion$invoke$1$loginServices$1 INSTANCE = new RefreshTokenQuery$Data$Companion$invoke$1$loginServices$1();

    RefreshTokenQuery$Data$Companion$invoke$1$loginServices$1() {
        super(1);
    }

    public final RefreshTokenQuery.LoginServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return RefreshTokenQuery.LoginServices.Companion.invoke(oVar);
    }
}
