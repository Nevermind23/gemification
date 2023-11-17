package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GenerateAuthTokenQuery;
import ue1.C43075l;

final class GenerateAuthTokenQuery$Data$Companion$invoke$1$loginServices$1 extends C41537m implements C43075l {
    public static final GenerateAuthTokenQuery$Data$Companion$invoke$1$loginServices$1 INSTANCE = new GenerateAuthTokenQuery$Data$Companion$invoke$1$loginServices$1();

    GenerateAuthTokenQuery$Data$Companion$invoke$1$loginServices$1() {
        super(1);
    }

    public final GenerateAuthTokenQuery.LoginServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return GenerateAuthTokenQuery.LoginServices.Companion.invoke(oVar);
    }
}
