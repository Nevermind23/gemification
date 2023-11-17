package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.SetPassCodeQuery;
import ue1.C43075l;

final class SetPassCodeQuery$Data$Companion$invoke$1$loginServices$1 extends C41537m implements C43075l {
    public static final SetPassCodeQuery$Data$Companion$invoke$1$loginServices$1 INSTANCE = new SetPassCodeQuery$Data$Companion$invoke$1$loginServices$1();

    SetPassCodeQuery$Data$Companion$invoke$1$loginServices$1() {
        super(1);
    }

    public final SetPassCodeQuery.LoginServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return SetPassCodeQuery.LoginServices.Companion.invoke(oVar);
    }
}
