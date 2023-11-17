package p808kr;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails;
import p828mr.C26257a;
import p838nr.C26573a;

/* renamed from: kr.a */
public final class C25752a {

    /* renamed from: a */
    private final C26573a f65542a;

    public C25752a(C26573a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f65542a = aVar;
    }

    /* renamed from: a */
    public final C40762x mo64338a(LimitLoanDecisionDetails limitLoanDecisionDetails, C26257a aVar) {
        C41536l.m120489i(limitLoanDecisionDetails, "offerDetails");
        C41536l.m120489i(aVar, "options");
        return this.f65542a.mo63769d(limitLoanDecisionDetails, aVar);
    }
}
