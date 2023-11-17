package p341ge.bog.mobilebank.p975ui.widgets.atms;

import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViewsService;

/* renamed from: ge.bog.mobilebank.ui.widgets.atms.ServicePointsWidgetService */
public class ServicePointsWidgetService extends RemoteViewsService {
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Log.d("SrvcPntsWidgetService", "### onGetViewFactory");
        return new C35826b(getApplicationContext(), intent);
    }
}
