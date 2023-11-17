package p341ge.bog.mobilebank.p975ui.wizard.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.parceler.C42035e;
import org.parceler.C42041g;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.model.KeyValue;

@Parcel
/* renamed from: ge.bog.mobilebank.ui.wizard.model.WizardObject */
public class WizardObject {
    public static final int DEFAULT_STYLE_CALENDAR = 2;
    public static final int DEFAULT_STYLE_CUSTOM = 4;
    public static final int DEFAULT_STYLE_DEPOSIT_SELECTOR = 6;
    public static final int DEFAULT_STYLE_MOBILE = 3;
    public static final int DEFAULT_STYLE_SEARCH_SELECTOR = 5;
    public static final int DEFAULT_STYLE_SELECTOR = 0;
    public static final int DEFAULT_STYLE_SELECTOR_WITH_DESCRIPTIONS = 7;
    public static final int DEFAULT_STYLE_TEXT = 1;
    public static final int SELECTOR_TYPE_MULTIPLE = 20;
    public static final int SELECTOR_TYPE_SINGLE = 10;
    boolean allowEmptyValue = false;
    boolean amountObject;
    boolean animate = true;
    ArrayList<Object> customSelectorValues;
    String descriptionText;
    String iconUrl;

    /* renamed from: id */
    String f86824id;
    ArrayList<KeyValue> infoListKeyValues;
    int inputStyle;
    String inputTitle;
    int inputType;
    String mask;
    String maskChar;
    BigDecimal maxAmount = null;
    long maxDate;
    int maxSelectableItems;
    BigDecimal minAmount = null;
    long minDate;
    int mobileNumberInputContactPermissionTextId;
    String nonSelectableString;
    String pageTitle;
    boolean selectByString = true;
    int selectedSubTemplateItem = -1;
    List<String> selectorOptionPreviews;
    List<String> selectorOptionValues;
    int selectorType = 10;
    Boolean showMobileNumberIndexPrefix = null;
    boolean skippable;
    boolean skippableIfFilled;
    ArrayList<WizardSubTemplateObject> subTemplateObjects;
    String subTemplateObjectsTitle;
    String tag;
    int textLimit;
    String validatePattern;
    String value;
    String visibleInput;

    /* renamed from: ge.bog.mobilebank.ui.wizard.model.WizardObject$a */
    public static class C35889a implements C42041g {
        /* renamed from: c */
        public ArrayList mo88107a(android.os.Parcel parcel) {
            return (ArrayList) C42035e.m122119a(parcel.readParcelable(getClass().getClassLoader()));
        }

        /* renamed from: d */
        public void mo88108b(ArrayList arrayList, android.os.Parcel parcel) {
            parcel.writeParcelable(C42035e.m122121c(arrayList), 0);
        }
    }

    public WizardObject addInfoLisKeyValues(String str, String str2) {
        if (this.infoListKeyValues == null) {
            this.infoListKeyValues = new ArrayList<>();
        }
        this.infoListKeyValues.add(new KeyValue(str, str2));
        return this;
    }

    public WizardObject addSelectorOption(String str) {
        if (this.selectorOptionPreviews == null) {
            this.selectorOptionPreviews = new ArrayList();
        }
        this.selectorOptionPreviews.add(str);
        return this;
    }

    public WizardObject copy() {
        return new WizardObject().setSelectedSubTemplateItem(this.selectedSubTemplateItem).setSubTemplateObjectsTitle(this.subTemplateObjectsTitle).setNonSelectableString(this.nonSelectableString).setSubTemplateObjects(this.subTemplateObjects).setInfoKeyValues(this.infoListKeyValues).setSelectorOptionPreviews(this.selectorOptionPreviews).setSelectorType(this.selectorType).setInputStyle(this.inputStyle).setInputTitle(this.inputTitle).setPageTitle(this.pageTitle).setInputType(this.inputType).setTextLimit(this.textLimit).setMaskChar(this.maskChar).setIconUrl(this.iconUrl).setValue(this.value).setMask(this.mask).setTag(this.tag).setId(this.f86824id).setSkippable(this.skippable).setSkippableIfFilled(this.skippableIfFilled);
    }

    public boolean getAllowEmptyValue() {
        return this.allowEmptyValue;
    }

    public ArrayList getCustomSelectorValues() {
        return this.customSelectorValues;
    }

