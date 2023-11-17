package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.PasscodeLoginQuery;
import ue1.C43075l;

final class PasscodeLoginQuery$LoginServices$Companion$invoke$1$login$1 extends C41537m implements C43075l {
    public static final PasscodeLoginQuery$LoginServices$Companion$invoke$1$login$1 INSTANCE = new PasscodeLoginQuery$LoginServices$Companion$invoke$1$login$1();

    PasscodeLoginQuery$LoginServices$Companion$invoke$1$login$1() {
        super(1);
    }

    public final PasscodeLoginQuery.Login invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return PasscodeLoginQuery.Login.Companion.invoke(oVar);
    }
}
