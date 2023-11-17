package p341ge.bog.mobilebank.categorypackages.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p455ho.C15547a;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.ApplicationFieldsEntity */
public final class ApplicationFieldsEntity {
    private final List<C15547a> applicationFields;

    public ApplicationFieldsEntity(List<? extends C15547a> list) {
        C41536l.m120489i(list, "applicationFields");
        this.applicationFields = list;
    }

    public static /* synthetic */ ApplicationFieldsEntity copy$default(ApplicationFieldsEntity applicationFieldsEntity, List<C15547a> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = applicationFieldsEntity.applicationFields;
        }
        return applicationFieldsEntity.copy(list);
    }

    public final List<C15547a> component1() {
        return this.applicationFields;
    }

    public final ApplicationFieldsEntity copy(List<? extends C15547a> list) {
        C41536l.m120489i(list, "applicationFields");
        return new ApplicationFieldsEntity(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApplicationFieldsEntity) && C41536l.m120484d(this.applicationFields, ((ApplicationFieldsEntity) obj).applicationFields);
    }

    public final List<C15547a> getApplicationFields() {
        return this.applicationFields;
    }

    public int hashCode() {
        return this.applicationFields.hashCode();
    }

    public String toString() {
        List<C15547a> list = this.applicationFields;
        return "ApplicationFieldsEntity(applicationFields=" + list + ")";
    }
}
