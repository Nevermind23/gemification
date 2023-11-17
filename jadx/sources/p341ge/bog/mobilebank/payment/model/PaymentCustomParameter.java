package p341ge.bog.mobilebank.payment.model;

import android.text.TextUtils;
import g91.C32315k0;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption;

@Parcel
/* renamed from: ge.bog.mobilebank.payment.model.PaymentCustomParameter */
public class PaymentCustomParameter {

    /* renamed from: id */
    String f81945id;
    int inputIndexInRawConfig;
    PaymentsServiceConfigInputOption[] inputOptions;
    boolean isDebtVerifiable;
    boolean isMandatory;
    String logoUrl;
    String name;
    boolean notNeededForDebtVerify;
    int rowNum;
    ConfigParamStyle style;
    String value;
    String valueToDisplay;
    String valueToDisplayInForm;
    boolean visibleInForm;
    boolean visibleInWizard;

    public PaymentCustomParameter(String str, String str2, ConfigParamStyle configParamStyle, boolean z, boolean z2, int i) {
        this(str, str2, configParamStyle, z, z2, i, false);
    }

    public String getId() {
        return this.f81945id;
    }

    public int getInputIndexInRawConfig() {
        return this.inputIndexInRawConfig;
    }

    public PaymentsServiceConfigInputOption[] getInputOptions() {
        return this.inputOptions;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public String getName() {
        return this.name;
    }

    public int getRowNum() {
        return this.rowNum;
    }

    public ConfigParamStyle getStyle() {
        return this.style;
    }

    public String getValue() {
        return this.value;
    }

    public String getValueToDisplay() {
        return this.valueToDisplay;
    }

    public String getValueToDisplayInForm() {
        return this.valueToDisplayInForm;
    }

    public boolean isDebtVerifiable() {
        return this.isDebtVerifiable;
    }

    public boolean isMandatory() {
        return this.isMandatory;
    }

    public boolean isMobile() {
        return getStyle().parameterType == ParameterType.MOBILE;
    }

    public boolean isNotNeededForDebtVerify() {
        return this.notNeededForDebtVerify;
    }

    public boolean isVisibleInForm() {
        return this.visibleInForm;
    }

    public boolean isVisibleInWizard() {
        return this.visibleInWizard;
    }

    public void setDebtVerifiable(boolean z) {
        this.isDebtVerifiable = z;
    }

    public void setId(String str) {
        this.f81945id = str;
    }

    public void setInputIndexInRawConfig(int i) {
        this.inputIndexInRawConfig = i;
    }

    public void setInputOptions(PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr) {
        this.inputOptions = paymentsServiceConfigInputOptionArr;
    }

    public void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public void setMandatory(boolean z) {
        this.isMandatory = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNotNeededForDebtVerify(boolean z) {
        this.notNeededForDebtVerify = z;
    }

    public void setRowNum(int i) {
        this.rowNum = i;
    }

    public void setStyle(ConfigParamStyle configParamStyle) {
        this.style = configParamStyle;
    }

    public void setValue(String str) {
        if (!TextUtils.isEmpty(this.style.getMask()) && !TextUtils.isEmpty(str)) {
            str = str.replace(C32315k0.m95262k(this.style.getMask()), "");
        }
        this.value = str;
    }

    public void setValueToDisplay(String str) {
        this.valueToDisplay = str;
        this.valueToDisplayInForm = str;
    }

    public void setValueToDisplayInForm(String str) {
        this.valueToDisplayInForm = str;
    }

    public void setVisibleInForm(boolean z) {
        this.visibleInForm = z;
    }

    public void setVisibleInWizard(boolean z) {
        this.visibleInWizard = z;
    }

    public void setVisibleInWizardAndForm(boolean z) {
        this.visibleInForm = z;
        this.visibleInWizard = z;
    }

    public PaymentCustomParameter(String str, String str2, ConfigParamStyle configParamStyle, boolean z, boolean z2, int i, boolean z3) {
        this.f81945id = str;
        this.name = str2;
        this.style = configParamStyle;
        this.isMandatory = z;
        this.visibleInWizard = z2;
        this.rowNum = i;
        this.isDebtVerifiable = z3;
    }

    public PaymentCustomParameter() {
    }
}
