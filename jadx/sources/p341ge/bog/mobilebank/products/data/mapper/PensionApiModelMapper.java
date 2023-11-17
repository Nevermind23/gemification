package p341ge.bog.mobilebank.products.data.mapper;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.PensionResult;
import p341ge.bog.mobilebank.products.data.model.PensionAmountApiModel;
import p341ge.bog.mobilebank.products.data.model.PensionStatusApiModel;
import xy0.C39960x;
import xy0.C39961y;

/* renamed from: ge.bog.mobilebank.products.data.mapper.PensionApiModelMapper */
public final class PensionApiModelMapper {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String STATUS_ACTIVE = "A";

    /* renamed from: ge.bog.mobilebank.products.data.mapper.PensionApiModelMapper$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C39960x convert(PensionAmountApiModel pensionAmountApiModel) {
        C41536l.m120489i(pensionAmountApiModel, "pensionAmountApiModel");
        return new C39960x(pensionAmountApiModel.getTotalSaving(), pensionAmountApiModel.getContribution(), pensionAmountApiModel.isMember(), pensionAmountApiModel.getCustomerId(), pensionAmountApiModel.getValidationStatus(), pensionAmountApiModel.getProfit());
    }

    public final C39960x convert(PensionResult pensionResult) {
        C41536l.m120489i(pensionResult, "pensionAmountApiModel");
        return new C39960x(pensionResult.totalSaving, pensionResult.contribution, pensionResult.isMember, pensionResult.customerId, pensionResult.validationStatus, pensionResult.profit);
    }

    public final C39961y convert(PensionStatusApiModel pensionStatusApiModel) {
        C41536l.m120489i(pensionStatusApiModel, "pensionStatusApiModel");
        return new C39961y(C41536l.m120484d(pensionStatusApiModel.getServiceStatus(), "A"), pensionStatusApiModel.getModificationDate());
    }
}
