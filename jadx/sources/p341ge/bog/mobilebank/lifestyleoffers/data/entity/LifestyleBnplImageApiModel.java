package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleBnplImageApiModel */
public final class LifestyleBnplImageApiModel {
    private final LifestyleBnplExternalImageApiModel externalFile;

    public LifestyleBnplImageApiModel(LifestyleBnplExternalImageApiModel lifestyleBnplExternalImageApiModel) {
        this.externalFile = lifestyleBnplExternalImageApiModel;
    }

    public static /* synthetic */ LifestyleBnplImageApiModel copy$default(LifestyleBnplImageApiModel lifestyleBnplImageApiModel, LifestyleBnplExternalImageApiModel lifestyleBnplExternalImageApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            lifestyleBnplExternalImageApiModel = lifestyleBnplImageApiModel.externalFile;
        }
        return lifestyleBnplImageApiModel.copy(lifestyleBnplExternalImageApiModel);
    }

    public final LifestyleBnplExternalImageApiModel component1() {
        return this.externalFile;
    }

    public final LifestyleBnplImageApiModel copy(LifestyleBnplExternalImageApiModel lifestyleBnplExternalImageApiModel) {
        return new LifestyleBnplImageApiModel(lifestyleBnplExternalImageApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LifestyleBnplImageApiModel) && C41536l.m120484d(this.externalFile, ((LifestyleBnplImageApiModel) obj).externalFile);
    }

    public final LifestyleBnplExternalImageApiModel getExternalFile() {
        return this.externalFile;
    }

    public int hashCode() {
        LifestyleBnplExternalImageApiModel lifestyleBnplExternalImageApiModel = this.externalFile;
        if (lifestyleBnplExternalImageApiModel == null) {
            return 0;
        }
        return lifestyleBnplExternalImageApiModel.hashCode();
    }

    public String toString() {
        LifestyleBnplExternalImageApiModel lifestyleBnplExternalImageApiModel = this.externalFile;
        return "LifestyleBnplImageApiModel(externalFile=" + lifestyleBnplExternalImageApiModel + ")";
    }
}
