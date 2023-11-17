package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.DebitCardRegTypeEntity */
public final class DebitCardRegTypeEntity {
    private final String dictionaryKey;
    private final RegTypeEntity regType;

    public DebitCardRegTypeEntity(RegTypeEntity regTypeEntity, String str) {
        C41536l.m120489i(regTypeEntity, "regType");
        C41536l.m120489i(str, "dictionaryKey");
        this.regType = regTypeEntity;
        this.dictionaryKey = str;
    }

    public static /* synthetic */ DebitCardRegTypeEntity copy$default(DebitCardRegTypeEntity debitCardRegTypeEntity, RegTypeEntity regTypeEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            regTypeEntity = debitCardRegTypeEntity.regType;
        }
        if ((i & 2) != 0) {
            str = debitCardRegTypeEntity.dictionaryKey;
        }
        return debitCardRegTypeEntity.copy(regTypeEntity, str);
    }

    public final RegTypeEntity component1() {
        return this.regType;
    }

    public final String component2() {
        return this.dictionaryKey;
    }

    public final DebitCardRegTypeEntity copy(RegTypeEntity regTypeEntity, String str) {
        C41536l.m120489i(regTypeEntity, "regType");
        C41536l.m120489i(str, "dictionaryKey");
        return new DebitCardRegTypeEntity(regTypeEntity, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardRegTypeEntity)) {
            return false;
        }
        DebitCardRegTypeEntity debitCardRegTypeEntity = (DebitCardRegTypeEntity) obj;
        return this.regType == debitCardRegTypeEntity.regType && C41536l.m120484d(this.dictionaryKey, debitCardRegTypeEntity.dictionaryKey);
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final RegTypeEntity getRegType() {
        return this.regType;
    }

    public int hashCode() {
        return (this.regType.hashCode() * 31) + this.dictionaryKey.hashCode();
    }

    public String toString() {
        RegTypeEntity regTypeEntity = this.regType;
        String str = this.dictionaryKey;
        return "DebitCardRegTypeEntity(regType=" + regTypeEntity + ", dictionaryKey=" + str + ")";
    }
}
