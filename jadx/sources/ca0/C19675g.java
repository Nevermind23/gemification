package ca0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.model.ddsto.DDSTODetailsWrapper;
import p341ge.bog.mobilebank.model.ddsto.STODetails;
import x90.C29662b;
import x90.C29663c;

/* renamed from: ca0.g */
public abstract class C19675g {
    /* renamed from: a */
    public static final DDSTO m65332a(C29662b bVar) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        C41536l.m120489i(bVar, "<this>");
        STODetails sTODetails = new STODetails();
        C29663c f = bVar.mo69617f();
        Long q = f.mo69652q();
        long j8 = 0;
        if (q != null) {
            j = q.longValue();
        } else {
            j = 0;
        }
        sTODetails.documentId = j;
        Long m = f.mo69648m();
        if (m != null) {
            j2 = m.longValue();
        } else {
            j2 = 0;
        }
        sTODetails.clientKey = j2;
        sTODetails.sentModule = f.mo69629B();
        Long C = f.mo69630C();
        if (C != null) {
            j3 = C.longValue();
        } else {
            j3 = 0;
        }
        sTODetails.srcAcctKey = j3;
        Long s = f.mo69654s();
        if (s != null) {
            j4 = s.longValue();
        } else {
            j4 = 0;
        }
        sTODetails.dstAcctKey = j4;
        sTODetails.documentName = f.mo69653r();
        sTODetails.amount = f.mo69638e();
        sTODetails.currency = f.mo69649n();
        sTODetails.description = f.mo69650o();
        sTODetails.benefAcctNo = f.mo69641g();
        sTODetails.benefBankCode = f.mo69642h();
        sTODetails.benefName = f.mo69645j();
        sTODetails.benefBankName = f.mo69644i();
        Long k = f.mo69646k();
        if (k != null) {
            j5 = k.longValue();
        } else {
            j5 = 0;
        }
        sTODetails.cdsAgreeKey = j5;
        sTODetails.intBankName = f.mo69658v();
        sTODetails.intBankCode = f.mo69657u();
        sTODetails.paymentdetail = f.mo69661y();
        sTODetails.charges = f.mo69647l();
        sTODetails.additionalInfo = f.mo69636c();
        Long D = f.mo69631D();
        if (D != null) {
            j6 = D.longValue();
        } else {
            j6 = 0;
        }
        sTODetails.startDate = j6;
        Long t = f.mo69655t();
        if (t != null) {
            j7 = t.longValue();
        } else {
            j7 = 0;
        }
        sTODetails.endDate = j7;
        sTODetails.periodType = f.mo69662z();
        Long w = f.mo69659w();
        if (w != null) {
            j8 = w.longValue();
        }
        sTODetails.nextSentDate = j8;
        sTODetails.agreeNo = f.mo69637d();
        sTODetails.status = f.mo69632E();
        sTODetails.senderInn = f.mo69628A();
        sTODetails.acctNo = f.mo69635b();
        sTODetails.acctDesc = f.mo69634a();
        sTODetails.benefAcctDesc = f.mo69640f();
        sTODetails.payerName = f.mo69660x();
        sTODetails.dictionaryKey = f.mo69651p();
        sTODetails.subProductCode = f.mo69633F();
        DDSTODetailsWrapper dDSTODetailsWrapper = new DDSTODetailsWrapper();
        dDSTODetailsWrapper.stoDetails = sTODetails;
        dDSTODetailsWrapper.paymentId = bVar.mo69621i();
        DDSTO ddsto = new DDSTO();
        ddsto.paymentId = bVar.mo69621i();
        ddsto.serviceCode = bVar.mo69625m();
        ddsto.periodType = bVar.mo69622j();
        ddsto.periodTypeDictionaryKey = bVar.mo69623k();
        ddsto.nextSentDate = bVar.mo69619h();
        ddsto.amount = String.valueOf(bVar.mo69611a());
        ddsto.ccy = bVar.mo69614d();
        ddsto.debitType = bVar.mo69615e();
        ddsto.status = bVar.mo69626n();
        ddsto.productCode = bVar.mo69624l();
        ddsto.dictionaryKey = bVar.mo69618g();
        ddsto.details = dDSTODetailsWrapper;
        return ddsto;
    }
}
