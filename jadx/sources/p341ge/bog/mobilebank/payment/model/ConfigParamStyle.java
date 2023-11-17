package p341ge.bog.mobilebank.payment.model;

import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.payment.model.ConfigParamStyle */
public class ConfigParamStyle {
    boolean editable;
    int inputType;
    String mask;
    int maxSelectableItems = 3;
    boolean needsDebtFormatting;
    boolean packages;
    ParameterType parameterType;
    float weight = 1.0f;

    public int getInputType() {
        return this.inputType;
    }

    public String getMask() {
        return this.mask;
    }

    public int getMaxSelectableItems() {
        return this.maxSelectableItems;
    }

    public ParameterType getParameterType() {
        return this.parameterType;
    }

    public float getWeight() {
        return this.weight;
    }

    public boolean isEditable() {
        return this.editable;
    }

    public boolean isNeedsDebtFormatting() {
        return this.needsDebtFormatting;
    }

    public boolean isPackages() {
        return this.packages;
    }

    public boolean needsDebtFormatting() {
        return this.needsDebtFormatting;
    }

    public void setEditable(boolean z) {
        this.editable = z;
    }

    public void setInputType(int i) {
        this.inputType = i;
    }

    public void setMask(String str) {
        this.mask = str;
    }

    public void setMaxSelectableItems(int i) {
        this.maxSelectableItems = i;
    }

    public void setNeedsDebtFormatting(boolean z) {
        this.needsDebtFormatting = z;
    }

    public void setPackages(boolean z) {
        this.packages = z;
    }

    public void setParameterType(ParameterType parameterType2) {
        this.parameterType = parameterType2;
    }

    public void setWeight(float f) {
        this.weight = f;
    }
}
