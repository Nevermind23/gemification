package p341ge.bog.mobilebank.p975ui.model;

import java.util.ArrayList;
import java.util.List;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.ui.model.OperationResultData */
public class OperationResultData {
    List<OperationDetailsItem> detailsList;
    String errorTitle;
    boolean success = true;
    String successTitle;

    @Parcel
    /* renamed from: ge.bog.mobilebank.ui.model.OperationResultData$OperationDetailsItem */
    public static class OperationDetailsItem {
        String title;
        String value;

        OperationDetailsItem() {
        }

        public String getTitle() {
            return this.title;
        }

        public String getValue() {
            return this.value;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setValue(String str) {
            this.value = str;
        }

        OperationDetailsItem(String str, String str2) {
            this.title = str;
            this.value = str2;
        }
    }

    @Parcel
    /* renamed from: ge.bog.mobilebank.ui.model.OperationResultData$OperationDetailsItemWithSymbol */
    public static class OperationDetailsItemWithSymbol extends OperationDetailsItem {
        OperationDetailsItemWithSymbol() {
        }

        OperationDetailsItemWithSymbol(String str, String str2) {
            this.title = str;
            this.value = str2;
        }
    }

    private void ensureDetailsList() {
        if (this.detailsList == null) {
            this.detailsList = new ArrayList();
        }
    }

    public void addDetails(String str, String str2) {
        ensureDetailsList();
        this.detailsList.add(new OperationDetailsItem(str, str2));
    }

    public void addDetailsWithSymbol(String str, String str2) {
        ensureDetailsList();
        this.detailsList.add(new OperationDetailsItemWithSymbol(str, str2));
    }

    public List<OperationDetailsItem> getDetailsList() {
        return this.detailsList;
    }

    public String getErrorTitle() {
        return this.errorTitle;
    }

    public String getSuccessTitle() {
        return this.successTitle;
    }

    public String getTitle() {
        return this.success ? this.successTitle : this.errorTitle;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setDetailsList(List<OperationDetailsItem> list) {
        this.detailsList = list;
    }

    public void setErrorTitle(String str) {
        this.errorTitle = str;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public void setSuccessTitle(String str) {
        this.successTitle = str;
    }
}
