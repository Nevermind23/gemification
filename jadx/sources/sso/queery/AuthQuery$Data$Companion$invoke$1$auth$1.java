package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.AuthQuery;
import ue1.C43075l;

final class AuthQuery$Data$Companion$invoke$1$auth$1 extends C41537m implements C43075l {
    public static final AuthQuery$Data$Companion$invoke$1$auth$1 INSTANCE = new AuthQuery$Data$Companion$invoke$1$auth$1();

    AuthQuery$Data$Companion$invoke$1$auth$1() {
        super(1);
    }

    public final AuthQuery.Auth invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return AuthQuery.Auth.Companion.invoke(oVar);
    }
}
