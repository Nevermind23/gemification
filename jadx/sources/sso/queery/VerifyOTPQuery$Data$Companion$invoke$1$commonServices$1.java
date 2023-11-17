package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.VerifyOTPQuery;
import ue1.C43075l;

final class VerifyOTPQuery$Data$Companion$invoke$1$commonServices$1 extends C41537m implements C43075l {
    public static final VerifyOTPQuery$Data$Companion$invoke$1$commonServices$1 INSTANCE = new VerifyOTPQuery$Data$Companion$invoke$1$commonServices$1();

    VerifyOTPQuery$Data$Companion$invoke$1$commonServices$1() {
        super(1);
    }

    public final VerifyOTPQuery.CommonServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return VerifyOTPQuery.CommonServices.Companion.invoke(oVar);
    }
}
