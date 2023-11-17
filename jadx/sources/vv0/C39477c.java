package vv0;

import bw0.C31210c;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p2p.data.model.CommissionApiModel;

/* renamed from: vv0.c */
public final class C39477c {
    /* renamed from: a */
    public final C31210c mo93107a(CommissionApiModel commissionApiModel) {
        C41536l.m120489i(commissionApiModel, "commissionApiModel");
        return new C31210c(commissionApiModel.getComAmount(), commissionApiModel.getComCcy());
    }
}
