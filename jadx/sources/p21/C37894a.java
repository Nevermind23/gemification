package p21;

import a31.C30481a;
import com.google.gson.C5611k;
import com.salesforce.marketingcloud.UrlHandler;
import j31.C36726b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l31.C37066a;
import l31.C37067b;
import l31.C37068c;
import l31.C37069d;
import p341ge.bog.mobilebank.shared.commonpopup.data.model.CommonPopupApiModel;
import p341ge.bog.mobilebank.shared.commonpopup.data.model.PopupActionApiModel;
import p341ge.bog.mobilebank.shared.data.deeplink.UrlDataEntity;

/* renamed from: p21.a */
public final class C37894a {

    /* renamed from: b */
    public static final C37895a f90964b = new C37895a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C30481a f90965a;

    /* renamed from: p21.a$a */
    public static final class C37895a {
        private C37895a() {
        }

        public /* synthetic */ C37895a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C37894a(C30481a aVar) {
        C41536l.m120489i(aVar, "deepLinkMapper");
        this.f90965a = aVar;
    }

    /* renamed from: b */
    private final C37068c m111378b(PopupActionApiModel popupActionApiModel) {
        C37069d a = C37069d.f89232e.mo90009a(popupActionApiModel.getButtonType());
        C36726b bVar = null;
        if (a == null) {
            return null;
        }
        C37067b c = m111379c(popupActionApiModel.getFirebaseClickEventName());
        C30481a aVar = this.f90965a;
        String deepLink = popupActionApiModel.getDeepLink();
        if (deepLink == null) {
            deepLink = "";
        }
        UrlDataEntity a2 = aVar.mo70815a(deepLink);
        if (a2 != null) {
            bVar = this.f90965a.mo70816b(a2);
        }
        return new C37068c(a, c, bVar, popupActionApiModel.getDictionaryKey());
    }

    /* renamed from: c */
    private final C37067b m111379c(String str) {
        try {
            String k = C5611k.m22282d(str).mo18216g().mo18450x("event_name").mo18211k();
            String k2 = C5611k.m22282d(str).mo18216g().mo18450x(UrlHandler.ACTION).mo18211k();
            C41536l.m120488h(k, "eventName");
            C41536l.m120488h(k2, UrlHandler.ACTION);
            return new C37067b(k, k2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C37066a mo91241a(CommonPopupApiModel commonPopupApiModel) {
        C41536l.m120489i(commonPopupApiModel, "commonPopupApiModel");
        String popupType = commonPopupApiModel.getPopupType();
        String headerDictionaryKey = commonPopupApiModel.getHeaderDictionaryKey();
        String descriptionDictionaryKey = commonPopupApiModel.getDescriptionDictionaryKey();
        int orderNumber = commonPopupApiModel.getOrderNumber();
        long frequency = (long) commonPopupApiModel.getFrequency();
        String animation = commonPopupApiModel.getAnimation();
        List<PopupActionApiModel> popupActions = commonPopupApiModel.getPopupActions();
        ArrayList arrayList = new ArrayList();
        for (PopupActionApiModel b : popupActions) {
            C37068c b2 = m111378b(b);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        return new C37066a(popupType, headerDictionaryKey, descriptionDictionaryKey, orderNumber, frequency, animation, arrayList, commonPopupApiModel.getExternalFile().asDomainModel(), C41536l.m120484d(commonPopupApiModel.getClosable(), "Y"));
    }
}
