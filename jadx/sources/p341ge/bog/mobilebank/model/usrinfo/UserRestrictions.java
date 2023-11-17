package p341ge.bog.mobilebank.model.usrinfo;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.model.usrinfo.UserRestrictions */
public final class UserRestrictions {
    public static final String CARDS_APPLICATIONS_REGISTER = "CARDS_APPLICATIONS_REGISTER";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DEPOSITS_APPLICATIONS_OPEN_NEW_DEPOSIT = "DEPOSITS_APPLICATIONS_OPEN_NEW_DEPOSIT";
    public static final String LOANS_PREPARE_APPLICATION_V2 = "LOANS_PREPARE_APPLICATION_V2";
    public static final String MORE_OFFERS_AND_APPLICATIONS = "MORE_OFFERS_AND_APPLICATIONS";
    public static final String OFFERS_GET_OFFER_LIMIT_INFO = "OFFERS_GET_OFFER_LIMIT_INFO";
    public static final String PAYMENTS_CREATE_GAMBLING_PAYMENT = "PAYMENTS_CREATE_GAMBLING_PAYMENT";
    public static final String SCOOLCARDS_GET_DAILY_LIMIT_TYPES = "SCOOLCARDS_GET_DAILY_LIMIT_TYPES";
    private final List<String> restrictedServices;

    /* renamed from: ge.bog.mobilebank.model.usrinfo.UserRestrictions$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserRestrictions(List<String> list) {
        C41536l.m120489i(list, "restrictedServices");
        this.restrictedServices = list;
    }

    private final List<String> component1() {
        return this.restrictedServices;
    }

    public static /* synthetic */ UserRestrictions copy$default(UserRestrictions userRestrictions, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userRestrictions.restrictedServices;
        }
        return userRestrictions.copy(list);
    }

    public final boolean contains(String str) {
        C41536l.m120489i(str, "restriction");
        return this.restrictedServices.contains(str);
    }

    public final UserRestrictions copy(List<String> list) {
        C41536l.m120489i(list, "restrictedServices");
        return new UserRestrictions(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserRestrictions) && C41536l.m120484d(this.restrictedServices, ((UserRestrictions) obj).restrictedServices);
    }

    public int hashCode() {
        return this.restrictedServices.hashCode();
    }

    public String toString() {
        List<String> list = this.restrictedServices;
        return "UserRestrictions(restrictedServices=" + list + ")";
    }
}
