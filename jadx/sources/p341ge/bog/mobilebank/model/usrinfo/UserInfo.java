package p341ge.bog.mobilebank.model.usrinfo;

import hd0.C24978b;
import n41.C37353c;

/* renamed from: ge.bog.mobilebank.model.usrinfo.UserInfo */
public class UserInfo {
    public Long birthDate;
    public String categoryType;
    public Double churnRate;
    public String clientCategory;
    private String clientKey;
    public String clientSubCategory;
    private Long customerId;
    public String firstName;
    public String firstNameInt;
    private C24978b isPayroll;
    public C24978b isStaff;
    public String lastName;
    public String lastNameInt;
    public String loyaltySegment;
    public String pin;
    public String resident;
    public String sex;
    public String tranStatus;

    public String getClientCategory() {
        return this.clientCategory;
    }

    public ClientCategory getClientCategoryEnum() {
        String str = this.clientCategory;
        str.hashCode();
        if (str.equals("WM")) {
            return ClientCategory.WEALTH_MANAGEMENT;
        }
        if (!str.equals("SOLO")) {
            return ClientCategory.RETAIL;
        }
        return ClientCategory.SOLO;
    }

    public String getClientKey() {
        return this.clientKey;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFirstNameInt() {
        return this.firstNameInt;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getLastNameInt() {
        return this.lastNameInt;
    }

    public String getName() {
        String str;
        String str2 = this.firstName;
        if (str2 == null || (str = this.lastName) == null) {
            return "";
        }
        return String.format("%s %s", new Object[]{str2, str});
    }

    public String getNameInt() {
        String str;
        String str2 = this.firstNameInt;
        if (str2 == null || (str = this.lastNameInt) == null) {
            return "";
        }
        return String.format("%s %s", new Object[]{str2, str});
    }

    public boolean isDSClient() {
        return "DS".equals(this.categoryType);
    }

    public boolean isPayroll() {
        C24978b bVar = this.isPayroll;
        return bVar != null && bVar.mo63390c();
    }

    public boolean isRBClient() {
        return "RB".equals(this.clientCategory);
    }

    public boolean isResident() {
        return C24978b.YES.mo63391e().equals(this.resident);
    }

    public boolean isSoloClient() {
        return "SOLO".equals(this.clientCategory);
    }

    public boolean isSoloClubClient(String str) {
        return "SOLO CLUB".equalsIgnoreCase(str);
    }

    public boolean isSoloXClient(String str) {
        return "SOLO X".equalsIgnoreCase(str);
    }

    public boolean isWealthClient() {
        return "WM".equals(this.clientCategory);
    }

    public void setCustomerId(Long l) {
        this.customerId = l;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public String getFirstName(C37353c cVar) {
        if (cVar == C37353c.KA) {
            return this.firstName;
        }
        return this.firstNameInt;
    }

    public String getName(C37353c cVar) {
        if (cVar == C37353c.KA) {
            return getName();
        }
        return getNameInt();
    }
}
