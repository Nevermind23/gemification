package p341ge.bog.mobilebank.model.datareport;

import java.util.List;

/* renamed from: ge.bog.mobilebank.model.datareport.AppsDataReport */
public class AppsDataReport {
    private List<String> installedAppList;
    private List<String> topDataUsageApps;

    public void setInstalledAppList(List<String> list) {
        this.installedAppList = list;
    }

    public void setTopDataUsageApps(List<String> list) {
        this.topDataUsageApps = list;
    }

    public String toString() {
        return "AppsDataReport{installedAppList=" + this.installedAppList + ", topDataUsageApps=" + this.topDataUsageApps + '}';
    }
}
