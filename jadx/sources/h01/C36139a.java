package h01;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m01.C37190d;
import m01.C37191e;
import m01.C37193g;
import m01.C37194h;
import p341ge.bog.mobilebank.qrwithdrawal.data.model.AtmApiModel;
import p341ge.bog.mobilebank.qrwithdrawal.data.model.AtmDenominationsApiModel;
import p341ge.bog.mobilebank.qrwithdrawal.data.model.DenominationApiData;
import p341ge.bog.mobilebank.qrwithdrawal.data.model.QrCashOutApiModel;

/* renamed from: h01.a */
public final class C36139a {

    /* renamed from: a */
    public static final C36140a f87330a = new C36140a((DefaultConstructorMarker) null);

    /* renamed from: h01.a$a */
    public static final class C36140a {
        private C36140a() {
        }

        public /* synthetic */ C36140a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final List m107528a(DenominationApiData denominationApiData) {
        boolean z;
        C37193g gVar;
        boolean z2;
        C37193g gVar2;
        boolean z3;
        C37193g gVar3;
        C37193g[] gVarArr = new C37193g[4];
        List<Integer> gel = denominationApiData.getGel();
        boolean z4 = true;
        if (gel == null || gel.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C37193g gVar4 = null;
        if (!z) {
            gVar = new C37193g("GEL", denominationApiData.getGel());
        } else {
            gVar = null;
        }
        gVarArr[0] = gVar;
        List<Integer> usd = denominationApiData.getUsd();
        if (usd == null || usd.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            gVar2 = new C37193g("USD", denominationApiData.getUsd());
        } else {
            gVar2 = null;
        }
        gVarArr[1] = gVar2;
        List<Integer> euro = denominationApiData.getEuro();
        if (euro == null || euro.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            gVar3 = new C37193g("EUR", denominationApiData.getEuro());
        } else {
            gVar3 = null;
        }
        gVarArr[2] = gVar3;
        List<Integer> gbp = denominationApiData.getGbp();
        if (gbp != null && !gbp.isEmpty()) {
            z4 = false;
        }
        if (!z4) {
            gVar4 = new C37193g("GBP", denominationApiData.getGbp());
        }
        gVarArr[3] = gVar4;
        return C41341q.m119912o(gVarArr);
    }

    /* renamed from: b */
    private final C37190d m107529b(AtmApiModel atmApiModel) {
        List<AtmDenominationsApiModel> atmDenominations = atmApiModel.getAtmDenominations();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(atmDenominations, 10));
        for (AtmDenominationsApiModel c : atmDenominations) {
            arrayList.add(m107530c(c));
        }
        return new C37190d(arrayList);
    }

    /* renamed from: c */
    private final C37191e m107530c(AtmDenominationsApiModel atmDenominationsApiModel) {
        return new C37191e(atmDenominationsApiModel.getDenomination(), atmDenominationsApiModel.getCurrency(), atmDenominationsApiModel.getCount(), atmDenominationsApiModel.getMinCount(), atmDenominationsApiModel.getExponent());
    }

    /* renamed from: d */
    public final C37194h mo88893d(QrCashOutApiModel qrCashOutApiModel) {
        C41536l.m120489i(qrCashOutApiModel, "entity");
        return new C37194h(qrCashOutApiModel.getRequestId(), m107529b(qrCashOutApiModel.getAtmData()), Integer.parseInt(qrCashOutApiModel.getAtmRequestTimeout()), qrCashOutApiModel.getInpDate(), m107528a(qrCashOutApiModel.getDenominationData()), qrCashOutApiModel.getAtmData());
    }
}
