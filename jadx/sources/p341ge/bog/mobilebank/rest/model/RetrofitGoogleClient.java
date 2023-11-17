package p341ge.bog.mobilebank.rest.model;

import ai1.C40325g;
import bi1.C40388a;
import cg1.C40446a;
import of1.C41944z;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.service.IRetrofitGoogleService;
import zh1.C43511w;

/* renamed from: ge.bog.mobilebank.rest.model.RetrofitGoogleClient */
public class RetrofitGoogleClient {
    public static final String BASE_URL = "https://maps.googleapis.com/";
    private IRetrofitGoogleService googleService;

    public RetrofitGoogleClient(PreferencesApiManager preferencesApiManager) {
        C41944z.C41945a aVar = new C41944z.C41945a();
        if (preferencesApiManager.isHttpRequestsLoggingEnabled()) {
            C40446a aVar2 = new C40446a();
            aVar2.mo94505e(C40446a.C40447a.BODY);
            aVar.mo97091a(aVar2);
        }
        this.googleService = (IRetrofitGoogleService) new C43511w.C43513b().mo102232c(BASE_URL).mo102236g(aVar.mo97097d()).mo102231b(C40388a.m116953f()).mo102230a(C40325g.m116760d()).mo102234e().mo102220b(IRetrofitGoogleService.class);
    }

    public IRetrofitGoogleService getGoogleService() {
        return this.googleService;
    }
}
