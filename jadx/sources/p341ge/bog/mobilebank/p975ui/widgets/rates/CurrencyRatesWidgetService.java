package p341ge.bog.mobilebank.p975ui.widgets.rates;

import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViewsService;

/* renamed from: ge.bog.mobilebank.ui.widgets.rates.CurrencyRatesWidgetService */
public class CurrencyRatesWidgetService extends RemoteViewsService {
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Log.d("onGetViewFactory", ">> intent : " + intent);
        return new C35829a(getApplicationContext(), intent);
    }
}
