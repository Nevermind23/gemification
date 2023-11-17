package p341ge.bog.mobilebank.transfers.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.TransferHistoryItem;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.model.ddsto.STODetails;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.transfers.activities.TransferLoaderActivity;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.transfers.model.TransferForm */
public class TransferForm {
    public static final String MODULE_STO = "STO";
    public static final String MODULE_TEMPLATE = "TEMPLATE";
    public static final String MODULE_TRANSFER = "TRANSFER";
    public static final String OPERATION_CREATE = "CREATE";
    public static final String OPERATION_EDIT = "EDIT";
    public static final String OPERATION_VIEW = "VIEW";
    public static final String TRANSFER_FORM_BUDGET = "BUDGET";
    public static final String TRANSFER_FORM_CONVERSION = "CONVERSION";
    public static final String TRANSFER_FORM_FOREIGN = "FOREIGN";
    public static final String TRANSFER_FORM_OTHER = "OTHER";
    public static final String TRANSFER_FORM_OWN = "OWN";

    /* renamed from: ge.bog.mobilebank.transfers.model.TransferForm$TRANSFERTYPE */
    public enum TRANSFERTYPE {
        PIN("pin"),
        ACCOUNT("iban"),
        PHONE("phone");
        
        private String logName;

        private TRANSFERTYPE(String str) {
            this.logName = str;
        }

        public String getLogName() {
            return this.logName;
        }
    }

    public static String getTransferFormByDocType(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -93971273:
                if (str.equals("PAYMENT_WITHIN_BANK")) {
                    c = 0;
                    break;
                }
                break;
            case -93909248:
                if (str.equals("PAYMENT_WITHIN_BUDGET")) {
                    c = 1;
                    break;
                }
                break;
            case 1078753379:
                if (str.equals("PAYMENT_WITHIN_GEORGIA")) {
                    c = 2;
                    break;
                }
                break;
            case 1174158607:
                if (str.equals("PAYMENT_CONVERSION")) {
                    c = 3;
                    break;
                }
                break;
            case 1527111732:
                if (str.equals("PAYMENT_REAL_ESTATE")) {
                    c = 4;
                    break;
                }
                break;
            case 1867328347:
                if (str.equals("PAYMENT_FOREIGN")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case 4:
            case 5:
                return TRANSFER_FORM_OTHER;
            case 1:
                return TRANSFER_FORM_BUDGET;
            case 3:
                return TRANSFER_FORM_CONVERSION;
            default:
                return TRANSFER_FORM_OWN;
        }
    }

    public static String getTransferFormBySTOProductCode(String str, String str2, String str3) {
        str.hashCode();
        if (!str.equals("STO")) {
            boolean equals = str.equals("BILL");
            return TRANSFER_FORM_OWN;
        }
        if ("PAYMENT_WITHIN_GEORGIA".equals(str2)) {
            if (str3 != null && !str3.startsWith("GE")) {
                return TRANSFER_FORM_BUDGET;
            }
        } else if (!"PAYMENT_WITHIN_BANK".equals(str2)) {
            return TRANSFER_FORM_OWN;
        }
        return TRANSFER_FORM_OTHER;
    }

    public static String getTransferFormByTemplateType(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 66:
                if (str.equals("B")) {
                    c = 0;
                    break;
                }
                break;
            case 71:
                if (str.equals("G")) {
                    c = 1;
                    break;
                }
                break;
            case 82:
                if (str.equals("R")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return TRANSFER_FORM_OTHER;
            case 2:
                return TRANSFER_FORM_BUDGET;
            default:
                return TRANSFER_FORM_OWN;
        }
    }

    public static C34932I startWith(Activity activity, String str, String str2) {
        return new C34932I(activity, str, str2);
    }

    public static C34932I startWith(Fragment fragment, String str, String str2) {
        return new C34932I((Activity) fragment.getActivity(), str, str2);
    }

    public static C34932I startWith(Context context, String str, String str2) {
        return new C34932I(context, str, str2);
    }

