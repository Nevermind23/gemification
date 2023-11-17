package p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.CLApplicationDataEntity */
public final class CLApplicationDataEntity {
    private final List<ApplicationSalaryInfoEntity> applicantSalaryInformation;

    public CLApplicationDataEntity(List<ApplicationSalaryInfoEntity> list) {
        this.applicantSalaryInformation = list;
    }

    public static /* synthetic */ CLApplicationDataEntity copy$default(CLApplicationDataEntity cLApplicationDataEntity, List<ApplicationSalaryInfoEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cLApplicationDataEntity.applicantSalaryInformation;
        }
        return cLApplicationDataEntity.copy(list);
    }

    public final List<ApplicationSalaryInfoEntity> component1() {
        return this.applicantSalaryInformation;
    }

    public final CLApplicationDataEntity copy(List<ApplicationSalaryInfoEntity> list) {
        return new CLApplicationDataEntity(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CLApplicationDataEntity) && C41536l.m120484d(this.applicantSalaryInformation, ((CLApplicationDataEntity) obj).applicantSalaryInformation);
    }

    public final List<ApplicationSalaryInfoEntity> getApplicantSalaryInformation() {
        return this.applicantSalaryInformation;
    }

    public int hashCode() {
        List<ApplicationSalaryInfoEntity> list = this.applicantSalaryInformation;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<ApplicationSalaryInfoEntity> list = this.applicantSalaryInformation;
        return "CLApplicationDataEntity(applicantSalaryInformation=" + list + ")";
    }
}
