package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetSettingsQuery;
import ue1.C43075l;

final class GetSettingsQuery$CommonServices$Companion$invoke$1$getSettings$1 extends C41537m implements C43075l {
    public static final GetSettingsQuery$CommonServices$Companion$invoke$1$getSettings$1 INSTANCE = new GetSettingsQuery$CommonServices$Companion$invoke$1$getSettings$1();

    GetSettingsQuery$CommonServices$Companion$invoke$1$getSettings$1() {
        super(1);
    }

    public final GetSettingsQuery.GetSetting invoke(C8124o.C8129b bVar) {
        C41536l.m120489i(bVar, "reader");
        return (GetSettingsQuery.GetSetting) bVar.mo19033b(C427541.INSTANCE);
    }
}
