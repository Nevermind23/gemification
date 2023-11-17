package p341ge.bog.mobilebank.model.datareport;

/* renamed from: ge.bog.mobilebank.model.datareport.DataGatheringParam */
public class DataGatheringParam {
    private String parameterName;
    private String parameterValue;
    private String protocolType;

    public String getParameterName() {
        return this.parameterName;
    }

    public String getParameterValue() {
        return this.parameterValue;
    }

    public int getParameterValueInt() {
        return Integer.parseInt(this.parameterValue);
    }

    public String getProtocolType() {
        return this.protocolType;
    }
}
