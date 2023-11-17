package p341ge.bog.mobilebank.model.template;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection */
public class TemplateBasketItemWrapperForSelection {
    public static final int HEADER_TYPE_TB_PARK_6_MONTHS = 4;
    public static final int HEADER_TYPE_TB_PARK_PENALTIES = 2;
    public static final int HEADER_TYPE_TEMPLATES = 1;
    public static final int TYPE_NO_PASS = 1;
    public static final int TYPE_NO_PENALTIES = 2;
    private int currHeaderType;
    private int emptyType;
    private boolean isHeader;
    private boolean isLeftSwiped;
    private boolean isRightSwiped;
    private boolean isSelected;
    private String newValue;
    private TemplateBasketItem templateBasketItem;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection$EmptyType */
    public @interface EmptyType {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r3.equals(r0) != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getItemAmountFromParameter(p341ge.bog.mobilebank.model.template.TemplateBasketItem r3) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            java.lang.String r3 = r3.getAmount()     // Catch:{ Exception -> 0x001e }
            if (r3 == 0) goto L_0x000e
            boolean r1 = r3.equals(r0)     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x0010
        L_0x000e:
            java.lang.String r3 = "0"
        L_0x0010:
            java.lang.String r1 = ".00"
            java.lang.String r3 = r3.replace(r1, r0)     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = ".0"
            java.lang.String r3 = r3.replace(r1, r0)     // Catch:{ Exception -> 0x001d }
            goto L_0x001f
        L_0x001d:
            r0 = r3
        L_0x001e:
            r3 = r0
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection.getItemAmountFromParameter(ge.bog.mobilebank.model.template.TemplateBasketItem):java.lang.String");
    }

    public int getEmptyType() {
        return this.emptyType;
    }

    public int getHeaderType() {
        return this.currHeaderType;
    }

    public String getNewValue() {
        return this.newValue;
    }

    public String getOriginalValue() {
        TemplateBasketItem templateBasketItem2 = this.templateBasketItem;
        if (templateBasketItem2 == null) {
            return "";
        }
        if (!templateBasketItem2.canGetDebt() && !this.templateBasketItem.isCTParkItem()) {
            return getItemAmountFromParameter(this.templateBasketItem);
        }
        return this.templateBasketItem.getDebtAmount() + "";
    }

    public TemplateBasketItem getTemplateBasketItem() {
        return this.templateBasketItem;
    }

    public boolean isHeader() {
        return this.isHeader;
    }

    public boolean isLeftSwiped() {
        return this.isLeftSwiped;
    }

    public boolean isRightSwiped() {
        return this.isRightSwiped;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setEmptyType(int i) {
        this.emptyType = i;
    }

    public void setHeader(boolean z, int i) {
        this.isHeader = z;
        this.currHeaderType = i;
    }

    public void setLeftSwiped(boolean z) {
        this.isLeftSwiped = z;
    }

    public void setNewValue(String str) {
        if (str != null) {
            str = str.replace(".0", "");
        }
        this.newValue = str;
    }

    public void setRightSwiped(boolean z) {
        this.isRightSwiped = z;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setTemplateBasketItem(TemplateBasketItem templateBasketItem2) {
        this.templateBasketItem = templateBasketItem2;
    }
}
