package p341ge.bog.mobilebank.p975ui.widgets.rates;

import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.ui.widgets.rates.b */
public abstract class C35831b implements C16560a {
    /* renamed from: a */
    public static void m106297a(CurrencyRatesWidgetProvider currencyRatesWidgetProvider, RootBankApiManager rootBankApiManager) {
        currencyRatesWidgetProvider.f86544c = rootBankApiManager;
    }

    /* renamed from: b */
    public static void m106298b(CurrencyRatesWidgetProvider currencyRatesWidgetProvider, PreferencesApiManager preferencesApiManager) {
        currencyRatesWidgetProvider.f86545d = preferencesApiManager;
    }
}
