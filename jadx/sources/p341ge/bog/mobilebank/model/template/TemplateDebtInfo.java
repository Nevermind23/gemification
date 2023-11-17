package p341ge.bog.mobilebank.model.template;

/* renamed from: ge.bog.mobilebank.model.template.TemplateDebtInfo */
public class TemplateDebtInfo {
    private int actualDebts = 0;
    private int debtToDownload = 0;
    private int downloadedDebts = 0;
    private int totalDebt = 0;

    public int getActualDebts() {
        return this.actualDebts;
    }

    public int getDebtToDownload() {
        return this.debtToDownload;
    }

    public int getDownloadedDebts() {
        return this.downloadedDebts;
    }

    public int getTotalDebt() {
        return this.totalDebt;
    }

    public void setActualDebts(int i) {
        this.actualDebts = i;
    }

    public void setDebtToDownload(int i) {
        this.debtToDownload = i;
    }

    public void setDownloadedDebts(int i) {
        this.downloadedDebts = i;
    }

    public void setTotalDebt(int i) {
        this.totalDebt = i;
    }
}
