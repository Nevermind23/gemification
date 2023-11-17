package p341ge.bog.mobilebank.linksharing.presentation.link;

import androidx.annotation.Keep;
import com.google.gson.C5494h;
import com.google.gson.Gson;
import g91.C32343x;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.Client;
import p748eu.C20292b;
import p758fu.C20557a;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.link.CardRegistrationProcessor */
public interface CardRegistrationProcessor {

    @Keep
    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.CardRegistrationProcessor$DebitCardApplication */
    public static final class DebitCardApplication {
        @C8664c("DEBIT_CARD_APPLICATION")
        private final List<DebitCard> debitCards;

        @Keep
        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.CardRegistrationProcessor$DebitCardApplication$DebitCard */
        public static final class DebitCard {
            private final String appType;
            private final String clientSegment;
            private final String subProductCode;

            public DebitCard(String str, String str2, String str3) {
                C41536l.m120489i(str, "appType");
                C41536l.m120489i(str2, "clientSegment");
                C41536l.m120489i(str3, "subProductCode");
                this.appType = str;
                this.clientSegment = str2;
                this.subProductCode = str3;
            }

            public static /* synthetic */ DebitCard copy$default(DebitCard debitCard, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = debitCard.appType;
                }
                if ((i & 2) != 0) {
                    str2 = debitCard.clientSegment;
                }
                if ((i & 4) != 0) {
                    str3 = debitCard.subProductCode;
                }
                return debitCard.copy(str, str2, str3);
            }

            public final String component1() {
                return this.appType;
            }

            public final String component2() {
                return this.clientSegment;
            }

            public final String component3() {
                return this.subProductCode;
            }

            public final DebitCard copy(String str, String str2, String str3) {
                C41536l.m120489i(str, "appType");
                C41536l.m120489i(str2, "clientSegment");
                C41536l.m120489i(str3, "subProductCode");
                return new DebitCard(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DebitCard)) {
                    return false;
                }
                DebitCard debitCard = (DebitCard) obj;
                return C41536l.m120484d(this.appType, debitCard.appType) && C41536l.m120484d(this.clientSegment, debitCard.clientSegment) && C41536l.m120484d(this.subProductCode, debitCard.subProductCode);
            }

            public final String getAppType() {
                return this.appType;
            }

            public final String getClientSegment() {
                return this.clientSegment;
            }

            public final String getSubProductCode() {
                return this.subProductCode;
            }

            public int hashCode() {
                return (((this.appType.hashCode() * 31) + this.clientSegment.hashCode()) * 31) + this.subProductCode.hashCode();
            }

            public String toString() {
                String str = this.appType;
                String str2 = this.clientSegment;
                String str3 = this.subProductCode;
                return "DebitCard(appType=" + str + ", clientSegment=" + str2 + ", subProductCode=" + str3 + ")";
            }
        }

        public DebitCardApplication(List<DebitCard> list) {
            C41536l.m120489i(list, "debitCards");
            this.debitCards = list;
        }

        public static /* synthetic */ DebitCardApplication copy$default(DebitCardApplication debitCardApplication, List<DebitCard> list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = debitCardApplication.debitCards;
            }
            return debitCardApplication.copy(list);
        }

        public final List<DebitCard> component1() {
            return this.debitCards;
        }

        public final DebitCardApplication copy(List<DebitCard> list) {
            C41536l.m120489i(list, "debitCards");
            return new DebitCardApplication(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DebitCardApplication) && C41536l.m120484d(this.debitCards, ((DebitCardApplication) obj).debitCards);
        }

        public final List<DebitCard> getDebitCards() {
            return this.debitCards;
        }

        public int hashCode() {
            return this.debitCards.hashCode();
        }

        public String toString() {
            List<DebitCard> list = this.debitCards;
            return "DebitCardApplication(debitCards=" + list + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.CardRegistrationProcessor$a */
    public static final class C15143a implements CardRegistrationProcessor {

        /* renamed from: d */
        public static final C15144a f43453d = new C15144a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private final Client f43454a;

        /* renamed from: b */
        private final C20292b f43455b;

        /* renamed from: c */
        private final C43079p f43456c = C15145b.f43457d;

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.CardRegistrationProcessor$a$a */
        public static final class C15144a {
            private C15144a() {
            }

            public /* synthetic */ C15144a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: ge.bog.mobilebank.linksharing.presentation.link.CardRegistrationProcessor$a$b */
        static final class C15145b extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C15145b f43457d = new C15145b();

            C15145b() {
                super(2);
            }

            /* renamed from: a */
            public final DebitCardApplication.DebitCard invoke(DebitCardApplication debitCardApplication, String str) {
                List<DebitCardApplication.DebitCard> debitCards;
                C41536l.m120489i(str, "segment");
                T t = null;
                if (debitCardApplication == null || (debitCards = debitCardApplication.getDebitCards()) == null) {
                    return null;
                }
                Iterator<T> it = debitCards.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C41536l.m120484d(((DebitCardApplication.DebitCard) next).getClientSegment(), str)) {
                        t = next;
                        break;
                    }
                }
                return (DebitCardApplication.DebitCard) t;
            }
        }

        public C15143a(Client client, C20292b bVar) {
            C41536l.m120489i(client, "client");
            C41536l.m120489i(bVar, "getInternalAppSettingByNameUseCase");
            this.f43454a = client;
            this.f43455b = bVar;
        }

        /* renamed from: a */
        public C37223a mo42170a() {
            DebitCardApplication debitCardApplication;
            DebitCardApplication.DebitCard debitCard;
            String subProductCode;
            C5494h b;
            String n1;
            Object obj;
            C20557a b2 = this.f43455b.mo48775b("P2P_LINK");
            if (b2 == null || (b = b2.mo49085b()) == null || (n1 = C32343x.m95471n1(b)) == null) {
                debitCardApplication = null;
            } else {
                try {
                    obj = new Gson().mo18170l(n1, DebitCardApplication.class);
                } catch (Exception unused) {
                    obj = null;
                }
                debitCardApplication = (DebitCardApplication) obj;
            }
            if (this.f43454a.getUserInfo().isSolo()) {
                debitCard = (DebitCardApplication.DebitCard) this.f43456c.invoke(debitCardApplication, "SOLO");
            } else if (this.f43454a.getUserInfo().isWealth()) {
                debitCard = (DebitCardApplication.DebitCard) this.f43456c.invoke(debitCardApplication, "WM");
            } else {
                debitCard = (DebitCardApplication.DebitCard) this.f43456c.invoke(debitCardApplication, "RB");
            }
            if (debitCard == null || (subProductCode = debitCard.getSubProductCode()) == null) {
                return null;
            }
            return C32343x.m95466m(subProductCode);
        }
    }

    /* renamed from: a */
    C37223a mo42170a();
}
