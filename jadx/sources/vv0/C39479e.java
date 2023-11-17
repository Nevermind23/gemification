package vv0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p2p.data.model.MoneyTransferResponseApiModel;
import p341ge.bog.mobilebank.p2p.domain.model.MoneyTransferResponse;

/* renamed from: vv0.e */
public final class C39479e {
    /* renamed from: a */
    public final MoneyTransferResponse mo93109a(MoneyTransferResponseApiModel moneyTransferResponseApiModel) {
        C41536l.m120489i(moneyTransferResponseApiModel, "moneyTransferResponseApiModel");
        return new MoneyTransferResponse(moneyTransferResponseApiModel.getAmount(), moneyTransferResponseApiModel.getCcy(), moneyTransferResponseApiModel.getComAmount(), moneyTransferResponseApiModel.getComCcy(), moneyTransferResponseApiModel.getContactPhoneNumber(), moneyTransferResponseApiModel.getNomination(), moneyTransferResponseApiModel.getContactName());
    }
}
