package p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestApiModel */
public final class MoneyRequestApiModel {
    private final String acctKey;
    private final String acctNo;
    private final double amount;
    private final Boolean canSplit;
    private final String ccy;
    private final String clientKey;
    private final String description;
    private final boolean hasWarning;
    private final Boolean includeSelf;
    private final List<BillSplitOperationApiModel> operations;
    private final List<MoneyRequestParticipantApiModel> participants;
    private final RequestDirectionApiModel requestDirection;
    private final long requestId;
    private final RequestStateApiModel requestState;
    private final String requestStateDescriptionKey;
    private final MoneyRequestTypeApiModel requestType;
    private final double transferredAmount;

    public MoneyRequestApiModel(long j, RequestDirectionApiModel requestDirectionApiModel, MoneyRequestTypeApiModel moneyRequestTypeApiModel, String str, String str2, String str3, double d, double d2, String str4, String str5, Boolean bool, Boolean bool2, RequestStateApiModel requestStateApiModel, String str6, boolean z, List<MoneyRequestParticipantApiModel> list, List<BillSplitOperationApiModel> list2) {
        String str7 = str4;
        List<MoneyRequestParticipantApiModel> list3 = list;
        C41536l.m120489i(requestDirectionApiModel, "requestDirection");
        C41536l.m120489i(moneyRequestTypeApiModel, "requestType");
        C41536l.m120489i(str, "clientKey");
        C41536l.m120489i(str7, "ccy");
        C41536l.m120489i(list3, "participants");
        this.requestId = j;
        this.requestDirection = requestDirectionApiModel;
        this.requestType = moneyRequestTypeApiModel;
        this.clientKey = str;
        this.acctNo = str2;
        this.acctKey = str3;
        this.amount = d;
        this.transferredAmount = d2;
        this.ccy = str7;
        this.description = str5;
        this.canSplit = bool;
        this.includeSelf = bool2;
        this.requestState = requestStateApiModel;
        this.requestStateDescriptionKey = str6;
        this.hasWarning = z;
        this.participants = list3;
        this.operations = list2;
    }

    public static /* synthetic */ MoneyRequestApiModel copy$default(MoneyRequestApiModel moneyRequestApiModel, long j, RequestDirectionApiModel requestDirectionApiModel, MoneyRequestTypeApiModel moneyRequestTypeApiModel, String str, String str2, String str3, double d, double d2, String str4, String str5, Boolean bool, Boolean bool2, RequestStateApiModel requestStateApiModel, String str6, boolean z, List list, List list2, int i, Object obj) {
        MoneyRequestApiModel moneyRequestApiModel2 = moneyRequestApiModel;
        int i2 = i;
        return moneyRequestApiModel.copy((i2 & 1) != 0 ? moneyRequestApiModel2.requestId : j, (i2 & 2) != 0 ? moneyRequestApiModel2.requestDirection : requestDirectionApiModel, (i2 & 4) != 0 ? moneyRequestApiModel2.requestType : moneyRequestTypeApiModel, (i2 & 8) != 0 ? moneyRequestApiModel2.clientKey : str, (i2 & 16) != 0 ? moneyRequestApiModel2.acctNo : str2, (i2 & 32) != 0 ? moneyRequestApiModel2.acctKey : str3, (i2 & 64) != 0 ? moneyRequestApiModel2.amount : d, (i2 & 128) != 0 ? moneyRequestApiModel2.transferredAmount : d2, (i2 & C11398b.f33139r) != 0 ? moneyRequestApiModel2.ccy : str4, (i2 & C11398b.f33140s) != 0 ? moneyRequestApiModel2.description : str5, (i2 & C11398b.f33141t) != 0 ? moneyRequestApiModel2.canSplit : bool, (i2 & C11398b.f33142u) != 0 ? moneyRequestApiModel2.includeSelf : bool2, (i2 & C11398b.f33143v) != 0 ? moneyRequestApiModel2.requestState : requestStateApiModel, (i2 & 8192) != 0 ? moneyRequestApiModel2.requestStateDescriptionKey : str6, (i2 & 16384) != 0 ? moneyRequestApiModel2.hasWarning : z, (i2 & 32768) != 0 ? moneyRequestApiModel2.participants : list, (i2 & 65536) != 0 ? moneyRequestApiModel2.operations : list2);
    }

    public final long component1() {
        return this.requestId;
    }

    public final String component10() {
        return this.description;
    }

    public final Boolean component11() {
        return this.canSplit;
    }

    public final Boolean component12() {
        return this.includeSelf;
    }

    public final RequestStateApiModel component13() {
        return this.requestState;
    }

    public final String component14() {
        return this.requestStateDescriptionKey;
    }

    public final boolean component15() {
        return this.hasWarning;
    }

    public final List<MoneyRequestParticipantApiModel> component16() {
        return this.participants;
    }

    public final List<BillSplitOperationApiModel> component17() {
        return this.operations;
    }

    public final RequestDirectionApiModel component2() {
        return this.requestDirection;
    }

    public final MoneyRequestTypeApiModel component3() {
        return this.requestType;
    }

    public final String component4() {
        return this.clientKey;
    }

    public final String component5() {
        return this.acctNo;
    }

    public final String component6() {
        return this.acctKey;
    }

    public final double component7() {
        return this.amount;
    }

    public final double component8() {
        return this.transferredAmount;
    }

    public final String component9() {
        return this.ccy;
    }

