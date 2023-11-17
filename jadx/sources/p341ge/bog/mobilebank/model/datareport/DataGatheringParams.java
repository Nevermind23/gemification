package p341ge.bog.mobilebank.model.datareport;

import java.util.List;

/* renamed from: ge.bog.mobilebank.model.datareport.DataGatheringParams */
public class DataGatheringParams {
    private List<DataGatheringParam> apps;
    private List<DataGatheringParam> location;
    private List<DataGatheringParam> media;
    private List<DataGatheringParam> phoneReport;
    private List<DataGatheringParam> smsReport;
    private List<DataGatheringParam> wifi;

    private int getDataSendPeriodValue(List<DataGatheringParam> list) {
        if (list == null) {
            return -1;
        }
        for (DataGatheringParam next : list) {
            if ("DATA_SEND_PERIOD".equals(next.getParameterName())) {
                return next.getParameterValueInt();
            }
        }
        return -1;
    }

    public int getAppDataSendPeriod() {
        return getDataSendPeriodValue(this.apps);
    }

    public int getLocationDataSendPeriod() {
        int dataSendPeriodValue = getDataSendPeriodValue(this.location);
        if (dataSendPeriodValue == -1) {
            return getWifiDataSendPeriod();
        }
        return dataSendPeriodValue;
    }

    public int getMediaDataSendPeriod() {
        return getDataSendPeriodValue(this.media);
    }

    public int getPhoneDataSendPeriod() {
        return getDataSendPeriodValue(this.phoneReport);
    }

    public int getSmsDataSendPeriod() {
        return getDataSendPeriodValue(this.smsReport);
    }

    public int getWifiDataSendPeriod() {
        return getDataSendPeriodValue(this.wifi);
    }
}
