package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.BiometricLoginQuery;
import ue1.C43075l;

final class BiometricLoginQuery$LoginServices$Companion$invoke$1$login$1 extends C41537m implements C43075l {
    public static final BiometricLoginQuery$LoginServices$Companion$invoke$1$login$1 INSTANCE = new BiometricLoginQuery$LoginServices$Companion$invoke$1$login$1();

    BiometricLoginQuery$LoginServices$Companion$invoke$1$login$1() {
        super(1);
    }

    public final BiometricLoginQuery.Login invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return BiometricLoginQuery.Login.Companion.invoke(oVar);
    }
}
