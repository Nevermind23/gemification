package p723bz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferTypeApiEntity;
import p777gz.C24841d;

/* renamed from: bz.b */
public final class C19416b {
    /* renamed from: a */
    public final List mo47649a(List list) {
        boolean z;
        List list2 = list;
        C41536l.m120489i(list2, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MoneyTransferTypeApiEntity moneyTransferTypeApiEntity = (MoneyTransferTypeApiEntity) it.next();
            String mtSystem = moneyTransferTypeApiEntity.getMtSystem();
            Boolean skipSendCountrySelection = moneyTransferTypeApiEntity.getSkipSendCountrySelection();
            String mtSystemDictionaryKey = moneyTransferTypeApiEntity.getMtSystemDictionaryKey();
            Integer reviseId = moneyTransferTypeApiEntity.getReviseId();
            Long acceptTime = moneyTransferTypeApiEntity.getAcceptTime();
            Boolean transferNumberAllowsCharacters = moneyTransferTypeApiEntity.getTransferNumberAllowsCharacters();
            Long editTime = moneyTransferTypeApiEntity.getEditTime();
            Boolean payoutAmountRequired = moneyTransferTypeApiEntity.getPayoutAmountRequired();
            Integer transferNumberMinLength = moneyTransferTypeApiEntity.getTransferNumberMinLength();
            String editUsername = moneyTransferTypeApiEntity.getEditUsername();
            String acceptUsername = moneyTransferTypeApiEntity.getAcceptUsername();
            Boolean sendInCountry = moneyTransferTypeApiEntity.getSendInCountry();
            Boolean receiveAvailable = moneyTransferTypeApiEntity.getReceiveAvailable();
            Integer transferNumberMaxLength = moneyTransferTypeApiEntity.getTransferNumberMaxLength();
            Boolean payoutCurrencyAvailable = moneyTransferTypeApiEntity.getPayoutCurrencyAvailable();
            Boolean sendAvailable = moneyTransferTypeApiEntity.getSendAvailable();
            Object previousRevision = moneyTransferTypeApiEntity.getPreviousRevision();
            String info = moneyTransferTypeApiEntity.getInfo();
            String status = moneyTransferTypeApiEntity.getStatus();
            String logoUrl = moneyTransferTypeApiEntity.getLogoUrl();
            List<String> currencies = moneyTransferTypeApiEntity.getCurrencies();
            Boolean requiresSenderCountry = moneyTransferTypeApiEntity.getRequiresSenderCountry();
            if (requiresSenderCountry != null) {
                z = requiresSenderCountry.booleanValue();
            } else {
                z = false;
            }
            boolean hasUniversalFind = moneyTransferTypeApiEntity.getHasUniversalFind();
            C24841d dVar = r3;
            C24841d dVar2 = new C24841d(mtSystem, skipSendCountrySelection, mtSystemDictionaryKey, reviseId, acceptTime, transferNumberAllowsCharacters, editTime, payoutAmountRequired, transferNumberMinLength, editUsername, acceptUsername, sendInCountry, receiveAvailable, transferNumberMaxLength, payoutCurrencyAvailable, sendAvailable, previousRevision, info, status, logoUrl, currencies, z, hasUniversalFind);
            arrayList.add(dVar);
        }
        return arrayList;
    }
}
