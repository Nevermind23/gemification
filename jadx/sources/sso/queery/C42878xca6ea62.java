package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.UntrustDeviceQuery;
import ue1.C43075l;

/* renamed from: sso.queery.UntrustDeviceQuery$Data$Companion$invoke$1$deviceManagementServices$1 */
final class C42878xca6ea62 extends C41537m implements C43075l {
    public static final C42878xca6ea62 INSTANCE = new C42878xca6ea62();

    C42878xca6ea62() {
        super(1);
    }

    public final UntrustDeviceQuery.DeviceManagementServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return UntrustDeviceQuery.DeviceManagementServices.Companion.invoke(oVar);
    }
}
