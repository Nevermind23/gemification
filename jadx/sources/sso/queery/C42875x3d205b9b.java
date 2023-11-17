package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.TrustDeviceQuery;
import ue1.C43075l;

/* renamed from: sso.queery.TrustDeviceQuery$Data$Companion$invoke$1$deviceManagementServices$1 */
final class C42875x3d205b9b extends C41537m implements C43075l {
    public static final C42875x3d205b9b INSTANCE = new C42875x3d205b9b();

    C42875x3d205b9b() {
        super(1);
    }

    public final TrustDeviceQuery.DeviceManagementServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return TrustDeviceQuery.DeviceManagementServices.Companion.invoke(oVar);
    }
}
