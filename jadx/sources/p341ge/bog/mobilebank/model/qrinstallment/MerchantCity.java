package p341ge.bog.mobilebank.model.qrinstallment;

/* renamed from: ge.bog.mobilebank.model.qrinstallment.MerchantCity */
public class MerchantCity {
    private String cityEN;
    private String cityGE;
    private int cityId;
    private String regionEN;
    private String regionGE;

    public String getCityEN() {
        return this.cityEN;
    }

    public String getCityGE() {
        return this.cityGE;
    }

    public int getCityId() {
        return this.cityId;
    }

    public String getRegionEN() {
        return this.regionEN;
    }

    public String getRegionGE() {
        return this.regionGE;
    }

    public void setCityEN(String str) {
        this.cityEN = str;
    }

    public void setCityGE(String str) {
        this.cityGE = str;
    }

    public void setCityId(int i) {
        this.cityId = i;
    }

    public void setRegionEN(String str) {
        this.regionEN = str;
    }

    public void setRegionGE(String str) {
        this.regionGE = str;
    }

    public String toString() {
        return "MerchantCity{cityGE = '" + this.cityGE + '\'' + ",regionEN = '" + this.regionEN + '\'' + ",regionGE = '" + this.regionGE + '\'' + ",cityEN = '" + this.cityEN + '\'' + ",cityId = '" + this.cityId + '\'' + "}";
    }
}