    public String getDescriptionText() {
        return this.descriptionText;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getId() {
        return this.f86824id;
    }

    public ArrayList<KeyValue> getInfoListKeyValues() {
        return this.infoListKeyValues;
    }

    public int getInputStyle() {
        return this.inputStyle;
    }

    public String getInputTitle() {
        return this.inputTitle;
    }

    public int getInputType() {
        return this.inputType;
    }

    public String getMask() {
        return this.mask;
    }

    public String getMaskChar() {
        return this.maskChar;
    }

    public BigDecimal getMaxAmount() {
        return this.maxAmount;
    }

    public long getMaxDate() {
        return this.maxDate;
    }

    public int getMaxSelectableItems() {
        return this.maxSelectableItems;
    }

    public BigDecimal getMinAmount() {
        return this.minAmount;
    }

    public long getMinDate() {
        return this.minDate;
    }

    public int getMobileNumberInputContactPermissionTextId() {
        return this.mobileNumberInputContactPermissionTextId;
    }

    public String getNonSelectableString() {
        return this.nonSelectableString;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public int getSelectedSubTemplateItem() {
        return this.selectedSubTemplateItem;
    }

    public List<String> getSelectorOptionPreviews() {
        return this.selectorOptionPreviews;
    }

    public List<String> getSelectorOptionValues() {
        return this.selectorOptionValues;
    }

    public int getSelectorType() {
        return this.selectorType;
    }

    public Boolean getShowMobileNumberIndexPrefix() {
        return this.showMobileNumberIndexPrefix;
    }

    public ArrayList<WizardSubTemplateObject> getSubTemplateObjects() {
        return this.subTemplateObjects;
    }

    public String getSubTemplateObjectsTitle() {
        return this.subTemplateObjectsTitle;
    }

    public String getTag() {
        return this.tag;
    }

    public int getTextLimit() {
        return this.textLimit;
    }

    public String getValidatePattern() {
        return this.validatePattern;
    }

    public String getValue() {
        return this.value;
    }

    public String getVisibleInput() {
        return this.visibleInput;
    }

    public boolean isAmountObject() {
        return this.amountObject;
    }

    public boolean isSelectByString() {
        return this.selectByString;
    }

    public boolean isSkippable() {
        return this.skippable;
    }

    public boolean isSkippableIfFilled() {
        return this.skippableIfFilled;
    }

    public WizardObject setAllowEmptyValue(boolean z) {
        this.allowEmptyValue = z;
        return this;
    }

    public WizardObject setAmountObject(boolean z) {
        this.amountObject = z;
        return this;
    }

    public WizardObject setAnimate(boolean z) {
        this.animate = z;
        return this;
    }

    public WizardObject setCustomSelectorValues(ArrayList arrayList) {
        this.customSelectorValues = arrayList;
        return this;
    }

    public WizardObject setDescriptionText(String str) {
        this.descriptionText = str;
        return this;
    }

    public WizardObject setIconUrl(String str) {
        this.iconUrl = str;
        return this;
    }

    public WizardObject setId(String str) {
        this.f86824id = str;
        return this;
    }

    public WizardObject setInfoKeyValues(ArrayList<KeyValue> arrayList) {
        this.infoListKeyValues = arrayList;
        return this;
    }

    public WizardObject setInputStyle(int i) {
        this.inputStyle = i;
        return this;
    }

    public WizardObject setInputTitle(String str) {
        this.inputTitle = str;
        return this;
    }

    public WizardObject setInputType(int i) {
        this.inputType = i;
        return this;
    }

    public WizardObject setMask(String str) {
        this.mask = str;
        return this;
    }

    public WizardObject setMaskChar(String str) {
        this.maskChar = str;
        return this;
    }

    public WizardObject setMaxAmount(BigDecimal bigDecimal) {
        this.maxAmount = bigDecimal;
        return this;
    }

    public WizardObject setMaxDate(long j) {
        this.maxDate = j;
        return this;
    }

    public WizardObject setMaxSelectableItems(int i) {
        this.maxSelectableItems = i;
        return this;
    }

    public WizardObject setMinAmount(BigDecimal bigDecimal) {
        this.minAmount = bigDecimal;
        return this;
    }

    public WizardObject setMinDate(long j) {
        this.minDate = j;
        return this;
    }

    public WizardObject setMobileNumberInputContactPermissionTextId(int i) {
        this.mobileNumberInputContactPermissionTextId = i;
        return this;
    }

    public WizardObject setNonSelectableString(String str) {
        this.nonSelectableString = str;
        return this;
    }

    public WizardObject setPageTitle(String str) {
        this.pageTitle = str;
        return this;
    }

    public WizardObject setSelectByString(boolean z) {
        this.selectByString = z;
        return this;
    }

    public WizardObject setSelectedSubTemplateItem(int i) {
        this.selectedSubTemplateItem = i;
        return this;
    }

    public WizardObject setSelectorOptionPreviews(List<String> list) {
        this.selectorOptionPreviews = list;
        return this;
    }

    public WizardObject setSelectorOptionValues(List<String> list) {
        this.selectorOptionValues = list;
        return this;
    }

    public WizardObject setSelectorType(int i) {
        this.selectorType = i;
        return this;
    }

    public WizardObject setShowMobileNumberIndexPrefix(Boolean bool) {
        this.showMobileNumberIndexPrefix = bool;
        return this;
    }

    public WizardObject setSkippable(boolean z) {
        this.skippable = z;
        return this;
    }

    public WizardObject setSkippableIfFilled(boolean z) {
        this.skippableIfFilled = z;
        return this;
    }

    public WizardObject setSubTemplateObjects(ArrayList<WizardSubTemplateObject> arrayList) {
        this.subTemplateObjects = arrayList;
        return this;
    }

    public WizardObject setSubTemplateObjectsTitle(String str) {
        this.subTemplateObjectsTitle = str;
        return this;
    }

    public WizardObject setTag(String str) {
        this.tag = str;
        return this;
    }

    public WizardObject setTextLimit(int i) {
        this.textLimit = i;
        return this;
    }

    public WizardObject setValidatePattern(String str) {
        this.validatePattern = str;
        return this;
    }

    public WizardObject setValue(String str) {
        this.value = str;
        return this;
    }

    public WizardObject setVisibleInput(String str) {
        this.visibleInput = str;
        return this;
    }

    public boolean shouldAnimate() {
        return this.animate;
    }
}
