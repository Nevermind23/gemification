package se0;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTAcquireApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTDividendApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTDividendTaxApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTInstrumentApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTMergerAcquisitionApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTTransactionApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTTransactionHistoryApiModel;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTAcquire;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTDividend;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTDividendTax;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTInstrument;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTMergerRequisition;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction;
import p342j$.util.DesugarTimeZone;
import ug0.C28786c;

/* renamed from: se0.a */
public final class C28191a {
    /* renamed from: a */
    public final GTAcquire mo67706a(GTAcquireApiModel gTAcquireApiModel) {
        C41536l.m120489i(gTAcquireApiModel, "data");
        return new GTAcquire(gTAcquireApiModel.getId(), gTAcquireApiModel.getSymbol(), gTAcquireApiModel.getName());
    }

    /* renamed from: b */
    public final GTDividend mo67707b(GTDividendApiModel gTDividendApiModel) {
        C41536l.m120489i(gTDividendApiModel, "data");
        return new GTDividend(gTDividendApiModel.getType(), gTDividendApiModel.getAmountPerShare(), gTDividendApiModel.getTaxCode());
    }

    /* renamed from: c */
    public final GTDividendTax mo67708c(GTDividendTaxApiModel gTDividendTaxApiModel) {
        C41536l.m120489i(gTDividendTaxApiModel, "data");
        return new GTDividendTax(gTDividendTaxApiModel.getRate(), gTDividendTaxApiModel.getType());
    }

    /* renamed from: d */
    public final GTInstrument mo67709d(GTInstrumentApiModel gTInstrumentApiModel) {
        C41536l.m120489i(gTInstrumentApiModel, "data");
        return new GTInstrument(gTInstrumentApiModel.getId(), gTInstrumentApiModel.getSymbol(), gTInstrumentApiModel.getName(), gTInstrumentApiModel.getImage());
    }

    /* renamed from: e */
    public final GTMergerRequisition mo67710e(GTMergerAcquisitionApiModel gTMergerAcquisitionApiModel) {
        GTAcquire gTAcquire;
        C41536l.m120489i(gTMergerAcquisitionApiModel, "data");
        String type = gTMergerAcquisitionApiModel.getType();
        GTAcquireApiModel acquirer = gTMergerAcquisitionApiModel.getAcquirer();
        GTAcquire gTAcquire2 = null;
        if (acquirer != null) {
            gTAcquire = mo67706a(acquirer);
        } else {
            gTAcquire = null;
        }
        GTAcquireApiModel acquiree = gTMergerAcquisitionApiModel.getAcquiree();
        if (acquiree != null) {
            gTAcquire2 = mo67706a(acquiree);
        }
        return new GTMergerRequisition(type, gTAcquire, gTAcquire2);
    }

