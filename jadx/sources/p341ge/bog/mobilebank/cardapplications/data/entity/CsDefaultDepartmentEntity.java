package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.CsDefaultDepartmentEntity */
public final class CsDefaultDepartmentEntity {
    private final String csDefDepartment;

    /* renamed from: id */
    private final long f41306id;

    public CsDefaultDepartmentEntity(long j, String str) {
        this.f41306id = j;
        this.csDefDepartment = str;
    }

    public static /* synthetic */ CsDefaultDepartmentEntity copy$default(CsDefaultDepartmentEntity csDefaultDepartmentEntity, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = csDefaultDepartmentEntity.f41306id;
        }
        if ((i & 2) != 0) {
            str = csDefaultDepartmentEntity.csDefDepartment;
        }
        return csDefaultDepartmentEntity.copy(j, str);
    }

    public final long component1() {
        return this.f41306id;
    }

    public final String component2() {
        return this.csDefDepartment;
    }

    public final CsDefaultDepartmentEntity copy(long j, String str) {
        return new CsDefaultDepartmentEntity(j, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CsDefaultDepartmentEntity)) {
            return false;
        }
        CsDefaultDepartmentEntity csDefaultDepartmentEntity = (CsDefaultDepartmentEntity) obj;
        return this.f41306id == csDefaultDepartmentEntity.f41306id && C41536l.m120484d(this.csDefDepartment, csDefaultDepartmentEntity.csDefDepartment);
    }

    public final String getCsDefDepartment() {
        return this.csDefDepartment;
    }

    public final long getId() {
        return this.f41306id;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f41306id) * 31;
        String str = this.csDefDepartment;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f41306id;
        String str = this.csDefDepartment;
        return "CsDefaultDepartmentEntity(id=" + j + ", csDefDepartment=" + str + ")";
    }
}