    /* renamed from: ge.bog.mobilebank.transfers.model.TransferForm$I */
    public static class C34932I {
        private AccountOperation accountOperation;
        private Activity activity;
        private String amount;
        private long contactId = -1;
        private Context context;
        private long dstAcctKey;
        private String dstAcctNo;
        private boolean isRealEstate = false;
        private long itemKey;
        private String module;
        private long moneyRequestId = -1;
        private String nomination;
        private boolean openWizard = false;
        private long operationDate;
        private String operationType;
        private long paymentID;
        private long pfmId;
        private String printFormType;
        private int requestCode = -1;
        private long srcAcctKey;
        private DDSTO stoItem;
        private TemplateBasketItem template;
        private String transferForm;
        private TransferHistoryItem transferHistoryItem;
        private TRANSFERTYPE transfertype;
        private boolean withinBank;

        public C34932I(Activity activity2, String str, String str2) {
            this.activity = activity2;
            this.module = str;
            this.operationType = str2;
        }

        public Intent build() {
            Intent intent;
            int i;
            int i2;
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < 27; i3++) {
                arrayList.add("");
            }
            arrayList.set(3, this.dstAcctNo);
            long j = this.srcAcctKey;
            if (j > 0) {
                arrayList.set(1, String.valueOf(j));
            }
            long j2 = this.dstAcctKey;
            if (j2 > 0) {
                arrayList.set(3, String.valueOf(j2));
            }
            arrayList.set(15, this.amount);
            if (this.nomination == null && !TransferForm.TRANSFER_FORM_BUDGET.equals(this.transferForm)) {
                Activity activity2 = this.activity;
                if (activity2 != null) {
                    if (TransferForm.TRANSFER_FORM_CONVERSION.equals(this.transferForm)) {
                        i2 = C10328q.transfer_details_conversion;
                    } else {
                        i2 = C10328q.transfer_details_personal_transfer;
                    }
                    this.nomination = activity2.getString(i2);
                } else {
                    Context context2 = this.context;
                    if (TransferForm.TRANSFER_FORM_CONVERSION.equals(this.transferForm)) {
                        i = C10328q.transfer_details_conversion;
                    } else {
                        i = C10328q.transfer_details_personal_transfer;
                    }
                    this.nomination = context2.getString(i);
                }
            }
            String str = this.nomination;
            if (str != null) {
                arrayList.set(19, str);
            }
            Class<TransferLoaderActivity> cls = TransferLoaderActivity.class;
            if (this.activity != null) {
                intent = new Intent(this.activity, cls);
            } else {
                intent = new Intent(this.context, cls);
            }
            intent.putExtra("TRANSFER_MODULE", this.module);
            intent.putExtra("OPERATION_TYPE", this.operationType);
            intent.putExtra("TRANSFER_FORM", this.transferForm);
            intent.putExtra("TRANSFER_ITEM_KEY", this.itemKey);
            intent.putExtra("TRANSFER_PRINT_FORM_TYPE", this.printFormType);
            intent.putExtra("TRANSFER_DD_KEY", this.paymentID);
            intent.putExtra("TRANSFER_PFM_ID", this.pfmId);
            intent.putExtra("TRANSFER_OPERATION_DATE", this.operationDate);
            intent.putExtra("TRANSFER_WITHIN_BANK", this.withinBank);
            intent.putExtra("TRANSFER_TYPE", this.transfertype);
            intent.putExtra("TRANSFER_REQUEST_CODE", this.requestCode);
            intent.putExtra("IS_REAL_ESTATE", this.isRealEstate);
            intent.putExtra("TRANSFER_CONTACT_ID", this.contactId);
            intent.putExtra("TRANSFER_MONEY_REQUEST_ID", this.moneyRequestId);
            intent.putExtra("TRANSFER_AUTOMATICALLY_OPEN_WIZARD", this.openWizard);
            intent.putExtra("COLLECTED_VALUES", C42035e.m122121c(arrayList));
            TemplateBasketItem templateBasketItem = this.template;
            if (templateBasketItem != null) {
                intent.putExtra("TEMPLATE_ITEM", C42035e.m122121c(templateBasketItem));
            }
            DDSTO ddsto = this.stoItem;
            if (ddsto != null) {
                intent.putExtra("STO_ITEM", C42035e.m122121c(ddsto));
            }
            AccountOperation accountOperation2 = this.accountOperation;
            if (accountOperation2 != null) {
                intent.putExtra("ACCOUNT_OPERATION", C42035e.m122121c(accountOperation2));
            }
            TransferHistoryItem transferHistoryItem2 = this.transferHistoryItem;
            if (transferHistoryItem2 != null) {
                intent.putExtra("TRANSFER_HISTORY_ITEM", C42035e.m122121c(transferHistoryItem2));
            }
            return intent;
        }

