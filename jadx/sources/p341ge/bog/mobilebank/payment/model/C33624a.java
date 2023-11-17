package p341ge.bog.mobilebank.payment.model;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.ddsto.DDPaymentDetails;
import p341ge.bog.mobilebank.model.ddsto.DDProviderItem;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.model.ddsto.DDSTODetailsWrapper;

/* renamed from: ge.bog.mobilebank.payment.model.a */
public abstract class C33624a {

    /* renamed from: ge.bog.mobilebank.payment.model.a$a */
    public static class C33625a {

        /* renamed from: a */
        private Activity f81946a;

        /* renamed from: b */
        private Class f81947b;

        /* renamed from: c */
        private String f81948c;

        /* renamed from: d */
        private boolean f81949d;

        /* renamed from: e */
        private String f81950e;

        /* renamed from: f */
        private String f81951f;

        /* renamed from: g */
        private String f81952g;

        /* renamed from: h */
        private int f81953h = -1;

        /* renamed from: i */
        private DDSTO f81954i;

        /* renamed from: j */
        private boolean f81955j;

        /* renamed from: k */
        private boolean f81956k;

        /* renamed from: l */
        private long f81957l = -1;

        /* renamed from: m */
        private boolean f81958m;

        /* renamed from: n */
        private long f81959n = -1;

        /* renamed from: o */
        private boolean f81960o;

        /* renamed from: p */
        private String f81961p;

        /* renamed from: q */
        private ArrayList f81962q;

        /* renamed from: r */
        private int f81963r = -1;

        /* renamed from: s */
        private DDProviderItem f81964s;

        /* renamed from: t */
        private String f81965t;

        /* renamed from: u */
        private String f81966u;

        /* renamed from: v */
        private String f81967v;

        /* renamed from: w */
        private long f81968w = -1;

        /* renamed from: x */
        private String f81969x;

        /* renamed from: y */
        private String f81970y;

        public C33625a(Activity activity) {
            this.f81946a = activity;
        }

        /* renamed from: a */
        public Intent mo79801a() {
            Intent intent = new Intent(this.f81946a, this.f81947b);
            intent.putExtra("PAYMENT_SERVICE_ID", this.f81948c);
            intent.putExtra("PAYMENT_IS_COMPANY", this.f81949d);
            intent.putExtra("PAYMENT_COMPANY_NAME", this.f81970y);
            intent.putExtra("BONUS_TYPE", this.f81950e);
            intent.putExtra("BONUS_PRODUCT_TYPE", this.f81951f);
            intent.putExtra("PAYMENT_ESS_ID", this.f81952g);
            intent.putExtra("TB_PARK_CAR_NUMBER", this.f81965t);
            intent.putExtra("TB_PARK_PERSONAL_NUMBER", this.f81966u);
            intent.putExtra("TB_PARK_TICKET_NUMBER", this.f81967v);
            intent.putExtra("CREATE_NEW_TEMPLATE", this.f81956k);
            intent.putExtra("TEMPLATE_GROUP_ID", this.f81957l);
            intent.putExtra("FINISH_AFTER_CREATE_TEMPLATE", this.f81958m);
            intent.putExtra("TEMPLATE_ITEM_ID", this.f81959n);
            intent.putExtra("OPEN_TEMPLATE_IN_EDIT_MODE", this.f81960o);
            intent.putExtra("CAR_DEBT_KEY_CORRESPONDING_VALUE", this.f81961p);
            intent.putExtra("PAYMENT_RESULT_INFO", C42035e.m122121c(this.f81962q));
            intent.putExtra("PAYMENT_PACK_INDEX", this.f81963r);
            intent.putExtra("DD_ITEM", C42035e.m122121c(this.f81954i));
            intent.putExtra("DD_PROVIDER_ITEM", C42035e.m122121c(this.f81964s));
            intent.putExtra("IS_TOPUP", this.f81955j);
            intent.putExtra("DD_NAME", this.f81969x);
            intent.putExtra("DD_ID", this.f81968w);
            return intent;
        }