    /* renamed from: f */
    public final GTTransaction mo67711f(GTTransactionApiModel gTTransactionApiModel) {
        String str;
        GTMergerRequisition gTMergerRequisition;
        GTDividend gTDividend;
        GTDividendTax gTDividendTax;
        GTInstrument gTInstrument;
        C41536l.m120489i(gTTransactionApiModel, "data");
        String accountAmount = gTTransactionApiModel.getAccountAmount();
        String accountBalance = gTTransactionApiModel.getAccountBalance();
        String accountType = gTTransactionApiModel.getAccountType();
        String comment = gTTransactionApiModel.getComment();
        String dnb = gTTransactionApiModel.getDnb();
        String finTranID = gTTransactionApiModel.getFinTranID();
        String finTranTypeID = gTTransactionApiModel.getFinTranTypeID();
        String feeSec = gTTransactionApiModel.getFeeSec();
        String feeTaf = gTTransactionApiModel.getFeeTaf();
        String feeXtraShares = gTTransactionApiModel.getFeeXtraShares();
        String feeExchange = gTTransactionApiModel.getFeeExchange();
        Double fillQty = gTTransactionApiModel.getFillQty();
        if (fillQty != null) {
            str = C28786c.m88251g(fillQty.doubleValue());
        } else {
            str = null;
        }
        String fillPx = gTTransactionApiModel.getFillPx();
        String orderID = gTTransactionApiModel.getOrderID();
        String positionDelta = gTTransactionApiModel.getPositionDelta();
        String sendCommissionToInteliclear = gTTransactionApiModel.getSendCommissionToInteliclear();
        String systemAmount = gTTransactionApiModel.getSystemAmount();
        String tranAmount = gTTransactionApiModel.getTranAmount();
        String tranSource = gTTransactionApiModel.getTranSource();
        String g = mo67712g(gTTransactionApiModel.getTranWhen());
        String wlpAmount = gTTransactionApiModel.getWlpAmount();
        String orderNo = gTTransactionApiModel.getOrderNo();
        String wplFinTranTypeID = gTTransactionApiModel.getWplFinTranTypeID();
        String execType = gTTransactionApiModel.getExecType();
        Integer ordStatus = gTTransactionApiModel.getOrdStatus();
        String ordType = gTTransactionApiModel.getOrdType();
        String ordRejReason = gTTransactionApiModel.getOrdRejReason();
        String ordRejCode = gTTransactionApiModel.getOrdRejCode();
        String ordRejDctKey = gTTransactionApiModel.getOrdRejDctKey();
        String side = gTTransactionApiModel.getSide();
        String lastShares = gTTransactionApiModel.getLastShares();
        String lastPx = gTTransactionApiModel.getLastPx();
        String cumQty = gTTransactionApiModel.getCumQty();
        String leavesQty = gTTransactionApiModel.getLeavesQty();
        String orderQty = gTTransactionApiModel.getOrderQty();
        GTMergerAcquisitionApiModel mergerAcquisition = gTTransactionApiModel.getMergerAcquisition();
        if (mergerAcquisition != null) {
            gTMergerRequisition = mo67710e(mergerAcquisition);
        } else {
            gTMergerRequisition = null;
        }
        GTDividendApiModel dividend = gTTransactionApiModel.getDividend();
        if (dividend != null) {
            gTDividend = mo67707b(dividend);
        } else {
            gTDividend = null;
        }
        GTDividendTaxApiModel dividendTax = gTTransactionApiModel.getDividendTax();
        if (dividendTax != null) {
            gTDividendTax = mo67708c(dividendTax);
        } else {
            gTDividendTax = null;
        }
        GTInstrumentApiModel instrument = gTTransactionApiModel.getInstrument();
        if (instrument != null) {
            gTInstrument = mo67709d(instrument);
        } else {
            gTInstrument = null;
        }
        return new GTTransaction(accountAmount, accountBalance, accountType, comment, dnb, finTranID, finTranTypeID, feeSec, feeTaf, feeXtraShares, feeExchange, str, fillPx, orderID, positionDelta, sendCommissionToInteliclear, systemAmount, tranAmount, tranSource, g, wlpAmount, orderNo, wplFinTranTypeID, execType, ordStatus, ordType, ordRejReason, ordRejCode, ordRejDctKey, side, lastShares, lastPx, cumQty, leavesQty, orderQty, gTMergerRequisition, gTDividend, gTDividendTax, gTInstrument, gTTransactionApiModel.getFeeBase(), gTTransactionApiModel.getAmountCash());
    }

    /* renamed from: g */
    public final String mo67712g(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            Date parse = simpleDateFormat.parse(str);
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat.format(parse);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: h */
    public final List mo67713h(GTTransactionHistoryApiModel gTTransactionHistoryApiModel) {
        C41536l.m120489i(gTTransactionHistoryApiModel, "data");
        List<GTTransactionApiModel> transactions = gTTransactionHistoryApiModel.getTransactions();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(transactions, 10));
        for (GTTransactionApiModel f : transactions) {
            arrayList.add(mo67711f(f));
        }
        return arrayList;
    }
}
