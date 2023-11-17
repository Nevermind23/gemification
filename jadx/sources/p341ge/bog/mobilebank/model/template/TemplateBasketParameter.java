package p341ge.bog.mobilebank.model.template;

import org.parceler.Parcel;
import p277ua.C8662a;

@Parcel
/* renamed from: ge.bog.mobilebank.model.template.TemplateBasketParameter */
public class TemplateBasketParameter {
    @C8662a

    /* renamed from: id */
    Long f81378id;
    @C8662a
    int parameterIndex;
    @C8662a
    String parameterKey;
    @C8662a
    String parameterType;
    @C8662a
    String parameterValue;
    @C8662a
    String verifyParameterData;

    public Long getId() {
        return this.f81378id;
    }

    public int getParameterIndex() {
        return this.parameterIndex;
    }

    public String getParameterKey() {
        return this.parameterKey;
    }

    public String getParameterType() {
        return this.parameterType;
    }

    public String getParameterValue() {
        return this.parameterValue;
    }

    public void setId(Long l) {
        this.f81378id = l;
    }

    public void setParameterIndex(int i) {
        this.parameterIndex = i;
    }

    public void setParameterKey(String str) {
        this.parameterKey = str;
    }

    public void setParameterType(String str) {
        this.parameterType = str;
    }

    public void setParameterValue(String str) {
        this.parameterValue = str;
    }
}
