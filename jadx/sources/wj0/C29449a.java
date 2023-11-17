package wj0;

import dk0.C20031a;
import dk0.C20035e;
import dk0.C20036f;
import dk0.C20037g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity;
import p341ge.bog.mobilebank.googlepay.data.entity.PushTokenizeEntity;
import p341ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity;
import p341ge.bog.mobilebank.googlepay.data.entity.UserAddressEntity;

/* renamed from: wj0.a */
public final class C29449a {

    /* renamed from: wj0.a$a */
    public /* synthetic */ class C29450a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74544a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f74545b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|33|35) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|33|35) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0066 */
        static {
            /*
                ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity[] r0 = p341ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity r2 = p341ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity.CARD_NETWORK_VISA     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity r3 = p341ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity.CARD_NETWORK_AMEX     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity r4 = p341ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity.CARD_NETWORK_DISCOVER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity r5 = p341ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity.CARD_NETWORK_MASTERCARD     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity r6 = p341ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity.CARD_NETWORK_QUICPAY     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity r6 = p341ge.bog.mobilebank.googlepay.data.entity.CardNetworkEntity.CARD_NETWORK_PRIVATE_LABEL     // Catch:{ NoSuchFieldError -> 0x003d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r7 = 6
                r0[r6] = r7     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f74544a = r0
                ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity[] r0 = p341ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity r6 = p341ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity.TOKEN_PROVIDER_VISA     // Catch:{ NoSuchFieldError -> 0x004e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity r1 = p341ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity.TOKEN_PROVIDER_AMEX     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity r1 = p341ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity.TOKEN_PROVIDER_DISCOVER     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity r1 = p341ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity.TOKEN_PROVIDER_JCB     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity r1 = p341ge.bog.mobilebank.googlepay.data.entity.TokenProviderEntity.TOKEN_PROVIDER_MASTERCARD     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                f74545b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wj0.C29449a.C29450a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final C20031a mo69297a(CardNetworkEntity cardNetworkEntity) {
        C41536l.m120489i(cardNetworkEntity, "entity");
        switch (C29450a.f74544a[cardNetworkEntity.ordinal()]) {
            case 1:
                return C20031a.CARD_NETWORK_VISA;
            case 2:
                return C20031a.CARD_NETWORK_AMEX;
            case 3:
                return C20031a.CARD_NETWORK_DISCOVER;
            case 4:
                return C20031a.CARD_NETWORK_MASTERCARD;
            case 5:
                return C20031a.CARD_NETWORK_QUICPAY;
            case 6:
                return C20031a.CARD_NETWORK_PRIVATE_LABEL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public final C20035e mo69298b(PushTokenizeEntity pushTokenizeEntity) {
        C41536l.m120489i(pushTokenizeEntity, "entity");
        return new C20035e(mo69297a(pushTokenizeEntity.getCardNetwork()), pushTokenizeEntity.getLastDigits(), pushTokenizeEntity.getOpcBase64(), mo69299c(pushTokenizeEntity.getTokenProvider()), mo69300d(pushTokenizeEntity.getUserAddress()));
    }

    /* renamed from: c */
    public final C20036f mo69299c(TokenProviderEntity tokenProviderEntity) {
        C41536l.m120489i(tokenProviderEntity, "entity");
        int i = C29450a.f74545b[tokenProviderEntity.ordinal()];
        if (i == 1) {
            return C20036f.TOKEN_PROVIDER_VISA;
        }
        if (i == 2) {
            return C20036f.TOKEN_PROVIDER_AMEX;
        }
        if (i == 3) {
            return C20036f.TOKEN_PROVIDER_DISCOVER;
        }
        if (i == 4) {
            return C20036f.TOKEN_PROVIDER_JCB;
        }
        if (i == 5) {
            return C20036f.TOKEN_PROVIDER_MASTERCARD;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public final C20037g mo69300d(UserAddressEntity userAddressEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C41536l.m120489i(userAddressEntity, "entity");
        String address1 = userAddressEntity.getAddress1();
        if (address1 == null) {
            str = "";
        } else {
            str = address1;
        }
        String administrativeArea = userAddressEntity.getAdministrativeArea();
        if (administrativeArea == null) {
            str2 = "";
        } else {
            str2 = administrativeArea;
        }
        String countryCode = userAddressEntity.getCountryCode();
        if (countryCode == null) {
            str3 = "";
        } else {
            str3 = countryCode;
        }
        String locality = userAddressEntity.getLocality();
        if (locality == null) {
            str4 = "";
        } else {
            str4 = locality;
        }
        String name = userAddressEntity.getName();
        if (name == null) {
            str5 = "";
        } else {
            str5 = name;
        }
        String phoneNumber = userAddressEntity.getPhoneNumber();
        if (phoneNumber == null) {
            str6 = "";
        } else {
            str6 = phoneNumber;
        }
        String postalCode = userAddressEntity.getPostalCode();
        if (postalCode == null) {
            postalCode = "";
        }
        return new C20037g(str, str2, str3, str4, str5, str6, postalCode);
    }
}
