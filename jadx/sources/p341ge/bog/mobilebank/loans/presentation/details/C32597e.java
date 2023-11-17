package p341ge.bog.mobilebank.loans.presentation.details;

import he1.C41224m;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loans.presentation.LoansFlow;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.model.HistoryScheduleDataModel;
import p341ge.bog.mobilebank.loans.presentation.installmentStatus.LoanInstallmentStatusData;
import p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalCancelData;
import p341ge.bog.mobilebank.loans.presentation.renameloan.model.RenameLoanData;

/* renamed from: ge.bog.mobilebank.loans.presentation.details.e */
public interface C32597e {

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.e$a */
    public static final class C32598a implements C32597e {

        /* renamed from: a */
        private final C41224m f80258a;

        public C32598a(C41224m mVar) {
            C41536l.m120489i(mVar, "data");
            this.f80258a = mVar;
        }

        /* renamed from: a */
        public final C41224m mo74105a() {
            return this.f80258a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.e$b */
    public static final class C32599b implements C32597e {

        /* renamed from: a */
        private final HistoryScheduleDataModel f80259a;

        public C32599b(HistoryScheduleDataModel historyScheduleDataModel) {
            C41536l.m120489i(historyScheduleDataModel, "data");
            this.f80259a = historyScheduleDataModel;
        }

        /* renamed from: a */
        public final HistoryScheduleDataModel mo74106a() {
            return this.f80259a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.e$c */
    public static final class C32600c implements C32597e {

        /* renamed from: a */
        private final InstallmentReversalCancelData f80260a;

        public C32600c(InstallmentReversalCancelData installmentReversalCancelData) {
            C41536l.m120489i(installmentReversalCancelData, "data");
            this.f80260a = installmentReversalCancelData;
        }

        /* renamed from: a */
        public final InstallmentReversalCancelData mo74107a() {
            return this.f80260a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.e$d */
    public static final class C32601d implements C32597e {

        /* renamed from: a */
        private final LoanInstallmentStatusData f80261a;

        public C32601d(LoanInstallmentStatusData loanInstallmentStatusData) {
            C41536l.m120489i(loanInstallmentStatusData, "data");
            this.f80261a = loanInstallmentStatusData;
        }

        /* renamed from: a */
        public final LoanInstallmentStatusData mo74108a() {
            return this.f80261a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.e$e */
    public static final class C32602e implements C32597e {

        /* renamed from: a */
        private final LoansFlow.PawnLoanPayment f80262a;

        public C32602e(LoansFlow.PawnLoanPayment pawnLoanPayment) {
            C41536l.m120489i(pawnLoanPayment, "data");
            this.f80262a = pawnLoanPayment;
        }

        /* renamed from: a */
        public final LoansFlow.PawnLoanPayment mo74109a() {
            return this.f80262a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.e$f */
    public static final class C32603f implements C32597e {

        /* renamed from: a */
        private final RenameLoanData f80263a;

        /* renamed from: b */
        private final String f80264b;

        public C32603f(RenameLoanData renameLoanData, String str) {
            C41536l.m120489i(renameLoanData, "data");
            C41536l.m120489i(str, "loanName");
            this.f80263a = renameLoanData;
            this.f80264b = str;
        }

        /* renamed from: a */
        public final RenameLoanData mo74110a() {
            return this.f80263a;
        }

        /* renamed from: b */
        public final String mo74111b() {
            return this.f80264b;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.e$g */
    public static final class C32604g implements C32597e {

        /* renamed from: a */
        private final LoansFlow.Repayment f80265a;

        public C32604g(LoansFlow.Repayment repayment) {
            C41536l.m120489i(repayment, "data");
            this.f80265a = repayment;
        }

        /* renamed from: a */
        public final LoansFlow.Repayment mo74112a() {
            return this.f80265a;
        }
    }
}
