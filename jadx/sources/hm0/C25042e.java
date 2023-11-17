package hm0;

import android.content.Context;
import com.salesforce.marketingcloud.C11398b;
import g91.C32319m;
import g91.C32343x;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nc1.C41772a;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.SCARegisterPolicyParams;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.usrinfo.UserInfo;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import y71.C40034h;
import z11.C40140b;

/* renamed from: hm0.e */
public final class C25042e {

    /* renamed from: c */
    public static final C25043a f64388c = new C25043a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Client f64389a;

    /* renamed from: b */
    private final Context f64390b;

    /* renamed from: hm0.e$a */
    public static final class C25043a {
        private C25043a() {
        }

        public /* synthetic */ C25043a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C25042e(Client client, Context context) {
        C41536l.m120489i(client, "client");
        C41536l.m120489i(context, "context");
        this.f64389a = client;
        this.f64390b = context;
    }

    /* renamed from: b */
    private final String m79983b(Long l) {
        String str;
        if (l != null) {
            str = C32319m.m95297d(l.longValue(), "dd.MM.yyyy");
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public final C25044f mo63472a(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
        String m;
        String p;
        String str;
        Long i;
        String str2;
        String str3;
        C41536l.m120489i(travelInsuranceFilledInfo, "filledInfo");
        UserInfo client = this.f64389a.getUserInfo().getClient();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        if (travelInsuranceFilledInfo.mo62732r() == InsurancePersonType.ME) {
            String str4 = client.firstNameInt;
            C41536l.m120488h(str4, "clientInfo.firstNameInt");
            m = client.lastNameInt;
            C41536l.m120488h(m, "clientInfo.lastNameInt");
            p = client.pin;
            C41536l.m120488h(p, "clientInfo.pin");
            i = client.birthDate;
            str = str4;
        } else {
            String k = travelInsuranceFilledInfo.mo62727k();
            if (k == null) {
                k = "";
            }
            m = travelInsuranceFilledInfo.mo62729m();
            if (m == null) {
                m = "";
            }
            p = travelInsuranceFilledInfo.mo62730p();
            if (p == null) {
                p = "";
            }
            str = k;
            i = travelInsuranceFilledInfo.mo62725i();
        }
        String str5 = m;
        String str6 = p;
        if (C41536l.m120484d(travelInsuranceFilledInfo.mo62717d(), "Y")) {
            str2 = this.f64390b.getString(C40034h.summary_risk_insurance_on);
        } else {
            str2 = this.f64390b.getString(C40034h.summary_risk_insurance_off);
        }
        String str7 = str2;
        C41536l.m120488h(str7, "if (filledInfo.coverage …mmary_risk_insurance_off)");
        String F = C32343x.m95388F(travelInsuranceFilledInfo.mo62741y(), new Object[0]);
        String q = travelInsuranceFilledInfo.mo62731q();
        C41772a aVar = C41772a.f98076a;
        String str8 = q + " " + aVar.mo96595c(travelInsuranceFilledInfo.mo62719e());
        String format = simpleDateFormat.format(travelInsuranceFilledInfo.mo62715A());
        C41536l.m120488h(format, "dateFormatter.format(filledInfo.startDate)");
        String format2 = simpleDateFormat.format(travelInsuranceFilledInfo.mo62722g());
        C41536l.m120488h(format2, "dateFormatter.format(filledInfo.endDate)");
        String u = travelInsuranceFilledInfo.mo62736u();
        String v = travelInsuranceFilledInfo.mo62737v();
        if (v != null) {
            str3 = aVar.mo96595c(v);
        } else {
            str3 = null;
        }
        return new C25044f(F, str8, format, format2, u + " " + str3, str7, str, str5, str6, m79983b(i), (C40140b) null, C11398b.f33141t, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final SCARegisterPolicyParams mo63473c(TravelInsuranceFilledInfo travelInsuranceFilledInfo, long j, Long l, String str, String str2) {
        String str3 = str;
        C41536l.m120489i(travelInsuranceFilledInfo, "filledInfo");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        return new SCARegisterPolicyParams(str3, l, travelInsuranceFilledInfo.mo62721f(), travelInsuranceFilledInfo.mo62734t(), travelInsuranceFilledInfo.mo62715A(), travelInsuranceFilledInfo.mo62722g(), travelInsuranceFilledInfo.mo62731q(), travelInsuranceFilledInfo.mo62719e(), travelInsuranceFilledInfo.mo62717d(), travelInsuranceFilledInfo.mo62738w(), travelInsuranceFilledInfo.mo62740x(), travelInsuranceFilledInfo.mo62736u(), travelInsuranceFilledInfo.mo62737v(), travelInsuranceFilledInfo.mo62723h(), travelInsuranceFilledInfo.mo62742z(), travelInsuranceFilledInfo.mo62732r().mo62750f(), travelInsuranceFilledInfo.mo62726j(), travelInsuranceFilledInfo.mo62728l(), travelInsuranceFilledInfo.mo62727k(), travelInsuranceFilledInfo.mo62729m(), travelInsuranceFilledInfo.mo62730p(), travelInsuranceFilledInfo.mo62725i(), Long.valueOf(j), str2, (String) null, (String) null, (String) null, 117440512, (DefaultConstructorMarker) null);
    }
}
