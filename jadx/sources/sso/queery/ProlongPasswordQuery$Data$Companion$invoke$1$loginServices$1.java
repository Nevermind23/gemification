package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.ProlongPasswordQuery;
import ue1.C43075l;

final class ProlongPasswordQuery$Data$Companion$invoke$1$loginServices$1 extends C41537m implements C43075l {
    public static final ProlongPasswordQuery$Data$Companion$invoke$1$loginServices$1 INSTANCE = new ProlongPasswordQuery$Data$Companion$invoke$1$loginServices$1();

    ProlongPasswordQuery$Data$Companion$invoke$1$loginServices$1() {
        super(1);
    }

    public final ProlongPasswordQuery.LoginServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return ProlongPasswordQuery.LoginServices.Companion.invoke(oVar);
    }
}
