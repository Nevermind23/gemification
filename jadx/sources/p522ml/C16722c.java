package p522ml;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplRepaymentApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplScheduleApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplScheduleHistoryItemApiEntity;
import p606sl.C17848n;
import p606sl.C17849o;
import p606sl.C17850p;

/* renamed from: ml.c */
public final class C16722c {
    /* renamed from: a */
    public final C17848n mo43851a(BnplRepaymentApiEntity bnplRepaymentApiEntity) {
        C41536l.m120489i(bnplRepaymentApiEntity, "bnplRepaymentApiEntity");
        return new C17848n(bnplRepaymentApiEntity.getLoanKey(), bnplRepaymentApiEntity.getPaymentDate(), bnplRepaymentApiEntity.getCcy(), bnplRepaymentApiEntity.getPrincipal(), bnplRepaymentApiEntity.getInterest(), bnplRepaymentApiEntity.getPenalty(), bnplRepaymentApiEntity.getFee(), bnplRepaymentApiEntity.getScheduledFee(), bnplRepaymentApiEntity.getAmountPaid(), bnplRepaymentApiEntity.getInsAmt());
    }

    /* renamed from: b */
    public final C17849o mo43852b(BnplScheduleApiEntity bnplScheduleApiEntity) {
        C41536l.m120489i(bnplScheduleApiEntity, "bnplScheduleApiEntity");
        return new C17849o(bnplScheduleApiEntity.getLoanKey(), bnplScheduleApiEntity.getPayDate(), bnplScheduleApiEntity.getCcy(), bnplScheduleApiEntity.getPriAmt(), bnplScheduleApiEntity.getIntAmt(), bnplScheduleApiEntity.getFeeAmt(), bnplScheduleApiEntity.getInsAmt(), bnplScheduleApiEntity.getTotalAmt());
    }

    /* renamed from: c */
    public final C17850p mo43853c(BnplScheduleHistoryItemApiEntity bnplScheduleHistoryItemApiEntity) {
        C41536l.m120489i(bnplScheduleHistoryItemApiEntity, "bnplScheduleHisotryItemApiEntity");
        List<BnplScheduleApiEntity> schedules = bnplScheduleHistoryItemApiEntity.getSchedules();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(schedules, 10));
        for (BnplScheduleApiEntity b : schedules) {
            arrayList.add(mo43852b(b));
        }
        List<BnplRepaymentApiEntity> repayments = bnplScheduleHistoryItemApiEntity.getRepayments();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(repayments, 10));
        for (BnplRepaymentApiEntity a : repayments) {
            arrayList2.add(mo43851a(a));
        }
        return new C17850p(arrayList, arrayList2);
    }
}
