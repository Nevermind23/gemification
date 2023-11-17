package p341ge.bog.mobilebank.rest.service;

import ci1.C40458f;
import ci1.C40472t;
import ed1.C40749p;
import p341ge.bog.mobilebank.model.google.Direction;

/* renamed from: ge.bog.mobilebank.rest.service.IRetrofitGoogleService */
public interface IRetrofitGoogleService {
    @C40458f("maps/api/directions/json")
    C40749p<Direction> getDirections(@C40472t("origin") String str, @C40472t("destination") String str2, @C40472t("language") String str3, @C40472t("sensor") boolean z, @C40472t("units") String str4, @C40472t("mode") String str5, @C40472t("key") String str6);
}
