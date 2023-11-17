package lk0;

import cf1.C40407d;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.UserAddress;
import dk0.C20031a;
import dk0.C20035e;
import dk0.C20036f;
import dk0.C20037g;
import ek0.C20261a;
import ek0.C20262b;
import g91.C32307h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import mk0.C26243a;
import mk0.C26244b;
import mk0.C26245c;
import mk0.C26246d;

/* renamed from: lk0.a */
public final class C26050a {

    /* renamed from: lk0.a$a */
    public /* synthetic */ class C26051a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66144a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f66145b;

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
                dk0.a[] r0 = dk0.C20031a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                dk0.a r2 = dk0.C20031a.CARD_NETWORK_AMEX     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                dk0.a r3 = dk0.C20031a.CARD_NETWORK_DISCOVER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                dk0.a r4 = dk0.C20031a.CARD_NETWORK_MASTERCARD     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                dk0.a r5 = dk0.C20031a.CARD_NETWORK_QUICPAY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                dk0.a r6 = dk0.C20031a.CARD_NETWORK_PRIVATE_LABEL     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                dk0.a r6 = dk0.C20031a.CARD_NETWORK_VISA     // Catch:{ NoSuchFieldError -> 0x003d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r7 = 6
                r0[r6] = r7     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f66144a = r0
                dk0.f[] r0 = dk0.C20036f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                dk0.f r6 = dk0.C20036f.TOKEN_PROVIDER_AMEX     // Catch:{ NoSuchFieldError -> 0x004e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                dk0.f r1 = dk0.C20036f.TOKEN_PROVIDER_DISCOVER     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                dk0.f r1 = dk0.C20036f.TOKEN_PROVIDER_JCB     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                dk0.f r1 = dk0.C20036f.TOKEN_PROVIDER_MASTERCARD     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                dk0.f r1 = dk0.C20036f.TOKEN_PROVIDER_VISA     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                f66145b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lk0.C26050a.C26051a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final C20262b mo64938a(String str, String str2, String str3) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(str2, "cardClassCode");
        C41536l.m120489i(str3, "tokenReferenceId");
        return new C20262b(str3, mo64944g(mo64940c(str2)).mo65255b(), mo64942e(mo64939b(str2)).mo65246b(), str);
    }

    /* renamed from: b */
    public final C20031a mo64939b(String str) {
        C41536l.m120489i(str, "cardClassCode");
        String[] strArr = C32307h.f79721c;
        C41536l.m120488h(strArr, "card_classes_amex");
        if (C41333m.m119794s(strArr, str)) {
            return C20031a.CARD_NETWORK_AMEX;
        }
        String[] strArr2 = C32307h.f79719a;
        C41536l.m120488h(strArr2, "card_classes_visa");
        if (C41333m.m119794s(strArr2, str)) {
            return C20031a.CARD_NETWORK_VISA;
        }
        return C20031a.CARD_NETWORK_MASTERCARD;
    }

    /* renamed from: c */
    public final C20036f mo64940c(String str) {
        C41536l.m120489i(str, "cardClassCode");
        String[] strArr = C32307h.f79721c;
        C41536l.m120488h(strArr, "card_classes_amex");
        if (C41333m.m119794s(strArr, str)) {
            return C20036f.TOKEN_PROVIDER_AMEX;
        }
        String[] strArr2 = C32307h.f79719a;
        C41536l.m120488h(strArr2, "card_classes_visa");
        if (C41333m.m119794s(strArr2, str)) {
            return C20036f.TOKEN_PROVIDER_VISA;
        }
        return C20036f.TOKEN_PROVIDER_MASTERCARD;
    }

    /* renamed from: d */
    public final PushTokenizeRequest mo64941d(C20035e eVar, String str) {
        C41536l.m120489i(eVar, "pushTokenized");
        C41536l.m120489i(str, "cardName");
        C26244b f = mo64943f(eVar);
        C26246d e = f.mo65251e();
        UserAddress a = UserAddress.m18518v().mo15191f(e.mo65260e()).mo15187b(e.mo65256a()).mo15190e(e.mo65259d()).mo15188c(e.mo65257b()).mo15189d(e.mo65258c()).mo15193h(e.mo65263g()).mo15192g(e.mo65262f()).mo15186a();
        C41536l.m120488h(a, "with(userAddress) {\n    …build()\n                }");
        PushTokenizeRequest.C4885a aVar = new PushTokenizeRequest.C4885a();
        byte[] bytes = f.mo65249c().getBytes(C40407d.f95989b);
        C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
        PushTokenizeRequest.C4885a g = aVar.mo15172e(bytes).mo15171d(f.mo65247a().mo65246b()).mo15173f(f.mo65250d().mo65255b()).mo15169b(str).mo15170c(f.mo65248b()).mo15174g(a);
        C41536l.m120488h(g, "Builder()\n              …tUserAddress(userAddress)");
        PushTokenizeRequest a2 = g.mo15168a();
        C41536l.m120488h(a2, "with(transform(pushToken…Request.build()\n        }");
        return a2;
    }

    /* renamed from: e */
    public final C26243a mo64942e(C20031a aVar) {
        C41536l.m120489i(aVar, "cardNetwork");
        switch (C26051a.f66144a[aVar.ordinal()]) {
            case 1:
                return C26243a.CARD_NETWORK_AMEX;
            case 2:
                return C26243a.CARD_NETWORK_DISCOVER;
            case 3:
                return C26243a.CARD_NETWORK_MASTERCARD;
            case 4:
                return C26243a.CARD_NETWORK_QUICPAY;
            case 5:
                return C26243a.CARD_NETWORK_PRIVATE_LABEL;
            case 6:
                return C26243a.CARD_NETWORK_VISA;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: f */
    public final C26244b mo64943f(C20035e eVar) {
        C41536l.m120489i(eVar, "pushTokenize");
        return new C26244b(mo64942e(eVar.mo48420a()), eVar.mo48421b(), eVar.mo48422c(), mo64944g(eVar.mo48423d()), mo64945h(eVar.mo48424e()));
    }

    /* renamed from: g */
    public final C26245c mo64944g(C20036f fVar) {
        C41536l.m120489i(fVar, "tokenProvider");
        int i = C26051a.f66145b[fVar.ordinal()];
        if (i == 1) {
            return C26245c.TOKEN_PROVIDER_AMEX;
        }
        if (i == 2) {
            return C26245c.TOKEN_PROVIDER_DISCOVER;
        }
        if (i == 3) {
            return C26245c.TOKEN_PROVIDER_JCB;
        }
        if (i == 4) {
            return C26245c.TOKEN_PROVIDER_MASTERCARD;
        }
        if (i == 5) {
            return C26245c.TOKEN_PROVIDER_VISA;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: h */
    public final C26246d mo64945h(C20037g gVar) {
        C41536l.m120489i(gVar, "userAddress");
        return new C26246d(gVar.mo48428a(), gVar.mo48429b(), gVar.mo48430c(), gVar.mo48431d(), gVar.mo48432e(), gVar.mo48434f(), gVar.mo48435g());
    }

    /* renamed from: i */
    public final C20261a mo64946i(int i) {
        switch (i) {
            case 1:
                return C20261a.TOKEN_STATE_UNTOKENIZED;
            case 2:
                return C20261a.TOKEN_STATE_PENDING;
            case 3:
                return C20261a.TOKEN_STATE_NEEDS_IDENTITY_VERIFICATION;
            case 4:
                return C20261a.TOKEN_STATE_SUSPENDED;
            case 5:
                return C20261a.TOKEN_STATE_ACTIVE;
            case 6:
                return C20261a.TOKEN_STATE_FELICA_PENDING_PROVISIONING;
            default:
                return C20261a.NOT_ADDED;
        }
    }
}