        public C34932I setAccountOperation(AccountOperation accountOperation2) {
            this.accountOperation = accountOperation2;
            return this;
        }

        public C34932I setAmount(String str) {
            this.amount = str;
            return this;
        }

        public C34932I setContactId(long j) {
            this.contactId = j;
            return this;
        }

        public C34932I setDDKey(long j) {
            this.paymentID = j;
            return this;
        }

        public C34932I setDestinationAcctKey(long j) {
            this.dstAcctKey = j;
            return this;
        }

        public C34932I setDestinationAcctNo(String str) {
            this.dstAcctNo = str;
            return this;
        }

        public C34932I setIsRealEstate(boolean z) {
            this.isRealEstate = z;
            return this;
        }

        public C34932I setItemKey(long j) {
            this.itemKey = j;
            return this;
        }

        public C34932I setMoneyRequestId(long j) {
            this.moneyRequestId = j;
            return this;
        }

        public C34932I setNomination(String str) {
            this.nomination = str;
            return this;
        }

        public C34932I setOpenWizard(boolean z) {
            this.openWizard = z;
            return this;
        }

        public C34932I setOperationDate(Long l) {
            this.operationDate = l.longValue();
            return this;
        }

        public C34932I setPfmID(Long l) {
            if (l != null) {
                this.pfmId = l.longValue();
            }
            return this;
        }

        public C34932I setPrintFormType(String str) {
            this.printFormType = str;
            return this;
        }

        public C34932I setRequestCode(int i) {
            this.requestCode = i;
            return this;
        }

        public C34932I setSrcAcctKey(long j) {
            this.srcAcctKey = j;
            return this;
        }

        public C34932I setSto(DDSTO ddsto) {
            String str;
            boolean z;
            this.stoItem = ddsto;
            String str2 = ddsto.productCode;
            STODetails sTODetails = ddsto.details.stoDetails;
            String str3 = "";
            if (sTODetails != null) {
                str = sTODetails.subProductCode;
            } else {
                str = str3;
            }
            if (sTODetails != null) {
                str3 = sTODetails.benefAcctNo;
            }
            this.transferForm = TransferForm.getTransferFormBySTOProductCode(str2, str, str3);
            STODetails sTODetails2 = ddsto.details.stoDetails;
            if (sTODetails2 == null || !"PAYMENT_WITHIN_BANK".equals(sTODetails2.subProductCode)) {
                z = false;
            } else {
                z = true;
            }
            this.withinBank = z;
            return this;
        }

        public C34932I setTemplate(TemplateBasketItem templateBasketItem) {
            this.template = templateBasketItem;
            this.transferForm = TransferForm.getTransferFormByTemplateType(templateBasketItem.getTemplateType());
            this.withinBank = "B".equals(templateBasketItem.getTemplateType());
            return this;
        }

        public C34932I setTransferForm(String str) {
            this.transferForm = str;
            return this;
        }

        public C34932I setTransferHistoryItem(TransferHistoryItem transferHistoryItem2) {
            this.transferHistoryItem = transferHistoryItem2;
            this.transferForm = TransferForm.getTransferFormByDocType(transferHistoryItem2.docType);
            this.withinBank = "PAYMENT_WITHIN_BANK".equals(transferHistoryItem2.docType);
            return this;
        }

        public C34932I setTransfertype(TRANSFERTYPE transfertype2) {
            this.transfertype = transfertype2;
            return this;
        }

        public C34932I setWithinBank(boolean z) {
            this.withinBank = z;
            return this;
        }

        public void start() {
            Context context2 = this.context;
            if (context2 != null) {
                context2.startActivity(build());
            } else if (this.requestCode >= 0) {
                this.activity.startActivityForResult(build(), this.requestCode);
            } else {
                this.activity.startActivity(build());
            }
        }

        public C34932I(Context context2, String str, String str2) {
            this.context = context2;
            this.module = str;
            this.operationType = str2;
        }
    }
}
