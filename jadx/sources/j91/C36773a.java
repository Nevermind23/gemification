package j91;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayList;
import java.util.List;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.datareport.AppsDataReport;
import p341ge.bog.mobilebank.model.datareport.DataReportHeader;
import p341ge.bog.mobilebank.model.datareport.DeviceDataReport;
import p341ge.bog.mobilebank.model.datareport.LocationDataReport;
import p341ge.bog.mobilebank.model.datareport.MediaDataReport;
import p341ge.bog.mobilebank.model.datareport.PhoneDataReport;
import p341ge.bog.mobilebank.model.datareport.SmsDataReport;
import p341ge.bog.mobilebank.model.datareport.WifiDataReport;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;

/* renamed from: j91.a */
public class C36773a {

    /* renamed from: a */
    private final Context f88723a;

    /* renamed from: b */
    private LocationDataReport f88724b;

    /* renamed from: c */
    private WifiDataReport f88725c;

    /* renamed from: d */
    private SmsDataReport f88726d;

    /* renamed from: e */
    private PhoneDataReport f88727e;

    /* renamed from: f */
    private AppsDataReport f88728f;

    /* renamed from: g */
    private MediaDataReport f88729g;

    public C36773a(Context context) {
        this.f88723a = context;
    }

    /* renamed from: c */
    private String m108983c() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f88723a.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    /* renamed from: d */
    private DataReportHeader m108984d() {
        DataReportHeader dataReportHeader = new DataReportHeader();
        dataReportHeader.setAppPermissions(m108985e());
        dataReportHeader.setCarrier(m108983c());
        dataReportHeader.setDeviceID(PreferencesApiManager.getInstance().getExtCustomer());
        dataReportHeader.setDeviceManufacturer(Build.MANUFACTURER);
        dataReportHeader.setDeviceOS(PensionStatusResult.STATUS_ACTIVE);
        dataReportHeader.setPhoneDate(System.currentTimeMillis());
        dataReportHeader.setDeviceModel(Build.MODEL);
        return dataReportHeader;
    }

    /* renamed from: e */
    private List m108985e() {
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = this.f88723a.getPackageManager().getPackageInfo(this.f88723a.getPackageName(), C11398b.f33143v);
            int i = 0;
            while (true) {
                String[] strArr = packageInfo.requestedPermissions;
                if (i >= strArr.length) {
                    break;
                }
                if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                    arrayList.add(strArr[i]);
                }
                i++;
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public C36773a mo89650a(AppsDataReport appsDataReport) {
        this.f88728f = appsDataReport;
        return this;
    }

    /* renamed from: b */
    public DeviceDataReport mo89651b() {
        DeviceDataReport deviceDataReport = new DeviceDataReport();
        deviceDataReport.setHeader(m108984d());
        deviceDataReport.setLocation(this.f88724b);
        deviceDataReport.setWifi(this.f88725c);
        deviceDataReport.setApps(this.f88728f);
        deviceDataReport.setMedia(this.f88729g);
        deviceDataReport.setPhoneReport(this.f88727e);
        deviceDataReport.setSmsReport(this.f88726d);
        return deviceDataReport;
    }

    /* renamed from: f */
    public C36773a mo89652f(LocationDataReport locationDataReport) {
        this.f88724b = locationDataReport;
        return this;
    }

    /* renamed from: g */
    public C36773a mo89653g(WifiDataReport wifiDataReport) {
        this.f88725c = wifiDataReport;
        return this;
    }
}