        /* renamed from: b */
        public String mo79802b() {
            return this.f81948c;
        }

        /* renamed from: c */
        public C33625a mo79803c(boolean z) {
            this.f81956k = z;
            return this;
        }

        /* renamed from: d */
        public C33625a mo79804d(String str) {
            this.f81950e = str;
            return this;
        }

        /* renamed from: e */
        public C33625a mo79805e(String str) {
            this.f81965t = str;
            return this;
        }

        /* renamed from: f */
        public C33625a mo79806f(Class cls) {
            this.f81947b = cls;
            return this;
        }

        /* renamed from: g */
        public C33625a mo79807g(boolean z) {
            this.f81949d = z;
            return this;
        }

        /* renamed from: h */
        public C33625a mo79808h(String str) {
            this.f81970y = str;
            return this;
        }

        /* renamed from: i */
        public C33625a mo79809i(long j) {
            this.f81968w = j;
            return this;
        }

        /* renamed from: j */
        public C33625a mo79810j(String str) {
            this.f81969x = str;
            return this;
        }

        /* renamed from: k */
        public C33625a mo79811k(DDSTO ddsto) {
            DDSTODetailsWrapper dDSTODetailsWrapper;
            DDPaymentDetails dDPaymentDetails;
            if (!(ddsto == null || (dDSTODetailsWrapper = ddsto.details) == null || (dDPaymentDetails = dDSTODetailsWrapper.paymentDetails) == null)) {
                this.f81948c = dDPaymentDetails.providerServiceId;
            }
            this.f81954i = ddsto;
            return this;
        }

        /* renamed from: l */
        public C33625a mo79812l(String str) {
            this.f81952g = str;
            this.f81956k = true;
            return this;
        }

        /* renamed from: m */
        public C33625a mo79813m(ArrayList arrayList) {
            this.f81962q = arrayList;
            this.f81956k = true;
            return this;
        }

        /* renamed from: n */
        public C33625a mo79814n(boolean z) {
            this.f81958m = z;
            return this;
        }

        /* renamed from: o */
        public C33625a mo79815o(boolean z) {
            this.f81960o = z;
            return this;
        }

        /* renamed from: p */
        public C33625a mo79816p(int i) {
            this.f81963r = i;
            return this;
        }

        /* renamed from: q */
        public C33625a mo79817q(String str) {
            this.f81966u = str;
            return this;
        }

        /* renamed from: r */
        public C33625a mo79818r(int i) {
            this.f81953h = i;
            return this;
        }

        /* renamed from: s */
        public C33625a mo79819s(String str) {
            this.f81948c = str;
            return this;
        }

        /* renamed from: t */
        public C33625a mo79820t(long j) {
            this.f81957l = j;
            return this;
        }

        /* renamed from: u */
        public C33625a mo79821u(long j) {
            this.f81959n = j;
            return this;
        }

        /* renamed from: v */
        public C33625a mo79822v(String str) {
            this.f81967v = str;
            return this;
        }

        /* renamed from: w */
        public C33625a mo79823w(boolean z) {
            this.f81955j = z;
            return this;
        }

        /* renamed from: x */
        public C33625a mo79824x(String str) {
            this.f81951f = str;
            return this;
        }

        /* renamed from: y */
        public void mo79825y() {
            if (this.f81953h >= 0) {
                this.f81946a.startActivityForResult(mo79801a(), this.f81953h);
            } else {
                this.f81946a.startActivity(mo79801a());
            }
        }
    }

    /* renamed from: a */
    public static C33625a m98713a(Activity activity) {
        return new C33625a(activity);
    }

    /* renamed from: b */
    public static C33625a m98714b(Fragment fragment) {
        return new C33625a(fragment.getActivity());
    }
}