    public final MoneyRequestApiModel copy(long j, RequestDirectionApiModel requestDirectionApiModel, MoneyRequestTypeApiModel moneyRequestTypeApiModel, String str, String str2, String str3, double d, double d2, String str4, String str5, Boolean bool, Boolean bool2, RequestStateApiModel requestStateApiModel, String str6, boolean z, List<MoneyRequestParticipantApiModel> list, List<BillSplitOperationApiModel> list2) {
        long j2 = j;
        C41536l.m120489i(requestDirectionApiModel, "requestDirection");
        C41536l.m120489i(moneyRequestTypeApiModel, "requestType");
        C41536l.m120489i(str, "clientKey");
        C41536l.m120489i(str4, "ccy");
        C41536l.m120489i(list, "participants");
        return new MoneyRequestApiModel(j, requestDirectionApiModel, moneyRequestTypeApiModel, str, str2, str3, d, d2, str4, str5, bool, bool2, requestStateApiModel, str6, z, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyRequestApiModel)) {
            return false;
        }
        MoneyRequestApiModel moneyRequestApiModel = (MoneyRequestApiModel) obj;
        return this.requestId == moneyRequestApiModel.requestId && this.requestDirection == moneyRequestApiModel.requestDirection && this.requestType == moneyRequestApiModel.requestType && C41536l.m120484d(this.clientKey, moneyRequestApiModel.clientKey) && C41536l.m120484d(this.acctNo, moneyRequestApiModel.acctNo) && C41536l.m120484d(this.acctKey, moneyRequestApiModel.acctKey) && Double.compare(this.amount, moneyRequestApiModel.amount) == 0 && Double.compare(this.transferredAmount, moneyRequestApiModel.transferredAmount) == 0 && C41536l.m120484d(this.ccy, moneyRequestApiModel.ccy) && C41536l.m120484d(this.description, moneyRequestApiModel.description) && C41536l.m120484d(this.canSplit, moneyRequestApiModel.canSplit) && C41536l.m120484d(this.includeSelf, moneyRequestApiModel.includeSelf) && this.requestState == moneyRequestApiModel.requestState && C41536l.m120484d(this.requestStateDescriptionKey, moneyRequestApiModel.requestStateDescriptionKey) && this.hasWarning == moneyRequestApiModel.hasWarning && C41536l.m120484d(this.participants, moneyRequestApiModel.participants) && C41536l.m120484d(this.operations, moneyRequestApiModel.operations);
    }

    public final String getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final Boolean getCanSplit() {
        return this.canSplit;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getHasWarning() {
        return this.hasWarning;
    }

    public final Boolean getIncludeSelf() {
        return this.includeSelf;
    }

    public final List<BillSplitOperationApiModel> getOperations() {
        return this.operations;
    }

    public final List<MoneyRequestParticipantApiModel> getParticipants() {
        return this.participants;
    }

    public final RequestDirectionApiModel getRequestDirection() {
        return this.requestDirection;
    }

    public final long getRequestId() {
        return this.requestId;
    }

    public final RequestStateApiModel getRequestState() {
        return this.requestState;
    }

    public final String getRequestStateDescriptionKey() {
        return this.requestStateDescriptionKey;
    }

    public final MoneyRequestTypeApiModel getRequestType() {
        return this.requestType;
    }

    public final double getTransferredAmount() {
        return this.transferredAmount;
    }

    public int hashCode() {
        int a = ((((((C7397t.m28148a(this.requestId) * 31) + this.requestDirection.hashCode()) * 31) + this.requestType.hashCode()) * 31) + this.clientKey.hashCode()) * 31;
        String str = this.acctNo;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.acctKey;
        int hashCode2 = (((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Double.doubleToLongBits(this.amount)) * 31) + Double.doubleToLongBits(this.transferredAmount)) * 31) + this.ccy.hashCode()) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canSplit;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.includeSelf;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        RequestStateApiModel requestStateApiModel = this.requestState;
        int hashCode6 = (hashCode5 + (requestStateApiModel == null ? 0 : requestStateApiModel.hashCode())) * 31;
        String str4 = this.requestStateDescriptionKey;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.hasWarning;
        if (z) {
            z = true;
        }
        int hashCode8 = (((hashCode7 + (z ? 1 : 0)) * 31) + this.participants.hashCode()) * 31;
        List<BillSplitOperationApiModel> list = this.operations;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        long j = this.requestId;
        RequestDirectionApiModel requestDirectionApiModel = this.requestDirection;
        MoneyRequestTypeApiModel moneyRequestTypeApiModel = this.requestType;
        String str = this.clientKey;
        String str2 = this.acctNo;
        String str3 = this.acctKey;
        double d = this.amount;
        double d2 = this.transferredAmount;
        String str4 = this.ccy;
        String str5 = this.description;
        Boolean bool = this.canSplit;
        Boolean bool2 = this.includeSelf;
        RequestStateApiModel requestStateApiModel = this.requestState;
        String str6 = this.requestStateDescriptionKey;
        boolean z = this.hasWarning;
        List<MoneyRequestParticipantApiModel> list = this.participants;
        List<BillSplitOperationApiModel> list2 = this.operations;
        return "MoneyRequestApiModel(requestId=" + j + ", requestDirection=" + requestDirectionApiModel + ", requestType=" + moneyRequestTypeApiModel + ", clientKey=" + str + ", acctNo=" + str2 + ", acctKey=" + str3 + ", amount=" + d + ", transferredAmount=" + d2 + ", ccy=" + str4 + ", description=" + str5 + ", canSplit=" + bool + ", includeSelf=" + bool2 + ", requestState=" + requestStateApiModel + ", requestStateDescriptionKey=" + str6 + ", hasWarning=" + z + ", participants=" + list + ", operations=" + list2 + ")";
    }
}
