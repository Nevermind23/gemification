package p723bz;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferApiEntity;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferCountryApiEntity;
import p777gz.C24838a;
import p777gz.C24839b;

/* renamed from: bz.a */
public final class C19415a {
    /* renamed from: b */
    private final C24839b m64914b(MoneyTransferCountryApiEntity moneyTransferCountryApiEntity) {
        return new C24839b(moneyTransferCountryApiEntity.getCode(), moneyTransferCountryApiEntity.getCaption(), moneyTransferCountryApiEntity.getDeliveryOptions(), moneyTransferCountryApiEntity.getCurrencies(), moneyTransferCountryApiEntity.getReceiveAllowed(), moneyTransferCountryApiEntity.getStates());
    }

    /* renamed from: a */
    public final C24838a mo47648a(MoneyTransferApiEntity moneyTransferApiEntity) {
        List list;
        C41536l.m120489i(moneyTransferApiEntity, "transfer");
        double amount = moneyTransferApiEntity.getAmount();
        String senderName = moneyTransferApiEntity.getSenderName();
        Double totalFee = moneyTransferApiEntity.getTotalFee();
        String receiverName = moneyTransferApiEntity.getReceiverName();
        String currency = moneyTransferApiEntity.getCurrency();
        Integer documentId = moneyTransferApiEntity.getDocumentId();
        List<MoneyTransferCountryApiEntity> countries = moneyTransferApiEntity.getCountries();
        if (countries != null) {
            list = new ArrayList(C41343r.m119925u(countries, 10));
            for (MoneyTransferCountryApiEntity b : countries) {
                list.add(m64914b(b));
            }
        } else {
            list = C41341q.m119907j();
        }
        Object message = moneyTransferApiEntity.getMessage();
        String sendCountry = moneyTransferApiEntity.getSendCountry();
        List<String> senders = moneyTransferApiEntity.getSenders();
        if (senders == null) {
            senders = C41341q.m119907j();
        }
        return new C24838a(amount, senderName, totalFee, receiverName, currency, documentId, list, message, sendCountry, senders, moneyTransferApiEntity.getTransferNumber(), moneyTransferApiEntity.getMts());
    }
}
