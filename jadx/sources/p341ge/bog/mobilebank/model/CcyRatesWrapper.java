package p341ge.bog.mobilebank.model;

/* renamed from: ge.bog.mobilebank.model.CcyRatesWrapper */
public class CcyRatesWrapper {
    long currentDate;
    CcyRate[] list;

    public long getCurrentDate() {
        return this.currentDate;
    }

    public CcyRate[] getList() {
        return this.list;
    }

    public void setList(CcyRate[] ccyRateArr) {
        this.list = ccyRateArr;
    }
}
