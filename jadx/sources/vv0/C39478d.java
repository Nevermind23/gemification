package vv0;

import bw0.C31211d;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p2p.data.model.CreateInComeTopUpPaymentApiModel;

/* renamed from: vv0.d */
public final class C39478d {
    /* renamed from: a */
    public final C31211d mo93108a(CreateInComeTopUpPaymentApiModel createInComeTopUpPaymentApiModel) {
        C41536l.m120489i(createInComeTopUpPaymentApiModel, "createInComeTopUpPaymentApiModel");
        return new C31211d(createInComeTopUpPaymentApiModel.getOpDocKey(), createInComeTopUpPaymentApiModel.getP2pWebStartUrl());
    }
}
